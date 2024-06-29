import java.awt.Color;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class360 {

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public int field5126 = 16777215;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public int field5129 = 8;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field5124 = 0;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "Ljava/lang/String;")
    public static String field5136 = "Loaded update list";

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field5139 = 0;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5130 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public int field5123;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field5125;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public int field5128;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public int field5132;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public int field5135;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public int field5138;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Z")
    public boolean field5134;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lec;IIZ)V")
    private final void method2305(class37 arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            return;
        }
        if (arg2 == 1) {
            this.field5129 = arg0.method320((byte) -87);
        } else if (arg2 == 2) {
            this.field5134 = true;
        } else if (arg2 == 3) {
            this.field5138 = arg0.method321((byte) 117);
            this.field5123 = arg0.method321((byte) 101);
            this.field5128 = arg0.method321((byte) 97);
        } else if (arg2 == 4) {
            this.field5132 = arg0.method271((byte) 109);
        } else if (arg2 == 5) {
            this.field5135 = arg0.method320((byte) -87);
        } else if (arg2 == 6) {
            this.field5126 = arg0.method295(true);
        }
        field5127++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lec;IB)V")
    public final void method2306(class37 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method271((byte) 101);
            if (var4 == 0) {
                if (arg2 > -5) {
                    return;
                }
                field5137++;
                return;
            }
            this.method2305(arg0, arg1, var4, true);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lmb;IZ)V")
    public static final void method2307(class258 arg0, int arg1, boolean arg2) {
        field5122++;
        int var3 = ~arg0.field3805 == arg1 ? arg0.field3764 : arg0.field3805;
        int var4 = arg0.field3882 == 0 ? arg0.field3758 : arg0.field3882;
        class152.method1170(var3, (byte) 40, var4, arg0.field3854, arg2, class45.field710[arg0.field3854 >> 16]);
        if (arg0.field3869 != null) {
            class152.method1170(var3, (byte) 101, var4, arg0.field3854, arg2, arg0.field3869);
        }
        class120 var5 = (class120) class355.field5045.method1219((long) arg0.field3854, -102);
        if (var5 != null) {
            class288.method2028(-1, var5.field1874, arg2, var3, var4);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static void method2308(byte arg0) {
        if (arg0 == -59) {
            field5130 = null;
            field5136 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BII)I")
    public static final int method2309(byte arg0, int arg1, int arg2) {
        field5133++;
        class188 var3 = (class188) class319.field4606.method1219((long) arg2, -93);
        if (var3 == null) {
            return -1;
        } else {
            if (arg0 != 103) {
                field5124 = 124;
            }
            return arg1 >= 0 && var3.field2781.length > arg1 ? var3.field2781[arg1] : -1;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BI[BI)I")
    public static final int method2310(byte arg0, int arg1, byte[] arg2, int arg3) {
        field5131++;
        int var4 = -1;
        int var5 = arg3;
        if (arg0 < 122) {
            field5136 = null;
        }
        while (var5 < arg1) {
            var4 = var4 >>> 8 ^ class230.field3355[(var4 ^ arg2[var5]) & 0xFF];
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILjava/lang/Object;Lvj;)V")
    public static final void method2311(int arg0, Object arg1, class177 arg2) {
        field5125++;
        if (arg2.field2638 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field2638.peekEvent() != null; var3++) {
            class134.method1106(1L, 10);
        }
        if (arg0 != 611902952) {
            method2307((class258) null, -87, true);
        }
        if (arg1 != null) {
            arg2.field2638.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)Z")
    public static final boolean method2312(boolean arg0) {
        for (int var1 = class406.field5909; var1 < class13.field218; var1++) {
            class168[][] var2 = class443.field6447[var1];
            for (int var3 = -class46.field755; var3 <= 0; var3++) {
                int var4 = class415.field6013 + var3;
                int var5 = class415.field6013 - var3;
                if (var4 >= class175.field2608 || var5 < class34.field491) {
                    for (int var6 = -class46.field755; var6 <= 0; var6++) {
                        int var7 = class71.field1203 + var6;
                        int var8 = class71.field1203 - var6;
                        if (var4 >= class175.field2608) {
                            if (var7 >= class373.field5306) {
                                class168 var9 = var2[var4][var7];
                                if (var9 != null && var9.field2511) {
                                    class182.field2689 = arg0;
                                    class432.field6229.method463(var9, (byte) -4);
                                    class432.field6229.method466(-103);
                                }
                            }
                            if (var8 < class187.field2778) {
                                class168 var10 = var2[var4][var8];
                                if (var10 != null && var10.field2511) {
                                    class182.field2689 = arg0;
                                    class432.field6229.method463(var10, (byte) -4);
                                    class432.field6229.method466(124);
                                }
                            }
                        }
                        if (var5 < class34.field491) {
                            if (var7 >= class373.field5306) {
                                class168 var11 = var2[var5][var7];
                                if (var11 != null && var11.field2511) {
                                    class182.field2689 = arg0;
                                    class432.field6229.method463(var11, (byte) -4);
                                    class432.field6229.method466(-51);
                                }
                            }
                            if (var8 < class187.field2778) {
                                class168 var12 = var2[var5][var8];
                                if (var12 != null && var12.field2511) {
                                    class182.field2689 = arg0;
                                    class432.field6229.method463(var12, (byte) -4);
                                    class432.field6229.method466(112);
                                }
                            }
                        }
                        if (class324.field4689 == 0) {
                            if (class236.field3404) {
                                class432.field6229.method464(3797, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
