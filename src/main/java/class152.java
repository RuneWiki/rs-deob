import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class152 {

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public int field2354;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "[I")
    public int[] field2348;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "[I")
    public int[] field2353;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field2350 = 0;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field2352 = 0;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Lmia;")
    public static class63 field2349 = new class63(11, 7);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method1127(boolean arg0) {
        if (!arg0) {
            class540.method3168();
            field2355++;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lvs;III)V", line = 24)
    public static final void method1128(class593 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class34.field356) {
            class186 var4 = class80.field1136[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2844 != null && var4.field2844.method738((byte) 88)) {
                arg0.method737(8616, var4.field2844, true, 0, class118.field1620, 0, class504.field7164);
            }
        }
        if (arg3 < class34.field356) {
            class186 var5 = class80.field1136[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2844 != null && var5.field2844.method738((byte) 88)) {
                arg0.method737(8616, var5.field2844, true, 0, class118.field1620, class504.field7164, 0);
            }
        }
        if (arg2 < class34.field356 && arg3 < class565.field8040) {
            class186 var6 = class80.field1136[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2844 != null && var6.field2844.method738((byte) 88)) {
                arg0.method737(8616, var6.field2844, true, 0, class118.field1620, class504.field7164, class504.field7164);
            }
        }
        if (arg2 < class34.field356 && arg3 > 0) {
            class186 var7 = class80.field1136[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2844 != null && var7.field2844.method738((byte) 88)) {
                arg0.method737(8616, var7.field2844, true, 0, class118.field1620, -class504.field7164, class504.field7164);
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[B[BIIIII)V", line = 75)
    public static final void method1129(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2347++;
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 0x3);
        for (int var11 = -arg1; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg2[var10001] = (byte) (arg2[var10001] - arg3[arg5++]);
                int var14 = arg6++;
                arg2[var14] = (byte) (arg2[var14] - arg3[arg5++]);
                int var15 = arg6++;
                arg2[var15] = (byte) (arg2[var15] - arg3[arg5++]);
                int var16 = arg6++;
                arg2[var16] = (byte) (arg2[var16] - arg3[arg5++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg2[var10001] = (byte) (arg2[var10001] - arg3[arg5++]);
            }
            arg5 += arg7;
            arg6 += arg0;
        }
        if (arg4 > 0) {
            method1130(-37);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I)V", line = 119)
    public class152(int arg0) {
        this.field2354 = arg0;
        this.field2348 = new int[this.field2354];
        this.field2353 = new int[this.field2354];
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 129)
    public static void method1130(int arg0) {
        if (arg0 != 31138) {
            field2352 = 29;
        }
        field2349 = null;
    }
}
