import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public abstract class class74 {

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "Len;")
    public class478 field1011;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field1001 = 50;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "[I")
    public static int[] field1000 = new int[field1001];

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "[I")
    public static int[] field1004 = new int[field1001];

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "[I")
    public static int[] field1008 = new int[field1001];

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "[I")
    public static int[] field1012 = new int[field1001];

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "[I")
    public static int[] field1007 = new int[field1001];

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1002 = new String[field1001];

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "[I")
    public static int[] field1015 = new int[field1001];

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field1003 = class517.method2798(-24420, 1600);

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "[[[I")
    public static int[][][] field1018;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZZ)V")
    public abstract void method339(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)Z")
    public abstract boolean method346(int arg0);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public static void method440(byte arg0) {
        field1007 = null;
        field1002 = null;
        field1004 = null;
        field1015 = null;
        field1000 = null;
        if (arg0 != 61) {
            method440((byte) 16);
        }
        field1018 = null;
        field1012 = null;
        field1008 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ)V")
    public abstract void method347(int arg0, boolean arg1);

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
    public void method344(byte arg0) {
        if (arg0 <= -114) {
            field1009++;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
    public void method342(boolean arg0) {
        if (arg0) {
            field1004 = null;
        }
        field1016++;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    public void method348(int arg0) {
        if (arg0 == 26185) {
            field1017++;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IILhfa;)V")
    public abstract void method341(int arg0, int arg1, class466 arg2);

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Len;)V")
    public class74(class478 arg0) {
        this.field1011 = arg0;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
    public void method345(int arg0) {
        field1005++;
        int var2 = -100 / ((54 - arg0) / 37);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILr;)V")
    public static final void method441(int arg0, class566 arg1) {
        field1006++;
        arg1.method1083(0, 0, class523.field7111, 350);
        arg1.method1090(0, 0, class523.field7111, 350, class20.field311 << 24 | 0x332277, 1);
        int var2 = 66 / ((arg0 + 62) / 62);
        int var3 = 350 / class629.field8771;
        if (class542.field7250 > 0) {
            int var4 = 346 - (class629.field8771 + 4);
            int var5 = var3 * var4 / (class542.field7250 + var3 - 1);
            int var6 = 4;
            if (class542.field7250 > 1) {
                var6 += (class542.field7250 - class684.field9604 - 1) * (var4 - var5) / (class542.field7250 - 1);
            }
            arg1.method1090(class523.field7111 - 16, var6, 12, var5, class20.field311 << 24 | 0x332277, 2);
            for (int var7 = class684.field9604; (class684.field9604 + var3) > var7 && var7 < class542.field7250; var7++) {
                String[] var8 = class475.method2512(-82, class329.field4194[var7], '\b');
                int var9 = (class523.field7111 - 24) / var8.length;
                for (int var10 = 0; var10 < var8.length; var10++) {
                    int var11 = (var9 * var10) + 8;
                    arg1.method1083(var11, 0, var11 + var9 - 8, 350);
                    class133.field1729.method2192(-1, true, var11, class365.method2004(var8[var10], false), -16777216, 350 - class183.field2336 - ((var7 - class684.field9604) * class629.field8771) - class689.field9771.field8371 - 2);
                }
            }
        }
        class462.field5888.method2198(class523.field7111 - 25, 330, "Build: 621", -1, -16777216, -69);
        arg1.method1083(0, 0, class523.field7111, 350);
        arg1.method3114(350 - class183.field2336, (byte) 11, 0, class523.field7111, -1);
        class65.field889.method2192(-1, true, 10, "--> " + class365.method2004(class163.field2141, false), -16777216, 350 - class546.field7269.field8371 - 1);
        if (!class588.field8273) {
            return;
        }
        int var12 = -1;
        if ((class133.field1735 % 30) > 15) {
            var12 = 16777215;
        }
        arg1.method3109(class546.field7269.method3269((byte) 99, "--> " + class365.method2004(class163.field2141, false).substring(0, class172.field2245)) + 10, (byte) 4, var12, 12, 350 - class546.field7269.field8371 - 11);
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)V")
    public void method338(byte arg0) {
        if (arg0 >= -35) {
            this.method348(-83);
        }
        field1014++;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIB)V")
    public abstract void method340(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)V")
    public abstract void method343(int arg0);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method442(int arg0, boolean arg1, String arg2) {
        field1013++;
        class55.method353(arg0, arg1, arg2, -1, 1986811992);
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(I)V")
    public void method443(int arg0) {
        field1010++;
        if (arg0 != -16573) {
            this.method339(false, true);
        }
    }
}
