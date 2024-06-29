import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class140 {

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "Lfba;")
    private class348 field1918 = new class348(128);

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "Lla;")
    private class423 field1921;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "F")
    public static float field1912;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "[I")
    public static int[] field1911;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BIIIIFFF)[F", line = 4)
    public static final float[] method985(byte arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        field1919++;
        float[] var8 = new float[9];
        if (arg0 != -123) {
            method993((byte) 54);
        }
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg4 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg4 * 0.024543693F));
        var8[6] = -var11;
        var8[5] = 0.0F;
        var8[4] = 1.0F;
        var8[7] = 0.0F;
        float var12 = 1.0F - var10;
        var8[8] = var10;
        var8[2] = var11;
        var8[0] = var10;
        var8[1] = 0.0F;
        var8[3] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = 0.0F;
        float var16 = (float) arg2 / 32767.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - (var16 * var16))));
        float var18 = 1.0F - var16;
        float var19 = (float) Math.sqrt((double) (arg1 * arg1 + arg3 * arg3));
        if (var19 == 0.0F && var16 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg3) / var19;
                var15 = (float) arg1 / var19;
            }
            var13[2] = var14 * var15 * var18;
            var13[8] = var15 * var15 * var18 + var16;
            var13[1] = var15 * var17;
            var13[7] = -var14 * var17;
            var13[4] = var16;
            var13[6] = var14 * var15 * var18;
            var13[3] = -var15 * var17;
            var13[5] = var14 * var17;
            var13[0] = var14 * var14 * var18 + var16;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[2] *= arg6;
        var9[3] *= arg5;
        var9[7] *= arg7;
        var9[5] *= arg5;
        var9[0] *= arg6;
        var9[8] *= arg7;
        var9[6] *= arg7;
        var9[1] *= arg6;
        var9[4] *= arg5;
        return var9;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(BI)V", line = 88)
    public final void method986(byte arg0, int arg1) {
        class348 var3 = this.field1918;
        synchronized (this.field1918) {
            this.field1918.method2207(arg1, 1);
            if (arg0 <= 45) {
                field1915 = -40;
            }
        }
        field1920++;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V", line = 102)
    public final void method987(int arg0) {
        field1913++;
        class348 var2 = this.field1918;
        synchronized (this.field1918) {
            this.field1918.method2220(false);
        }
        if (arg0 != 6) {
            this.method986((byte) -115, 21);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Liu;", line = 115)
    public final class507 method988(int arg0, int arg1) {
        field1916++;
        class348 var3 = this.field1918;
        class507 var4;
        synchronized (this.field1918) {
            var4 = (class507) this.field1918.method2216(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class423 var5 = this.field1921;
        byte[] var6;
        synchronized (this.field1921) {
            var6 = this.field1921.method2600(0, 1, arg1);
        }
        class507 var7 = new class507();
        if (var6 != null) {
            var7.method3089((byte) -105, new class479(var6));
        }
        if (arg0 <= 46) {
            method991((byte) -110, 112);
        }
        class348 var8 = this.field1918;
        synchronized (this.field1918) {
            this.field1918.method2213((byte) -16, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lha;Z)V", line = 151)
    public static final void method989(class543 arg0, boolean arg1) {
        field1917++;
        int var2 = 0;
        int var3 = 0;
        if (class416.field5919) {
            var2 = class352.method2243(-75);
            var3 = class695.method3915((byte) 86);
        }
        int var4 = -10660793;
        class745.method4157(-16777216, class731.field10246, class388.field5606 + var3, var4, 26965, arg0, class132.field1820 + var2, class314.field4246);
        class193.field2838.method2433(-1, var4, class132.field1820 + var2 + 3, 0, class608.field8644.method3543(-24350, class45.field748), class388.field5606 - (-var3 - 14));
        int var5 = var2 + class535.field7789.method2459(-32213);
        int var6 = class535.field7789.method2452(-117) + var3;
        if (class34.field311) {
            int var7 = 0;
            for (class194 var8 = (class194) class225.field3348.method3025(arg1); var8 != null; var8 = (class194) class225.field3348.method3026(true)) {
                int var12 = var7 * 16 + class388.field5606 + var3 + 31;
                if (var8.field2845 == 1) {
                    class257.method1710(class132.field1820 + var2, class388.field5606 - -var3, (byte) 40, var12, class314.field4246, var6, arg0, -256, class731.field10246, var5, -1, (class304) var8.field2841.field7165.field5596);
                } else {
                    class288.method1829(var6, -1, arg0, var5, class388.field5606 + var3, class132.field1820 - -var2, class314.field4246, var8, -256, (byte) 107, class731.field10246, var12);
                }
                var7++;
            }
            if (class537.field7799 != null) {
                class745.method4157(-16777216, class702.field9898, class90.field1279, var4, 26965, arg0, class327.field4441, class666.field9521);
                class193.field2838.method2433(-1, var4, class327.field4441 + 3, 0, class537.field7799.field2847, class90.field1279 + 14);
                int var9 = 0;
                for (class304 var10 = (class304) class537.field7799.field2841.method3025(false); var10 != null; var10 = (class304) class537.field7799.field2841.method3026(true)) {
                    int var11 = var9 * 16 + class90.field1279 + 31;
                    class257.method1710(class327.field4441, class90.field1279, (byte) 40, var11, class666.field9521, var6, arg0, -256, class702.field9898, var5, -1, var10);
                    var9++;
                }
                class629.method3621(class90.field1279, class702.field9898, class327.field4441, (byte) 82, class666.field9521);
            }
        } else {
            int var13 = 0;
            for (class304 var14 = (class304) class303.field4137.method3565(103); var14 != null; var14 = (class304) class303.field4137.method3561((byte) 33)) {
                int var15 = class388.field5606 + var3 + ((-var13 + class456.field6499 + -1) * 16) + 31;
                class257.method1710(class132.field1820 + var2, class388.field5606 + var3, (byte) 40, var15, class314.field4246, var6, arg0, -256, class731.field10246, var5, -1, var14);
                var13++;
            }
        }
        if (arg1) {
            method992(true);
        }
        class629.method3621(class388.field5606 + var3, class731.field10246, class132.field1820 + var2, (byte) 98, class314.field4246);
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)V", line = 244)
    public final void method990(int arg0) {
        class348 var2 = this.field1918;
        synchronized (this.field1918) {
            this.field1918.method2219(-5300);
            if (arg0 > -85) {
                method993((byte) -53);
            }
        }
        field1909++;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(BI)V", line = 258)
    public static final void method991(byte arg0, int arg1) {
        field1914++;
        if (arg0 <= 49) {
            method994(null, false);
        }
        class503 var2 = class512.method3112(1, arg1, 0);
        var2.method3074(-122);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)I", line = 276)
    public static final int method992(boolean arg0) {
        field1910++;
        if (arg0) {
            field1912 = 0.043837063F;
        }
        return class332.field4511;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V", line = 287)
    public static void method993(byte arg0) {
        field1911 = null;
        int var1 = -78 / ((-arg0 - 70) / 33);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Ljava/awt/Component;Z)Lpea;", line = 296)
    public static final class457 method994(Component arg0, boolean arg1) {
        field1908++;
        return arg1 ? null : new class606(arg0);
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lmp;ILla;)V", line = 310)
    public class140(class315 arg0, int arg1, class423 arg2) {
        this.field1921 = arg2;
        this.field1921.method2616(1, 0);
    }
}
