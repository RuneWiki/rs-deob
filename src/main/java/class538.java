import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class538 {

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    private int field7320 = 0;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    private int field7322 = 0;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    private int field7325 = 0;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Ldia;")
    private class246 field7323;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "Lmha;")
    private class438 field7324;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "[Lvaa;")
    private class497[] field7316;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Lrfa;")
    public class212 field7318;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field7321 = 0;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field7315;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "[Ls;")
    public static class296[] field7317;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lil;II)Z")
    public final boolean method3073(class7 arg0, int arg1, int arg2) {
        field7319++;
        if (arg1 != 17845) {
            method3075(-53);
        }
        if (this.field7325 == 0) {
            return false;
        } else {
            this.field7316[Integer.MAX_VALUE & this.field7325].method158(9, arg0, arg2);
            return true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIZIIZ)V")
    public final void method3074(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = arg2 & this.field7323.method534();
        field7315++;
        if (!var7 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
            if (arg3 == 4) {
                arg4 = arg0;
            }
            arg3 = 2;
        }
        if (arg3 != 0 && arg5) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field7325 != arg3) {
            if (this.field7325 != 0) {
                this.field7316[Integer.MAX_VALUE & this.field7325].method161(-1756);
            }
            if (arg3 != 0) {
                this.field7316[arg3 & Integer.MAX_VALUE].method163(arg5, false);
                this.field7316[arg3 & Integer.MAX_VALUE].method164(arg1 ^ 0xFFFFF0B8, arg5);
                this.field7316[arg3 & Integer.MAX_VALUE].method162(126, arg0, arg4);
            }
            this.field7320 = arg0;
            this.field7325 = arg3;
            this.field7322 = arg4;
        } else if (this.field7325 != 0) {
            this.field7316[this.field7325 & Integer.MAX_VALUE].method164(arg1 ^ 0xFFFFF0B8, arg5);
            if (this.field7320 != arg0 || this.field7322 != arg4) {
                this.field7316[Integer.MAX_VALUE & this.field7325].method162(arg1 + 4037, arg0, arg4);
                this.field7320 = arg0;
                this.field7322 = arg4;
            }
        }
        if (arg1 != -3912) {
            this.field7323 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static void method3075(int arg0) {
        field7317 = null;
        if (arg0 < 40) {
            method3075(-47);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)Z")
    public final boolean method3076(byte arg0, int arg1) {
        field7326++;
        if (arg0 != 72) {
            this.method3074(-125, 40, true, -27, 117, false);
        }
        return this.field7316[arg1].method157(-6808);
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Ldia;)V")
    public class538(class246 arg0) {
        this.field7323 = arg0;
        this.field7324 = new class438(arg0);
        this.field7316 = new class497[10];
        this.field7316[1] = new class20(arg0);
        this.field7316[2] = new class708(arg0, this.field7324);
        this.field7316[4] = new class479(arg0, this.field7324);
        this.field7316[5] = new class397(arg0, this.field7324);
        this.field7316[6] = new class670(arg0);
        this.field7316[7] = new class686(arg0);
        this.field7316[3] = this.field7318 = new class212(arg0);
        this.field7316[8] = new class270(arg0, this.field7324);
        this.field7316[9] = new class29(arg0, this.field7324);
        if (!this.field7316[8].method157(-6808)) {
            this.field7316[8] = this.field7316[4];
        }
        if (!this.field7316[9].method157(-6808)) {
            this.field7316[9] = this.field7316[8];
        }
    }
}
