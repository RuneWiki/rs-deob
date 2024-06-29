import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class450 {

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "Lgg;")
    private class114 field6318 = new class114(256);

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "Leq;")
    private class357 field6316;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "Ld;")
    private class96 field6314;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V", line = 3)
    public final void method2647(boolean arg0) {
        field6315++;
        if (!arg0) {
            this.field6314 = null;
        }
        this.field6318.method775(1, 5);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)Lhga;", line = 17)
    public final class185 method2648(int arg0, int arg1) {
        field6320++;
        Object var3 = this.field6318.method778((long) arg1, -89);
        if (var3 != null) {
            return (class185) var3;
        } else if (this.field6314.method390(arg1, -9396)) {
            class91 var4 = this.field6314.method389(9559, arg1);
            int var5 = var4.field1159 ? 64 : this.field6316.field4944;
            class185 var7;
            if (var4.field1168 && this.field6316.method57()) {
                float[] var6 = this.field6314.method393(-22704, var5, arg1, 0.7F, false, var5);
                var7 = new class185(this.field6316, 3553, 34842, var5, var5, var4.field1153 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field1165 != 2 && class372.method2268(116, var4.field1149)) {
                    var8 = this.field6314.method395(true, 0.7F, var5, arg1, -11288, var5);
                } else {
                    var8 = this.field6314.method397(arg1, 0.7F, 13049, var5, var5, false);
                }
                var7 = new class185(this.field6316, 3553, 6408, var5, var5, var4.field1153 != 0, var8, 0, 0, false);
            }
            var7.method1188(10242, var4.field1157, var4.field1162);
            if (arg0 >= -11) {
                this.field6316 = null;
            }
            this.field6318.method774((long) arg1, -102, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I[B[BZIIIII)V", line = 66)
    public static final void method2649(int arg0, byte[] arg1, byte[] arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6317++;
        int var9 = -(arg4 >> 2);
        int var10 = -(arg4 & 0x3);
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg5++;
                arg2[var10001] += arg1[arg6++];
                int var14 = arg5++;
                arg2[var14] += arg1[arg6++];
                int var15 = arg5++;
                arg2[var15] += arg1[arg6++];
                int var16 = arg5++;
                arg2[var16] += arg1[arg6++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg5++;
                arg2[var10001] += arg1[arg6++];
            }
            arg6 += arg7;
            arg5 += arg8;
        }
        if (arg3) {
            method2651((byte) 8);
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Leq;Ld;)V", line = 125)
    public class450(class357 arg0, class96 arg1) {
        this.field6316 = arg0;
        this.field6314 = arg1;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V", line = 115)
    public final void method2650(byte arg0) {
        field6319++;
        this.field6318.method776((byte) -68);
        if (arg0 >= -117) {
            method2651((byte) 0);
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)V", line = 135)
    public static final void method2651(byte arg0) {
        class573.field8008.method781((byte) 47);
        if (arg0 != -19) {
            method2651((byte) 72);
        }
        field6313++;
        class30.field487.method781((byte) 47);
        class372.field5237.method781((byte) 47);
        class5.field48.method781((byte) 47);
    }
}
