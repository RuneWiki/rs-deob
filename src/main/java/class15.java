import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class15 extends class49 {

    @OriginalMember(owner = "client!c", name = "G", descriptor = "[I")
    private int[] field376 = new int[16];

    @OriginalMember(owner = "client!c", name = "J", descriptor = "[I")
    private int[] field379 = new int[16];

    @OriginalMember(owner = "client!c", name = "R", descriptor = "I")
    private int field387 = 256;

    @OriginalMember(owner = "client!c", name = "T", descriptor = "[I")
    public int[] field389 = new int[16];

    @OriginalMember(owner = "client!c", name = "fb", descriptor = "[I")
    private int[] field401 = new int[16];

    @OriginalMember(owner = "client!c", name = "ob", descriptor = "[I")
    private int[] field410 = new int[16];

    @OriginalMember(owner = "client!c", name = "eb", descriptor = "[I")
    private int[] field400 = new int[16];

    @OriginalMember(owner = "client!c", name = "qb", descriptor = "[I")
    private int[] field412 = new int[16];

    @OriginalMember(owner = "client!c", name = "sb", descriptor = "[I")
    private int[] field414 = new int[16];

    @OriginalMember(owner = "client!c", name = "F", descriptor = "[I")
    public int[] field375 = new int[16];

    @OriginalMember(owner = "client!c", name = "Ab", descriptor = "[I")
    private int[] field422 = new int[16];

    @OriginalMember(owner = "client!c", name = "Fb", descriptor = "[[Lhd;")
    private class53[][] field427 = new class53[16][128];

    @OriginalMember(owner = "client!c", name = "Eb", descriptor = "[I")
    private int[] field426 = new int[16];

    @OriginalMember(owner = "client!c", name = "zb", descriptor = "[I")
    private int[] field421 = new int[16];

    @OriginalMember(owner = "client!c", name = "Ib", descriptor = "[I")
    private int[] field430 = new int[16];

    @OriginalMember(owner = "client!c", name = "P", descriptor = "[I")
    public int[] field385 = new int[16];

    @OriginalMember(owner = "client!c", name = "Hb", descriptor = "[[Lhd;")
    private class53[][] field429 = new class53[16][128];

    @OriginalMember(owner = "client!c", name = "Pb", descriptor = "[I")
    private int[] field437 = new int[16];

    @OriginalMember(owner = "client!c", name = "kb", descriptor = "Lec;")
    private class32 field406 = new class32();

    @OriginalMember(owner = "client!c", name = "Tb", descriptor = "Lwb;")
    private class150 field441 = new class150(this);

    @OriginalMember(owner = "client!c", name = "ab", descriptor = "Lqc;")
    private class114 field396 = new class114(128);

    @OriginalMember(owner = "client!c", name = "lb", descriptor = "Lfc;")
    public static class39 field407 = class90.method774("Icons redrawn", -79);

    @OriginalMember(owner = "client!c", name = "ub", descriptor = "I")
    public static int field416 = 0;

    @OriginalMember(owner = "client!c", name = "Y", descriptor = "[I")
    public static int[] field394 = new int[5];

    @OriginalMember(owner = "client!c", name = "Kb", descriptor = "Lfc;")
    public static class39 field432 = class90.method774("cross", -97);

    @OriginalMember(owner = "client!c", name = "Qb", descriptor = "Lfc;")
    public static class39 field438 = class90.method774("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AUS>", -81);

    @OriginalMember(owner = "client!c", name = "Nb", descriptor = "Lfc;")
    public static class39 field435 = class90.method774("gelb:", -89);

    @OriginalMember(owner = "client!c", name = "B", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!c", name = "C", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!c", name = "E", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!c", name = "I", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!c", name = "O", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!c", name = "S", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!c", name = "U", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!c", name = "V", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!c", name = "W", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!c", name = "X", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!c", name = "bb", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!c", name = "cb", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!c", name = "db", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!c", name = "gb", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!c", name = "hb", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!c", name = "ib", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!c", name = "jb", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!c", name = "mb", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!c", name = "nb", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!c", name = "pb", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!c", name = "rb", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!c", name = "tb", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!c", name = "vb", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!c", name = "wb", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!c", name = "xb", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!c", name = "yb", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!c", name = "Bb", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!c", name = "Cb", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!c", name = "Db", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!c", name = "Gb", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!c", name = "Jb", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!c", name = "Lb", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!c", name = "Mb", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!c", name = "Ob", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!c", name = "Ub", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!c", name = "Wb", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!c", name = "Rb", descriptor = "J")
    private long field439;

    @OriginalMember(owner = "client!c", name = "Vb", descriptor = "J")
    private long field443;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "Loc;")
    public static class100 field373;

    @OriginalMember(owner = "client!c", name = "Sb", descriptor = "Z")
    private boolean field440;

    @OriginalMember(owner = "client!c", name = "Z", descriptor = "[[B")
    public static byte[][] field395;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)V", line = 4)
    private final void method157(boolean arg0, int arg1) {
        if (arg0) {
            this.field426 = null;
        }
        field417++;
        for (class53 var3 = (class53) this.field441.field3721.method8(-1); var3 != null; var3 = (class53) this.field441.field3721.method9(1)) {
            if ((arg1 < 0 || var3.field1321 == arg1) && var3.field1329 < 0) {
                this.field427[var3.field1321][var3.field1327] = null;
                var3.field1329 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)V", line = 40)
    private final void method158(int arg0, byte arg1) {
        field397++;
        for (class53 var3 = (class53) this.field441.field3721.method8(-1); var3 != null; var3 = (class53) this.field441.field3721.method9(1)) {
            if (arg0 < 0 || var3.field1321 == arg0) {
                if (var3.field1339 != null) {
                    var3.field1339.method886(class93.field2181 / 100);
                    if (var3.field1339.method901()) {
                        this.field441.field3734.method536(var3.field1339);
                    }
                    var3.method564(10249);
                }
                if (var3.field1329 < 0) {
                    this.field427[var3.field1321][var3.field1327] = null;
                }
                var3.method1170(110);
            }
        }
        if (arg1 >= -105) {
            this.method173(null, true, -18, null, null);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()Lh;", line = 76)
    public final synchronized class49 method159() {
        field423++;
        return this.field441;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 84)
    public static final void method160(Component arg0, byte arg1) {
        arg0.removeMouseListener(class35.field914);
        if (arg1 != 17) {
            field395 = null;
        }
        field391++;
        arg0.removeMouseMotionListener(class35.field914);
        arg0.removeFocusListener(class35.field914);
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)V", line = 99)
    public final synchronized void method161(int arg0) {
        this.field406.method382();
        this.method194((byte) -23);
        if (arg0 == -16257) {
            field377++;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V", line = 1570)
    public class15() {
        this.method194((byte) -23);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V", line = 115)
    private final void method162(int arg0, int arg1, int arg2) {
        if (arg2 == 32704) {
            this.field400[arg1] = arg0;
            field386++;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V", line = 129)
    public final synchronized void method163(int arg0) {
        if (this.field406.method373()) {
            int var2 = this.field406.field879 * 1000000 / class93.field2181;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field443;
                if (this.field439 - var3 >= 0L) {
                    this.field443 = var3;
                    break;
                }
                int var5 = (int) (((long) var2 + this.field439 - this.field443 - 1L) / (long) var2);
                this.field443 += (long) var2 * (long) var5;
                arg0 -= var5;
                this.field441.method163(var5);
                this.method176(-1);
            } while (this.field406.method373());
        }
        this.field441.method163(arg0);
        field393++;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()I", line = 165)
    public final synchronized int method164() {
        field390++;
        return 0;
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)V", line = 182)
    public final synchronized void method165(int arg0) {
        if (arg0 != 128) {
            field394 = null;
        }
        for (class134 var2 = (class134) this.field396.method992(true); var2 != null; var2 = (class134) this.field396.method993(-20300)) {
            var2.method1093(9420);
        }
        field434++;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(III)V", line = 204)
    private final void method166(int arg0, int arg1, int arg2) {
        field433++;
        if (arg1 != 2) {
            this.method179(119, (byte) -25);
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(III)V", line = 227)
    public final synchronized void method167(int arg0, int arg1, int arg2) {
        field418++;
        this.method180(false, arg1, arg0);
        if (arg2 != -2) {
            this.method179(19, (byte) -1);
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(III)V", line = 238)
    private final void method168(int arg0, int arg1, int arg2) {
        if (this.field430[arg1] != arg2) {
            this.field430[arg1] = arg2;
            for (int var4 = 0; var4 < 128; var4++) {
                this.field429[arg1][var4] = null;
            }
        }
        field383++;
        if (arg0 != 31161) {
            this.method167(-58, -71, 36);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lhd;B)Z", line = 266)
    public final boolean method169(class53 arg0, byte arg1) {
        field428++;
        if (arg0.field1339 != null) {
            if (arg1 != -111) {
                this.field440 = true;
            }
            return false;
        }
        if (arg0.field1329 >= 0) {
            arg0.method1170(102);
            if (arg0.field1332 > 0 && this.field429[arg0.field1321][arg0.field1332] == arg0) {
                this.field429[arg0.field1321][arg0.field1332] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lhd;ZI)V", line = 293)
    public final void method170(class53 arg0, boolean arg1, int arg2) {
        field380++;
        if (arg2 >= -116) {
            return;
        }
        int var4 = arg0.field1311.field2642.length;
        int var6;
        if (arg1 && arg0.field1311.field2640) {
            int var5 = var4 + var4 - arg0.field1311.field2644;
            var6 = (int) ((long) this.field375[arg0.field1321] * (long) var5 >> 6);
            int var7 = var4 << 8;
            if (var7 <= var6) {
                arg0.field1339.method906(true);
                var6 = var7 + var7 - var6 - 1;
            }
        } else {
            var6 = (int) ((long) this.field375[arg0.field1321] * (long) var4 >> 6);
        }
        arg0.field1339.method882(var6);
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "()Lh;", line = 325)
    public final synchronized class49 method171() {
        field398++;
        return null;
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V", line = 335)
    public static void method172(int arg0) {
        int var1 = 64 % ((23 - arg0) / 45);
        field438 = null;
        field395 = null;
        field373 = null;
        field407 = null;
        field435 = null;
        field394 = null;
        field432 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Loc;ZILdd;Ljb;)Z", line = 356)
    public final synchronized boolean method173(class100 arg0, boolean arg1, int arg2, class26 arg3, class64 arg4) {
        arg4.method625();
        field399++;
        int[] var6 = null;
        if (arg2 > 0) {
            var6 = new int[] { arg2 };
        }
        boolean var7 = true;
        for (class93 var8 = (class93) arg4.field1558.method992(true); var8 != null; var8 = (class93) arg4.field1558.method993(-20300)) {
            int var9 = (int) var8.field3619;
            class134 var10 = (class134) this.field396.method995(false, (long) var9);
            if (var10 == null) {
                var10 = class74.method667(false, var9, arg0);
                if (var10 == null) {
                    var7 = false;
                    continue;
                }
                this.field396.method998(var10, (long) var9, (byte) -118);
            }
            if (!var10.method1094(var6, arg3, var8.field2183, -125)) {
                var7 = false;
            }
        }
        if (arg1) {
            return true;
        } else {
            if (var7) {
                arg4.method624();
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lhd;I)I", line = 407)
    private final int method174(class53 arg0, int arg1) {
        field431++;
        int var3 = arg0.field1310 + (arg0.field1335 * arg0.field1325 >> 12);
        class77 var4 = arg0.field1320;
        int var5 = ((this.field400[arg0.field1321] - 8192) * this.field437[arg0.field1321] >> 12) + var3;
        if (var4.field1759 > 0 && (var4.field1748 > 0 || this.field412[arg0.field1321] > 0)) {
            int var6 = var4.field1748 << 2;
            int var7 = var4.field1747 << 1;
            if (arg0.field1331 < var7) {
                var6 = arg0.field1331 * var6 / var7;
            }
            int var8 = (this.field412[arg0.field1321] >> 7) + var6;
            double var9 = Math.sin((double) (arg0.field1308 & 0x1FF) * 0.01227184630308513D);
            var5 += (int) ((double) var8 * var9);
        }
        if (arg1 > -79) {
            return -70;
        } else {
            int var11 = (int) ((double) (arg0.field1311.field2643 * 256) * Math.pow(2.0D, (double) var5 * 3.255208333333333E-4D) / (double) class93.field2181 + 0.5D);
            return var11 < 1 ? 1 : var11;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILhd;)I", line = 446)
    private final int method175(int arg0, class53 arg1) {
        field372++;
        class77 var3 = arg1.field1320;
        if (arg0 != -1606872248) {
            this.method185(-14, null);
        }
        int var4 = this.field422[arg1.field1321] * this.field401[arg1.field1321] + 4096 >> 13;
        int var5 = var4 * var4 + 16384 >> 15;
        int var6 = arg1.field1314 * var5 + 16384 >> 15;
        int var7 = this.field387 * var6 + 128 >> 8;
        if (var3.field1756 > 0) {
            var7 = (int) ((double) var7 * Math.pow(0.5D, (double) arg1.field1318 * 1.953125E-5D * (double) var3.field1756) + 0.5D);
        }
        if (var3.field1757 != null) {
            int var8 = arg1.field1326;
            int var9 = var3.field1757[arg1.field1307 + 1];
            if (arg1.field1307 < var3.field1757.length - 2) {
                int var10 = (var3.field1757[arg1.field1307] & 0xFF) << 8;
                int var11 = (var3.field1757[arg1.field1307 + 2] & 0xFF) << 8;
                var9 += (var3.field1757[arg1.field1307 + 3] - var9) * (var8 - var10) / (var11 - var10);
            }
            var7 = var7 * var9 + 32 >> 6;
        }
        if (arg1.field1329 > 0 && var3.field1763 != null) {
            int var12 = arg1.field1329;
            int var13 = var3.field1763[arg1.field1324 + 1];
            if (var3.field1763.length - 2 > arg1.field1324) {
                int var14 = (var3.field1763[arg1.field1324] & 0xFF) << 8;
                int var15 = (var3.field1763[arg1.field1324 + 2] & 0xFF) << 8;
                var13 += (var3.field1763[arg1.field1324 + 3] - var13) * (var12 - var14) / (var15 - var14);
            }
            var7 = var7 * var13 + 32 >> 6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V", line = 510)
    private final void method176(int arg0) {
        if (arg0 != -1) {
            this.method185(-76, null);
        }
        field420++;
        int var2 = this.field444;
        int var3 = this.field442;
        long var4 = this.field439;
        while (this.field442 == var3) {
            while (this.field406.field880[var2] == var3) {
                this.field406.method372(var2);
                int var6 = this.field406.method377(var2);
                if (var6 == 1) {
                    this.field406.method379();
                    this.field406.method381(var2);
                    if (this.field406.method378()) {
                        if (!this.field440 || var3 == 0) {
                            this.method194((byte) -23);
                            this.field406.method382();
                            return;
                        }
                        this.field406.method380(var4);
                    }
                    break;
                }
                if ((var6 & 0x80) != 0) {
                    this.method178((byte) -106, var6);
                }
                this.field406.method374(var2);
                this.field406.method381(var2);
            }
            var2 = this.field406.method376();
            var3 = this.field406.field880[var2];
            var4 = this.field406.method375(var3);
        }
        this.field439 = var4;
        this.field442 = var3;
        this.field444 = var2;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZII)V", line = 576)
    private final void method177(boolean arg0, int arg1, int arg2) {
        this.field376[arg1] = arg2;
        if (!arg0) {
            this.method163(-19);
        }
        field419++;
        this.field385[arg1] = (int) (Math.pow(2.0D, (double) arg2 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)V", line = 588)
    private final void method178(byte arg0, int arg1) {
        int var3 = arg1 & 0xF0;
        field408++;
        if (arg0 >= -28) {
            this.field410 = null;
        }
        if (var3 == 128) {
            int var4 = arg1 & 0xF;
            int var5 = arg1 >> 8 & 0x7F;
            int var6 = arg1 >> 16 & 0x7F;
            this.method186(var5, true, var4, var6);
        } else if (var3 == 144) {
            int var7 = arg1 & 0xF;
            int var8 = arg1 >> 8 & 0x7F;
            int var9 = arg1 >> 16 & 0x7F;
            if (var9 <= 0) {
                this.method186(var8, true, var7, 64);
            } else {
                this.method184(var9, (byte) -122, var7, var8);
            }
        } else if (var3 == 160) {
            int var10 = arg1 >> 8 & 0x7F;
            int var11 = arg1 & 0xF;
            int var12 = arg1 >> 16 & 0x7F;
            this.method188(var12, var11, -123, var10);
        } else if (var3 == 176) {
            int var13 = arg1 & 0xF;
            int var14 = arg1 >> 8 & 0x7F;
            int var15 = arg1 >> 16 & 0x7F;
            if (var14 == 0) {
                this.field410[var13] = (var15 << 14) + class87.method747(-2080769, this.field410[var13]);
            }
            if (var14 == 32) {
                this.field410[var13] = (var15 << 7) + class87.method747(this.field410[var13], -16257);
            }
            if (var14 == 1) {
                this.field412[var13] = class87.method747(-16257, this.field412[var13]) + (var15 << 7);
            }
            if (var14 == 33) {
                this.field412[var13] = class87.method747(this.field412[var13], -128) + var15;
            }
            if (var14 == 5) {
                this.field379[var13] = class87.method747(-16257, this.field379[var13]) + (var15 << 7);
            }
            if (var14 == 37) {
                this.field379[var13] = class87.method747(this.field379[var13], -128) + var15;
            }
            if (var14 == 7) {
                this.field401[var13] = (var15 << 7) + class87.method747(this.field401[var13], -16257);
            }
            if (var14 == 39) {
                this.field401[var13] = class87.method747(-128, this.field401[var13]) + var15;
            }
            if (var14 == 10) {
                this.field421[var13] = class87.method747(this.field421[var13], -16257) + (var15 << 7);
            }
            if (var14 == 42) {
                this.field421[var13] = class87.method747(-128, this.field421[var13]) + var15;
            }
            if (var14 == 11) {
                this.field422[var13] = class87.method747(-16257, this.field422[var13]) + (var15 << 7);
            }
            if (var14 == 43) {
                this.field422[var13] = var15 + class87.method747(-128, this.field422[var13]);
            }
            if (var14 == 64) {
                if (var15 >= 64) {
                    this.field389[var13] = class126.method1050(this.field389[var13], 1);
                } else {
                    this.field389[var13] = class87.method747(this.field389[var13], -2);
                }
            }
            if (var14 == 65) {
                if (var15 >= 64) {
                    this.field389[var13] = class126.method1050(this.field389[var13], 2);
                } else {
                    this.method181(-2, var13);
                    this.field389[var13] = class87.method747(this.field389[var13], -3);
                }
            }
            if (var14 == 99) {
                this.field414[var13] = class87.method747(127, this.field414[var13]) + (var15 << 7);
            }
            if (var14 == 98) {
                this.field414[var13] = class87.method747(this.field414[var13], 16256) + var15;
            }
            if (var14 == 101) {
                this.field414[var13] = (var15 << 7) + class87.method747(this.field414[var13], 127) + 16384;
            }
            if (var14 == 100) {
                this.field414[var13] = class87.method747(16256, this.field414[var13]) + var15 + 16384;
            }
            if (var14 == 120) {
                this.method158(var13, (byte) -122);
            }
            if (var14 == 121) {
                this.method179(var13, (byte) -105);
            }
            if (var14 == 123) {
                this.method157(false, var13);
            }
            if (var14 == 6) {
                int var16 = this.field414[var13];
                if (var16 == 16384) {
                    this.field437[var13] = (var15 << 7) + class87.method747(-16257, this.field437[var13]);
                }
            }
            if (var14 == 38) {
                int var17 = this.field414[var13];
                if (var17 == 16384) {
                    this.field437[var13] = class87.method747(-128, this.field437[var13]) + var15;
                }
            }
            if (var14 == 16) {
                this.field375[var13] = (var15 << 7) + class87.method747(-16257, this.field375[var13]);
            }
            if (var14 == 48) {
                this.field375[var13] = class87.method747(-128, this.field375[var13]) + var15;
            }
            if (var14 == 81) {
                if (var15 < 64) {
                    this.method195(var13, (byte) 39);
                    this.field389[var13] = class87.method747(this.field389[var13], -5);
                } else {
                    this.field389[var13] = class126.method1050(this.field389[var13], 4);
                }
            }
            if (var14 == 17) {
                this.method177(true, var13, (var15 << 7) + (this.field376[var13] & 0xFFFFC07F));
            }
            if (var14 == 49) {
                this.method177(true, var13, (this.field376[var13] & 0xFFFFFF80) + var15);
            }
        } else if (var3 == 192) {
            int var18 = arg1 & 0xF;
            int var19 = arg1 >> 8 & 0x7F;
            this.method168(31161, var18, this.field410[var18] + var19);
        } else if (var3 == 208) {
            int var20 = arg1 >> 8 & 0x7F;
            int var21 = arg1 & 0xF;
            this.method166(var21, 2, var20);
        } else if (var3 == 224) {
            int var22 = arg1 & 0xF;
            int var23 = (arg1 >> 9 & 0x3F80) + (arg1 >> 8 & 0x7F);
            this.method162(var23, var22, 32704);
        } else {
            int var24 = arg1 & 0xFF;
            if (var24 == 255) {
                this.method194((byte) -23);
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(IB)V", line = 841)
    private final void method179(int arg0, byte arg1) {
        field403++;
        if (arg0 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.method179(var3, (byte) -105);
            }
            return;
        }
        this.field401[arg0] = 12800;
        this.field421[arg0] = 8192;
        this.field422[arg0] = 16383;
        this.field400[arg0] = 8192;
        this.field412[arg0] = 0;
        this.field379[arg0] = 8192;
        this.method181(-2, arg0);
        this.method195(arg0, (byte) -68);
        this.field389[arg0] = 0;
        this.field414[arg0] = 32767;
        this.field437[arg0] = 256;
        this.field375[arg0] = 0;
        this.method177(true, arg0, 8192);
        if (arg1 > -93) {
            this.field406 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(ZII)V", line = 877)
    private final void method180(boolean arg0, int arg1, int arg2) {
        this.field426[arg2] = arg1;
        field413++;
        this.field410[arg2] = class87.method747(arg1, -128);
        this.method168(31161, arg2, arg1);
        if (arg0) {
            this.method166(96, 115, 127);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V", line = 899)
    private final void method181(int arg0, int arg1) {
        if ((this.field389[arg1] & 0x2) != 0) {
            for (class53 var3 = (class53) this.field441.field3721.method8(-1); var3 != null; var3 = (class53) this.field441.field3721.method9(1)) {
                if (var3.field1321 == arg1 && this.field427[arg1][var3.field1327] == null && var3.field1329 < 0) {
                    var3.field1329 = 0;
                }
            }
        }
        field388++;
        if (arg0 != -2) {
            this.field410 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "h", descriptor = "(I)V", line = 940)
    public final synchronized void method182(int arg0) {
        class134 var2 = (class134) this.field396.method992(true);
        if (arg0 != 2002216710) {
            this.field396 = null;
        }
        while (var2 != null) {
            var2.method1170(arg0 - 2002216705);
            var2 = (class134) this.field396.method993(-20300);
        }
        field378++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)Z", line = 961)
    public final synchronized boolean method183(boolean arg0) {
        field411++;
        if (!arg0) {
            this.field387 = -67;
        }
        return this.field406.method373();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IBII)V", line = 972)
    private final void method184(int arg0, byte arg1, int arg2, int arg3) {
        field392++;
        this.method186(arg3, true, arg2, 64);
        if ((this.field389[arg2] & 0x2) != 0) {
            for (class53 var5 = (class53) this.field441.field3721.method15(false); var5 != null; var5 = (class53) this.field441.field3721.method14(-18320)) {
                if (var5.field1321 == arg2 && var5.field1329 < 0) {
                    this.field427[arg2][var5.field1327] = null;
                    this.field427[arg2][arg3] = var5;
                    int var6 = (var5.field1335 * var5.field1325 >> 12) + var5.field1310;
                    var5.field1310 += arg3 - var5.field1327 << 8;
                    var5.field1335 = 4096;
                    var5.field1327 = arg3;
                    var5.field1325 = var6 - var5.field1310;
                    return;
                }
            }
        }
        class134 var7 = (class134) this.field396.method995(false, (long) this.field430[arg2]);
        if (var7 == null) {
            return;
        }
        class105 var8 = var7.field3372[arg3];
        if (var8 == null) {
            return;
        }
        class53 var9 = new class53();
        var9.field1309 = var7;
        var9.field1321 = arg2;
        var9.field1311 = var8;
        var9.field1320 = var7.field3369[arg3];
        var9.field1332 = var7.field3382[arg3];
        var9.field1327 = arg3;
        if (arg1 > -88) {
            return;
        }
        var9.field1314 = var7.field3388[arg3] * var7.field3383 * arg0 * arg0 + 1024 >> 11;
        var9.field1312 = var7.field3387[arg3] & 0xFF;
        var9.field1310 = (arg3 << 8) - (var7.field3376[arg3] & 0x7FFF);
        var9.field1326 = 0;
        var9.field1329 = -1;
        var9.field1307 = 0;
        var9.field1324 = 0;
        var9.field1318 = 0;
        if (this.field375[arg2] == 0) {
            var9.field1339 = class102.method885(var8, this.method174(var9, -121), this.method175(-1606872248, var9), this.method185(115, var9));
        } else {
            var9.field1339 = class102.method885(var8, this.method174(var9, -90), 0, this.method185(118, var9));
            this.method170(var9, var7.field3376[arg3] < 0, -124);
        }
        if (var7.field3376[arg3] < 0) {
            var9.field1339.method877(-1);
        }
        if (var9.field1332 >= 0) {
            class53 var10 = this.field429[arg2][var9.field1332];
            if (var10 != null && var10.field1329 < 0) {
                this.field427[arg2][var10.field1327] = null;
                var10.field1329 = 0;
            }
            this.field429[arg2][var9.field1332] = var9;
        }
        this.field441.field3721.method19(var9, 7);
        this.field427[arg2][arg3] = var9;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(ILhd;)I", line = 1066)
    private final int method185(int arg0, class53 arg1) {
        if (arg0 <= 61) {
            field435 = null;
        }
        int var3 = this.field421[arg1.field1321];
        field384++;
        return var3 >= 8192 ? 16384 - ((16384 - var3) * (-arg1.field1312 + 128) + 32 >> 6) : arg1.field1312 * var3 + 32 >> 6;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IZII)V", line = 1092)
    private final void method186(int arg0, boolean arg1, int arg2, int arg3) {
        class53 var5 = this.field427[arg2][arg0];
        if (!arg1) {
            this.method194((byte) -36);
        }
        field409++;
        if (var5 == null) {
            return;
        }
        this.field427[arg2][arg0] = null;
        if ((this.field389[arg2] & 0x2) == 0) {
            var5.field1329 = 0;
            return;
        }
        for (class53 var6 = (class53) this.field441.field3721.method8(-1); var6 != null; var6 = (class53) this.field441.field3721.method9(1)) {
            if (var5.field1321 == var6.field1321 && var6.field1329 < 0 && var5 != var6) {
                var5.field1329 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(BI)V", line = 1131)
    public final synchronized void method187(byte arg0, int arg1) {
        this.field387 = arg1;
        if (arg0 > -65) {
            field407 = null;
        }
        field382++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIII)V", line = 1153)
    private final void method188(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > -92) {
            this.field444 = -127;
        }
        field371++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLuc;B)V", line = 1163)
    public static final void method189(boolean arg0, class139 arg1, byte arg2) {
        field415++;
        if (client.field563 != null) {
            try {
                client.field563.method1145(arg2 + 5166);
            } catch (Exception var8) {
            }
            client.field563 = null;
        }
        client.field563 = arg1;
        class30.method368(101, arg0);
        class65.field1564 = null;
        class16.field454 = null;
        class12.field307.field710 = 0;
        class126.field3211 = 0;
        if (arg2 != -93) {
            return;
        }
        while (true) {
            class92 var3 = (class92) class104.field2625.method992(true);
            if (var3 == null) {
                while (true) {
                    class92 var4 = (class92) class82.field1830.method992(true);
                    if (var4 == null) {
                        if (class30.field859 != 0) {
                            try {
                                class25 var5 = new class25(4);
                                var5.method326(4, (byte) -58);
                                var5.method326(class30.field859, (byte) -88);
                                var5.method325(0, 94);
                                client.field563.method1140(true, 4, 0, var5.field711);
                            } catch (IOException var7) {
                                try {
                                    client.field563.method1145(5073);
                                } catch (Exception var6) {
                                }
                                client.field563 = null;
                                class24.field653++;
                            }
                        }
                        class43.field1176 = 0;
                        class72.field1684 = class29.method361(-5321);
                        return;
                    }
                    class151.field3748.method522(-113, var4);
                    class42.field1138.method998(var4, var4.field3619, (byte) -118);
                    class1.field6--;
                    class70.field1651++;
                }
            }
            class87.field1985.method998(var3, var3.field3619, (byte) -118);
            class34.field900++;
            class113.field2968--;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(IB)Lf;", line = 1258)
    public static final class36 method190(int arg0, byte arg1) {
        field381++;
        class36 var2 = (class36) class39.field1100.method931(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 > -70) {
            method190(31, (byte) 98);
        }
        byte[] var3 = class143.field3598.method839(5, 8, arg0);
        class36 var4 = new class36();
        if (var3 != null) {
            var4.method418(new class25(var3), (byte) -86);
        }
        class39.field1100.method934(0, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!c", name = "i", descriptor = "(I)I", line = 1283)
    public final int method191(int arg0) {
        field436++;
        if (arg0 != 19426) {
            this.field440 = true;
        }
        return this.field387;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljb;ZI)V", line = 1294)
    public final synchronized void method192(class64 arg0, boolean arg1, int arg2) {
        if (arg2 >= -9) {
            this.field441 = null;
        }
        field402++;
        this.method161(-16257);
        this.field406.method383(arg0.field1559);
        this.field443 = 0L;
        this.field440 = arg1;
        int var4 = this.field406.method385();
        for (int var5 = 0; var5 < var4; var5++) {
            this.field406.method372(var5);
            this.field406.method374(var5);
            this.field406.method381(var5);
        }
        this.field444 = this.field406.method376();
        this.field442 = this.field406.field880[this.field444];
        this.field439 = this.field406.method375(this.field442);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "([III)V", line = 1334)
    public final synchronized void method193(int[] arg0, int arg1, int arg2) {
        if (this.field406.method373()) {
            int var4 = this.field406.field879 * 1000000 / class93.field2181;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field443;
                if (this.field439 - var5 >= 0L) {
                    this.field443 = var5;
                    break;
                }
                int var7 = (int) (((long) var4 + this.field439 - this.field443 - 1L) / (long) var4);
                this.field443 += (long) var4 * (long) var7;
                arg2 -= var7;
                this.field441.method193(arg0, arg1, var7);
                this.method176(-1);
                arg1 += var7;
            } while (this.field406.method373());
        }
        field404++;
        this.field441.method193(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(B)V", line = 1375)
    private final void method194(byte arg0) {
        this.method158(-1, (byte) -122);
        this.method179(-1, (byte) -128);
        field424++;
        for (int var2 = 0; var2 < 16; var2++) {
            this.field430[var2] = this.field426[var2];
        }
        if (arg0 != -23) {
            this.method174(null, 10);
        }
        for (int var3 = 0; var3 < 16; var3++) {
            this.field410[var3] = class87.method747(this.field426[var3], -128);
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(IB)V", line = 1401)
    private final void method195(int arg0, byte arg1) {
        int var3 = -121 / ((-arg1 - 24) / 42);
        field425++;
        if ((this.field389[arg0] & 0x4) == 0) {
            return;
        }
        for (class53 var4 = (class53) this.field441.field3721.method8(-1); var4 != null; var4 = (class53) this.field441.field3721.method9(1)) {
            if (var4.field1321 == arg0) {
                var4.field1306 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILhd;[III)Z", line = 1442)
    public final boolean method196(int arg0, class53 arg1, int[] arg2, int arg3, int arg4) {
        field374++;
        arg1.field1315 = class93.field2181 / 100;
        if (arg1.field1329 >= 0 && (arg1.field1339 == null || arg1.field1339.method899())) {
            arg1.method564(10249);
            arg1.method1170(31);
            if (arg1.field1332 > 0 && this.field429[arg1.field1321][arg1.field1332] == arg1) {
                this.field429[arg1.field1321][arg1.field1332] = null;
            }
            return true;
        }
        int var6 = arg1.field1335;
        if (var6 > 0) {
            int var7 = var6 - (int) (Math.pow(2.0D, (double) this.field379[arg1.field1321] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var7 < 0) {
                var7 = 0;
            }
            arg1.field1335 = var7;
        }
        arg1.field1339.method910(this.method174(arg1, -100));
        class77 var8 = arg1.field1320;
        if (arg0 >= -101) {
            return false;
        }
        arg1.field1308 += var8.field1759;
        double var9 = (double) ((arg1.field1327 - 60 << 8) + (arg1.field1335 * arg1.field1325 >> 12)) * 5.086263020833333E-6D;
        boolean var11 = false;
        arg1.field1331++;
        if (var8.field1756 > 0) {
            if (var8.field1758 <= 0) {
                arg1.field1318 += 128;
            } else {
                arg1.field1318 += (int) (Math.pow(2.0D, (double) var8.field1758 * var9) * 128.0D + 0.5D);
            }
        }
        if (var8.field1757 != null) {
            if (var8.field1749 > 0) {
                arg1.field1326 += (int) (Math.pow(2.0D, (double) var8.field1749 * var9) * 128.0D + 0.5D);
            } else {
                arg1.field1326 += 128;
            }
            while (var8.field1757.length - 2 > arg1.field1307 && (var8.field1757[arg1.field1307 + 2] & 0xFF) << 8 < arg1.field1326) {
                arg1.field1307 += 2;
            }
            if (var8.field1757.length - 2 == arg1.field1307 && var8.field1757[arg1.field1307 + 1] == 0) {
                var11 = true;
            }
        }
        if (arg1.field1329 >= 0 && var8.field1763 != null && (this.field389[arg1.field1321] & 0x1) == 0 && (arg1.field1332 < 0 || this.field429[arg1.field1321][arg1.field1332] != arg1)) {
            if (var8.field1761 <= 0) {
                arg1.field1329 += 128;
            } else {
                arg1.field1329 += (int) (Math.pow(2.0D, (double) var8.field1761 * var9) * 128.0D + 0.5D);
            }
            while (var8.field1763.length - 2 > arg1.field1324 && (var8.field1763[arg1.field1324 + 2] & 0xFF) << 8 < arg1.field1329) {
                arg1.field1324 += 2;
            }
            if (var8.field1763.length - 2 == arg1.field1324) {
                var11 = true;
            }
        }
        if (!var11) {
            arg1.field1339.method897(arg1.field1315, this.method175(-1606872248, arg1), this.method185(104, arg1));
            return false;
        }
        arg1.field1339.method886(arg1.field1315);
        if (arg2 == null) {
            arg1.field1339.method163(arg3);
        } else {
            arg1.field1339.method193(arg2, arg4, arg3);
        }
        if (arg1.field1339.method901()) {
            this.field441.field3734.method536(arg1.field1339);
        }
        arg1.method564(10249);
        if (arg1.field1329 >= 0) {
            arg1.method1170(35);
            if (arg1.field1332 > 0 && this.field429[arg1.field1321][arg1.field1332] == arg1) {
                this.field429[arg1.field1321][arg1.field1332] = null;
            }
        }
        return true;
    }
}
