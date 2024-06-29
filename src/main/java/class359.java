import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class359 implements class278 {

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field5304 = 0;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public int field5299;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public int field5305;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public int field5306;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public int field5307;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public int field5310;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public int field5311;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "Z")
    public boolean field5303;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILza;)V", line = 3)
    public static final void method2285(int arg0, class299 arg1) {
        field5301++;
        if (!(class540.field7909 >= arg0 || class2.field17) || class374.field5527 != null) {
            return;
        }
        String var2;
        if (class2.field17 && class540.field7909 < 2) {
            var2 = class218.field3297 + class235.field3541.method1265(class345.field5141, arg0 ^ 0xFFFFFFC0) + class447.field6638 + " ->";
        } else if (class76.field1289 && class259.field4151.method30(-7951, 81) && class540.field7909 > 2) {
            var2 = class354.method2259((byte) -123, (class376) class154.field2370.field690.field1936.field1936);
        } else {
            class376 var3 = (class376) class154.field2370.field690.field1936;
            var2 = class354.method2259((byte) -126, var3);
            int[] var4 = null;
            if (class349.method2246((byte) 124, var3.field5546)) {
                var4 = class300.field4608.method2088((int) var3.field5553, arg0 + 102).field3331;
            } else if (var3.field5552 != -1) {
                var4 = class300.field4608.method2088(var3.field5552, 112).field3331;
            } else if (class33.method197(var3.field5546, 96)) {
                class5 var5 = (class5) class366.field5398.method358((byte) 65, (long) ((int) var3.field5553));
                if (var5 != null) {
                    class46 var6 = var5.field65;
                    class171 var7 = var6.field718;
                    if (var7.field2611 != null) {
                        var7 = var7.method1221(class288.field4476, 0);
                    }
                    if (var7 != null) {
                        var4 = var7.field2623;
                    }
                }
            } else if (class299.method1993(true, var3.field5546)) {
                Object var8 = null;
                class395 var9;
                if (var3.field5546 == 1003) {
                    var9 = class247.field3693.method2281((int) var3.field5553, arg0 - 9382);
                } else {
                    var9 = class247.field3693.method2281((int) (var3.field5553 >>> 32 & 0x7FFFFFFFL), arg0 ^ 0xFFFFDB5E);
                }
                if (var9.field5825 != null) {
                    var9 = var9.method2485(class288.field4476, 120);
                }
                if (var9 != null) {
                    var4 = var9.field5768;
                }
            }
            if (var4 != null) {
                var2 = var2 + class477.method2879(var4, (byte) -67);
            }
        }
        if (class540.field7909 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class540.field7909 - 2) + class78.field1299.method1265(class345.field5141, -82);
        }
        if (class536.field7862 != null) {
            class310 var11 = class536.field7862.method264(-28092, arg1);
            if (var11 == null) {
                var11 = class441.field6573;
            }
            var11.method2056(class386.field5685, class536.field7862.field591, var2, class276.field4338, false, class536.field7862.field615, class536.field7862.field613, class536.field7862.field493, class488.field7133, class397.field5855, class536.field7862.field629, class536.field7862.field496, class406.field5998, class280.field4361, class344.field5137);
            class252.method1795(class344.field5137[3], class344.field5137[0], class344.field5137[1], class344.field5137[2], false);
        } else if (class355.field5260 != null && class81.field1327 == class401.field5923) {
            int var10 = class441.field6573.method2057(false, 16777215, class397.field5855, var2, class488.field7133, class280.field4361, 0, class100.field1537 + 16, class406.field5998, class30.field336 + 4);
            class252.method1795(16, class30.field336 + 4, class100.field1537, var10 + class447.field6643.method174(var2, (byte) -71), false);
            return;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZLbg;)Z", line = 103)
    public final boolean method1888(boolean arg0, class278 arg1) {
        field5308++;
        if (!(arg1 instanceof class359)) {
            return false;
        }
        class359 var3 = (class359) arg1;
        if (this.field5310 != var3.field5310) {
            return false;
        } else if (this.field5307 != var3.field5307) {
            return false;
        } else if (this.field5306 != var3.field5306) {
            return false;
        } else if (this.field5299 != var3.field5299) {
            return false;
        } else if (this.field5305 != var3.field5305) {
            return false;
        } else if (this.field5311 != var3.field5311) {
            return false;
        } else if (this.field5303 == var3.field5303) {
            return arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lza;B)V", line = 159)
    public static final void method2286(class299 arg0, byte arg1) {
        field5309++;
        int var2 = class404.field5975;
        int var3 = class354.field5246;
        int var4 = class304.field4657;
        int var5 = class162.field2451;
        if (arg1 <= 80) {
            return;
        }
        int var6 = -10660793;
        arg0.method1991(var3, var6, var4, var5, 21, var2);
        arg0.method1991(var3 + 1, -16777216, var4 - 2, 16, 80, var2 + 1);
        arg0.method1992(var2 + 1, (byte) -111, var3 + 18, var4 + -2, var5 - 19, -16777216);
        class441.field6573.method2052(-1, class23.field267.method1265(class345.field5141, -86), var6, true, var2 + 3, var3 + 14);
        int var7 = class377.field5570.method1475((byte) 28);
        int var8 = class377.field5570.method1484(-22647);
        int var9 = 0;
        for (class376 var10 = (class376) class154.field2370.method295((byte) 118); var10 != null; var10 = (class376) class154.field2370.method296(true)) {
            int var11 = (class540.field7909 - (var9 + 1)) * 16 + var3 + 31;
            short var12 = -1;
            if (var7 > var2 && var7 < var2 + var4 && (var11 - 13) < var8 && var8 < (var11 + 3) && var10.field5541) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class349.method2246((byte) -108, var10.field5546)) {
                var13 = class300.field4608.method2088((int) var10.field5553, 114).field3331;
            } else if (var10.field5552 != -1) {
                var13 = class300.field4608.method2088(var10.field5552, 121).field3331;
            } else if (class33.method197(var10.field5546, 39)) {
                class5 var16 = (class5) class366.field5398.method358((byte) -124, (long) ((int) var10.field5553));
                if (var16 != null) {
                    class46 var17 = var16.field65;
                    class171 var18 = var17.field718;
                    if (var18.field2611 != null) {
                        var18 = var18.method1221(class288.field4476, 0);
                    }
                    if (var18 != null) {
                        var13 = var18.field2623;
                    }
                }
            } else if (class299.method1993(true, var10.field5546)) {
                Object var14 = null;
                class395 var15;
                if (var10.field5546 == 1003) {
                    var15 = class247.field3693.method2281((int) var10.field5553, -9380);
                } else {
                    var15 = class247.field3693.method2281((int) (var10.field5553 >>> 32 & 0x7FFFFFFFL), -9380);
                }
                if (var15.field5825 != null) {
                    var15 = var15.method2485(class288.field4476, -1);
                }
                if (var15 != null) {
                    var13 = var15.field5768;
                }
            }
            String var19 = class354.method2259((byte) -122, var10);
            if (var13 != null) {
                var19 = var19 + class477.method2879(var13, (byte) -67);
            }
            class441.field6573.method2048(var11, class280.field4361, var12, class397.field5855, var2 + 3, 0, var19, 7701);
            var9++;
            if (var10.field5548) {
                class540.field7910.method2316(var2 + class447.field6643.method174(var19, (byte) -61) + 5, var11 + -12);
            }
        }
        class404.method2539(class304.field4657, class404.field5975, (byte) -69, class162.field2451, class354.field5246);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BII)I", line = 269)
    public static final int method2287(byte arg0, int arg1, int arg2) {
        field5302++;
        int var3 = -1 % ((35 - arg0) / 46);
        if (arg1 < arg2) {
            int var4 = arg1;
            arg1 = arg2;
            arg2 = var4;
        }
        while (arg2 != 0) {
            int var5 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var5;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)J", line = 296)
    public final long method1889(int arg0) {
        field5300++;
        long[] var2 = class472.field6936;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field5310 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) (((long) (this.field5307 >> 8) ^ var5) & 0xFFL)];
        long var9 = var7 >>> 8 ^ var2[(int) ((var7 ^ (long) this.field5307) & 0xFFL)];
        long var11 = var2[(int) (((long) (this.field5306 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        if (arg0 != -1149) {
            method2285(-84, null);
        }
        long var13 = var2[(int) ((var11 ^ (long) (this.field5306 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) ((var13 ^ (long) (this.field5306 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) (((long) this.field5306 ^ var15) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) (((long) this.field5299 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field5305 >> 24)) & 0xFFL)];
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field5305 >> 16) ^ var21) & 0xFFL)];
        long var25 = var2[(int) (((long) (this.field5305 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) ((var25 ^ (long) this.field5305) & 0xFFL)];
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field5311 ^ var27) & 0xFFL)];
        return var2[(int) ((var29 ^ (long) (this.field5303 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
    }
}
