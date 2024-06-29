import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class278 {

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    private int field4421 = 0;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    private int field4424 = -1;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Lrh;")
    private class46 field4416 = new class46();

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "Z")
    public boolean field4425 = false;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    private int field4410;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "[[I")
    private int[][] field4419;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    private int field4413;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "[Lvb;")
    private class60[] field4423;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "[I")
    public static int[] field4412 = new int[128];

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4422 = "Continue";

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field4415 = 0;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)[[I")
    public final int[][] method1861(byte arg0) {
        int var2 = -111 / ((37 - arg0) / 52);
        field4420++;
        if (this.field4413 != this.field4410) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var3 = 0; var3 < this.field4410; var3++) {
            this.field4423[var3] = class167.field2568;
        }
        return this.field4419;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)[I")
    public final int[] method1862(int arg0, byte arg1) {
        if (arg1 != 52) {
            method1866(true);
        }
        field4418++;
        if (this.field4413 == this.field4410) {
            this.field4425 = this.field4423[arg0] == null;
            this.field4423[arg0] = class167.field2568;
            return this.field4419[arg0];
        } else if (this.field4410 == 1) {
            this.field4425 = this.field4424 != arg0;
            this.field4424 = arg0;
            return this.field4419[0];
        } else {
            class60 var3 = this.field4423[arg0];
            if (var3 == null) {
                this.field4425 = true;
                if (this.field4421 < this.field4410) {
                    var3 = new class60(arg0, this.field4421);
                    this.field4421++;
                } else {
                    class60 var4 = (class60) this.field4416.method354((byte) -105);
                    var3 = new class60(arg0, var4.field839);
                    this.field4423[var4.field845] = null;
                    var4.method784(false);
                }
                this.field4423[arg0] = var3;
            } else {
                this.field4425 = false;
            }
            this.field4416.method351(var3, arg1 ^ 0x10);
            return this.field4419[var3.field839];
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLef;)Z")
    public static final boolean method1863(byte arg0, class214 arg1) {
        field4417++;
        if (arg1.field3390 == 205) {
            class59.field831 = 250;
            return true;
        } else {
            if (arg0 >= -58) {
                method1865(-78, 29, 49, 3, -49, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -84, (byte) 115, -81, -75);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
    public final void method1864(byte arg0) {
        field4411++;
        int var2 = 0;
        int var3 = -25 / ((arg0 + 54) / 40);
        while (this.field4410 > var2) {
            this.field4419[var2] = null;
            var2++;
        }
        this.field4423 = null;
        this.field4419 = null;
        this.field4416.method346(true);
        this.field4416 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method1865(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class158.field2433 * 128) {
            arg0 = class158.field2433 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class54.field749 * 128) {
            arg2 = class54.field749 * 128 - 1;
        }
        class250.field4009 = class171.field2675[arg3];
        class130.field1904 = class171.field2680[arg3];
        class25.field340 = class171.field2675[arg4];
        class153.field2282 = class171.field2680[arg4];
        class172.field2696 = arg0;
        client.field2328 = arg1;
        class82.field1285 = arg2;
        class72.field1010 = arg0 / 128;
        class173.field2721 = arg2 / 128;
        class110.field1674 = class72.field1010 - class33.field429;
        if (class110.field1674 < 0) {
            class110.field1674 = 0;
        }
        class60.field846 = class173.field2721 - class33.field429;
        if (class60.field846 < 0) {
            class60.field846 = 0;
        }
        class131.field1922 = class72.field1010 + class33.field429;
        if (class131.field1922 > class158.field2433) {
            class131.field1922 = class158.field2433;
        }
        class102.field1584 = class33.field429 + class173.field2721;
        if (class102.field1584 > class54.field749) {
            class102.field1584 = class54.field749;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class33.field429 + class33.field429 + 2; var16++) {
            for (int var19 = 0; var19 < class33.field429 + class33.field429 + 2; var19++) {
                int var20 = (var16 - class33.field429 << 7) - (class172.field2696 & 0x7F);
                int var21 = (var19 - class33.field429 << 7) - (class82.field1285 & 0x7F);
                int var22 = class72.field1010 + var16 - class33.field429;
                int var23 = class173.field2721 + var19 - class33.field429;
                if (var22 >= 0 && var23 >= 0 && var22 < class158.field2433 && var23 < class54.field749) {
                    int var24;
                    if (class235.field3772 == null) {
                        var24 = class198.field3108[0][var22][var23] + 128 - client.field2328;
                    } else {
                        var24 = class235.field3772[0][var22][var23] + 128 - client.field2328;
                    }
                    int var25 = class198.field3108[3][var22][var23] - client.field2328 - 1000;
                    class108.field1656[var16][var19] = class130.method883(var20, var25, var24, var21, var15);
                } else {
                    class108.field1656[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class33.field429 + class33.field429 + 1; var17++) {
            for (int var18 = 0; var18 < class33.field429 + class33.field429 + 1; var18++) {
                class17.field197[var17][var18] = class108.field1656[var17][var18] || class108.field1656[var17 + 1][var18] || class108.field1656[var17][var18 + 1] || class108.field1656[var17 + 1][var18 + 1];
            }
        }
        class241.field3860 = arg6;
        class78.field1097 = arg7;
        class16.field195 = arg8;
        class115.field1698 = arg9;
        class6.field80 = arg10;
        class177.method1234();
        if (class173.field2712 != null) {
            class167.method1144(true);
            class178.method1239(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class167.method1144(false);
        }
        class178.method1239(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public static void method1866(boolean arg0) {
        field4412 = null;
        if (!arg0) {
            field4422 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(III)V")
    public class278(int arg0, int arg1, int arg2) {
        this.field4410 = arg0;
        this.field4419 = new int[this.field4410][arg2];
        this.field4413 = arg1;
        this.field4423 = new class60[this.field4413];
    }
}
