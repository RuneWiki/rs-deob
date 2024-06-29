import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class326 {

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "[I")
    public static int[] field5113 = new int[14];

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "[I")
    public static int[] field5122 = new int[100];

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "F")
    public static float field5118;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public static int field5121;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nl", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field5123;

    // $FF: synthetic method
    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2171(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2163(int arg0) {
        class296.field4710.method714(((float) class394.field5905 * 0.1F + 0.7F) * class120.field1643);
        field5117++;
        if (arg0 != 1005) {
            field5118 = -1.1644763F;
        }
        class296.field4710.method683(class101.field1406, class223.field3708, field5118, (float) class334.field5217, (float) class107.field1503, (float) class56.field707);
        class296.field4710.method694(class349.field5385);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V", line = 17)
    public static final void method2164(int arg0) {
        field5114++;
        if (class305.field4842 && arg0 == 1009) {
            class247.field4053 = null;
            class305.field4842 = false;
            class344.field5298 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V", line = 35)
    public static final void method2165(int arg0) {
        field5121++;
        if (arg0 != 2) {
            method2169(-102, -76);
        }
        class115.field1590.method335((byte) -56);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZIILne;)V", line = 49)
    public static final void method2166(boolean arg0, int arg1, int arg2, class172 arg3) {
        field5119++;
        if (class329.field5152 != null || class262.field4214 || arg3 == null || class64.method413(arg3, (byte) -96) == null) {
            return;
        }
        class329.field5152 = arg3;
        class158.field2516 = class64.method413(arg3, (byte) -113);
        class145.field2286 = arg2;
        if (!arg0) {
            field5122 = null;
        }
        class152.field2375 = arg1;
        class415.field6139 = 0;
        class265.field4262 = false;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V", line = 75)
    public static void method2167(int arg0) {
        int var1 = -51 % ((arg0 + 47) / 58);
        field5113 = null;
        field5122 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)V", line = 85)
    public static final void method2168(int arg0, int arg1, int arg2) {
        field5115++;
        if (class400.field5953 > class400.field5957) {
            class400.field5957 = (float) ((double) class400.field5957 / 30.0D + (double) class400.field5957);
            if (class400.field5957 > class400.field5953) {
                class400.field5957 = class400.field5953;
            }
            class270.method1829(arg0);
            class400.field5961 = (int) class400.field5957 >> 1;
            class400.field5956 = class374.method2388(class400.field5961, -1);
        } else if (class400.field5953 < class400.field5957) {
            class400.field5957 = (float) ((double) class400.field5957 - (double) class400.field5957 / 30.0D);
            if (class400.field5957 < class400.field5953) {
                class400.field5957 = class400.field5953;
            }
            class270.method1829(0);
            class400.field5961 = (int) class400.field5957 >> 1;
            class400.field5956 = class374.method2388(class400.field5961, -1);
        }
        if (~class80.field1002 != arg0 && class196.field3184 != -1) {
            int var3 = class80.field1002 - class375.field5656;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class196.field3184 - class144.field2270;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class375.field5656 += var3;
            if (var3 == 0 && var4 == 0) {
                class196.field3184 = -1;
                class80.field1002 = -1;
            }
            class144.field2270 += var4;
            class270.method1829(0);
        }
        if (class433.field6401 > 0) {
            class291.field4646--;
            if (class291.field4646 == 0) {
                class433.field6401--;
                class291.field4646 = 100;
            }
        } else {
            class411.field6088 = -1;
            class217.field3552 = -1;
        }
        if (!class409.field6073 || class315.field4952 == null) {
            return;
        }
        for (class106 var5 = (class106) class315.field4952.method253((byte) -6); var5 != null; var5 = (class106) class315.field4952.method247((byte) 49)) {
            class324 var6 = class288.method1944(arg0 ^ 0x24, var5.field1483.field3684);
            if (class391.field5874 == 0 && var5.method800(arg2, arg1, arg0 + Integer.MAX_VALUE)) {
                if (var6.field5063 != null) {
                    if (var6.field5063[4] != null) {
                        class413.method2587((long) var5.field1483.field3684, var6.field5063[4], var6.field5091, -1, 1006, 0, var6.field5058, -233);
                    }
                    if (var6.field5063[3] != null) {
                        class413.method2587((long) var5.field1483.field3684, var6.field5063[3], var6.field5091, -1, 1009, 0, var6.field5058, -233);
                    }
                    if (var6.field5063[2] != null) {
                        class413.method2587((long) var5.field1483.field3684, var6.field5063[2], var6.field5091, -1, 1007, 0, var6.field5058, -233);
                    }
                    if (var6.field5063[1] != null) {
                        class413.method2587((long) var5.field1483.field3684, var6.field5063[1], var6.field5091, -1, 1005, 0, var6.field5058, arg0 - 233);
                    }
                    if (var6.field5063[0] != null) {
                        class413.method2587((long) var5.field1483.field3684, var6.field5063[0], var6.field5091, -1, 1010, 0, var6.field5058, arg0 - 233);
                    }
                }
                if (!var5.field1483.field3697) {
                    var5.field1483.field3697 = true;
                    class17.method138(15, var5.field1483.field3684, var6.field5091);
                }
                if (var5.field1483.field3697) {
                    class17.method138(17, var5.field1483.field3684, var6.field5091);
                }
            } else if (var5.field1483.field3697) {
                var5.field1483.field3697 = false;
                class17.method138(16, var5.field1483.field3684, var6.field5091);
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)Z", line = 224)
    public static final boolean method2169(int arg0, int arg1) {
        if (arg0 != -1) {
            method2164(-74);
        }
        field5112++;
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLcf;)V", line = 251)
    public static final void method2170(byte arg0, class359 arg1) {
        field5120++;
        if (class423.field6252 == null || arg0 < 38) {
            return;
        }
        class149 var2 = null;
        if (arg1.field5492 == 0) {
            var2 = (class149) class139.method1016(arg1.field5488, arg1.field5490, arg1.field5498);
        }
        if (arg1.field5492 == 1) {
            var2 = (class149) class238.method1684(arg1.field5488, arg1.field5490, arg1.field5498);
        }
        if (arg1.field5492 == 2) {
            var2 = (class149) class12.method117(arg1.field5488, arg1.field5490, arg1.field5498, field5123 == null ? (field5123 = method2171("up")) : field5123);
        }
        if (arg1.field5492 == 3) {
            var2 = (class149) class316.method2107(arg1.field5488, arg1.field5490, arg1.field5498);
        }
        if (var2 == null) {
            arg1.field5494 = 0;
            arg1.field5501 = -1;
            arg1.field5489 = 0;
        } else {
            arg1.field5501 = var2.method197(true);
            arg1.field5494 = var2.method195(3076);
            arg1.field5489 = var2.method183((byte) 116);
        }
    }
}
