import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class396 extends class359 {

    @OriginalMember(owner = "client!qp", name = "p", descriptor = "Lfi;")
    public static class331 field5782 = new class331(50);

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "Lcs;")
    public static class189 field5783 = new class189(8);

    @OriginalMember(owner = "client!qp", name = "i", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!qp", name = "j", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!qp", name = "l", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!qp", name = "n", descriptor = "J")
    public long field5780;

    @OriginalMember(owner = "client!qp", name = "k", descriptor = "Lqp;")
    public class396 field5777;

    @OriginalMember(owner = "client!qp", name = "m", descriptor = "Lqp;")
    public class396 field5779;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V", line = 4)
    public final void method2519(int arg0) {
        field5775++;
        if (this.field5779 == null) {
            return;
        }
        this.field5779.field5777 = this.field5777;
        if (arg0 != -2107) {
            this.field5779 = null;
        }
        this.field5777.field5779 = this.field5779;
        this.field5777 = null;
        this.field5779 = null;
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(B)Z", line = 22)
    public final boolean method2520(byte arg0) {
        field5776++;
        if (this.field5779 == null) {
            return false;
        } else {
            if (arg0 != -10) {
                this.method2519(-118);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)V", line = 40)
    public static final void method2521(int arg0) {
        class305.field4362 = 0;
        class189.field2578 = 0;
        field5781++;
        class393.method2507((byte) -83);
        class67.method397(-16560);
        class26.method156(arg0);
        class1.method7(true);
        for (int var1 = 0; var1 < class305.field4362; var1++) {
            int var3 = class99.field1113[var1];
            if (class221.field3033 != class375.field5473[var3].field6320) {
                if (class375.field5473[var3].field1836 > 0) {
                    class275.method1739(class375.field5473[var3], 126);
                }
                class375.field5473[var3] = null;
            }
        }
        if (class290.field4131 != class249.field3379.field2888) {
            throw new RuntimeException("gpp1 pos:" + class249.field3379.field2888 + " psize:" + class290.field4131);
        }
        for (int var2 = 0; var2 < class148.field2082; var2++) {
            if (class375.field5473[class294.field4217[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class148.field2082);
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V", line = 89)
    public static void method2522(boolean arg0) {
        if (!arg0) {
            field5783 = null;
        }
        field5783 = null;
        field5782 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "([III)V", line = 113)
    public static final void method2523(int[] arg0, int arg1, int arg2) {
        for (int var3 = 31; var3 > 0; var3--) {
            int var4 = var3 * 36;
            for (int var5 = 35; var5 > 0; var5--) {
                if (arg0[var4 + var5] == 0 && arg0[var5 + var4 - 37] != 0) {
                    arg0[var4 + var5] = arg2;
                }
            }
        }
        if (arg1 != 50) {
            field5783 = null;
        }
        field5778++;
    }
}
