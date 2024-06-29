import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class501 extends class190 {

    @OriginalMember(owner = "client!dca", name = "r", descriptor = "Llm;")
    private class307 field7027;

    @OriginalMember(owner = "client!dca", name = "m", descriptor = "Lab;")
    private class290 field7022;

    @OriginalMember(owner = "client!dca", name = "n", descriptor = "Lbv;")
    public static class567 field7023 = new class567("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!dca", name = "t", descriptor = "Z")
    public static boolean field7029 = false;

    @OriginalMember(owner = "client!dca", name = "g", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!dca", name = "h", descriptor = "I")
    public static int field7017;

    @OriginalMember(owner = "client!dca", name = "i", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!dca", name = "j", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!dca", name = "k", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!dca", name = "l", descriptor = "I")
    public static int field7021;

    @OriginalMember(owner = "client!dca", name = "o", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!dca", name = "p", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!dca", name = "q", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!dca", name = "s", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!dca", name = "v", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!dca", name = "u", descriptor = "Led;")
    public static class115 field7030;

    @OriginalMember(owner = "client!dca", name = "w", descriptor = "[Lha;")
    public static class116[] field7032;

    @OriginalMember(owner = "client!dca", name = "<init>", descriptor = "(Ljj;Llm;)V")
    public class501(class66 arg0, class307 arg1) {
        super(arg0);
        this.field7027 = arg1;
        this.field7022 = new class290(arg0, 2);
        this.field7022.method1833((byte) 111, 0);
        super.field2722.method654(false, 1);
        if (this.field7027.field4419) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field2722.method654(false, 0);
        this.field7022.method1838(0);
        this.field7022.method1833((byte) 107, 1);
        super.field2722.method654(false, 1);
        if (this.field7027.field4419) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field2722.method654(false, 0);
        this.field7022.method1838(0);
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(B)V")
    public static void method2845(byte arg0) {
        field7023 = null;
        if (arg0 != -26) {
            field7024 = -91;
        }
        field7032 = null;
        field7030 = null;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILaba;I)V")
    public final void method927(int arg0, class222 arg1, int arg2) {
        ++field7017;
        if (arg2 != 20731) {
            method2848(56, 30, -42, 64, -115);
        }
        super.field2722.method648(-33, arg1);
        super.field2722.method634(124, arg0);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZB)V")
    public final void method919(boolean arg0, byte arg1) {
        this.field7022.method1835((byte) -41, '\u0000');
        ++field7025;
        if (this.field7027.field4419) {
            super.field2722.method654(false, 1);
            super.field2722.method648(-42, this.field7027.field4415);
            super.field2722.method654(false, 0);
        }
        int var3 = 83 % ((arg1 - -55) / 47);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(III)V")
    public final void method925(int arg0, int arg1, int arg2) {
        ++field7018;
        float var4 = (float) ((arg0 & 3) - -1) * -5.0E-4F;
        float var5 = (float) (((arg0 & 28) >> 3) + 1) * 5.0E-4F;
        float var6 = ~(64 & arg0) == -1 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var7 = (128 & arg0) != 0;
        super.field2722.method654(false, 1);
        if (!var7) {
            class81.field1441[3] = 0.0F;
            class81.field1441[1] = 0.0F;
            class81.field1441[2] = var6;
            class81.field1441[0] = 0.0F;
        } else {
            class81.field1441[3] = 0.0F;
            class81.field1441[0] = var6;
            class81.field1441[2] = 0.0F;
            class81.field1441[1] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class81.field1441, 0);
        class81.field1441[2] = 0.0F;
        class81.field1441[0] = 0.0F;
        class81.field1441[3] = (float) super.field2722.field1135 * var4 % 1.0F;
        class81.field1441[1] = var6;
        OpenGL.glTexGenfv(8193, 9474, class81.field1441, 0);
        if (this.field7027.field4419) {
            class81.field1441[3] = (float) super.field2722.field1135 * var5 % 1.0F;
            class81.field1441[1] = 0.0F;
            class81.field1441[0] = 0.0F;
            class81.field1441[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class81.field1441, 0);
        } else {
            int var8 = (int) ((float) super.field2722.field1135 * var5 * 16.0F);
            super.field2722.method648(-50, this.field7027.field4416[var8 % 16]);
        }
        super.field2722.method654(false, arg1);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(CB)I")
    public static final int method2846(char arg0, byte arg1) {
        if (arg1 != 104) {
            return -33;
        } else {
            ++field7026;
            return arg0 >= 0 && ~arg0 > ~class86.field1584.length ? class86.field1584[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ZI)V")
    public final void method921(boolean arg0, int arg1) {
        ++field7016;
        if (arg1 != 25747) {
            this.method919(false, (byte) 82);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V")
    public final void method926(byte arg0) {
        this.field7022.method1835((byte) -82, '\u0001');
        if (arg0 < -102) {
            ++field7020;
            super.field2722.method654(false, 1);
            super.field2722.method648(95, (class222) null);
            super.field2722.method654(false, 0);
        }
    }

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "(I)V")
    public static final void method2847(int arg0) {
        class134.field2161.method562(class77.field1403, class202.field2854.field7919 ? class6.field55 + 256 << 0 : -1, 256);
        int var1 = 0 % ((-71 - arg0) / 40);
        ++field7021;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IIIII)V")
    public static final void method2848(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -22671) {
            field7023 = null;
        }
        ++field7028;
        class21 var5 = class601.method3413(arg1, 8, (byte) 95);
        var5.method230(arg3 + 41011);
        var5.field302 = arg4;
        var5.field304 = arg2;
        var5.field308 = arg0;
    }

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "(I)Z")
    public final boolean method928(int arg0) {
        ++field7019;
        int var2 = 91 / ((-7 - arg0) / 57);
        return true;
    }
}
