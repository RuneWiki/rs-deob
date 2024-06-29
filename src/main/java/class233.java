import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class233 extends class184 {

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public int field3393;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public int field3396;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field3400 = 0;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method1551(int arg0) {
        field3391++;
        if (arg0 != -8963) {
            this.method1555(100);
        }
        return ((this.field3393 & 0x2CEDA2) >> 21) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V", line = 17)
    public static final void method1552(int arg0) {
        field3392++;
        if (class520.field7451 == -1 || class70.field988 == -1) {
            return;
        }
        int var1 = ((class730.field10231 - class310.field4395) * class479.field6953 >> 16) + class310.field4395;
        class479.field6953 += var1;
        if (class479.field6953 < 65535) {
            class415.field6231 = false;
            class261.field3714 = false;
        } else {
            if (class415.field6231) {
                class261.field3714 = false;
            } else {
                class261.field3714 = true;
            }
            class479.field6953 = 65535;
            class415.field6231 = true;
        }
        float var2 = (float) class479.field6953 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class379.field5734 * 2;
        int var5 = -59 % ((arg0 - 65) / 58);
        for (int var6 = 0; var6 < 3; var6++) {
            int var22 = class381.field5752[class520.field7451][var4][var6] * 3;
            int var23 = class381.field5752[class520.field7451][var4 + 1][var6] * 3;
            int var24 = (class381.field5752[class520.field7451][var4 + 2][var6] + class381.field5752[class520.field7451][var4 + 2][var6] - class381.field5752[class520.field7451][var4 + 3][var6]) * 3;
            int var25 = class381.field5752[class520.field7451][var4][var6];
            int var26 = var23 - var22;
            int var27 = var22 + var24 - (var23 * 2);
            int var28 = class381.field5752[class520.field7451][var4 + 2][var6] + var23 - var25 - var24;
            var3[var6] = (((float) var28 * var2 + (float) var27) * var2 + (float) var26) * var2 + (float) var25;
        }
        class364.field5254 = (int) var3[0] - class361.field5224 * 512;
        class259.field3700 = (int) var3[1] * -1;
        class460.field6783 = (int) var3[2] - (class582.field8288 * 512);
        float[] var7 = new float[3];
        int var8 = class466.field6832 * 2;
        for (int var9 = 0; var9 < 3; var9++) {
            int var15 = class381.field5752[class70.field988][var8][var9] * 3;
            int var16 = class381.field5752[class70.field988][var8 + 1][var9] * 3;
            int var17 = (class381.field5752[class70.field988][var8 + 2][var9] + class381.field5752[class70.field988][var8 + 2][var9] - class381.field5752[class70.field988][var8 + 3][var9]) * 3;
            int var18 = class381.field5752[class70.field988][var8][var9];
            int var19 = var16 - var15;
            int var20 = var17 + var15 - (var16 * 2);
            int var21 = class381.field5752[class70.field988][var8 + 2][var9] + var16 - var18 - var17;
            var7[var9] = (((float) var21 * var2 + (float) var20) * var2 + (float) var19) * var2 + (float) var18;
        }
        float var10 = var7[0] - var3[0];
        float var11 = (var7[1] - var3[1]) * -1.0F;
        float var12 = var7[2] - var3[2];
        double var13 = Math.sqrt((double) (var10 * var10 + var12 * var12));
        class120.field1650 = (int) (Math.atan2((double) var11, var13) * 2607.5945876176133D) & 0x3FFF;
        class660.field9234 = (int) (-Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
        class253.field3649 = ((class381.field5752[class520.field7451][var4 + 2][3] - class381.field5752[class520.field7451][var4][3]) * class479.field6953 >> 16) + class381.field5752[class520.field7451][var4][3];
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)Z", line = 122)
    public final boolean method1553(int arg0) {
        if (arg0 == -4953) {
            field3399++;
            return (this.field3393 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)I", line = 139)
    public final int method1554(int arg0) {
        if (arg0 != 1) {
            this.method1554(92);
        }
        field3390++;
        return (this.field3393 & 0x1D99F7) >> 18;
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)I", line = 153)
    public final int method1555(int arg0) {
        if (arg0 != 10061) {
            field3398 = 97;
        }
        field3389++;
        return class389.method2496(-54, this.field3393);
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(II)V", line = 163)
    public class233(int arg0, int arg1) {
        this.field3393 = arg0;
        this.field3396 = arg1;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Z", line = 172)
    public final boolean method1556(int arg0, int arg1) {
        int var3 = 70 % ((arg1 - 27) / 57);
        field3394++;
        return (this.field3393 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)Z", line = 185)
    public final boolean method1557(boolean arg0) {
        if (!arg0) {
            field3398 = 39;
        }
        field3397++;
        return ((this.field3393 & 0x7C966A) >> 22) != 0;
    }
}
