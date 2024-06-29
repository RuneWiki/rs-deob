import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class192 {

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lhj;")
    public static class69 field3466 = class181.method1318("scrollen:", (byte) -118);

    @OriginalMember(owner = "client!si", name = "t", descriptor = "[Lab;")
    public static class142[] field3483 = new class142[27];

    @OriginalMember(owner = "client!si", name = "w", descriptor = "Lhj;")
    private static class69 field3486 = class181.method1318("http:)4)4advert)3runescape)3com)4banner)3ws?size=729", (byte) -124);

    @OriginalMember(owner = "client!si", name = "j", descriptor = "Lhj;")
    public static class69 field3473 = field3486;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "Lhj;")
    public static class69 field3492 = class181.method1318("Konfig geladen)3", (byte) -117);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public int field3464;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public int field3468;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public int field3469;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "I")
    public int field3470;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public int field3471;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public int field3472;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    public int field3475;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "I")
    public int field3476;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public int field3477;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    public int field3478;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public int field3481;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public int field3482;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    public int field3484;

    @OriginalMember(owner = "client!si", name = "v", descriptor = "I")
    public int field3485;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    public int field3488;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "I")
    public int field3489;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "I")
    public int field3490;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    public int field3493;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1387(int arg0, byte[] arg1) {
        field3487++;
        class128 var2 = new class128(arg1);
        int var3 = var2.method937(false);
        int var4 = var2.method923(true);
        if (var4 < 0 || !(class255.field4586 == 0 || var4 <= class255.field4586)) {
            throw new RuntimeException();
        } else if (~var3 == arg0) {
            byte[] var5 = new byte[var4];
            var2.method960(var4, var5, arg0 ^ 0x1AC48007, 0);
            return var5;
        } else {
            int var6 = var2.method923(true);
            if (var6 < 0 || class255.field4586 != 0 && class255.field4586 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class25.method138(var7, var6, arg1, var4, 9);
            } else {
                class112.field2147.method1187(var2, var7, 4);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lfh;I)Lne;")
    public static final class49 method1388(class128 arg0, int arg1) {
        field3465++;
        class49 var2 = new class49(arg0.method963(false), arg0.method963(false), arg0.method912(-111), arg0.method912(81), arg0.method923(true), arg0.method937(false) == 1);
        int var3 = arg0.method937(false);
        if (arg1 > -75) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field716.method1727(-125, new class208(arg0.method912(93), arg0.method912(-119), arg0.method912(-85), arg0.method912(124)));
        }
        var2.method277(97);
        return var2;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIZIIILnc;)V")
    public static final void method1389(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class83 arg6) {
        class253.field4577 = arg4;
        class33.field453 = arg2;
        class27.field383 = arg1;
        class194.field3534 = 1;
        if (arg3 <= -102) {
            class38.field534 = arg0;
            class98.field1863 = arg6;
            field3474++;
            class9.field71 = arg5;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V")
    public static void method1390(byte arg0) {
        field3486 = null;
        field3466 = null;
        field3492 = null;
        field3483 = null;
        field3473 = null;
        if (arg0 != 57) {
            method1394(-52);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lhd;")
    public static final class11 method1391(Throwable arg0, String arg1) {
        field3491++;
        class11 var2;
        if ((arg0 instanceof class11)) {
            var2 = (class11) arg0;
            var2.field98 = var2.field98 + ' ' + arg1;
        } else {
            var2 = new class11(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BII)I")
    public static final int method1392(byte arg0, int arg1, int arg2) {
        field3467++;
        class65 var3 = (class65) class4.field25.method769(true, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            if (arg0 != 74) {
                field3466 = null;
            }
            for (int var5 = 0; var5 < var3.field1257.length; var5++) {
                if (var3.field1261[var5] == arg1) {
                    var4 += var3.field1257[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Luh;B)V")
    public static final void method1393(class98 arg0, byte arg1) {
        int var2 = 64 / ((40 - arg1) / 57);
        class13.method72((byte) 97);
        field3480++;
        if (class34.field473 != null) {
            return;
        }
        if (!class213.field3869) {
            class239.method1693((byte) 14);
        } else if (class8.field53 == 1) {
            int var3 = class114.field2180 / 5;
            int var4 = class9.field68 + var3 + 140;
            if (var4 <= class56.field1020 && (var4 + 14) >= class56.field1020 && (class132.field2449 + 4) <= class207.field3776 && (class132.field2449 + 18) >= class207.field3776) {
                class70.method500(0, 0, 0);
                return;
            }
            if ((var4 + 15) <= class56.field1020 && class56.field1020 <= (var4 + 80) && class207.field3776 >= class132.field2449 + 4 && class207.field3776 <= (class132.field2449 + 18)) {
                class70.method500(1, 0, 0);
                return;
            }
            int var5 = class9.field68 - (-var3 - 250);
            if (var5 <= class56.field1020 && class56.field1020 <= (var5 + 14) && (class132.field2449 + 4) <= class207.field3776 && class132.field2449 + 18 >= class207.field3776) {
                class70.method500(0, 1, 0);
                return;
            }
            if (class56.field1020 >= (var5 + 15) && var5 + 80 >= class56.field1020 && class132.field2449 + 4 <= class207.field3776 && (class132.field2449 + 18) >= class207.field3776) {
                class70.method500(1, 1, 0);
                return;
            }
            int var6 = var3 + class9.field68 + 360;
            if (var6 <= class56.field1020 && class56.field1020 <= var6 + 14 && class132.field2449 + 4 <= class207.field3776 && (class132.field2449 + 18) >= class207.field3776) {
                class70.method500(0, 2, 0);
                return;
            }
            if ((var6 + 15) <= class56.field1020 && class56.field1020 <= var6 + 80 && class207.field3776 >= class132.field2449 + 4 && class207.field3776 <= class132.field2449 + 18) {
                class70.method500(1, 2, 0);
                return;
            }
            int var7 = class9.field68 + var3 + 470;
            if (var7 <= class56.field1020 && var7 + 14 >= class56.field1020 && (class132.field2449 + 4) <= class207.field3776 && (class132.field2449 + 18) >= class207.field3776) {
                class70.method500(0, 3, 0);
                return;
            }
            if (class56.field1020 >= var7 + 15 && class56.field1020 <= var7 + 80 && class207.field3776 >= class132.field2449 + 4 && (class132.field2449 + 18) >= class207.field3776) {
                class70.method500(1, 3, 0);
                return;
            }
            if (class104.field1947 != -1) {
                class152 var8 = class3.field8[class104.field1947];
                if (class63.field1223 == var8.field2838) {
                    byte[] var9 = class9.method42(-94, new class69[] { var8.field2836, class263.field4703 }).method469(126);
                    class36.field507 = new String(var9, 0, var9.length);
                    class204.field3666 = var8.field2832;
                    if (class240.field4402 != 0) {
                        class202.field3645 = class204.field3666 + 50000;
                        class66.field1281 = class204.field3666 + 40000;
                        class167.field3085 = class66.field1281;
                    }
                    if (class82.field1568 != null) {
                        class82.field1568.field746 = true;
                        class204.method1478(class82.field1568, false);
                    }
                    return;
                }
                class69 var10 = class19.field247;
                if (class240.field4402 != 0) {
                    var10 = class9.method42(-104, new class69[] { class54.field958, class98.method727(-229, var8.field2832 + 7000) });
                }
                class69 var11 = class9.method42(-113, new class69[] { class52.field923, var8.field2836, class263.field4703, var10, class171.field3137, class98.method727(-229, class165.field3051), class126.field2311, class98.method727(-229, class114.field2181), class191.field3454, class98.method727(-229, 0), class8.field54, class98.method727(-229, class165.field3035), class235.field4272, class98.method727(-229, class200.field3615) });
                try {
                    arg0.getAppletContext().showDocument(var11.method477((byte) -93), "_self");
                    return;
                } catch (Exception var12) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
    public static final void method1394(int arg0) {
        field3479++;
        class4.field25 = new class103(arg0);
    }
}
