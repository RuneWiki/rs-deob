import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class262 {

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "Lum;")
    public static class83 field4175;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V")
    public static void method1829(int arg0) {
        field4175 = null;
        if (arg0 >= -54) {
            field4175 = null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method1830(int arg0, int arg1) {
        if (arg0 != 17190) {
            field4175 = null;
        }
        field4174++;
        if (arg1 == 100 && class158.field2408 > 0) {
            byte[] var2 = class282.field4400[--class158.field2408];
            class282.field4400[class158.field2408] = null;
            return var2;
        } else if (arg1 == 5000 && class195.field3051 > 0) {
            byte[] var3 = class349.field5211[--class195.field3051];
            class349.field5211[class195.field3051] = null;
            return var3;
        } else if (arg1 == 30000 && class406.field6001 > 0) {
            byte[] var4 = class2.field14[--class406.field6001];
            class2.field14[class406.field6001] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I[IBII)V")
    public static final void method1831(int arg0, int[] arg1, byte arg2, int arg3, int arg4) {
        field4173++;
        arg4--;
        if (arg2 != 43) {
            return;
        }
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg1[var7] = arg3;
            int var8 = var7 + 1;
            arg1[var8] = arg3;
            int var9 = var8 + 1;
            arg1[var9] = arg3;
            int var10 = var9 + 1;
            arg1[var10] = arg3;
            int var11 = var10 + 1;
            arg1[var11] = arg3;
            int var12 = var11 + 1;
            arg1[var12] = arg3;
            int var13 = var12 + 1;
            arg1[var13] = arg3;
            arg4 = var13 + 1;
            arg1[arg4] = arg3;
        }
        while (var6 > arg4) {
            arg4++;
            arg1[arg4] = arg3;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I[I[II[[BI[[B[B)I")
    public static final int method1832(int arg0, int[] arg1, int[] arg2, int arg3, byte[][] arg4, int arg5, byte[][] arg6, byte[] arg7) {
        field4177++;
        int var8 = arg2[arg3];
        int var9 = arg1[arg3] + var8;
        int var10 = arg2[arg5];
        int var11 = arg1[arg5] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg7[arg3] & 0xFF;
        if ((arg7[arg5] & arg0) < var14) {
            var14 = arg7[arg5] & 0xFF;
        }
        byte[] var15 = arg6[arg3];
        byte[] var16 = arg4[arg5];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)Z")
    public static final boolean method1833(int arg0, int arg1, int arg2) {
        field4176++;
        if (arg0 != 30000) {
            method1830(84, -70);
        }
        return ((arg2 & 0x2000) != 0 | class181.method1269(false, arg1, arg2) | class103.method829(arg1, arg0 + 35536, arg2)) & class148.method1058(arg1, arg2, (byte) 110);
    }
}
