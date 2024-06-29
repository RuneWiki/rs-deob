import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class594 extends class13 {

    @OriginalMember(owner = "client!et", name = "H", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field8131 = new BigInteger("c88e80e2341a1d30e6dc4c5665a6e1c8b2e9d5b2380aa4bde34378d2c8a575bd47b17d6aaa56b365d411f60440764a0d0b44b55acdddd53b2fa17b7fbcdbe2756c0218419880392addf93f1ca3d24f8c65bf88a5a99e54bc07a0a94dc4fb95aafbdcdc886aa2f9c13202a81ae64b5bc969d4076536982adbdbe5f104b34cde5c3de403ef6950d88a952b37c218e0c2560027b40e4729076205c3486416ce4aea1cade4b660f1698ec76164ab7d611827e6d920a63c8b78d3ff6e45e9eea2d5fbb24988330204c003af4b061f24c1b415dcad503e7283311ee2045501e49b1bab75f3d5f9316dd9cfcfd8ad3d87907c910959e3b40ba664ef60929a0b4ac33033478d0f15d96983a5f8ac876047ac7e851c478807707d0480808c269f69f3fc570e2051dc8651dd9cfede9b6dc1bb182d8273e969bef49c14a74bbd7ecb743819468e01a1e08419e2654d7a51c1371d65918b97b8d9931cbaa8011027bf4927ac4b5ea533e47652f1e706af0b3a8aafc3842bc4be87e0622a829cadb62a6457bd5609ea7435a85ab2e88a4c92914291c6e47669effdff7289ac66aadfe870b1cd578e8b8bfd1c8c8ac3276c59399a83960b2bf0c46f6f529455dc32153e59e08d7f30a59b64f896a4b087329c59a7507f22b9ecdfef44467e272ad4b4ea91e1cfbebef0f197055514c1789466f6bb7a9a20fed9d65204b033b9adb16a46532505", 16);

    @OriginalMember(owner = "client!et", name = "w", descriptor = "I")
    public static int field8120;

    @OriginalMember(owner = "client!et", name = "x", descriptor = "I")
    public static int field8121;

    @OriginalMember(owner = "client!et", name = "y", descriptor = "I")
    public static int field8122;

    @OriginalMember(owner = "client!et", name = "z", descriptor = "I")
    public static int field8123;

    @OriginalMember(owner = "client!et", name = "A", descriptor = "I")
    public int field8124;

    @OriginalMember(owner = "client!et", name = "B", descriptor = "I")
    public int field8125;

    @OriginalMember(owner = "client!et", name = "C", descriptor = "I")
    public int field8126;

    @OriginalMember(owner = "client!et", name = "D", descriptor = "I")
    public static int field8127;

    @OriginalMember(owner = "client!et", name = "F", descriptor = "I")
    public static int field8129;

    @OriginalMember(owner = "client!et", name = "G", descriptor = "I")
    public static int field8130;

    @OriginalMember(owner = "client!et", name = "L", descriptor = "Ljj;")
    public static class120 field8134;

    @OriginalMember(owner = "client!et", name = "J", descriptor = "Lmi;")
    public static class496 field8132;

    @OriginalMember(owner = "client!et", name = "K", descriptor = "Lmi;")
    public static class496 field8133;

    @OriginalMember(owner = "client!et", name = "E", descriptor = "Ljava/lang/String;")
    public String field8128;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(Z)I")
    public final int method3377(boolean arg0) {
        ++field8120;
        if (!arg0) {
            this.method3380(-60);
        }
        return (int) (super.field5204 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
    public final void method3378(int arg0) {
        super.field235 |= Long.MIN_VALUE;
        ++field8127;
        if (this.method3382((byte) -89) == 0L) {
            class376.field5331.method2338(true, this);
        }
        if (arg0 != -25490) {
            field8133 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(I)V")
    public static void method3379(int arg0) {
        if (arg0 > -49) {
            method3379(49);
        }
        field8134 = null;
        field8132 = null;
        field8133 = null;
        field8131 = null;
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(I)I")
    public final int method3380(int arg0) {
        if (arg0 != 1) {
            return -110;
        } else {
            ++field8121;
            return (int) super.field5204;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IILqo;Ljava/lang/String;)Ltba;")
    public static final class164 method3381(int arg0, int arg1, class22 arg2, String arg3) {
        ++field8130;
        int var4 = -89 / ((29 - arg1) / 47);
        long var5 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceARB(var5, arg3);
        OpenGL.glCompileShaderARB(var5);
        OpenGL.glGetObjectParameterivARB(var5, 35713, class500.field6988, 0);
        if (~class500.field6988[0] == -1) {
            if (class500.field6988[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var5, 35716, class500.field6988, 1);
            if (~class500.field6988[1] < -2) {
                byte[] var7 = new byte[class500.field6988[1]];
                OpenGL.glGetInfoLogARB(var5, class500.field6988[1], class500.field6988, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (~class500.field6988[0] == -1) {
                OpenGL.glDeleteObjectARB(var5);
                return null;
            }
        }
        return new class164(arg2, var5, arg0);
    }

    @OriginalMember(owner = "client!et", name = "e", descriptor = "(B)J")
    public final long method3382(byte arg0) {
        ++field8123;
        if (arg0 >= -37) {
            this.method3382((byte) 79);
        }
        return super.field235 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(II)V")
    public class594(int arg0, int arg1) {
        super.field5204 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!et", name = "f", descriptor = "(I)V")
    public final void method3383(int arg0) {
        ++field8122;
        super.field235 = Long.MIN_VALUE & super.field235 | class554.method3190(-120) + 500L;
        class704.field9498.method2338(true, this);
        if (arg0 != -16058) {
            field8132 = null;
        }
    }
}
