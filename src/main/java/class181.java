import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class181 implements class37 {

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "Lar;")
    private class667 field2484;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "Luu;")
    private class237 field2488;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "Luu;")
    private class237 field2490;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Lda;")
    private class402 field2487;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BIILbda;)J")
    public static final long method1142(byte arg0, int arg1, int arg2, class722 arg3) {
        field2482++;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class220 var8 = class20.field192.method716(6, arg3.method782((byte) -90));
        if (arg0 >= -59) {
            method1143(-127, null, 105, null);
        }
        long var9 = (long) (arg3.method784(-4532) | 0x10000 << 14 | arg1 | arg2 << 7 | arg3.method794(96) << 20);
        if (var8.field2948 == 0) {
            var9 |= var6;
        }
        if (var8.field2932 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg3.method782((byte) -71) << 32;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I[BILhj;)Lws;")
    public static final class696 method1143(int arg0, byte[] arg1, int arg2, class47 arg3) {
        field2483++;
        if (arg1 == null || arg1.length == 0) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceRawARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        if (arg2 != Integer.MAX_VALUE) {
            method1143(-36, null, 69, null);
        }
        OpenGL.glGetObjectParameterivARB(var4, 35713, class111.field1489, 0);
        if (class111.field1489[0] == 0) {
            if (class111.field1489[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class111.field1489, 1);
            if (class111.field1489[1] > 1) {
                byte[] var6 = new byte[class111.field1489[1]];
                OpenGL.glGetInfoLogARB(var4, class111.field1489[1], class111.field1489, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class111.field1489[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class696(arg3, var4, arg0);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)I")
    public static final int method1144(int arg0, int arg1, int arg2) {
        field2489++;
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 ^ var3 << 13;
        if (arg0 == -24140) {
            int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return (var5 & 0x7F85C93) >> 19;
        } else {
            return -51;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public final void method200(int arg0) {
        field2486++;
        class179 var2 = class363.method2306(this.field2484.field9211, this.field2490, (byte) 115);
        if (arg0 <= 12) {
            method1142((byte) -125, 72, -56, null);
        }
        this.field2487 = class129.field1802.method1392(var2, class52.method384(this.field2488, this.field2484.field9211), true);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BZ)V")
    public final void method201(byte arg0, boolean arg1) {
        field2485++;
        if (arg0 <= -74 && arg1) {
            int var3 = this.field2484.field9199.method3281(false, class732.field10164, this.field2484.field9203) + this.field2484.field9194;
            int var4 = this.field2484.field9212.method779(this.field2484.field9220, class84.field1195, 14) + this.field2484.field9213;
            this.field2487.method2503(this.field2484.field9218, this.field2484.field9208, this.field2484.field9206, this.field2484.field9210, null, this.field2484.field9220, null, var3, this.field2484.field9200, 0, 0, this.field2484.field9203, null, this.field2484.field9215, var4, 0);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Z")
    public final boolean method202(byte arg0) {
        field2481++;
        boolean var2 = true;
        if (!this.field2488.method1578(this.field2484.field9211, (byte) -81)) {
            var2 = false;
        }
        if (arg0 >= -46) {
            method1142((byte) -128, 101, -71, null);
        }
        if (!this.field2490.method1578(this.field2484.field9211, (byte) -81)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Luu;Luu;Lar;)V")
    public class181(class237 arg0, class237 arg1, class667 arg2) {
        this.field2484 = arg2;
        this.field2488 = arg0;
        this.field2490 = arg1;
    }
}
