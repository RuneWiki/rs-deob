import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class549 extends class609 {

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "[[Z")
    public static boolean[][] field7714 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public static int field7713;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "Lrga;")
    public class215 field7712;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "[I")
    public static int[] field7718;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "[Lkd;")
    public class253[] field7711;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
    public static final void method3103(int arg0) {
        field7717++;
        int var1 = 0;
        int var2 = 0;
        if (arg0 != 16029) {
            return;
        }
        while (var2 < class199.field2812) {
            for (int var3 = 0; var3 < class232.field3611; var3++) {
                if (class552.method3130(arg0 - 16030, true, var2, var3, var1, class153.field2210)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lr;Lwba;III)V")
    public static final void method3104(class166 arg0, class46 arg1, int arg2, int arg3, int arg4) {
        class569.field8030.method475(6);
        field7719++;
        if (arg4 != -1) {
            field7714 = null;
        }
        if (class706.field9930) {
            return;
        }
        for (class627 var5 = (class627) arg1.method472((byte) -108); var5 != null; var5 = (class627) arg1.method482(arg4 - 36)) {
            class588 var6 = class25.field339.method812((byte) -117, var5.field8781);
            if (class103.method829(arg4 ^ 0xFFFFFF9C, var6)) {
                boolean var7 = class104.method835(arg0, 2, arg2, arg3, var6, var5);
                if (var7) {
                    class647.method3592(var5, arg0, arg4 + 117, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lr;B)V")
    public static final void method3105(class166 arg0, byte arg1) {
        field7713++;
        if (!(class340.field5002 >= 2 || class245.field3797) || class648.field9107 != null) {
            return;
        }
        String var2;
        if (class245.field3797 && class340.field5002 < 2) {
            var2 = class331.field4896 + class274.field4148.method1804(arg1 + 7241, class512.field7203) + class338.field4988 + " ->";
        } else if (class671.field9479 && class603.field8514.method1364(true, 81) && class340.field5002 > 2) {
            var2 = class666.method3680(false, (class279) class663.field9367.field716.field9384.field9384);
        } else {
            class279 var3 = (class279) class663.field9367.field716.field9384;
            var2 = class666.method3680(false, var3);
            int[] var4 = null;
            if (class488.method2833(var3.field4213, (byte) 110)) {
                var4 = class41.field682.method2228((int) var3.field4208, 0).field2687;
            } else if (var3.field4221 != -1) {
                var4 = class41.field682.method2228(var3.field4221, 0).field2687;
            } else if (class656.method3612(var3.field4213, (byte) -89)) {
                class16 var5 = (class16) class189.field2723.method1405((long) ((int) var3.field4208), (byte) -127);
                if (var5 != null) {
                    class577 var6 = var5.field174;
                    class592 var7 = var6.field8121;
                    if (var7.field8315 != null) {
                        var7 = var7.method3356(120, class61.field1163);
                    }
                    if (var7 != null) {
                        var4 = var7.field8288;
                    }
                }
            } else if (class15.method90((byte) -108, var3.field4213)) {
                Object var8 = null;
                class550 var9;
                if (var3.field4213 == 1001) {
                    var9 = class101.field1572.method2617((byte) -107, (int) var3.field4208);
                } else {
                    var9 = class101.field1572.method2617((byte) -116, (int) (var3.field4208 >>> 32 & 0x7FFFFFFFL));
                }
                if (var9.field7781 != null) {
                    var9 = var9.method3124((byte) -126, class61.field1163);
                }
                if (var9 != null) {
                    var4 = var9.field7764;
                }
            }
            if (var4 != null) {
                var2 = var2 + class56.method614(var4, 0);
            }
        }
        if (class340.field5002 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class340.field5002 - 2) + class274.field4141.method1804(arg1 ^ 0xFFFFE3B9, class512.field7203);
        }
        if (arg1 != -66) {
            return;
        }
        if (class569.field8022 != null) {
            class416 var10 = class569.field8022.method565(128, arg0);
            if (var10 == null) {
                var10 = class26.field391;
            }
            var10.method2498(class424.field6159, class569.field8022.field860, class569.field8022.field932, class569.field8022.field995, class640.field9036, class226.field3181, class569.field8022.field967, class210.field2948, class569.field8022.field877, class569.field8022.field972, class165.field2372, var2, (byte) 106, class243.field3789, class518.field7304);
            class349.method2156(0, class640.field9036[1], class640.field9036[0], class640.field9036[3], class640.field9036[2]);
        } else if (class678.field9586 != null && class689.field9693 == class586.field8208) {
            int var11 = class26.field391.method2499(class210.field2948, class331.field4894 + 16, class424.field6159, 78, 16777215, 0, class518.field7304, class294.field4327 + 4, class165.field2372, var2);
            class349.method2156(0, class331.field4894, class294.field4327 + 4, 16, var11 + class467.field6721.method1039(arg1 ^ 0xFFFFFFBE, var2));
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILr;BI)Z")
    public final boolean method3106(int arg0, class166 arg1, byte arg2, int arg3) {
        if (arg2 >= -103) {
            return false;
        }
        field7716++;
        if (this.field7711 != null) {
            for (int var5 = 0; var5 < this.field7711.length; var5++) {
                if (this.field7711[var5].method1692(arg0, arg3) && this.field7712.method1185(-26798, arg3, arg1, arg0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V")
    public static void method3107(int arg0) {
        field7714 = null;
        if (arg0 != 16777215) {
            method3107(46);
        }
        field7718 = null;
    }
}
