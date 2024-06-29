import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class222 extends class109 {

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Lia;")
    public static class257 field3752 = class28.method234(-57, "null");

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "[I")
    public static int[] field3754 = new int[1000];

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "J")
    public static long field3756 = 0L;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field3755 = 0;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Lia;")
    public static class257 field3757 = class28.method234(123, "compass");

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "[Lte;")
    public static class184[] field3753;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "[S")
    public static short[] field3751;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIZI)V")
    public static final void method1464(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg2 == -8480) {
            field3759++;
            if (class31.method258(arg0, 0)) {
                class146.method986(arg4, arg2 + 8593, arg3, arg1, -1, class28.field539[arg0]);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public static void method1465(int arg0) {
        field3754 = null;
        field3753 = null;
        field3751 = null;
        field3757 = null;
        field3752 = null;
        if (arg0 >= -115) {
            field3755 = -67;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Lik;")
    public static final class202 method1466(int arg0, int arg1, int arg2) {
        if (arg1 > -22) {
            field3751 = null;
        }
        field3758++;
        class202 var3 = (class202) class64.field1301.method434((byte) -93, (long) arg0 << 32 | (long) arg2);
        if (var3 == null) {
            var3 = new class202(arg0, arg2);
            class64.field1301.method424(var3, (byte) -40, var3.field573);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLfe;)V")
    public static final void method1467(boolean arg0, class155 arg1) {
        field3749++;
        short var2 = 256;
        for (int var3 = 0; var3 < class227.field3816.length; var3++) {
            class227.field3816[var3] = 0;
        }
        if (arg0) {
            field3756 = -4L;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * 128.0D * Math.random());
            class227.field3816[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < (var2 - 1); var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class158.field2782[var15] = (class227.field3816[var15 + 1] + class227.field3816[var15 - 1] + class227.field3816[var15 + 128] + class227.field3816[var15 + -128]) / 4;
                }
            }
            int[] var13 = class227.field3816;
            class227.field3816 = class158.field2782;
            class158.field2782 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field1730; var7++) {
            for (int var8 = 0; var8 < arg1.field1724; var8++) {
                if (arg1.field2711[var6++] != 0) {
                    int var9 = arg1.field1729 + var8 + 16;
                    int var10 = var7 + arg1.field1722 + 16;
                    int var11 = (var10 << 7) + var9;
                    class227.field3816[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lmb;Z)V")
    public static final void method1468(class178 arg0, boolean arg1) {
        field3750++;
        if (class95.field1786) {
            return;
        }
        class23.method199();
        class231.field3881 = class1.method4(class99.field1828, (byte) 86, arg0);
        class231.field3881.method477(-95, 0);
        class203.field3496 = class200.method1346((byte) -80, class186.field3227, arg0);
        class203.field3496.method673(382 - (class203.field3496.field1724 / 2), 18);
        class95.field1786 = true;
        if (arg1) {
            field3755 = 89;
        }
    }
}
