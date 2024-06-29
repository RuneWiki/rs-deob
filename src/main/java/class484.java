import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class484 extends class242 {

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public int field6823 = -1;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public int field6825 = -1;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field6820 = 0;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "[[Z")
    public static boolean[][] field6826 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public int field6816;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public int field6818;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public int field6822;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public int field6824;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "[[[B")
    public static byte[][][] field6821;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
    public static final void method2833(byte arg0) {
        ++field6819;
        class312.method1883(class222.field3135, (byte) 70);
        int var1 = (class436.field5982 >> 10) + (class153.field2204 >> 3);
        class76.field1161 = class2.field21.field6766 = 0;
        int var2 = (class325.field4472 >> 3) + (class106.field1525 >> 10);
        class2.field21.method201((byte) -118, 8, 8);
        byte var3 = 18;
        class338.field4633 = new int[var3];
        class314.field4263 = new byte[var3][];
        class50.field847 = new byte[var3][];
        class123.field1709 = new byte[var3][];
        class59.field930 = new byte[var3][];
        class22.field372 = new int[var3];
        class8.field173 = new int[var3];
        class439.field6014 = new int[var3][4];
        class15.field264 = new int[var3];
        class490.field6908 = new int[var3];
        class139.field1985 = new byte[var3][];
        class312.field4254 = new int[var3];
        int var4 = 0;
        for (int var5 = (-(class200.field2875 >> 4) + var1) / 8; var5 <= ((class200.field2875 >> 4) + var1) / 8; ++var5) {
            for (int var8 = (-(class422.field5811 >> 4) + var2) / 8; var8 <= ((class422.field5811 >> 4) + var2) / 8; ++var8) {
                int var9 = (var5 << 8) + var8;
                class490.field6908[var4] = var9;
                class22.field372[var4] = class336.field4611.method2042(100, "m" + var5 + "_" + var8);
                class8.field173[var4] = class336.field4611.method2042(100, "l" + var5 + "_" + var8);
                class338.field4633[var4] = class336.field4611.method2042(100, "n" + var5 + "_" + var8);
                class312.field4254[var4] = class336.field4611.method2042(100, "um" + var5 + "_" + var8);
                class15.field264[var4] = class336.field4611.method2042(100, "ul" + var5 + "_" + var8);
                if (class338.field4633[var4] == -1) {
                    class22.field372[var4] = -1;
                    class8.field173[var4] = -1;
                    class312.field4254[var4] = -1;
                    class15.field264[var4] = -1;
                }
                ++var4;
            }
        }
        int var6 = 89 / ((arg0 - 5) / 63);
        for (int var7 = var4; ~class338.field4633.length < ~var7; ++var7) {
            class338.field4633[var7] = -1;
            class22.field372[var7] = -1;
            class8.field173[var7] = -1;
            class312.field4254[var7] = -1;
            class15.field264[var7] = -1;
        }
        class242.method1515(var1, var2, true, 24110, false);
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(Lkm;I)Lto;")
    public final class370 method193(class487 arg0, int arg1) {
        ++field6814;
        class250 var3 = arg0.method1105();
        var3.method1382(super.field3419, super.field3420, super.field3424);
        class370 var4 = class277.method1737((byte) 28, 3);
        if (~this.field6823 != 0) {
            class232 var5 = class58.field918.method344(this.field6823, 31757).method1013(-1, 1024, this.field6824, arg0, (class15) null, 0, 0, (byte) -43, (class372) null);
            if (var5 != null) {
                var5.method41(var3, var4.field5233[2], 0);
            }
        }
        if (~this.field6825 != 0) {
            class232 var6 = class58.field918.method344(this.field6825, 31757).method1013(-1, 1024, this.field6822, arg0, (class15) null, 0, 0, (byte) -74, (class372) null);
            if (var6 != null) {
                var6.method41(var3, var4.field5233[1], 0);
            }
        }
        if (arg1 > -6) {
            field6820 = -5;
        }
        class232 var7 = class58.field918.method344(this.field6816, 31757).method1013(-1, 1024, this.field6818, arg0, (class15) null, 0, 0, (byte) -35, (class372) null);
        if (var7 != null) {
            var7.method41(var3, var4.field5233[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)V")
    public static void method2834(byte arg0) {
        if (arg0 != 0) {
            field6820 = -44;
        }
        field6821 = null;
        field6826 = null;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(Lkm;I)V")
    public final void method197(class487 arg0, int arg1) {
        int var3 = -98 % ((64 - arg1) / 59);
        ++field6815;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lkm;BII)Z")
    public final boolean method199(class487 arg0, byte arg1, int arg2, int arg3) {
        ++field6817;
        class250 var5 = arg0.method1105();
        var5.method1382(super.field3419, super.field3420, super.field3424);
        if (arg1 < 123) {
            return false;
        } else {
            class232 var6 = class58.field918.method344(this.field6816, 31757).method1013(-1, 65536, this.field6818, arg0, (class15) null, 0, 0, (byte) -67, (class372) null);
            if (var6 != null && var6.method75(arg3, arg2, var5, true)) {
                return true;
            } else {
                if (this.field6825 != -1) {
                    class232 var7 = class58.field918.method344(this.field6825, 31757).method1013(-1, 65536, this.field6822, arg0, (class15) null, 0, 0, (byte) -78, (class372) null);
                    if (var7 != null && var7.method75(arg3, arg2, var5, true)) {
                        return true;
                    }
                }
                if (~this.field6823 != 0) {
                    class232 var8 = class58.field918.method344(this.field6823, 31757).method1013(-1, 65536, this.field6824, arg0, (class15) null, 0, 0, (byte) -120, (class372) null);
                    if (var8 != null && var8.method75(arg3, arg2, var5, true)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }
}
