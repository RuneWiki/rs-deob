import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public class class329 extends class93 {

    @OriginalMember(owner = "client!kka", name = "Mb", descriptor = "[I")
    public static int[] field4477 = new int[13];

    @OriginalMember(owner = "client!kka", name = "Ab", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!kka", name = "Bb", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!kka", name = "Cb", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!kka", name = "Db", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!kka", name = "Fb", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!kka", name = "Gb", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!kka", name = "Hb", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!kka", name = "Ib", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!kka", name = "Jb", descriptor = "I")
    private int field4474;

    @OriginalMember(owner = "client!kka", name = "Kb", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!kka", name = "Lb", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!kka", name = "Eb", descriptor = "Lpp;")
    private class415 field4469;

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(Lpp;B)V")
    public final void method2071(class415 arg0, byte arg1) {
        this.field4469 = arg0;
        ++field4473;
        if (arg1 >= -106) {
            field4477 = null;
        }
    }

    @OriginalMember(owner = "client!kka", name = "<init>", descriptor = "(I)V")
    public class329(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kka", name = "p", descriptor = "(II)V")
    public final void method2072(int arg0, int arg1) {
        super.field1413[super.field1442++] = (byte) (arg1 + this.field4469.method2453(256));
        ++field4471;
        if (arg0 != -1895652956) {
            this.field4469 = null;
        }
    }

    @OriginalMember(owner = "client!kka", name = "s", descriptor = "(I)I")
    public final int method2073(int arg0) {
        ++field4476;
        int var2 = super.field1413[super.field1442++] - this.field4469.method2453(256) & 255;
        if (~var2 > -129) {
            return var2;
        } else {
            return arg0 < 16 ? -77 : (var2 + -128 << 8) - -(super.field1413[super.field1442++] + -this.field4469.method2453(256) & 255);
        }
    }

    @OriginalMember(owner = "client!kka", name = "f", descriptor = "(IB)I")
    public final int method2074(int arg0, byte arg1) {
        if (arg1 != -111) {
            this.method2073(-83);
        }
        ++field4468;
        return arg0 * 8 + -this.field4474;
    }

    @OriginalMember(owner = "client!kka", name = "t", descriptor = "(I)V")
    public static void method2075(int arg0) {
        field4477 = null;
        if (arg0 < 5) {
            method2075(16);
        }
    }

    @OriginalMember(owner = "client!kka", name = "e", descriptor = "(Z)Z")
    public final boolean method2076(boolean arg0) {
        ++field4466;
        if (arg0) {
            field4477 = null;
        }
        int var2 = super.field1413[super.field1442] - this.field4469.method2455(31736) & 255;
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(I[BBI)V")
    public final void method2077(int arg0, byte[] arg1, byte arg2, int arg3) {
        ++field4467;
        if (arg2 > -29) {
            field4477 = null;
        }
        for (int var5 = 0; var5 < arg3; ++var5) {
            arg1[arg0 + var5] = (byte) (super.field1413[super.field1442++] + -this.field4469.method2453(256));
        }
    }

    @OriginalMember(owner = "client!kka", name = "q", descriptor = "(II)I")
    public final int method2078(int arg0, int arg1) {
        ++field4465;
        int var3 = this.field4474 >> 3;
        int var4 = -(this.field4474 & 7) + 8;
        this.field4474 += arg0;
        int var5 = 0;
        while (~arg0 < ~var4) {
            var5 += (super.field1413[var3++] & class528.field7172[var4]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 == ~var4) {
            var6 = (super.field1413[var3] & class528.field7172[var4]) + var5;
        } else {
            var6 = (super.field1413[var3] >> -arg0 + var4 & class528.field7172[arg0]) + var5;
        }
        if (arg1 != 15455) {
            this.method2077(51, (byte[]) null, (byte) 44, 8);
        }
        return var6;
    }

    @OriginalMember(owner = "client!kka", name = "p", descriptor = "(B)V")
    public final void method2079(byte arg0) {
        ++field4475;
        if (arg0 < -41) {
            this.field4474 = super.field1442 * 8;
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(Z[I)V")
    public final void method2080(boolean arg0, int[] arg1) {
        if (arg0) {
            this.method2081(true);
        }
        this.field4469 = new class415(arg1);
        ++field4470;
    }

    @OriginalMember(owner = "client!kka", name = "f", descriptor = "(Z)V")
    public final void method2081(boolean arg0) {
        super.field1442 = (this.field4474 + 7) / 8;
        if (arg0) {
            field4477 = null;
        }
        ++field4472;
    }
}
