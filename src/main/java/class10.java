import java.awt.Graphics;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class10 extends class59 {

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "I")
    private int field121 = 1024;

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
    private int field119 = 409;

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
    private int field125 = 204;

    @OriginalMember(owner = "client!jf", name = "db", descriptor = "I")
    private int field137 = 8;

    @OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
    private int field134 = 0;

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "I")
    private int field133 = 81;

    @OriginalMember(owner = "client!jf", name = "jb", descriptor = "I")
    private int field143 = 4;

    @OriginalMember(owner = "client!jf", name = "mb", descriptor = "I")
    private int field146 = 1024;

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "I")
    public static int field122 = 0;

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "Lph;")
    private static class229 field128 = class266.method1858("level: ", 0);

    @OriginalMember(owner = "client!jf", name = "gb", descriptor = "Lph;")
    public static class229 field140 = class266.method1858("::rebuild", 0);

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "Lph;")
    public static class229 field120 = field128;

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "Lo;")
    public static class227 field131 = new class227();

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
    private int field124;

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!jf", name = "bb", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!jf", name = "cb", descriptor = "I")
    private int field136;

    @OriginalMember(owner = "client!jf", name = "eb", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!jf", name = "fb", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!jf", name = "hb", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!jf", name = "ib", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!jf", name = "kb", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!jf", name = "lb", descriptor = "I")
    private int field145;

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "[I")
    private int[] field127;

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "[Lcl;")
    public static class32[] field129;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "[[I")
    private int[][] field118;

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "[[I")
    private int[][] field123;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "(I)V", line = 8)
    private final void method62(int arg0) {
        field138++;
        Random var2 = new Random((long) this.field137);
        this.field123 = new int[this.field137][this.field143];
        this.field124 = 4096 / this.field143;
        this.field127 = new int[this.field137 + 1];
        this.field136 = 4096 / this.field137;
        this.field118 = new int[this.field137][this.field143 + 1];
        this.field145 = this.field133 / 2;
        int var3 = this.field136 / 2;
        if (arg0 != 992913548) {
            this.field134 = -62;
        }
        this.field127[0] = 0;
        int var4 = this.field124 / 2;
        for (int var5 = 0; var5 < this.field137; var5++) {
            if (var5 > 0) {
                int var6 = this.field136;
                int var7 = (class113.method861(4096, (byte) -24, var2) - 2048) * this.field125 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field127[var5] = this.field127[var5 - 1] + var8;
            }
            this.field118[var5][0] = 0;
            for (int var9 = 0; var9 < this.field143; var9++) {
                if (var9 > 0) {
                    int var10 = this.field124;
                    int var11 = (class113.method861(4096, (byte) -24, var2) - 2048) * this.field119 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field118[var5][var9] = this.field118[var5][var9 - 1] + var12;
                }
                this.field123[var5][var9] = this.field121 > 0 ? 4096 - class113.method861(this.field121, (byte) -24, var2) : 4096;
            }
            this.field118[var5][this.field143] = 4096;
        }
        this.field127[this.field137] = 4096;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZI)[I", line = 71)
    public final int[] method63(boolean arg0, int arg1) {
        field141++;
        int[] var3 = this.field846.method383(3583, arg1);
        if (!arg0) {
            this.method63(false, 7);
        }
        if (this.field846.field811) {
            int var4 = 0;
            int var5;
            for (var5 = class269.field4504[arg1] + this.field134; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field137 > var4 && var5 >= this.field127[var4]) {
                var4++;
            }
            int var6 = this.field127[var4];
            int var7 = this.field127[var4 - 1];
            boolean var8 = (var4 & 0x1) == 0;
            int var9 = var4 - 1;
            if (this.field145 + var7 < var5 && var6 - this.field145 > var5) {
                for (int var10 = 0; var10 < class293.field4789; var10++) {
                    int var11 = var8 ? this.field146 : -this.field146;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field124 * var11 >> 12) + class219.field3608[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var12 < this.field143 && this.field118[var9][var12] <= var13) {
                        var12++;
                    }
                    int var14 = var12 - 1;
                    int var15 = this.field118[var9][var14];
                    int var16 = this.field118[var9][var12];
                    if ((this.field145 + var15) < var13 && var13 < (var16 - this.field145)) {
                        var3[var10] = this.field123[var9][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class42.method315(var3, 0, class293.field4789, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V", line = 173)
    public class10() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)V", line = 185)
    public static final void method64(int arg0, int arg1) {
        field132++;
        if (class170.field2802 == arg0) {
            class224.field3685.method465(arg1, 0);
        } else {
            class219.field3596 = arg1;
        }
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V", line = 200)
    public final void method65(int arg0) {
        if (arg0 >= 110) {
            field130++;
            this.method62(992913548);
        }
    }

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "(I)Lge;", line = 212)
    public static final class281 method66(int arg0) {
        field144++;
        if (arg0 >= -36) {
            field129 = (class32[]) null;
        }
        class281 var1 = (class281) class153.field2489.method1529((byte) 0);
        if (var1 != null) {
            var1.method598(69);
            var1.method224(128);
            return var1;
        }
        class281 var2;
        do {
            var2 = (class281) class68.field1087.method1529((byte) 0);
            if (var2 == null) {
                return null;
            }
            if (var2.method1935(127) > class130.method935(false)) {
                return null;
            }
            var2.method598(34);
            var2.method224(128);
        } while ((Long.MIN_VALUE & var2.field468) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BILhb;)V", line = 256)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        field139++;
        if (arg0 != 115) {
            this.field145 = -115;
        }
        if (arg1 == 0) {
            this.field143 = arg2.method1178(arg0 - 107);
        } else if (arg1 == 1) {
            this.field137 = arg2.method1178(8);
        } else if (arg1 == 2) {
            this.field119 = arg2.method1161(true);
        } else if (arg1 == 3) {
            this.field125 = arg2.method1161(true);
        } else if (arg1 == 4) {
            this.field146 = arg2.method1161(true);
        } else if (arg1 == 5) {
            this.field134 = arg2.method1161(true);
        } else if (arg1 == 6) {
            this.field133 = arg2.method1161(true);
        } else if (arg1 == 7) {
            this.field121 = arg2.method1161(true);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([BI)[B", line = 346)
    public static final byte[] method68(byte[] arg0, int arg1) {
        field135++;
        if (arg0 == null) {
            return null;
        } else if (arg1 >= -101) {
            return (byte[]) null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class42.method317(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V", line = 370)
    public static void method69(byte arg0) {
        field131 = null;
        int var1 = 65 % ((52 - arg0) / 48);
        field129 = null;
        field128 = null;
        field120 = null;
        field140 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZB)V", line = 388)
    public static final void method70(boolean arg0, byte arg1) {
        int var2 = class178.field2932.length;
        field126++;
        byte[][] var3;
        if (class99.field1675 && arg0) {
            var3 = class36.field590;
        } else {
            var3 = class131.field2132;
        }
        int var4 = 0;
        int var5 = -97 / ((arg1 + 28) / 56);
        while (var4 < var2) {
            byte[] var6 = var3[var4];
            if (var6 != null) {
                int var7 = (class287.field4723[var4] >> 8) * 64 - class1.field9;
                int var8 = (class287.field4723[var4] & 0xFF) * 64 - class1.field1;
                class53.method364(14874);
                class39.method298(arg0, var8, class160.field2592, var6, var7, true);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BZLph;)V", line = 462)
    public static final void method71(byte arg0, boolean arg1, class229 arg2) {
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        if (arg0 > -77) {
            field128 = (class229) null;
        }
        field142++;
        int var6 = class237.field3905.method238(arg2, 250);
        int var7 = class237.field3905.method247(arg2, 250) * 13;
        if (class99.field1675) {
            class212.method1494(var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var7 - -var3, 0);
            class212.method1501(var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        } else {
            class210.method1465(var5 - var3, -var3 + var4, var6 + var3 + var3, var3 + var7 + var3, 0);
            class210.method1463(var5 - var3, -var3 + var4, var3 + var6 + var3, var7 - -var3 + var3, 16777215);
        }
        class237.field3905.method248(arg2, var5, var4, var6, var7, 16777215, -1, 1, 1, 0);
        class329.method2253(var3 + var3 + var6, false, var3 + var3 + var7, var5 - var3, var4 - var3);
        if (!arg1) {
            class108.method829(var5, var4, 0, var6, var7);
        } else if (class99.field1675) {
            class99.method745();
        } else {
            try {
                Graphics var8 = class214.field3526.getGraphics();
                class156.field2534.method1101(var8, (byte) 79, 0, 0);
            } catch (Exception var10) {
                class214.field3526.repaint();
            }
        }
    }
}
