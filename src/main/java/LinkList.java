import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ob")
public class LinkList {

    @OriginalMember(owner = "ob", name = "a", descriptor = "Z")
    private boolean field743 = true;

    @OriginalMember(owner = "ob", name = "b", descriptor = "Z")
    private boolean field744 = true;

    @OriginalMember(owner = "ob", name = "c", descriptor = "Lu;")
    public Linkable field745 = new Linkable();

    @OriginalMember(owner = "ob", name = "d", descriptor = "Lu;")
    private Linkable field746;

    @OriginalMember(owner = "ob", name = "<init>", descriptor = "(I)V")
    public LinkList(int arg0) {
        this.field745.field360 = this.field745;
        if (arg0 != -16188) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field745.field361 = this.field745;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(Lu;)V")
    public void method245(Linkable arg0) {
        if (arg0.field361 != null) {
            arg0.method106();
        }
        arg0.field361 = this.field745.field361;
        arg0.field360 = this.field745;
        arg0.field361.field360 = arg0;
        arg0.field360.field361 = arg0;
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(ILu;)V")
    public void method246(int arg0, Linkable arg1) {
        if (arg1.field361 != null) {
            arg1.method106();
        }
        arg1.field361 = this.field745;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        arg1.field360 = this.field745.field360;
        arg1.field361.field360 = arg1;
        arg1.field360.field361 = arg1;
        if (Linkable.field362) {
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "()Lu;")
    public Linkable method247() {
        Linkable var1 = this.field745.field360;
        if (this.field745 == var1) {
            return null;
        } else {
            var1.method106();
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "()Lu;")
    public Linkable method248() {
        Linkable var1 = this.field745.field360;
        if (this.field745 == var1) {
            this.field746 = null;
            return null;
        } else {
            this.field746 = var1.field360;
            return var1;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(I)Lu;")
    public Linkable method249(int arg0) {
        if (arg0 >= 0) {
            this.field744 = !this.field744;
        }
        Linkable var2 = this.field745.field361;
        if (this.field745 == var2) {
            this.field746 = null;
            return null;
        } else {
            this.field746 = var2.field361;
            return var2;
        }
    }

    @OriginalMember(owner = "ob", name = "b", descriptor = "(I)Lu;")
    public Linkable method250(int arg0) {
        if (arg0 != 8) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Linkable var3 = this.field746;
        if (this.field745 == var3) {
            this.field746 = null;
            return null;
        } else {
            this.field746 = var3.field360;
            return var3;
        }
    }

    @OriginalMember(owner = "ob", name = "a", descriptor = "(B)Lu;")
    public Linkable method251(byte arg0) {
        Linkable var2 = this.field746;
        if (this.field745 == var2) {
            this.field746 = null;
            return null;
        }
        this.field746 = var2.field361;
        if (arg0 != 42) {
            this.field743 = !this.field743;
        }
        return var2;
    }

    @OriginalMember(owner = "ob", name = "c", descriptor = "()V")
    public void method252() {
        if (this.field745.field360 == this.field745) {
            return;
        }
        while (true) {
            Linkable var1 = this.field745.field360;
            if (this.field745 == var1) {
                return;
            }
            var1.method106();
        }
    }
}
