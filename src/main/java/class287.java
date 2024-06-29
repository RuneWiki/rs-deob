import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class287 extends RuntimeException {

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "Ljava/lang/String;")
    public String field3956;

    @OriginalMember(owner = "client!uea", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3954;

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3952 = new String[200];

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "[I")
    public static int[] field3953 = new int[2];

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "Z")
    public static boolean field3951 = false;

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "J")
    public static long field3950;

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "[I")
    public static int[] field3957;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I[[BLwca;)V", line = 3)
    public static final void method1765(int arg0, byte[][] arg1, class630 arg2) {
        field3958++;
        int var3 = -122 % ((arg0 - 2) / 61);
        int var4 = class479.field6606.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = arg1[var5];
            if (var6 != null) {
                int var7 = (class111.field1540[var5] >> 8) * 64 - class498.field6774;
                int var8 = (class111.field1540[var5] & 0xFF) * 64 - class613.field8555;
                class466.method2634(5);
                arg2.method3531(class151.field2218, var6, 83, class334.field4506, var7, var8);
            }
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V", line = 35)
    public static final void method1766(int arg0) {
        field3955++;
        if (class552.field7454 == -1 || class412.field5849 == -1) {
            return;
        }
        int var1 = ((class378.field5038 - class426.field5964) * class308.field4251 >> 16) + class426.field5964;
        class308.field4251 += var1;
        if (class308.field4251 < 65535) {
            class220.field3087 = false;
            class529.field7171 = false;
        } else {
            if (class529.field7171) {
                class220.field3087 = false;
            } else {
                class220.field3087 = true;
            }
            class308.field4251 = 65535;
            class529.field7171 = true;
        }
        float var2 = (float) class308.field4251 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class4.field31 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class44.field536[class552.field7454][var4][var5] * 3;
            int var22 = class44.field536[class552.field7454][var4 + 1][var5] * 3;
            int var23 = (class44.field536[class552.field7454][var4 + 2][var5] + class44.field536[class552.field7454][var4 + 2][var5] - class44.field536[class552.field7454][var4 + 3][var5]) * 3;
            int var24 = class44.field536[class552.field7454][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = var22 + class44.field536[class552.field7454][var4 + 2][var5] - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class441.field6102 = (int) var3[1] * -1;
        class666.field9335 = (int) var3[0] - class498.field6774 * 512;
        class11.field114 = (int) var3[2] - (class613.field8555 * 512);
        float[] var6 = new float[3];
        int var7 = class112.field1549 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class44.field536[class412.field5849][var7][var8] * 3;
            int var15 = class44.field536[class412.field5849][var7 + 1][var8] * 3;
            int var16 = (class44.field536[class412.field5849][var7 + 2][var8] + class44.field536[class412.field5849][var7 + 2][var8] - class44.field536[class412.field5849][var7 + 3][var8]) * 3;
            int var17 = class44.field536[class412.field5849][var7][var8];
            int var18 = var15 - var14;
            int var19 = var16 + var14 - (var15 * 2);
            int var20 = class44.field536[class412.field5849][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[arg0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class685.field9771 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class41.field475 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class164.field2363 = ((class44.field536[class552.field7454][var4 + 2][3] - class44.field536[class552.field7454][var4][3]) * class308.field4251 >> 16) + class44.field536[class552.field7454][var4][3];
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)V", line = 138)
    public static void method1767(byte arg0) {
        field3957 = null;
        if (arg0 == -56) {
            field3953 = null;
            field3952 = null;
        }
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 167)
    public class287(Throwable arg0, String arg1) {
        this.field3956 = arg1;
        this.field3954 = arg0;
    }
}
