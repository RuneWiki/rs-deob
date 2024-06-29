import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class59 {

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    private int field796 = 32;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "Z")
    private boolean field807 = false;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "J")
    private long field789 = class348.method2175(-124);

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "J")
    private long field814 = 0L;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
    private int field812 = 0;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    private int field815 = 0;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    private int field813 = 0;

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    private int field820 = 0;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "[Lgv;")
    private class299[] field818 = new class299[8];

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "J")
    private long field819 = 0L;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "Z")
    private boolean field821 = true;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "[Lgv;")
    private class299[] field822 = new class299[8];

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "[[I")
    public static int[][] field802 = new int[6][];

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "Lim;")
    public static class353 field799 = new class353(17, 3);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "I")
    private int field810;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "Lgv;")
    private class299 field804;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "[I")
    public int[] field803;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method327(Component arg0) throws Exception {
        field798++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "()V")
    public void method328() {
        field801++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
    private final void method329(int arg0, int arg1) {
        field793++;
        this.field812 -= arg1;
        if (this.field812 < 0) {
            this.field812 = 0;
        }
        if (arg0 > -107) {
            this.field815 = 1;
        }
        if (this.field804 != null) {
            this.field804.method254(arg1);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public void method330(int arg0) throws Exception {
        field800++;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "()I")
    public int method331() throws Exception {
        field806++;
        return this.field811;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLgv;)V")
    public final synchronized void method332(byte arg0, class299 arg1) {
        if (arg0 <= -106) {
            this.field804 = arg1;
            field808++;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLgv;I)V")
    private final void method333(byte arg0, class299 arg1, int arg2) {
        field791++;
        if (arg0 > -113) {
            method334(75, 43, 0, 54, (byte) 100);
        }
        int var4 = arg2 >> 5;
        class299 var5 = this.field818[var4];
        if (var5 == null) {
            this.field822[var4] = arg1;
        } else {
            var5.field3905 = arg1;
        }
        this.field818[var4] = arg1;
        arg1.field3907 = arg2;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIB)V")
    public static final void method334(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field797++;
        if (class594.field8575 <= (arg3 - arg1) && class355.field4972 >= arg1 + arg3 && class535.field7467 <= arg2 - arg1 && (arg1 + arg2) <= class113.field1453) {
            class376.method2298(arg2, (byte) -102, arg1, arg0, arg3);
        } else {
            class538.method2994(-1, arg3, arg2, arg1, arg0);
        }
        if (arg4 != -59) {
            method336(43);
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
    public final synchronized void method335(int arg0) {
        if (class254.field3160 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class254.field3160.field3771[var3] == this) {
                    class254.field3160.field3771[var3] = null;
                }
                if (class254.field3160.field3771[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class254.field3160.field3773 = true;
                while (class254.field3160.field3777) {
                    class353.method2204(50L, 7806);
                }
                class254.field3160 = null;
            }
        }
        if (arg0 >= -30) {
            this.field804 = null;
        }
        field805++;
        this.method328();
        this.field807 = true;
        this.field803 = null;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
    public static final void method336(int arg0) {
        field817++;
        for (int var1 = 0; var1 < class387.field5383; var1++) {
            int var2 = class214.field2749[var1];
            class585 var3 = ((class480) class131.field1619.method3476((long) var2, (byte) 28)).field6729;
            int var4 = class342.field4758.method3045(arg0 ^ 0xD30);
            if ((var4 & 0x4) != 0) {
                var4 += class342.field4758.method3045(arg0 + 3281) << 8;
            }
            if ((var4 & 0x100) != 0) {
                int var5 = class342.field4758.method3037(true);
                var3.field343 = class342.field4758.method3045(-127);
                var3.field370 = class342.field4758.method3041((byte) 101);
                var3.field396 = var5 & 0x7FFF;
                var3.field375 = (var5 & 0x8000) != 0;
                var3.field347 = var3.field396 + var3.field343 + class7.field61;
            }
            if ((var4 & 0x20) != 0) {
                var3.field8461 = class342.field4758.method3037(true);
                var3.field8457 = class342.field4758.method3066((byte) 101);
            }
            if ((var4 & 0x2) != 0) {
                int var6 = class342.field4758.method3059(109);
                int var7 = class342.field4758.method3064((byte) -127);
                var3.method139(true, class7.field61, var7, var6);
                var3.field346 = class7.field61 + 300;
                var3.field384 = class342.field4758.method3045(-126);
            }
            if ((var4 & 0x800) != 0) {
                int var8 = class342.field4758.method3059(90);
                int var9 = class342.field4758.method3035(-957401312);
                var3.method139(true, class7.field61, var9, var8);
            }
            if ((var4 & 0x1) != 0) {
                var3.field385 = class342.field4758.method3077(arg0 ^ 0x5C4F);
                var3.field409 = 100;
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field8478.method3615((byte) -126)) {
                    class640.method3689(var3, 2015625216);
                }
                var3.method3374(120, class579.field8053.method3623(class342.field4758.method3066((byte) 101), (byte) -110));
                var3.method137(var3.field8478.field9094, 66);
                var3.field334 = var3.field8478.field9080 << 3;
                if (var3.field8478.method3615((byte) -128)) {
                    class318.method1980(var3.field6358, (byte) -62, 0, var3, var3.field417[0], null, null, var3.field419[0]);
                }
            }
            if ((var4 & 0x1000) != 0) {
                int var10 = class342.field4758.method3041((byte) 100);
                int[] var11 = new int[var10];
                int[] var12 = new int[var10];
                int[] var13 = new int[var10];
                for (int var14 = 0; var14 < var10; var14++) {
                    int var15 = class342.field4758.method3039((byte) 127);
                    if (var15 == 65535) {
                        var15 = -1;
                    }
                    var11[var14] = var15;
                    var12[var14] = class342.field4758.method3064((byte) -127);
                    var13[var14] = class342.field4758.method3066((byte) 101);
                }
                class174.method1070(var11, var13, 56, var3, var12);
            }
            if ((var4 & 0x8) != 0) {
                var3.field399 = class342.field4758.method3066((byte) 101);
                if (var3.field399 == 65535) {
                    var3.field399 = -1;
                }
            }
            if ((var4 & 0x2000) != 0) {
                int var16 = class342.field4758.method3090(arg0 ^ 0xD28);
                if (var16 == 65535) {
                    var16 = -1;
                }
                int var17 = class342.field4758.method3048(-4);
                int var18 = class342.field4758.method3041((byte) 108);
                var3.method140(-53, var17, true, var16, var18);
            }
            if ((var4 & 0x80) != 0) {
                int var19 = class342.field4758.method3037(true);
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var20 = class342.field4758.method3048(arg0 ^ 0xD4E);
                int var21 = class342.field4758.method3041((byte) 125);
                var3.method140(-97, var20, false, var19, var21);
            }
            if ((var4 & 0x200) != 0) {
                var3.field330 = class342.field4758.method3051((byte) 73);
                var3.field353 = class342.field4758.method3033((byte) 127);
                var3.field382 = class342.field4758.method3067(0);
                var3.field395 = class342.field4758.method3051((byte) 101);
                var3.field397 = class342.field4758.method3090(-117) + class7.field61;
                var3.field345 = class342.field4758.method3039((byte) 127) + class7.field61;
                var3.field336 = class342.field4758.method3035(-957401312);
                var3.field424 = 0;
                var3.field330 += var3.field419[0];
                var3.field421 = 1;
                var3.field395 += var3.field417[0];
                var3.field353 += var3.field417[0];
                var3.field382 += var3.field419[0];
            }
            if ((var4 & 0x400) != 0) {
                var3.field322 = class342.field4758.method3034(arg0 + 21757);
                var3.field406 = class342.field4758.method3034(arg0 ^ 0xFFFFB51D);
                var3.field371 = class342.field4758.method3067(0);
                var3.field362 = (byte) class342.field4758.method3041((byte) 110);
                var3.field323 = class7.field61 + class342.field4758.method3066((byte) 101);
                var3.field402 = class7.field61 + class342.field4758.method3037(true);
            }
            if ((var4 & 0x10) != 0) {
                int var22 = class342.field4758.method3090(-72);
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = class342.field4758.method3064((byte) -88);
                class496.method2785(var23, var22, -3, var3);
            }
        }
        if (arg0 != -3406) {
            field809 = 42;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method337(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field788++;
        int var8 = 101 % ((arg4 - 39) / 34);
        int var9 = class69.method398((byte) 118, arg5, class113.field1453, class535.field7467);
        int var10 = class69.method398((byte) 78, arg7, class113.field1453, class535.field7467);
        int var11 = class69.method398((byte) 29, arg1, class355.field4972, class594.field8575);
        int var12 = class69.method398((byte) -119, arg6, class355.field4972, class594.field8575);
        int var13 = class69.method398((byte) -118, arg5 + arg3, class113.field1453, class535.field7467);
        int var14 = class69.method398((byte) -19, arg7 - arg3, class113.field1453, class535.field7467);
        for (int var15 = var9; var15 < var13; var15++) {
            class373.method2275((byte) -9, var12, arg2, var11, class256.field3173[var15]);
        }
        for (int var16 = var10; var16 > var14; var16--) {
            class373.method2275((byte) -9, var12, arg2, var11, class256.field3173[var16]);
        }
        int var17 = class69.method398((byte) 121, arg1 + arg3, class355.field4972, class594.field8575);
        int var18 = class69.method398((byte) -128, arg6 - arg3, class355.field4972, class594.field8575);
        for (int var19 = var13; var19 <= var14; var19++) {
            int[] var20 = class256.field3173[var19];
            class373.method2275((byte) -9, var17, arg2, var11, var20);
            class373.method2275((byte) -9, var18, arg0, var17, var20);
            class373.method2275((byte) -9, var12, arg2, var18, var20);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([II)V")
    private final void method338(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class85.field1155) {
            var3 = arg1 << 1;
        }
        class205.method1312(arg0, 0, var3);
        this.field812 -= arg1;
        if (this.field804 != null && this.field812 <= 0) {
            this.field812 += class10.field98 >> 4;
            class626.method3614((byte) -122, this.field804);
            this.method333((byte) -121, this.field804, this.field804.method1351());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class299 var10 = null;
                        class299 var11 = this.field822[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class366 var12 = var11.field3906;
                                if (var12 == null || var12.field5108 <= var8) {
                                    var11.field3908 = true;
                                    int var13 = var11.method258();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field5108 += var13;
                                    }
                                    if (var4 >= this.field796) {
                                        break label107;
                                    }
                                    class299 var14 = var11.method259();
                                    if (var14 != null) {
                                        int var15 = var11.field3907;
                                        while (var14 != null) {
                                            this.method333((byte) -120, var14, var15 * var14.method1351() >> 8);
                                            var14 = var11.method249();
                                        }
                                    }
                                    class299 var16 = var11.field3905;
                                    var11.field3905 = null;
                                    if (var10 == null) {
                                        this.field822[var7] = var16;
                                    } else {
                                        var10.field3905 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field818[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3905;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class299 var18 = this.field822[var17];
                this.field822[var17] = this.field818[var17] = null;
                while (var18 != null) {
                    class299 var19 = var18.field3905;
                    var18.field3905 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field812 < 0) {
            this.field812 = 0;
        }
        if (this.field804 != null) {
            this.field804.method252(arg0, 0, arg1);
        }
        this.field789 = class348.method2175(-122);
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V")
    public final synchronized void method339(int arg0) {
        field794++;
        if (this.field807) {
            return;
        }
        long var2 = class348.method2175(-123);
        try {
            if (this.field789 + 500000L < var2) {
                this.field789 = var2 - 500000L;
            }
            while ((this.field789 + 5000L) < var2) {
                this.method329(-122, 256);
                this.field789 += (256000 / class10.field98);
            }
        } catch (Exception var7) {
            this.field789 = var2;
        }
        if (this.field803 == null) {
            return;
        }
        try {
            if (this.field814 != 0L) {
                if (var2 < this.field814) {
                    return;
                }
                this.method330(this.field811);
                this.field814 = 0L;
                this.field821 = true;
            }
            int var4 = this.method331();
            if (this.field815 < (this.field813 - var4)) {
                this.field815 = this.field813 - var4;
            }
            int var5 = this.field816 + this.field810;
            if (arg0 < var5 + 256) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field811) {
                this.field811 += 1024;
                if (this.field811 > 16384) {
                    this.field811 = 16384;
                }
                this.method328();
                this.method330(this.field811);
                var4 = 0;
                this.field821 = true;
                if (this.field811 < (var5 + 256)) {
                    var5 = this.field811 - 256;
                    this.field810 = var5 - this.field816;
                }
            }
            while (var4 < var5) {
                this.method338(this.field803, 256);
                var4 += 256;
                this.method342();
            }
            if (this.field819 < var2) {
                if (this.field821) {
                    this.field821 = false;
                } else if (this.field815 == 0 && this.field820 == 0) {
                    this.method328();
                    this.field814 = var2 + 2000L;
                    return;
                } else {
                    this.field810 = Math.min(this.field820, this.field815);
                    this.field820 = this.field815;
                }
                this.field815 = 0;
                this.field819 = var2 + 2000L;
            }
            this.field813 = var4;
        } catch (Exception var6) {
            this.method328();
            this.field814 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V")
    public static void method340(int arg0) {
        if (arg0 != 256) {
            field802 = null;
        }
        field799 = null;
        field802 = null;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "()V")
    public void method341() throws Exception {
        field790++;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "()V")
    public void method342() throws Exception {
        field792++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public final synchronized void method343(byte arg0) {
        this.field821 = true;
        if (arg0 > -50) {
            method337(112, -78, -89, -59, (byte) -80, -72, 13, 35);
        }
        field795++;
        try {
            this.method341();
        } catch (Exception var2) {
            this.method328();
            this.field814 = class348.method2175(-121) + 2000L;
        }
    }
}
