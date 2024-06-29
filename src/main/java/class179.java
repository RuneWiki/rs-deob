import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class179 extends class396 {

    @OriginalMember(owner = "client!hp", name = "t", descriptor = "[B")
    public byte[] field2466;

    @OriginalMember(owner = "client!hp", name = "u", descriptor = "Ljava/lang/String;")
    public static String field2467 = "Use";

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "I")
    public static int field2465 = -1;

    @OriginalMember(owner = "client!hp", name = "x", descriptor = "Ljava/lang/String;")
    public static String field2470 = "Loaded sprites";

    @OriginalMember(owner = "client!hp", name = "v", descriptor = "I")
    public static int field2468 = 0;

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!hp", name = "w", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IC)Z")
    public static final boolean method1169(int arg0, char arg1) {
        field2464++;
        if (!(arg0 >= arg1 || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class330.field4713;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)Ljf;")
    public static final class119 method1170(int arg0, int arg1) {
        if (arg1 != 818041328) {
            return null;
        }
        field2469++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class224.field3054[var2] == null || class224.field3054[var2][var3] == null) {
            boolean var4 = class344.method2202((byte) -94, var2);
            if (!var4) {
                return null;
            }
        }
        return class224.field3054[var2][var3];
    }

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "(I)V")
    public static void method1171(int arg0) {
        field2470 = null;
        field2467 = null;
        if (arg0 != 0) {
            method1170(63, 51);
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "([B)V")
    public class179(byte[] arg0) {
        this.field2466 = arg0;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IJII)V")
    public static final void method1172(int arg0, long arg1, int arg2, int arg3) {
        field2472++;
        int var5 = ((int) arg1 & 0x7E67C) >> 14;
        int var6 = ((int) arg1 & 0x3162D9) >> 20;
        int var7 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class327 var8 = class157.method1036(arg3, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field4680;
                var9 = var8.field4615;
            } else {
                var9 = var8.field4680;
                var10 = var8.field4615;
            }
            int var11 = var8.field4612;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class138.method824(class390.field5715.field6350[0], arg2, var10, 0, var9, true, 0, (byte) 107, var11, class390.field5715.field6351[0], arg0);
        } else {
            class138.method824(class390.field5715.field6350[0], arg2, 0, var5, 0, true, var6, (byte) 95, 0, class390.field5715.field6351[0], arg0);
        }
        if (arg3 != 0) {
            method1170(118, -118);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I")
    public static final int method1173(int arg0, int arg1, String arg2, String arg3) {
        field2471++;
        int var4 = arg2.length();
        int var5 = arg3.length();
        int var6 = 125 / ((arg0 - 54) / 53);
        int var7 = 0;
        int var8 = 0;
        char var9 = 0;
        char var10 = 0;
        while (var7 - var9 < var4 || (var8 - var10) < var5) {
            if (var7 - var9 >= var4) {
                return -1;
            }
            if (var8 - var10 >= var5) {
                return 1;
            }
            char var23;
            if (var9 == '\u0000') {
                var23 = arg2.charAt(var7++);
            } else {
                var23 = var9;
                boolean var24 = false;
            }
            char var25;
            if (var10 == '\u0000') {
                var25 = arg3.charAt(var8++);
            } else {
                var25 = var10;
                boolean var26 = false;
            }
            var9 = class199.method1270(false, var23);
            var10 = class199.method1270(false, var25);
            char var27 = class366.method2316(arg1, (byte) 106, var23);
            char var28 = class366.method2316(arg1, (byte) -105, var25);
            if (var27 != var28 && Character.toUpperCase(var27) != Character.toUpperCase(var28)) {
                char var29 = Character.toLowerCase(var27);
                char var30 = Character.toLowerCase(var28);
                if (var29 != var30) {
                    return class343.method2200(var29, 0, arg1) - class343.method2200(var30, 0, arg1);
                }
            }
        }
        int var11 = Math.min(var4, var5);
        for (int var12 = 0; var12 < var11; var12++) {
            int var17;
            int var18;
            if (arg1 == 2) {
                var17 = var4 - var12 - 1;
                var18 = var5 - (var12 + 1);
            } else {
                var18 = var12;
                var17 = var12;
            }
            char var19 = arg2.charAt(var17);
            char var20 = arg3.charAt(var18);
            if (var19 != var20 && Character.toUpperCase(var19) != Character.toUpperCase(var20)) {
                char var21 = Character.toLowerCase(var19);
                char var22 = Character.toLowerCase(var20);
                if (var21 != var22) {
                    return class343.method2200(var21, 0, arg1) - class343.method2200(var22, 0, arg1);
                }
            }
        }
        int var13 = var4 - var5;
        if (var13 != 0) {
            return var13;
        }
        for (int var14 = 0; var14 < var11; var14++) {
            char var15 = arg2.charAt(var14);
            char var16 = arg3.charAt(var14);
            if (var15 != var16) {
                return class343.method2200(var15, 0, arg1) - class343.method2200(var16, 0, arg1);
            }
        }
        return 0;
    }
}
