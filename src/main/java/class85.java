import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class85 {

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public int field1222;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "B")
    public byte field1227;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public int field1220;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public int field1217;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public int field1214;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Lhn;")
    public static class509 field1216 = new class509(99, 12);

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "Lok;")
    public class170 field1226;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "Lfi;")
    public class392 field1225;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "Lmp;")
    public class535 field1221;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "Lfv;")
    public class79 field1223;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)I")
    public static final int method709(int arg0, int arg1) {
        if (arg1 == 1402653130) {
            field1213++;
            return arg0 >>> 10;
        } else {
            return 20;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(F[FIIIIIZIFI)V")
    public static final void method710(float arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, float arg9, int arg10) {
        if (arg7) {
            method711(-17, 109, -70, 50, -88);
        }
        int var11 = arg10 - arg5;
        field1218++;
        int var12 = arg6 - arg4;
        int var13 = arg3 - arg8;
        float var14 = arg1[2] * (float) var12 + arg1[1] * (float) var13 + arg1[0] * (float) var11;
        float var15 = arg1[5] * (float) var12 + arg1[3] * (float) var11 + arg1[4] * (float) var13;
        float var16 = arg1[8] * (float) var12 + arg1[6] * (float) var11 + arg1[7] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg9 != 1.0F) {
            var17 = arg9 * var17;
        }
        float var18 = var15 + arg0 + 0.5F;
        if (arg2 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg2 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg2 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class220.field3615 = var18;
        class379.field5729 = var17;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIII)V")
    public static final void method711(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1219++;
        float var5 = (float) class7.field104 / (float) class7.field108;
        int var6 = arg2;
        int var7 = arg3;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg2 * var5);
        } else {
            var6 = (int) ((float) arg3 / var5);
        }
        int var8 = arg0 - (arg2 - var6) / 2;
        int var9 = arg4 - (arg3 - var7) / 2;
        if (arg1 != 7) {
            return;
        }
        class108.field1510 = -1;
        class334.field4988 = -1;
        class136.field2074 = class7.field108 * var8 / var6;
        class319.field4810 = class7.field104 - (class7.field104 * var9 / var7);
        class233.method1632(arg1 ^ 0xFFFFFFF8);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static void method712(byte arg0) {
        field1216 = null;
        if (arg0 != 77) {
            method714(-78, null);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)Lqv;")
    public static final class312 method713(int arg0, int arg1, int arg2) {
        class138 var3 = client.field3311[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2114;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILuq;)Z")
    public static final boolean method714(int arg0, class114 arg1) {
        if (arg0 != -16598) {
            method711(109, -59, 69, 89, 87);
        }
        field1224++;
        if (class112.field1564 == arg1.field1592) {
            class364.field5382 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(BIIIII)V")
    public class85(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1222 = arg4;
        this.field1227 = arg0;
        this.field1215 = arg2;
        this.field1220 = arg1;
        this.field1217 = arg3;
        this.field1214 = arg5;
    }
}
