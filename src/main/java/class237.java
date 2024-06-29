import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class237 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    private int field3101 = 0;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lwr;")
    private class459 field3106;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field3105 = 0;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Lni;")
    public static class522 field3108;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Lgda;")
    private class55 field3109;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[[[S")
    public static short[][][] field3103;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1428(byte arg0) {
        field3107++;
        class391.method2273((byte) 8, class11.field68.field5508.method2663((byte) 120));
        int var1 = (class99.field1313 >> 3) + (class294.field3956 >> 12);
        int var2 = (class684.field9518 >> 12) + (class133.field1704 >> 3);
        class61.field677 = class653.field9086.field2175 = 0;
        class653.field9086.method612(8, 8, 1470);
        byte var3 = 18;
        class125.field1628 = new byte[var3][];
        class72.field779 = new byte[var3][];
        client.field4115 = new byte[var3][];
        class252.field3241 = new int[var3][4];
        class519.field6991 = new int[var3];
        class83.field1140 = new byte[var3][];
        class585.field8195 = new int[var3];
        class354.field4722 = new int[var3];
        class459.field6350 = new byte[var3][];
        class459.field6343 = new int[var3];
        class584.field8182 = new int[var3];
        class735.field10249 = new int[var3];
        if (arg0 <= 64) {
            method1433(true);
        }
        int var4 = 0;
        for (int var5 = (var1 - (class272.field3589 >> 4)) / 8; var5 <= ((class272.field3589 >> 4) + var1) / 8; var5++) {
            for (int var8 = (var2 - (class3.field26 >> 4)) / 8; var8 <= ((class3.field26 >> 4) + var2) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class519.field6991[var4] = var9;
                class354.field4722[var4] = class591.field8248.method2890((byte) -90, "m" + var5 + "_" + var8);
                class585.field8195[var4] = class591.field8248.method2890((byte) -69, "l" + var5 + "_" + var8);
                class584.field8182[var4] = class591.field8248.method2890((byte) -100, "n" + var5 + "_" + var8);
                class735.field10249[var4] = class591.field8248.method2890((byte) -109, "um" + var5 + "_" + var8);
                class459.field6343[var4] = class591.field8248.method2890((byte) -124, "ul" + var5 + "_" + var8);
                if (class584.field8182[var4] == -1) {
                    class354.field4722[var4] = -1;
                    class585.field8195[var4] = -1;
                    class735.field10249[var4] = -1;
                    class459.field6343[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class584.field8182.length; var6++) {
            class584.field8182[var6] = -1;
            class354.field4722[var6] = -1;
            class585.field8195[var6] = -1;
            class735.field10249[var6] = -1;
            class459.field6343[var6] = -1;
        }
        byte var7;
        if (class713.field9949 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class745.method4160(-6547, var2, false, var1, var7);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)V", line = 90)
    public static final void method1429(int arg0, boolean arg1) {
        field3104++;
        if (class713.field9949 == arg0) {
            return;
        }
        if (arg0 == 13) {
            if (class692.field9682 == null) {
                class745.method4161(class463.field6399, -17877, class551.field7807, class381.field5302);
            } else {
                class374.method2198(class381.field5302, -6182);
            }
        }
        if (arg0 != 13 && class347.field4621 != null) {
            class347.field4621.method1439(-61);
            class347.field4621 = null;
        }
        if (arg0 == 3) {
            class476.method2676(class697.field9808 != class116.field1543, 0);
        }
        if (arg0 == 7) {
            class123.method789(class37.field387 != class116.field1543, -1);
        }
        if (arg0 == 5) {
            if (class692.field9682 == null) {
                class662.method3745(class463.field6399, class551.field7807, (byte) -68);
            } else {
                class188.method1057((byte) 55);
            }
        } else if (arg0 == 6) {
            if (class692.field9682 == null) {
                class745.method4161(class463.field6399, -17877, class551.field7807, class381.field5302);
            } else {
                class374.method2198(class381.field5302, -6182);
            }
        } else if (arg0 == 9) {
            if (class692.field9682 == null) {
                class745.method4161(class463.field6399, -17877, class551.field7807, class381.field5302);
            } else {
                class374.method2198(class381.field5302, -6182);
            }
        } else if (arg0 == 12) {
            if (class692.field9682 == null) {
                class662.method3745(class463.field6399, class551.field7807, (byte) -68);
            } else {
                class188.method1057((byte) 55);
            }
        }
        if (class301.method1811(class713.field9949, 8)) {
            client.field4109.field7039 = 2;
            class507.field6868.field7039 = 2;
            class181.field2219.field7039 = 2;
            class591.field8251.field7039 = 2;
            class645.field8984.field7039 = 2;
            class176.field2174.field7039 = 2;
            class244.field3168.field7039 = 2;
        }
        if (class301.method1811(arg0, 8)) {
            class268.field3550 = 1;
            class527.field7071 = 1;
            class707.field9898 = 0;
            class358.field4754 = 0;
            class579.field8117 = 0;
            class104.method712(true, 122);
            client.field4109.field7039 = 1;
            class507.field6868.field7039 = 1;
            class181.field2219.field7039 = 1;
            class591.field8251.field7039 = 1;
            class645.field8984.field7039 = 1;
            class176.field2174.field7039 = 1;
            class244.field3168.field7039 = 1;
        }
        if (arg0 == 11 || arg0 == 3) {
            class51.method302((byte) 99);
        }
        boolean var2 = arg0 == 2 || class695.method3923(2048, arg0) || class719.method4041(-6410, arg0);
        boolean var3 = class713.field9949 == 2 || class695.method3923(2048, class713.field9949) || class719.method4041(-6410, class713.field9949);
        if (var2 != var3) {
            if (var2) {
                class555.field7831 = class413.field5841;
                if (class11.field68.field5544.method750((byte) 125) == 0) {
                    class123.method790(103, 2);
                } else {
                    class474.method2669(false, false, class11.field68.field5544.method750((byte) 124), class727.field10149, 0, 2, class413.field5841);
                    class444.method2492((byte) 111);
                }
                class759.field10590.method1377(2, false);
            } else {
                class123.method790(100, 2);
                class759.field10590.method1377(2, true);
            }
        }
        if (class301.method1811(arg0, 8) || arg0 == 13) {
            class21.field142.method448();
        }
        if (!arg1) {
            class713.field9949 = arg0;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lgda;", line = 244)
    public final class55 method1430(int arg0) {
        field3102++;
        if (arg0 != 2) {
            this.field3106 = null;
        }
        if (this.field3101 > 0 && this.field3106.field6346[this.field3101 - 1] != this.field3109) {
            class55 var2 = this.field3109;
            this.field3109 = var2.field564;
            return var2;
        }
        while (this.field3101 < this.field3106.field6345) {
            class55 var3 = this.field3106.field6346[this.field3101++].field564;
            if (this.field3106.field6346[this.field3101 - 1] != var3) {
                this.field3109 = var3.field564;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 300)
    public class237() {
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lwr;)V", line = 311)
    public class237(class459 arg0) {
        this.field3106 = arg0;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V", line = 287)
    public static final void method1431(byte arg0) {
        if (arg0 != -51) {
            method1428((byte) 114);
        }
        class166.method972(false);
        field3110++;
        class247.field3206 = false;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Lgda;", line = 303)
    public final class55 method1432(int arg0) {
        this.field3101 = arg0;
        field3100++;
        return this.method1430(2);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V", line = 322)
    public static void method1433(boolean arg0) {
        if (arg0) {
            method1428((byte) -49);
        }
        field3108 = null;
        field3103 = null;
    }
}
