import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class543 extends class190 {

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "Z")
    private boolean field7741 = false;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "Liw;")
    private class607 field7745;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7746 = new BigInteger("8dd59f4da833305e3f0694e334b23ba5b09a56192f1ba944cafc3e8bf06ab66ebac419634553c8fb6cf191ee81ad9a8a7947794d4b48a1f6fcde8538f9f4f559828d71dc5bd07710f22e48db82bba3ccf0692bb41707d0c589903611b7ebf9f42e93566ec9f60df711102c4c60bc897ce2ad6dba5658cefaf47eb787f65d75dc18b4e5ded0d64d32fa0f740bd8a8045dc98f50c5757b7f741473dfd877280f4f92c1187d640b2406227cab82bcc6e0b0975236970caff7f563b4226b57de6826fe50439c9af42c6cb367d14a70e0e297acd59222bfd966d3c7b77a35d9ca9ba46d46759e7c6361e820e290d1a7dac0bc60d9762d9b0a016fa8baa81b39e9df75cbebf89af679d01daaa457c558e99fceafa7731a96657ef714cdc1c89ce560bdc6392095f8dbf90a16eabd6188ce653d8e05831447bea41f4e73d49f6604dc5a044f59ef234d9d94ccd9b4b610a6a013dfcf06d7e93c2dcfc50b97c2fd1f6a856049d75e757e67637c21fd9310d893c3bb172fa2b47ed193693099c8c36661ae22a481674e48bea2ad7e05b9c637b75788e6d84d25a4586eb9f3bd49616df28c3702673eac97f869e4e467e5ac66c22cb699bc31e22389f772099908eee380a4d883adce8c300c151579f3d2e87ab612fbe71576b6085a576f8b929ff549155f3f3d366e58f74f4bac3eaf7575bf49af53229e1ca2f4fd0f548924414ba5002d", 16);

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "Ljava/lang/String;")
    public static String field7750 = null;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field7737;

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field7743;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "Lce;")
    public static class421 field7748;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "Lld;")
    public static class43 field7749;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIB)V", line = 3)
    public final void method914(int arg0, int arg1, byte arg2) {
        if (arg2 == -122) {
            ++field7743;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILnba;I)V", line = 16)
    public final void method911(int arg0, class487 arg1, int arg2) {
        ++field7738;
        super.field3195.method1306(arg1, arg2 ^ 79);
        super.field3195.method1334(arg2, arg0);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 25)
    public static final void method3175(byte arg0) {
        ++field7747;
        class52.field834.method3682(true);
        int var1 = 81 / ((-20 - arg0) / 47);
        class390.method2438(0);
        class624.field8742.field4534 = 0;
        class340.field4998 = null;
        class424.field6233 = null;
        class263.field4081 = null;
        class152.field2373 = 0;
        class618.field8707 = 0;
        class705.method3913(0);
        class206.field3454 = null;
        class755.field10522 = 0;
        class380.field5708 = 0;
        class468.field6818 = 0;
        class594.field8345 = null;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V", line = 52)
    public static void method3176(int arg0) {
        field7748 = null;
        field7750 = null;
        if (arg0 == -29569) {
            field7746 = null;
            field7749 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lrs;)V", line = 109)
    public class543(class166 arg0) {
        super(arg0);
        if (arg0.field2848) {
            this.field7745 = new class607(arg0, 2);
            this.field7745.method3481(-126, 0);
            super.field3195.method1298(1, (byte) -124);
            super.field3195.method1256(7681, -4, 34165);
            super.field3195.method1239(2, 34168, 768, 770);
            super.field3195.method1264(34167, 2, 0, 770);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field3195.method1298(0, (byte) -124);
            this.field7745.method3479((byte) -51);
            this.field7745.method3481(17, 1);
            super.field3195.method1298(1, (byte) -124);
            super.field3195.method1256(8448, -4, 8448);
            super.field3195.method1239(2, 34166, 768, 770);
            super.field3195.method1264(5890, 2, 0, 770);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field3195.method1298(0, (byte) -124);
            this.field7745.method3479((byte) 117);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V", line = 70)
    public final void method909(int arg0, boolean arg1) {
        super.field3195.method1256(7681, arg0 ^ -16450, 8448);
        ++field7742;
        if (arg0 != 16450) {
            this.method915(true, 2);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZI)V", line = 81)
    public final void method915(boolean arg0, int arg1) {
        if (arg1 != 0) {
            field7749 = null;
        }
        ++field7739;
        class708 var3 = super.field3195.method1332(arg1 + 14414);
        if (this.field7745 != null && var3 != null && arg0) {
            this.field7745.method3477((byte) 21, '\u0000');
            super.field3195.method1298(1, (byte) -124);
            super.field3195.method1306(var3, 80);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3195.field2791.method1370(false), 0);
            OpenGL.glMatrixMode(5888);
            super.field3195.method1298(0, (byte) -124);
            this.field7741 = true;
        } else {
            super.field3195.method1264(34168, arg1 ^ 2, 0, 770);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V", line = 148)
    public final void method910(boolean arg0) {
        if (this.field7741) {
            this.field7745.method3477((byte) 78, '\u0001');
            super.field3195.method1298(1, (byte) -124);
            super.field3195.method1306((class487) null, 117);
            super.field3195.method1298(0, (byte) -124);
        } else {
            super.field3195.method1264(5890, 2, 0, 770);
        }
        ++field7740;
        super.field3195.method1256(8448, -4, 8448);
        this.field7741 = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)Z", line = 167)
    public final boolean method908(int arg0) {
        if (arg0 <= 37) {
            return true;
        } else {
            ++field7744;
            return true;
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V", line = 179)
    public static final void method3177(int arg0) {
        class702.field9934 = null;
        class384.field5756 = null;
        class685.field9688 = null;
        class625.field8763 = null;
        class357.field5400 = false;
        class717.field10055 = null;
        if (arg0 != 9999) {
            field7749 = null;
        }
        ++field7737;
    }
}
