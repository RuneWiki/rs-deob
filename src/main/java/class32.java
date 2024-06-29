import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class32 extends class476 {

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "I")
    private int field472;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "Lrb;")
    public static class283 field482 = new class283(59, 5);

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "Lka;")
    public static class473 field487 = new class473(4);

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "[[[I")
    public static int[][][] field494 = new int[2][][];

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "Luo;")
    public static class135 field492 = new class135();

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "Lbo;")
    public static class180 field485;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "Lbh;")
    public static class419 field493;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Lgs;")
    public static class439 field475;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BII[I)V", line = 4)
    public final void method232(byte arg0, int arg1, int arg2, int[] arg3) {
        field479++;
        if (arg0 != -128) {
            field485 = null;
        }
        arg3[2] = this.field486 + arg2 - this.field477;
        arg3[1] = this.field473 + arg1 - this.field481;
        arg3[0] = this.field491;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBI[I)V", line = 18)
    public final void method233(int arg0, byte arg1, int arg2, int[] arg3) {
        arg3[0] = 0;
        arg3[2] = arg2 + this.field477 - this.field486;
        if (arg1 == -25) {
            arg3[1] = this.field481 + arg0 - this.field473;
            field483++;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)Z", line = 31)
    public final boolean method234(int arg0, int arg1, int arg2) {
        if (arg2 != 13423) {
            this.method233(54, (byte) -39, 51, null);
        }
        field480++;
        return arg0 >= this.field473 && arg0 <= this.field472 && arg1 >= this.field486 && this.field476 >= arg1;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(III)Z", line = 54)
    public final boolean method235(int arg0, int arg1, int arg2) {
        if (arg2 == 12124) {
            field488++;
            return this.field481 <= arg1 && this.field478 >= arg1 && arg0 >= this.field477 && this.field484 >= arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIBI)Z", line = 69)
    public final boolean method236(int arg0, int arg1, byte arg2, int arg3) {
        field489++;
        if (arg2 != 75) {
            this.method233(21, (byte) -10, 87, null);
        }
        return this.field491 == arg0 && arg1 >= this.field473 && arg1 <= this.field472 && this.field486 <= arg3 && this.field476 >= arg3;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZC)Z", line = 85)
    public static final boolean method237(boolean arg0, char arg1) {
        field474++;
        if (Character.isISOControl(arg1)) {
            return false;
        }
        if (!arg0) {
            method237(true, (char) 65477);
        }
        if (class280.method1619(34336, arg1)) {
            return true;
        }
        char[] var2 = class355.field5131;
        for (int var3 = 0; var3 < var2.length; var3++) {
            char var7 = var2[var3];
            if (arg1 == var7) {
                return true;
            }
        }
        char[] var4 = class514.field7523;
        for (int var5 = 0; var5 < var4.length; var5++) {
            char var6 = var4[var5];
            if (arg1 == var6) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V", line = 138)
    public static void method238(int arg0) {
        field485 = null;
        field475 = null;
        field492 = null;
        field487 = null;
        if (arg0 != 10771) {
            field475 = null;
        }
        field482 = null;
        field493 = null;
        field494 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Z", line = 154)
    public static final boolean method239(int arg0, int arg1) {
        if (arg1 != 0) {
            method237(false, 'g');
        }
        field471++;
        return arg0 == 9 || arg0 == 10 || arg0 == 11;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(IIIIIIIII)V", line = 172)
    public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field473 = arg1;
        this.field472 = arg3;
        this.field484 = arg8;
        this.field486 = arg2;
        this.field491 = arg0;
        this.field476 = arg4;
        this.field477 = arg6;
        this.field481 = arg5;
        this.field478 = arg7;
    }
}
