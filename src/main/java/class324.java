import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class324 {

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II[SI[Ljava/lang/String;)V")
    public static final void method2186(int arg0, int arg1, short[] arg2, int arg3, String[] arg4) {
        if (arg3 < arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            String var7 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            for (int var9 = arg3; var9 < arg0; var9++) {
                if (var7 == null || arg4[var9] != null && (var9 & 0x1) > arg4[var9].compareTo(var7)) {
                    String var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg4[arg0] = arg4[var6];
            arg4[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method2186(var6 - 1, -1, arg2, arg3, arg4);
            method2186(arg0, arg1, arg2, var6 + 1, arg4);
        }
        field5054++;
        if (arg1 != -1) {
            method2188((byte) 46, false, 42, -116);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([I[[BB[I[B[[BII)I")
    public static final int method2187(int[] arg0, byte[][] arg1, byte arg2, int[] arg3, byte[] arg4, byte[][] arg5, int arg6, int arg7) {
        field5053++;
        int var8 = arg0[arg7];
        int var9 = arg3[arg7] + var8;
        int var10 = arg0[arg6];
        int var11 = arg3[arg6] + var10;
        int var12 = var8;
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg4[arg7] & 0xFF;
        if (var14 > (arg4[arg6] & 0xFF)) {
            var14 = arg4[arg6] & 0xFF;
        }
        byte[] var15 = arg1[arg7];
        byte[] var16 = arg5[arg6];
        if (arg2 != -77) {
            method2187(null, null, (byte) -63, null, null, null, -76, -23);
        }
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BZII)Lri;")
    public static final class97 method2188(byte arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 != 8) {
            return null;
        }
        field5055++;
        class275 var4 = null;
        if (class527.field7691 != null) {
            var4 = new class275(arg2, class527.field7691, class342.field5534[arg2], 1000000);
        }
        class564.field8100[arg2] = class654.field9147.method3559(var4, arg2, class281.field4505, (byte) -127);
        class564.field8100[arg2].method2983(0);
        return new class97(class564.field8100[arg2], arg1, arg3);
    }
}
