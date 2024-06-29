import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class756 {

    @OriginalMember(owner = "client!wia", name = "g", descriptor = "B")
    public byte field10522;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "S")
    public short field10516;

    @OriginalMember(owner = "client!wia", name = "p", descriptor = "I")
    public int field10531;

    @OriginalMember(owner = "client!wia", name = "f", descriptor = "S")
    public short field10521;

    @OriginalMember(owner = "client!wia", name = "k", descriptor = "Z")
    public boolean field10526;

    @OriginalMember(owner = "client!wia", name = "h", descriptor = "I")
    public int field10523;

    @OriginalMember(owner = "client!wia", name = "i", descriptor = "B")
    public byte field10524;

    @OriginalMember(owner = "client!wia", name = "e", descriptor = "S")
    public short field10520;

    @OriginalMember(owner = "client!wia", name = "l", descriptor = "[I")
    public static int[] field10527 = new int[3];

    @OriginalMember(owner = "client!wia", name = "o", descriptor = "Ldm;")
    public static class50 field10530 = null;

    @OriginalMember(owner = "client!wia", name = "m", descriptor = "[[[I")
    public static int[][][] field10528 = new int[2][][];

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "I")
    public static int field10517;

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "I")
    public static int field10518;

    @OriginalMember(owner = "client!wia", name = "d", descriptor = "I")
    public static int field10519;

    @OriginalMember(owner = "client!wia", name = "j", descriptor = "I")
    public static int field10525;

    @OriginalMember(owner = "client!wia", name = "n", descriptor = "I")
    public static int field10529;

    @OriginalMember(owner = "client!wia", name = "q", descriptor = "I")
    public static int field10532;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(BZLdm;)V", line = 9)
    public static final void method4196(byte arg0, boolean arg1, class50 arg2) {
        field10532++;
        int var3 = 102 % ((29 - arg0) / 36);
        int var4 = arg2.field796 == 0 ? arg2.field783 : arg2.field796;
        int var5 = arg2.field779 == 0 ? arg2.field830 : arg2.field779;
        class182.method1303(arg2.field792, class117.field1849[arg2.field792 >> 16], arg1, var5, false, var4);
        if (arg2.field863 != null) {
            class182.method1303(arg2.field792, arg2.field863, arg1, var5, false, var4);
        }
        class548 var6 = (class548) class310.field4383.method4203(true, (long) arg2.field792);
        if (var6 != null) {
            class284.method1856(var6.field7723, (byte) 117, arg1, var5, var4);
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)V", line = 33)
    public static final void method4197(byte arg0) {
        if (arg0 > -90) {
            field10528 = null;
        }
        field10525++;
        int var1 = class206.field2950;
        int[] var2 = class209.field3013;
        for (int var3 = 0; var3 < var1; var3++) {
            class349 var9 = class165.field2442[var2[var3]];
            if (var9 != null && var9.field934 > 0) {
                var9.field934--;
                if (var9.field934 == 0) {
                    var9.field928 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class152.field2290; var4++) {
            long var5 = (long) class323.field4590[var4];
            class272 var7 = (class272) class758.field10539.method4203(true, var5);
            if (var7 != null) {
                class84 var8 = var7.field3885;
                if (var8.field934 > 0) {
                    var8.field934--;
                    if (var8.field934 == 0) {
                        var8.field928 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IC)Z", line = 118)
    public static final boolean method4198(int arg0, char arg1) {
        field10517++;
        if (arg0 >= -105) {
            method4196((byte) -47, false, null);
        }
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class740.field10391;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(II)Z", line = 152)
    public static final boolean method4199(int arg0, int arg1) {
        if (arg1 != 0) {
            field10528 = null;
        }
        field10519++;
        return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 162)
    public class756(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field10522 = (byte) arg7;
        this.field10516 = (short) arg4;
        this.field10531 = arg10;
        this.field10521 = (short) arg6;
        this.field10526 = arg9;
        this.field10523 = arg0;
        this.field10524 = (byte) arg8;
        this.field10520 = (short) arg5;
    }

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "(B)V", line = 183)
    public static void method4200(byte arg0) {
        int var1 = -84 / ((arg0 + 81) / 40);
        field10530 = null;
        field10528 = null;
        field10527 = null;
    }
}
