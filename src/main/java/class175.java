import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class175 extends class228 {

    @OriginalMember(owner = "client!wg", name = "U", descriptor = "I")
    private int field3080 = 585;

    @OriginalMember(owner = "client!wg", name = "V", descriptor = "[I")
    public static int[] field3081 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!wg", name = "S", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!wg", name = "T", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!wg", name = "Y", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!wg", name = "W", descriptor = "Lclient;")
    public static client field3082;

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class175() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        if (arg1 != -3) {
            return null;
        } else {
            int[] var3 = super.field3952.method1262(arg0, 7492);
            ++field3084;
            if (super.field3952.field3276) {
                int var4 = class54.field879[arg0];
                for (int var5 = 0; ~var5 > ~class234.field4046; ++var5) {
                    int var6 = class281.field4923[var5];
                    if (~var6 < ~this.field3080 && 4096 - this.field3080 > var6 && ~(-this.field3080 + 2048) > ~var4 && ~(2048 - -this.field3080) < ~var4) {
                        int var7 = -var6 + 2048;
                        int var8 = var7 >= 0 ? var7 : -var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (2048 - this.field3080);
                        var3[var5] = -var10 + 4096;
                    } else if (~(2048 - this.field3080) > ~var6 && ~var6 > ~(2048 - -this.field3080)) {
                        int var11 = var4 + -2048;
                        int var12 = ~var11 > -1 ? -var11 : var11;
                        int var13 = var12 - this.field3080;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (-this.field3080 + 2048);
                    } else if (this.field3080 <= var4 && var4 <= -this.field3080 + 4096) {
                        if (this.field3080 <= var6 && var6 <= -this.field3080 + 4096) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = var15 < 0 ? -var15 : var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (2048 - this.field3080);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 - 2048;
                        int var20 = ~var19 <= -1 ? var19 : -var19;
                        int var21 = var20 - this.field3080;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (2048 - this.field3080);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(BI)V")
    public static final void method1172(byte arg0, int arg1) {
        ++field3078;
        if (~arg1 <= -1) {
            int var2 = class258.field4495[arg1];
            int var3 = class83.field1451[arg1];
            int var4 = (int) class249.field4293[arg1];
            int var5 = class258.field4502[arg1];
            long var6 = class249.field4293[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (~var5 == -29) {
                class107 var8 = class22.method131(var3, 1538872048);
                boolean var9 = true;
                if (var8.field1937 > 0) {
                    var9 = class57.method387(var8, (byte) 14);
                }
                if (var9) {
                    class131.field2277.method966((byte) 49, 155);
                    class131.field2277.method1701(var3, 4994);
                    ++class185.field3288;
                }
            }
            if (var5 == 50) {
                class156 var10 = class248.field4287[var4];
                if (var10 != null) {
                    class95.method637(0, 0, 1, 0, 2, var10.field1317[0], 1, class168.field3006.field1259[0], var10.field1259[0], 2, false, class168.field3006.field1317[0]);
                    ++class193.field3387;
                    class268.field4716 = 2;
                    class43.field730 = class11.field97;
                    class209.field3616 = 0;
                    class263.field4658 = class122.field2133;
                    class131.field2277.method966((byte) 49, 123);
                    class131.field2277.method1697(var4, -70);
                }
            }
            if (~var5 == -8) {
                ++class79.field1393;
                class131.field2277.method966((byte) 49, 243);
                class131.field2277.method1723(var4, 25009);
                class131.field2277.method1701(class103.field1750, 4994);
                class131.field2277.method1697(var2, -29);
                class131.field2277.method1745(class239.field4132, (byte) 5);
                class131.field2277.method1734(var3, (byte) -100);
                class259.field4514 = 0;
                class238.field4116 = class22.method131(var3, 1538872048);
                class138.field2432 = var2;
            }
            if (var5 == 1007) {
                class107 var11 = class22.method131(var3, 1538872048);
                if (var11 != null && var11.field1923[var2] >= 100000) {
                    class259.method1678(class20.field234, class198.method1332(68, new class99[] { class198.method1333(-89, var11.field1923[var2]), class271.field4787, class222.method1468(1, var4).field2963 }), (byte) -126, 0);
                } else {
                    class131.field2277.method966((byte) 49, 127);
                    class131.field2277.method1726(599500008, var4);
                    ++class1.field2;
                }
                class259.field4514 = 0;
                class238.field4116 = class22.method131(var3, 1538872048);
                class138.field2432 = var2;
            }
            if (var5 == 59) {
                class183 var12 = class259.field4515[var4];
                if (var12 != null) {
                    ++class11.field90;
                    class95.method637(0, 0, 1, 0, 2, var12.field1317[0], 1, class168.field3006.field1259[0], var12.field1259[0], 2, false, class168.field3006.field1317[0]);
                    class209.field3616 = 0;
                    class43.field730 = class11.field97;
                    class268.field4716 = 2;
                    class263.field4658 = class122.field2133;
                    class131.field2277.method966((byte) 49, 144);
                    class131.field2277.method1734(class67.field1127, (byte) -100);
                    class131.field2277.method1726(599500008, class85.field1472);
                    class131.field2277.method1726(599500008, class19.field214);
                    class131.field2277.method1726(599500008, var4);
                }
            }
            if (var5 == 1004) {
                class43.field730 = class11.field97;
                class263.field4658 = class122.field2133;
                ++class1.field2;
                class209.field3616 = 0;
                class268.field4716 = 2;
                class131.field2277.method966((byte) 49, 127);
                class131.field2277.method1726(599500008, var4);
            }
            if (~var5 == -50) {
                class156 var13 = class248.field4287[var4];
                if (var13 != null) {
                    ++class64.field1080;
                    class95.method637(0, 0, 1, 0, 2, var13.field1317[0], 1, class168.field3006.field1259[0], var13.field1259[0], 2, false, class168.field3006.field1317[0]);
                    class43.field730 = class11.field97;
                    class263.field4658 = class122.field2133;
                    class268.field4716 = 2;
                    class209.field3616 = 0;
                    class131.field2277.method966((byte) 49, 245);
                    class131.field2277.method1697(var4, -67);
                }
            }
            if (~var5 == -12) {
                class276.method1830(var3, var6, var2, (byte) 79);
                class131.field2277.method966((byte) 49, 9);
                ++class192.field3383;
                class131.field2277.method1745(class215.field3731 + var3, (byte) 5);
                class131.field2277.method1726(599500008, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                class131.field2277.method1697(var2 - -class280.field4910, -37);
            }
            if (var5 == 43) {
                class131.field2277.method966((byte) 49, 43);
                class131.field2277.method1697(var2, -93);
                ++class18.field187;
                class131.field2277.method1750(var3, 8248);
                class131.field2277.method1726(599500008, var4);
                class259.field4514 = 0;
                class238.field4116 = class22.method131(var3, 1538872048);
                class138.field2432 = var2;
            }
            if (var5 == 5) {
                class183 var14 = class259.field4515[var4];
                if (var14 != null) {
                    ++class227.field3924;
                    class95.method637(0, 0, 1, 0, 2, var14.field1317[0], 1, class168.field3006.field1259[0], var14.field1259[0], 2, false, class168.field3006.field1317[0]);
                    class43.field730 = class11.field97;
                    class263.field4658 = class122.field2133;
                    class209.field3616 = 0;
                    class268.field4716 = 2;
                    class131.field2277.method966((byte) 49, 136);
                    class131.field2277.method1726(599500008, var4);
                }
            }
            if (var5 == 36) {
                ++class163.field2866;
                class131.field2277.method966((byte) 49, 116);
                class131.field2277.method1723(var2, 25009);
                class131.field2277.method1726(599500008, var4);
                class131.field2277.method1701(var3, 4994);
                class259.field4514 = 0;
                class238.field4116 = class22.method131(var3, 1538872048);
                class138.field2432 = var2;
            }
            if (var5 == 17) {
                class57.method388((byte) 46);
            }
            if (~var5 == -17) {
                class276.method1830(var3, var6, var2, (byte) 79);
                class131.field2277.method966((byte) 49, 186);
                class131.field2277.method1745(class280.field4910 + var2, (byte) 5);
                class131.field2277.method1726(599500008, class215.field3731 + var3);
                ++class52.field865;
                class131.field2277.method1745((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 5);
            }
            if (~var5 == -15) {
                class131.field2277.method966((byte) 49, 249);
                ++class192.field3374;
                class131.field2277.method1745(var4, (byte) 5);
                class131.field2277.method1726(599500008, var2);
                class131.field2277.method1750(var3, 8248);
                class259.field4514 = 0;
                class238.field4116 = class22.method131(var3, 1538872048);
                class138.field2432 = var2;
            }
            if (var5 == 22) {
                class156 var15 = class248.field4287[var4];
                if (var15 != null) {
                    ++class111.field2010;
                    class95.method637(0, 0, 1, 0, 2, var15.field1317[0], 1, class168.field3006.field1259[0], var15.field1259[0], 2, false, class168.field3006.field1317[0]);
                    class268.field4716 = 2;
                    class43.field730 = class11.field97;
                    class263.field4658 = class122.field2133;
                    class209.field3616 = 0;
                    class131.field2277.method966((byte) 49, 206);
                    class131.field2277.method1750(class103.field1750, 8248);
                    class131.field2277.method1726(599500008, var4);
                    class131.field2277.method1726(599500008, class239.field4132);
                }
            }
            if (~var5 == -27) {
                class131.field2277.method966((byte) 49, 78);
                class131.field2277.method1745(var2, (byte) 5);
                ++class276.field4855;
                class131.field2277.method1734(var3, (byte) -100);
                class131.field2277.method1697(var4, -28);
                class259.field4514 = 0;
                class238.field4116 = class22.method131(var3, 1538872048);
                class138.field2432 = var2;
            }
            if (~var5 == -7) {
                if (~class34.field613 == -2) {
                    class95.method637(0, 0, 1, 0, 2, var2, 1, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                } else {
                    boolean var16 = class95.method637(0, 0, 0, 0, 2, var2, 0, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                    if (!var16) {
                        class95.method637(0, 0, 1, 0, 2, var2, 1, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                    }
                }
                class263.field4658 = class122.field2133;
                class43.field730 = class11.field97;
                class209.field3616 = 0;
                class268.field4716 = 2;
                class131.field2277.method966((byte) 49, 215);
                ++class284.field4945;
                class131.field2277.method1697(class215.field3731 + var3, -111);
                class131.field2277.method1723(var4, 25009);
                class131.field2277.method1726(599500008, var2 - -class280.field4910);
            }
            if (var5 == 48) {
                ++class63.field1050;
                class131.field2277.method966((byte) 49, 238);
                class131.field2277.method1716(var3, 362525296);
                class131.field2277.method1723(var2, 25009);
                class131.field2277.method1726(599500008, var4);
                class259.field4514 = 0;
                class238.field4116 = class22.method131(var3, 1538872048);
                class138.field2432 = var2;
            }
            if (var5 == 2) {
                class183 var18 = class259.field4515[var4];
                if (var18 != null) {
                    class95.method637(0, 0, 1, 0, 2, var18.field1317[0], 1, class168.field3006.field1259[0], var18.field1259[0], 2, false, class168.field3006.field1317[0]);
                    class209.field3616 = 0;
                    class268.field4716 = 2;
                    class263.field4658 = class122.field2133;
                    class43.field730 = class11.field97;
                    ++class284.field4942;
                    class131.field2277.method966((byte) 49, 130);
                    class131.field2277.method1723(var4, 25009);
                }
            }
            if (~var5 == -45) {
                class183 var19 = class259.field4515[var4];
                if (var19 != null) {
                    class95.method637(0, 0, 1, 0, 2, var19.field1317[0], 1, class168.field3006.field1259[0], var19.field1259[0], 2, false, class168.field3006.field1317[0]);
                    class268.field4716 = 2;
                    class43.field730 = class11.field97;
                    class209.field3616 = 0;
                    class263.field4658 = class122.field2133;
                    class131.field2277.method966((byte) 49, 240);
                    ++class255.field4406;
                    class131.field2277.method1726(599500008, var4);
                }
            }
            if (arg0 < 20) {
                field3081 = null;
            }
            if (var5 == 31 && class276.method1830(var3, var6, var2, (byte) 79)) {
                class131.field2277.method966((byte) 49, 246);
                ++class11.field91;
                class131.field2277.method1745(class215.field3731 + var3, (byte) 5);
                class131.field2277.method1745(class239.field4132, (byte) 5);
                class131.field2277.method1716(class103.field1750, 362525296);
                class131.field2277.method1745(class280.field4910 + var2, (byte) 5);
                class131.field2277.method1697(Integer.MAX_VALUE & (int) (var6 >>> 32), -121);
            }
            if (~var5 == -61) {
                class276.method1830(var3, var6, var2, (byte) 79);
                ++class75.field1329;
                class131.field2277.method966((byte) 49, 56);
                class131.field2277.method1697(var2 - -class280.field4910, -23);
                class131.field2277.method1745((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 5);
                class131.field2277.method1697(var3 - -class215.field3731, -53);
            }
            if (var5 == 12) {
                boolean var20 = class95.method637(0, 0, 0, 0, 2, var2, 0, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                ++class11.field93;
                if (!var20) {
                    class95.method637(0, 0, 1, 0, 2, var2, 1, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                }
                class209.field3616 = 0;
                class268.field4716 = 2;
                class43.field730 = class11.field97;
                class263.field4658 = class122.field2133;
                class131.field2277.method966((byte) 49, 229);
                class131.field2277.method1726(599500008, var4);
                class131.field2277.method1726(599500008, class215.field3731 + var3);
                class131.field2277.method1745(class85.field1472, (byte) 5);
                class131.field2277.method1697(class280.field4910 + var2, -19);
                class131.field2277.method1734(class67.field1127, (byte) -100);
                class131.field2277.method1697(class19.field214, -68);
            }
            if (var5 == 1005) {
                class209.field3616 = 0;
                class263.field4658 = class122.field2133;
                class268.field4716 = 2;
                class43.field730 = class11.field97;
                ++class197.field3435;
                class131.field2277.method966((byte) 49, 216);
                class131.field2277.method1697(var4, -93);
            }
            if (var5 == 1) {
                class156 var22 = class248.field4287[var4];
                if (var22 != null) {
                    ++class21.field241;
                    class95.method637(0, 0, 1, 0, 2, var22.field1317[0], 1, class168.field3006.field1259[0], var22.field1259[0], 2, false, class168.field3006.field1317[0]);
                    class268.field4716 = 2;
                    class209.field3616 = 0;
                    class43.field730 = class11.field97;
                    class263.field4658 = class122.field2133;
                    class131.field2277.method966((byte) 49, 117);
                    class131.field2277.method1745(var4, (byte) 5);
                }
            }
            if (~var5 == -31) {
                class183 var23 = class259.field4515[var4];
                if (var23 != null) {
                    ++class171.field3037;
                    class95.method637(0, 0, 1, 0, 2, var23.field1317[0], 1, class168.field3006.field1259[0], var23.field1259[0], 2, false, class168.field3006.field1317[0]);
                    class263.field4658 = class122.field2133;
                    class43.field730 = class11.field97;
                    class268.field4716 = 2;
                    class209.field3616 = 0;
                    class131.field2277.method966((byte) 49, 72);
                    class131.field2277.method1726(599500008, var4);
                }
            }
            if (var5 == 25) {
                class156 var24 = class248.field4287[var4];
                if (var24 != null) {
                    class95.method637(0, 0, 1, 0, 2, var24.field1317[0], 1, class168.field3006.field1259[0], var24.field1259[0], 2, false, class168.field3006.field1317[0]);
                    class263.field4658 = class122.field2133;
                    ++class255.field4402;
                    class209.field3616 = 0;
                    class43.field730 = class11.field97;
                    class268.field4716 = 2;
                    class131.field2277.method966((byte) 49, 221);
                    class131.field2277.method1697(var4, -96);
                }
            }
            if (~var5 == -46) {
                class183 var25 = class259.field4515[var4];
                if (var25 != null) {
                    class95.method637(0, 0, 1, 0, 2, var25.field1317[0], 1, class168.field3006.field1259[0], var25.field1259[0], 2, false, class168.field3006.field1317[0]);
                    class43.field730 = class11.field97;
                    ++class76.field1337;
                    class263.field4658 = class122.field2133;
                    class209.field3616 = 0;
                    class268.field4716 = 2;
                    class131.field2277.method966((byte) 49, 230);
                    class131.field2277.method1697(var4, -120);
                }
            }
            if (~var5 == -41) {
                if (class34.field613 == 1) {
                    class95.method637(0, 0, 1, 0, 2, var2, 1, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                } else {
                    boolean var26 = class95.method637(0, 0, 0, 0, 2, var2, 0, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                    if (!var26) {
                        class95.method637(0, 0, 1, 0, 2, var2, 1, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                    }
                }
                class43.field730 = class11.field97;
                class263.field4658 = class122.field2133;
                class268.field4716 = 2;
                class209.field3616 = 0;
                ++class200.field3474;
                class131.field2277.method966((byte) 49, 192);
                class131.field2277.method1745(class215.field3731 + var3, (byte) 5);
                class131.field2277.method1723(class280.field4910 + var2, 25009);
                class131.field2277.method1726(599500008, var4);
            }
            if (~var5 == -59) {
                class156 var28 = class248.field4287[var4];
                if (var28 != null) {
                    ++class141.field2480;
                    class95.method637(0, 0, 1, 0, 2, var28.field1317[0], 1, class168.field3006.field1259[0], var28.field1259[0], 2, false, class168.field3006.field1317[0]);
                    class43.field730 = class11.field97;
                    class209.field3616 = 0;
                    class263.field4658 = class122.field2133;
                    class268.field4716 = 2;
                    class131.field2277.method966((byte) 49, 91);
                    class131.field2277.method1697(var4, -15);
                }
            }
            if (var5 == 51) {
                ++class211.field3664;
                class276.method1830(var3, var6, var2, (byte) 79);
                class131.field2277.method966((byte) 49, 169);
                class131.field2277.method1745(class280.field4910 + var2, (byte) 5);
                class131.field2277.method1726(599500008, class215.field3731 + var3);
                class131.field2277.method1723(Integer.MAX_VALUE & (int) (var6 >>> 32), 25009);
            }
            if (~var5 == -16) {
                if (~class34.field613 != -2) {
                    boolean var29 = class95.method637(0, 0, 0, 0, 2, var2, 0, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                    if (!var29) {
                        class95.method637(0, 0, 1, 0, 2, var2, 1, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                    }
                } else {
                    class95.method637(0, 0, 1, 0, 2, var2, 1, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                }
                ++class184.field3267;
                class263.field4658 = class122.field2133;
                class268.field4716 = 2;
                class43.field730 = class11.field97;
                class209.field3616 = 0;
                class131.field2277.method966((byte) 49, 108);
                class131.field2277.method1745(var4, (byte) 5);
                class131.field2277.method1723(class280.field4910 + var2, 25009);
                class131.field2277.method1723(var3 - -class215.field3731, 25009);
            }
            if (var5 == 23) {
                ++class185.field3288;
                class131.field2277.method966((byte) 49, 155);
                class131.field2277.method1701(var3, 4994);
                class107 var31 = class22.method131(var3, 1538872048);
                if (var31.field1806 != null && var31.field1806[0][0] == 5) {
                    int var32 = var31.field1806[0][1];
                    if (~class43.field733[var32] != ~var31.field1784[0]) {
                        class43.field733[var32] = var31.field1784[0];
                        class127.method838(var32, -97);
                    }
                }
            }
            if (var5 == 24) {
                ++class281.field4916;
                class131.field2277.method966((byte) 49, 26);
                class131.field2277.method1701(var3, 4994);
                class131.field2277.method1726(599500008, var2);
                class131.field2277.method1745(var4, (byte) 5);
                class259.field4514 = 0;
                class238.field4116 = class22.method131(var3, 1538872048);
                class138.field2432 = var2;
            }
            if (~var5 == -40 && class276.method1830(var3, var6, var2, (byte) 79)) {
                class131.field2277.method966((byte) 49, 38);
                ++class33.field583;
                class131.field2277.method1701(class67.field1127, 4994);
                class131.field2277.method1697(class215.field3731 + var3, -104);
                class131.field2277.method1726(599500008, class19.field214);
                class131.field2277.method1723((int) (var6 >>> 32) & Integer.MAX_VALUE, 25009);
                class131.field2277.method1697(class85.field1472, -65);
                class131.field2277.method1723(class280.field4910 + var2, 25009);
            }
            if (var5 == 19) {
                ++class59.field986;
                class131.field2277.method966((byte) 49, 188);
                class131.field2277.method1726(599500008, var2);
                class131.field2277.method1716(class103.field1750, 362525296);
                class131.field2277.method1723(class239.field4132, 25009);
                class131.field2277.method1734(var3, (byte) -100);
            }
            if (var5 == 18) {
                if (~var4 == -1) {
                    class145.field2561 = true;
                    class124.method822(class255.field4407, var2, var3);
                } else if (~var4 == -2) {
                    class131.field2277.method966((byte) 49, 110);
                    class131.field2277.method1697(class280.field4910 + var2, -69);
                    class131.field2277.method1697(class239.field4132, -61);
                    class131.field2277.method1701(class103.field1750, 4994);
                    class131.field2277.method1745(class215.field3731 + var3, (byte) 5);
                    ++class1.field5;
                }
            }
            if (var5 == 3) {
                class131.field2277.method966((byte) 49, 163);
                ++class256.field4426;
                class131.field2277.method1701(var3, 4994);
                class131.field2277.method1723(class19.field214, 25009);
                class131.field2277.method1716(class67.field1127, 362525296);
                class131.field2277.method1723(var2, 25009);
                class131.field2277.method1726(599500008, class85.field1472);
                class131.field2277.method1697(var4, -95);
                class259.field4514 = 0;
                class238.field4116 = class22.method131(var3, 1538872048);
                class138.field2432 = var2;
            }
            if (var5 == 37) {
                class183 var33 = class259.field4515[var4];
                if (var33 != null) {
                    ++class143.field2523;
                    class95.method637(0, 0, 1, 0, 2, var33.field1317[0], 1, class168.field3006.field1259[0], var33.field1259[0], 2, false, class168.field3006.field1317[0]);
                    class43.field730 = class11.field97;
                    class209.field3616 = 0;
                    class268.field4716 = 2;
                    class263.field4658 = class122.field2133;
                    class131.field2277.method966((byte) 49, 204);
                    class131.field2277.method1734(class103.field1750, (byte) -100);
                    class131.field2277.method1745(class239.field4132, (byte) 5);
                    class131.field2277.method1697(var4, -26);
                }
            }
            if (var5 == 32) {
                class131.field2277.method966((byte) 49, 122);
                class131.field2277.method1726(599500008, var4);
                ++client.field2772;
                class131.field2277.method1697(var2, -94);
                class131.field2277.method1750(var3, 8248);
                class259.field4514 = 0;
                class238.field4116 = class22.method131(var3, 1538872048);
                class138.field2432 = var2;
            }
            if (~var5 == -39) {
                ++class252.field4348;
                class131.field2277.method966((byte) 49, 222);
                class131.field2277.method1745(var4, (byte) 5);
                class131.field2277.method1745(var2, (byte) 5);
                class131.field2277.method1750(var3, 8248);
                class259.field4514 = 0;
                class238.field4116 = class22.method131(var3, 1538872048);
                class138.field2432 = var2;
            }
            if (var5 == 21) {
                class107 var34 = class127.method842((byte) -48, var2, var3);
                if (var34 != null) {
                    class166.method1115(-50);
                    class215.method1440((byte) 110, var2, var3, class290.method1943((byte) -31, client.method1066(var34)));
                    class150.field2647 = 0;
                    class169.field3018 = class288.method1934((byte) 27, var34);
                    if (class169.field3018 == null) {
                        class169.field3018 = class255.field4412;
                    }
                    if (var34.field1915) {
                        class93.field1562 = class198.method1332(115, new class99[] { var34.field1943, class58.field969 });
                        return;
                    }
                    class93.field1562 = class198.method1332(81, new class99[] { class12.field106, var34.field1885, class58.field969 });
                }
            } else {
                if (~var5 == -1002) {
                    class43.field730 = class11.field97;
                    class268.field4716 = 2;
                    class263.field4658 = class122.field2133;
                    class209.field3616 = 0;
                    class156 var35 = class248.field4287[var4];
                    if (var35 != null) {
                        class257 var36 = var35.field2793;
                        if (var36.field4491 != null) {
                            var36 = var36.method1667(104);
                        }
                        if (var36 != null) {
                            ++class37.field639;
                            class131.field2277.method966((byte) 49, 134);
                            class131.field2277.method1697(var36.field4485, -34);
                        }
                    }
                }
                if (var5 == 4 && class137.field2411 == null) {
                    class221.method1466(-116, var2, var3);
                    class137.field2411 = class127.method842((byte) -48, var2, var3);
                    class238.method1555(class137.field2411, 10555);
                }
                if (~var5 == -36) {
                    ++class227.field3925;
                    if (~class34.field613 == -2) {
                        class95.method637(0, 0, 1, 0, 2, var2, 1, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                    } else {
                        boolean var37 = class95.method637(0, 0, 0, 0, 2, var2, 0, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                        if (!var37) {
                            class95.method637(0, 0, 1, 0, 2, var2, 1, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                        }
                    }
                    class268.field4716 = 2;
                    class209.field3616 = 0;
                    class43.field730 = class11.field97;
                    class263.field4658 = class122.field2133;
                    class131.field2277.method966((byte) 49, 67);
                    class131.field2277.method1745(var4, (byte) 5);
                    class131.field2277.method1697(class215.field3731 + var3, -62);
                    class131.field2277.method1745(class280.field4910 + var2, (byte) 5);
                }
                if (~var5 == -35) {
                    class156 var39 = class248.field4287[var4];
                    if (var39 != null) {
                        class95.method637(0, 0, 1, 0, 2, var39.field1317[0], 1, class168.field3006.field1259[0], var39.field1259[0], 2, false, class168.field3006.field1317[0]);
                        ++class146.field2594;
                        class268.field4716 = 2;
                        class43.field730 = class11.field97;
                        class263.field4658 = class122.field2133;
                        class209.field3616 = 0;
                        class131.field2277.method966((byte) 49, 185);
                        class131.field2277.method1745(class19.field214, (byte) 5);
                        class131.field2277.method1723(var4, 25009);
                        class131.field2277.method1745(class85.field1472, (byte) 5);
                        class131.field2277.method1716(class67.field1127, 362525296);
                    }
                }
                if (~var5 == -34) {
                    if (var4 == 0) {
                        class124.method822(class255.field4407, var2, var3);
                    } else if (~var4 == -2) {
                        if (class103.field1751 > 0 && class51.field839[82] && class51.field839[81]) {
                            class278.method1836((byte) 95, class280.field4910 - -var2, class255.field4407, class215.field3731 + var3);
                        } else if (class95.method637(0, 0, 0, 0, 2, var2, 0, class168.field3006.field1259[0], var3, 1, true, class168.field3006.field1317[0])) {
                            class131.field2277.method1691(class131.field2283, (byte) 53);
                            class131.field2277.method1691(class208.field3602, (byte) 53);
                            class131.field2277.method1745(class239.field4129, (byte) 5);
                            class131.field2277.method1691(57, (byte) 53);
                            class131.field2277.method1691(class124.field2178, (byte) 53);
                            class131.field2277.method1691(class260.field4542, (byte) 53);
                            class131.field2277.method1691(89, (byte) 53);
                            class131.field2277.method1745(class168.field3006.field1325, (byte) 5);
                            class131.field2277.method1745(class168.field3006.field1301, (byte) 5);
                            class131.field2277.method1691(class186.field3291, (byte) 53);
                            class131.field2277.method1691(63, (byte) 53);
                        }
                    }
                }
                if (var5 == 46) {
                    class131.field2277.method966((byte) 49, 155);
                    ++class185.field3288;
                    class131.field2277.method1701(var3, 4994);
                    class107 var40 = class22.method131(var3, 1538872048);
                    if (var40.field1806 != null && var40.field1806[0][0] == 5) {
                        int var41 = var40.field1806[0][1];
                        class43.field733[var41] = 1 - class43.field733[var41];
                        class127.method838(var41, -34);
                    }
                }
                if (~var5 == -58) {
                    ++class170.field3032;
                    if (~class34.field613 == -2) {
                        class95.method637(0, 0, 1, 0, 2, var2, 1, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                    } else {
                        boolean var42 = class95.method637(0, 0, 0, 0, 2, var2, 0, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                        if (!var42) {
                            class95.method637(0, 0, 1, 0, 2, var2, 1, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                        }
                    }
                    class43.field730 = class11.field97;
                    class209.field3616 = 0;
                    class263.field4658 = class122.field2133;
                    class268.field4716 = 2;
                    class131.field2277.method966((byte) 49, 135);
                    class131.field2277.method1697(var3 - -class215.field3731, -57);
                    class131.field2277.method1726(599500008, var2 - -class280.field4910);
                    class131.field2277.method1697(var4, -17);
                }
                if (~var5 == -1004) {
                    ++class215.field3732;
                    class276.method1830(var3, var6, var2, (byte) 79);
                    class131.field2277.method966((byte) 49, 30);
                    class131.field2277.method1697(var3 - -class215.field3731, -69);
                    class131.field2277.method1723(class280.field4910 + var2, 25009);
                    class131.field2277.method1723((int) (var6 >>> 32) & Integer.MAX_VALUE, 25009);
                }
                if (~var5 == -14) {
                    class131.field2277.method966((byte) 49, 66);
                    class131.field2277.method1726(599500008, var4);
                    ++class36.field626;
                    class131.field2277.method1726(599500008, var2);
                    class131.field2277.method1701(var3, 4994);
                    class259.field4514 = 0;
                    class238.field4116 = class22.method131(var3, 1538872048);
                    class138.field2432 = var2;
                }
                if (~var5 == -48) {
                    if (~var4 != -1) {
                        if (~class103.field1751 < -1 && class51.field839[82] && class51.field839[81]) {
                            class278.method1836((byte) 95, class280.field4910 + var2, class255.field4407, class215.field3731 - -var3);
                        } else {
                            ++class240.field4150;
                            class131.field2277.method966((byte) 49, 133);
                            class131.field2277.method1697(class280.field4910 - -var2, -75);
                            class131.field2277.method1723(class215.field3731 + var3, 25009);
                        }
                    } else {
                        class257.field4475 = true;
                        class124.method822(class255.field4407, var2, var3);
                    }
                }
                if (~var5 == -11) {
                    ++class110.field1965;
                    boolean var44 = class95.method637(0, 0, 0, 0, 2, var2, 0, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                    if (!var44) {
                        class95.method637(0, 0, 1, 0, 2, var2, 1, class168.field3006.field1259[0], var3, 2, false, class168.field3006.field1317[0]);
                    }
                    class209.field3616 = 0;
                    class263.field4658 = class122.field2133;
                    class43.field730 = class11.field97;
                    class268.field4716 = 2;
                    class131.field2277.method966((byte) 49, 214);
                    class131.field2277.method1745(class215.field3731 + var3, (byte) 5);
                    class131.field2277.method1726(599500008, class280.field4910 + var2);
                    class131.field2277.method1745(var4, (byte) 5);
                    class131.field2277.method1726(599500008, class239.field4132);
                    class131.field2277.method1716(class103.field1750, 362525296);
                }
                if (var5 == 29) {
                    class166.method1115(-50);
                    class107 var46 = class22.method131(var3, 1538872048);
                    class150.field2647 = 1;
                    class67.field1127 = var3;
                    class19.field214 = var2;
                    class85.field1472 = var4;
                    class238.method1555(var46, 10555);
                    class63.field1074 = class198.method1332(104, new class99[] { class257.field4454, class222.method1468(1, var4).field2963, class58.field969 });
                    if (class63.field1074 == null) {
                        class63.field1074 = class36.field629;
                    }
                } else {
                    if (var5 == 20 || ~var5 == -1003) {
                        class65.method424(var3, var4, class122.field2147[arg1], (byte) -45, var2);
                    }
                    if (~var5 == -43) {
                        class183 var47 = class259.field4515[var4];
                        if (var47 != null) {
                            ++class268.field4717;
                            class95.method637(0, 0, 1, 0, 2, var47.field1317[0], 1, class168.field3006.field1259[0], var47.field1259[0], 2, false, class168.field3006.field1317[0]);
                            class263.field4658 = class122.field2133;
                            class268.field4716 = 2;
                            class209.field3616 = 0;
                            class43.field730 = class11.field97;
                            class131.field2277.method966((byte) 49, 219);
                            class131.field2277.method1745(var4, (byte) 5);
                        }
                    }
                    if (~var5 == -9) {
                        class183 var48 = class259.field4515[var4];
                        if (var48 != null) {
                            class95.method637(0, 0, 1, 0, 2, var48.field1317[0], 1, class168.field3006.field1259[0], var48.field1259[0], 2, false, class168.field3006.field1317[0]);
                            class263.field4658 = class122.field2133;
                            class268.field4716 = 2;
                            ++class32.field573;
                            class43.field730 = class11.field97;
                            class209.field3616 = 0;
                            class131.field2277.method966((byte) 49, 158);
                            class131.field2277.method1726(599500008, var4);
                        }
                    }
                    if (var5 == 41) {
                        class183 var49 = class259.field4515[var4];
                        if (var49 != null) {
                            class95.method637(0, 0, 1, 0, 2, var49.field1317[0], 1, class168.field3006.field1259[0], var49.field1259[0], 2, false, class168.field3006.field1317[0]);
                            class263.field4658 = class122.field2133;
                            class43.field730 = class11.field97;
                            class209.field3616 = 0;
                            class268.field4716 = 2;
                            ++class103.field1741;
                            class131.field2277.method966((byte) 49, 168);
                            class131.field2277.method1726(599500008, var4);
                        }
                    }
                    if (var5 == 9) {
                        ++class193.field3394;
                        class131.field2277.method966((byte) 49, 147);
                        class131.field2277.method1745(var4, (byte) 5);
                        class131.field2277.method1723(var2, 25009);
                        class131.field2277.method1734(var3, (byte) -100);
                        class259.field4514 = 0;
                        class238.field4116 = class22.method131(var3, 1538872048);
                        class138.field2432 = var2;
                    }
                    if (~class150.field2647 != -1) {
                        class150.field2647 = 0;
                        class238.method1555(class22.method131(class67.field1127, 1538872048), 10555);
                    }
                    if (class54.field896) {
                        class166.method1115(-50);
                    }
                    if (class238.field4116 != null && ~class259.field4514 == -1) {
                        class238.method1555(class238.field4116, 10555);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
    public static void method1173(int arg0) {
        if (arg0 == -21346) {
            field3082 = null;
            field3081 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([IIIII)V")
    public static final void method1174(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        --arg3;
        ++field3083;
        int var8 = arg4 - 1;
        int var5 = arg2 + var8;
        while (var5 > arg3) {
            int var6 = arg3 + 1;
            arg0[var6] = arg1;
            int var7 = var6 + 1;
            arg0[var7] = arg1;
            int var9 = var7 + 1;
            arg0[var9] = arg1;
            int var10 = var9 + 1;
            arg0[var10] = arg1;
            int var11 = var10 + 1;
            arg0[var11] = arg1;
            int var12 = var11 + 1;
            arg0[var12] = arg1;
            int var13 = var12 + 1;
            arg0[var13] = arg1;
            arg3 = var13 + 1;
            arg0[arg3] = arg1;
        }
        while (var8 > arg3) {
            ++arg3;
            arg0[arg3] = arg1;
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(III)I")
    public static final int method1175(int arg0, int arg1, int arg2) {
        ++field3085;
        if (arg0 < 112) {
            return 47;
        } else {
            int var3 = arg2 * 57 + arg1;
            int var4 = var3 ^ var3 << 13;
            int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 - -789221) * var4 - -1376312589;
            return var5 >> 19 & 255;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg2 != -7618) {
            method1172((byte) -66, 85);
        }
        if (~arg0 == -1) {
            this.field3080 = arg1.method1740((byte) 69);
        }
        ++field3079;
    }
}
