import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class9 extends class125 {

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "[I")
    public int[] field66 = new int[] { -1 };

    @OriginalMember(owner = "client!ig", name = "y", descriptor = "[I")
    public int[] field69 = new int[1];

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "Ljava/util/Random;")
    public static Random field68 = new Random();

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "Z")
    public static boolean field73 = false;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
    public static int field75 = -1;

    @OriginalMember(owner = "client!ig", name = "z", descriptor = "I")
    public static int field70 = 50;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "Loa;")
    public static class99 field76 = class221.method1463(2844, "null");

    @OriginalMember(owner = "client!ig", name = "B", descriptor = "La;")
    public static class48 field72 = new class48(0, 0);

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "Loa;")
    private static class99 field78 = class221.method1463(2844, "Loaded textures");

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "Loa;")
    public static class99 field79 = class221.method1463(2844, "Weiter");

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
    public static int field81 = 0;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "Loa;")
    public static class99 field80 = class221.method1463(2844, "hint_headicons");

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "Loa;")
    public static class99 field82 = field78;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ig", name = "A", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "Ltg;")
    public static class182 field74;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "Z")
    public static boolean field77;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "([BB)[B")
    public static final byte[] method66(byte[] arg0, byte arg1) {
        field67++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        int var4 = -36 / ((-arg1 - 32) / 51);
        class241.method1568(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)V")
    public static void method67(boolean arg0) {
        field79 = null;
        field82 = null;
        field68 = null;
        field80 = null;
        if (!arg0) {
            method67(false);
        }
        field72 = null;
        field76 = null;
        field78 = null;
        field74 = null;
    }
}
