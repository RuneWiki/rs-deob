import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class221 {

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "[I")
    public static int[] field3181 = new int[2];

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3182 = " from your friend list first.";

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Ldj;")
    public static class143 field3190 = new class143(128);

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "[Luj;")
    public static class158[] field3187;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B[B)Z", line = 8)
    public static final boolean method1605(byte arg0, byte[] arg1) {
        field3186++;
        class299 var2 = new class299(arg1);
        int var3 = var2.method2096((byte) -122);
        if (arg0 != -33) {
            method1610(68, -95, -124, 65, -92);
        }
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method2096((byte) -122) == 1;
        if (var4) {
            class341.method2375(-31081, var2);
        }
        class58.method440(0, var2);
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lfh;ILjava/lang/String;Z)Lpo;", line = 36)
    public static final class10 method1606(class140 arg0, int arg1, String arg2, boolean arg3) {
        field3185++;
        int var4 = arg0.method1079(false, arg2);
        if (var4 == -1) {
            return new class10(0);
        }
        int[] var5 = arg0.method1080(true, var4);
        class10 var6 = new class10(var5.length);
        int var7 = 0;
        if (arg1 != -2) {
            return (class10) null;
        }
        int var8 = 0;
        while (true) {
            while (var6.field122 > var7) {
                class299 var9 = new class299(arg0.method1089(var4, (byte) 117, var5[var8++]));
                int var10 = var9.method2062(-25795);
                int var11 = var9.method2083((byte) -29);
                int var12 = var9.method2096((byte) -122);
                if (!arg3 && var12 == 1) {
                    var6.field122--;
                } else {
                    var6.field117[var7] = var10;
                    var6.field121[var7] = new class352();
                    var6.field121[var7].field5493 = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 83)
    public static final void method1607(int arg0) {
        class311.field4578 = null;
        class293.field4263 = null;
        class357.field5584 = null;
        class67.field855 = null;
        class167.field2329 = null;
        class235.field3374 = null;
        class291.field4233 = null;
        field3189++;
        class254.field3708 = null;
        class186.field2554 = null;
        field3187 = null;
        class327.field4771 = null;
        class84.field1090 = null;
        class314.field4624 = null;
        class211.field2986 = null;
        class264.field3842 = null;
        class192.field2662 = null;
        class211.field2987 = null;
        if (arg0 != 0) {
            method1608(46);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V", line = 112)
    public static final void method1608(int arg0) {
        field3183++;
        class40.method281(false, (byte) -93);
        System.gc();
        class59.method445(25, (byte) 99);
        if (arg0 >= -30) {
            field3182 = (String) null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V", line = 125)
    public static void method1609(int arg0) {
        field3182 = null;
        field3190 = null;
        if (arg0 < 124) {
            method1605((byte) -24, (byte[]) null);
        }
        field3187 = null;
        field3181 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII)V", line = 138)
    public static final void method1610(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3184++;
        if (arg3 != 128) {
            return;
        }
        for (int var5 = 0; var5 < class345.field5370; var5++) {
            if (class65.field826[var5] + class64.field802[var5] > arg0 && class64.field802[var5] < arg0 + arg4 && arg1 < (class300.field4414[var5] + class322.field4728[var5]) && arg1 + arg2 > class300.field4414[var5]) {
                class185.field2520[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lfh;B)V", line = 169)
    public static final void method1611(class140 arg0, byte arg1) {
        if (arg1 < -97) {
            class303.field4440 = arg0;
            field3188++;
        }
    }
}
