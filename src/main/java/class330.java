import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public abstract class class330 extends class69 {

    @OriginalMember(owner = "client!uba", name = "m", descriptor = "[Luba;")
    public class330[] field4624;

    @OriginalMember(owner = "client!uba", name = "y", descriptor = "Z")
    public boolean field4636;

    @OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
    public static int field4626 = 0;

    @OriginalMember(owner = "client!uba", name = "x", descriptor = "Lsha;")
    public static class115 field4635 = null;

    @OriginalMember(owner = "client!uba", name = "k", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!uba", name = "l", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!uba", name = "n", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!uba", name = "p", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!uba", name = "q", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!uba", name = "r", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!uba", name = "t", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!uba", name = "u", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!uba", name = "v", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!uba", name = "w", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!uba", name = "z", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!uba", name = "A", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!uba", name = "B", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!uba", name = "j", descriptor = "Lck;")
    public class233 field4621;

    @OriginalMember(owner = "client!uba", name = "s", descriptor = "Lhca;")
    public class404 field4630;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(B)V", line = 5)
    public void method766(byte arg0) {
        if (this.field4636) {
            this.field4630.method2477(0);
            this.field4630 = null;
        } else {
            this.field4621.method1596(0);
            this.field4621 = null;
        }
        if (arg0 <= 27) {
            this.field4630 = null;
        }
        field4625++;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)Z", line = 34)
    public static final boolean method2078(int arg0, int arg1, int arg2) {
        field4631++;
        int var3 = -6 / ((31 - arg0) / 59);
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IZ)[I", line = 45)
    public int[] method464(int arg0, boolean arg1) {
        field4623++;
        if (!arg1) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(ZII)V", line = 59)
    public void method2079(boolean arg0, int arg1, int arg2) {
        field4629++;
        int var4 = this.field4632 == 255 ? arg1 : this.field4632;
        if (this.field4636) {
            this.field4630 = new class404(var4, arg1, arg2);
        } else {
            this.field4621 = new class233(var4, arg1, arg2);
        }
        if (!arg0) {
            this.field4632 = -41;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)I", line = 88)
    public int method2080(boolean arg0) {
        field4622++;
        if (!arg0) {
            this.field4621 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)[[I", line = 99)
    public int[][] method537(int arg0, int arg1) {
        if (arg0 != 0) {
            method2078(1, -70, -22);
        }
        field4634++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lgs;B)I", line = 115)
    public static final int method2081(class432 arg0, byte arg1) {
        if (arg1 > -47) {
            field4635 = null;
        }
        field4633++;
        int var2 = arg0.method2591(-30, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method2591(-30, 5);
        } else if (var2 == 2) {
            var3 = arg0.method2591(-30, 8);
        } else {
            var3 = arg0.method2591(-30, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(III)[[I", line = 142)
    public final int[][] method2082(int arg0, int arg1, int arg2) {
        if (arg2 <= 123) {
            this.method464(85, true);
        }
        field4637++;
        if (this.field4624[arg1].field4636) {
            int[] var4 = this.field4624[arg1].method464(arg0, false);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4624[arg1].method537(0, arg0);
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V", line = 177)
    public static void method2083(int arg0) {
        if (arg0 != -1) {
            method2083(-70);
        }
        field4635 = null;
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(B)I", line = 190)
    public int method767(byte arg0) {
        if (arg0 == -70) {
            field4639++;
            return -1;
        } else {
            return -36;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lgga;IB)V", line = 201)
    public void method466(class511 arg0, int arg1, byte arg2) {
        field4638++;
        int var4 = -106 % ((-arg2 - 41) / 42);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IIB)[I", line = 213)
    public final int[] method2084(int arg0, int arg1, byte arg2) {
        field4627++;
        int var4 = 16 / ((-arg2 - 46) / 56);
        return this.field4624[arg0].field4636 ? this.field4624[arg0].method464(arg1, false) : this.field4624[arg0].method537(0, arg1)[0];
    }

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "(B)V", line = 233)
    public void method653(byte arg0) {
        field4628++;
        int var2 = -107 % ((50 - arg0) / 41);
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(IZ)V", line = 248)
    public class330(int arg0, boolean arg1) {
        this.field4624 = new class330[arg0];
        this.field4636 = arg1;
    }
}
