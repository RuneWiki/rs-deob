import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class15 extends class29 {

    @OriginalMember(owner = "client!c", name = "gb", descriptor = "I")
    private int field377 = 0;

    @OriginalMember(owner = "client!c", name = "jb", descriptor = "Z")
    private boolean field380 = false;

    @OriginalMember(owner = "client!c", name = "Mb", descriptor = "I")
    private int field409 = 0;

    @OriginalMember(owner = "client!c", name = "fb", descriptor = "I")
    public int field376;

    @OriginalMember(owner = "client!c", name = "kb", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client!c", name = "xb", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "client!c", name = "yb", descriptor = "I")
    private int field395;

    @OriginalMember(owner = "client!c", name = "Qb", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client!c", name = "sb", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "client!c", name = "Lb", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client!c", name = "Cb", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!c", name = "ib", descriptor = "I")
    public int field379;

    @OriginalMember(owner = "client!c", name = "Ab", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client!c", name = "Bb", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "client!c", name = "zb", descriptor = "Lh;")
    private class49 field396;

    @OriginalMember(owner = "client!c", name = "mb", descriptor = "[[B")
    public static byte[][] field383 = new byte[1000][];

    @OriginalMember(owner = "client!c", name = "vb", descriptor = "Li;")
    public static class56 field392 = new class56(64);

    @OriginalMember(owner = "client!c", name = "Eb", descriptor = "Lwd;")
    public static class150 field401 = class2.method9(true, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!c", name = "Fb", descriptor = "I")
    public static int field402 = 20;

    @OriginalMember(owner = "client!c", name = "Kb", descriptor = "[I")
    public static int[] field407 = new int[1000];

    @OriginalMember(owner = "client!c", name = "Nb", descriptor = "Lwd;")
    public static class150 field410 = class2.method9(true, "::errortest");

    @OriginalMember(owner = "client!c", name = "Pb", descriptor = "Lwd;")
    public static class150 field412 = class2.method9(true, "Abbrechen");

    @OriginalMember(owner = "client!c", name = "nb", descriptor = "D")
    private double field384;

    @OriginalMember(owner = "client!c", name = "ob", descriptor = "D")
    public double field385;

    @OriginalMember(owner = "client!c", name = "qb", descriptor = "D")
    private double field387;

    @OriginalMember(owner = "client!c", name = "rb", descriptor = "D")
    public double field388;

    @OriginalMember(owner = "client!c", name = "tb", descriptor = "D")
    public double field390;

    @OriginalMember(owner = "client!c", name = "ub", descriptor = "D")
    private double field391;

    @OriginalMember(owner = "client!c", name = "wb", descriptor = "D")
    private double field393;

    @OriginalMember(owner = "client!c", name = "Gb", descriptor = "D")
    private double field403;

    @OriginalMember(owner = "client!c", name = "hb", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!c", name = "lb", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!c", name = "pb", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!c", name = "Db", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client!c", name = "Hb", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!c", name = "Jb", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!c", name = "Ob", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!c", name = "Ib", descriptor = "Lja;")
    public static class63 field405;

    @OriginalMember(owner = "client!c", name = "Rb", descriptor = "[I")
    public static int[] field414;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)Lpa;")
    public static final class105 method110(int arg0, int arg1) {
        field382++;
        class105 var2 = (class105) field392.method440((long) arg0, 26976);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class4.field83.method315(arg0, true, arg1);
        class105 var4 = new class105();
        if (var3 != null) {
            var4.method723(arg1 + 7797, new class148(var3));
        }
        field392.method433(var4, (long) arg0, (byte) -122);
        return var4;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)Lbe;")
    public final class13 method12(boolean arg0) {
        field411++;
        if (!arg0) {
            this.field379 = -104;
        }
        class107 var2 = class128.method971(!arg0, this.field395);
        class13 var3 = var2.method738((byte) -125, this.field409);
        if (var3 == null) {
            return null;
        } else {
            var3.method92(this.field400);
            return var3;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIBI)V")
    public final void method111(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (!this.field380) {
            double var6 = (double) (arg1 - this.field397);
            double var8 = (double) (arg0 - this.field413);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field388 = (double) this.field399 * var6 / var10 + (double) this.field397;
            this.field385 = (double) this.field399 * var8 / var10 + (double) this.field413;
            this.field390 = this.field408;
        }
        field378++;
        double var12 = (double) (this.field376 + 1 - arg4);
        this.field393 = ((double) arg0 - this.field385) / var12;
        this.field384 = ((double) arg1 - this.field388) / var12;
        if (arg3 >= -10) {
            this.method112(51, (byte) -10);
        }
        this.field391 = Math.sqrt(this.field393 * this.field393 + this.field384 * this.field384);
        if (!this.field380) {
            this.field403 = -this.field391 * Math.tan((double) this.field381 * 0.02454369D);
        }
        this.field387 = ((double) arg2 - this.field390 - this.field403 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)V")
    public final void method112(int arg0, byte arg1) {
        this.field388 += (double) arg0 * this.field384;
        field386++;
        this.field380 = true;
        this.field385 += (double) arg0 * this.field393;
        this.field390 += this.field387 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field403;
        this.field403 += (double) arg0 * this.field387;
        if (arg1 < 25) {
            this.field396 = null;
        }
        this.field404 = (int) (Math.atan2(this.field393, this.field384) * 325.949D) + 1024 & 0x7FF;
        this.field400 = (int) (Math.atan2(this.field403, this.field391) * 325.949D) & 0x7FF;
        if (this.field396 == null) {
            return;
        }
        this.field377 += arg0;
        while (true) {
            do {
                do {
                    if (this.field396.field1298[this.field409] >= this.field377) {
                        return;
                    }
                    this.field377 -= this.field396.field1298[this.field409];
                    this.field409++;
                } while (this.field396.field1308.length > this.field409);
                this.field409 -= this.field396.field1306;
            } while (this.field409 >= 0 && this.field409 < this.field396.field1308.length);
            this.field409 = 0;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public static void method113(int arg0) {
        field392 = null;
        field414 = null;
        if (arg0 != 16) {
            method110(110, -42);
        }
        field405 = null;
        field383 = null;
        field412 = null;
        field410 = null;
        field401 = null;
        field407 = null;
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field376 = arg6;
        this.field381 = arg7;
        this.field394 = arg5;
        this.field395 = arg0;
        this.field413 = arg2;
        this.field389 = arg10;
        this.field408 = arg4;
        this.field399 = arg8;
        this.field379 = arg1;
        this.field397 = arg3;
        this.field380 = false;
        this.field398 = arg9;
        int var12 = class128.method971(false, this.field395).field2409;
        if (var12 == -1) {
            this.field396 = null;
        } else {
            this.field396 = class111.method785(var12, 22969);
        }
    }
}
