import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class602 {

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "B")
    public byte field8472;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "S")
    public short field8475;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public int field8477;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "S")
    public short field8481;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "S")
    public short field8484;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public int field8470;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public int field8485;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public int field8480;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "Z")
    public boolean field8478;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public int field8473;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "Lrc;")
    public static class29 field8471 = new class29();

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field8469;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field8476;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field8482;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public static int field8483;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)Z", line = 6)
    public static final boolean method3301(int arg0, byte arg1) {
        field8469++;
        for (class145 var2 = (class145) class1.field7.method237(93); var2 != null; var2 = (class145) class1.field7.method245((byte) 60)) {
            if (class605.method3316(-1, var2.field1873) && ((long) arg0) == var2.field1865) {
                return true;
            }
        }
        if (arg1 != -99) {
            field8471 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V", line = 31)
    public static void method3302(int arg0) {
        field8471 = null;
        if (arg0 > -122) {
            field8471 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 41)
    public static final void method3303(int arg0, boolean arg1, String arg2) {
        if (arg0 == 0) {
            class32.field452 = class566.method3111(class301.field3698.field6645 * 2, 0, class651.field9183, class500.field6585, class689.field9772, -19464);
            if (arg2 != null) {
                class32.field452.method1028(0);
                class595 var3 = class548.method2964((byte) 11, class301.field3700, 0, class201.field2536);
                class413 var4 = class32.field452.method989(var3, class661.method3722(class631.field8846, class201.field2536, 0), true);
                class170.method972(0);
                class112.method627(!arg1, class32.field452, true, var3, var4, arg2);
            }
        } else {
            class566 var5 = null;
            if (arg2 != null) {
                var5 = class566.method3111(0, 0, class651.field9183, class500.field6585, class689.field9772, -19464);
                var5.method1028(0);
                class595 var6 = class548.method2964((byte) 11, class301.field3700, 0, class201.field2536);
                class413 var7 = var5.method989(var6, class661.method3722(class631.field8846, class201.field2536, 0), true);
                class170.method972(0);
                class112.method627(true, var5, true, var6, var7, arg2);
            }
            try {
                class32.field452 = class566.method3111(class301.field3698.field6645 * 2, arg0, class651.field9183, class500.field6585, class689.field9772, -19464);
                if (arg2 != null) {
                    var5.method1028(0);
                    class595 var8 = class548.method2964((byte) 11, class301.field3700, 0, class201.field2536);
                    class413 var9 = var5.method989(var8, class661.method3722(class631.field8846, class201.field2536, 0), true);
                    class170.method972(0);
                    class112.method627(!arg1, var5, true, var8, var9, arg2);
                }
                if (class32.field452.method1023()) {
                    boolean var10 = true;
                    try {
                        var10 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var13) {
                    }
                    class385 var11;
                    if (var10) {
                        var11 = class32.field452.method1015(146800640);
                    } else {
                        var11 = class32.field452.method1015(104857600);
                    }
                    class32.field452.method1091(var11);
                }
            } catch (Throwable var14) {
                class32.field452 = class566.method3111(0, 0, class651.field9183, class500.field6585, class689.field9772, -19464);
                arg0 = 0;
            }
            if (var5 != null) {
                try {
                    var5.method3119(1);
                } catch (Throwable var12) {
                }
            }
        }
        field8474++;
        class651.field9191 = arg0;
        class308.method1782(-1);
        class32.field452.method1029(32);
        class678.field9511 = class32.field452.method1087();
        class195.field2455 = class32.field452.method1087();
        class227.method1359((byte) -106);
        class32.field452.method1005(!class301.field3698.field6630);
        if (class32.field452.method1049()) {
            class700.method3932(-66, class301.field3698.field6648);
        }
        class464.method2464(class32.field452, class452.field5802 >> 3, class431.field5395 >> 3, (byte) -10);
        class19.method122(29);
        class206.field2617 = arg1;
        class304.field3743 = null;
        class376.field4745 = true;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V", line = 152)
    public static final void method3304(byte arg0) {
        field8486++;
        if (class595.field8376) {
            return;
        }
        if (class301.field3698.field6607) {
            class133.field1739 = ((int) class133.field1739 + 47 & 0xFFFFFFF0);
        } else {
            class304.field3757 += (12.0F - class304.field3757) / 2.0F;
        }
        class365.field4649 = true;
        if (arg0 < -11) {
            class595.field8376 = true;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(IB)I", line = 180)
    public static final int method3305(int arg0, byte arg1) {
        if (arg1 != 75) {
            field8471 = null;
        }
        field8479++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIZIZ)V", line = 196)
    public static final void method3306(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        if (arg3) {
            field8471 = null;
        }
        field8482++;
        if ((arg5 ? class301.field3698.field6635 : class301.field3698.field6628) != 0 && arg1 != 0 && class265.field3368 < 50 && arg0 != -1) {
            class572.field7993[class265.field3368++] = new class377((byte) (arg5 ? 3 : 2), arg0, arg1, arg2, arg4, 0);
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V", line = 214)
    public static final void method3307(int arg0) {
        field8483++;
        class115.field1487 = new class40();
        if (arg0 <= 10) {
            method3301(-26, (byte) 13);
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 227)
    public class602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field8472 = (byte) arg8;
        this.field8475 = (short) arg4;
        this.field8477 = arg1;
        this.field8481 = (short) arg6;
        this.field8484 = (short) arg5;
        this.field8470 = arg2;
        this.field8485 = arg11;
        this.field8480 = arg3;
        this.field8478 = arg10;
        this.field8473 = arg0;
    }
}
