import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class237 extends class232 {

    @OriginalMember(owner = "client!el", name = "W", descriptor = "I")
    private int field4113 = 81;

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "I")
    private int field4107 = 4;

    @OriginalMember(owner = "client!el", name = "P", descriptor = "I")
    private int field4106 = 1024;

    @OriginalMember(owner = "client!el", name = "Y", descriptor = "I")
    private int field4115 = 0;

    @OriginalMember(owner = "client!el", name = "kb", descriptor = "I")
    private int field4127 = 8;

    @OriginalMember(owner = "client!el", name = "ib", descriptor = "I")
    private int field4125 = 409;

    @OriginalMember(owner = "client!el", name = "fb", descriptor = "I")
    private int field4122 = 204;

    @OriginalMember(owner = "client!el", name = "bb", descriptor = "I")
    private int field4118 = 1024;

    @OriginalMember(owner = "client!el", name = "S", descriptor = "Lme;")
    public static class75 field4109 = null;

    @OriginalMember(owner = "client!el", name = "eb", descriptor = "Lhi;")
    public static class82 field4121 = class95.method664((byte) -113, "unzap");

    @OriginalMember(owner = "client!el", name = "jb", descriptor = "[Lhi;")
    public static class82[] field4126 = new class82[100];

    @OriginalMember(owner = "client!el", name = "nb", descriptor = "Lhi;")
    public static class82 field4130 = class95.method664((byte) -35, "Ausw-=hlen");

    @OriginalMember(owner = "client!el", name = "lb", descriptor = "Lhi;")
    public static class82 field4128 = class95.method664((byte) -40, "OK");

    @OriginalMember(owner = "client!el", name = "qb", descriptor = "Lhi;")
    private static class82 field4133 = class95.method664((byte) -96, "shake:");

    @OriginalMember(owner = "client!el", name = "R", descriptor = "Lhi;")
    public static class82 field4108 = field4133;

    @OriginalMember(owner = "client!el", name = "cb", descriptor = "Lhi;")
    public static class82 field4119 = field4133;

    @OriginalMember(owner = "client!el", name = "T", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!el", name = "U", descriptor = "I")
    private int field4111;

    @OriginalMember(owner = "client!el", name = "V", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!el", name = "X", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!el", name = "Z", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!el", name = "ab", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!el", name = "db", descriptor = "I")
    private int field4120;

    @OriginalMember(owner = "client!el", name = "mb", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!el", name = "pb", descriptor = "I")
    private int field4132;

    @OriginalMember(owner = "client!el", name = "ob", descriptor = "[I")
    private int[] field4131;

    @OriginalMember(owner = "client!el", name = "gb", descriptor = "[[I")
    private int[][] field4123;

    @OriginalMember(owner = "client!el", name = "hb", descriptor = "[[I")
    private int[][] field4124;

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V", line = 214)
    public class237() {
        super(0, true);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(IB)[I", line = 26)
    public final int[] method80(int arg0, byte arg1) {
        int var3 = 97 % ((-arg1 - 31) / 55);
        int[] var4 = this.field4008.method131((byte) -70, arg0);
        field4116++;
        if (this.field4008.field256) {
            int var5 = 0;
            int var6;
            for (var6 = class273.field4607[arg0] + this.field4115; var6 < 0; var6 += 4096) {
            }
            while (var6 > 4096) {
                var6 -= 4096;
            }
            while (this.field4127 > var5 && var6 >= this.field4131[var5]) {
                var5++;
            }
            boolean var7 = (var5 & 0x1) == 0;
            int var8 = this.field4131[var5];
            int var9 = this.field4131[var5 - 1];
            int var10 = var5 - 1;
            if (var9 + this.field4132 < var6 && (var8 - this.field4132) > var6) {
                for (int var11 = 0; var11 < class54.field858; var11++) {
                    int var12 = 0;
                    int var13 = var7 ? this.field4106 : -this.field4106;
                    int var14;
                    for (var14 = (this.field4120 * var13 >> 12) + class24.field329[var11]; var14 < 0; var14 += 4096) {
                    }
                    while (var14 > 4096) {
                        var14 -= 4096;
                    }
                    while (var12 < this.field4107 && this.field4123[var10][var12] <= var14) {
                        var12++;
                    }
                    int var15 = var12 - 1;
                    int var16 = this.field4123[var10][var12];
                    int var17 = this.field4123[var10][var15];
                    if ((this.field4132 + var17) < var14 && var14 < (var16 - this.field4132)) {
                        var4[var11] = this.field4124[var10][var15];
                    } else {
                        var4[var11] = 0;
                    }
                }
            } else {
                class190.method1321(var4, 0, class54.field858, 0);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(B)V", line = 125)
    public static void method1673(byte arg0) {
        field4109 = null;
        field4121 = null;
        field4108 = null;
        field4130 = null;
        field4133 = null;
        if (arg0 != 45) {
            method1675(33, true, (class222) null, 104);
        }
        field4126 = null;
        field4128 = null;
        field4119 = null;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(B)V", line = 151)
    public static final void method1674(byte arg0) {
        class88.method616();
        field4114++;
        class54.field870 = null;
        class138.field2377 = -1;
        class166.method1196(arg0 + 77);
        class266.field4531.method2254(-2705);
        class137.field2361 = new class22();
        ((class89) class102.field1821).method633((byte) 35);
        if (arg0 != -77) {
            return;
        }
        class2.field12 = 0;
        class2.field15 = new class300[255];
        class30.method235();
        class248.method1777();
        class232.method1645(arg0 + 48);
        class143.method969((byte) -109, false);
        class87.method609(arg0 + 132);
        for (int var1 = 0; var1 < 2048; var1++) {
            class81 var2 = class29.field405[var1];
            if (var2 != null) {
                var2.field1397 = null;
            }
        }
        if (class147.field2485) {
            class248.method1791(104, 104);
            class295.method2043();
        }
        class156.method1113(true, class62.field976, class182.field3117);
        class227.method1618(false, class182.field3117);
        if (class61.field959 == 5) {
            class192.method1337(class182.field3117, (byte) 113);
        }
        if (class61.field959 == 10) {
            class300.method2072(false, false);
        }
        if (class61.field959 == 30) {
            class292.method2014(28, 25);
        }
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(I)V", line = 220)
    public final void method144(int arg0) {
        field4112++;
        if (arg0 < 48) {
            this.method80(95, (byte) -53);
        }
        this.method1676((byte) -124);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IBLbc;)V", line = 250)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        field4117++;
        if (arg1 != -19) {
            this.method81(-53, (byte) 111, (class153) null);
        }
        if (arg0 == 0) {
            this.field4107 = arg2.method1082(-102);
        } else if (arg0 == 1) {
            this.field4127 = arg2.method1082(arg1 ^ 0x55);
        } else if (arg0 == 2) {
            this.field4125 = arg2.method1090(false);
        } else if (arg0 == 3) {
            this.field4122 = arg2.method1090(false);
        } else if (arg0 == 4) {
            this.field4106 = arg2.method1090(false);
        } else if (arg0 == 5) {
            this.field4115 = arg2.method1090(false);
        } else if (arg0 == 6) {
            this.field4113 = arg2.method1090(false);
        } else if (arg0 == 7) {
            this.field4118 = arg2.method1090(false);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IZLum;I)Ljm;", line = 349)
    public static final class303 method1675(int arg0, boolean arg1, class222 arg2, int arg3) {
        if (arg1) {
            method1675(12, false, (class222) null, -70);
        }
        field4129++;
        return client.method866(arg0, arg3, (byte) 49, arg2) ? class3.method25((byte) -35) : null;
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(B)V", line = 368)
    private final void method1676(byte arg0) {
        field4110++;
        Random var2 = new Random((long) this.field4127);
        this.field4131 = new int[this.field4127 + 1];
        this.field4124 = new int[this.field4127][this.field4107];
        this.field4123 = new int[this.field4127][this.field4107 + 1];
        this.field4131[0] = 0;
        this.field4120 = 4096 / this.field4107;
        if (arg0 != -124) {
            return;
        }
        this.field4132 = this.field4113 / 2;
        this.field4111 = 4096 / this.field4127;
        int var3 = this.field4111 / 2;
        int var4 = this.field4120 / 2;
        for (int var5 = 0; var5 < this.field4127; var5++) {
            if (var5 > 0) {
                int var6 = this.field4111;
                int var7 = (class232.method1650(4096, false, var2) - 2048) * this.field4122 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field4131[var5] = this.field4131[var5 - 1] + var8;
            }
            this.field4123[var5][0] = 0;
            for (int var9 = 0; var9 < this.field4107; var9++) {
                if (var9 > 0) {
                    int var10 = this.field4120;
                    int var11 = (class232.method1650(4096, false, var2) - 2048) * this.field4125 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field4123[var5][var9] = this.field4123[var5][var9 - 1] + var12;
                }
                this.field4124[var5][var9] = this.field4118 <= 0 ? 4096 : 4096 - class232.method1650(this.field4118, false, var2);
            }
            this.field4123[var5][this.field4107] = 4096;
        }
        this.field4131[this.field4127] = 4096;
    }
}
