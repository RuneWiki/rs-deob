import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class58 extends class209 {

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    private int field760 = 0;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    private int field769 = -1;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    private int field758;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Lej;")
    public static class204 field761 = new class204(64);

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public static int field765 = 0;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "Z")
    public static boolean field764 = false;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "Luf;")
    public static class168 field771 = class148.method1019(-1720, "titlebg");

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "Luf;")
    private static class168 field766 = class148.method1019(-1720, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "Luf;")
    public static class168 field773 = field766;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "Lfj;")
    public static class283 field768;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "[S")
    public static short[] field772;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "[[[I")
    public static int[][][] field767;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)V", line = 7)
    public static final void method326(byte arg0) {
        if (arg0 != 104) {
            method326((byte) -125);
        }
        field774++;
        class144.field2218.method1431((byte) 123);
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V", line = 18)
    public static void method327(int arg0) {
        field768 = null;
        field771 = null;
        if (arg0 != 30455) {
            method328(false, false, -118);
        }
        field761 = null;
        field766 = null;
        field772 = null;
        field767 = (int[][][]) null;
        field773 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZZI)Luf;", line = 35)
    public static final class168 method328(boolean arg0, boolean arg1, int arg2) {
        field757++;
        return arg0 ? class272.method1878(arg2, arg1, -1, 10) : (class168) null;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V", line = 55)
    public final void method329(int arg0) {
        field762++;
        int var2 = class83.method559(0);
        if ((var2 & 0x1) == 0) {
            class90.method617(this.field769);
        }
        if ((var2 & 0x2) == 0) {
            class90.method609(0);
        }
        if ((var2 & 0x4) == 0) {
            class90.method615(0);
        }
        int var3 = -51 / ((arg0 - 5) / 61);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V", line = 77)
    public static final void method330(boolean arg0) {
        field763++;
        while (class166.field2671.method717(11154, class110.field1726) >= 27) {
            int var1 = class166.field2671.method728(15, 20544);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class190.field3065[var1] == null) {
                class190.field3065[var1] = new class22();
                var2 = true;
            }
            class22 var3 = class190.field3065[var1];
            class116.field1814[class2.field15++] = var1;
            var3.field3011 = class203.field3335;
            int var4 = class166.field2671.method728(5, 20544);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class166.field2671.method728(1, 20544);
            if (var5 == 1) {
                class12.field136[class9.field120++] = var1;
            }
            int var6 = class166.field2671.method728(1, 20544);
            int var7 = class166.field2671.method728(5, 20544);
            var3.field267 = class19.method87((byte) -54, class166.field2671.method728(14, 20544));
            int var8 = class65.field864[class166.field2671.method728(3, 20544)];
            var3.field3046 = var3.field267.field3250;
            var3.field3056 = var3.field267.field3248;
            var3.field2996 = var3.field267.field3218;
            var3.field3052 = var3.field267.field3198;
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.field3024 = var3.field267.field3222;
            var3.field3002 = var3.field267.field3230;
            var3.field3038 = var3.field267.field3200;
            var3.field3049 = var3.field267.field3173;
            var3.field3012 = var3.field267.field3211;
            if (var2) {
                var3.field3037 = var3.field3008 = var8;
            }
            if (var3.field3052 == 0) {
                var3.field3008 = 0;
            }
            var3.method1334(var6 == 1, class266.field4489.field3020[0] + var7, (byte) -104, class266.field4489.field3033[0] + var4);
            if (var3.field267.method1384((byte) 99)) {
                class297.method2036((class161) null, class79.field1127, 0, var3.field3020[0], var3, (class54) null, var3.field3033[0], true);
            }
        }
        if (arg0) {
            class166.field2671.method716((byte) -61);
        }
    }

    @OriginalMember(owner = "client!ec", name = "finalize", descriptor = "()V", line = 156)
    protected final void finalize() throws Throwable {
        field770++;
        if (this.field769 != -1) {
            class7.method26(this.field769, this.field760, this.field758);
            this.field769 = -1;
            this.field760 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I)V", line = 213)
    public class58(int arg0) {
        GL var2 = class90.field1390;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field758 = class7.field91;
        this.field769 = var3[0];
        class90.method617(this.field769);
        int var4 = class173.field2822[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class7.field89 += var6.limit() - this.field760;
        this.field760 = var6.limit();
    }
}
