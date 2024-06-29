import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public abstract class class354 extends class439 {

    @OriginalMember(owner = "client!jq", name = "F", descriptor = "[Ljq;")
    public class354[] field5365;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "Z")
    public boolean field5354;

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "[I")
    public static int[] field5355 = new int[2];

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
    public int field5348;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!jq", name = "y", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!jq", name = "A", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!jq", name = "C", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!jq", name = "D", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "Lwp;")
    public class118 field5357;

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "Lpc;")
    public class472 field5351;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)V", line = 4)
    public void method203(byte arg0) {
        if (arg0 != -10) {
            return;
        }
        if (this.field5354) {
            this.field5357.method860(arg0 - 102);
            this.field5357 = null;
        } else {
            this.field5351.method2818(14933);
            this.field5351 = null;
        }
        field5350++;
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)I", line = 30)
    public int method643(int arg0) {
        if (arg0 == -1529307414) {
            field5366++;
            return -1;
        } else {
            return -63;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILtn;Ltn;)V", line = 46)
    public static final void method2289(int arg0, class58 arg1, class58 arg2) {
        class114.method841(false, class188.field2788);
        field5358++;
        class513.field7562++;
        class86.field1436.method1892(397825512, arg2.field955);
        class86.field1436.method1865(arg2.field840, 0);
        class86.field1436.method1910(1869696168, arg1.field955);
        class86.field1436.method1865(arg1.field840, 0);
        class86.field1436.method1865(arg1.field946, 0);
        if (arg0 > -67) {
            field5347 = 7;
        }
        class86.field1436.method1875(arg2.field946, (byte) -91);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILti;I)V", line = 65)
    public void method206(int arg0, class303 arg1, int arg2) {
        if (arg0 != 15180) {
            field5355 = null;
        }
        field5360++;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)V", line = 79)
    public void method771(boolean arg0) {
        field5362++;
        if (arg0) {
            this.method2293(19, -87, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BI)[[I", line = 94)
    public int[][] method207(byte arg0, int arg1) {
        field5359++;
        if (arg0 >= -40) {
            field5347 = -99;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZI)I", line = 113)
    public static final int method2290(boolean arg0, int arg1) {
        if (!arg0) {
            field5347 = -101;
        }
        field5353++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBI)[[I", line = 129)
    public final int[][] method2291(int arg0, byte arg1, int arg2) {
        field5349++;
        if (arg1 >= -79) {
            this.field5357 = null;
        }
        if (this.field5365[arg0].field5354) {
            int[] var4 = this.field5365[arg0].method253(arg2, (byte) -95);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field5365[arg0].method207((byte) -75, arg2);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)[I", line = 162)
    public int[] method253(int arg0, byte arg1) {
        if (arg1 != -95) {
            this.method253(62, (byte) -78);
        }
        field5363++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(Z)V", line = 178)
    public static void method2292(boolean arg0) {
        if (arg0) {
            method2290(false, 22);
        }
        field5355 = null;
    }

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)I", line = 188)
    public int method201(int arg0) {
        field5364++;
        int var2 = 18 / ((-arg0 - 14) / 61);
        return -1;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)V", line = 198)
    public void method642(int arg0, int arg1, int arg2) {
        field5352++;
        int var4 = this.field5348 == 255 ? arg0 : this.field5348;
        if (this.field5354) {
            this.field5357 = new class118(var4, arg0, arg2);
        } else {
            this.field5351 = new class472(var4, arg0, arg2);
        }
        int var5 = 117 / ((62 - arg1) / 58);
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIB)[I", line = 220)
    public final int[] method2293(int arg0, int arg1, byte arg2) {
        field5361++;
        if (arg2 != 69) {
            field5347 = 1;
        }
        return this.field5365[arg0].field5354 ? this.field5365[arg0].method253(arg1, (byte) -95) : this.field5365[arg0].method207((byte) -72, arg1)[0];
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(IZ)V", line = 243)
    public class354(int arg0, boolean arg1) {
        this.field5365 = new class354[arg0];
        this.field5354 = arg1;
    }
}
