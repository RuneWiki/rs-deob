import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class663 extends IOException {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Ltt;")
    public static class338 field9441 = new class338(65, 6);

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Ltt;")
    public static class338 field9445 = new class338(8, 7);

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "[F")
    public static float[] field9447 = new float[4];

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "Lwv;")
    public static class423 field9448 = null;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field9442;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field9443;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field9446;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "[I")
    public static int[] field9444;

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 3)
    public class663(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 10)
    public static final void method3782(int arg0) {
        field9442++;
        for (int var1 = 0; var1 < class360.field4779; var1++) {
            int var2 = class284.field3738[var1];
            class351 var3 = ((class407) class296.field3921.method3057(1, (long) var2)).field5354;
            int var4 = class289.field3807.method930(255);
            if ((var4 & 0x2) != 0) {
                var4 += class289.field3807.method930(255) << 8;
            }
            if ((var4 & 0x200) != 0) {
                int var5 = class289.field3807.method963(-118);
                var3.field3076 = class289.field3807.method930(arg0 ^ 0x1FF);
                var3.field3078 = class289.field3807.method909(16);
                var3.field3071 = (var5 & 0x8000) != 0;
                var3.field3046 = var5 & 0x7FFF;
                var3.field2987 = class327.field4404 + var3.field3046 + var3.field3076;
            }
            if ((var4 & 0x10) != 0) {
                if (var3.field4671.method2199(true)) {
                    class454.method2552(arg0 ^ 0x100, var3);
                }
                var3.method2074(class440.field5847.method502(class289.field3807.method931(arg0 - 218), -15704), true);
                var3.method1442(var3.field4671.field5105, 10);
                var3.field3013 = var3.field4671.field5137 << 3;
                if (var3.field4671.method2199(true)) {
                    class519.method2943(var3.field385, null, var3, 0, var3.field3088[0], var3.field3086[0], true, null);
                }
            }
            if ((var4 & 0x1000) != 0) {
                var3.field3055 = class289.field3807.method969(arg0 ^ 0x103);
                var3.field3037 = class289.field3807.method924(123);
                var3.field3007 = class289.field3807.method924(49);
                var3.field2988 = (byte) class289.field3807.method919(103);
                var3.field3016 = class327.field4404 + class289.field3807.method931(42);
                var3.field3075 = class327.field4404 + class289.field3807.method963(arg0 ^ 0xFFFFFE87);
            }
            if ((var4 & 0x20) != 0) {
                int[] var6 = new int[4];
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] = class289.field3807.method954(arg0 - 254);
                    if (var6[var7] == 65535) {
                        var6[var7] = -1;
                    }
                }
                int var8 = class289.field3807.method930(255);
                class131.method768(var3, var8, -1, var6);
            }
            if ((var4 & 0x4) != 0) {
                var3.field3045 = class289.field3807.method963(-121);
                if (var3.field3045 == 65535) {
                    var3.field3045 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field3062 = class289.field3807.method925(arg0 - 154);
                var3.field3077 = 100;
            }
            if ((var4 & 0x100) != 0) {
                int var9 = class289.field3807.method964(arg0 - 149);
                int var10 = class289.field3807.method945((byte) -123);
                var3.method1430(class327.field4404, 70, var10, var9);
            }
            if ((var4 & 0x800) != 0) {
                int var11 = class289.field3807.method961(-4349);
                int var12 = class289.field3807.method926(-1475225768);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var13 = class289.field3807.method945((byte) -124);
                var3.method1431(var12, var13, true, 64, var11);
            }
            if ((var4 & 0x400) != 0) {
                var3.field3050 = class289.field3807.method969(3);
                var3.field3060 = class289.field3807.method911(50);
                var3.field3033 = class289.field3807.method970(arg0 ^ 0xFFFFFE9E);
                var3.field3039 = class289.field3807.method924(94);
                var3.field3036 = class289.field3807.method961(-4349) + class327.field4404;
                var3.field2984 = class289.field3807.method931(arg0 - 202) + class327.field4404;
                var3.field3069 = class289.field3807.method909(16);
                var3.field3033 += var3.field3088[0];
                var3.field3095 = 1;
                var3.field3039 += var3.field3086[0];
                var3.field3050 += var3.field3088[0];
                var3.field3085 = 0;
                var3.field3060 += var3.field3086[0];
            }
            if ((var4 & 0x80) != 0) {
                int var14 = class289.field3807.method931(122);
                if (var14 == 65535) {
                    var14 = -1;
                }
                int var15 = class289.field3807.method935(-107);
                int var16 = class289.field3807.method909(16);
                var3.method1431(var15, var16, false, arg0 ^ 0x177, var14);
            }
            if ((var4 & 0x40) != 0) {
                int var17 = class289.field3807.method964(117);
                int var18 = class289.field3807.method909(arg0 - 240);
                var3.method1430(class327.field4404, 70, var18, var17);
                var3.field3032 = class327.field4404 + 300;
                var3.field2994 = class289.field3807.method919(14);
            }
            if ((var4 & 0x8) != 0) {
                var3.field4666 = class289.field3807.method963(-118);
                var3.field4688 = class289.field3807.method954(arg0 - 254);
            }
            if ((var4 & 0x2000) != 0) {
                int var19 = class289.field3807.method919(7);
                int[] var20 = new int[var19];
                int[] var21 = new int[var19];
                int[] var22 = new int[var19];
                for (int var23 = 0; var23 < var19; var23++) {
                    int var24 = class289.field3807.method961(-4349);
                    if (var24 == 65535) {
                        var24 = -1;
                    }
                    var20[var23] = var24;
                    var21[var23] = class289.field3807.method930(255);
                    var22[var23] = class289.field3807.method931(82);
                }
                class156.method905(var3, -102, var22, var21, var20);
            }
        }
        if (arg0 != 256) {
            field9441 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V", line = 224)
    public static void method3783(int arg0) {
        field9448 = null;
        field9441 = null;
        field9444 = null;
        field9445 = null;
        if (arg0 != 1) {
            method3782(-33);
        }
        field9447 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 238)
    public static final String method3784(byte arg0, String arg1) {
        if (arg0 != 104) {
            field9444 = null;
        }
        field9443++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }
}
