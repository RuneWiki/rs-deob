import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class474 extends class312 {

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "Lvb;")
    private class180 field6721;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "Lqda;")
    private class89 field6716;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    public static int field6723 = 1;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "Ltf;")
    public static class269 field6722 = new class269();

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "F")
    public static float field6715;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field6713;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field6717;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)Z")
    public final boolean method242(byte arg0) {
        ++field6719;
        int var2 = 100 % ((25 - arg0) / 57);
        return true;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)V")
    public final void method240(boolean arg0, int arg1) {
        if (arg1 < 102) {
            field6723 = 122;
        }
        ++field6720;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBLum;)V")
    public final void method244(int arg0, byte arg1, class487 arg2) {
        ++field6725;
        super.field4632.method5(3845, arg2);
        if (arg1 >= -78) {
            this.field6721 = null;
        }
        super.field4632.method133(arg0, (byte) -125);
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lus;Lvb;)V")
    public class474(class1 arg0, class180 arg1) {
        super(arg0);
        this.field6721 = arg1;
        this.field6716 = new class89(arg0, 2);
        this.field6716.method874(0, -119);
        super.field4632.method125(1, 106);
        if (this.field6721.field2912) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field4632.method125(0, -110);
        this.field6716.method869((byte) -77);
        this.field6716.method874(1, -107);
        super.field4632.method125(1, -90);
        if (this.field6721.field2912) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field4632.method125(0, -97);
        this.field6716.method869((byte) -106);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lvr;I)Lar;")
    public static final class636 method2837(class122 arg0, int arg1) {
        if (arg1 <= 12) {
            field6723 = -127;
        }
        ++field6714;
        class636 var2;
        if (class640.field9214 == null) {
            var2 = new class636();
        } else {
            var2 = class640.field9214;
            class640.field9214 = class640.field9214.field9171;
            --class27.field928;
            var2.field9171 = null;
        }
        var2.field9172 = arg0;
        return var2;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZZ)V")
    public final void method243(boolean arg0, boolean arg1) {
        this.field6716.method871(arg1, '\u0000');
        ++field6713;
        if (this.field6721.field2912) {
            super.field4632.method125(1, -37);
            super.field4632.method5(3845, this.field6721.field2915);
            super.field4632.method125(0, -123);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method2838(String arg0, int arg1) {
        ++field6718;
        int var2 = arg0.length();
        long var3 = 0L;
        if (arg1 != 6726) {
            return 38L;
        } else {
            for (int var5 = 0; var2 > var5; ++var5) {
                var3 = (var3 << 5) + -var3 - -((long) arg0.charAt(var5));
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V")
    public static void method2839(int arg0) {
        if (arg0 != 0) {
            field6722 = null;
        }
        field6722 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public final void method241(int arg0) {
        this.field6716.method871(false, '\u0001');
        ++field6717;
        if (arg0 == -123) {
            super.field4632.method125(1, -56);
            super.field4632.method5(3845, (class487) null);
            super.field4632.method125(0, arg0 + 226);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIB)V")
    public final void method238(int arg0, int arg1, byte arg2) {
        ++field6724;
        float var4 = (float) ((arg1 & 3) + 1) * -5.0E-4F;
        float var5 = (float) ((arg1 >> 3 & 3) + 1) * 5.0E-4F;
        int var6 = -106 / ((74 - arg2) / 45);
        float var7 = ~(arg1 & 64) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var8 = (128 & arg1) != 0;
        super.field4632.method125(1, 77);
        if (var8) {
            class559.field7902[3] = 0.0F;
            class559.field7902[0] = var7;
            class559.field7902[2] = 0.0F;
            class559.field7902[1] = 0.0F;
        } else {
            class559.field7902[0] = 0.0F;
            class559.field7902[2] = var7;
            class559.field7902[3] = 0.0F;
            class559.field7902[1] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class559.field7902, 0);
        class559.field7902[0] = 0.0F;
        class559.field7902[2] = 0.0F;
        class559.field7902[1] = var7;
        class559.field7902[3] = (float) super.field4632.field215 * var4 % 1.0F;
        OpenGL.glTexGenfv(8193, 9474, class559.field7902, 0);
        if (this.field6721.field2912) {
            class559.field7902[2] = 0.0F;
            class559.field7902[1] = 0.0F;
            class559.field7902[3] = (float) super.field4632.field215 * var5 % 1.0F;
            class559.field7902[0] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class559.field7902, 0);
        } else {
            int var9 = (int) ((float) super.field4632.field215 * var5 * 16.0F);
            super.field4632.method5(3845, this.field6721.field2918[var9 % 16]);
        }
        super.field4632.method125(0, 112);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lha;III[Z)V")
    public static final void method2840(class54 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class697.field9813 != class485.field6947) {
            int var5 = class185.field2987[arg1].method552(1, arg2, arg3);
            for (int var6 = 0; var6 <= arg1; ++var6) {
                if (arg4 == null || arg4[var6]) {
                    class37 var7 = class185.field2987[var6];
                    if (var7 != null) {
                        var7.method539(arg0, arg2, var5 - var7.method552(1, arg2, arg3), arg3, 0, false);
                    }
                }
            }
        }
    }
}
