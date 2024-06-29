import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class494 {

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "Lhp;")
    private class277 field7207 = new class277(64);

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "Lhp;")
    private class277 field7209 = new class277(100);

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Lkea;")
    private class203 field7205;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Z")
    public static boolean field7201 = false;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Ltca;")
    public static class150 field7197 = class498.method2987(false);

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "Lig;")
    public static class206 field7208 = new class206(26, 5);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field7196;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lhi;")
    public final class177 method2961(int arg0, int arg1) {
        field7203++;
        class277 var3 = this.field7207;
        class177 var4;
        synchronized (this.field7207) {
            var4 = (class177) this.field7207.method1801(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class203 var5 = this.field7205;
        byte[] var6;
        synchronized (this.field7205) {
            var6 = this.field7205.method1286(class595.method3471((byte) -105, arg0), class16.method106(arg0, arg1 ^ 0x639), (byte) -49);
        }
        class177 var7 = new class177();
        var7.field2166 = arg0;
        var7.field2172 = this;
        if (var6 != null) {
            var7.method1009(new class194(var6), -2);
        }
        var7.method1006(arg1 ^ 0x383A);
        if (arg1 != 8) {
            return null;
        }
        class277 var8 = this.field7207;
        synchronized (this.field7207) {
            this.field7207.method1808((long) arg0, var7, (byte) -58);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    public static final void method2962(boolean arg0) {
        if (!arg0) {
            field7208 = null;
        }
        field7199++;
        if (!class402.field6085) {
            return;
        }
        while (true) {
            while (class594.field8678 < class257.field3662.length) {
                class511 var1 = class257.field3662[class594.field8678];
                if (var1 != null && var1.field7475 == -1) {
                    if (class320.field4636 == null) {
                        class320.field4636 = class635.field9129.method543(var1.field7471, -10585);
                    }
                    int var2 = class320.field4636.field1563;
                    if (var2 == -1) {
                        return;
                    }
                    class594.field8678++;
                    var1.field7475 = var2;
                    class320.field4636 = null;
                } else {
                    class594.field8678++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public final void method2963(byte arg0) {
        field7200++;
        class277 var2 = this.field7207;
        synchronized (this.field7207) {
            this.field7207.method1805(74);
        }
        class277 var3 = this.field7209;
        synchronized (this.field7209) {
            int var4 = 90 % ((-arg0 - 33) / 62);
            this.field7209.method1805(84);
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)Lgea;")
    public final class66 method2964(int arg0, int arg1) {
        field7206++;
        class277 var3 = this.field7209;
        class66 var4;
        synchronized (this.field7209) {
            var4 = (class66) this.field7209.method1801(0, (long) arg0);
            if (var4 == null) {
                var4 = new class66(arg0);
                this.field7209.method1808((long) arg0, var4, (byte) -114);
            }
        }
        synchronized (var4) {
            if (arg1 < 10) {
                this.field7207 = null;
            }
            return var4.method458(-21154) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method2965(int arg0) {
        field7208 = null;
        field7197 = null;
        if (arg0 != -20340) {
            field7201 = true;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
    public final void method2966(byte arg0) {
        field7196++;
        class277 var2 = this.field7207;
        synchronized (this.field7207) {
            this.field7207.method1810(false);
        }
        class277 var3 = this.field7209;
        synchronized (this.field7209) {
            this.field7209.method1810(false);
        }
        int var4 = -65 % ((arg0 + 19) / 37);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)V")
    public final void method2967(boolean arg0, int arg1) {
        field7204++;
        class277 var3 = this.field7207;
        synchronized (this.field7207) {
            this.field7207.method1811((byte) 120, arg1);
        }
        class277 var4 = this.field7209;
        synchronized (this.field7209) {
            this.field7209.method1811((byte) -38, arg1);
        }
        if (arg0) {
            this.method2967(true, 90);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIFIIIFF)[F")
    public static final float[] method2968(int arg0, int arg1, float arg2, int arg3, int arg4, int arg5, float arg6, float arg7) {
        field7202++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
        var8[8] = var10;
        float var12 = 1.0F - var10;
        var8[0] = var10;
        var8[3] = 0.0F;
        var8[1] = 0.0F;
        var8[2] = var11;
        var8[7] = 0.0F;
        var8[4] = 1.0F;
        var8[6] = -var11;
        var8[5] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg1 / 32767.0F;
        float var17 = 1.0F - var16;
        float var18 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 + arg5 * arg5));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg5) / var19;
                var15 = (float) arg0 / var19;
            }
            var13[8] = var15 * var15 * var17 + var16;
            var13[6] = var14 * var15 * var17;
            var13[3] = -var15 * var18;
            var13[2] = var14 * var15 * var17;
            var13[7] = -var14 * var18;
            var13[4] = var16;
            var13[5] = var14 * var18;
            var13[1] = var15 * var18;
            var13[0] = var14 * var14 * var17 + var16;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[4] = var8[5] * var13[7] + var8[3] * var13[1] + var8[4] * var13[4];
            var9[6] = var8[8] * var13[6] + var8[6] * var13[0] + var8[7] * var13[3];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[6] *= arg2;
        var9[7] *= arg2;
        var9[0] *= arg7;
        var9[5] *= arg6;
        var9[3] *= arg6;
        var9[2] *= arg7;
        var9[1] *= arg7;
        var9[4] *= arg6;
        var9[arg3] *= arg2;
        return var9;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lcda;ILkea;Lkea;Lkea;)V")
    public class494(class149 arg0, int arg1, class203 arg2, class203 arg3, class203 arg4) {
        this.field7205 = arg2;
        if (this.field7205 != null) {
            int var6 = this.field7205.method1282(-50) - 1;
            this.field7205.method1309(1675886592, var6);
        }
        class278.method1813(arg3, arg4, 0, 2);
    }
}
