import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class65 {

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1044 = "Continue";

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "[I")
    public static int[] field1046 = new int[14];

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field1047 = -1;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Z")
    public static boolean field1053 = false;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "S")
    public short field1045;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Z")
    public boolean field1042;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Z")
    public boolean field1049;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Z")
    public boolean field1050;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "Z")
    public boolean field1057;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method427(int arg0) {
        if (arg0 > -5) {
            field1054 = 35;
        }
        field1044 = null;
        field1046 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(JZ)V")
    public static final void method428(long arg0, boolean arg1) {
        field1052++;
        if (!class184.field3053) {
            class114.field1742 += (float) arg0 * class271.field4364 / 40.0F;
            class226.field3554 += (float) arg0 * class266.field4323 / 40.0F;
        }
        int var3 = class221.field3478 + class217.field3408.field994;
        int var4 = class62.field904 + class217.field3408.field929;
        if (class256.field4219 - var3 < -500 || class256.field4219 - var3 > 500 || (class288.field4687 - var4) < -500 || (class288.field4687 - var4) > 500) {
            class288.field4687 = var4;
            class256.field4219 = var3;
        }
        if (class256.field4219 != var3) {
            int var5 = var3 - class256.field4219;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class256.field4219 += var6;
        }
        if (class288.field4687 != var4) {
            int var7 = var4 - class288.field4687;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class288.field4687 += var8;
        }
        class12.method92(arg1);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLgi;BLhg;Lgi;)V")
    public static final void method429(boolean arg0, class164 arg1, byte arg2, class190 arg3, class164 arg4) {
        class225.field3533 = arg1;
        class298.field4869 = arg4;
        field1055++;
        class8.field182 = arg0;
        int var5 = class298.field4869.method1146((byte) -74) - 1;
        class140.field2283 = var5 * 256 + class298.field4869.method1145((byte) 95, var5);
        class146.field2344 = arg3;
        class159.field2601 = new String[] { null, null, null, null, class33.field543 };
        class272.field4391 = new String[] { null, null, class200.field3198, null, null };
        if (arg2 <= 59) {
            field1046 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIZI)I")
    public static final int method430(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg0 > 243) {
            arg3 >>= 0x4;
        } else if (arg0 > 217) {
            arg3 >>= 0x3;
        } else if (arg0 > 192) {
            arg3 >>= 0x2;
        } else if (arg0 > 179) {
            arg3 >>= 0x1;
        }
        field1056++;
        if (!arg2) {
            method430(108, -111, false, -92);
        }
        return (arg1 >> 2 << 10) - (-(arg3 >> 5 << 7) - (arg0 >> 1));
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lgi;II)Lag;")
    public static final class197 method431(class164 arg0, int arg1, int arg2) {
        if (arg2 < 119) {
            field1054 = 126;
        }
        field1051++;
        return class85.method604(arg0, arg1, false) ? class184.method1300(6051) : null;
    }
}
