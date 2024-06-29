import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class313 {

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Z")
    public static boolean field4095 = false;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field4096 = 0;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Ld;")
    public static class153 field4094;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "[Lnl;")
    public static class554[] field4093;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIZ)I", line = 7)
    public static final int method1865(int arg0, int arg1, int arg2, boolean arg3) {
        field4097++;
        class515 var4 = class534.method3075(arg3, arg2, -87);
        if (var4 == null) {
            return -1;
        } else {
            if (arg1 != 1736144270) {
                field4094 = null;
            }
            return arg0 >= 0 && arg0 < var4.field7226.length ? var4.field7226[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 27)
    public static void method1866(int arg0) {
        field4093 = null;
        field4094 = null;
        if (arg0 > -42) {
            method1865(-6, -99, 51, false);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lsa;[[BI)V", line = 42)
    public static final void method1867(class207 arg0, byte[][] arg1, int arg2) {
        field4092++;
        if (arg2 != 8) {
            return;
        }
        for (int var3 = 0; var3 < arg0.field5208; var3++) {
            class14.method102(true);
            for (int var4 = 0; var4 < (class409.field5183 >> 3); var4++) {
                for (int var5 = 0; var5 < (class543.field7597 >> 3); var5++) {
                    int var6 = class387.field4934[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg0.field5215 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class201.field2708.length; var12++) {
                                if (class201.field2708[var12] == var11 && arg1[var12] != null) {
                                    arg0.method1337(class386.field4930, var8, var7, var5 * 8, var4 * 8, true, var3, class526.field7350, (var9 & 0x7) * 8, (var10 & 0x7) * 8, arg1[var12]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
