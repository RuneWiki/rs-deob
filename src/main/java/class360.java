import jaclib.memory.Buffer;
import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public abstract class class360 {

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    private int field4604;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "Lnv;")
    public class417 field4602;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    private int field4603;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "Z")
    private boolean field4605;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public int field4607;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Lse;")
    public static class256 field4606 = new class256(14, 0);

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "Lse;")
    public static class256 field4608 = new class256(15, 4);

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "Lse;")
    public static class256 field4609 = new class256(16, -2);

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "Lse;")
    public static class256 field4610 = new class256(17, 0);

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "Lse;")
    public static class256 field4611 = new class256(18, -2);

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "Lse;")
    public static class256 field4612 = new class256(19, -2);

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "Lse;")
    public static class256 field4613 = new class256(20, 6);

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "Lse;")
    public static class256 field4614 = new class256(21, 9);

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "Lse;")
    public static class256 field4615 = new class256(22, -2);

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "Lse;")
    public static class256 field4616 = new class256(23, 4);

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "Lse;")
    public static class256 field4617 = new class256(24, -1);

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "Lse;")
    public static class256 field4618 = new class256(26, 0);

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "Lse;")
    public static class256 field4619 = new class256(27, 0);

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "Lse;")
    public static class256 field4620 = new class256(28, -2);

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "[Lse;")
    private static class256[] field4621 = new class256[32];

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "[I")
    public static int[] field4623;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "Lbga;")
    public static class356 field4624;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "Ldh;")
    public static class320 field4625;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4626;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field4601;

    static {
        class256[] var0 = class724.method4033((byte) 4);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field4621[var0[var1].field3126] = var0[var1];
        }
        field4622 = 0;
        field4623 = new int[1000];
        field4624 = new class356();
        field4625 = new class320(36, -1);
        field4626 = new BigInteger("10001", 16);
    }

    @OriginalMember(owner = "client!eh", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        field4600++;
        this.field4602.method2583(this.field4603, this.field4607, -125);
        super.finalize();
    }

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)V", line = 17)
    public static void method2117(int arg0) {
        field4624 = null;
        field4623 = null;
        field4616 = null;
        field4615 = null;
        field4620 = null;
        field4619 = null;
        field4621 = null;
        field4608 = null;
        field4613 = null;
        field4606 = null;
        field4626 = null;
        field4617 = null;
        field4611 = null;
        field4618 = null;
        if (arg0 <= 86) {
            return;
        }
        field4614 = null;
        field4609 = null;
        field4612 = null;
        field4610 = null;
        field4625 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[BI)V", line = 46)
    public final void method2118(int arg0, byte[] arg1, int arg2) {
        this.method18(1);
        field4601++;
        if (arg2 > this.field4603) {
            OpenGL.glBufferDataARBub(this.field4604, arg2, arg1, 0, this.field4605 ? 35040 : 35044);
            this.field4602.field5932 += arg2 - this.field4603;
            this.field4603 = arg2;
        } else {
            OpenGL.glBufferSubDataARBub(this.field4604, 0, arg2, arg1, 0);
        }
        if (arg0 != 35040) {
            field4620 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lnv;I[BIZ)V", line = 84)
    public class360(class417 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field4604 = arg1;
        this.field4602 = arg0;
        this.field4603 = arg3;
        this.field4605 = arg4;
        OpenGL.glGenBuffersARB(1, class327.field4246, 0);
        this.field4607 = class327.field4246[0];
        this.method18(1);
        OpenGL.glBufferDataARBub(arg1, this.field4603, arg2, 0, this.field4605 ? 35040 : 35044);
        this.field4602.field5932 += this.field4603;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lnv;ILjaclib/memory/Buffer;IZ)V", line = 103)
    public class360(class417 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field4604 = arg1;
        this.field4602 = arg0;
        this.field4603 = arg3;
        this.field4605 = arg4;
        OpenGL.glGenBuffersARB(1, class327.field4246, 0);
        this.field4607 = class327.field4246[0];
        this.method18(1);
        OpenGL.glBufferDataARBa(arg1, this.field4603, arg2.getAddress(), this.field4605 ? 35040 : 35044);
        this.field4602.field5932 += this.field4603;
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V")
    public abstract void method18(int arg0);
}
