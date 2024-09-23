import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class LinkList {

    @OriginalMember(owner = "ob", name = "a", descriptor = "Z")
    private boolean field732 = false;

    @OriginalMember(owner = "ob", name = "b", descriptor = "Z")
    private boolean field733 = true;

    @OriginalMember(owner = "ob", name = "c", descriptor = "I")
    private int field734 = 8;

    @OriginalMember(owner = "ob", name = "d", descriptor = "Lu;")
    public Linkable field735 = new Linkable();

    @OriginalMember(owner = "ob", name = "e", descriptor = "Lu;")
    private Linkable field736;

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(B)V")
    public LinkList(byte arg0) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        boolean var2 = false;
        this.field735.field358 = this.field735;
        this.field735.field359 = this.field735;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;)V")
    public void method240(Linkable arg0) {
        if (arg0.field359 != null) {
            arg0.method106();
        }
        arg0.field359 = this.field735.field359;
        arg0.field358 = this.field735;
        arg0.field359.field358 = arg0;
        arg0.field358.field359 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;I)V")
    public void method241(Linkable arg0, int arg1) {
        if (arg0.field359 != null) {
            arg0.method106();
        }
        arg0.field359 = this.field735;
        if (arg1 != 1) {
            this.field733 = !this.field733;
        }
        arg0.field358 = this.field735.field358;
        arg0.field359.field358 = arg0;
        arg0.field358.field359 = arg0;
        if (Linkable.field360) {
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lu;")
    public Linkable method242() {
        Linkable var1 = this.field735.field358;
        if (this.field735 == var1) {
            return null;
        } else {
            var1.method106();
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "()Lu;")
    public Linkable method243() {
        Linkable var1 = this.field735.field358;
        if (this.field735 == var1) {
            this.field736 = null;
            return null;
        } else {
            this.field736 = var1.field358;
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Z)Lu;")
    public Linkable method244(boolean arg0) {
        Linkable var2 = this.field735.field359;
        if (this.field735 == var2) {
            this.field736 = null;
            return null;
        }
        this.field736 = var2.field359;
        if (!arg0) {
            this.field732 = !this.field732;
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(I)Lu;")
    public Linkable method245(int arg0) {
        Linkable var2 = this.field736;
        if (this.field735 == var2) {
            this.field736 = null;
            return null;
        }
        this.field736 = var2.field358;
        if (arg0 != 30869) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(B)Lu;")
    public Linkable method246(byte arg0) {
        Linkable var2 = this.field736;
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        if (this.field735 == var2) {
            this.field736 = null;
            return null;
        } else {
            this.field736 = var2.field359;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "()V")
    public void method247() {
        if (this.field735.field358 == this.field735) {
            return;
        }
        while (true) {
            Linkable var1 = this.field735.field358;
            if (this.field735 == var1) {
                return;
            }
            var1.method106();
        }
    }
}
