import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class32 extends class310 {

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "[Lic;")
    public static class22[] field459 = new class22[4];

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    public static int field464 = 0;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "Lhh;")
    public static class86 field463 = null;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "Z")
    public static boolean field461 = false;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "[Lml;")
    public static class17[] field458;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V", line = 4)
    public static final void method220(int arg0) {
        field460++;
        if (class195.field3106 == -1 || class317.field5053 == -1) {
            return;
        }
        int var1 = ((class340.field5432 - class252.field4260) * class353.field5596 >> 16) + class252.field4260;
        float[] var2 = new float[3];
        class353.field5596 += var1;
        if (arg0 >= -83) {
            method222(19);
        }
        if (class353.field5596 >= 65535) {
            if (class124.field2120) {
                class36.field521 = false;
            } else {
                class36.field521 = true;
            }
            class353.field5596 = 65535;
            class124.field2120 = true;
        } else {
            class36.field521 = false;
            class124.field2120 = false;
        }
        int var3 = class208.field3273 * 2;
        float var4 = (float) class353.field5596 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class339.field5412[class195.field3106][var3][var5] * 3;
            int var7 = class339.field5412[class195.field3106][var3 + 1][var5] * 3;
            int var8 = (class339.field5412[class195.field3106][var3 + 2][var5] + class339.field5412[class195.field3106][var3 + 2][var5] - class339.field5412[class195.field3106][var3 + 3][var5]) * 3;
            int var9 = class339.field5412[class195.field3106][var3][var5];
            int var10 = var7 - var6;
            int var11 = var6 + var8 - (var7 * 2);
            int var12 = class339.field5412[class195.field3106][var3 + 2][var5] + var7 - var9 - var8;
            var2[var5] = (((float) var12 * var4 + (float) var11) * var4 + (float) var10) * var4 + (float) var9;
        }
        class281.field4617 = (int) var2[0] - (class93.field1562 * 128);
        class206.field3250 = (int) var2[1] * -1;
        class229.field3807 = (int) var2[2] - (class275.field4546 * 128);
        float[] var13 = new float[3];
        int var14 = class285.field4655 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class339.field5412[class317.field5053][var14][var15] * 3;
            int var17 = class339.field5412[class317.field5053][var14 + 1][var15] * 3;
            int var18 = (class339.field5412[class317.field5053][var14 + 2][var15] - (class339.field5412[class317.field5053][var14 + 3][var15] - class339.field5412[class317.field5053][var14 + 2][var15])) * 3;
            int var19 = class339.field5412[class317.field5053][var14][var15];
            int var20 = var17 - var16;
            int var21 = var16 + var18 - (var17 * 2);
            int var22 = class339.field5412[class317.field5053][var14 + 2][var15] + var17 - var19 - var18;
            var13[var15] = (((float) var22 * var4 + (float) var21) * var4 + (float) var20) * var4 + (float) var19;
        }
        float var23 = var13[0] - var2[0];
        float var24 = (var13[1] - var2[1]) * -1.0F;
        float var25 = var13[2] - var2[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class184.field2962 = (float) Math.atan2((double) var24, var26);
        class180.field2879 = -((float) Math.atan2((double) var23, (double) var25));
        class194.field3095 = (int) ((double) class184.field2962 * 325.949D) & 0x7FF;
        class176.field2818 = (int) ((double) class180.field2879 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(III)V", line = 109)
    public static final void method221(int arg0, int arg1, int arg2) {
        field466++;
        if (class278.method2058(arg0, (byte) 4)) {
            class311.method2207(arg2, class163.field2587[arg0], true);
            if (arg1 != -32471) {
                method221(-81, -109, 75);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V", line = 125)
    public static void method222(int arg0) {
        field459 = null;
        if (arg0 != -2) {
            field459 = (class22[]) null;
        }
        field458 = null;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I)V", line = 135)
    public class32(int arg0) {
        super(0, true);
        this.field454 = 4096;
        this.field454 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V", line = 145)
    public class32() {
        this(4096);
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(B)V", line = 154)
    public static final void method223(byte arg0) {
        class348.field5536.method2326(-4);
        field456++;
        if (arg0 > -124) {
            field457 = -66;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lqm;II)V", line = 170)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg1 != -2470) {
            this.method75((class227) null, 27, 67);
        }
        if (arg2 == 0) {
            this.field454 = (arg0.method1720((byte) -122) << 12) / 255;
        }
        field455++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZBIZ)V", line = 198)
    public static final void method224(int arg0, boolean arg1, byte arg2, int arg3, boolean arg4) {
        if (arg2 != -128) {
            method222(47);
        }
        class295.method2122(arg1, arg2 - 26868, 0, arg3, class118.field1999.length - 1, arg4, arg0);
        field462++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[I", line = 218)
    public final int[] method77(int arg0, int arg1) {
        if (arg1 != -13093) {
            field464 = -97;
        }
        int[] var3 = this.field4950.method930(arg0, 0);
        field465++;
        if (this.field4950.field2001) {
            class242.method1839(var3, 0, class261.field4405, this.field454);
        }
        return var3;
    }
}
