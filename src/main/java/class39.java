import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class39 extends class199 {

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "Z")
    private boolean field590 = false;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "I")
    private int field595 = 0;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "I")
    private int field604 = -32768;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
    private int field601 = 0;

    @OriginalMember(owner = "client!hl", name = "ab", descriptor = "I")
    private int field617 = -1;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client!hl", name = "U", descriptor = "I")
    public int field611;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client!hl", name = "Z", descriptor = "I")
    private int field616;

    @OriginalMember(owner = "client!hl", name = "V", descriptor = "I")
    public int field612;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public int field586;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public int field584;

    @OriginalMember(owner = "client!hl", name = "T", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    private int field579;

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "Lek;")
    private class164 field606;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Lid;")
    public static class149 field577 = class60.method382("details", (byte) 2);

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "Lid;")
    public static class149 field593 = class60.method382("Connexion au serveur de mise -9 jour en cours", (byte) 41);

    @OriginalMember(owner = "client!hl", name = "Y", descriptor = "I")
    public static int field615 = -1;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
    public static int field588 = 0;

    @OriginalMember(owner = "client!hl", name = "S", descriptor = "Lid;")
    public static class149 field609 = class60.method382("sch-Utteln:", (byte) 108);

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "D")
    private double field575;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "D")
    public double field587;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "D")
    private double field597;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "D")
    public double field602;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "D")
    public double field605;

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "D")
    private double field608;

    @OriginalMember(owner = "client!hl", name = "bb", descriptor = "D")
    private double field618;

    @OriginalMember(owner = "client!hl", name = "cb", descriptor = "D")
    private double field619;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public int field580;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "I")
    private int field603;

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!hl", name = "W", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!hl", name = "X", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "Lse;")
    public static class205 field599;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "Lue;")
    private class88 field576;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIIIIJILue;)V")
    public final void method54(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class88 arg10) {
        class262 var13 = this.method232(2047);
        field607++;
        if (var13 != null) {
            var13.method54(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field576);
            this.field604 = var13.method53();
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lal;II)Z")
    public static final boolean method226(class230 arg0, int arg1, int arg2) {
        int var3 = -106 / ((arg2 + 43) / 44);
        byte[] var4 = arg0.method1547(arg1, 126);
        field598++;
        if (var4 == null) {
            return false;
        } else {
            class219.method1479((byte) 50, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)V")
    public final void method227(byte arg0, int arg1) {
        this.field590 = true;
        this.field605 += (double) arg1 * this.field619;
        if (this.field579 == -1) {
            this.field602 += (double) arg1 * this.field597;
        } else {
            this.field602 += this.field608 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field597;
            this.field597 += (double) arg1 * this.field608;
        }
        field581++;
        this.field587 += (double) arg1 * this.field575;
        if (arg0 != 28) {
            this.method232(47);
        }
        this.field580 = (int) (Math.atan2(this.field619, this.field575) * 325.949D) + 1024 & 0x7FF;
        this.field603 = (int) (Math.atan2(this.field597, this.field618) * 325.949D) & 0x7FF;
        if (this.field606 == null) {
            return;
        }
        this.field601 += arg1;
        while (true) {
            do {
                do {
                    if (this.field601 <= this.field606.field3060[this.field595]) {
                        return;
                    }
                    this.field601 -= this.field606.field3060[this.field595];
                    this.field595++;
                    if (this.field606.field3035.length <= this.field595) {
                        this.field595 -= this.field606.field3061;
                        if (this.field595 < 0 || this.field595 >= this.field606.field3035.length) {
                            this.field595 = 0;
                        }
                    }
                    this.field617 = this.field595 + 1;
                } while (this.field606.field3035.length > this.field617);
                this.field617 -= this.field606.field3061;
            } while (this.field617 >= 0 && this.field606.field3035.length > this.field617);
            this.field617 = -1;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V")
    public static void method228(byte arg0) {
        field609 = null;
        if (arg0 <= -34) {
            field599 = null;
            field577 = null;
            field593 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lgd;B)Lgh;")
    public static final class24 method229(class74 arg0, byte arg1) {
        field592++;
        class24 var2 = new class24(arg0.method529(-1), arg0.method529(-1), arg0.method485(-2386), arg0.method485(-2386), arg0.method498((byte) 125), arg0.method489((byte) 82) == 1, arg0.method489((byte) 103));
        int var3 = arg0.method489((byte) -78);
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field364.method1131(new class32(arg0.method485(-2386), arg0.method485(-2386), arg0.method485(-2386), arg0.method485(-2386)), false);
        }
        if (arg1 >= -79) {
            method226((class230) null, -33, 94);
        }
        var2.method135(0);
        return var2;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBIIIII)V")
    public static final void method230(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field589++;
        int var7 = arg2 + arg5;
        int var8 = arg4 - arg2;
        int var9 = arg2 + arg3;
        int var10 = arg0 - arg2;
        for (int var11 = arg5; var11 < var7; var11++) {
            class141.method987(2, arg3, class15.field220[var11], arg0, arg6);
        }
        for (int var12 = arg4; var12 > var8; var12--) {
            class141.method987(2, arg3, class15.field220[var12], arg0, arg6);
        }
        if (arg1 != -62) {
            method226((class230) null, 52, 23);
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class15.field220[var13];
            class141.method987(arg1 ^ 0xFFFFFFC0, arg3, var14, var9, arg6);
            class141.method987(2, var10, var14, arg0, arg6);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BIIII)V")
    public final void method231(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field614++;
        if (!this.field590) {
            double var6 = (double) (arg3 - this.field616);
            double var8 = (double) (arg1 - this.field582);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field602 = (double) this.field585;
            this.field587 = (double) this.field583 * var6 / var10 + (double) this.field616;
            this.field605 = (double) this.field583 * var8 / var10 + (double) this.field582;
        }
        double var12 = (double) (this.field586 + 1 - arg4);
        this.field619 = ((double) arg1 - this.field605) / var12;
        this.field575 = ((double) arg3 - this.field587) / var12;
        this.field618 = Math.sqrt(this.field619 * this.field619 + this.field575 * this.field575);
        if (this.field579 == -1) {
            this.field597 = ((double) arg2 - this.field602) / var12;
        } else {
            if (!this.field590) {
                this.field597 = -this.field618 * Math.tan((double) this.field579 * 0.02454369D);
            }
            this.field608 = ((double) arg2 - this.field602 - this.field597 * var12) * 2.0D / (var12 * var12);
        }
        if (arg0 > -77) {
            this.field583 = 19;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIII)V")
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field594++;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)Lnd;")
    private final class262 method232(int arg0) {
        field613++;
        class288 var2 = class200.method1374(-17177, this.field600);
        class262 var3 = var2.method1972(this.field617, (byte) -67, this.field601, this.field595);
        if (arg0 != 2047) {
            this.field576 = null;
        }
        if (var3 == null) {
            return null;
        } else {
            var3.method858(this.field603);
            return var3;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "()I")
    public final int method53() {
        field578++;
        return this.field604;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)Laf;")
    public static final class68 method233(int arg0, int arg1) {
        field596++;
        class68 var2 = (class68) class129.field2273.method800(261775, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class90.field1607.method1562(-809612665, arg1, 26);
        class68 var4 = new class68();
        int var5 = 14 / ((arg0 + 6) / 62);
        if (var3 != null) {
            var4.method419(-1, new class74(var3));
        }
        class129.field2273.method802((long) arg1, 0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field583 = arg8;
        this.field611 = arg5;
        this.field582 = arg2;
        this.field616 = arg3;
        this.field590 = false;
        this.field612 = arg1;
        this.field600 = arg0;
        this.field586 = arg6;
        this.field585 = arg4;
        this.field584 = arg9;
        this.field610 = arg10;
        this.field579 = arg7;
        int var12 = class200.method1374(-17177, this.field600).field5130;
        if (var12 == -1) {
            this.field606 = null;
        } else {
            this.field606 = class69.method436(var12, -32);
        }
    }
}
