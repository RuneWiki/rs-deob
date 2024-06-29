import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class147 {

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Lfe;")
    private class254 field2704 = new class254();

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field2700 = 0;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "[I")
    public static int[] field2695 = new int[128];

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Lcc;")
    private static class209 field2707 = class95.method669(87, "Select");

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Lcc;")
    public static class209 field2699 = field2707;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "Lfe;")
    private class254 field2708;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "[[[I")
    public static int[][][] field2702;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)I")
    public final int method1018(byte arg0) {
        int var2 = 0;
        if (arg0 > -122) {
            field2707 = null;
        }
        field2703++;
        class254 var3 = this.field2704.field4576;
        while (this.field2704 != var3) {
            var3 = var3.field4576;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V")
    public static final void method1019(int arg0, int arg1, int arg2) {
        class224.field4080 = true;
        class110.field2227 = arg0;
        class230.field4178 = arg1;
        class22.field422 = arg2;
        class235.field4230 = -1;
        class206.field3682 = -1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Lfe;")
    public final class254 method1020(int arg0) {
        if (arg0 != 4745) {
            method1027(false, -93);
        }
        field2697++;
        class254 var2 = this.field2708;
        if (this.field2704 == var2) {
            this.field2708 = null;
            return null;
        } else {
            this.field2708 = var2.field4576;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lrg;I)V")
    public static final void method1021(class227 arg0, int arg1) {
        class174.method1199(90, arg0, arg1);
        field2706++;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
    public static void method1022(byte arg0) {
        field2707 = null;
        field2695 = null;
        if (arg0 < -96) {
            field2702 = null;
            field2699 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lfe;Z)V")
    public final void method1023(class254 arg0, boolean arg1) {
        if (arg0.field4584 != null) {
            arg0.method1754(-57);
        }
        arg0.field4576 = this.field2704;
        field2698++;
        arg0.field4584 = this.field2704.field4584;
        arg0.field4584.field4576 = arg0;
        if (arg1) {
            this.field2708 = null;
        }
        arg0.field4576.field4584 = arg0;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
    public static final void method1024(byte arg0) {
        if (arg0 > -108) {
            field2702 = null;
        }
        field2694++;
        for (class19 var1 = (class19) class261.field4693.method1119(20896); var1 != null; var1 = (class19) class261.field4693.method1120(52)) {
            class25 var2 = var1.field379;
            if (class99.field1937 != var2.field466 || var2.field465 < class163.field2968) {
                var1.method269(-214950896);
            } else if (var2.field441 <= class163.field2968) {
                if (var2.field451 > 0) {
                    class163 var3 = class60.field1207[var2.field451 - 1];
                    if (var3 != null && var3.field1571 >= 0 && var3.field1571 < 13312 && var3.field1534 >= 0 && var3.field1534 < 13312) {
                        var2.method215((byte) 5, var3.field1534, class163.field2968, class94.method661(var3.field1534, 19452, var2.field466, var3.field1571) - var2.field477, var3.field1571);
                    }
                }
                if (var2.field451 < 0) {
                    int var4 = -var2.field451 - 1;
                    class108 var5;
                    if (class174.field3179 == var4) {
                        var5 = class223.field4069;
                    } else {
                        var5 = class103.field1993[var4];
                    }
                    if (var5 != null && var5.field1571 >= 0 && var5.field1571 < 13312 && var5.field1534 >= 0 && var5.field1534 < 13312) {
                        var2.method215((byte) 5, var5.field1534, class163.field2968, class94.method661(var5.field1534, 19452, var2.field466, var5.field1571) - var2.field477, var5.field1571);
                    }
                }
                var2.method210(2047, class122.field2402);
                class117.method830(class99.field1937, (int) var2.field469, (int) var2.field479, (int) var2.field455, 60, var2, var2.field468, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([Lga;IZI[BI)V")
    public static final void method1025(class170[] arg0, int arg1, boolean arg2, int arg3, byte[] arg4, int arg5) {
        if (arg3 != 103) {
            field2707 = null;
        }
        int var6 = -1;
        field2701++;
        class106 var7 = new class106(arg4);
        while (true) {
            int var8 = var7.method775((byte) 102);
            if (var8 == 0) {
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method760(255);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var9 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var7.method774((byte) 119);
                int var15 = var14 & 0x3;
                int var16 = var14 >> 2;
                int var17 = arg1 + var12;
                int var18 = arg5 + var11;
                if (var18 > 0 && var17 > 0 && var18 < 103 && var17 < 103) {
                    class170 var19 = null;
                    if (!arg2) {
                        int var20 = var13;
                        if ((class285.field5023[1][var18][var17] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg0[var20];
                        }
                    }
                    class138.method962(!arg2, var19, var13, var13, arg2, 0, var18, var6, var15, var16, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Lfe;")
    public final class254 method1026(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field2705++;
        class254 var2 = this.field2704.field4576;
        if (this.field2704 == var2) {
            this.field2708 = null;
            return null;
        } else {
            this.field2708 = var2.field4576;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZI)I")
    public static final int method1027(boolean arg0, int arg1) {
        field2696++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg0) {
            return -50;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class147() {
        this.field2704.field4576 = this.field2704;
        this.field2704.field4584 = this.field2704;
    }
}
