import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class69 {

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    private int field970 = -1;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "Z")
    private boolean field972 = true;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    private int field962;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    private int field964;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    private int field959;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    private int field966;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "[Lkf;")
    private class169[] field963;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "[Lkf;")
    private class169[] field961;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "Lkf;")
    private class169 field969;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    private int field971;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    private int field973;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "Laa;")
    private class341 field965;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BLqa;IIIIIIII)V")
    public final void method481(byte arg0, class165 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg2 + arg7 & 0x3FFF;
        int var12 = -121 / ((arg0 + 1) / 41);
        field967++;
        if (this.field964 == -1) {
            arg1.method747(arg5, arg6, arg3, arg9, arg8, 0);
        } else {
            class107 var13 = class446.field6695.method157((byte) 123, this.field964);
            if (this.field965 == null && class446.field6695.method160((byte) 23, this.field964)) {
                int[] var14 = var13.field1521 ? class446.field6695.method158(this.field964, this.field973, -26, false, this.field973, 0.7F) : class446.field6695.method156(this.field964, false, this.field973, this.field973, 0.7F, (byte) -123);
                this.field965 = arg1.method767(var14, 0, this.field973, this.field973, this.field973);
            }
            if (var13.field1521) {
                arg1.method747(arg5, arg6, arg3, arg9, arg8, 0);
            }
            if (this.field965 != null) {
                int var15 = var13.field1521 ? 1 : 0;
                int var16 = arg4 * arg9 / -4096;
                int var17;
                for (var17 = arg9 * var11 / 4096 + (arg3 - arg9) / 2; var17 > arg9; var17 -= arg9) {
                }
                while (var17 < 0) {
                    var17 += arg9;
                }
                while (var16 > arg9) {
                    var16 -= arg9;
                }
                while (var16 < 0) {
                    var16 += arg9;
                }
                for (int var18 = var17 - arg9; var18 < arg3; var18 += arg9) {
                    for (int var19 = var16 - arg9; var19 < arg9; var19 += arg9) {
                        this.field965.method291(arg5 + var18, arg6 + var19, arg9, arg9, 1, 0, var15);
                    }
                }
            }
        }
        for (int var20 = this.field971 - 1; var20 >= 0; var20--) {
            this.field961[var20].method1149(arg1, arg5, arg6, arg3, arg9, arg4, var11);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
    public final void method482(byte arg0) {
        field968++;
        if (this.field963 != null) {
            for (int var2 = 0; var2 < this.field963.length; var2++) {
                this.field963[var2].method1150();
            }
        }
        if (arg0 > 35) {
            this.field965 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IILqa;)Z")
    public final boolean method483(int arg0, int arg1, class165 arg2) {
        if (arg1 <= 20) {
            this.method482((byte) -86);
        }
        if (this.field970 != arg0) {
            this.field970 = arg0;
            int var4 = class520.method3095((byte) -116, arg0);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field973 != var4) {
                this.field965 = null;
                this.field973 = var4;
            }
            if (this.field963 != null) {
                this.field971 = 0;
                int[] var5 = new int[this.field963.length];
                for (int var6 = 0; var6 < this.field963.length; var6++) {
                    class169 var7 = this.field963[var6];
                    if (var7.method1148(this.field962, this.field966, this.field959, this.field970)) {
                        var5[this.field971] = var7.field2273;
                        this.field961[this.field971++] = var7;
                    }
                }
                class273.method1755(this.field971 - 1, (byte) 37, var5, this.field961, 0);
            }
            this.field972 = true;
        }
        field960++;
        boolean var8 = false;
        if (this.field972) {
            this.field972 = false;
            for (int var9 = this.field971 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field961[var9].method1146(arg2, this.field969);
                this.field972 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(I[Lkf;IIII)V")
    public class69(int arg0, class169[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field962 = arg3;
        this.field964 = arg0;
        this.field959 = arg5;
        this.field966 = arg4;
        this.field963 = arg1;
        if (arg1 == null) {
            this.field969 = null;
            this.field961 = null;
        } else {
            this.field961 = new class169[arg1.length];
            this.field969 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }
}
