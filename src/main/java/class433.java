import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public abstract class class433 {

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "Lsga;")
    public static class651 field6041 = new class651();

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "[I")
    public static int[] field6045 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "F")
    public static float field6042;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public int field6040;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public int field6044;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public int field6047;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Luu;")
    public static class237 field6046;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "[Ls;")
    public static class341[] field6043;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)Z")
    public final boolean method2671(byte arg0) {
        if (arg0 != 46) {
            field6046 = null;
        }
        field6039++;
        return (this.field6044 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)Z")
    public final boolean method2672(int arg0) {
        field6037++;
        if (arg0 != 8) {
            field6046 = null;
        }
        return (this.field6044 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)Z")
    public final boolean method2673(int arg0) {
        field6038++;
        int var2 = -52 % ((64 - arg0) / 60);
        return (this.field6044 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)Z")
    public final boolean method2674(boolean arg0) {
        field6035++;
        if (arg0) {
            return true;
        } else {
            return (this.field6044 & 0x2) != 0;
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
    public static final void method2675(int arg0) {
        field6036++;
        if (class712.field9954 == -1 || class299.field4237 == -1) {
            return;
        }
        int var1 = ((class43.field530 - class763.field10632) * class413.field5862 >> 16) + class763.field10632;
        class413.field5862 += var1;
        if (class413.field5862 >= 65535) {
            if (class126.field1733) {
                class509.field7065 = false;
            } else {
                class509.field7065 = true;
            }
            class413.field5862 = 65535;
            class126.field1733 = true;
        } else {
            class126.field1733 = false;
            class509.field7065 = false;
        }
        float var2 = (float) class413.field5862 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class202.field2681 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class318.field4420[class712.field9954][var4][var5] * 3;
            int var22 = class318.field4420[class712.field9954][var4 + 1][var5] * 3;
            int var23 = (class318.field4420[class712.field9954][var4 + 2][var5] + class318.field4420[class712.field9954][var4 + 2][var5] - class318.field4420[class712.field9954][var4 + 3][var5]) * 3;
            int var24 = class318.field4420[class712.field9954][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = class318.field4420[class712.field9954][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class123.field1680 = (int) var3[2] - class587.field7995 * 512;
        class671.field9282 = (int) var3[0] - class113.field1509 * 512;
        class206.field2702 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class532.field7388 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class318.field4420[class299.field4237][var7][var8] * 3;
            int var15 = class318.field4420[class299.field4237][var7 + 1][var8] * 3;
            int var16 = (class318.field4420[class299.field4237][var7 + 2][var8] + class318.field4420[class299.field4237][var7 + 2][var8] - class318.field4420[class299.field4237][var7 + 3][var8]) * 3;
            int var17 = class318.field4420[class299.field4237][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class318.field4420[class299.field4237][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class25.field318 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class230.field3118 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class118.field1556 = ((class318.field4420[class712.field9954][var4 + 2][3] - class318.field4420[class712.field9954][var4][3]) * class413.field5862 >> 16) + class318.field4420[class712.field9954][var4][arg0];
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
    public static void method2676(int arg0) {
        field6041 = null;
        field6045 = null;
        field6043 = null;
        if (arg0 != 2) {
            method2675(41);
        }
        field6046 = null;
    }
}
