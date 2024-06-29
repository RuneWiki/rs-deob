import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class220 extends class213 {

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field4153 = 0;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "[I")
    public static int[] field4158 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "[I")
    public static int[] field4169 = new int[1000];

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "Lob;")
    public static class141 field4175 = class175.method1195(40, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Lob;")
    private static class141 field4157 = class175.method1195(40, "purple:");

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "Lob;")
    private static class141 field4176 = class175.method1195(40, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Lob;")
    public static class141 field4152 = field4176;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "Lob;")
    public static class141 field4174 = field4157;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "Lob;")
    public static class141 field4159 = field4157;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public int field4155;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public int field4156;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public int field4161;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public int field4162;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public int field4164;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "Lob;")
    public class141 field4154;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "Lra;")
    public class170 field4166;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "Lra;")
    public class170 field4168;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "[Ljava/lang/Object;")
    public Object[] field4177;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([BIII)Z")
    public static final boolean method1420(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 63) {
            field4152 = null;
        }
        class146 var4 = new class146(arg0);
        field4170++;
        int var5 = -1;
        boolean var6 = true;
        label58: while (true) {
            int var7 = var4.method1005(-108);
            if (var7 == 0) {
                return var6;
            }
            var5 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                while (!var8) {
                    int var11 = var4.method1010(arg3 ^ 0xFFFFFFC1);
                    if (var11 == 0) {
                        continue label58;
                    }
                    var9 += var11 - 1;
                    int var12 = var9 >> 6 & 0x3F;
                    int var13 = var9 & 0x3F;
                    int var14 = var4.method991(255) >> 2;
                    int var15 = arg2 + var12;
                    int var16 = arg1 + var13;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class54 var17 = class175.method1198(arg3 ^ 0xFFFFC8D1, var5);
                        if (var14 != 22 || !class8.field128 || var17.field1051 != 0 || var17.field1061 == 1 || var17.field1075) {
                            var8 = true;
                            if (!var17.method360((byte) 126)) {
                                class78.field1582++;
                                var6 = false;
                            }
                        }
                    }
                }
                int var10 = var4.method1010(-2);
                if (var10 == 0) {
                    break;
                }
                var4.method991(255);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
    public static void method1421(int arg0) {
        field4152 = null;
        field4174 = null;
        field4175 = null;
        field4176 = null;
        field4158 = null;
        field4157 = null;
        field4169 = null;
        field4159 = null;
        if (arg0 != 4585) {
            method1421(-32);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([Lob;I)Lob;")
    public static final class141 method1422(class141[] arg0, int arg1) {
        field4165++;
        if (arg1 < ~arg0.length) {
            throw new IllegalArgumentException();
        }
        return class20.method123(arg1 ^ 0x4D, 0, arg0.length, arg0);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lpe;Lpe;III)Li;")
    public static final class80 method1423(class154 arg0, class154 arg1, int arg2, int arg3, int arg4) {
        field4163++;
        if (arg3 >= -90) {
            method1420(null, -13, -46, 96);
        }
        return class53.method353(-95, arg2, arg0, arg4) ? class107.method711(arg1.method1065((byte) 39, arg4, arg2), (byte) 45) : null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIB)I")
    public static final int method1424(int arg0, int arg1, byte arg2) {
        field4160++;
        int var3 = arg0 >> 31 & arg1 - 1;
        if (arg2 > -76) {
            field4159 = null;
        }
        return ((arg0 >>> 31) + arg0) % arg1 + var3;
    }
}
