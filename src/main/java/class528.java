import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class528 extends class86 {

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Lhl;")
    private class373 field7741;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "Lhq;")
    private class110 field7737;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field7734 = 104;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Z")
    public static boolean field7738 = true;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Ljava/lang/String;")
    public static String field7739 = "";

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field7732;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field7733;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)V")
    public static void method3125(byte arg0) {
        field7739 = null;
        if (arg0 < 119) {
            field7734 = 95;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLlr;I)V")
    public final void method236(boolean arg0, class538 arg1, int arg2) {
        if (!arg0) {
            field7738 = true;
        }
        super.field1248.method2075(arg1, 0);
        ++field7733;
        super.field1248.method2045(34023, arg2);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZ)V")
    public final void method241(int arg0, boolean arg1) {
        if (arg0 == 0) {
            ++field7732;
            this.field7737.method693((byte) 80, '\u0000');
            if (this.field7741.field5673) {
                super.field1248.method2040((byte) 99, 1);
                super.field1248.method2075(this.field7741.field5672, arg0);
                super.field1248.method2040((byte) 1, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([Laa;B)V")
    public static final void method3126(class341[] arg0, byte arg1) {
        ++field7742;
        class267.field3713 = arg0.length;
        class203.field2718 = new int[class267.field3713 + 10];
        class311.field4548 = new class341[class267.field3713 + 10];
        class192.method1297(arg0, 0, class311.field4548, 0, class267.field3713);
        for (int var2 = 0; ~class267.field3713 < ~var2; ++var2) {
            class203.field2718[var2] = class311.field4548[var2].method306();
        }
        if (arg1 != 121) {
            field7739 = null;
        }
        for (int var3 = class267.field3713; ~var3 > ~class311.field4548.length; ++var3) {
            class203.field2718[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public final void method237(int arg0) {
        this.field7737.method693((byte) 83, '\u0001');
        ++field7736;
        if (arg0 != 27670) {
            this.field7741 = null;
        }
        super.field1248.method2040((byte) 90, 1);
        super.field1248.method2075((class538) null, 0);
        super.field1248.method2040((byte) 68, 0);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBI)V")
    public final void method239(int arg0, byte arg1, int arg2) {
        ++field7740;
        float var4 = (float) ((arg2 & 3) - -1) * -5.0E-4F;
        float var5 = (float) (((28 & arg2) >> 3) - -1) * 5.0E-4F;
        float var6 = (arg2 & 64) != 0 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = ~(128 & arg2) != -1;
        super.field1248.method2040((byte) -101, 1);
        if (!var7) {
            class506.field7457[2] = var6;
            class506.field7457[1] = 0.0F;
            class506.field7457[3] = 0.0F;
            class506.field7457[0] = 0.0F;
        } else {
            class506.field7457[0] = var6;
            class506.field7457[3] = 0.0F;
            class506.field7457[1] = 0.0F;
            class506.field7457[2] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class506.field7457, 0);
        class506.field7457[3] = (float) super.field1248.field4899 * var4 % 1.0F;
        class506.field7457[2] = 0.0F;
        int var8 = -107 / ((-50 - arg1) / 53);
        class506.field7457[0] = 0.0F;
        class506.field7457[1] = var6;
        OpenGL.glTexGenfv(8193, 9474, class506.field7457, 0);
        if (this.field7741.field5673) {
            class506.field7457[1] = 0.0F;
            class506.field7457[3] = (float) super.field1248.field4899 * var5 % 1.0F;
            class506.field7457[2] = 0.0F;
            class506.field7457[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class506.field7457, 0);
        } else {
            int var9 = (int) ((float) super.field1248.field4899 * var5 * 16.0F);
            super.field1248.method2075(this.field7741.field5681[var9 % 16], 0);
        }
        super.field1248.method2040((byte) 75, 0);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lnq;Lhl;)V")
    public class528(class325 arg0, class373 arg1) {
        super(arg0);
        this.field7741 = arg1;
        this.field7737 = new class110(arg0, 2);
        this.field7737.method694(4864, 0);
        super.field1248.method2040((byte) 61, 1);
        if (this.field7741.field5673) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field1248.method2040((byte) 90, 0);
        this.field7737.method691(-60);
        this.field7737.method694(4864, 1);
        super.field1248.method2040((byte) -125, 1);
        if (this.field7741.field5673) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field1248.method2040((byte) -85, 0);
        this.field7737.method691(-89);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lnq;I)V")
    public static final void method3127(class325 arg0, int arg1) {
        ++field7744;
        if (class313.field4578 == null) {
            class248 var2 = new class248();
            byte[] var3 = var2.method1608(128, true, 16, 128);
            class313.field4578 = class240.method1577(false, 35, var3);
        }
        if (class524.field7708 == null) {
            class194 var4 = new class194();
            byte[] var5 = var4.method1309((byte) -76, 128, 16, 128);
            class524.field7708 = class240.method1577(false, 35, var5);
        }
        class71 var6 = arg0.field4898;
        if (arg1 >= -60) {
            method3127((class325) null, -81);
        }
        if (var6.method497(0) && class288.field4205 == null) {
            byte[] var7 = class353.method2268(0.6F, 4.0F, 128, 16, 0.5F, 8, (byte) 90, 4.0F, new class372(419684), 16.0F, 128);
            class288.field4205 = class240.method1577(false, 35, var7);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZB)V")
    public final void method235(boolean arg0, byte arg1) {
        ++field7735;
        if (arg1 != 112) {
            this.field7737 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)Z")
    public final boolean method238(byte arg0) {
        if (arg0 >= -2) {
            return false;
        } else {
            ++field7743;
            return true;
        }
    }
}
