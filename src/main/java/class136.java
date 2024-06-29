import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class136 {

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public int field1728 = 128;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public int field1735 = 128;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public int field1733;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public int field1738;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Lkba;")
    public static class108 field1737 = new class108();

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "I")
    public static int field1739 = 0;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method846(int arg0) {
        if (arg0 != -16841) {
            field1737 = null;
        }
        field1737 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static final void method847(byte arg0) {
        class226.method1348((byte) 65, false);
        field1727++;
        class358.field4754 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < client.field4115.length; var2++) {
            if (class354.field4722[var2] != -1 && client.field4115[var2] == null) {
                client.field4115[var2] = class591.field8248.method2885(0, class354.field4722[var2], false);
                if (client.field4115[var2] == null) {
                    class358.field4754++;
                    var1 = false;
                }
            }
            if (class585.field8195[var2] != -1 && class72.field779[var2] == null) {
                class72.field779[var2] = class591.field8248.method2876(class252.field3241[var2], 5, 0, class585.field8195[var2]);
                if (class72.field779[var2] == null) {
                    var1 = false;
                    class358.field4754++;
                }
            }
            if (class735.field10249[var2] != -1 && class83.field1140[var2] == null) {
                class83.field1140[var2] = class591.field8248.method2885(0, class735.field10249[var2], false);
                if (class83.field1140[var2] == null) {
                    class358.field4754++;
                    var1 = false;
                }
            }
            if (class459.field6343[var2] != -1 && class459.field6350[var2] == null) {
                class459.field6350[var2] = class591.field8248.method2885(0, class459.field6343[var2], false);
                if (class459.field6350[var2] == null) {
                    class358.field4754++;
                    var1 = false;
                }
            }
            if (class584.field8182 != null && class125.field1628[var2] == null && class584.field8182[var2] != -1) {
                class125.field1628[var2] = class591.field8248.method2876(class252.field3241[var2], 5, 0, class584.field8182[var2]);
                if (class125.field1628[var2] == null) {
                    class358.field4754++;
                    var1 = false;
                }
            }
        }
        if (class330.field4451 == null) {
            if (class450.field6295 == null || !class226.field2933.method2868(class450.field6295.field3951 + "_staticelements", 0)) {
                class330.field4451 = new class137(0);
            } else if (class226.field2933.method2881(class450.field6295.field3951 + "_staticelements", 0)) {
                class330.field4451 = class511.method2833(113, class262.field3431, class226.field2933, class450.field6295.field3951 + "_staticelements");
            } else {
                class358.field4754++;
                var1 = false;
            }
        }
        if (!var1) {
            class707.field9898 = 1;
            return;
        }
        boolean var3 = true;
        class579.field8117 = 0;
        for (int var4 = 0; var4 < client.field4115.length; var4++) {
            byte[] var21 = class72.field779[var4];
            if (var21 != null) {
                int var22 = (class519.field6991[var4] >> 8) * 64 - class99.field1313;
                int var23 = (class519.field6991[var4] & 0xFF) * 64 - class133.field1704;
                if (class361.field4790 != 0) {
                    var23 = 10;
                    var22 = 10;
                }
                var3 &= class238.method1437(var23, var21, var22, class272.field3589, class3.field26, 107);
            }
            byte[] var24 = class459.field6350[var4];
            if (var24 != null) {
                int var25 = (class519.field6991[var4] >> 8) * 64 - class99.field1313;
                int var26 = (class519.field6991[var4] & 0xFF) * 64 - class133.field1704;
                if (class361.field4790 != 0) {
                    var25 = 10;
                    var26 = 10;
                }
                var3 &= class238.method1437(var26, var24, var25, class272.field3589, class3.field26, 119);
            }
        }
        if (!var3) {
            class707.field9898 = 2;
            return;
        }
        if (class707.field9898 != 0) {
            class396.method2303(-77, class294.field3954, class399.field5650, true, class21.field142, class755.field10492.method4201(class723.field10095, (byte) 25) + "<br>(100%)");
        }
        class7.method18(22696);
        class586.method3266((byte) 101);
        class728.method4088(50);
        boolean var5 = false;
        if (class21.field142.method346() && class11.field68.field5534.method1058((byte) 124) == 2) {
            for (int var6 = 0; var6 < client.field4115.length; var6++) {
                if (class459.field6350[var6] != null || class83.field1140[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class11.field68.field5512.method813((byte) 125) == 1) {
            var7 = class69.field756[class611.field8560];
        } else {
            var7 = class461.field6381[class611.field8560];
        }
        if (class21.field142.method404()) {
            var7++;
        }
        class570.method3204(class21.field142, class658.field9183, 9, 4, class272.field3589, class3.field26, var7, var5, class21.field142.method455() > 0);
        class258.method1550(class374.field5209);
        if (class374.field5209 == 0) {
            class522.method2886(null);
        } else {
            class522.method2886(class497.field6764);
        }
        for (int var8 = 0; var8 < 4; var8++) {
            class171.field2130[var8].method1788((byte) -99);
        }
        class335.method1995(-125);
        class755.method4200(false, -119);
        class158.method950(0);
        class362.field4800 = false;
        class257.field3343 = null;
        class7.method18(22696);
        System.gc();
        class226.method1348((byte) 56, true);
        class750.method4180((byte) -46);
        class237.field3105 = class11.field68.field5545.method61((byte) 124);
        class321.field4310 = class206.field2483 >= 96;
        class756.field10558 = class11.field68.field5534.method1058((byte) 121) == 2;
        class300.field4057 = class11.field68.field5541.method3210((byte) 121) == 1;
        class750.field10393 = class11.field68.field5548.method186((byte) 120) == 1 ? -1 : class131.field1693;
        class619.field8684 = class11.field68.field5499.method249((byte) 125) == 1;
        class158.field1999 = class11.field68.field5521.method3358((byte) 122) == 1;
        class78.field1060 = new class760(4, class272.field3589, class3.field26, false);
        if (class361.field4790 == 0) {
            class221.method1260(class78.field1060, 0, client.field4115);
        } else {
            class203.method1122(11948, client.field4115, class78.field1060);
        }
        class83.method617(class272.field3589 >> 4, class3.field26 >> 4, true);
        class28.method106(-1);
        if (var5) {
            class148.method912(true);
            class477.field6598 = new class760(1, class272.field3589, class3.field26, true);
            if (class361.field4790 == 0) {
                class221.method1260(class477.field6598, 0, class83.field1140);
                class226.method1348((byte) 113, true);
            } else {
                class203.method1122(11948, class83.field1140, class477.field6598);
                class226.method1348((byte) 123, true);
            }
            class477.field6598.method1713(0, -57, class78.field1060.field3778[0]);
            class477.field6598.method1715(0, null, class21.field142, null);
            class148.method912(false);
        }
        class78.field1060.method1715(0, class171.field2130, class21.field142, var5 ? class477.field6598.field3778 : null);
        if (class361.field4790 == 0) {
            class226.method1348((byte) 50, true);
            class327.method1949(false, class72.field779, class78.field1060);
            if (class125.field1628 != null) {
                class699.method3953(21378);
            }
        } else {
            class226.method1348((byte) 67, true);
            class81.method603(class72.field779, class78.field1060, -4789);
        }
        class586.method3266((byte) 104);
        if (class206.field2483 < 96) {
            class325.method1941(79);
        }
        class226.method1348((byte) 64, true);
        class78.field1060.method1704(null, (byte) 114, var5 ? class143.field1850[0] : null, class21.field142);
        class78.field1060.method4227(false, (byte) 105, class21.field142);
        class226.method1348((byte) 49, true);
        if (var5) {
            class148.method912(true);
            class226.method1348((byte) 96, true);
            if (class361.field4790 == 0) {
                class327.method1949(false, class459.field6350, class477.field6598);
            } else {
                class81.method603(class459.field6350, class477.field6598, -4789);
            }
            class586.method3266((byte) 123);
            class226.method1348((byte) 126, true);
            class477.field6598.method1704(class86.field1182[0], (byte) -81, null, class21.field142);
            class477.field6598.method4227(true, (byte) 105, class21.field142);
            class226.method1348((byte) 47, true);
            class148.method912(false);
        }
        class322.method1924(-125);
        int var9 = class78.field1060.field10600;
        if (var9 > class61.field677) {
            var9 = class61.field677;
        }
        if (class61.field677 - 1 > var9) {
            var9 = class61.field677 - 1;
        }
        if (class11.field68.field5548.method186((byte) 126) == 0) {
            class403.method2335(var9);
        } else {
            class403.method2335(0);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class272.field3589; var19++) {
                for (int var20 = 0; var20 < class3.field26; var20++) {
                    class753.method4191(var19, var10, (byte) 64, var20);
                }
            }
        }
        class232.method1386((byte) -109);
        class7.method18(22696);
        class266.method1598(125);
        class586.method3266((byte) 103);
        class123.method795((byte) -42);
        if (class271.field3587 != null && class582.field8161 != null && class713.field9949 == 11) {
            class595.field8301++;
            class103 var11 = class752.method4186(260, class24.field182, class449.field6285);
            var11.field1379.method3384(1571862888, 1057001181);
            class27.method104(false, var11);
        }
        if (arg0 <= 26) {
            method847((byte) -1);
        }
        if (class361.field4790 == 0) {
            int var12 = (class505.field6855 - (class272.field3589 >> 4)) / 8;
            int var13 = ((class272.field3589 >> 4) + class505.field6855) / 8;
            int var14 = (class539.field7309 - (class3.field26 >> 4)) / 8;
            int var15 = (class539.field7309 + (class3.field26 >> 4)) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= var15 + 1; var17++) {
                    if (var12 > var16 || var13 < var16 || var17 < var14 || var17 > var15) {
                        class591.field8248.method2895("m" + var16 + "_" + var17, -114);
                        class591.field8248.method2895("l" + var16 + "_" + var17, -127);
                    }
                }
            }
        }
        if (class713.field9949 == 4) {
            class237.method1429(3, false);
        } else if (class713.field9949 == 8) {
            class237.method1429(7, false);
        } else {
            class237.method1429(10, false);
            if (class582.field8161 != null) {
                class103 var18 = class752.method4186(260, class206.field2454, class449.field6285);
                class27.method104(false, var18);
            }
        }
        class573.method3216((byte) -72);
        class7.method18(22696);
        class170.method986(false);
        class315.field4252 = true;
        if (class66.field736) {
            class392.method2288("Took: " + (class538.method2963(-47) - class238.field3115) + "ms", -80);
            class66.field736 = false;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILgv;[II)V")
    public static final void method848(int arg0, class83 arg1, int[] arg2, int arg3) {
        field1736++;
        if (arg1.field821 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg1.field821.length; var5++) {
                if (arg1.field821[var5] != arg2[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg1.field871 != -1) {
                class300 var6 = class460.field6365.method1090(arg1.field871, 16383);
                int var7 = var6.field4043;
                if (var7 == 1) {
                    arg1.field806 = 1;
                    arg1.field855 = arg0;
                    arg1.field811 = 0;
                    arg1.field862 = 0;
                    arg1.field846 = 0;
                    if (!arg1.field819) {
                        class153.method930((byte) -128, arg1, arg1.field846, var6);
                    }
                }
                if (var7 == 2) {
                    arg1.field862 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = arg3; var9 < arg2.length; var9++) {
            if (arg2[var9] != -1) {
                var8 = false;
            }
            if (arg1.field821 == null || arg1.field821[var9] == -1 || class460.field6365.method1090(arg2[var9], 16383).field4056 >= class460.field6365.method1090(arg1.field821[var9], 16383).field4056) {
                arg1.field855 = arg0;
                arg1.field821 = arg2;
                break;
            }
        }
        if (var8) {
            arg1.field821 = arg2;
            arg1.field855 = arg0;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lmc;B)V")
    public final void method849(class136 arg0, byte arg1) {
        int var3 = 13 % ((arg1 - 71) / 47);
        this.field1735 = arg0.field1735;
        this.field1733 = arg0.field1733;
        this.field1730 = arg0.field1730;
        this.field1728 = arg0.field1728;
        this.field1738 = arg0.field1738;
        field1729++;
        this.field1731 = arg0.field1731;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZZI)V")
    public static final void method850(boolean arg0, boolean arg1, int arg2) {
        field1734++;
        class369 var3 = class190.method1059(arg2, arg1, 6);
        if (arg0 && var3 != null) {
            var3.method315(111);
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)Lmc;")
    public final class136 method851(int arg0) {
        if (arg0 != -1) {
            field1737 = null;
        }
        field1732++;
        return new class136(this.field1733, this.field1735, this.field1728, this.field1730, this.field1731, this.field1738);
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(I)V")
    public class136(int arg0) {
        this.field1733 = arg0;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIIII)V")
    private class136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1733 = arg0;
        this.field1728 = arg2;
        this.field1730 = arg3;
        this.field1731 = arg4;
        this.field1738 = arg5;
        this.field1735 = arg1;
    }
}
