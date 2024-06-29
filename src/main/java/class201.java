import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class201 {

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Lke;")
    private class112 field3115;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "Lok;")
    private class41 field3112;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "Lim;")
    private class232 field3109;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Z")
    public static boolean field3105 = true;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Z")
    public static boolean field3111 = false;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3104 = null;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "Lha;")
    private class31 field3108;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "[Lpe;")
    private class262[] field3117;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lkb;ILkb;I)Lpe;")
    public final class262 method1417(class54 arg0, int arg1, class54 arg2, int arg3) {
        if (arg1 != 1) {
            this.method1419((byte) -118);
        }
        field3107++;
        return this.method1424(arg3, arg2, arg0, (byte) -110, true);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public static final void method1418(boolean arg0) {
        field3106++;
        for (int var1 = 0; var1 < class122.field1840; var1++) {
            int var2 = class147.field2179[var1];
            class161 var3 = class116.field1781[var2];
            int var4 = class183.field2900.method265(-97);
            if ((var4 & 0x8) != 0) {
                var4 += class183.field2900.method265(-95) << 8;
            }
            if ((var4 & 0x80) != 0) {
                var3.field4695 = class183.field2900.method262(11386);
                var3.field4758 = 100;
            }
            if ((var4 & 0x200) != 0) {
                var3.field4677 = class183.field2900.method267(-7803);
                var3.field4739 = class183.field2900.method260((byte) -67);
            }
            if ((var4 & 0x100) != 0) {
                int var5 = class183.field2900.method277((byte) -103);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                int[] var8 = new int[var5];
                for (int var9 = 0; var9 < var5; var9++) {
                    int var10 = class183.field2900.method260((byte) -67);
                    if (var10 == 65535) {
                        var10 = -1;
                    }
                    var6[var9] = var10;
                    var7[var9] = class183.field2900.method265(-88);
                    var8[var9] = class183.field2900.method256(-1);
                }
                class147.method1061(var8, var6, var7, var3, (byte) 108);
            }
            if ((var4 & 0x4) != 0) {
                int var11 = class183.field2900.method256(-1);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = class183.field2900.method277((byte) -103);
                class45.method383(1, var12, var11, var3);
            }
            if ((var4 & 0x10) != 0) {
                int var13 = class183.field2900.method265(-89);
                int var14 = class183.field2900.method295((byte) -87);
                var3.method1973(var14, class41.field686, var13, 0);
                var3.field4671 = class41.field686 + 300;
                var3.field4760 = class183.field2900.method295((byte) -87);
            }
            if ((var4 & 0x2) != 0) {
                int var15 = class183.field2900.method315((byte) 127);
                int var16 = class183.field2900.method265(-109);
                var3.method1973(var16, class41.field686, var15, 0);
            }
            if ((var4 & 0x40) != 0) {
                int var17 = class183.field2900.method256(-1);
                int var18 = class183.field2900.method294((byte) 105);
                boolean var19 = true;
                if (var17 == 65535) {
                    var17 = -1;
                }
                if (var17 != -1 && var3.field4732 != -1 && class250.method1700(class86.method654(var17, 120).field3166, -31).field1589 < class250.method1700(class86.method654(var3.field4732, 110).field3166, -108).field1589) {
                    var19 = false;
                }
                if (var19) {
                    var3.field4750 = (var18 & 0xFFFF) + class41.field686;
                    var3.field4660 = 0;
                    if (class41.field686 < var3.field4750) {
                        var3.field4660 = -1;
                    }
                    var3.field4711 = 0;
                    var3.field4744 = var18 >> 16;
                    var3.field4732 = var17;
                    var3.field4713 = 1;
                    if (var3.field4732 != -1 && class41.field686 == var3.field4750) {
                        int var20 = class86.method654(var3.field4732, 115).field3166;
                        if (var20 != -1) {
                            class103 var21 = class250.method1700(var20, -19);
                            if (var21 != null && var21.field1606 != null) {
                                class136.method1004(var3.field4725, 0, var3.field4709, var21, 255, false);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field4702 = class183.field2900.method282((byte) 107);
                if (var3.field4702 == 65535) {
                    var3.field4702 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field2421.method740(0)) {
                    class195.method1391(var3, 117);
                }
                var3.method1164(-11497, class175.method1250(class183.field2900.method260((byte) -67), (byte) -92));
                var3.method1970(2, var3.field2421.field1539);
                var3.field4707 = var3.field2421.field1489;
                var3.field4667 = var3.field2421.field1503;
                if (var3.field2421.method740(0)) {
                    class155.method1124(class130.field1941, (class136) null, (byte) 106, var3.field4673[0], var3.field4749[0], (class295) null, var3, 0);
                }
            }
        }
        if (!arg0) {
            field3105 = false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)Z")
    public final boolean method1419(byte arg0) {
        field3116++;
        if (this.field3108 != null) {
            return true;
        }
        if (this.field3109 == null) {
            if (this.field3115.method836(-106)) {
                return false;
            }
            this.field3109 = this.field3115.method823(255, true, false, 255, (byte) 0);
        }
        if (this.field3109.field1264) {
            return false;
        }
        this.field3108 = new class31(this.field3109.method249(256));
        if (arg0 != -99) {
            this.method1421(21);
        }
        this.field3117 = new class262[(this.field3108.field560.length - 5) / 8];
        return true;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BIIIII)V")
    public static final void method1420(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3113++;
        int var6 = class47.method396(class112.field1727, arg3, 77, class278.field4410);
        int var7 = class47.method396(class112.field1727, arg1, 107, class278.field4410);
        int var8 = class47.method396(class184.field2914, arg5, 112, class2.field42);
        int var9 = class47.method396(class184.field2914, arg4, 105, class2.field42);
        int var10 = -113 / ((arg0 + 24) / 44);
        for (int var11 = var6; var11 <= var7; var11++) {
            class173.method1240((byte) -97, var9, class55.field872[var11], arg2, var8);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public final void method1421(int arg0) {
        field3118++;
        if (this.field3117 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field3117.length; var2++) {
            if (this.field3117[var2] != null) {
                this.field3117[var2].method1759(-78);
            }
        }
        for (int var3 = 0; var3 < this.field3117.length; var3++) {
            if (this.field3117[var3] != null) {
                this.field3117[var3].method1755((byte) -81);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public static void method1422(int arg0) {
        if (arg0 != 157) {
            field3111 = false;
        }
        field3104 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)V")
    public static final void method1423(boolean arg0, int arg1) {
        field3110++;
        byte var2 = 4;
        if (arg1 != 13) {
            method1420((byte) 64, 103, -98, -43, 111, 39);
        }
        byte[][] var3 = class82.field1243;
        for (int var4 = 0; var4 < var2; var4++) {
            class102.method778(-9546);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class203.field3133[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x321438A) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0xFFF0A9) >> 14;
                            int var10 = (var7 & 0x6) >> 1;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var9 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class174.field2691.length; var13++) {
                                if (class174.field2691[var13] == var12 && var3[var13] != null) {
                                    class46.method390(var8, var5 * 8, class80.field1236, arg0, var3[var13], (var11 & 0x7) * 8, (var9 & 0x7) * 8, var10, var6 * 8, var4, arg1 - 136);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILkb;Lkb;BZ)Lpe;")
    private final class262 method1424(int arg0, class54 arg1, class54 arg2, byte arg3, boolean arg4) {
        field3114++;
        if (this.field3108 == null) {
            throw new RuntimeException();
        }
        this.field3108.field541 = arg0 * 8 + 5;
        if (this.field3108.field560.length <= this.field3108.field541) {
            throw new RuntimeException();
        } else if (this.field3117[arg0] == null) {
            int var6 = this.field3108.method300((byte) -30);
            int var7 = 91 % ((arg3 + 2) / 61);
            int var8 = this.field3108.method300((byte) -30);
            class262 var9 = new class262(arg0, arg1, arg2, this.field3115, this.field3112, var6, var8, arg4);
            this.field3117[arg0] = var9;
            return var9;
        } else {
            return this.field3117[arg0];
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lke;Lok;)V")
    public class201(class112 arg0, class41 arg1) {
        this.field3115 = arg0;
        this.field3112 = arg1;
        if (!this.field3115.method836(-124)) {
            this.field3109 = this.field3115.method823(255, true, false, 255, (byte) 0);
        }
    }
}
