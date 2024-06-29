import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class35 {

    @OriginalMember(owner = "client!da", name = "m", descriptor = "Loa;")
    private class153 field709 = new class153(256);

    @OriginalMember(owner = "client!da", name = "q", descriptor = "Loa;")
    private class153 field713 = new class153(256);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Lwa;")
    private class238 field699;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Lwa;")
    private class238 field701;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Ldc;")
    public static class37 field702 = class185.method1233((byte) 86, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Ldc;")
    public static class37 field704 = class185.method1233((byte) 86, "<br>");

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Ldc;")
    public static class37 field705 = class185.method1233((byte) 86, "title)3jpg");

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field703 = 0;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II[I)Lne;")
    public final class146 method288(int arg0, int arg1, int[] arg2) {
        field700++;
        if (arg0 > -39) {
            field704 = null;
        }
        if (this.field699.method1557(-15) == 1) {
            return this.method296(true, arg2, arg1, 0);
        } else if (this.field699.method1559(26143, arg1) == 1) {
            return this.method296(true, arg2, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static void method289(int arg0) {
        if (arg0 > 0) {
            field705 = null;
            field704 = null;
            field702 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IBII)Lne;")
    private final class146 method290(int[] arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 90) {
            return null;
        }
        field714++;
        int var5 = (arg2 << 4 & 0xFFFD | arg2 >>> 12) ^ arg3;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class146 var9 = (class146) this.field713.method1047((byte) -33, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class22 var10 = (class22) this.field709.method1047((byte) -93, var7);
            if (var10 == null) {
                var10 = class22.method150(this.field701, arg2, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field709.method1044(var10, (byte) -14, var7);
            }
            class146 var11 = var10.method151(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method433(0);
                this.field713.method1044(var11, (byte) -14, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([BZ)Lig;")
    public static final class93 method291(byte[] arg0, boolean arg1) {
        field710++;
        if (arg1) {
            method291(null, false);
        }
        if (arg0 == null) {
            return null;
        } else {
            class90 var2 = new class90(arg0, class166.field3162, class7.field77, class174.field3308, class238.field4336, class217.field4040);
            class97.method644(!arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([BI)V")
    public static final void method292(byte[] arg0, int arg1) {
        field706++;
        class28 var2 = new class28(arg0);
        var2.field526 = arg0.length - 2;
        class113.field2018 = var2.method230((byte) -122);
        class166.field3162 = new int[class113.field2018];
        class7.field77 = new int[class113.field2018];
        class238.field4336 = new int[class113.field2018];
        class217.field4040 = new byte[class113.field2018][];
        class174.field3308 = new int[class113.field2018];
        var2.field526 = arg0.length - class113.field2018 * 8 - 7;
        class67.field1207 = var2.method230((byte) -114);
        class160.field3030 = var2.method230((byte) -103);
        int var3 = (var2.method215(arg1 ^ 0x94D78A09) & 0xFF) + 1;
        for (int var4 = 0; var4 < class113.field2018; var4++) {
            class166.field3162[var4] = var2.method230((byte) -112);
        }
        for (int var5 = 0; var5 < class113.field2018; var5++) {
            class7.field77[var5] = var2.method230((byte) -101);
        }
        for (int var6 = 0; var6 < class113.field2018; var6++) {
            class174.field3308[var6] = var2.method230((byte) -127);
        }
        for (int var7 = 0; var7 < class113.field2018; var7++) {
            class238.field4336[var7] = var2.method230((byte) -113);
        }
        var2.field526 = arg0.length - (var3 - 1) * 3 - class113.field2018 * 8 - 7;
        class5.field42 = new int[var3];
        for (int var8 = arg1; var8 < var3; var8++) {
            class5.field42[var8] = var2.method225(class237.method1535(arg1, 67));
            if (class5.field42[var8] == 0) {
                class5.field42[var8] = 1;
            }
        }
        var2.field526 = 0;
        for (int var9 = 0; var9 < class113.field2018; var9++) {
            int var10 = class174.field3308[var9];
            int var11 = class238.field4336[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class217.field4040[var9] = var13;
            int var14 = var2.method215(-1797813752);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method206(-16933672);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var15 + var10 * var16] = var2.method206(class237.method1535(arg1, -16933671));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lwa;Lwa;Z)V")
    public static final void method293(class238 arg0, class238 arg1, boolean arg2) {
        if (!arg2) {
            class76.field1347 = arg0;
            field708++;
            class207.field3871 = arg1;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([IZI)Lne;")
    public final class146 method294(int[] arg0, boolean arg1, int arg2) {
        field707++;
        if (arg1) {
            field702 = null;
        }
        if (this.field701.method1557(112) == 1) {
            return this.method290(arg0, (byte) 100, 0, arg2);
        } else if (this.field701.method1559(26143, arg2) == 1) {
            return this.method290(arg0, (byte) 112, arg2, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class237 var20 = new class237(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class180.field3354[var21][arg1][arg2] == null) {
                    class180.field3354[var21][arg1][arg2] = new class18(var21, arg1, arg2);
                }
            }
            class180.field3354[arg0][arg1][arg2].field286 = var20;
        } else if (arg3 == 1) {
            class237 var22 = new class237(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class180.field3354[var23][arg1][arg2] == null) {
                    class180.field3354[var23][arg1][arg2] = new class18(var23, arg1, arg2);
                }
            }
            class180.field3354[arg0][arg1][arg2].field286 = var22;
        } else {
            class116 var24 = new class116(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class180.field3354[var25][arg1][arg2] == null) {
                    class180.field3354[var25][arg1][arg2] = new class18(var25, arg1, arg2);
                }
            }
            class180.field3354[arg0][arg1][arg2].field284 = var24;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z[III)Lne;")
    private final class146 method296(boolean arg0, int[] arg1, int arg2, int arg3) {
        field711++;
        if (!arg0) {
            field703 = -92;
        }
        int var5 = (arg3 >>> 12 | (arg3 & 0x70000FFF) << 4) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class146 var9 = (class146) this.field713.method1047((byte) 112, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class40 var10 = class40.method356(this.field699, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class146 var11 = var10.method357();
            this.field713.method1044(var11, (byte) -14, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field2789.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
    public static final int method297(KeyEvent arg0, int arg1) {
        int var2 = arg0.getKeyChar();
        field698++;
        if (var2 == 8364) {
            return 128;
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        if (arg1 <= 95) {
            method295(-104, -64, 83, -66, 52, -98, -26, 111, -43, -91, -34, 92, 87, -31, -21, -40, -34, 122, -79, -74);
        }
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)I")
    public static final int method298(int arg0, int arg1, int arg2) {
        field697++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg0 >= -17 ? 4 : (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lwa;Lwa;)V")
    public class35(class238 arg0, class238 arg1) {
        this.field699 = arg0;
        this.field701 = arg1;
    }
}
