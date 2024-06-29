import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class664 {

    @OriginalMember(owner = "client!av", name = "n", descriptor = "Z")
    public boolean field9324;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "S")
    public short field9313;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "I")
    public int field9320;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "I")
    public int field9325;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public int field9312;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "I")
    public int field9318;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "S")
    public short field9317;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "S")
    public short field9322;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "I")
    public int field9323;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "B")
    public byte field9315;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "[I")
    public static int[] field9311 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!av", name = "f", descriptor = "J")
    public static long field9316 = 0L;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public static int field9314;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    public static int field9319;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public static int field9321;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)[I")
    public static final int[] method3780(int arg0) {
        field9321++;
        if (arg0 != 724) {
            method3781(72);
        }
        return new int[] { class455.field6536, class190.field2838, class444.field6313 };
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V")
    public static void method3781(int arg0) {
        if (arg0 != 0) {
            field9311 = null;
        }
        field9311 = null;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lha;IIIIIIZZ)V")
    public static final void method3782(class66 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class711.field10005 = arg0;
        class622.field8775 = arg1;
        class437.field6253 = class622.field8775 > 1 && class711.field10005.method465();
        class310.field4616 = arg2;
        class13.field254 = 0x1 << class310.field4616;
        class503.field7200 = class13.field254 >> 1;
        Math.sqrt((double) (class503.field7200 * class503.field7200 + class503.field7200 * class503.field7200));
        class456.field6545 = arg3;
        class151.field2074 = arg4;
        class12.field249 = arg5;
        class76.field1016 = arg6;
        class458.field6568 = class641.method3643(-5);
        class136.method962(82);
        class358.field5208 = new class379[arg3][class151.field2074][class12.field249];
        class750.field10395 = new class292[arg3];
        if (arg7) {
            class689.field9755 = new int[class151.field2074][class12.field249];
            class322.field4766 = new byte[class151.field2074][class12.field249];
            class135.field1748 = new short[class151.field2074][class12.field249];
            class262.field3697 = new class379[1][class151.field2074][class12.field249];
            class311.field4628 = new class292[1];
        } else {
            class689.field9755 = null;
            class322.field4766 = null;
            class135.field1748 = null;
            class262.field3697 = null;
            class311.field4628 = null;
        }
        if (arg8) {
            class555.field7896 = new long[arg3][arg4][arg5];
            class238.field3437 = new class698[65535];
            class431.field6149 = new boolean[65535];
            class540.field7582 = 0;
        } else {
            class555.field7896 = null;
            class238.field3437 = null;
            class431.field6149 = null;
            class540.field7582 = 0;
        }
        class96.method680(false);
        class472.field6734 = new class547[2];
        class110.field1365 = new class547[2];
        class511.field7305 = new class547[2];
        class372.field5364 = new class547[10000];
        class709.field9996 = 0;
        class564.field8010 = new class547[5000];
        class761.field10492 = 0;
        class296.field4465 = new class778[5000];
        class592.field8357 = 0;
        class457.field6551 = new boolean[class76.field1016 + class76.field1016 + 1][class76.field1016 + class76.field1016 + 1];
        class250.field3544 = new boolean[class76.field1016 + class76.field1016 + 2][class76.field1016 + class76.field1016 + 2];
        class663.field9310 = new int[class76.field1016 + class76.field1016 + 2];
        class619.field8726 = class619.field8727;
        if (class437.field6253) {
            class377.field5419 = new boolean[arg3][class76.field1016 + class76.field1016 + 1][class76.field1016 + class76.field1016 + 1];
            class361.field5238 = new boolean[arg3][][];
            if (class468.field6693 != null) {
                class339.method2174();
            }
            class468.field6693 = new class442[class622.field8775];
            class711.field10005.method489(class468.field6693.length + 1);
            class711.field10005.method441(0);
            for (int var9 = 0; var9 < class468.field6693.length; var9++) {
                class468.field6693[var9] = new class442(var9 + 1, class711.field10005);
                (new Thread(class468.field6693[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class622.field8775 == 2) {
                var10 = 4;
                class347.field5092 = 2;
            } else if (class622.field8775 == 3) {
                var10 = 6;
                class347.field5092 = 3;
            } else {
                var10 = 8;
                class347.field5092 = 4;
            }
            class137.field1790 = new class100[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                class137.field1790[var11] = new class100(class79.field1045[class622.field8775 - 2][var11]);
            }
        } else {
            class347.field5092 = 1;
        }
        class387.field5515 = new int[class347.field5092 - 1];
        class73.field988 = new int[class347.field5092 - 1];
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IIIIZ)Laj;")
    public static final class329 method3783(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field9314++;
        class329 var5 = new class329();
        if (arg2 != 6) {
            return null;
        }
        var5.field4912 = arg0;
        var5.field4914 = arg3;
        class251.field3547.method384((long) arg1, var5, false);
        class554.method3226(arg0, false);
        class176 var6 = class518.method3014(arg1, arg2 ^ 0x62);
        if (var6 != null) {
            class288.method1923((byte) -19, var6);
        }
        if (class273.field3815 != null) {
            class288.method1923((byte) -19, class273.field3815);
            class273.field3815 = null;
        }
        class705.method3989(6402);
        if (var6 != null) {
            class493.method2885(!arg4, var6, (byte) -58);
        }
        if (!arg4) {
            class353.method2223(arg0);
        }
        if (!arg4 && class251.field3546 != -1) {
            class530.method3077(55, class251.field3546, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class664(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field9324 = arg10;
        this.field9313 = (short) arg5;
        this.field9320 = arg0;
        this.field9325 = arg1;
        this.field9312 = arg3;
        this.field9318 = arg2;
        this.field9317 = (short) arg6;
        this.field9322 = (short) arg4;
        this.field9323 = arg11;
        this.field9315 = (byte) arg8;
    }
}
