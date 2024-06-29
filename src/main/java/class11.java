import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class11 {

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    private int field174 = 32;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "J")
    private long field173 = class154.method1172((byte) 120);

    @OriginalMember(owner = "client!em", name = "I", descriptor = "J")
    private long field207 = 0L;

    @OriginalMember(owner = "client!em", name = "D", descriptor = "J")
    private long field202 = 0L;

    @OriginalMember(owner = "client!em", name = "M", descriptor = "I")
    private int field211 = 0;

    @OriginalMember(owner = "client!em", name = "N", descriptor = "[Lvl;")
    private class80[] field212 = new class80[8];

    @OriginalMember(owner = "client!em", name = "Q", descriptor = "[Lvl;")
    private class80[] field215 = new class80[8];

    @OriginalMember(owner = "client!em", name = "O", descriptor = "I")
    private int field213 = 0;

    @OriginalMember(owner = "client!em", name = "R", descriptor = "Z")
    private boolean field216 = true;

    @OriginalMember(owner = "client!em", name = "J", descriptor = "I")
    private int field208 = 0;

    @OriginalMember(owner = "client!em", name = "G", descriptor = "I")
    private int field205 = 0;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "Ljava/lang/String;")
    public static String field176 = "Continue";

    @OriginalMember(owner = "client!em", name = "S", descriptor = "I")
    public static int field217 = 0;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "Lik;")
    public static class259 field184 = new class259(50);

    @OriginalMember(owner = "client!em", name = "U", descriptor = "Z")
    public static boolean field219 = true;

    @OriginalMember(owner = "client!em", name = "T", descriptor = "I")
    public static int field218 = 0;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!em", name = "t", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!em", name = "u", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!em", name = "w", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!em", name = "x", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!em", name = "y", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!em", name = "z", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!em", name = "A", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!em", name = "B", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!em", name = "E", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "client!em", name = "H", descriptor = "I")
    public int field206;

    @OriginalMember(owner = "client!em", name = "K", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!em", name = "L", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!em", name = "P", descriptor = "I")
    public int field214;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "Lvl;")
    private class80 field190;

    @OriginalMember(owner = "client!em", name = "C", descriptor = "[I")
    public int[] field201;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V", line = 4)
    public final synchronized void method83(byte arg0) {
        field197++;
        if (this.field201 == null) {
            return;
        }
        if (arg0 <= 94) {
            this.field202 = 35L;
        }
        long var2 = class154.method1172((byte) 121);
        try {
            if (this.field202 != 0L) {
                if (this.field202 > var2) {
                    return;
                }
                this.method98(this.field214);
                this.field202 = 0L;
                this.field216 = true;
            }
            int var4 = this.method94();
            int var5 = this.field206 + this.field204;
            if (this.field205 - var4 > this.field208) {
                this.field208 = this.field205 - var4;
            }
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (this.field214 < (var5 + 256)) {
                this.field214 += 1024;
                if (this.field214 > 16384) {
                    this.field214 = 16384;
                }
                var4 = 0;
                this.method88();
                this.method98(this.field214);
                this.field216 = true;
                if (this.field214 < (var5 + 256)) {
                    var5 = this.field214 - 256;
                    this.field204 = var5 - this.field206;
                }
            }
            while (var5 > var4) {
                this.method106(this.field201, 256);
                var4 += 256;
                this.method84();
            }
            if (var2 > this.field207) {
                if (this.field216) {
                    this.field216 = false;
                } else if (this.field208 == 0 && this.field211 == 0) {
                    this.method88();
                    this.field202 = var2 + 2000L;
                    return;
                } else {
                    this.field204 = Math.min(this.field211, this.field208);
                    this.field211 = this.field208;
                }
                this.field208 = 0;
                this.field207 = var2 + 2000L;
            }
            this.field205 = var4;
        } catch (Exception var9) {
            this.method88();
            this.field202 = var2 + 2000L;
        }
        try {
            if (var2 > (this.field173 + 500000L)) {
                var2 = this.field173;
            }
            while ((this.field173 + 5000L) < var2) {
                this.method96(256, (byte) 118);
                this.field173 += (long) (256000 / class213.field3404);
            }
        } catch (Exception var8) {
            this.field173 = var2;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "()V", line = 127)
    public void method84() throws Exception {
        field194++;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(B)V", line = 135)
    public static void method85(byte arg0) {
        field176 = null;
        field184 = null;
        if (arg0 <= 75) {
            field219 = true;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII)I", line = 149)
    public static final int method86(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg0 & 0xF;
        if (arg2 != 4836) {
            method86(-69, -46, 74, 47, -66);
        }
        int var6 = var5 < 8 ? arg4 : arg1;
        field177++;
        int var7 = var5 < 4 ? arg1 : (var5 == 12 || var5 == 14 ? arg4 : arg3);
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 169)
    public final synchronized void method87(int arg0) {
        field192++;
        this.field216 = true;
        try {
            this.method103();
        } catch (Exception var3) {
            this.method88();
            this.field202 = class154.method1172((byte) 108) + 2000L;
        }
        if (arg0 != 15443) {
            this.field201 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "()V", line = 193)
    public void method88() {
        field210++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIII)V", line = 207)
    public static final void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != 25057) {
            field218 = 24;
        }
        if (arg7 >= class319.field4965 && class116.field1888 >= arg1 && class188.field2995 <= arg2 && class195.field3108 >= arg5) {
            class125.method940(arg2, arg6, true, arg7, arg5, arg4, arg3, arg1);
        } else {
            class207.method1510(arg0 ^ 0x61E3, arg4, arg2, arg3, arg5, arg6, arg7, arg1);
        }
        field188++;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V", line = 224)
    public final synchronized void method90(int arg0) {
        if (arg0 != 31201) {
            return;
        }
        field182++;
        if (class273.field4253 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class273.field4253.field3403[var3] == this) {
                    class273.field4253.field3403[var3] = null;
                }
                if (class273.field4253.field3403[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class273.field4253.field3396 = true;
                while (class273.field4253.field3397) {
                    class279.method1991(arg0 ^ 0x799F, 50L);
                }
                class273.field4253 = null;
            }
        }
        this.method88();
        this.field201 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lvl;B)V", line = 268)
    public final synchronized void method91(class80 arg0, byte arg1) {
        if (arg1 > -48) {
            method92((byte) -20, (class30) null);
        }
        this.field190 = arg0;
        field195++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BLnl;)I", line = 280)
    public static final int method92(byte arg0, class30 arg1) {
        field175++;
        int var2 = arg1.field504;
        if (arg0 >= -68) {
            method95(9, 17);
        }
        class63 var3 = arg1.method640(-23);
        if (arg1.field1453 == var3.field970) {
            var2 = arg1.field500;
        } else if (arg1.field1453 == var3.field989 || arg1.field1453 == var3.field987 || arg1.field1453 == var3.field1004 || arg1.field1453 == var3.field974) {
            var2 = arg1.field478;
        } else if (arg1.field1453 == var3.field971 || arg1.field1453 == var3.field973 || arg1.field1453 == var3.field980 || arg1.field1453 == var3.field995) {
            var2 = arg1.field506;
        }
        return var2;
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(B)V", line = 307)
    public static final void method93(byte arg0) {
        field203++;
        if (arg0 > -46) {
            field219 = true;
        }
        class159.field2506.method1832((byte) -84);
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "()I", line = 325)
    public int method94() throws Exception {
        field185++;
        return this.field214;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)I", line = 336)
    public static final int method95(int arg0, int arg1) {
        if (arg1 != 127) {
            field217 = 17;
        }
        field189++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)V", line = 347)
    private final void method96(int arg0, byte arg1) {
        this.field213 -= arg0;
        field179++;
        if (this.field213 < 0) {
            this.field213 = 0;
        }
        if (arg1 != 118) {
            this.field213 = -1;
        }
        if (this.field190 != null) {
            this.field190.method286(arg0);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(CZ)B", line = 366)
    public static final byte method97(char arg0, boolean arg1) {
        if (!arg1) {
            return -21;
        }
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        field181++;
        return var2;
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(I)V", line = 491)
    public void method98(int arg0) throws Exception {
        field191++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IILvl;)V", line = 501)
    private final void method99(int arg0, int arg1, class80 arg2) {
        field183++;
        if (arg0 != 381) {
            method85((byte) 10);
        }
        int var4 = arg1 >> 5;
        class80 var5 = this.field215[var4];
        if (var5 == null) {
            this.field212[var4] = arg2;
        } else {
            var5.field1213 = arg2;
        }
        this.field215[var4] = arg2;
        arg2.field1216 = arg1;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 524)
    public void method100(Component arg0) throws Exception {
        field178++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZI)I", line = 531)
    public static final int method101(int arg0, boolean arg1, int arg2) {
        field193++;
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        if (!arg1) {
            field217 = -108;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(B)V", line = 563)
    public static final void method102(byte arg0) {
        if (arg0 > -58) {
            field187 = 22;
        }
        field198++;
        int var1 = class267.field4132.method240(8, -81);
        if (class65.field1058 > var1) {
            for (int var2 = var1; var2 < class65.field1058; var2++) {
                class197.field3126[class9.field137++] = class149.field2398[var2];
            }
        }
        if (var1 > class65.field1058) {
            throw new RuntimeException("gppov1");
        }
        class65.field1058 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class149.field2398[var3];
            class30 var5 = class82.field1228[var4];
            int var6 = class267.field4132.method240(1, -71);
            if (var6 == 0) {
                class149.field2398[class65.field1058++] = var4;
                var5.field1462 = class205.field3252;
            } else {
                int var7 = class267.field4132.method240(2, -25);
                if (var7 == 0) {
                    class149.field2398[class65.field1058++] = var4;
                    var5.field1462 = class205.field3252;
                    class231.field3673[class75.field1160++] = var4;
                } else if (var7 == 1) {
                    class149.field2398[class65.field1058++] = var4;
                    var5.field1462 = class205.field3252;
                    int var12 = class267.field4132.method240(3, -79);
                    var5.method636(true, 1, var12);
                    int var13 = class267.field4132.method240(1, -33);
                    if (var13 == 1) {
                        class231.field3673[class75.field1160++] = var4;
                    }
                } else if (var7 == 2) {
                    class149.field2398[class65.field1058++] = var4;
                    var5.field1462 = class205.field3252;
                    if (class267.field4132.method240(1, -123) == 1) {
                        int var8 = class267.field4132.method240(3, -78);
                        var5.method636(true, 2, var8);
                        int var9 = class267.field4132.method240(3, -59);
                        var5.method636(true, 2, var9);
                    } else {
                        int var10 = class267.field4132.method240(3, -119);
                        var5.method636(true, 0, var10);
                    }
                    int var11 = class267.field4132.method240(1, -106);
                    if (var11 == 1) {
                        class231.field3673[class75.field1160++] = var4;
                    }
                } else if (var7 == 3) {
                    class197.field3126[class9.field137++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "()V", line = 679)
    public void method103() throws Exception {
        field180++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lja;ILja;)V", line = 704)
    public static final void method104(class64 arg0, int arg1, class64 arg2) {
        if (arg1 >= 14) {
            class116.field1892 = arg0;
            field196++;
            class98.field1626 = arg2;
        }
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(I)V", line = 726)
    public final void method105(int arg0) {
        this.field216 = true;
        if (arg0 != 1) {
            this.field173 = -93L;
        }
        field200++;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([II)V", line = 740)
    private final void method106(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class141.field2238) {
            var3 = arg1 << 1;
        }
        class271.method1954(arg0, 0, var3);
        this.field213 -= arg1;
        if (this.field190 != null && this.field213 <= 0) {
            this.field213 += class213.field3404 >> 4;
            class259.method1838(this.field190, 1479418273);
            this.method99(381, this.field190.method583(), this.field190);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
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
                        class80 var10 = null;
                        class80 var11 = this.field212[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class106 var12 = var11.field1214;
                                if (var12 == null || var12.field1777 <= var8) {
                                    var11.field1215 = true;
                                    int var13 = var11.method293();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1777 += var13;
                                    }
                                    if (var4 >= this.field174) {
                                        break label105;
                                    }
                                    class80 var14 = var11.method295();
                                    if (var14 != null) {
                                        int var15 = var11.field1216;
                                        while (var14 != null) {
                                            this.method99(381, var15 * var14.method583() >> 8, var14);
                                            var14 = var11.method294();
                                        }
                                    }
                                    class80 var16 = var11.field1213;
                                    var11.field1213 = null;
                                    if (var10 == null) {
                                        this.field212[var7] = var16;
                                    } else {
                                        var10.field1213 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field215[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1213;
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
                class80 var18 = this.field212[var17];
                this.field212[var17] = this.field215[var17] = null;
                while (var18 != null) {
                    class80 var19 = var18.field1213;
                    var18.field1213 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field213 < 0) {
            this.field213 = 0;
        }
        if (this.field190 != null) {
            this.field190.method275(arg0, 0, arg1);
        }
        this.field173 = class154.method1172((byte) 84);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZC)Z", line = 906)
    public static final boolean method107(boolean arg0, char arg1) {
        field209++;
        if (!arg0) {
            field187 = 56;
        }
        return arg1 >= '0' && arg1 <= '9';
    }
}
