import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class641 {

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    private int field9305 = 0;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "I")
    private int field9307 = 0;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "Lbaa;")
    private class541 field9310 = null;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "I")
    private int field9309 = 0;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "Los;")
    private class468 field9312;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "Lkm;")
    private class120 field9311;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "[Lfq;")
    private class118[] field9306;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "Lgh;")
    public class76 field9313;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "Lqu;")
    public static class364 field9314 = new class364(6, 4);

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field9304;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    public static int field9315;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
    public static int field9316;

    static {
        new class487("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)V", line = 5)
    public static void method3709(boolean arg0) {
        field9314 = null;
        if (!arg0) {
            field9314 = null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZLps;)Ltk;", line = 20)
    public static final class371 method3710(boolean arg0, class428 arg1) {
        arg1.method2561((byte) 124);
        field9315++;
        int var2 = arg1.method2561((byte) 107);
        if (arg0) {
            return null;
        }
        class371 var3 = class298.method1841(-25842, var2);
        var3.field5363 = arg1.method2561((byte) 107);
        int var4 = arg1.method2561((byte) -93);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method2561((byte) -89);
            var3.method81(var6, (byte) 102, arg1);
        }
        var3.method212(-19103);
        return var3;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lbaa;IB)Z", line = 56)
    public final boolean method3711(class541 arg0, int arg1, byte arg2) {
        field9304++;
        if (arg2 != 54) {
            this.field9306 = null;
        }
        if (this.field9305 == 0) {
            return false;
        }
        if (this.field9310 != arg0) {
            this.field9306[Integer.MAX_VALUE & this.field9305].method440(arg0, arg1, (byte) -124);
            this.field9310 = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Los;)V", line = 174)
    public class641(class468 arg0) {
        this.field9312 = arg0;
        this.field9311 = new class120(arg0);
        this.field9306 = new class118[10];
        this.field9306[1] = new class634(arg0);
        this.field9306[2] = new class338(arg0, this.field9311);
        this.field9306[4] = new class302(arg0, this.field9311);
        this.field9306[5] = new class365(arg0, this.field9311);
        this.field9306[6] = new class625(arg0);
        this.field9306[7] = new class595(arg0);
        this.field9306[3] = this.field9313 = new class76(arg0);
        this.field9306[8] = new class136(arg0, this.field9311);
        this.field9306[9] = new class575(arg0, this.field9311);
        if (!this.field9306[8].method446((byte) 29)) {
            this.field9306[8] = this.field9306[4];
        }
        if (!this.field9306[9].method446((byte) 29)) {
            this.field9306[9] = this.field9306[8];
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)Z", line = 86)
    public final boolean method3712(byte arg0, int arg1) {
        field9316++;
        int var3 = -112 / ((-arg0 - 61) / 62);
        return this.field9306[arg1].method446((byte) 29);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZIIIZ)V", line = 96)
    public final void method3713(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field9308++;
        boolean var7 = arg1 & this.field9312.method973();
        if (!var7 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
            if (arg4 == 4) {
                arg0 = arg2;
            }
            arg4 = 2;
        }
        if (arg4 != 0 && arg5) {
            arg4 |= Integer.MIN_VALUE;
        }
        if (this.field9305 != arg4) {
            if (this.field9305 != 0) {
                this.field9306[Integer.MAX_VALUE & this.field9305].method441(81);
            }
            if (arg4 != 0) {
                this.field9306[arg4 & Integer.MAX_VALUE].method442(arg5, (byte) -107);
                this.field9306[Integer.MAX_VALUE & arg4].method439((byte) 56, arg5);
                this.field9306[arg4 & Integer.MAX_VALUE].method445(arg2, (byte) 23, arg0);
            }
            this.field9307 = arg0;
            this.field9305 = arg4;
            this.field9309 = arg2;
            this.field9310 = null;
        } else if (this.field9305 != 0) {
            this.field9306[this.field9305 & Integer.MAX_VALUE].method439((byte) 56, arg5);
            if (this.field9309 != arg2 || this.field9307 != arg0) {
                this.field9306[this.field9305 & Integer.MAX_VALUE].method445(arg2, (byte) 23, arg0);
                this.field9307 = arg0;
                this.field9309 = arg2;
            }
        }
        if (arg3 >= -77) {
            this.method3711(null, 37, (byte) -120);
        }
    }
}
