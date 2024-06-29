import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class662 {

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "J")
    public static long field9304 = -1L;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "[[F")
    public static float[][] field9305 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public static int field9309;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
    public static int field9310;

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    public static int field9312;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "Lvo;")
    public static class345 field9306;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "Lla;")
    public static class395 field9307;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)[B", line = 4)
    public static final synchronized byte[] method3718(int arg0, int arg1) {
        field9308++;
        if (arg1 != 2186) {
            method3718(-79, -107);
        }
        if (arg0 == 100 && class476.field6817 > 0) {
            byte[] var2 = class300.field4213[--class476.field6817];
            class300.field4213[class476.field6817] = null;
            return var2;
        } else if (arg0 == 5000 && class134.field2157 > 0) {
            byte[] var3 = class154.field2549[--class134.field2157];
            class154.field2549[class134.field2157] = null;
            return var3;
        } else if (arg0 == 30000 && class304.field4253 > 0) {
            byte[] var4 = class327.field4547[--class304.field4253];
            class327.field4547[class304.field4253] = null;
            return var4;
        } else {
            if (class622.field8867 != null) {
                for (int var5 = 0; var5 < class665.field9346.length; var5++) {
                    if (class665.field9346[var5] == arg0 && class63.field918[var5] > 0) {
                        byte[] var6 = class622.field8867[var5][--class63.field918[var5]];
                        class622.field8867[var5][class63.field918[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z[B)V", line = 66)
    public static final synchronized void method3719(boolean arg0, byte[] arg1) {
        field9310++;
        if (arg1.length == 100 && class476.field6817 < 1000) {
            class300.field4213[class476.field6817++] = arg1;
        } else if (arg0) {
            if (arg1.length == 5000 && class134.field2157 < 250) {
                class154.field2549[class134.field2157++] = arg1;
            } else if (arg1.length == 30000 && class304.field4253 < 50) {
                class327.field4547[class304.field4253++] = arg1;
            } else if (class622.field8867 != null) {
                for (int var2 = 0; var2 < class665.field9346.length; var2++) {
                    if (class665.field9346[var2] == arg1.length && class63.field918[var2] < class622.field8867[var2].length) {
                        class622.field8867[var2][class63.field918[var2]++] = arg1;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V", line = 120)
    public static void method3720(int arg0) {
        if (arg0 <= 92) {
            method3719(false, null);
        }
        field9305 = null;
        field9306 = null;
        field9307 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIB[BII[BI)V", line = 138)
    public static final void method3721(int arg0, int arg1, int arg2, byte arg3, byte[] arg4, int arg5, int arg6, byte[] arg7, int arg8) {
        field9309++;
        if (arg3 >= -71) {
            field9303 = 26;
        }
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg4[var10001] += arg7[arg1++];
                int var14 = arg0++;
                arg4[var14] += arg7[arg1++];
                int var15 = arg0++;
                arg4[var15] += arg7[arg1++];
                int var16 = arg0++;
                arg4[var16] += arg7[arg1++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg4[var10001] += arg7[arg1++];
            }
            arg1 += arg5;
            arg0 += arg8;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(III)Z", line = 188)
    public static final boolean method3722(int arg0, int arg1, int arg2) {
        if (arg1 != 11322) {
            field9305 = null;
        }
        field9311++;
        return ((arg0 & 0x2000) != 0 | class425.method2499(arg0, arg2, (byte) 95) | class606.method3445(24916, arg0, arg2)) & class460.method2675(arg2, arg0, 0);
    }
}
