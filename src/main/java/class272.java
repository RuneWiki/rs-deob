import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class272 extends class59 {

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field4549 = 0;

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "I")
    public static int field4546 = 0;

    @OriginalMember(owner = "client!cm", name = "U", descriptor = "Lph;")
    public static class229 field4558 = class266.method1858("Update)2Liste geladen)3", 0);

    @OriginalMember(owner = "client!cm", name = "T", descriptor = "I")
    public static int field4557 = 1;

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "I")
    private int field4548;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!cm", name = "P", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!cm", name = "Q", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!cm", name = "R", descriptor = "I")
    private int field4555;

    @OriginalMember(owner = "client!cm", name = "S", descriptor = "I")
    private int field4556;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZ)V", line = 6)
    public static final void method1883(int arg0, boolean arg1) {
        field4547++;
        int var2 = -12 / ((-arg0 - 15) / 48);
        class205.field3377 = new int[104];
        class114.field1938 = new int[104];
        class229.field3796 = 99;
        class321.field5442 = new int[104];
        byte var3;
        if (arg1) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        class326.field5570 = new int[104];
        class12.field166 = new byte[var3][104][104];
        class126.field2104 = new byte[var3][104][104];
        class1.field10 = new int[var3][105][105];
        class177.field2925 = new byte[var3][104][104];
        class235.field3871 = new int[104];
        class304.field5084 = new byte[var3][104][104];
        class16.field190 = new byte[var3][105][105];
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(II)V", line = 33)
    private final void method1884(int arg0, int arg1) {
        this.field4556 = (arg1 & 0xFF0000) >> 12;
        field4550++;
        if (arg0 != -6714) {
            this.field4548 = 88;
        }
        this.field4555 = (arg1 & 0xFF00) >> 4;
        this.field4548 = (arg1 & 0xFF) << 4;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)V", line = 50)
    public static void method1885(byte arg0) {
        field4558 = null;
        if (arg0 < 124) {
            field4557 = 101;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(JZ)V", line = 60)
    public static final void method1886(long arg0, boolean arg1) {
        field4551++;
        if (arg0 == 0L) {
            return;
        }
        if (class216.field3555 >= 100) {
            class205.method1439(class331.field5638, !arg1, 0, class134.field2172);
            return;
        }
        class229 var3 = class100.method767((byte) 66, arg0).method1628(-32);
        for (int var4 = 0; var4 < class216.field3555; var4++) {
            if (class282.field4682[var4] == arg0) {
                class205.method1439(class248.method1746(8528, new class229[] { var3, class328.field5586 }), true, 0, class134.field2172);
                return;
            }
        }
        for (int var5 = 0; var5 < class103.field1752; var5++) {
            if (class98.field1658[var5] == arg0) {
                class205.method1439(class248.method1746(8528, new class229[] { class85.field1456, var3, class54.field783 }), true, 0, class134.field2172);
                return;
            }
        }
        if (var3.method1618(arg1, class230.field3820.field3463)) {
            class205.method1439(class95.field1609, true, 0, class134.field2172);
            return;
        }
        class299.field4867++;
        class282.field4682[class216.field3555] = arg0;
        class108.field1820[class216.field3555++] = class100.method767((byte) 88, arg0);
        class198.field3295 = class129.field2125;
        class121.field2033.method37(23, 31);
        class121.field2033.method1208((byte) -6, arg0);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BILhb;)V", line = 125)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg0 == 115) {
            field4553++;
            if (arg1 == 0) {
                this.method1884(-6714, arg2.method1176(arg0 ^ 0x3E78FABB));
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)[[I", line = 152)
    public final int[][] method116(int arg0, int arg1) {
        if (arg1 != 4588) {
            return (int[][]) ((int[][]) null);
        }
        field4554++;
        int[][] var3 = this.field838.method1796(true, arg0);
        if (this.field838.field4334) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class293.field4789; var7++) {
                var4[var7] = this.field4556;
                var5[var7] = this.field4555;
                var6[var7] = this.field4548;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V", line = 196)
    public class272() {
        this(0);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIB)V", line = 202)
    public static final void method1887(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field4552++;
        int var6 = arg2 - arg1;
        int var7 = arg0 - arg3;
        if (var6 == 0) {
            if (var7 != 0) {
                class70.method549(arg1, arg4, arg0, 90, arg3);
            }
        } else if (var7 == 0) {
            class51.method356(true, arg3, arg2, arg1, arg4);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg1 * var8 >> 12);
            int var10;
            int var11;
            if (arg2 < class192.field3172) {
                var11 = class192.field3172;
                var10 = (class192.field3172 * var8 >> 12) + var9;
            } else if (class77.field1289 < arg2) {
                var10 = (class77.field1289 * var8 >> 12) + var9;
                var11 = class77.field1289;
            } else {
                var11 = arg2;
                var10 = arg0;
            }
            if (var10 < class206.field3398) {
                var11 = (class206.field3398 - var9 << 12) / var8;
                var10 = class206.field3398;
            } else if (var10 > class214.field3533) {
                var10 = class214.field3533;
                var11 = (class214.field3533 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (class192.field3172 > arg1) {
                var13 = (class192.field3172 * var8 >> 12) + var9;
                var12 = class192.field3172;
            } else if (class77.field1289 < arg1) {
                var12 = class77.field1289;
                var13 = (class77.field1289 * var8 >> 12) + var9;
            } else {
                var13 = arg3;
                var12 = arg1;
            }
            if (class206.field3398 > var13) {
                var13 = class206.field3398;
                var12 = (class206.field3398 - var9 << 12) / var8;
            } else if (var13 > class214.field3533) {
                var12 = (class214.field3533 - var9 << 12) / var8;
                var13 = class214.field3533;
            }
            int var14 = 95 % ((arg5 + 85) / 36);
            class122.method906(var10, var13, -1, arg4, var12, var11);
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(I)V", line = 311)
    private class272(int arg0) {
        super(0, false);
        this.method1884(-6714, arg0);
    }
}
