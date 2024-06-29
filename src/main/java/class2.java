import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 extends class61 {

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
    private int field43 = 0;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    private int field35 = -1;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
    private int field37;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "Lfd;")
    public static class243 field34 = new class243(64);

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "Lwm;")
    public static class152 field42 = class157.method1048("Chargement des sprites )2 ", 95);

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "J")
    public static long field40 = 0L;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "I")
    public static int field44 = 0;

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "[I")
    public static int[] field45 = new int[100];

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "Lca;")
    public static class98 field39;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "[[[B")
    public static byte[][][] field41;

    @OriginalMember(owner = "client!pa", name = "finalize", descriptor = "()V", line = 13)
    protected final void finalize() throws Throwable {
        if (this.field35 != -1) {
            class207.method1399(this.field35, this.field43, this.field37);
            this.field35 = -1;
            this.field43 = 0;
        }
        super.finalize();
        field36++;
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V", line = 46)
    public final void method8(int arg0) {
        field33++;
        int var2 = -18 % ((77 - arg0) / 44);
        int var3 = class252.method1739(22566);
        if ((var3 & 0x1) == 0) {
            class217.method1457(this.field35);
        }
        if ((var3 & 0x2) == 0) {
            class217.method1454(0);
        }
        if ((var3 & 0x4) == 0) {
            class217.method1475(0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V", line = 76)
    public static void method9(boolean arg0) {
        field45 = null;
        field34 = null;
        field42 = null;
        if (arg0) {
            field41 = (byte[][][]) ((byte[][][]) null);
        }
        field41 = (byte[][][]) null;
        field39 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLhi;)Lfa;", line = 90)
    public static final class197 method10(byte arg0, class291 arg1) {
        field38++;
        if (arg0 > -27) {
            method10((byte) 53, (class291) null);
        }
        return new class197(arg1.method1986(true), arg1.method1986(true), arg1.method1986(true), arg1.method1986(true), arg1.method1986(true), arg1.method1986(true), arg1.method1986(true), arg1.method1986(true), arg1.method2009((byte) 64), arg1.method2011(-122));
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I)V", line = 109)
    public class2(int arg0) {
        GL var2 = class217.field3551;
        int[] var3 = new int[1];
        var2.glGenTextures(1, var3, 0);
        this.field35 = var3[0];
        this.field37 = class207.field3383;
        class217.method1457(this.field35);
        int var4 = class181.field2885[arg0];
        byte[] var5 = new byte[] { (byte) (var4 >> 16), (byte) (var4 >> 8), (byte) var4, -1 };
        ByteBuffer var6 = ByteBuffer.wrap(var5);
        var2.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, var6);
        var2.glTexParameteri(3553, 10241, 9729);
        var2.glTexParameteri(3553, 10240, 9729);
        class207.field3385 += var6.limit() - this.field43;
        this.field43 = var6.limit();
    }
}
