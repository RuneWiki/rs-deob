import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class428 extends class262 {

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    private int field5762 = -1;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    private int field5768 = -1;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public int field5772;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public int field5759;

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    public int field5763;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "[I")
    public static int[] field5767 = new int[1];

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5771 = new BigInteger("c0c692eabb2632a0878efed7d6cc7f8f9e5cb30fc62307e006e6e01ba58f3988448ac09fbdbd2b197d800be431b9257315014048c1b3c4f480a9c989b8113127f280cae4bd063c32c9d5b6a095b9fe8f3b9c7f7a9e8045c1ed708efa530b848ed638f6607cf1a968b20e4028c88a1cd658fb83ea72665c32b08b609798b49d634cb6bf6603d4b1cb9143a13dd40cd0c2d4e9d34da3648d4bd0487c52fe3c7555ea9227c6d19ec63cf107b7542eff34836f56ad61f55b408cb85e181706aac1e81d49e6316f17ed48527efd37e46e4e1b78d76460c182df0b82e8367476aa8ae8460633893a44d20d9d2413c20cbf2865bed53f4340f0bc30621c8fe092f25cc32acae922236b1ccd2285d2fd8b84c9060339b921931de3ba645b41aa1aa2077ed5acd830eafef296bf6b9e4017b7398fb543c111a0867407b4f7a3c2a5394ba5cc6ee8c12ed7b971dcc2a05d40e170ff2885e5cd7e22b358a4c286507562bc4b28965cf435fa8493251c3fba5767099bd05c4ce2661e2ac917308388bc6af9590f43e3cf2ded6bd6a88061803b60d4f7e77547db89db5759d46ec9fb7ba2da6834efa6ea89d69e7f10e5d560feabfb1a746a3bee5e3c9363bc2eb9f17390b6d52f346c4af8a17889687ea33df49f3ffc95bb24d9135b7606a07628ea01bfe97f698cd25d54466800d0fdddf2956bd5d0384fb522f22322b95e8718b58ade9d35", 16);

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "F")
    public static float field5761;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "Lbda;")
    public static class437 field5770;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "Lf;")
    public static class532 field5766;

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "[I")
    public static int[] field5765;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public final void method395(int arg0) {
        if (arg0 == 33071) {
            OpenGL.glFramebufferTexture3DEXT(this.field5762, this.field5768, super.field3417, 0, 0, 0);
            ++field5760;
            this.field5762 = -1;
            this.field5768 = -1;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIII)V")
    public final void method2420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field5764;
        super.field3422.method2627(61, this);
        OpenGL.glCopyTexSubImage3D(super.field3417, 0, arg0, arg4, arg3, arg7, arg5, arg1, arg6);
        if (arg2 == 4) {
            OpenGL.glFlush();
        }
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)I")
    public static final int method2421(int arg0) {
        ++field5769;
        if (arg0 != -17318) {
            method2421(48);
        }
        if ((double) class672.field9562 == 3.0D) {
            return 37;
        } else if ((double) class672.field9562 == 4.0D) {
            return 50;
        } else if ((double) class672.field9562 == 6.0D) {
            return 75;
        } else {
            return (double) class672.field9562 == 8.0D ? 100 : 200;
        }
    }

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "(I)V")
    public static void method2422(int arg0) {
        if (arg0 != -22775) {
            method2421(-56);
        }
        field5771 = null;
        field5767 = null;
        field5765 = null;
        field5766 = null;
        field5770 = null;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lag;IIII[BI)V")
    public class428(class469 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field5772 = arg4;
        this.field5759 = arg3;
        this.field5763 = arg2;
        super.field3422.method2627(55, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field3417, 0, super.field3413, this.field5763, this.field5759, this.field5772, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1582(122, true);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lag;IIII)V")
    public class428(class469 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field5772 = arg4;
        this.field5759 = arg3;
        this.field5763 = arg2;
        super.field3422.method2627(44, this);
        OpenGL.glTexImage3Dub(super.field3417, 0, super.field3413, this.field5763, this.field5759, this.field5772, 0, class151.method888((byte) -106, super.field3413), 5121, (byte[]) null, 0);
        this.method1582(125, true);
    }
}
