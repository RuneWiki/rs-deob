import java.awt.Canvas;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class168 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2204;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILjava/lang/String;I)Z")
    public static final boolean method962(int arg0, String arg1, int arg2) {
        field2205++;
        if (class590.field8289.field9151) {
            class131.field1628 = new class300();
            class131.field1628.field3685 = arg0;
            class131.field1628.field3680 = arg1;
            if (class591.field8310 != class1.field9) {
                class131.field1628.field3688 = class131.field1628.field3685 + 40000;
                class131.field1628.field3686 = class131.field1628.field3685 + 50000;
            }
            if (arg0 < class68.field930.length && class68.field930[arg0] != null) {
                class89.field1237 = class68.field930[arg0].field2905;
            }
            return true;
        }
        String var3 = "";
        if (class591.field8310 != class1.field9) {
            var3 = ":" + (arg0 + 7000);
        }
        String var4 = "";
        if (arg2 != 55) {
            method962(81, null, 111);
        }
        if (class92.field1288 != null) {
            var4 = "/p=" + class92.field1288;
        }
        String var5 = "http://" + arg1 + var3 + "/l=" + class250.field3068 + "/a=" + class322.field4130 + var4 + "/j" + (class453.field5814 ? "1" : "0") + ",o" + (class406.field5082 ? "1" : "0") + ",a2";
        try {
            class520.field7094.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljava/awt/Canvas;BLfa;)Lr;")
    public static final class566 method963(Canvas arg0, byte arg1, class526 arg2) {
        field2203++;
        return arg1 == 105 ? new class171(arg0, arg2) : null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(JJ)J")
    public static long method964(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lac;ZB)V")
    public static final void method965(class307 arg0, boolean arg1, byte arg2) {
        field2201++;
        if (class463.field5904 >= 400) {
            return;
        }
        if (arg2 > -109) {
            method962(58, null, 12);
        }
        class586 var3 = arg0.field3902;
        if (var3.field8205 != null) {
            var3 = var3.method3220(-4261, class684.field9606);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field8180) {
            return;
        }
        String var4 = var3.field8241;
        if (var3.field8206 != 0) {
            String var5 = class98.field1337 == class641.field9035 ? class83.field1138.method476((byte) -97, class250.field3068) : class83.field1136.method476((byte) -42, class250.field3068);
            var4 = var4 + class109.method613(var3.field8206, true, class376.field4748.field6981) + " (" + var5 + var3.field8206 + ")";
        }
        if (class664.field9377 && !arg1) {
            class207 var6 = class355.field4527 == -1 ? null : class705.field9939.method2477((byte) 6, class355.field4527);
            if ((class639.field8984 & 0x2) != 0 && (var6 == null || var3.method3231(var6.field2627, class355.field4527, false) != var6.field2627)) {
                class179.field2312++;
                class326.method1864(0, false, 0, -1, true, class477.field6046, -46, (long) arg0.field9676, class473.field6007 + " -> <col=ffff00>" + var4, 20, class537.field7208);
            }
        }
        if (!arg1) {
            String[] var7 = var3.field8171;
            if (class224.field2808) {
                var7 = class219.method1299(84, var7);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field8197 == 0 || !var7[var8].equalsIgnoreCase(class83.field1131.method476((byte) -69, class250.field3068)))) {
                        byte var9 = 0;
                        int var10 = class533.field7186;
                        if (var8 == 0) {
                            var9 = 23;
                        }
                        if (var8 == 1) {
                            var9 = 5;
                        }
                        if (var8 == 2) {
                            var9 = 17;
                        }
                        if (var8 == 3) {
                            var9 = 58;
                        }
                        if (var3.field8168 == var8) {
                            var10 = var3.field8195;
                        }
                        if (var8 == 4) {
                            var9 = 13;
                        }
                        if (var3.field8217 == var8) {
                            var10 = var3.field8213;
                        }
                        class326.method1864(0, false, 0, -1, true, var7[var8].equalsIgnoreCase(class83.field1131.method476((byte) 105, class250.field3068)) ? var3.field8232 : var10, -51, (long) arg0.field9676, "<col=ffff00>" + var4, var9, var7[var8]);
                        class13.field227++;
                    }
                }
            }
            if (var3.field8197 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class83.field1131.method476((byte) -116, class250.field3068))) {
                        short var12 = 0;
                        if (class376.field4748.field6981 < var3.field8206) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 23;
                        }
                        if (var11 == 1) {
                            var13 = 5;
                        }
                        if (var11 == 2) {
                            var13 = 17;
                        }
                        if (var11 == 3) {
                            var13 = 58;
                        }
                        if (var11 == 4) {
                            var13 = 13;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class326.method1864(0, false, 0, -1, true, var3.field8232, -71, (long) arg0.field9676, "<col=ffff00>" + var4, var13, var7[var11]);
                        class508.field6880++;
                    }
                }
            }
        }
        class326.method1864(0, arg1, 0, -1, true, class36.field495, 126, (long) arg0.field9676, "<col=ffff00>" + var4, 1001, class83.field1130.method476((byte) -81, class250.field3068));
        class260.field3174++;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)V")
    public static final void method966(int arg0, byte arg1) {
        class100.field1357 = arg0;
        int var2 = 96 / ((-arg1 - 37) / 58);
        field2206++;
        class450 var3 = class199.field2526;
        synchronized (class199.field2526) {
            class199.field2526.method2406(18385);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BII)V")
    public static final void method967(byte arg0, int arg1, int arg2) {
        field2207++;
        if (class98.field1337 == class641.field9035) {
            if (class413.method2202(1, 0, -2, 1, 0, false, arg1, arg2, 1)) {
                return;
            }
            class413.method2202(1, 0, -3, 1, 0, false, arg1, arg2, 1);
        } else if (class413.method2202(1, 0, -3, 1, 0, false, arg1, arg2, 1)) {
            return;
        } else {
            class413.method2202(arg0 + 68, 0, -2, 1, 0, false, arg1, arg2, 1);
        }
        if (arg0 != -67) {
            method969(83);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILkp;)Lkp;")
    public static final class507 method968(int arg0, class507 arg1) {
        field2202++;
        class507 var2 = client.method3805(arg1);
        int var3 = 10 / ((-arg0 - 51) / 56);
        if (var2 == null) {
            var2 = arg1.field6860;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method969(int arg0) {
        field2204 = null;
        if (arg0 != 19714) {
            field2204 = null;
        }
    }
}
