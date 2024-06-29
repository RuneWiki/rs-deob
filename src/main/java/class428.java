import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class428 {

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Z")
    public boolean field5409 = false;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "Lhm;")
    private class208 field5411 = new class208(64);

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "Lhm;")
    public class208 field5420 = new class208(500);

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "Lhm;")
    public class208 field5421 = new class208(30);

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "Lhm;")
    public class208 field5422 = new class208(50);

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "Z")
    public boolean field5412;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Lpfa;")
    public class275 field5415;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "Lpfa;")
    private class275 field5408;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field5404 = -1;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public int field5423;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5410;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZ)V", line = 3)
    public final void method2353(int arg0, boolean arg1) {
        field5403++;
        if (arg1 != this.field5409) {
            int var3 = 55 / ((-arg0 - 11) / 42);
            this.field5409 = arg1;
            this.method2360(0);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 18)
    public static final void method2354(int arg0) {
        if (arg0 != -6331) {
            return;
        }
        field5407++;
        if (class506.field6334 != null) {
            class506.field6334.method1756(false);
        }
        if (class502.field6253 != null) {
            class502.field6253.method1756(false);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V", line = 35)
    public final void method2355(int arg0, int arg1) {
        field5414++;
        class208 var3 = this.field5411;
        synchronized (this.field5411) {
            this.field5411.method1222(14564, arg1);
            if (arg0 != 0) {
                this.method2357(-59, 34);
            }
        }
        class208 var4 = this.field5420;
        synchronized (this.field5420) {
            this.field5420.method1222(14564, arg1);
        }
        class208 var5 = this.field5421;
        synchronized (this.field5421) {
            this.field5421.method1222(14564, arg1);
        }
        class208 var6 = this.field5422;
        synchronized (this.field5422) {
            this.field5422.method1222(arg0 + 14564, arg1);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V", line = 63)
    public final void method2356(int arg0) {
        field5419++;
        class208 var2 = this.field5411;
        synchronized (this.field5411) {
            this.field5411.method1224(false);
        }
        class208 var3 = this.field5420;
        synchronized (this.field5420) {
            this.field5420.method1224(false);
        }
        class208 var4 = this.field5421;
        synchronized (this.field5421) {
            this.field5421.method1224(false);
        }
        if (arg0 != -1) {
            this.field5421 = null;
        }
        class208 var5 = this.field5422;
        synchronized (this.field5422) {
            this.field5422.method1224(false);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)V", line = 89)
    public final void method2357(int arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field5413++;
        this.field5423 = arg0;
        class208 var3 = this.field5420;
        synchronized (this.field5420) {
            this.field5420.method1218(117);
        }
        class208 var4 = this.field5421;
        synchronized (this.field5421) {
            this.field5421.method1218(103);
        }
        class208 var5 = this.field5422;
        synchronized (this.field5422) {
            this.field5422.method1218(118);
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(II)Lpg;", line = 109)
    public final class687 method2358(int arg0, int arg1) {
        field5406++;
        class208 var3 = this.field5411;
        class687 var4;
        synchronized (this.field5411) {
            var4 = (class687) this.field5411.method1221((long) arg1, true);
        }
        if (arg0 != 0) {
            this.field5409 = true;
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field5408;
        byte[] var6;
        synchronized (this.field5408) {
            var6 = this.field5408.method1659(-106, class539.method2897(arg1, (byte) -57), class397.method2248((byte) -76, arg1));
        }
        class687 var7 = new class687();
        var7.field9394 = this;
        var7.field9408 = arg1;
        if (var6 != null) {
            var7.method3797((byte) 111, new class572(var6));
        }
        var7.method3787(80);
        if (var7.field9448) {
            var7.field9426 = 0;
            var7.field9378 = false;
        }
        if (!this.field5412 && var7.field9456) {
            var7.field9447 = null;
            var7.field9412 = null;
        }
        class208 var8 = this.field5411;
        synchronized (this.field5411) {
            this.field5411.method1230((byte) 18, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)V", line = 158)
    public final void method2359(int arg0, byte arg1) {
        field5418++;
        if (arg1 != 86) {
            this.field5421 = null;
        }
        this.field5411 = new class208(arg0);
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V", line = 177)
    public final void method2360(int arg0) {
        class208 var2 = this.field5411;
        synchronized (this.field5411) {
            this.field5411.method1218(arg0 + 111);
        }
        field5417++;
        class208 var3 = this.field5420;
        synchronized (this.field5420) {
            this.field5420.method1218(113);
        }
        class208 var4 = this.field5421;
        synchronized (this.field5421) {
            this.field5421.method1218(107);
        }
        class208 var5 = this.field5422;
        synchronized (this.field5422) {
            this.field5422.method1218(93);
            if (arg0 != 0) {
                field5410 = null;
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lbs;IZLpfa;Lpfa;)V", line = 289)
    public class428(class643 arg0, int arg1, boolean arg2, class275 arg3, class275 arg4) {
        this.field5412 = arg2;
        this.field5415 = arg4;
        this.field5408 = arg3;
        if (this.field5408 != null) {
            int var6 = this.field5408.method1642(95) - 1;
            this.field5408.method1655(var6, (byte) -82);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZZ)V", line = 203)
    public final void method2361(boolean arg0, boolean arg1) {
        field5405++;
        if (this.field5412 == arg1) {
            return;
        }
        this.field5412 = arg1;
        if (arg0) {
            this.field5415 = null;
        }
        this.method2360(0);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;ILjaa;I)Lhr;", line = 222)
    public static final class491 method2362(String arg0, int arg1, class576 arg2, int arg3) {
        field5416++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceARB(var4, arg0);
        if (arg1 != 35716) {
            return null;
        }
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class325.field4055, 0);
        if (class325.field4055[0] == 0) {
            if (class325.field4055[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class325.field4055, 1);
            if (class325.field4055[1] > 1) {
                byte[] var6 = new byte[class325.field4055[1]];
                OpenGL.glGetInfoLogARB(var4, class325.field4055[1], class325.field4055, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class325.field4055[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class491(arg2, var4, arg3);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V", line = 266)
    public static void method2363(boolean arg0) {
        if (!arg0) {
            field5404 = -97;
        }
        field5410 = null;
    }
}
