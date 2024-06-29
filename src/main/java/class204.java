import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class204 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field2833 = 0;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2836 = "Loaded title screen";

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2834 = "K";

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field2843 = 127;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public int field2832;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    private int field2839;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public int field2842;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Lwf;")
    public static class333 field2845;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1482(int arg0, int arg1) {
        class42 var2 = class166.method1242(1, arg1, -1249071392);
        var2.method306((byte) -104);
        field2840++;
        if (arg0 != -9626) {
            field2834 = (String) null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 20)
    public static void method1483(int arg0) {
        field2834 = null;
        field2845 = null;
        if (arg0 != -23239) {
            field2843 = 9;
        }
        field2836 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILfd;)V", line = 37)
    public final void method1484(int arg0, int arg1, class299 arg2) {
        while (true) {
            int var4 = arg2.method2096((byte) -122);
            if (var4 == 0) {
                if (arg0 != -24927) {
                    return;
                }
                field2841++;
                return;
            }
            this.method1485((byte) -94, arg2, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLfd;II)V", line = 56)
    private final void method1485(byte arg0, class299 arg1, int arg2, int arg3) {
        int var5 = -70 / ((arg0 + 41) / 49);
        field2844++;
        if (arg2 == 1) {
            this.field2839 = arg1.method2083((byte) -28);
        } else if (arg2 == 2) {
            this.field2842 = arg1.method2096((byte) -122);
            this.field2832 = arg1.method2096((byte) -122);
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V", line = 83)
    public static final void method1486(int arg0) {
        field2835++;
        if (class348.field5455 != null || class33.field410 != null || class249.field3614 > 0) {
            return;
        }
        int var1 = class215.field3039;
        if (arg0 != 13) {
            method1482(100, 27);
        }
        if (!class159.field2263) {
            if (var1 == 1 && class66.field853 > 0) {
                short var2 = class156.field2169[class66.field853 - 1];
                if (var2 == 30 || var2 == 20 || var2 == 13 || var2 == 2 || var2 == 49 || var2 == 58 || var2 == 35 || var2 == 17 || var2 == 10 || var2 == 51 || var2 == 9 || var2 == 1001) {
                    int var3 = class156.field2159[class66.field853 - 1];
                    int var4 = class95.field1243[class66.field853 - 1];
                    class333 var5 = class89.method644(34, var3);
                    class142 var6 = client.method891(var5);
                    if (var6.method1096(-9617) || var6.method1106(-104)) {
                        class227.field3260 = 0;
                        class209.field2963 = false;
                        if (class348.field5455 != null) {
                            class142.method1097(-124, class348.field5455);
                        }
                        class348.field5455 = class89.method644(arg0 - 125, var3);
                        class154.field2141 = class140.field1950;
                        class273.field3910 = var4;
                        class78.field1005 = class305.field4465;
                        class142.method1097(67, class348.field5455);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class233.field3342 == 1 && class66.field853 > 2 || class226.method1633(0, class66.field853 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class66.field853 > 0 || class179.field2446 == 1) {
                class191.method1389((byte) 103);
            }
            if (var1 == 1 && class66.field853 > 0 || class179.field2446 == 2) {
                class80.method564((byte) 72);
            }
            return;
        }
        if (var1 != 1) {
            int var7 = class105.field1361;
            int var8 = class80.field1028;
            if (var7 < (class209.field2967 - 10) || var7 > (class146.field2038 + class209.field2967 + 10) || var8 < class65.field815 - 10 || (class65.field815 + class117.field1534 + 10) < var8) {
                class159.field2263 = false;
                class90.method648(class146.field2038, 0, class117.field1534, class209.field2967, class65.field815);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var9 = class209.field2967;
        int var10 = class65.field815;
        int var11 = class140.field1950;
        int var12 = class305.field4465;
        int var13 = class146.field2038;
        int var14 = -1;
        for (int var15 = 0; var15 < class66.field853; var15++) {
            if (class66.field846) {
                int var17 = (class66.field853 - var15 - 1) * 15 + var10 + 33;
                if (var9 < var11 && (var9 + var13) > var11 && (var17 - 13) < var12 && (var17 + 3) > var12) {
                    var14 = var15;
                }
            } else {
                int var16 = (class66.field853 - var15 - 1) * 15 + (var10 + 31);
                if (var9 < var11 && (var9 + var13) > var11 && (var16 - 13) < var12 && var16 + 3 > var12) {
                    var14 = var15;
                }
            }
        }
        if (var14 != -1) {
            class286.method1948((byte) 96, var14);
        }
        class159.field2263 = false;
        class90.method648(class146.field2038, arg0 - 13, class117.field1534, class209.field2967, class65.field815);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)Lvn;", line = 242)
    public final class11 method1487(byte arg0) {
        if (arg0 > -35) {
            return (class11) null;
        }
        field2837++;
        class11 var2 = (class11) class30.field344.method2265((long) this.field2839, (byte) 95);
        if (var2 != null) {
            return var2;
        }
        class11 var3 = class116.method852(class112.field1455, this.field2839, true, 0);
        if (var3 != null) {
            class30.field344.method2257(-126, var3, (long) this.field2839);
        }
        return var3;
    }
}
