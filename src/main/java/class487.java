import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class487 {

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "Luh;")
    private class114 field7215 = new class114();

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "Let;")
    private class428 field7220 = new class428();

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    private int field7218;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    private int field7219;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "Llp;")
    private class272 field7217;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "[B")
    public static byte[] field7212 = new byte[2048];

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field7216;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "([[BILqq;)V")
    public static final void method2913(byte[][] arg0, int arg1, class337 arg2) {
        field7213++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class164 var11 = new class164(var10);
                int var12 = class510.field7490[var5] >> 8;
                int var13 = class510.field7490[var5] & 0xFF;
                int var14 = var12 * 64 - class331.field5162;
                int var15 = var13 * 64 - class328.field5099;
                class523.method3104((byte) -1);
                arg2.method1673(class9.field174, var14, var15, class328.field5099, 64, var11, class331.field5162);
                arg2.method2179(var15, var3, var14, var11, class400.field6090, (byte) -43);
                if (!arg2.field3647 && class492.field7259 / 8 == var12 && (class276.field3936 / 8) == var13 && var3[0] != -1) {
                    class121.field1655 = class332.field5172.method2209(class182.field2469, var3[3], var3[2], var3[1], 64, var3[0]);
                    class361.field5534 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class510.field7490[var6] >> 8) * 64 - class331.field5162;
            int var8 = (class510.field7490[var6] & 0xFF) * 64 - class328.field5099;
            byte[] var9 = arg0[var6];
            if (var9 == null && class276.field3936 < 800) {
                class523.method3104((byte) -1);
                arg2.method1679(var7, 64, arg1 ^ 0x806, 64, var8);
            }
        }
        if (arg1 != 2048) {
            method2919(true, null);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V")
    public static void method2914(byte arg0) {
        int var1 = -72 % ((-arg0 - 55) / 50);
        field7212 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BZ)V")
    public static final void method2915(byte arg0, boolean arg1) {
        field7209++;
        if (class4.field31.length() == 0) {
            return;
        }
        class230.method1548("--> " + class4.field31, arg0 + 34);
        if (arg0 != 81) {
            field7212 = null;
        }
        class360.method2299(false, class4.field31, arg1, (byte) 117);
        class44.field639 = 0;
        class139.field1848 = 0;
        class4.field31 = "";
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Luh;JI)V")
    public final void method2916(class114 arg0, long arg1, int arg2) {
        if (arg2 != -26941) {
            return;
        }
        if (this.field7218 == 0) {
            class114 var5 = this.field7220.method2612(arg2 ^ 0x7148);
            var5.method25(-13489);
            var5.method705(6511);
            if (this.field7215 == var5) {
                class114 var6 = this.field7220.method2612(-6261);
                var6.method25(-13489);
                var6.method705(6511);
            }
        } else {
            this.field7218--;
        }
        field7208++;
        this.field7217.method1751(arg1, arg2 ^ 0x6948, arg0);
        this.field7220.method2613(arg2 + 26944, arg0);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IJ)Luh;")
    public final class114 method2917(int arg0, long arg1) {
        field7207++;
        int var4 = 98 % ((56 - arg0) / 49);
        class114 var5 = (class114) this.field7217.method1747(arg1, false);
        if (var5 != null) {
            this.field7220.method2613(3, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public final void method2918(int arg0) {
        field7216++;
        this.field7220.method2614(false);
        this.field7217.method1745(-103);
        this.field7215 = new class114();
        if (arg0 != 8) {
            field7211 = 72;
        }
        this.field7218 = this.field7219;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLnj;)Lmm;")
    public static final class186 method2919(boolean arg0, class164 arg1) {
        field7214++;
        class186 var2 = new class186();
        var2.field2504 = arg1.method1074(-635989152);
        var2.field2507 = class321.field4650.method993(-65, var2.field2504);
        return arg0 ? var2 : null;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(I)V")
    public class487(int arg0) {
        this.field7218 = arg0;
        this.field7219 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field7217 = new class272(var2);
    }
}
