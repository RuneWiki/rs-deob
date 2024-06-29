import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class306 implements class316 {

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "I")
    public int field4436;

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "F")
    public static float field4437;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V")
    public static final void method1939(int arg0) {
        field4439++;
        if (class421.field6033 == -1 || class255.field3802 == -1) {
            return;
        }
        int var1 = ((class291.field4257 - class468.field6491) * class258.field3854 >> 16) + class468.field6491;
        class258.field3854 += var1;
        if (class258.field3854 < 65535) {
            class781.field10714 = false;
            class611.field8307 = false;
        } else {
            if (class781.field10714) {
                class611.field8307 = false;
            } else {
                class611.field8307 = true;
            }
            class258.field3854 = 65535;
            class781.field10714 = true;
        }
        float var2 = (float) class258.field3854 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class374.field5405 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class136.field2001[class421.field6033][var4][var5] * 3;
            int var22 = class136.field2001[class421.field6033][var4 + 1][var5] * 3;
            int var23 = (class136.field2001[class421.field6033][var4 + 2][var5] - (class136.field2001[class421.field6033][var4 + 3][var5] - class136.field2001[class421.field6033][var4 + 2][var5])) * 3;
            int var24 = class136.field2001[class421.field6033][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class136.field2001[class421.field6033][var4 + 2][var5] + var22 - var23 - var24;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class634.field8856 = (int) var3[0] - (class121.field1765 * 512);
        class405.field5867 = (int) var3[1] * -1;
        class350.field5138 = (int) var3[2] - (class230.field3147 * 512);
        float[] var6 = new float[3];
        int var7 = class730.field10126 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class136.field2001[class255.field3802][var7][var8] * 3;
            int var15 = class136.field2001[class255.field3802][var7 + 1][var8] * 3;
            int var16 = (class136.field2001[class255.field3802][var7 + 2][var8] + class136.field2001[class255.field3802][var7 + 2][var8] - class136.field2001[class255.field3802][var7 + 3][var8]) * 3;
            int var17 = class136.field2001[class255.field3802][var7][var8];
            int var18 = var15 - var14;
            int var19 = var16 + var14 - (var15 * 2);
            int var20 = class136.field2001[class255.field3802][var7 + 2][var8] + var15 - (var17 - -var16);
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class253.field3733 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class718.field10019 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class162.field2209 = class136.field2001[class421.field6033][var4][arg0] + ((class136.field2001[class421.field6033][var4 + 2][3] - class136.field2001[class421.field6033][var4][3]) * class258.field3854 >> 16);
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(I)V")
    public class306(int arg0) {
        this.field4436 = arg0;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(II)Z")
    public static final boolean method1940(int arg0, int arg1) {
        field4438++;
        if (arg0 == 2) {
            return arg1 == 2 || arg1 == 22 || arg1 == 5 || arg1 == 10 || arg1 == 49 || arg1 == 60 || arg1 == 8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIII)V")
    public static final void method1941(int arg0, int arg1, int arg2, int arg3) {
        field4435++;
        if (arg1 != 14328) {
            method1939(-30);
        }
        String var4 = "tele " + arg0 + "," + (arg3 >> 6) + "," + (arg2 >> 6) + "," + (arg3 & 0x3F) + "," + (arg2 & 0x3F);
        System.out.println(var4);
        class739.method4093(var4, true, false, -1);
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)Lhv;")
    public final class546 method1557(byte arg0) {
        if (arg0 > -35) {
            this.field4436 = -66;
        }
        field4434++;
        return class52.field752;
    }
}
