import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 extends class118 {

    @OriginalMember(owner = "client!af", name = "gb", descriptor = "I")
    public int field224 = -1;

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "Z")
    public boolean field220 = true;

    @OriginalMember(owner = "client!af", name = "kb", descriptor = "I")
    public int field228 = -1;

    @OriginalMember(owner = "client!af", name = "mb", descriptor = "I")
    public int field230 = 0;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "Lfc;")
    public static class39 field207 = class90.method774("zur-Uck auf die RuneScape)2Webseite gehen", -121);

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "[[[Laa;")
    public static class2[][][] field208 = new class2[4][104][104];

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "[[[I")
    public static int[][][] field219 = new int[4][105][105];

    @OriginalMember(owner = "client!af", name = "V", descriptor = "Lfc;")
    private static class39 field213 = class90.method774("flash2:", -86);

    @OriginalMember(owner = "client!af", name = "N", descriptor = "Lfc;")
    public static class39 field205 = field213;

    @OriginalMember(owner = "client!af", name = "db", descriptor = "Lfc;")
    public static class39 field221 = field213;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "Lfc;")
    public static class39 field212 = class90.method774("Hierhin gehen", -113);

    @OriginalMember(owner = "client!af", name = "lb", descriptor = "I")
    public static int field229 = 0;

    @OriginalMember(owner = "client!af", name = "W", descriptor = "Laa;")
    public static class2 field214 = new class2();

    @OriginalMember(owner = "client!af", name = "pb", descriptor = "Lfc;")
    public static class39 field233 = class90.method774("(U3", -127);

    @OriginalMember(owner = "client!af", name = "rb", descriptor = "[[[I")
    public static int[][][] field235 = new int[4][13][13];

    @OriginalMember(owner = "client!af", name = "qb", descriptor = "Lfc;")
    private static class39 field234 = class90.method774(" more options", -126);

    @OriginalMember(owner = "client!af", name = "ob", descriptor = "Lfc;")
    public static class39 field232 = field234;

    @OriginalMember(owner = "client!af", name = "ub", descriptor = "I")
    public static int field238 = 0;

    @OriginalMember(owner = "client!af", name = "sb", descriptor = "Lfc;")
    public static class39 field236 = class90.method774("<col=ff7000>", -82);

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public int field210;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public int field211;

    @OriginalMember(owner = "client!af", name = "X", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "client!af", name = "eb", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!af", name = "fb", descriptor = "I")
    public int field223;

    @OriginalMember(owner = "client!af", name = "hb", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!af", name = "ib", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!af", name = "jb", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!af", name = "nb", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!af", name = "tb", descriptor = "Lue;")
    public static class141 field237;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V", line = 6)
    public static void method92(int arg0) {
        if (arg0 != 105) {
            method99(11);
        }
        field233 = null;
        field213 = null;
        field221 = null;
        field212 = null;
        field208 = null;
        field236 = null;
        field207 = null;
        field214 = null;
        field219 = null;
        field232 = null;
        field205 = null;
        field237 = null;
        field235 = null;
        field234 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II[B)I", line = 31)
    public static final int method93(int arg0, int arg1, byte[] arg2) {
        if (arg0 == -25915) {
            field225++;
            return class43.method509(arg1, arg2, 0, false);
        } else {
            return 45;
        }
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V", line = 44)
    public static final void method94(int arg0) {
        class50 var1 = class13.field331;
        synchronized (class13.field331) {
            class29.field822 = class50.field1279;
            if (class60.field1469 >= 0) {
                while (class60.field1469 != class127.field3231) {
                    int var2 = class56.field1405[class127.field3231];
                    class127.field3231 = class127.field3231 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class114.field2988[var2] = true;
                    } else {
                        class114.field2988[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class114.field2988[var3] = false;
                }
                class60.field1469 = class127.field3231;
            }
            class50.field1279 = class12.field320;
        }
        field217++;
        if (arg0 < 96) {
            field208 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILdc;I)V", line = 91)
    private final void method95(int arg0, int arg1, class25 arg2, int arg3) {
        if (arg3 != 4) {
            return;
        }
        if (arg0 == 1) {
            this.field230 = arg2.method310(true);
        } else if (arg0 == 2) {
            this.field228 = arg2.method322((byte) -50);
        } else if (arg0 == 5) {
            this.field220 = false;
        } else if (arg0 == 7) {
            this.field224 = arg2.method310(true);
        }
        field226++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ldc;BI)V", line = 146)
    public final void method96(class25 arg0, byte arg1, int arg2) {
        if (arg1 > -6) {
            field208 = null;
        }
        field222++;
        while (true) {
            int var4 = arg0.method322((byte) -50);
            if (var4 == 0) {
                return;
            }
            this.method95(var4, arg2, arg0, 4);
        }
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V", line = 167)
    public final void method97(int arg0) {
        if (this.field224 != -1) {
            this.method100(this.field224, -929526840);
            this.field215 = this.field211;
            this.field223 = this.field209;
            this.field210 = this.field218;
        }
        this.method100(this.field230, -929526840);
        if (arg0 <= 30) {
            this.method96(null, (byte) 35, 105);
        }
        field216++;
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V", line = 198)
    public static final void method98(int arg0) {
        field231++;
        if (arg0 != -23470) {
            field232 = null;
        }
        class77.field1764.method927(false);
    }

    @OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V", line = 232)
    public static final void method99(int arg0) {
        field227++;
        for (class131 var1 = (class131) class43.field1162.method8(-1); var1 != null; var1 = (class131) class43.field1162.method9(1)) {
            if (var1.field3298 == -1) {
                var1.field3305 = 0;
                class132.method1073(var1, -114);
            } else {
                var1.method1170(105);
            }
        }
        if (arg0 < 12) {
            field235 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V", line = 273)
    private final void method100(int arg0, int arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        field206++;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var7 < var3) {
            var9 = var7;
        }
        if (var9 > var5) {
            var9 = var5;
        }
        if (arg1 != -929526840) {
            method98(87);
        }
        double var11 = 0.0D;
        double var13 = var3;
        double var15 = 0.0D;
        if (var3 < var7) {
            var13 = var7;
        }
        if (var5 > var13) {
            var13 = var5;
        }
        double var17 = (var9 + var13) / 2.0D;
        this.field218 = (int) (var17 * 256.0D);
        if (var9 != var13) {
            if (var3 == var13) {
                var11 = (var7 - var5) / (var13 - var9);
            } else if (var7 == var13) {
                var11 = (var5 - var3) / (var13 - var9) + 2.0D;
            } else if (var5 == var13) {
                var11 = (var3 - var7) / (var13 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var13 - var9) / (var9 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var13 - var9) / (2.0D - var13 - var9);
            }
        }
        double var19 = var11 / 6.0D;
        this.field209 = (int) (var15 * 256.0D);
        this.field211 = (int) (var19 * 256.0D);
        if (this.field218 < 0) {
            this.field218 = 0;
        } else if (this.field218 > 255) {
            this.field218 = 255;
        }
        if (this.field209 < 0) {
            this.field209 = 0;
        } else if (this.field209 > 255) {
            this.field209 = 255;
            return;
        }
    }
}
