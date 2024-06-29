import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class218 {

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    private int field3308 = 0;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    private int field3310 = 0;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "Lq;")
    private class325 field3312 = null;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "Lcg;")
    private class393 field3311;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "Lc;")
    private class448 field3309;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "[Lse;")
    private class139[] field3313;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)Z")
    public final boolean method1326(byte arg0, int arg1) {
        if (arg0 != -1) {
            this.method1327(18, (byte) -47, true);
        }
        return this.field3313[arg1].method60();
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IBZ)V")
    public final void method1327(int arg0, byte arg1, boolean arg2) {
        int var4 = -61 / ((64 - arg1) / 54);
        if (this.field3308 != 0 & (arg2 | this.field3310 != arg0)) {
            this.field3313[this.field3308 & Integer.MAX_VALUE].method57(arg0);
            this.field3310 = arg0;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZZIZ)V")
    public final void method1328(boolean arg0, boolean arg1, int arg2, boolean arg3) {
        boolean var5 = arg0 & this.field3311.method425();
        if (!arg3) {
            this.field3310 = 27;
        }
        if (!var5 && (arg2 == 4 || arg2 == 8)) {
            arg2 = 2;
        }
        if (arg2 != 0 && arg1) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field3308 != arg2) {
            if (this.field3308 != 0) {
                this.field3313[this.field3308 & Integer.MAX_VALUE].method58();
            }
            if (arg2 != 0) {
                this.field3313[arg2 & Integer.MAX_VALUE].method61(arg1);
                this.field3313[arg2 & Integer.MAX_VALUE].method59(arg1);
            }
            this.field3312 = null;
            this.field3308 = arg2;
            this.field3310 = Integer.MIN_VALUE;
        } else if (this.field3308 != 0) {
            this.field3313[this.field3308 & Integer.MAX_VALUE].method59(arg1);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lq;I)Z")
    public final boolean method1329(class325 arg0, int arg1) {
        if (this.field3308 == 0) {
            return false;
        }
        if (this.field3312 != arg0) {
            this.field3313[this.field3308 & Integer.MAX_VALUE].method56(arg0);
            this.field3312 = arg0;
        }
        if (arg1 <= 11) {
            this.field3309 = (class448) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lcg;)V")
    public class218(class393 arg0) {
        this.field3311 = arg0;
        this.field3309 = new class448(arg0);
        this.field3313 = new class139[9];
        this.field3313[1] = new class78(arg0);
        this.field3313[2] = new class349(arg0, this.field3309);
        this.field3313[4] = new class222(arg0, this.field3309);
        this.field3313[5] = new class461(arg0, this.field3309);
        this.field3313[6] = new class7(arg0);
        this.field3313[7] = new class175(arg0);
        this.field3313[3] = new class193(arg0);
        this.field3313[8] = this.field3313[4];
    }
}
