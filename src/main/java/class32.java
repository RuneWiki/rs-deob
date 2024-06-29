import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class32 extends class263 {

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field427 = 0;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    public static int field430 = 3;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "Ljava/lang/String;")
    public static String field431 = " more options";

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
    public static int field432 = 0;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "Leh;")
    public static class137 field428;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "[Lgg;")
    public static class61[] field425;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
    public static void method178(int arg0) {
        if (arg0 == 7527) {
            field428 = null;
            field425 = null;
            field431 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "([BI)V")
    public static final void method179(byte[] arg0, int arg1) {
        field426++;
        class96 var2 = new class96(arg0);
        var2.field1228 = arg0.length - 2;
        class154.field2407 = var2.method549(255);
        class293.field4645 = new byte[class154.field2407][];
        class172.field2726 = new int[class154.field2407];
        class179.field2850 = new boolean[class154.field2407];
        class129.field2072 = new int[class154.field2407];
        class238.field3936 = new byte[class154.field2407][];
        class103.field1387 = new int[class154.field2407];
        class40.field493 = new int[class154.field2407];
        var2.field1228 = arg0.length - (class154.field2407 * 8) - 7;
        class286.field4562 = var2.method549(255);
        class245.field4018 = var2.method549(255);
        int var3 = (var2.method584(255) & 0xFF) + 1;
        for (int var4 = 0; var4 < class154.field2407; var4++) {
            class40.field493[var4] = var2.method549(255);
        }
        for (int var5 = 0; var5 < class154.field2407; var5++) {
            class129.field2072[var5] = var2.method549(255);
        }
        for (int var6 = 0; var6 < class154.field2407; var6++) {
            class103.field1387[var6] = var2.method549(255);
        }
        for (int var7 = 0; var7 < class154.field2407; var7++) {
            class172.field2726[var7] = var2.method549(255);
        }
        var2.field1228 = arg0.length - (class154.field2407 * 8) - (var3 * 3 - 3) - 7;
        class172.field2729 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class172.field2729[var8] = var2.method598(-1235752501);
            if (class172.field2729[var8] == 0) {
                class172.field2729[var8] = 1;
            }
        }
        var2.field1228 = 0;
        for (int var9 = 0; var9 < class154.field2407; var9++) {
            int var10 = class172.field2726[var9];
            int var11 = class103.field1387[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class293.field4645[var9] = var13;
            class238.field3936[var9] = var14;
            boolean var15 = false;
            int var16 = var2.method584(255);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var13[var22] = var2.method587(-42);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var14[var23] = var2.method587(-15);
                        var15 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label92: while (true) {
                    if (var11 <= var17) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var18 = 0;
                        while (true) {
                            if (var18 >= var11) {
                                break label92;
                            }
                            for (int var19 = 0; var19 < var10; var19++) {
                                byte var20 = var14[var18 + (var11 * var19)] = var2.method587(-114);
                                var15 |= var20 != -1;
                            }
                            var18++;
                        }
                    }
                    for (int var21 = 0; var21 < var10; var21++) {
                        var13[var11 * var21 + var17] = var2.method587(-23);
                    }
                    var17++;
                }
            }
            class179.field2850[var9] = var15;
        }
        if (arg1 <= 3) {
            field430 = 30;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIZI)V")
    public static final void method180(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field429++;
        if (!arg3) {
            method178(-3);
        }
        class233 var5 = class114.method746(arg2, 1228126432, 4);
        var5.method1651((byte) 121);
        var5.field3850 = arg0;
        var5.field3855 = arg1;
        var5.field3852 = arg4;
    }
}
