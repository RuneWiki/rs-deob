import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class265 {

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "Z")
    public boolean field4310 = false;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "S")
    public static short field4308 = 256;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "I")
    public static int field4319 = 0;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "I")
    public int field4315;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
    public int field4317;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "Lsb;")
    public class266 field4314;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lie;II)V", line = 3)
    private final void method1874(class6 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field4315 = arg0.method67(12021);
        } else if (arg2 == 2) {
            this.field4317 = arg0.method86(-112);
        } else if (arg2 == 3) {
            this.field4310 = true;
        } else if (arg2 == 4) {
            this.field4315 = -1;
        }
        field4312++;
        if (arg1 != 11053) {
            this.field4317 = 108;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)Z", line = 31)
    public final boolean method1875(int arg0) {
        field4316++;
        if (arg0 != -527) {
            this.field4317 = -20;
        }
        return this.field4314.field4336.method942(0, this.field4315);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)I", line = 43)
    public static final int method1876(int arg0, int arg1) {
        field4309++;
        int var2 = 98 % ((-arg0 - 68) / 33);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(BI)V", line = 58)
    public static final void method1877(byte arg0, int arg1) {
        field4313++;
        if (class613.field8706 == null || arg1 > class613.field8706.length) {
            class613.field8706 = new int[arg1];
        }
        if (arg0 < 67) {
            method1878(69, 78);
        }
    }

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(II)V", line = 85)
    public static final void method1878(int arg0, int arg1) {
        class490.method3002(false, class122.field1984.method1091(class135.field2206, 1), arg0);
        if (arg1 == -14473) {
            field4320++;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIZLr;)Lf;", line = 97)
    public final class702 method1879(int arg0, int arg1, boolean arg2, class167 arg3) {
        field4318++;
        long var5 = (long) ((arg2 ? 262144 : 0) | arg1 << 16 | this.field4315 | arg3.field2804 << 19);
        class702 var7 = (class702) this.field4314.field4338.method560(false, var5);
        if (var7 != null) {
            return var7;
        } else if (!this.field4314.field4336.method942(0, this.field4315)) {
            return null;
        } else if (arg0 < 45) {
            return null;
        } else {
            class284 var8 = class284.method2027(this.field4314.field4336, this.field4315, 0);
            if (var8 != null) {
                var8.field4536 = var8.field4533 = var8.field4534 = var8.field4540 = 0;
                if (arg2) {
                    var8.method2020();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method2026();
                }
            }
            class702 var10 = arg3.method265(var8, true);
            if (var10 != null) {
                this.field4314.field4338.method559(var10, var5, 0);
            }
            return var10;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZLie;)V", line = 150)
    public final void method1880(boolean arg0, class6 arg1) {
        while (true) {
            int var3 = arg1.method70(-9059);
            if (var3 == 0) {
                field4311++;
                if (arg0) {
                    this.field4310 = true;
                    return;
                }
                return;
            }
            this.method1874(arg1, 11053, var3);
        }
    }
}
