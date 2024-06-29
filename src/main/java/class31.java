import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class31 extends class3 {

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "[I")
    public static int[] field470 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "[Ldb;")
    public static class146[] field468 = new class146[14];

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field476 = new String[200];

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "Ljava/lang/String;")
    public static String field477 = "Hidden";

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
    public static int field478 = 0;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "Luj;")
    public static class175 field471;

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 8)
    public class31() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(III)I", line = 14)
    public static final int method262(int arg0, int arg1, int arg2) {
        field474++;
        if (arg1 != 6) {
            return -99;
        }
        int var3 = 0;
        while (arg2 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
            arg2--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)V", line = 40)
    public static final void method263(int arg0) {
        class15.field202 = -3;
        class2.field11 = 0;
        if (arg0 != 19130) {
            method265(-90, (byte) 120);
        }
        field475++;
        class32.field489 = false;
        class291.field4825 = 1;
        class328.field5369 = 0;
        class350.field5597 = -1;
        class202.field3106 = 0;
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V", line = 58)
    public static void method264(int arg0) {
        field471 = null;
        field468 = null;
        field476 = null;
        field470 = null;
        int var1 = -125 % ((arg0 - 45) / 43);
        field477 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)Lh;", line = 71)
    public static final class318 method265(int arg0, byte arg1) {
        field467++;
        class318 var2 = (class318) class290.field4817.method652((long) arg0, false);
        if (var2 != null) {
            return var2;
        } else if (arg1 > -52) {
            return (class318) null;
        } else {
            byte[] var3 = class68.field1051.method1504(arg0, true, 31);
            class318 var4 = new class318();
            if (var3 != null) {
                var4.method2296(new class313(var3), arg0, (byte) 120);
            }
            class290.field4817.method642(var4, (long) arg0, -81);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)[I", line = 101)
    public final int[] method25(byte arg0, int arg1) {
        field469++;
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int[][] var4 = this.method16(arg1, 0, (byte) -56);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; var8 < class326.field5342; var8++) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        if (arg0 <= 57) {
            field471 = (class175) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)Z", line = 136)
    public static final boolean method266(int arg0, int arg1) {
        field473++;
        if (class296.field4914[arg0]) {
            return true;
        } else if (class41.field632.method1495(arg0, (byte) -79)) {
            int var2 = class41.field632.method1486(arg0, arg1 ^ 0xFFFF93AB);
            if (var2 == 0) {
                class296.field4914[arg0] = true;
                return true;
            }
            if (arg1 != 1) {
                method262(102, -77, -117);
            }
            if (class167.field2627[arg0] == null) {
                class167.field2627[arg0] = new class264[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class167.field2627[arg0][var3] == null) {
                    byte[] var4 = class41.field632.method1504(var3, true, arg0);
                    if (var4 != null) {
                        class264 var5 = class167.field2627[arg0][var3] = new class264();
                        var5.field4204 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1866(false, new class313(var4));
                        } else {
                            var5.method1853(arg1 ^ 0xFFFFA354, new class313(var4));
                        }
                    }
                }
            }
            class296.field4914[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lsi;B)Lsi;", line = 206)
    public static final class264 method267(class264 arg0, byte arg1) {
        field472++;
        if (arg1 != 119) {
            field478 = 91;
        }
        class264 var2 = client.method900(arg0);
        if (var2 == null) {
            var2 = arg0.field4269;
        }
        return var2;
    }
}
