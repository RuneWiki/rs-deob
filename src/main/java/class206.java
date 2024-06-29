import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class206 extends class51 {

    @OriginalMember(owner = "client!wg", name = "fb", descriptor = "[I")
    private int[] field4017 = new int[512];

    @OriginalMember(owner = "client!wg", name = "hb", descriptor = "I")
    private int field4019 = 1638;

    @OriginalMember(owner = "client!wg", name = "lb", descriptor = "Z")
    private boolean field4023 = true;

    @OriginalMember(owner = "client!wg", name = "sb", descriptor = "I")
    private int field4030 = 0;

    @OriginalMember(owner = "client!wg", name = "jb", descriptor = "I")
    private int field4021 = 4;

    @OriginalMember(owner = "client!wg", name = "vb", descriptor = "I")
    private int field4033 = 4;

    @OriginalMember(owner = "client!wg", name = "rb", descriptor = "I")
    private int field4029 = 4;

    @OriginalMember(owner = "client!wg", name = "nb", descriptor = "Led;")
    public static class43 field4025 = class191.method1219("Untersuchen", false);

    @OriginalMember(owner = "client!wg", name = "ob", descriptor = "Z")
    public static volatile boolean field4026 = true;

    @OriginalMember(owner = "client!wg", name = "ub", descriptor = "Led;")
    public static class43 field4032 = class191.method1219("Wordpack geladen)3", false);

    @OriginalMember(owner = "client!wg", name = "ab", descriptor = "Ltd;")
    public static class176 field4012 = new class176(100);

    @OriginalMember(owner = "client!wg", name = "xb", descriptor = "Led;")
    public static class43 field4035 = class191.method1219("T", false);

    @OriginalMember(owner = "client!wg", name = "zb", descriptor = "Lvc;")
    public static class193 field4037 = null;

    @OriginalMember(owner = "client!wg", name = "Bb", descriptor = "I")
    public static int field4039 = 0;

    @OriginalMember(owner = "client!wg", name = "Ab", descriptor = "I")
    public static int field4038 = 1;

    @OriginalMember(owner = "client!wg", name = "Z", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!wg", name = "bb", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!wg", name = "cb", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!wg", name = "eb", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!wg", name = "gb", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!wg", name = "ib", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!wg", name = "mb", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!wg", name = "pb", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!wg", name = "qb", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!wg", name = "tb", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!wg", name = "wb", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!wg", name = "yb", descriptor = "Lga;")
    public static class58 field4036;

    @OriginalMember(owner = "client!wg", name = "db", descriptor = "[I")
    private int[] field4015;

    @OriginalMember(owner = "client!wg", name = "kb", descriptor = "[I")
    private int[] field4022;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)V")
    public static final void method1331(byte arg0, int arg1) {
        ++field4034;
        int var2 = 39 / ((16 - arg0) / 61);
        class174 var3 = (class174) class90.field1792.method75((long) arg1, -100);
        if (var3 != null) {
            var3.method417(-12);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIBI)Lpa;")
    public static final class137 method1332(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 15) {
            method1331((byte) 50, 26);
        }
        class137 var4 = new class137();
        var4.field2835 = arg0;
        ++field4028;
        var4.field2850 = arg3;
        class15.field227.method82(46, var4, (long) arg1);
        class34.method194(114, arg3);
        class92.method591(arg3, (byte) -74);
        class129 var5 = class124.method801((byte) -36, arg1);
        if (var5 != null) {
            class43.method265(false, var5);
        }
        if (class107.field2052 != null) {
            class43.method265(false, class107.field2052);
            class107.field2052 = null;
        }
        class41.field799 = 0;
        class186.field3665 = false;
        class200.method1306(class103.field1963, class30.field574, class125.field2474, class158.field3200, arg2 + -15);
        if (class187.field3666 != -1) {
            class67.method416((byte) -45, 1, class187.field3666);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)V")
    private final void method1333(int arg0) {
        ++field4024;
        if (~this.field4019 < -1) {
            this.field4022 = new int[this.field4021];
            this.field4015 = new int[this.field4021];
            for (int var2 = 0; var2 < this.field4021; ++var2) {
                this.field4015[var2] = (int) (4096.0D * Math.pow((double) (this.field4019 / 4096), (double) var2));
                this.field4022[var2] = (int) (4096.0D * Math.pow(2.0D, (double) var2));
            }
        } else if (this.field4015 != null && ~this.field4015.length == ~this.field4021) {
            this.field4022 = new int[this.field4021];
            for (int var3 = 0; this.field4021 > var3; ++var3) {
                this.field4022[var3] = (int) (4096.0D * Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 != 4096) {
            this.field4019 = -94;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class206() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZILga;ZI)V")
    public static final void method1334(int arg0, boolean arg1, int arg2, class58 arg3, boolean arg4, int arg5) {
        class104.field1971 = 10000;
        class7.field152 = arg2;
        class1.field32 = arg5;
        class158.field3206 = 1;
        class5.field113 = arg3;
        class92.field1825 = arg4;
        ++field4016;
        if (!arg1) {
            field4035 = null;
        }
        class153.field3108 = arg0;
    }

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
    public static void method1335(int arg0) {
        field4025 = null;
        field4035 = null;
        field4012 = null;
        field4036 = null;
        if (arg0 == -4096) {
            field4032 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method64(120);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field4029 = arg0.method538((byte) -109);
                                }
                            } else {
                                this.field4033 = arg0.method538((byte) 96);
                            }
                        } else {
                            this.field4030 = arg0.method538((byte) 82);
                        }
                    } else {
                        this.field4033 = this.field4029 = arg0.method538((byte) -68);
                    }
                } else {
                    this.field4019 = arg0.method552((byte) -125);
                    if (this.field4019 < 0) {
                        this.field4015 = new int[this.field4021];
                        for (int var5 = 0; this.field4021 > var5; ++var5) {
                            this.field4015[var5] = arg0.method552((byte) -118);
                        }
                    }
                }
            } else {
                this.field4021 = arg0.method538((byte) 120);
            }
        } else {
            this.field4023 = ~arg0.method538((byte) -105) == -2;
        }
        ++field4013;
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
    public final void method64(int arg0) {
        ++field4014;
        this.method1337(-1);
        this.method1333(4096);
        if (arg0 > -83) {
            method1339((class58) null, (class58) null, (byte) 99);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BIIII)I")
    private final int method1336(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4027;
        int var6 = -4096 & arg2;
        int var7 = arg2 - var6;
        int var8 = var6 >> 12;
        int var9 = -4096 & arg1;
        int var10 = var8 + 1;
        int var11 = -4096 & arg3;
        int var12 = var8 & 255;
        int var13 = arg3 - var11;
        int var14 = arg4 & -4096;
        if (var14 >> 12 <= var10) {
            var10 = 0;
        }
        int var15 = var10 & 255;
        int var16 = var11 >> 12;
        int var17 = var16 - -1;
        int var18 = var16 & 255;
        if (var9 >> 12 <= var17) {
            var17 = 0;
        }
        int var19 = var17 & 255;
        int var20 = this.field4017[var19 - -this.field4017[var15]] % 4;
        int var21 = this.field4017[this.field4017[var15] + var18] % 4;
        int var22 = this.field4017[this.field4017[var12] + var19] % 4;
        int var23 = this.field4017[var18 - -this.field4017[var12]] % 4;
        int var24 = class145.method917(class147.field3014[var23], var13, var7, 0);
        int var25 = -52 / ((arg0 - 82) / 36);
        int var26 = class145.method917(class147.field3014[var22], var13 + -4096, var7, 0);
        int var27 = class145.method917(class147.field3014[var21], var13, var7 - 4096, 0);
        int var28 = class145.method917(class147.field3014[var20], var13 - 4096, var7 + -4096, 0);
        int var29 = class173.method1093(var13, 1024);
        int var30 = class173.method1093(var7, 1024);
        int var31 = class19.method93(var24, var29, (byte) -128, var26);
        int var32 = class19.method93(var27, var29, (byte) 31, var28);
        return class19.method93(var31, var30, (byte) -124, var32);
    }

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V")
    private final void method1337(int arg0) {
        ++field4031;
        Random var2 = new Random((long) this.field4030);
        for (int var3 = 0; var3 < 255; ++var3) {
            this.field4017[var3] = -1;
        }
        for (int var4 = 0; var4 < 255; ++var4) {
            int var5;
            do {
                var5 = class153.method970((byte) 100, var2, 255);
            } while (this.field4017[var5] != -1);
            this.field4017[var5 + 255] = this.field4017[var5] = var4;
        }
        if (arg0 != -1) {
            this.method1333(-17);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILga;II)Lnb;")
    public static final class120 method1338(int arg0, class58 arg1, int arg2, int arg3) {
        ++field4011;
        if (!class184.method1185(arg2, arg0, 104, arg1)) {
            return null;
        } else {
            int var4 = -13 % ((-28 - arg3) / 35);
            return class184.method1186(true);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lga;Lga;B)V")
    public static final void method1339(class58 arg0, class58 arg1, byte arg2) {
        class200.field3934 = arg0;
        ++field4018;
        field4036 = arg1;
        class180.field3584 = field4036.method344(3, 1);
        if (arg2 > -49) {
            method1335(-27);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        if (arg0 != 16) {
            this.method1333(63);
        }
        ++field4020;
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            int var4 = class40.field771[arg1] * this.field4029;
            int var5 = this.field4033 << 12;
            int var6 = this.field4029 << 12;
            for (int var7 = 0; var7 < class122.field2442; ++var7) {
                int var8 = 0;
                int var9 = class95.field1855[var7] * this.field4033;
                for (int var10 = 0; this.field4021 > var10; ++var10) {
                    int var11 = this.field4022[var10];
                    int var12 = this.field4015[var10];
                    int var13 = this.method1336((byte) -128, var5 * var11 >> 12, var4 * var11 >> 12, var9 * var11 >> 12, var6 * var11 >> 12);
                    var8 += var12 * var13 >> 12;
                }
                if (this.field4023) {
                    var8 = (var8 >> 1) + 2048;
                }
                var3[var7] = var8;
            }
        }
        return var3;
    }
}
