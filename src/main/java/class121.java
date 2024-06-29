import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class121 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    private int field2021 = -1;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    private int field2028;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    private int field2024;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    private int field2030;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    private int field2023;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "[Lve;")
    private class103[] field2025;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "[Lve;")
    private class103[] field2029;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lve;")
    private class103 field2032;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    private int field2027;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    private int field2031;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lsb;")
    public static class124 field2022;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Lwf;")
    private class17 field2026;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lsb;)V")
    public static final void method879(class124 arg0) {
        field2022 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIII)V")
    public final void method880(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method882(arg4);
        int var9 = arg0 + arg6 & 0x7FF;
        if (this.field2023 == -1) {
            class63.method493(arg1, arg2, arg3, arg4, arg7);
        } else {
            if (this.field2026 == null) {
                this.field2026 = class95.field1483.method1610(this.field2023, false, class95.field1485, this.field2027, false);
            }
            if (!class95.field1483.method1613(this.field2023, true)) {
                class63.method493(arg1, arg2, arg3, arg4, arg7);
            }
            if (this.field2026 != null) {
                int var10 = arg4 * arg5 / -512;
                int var11;
                for (var11 = arg4 * var9 / 512 + (arg3 - arg4) / 2; var11 > arg4; var11 -= arg4) {
                }
                while (var11 < 0) {
                    var11 += arg4;
                }
                while (var10 > arg4) {
                    var10 -= arg4;
                }
                while (var10 < 0) {
                    var10 += arg4;
                }
                for (int var12 = var11 - arg4; var12 < class63.field1049; var12 += arg4) {
                    for (int var13 = var10 - arg4; var13 < class63.field1054; var13 += arg4) {
                        this.field2026.method132(arg1 + var12, arg2 + var13, arg4, arg4);
                    }
                }
            }
        }
        for (int var14 = this.field2031 - 1; var14 >= 0; var14--) {
            this.field2029[var14].method761(arg1, arg2, arg3, arg4, arg5, var9, this.field2032);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "()V")
    public static void method881() {
        field2022 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    private final void method882(int arg0) {
        if (this.field2021 == arg0) {
            return;
        }
        this.field2021 = arg0;
        int var2 = class274.method1859(184601800, arg0);
        if (var2 > 512) {
            var2 = 512;
        }
        if (this.field2027 != var2) {
            this.field2027 = var2;
            this.field2026 = null;
        }
        if (this.field2025 == null) {
            return;
        }
        this.field2031 = 0;
        int[] var3 = new int[this.field2025.length];
        for (int var4 = 0; var4 < this.field2025.length; var4++) {
            class103 var5 = this.field2025[var4];
            if (var5.method763(this.field2028, this.field2024, this.field2030, this.field2021)) {
                var3[this.field2031] = var5.field1581;
                this.field2029[this.field2031++] = var5;
            }
        }
        class49.method417(var3, 0, this.field2029, this.field2031 - 1, (byte) 107);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(I[Lve;IIII)V")
    public class121(int arg0, class103[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2028 = arg3;
        this.field2024 = arg4;
        this.field2030 = arg5;
        this.field2023 = arg0;
        this.field2025 = arg1;
        if (arg1 == null) {
            this.field2029 = null;
            this.field2032 = null;
        } else {
            this.field2029 = new class103[arg1.length];
            this.field2032 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
