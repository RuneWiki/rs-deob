import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LHGXPZPG")
public class LinkList {

    @OriginalMember(owner = "LHGXPZPG", name = "a", descriptor = "Z")
    private boolean _flowObfuscator1 = false;

    @OriginalMember(owner = "LHGXPZPG", name = "b", descriptor = "I")
    private int _flowObfuscator2 = -77;

    @OriginalMember(owner = "LHGXPZPG", name = "c", descriptor = "LPKVMXVTO;")
    public Linkable sentinel = new Linkable();

    @OriginalMember(owner = "LHGXPZPG", name = "d", descriptor = "LPKVMXVTO;")
    private Linkable cursor;

    @OriginalMember(owner = "LHGXPZPG", name = "<init>", descriptor = "(I)V")
    public LinkList(int arg0) {
        if (arg0 <= 0) {
            this._flowObfuscator1 = !this._flowObfuscator1;
        }
        this.sentinel.next = this.sentinel;
        this.sentinel.prev = this.sentinel;
    }

    @OriginalMember(owner = "LHGXPZPG", name = "a", descriptor = "(LPKVMXVTO;)V")
    public void addTail(Linkable arg0) {
        if (arg0.prev != null) {
            arg0.unlink();
        }
        arg0.prev = this.sentinel.prev;
        arg0.next = this.sentinel;
        arg0.prev.next = arg0;
        arg0.next.prev = arg0;
    }

    @OriginalMember(owner = "LHGXPZPG", name = "a", descriptor = "(ILPKVMXVTO;)V")
    public void addHead(int arg0, Linkable arg1) {
        if (arg1.prev != null) {
            arg1.unlink();
        }
        arg1.prev = this.sentinel;
        arg1.next = this.sentinel.next;
        while (arg0 >= 0) {
            this._flowObfuscator1 = !this._flowObfuscator1;
        }
        arg1.prev.next = arg1;
        arg1.next.prev = arg1;
    }

    @OriginalMember(owner = "LHGXPZPG", name = "a", descriptor = "()LPKVMXVTO;")
    public Linkable removeHead() {
        Linkable var1 = this.sentinel.next;
        if (this.sentinel == var1) {
            return null;
        } else {
            var1.unlink();
            return var1;
        }
    }

    @OriginalMember(owner = "LHGXPZPG", name = "b", descriptor = "()LPKVMXVTO;")
    public Linkable head() {
        Linkable var1 = this.sentinel.next;
        if (this.sentinel == var1) {
            this.cursor = null;
            return null;
        } else {
            this.cursor = var1.next;
            return var1;
        }
    }

    @OriginalMember(owner = "LHGXPZPG", name = "a", descriptor = "(I)LPKVMXVTO;")
    public Linkable tail(int arg0) {
        if (arg0 < 5 || arg0 > 5) {
            throw new NullPointerException();
        }
        Linkable var2 = this.sentinel.prev;
        if (this.sentinel == var2) {
            this.cursor = null;
            return null;
        } else {
            this.cursor = var2.prev;
            return var2;
        }
    }

    @OriginalMember(owner = "LHGXPZPG", name = "a", descriptor = "(Z)LPKVMXVTO;")
    public Linkable next(boolean arg0) {
        Linkable var2 = this.cursor;
        if (arg0) {
            this._flowObfuscator2 = 48;
        }
        if (this.sentinel == var2) {
            this.cursor = null;
            return null;
        } else {
            this.cursor = var2.next;
            return var2;
        }
    }

    @OriginalMember(owner = "LHGXPZPG", name = "b", descriptor = "(I)LPKVMXVTO;")
    public Linkable prev(int arg0) {
        Linkable var2 = this.cursor;
        if (this.sentinel == var2) {
            this.cursor = null;
            return null;
        }
        this.cursor = var2.prev;
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "LHGXPZPG", name = "c", descriptor = "()V")
    public void clear() {
        if (this.sentinel.next == this.sentinel) {
            return;
        }
        while (true) {
            Linkable var1 = this.sentinel.next;
            if (this.sentinel == var1) {
                return;
            }
            var1.unlink();
        }
    }
}
