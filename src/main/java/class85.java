import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class85 {

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Lcd;")
    public static class64 field1575 = class44.method335((byte) 71, "overlay2");

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Lcd;")
    public static class64 field1566 = class44.method335((byte) 71, "rect_debug=");

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field1577 = 2;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "[I")
    public static int[] field1579;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "[[Lfg;")
    public static class204[][] field1567;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 8)
    public static void method648(int arg0) {
        field1575 = null;
        field1567 = (class204[][]) null;
        field1579 = null;
        field1566 = null;
        if (arg0 != -9) {
            method650(115, 104, 25, -91, 108, 40, 39, false, 42, 76, 108, 92);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIZ)Lcd;", line = 25)
    public static final class64 method649(int arg0, int arg1, boolean arg2) {
        field1565++;
        return arg1 == 10 ? class268.method1880(arg2, 10, 3, arg0) : (class64) null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIIZIIII)Z", line = 36)
    public static final boolean method650(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg3 != -12920) {
            field1579 = (int[]) null;
        }
        field1581++;
        if (class139.field2472.method325(-12808) == 2) {
            return class88.method674(4095, arg8, arg2, arg0, arg1, arg10, arg7, arg4, arg6, arg11, arg9, arg5);
        } else if (class139.field2472.method325(-12808) <= 2) {
            return class304.method2123(arg2, arg1, true, arg4, arg8, arg5, arg10, arg6, arg0, arg9, arg11, arg7);
        } else {
            return class92.method695(arg9, arg0, arg1, arg2, arg6, arg11, arg8, true, arg10, arg4, class139.field2472.method325(-12808), arg7, arg5);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIII)V", line = 57)
    public static final void method651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1578++;
        if (arg5 > -100) {
            field1579 = (int[]) null;
        }
        int var6 = arg1 - arg2;
        int var7 = arg4 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class41.method315(arg3, arg1, arg0, 220, arg2);
            }
        } else if (var6 == 0) {
            class80.method622(arg4, arg3, arg0, arg2, 0);
        } else {
            int var8 = (var6 << 12) / var7;
            int var9 = arg2 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (class290.field4976 > arg3) {
                var11 = class290.field4976;
                var10 = var9 + (class290.field4976 * var8 >> 12);
            } else if (class153.field2714 >= arg3) {
                var10 = arg2;
                var11 = arg3;
            } else {
                var10 = (class153.field2714 * var8 >> 12) + var9;
                var11 = class153.field2714;
            }
            int var12;
            int var13;
            if (arg4 < class290.field4976) {
                var13 = class290.field4976;
                var12 = (class290.field4976 * var8 >> 12) + var9;
            } else if (arg4 > class153.field2714) {
                var12 = (class153.field2714 * var8 >> 12) + var9;
                var13 = class153.field2714;
            } else {
                var13 = arg4;
                var12 = arg1;
            }
            if (var10 < class180.field3098) {
                var10 = class180.field3098;
                var11 = (class180.field3098 - var9 << 12) / var8;
            } else if (var10 > class201.field3444) {
                var11 = (class201.field3444 - var9 << 12) / var8;
                var10 = class201.field3444;
            }
            if (var12 < class180.field3098) {
                var13 = (class180.field3098 - var9 << 12) / var8;
                var12 = class180.field3098;
            } else if (var12 > class201.field3444) {
                var13 = (class201.field3444 - var9 << 12) / var8;
                var12 = class201.field3444;
            }
            class269.method1887(var10, true, var13, arg0, var11, var12);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([FI)[F", line = 161)
    public static final float[] method652(float[] arg0, int arg1) {
        field1576++;
        if (arg0 == null) {
            return null;
        } else {
            float[] var2 = new float[arg0.length];
            class95.method715(arg0, 0, var2, arg1, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZI)V", line = 178)
    public static final void method653(boolean arg0, int arg1) {
        if (!arg0) {
            return;
        }
        if (arg1 == 37) {
            class106.field1965 = 3.0F;
        } else if (arg1 == 50) {
            class106.field1965 = 4.0F;
        } else if (arg1 == 75) {
            class106.field1965 = 6.0F;
        } else {
            class106.field1965 = 8.0F;
        }
        field1571++;
        class189.field3257 = -1;
        class189.field3257 = -1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V", line = 204)
    public static final void method654(byte arg0) {
        field1570++;
        class62.field1210 = null;
        if (arg0 < -7) {
            class212.method1494();
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lcd;BI)V", line = 244)
    public static final void method655(class64 arg0, byte arg1, int arg2) {
        int var3 = 21 % ((arg1 - 7) / 61);
        class299 var4 = class158.method1135(arg2, -111, 3);
        var4.method2091(65);
        field1569++;
        var4.field5159 = arg0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIILcd;)V", line = 260)
    public static final void method656(int arg0, int arg1, int arg2, int arg3, class64 arg4) {
        field1568++;
        class60 var5 = class25.method229(arg1, (byte) 124, arg0);
        if (var5 == null) {
            return;
        }
        int var6 = 45 % ((-arg2 - 27) / 55);
        if (var5.field1122 != null) {
            class11 var7 = new class11();
            var7.field223 = arg3;
            var7.field212 = var5;
            var7.field229 = var5.field1122;
            var7.field222 = arg4;
            class218.method1562((byte) 88, var7);
        }
        boolean var8 = true;
        if (var5.field1013 > 0) {
            var8 = class26.method236((byte) 45, var5);
        }
        if (!var8 || !class92.method694(arg3 - 1, -56, client.method1762(var5))) {
            return;
        }
        if (arg3 == 1) {
            class13.field258++;
            class17.field353.method1214(-16, 174);
            class17.field353.method128((byte) -40, arg0);
            class17.field353.method145(118, arg1);
        }
        if (arg3 == 2) {
            class310.field5267++;
            class17.field353.method1214(-76, 11);
            class17.field353.method128((byte) 126, arg0);
            class17.field353.method145(79, arg1);
        }
        if (arg3 == 3) {
            class17.field353.method1214(-2, 232);
            class17.field353.method128((byte) 120, arg0);
            class310.field5270++;
            class17.field353.method145(124, arg1);
        }
        if (arg3 == 4) {
            class196.field3335++;
            class17.field353.method1214(-47, 44);
            class17.field353.method128((byte) 127, arg0);
            class17.field353.method145(91, arg1);
        }
        if (arg3 == 5) {
            class232.field3925++;
            class17.field353.method1214(-4, 218);
            class17.field353.method128((byte) 110, arg0);
            class17.field353.method145(121, arg1);
        }
        if (arg3 == 6) {
            class34.field562++;
            class17.field353.method1214(-125, 155);
            class17.field353.method128((byte) -36, arg0);
            class17.field353.method145(76, arg1);
        }
        if (arg3 == 7) {
            class17.field353.method1214(-49, 124);
            class17.field353.method128((byte) -40, arg0);
            class153.field2716++;
            class17.field353.method145(109, arg1);
        }
        if (arg3 == 8) {
            class270.field4662++;
            class17.field353.method1214(-108, 54);
            class17.field353.method128((byte) -111, arg0);
            class17.field353.method145(124, arg1);
        }
        if (arg3 == 9) {
            class17.field353.method1214(-122, 176);
            class17.field353.method128((byte) 108, arg0);
            class17.field353.method145(86, arg1);
            class97.field1773++;
        }
        if (arg3 == 10) {
            class17.field353.method1214(-69, 170);
            class113.field2081++;
            class17.field353.method128((byte) 115, arg0);
            class17.field353.method145(82, arg1);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)I", line = 390)
    public static final int method657(int arg0, int arg1, int arg2) {
        field1573++;
        if (arg2 != 176) {
            method648(86);
        }
        class115 var3 = (class115) class17.field351.method1151((long) arg0, 0);
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && var3.field2109.length > arg1) {
            return var3.field2109[arg1];
        } else {
            return -1;
        }
    }
}
