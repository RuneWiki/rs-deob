import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class LinkList {

    @OriginalMember(owner = "ob", name = "a", descriptor = "I")
    private int field645 = 962;

    @OriginalMember(owner = "ob", name = "b", descriptor = "Z")
    private boolean field646 = true;

    @OriginalMember(owner = "ob", name = "c", descriptor = "I")
    private int field647 = 947;

    @OriginalMember(owner = "ob", name = "d", descriptor = "Lu;")
    public Linkable field648 = new Linkable();

    @OriginalMember(owner = "ob", name = "e", descriptor = "Lu;")
    public Linkable field649;

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(I)V")
    public LinkList(int arg0) {
        this.field648.field287 = this.field648;
        this.field648.field288 = this.field648;
        if (arg0 < 5 || arg0 > 5) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;)V")
    public void method217(Linkable arg0) {
        if (arg0.field288 != null) {
            arg0.method104();
        }
        arg0.field288 = this.field648.field288;
        arg0.field287 = this.field648;
        arg0.field288.field287 = arg0;
        arg0.field287.field288 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;I)V")
    public void method218(Linkable arg0, int arg1) {
        if (arg0.field288 != null) {
            arg0.method104();
        }
        arg0.field288 = this.field648;
        arg0.field287 = this.field648.field287;
        if (arg1 == 0) {
            arg0.field288.field287 = arg0;
            arg0.field287.field288 = arg0;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lu;")
    public Linkable method219() {
        Linkable var1 = this.field648.field287;
        if (this.field648 == var1) {
            return null;
        } else {
            var1.method104();
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "()Lu;")
    public Linkable method220() {
        Linkable var1 = this.field648.field287;
        if (this.field648 == var1) {
            this.field649 = null;
            return null;
        } else {
            this.field649 = var1.field287;
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(I)Lu;")
    public Linkable method221(int arg0) {
        Linkable var2 = this.field648.field288;
        if (this.field648 == var2) {
            this.field649 = null;
            return null;
        }
        this.field649 = var2.field288;
        if (arg0 < 8 || arg0 > 8) {
            this.field647 = -94;
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "(I)Lu;")
    public Linkable method222(int arg0) {
        Linkable var2 = this.field649;
        if (arg0 != 35239) {
            this.field647 = -229;
        }
        if (this.field648 == var2) {
            this.field649 = null;
            return null;
        } else {
            this.field649 = var2.field287;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Z)Lu;")
    public Linkable method223(boolean arg0) {
        Linkable var2 = this.field649;
        if (this.field648 == var2) {
            this.field649 = null;
            return null;
        }
        this.field649 = var2.field288;
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "()V")
    public void method224() {
        while (true) {
            Linkable var1 = this.field648.field287;
            if (this.field648 == var1) {
                return;
            }
            var1.method104();
        }
    }
}
