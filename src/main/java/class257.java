import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class257 extends class219 {

    @OriginalMember(owner = "client!up", name = "h", descriptor = "Lhq;")
    public class148 field3291;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "Z")
    public static boolean field3288 = false;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "Llh;")
    public static class492 field3292;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "[[B")
    public static byte[][] field3289;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V", line = 5)
    public static final void method1535(int arg0) {
        field3290++;
        if (class116.field1446 == -1 || class702.field9814 == -1) {
            return;
        }
        int var1 = ((class662.field8970 - class356.field4590) * class350.field4525 >> 16) + class356.field4590;
        class350.field4525 += var1;
        if (class350.field4525 >= 65535) {
            class350.field4525 = 65535;
            if (class295.field3762) {
                class324.field4048 = false;
            } else {
                class324.field4048 = true;
            }
            class295.field3762 = true;
        } else {
            class324.field4048 = false;
            class295.field3762 = false;
        }
        float var2 = (float) class350.field4525 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class152.field1824 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class187.field2208[class116.field1446][var4][var5] * 3;
            int var22 = class187.field2208[class116.field1446][var4 + 1][var5] * 3;
            int var23 = (class187.field2208[class116.field1446][var4 + 2][var5] + class187.field2208[class116.field1446][var4 + 2][var5] - class187.field2208[class116.field1446][var4 + 3][var5]) * 3;
            int var24 = class187.field2208[class116.field1446][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class187.field2208[class116.field1446][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class455.field5688 = (int) var3[1] * -1;
        class710.field9924 = (int) var3[2] - (class522.field6612 * 512);
        class238.field3071 = (int) var3[0] - (class227.field2938 * 512);
        float[] var6 = new float[3];
        int var7 = class23.field260 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class187.field2208[class702.field9814][var7][var8] * 3;
            int var15 = class187.field2208[class702.field9814][var7 + 1][var8] * 3;
            int var16 = (class187.field2208[class702.field9814][var7 + 2][var8] - (class187.field2208[class702.field9814][var7 + 3][var8] - class187.field2208[class702.field9814][var7 + 2][var8])) * 3;
            int var17 = class187.field2208[class702.field9814][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - var15 * 2;
            int var20 = class187.field2208[class702.field9814][var7 + 2][var8] - (var16 + var17 - var15);
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        if (arg0 < 34) {
            field3288 = true;
        }
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        client.field3568 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class177.field2068 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class613.field8340 = ((class187.field2208[class116.field1446][var4 + 2][3] - class187.field2208[class116.field1446][var4][3]) * class350.field4525 >> 16) + class187.field2208[class116.field1446][var4][3];
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)V", line = 110)
    public static final void method1536(int arg0, int arg1) {
        field3287++;
        if (class363.field4657 == null || arg0 > class363.field4657.length) {
            class363.field4657 = new int[arg0];
        }
        if (arg1 != 2) {
            field3289 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V", line = 129)
    public static void method1537(int arg0) {
        field3292 = null;
        field3289 = null;
        if (arg0 != -2) {
            method1536(-58, -44);
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Ljaa;II[B)V", line = 139)
    public class257(class576 arg0, int arg1, int arg2, byte[] arg3) {
        this.field3291 = class383.method2204(false, arg3, false, arg1, 6406, 6406, arg2, arg0);
        this.field3291.method758(80, false, false);
    }
}
