import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class118 extends class209 {

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "Lln;")
    private class94 field1491;

    @OriginalMember(owner = "client!fq", name = "r", descriptor = "Lcn;")
    private class21 field1494;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "Lim;")
    public static class353 field1489 = new class353(84, -2);

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!fq", name = "s", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Luq;Lln;)V")
    public class118(class313 arg0, class94 arg1) {
        super(arg0);
        this.field1491 = arg1;
        this.field1494 = new class21(arg0, 2);
        this.field1494.method120((byte) -124, 0);
        super.field2710.method1966(3000, 1);
        if (this.field1491.field1243) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field2710.method1966(3000, 0);
        this.field1494.method123(4864);
        this.field1494.method120((byte) 16, 1);
        super.field2710.method1966(3000, 1);
        if (this.field1491.field1243) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field2710.method1966(3000, 0);
        this.field1494.method123(4864);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)Z")
    public final boolean method42(boolean arg0) {
        ++field1488;
        if (!arg0) {
            this.field1494 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(I)V")
    public final void method43(int arg0) {
        if (arg0 != -1) {
            this.method48(false, (byte) -90);
        }
        ++field1495;
        this.field1494.method118('\u0001', arg0 + 1);
        super.field2710.method1966(3000, 1);
        super.field2710.method1884((class148) null, -2);
        super.field2710.method1966(arg0 + 3001, 0);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IIIIIBII)V")
    public static final void method648(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        ++field1487;
        int var8 = arg7 - -arg4;
        int var9 = -arg4 + arg2;
        for (int var10 = arg7; var8 > var10; ++var10) {
            class373.method2275((byte) -9, arg6, arg0, arg1, class256.field3173[var10]);
        }
        if (arg5 != 4) {
            method650(true, (class3) null);
        }
        for (int var11 = arg2; ~var11 < ~var9; --var11) {
            class373.method2275((byte) -9, arg6, arg0, arg1, class256.field3173[var11]);
        }
        int var12 = -arg4 + arg6;
        int var13 = arg1 + arg4;
        for (int var14 = var8; ~var14 >= ~var9; ++var14) {
            int[] var15 = class256.field3173[var14];
            class373.method2275((byte) -9, var13, arg0, arg1, var15);
            class373.method2275((byte) -9, var12, arg3, var13, var15);
            class373.method2275((byte) -9, arg6, arg0, var12, var15);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZB)V")
    public final void method47(boolean arg0, byte arg1) {
        ++field1492;
        this.field1494.method118('\u0000', 0);
        if (this.field1491.field1243) {
            super.field2710.method1966(3000, 1);
            super.field2710.method1884(this.field1491.field1246, -2);
            super.field2710.method1966(3000, 0);
        }
        if (arg1 <= 88) {
            this.method44((class148) null, -106, true);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)V")
    public final void method45(int arg0, int arg1, int arg2) {
        ++field1484;
        float var4 = (float) ((arg0 & 3) + 1) * -5.0E-4F;
        float var5 = (float) ((3 & arg0 >> 3) + 1) * 5.0E-4F;
        float var6 = (arg0 & 64) != 0 ? 9.765625E-4F : 4.8828125E-4F;
        super.field2710.method1966(3000, 1);
        boolean var7 = ~(128 & arg0) != -1;
        if (!var7) {
            class117.field1482[1] = 0.0F;
            class117.field1482[0] = 0.0F;
            class117.field1482[2] = var6;
            class117.field1482[3] = 0.0F;
        } else {
            class117.field1482[2] = 0.0F;
            class117.field1482[1] = 0.0F;
            class117.field1482[3] = 0.0F;
            class117.field1482[0] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class117.field1482, 0);
        class117.field1482[2] = 0.0F;
        class117.field1482[1] = var6;
        class117.field1482[0] = 0.0F;
        class117.field1482[3] = (float) super.field2710.field4198 * var4 % 1.0F;
        OpenGL.glTexGenfv(8193, 9474, class117.field1482, 0);
        if (arg2 >= -75) {
            this.field1491 = null;
        }
        if (this.field1491.field1243) {
            class117.field1482[2] = 0.0F;
            class117.field1482[1] = 0.0F;
            class117.field1482[3] = (float) super.field2710.field4198 * var5 % 1.0F;
            class117.field1482[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class117.field1482, 0);
        } else {
            int var8 = (int) ((float) super.field2710.field4198 * var5 * 16.0F);
            super.field2710.method1884(this.field1491.field1248[var8 % 16], -2);
        }
        super.field2710.method1966(3000, 0);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V")
    public static void method649(byte arg0) {
        if (arg0 != 43) {
            method650(true, (class3) null);
        }
        field1489 = null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZLuv;)V")
    public static final void method650(boolean arg0, class3 arg1) {
        ++field1485;
        class272.field3457.method374(arg1.method7(arg0), 6);
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(ZB)V")
    public final void method48(boolean arg0, byte arg1) {
        ++field1493;
        if (arg1 <= 122) {
            this.field1494 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lea;IZ)V")
    public final void method44(class148 arg0, int arg1, boolean arg2) {
        super.field2710.method1884(arg0, -2);
        if (arg2) {
            ++field1486;
            super.field2710.method1909(-105, arg1);
        }
    }
}
