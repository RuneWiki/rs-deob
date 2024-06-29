import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public abstract class class237 extends class198 {

    @OriginalMember(owner = "client!lba", name = "m", descriptor = "Z")
    public boolean field3466;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "B")
    public byte field3457;

    @OriginalMember(owner = "client!lba", name = "p", descriptor = "S")
    public short field3469;

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "S")
    public short field3462;

    @OriginalMember(owner = "client!lba", name = "s", descriptor = "S")
    public short field3472;

    @OriginalMember(owner = "client!lba", name = "j", descriptor = "I")
    public int field3463;

    @OriginalMember(owner = "client!lba", name = "n", descriptor = "B")
    public byte field3467;

    @OriginalMember(owner = "client!lba", name = "k", descriptor = "I")
    public int field3464;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "S")
    public short field3459;

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "I")
    public int field3460;

    @OriginalMember(owner = "client!lba", name = "o", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3468 = new CRC32();

    @OriginalMember(owner = "client!lba", name = "r", descriptor = "Lnj;")
    public static class487 field3471 = new class487("Loaded shaders", "Shaders geladen", "Nuanceurs chargés", "Sombreamento carregado");

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!lba", name = "l", descriptor = "I")
    public int field3465;

    @OriginalMember(owner = "client!lba", name = "q", descriptor = "Lm;")
    public static class105 field3470;

    @OriginalMember(owner = "client!lba", name = "t", descriptor = "[[[B")
    public static byte[][][] field3473;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "(B)V")
    public void method504(byte arg0) {
        if (arg0 != -126) {
            method1528(127, -41, -114, (byte) -57, null, -8, -64, 95, 55, 118, 8, 41, null);
        }
        field3461++;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIBLqa;IIIIIII[[[B)V")
    public static final void method1528(int arg0, int arg1, int arg2, byte arg3, class167 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, byte[][][] arg12) {
        field3458++;
        if (arg6 == 0 || arg8 == 0) {
            return;
        }
        if (arg6 == 9) {
            arg1 = arg1 + 1 & 0x3;
            arg6 = 1;
        }
        int var13 = -103 / ((arg3 - 60) / 41);
        if (arg6 == 10) {
            arg6 = 1;
            arg1 = arg1 + 3 & 0x3;
        }
        if (arg6 == 11) {
            arg6 = 8;
            arg1 = arg1 + 3 & 0x3;
        }
        arg4.method1011(arg2, arg9, arg5, arg7, arg0, arg11, arg12[arg6 - 1][arg1], arg8, arg10);
    }

    @OriginalMember(owner = "client!lba", name = "e", descriptor = "(I)I")
    public abstract int method159(int arg0);

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "(I)V")
    public static void method1529(int arg0) {
        field3468 = null;
        field3471 = null;
        if (arg0 != -19540) {
            method1529(86);
        }
        field3470 = null;
        field3473 = null;
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(IIIIIIIIZB)V")
    public class237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field3466 = arg8;
        this.field3457 = (byte) arg0;
        this.field3469 = (short) arg4;
        this.field3462 = (short) arg7;
        this.field3472 = (short) arg6;
        this.field3463 = arg3;
        this.field3467 = arg9;
        this.field3464 = arg1;
        this.field3459 = (short) arg5;
        this.field3460 = arg2;
    }
}
