import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class36 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lbe;")
    private static class283 field527 = class153.method941(125, ")1p");

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "[[I")
    public static int[][] field528 = new int[104][104];

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Lbe;")
    public static class283 field531 = class153.method941(21, "Untersuchen");

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field536 = 0;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public int field529;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "[[[I")
    public static int[][][] field530;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)I", line = 21)
    public static final int method230(int arg0, int arg1, int arg2) {
        field534++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            if (arg2 != 126) {
                method232((class174) null, (byte) 5);
            }
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V", line = 63)
    public static void method231(boolean arg0) {
        if (!arg0) {
            field536 = 43;
        }
        field531 = null;
        field528 = (int[][]) null;
        field530 = (int[][][]) null;
        field527 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lnm;B)V", line = 82)
    public static final void method232(class174 arg0, byte arg1) {
        field526++;
        class150.method924(32767);
        if (class58.field796 != null) {
            return;
        }
        if (arg1 != -101) {
            field533 = 44;
        }
        if (!class132.field2226) {
            class177.method1169(126);
        } else if (class61.field859 == 1) {
            int var2 = class104.field1769 / 5;
            int var3 = class306.field5241 + var2 + 140;
            if (class47.field647 >= var3 && var3 + 14 >= class47.field647 && (class148.field2424 + 4) <= class269.field4537 && (class148.field2424 + 18) >= class269.field4537) {
                class18.method107(0, 0, (byte) -53);
                return;
            }
            if ((var3 + 15) <= class47.field647 && class47.field647 <= (var3 + 80) && (class148.field2424 + 4) <= class269.field4537 && (class148.field2424 + 18) >= class269.field4537) {
                class18.method107(1, 0, (byte) -60);
                return;
            }
            int var4 = class306.field5241 + var2 + 250;
            if (class47.field647 >= var4 && class47.field647 <= var4 + 14 && (class148.field2424 + 4) <= class269.field4537 && class269.field4537 <= class148.field2424 + 18) {
                class18.method107(0, 1, (byte) -77);
                return;
            }
            if ((var4 + 15) <= class47.field647 && class47.field647 <= (var4 + 80) && class269.field4537 >= class148.field2424 + 4 && class269.field4537 <= class148.field2424 + 18) {
                class18.method107(1, 1, (byte) -62);
                return;
            }
            int var5 = class306.field5241 + var2 + 360;
            if (var5 <= class47.field647 && var5 + 14 >= class47.field647 && class269.field4537 >= (class148.field2424 + 4) && class269.field4537 <= class148.field2424 + 18) {
                class18.method107(0, 2, (byte) -67);
                return;
            }
            if (class47.field647 >= var5 + 15 && var5 + 80 >= class47.field647 && class269.field4537 >= class148.field2424 + 4 && class269.field4537 <= class148.field2424 + 18) {
                class18.method107(1, 2, (byte) -125);
                return;
            }
            int var6 = class306.field5241 + var2 + 470;
            if (class47.field647 >= var6 && class47.field647 <= (var6 + 14) && class269.field4537 >= (class148.field2424 + 4) && (class148.field2424 + 18) >= class269.field4537) {
                class18.method107(0, 3, (byte) -66);
                return;
            }
            if ((var6 + 15) <= class47.field647 && var6 + 80 >= class47.field647 && class269.field4537 >= (class148.field2424 + 4) && class269.field4537 <= (class148.field2424 + 18)) {
                class18.method107(1, 3, (byte) -68);
                return;
            }
            if (client.field4012 != -1) {
                class65 var7 = class122.field2041[client.field4012];
                if (var7.field910 == class110.field1860) {
                    byte[] var8 = class299.method2022(new class283[] { var7.field899, class243.field4099 }, (byte) 67).method1933((byte) 121);
                    class62.field866 = new String(var8, 0, var8.length);
                    class160.field2639 = var7.field903;
                    if (class256.field4325 != 0) {
                        class54.field721 = class160.field2639 + 50000;
                        class13.field138 = class160.field2639 + 40000;
                        class53.field714 = class13.field138;
                    }
                    if (class203.field3467 != null) {
                        class203.field3467.field1127 = true;
                        class272.method1834(class203.field3467, 0);
                    }
                    return;
                }
                class283 var9 = class239.field4040;
                if (class256.field4325 != 0) {
                    var9 = class299.method2022(new class283[] { class123.field2051, class296.method2012(var7.field903 + 7000, (byte) -124) }, (byte) 53);
                }
                class283 var10 = class299.method2022(new class283[] { class151.field2466, var7.field899, class243.field4099, var9, class241.field4066, class296.method2012(class30.field468, (byte) -50), class170.field2868, class296.method2012(class303.field5117, (byte) -4), class164.field2710, class296.method2012(1, (byte) -86), field527, class296.method2012(class19.field230, (byte) -109), class203.field3471, class296.method2012(class33.field497, (byte) 116) }, (byte) 69);
                try {
                    arg0.getAppletContext().showDocument(var10.method1911(-27527), "_self");
                } catch (Exception var12) {
                }
            }
        }
    }
}
