import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class class90 extends class256 {

    @OriginalMember(owner = "client!od", name = "x", descriptor = "Ljd;")
    public static class86 field1833 = class122.method868("<col=ff9040>", true);

    @OriginalMember(owner = "client!od", name = "D", descriptor = "Ljd;")
    public static class86 field1839 = class122.method868("W-=hlen Sie eine Option", true);

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public static int field1841 = 0;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "[I")
    public static int[] field1843 = new int[128];

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    public int field1832;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public int field1834;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    public int field1835;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public int field1837;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public int field1840;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public int field1846;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V")
    public abstract void method664(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lgj;III)V")
    public static final void method665(class224 arg0, int arg1, int arg2, int arg3) {
        field1842++;
        if ((arg1 & 0x1) != 0) {
            int var4 = class168.field3102.method1413(arg2 ^ 0xF4C);
            int var5 = class168.field3102.method1431((byte) 65);
            int var6 = class168.field3102.method1407(255);
            int var7 = class168.field3102.field3565;
            boolean var8 = (var4 & 0x8000) != 0;
            if (arg0.field4029 != null && arg0.field4019 != null) {
                boolean var9 = false;
                long var10 = arg0.field4029.method622(-2);
                if (var5 <= 1) {
                    if (!var8 && class21.field548 == 1 || class134.field2542 == 1) {
                        var9 = true;
                    } else {
                        for (int var12 = 0; var12 < class56.field1146; var12++) {
                            if (class119.field2325[var12] == var10) {
                                var9 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var9 && class200.field3545 == 0) {
                    class230.field4180.field3565 = 0;
                    class168.field3102.method1425(0, var6, class230.field4180.field3547, -4);
                    class230.field4180.field3565 = 0;
                    int var13 = -1;
                    class86 var14;
                    if (var8) {
                        class83 var15 = class235.method1626((byte) 110, class230.field4180);
                        var4 &= 0x7FFF;
                        var13 = var15.field1620;
                        var14 = var15.field1626.method799(class230.field4180, 1);
                    } else {
                        var14 = class259.method1769(class188.method1295(class230.field4180, 1000).method589(arg2 ^ 0x242E));
                    }
                    arg0.field725 = var14.method588(-1);
                    arg0.field714 = 150;
                    arg0.field689 = var4 >> 8;
                    arg0.field698 = var4 & 0xFF;
                    if (var5 == 2) {
                        class9.method58(var13, (class86) null, class109.method783(2, new class86[] { class69.field1370, arg0.method1571(arg2 ^ 0xFFFFB72D) }), (byte) -111, var14, var8 ? 17 : 1);
                    } else if (var5 == 1) {
                        class9.method58(var13, (class86) null, class109.method783(2, new class86[] { class55.field1126, arg0.method1571(arg2 ^ 0xFFFFB72D) }), (byte) -64, var14, var8 ? 17 : 1);
                    } else {
                        class9.method58(var13, (class86) null, arg0.method1571(27804), (byte) -76, var14, var8 ? 17 : 2);
                    }
                }
            }
            class168.field3102.field3565 = var6 + var7;
        }
        if ((arg1 & 0x200) != 0) {
            arg0.field740 = class168.field3102.method1408((byte) -36);
            arg0.field728 = class168.field3102.method1408((byte) -112);
            arg0.field746 = class168.field3102.method1431((byte) 87);
            arg0.field733 = class168.field3102.method1431((byte) 51);
            arg0.field747 = class168.field3102.method1413(arg2 ^ 0xF4C) + class236.field4265;
            arg0.field697 = class168.field3102.method1383(70) + class236.field4265;
            arg0.field674 = class168.field3102.method1431((byte) 57);
            arg0.field742 = 0;
            arg0.field704 = 1;
        }
        if ((arg1 & 0x80) != 0) {
            arg0.field743 = class168.field3102.method1401(arg2 + 2080662191);
            if (arg0.field743 == 65535) {
                arg0.field743 = -1;
            }
        }
        if ((arg1 & 0x100) != 0) {
            int var16 = class168.field3102.method1389((byte) -124);
            int var17 = class168.field3102.method1389((byte) 123);
            arg0.method236(class236.field4265, false, var17, var16);
        }
        if ((arg1 & 0x400) != 0) {
            arg0.field690 = class168.field3102.method1383(54);
            int var18 = class168.field3102.method1386(-4603);
            arg0.field722 = var18 >> 16;
            arg0.field713 = 0;
            arg0.field741 = (var18 & 0xFFFF) + class236.field4265;
            if (arg0.field690 == 65535) {
                arg0.field690 = -1;
            }
            arg0.field691 = 0;
            if (class236.field4265 < arg0.field741) {
                arg0.field691 = -1;
            }
            if (arg0.field690 != -1 && class236.field4265 == arg0.field741) {
                int var19 = class219.method1547(arg0.field690, -117).field2466;
                if (var19 != -1) {
                    class122 var20 = class133.method952(var19, 127);
                    if (var20 != null && var20.field2361 != null) {
                        class168.method1212(arg0.field676, 0, class124.field2412 == arg0, var20, 1928670186, arg0.field685);
                    }
                }
            }
        }
        if (arg2 != -9295) {
            return;
        }
        if ((arg1 & 0x40) != 0) {
            arg0.field711 = class168.field3102.method1413(-11011);
            arg0.field732 = class168.field3102.method1383(72);
        }
        if ((arg1 & 0x8) != 0) {
            arg0.field725 = class168.field3102.method1376((byte) 24);
            if (arg0.field725.method611(48, 0) == 126) {
                arg0.field725 = arg0.field725.method633(1, (byte) 61);
                class58.method423(arg0.field725, false, 2, arg0.method1571(27804));
            } else if (class124.field2412 == arg0) {
                class58.method423(arg0.field725, false, 2, arg0.method1571(arg2 ^ 0xFFFFB72D));
            }
            arg0.field698 = 0;
            arg0.field689 = 0;
            arg0.field714 = 150;
        }
        if ((arg1 & 0x10) != 0) {
            int var21 = class168.field3102.method1431((byte) 84);
            byte[] var22 = new byte[var21];
            class200 var23 = new class200(var22);
            class168.field3102.method1417(var22, var21, (byte) 61, 0);
            class69.field1367[arg3] = var23;
            arg0.method1575(-111, var23);
        }
        if ((arg1 & 0x4) != 0) {
            int var24 = class168.field3102.method1389((byte) -116);
            int var25 = class168.field3102.method1407(255);
            arg0.method236(class236.field4265, false, var25, var24);
            arg0.field681 = class236.field4265 + 300;
            arg0.field737 = class168.field3102.method1431((byte) 123);
        }
        if ((arg1 & 0x20) == 0) {
            return;
        }
        int var26 = class168.field3102.method1413(-11011);
        if (var26 == 65535) {
            var26 = -1;
        }
        int var27 = class168.field3102.method1389((byte) -119);
        class228.method1592(var27, 89, arg0, var26);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIBII)V")
    public final void method666(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var6 = this.field1840 << 3;
        int var7 = (arg3 << 4) + (var6 & 0xF);
        field1838++;
        int var8 = this.field1837 << 3;
        int var9 = (arg0 << 4) + (var8 & 0xF);
        if (arg2 != -19) {
            this.method672(116, -48, 38, 8, -83, -27);
        }
        this.method672(var6, var8, var7, var9, arg4, arg1);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static void method667(byte arg0) {
        if (arg0 != -57) {
            field1844 = -109;
        }
        field1839 = null;
        field1843 = null;
        field1833 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
    public abstract void method668(int arg0, int arg1);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)V")
    public abstract void method669(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)V")
    public abstract void method670(int arg0, int arg1);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V")
    public abstract void method671(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIII)V")
    public abstract void method672(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
    public static final void method673(boolean arg0) {
        if (!arg0) {
            field1844 = 40;
        }
        field1845++;
        class263.field4665.method703((byte) 122);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)Z")
    public static final boolean method674(int arg0, byte arg1) {
        if (arg1 != -116) {
            method665((class224) null, -94, 68, 5);
        }
        field1836++;
        return ((arg0 & 0x12DE41EA) >> 28) != 0;
    }
}
