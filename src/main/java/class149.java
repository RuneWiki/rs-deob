import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class149 {

    @OriginalMember(owner = "client!js", name = "e", descriptor = "[I")
    public static int[] field2164 = new int[2];

    @OriginalMember(owner = "client!js", name = "k", descriptor = "[Lrg;")
    public static class366[] field2170 = new class366[2048];

    @OriginalMember(owner = "client!js", name = "a", descriptor = "Lhc;")
    public static class368 field2160 = new class368("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!js", name = "l", descriptor = "I")
    public static int field2171 = 0;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "[S")
    public static short[] field2172;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BLjava/lang/String;)J", line = 6)
    public static final long method1108(byte arg0, String arg1) {
        if (arg0 != -84) {
            method1110(96);
        }
        field2161++;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V", line = 39)
    public static final void method1109(int arg0) {
        for (class429 var1 = (class429) class451.field6491.method1173(arg0); var1 != null; var1 = (class429) class451.field6491.method1165(true)) {
            if (class123.method943((byte) 62, var1.field5977)) {
                class418.method2580(var1, 8986);
            }
        }
        field2163++;
        if (field2171 == 1) {
            class317.field4324 = false;
            class349.method2110(class75.field1073, class124.field1873, class4.field32, -11514, class49.field631);
            return;
        }
        class349.method2110(class75.field1073, class124.field1873, class4.field32, -11514, class49.field631);
        int var2 = class280.field3810.method2419(class436.field6154.method2313((byte) -71, class445.field6241), (byte) -114);
        for (class429 var3 = (class429) class451.field6491.method1173(0); var3 != null; var3 = (class429) class451.field6491.method1165(true)) {
            int var4 = class277.method1750(var3, (byte) -121);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class124.field1873 = (class53.field678 ? 26 : 22) + field2171 * 16;
        class4.field32 = var2 + 8;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V", line = 87)
    public static void method1110(int arg0) {
        field2170 = null;
        if (arg0 != 2048) {
            field2172 = null;
        }
        field2164 = null;
        field2160 = null;
        field2172 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIII)V", line = 110)
    public static final void method1111(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -1147) {
            method1110(-25);
        }
        field2167++;
        if (arg2 < arg4) {
            for (int var5 = arg2; var5 < arg4; var5++) {
                class83.field1157[var5][arg3] = arg0;
            }
        } else {
            for (int var6 = arg4; var6 < arg2; var6++) {
                class83.field1157[var6][arg3] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIII[I)V", line = 147)
    public static final void method1112(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        arg3--;
        field2166++;
        int var6 = arg1 - 1;
        int var5 = var6 - 7;
        if (arg2 != 8) {
            method1112(-111, -112, 62, 113, (int[]) null);
        }
        while (arg3 < var5) {
            int var7 = arg3 + 1;
            arg4[var7] = arg0;
            int var8 = var7 + 1;
            arg4[var8] = arg0;
            int var9 = var8 + 1;
            arg4[var9] = arg0;
            int var10 = var9 + 1;
            arg4[var10] = arg0;
            int var11 = var10 + 1;
            arg4[var11] = arg0;
            int var12 = var11 + 1;
            arg4[var12] = arg0;
            int var13 = var12 + 1;
            arg4[var13] = arg0;
            arg3 = var13 + 1;
            arg4[arg3] = arg0;
        }
        while (arg3 < var6) {
            arg3++;
            arg4[arg3] = arg0;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIIBII)V", line = 182)
    public static final void method1113(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field2162++;
        int var8 = class294.method1789(arg7, (byte) -5, class42.field543, class143.field2090);
        int var9 = class294.method1789(arg0, (byte) -5, class42.field543, class143.field2090);
        int var10 = class294.method1789(arg6, (byte) -5, class430.field6003, class80.field1119);
        int var11 = class294.method1789(arg2, (byte) -5, class430.field6003, class80.field1119);
        int var12 = class294.method1789(arg7 + arg3, (byte) -5, class42.field543, class143.field2090);
        int var13 = class294.method1789(arg0 - arg3, (byte) -5, class42.field543, class143.field2090);
        for (int var14 = var8; var14 < var12; var14++) {
            method1112(arg4, var11, 8, var10, class83.field1157[var14]);
        }
        if (arg5 != 52) {
            method1111(35, -4, 112, 77, -61);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            method1112(arg4, var11, 8, var10, class83.field1157[var15]);
        }
        int var16 = class294.method1789(arg3 + arg6, (byte) -5, class430.field6003, class80.field1119);
        int var17 = class294.method1789(arg2 - arg3, (byte) -5, class430.field6003, class80.field1119);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class83.field1157[var18];
            method1112(arg4, var16, 8, var10, var19);
            method1112(arg1, var17, arg5 ^ 0x3C, var16, var19);
            method1112(arg4, var11, arg5 ^ 0x3C, var17, var19);
        }
    }
}
