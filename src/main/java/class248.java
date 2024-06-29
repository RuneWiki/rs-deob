import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class248 {

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Lch;")
    private class196 field3695 = new class196();

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "Lnf;")
    private class251 field3705 = new class251();

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    private int field3704;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    private int field3703;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "Ltd;")
    private class192 field3702;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "[I")
    public static int[] field3692 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field3700 = 0;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BILlm;I)[Lea;", line = 5)
    public static final class235[] method1670(byte arg0, int arg1, class210 arg2, int arg3) {
        field3691++;
        if (arg0 <= 41) {
            method1671((byte) -72);
        }
        return class249.method1680(arg1, arg2, arg3, (byte) -39) ? class12.method72(255) : null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V", line = 33)
    public static final void method1671(byte arg0) {
        class234.field3507.method28(183, false);
        for (class167 var1 = (class167) class295.field4522.method1321((byte) -128); var1 != null; var1 = (class167) class295.field4522.method1330((byte) -106)) {
            if (var1.field2513 == 0) {
                class30.method198(var1, true, (byte) 112);
            }
        }
        field3694++;
        if (class194.field2910 != null) {
            class247.method1666(class194.field2910, -128);
            class194.field2910 = null;
        }
        if (arg0 != 40) {
            field3692 = (int[]) null;
        }
        class233.field3505++;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IJLch;)V", line = 64)
    public final void method1672(int arg0, long arg1, class196 arg2) {
        if (this.field3704 == 0) {
            class196 var5 = this.field3705.method1698((byte) 43);
            var5.method714(-92);
            var5.method1353(29792);
            if (this.field3695 == var5) {
                class196 var6 = this.field3705.method1698((byte) 94);
                var6.method714(-42);
                var6.method1353(29792);
            }
        } else {
            this.field3704--;
        }
        field3693++;
        int var7 = -8 / ((-arg0 - 91) / 34);
        this.field3702.method1319(121, arg1, arg2);
        this.field3705.method1697(34, arg2);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 94)
    public static void method1673(int arg0) {
        field3692 = null;
        if (arg0 != 2) {
            method1670((byte) -20, -108, (class210) null, 43);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IJ)Lch;", line = 105)
    public final class196 method1674(int arg0, long arg1) {
        field3699++;
        class196 var4 = (class196) this.field3702.method1320(arg1, arg0 + 13002);
        if (var4 != null) {
            this.field3705.method1697(arg0 + 34, var4);
        }
        return arg0 == 0 ? var4 : (class196) null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V", line = 129)
    public static final void method1675(int arg0, int arg1) {
        field3690++;
        if (arg0 > arg1) {
            return;
        }
        int var2 = class193.field2893[arg1];
        int var3 = class178.field2633[arg1];
        int var4 = class201.field2998[arg1];
        long var5 = class13.field153[arg1];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var7 = (int) class13.field153[arg1];
        if (var4 == 51) {
            class329 var8 = class80.method541((byte) 96, var3);
            boolean var9 = true;
            if (var8.field5032 > 0) {
                var9 = class144.method1031((byte) -87, var8);
            }
            if (var9) {
                class234.field3507.method28(52, false);
                class234.field3507.method1815(110, var3);
                class45.field575++;
            }
        }
        if (var4 == 8) {
            class234.field3507.method28(59, false);
            class114.field1756++;
            class234.field3507.method1806(var3, arg0 + 9897);
            class234.field3507.method1823(var7, (byte) -106);
            class234.field3507.method1837(28160, var2);
            class184.field2746 = 0;
            class113.field1743 = class80.method541((byte) 96, var3);
            class60.field797 = var2;
        }
        if (var4 == 50) {
            class11.field119++;
            boolean var10 = class55.method366(false, class114.field1750.field1541[0], 0, 2, 0, class114.field1750.field1516[0], var2, 0, var3, 0, 0, false);
            if (!var10) {
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var2, 1, var3, 0, 0, false);
            }
            class292.field4454 = 0;
            class21.field261 = class207.field3140;
            class213.field3233 = 2;
            class55.field688 = class28.field387;
            class234.field3507.method28(71, false);
            class234.field3507.method1837(arg0 + 28160, class217.field3309 + var2);
            class234.field3507.method1798(class115.field1762, 97);
            class234.field3507.method1837(28160, class198.field2977);
            class234.field3507.method1817(true, var7);
            class234.field3507.method1817(true, class189.field2807 + var3);
        }
        if (var4 == 20) {
            class195 var12 = class241.field3592[var7];
            if (var12 != null) {
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var12.field1541[0], 1, var12.field1516[0], 0, 0, false);
                class210.field3165++;
                class55.field688 = class28.field387;
                class213.field3233 = 2;
                class21.field261 = class207.field3140;
                class292.field4454 = 0;
                class234.field3507.method28(116, false);
                class234.field3507.method1837(28160, var7);
            }
        }
        if (var4 == 31) {
            class243.field3634++;
            class234.field3507.method28(187, false);
            class234.field3507.method1833(-128, var3);
            class234.field3507.method1841(78, var2);
            class234.field3507.method1823(var7, (byte) -94);
            class184.field2746 = 0;
            class113.field1743 = class80.method541((byte) 96, var3);
            class60.field797 = var2;
        }
        if (var4 == 36) {
            class195 var13 = class241.field3592[var7];
            if (var13 != null) {
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var13.field1541[0], 1, var13.field1516[0], 0, 0, false);
                class213.field3233 = 2;
                class55.field688 = class28.field387;
                class292.field4454 = 0;
                class315.field4759++;
                class21.field261 = class207.field3140;
                class234.field3507.method28(250, false);
                class234.field3507.method1823(var7, (byte) -123);
            }
        }
        if (var4 == 3) {
            class45.field575++;
            class234.field3507.method28(52, false);
            class234.field3507.method1815(arg0 ^ 0x51, var3);
            class329 var14 = class80.method541((byte) 96, var3);
            if (var14.field4950 != null && var14.field4950[0][0] == 5) {
                int var15 = var14.field4950[0][1];
                class185.field2763[var15] = 1 - class185.field2763[var15];
                class206.method1420((byte) -75, var15);
            }
        }
        if (var4 == 17) {
            class69 var16 = class187.field2788[var7];
            if (var16 != null) {
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var16.field1541[0], 1, var16.field1516[0], 0, 0, false);
                class21.field261 = class207.field3140;
                class55.field688 = class28.field387;
                class234.field3512++;
                class213.field3233 = 2;
                class292.field4454 = 0;
                class234.field3507.method28(31, false);
                class234.field3507.method1817(true, var7);
            }
        }
        if (var4 == 46) {
            if (var7 == 0) {
                class10.field95 = 1;
                class278.method1944(class180.field2697, var2, var3);
            } else if (var7 == 1) {
                class29.field392++;
                class234.field3507.method28(69, false);
                class234.field3507.method1815(arg0 ^ 0x7D, class115.field1762);
                class234.field3507.method1837(28160, class198.field2977);
                class234.field3507.method1817(true, class189.field2807 + var3);
                class234.field3507.method1823(class217.field3309 + var2, (byte) -87);
            }
        }
        if (var4 == 21) {
            class195 var17 = class241.field3592[var7];
            if (var17 != null) {
                class48.field597++;
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var17.field1541[0], 1, var17.field1516[0], 0, 0, false);
                class292.field4454 = 0;
                class213.field3233 = 2;
                class21.field261 = class207.field3140;
                class55.field688 = class28.field387;
                class234.field3507.method28(105, false);
                class234.field3507.method1817(true, var7);
                class234.field3507.method1815(124, class218.field3312);
                class234.field3507.method1841(96, class181.field2703);
                class234.field3507.method1841(122, class30.field402);
            }
        }
        if (var4 == 25) {
            class213.field3236++;
            class234.field3507.method28(237, false);
            class234.field3507.method1823(var7, (byte) -112);
            class234.field3507.method1837(28160, var2);
            class234.field3507.method1806(var3, 9897);
            class184.field2746 = 0;
            class113.field1743 = class80.method541((byte) 96, var3);
            class60.field797 = var2;
        }
        if (var4 == 28) {
            class234.field3507.method28(63, false);
            class190.field2828++;
            class234.field3507.method1817(true, class198.field2977);
            class234.field3507.method1806(class115.field1762, 9897);
            class234.field3507.method1841(62, var2);
            class234.field3507.method1833(arg0 ^ 0xFFFFFF80, var3);
        }
        if (var4 == 48) {
            class195 var18 = class241.field3592[var7];
            if (var18 != null) {
                class325.field4901++;
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var18.field1541[0], 1, var18.field1516[0], 0, 0, false);
                class292.field4454 = 0;
                class21.field261 = class207.field3140;
                class213.field3233 = 2;
                class55.field688 = class28.field387;
                class234.field3507.method28(28, false);
                class234.field3507.method1798(class115.field1762, arg0 + 103);
                class234.field3507.method1841(arg0 + 78, class198.field2977);
                class234.field3507.method1841(66, var7);
            }
        }
        if (var4 == 2) {
            class329 var19 = class10.method48(var2, var3, (byte) -88);
            if (var19 != null) {
                class279.method1949(false);
                class21 var20 = client.method902(var19);
                class267.method1879(var19.field4985, var2, var20.field263, var3, true, var19.field5058, var20.method138((byte) 90));
                class76.field985 = 0;
                class69.field916 = class145.method1041(var19, (byte) -84);
                if (class69.field916 == null) {
                    class69.field916 = "Null";
                }
                if (var19.field5022) {
                    class40.field492 = var19.field4992 + "<col=ffffff>";
                } else {
                    class40.field492 = "<col=00ff00>" + var19.field5038 + "<col=ffffff>";
                }
            }
            return;
        }
        if (var4 == 38) {
            class234.field3507.method28(52, false);
            class45.field575++;
            class234.field3507.method1815(103, var3);
            class329 var21 = class80.method541((byte) 96, var3);
            if (var21.field4950 != null && var21.field4950[0][0] == 5) {
                int var22 = var21.field4950[0][1];
                if (class185.field2763[var22] != var21.field5078[0]) {
                    class185.field2763[var22] = var21.field5078[0];
                    class206.method1420((byte) -106, var22);
                }
            }
        }
        if (var4 == 1003) {
            class329 var23 = class80.method541((byte) 96, var3);
            if (var23 == null || var23.field4999[var2] < 100000) {
                class234.field3507.method28(189, false);
                class60.field798++;
                class234.field3507.method1841(arg0 ^ 0x42, var7);
            } else {
                class92.method656(0, var23.field4999[var2] + " x " + class325.method2219(var7, -9379).field3837, "", ~arg0);
            }
            class184.field2746 = 0;
            class113.field1743 = class80.method541((byte) 96, var3);
            class60.field797 = var2;
        }
        if (var4 == 13) {
            class243.field3636++;
            class234.field3507.method28(43, false);
            class234.field3507.method1806(var3, arg0 + 9897);
            class234.field3507.method1841(90, var7);
            class234.field3507.method1841(107, var2);
            class184.field2746 = 0;
            class113.field1743 = class80.method541((byte) 96, var3);
            class60.field797 = var2;
        }
        if (var4 == 5) {
            class9.field75++;
            if (class237.field3555 == 1) {
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var2, 1, var3, 0, 0, false);
            } else {
                boolean var24 = class55.method366(false, class114.field1750.field1541[0], 0, 2, 0, class114.field1750.field1516[0], var2, 0, var3, 0, 0, false);
                if (!var24) {
                    class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var2, 1, var3, 0, 0, false);
                }
            }
            class55.field688 = class28.field387;
            class21.field261 = class207.field3140;
            class292.field4454 = 0;
            class213.field3233 = 2;
            class234.field3507.method28(176, false);
            class234.field3507.method1823(var3 + class189.field2807, (byte) -77);
            class234.field3507.method1841(arg0 + 69, class217.field3309 + var2);
            class234.field3507.method1841(68, var7);
        }
        if (var4 == 14) {
            class195 var26 = class241.field3592[var7];
            if (var26 != null) {
                class285.field4304++;
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var26.field1541[0], 1, var26.field1516[0], 0, 0, false);
                class292.field4454 = 0;
                class213.field3233 = 2;
                class55.field688 = class28.field387;
                class21.field261 = class207.field3140;
                class234.field3507.method28(128, false);
                class234.field3507.method1823(var7, (byte) -113);
            }
        }
        if (var4 == 1) {
            method1671((byte) 40);
        }
        if (var4 == 1007) {
            class21.field261 = class207.field3140;
            class292.field4454 = 0;
            class55.field688 = class28.field387;
            class213.field3233 = 2;
            class69 var27 = class187.field2788[var7];
            if (var27 != null) {
                class58 var28 = var27.field914;
                if (var28.field756 != null) {
                    var28 = var28.method390(-124);
                }
                if (var28 != null) {
                    class306.field4664++;
                    class234.field3507.method28(209, false);
                    class234.field3507.method1817(true, var28.field725);
                }
            }
        }
        if (var4 == 49) {
            class187.field2790++;
            if (class237.field3555 == 1) {
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var2, 1, var3, 0, 0, false);
            } else {
                boolean var29 = class55.method366(false, class114.field1750.field1541[0], 0, 2, 0, class114.field1750.field1516[0], var2, 0, var3, 0, 0, false);
                if (!var29) {
                    class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var2, 1, var3, 0, 0, false);
                }
            }
            class55.field688 = class28.field387;
            class21.field261 = class207.field3140;
            class213.field3233 = 2;
            class292.field4454 = 0;
            class234.field3507.method28(51, false);
            class234.field3507.method1841(114, var7);
            class234.field3507.method1837(arg0 + 28160, class217.field3309 + var2);
            class234.field3507.method1817(true, class189.field2807 + var3);
        }
        if (var4 == 30) {
            if (class237.field3555 == 1) {
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var2, 1, var3, 0, 0, false);
            } else {
                boolean var31 = class55.method366(false, class114.field1750.field1541[0], 0, 2, 0, class114.field1750.field1516[0], var2, 0, var3, 0, 0, false);
                if (!var31) {
                    class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var2, 1, var3, 0, 0, false);
                }
            }
            class115.field1758++;
            class55.field688 = class28.field387;
            class292.field4454 = 0;
            class21.field261 = class207.field3140;
            class213.field3233 = 2;
            class234.field3507.method28(80, false);
            class234.field3507.method1837(28160, var7);
            class234.field3507.method1817(true, class189.field2807 + var3);
            class234.field3507.method1823(class217.field3309 + var2, (byte) -72);
        }
        if (var4 == 23) {
            class69 var33 = class187.field2788[var7];
            if (var33 != null) {
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var33.field1541[0], 1, var33.field1516[0], 0, 0, false);
                class55.field688 = class28.field387;
                class213.field3233 = 2;
                class21.field261 = class207.field3140;
                class292.field4454 = 0;
                class234.field3507.method28(229, false);
                class234.field3507.method1798(class218.field3312, arg0 ^ 0x7B);
                class123.field1924++;
                class234.field3507.method1841(arg0 ^ 0x56, var7);
                class234.field3507.method1841(112, class181.field2703);
                class234.field3507.method1817(true, class30.field402);
            }
        }
        if (var4 == 47) {
            class69 var34 = class187.field2788[var7];
            if (var34 != null) {
                class243.field3645++;
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var34.field1541[0], 1, var34.field1516[0], 0, 0, false);
                class21.field261 = class207.field3140;
                class55.field688 = class28.field387;
                class213.field3233 = 2;
                class292.field4454 = 0;
                class234.field3507.method28(217, false);
                class234.field3507.method1841(92, var7);
            }
        }
        if (var4 == 33) {
            class82.field1153++;
            class234.field3507.method28(236, false);
            class234.field3507.method1817(true, var2);
            class234.field3507.method1798(var3, 102);
            class234.field3507.method1815(96, class218.field3312);
            class234.field3507.method1817(true, var7);
            class234.field3507.method1823(class181.field2703, (byte) -111);
            class234.field3507.method1837(arg0 ^ 0x6E00, class30.field402);
            class184.field2746 = 0;
            class113.field1743 = class80.method541((byte) 96, var3);
            class60.field797 = var2;
        }
        if (var4 == 43) {
            if (var7 == 0) {
                class278.method1944(class180.field2697, var2, var3);
            } else if (var7 == 1) {
                if (class192.field2863 > 0 && class120.field1879[82] && class120.field1879[81]) {
                    class159.method1129(class217.field3309 + var2, class180.field2697, class189.field2807 + var3, (byte) -112);
                } else if (class55.method366(false, class114.field1750.field1541[0], 0, 1, 0, class114.field1750.field1516[0], var2, 0, var3, 0, 0, true)) {
                    class234.field3507.method1813(111, class82.field1155);
                    class234.field3507.method1813(119, class138.field2103);
                    class234.field3507.method1823(class284.field4297, (byte) -93);
                    class234.field3507.method1813(-120, 57);
                    class234.field3507.method1813(36, class160.field2401);
                    class234.field3507.method1813(arg0 - 98, class178.field2641);
                    class234.field3507.method1813(123, 89);
                    class234.field3507.method1823(class114.field1750.field1566, (byte) -67);
                    class234.field3507.method1823(class114.field1750.field1505, (byte) -75);
                    class234.field3507.method1813(arg0 - 87, class20.field237);
                    class234.field3507.method1813(60, 63);
                }
            }
        }
        if (var4 == 9) {
            class297.field4550++;
            class234.field3507.method28(94, false);
            class234.field3507.method1817(true, var2);
            class234.field3507.method1833(-128, var3);
            class234.field3507.method1823(var7, (byte) -61);
            class184.field2746 = 0;
            class113.field1743 = class80.method541((byte) 96, var3);
            class60.field797 = var2;
        }
        if (var4 == 60) {
            class234.field3507.method28(233, false);
            class234.field3507.method1841(arg0 + 124, var7);
            class234.field3507.method1841(64, var2);
            class234.field3507.method1806(var3, 9897);
            class90.field1338++;
            class184.field2746 = 0;
            class113.field1743 = class80.method541((byte) 96, var3);
            class60.field797 = var2;
        }
        if (var4 == 1004) {
            class213.field3233 = 2;
            class134.field2044++;
            class55.field688 = class28.field387;
            class21.field261 = class207.field3140;
            class292.field4454 = 0;
            class234.field3507.method28(155, false);
            class234.field3507.method1817(true, var7);
        }
        if (var4 == 6) {
            class91.field1349++;
            class234.field3507.method28(30, false);
            class234.field3507.method1817(true, var7);
            class234.field3507.method1815(81, var3);
            class234.field3507.method1841(67, var2);
            class184.field2746 = 0;
            class113.field1743 = class80.method541((byte) 96, var3);
            class60.field797 = var2;
        }
        if (var4 == 16) {
            class195 var35 = class241.field3592[var7];
            if (var35 != null) {
                class315.field4765++;
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var35.field1541[0], 1, var35.field1516[0], 0, 0, false);
                class292.field4454 = 0;
                class55.field688 = class28.field387;
                class213.field3233 = 2;
                class21.field261 = class207.field3140;
                class234.field3507.method28(83, false);
                class234.field3507.method1817(true, var7);
            }
        }
        if (var4 == 58) {
            field3697++;
            boolean var36 = class55.method366(false, class114.field1750.field1541[0], 0, 2, 0, class114.field1750.field1516[0], var2, 0, var3, 0, 0, false);
            if (!var36) {
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var2, 1, var3, 0, 0, false);
            }
            class21.field261 = class207.field3140;
            class292.field4454 = 0;
            class213.field3233 = 2;
            class55.field688 = class28.field387;
            class234.field3507.method28(203, false);
            class234.field3507.method1837(28160, class181.field2703);
            class234.field3507.method1817(true, var3 + class189.field2807);
            class234.field3507.method1841(97, class30.field402);
            class234.field3507.method1841(127, var7);
            class234.field3507.method1798(class218.field3312, 107);
            class234.field3507.method1823(class217.field3309 + var2, (byte) -122);
        }
        if (var4 == 18) {
            class265.field4055++;
            class234.field3507.method28(173, false);
            class234.field3507.method1806(var3, 9897);
            class234.field3507.method1823(var7, (byte) -127);
            class234.field3507.method1823(var2, (byte) -84);
            class184.field2746 = 0;
            class113.field1743 = class80.method541((byte) 96, var3);
            class60.field797 = var2;
        }
        if (var4 == 42) {
            if (class237.field3555 == 1) {
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var2, 1, var3, 0, 0, false);
            } else {
                boolean var38 = class55.method366(false, class114.field1750.field1541[0], 0, 2, 0, class114.field1750.field1516[0], var2, 0, var3, 0, 0, false);
                if (!var38) {
                    class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var2, 1, var3, 0, 0, false);
                }
            }
            class292.field4454 = 0;
            class55.field688 = class28.field387;
            class21.field261 = class207.field3140;
            class216.field3263++;
            class213.field3233 = 2;
            class234.field3507.method28(234, false);
            class234.field3507.method1817(true, var7);
            class234.field3507.method1823(class189.field2807 + var3, (byte) -102);
            class234.field3507.method1823(class217.field3309 + var2, (byte) -112);
        }
        if (var4 == 26) {
            class178.field2644++;
            class234.field3507.method28(74, false);
            class234.field3507.method1817(true, class198.field2977);
            class234.field3507.method1823(var2, (byte) -39);
            class234.field3507.method1806(var3, 9897);
            class234.field3507.method1837(28160, var7);
            class234.field3507.method1815(108, class115.field1762);
            class184.field2746 = 0;
            class113.field1743 = class80.method541((byte) 96, var3);
            class60.field797 = var2;
        }
        if (var4 == 57) {
            class69 var40 = class187.field2788[var7];
            if (var40 != null) {
                class310.field4708++;
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var40.field1541[0], 1, var40.field1516[0], 0, 0, false);
                class292.field4454 = 0;
                class55.field688 = class28.field387;
                class213.field3233 = 2;
                class21.field261 = class207.field3140;
                class234.field3507.method28(115, false);
                class234.field3507.method1833(arg0 ^ 0xFFFFFF80, class115.field1762);
                class234.field3507.method1817(true, var7);
                class234.field3507.method1823(class198.field2977, (byte) -74);
            }
        }
        if (var4 == 35) {
            class48.field595++;
            if (class237.field3555 == 1) {
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var2, 1, var3, 0, 0, false);
            } else {
                boolean var41 = class55.method366(false, class114.field1750.field1541[0], 0, 2, 0, class114.field1750.field1516[0], var2, 0, var3, 0, 0, false);
                if (!var41) {
                    class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var2, 1, var3, 0, 0, false);
                }
            }
            class21.field261 = class207.field3140;
            class213.field3233 = 2;
            class55.field688 = class28.field387;
            class292.field4454 = 0;
            class234.field3507.method28(238, false);
            class234.field3507.method1841(72, var3 + class189.field2807);
            class234.field3507.method1841(116, var7);
            class234.field3507.method1837(28160, class217.field3309 + var2);
        }
        if (var4 == 4) {
            class251.method1699(var2, var3, var5, 300);
            class234.field3507.method28(7, false);
            class234.field3507.method1841(arg0 + 99, class217.field3309 + var2);
            class195.field2918++;
            class234.field3507.method1837(28160, class189.field2807 + var3);
            class234.field3507.method1817(true, Integer.MAX_VALUE & (int) (var5 >>> 32));
        }
        if (var4 == 19) {
            class57.field718++;
            class234.field3507.method28(224, false);
            class234.field3507.method1806(var3, 9897);
            class234.field3507.method1823(var2, (byte) -56);
            class234.field3507.method1823(var7, (byte) -109);
            class184.field2746 = 0;
            class113.field1743 = class80.method541((byte) 96, var3);
            class60.field797 = var2;
        }
        if (var4 == 41) {
            class279.method1949(false);
            class329 var43 = class80.method541((byte) 96, var3);
            class76.field985 = 1;
            class30.field402 = var7;
            class181.field2703 = var2;
            class218.field3312 = var3;
            class247.method1666(var43, -126);
            class184.field2760 = "<col=ff9040>" + class325.method2219(var7, -9379).field3837 + "<col=ffffff>";
            if (class184.field2760 == null) {
                class184.field2760 = "null";
            }
            return;
        }
        if (var4 == 1006) {
            class213.field3233 = 2;
            class292.field4454 = 0;
            class60.field798++;
            class55.field688 = class28.field387;
            class21.field261 = class207.field3140;
            class234.field3507.method28(189, false);
            class234.field3507.method1841(arg0 ^ 0x43, var7);
        }
        if (var4 == 37) {
            if (var7 == 0) {
                class283.field4281 = 1;
                class278.method1944(class180.field2697, var2, var3);
            } else if (class192.field2863 > 0 && class120.field1879[82] && class120.field1879[81]) {
                class159.method1129(class217.field3309 + var2, class180.field2697, class189.field2807 + var3, (byte) -97);
            } else {
                class234.field3507.method28(32, false);
                class242.field3605++;
                class234.field3507.method1837(28160, class217.field3309 + var2);
                class234.field3507.method1841(arg0 ^ 0x6B, class189.field2807 + var3);
            }
        }
        if (var4 == 29) {
            class251.method1699(var2, var3, var5, 300);
            class234.field3507.method28(139, false);
            class257.field3890++;
            class234.field3507.method1841(62, class189.field2807 + var3);
            class234.field3507.method1823(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) -79);
            class234.field3507.method1817(true, class217.field3309 + var2);
        }
        if (var4 == 10) {
            class195 var44 = class241.field3592[var7];
            if (var44 != null) {
                class301.field4600++;
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var44.field1541[0], 1, var44.field1516[0], 0, 0, false);
                class21.field261 = class207.field3140;
                class213.field3233 = 2;
                class292.field4454 = 0;
                class55.field688 = class28.field387;
                class234.field3507.method28(49, false);
                class234.field3507.method1837(28160, var7);
            }
        }
        if (var4 == 15 || var4 == 1001) {
            class8.method38(var2, var3, var7, 89, class180.field2686[arg1]);
        }
        if (var4 == 11 && class194.field2910 == null) {
            class309.method2139(var2, arg0 ^ 0xFFFFE879, var3);
            class194.field2910 = class10.method48(var2, var3, (byte) 127);
            class247.method1666(class194.field2910, -125);
        }
        if (var4 == 45) {
            class306.field4661++;
            class251.method1699(var2, var3, var5, 300);
            class234.field3507.method28(255, false);
            class234.field3507.method1837(28160, class217.field3309 + var2);
            class234.field3507.method1817(true, class189.field2807 + var3);
            class234.field3507.method1817(true, Integer.MAX_VALUE & (int) (var5 >>> 32));
        }
        if (var4 == 22 && class251.method1699(var2, var3, var5, 300)) {
            class234.field3507.method28(54, false);
            class234.field3507.method1841(61, class181.field2703);
            class234.field3507.method1837(28160, class30.field402);
            class17.field194++;
            class234.field3507.method1798(class218.field3312, 118);
            class234.field3507.method1841(100, class217.field3309 + var2);
            class234.field3507.method1841(97, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class234.field3507.method1837(arg0 ^ 0x6E00, var3 + class189.field2807);
        }
        if (var4 == 12) {
            class195 var45 = class241.field3592[var7];
            if (var45 != null) {
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var45.field1541[0], 1, var45.field1516[0], 0, 0, false);
                class292.field4454 = 0;
                class55.field688 = class28.field387;
                class297.field4542++;
                class213.field3233 = 2;
                class21.field261 = class207.field3140;
                class234.field3507.method28(145, false);
                class234.field3507.method1837(28160, var7);
            }
        }
        if (var4 == 34 && class251.method1699(var2, var3, var5, 300)) {
            class138.field2104++;
            class234.field3507.method28(126, false);
            class234.field3507.method1823((int) (var5 >>> 32) & Integer.MAX_VALUE, (byte) -115);
            class234.field3507.method1833(arg0 - 128, class115.field1762);
            class234.field3507.method1823(class198.field2977, (byte) -39);
            class234.field3507.method1817(true, class189.field2807 + var3);
            class234.field3507.method1823(class217.field3309 + var2, (byte) -74);
        }
        if (var4 == 32) {
            class234.field3507.method28(55, false);
            class251.field3746++;
            class234.field3507.method1837(28160, var2);
            class234.field3507.method1806(var3, 9897);
            class234.field3507.method1841(71, var7);
            class184.field2746 = 0;
            class113.field1743 = class80.method541((byte) 96, var3);
            class60.field797 = var2;
        }
        if (var4 == 7) {
            class69 var46 = class187.field2788[var7];
            if (var46 != null) {
                class166.field2493++;
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var46.field1541[0], 1, var46.field1516[0], 0, 0, false);
                class213.field3233 = 2;
                class55.field688 = class28.field387;
                class292.field4454 = 0;
                class21.field261 = class207.field3140;
                class234.field3507.method28(194, false);
                class234.field3507.method1817(true, var7);
            }
        }
        if (var4 == 44) {
            class195 var47 = class241.field3592[var7];
            if (var47 != null) {
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var47.field1541[0], 1, var47.field1516[0], 0, 0, false);
                class213.field3233 = 2;
                class19.field229++;
                class292.field4454 = 0;
                class21.field261 = class207.field3140;
                class55.field688 = class28.field387;
                class234.field3507.method28(178, false);
                class234.field3507.method1817(true, var7);
            }
        }
        if (var4 == 40) {
            class69 var48 = class187.field2788[var7];
            if (var48 != null) {
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var48.field1541[0], 1, var48.field1516[0], 0, 0, false);
                class213.field3233 = 2;
                class292.field4454 = 0;
                class55.field688 = class28.field387;
                class21.field261 = class207.field3140;
                class234.field3507.method28(99, false);
                class170.field2554++;
                class234.field3507.method1823(var7, (byte) -42);
            }
        }
        if (var4 == 39) {
            class69 var49 = class187.field2788[var7];
            if (var49 != null) {
                class81.field1141++;
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var49.field1541[0], 1, var49.field1516[0], 0, 0, false);
                class55.field688 = class28.field387;
                class213.field3233 = 2;
                class21.field261 = class207.field3140;
                class292.field4454 = 0;
                class234.field3507.method28(35, false);
                class234.field3507.method1823(var7, (byte) -97);
            }
        }
        if (var4 == 59) {
            class195 var50 = class241.field3592[var7];
            if (var50 != null) {
                class55.method366(false, class114.field1750.field1541[0], 1, 2, 0, class114.field1750.field1516[0], var50.field1541[0], 1, var50.field1516[0], 0, 0, false);
                class21.field261 = class207.field3140;
                class292.field4454 = 0;
                class186.field2776++;
                class55.field688 = class28.field387;
                class213.field3233 = 2;
                class234.field3507.method28(153, false);
                class234.field3507.method1823(var7, (byte) -52);
            }
        }
        if (var4 == 1005) {
            class256.field3877++;
            class251.method1699(var2, var3, var5, 300);
            class234.field3507.method28(225, false);
            class234.field3507.method1841(112, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class234.field3507.method1837(28160, class217.field3309 + var2);
            class234.field3507.method1823(class189.field2807 + var3, (byte) -62);
        }
        if (var4 == 24) {
            class251.method1699(var2, var3, var5, 300);
            class42.field508++;
            class234.field3507.method28(117, false);
            class234.field3507.method1817(true, Integer.MAX_VALUE & (int) (var5 >>> 32));
            class234.field3507.method1823(class217.field3309 + var2, (byte) -124);
            class234.field3507.method1817(true, class189.field2807 + var3);
        }
        if (class76.field985 != 0) {
            class76.field985 = 0;
            class247.method1666(class80.method541((byte) 96, class218.field3312), -126);
        }
        if (class122.field1907) {
            class279.method1949(false);
        }
        if (class113.field1743 != null && class184.field2746 == 0) {
            class247.method1666(class113.field1743, -127);
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)Lqa;", line = 1202)
    public final class101 method1676(int arg0) {
        if (arg0 >= -15) {
            this.field3702 = (class192) null;
        }
        field3701++;
        return this.field3702.method1321((byte) -82);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)V", line = 1217)
    public final void method1677(boolean arg0) {
        if (arg0) {
            return;
        }
        this.field3705.method1692((byte) 76);
        this.field3702.method1327((byte) 93);
        this.field3695 = new class196();
        field3698++;
        this.field3704 = this.field3703;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)Lqa;", line = 1233)
    public final class101 method1678(int arg0) {
        if (arg0 != -100001) {
            field3692 = (int[]) null;
        }
        field3688++;
        return this.field3702.method1330((byte) -56);
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(I)V", line = 1268)
    public class248(int arg0) {
        this.field3704 = arg0;
        this.field3703 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3702 = new class192(var2);
    }
}
