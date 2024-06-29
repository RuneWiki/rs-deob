import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class23 {

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    private int field259 = 0;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    private int field261 = 0;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Led;")
    private class427 field264 = null;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    private int field266 = 0;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Lna;")
    private class211 field257;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Lwc;")
    private class273 field265;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[Lwi;")
    private class348[] field258;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Lcj;")
    public class216 field260;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lbi;")
    public static class104 field262 = new class104(68, 2);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIZIZ)V")
    public final void method144(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        field255++;
        boolean var7 = arg3 & this.field257.method1266();
        if (!var7 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
            if (arg2 == 4) {
                arg1 = arg0;
            }
            arg2 = 2;
        }
        if (arg2 != 0 && arg5) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field261 != arg2) {
            if (this.field261 != 0) {
                this.field258[this.field261 & Integer.MAX_VALUE].method265(126);
            }
            if (arg2 != 0) {
                this.field258[Integer.MAX_VALUE & arg2].method261(arg5, (byte) -40);
                this.field258[arg2 & Integer.MAX_VALUE].method262(arg5, (byte) -84);
                this.field258[Integer.MAX_VALUE & arg2].method263(arg1, arg0, (byte) -94);
            }
            this.field266 = arg1;
            this.field264 = null;
            this.field259 = arg0;
            this.field261 = arg2;
        } else if (this.field261 != 0) {
            this.field258[this.field261 & Integer.MAX_VALUE].method262(arg5, (byte) -77);
            if (this.field259 != arg0 || this.field266 != arg1) {
                this.field258[Integer.MAX_VALUE & this.field261].method263(arg1, arg0, (byte) -95);
                this.field266 = arg1;
                this.field259 = arg0;
            }
        }
        if (arg4 != 17101) {
            field262 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)Z")
    public final boolean method145(byte arg0, int arg1) {
        field256++;
        if (arg0 <= 63) {
            method146(88);
        }
        return this.field258[arg1].method267(-233);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method146(int arg0) {
        field262 = null;
        if (arg0 != 6) {
            field262 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BILed;)Z")
    public final boolean method147(byte arg0, int arg1, class427 arg2) {
        field263++;
        if (this.field261 == 0) {
            return false;
        }
        if (this.field264 != arg2) {
            this.field258[this.field261 & Integer.MAX_VALUE].method264(arg1, 34, arg2);
            this.field264 = arg2;
        }
        int var4 = 42 / ((arg0 + 24) / 58);
        return true;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lna;)V")
    public class23(class211 arg0) {
        this.field257 = arg0;
        this.field265 = new class273(arg0);
        this.field258 = new class348[10];
        this.field258[1] = new class42(arg0);
        this.field258[2] = new class520(arg0, this.field265);
        this.field258[4] = new class538(arg0, this.field265);
        this.field258[5] = new class309(arg0, this.field265);
        this.field258[6] = new class421(arg0);
        this.field258[7] = new class240(arg0);
        this.field258[3] = this.field260 = new class216(arg0);
        this.field258[8] = new class358(arg0, this.field265);
        this.field258[9] = new class134(arg0, this.field265);
        if (!this.field258[8].method267(-233)) {
            this.field258[8] = this.field258[4];
        }
        if (!this.field258[9].method267(-233)) {
            this.field258[9] = this.field258[8];
        }
    }
}
