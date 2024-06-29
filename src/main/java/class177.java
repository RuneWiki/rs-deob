import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class177 {

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    private int field2536 = 0;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Lsv;")
    private class478 field2543 = null;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    private int field2546 = 0;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    private int field2545 = 0;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Lih;")
    private class503 field2539;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "Lpq;")
    private class132 field2534;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "[Lkd;")
    private class189[] field2538;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "Lqb;")
    public class152 field2537;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "[I")
    public static int[] field2535 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "F")
    public static float field2541;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
    public static final void method1101(int arg0, int arg1) {
        field2540++;
        class45 var2 = class354.method2094(arg0, (byte) -124, arg1);
        var2.method261(4);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method1102(int arg0) {
        field2535 = null;
        if (arg0 != 9) {
            method1101(-107, 77);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1103(char arg0, String arg1, int arg2) {
        field2548++;
        int var3 = class247.method1611(arg0, 92, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = arg2;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0 != arg1.charAt(var8); var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BILsv;)Z")
    public final boolean method1104(byte arg0, int arg1, class478 arg2) {
        field2544++;
        if (arg0 != 34) {
            this.method1105(-112, (byte) 43);
        }
        if (this.field2545 == 0) {
            return false;
        }
        if (this.field2543 != arg2) {
            this.field2538[Integer.MAX_VALUE & this.field2545].method51(arg2, arg1, (byte) -58);
            this.field2543 = arg2;
        }
        return true;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)Z")
    public final boolean method1105(int arg0, byte arg1) {
        if (arg1 == 1) {
            field2547++;
            return this.field2538[arg0].method53((byte) -122);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZZIIII)V")
    public final void method1106(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = arg1 & this.field2539.method308();
        field2542++;
        if (!var7 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
            if (arg3 == 4) {
                arg4 = arg2;
            }
            arg3 = 2;
        }
        if (arg3 != 0 && arg0) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field2545 != arg3) {
            if (this.field2545 != 0) {
                this.field2538[Integer.MAX_VALUE & this.field2545].method48(true);
            }
            if (arg3 != 0) {
                this.field2538[arg3 & Integer.MAX_VALUE].method55(arg0, -89);
                this.field2538[Integer.MAX_VALUE & arg3].method47(arg0, 2);
                this.field2538[arg3 & Integer.MAX_VALUE].method52((byte) 117, arg4, arg2);
            }
            this.field2545 = arg3;
            this.field2536 = arg2;
            this.field2546 = arg4;
            this.field2543 = null;
        } else if (this.field2545 != 0) {
            this.field2538[Integer.MAX_VALUE & this.field2545].method47(arg0, 2);
            if (this.field2536 != arg2 || this.field2546 != arg4) {
                this.field2538[this.field2545 & Integer.MAX_VALUE].method52((byte) 117, arg4, arg2);
                this.field2536 = arg2;
                this.field2546 = arg4;
            }
        }
        if (arg5 > -60) {
            method1101(-87, 115);
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lih;)V")
    public class177(class503 arg0) {
        this.field2539 = arg0;
        this.field2534 = new class132(arg0);
        this.field2538 = new class189[10];
        this.field2538[1] = new class8(arg0);
        this.field2538[2] = new class96(arg0, this.field2534);
        this.field2538[4] = new class285(arg0, this.field2534);
        this.field2538[5] = new class482(arg0, this.field2534);
        this.field2538[6] = new class262(arg0);
        this.field2538[7] = new class225(arg0);
        this.field2538[3] = this.field2537 = new class152(arg0);
        this.field2538[8] = new class80(arg0, this.field2534);
        this.field2538[9] = new class387(arg0, this.field2534);
        if (!this.field2538[8].method53((byte) 118)) {
            this.field2538[8] = this.field2538[4];
        }
        if (!this.field2538[9].method53((byte) -120)) {
            this.field2538[9] = this.field2538[8];
        }
    }
}
