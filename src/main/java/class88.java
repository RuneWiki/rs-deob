import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class88 {

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    private int field1215 = 0;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "I")
    private int field1214 = 0;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "Lgd;")
    private class344 field1216 = null;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "Lse;")
    private class282 field1213;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "Ltk;")
    private class180 field1212;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "[Lsc;")
    private class304[] field1217;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lgd;I)Z", line = 5)
    public final boolean method707(class344 arg0, int arg1) {
        if (this.field1214 == 0) {
            return false;
        }
        if (this.field1216 != arg0) {
            this.field1217[Integer.MAX_VALUE & this.field1214].method629(arg0);
            this.field1216 = arg0;
        }
        if (arg1 != 15628) {
            this.method710((byte) 18, true, true, 74);
        }
        return true;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)Z", line = 28)
    public final boolean method708(int arg0, byte arg1) {
        if (arg1 < 81) {
            this.method707((class344) null, 34);
        }
        return this.field1217[arg0].method628();
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lse;)V", line = 61)
    public class88(class282 arg0) {
        this.field1213 = arg0;
        this.field1212 = new class180(arg0);
        this.field1217 = new class304[9];
        this.field1217[1] = new class213(arg0);
        this.field1217[2] = new class314(arg0, this.field1212);
        this.field1217[4] = new class80(arg0, this.field1212);
        this.field1217[5] = new class324(arg0, this.field1212);
        this.field1217[6] = new class135(arg0);
        this.field1217[7] = new class99(arg0);
        this.field1217[3] = new class285(arg0);
        this.field1217[8] = new class120(arg0);
        if (!this.field1217[8].method628()) {
            this.field1217[8] = this.field1217[4];
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ZBI)V", line = 44)
    public final void method709(boolean arg0, byte arg1, int arg2) {
        if (this.field1214 != 0 & (arg0 | this.field1215 != arg2)) {
            this.field1217[this.field1214 & Integer.MAX_VALUE].method625(arg2);
            this.field1215 = arg2;
        }
        int var4 = 46 / ((72 - arg1) / 49);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(BZZI)V", line = 83)
    public final void method710(byte arg0, boolean arg1, boolean arg2, int arg3) {
        boolean var5 = arg1 & this.field1213.method497();
        if (!var5 && (arg3 == 4 || arg3 == 8)) {
            arg3 = 2;
        }
        if (arg3 != 0 && arg2) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field1214 != arg3) {
            if (this.field1214 != 0) {
                this.field1217[this.field1214 & Integer.MAX_VALUE].method627();
            }
            if (arg3 != 0) {
                this.field1217[arg3 & Integer.MAX_VALUE].method630(arg2);
                this.field1217[Integer.MAX_VALUE & arg3].method624(arg2);
            }
            this.field1215 = Integer.MIN_VALUE;
            this.field1216 = null;
            this.field1214 = arg3;
        } else if (this.field1214 != 0) {
            this.field1217[this.field1214 & Integer.MAX_VALUE].method624(arg2);
        }
        if (arg0 >= 0) {
            this.field1213 = (class282) null;
        }
    }
}
