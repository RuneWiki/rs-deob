import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HGKRJZKS")
public class class24 {

    @OriginalMember(owner = "HGKRJZKS", name = "a", descriptor = "Z")
    private boolean field859 = false;

    @OriginalMember(owner = "HGKRJZKS", name = "b", descriptor = "I")
    private int field860 = -47299;

    @OriginalMember(owner = "HGKRJZKS", name = "e", descriptor = "LKTAHMSMP;")
    private class31 field863 = new class31();

    @OriginalMember(owner = "HGKRJZKS", name = "i", descriptor = "LLAPJVQGB;")
    private class33 field867 = new class33(-20780);

    @OriginalMember(owner = "HGKRJZKS", name = "f", descriptor = "I")
    private int field864;

    @OriginalMember(owner = "HGKRJZKS", name = "g", descriptor = "I")
    private int field865;

    @OriginalMember(owner = "HGKRJZKS", name = "h", descriptor = "LFXRMRSFD;")
    private class16 field866;

    @OriginalMember(owner = "HGKRJZKS", name = "c", descriptor = "I")
    private int field861;

    @OriginalMember(owner = "HGKRJZKS", name = "d", descriptor = "I")
    private int field862;

    @OriginalMember(owner = "HGKRJZKS", name = "<init>", descriptor = "(II)V")
    public class24(int arg0, int arg1) {
        this.field864 = arg1;
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field865 = arg1;
        this.field866 = new class16(1024, (byte) 1);
    }

    @OriginalMember(owner = "HGKRJZKS", name = "a", descriptor = "(J)LKTAHMSMP;")
    public class31 method285(long arg0) {
        class31 var3 = (class31) this.field866.method219(arg0);
        if (var3 == null) {
            this.field861++;
        } else {
            this.field867.method346(var3);
            this.field862++;
        }
        return var3;
    }

    @OriginalMember(owner = "HGKRJZKS", name = "a", descriptor = "(IJLKTAHMSMP;)V")
    public void method286(int arg0, long arg1, class31 arg2) {
        if (this.field865 == 0) {
            class31 var5 = this.field867.method347();
            var5.method555();
            var5.method342();
            if (this.field863 == var5) {
                class31 var6 = this.field867.method347();
                var6.method555();
                var6.method342();
            }
        } else {
            this.field865--;
        }
        this.field866.method220(arg1, arg2, -317);
        this.field867.method346(arg2);
        if (arg0 == -43932) {
            ;
        }
    }

    @OriginalMember(owner = "HGKRJZKS", name = "a", descriptor = "()V")
    public void method287() {
        while (true) {
            class31 var1 = this.field867.method347();
            if (var1 == null) {
                this.field865 = this.field864;
                return;
            }
            var1.method555();
            var1.method342();
        }
    }
}
