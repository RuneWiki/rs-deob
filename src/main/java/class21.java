import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class21 {

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "Z")
    public boolean field241 = false;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "Z")
    public boolean field243 = false;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public int field246 = -1;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "Z")
    public boolean field255 = false;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public int field239 = 2;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public int field257 = 5;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public int field247 = 99;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public int field262 = -1;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "Z")
    public boolean field250 = false;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public int field248 = -1;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
    public int field266 = -1;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    public int field267 = -1;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field249 = 0;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "Ljava/lang/String;")
    public static String field268 = null;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "Ljava/lang/String;")
    public static String field256 = "Loading - please wait.";

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    public int field259;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "[I")
    public int[] field237;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "[I")
    public int[] field240;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "[I")
    private int[] field269;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "[Z")
    public boolean[] field252;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "[[I")
    public int[][] field242;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static void method138(byte arg0) {
        field256 = null;
        field268 = null;
        if (arg0 != -75) {
            method146((byte) -65, true);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static final void method139(int arg0) {
        if (arg0 > -118) {
            method146((byte) -123, true);
        }
        class87.field1187.method1834(0);
        field244++;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public final void method140(int arg0) {
        if (this.field266 == -1) {
            if (this.field252 == null) {
                this.field266 = 0;
            } else {
                this.field266 = 2;
            }
        }
        if (this.field267 == -1) {
            if (this.field252 == null) {
                this.field267 = 0;
            } else {
                this.field267 = 2;
            }
        }
        field261++;
        int var2 = -94 % ((arg0 + 4) / 59);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILhi;)V")
    public final void method141(int arg0, class264 arg1) {
        while (true) {
            int var3 = arg1.method1779(-69);
            if (var3 == 0) {
                if (arg0 != 0) {
                    return;
                }
                field264++;
                return;
            }
            this.method147(arg1, -119, var3);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILue;III)Lue;")
    public final class13 method142(int arg0, class13 arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field240[arg2];
        int var7 = this.field237[arg2];
        class10 var8 = class9.method56(var7 >> 16, 1545049680);
        int var9 = var7 & 0xFFFF;
        field253++;
        if (var8 == null) {
            return arg1.method96(true, true, true);
        }
        class10 var10 = null;
        int var11 = -75 % ((arg3 - 7) / 39);
        if ((this.field243 || class51.field712) && arg0 != -1 && this.field237.length > arg0) {
            int var12 = this.field237[arg0];
            var10 = class9.method56(var12 >> 16, 1545049680);
            arg0 = var12 & 0xFFFF;
        }
        class13 var13;
        if (var10 == null) {
            var13 = arg1.method96(!var8.method63(1, var9), !var8.method60(var9, -57), !this.field250);
        } else {
            var13 = arg1.method96(!var8.method63(1, var9) & !var10.method63(1, arg0), !var8.method60(var9, -75) & !var10.method60(arg0, -88), !this.field250);
        }
        var13.method105(var8, var9, var10, arg0, arg4 - 1, var6, this.field250);
        return var13;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lue;IBII)Lue;")
    public final class13 method143(class13 arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var6 = this.field240[arg4];
        int var7 = this.field237[arg4];
        field263++;
        class10 var8 = class9.method56(var7 >> 16, 1545049680);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg0.method75(true, true, true);
        }
        class10 var10 = null;
        if ((this.field243 || class51.field712) && arg3 != -1 && arg3 < this.field237.length) {
            int var11 = this.field237[arg3];
            var10 = class9.method56(var11 >> 16, 1545049680);
            arg3 = var11 & 0xFFFF;
        }
        int var12 = 0;
        class10 var13 = null;
        int var14 = 0;
        class10 var15 = null;
        if (this.field269 != null) {
            if (arg4 < this.field269.length) {
                var12 = this.field269[arg4];
                if (var12 != 65535) {
                    var15 = class9.method56(var12 >> 16, 1545049680);
                    var12 &= 0xFFFF;
                }
            }
            if ((this.field243 || class51.field712) && arg3 != -1 && arg3 < this.field269.length) {
                var14 = this.field269[arg3];
                if (var14 != 65535) {
                    var13 = class9.method56(var14 >> 16, 1545049680);
                    var14 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method63(1, var9);
        boolean var17 = !var8.method60(var9, 82);
        if (var15 != null) {
            var16 &= !var15.method63(1, var12);
            var17 &= !var15.method60(var12, -31);
        }
        if (var10 != null) {
            var16 &= !var10.method63(1, arg3);
            var17 &= !var10.method60(arg3, 82);
        }
        if (var13 != null) {
            var16 &= !var13.method63(1, var14);
            var17 &= !var13.method60(var14, -50);
        }
        class13 var18 = arg0.method75(var16, var17, !this.field250);
        var18.method105(var8, var9, var10, arg3, arg1 - 1, var6, this.field250);
        if (arg2 < 37) {
            return null;
        } else {
            if (var15 != null) {
                var18.method105(var15, var12, var13, var14, arg1 - 1, var6, this.field250);
            }
            return var18;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)V")
    public static final void method144(byte arg0, int arg1) {
        class172 var2 = class9.field128;
        synchronized (class9.field128) {
            if (arg0 >= -60) {
                method146((byte) -10, false);
            }
            class6.field78 = arg1;
        }
        field254++;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILue;III)Lue;")
    public final class13 method145(int arg0, int arg1, class13 arg2, int arg3, int arg4, int arg5) {
        field245++;
        int var7 = this.field240[arg1];
        int var8 = this.field237[arg1];
        class10 var9 = class9.method56(var8 >> 16, arg3 + 1544984145);
        int var10 = var8 & arg3;
        if (var9 == null) {
            return arg2.method77(true, true, true);
        }
        int var11 = arg4 & 0x3;
        class10 var12 = null;
        if ((this.field243 || class51.field712) && arg0 != -1 && arg0 < this.field237.length) {
            int var13 = this.field237[arg0];
            var12 = class9.method56(var13 >> 16, 1545049680);
            arg0 = var13 & 0xFFFF;
        }
        class13 var14;
        if (var12 == null) {
            var14 = arg2.method77(!var9.method63(1, var10), !var9.method60(var10, -107), !this.field250);
        } else {
            var14 = arg2.method77(!var9.method63(arg3 ^ 0xFFFE, var10) & !var12.method63(1, arg0), !var9.method60(var10, 104) & !var12.method60(arg0, 118), !this.field250);
        }
        if (var11 == 1) {
            var14.method92();
        } else if (var11 == 2) {
            var14.method97();
        } else if (var11 == 3) {
            var14.method90();
        }
        var14.method105(var9, var10, var12, arg0, arg5 - 1, var7, this.field250);
        if (var11 == 1) {
            var14.method90();
        } else if (var11 == 2) {
            var14.method97();
        } else if (var11 == 3) {
            var14.method92();
        }
        return var14;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BZ)V")
    public static final void method146(byte arg0, boolean arg1) {
        class280.method1873((byte) -54);
        field251++;
        if (field249 != 30 && field249 != 25) {
            return;
        }
        if (arg0 != 39) {
            method148(6);
        }
        class149.field2397++;
        if (class149.field2397 < 50 && !arg1) {
            return;
        }
        class149.field2397 = 0;
        if (!class203.field3268 && class149.field2395 != null) {
            class83.field1148.method1238(84, -136478397);
            try {
                class149.field2395.method1272(class83.field1148.field4195, 0, class83.field1148.field4198, arg0 ^ 0xFFFFFF8F);
                class83.field1148.field4195 = 0;
            } catch (IOException var2) {
                class203.field3268 = true;
            }
            class42.field500++;
        }
        class280.method1873((byte) -54);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lhi;II)V")
    private final void method147(class264 arg0, int arg1, int arg2) {
        if (arg1 > -116) {
            this.field266 = -48;
        }
        field260++;
        if (arg2 == 1) {
            int var4 = arg0.method1777(-93);
            this.field240 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field240[var5] = arg0.method1777(-103);
            }
            this.field237 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field237[var6] = arg0.method1777(-96);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field237[var7] += arg0.method1777(-48) << 16;
            }
        } else if (arg2 == 2) {
            this.field248 = arg0.method1777(-122);
        } else if (arg2 == 3) {
            this.field252 = new boolean[256];
            int var15 = arg0.method1779(-111);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field252[arg0.method1779(-114)] = true;
            }
        } else if (arg2 == 4) {
            this.field255 = true;
        } else if (arg2 == 5) {
            this.field257 = arg0.method1779(-81);
        } else if (arg2 == 6) {
            this.field262 = arg0.method1777(-38);
        } else if (arg2 == 7) {
            this.field246 = arg0.method1777(-112);
        } else if (arg2 == 8) {
            this.field247 = arg0.method1779(-55);
        } else if (arg2 == 9) {
            this.field267 = arg0.method1779(-96);
        } else if (arg2 == 10) {
            this.field266 = arg0.method1779(-76);
        } else if (arg2 == 11) {
            this.field239 = arg0.method1779(-111);
        } else if (arg2 == 12) {
            int var8 = arg0.method1779(-88);
            this.field269 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field269[var9] = arg0.method1777(-103);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field269[var10] += arg0.method1777(-68) << 16;
            }
        } else if (arg2 == 13) {
            int var11 = arg0.method1777(-119);
            this.field242 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg0.method1779(-51);
                if (var13 > 0) {
                    this.field242[var12] = new int[var13];
                    this.field242[var12][0] = arg0.method1732(122);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field242[var12][var14] = arg0.method1777(-126);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field250 = true;
        } else if (arg2 == 15) {
            this.field243 = true;
        } else if (arg2 == 16) {
            this.field241 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
    public static final void method148(int arg0) {
        field238++;
        if (arg0 != -1) {
            field249 = 69;
        }
        class87.field1187.method1831(arg0 ^ 0x73);
    }
}
