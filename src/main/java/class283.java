import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class283 extends class138 {

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    private int field4669 = 0;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    private int field4670 = -1;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    private int field4682;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public static int field4672 = -1;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "Lck;")
    public static class119 field4673 = null;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "[I")
    public static int[] field4680 = new int[200];

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "Lck;")
    private static class119 field4681 = class298.method1987((byte) 33, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "Lck;")
    public static class119 field4671 = field4681;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "I")
    public static int field4684 = 0;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "Lck;")
    public static class119 field4677 = class298.method1987((byte) 47, "gdi generic");

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "Lwi;")
    public static class23 field4678;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "[[[B")
    public static byte[][][] field4674;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "[[[I")
    public static int[][][] field4686;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V", line = 14)
    public static void method1883(int arg0) {
        if (arg0 >= -32) {
            method1884(-117, true, -125);
        }
        field4686 = (int[][][]) null;
        field4673 = null;
        field4677 = null;
        field4678 = null;
        field4671 = null;
        field4681 = null;
        field4680 = null;
        field4674 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!mg", name = "finalize", descriptor = "()V", line = 32)
    protected final void finalize() throws Throwable {
        if (this.field4670 != -1) {
            class143.method937(this.field4670, this.field4669, this.field4682);
            this.field4670 = -1;
            this.field4669 = 0;
        }
        super.finalize();
        field4679++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZI)I", line = 60)
    public static final int method1884(int arg0, boolean arg1, int arg2) {
        field4675++;
        if (arg0 < arg2) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        if (!arg1) {
            return -3;
        }
        while (arg2 != 0) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V", line = 92)
    public static final void method1885(int arg0) {
        if (class44.field660 != null) {
            class44.field660.method1629(-124);
            class44.field660 = null;
        }
        class181.method1158(0);
        field4685++;
        class57.method427();
        for (int var1 = 0; var1 < 4; var1++) {
            class217.field3510[var1].method1748((byte) -68);
        }
        class234.method1508((byte) 116);
        System.gc();
        class37.method286((byte) -74, 2);
        class250.field4042 = -1;
        class196.field3151 = false;
        class234.method1510(true, -83);
        class36.field540 = false;
        class189.field2995 = 0;
        class30.field421 = 0;
        for (int var2 = 0; var2 < class292.field4857.length; var2++) {
            class292.field4857[var2] = null;
        }
        if (arg0 <= 58) {
            field4676 = 25;
        }
        class233.field3757 = 0;
        class157.field2499 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class23.field346[var3] = null;
            class236.field3793[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class70.field1103[var4] = null;
        }
        class204.method1289(10, 8);
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)V", line = 155)
    public final void method1886(int arg0) {
        field4683++;
        int var2 = class177.method1131(12);
        if ((var2 & 0x1) == 0) {
            class264.method1722(this.field4670);
        }
        if ((var2 & 0x2) == 0) {
            class264.method1719(0);
        }
        if ((var2 & 0x4) == 0) {
            class264.method1720(0);
        }
        if (arg0 != -26592) {
            method1884(-2, false, 95);
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I)V", line = 194)
    public class283(int arg0) {
        int[] var2 = new int[1];
        GL var3 = class264.field4313;
        var3.glGenTextures(1, var2, 0);
        this.field4682 = class143.field2280;
        this.field4670 = var2[0];
        class264.method1722(this.field4670);
        int var4 = class284.field4687[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var3.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var3.glTexParameteri(3553, 10241, 9729);
        var3.glTexParameteri(3553, 10240, 9729);
        class143.field2279 += var6.limit() - this.field4669;
        this.field4669 = var6.limit();
    }
}
