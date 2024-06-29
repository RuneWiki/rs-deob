import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class62 {

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    private int field1030 = 32;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "J")
    private long field1036 = class7.method55(0);

    @OriginalMember(owner = "client!id", name = "G", descriptor = "Z")
    private boolean field1056 = true;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "[Lge;")
    private class148[] field1052 = new class148[8];

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    private int field1057 = 0;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "J")
    private long field1055 = 0L;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    private int field1058 = 0;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    private int field1063 = 0;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "[Lge;")
    private class148[] field1064 = new class148[8];

    @OriginalMember(owner = "client!id", name = "N", descriptor = "J")
    private long field1062 = 0L;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    private int field1051 = 0;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field1041 = 0;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Lhh;")
    public static class163 field1040 = class137.method1065("Wordpack geladen)3", 17);

    @OriginalMember(owner = "client!id", name = "x", descriptor = "[Lhh;")
    public static class163[] field1047 = new class163[500];

    @OriginalMember(owner = "client!id", name = "D", descriptor = "Z")
    public static boolean field1053 = true;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    private int field1050;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "Lge;")
    private class148 field1044;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "[I")
    public static int[] field1025;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "[I")
    public int[] field1046;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
    public void method422() throws Exception {
        field1061++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public final synchronized void method423(byte arg0) {
        if (class9.field158 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class9.field158.field2067[var3] == this) {
                    class9.field158.field2067[var3] = null;
                }
                if (class9.field158.field2067[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class9.field158.field2058 = true;
                while (class9.field158.field2061) {
                    class107.method866(arg0 ^ 0xFFFFFFE2, 50L);
                }
                class9.field158 = null;
            }
        }
        field1054++;
        this.method439();
        if (arg0 != -30) {
            this.method432((int[]) null, 123);
        }
        this.field1046 = null;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "()V")
    public void method424() throws Exception {
        field1026++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public void method425(int arg0) throws Exception {
        field1038++;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
    public static final void method426(byte arg0) {
        int var1 = -81 % ((arg0 - 44) / 40);
        field1024++;
        if (class226.field4088 > 0) {
            class183.method1356(true);
        } else {
            class20.field322 = class188.field3443;
            class188.field3443 = null;
            class174.method1292(40, true);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLpa;Lpa;)V")
    public static final void method427(byte arg0, class123 arg1, class123 arg2) {
        int var3 = 61 / ((arg0 + 3) / 33);
        class43.field739 = class116.method929(arg2, arg1, class45.field757, 61, 0);
        class36.field613 = (class184) class43.field739;
        field1037++;
        class12.field192 = class116.method929(arg2, arg1, class59.field976, 89, 0);
        class216.field3932 = class116.method929(arg2, arg1, class58.field947, 40, 0);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public final void method428(int arg0) {
        field1033++;
        if (arg0 != 25297) {
            this.method437((byte) 83, -106);
        }
        this.field1056 = true;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIILta;Lta;IIJ)V")
    public static final void method429(int arg0, int arg1, int arg2, int arg3, class165 arg4, class165 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class159 var10 = new class159();
        var10.field2920 = arg8;
        var10.field2927 = arg1 * 128 + 64;
        var10.field2929 = arg2 * 128 + 64;
        var10.field2936 = arg3;
        var10.field2930 = arg4;
        var10.field2932 = arg5;
        var10.field2935 = arg6;
        var10.field2928 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class259.field4542[var11][arg1][arg2] == null) {
                class259.field4542[var11][arg1][arg2] = new class144(var11, arg1, arg2);
            }
        }
        class259.field4542[arg0][arg1][arg2].field2731 = var10;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
    public final synchronized void method430(int arg0) {
        field1034++;
        if (this.field1046 == null) {
            return;
        }
        if (arg0 != -19683) {
            method431(27);
        }
        long var2 = class7.method55(arg0 ^ 0xFFFFB31D);
        try {
            if (this.field1062 != 0L) {
                if (this.field1062 > var2) {
                    return;
                }
                this.method425(this.field1059);
                this.field1056 = true;
                this.field1062 = 0L;
            }
            int var4 = this.method442();
            int var5 = this.field1060 + this.field1050;
            if (this.field1051 - var4 > this.field1057) {
                this.field1057 = this.field1051 - var4;
            }
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field1059 < var5 + 256) {
                var4 = 0;
                this.field1059 += 1024;
                if (this.field1059 > 16384) {
                    this.field1059 = 16384;
                }
                this.method439();
                this.method425(this.field1059);
                if (this.field1059 < var5 + 256) {
                    var5 = this.field1059 - 256;
                    this.field1050 = var5 - this.field1060;
                }
                this.field1056 = true;
            }
            while (var4 < var5) {
                this.method432(this.field1046, 256);
                this.method422();
                var4 += 256;
            }
            if (this.field1055 < var2) {
                if (this.field1056) {
                    this.field1056 = false;
                } else if (this.field1057 == 0 && this.field1063 == 0) {
                    this.method439();
                    this.field1062 = var2 + 2000L;
                    return;
                } else {
                    this.field1050 = Math.min(this.field1063, this.field1057);
                    this.field1063 = this.field1057;
                }
                this.field1055 = var2 + 2000L;
                this.field1057 = 0;
            }
            this.field1051 = var4;
        } catch (Exception var7) {
            this.method439();
            this.field1062 = var2 + 2000L;
        }
        try {
            if (this.field1036 + 500000L < var2) {
                var2 = this.field1036;
            }
            while (var2 > this.field1036 + 5000L) {
                this.method437((byte) -36, 256);
                this.field1036 += (long) (256000 / class255.field4454);
            }
        } catch (Exception var6) {
            this.field1036 = var2;
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
    public static final void method431(int arg0) {
        field1042++;
        for (class250 var1 = (class250) class143.field2708.method1017(125); var1 != null; var1 = (class250) class143.field2708.method1016((byte) -31)) {
            if (var1.field4401 > 0) {
                var1.field4401--;
            }
            if (var1.field4401 != 0) {
                if (var1.field4387 > 0) {
                    var1.field4387--;
                }
                if (var1.field4387 == 0 && var1.field4396 >= 1 && var1.field4397 >= 1 && var1.field4396 <= 102 && var1.field4397 <= 102 && (var1.field4394 < 0 || class75.method546(var1.field4388, var1.field4394, (byte) 77))) {
                    class165.method1239(var1.field4398, var1.field4396, arg0 ^ 0xFFFFFF95, var1.field4391, var1.field4384, var1.field4397, var1.field4394, var1.field4388);
                    var1.field4387 = -1;
                    if (var1.field4394 == var1.field4392 && var1.field4392 == -1) {
                        var1.method1063(73);
                    } else if (var1.field4394 == var1.field4392 && var1.field4393 == var1.field4384 && var1.field4390 == var1.field4388) {
                        var1.method1063(120);
                    }
                }
            } else if (var1.field4392 < 0 || class75.method546(var1.field4390, var1.field4392, (byte) 124)) {
                class165.method1239(var1.field4398, var1.field4396, -62, var1.field4391, var1.field4393, var1.field4397, var1.field4392, var1.field4390);
                var1.method1063(arg0 ^ 0x4E);
            }
        }
        if (arg0 != 0) {
            method427((byte) 30, (class123) null, (class123) null);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([II)V")
    private final void method432(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class12.field187) {
            var3 = arg1 << 1;
        }
        class241.method1668(arg0, 0, var3);
        this.field1058 -= arg1;
        if (this.field1044 != null && this.field1058 <= 0) {
            this.field1058 += class255.field4454 >> 4;
            class133.method1048(0, this.field1044);
            this.method435(this.field1044.method236(), this.field1044, false);
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
                        class148 var10 = null;
                        class148 var11 = this.field1064[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class53 var12 = var11.field2797;
                                if (var12 == null || var12.field881 <= var8) {
                                    var11.field2798 = true;
                                    int var13 = var11.method208();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field881 += var13;
                                    }
                                    if (var4 >= this.field1030) {
                                        break label107;
                                    }
                                    class148 var14 = var11.method212();
                                    if (var14 != null) {
                                        int var15 = var11.field2800;
                                        while (var14 != null) {
                                            this.method435(var15 * var14.method236() >> 8, var14, false);
                                            var14 = var11.method229();
                                        }
                                    }
                                    class148 var16 = var11.field2799;
                                    var11.field2799 = null;
                                    if (var10 == null) {
                                        this.field1064[var7] = var16;
                                    } else {
                                        var10.field2799 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1052[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2799;
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
                class148 var18 = this.field1064[var17];
                this.field1064[var17] = this.field1052[var17] = null;
                while (var18 != null) {
                    class148 var19 = var18.field2799;
                    var18.field2799 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1058 < 0) {
            this.field1058 = 0;
        }
        if (this.field1044 != null) {
            this.field1044.method218(arg0, 0, arg1);
        }
        this.field1036 = class7.method55(0);
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
    public static final void method433(int arg0) {
        field1032++;
        if (!class130.field2530) {
            class202.field3647 = 1;
            field1047[0] = class265.field4596;
            class4.field76[0] = 1006;
            class60.field993[0] = class170.field3120;
        }
        if (class193.field3521 != -1) {
            class96.method763(class193.field3521, (byte) 46);
        }
        for (int var1 = 0; var1 < class52.field880; var1++) {
            if (class110.field2086[var1]) {
                class91.field1671[var1] = true;
            }
            class87.field1619[var1] = class110.field2086[var1];
            class110.field2086[var1] = false;
        }
        class125.field2404 = -1;
        class26.field411 = -1;
        class165.field3043 = null;
        if (arg0 != 256) {
            method438(true);
        }
        class164.field3030 = class227.field4092;
        if (class193.field3521 != -1) {
            class52.field880 = 0;
            class17.method118(class233.field4160, 0, 0, 0, class193.field3521, class205.field3706, -1, 0, (byte) 125);
        }
        class206.method1480();
        class140.method1079((byte) 49);
        if (class130.field2530) {
            class217.method1545(-120);
        } else if (class125.field2404 != -1) {
            class152.method1129((byte) 68, class125.field2404, class26.field411);
        }
        if (class129.field2515 == 3) {
            for (int var2 = 0; var2 < class52.field880; var2++) {
                if (class87.field1619[var2]) {
                    class206.method1461(class116.field2197[var2], class236.field4216[var2], class252.field4416[var2], class82.field1590[var2], 16711935, 128);
                } else if (class91.field1671[var2]) {
                    class206.method1461(class116.field2197[var2], class236.field4216[var2], class252.field4416[var2], class82.field1590[var2], 16711680, 128);
                }
            }
        }
        class228.method1590(class20.field323, class52.field877, true, class235.field4203.field3633, class235.field4203.field3615);
        class52.field877 = 0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lge;I)V")
    public final synchronized void method434(class148 arg0, int arg1) {
        field1048++;
        if (arg1 != 0) {
            this.method439();
        }
        this.field1044 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILge;Z)V")
    private final void method435(int arg0, class148 arg1, boolean arg2) {
        field1028++;
        int var4 = arg0 >> 5;
        class148 var5 = this.field1052[var4];
        if (arg2) {
            method440(-80);
        }
        if (var5 == null) {
            this.field1064[var4] = arg1;
        } else {
            var5.field2799 = arg1;
        }
        this.field1052[var4] = arg1;
        arg1.field2800 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method436(Component arg0) throws Exception {
        field1049++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)V")
    private final void method437(byte arg0, int arg1) {
        if (arg0 != -36) {
            return;
        }
        field1043++;
        this.field1058 -= arg1;
        if (this.field1058 < 0) {
            this.field1058 = 0;
        }
        if (this.field1044 != null) {
            this.field1044.method202(arg1);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V")
    public static final void method438(boolean arg0) {
        if (!arg0) {
            method440(102);
        }
        class169.field3096.method120((byte) -98);
        field1031++;
        class115.field2190.method120((byte) -122);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "()V")
    public void method439() {
        field1039++;
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(I)V")
    public static void method440(int arg0) {
        int var1 = -119 / ((23 - arg0) / 45);
        field1047 = null;
        field1040 = null;
        field1025 = null;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V")
    public final synchronized void method441(byte arg0) {
        this.field1056 = true;
        try {
            this.method424();
        } catch (Exception var2) {
            this.method439();
            this.field1062 = class7.method55(0) + 2000L;
        }
        if (arg0 > -94) {
            field1041 = 30;
        }
        field1027++;
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "()I")
    public int method442() throws Exception {
        field1029++;
        return this.field1059;
    }
}
