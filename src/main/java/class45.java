import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class45 {

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field658 = new Hashtable();

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "[[B")
    public static byte[][] field660 = new byte[50][];

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
    public static final void method304(int arg0) {
        field656++;
        if (class251.field3546 == -1) {
            return;
        }
        int var1 = class694.field9812.method3201((byte) 63);
        int var2 = class694.field9812.method3197((byte) -122);
        class218 var3 = (class218) class585.field8267.method2508((byte) -81);
        if (var3 != null) {
            var1 = var3.method1508((byte) -6);
            var2 = var3.method1506((byte) -65);
        }
        int var4 = 0;
        int var5 = 0;
        if (class607.field8578) {
            var4 = class17.method143(-128);
            var5 = class638.method3629(19728);
        }
        class372.method2308(true, class512.field7325 + var5, var1 + var4, var4, var5, var5, class251.field3546, var4, var1, class638.field8980 + var4, var2, var2 + var5);
        if (arg0 > -111) {
            method304(73);
        }
        if (class271.field3793 != null) {
            method305((byte) -71, var1 + var4, var2 - -var5);
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(BII)V")
    private static final void method305(byte arg0, int arg1, int arg2) {
        if (arg0 != -71) {
            field660 = null;
        }
        field655++;
        if (class436.field6216 < class436.field6217) {
            class436.field6216 = (float) ((double) class436.field6216 / 30.0D + (double) class436.field6216);
            if (class436.field6216 > class436.field6217) {
                class436.field6216 = class436.field6217;
            }
            class79.method601(true);
            class436.field6222 = (int) class436.field6216 >> 1;
            class436.field6218 = class277.method1802((byte) -121, class436.field6222);
        } else if (class436.field6217 < class436.field6216) {
            class436.field6216 = (float) ((double) class436.field6216 - (double) class436.field6216 / 30.0D);
            if (class436.field6217 > class436.field6216) {
                class436.field6216 = class436.field6217;
            }
            class79.method601(true);
            class436.field6222 = (int) class436.field6216 >> 1;
            class436.field6218 = class277.method1802((byte) 127, class436.field6222);
        }
        if (class389.field5537 != -1 && class265.field3746 != -1) {
            int var3 = class389.field5537 - class459.field6580;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class265.field3746 - class450.field6465;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class459.field6580 -= -var3;
            if (var3 == 0 && var4 == 0) {
                class389.field5537 = -1;
                class265.field3746 = -1;
            }
            class450.field6465 -= -var4;
            class79.method601(true);
        }
        if (class22.field334 > 0) {
            class668.field9392--;
            if (class668.field9392 == 0) {
                class22.field334--;
                class668.field9392 = 100;
            }
        } else {
            class503.field7192 = -1;
            class108.field1313 = -1;
        }
        if (!class519.field7423 || class425.field5983 == null) {
            return;
        }
        for (class724 var5 = (class724) class425.field5983.method2508((byte) -126); var5 != null; var5 = (class724) class425.field5983.method2505((byte) -55)) {
            class665 var6 = class436.field6213.method3711((byte) 55, var5.field10157.field7063);
            if (var5.method4075(arg1, (byte) -108, arg2)) {
                if (var6.field9346 != null) {
                    if (var6.field9346[4] != null) {
                        class502.method2933(1011, var6.field9339, true, -1, 6947, var6.field9346[4], -1, (long) var5.field10157.field7063, false, false, var6.field9335, 0, (long) var5.field10157.field7063);
                    }
                    if (var6.field9346[3] != null) {
                        class502.method2933(1006, var6.field9339, true, -1, 6947, var6.field9346[3], -1, (long) var5.field10157.field7063, false, false, var6.field9335, 0, (long) var5.field10157.field7063);
                    }
                    if (var6.field9346[2] != null) {
                        class502.method2933(1003, var6.field9339, true, -1, arg0 + 7018, var6.field9346[2], -1, (long) var5.field10157.field7063, false, false, var6.field9335, 0, (long) var5.field10157.field7063);
                    }
                    if (var6.field9346[1] != null) {
                        class502.method2933(1008, var6.field9339, true, -1, 6947, var6.field9346[1], -1, (long) var5.field10157.field7063, false, false, var6.field9335, 0, (long) var5.field10157.field7063);
                    }
                    if (var6.field9346[0] != null) {
                        class502.method2933(1004, var6.field9339, true, -1, 6947, var6.field9346[0], -1, (long) var5.field10157.field7063, false, false, var6.field9335, 0, (long) var5.field10157.field7063);
                    }
                }
                if (!var5.field10157.field7065) {
                    var5.field10157.field7065 = true;
                    class353.method2226(class617.field8707, var5.field10157.field7063, var6.field9335);
                }
                if (var5.field10157.field7065) {
                    class353.method2226(class733.field10223, var5.field10157.field7063, var6.field9335);
                }
            } else if (var5.field10157.field7065) {
                var5.field10157.field7065 = false;
                class353.method2226(class137.field1786, var5.field10157.field7063, var6.field9335);
            }
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(FIFF)I")
    public static final int method306(float arg0, int arg1, float arg2, float arg3) {
        if (arg1 >= -70) {
            field660 = null;
        }
        field659++;
        float var4 = arg3 < 0.0F ? -arg3 : arg3;
        float var5 = (arg2 < 0.0F) ? -arg2 : arg2;
        float var6 = arg0 < 0.0F ? -arg0 : arg0;
        if (var4 < var5 && var5 > var6) {
            return (arg2 > 0.0F) ? 0 : 1;
        } else if (var6 > var4 && var5 < var6) {
            return (arg0 > 0.0F) ? 2 : 3;
        } else if ((arg3 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(I)V")
    public static void method307(int arg0) {
        int var1 = -110 % ((-arg0 - 45) / 35);
        field658 = null;
        field660 = null;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(IIB[B)Ljava/lang/String;")
    public static final String method308(int arg0, int arg1, byte arg2, byte[] arg3) {
        if (arg2 != 37) {
            method306(0.680093F, -34, -0.17305547F, 1.287786F);
        }
        field657++;
        char[] var4 = new char[arg0];
        int var5 = 0;
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg3[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class413.field5839[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }
}
