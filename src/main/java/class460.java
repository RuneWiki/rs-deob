import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class460 extends class270 {

    @OriginalMember(owner = "client!a", name = "C", descriptor = "Lli;")
    public class134 field6820;

    @OriginalMember(owner = "client!a", name = "B", descriptor = "I")
    public static int field6819 = 1401;

    @OriginalMember(owner = "client!a", name = "D", descriptor = "[I")
    public static int[] field6821 = new int[2];

    @OriginalMember(owner = "client!a", name = "F", descriptor = "Ljava/lang/String;")
    public static String field6823 = null;

    @OriginalMember(owner = "client!a", name = "z", descriptor = "Llo;")
    public static class306 field6817 = new class306("cyan:", "blaugrün:", "cyan:", "cyan:");

    @OriginalMember(owner = "client!a", name = "y", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!a", name = "A", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!a", name = "E", descriptor = "I")
    public static int field6822;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
    public static void method2740(boolean arg0) {
        if (arg0) {
            method2742(36, 126);
        }
        field6817 = null;
        field6823 = null;
        field6821 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static final void method2741(int arg0) {
        if (arg0 != -2866) {
            field6821 = null;
        }
        for (int var1 = 0; var1 < class65.field961; var1++) {
            int var2 = class387.field5962[var1];
            class265 var3 = ((class505) class147.field2396.method2516((long) var2, -1)).field7355;
            int var4 = class506.field7365.method126((byte) -105);
            if ((var4 & 0x80) != 0) {
                var4 += class506.field7365.method126((byte) -84) << 8;
            }
            if ((var4 & 0x2) != 0) {
                int var5 = class506.field7365.method132(arg0 + 2893);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class506.field7365.method141(-22314);
                int var7 = class506.field7365.method126((byte) -72);
                var3.method1316(false, arg0 - 4833, var5, var7, var6);
            }
            if ((var4 & 0x20) != 0) {
                var3.field3065 = class506.field7365.method162(false);
                if (var3.field3065 == 65535) {
                    var3.field3065 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var8 = class506.field7365.method123(false);
                int var9 = class506.field7365.method125((byte) 120);
                var3.method1310(var8, class504.field7348, 26273, var9);
                var3.field3056 = class504.field7348 + 300;
                var3.field3119 = class506.field7365.method125((byte) 85);
            }
            if ((var4 & 0x10) != 0) {
                int var10 = class506.field7365.method123(false);
                int var11 = class506.field7365.method125((byte) 127);
                var3.method1310(var10, class504.field7348, 26273, var11);
            }
            if ((var4 & 0x1000) != 0) {
                int var12 = class506.field7365.method162(false);
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = class506.field7365.method143(-3230);
                int var14 = class506.field7365.method126((byte) -74);
                var3.method1316(true, -7699, var12, var14, var13);
            }
            if ((var4 & 0x100) != 0) {
                int var15 = class506.field7365.method172(255);
                var3.field3103 = class506.field7365.method125((byte) 84);
                var3.field3061 = class506.field7365.method126((byte) -84);
                var3.field3106 = (var15 & 0x8000) != 0;
                var3.field3108 = var15 & 0x7FFF;
                var3.field3141 = class504.field7348 + var3.field3108 + var3.field3103;
            }
            if ((var4 & 0x2000) != 0) {
                var3.field3114 = class506.field7365.method175(122);
                var3.field3147 = class506.field7365.method144(arg0 ^ 0xFFFFF4A9);
                var3.field3082 = class506.field7365.method175(arg0 + 2961);
                var3.field3099 = class506.field7365.method144(124);
                var3.field3138 = class506.field7365.method132(117) + class504.field7348;
                var3.field3132 = class506.field7365.method172(255) + class504.field7348;
                var3.field3120 = class506.field7365.method165(false);
                var3.field3153 = 1;
                var3.field3154 = 0;
                var3.field3147 += var3.field3158[0];
                var3.field3082 += var3.field3159[0];
                var3.field3099 += var3.field3158[0];
                var3.field3114 += var3.field3159[0];
            }
            if ((var4 & 0x4) != 0) {
                int var16 = class506.field7365.method132(102);
                if (var16 == 65535) {
                    var16 = -1;
                }
                int var17 = class506.field7365.method125((byte) 90);
                class97.method671(var17, var3, (byte) 126, var16);
            }
            if ((var4 & 0x800) != 0) {
                var3.field3131 = class506.field7365.method167(-2);
                var3.field3121 = class506.field7365.method148(126);
                var3.field3064 = class506.field7365.method175(103);
                var3.field3059 = (byte) class506.field7365.method173(-1278512920);
                var3.field3081 = class504.field7348 + class506.field7365.method172(255);
                var3.field3145 = class504.field7348 + class506.field7365.method172(arg0 ^ 0xFFFFF431);
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field4430.method2998(-1)) {
                    class265.method1766(true, var3);
                }
                var3.method1764(arg0 ^ 0xB31, class22.field239.method1085(class506.field7365.method132(84), 537461692));
                var3.method1309(arg0 - 10447, var3.field4430.field7416);
                var3.field3135 = var3.field4430.field7411 << 3;
                if (var3.field4430.method2998(arg0 ^ 0xB31)) {
                    class465.method2768(var3.field4720, (byte) -108, null, 0, null, var3.field3159[0], var3, var3.field3158[0]);
                }
            }
            if ((var4 & 0x400) != 0) {
                int var18 = class506.field7365.method126((byte) -90);
                int[] var19 = new int[var18];
                int[] var20 = new int[var18];
                int[] var21 = new int[var18];
                for (int var22 = 0; var22 < var18; var22++) {
                    int var23 = class506.field7365.method132(81);
                    if (var23 == 65535) {
                        var23 = -1;
                    }
                    var19[var22] = var23;
                    var20[var22] = class506.field7365.method165(false);
                    var21[var22] = class506.field7365.method172(255);
                }
                class59.method397(var19, var20, var3, var21, 1);
            }
            if ((var4 & 0x8) != 0) {
                var3.field3062 = class506.field7365.method156((byte) -44);
                var3.field3057 = 100;
            }
            if ((var4 & 0x200) != 0) {
                var3.field4434 = class506.field7365.method132(45);
                var3.field4449 = class506.field7365.method172(255);
            }
        }
        field6818++;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lli;)V")
    public class460(class134 arg0) {
        this.field6820 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(II)Z")
    public static final boolean method2742(int arg0, int arg1) {
        if (arg1 > -81) {
            field6819 = 115;
        }
        field6822++;
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IBI)Z")
    public static final boolean method2743(int arg0, byte arg1, int arg2) {
        field6816++;
        return arg1 != -112;
    }
}
