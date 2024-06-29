import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class124 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "[I")
    public static int[] field2213 = new int[50];

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Ldc;")
    private static class37 field2220 = class185.method1233((byte) 86, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!le", name = "f", descriptor = "Ldc;")
    public static class37 field2217 = field2220;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "[I")
    public static int[] field2219;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZILld;I)V")
    public static final void method842(boolean arg0, int arg1, class123 arg2, int arg3) {
        field2218++;
        if ((arg3 & 0x400) != 0) {
            arg2.field3541 = class12.field167.method207(65280);
            int var4 = class12.field167.method219((byte) -127);
            arg2.field3478 = var4 >> 16;
            if (arg2.field3541 == 65535) {
                arg2.field3541 = -1;
            }
            arg2.field3502 = (var4 & 0xFFFF) + class203.field3758;
            arg2.field3492 = 0;
            arg2.field3526 = 0;
            if (arg2.field3502 > class203.field3758) {
                arg2.field3526 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            int var5 = class12.field167.method196(123);
            int var6 = class12.field167.method215(-1797813752);
            int var7 = class12.field167.method212(125);
            int var8 = class12.field167.field526;
            boolean var9 = (var5 & 0x8000) != 0;
            if (arg2.field2187 != null && arg2.field2191 != null) {
                long var10 = arg2.field2187.method347(120);
                boolean var12 = false;
                if (var6 <= 1) {
                    if (!var9 && (class144.field2763 == 1 || class78.field1365 == 1)) {
                        var12 = true;
                    } else {
                        for (int var13 = 0; var13 < class59.field1100; var13++) {
                            if (class193.field3606[var13] == var10) {
                                var12 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var12 && class245.field4482 == 0) {
                    int var14 = -1;
                    class180.field3357.field526 = 0;
                    class12.field167.method232(-1, 0, var7, class180.field3357.field502);
                    class180.field3357.field526 = 0;
                    class37 var16;
                    if (var9) {
                        var5 &= 0x7FFF;
                        class99 var15 = class174.method1173(class180.field3357, (byte) 38);
                        var14 = var15.field1718;
                        var16 = var15.field1719.method974(class180.field3357, 0);
                    } else {
                        var16 = class93.method629(class180.method1195((byte) -80, class180.field3357).method312(1));
                    }
                    arg2.field3501 = var16.method332(41);
                    arg2.field3532 = var5 & 0xFF;
                    arg2.field3544 = var5 >> 8;
                    arg2.field3470 = 150;
                    if (var6 == 2) {
                        class203.method1334(var9 ? 17 : 1, var14, var16, null, class80.method548(new class37[] { class49.field971, arg2.field2187 }, -74), (byte) -116);
                    } else if (var6 == 1) {
                        class203.method1334(var9 ? 17 : 1, var14, var16, null, class80.method548(new class37[] { class74.field1313, arg2.field2187 }, -41), (byte) -119);
                    } else {
                        class203.method1334(var9 ? 17 : 2, var14, var16, null, arg2.field2187, (byte) -117);
                    }
                }
            }
            class12.field167.field526 = var7 + var8;
        }
        if ((arg3 & 0x80) != 0) {
            int var17 = class12.field167.method227(-112);
            int var18 = class12.field167.method189((byte) 121);
            arg2.method1265(10, var17, var18, class203.field3758);
            arg2.field3469 = class203.field3758 + 300;
            arg2.field3539 = class12.field167.method215(-1797813752);
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field3501 = class12.field167.method180(2);
            if (arg2.field3501.method329((byte) 95, 0) == 126) {
                arg2.field3501 = arg2.field3501.method301((byte) 73, 1);
                class215.method1418(2, -1, arg2.field3501, arg2.field2187);
            } else if (class238.field4382 == arg2) {
                class215.method1418(2, -1, arg2.field3501, arg2.field2187);
            }
            arg2.field3544 = 0;
            arg2.field3532 = 0;
            arg2.field3470 = 150;
        }
        if ((arg3 & 0x1) != 0) {
            int var19 = class12.field167.method230((byte) -126);
            int var20 = class12.field167.method227(-111);
            if (var19 == 65535) {
                var19 = -1;
            }
            class145.method1005(0, var20, var19, arg2);
        }
        if (!arg0) {
            return;
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field3517 = class12.field167.method234((byte) 82);
            if (arg2.field3517 == 65535) {
                arg2.field3517 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field3479 = class12.field167.method234((byte) 82);
            arg2.field3523 = class12.field167.method230((byte) -117);
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field3481 = class12.field167.method189((byte) 86);
            arg2.field3519 = class12.field167.method215(-1797813752);
            arg2.field3464 = class12.field167.method227(-100);
            arg2.field3512 = class12.field167.method189((byte) 80);
            arg2.field3515 = class12.field167.method230((byte) -121) + class203.field3758;
            arg2.field3547 = class12.field167.method234((byte) 82) + class203.field3758;
            arg2.field3548 = class12.field167.method212(127);
            arg2.field3491 = 1;
            arg2.field3471 = 0;
        }
        if ((arg3 & 0x200) != 0) {
            int var21 = class12.field167.method215(-1797813752);
            int var22 = class12.field167.method215(-1797813752);
            arg2.method1265(10, var21, var22, class203.field3758);
        }
        if ((arg3 & 0x2) == 0) {
            return;
        }
        int var23 = class12.field167.method215(-1797813752);
        byte[] var24 = new byte[var23];
        class28 var25 = new class28(var24);
        class12.field167.method218(0, var24, -32083, var23);
        class66.field1194[arg1] = var25;
        arg2.method838(12, var25);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static void method843(int arg0) {
        field2220 = null;
        field2217 = null;
        field2219 = null;
        if (arg0 != 17) {
            method842(true, -13, null, 81);
        }
        field2213 = null;
    }
}
