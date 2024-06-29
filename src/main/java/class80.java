import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class80 {

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lmo;")
    private class195 field1347 = null;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    private int field1346 = 0;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    private int field1348 = 0;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Lge;")
    private class104 field1349;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Lmk;")
    private class154 field1350;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "[Lpr;")
    private class300[] field1345;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZIIZ)V")
    public final void method630(boolean arg0, int arg1, int arg2, boolean arg3) {
        boolean var5 = arg0 & this.field1349.method694();
        if (!var5 && (arg1 == 4 || arg1 == 8)) {
            arg1 = 2;
        }
        if (arg1 != 0 && arg3) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (arg2 != 15010) {
            this.field1345 = (class300[]) null;
        }
        if (this.field1346 != arg1) {
            if (this.field1346 != 0) {
                this.field1345[this.field1346 & Integer.MAX_VALUE].method5();
            }
            if (arg1 != 0) {
                this.field1345[arg1 & Integer.MAX_VALUE].method6(arg3);
                this.field1345[arg1 & Integer.MAX_VALUE].method7(arg3);
            }
            this.field1347 = null;
            this.field1348 = Integer.MIN_VALUE;
            this.field1346 = arg1;
        } else if (this.field1346 != 0) {
            this.field1345[this.field1346 & Integer.MAX_VALUE].method7(arg3);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZII)V")
    public final void method631(boolean arg0, int arg1, int arg2) {
        if (arg2 != 7) {
            this.method631(true, -108, 14);
        }
        if (this.field1346 != 0 & (this.field1348 != arg1 | arg0)) {
            this.field1345[this.field1346 & Integer.MAX_VALUE].method8(arg1);
            this.field1348 = arg1;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lmo;I)Z")
    public final boolean method632(class195 arg0, int arg1) {
        if (this.field1346 == 0) {
            return false;
        } else if (arg1 == 8) {
            if (this.field1347 != arg0) {
                this.field1345[Integer.MAX_VALUE & this.field1346].method9(arg0);
                this.field1347 = arg0;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)Z")
    public final boolean method633(byte arg0, int arg1) {
        if (arg0 != -103) {
            this.method633((byte) 57, 16);
        }
        return this.field1345[arg1].method4();
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lge;)V")
    public class80(class104 arg0) {
        this.field1349 = arg0;
        this.field1350 = new class154(arg0);
        this.field1345 = new class300[9];
        this.field1345[1] = new class235(arg0);
        this.field1345[2] = new class95(arg0, this.field1350);
        this.field1345[4] = new class212(arg0, this.field1350);
        this.field1345[5] = new class440(arg0, this.field1350);
        this.field1345[6] = new class325(arg0);
        this.field1345[7] = new class299(arg0);
        this.field1345[3] = new class2(arg0);
        this.field1345[8] = this.field1345[4];
    }
}
