import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class164 {

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    private int field2613 = 0;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "[Lec;")
    public class45[] field2610;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public int field2598;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "[Lui;")
    public static class257[] field2601 = new class257[14];

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "[I")
    public static int[] field2603 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "J")
    private long field2591;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "Lem;")
    public static class285 field2602;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "Lec;")
    private class45 field2592;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "Lec;")
    private class45 field2615;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Lec;", line = 9)
    public final class45 method1265(int arg0) {
        this.field2613 = 0;
        if (arg0 < 32) {
            return (class45) null;
        } else {
            field2593++;
            return this.method1277((byte) -101);
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V", line = 25)
    public final void method1266(int arg0) {
        for (int var2 = arg0; var2 < this.field2598; var2++) {
            class45 var3 = this.field2610[var2];
            while (true) {
                class45 var4 = var3.field708;
                if (var3 == var4) {
                    break;
                }
                var4.method330(15);
            }
        }
        this.field2592 = null;
        field2604++;
        this.field2615 = null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V", line = 54)
    public static final void method1267(byte arg0) {
        field2599++;
        class87.field1490.method2327(1);
        if (arg0 != -63) {
            method1275(58);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IJ)Lec;", line = 69)
    public final class45 method1268(int arg0, long arg1) {
        this.field2591 = arg1;
        field2600++;
        class45 var4 = this.field2610[(int) ((long) (this.field2598 - 1) & arg1)];
        int var5 = 109 / ((52 - arg0) / 39);
        for (this.field2592 = var4.field708; this.field2592 != var4; this.field2592 = this.field2592.field708) {
            if (this.field2592.field698 == arg1) {
                class45 var6 = this.field2592;
                this.field2592 = this.field2592.field708;
                return var6;
            }
        }
        this.field2592 = null;
        return null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[Lec;)I", line = 98)
    public final int method1269(int arg0, class45[] arg1) {
        field2609++;
        int var3 = 0;
        int var4 = -78 / ((arg0 + 67) / 44);
        for (int var5 = 0; var5 < this.field2598; var5++) {
            class45 var6 = this.field2610[var5];
            for (class45 var7 = var6.field708; var7 != var6; var7 = var7.field708) {
                arg1[var3++] = var7;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBIIII)V", line = 129)
    public static final void method1270(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field2608++;
        int var6 = arg2 - arg3;
        int var7 = arg5 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class29.method195(arg4, arg0, true, arg3, arg5);
            }
        } else if (var7 == 0) {
            class223.method1696(arg3, arg0, (byte) -12, arg2, arg4);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (class74.field1269 > arg3) {
                var10 = class74.field1269;
                var11 = var9 + (class74.field1269 * var8 >> 12);
            } else if (arg3 > class355.field5640) {
                var10 = class355.field5640;
                var11 = (class355.field5640 * var8 >> 12) + var9;
            } else {
                var10 = arg3;
                var11 = arg4;
            }
            if (arg1 < 60) {
                field2601 = (class257[]) null;
            }
            if (var11 < class296.field4758) {
                var11 = class296.field4758;
                var10 = (class296.field4758 - var9 << 12) / var8;
            } else if (var11 > class273.field4522) {
                var11 = class273.field4522;
                var10 = (class273.field4522 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (class74.field1269 > arg2) {
                var12 = (class74.field1269 * var8 >> 12) + var9;
                var13 = class74.field1269;
            } else if (class355.field5640 < arg2) {
                var13 = class355.field5640;
                var12 = (class355.field5640 * var8 >> 12) + var9;
            } else {
                var13 = arg2;
                var12 = arg5;
            }
            if (var12 < class296.field4758) {
                var12 = class296.field4758;
                var13 = (class296.field4758 - var9 << 12) / var8;
            } else if (var12 > class273.field4522) {
                var13 = (class273.field4522 - var9 << 12) / var8;
                var12 = class273.field4522;
            }
            class198.method1526(var10, var11, var13, var12, arg0, (byte) -70);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V", line = 232)
    public static final void method1271(int arg0, int arg1) {
        class255.field4296 = -1;
        class226.field3727 = 100;
        field2590++;
        if (arg1 != -2541) {
            method1275(-57);
        }
        class248.field4048 = 3;
        class74.field1256 = arg0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILth;)V", line = 246)
    public static final void method1272(int arg0, class57 arg1) {
        field2597++;
        class234.field3887 = arg1.method483(-1, "p11_full");
        class109.field1799 = arg1.method483(arg0 - 3017389, "p12_full");
        class57.field977 = arg1.method483(arg0 - 3017389, "b12_full");
        class172.field2752 = arg1.method483(arg0 ^ 0xFFD1F553, "hitmarks");
        class12.field105 = arg1.method483(-1, "hitbar_default");
        class210.field3323 = arg1.method483(-1, "headicons_pk");
        class63.field1131 = arg1.method483(-1, "headicons_prayer");
        class327.field5200 = arg1.method483(arg0 - 3017389, "hint_headicons");
        class54.field894 = arg1.method483(-1, "hint_mapmarkers");
        class190.field3050 = arg1.method483(arg0 ^ 0xFFD1F553, "mapflag");
        if (arg0 != 3017388) {
            return;
        }
        class50.field790 = arg1.method483(-1, "cross");
        class200.field3191 = arg1.method483(-1, "mapdots");
        class234.field3885 = arg1.method483(-1, "scrollbar");
        class116.field1938 = arg1.method483(arg0 ^ 0xFFD1F553, "name_icons");
        class10.field82 = arg1.method483(-1, "floorshadows");
        class131.field2225 = arg1.method483(-1, "compass");
        class113.field1851 = arg1.method483(-1, "hint_mapedge");
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IJLec;)V", line = 273)
    public final void method1273(int arg0, long arg1, class45 arg2) {
        if (arg2.field699 != null) {
            arg2.method330(arg0 ^ 0xE);
        }
        field2606++;
        class45 var5 = this.field2610[(int) ((long) (this.field2598 - 1) & arg1)];
        if (arg0 != 1) {
            return;
        }
        arg2.field708 = var5;
        arg2.field699 = var5.field699;
        arg2.field699.field708 = arg2;
        arg2.field708.field699 = arg2;
        arg2.field698 = arg1;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)I", line = 296)
    public final int method1274(byte arg0) {
        field2594++;
        if (arg0 <= 117) {
            this.method1268(58, -57L);
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2598; var3++) {
            class45 var4 = this.field2610[var3];
            class45 var5 = var4.field708;
            while (var4 != var5) {
                var5 = var5.field708;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V", line = 328)
    public static void method1275(int arg0) {
        field2603 = null;
        if (arg0 >= -124) {
            method1267((byte) -25);
        }
        field2601 = null;
        field2602 = null;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)Z", line = 340)
    public static final boolean method1276(int arg0, int arg1) {
        field2614++;
        if (arg1 < 0) {
            return false;
        } else if (arg0 == -16563) {
            int var2 = class51.field810[arg1];
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1010;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)Lec;", line = 364)
    public final class45 method1277(byte arg0) {
        field2596++;
        if (arg0 >= -100) {
            this.field2591 = -115L;
        }
        if (this.field2613 > 0 && this.field2610[this.field2613 - 1] != this.field2615) {
            class45 var2 = this.field2615;
            this.field2615 = var2.field708;
            return var2;
        }
        class45 var3;
        do {
            if (this.field2613 >= this.field2598) {
                return null;
            }
            var3 = this.field2610[this.field2613++].field708;
        } while (this.field2610[this.field2613 - 1] == var3);
        this.field2615 = var3.field708;
        return var3;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)I", line = 396)
    public final int method1278(boolean arg0) {
        field2612++;
        if (arg0) {
            field2602 = (class285) null;
        }
        return this.field2598;
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V", line = 418)
    public static final void method1279(int arg0) {
        if (arg0 != 3790) {
            field2603 = (int[]) null;
        }
        field2611++;
        class292.field4729.method2327(1);
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(ILth;)V", line = 429)
    public static final void method1280(int arg0, class57 arg1) {
        field2607++;
        class348.field5533 = arg1;
        if (arg0 != -23734) {
            field2602 = (class285) null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)Lec;", line = 445)
    public final class45 method1281(int arg0) {
        field2605++;
        if (arg0 < 109) {
            this.field2610 = (class45[]) null;
        }
        if (this.field2592 == null) {
            return null;
        }
        class45 var2 = this.field2610[(int) ((long) (this.field2598 - 1) & this.field2591)];
        while (this.field2592 != var2) {
            if (this.field2592.field698 == this.field2591) {
                class45 var3 = this.field2592;
                this.field2592 = this.field2592.field708;
                return var3;
            }
            this.field2592 = this.field2592.field708;
        }
        this.field2592 = null;
        return null;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(I)V", line = 475)
    public class164(int arg0) {
        this.field2610 = new class45[arg0];
        this.field2598 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class45 var3 = this.field2610[var2] = new class45();
            var3.field699 = var3;
            var3.field708 = var3;
        }
    }
}
