import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class201 extends class232 {

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "Lhi;")
    public static class82 field3445 = class95.method664((byte) -88, "(U5");

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "I")
    public static int field3455 = 0;

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "Lhi;")
    public static class82 field3457 = class95.method664((byte) -92, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!ka", name = "fb", descriptor = "Lhi;")
    public static class82 field3461 = class95.method664((byte) -81, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
    private int field3449;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "I")
    private int field3452;

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
    private int field3453;

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!ka", name = "db", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!ka", name = "gb", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "Lph;")
    public static class282 field3458;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IJ)Lhi;", line = 10)
    public static final class82 method1408(int arg0, long arg1) {
        if (arg0 < 32) {
            return (class82) null;
        } else {
            field3450++;
            return class324.method2234(10, -1, false, arg1);
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)V", line = 21)
    private final void method1409(int arg0, int arg1) {
        this.field3452 = (arg0 & 0xFF00) >> 4;
        if (arg1 == 0) {
            this.field3453 = arg0 >> 12 & 0xFF0;
            field3447++;
            this.field3449 = arg0 & 0xFF << 4;
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V", line = 39)
    private class201(int arg0) {
        super(0, false);
        this.method1409(arg0, 0);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([IBII[I)V", line = 48)
    public static final void method1410(int[] arg0, byte arg1, int arg2, int arg3, int[] arg4) {
        field3446++;
        if (arg3 < arg2) {
            int var5 = arg3;
            int var6 = (arg2 + arg3) / 2;
            int var7 = arg0[var6];
            arg0[var6] = arg0[arg2];
            arg0[arg2] = var7;
            int var8 = arg4[var6];
            arg4[var6] = arg4[arg2];
            arg4[arg2] = var8;
            for (int var9 = arg3; var9 < arg2; var9++) {
                if (arg0[var9] > ((var9 & 0x1) + var7)) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var5];
                    arg0[var5] = var10;
                    int var11 = arg4[var9];
                    arg4[var9] = arg4[var5];
                    arg4[var5++] = var11;
                }
            }
            arg0[arg2] = arg0[var5];
            arg0[var5] = var7;
            arg4[arg2] = arg4[var5];
            arg4[var5] = var8;
            method1410(arg0, (byte) -38, var5 - 1, arg3, arg4);
            method1410(arg0, (byte) -38, arg2, var5 + 1, arg4);
        }
        if (arg1 != -38) {
            field3445 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)I", line = 106)
    public static final int method1411(int arg0, boolean arg1) {
        int var2 = ((arg0 & 0xAAAAAAAA) >>> 1) + (arg0 & 0x55555555);
        int var3 = (var2 >>> 2 & 0x73333333) + (var2 & 0x33333333);
        if (!arg1) {
            return 49;
        }
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        field3460++;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "(I)V", line = 125)
    public static void method1412(int arg0) {
        field3457 = null;
        field3461 = null;
        field3458 = null;
        field3445 = null;
        if (arg0 != 1) {
            field3445 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lhi;B)I", line = 140)
    public static final int method1413(class82 arg0, byte arg1) {
        if (arg1 > -89) {
            method1414(-117, -120);
        }
        field3456++;
        return arg0.method535(true) + 1;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V", line = 151)
    public class201() {
        this(0);
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(II)V", line = 164)
    public static final void method1414(int arg0, int arg1) {
        field3451++;
        class227 var2 = class215.method1531(-1, 6, arg1);
        var2.method1624((byte) -101);
        if (arg0 <= 43) {
            field3461 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BLme;II)V", line = 177)
    public static final void method1415(byte arg0, class75 arg1, int arg2, int arg3) {
        field3454++;
        if (class194.field3290 != null || class187.field3153 || arg1 == null || class191.method1329(arg1, (byte) -1) == null || arg0 != -78) {
            return;
        }
        class194.field3290 = arg1;
        class237.field4109 = class191.method1329(arg1, (byte) -1);
        class4.field35 = arg2;
        class21.field289 = arg3;
        class52.field845 = false;
        class20.field260 = 0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)[[I", line = 214)
    public final int[][] method146(int arg0, byte arg1) {
        if (arg1 != -82) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field3996.method136(0, arg0);
        if (this.field3996.field278) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class54.field858; var7++) {
                var4[var7] = this.field3453;
                var5[var7] = this.field3452;
                var6[var7] = this.field3449;
            }
        }
        field3462++;
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBLbc;)V", line = 252)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        field3459++;
        if (arg1 != -19) {
            field3457 = (class82) null;
        }
        if (arg0 == 0) {
            this.method1409(arg2.method1107((byte) 82), 0);
        }
    }
}
