import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class48 {

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field789 = 0;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lp;")
    public static class280 field791 = null;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)I")
    public static final int method355(byte arg0, int arg1) {
        if (arg0 > -117) {
            method357(-6);
        }
        field790++;
        int var2 = arg1 * 6 - 61440;
        int var3 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var4 = (arg1 * var2 >> 12) + 40960;
        return var3 * var4 >> 12;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Z")
    public static final boolean method356(int arg0, int arg1) {
        field792++;
        if (class262.field4636[arg1]) {
            return true;
        } else if (class45.field747.method1239(arg1, 81)) {
            int var2 = class45.field747.method1259(arg1, arg0 + 746);
            if (var2 == 0) {
                class262.field4636[arg1] = true;
                return true;
            } else if (arg0 == -664) {
                if (class251.field4394[arg1] == null) {
                    class251.field4394[arg1] = new class113[var2];
                }
                for (int var3 = 0; var3 < var2; var3++) {
                    if (class251.field4394[arg1][var3] == null) {
                        byte[] var4 = class45.field747.method1258(arg1, var3, (byte) 121);
                        if (var4 != null) {
                            class113 var5 = class251.field4394[arg1][var3] = new class113();
                            var5.field1964 = (arg1 << 16) + var3;
                            if (var4[0] == -1) {
                                var5.method791(false, new class25(var4));
                            } else {
                                var5.method802((byte) 118, new class25(var4));
                            }
                        }
                    }
                }
                class262.field4636[arg1] = true;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method357(int arg0) {
        field791 = null;
        if (arg0 != -5401) {
            field791 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lua;Lde;IIIBI)V")
    public static final void method358(class113 arg0, class108 arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field787++;
        if (arg1 == null) {
            return;
        }
        int var7 = class25.field487 + class273.field4756 & 0x7FF;
        int var8 = arg3 * arg3 + arg6 * arg6;
        int var9 = Math.max(arg0.field1869 / 2, arg0.field1995 / 2) + 10;
        if (var9 * var9 < var8) {
            return;
        }
        int var10 = class146.field2545[var7];
        int var11 = var10 * 256 / (class142.field2461 + 256);
        int var12 = class146.field2541[var7];
        int var13 = var12 * 256 / (class142.field2461 + 256);
        int var14 = arg3 * var13 + arg6 * var11 >> 16;
        int var15 = arg6 * var13 - (arg3 * var11) >> 16;
        ((class223) arg1).method1500(arg0.field1869 / 2 + var14 + arg2 - (arg1.field1788 / 2), arg4 - (-(arg0.field1995 / 2) - -var15) + -(arg1.field1780 / 2), arg0.field1999, arg0.field2011);
        if (arg5 != 33) {
            field789 = 53;
        }
    }
}
