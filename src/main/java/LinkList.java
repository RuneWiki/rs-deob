import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class LinkList {

    @OriginalMember(owner = "ob", name = "a", descriptor = "I")
    private int field733 = 18783;

    @OriginalMember(owner = "ob", name = "b", descriptor = "I")
    private int field734 = -947;

    @OriginalMember(owner = "ob", name = "c", descriptor = "Lu;")
    public Linkable field735 = new Linkable();

    @OriginalMember(owner = "ob", name = "d", descriptor = "Lu;")
    private Linkable field736;

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(I)V")
    public LinkList(int arg0) {
        if (this.field733 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field735.field360 = this.field735;
        this.field735.field361 = this.field735;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;)V")
    public void method245(Linkable arg0) {
        if (arg0.field361 != null) {
            arg0.method106();
        }
        arg0.field361 = this.field735.field361;
        arg0.field360 = this.field735;
        arg0.field361.field360 = arg0;
        arg0.field360.field361 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(BLu;)V")
    public void method246(byte arg0, Linkable arg1) {
        if (arg0 != 1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (arg1.field361 != null) {
            arg1.method106();
        }
        arg1.field361 = this.field735;
        arg1.field360 = this.field735.field360;
        arg1.field361.field360 = arg1;
        arg1.field360.field361 = arg1;
        if (Linkable.field362) {
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lu;")
    public Linkable method247() {
        Linkable var1 = this.field735.field360;
        if (this.field735 == var1) {
            return null;
        } else {
            var1.method106();
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "()Lu;")
    public Linkable method248() {
        Linkable var1 = this.field735.field360;
        if (this.field735 == var1) {
            this.field736 = null;
            return null;
        } else {
            this.field736 = var1.field360;
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(B)Lu;")
    public Linkable method249(byte arg0) {
        Linkable var2 = this.field735.field361;
        if (this.field735 == var2) {
            this.field736 = null;
            return null;
        }
        this.field736 = var2.field361;
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        return var2;
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "(B)Lu;")
    public Linkable method250(byte arg0) {
        Linkable var2 = this.field736;
        if (this.field735 == var2) {
            this.field736 = null;
            return null;
        }
        this.field736 = var2.field360;
        if (arg0 != 71) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(I)Lu;")
    public Linkable method251(int arg0) {
        Linkable var2 = this.field736;
        if (arg0 != 6) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field735 == var2) {
            this.field736 = null;
            return null;
        } else {
            this.field736 = var2.field361;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "()V")
    public void method252() {
        if (this.field735.field360 == this.field735) {
            return;
        }
        while (true) {
            Linkable var1 = this.field735.field360;
            if (this.field735 == var1) {
                return;
            }
            var1.method106();
        }
    }
}
