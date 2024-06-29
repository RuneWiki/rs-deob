import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class606 {

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "[I")
    public int[] field7949 = new int[257];

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "[[I")
    public int[][] field7955 = new int[6][258];

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "[[I")
    public int[][] field7957 = new int[6][258];

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "[Z")
    public boolean[] field7959 = new boolean[256];

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "[I")
    public int[] field7956 = new int[256];

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "[[I")
    public int[][] field7958 = new int[6][258];

    @OriginalMember(owner = "client!ou", name = "v", descriptor = "[Z")
    public boolean[] field7970 = new boolean[16];

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
    public int field7954 = 0;

    @OriginalMember(owner = "client!ou", name = "B", descriptor = "[B")
    public byte[] field7976 = new byte[18002];

    @OriginalMember(owner = "client!ou", name = "D", descriptor = "[[B")
    public byte[][] field7978 = new byte[6][258];

    @OriginalMember(owner = "client!ou", name = "z", descriptor = "[B")
    public byte[] field7974 = new byte[4096];

    @OriginalMember(owner = "client!ou", name = "G", descriptor = "I")
    public int field7981 = 0;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "[I")
    public int[] field7965 = new int[16];

    @OriginalMember(owner = "client!ou", name = "I", descriptor = "[I")
    public int[] field7982 = new int[6];

    @OriginalMember(owner = "client!ou", name = "C", descriptor = "[B")
    public byte[] field7977 = new byte[256];

    @OriginalMember(owner = "client!ou", name = "K", descriptor = "[B")
    public byte[] field7984 = new byte[18002];

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "Lel;")
    public static class548 field7951 = new class548("RC", 1);

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "B")
    public byte field7952;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public int field7950;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
    public int field7953;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "I")
    public int field7960;

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "I")
    public int field7961;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "I")
    public int field7962;

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "I")
    public int field7963;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "I")
    public int field7964;

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "I")
    public int field7966;

    @OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!ou", name = "t", descriptor = "I")
    public int field7968;

    @OriginalMember(owner = "client!ou", name = "u", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!ou", name = "w", descriptor = "I")
    public int field7971;

    @OriginalMember(owner = "client!ou", name = "A", descriptor = "I")
    public int field7975;

    @OriginalMember(owner = "client!ou", name = "E", descriptor = "I")
    public int field7979;

    @OriginalMember(owner = "client!ou", name = "F", descriptor = "I")
    public int field7980;

    @OriginalMember(owner = "client!ou", name = "x", descriptor = "Lwu;")
    public static class376 field7972;

    @OriginalMember(owner = "client!ou", name = "y", descriptor = "[B")
    public byte[] field7973;

    @OriginalMember(owner = "client!ou", name = "J", descriptor = "[B")
    public byte[] field7983;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
    public static final void method3293(int arg0) {
        if (class260.field3626 != null) {
            try {
                class260.field3626.close();
            } catch (IOException var1) {
            }
        }
        field7969++;
        class260.field3626 = null;
        if (arg0 != -28975) {
            field7951 = null;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(III)Z")
    public static final boolean method3294(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method3295(-2);
        }
        field7967++;
        return (arg0 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
    public static void method3295(int arg0) {
        if (arg0 <= 39) {
            method3293(111);
        }
        field7951 = null;
        field7972 = null;
    }
}
