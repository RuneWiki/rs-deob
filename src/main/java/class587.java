import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class587 {

    @OriginalMember(owner = "client!id", name = "e", descriptor = "[I")
    public int[] field8197 = new int[257];

    @OriginalMember(owner = "client!id", name = "n", descriptor = "[B")
    public byte[] field8206 = new byte[256];

    @OriginalMember(owner = "client!id", name = "r", descriptor = "[I")
    public int[] field8210 = new int[16];

    @OriginalMember(owner = "client!id", name = "w", descriptor = "[[I")
    public int[][] field8215 = new int[6][258];

    @OriginalMember(owner = "client!id", name = "g", descriptor = "[I")
    public int[] field8199 = new int[256];

    @OriginalMember(owner = "client!id", name = "f", descriptor = "[Z")
    public boolean[] field8198 = new boolean[16];

    @OriginalMember(owner = "client!id", name = "x", descriptor = "[Z")
    public boolean[] field8216 = new boolean[256];

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public int field8195 = 0;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "[[I")
    public int[][] field8213 = new int[6][258];

    @OriginalMember(owner = "client!id", name = "C", descriptor = "[B")
    public byte[] field8221 = new byte[18002];

    @OriginalMember(owner = "client!id", name = "m", descriptor = "[[I")
    public int[][] field8205 = new int[6][258];

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public int field8219 = 0;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "[I")
    public int[] field8194 = new int[6];

    @OriginalMember(owner = "client!id", name = "F", descriptor = "[[B")
    public byte[][] field8224 = new byte[6][258];

    @OriginalMember(owner = "client!id", name = "G", descriptor = "[B")
    public byte[] field8225 = new byte[4096];

    @OriginalMember(owner = "client!id", name = "K", descriptor = "[B")
    public byte[] field8229 = new byte[18002];

    @OriginalMember(owner = "client!id", name = "B", descriptor = "I")
    public static int field8220 = 0;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Lkg;")
    public static class275 field8201 = new class275(107, 1);

    @OriginalMember(owner = "client!id", name = "H", descriptor = "B")
    public byte field8226;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public int field8193;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public int field8196;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public int field8200;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field8202;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public int field8204;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public int field8207;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public int field8208;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public int field8209;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public int field8211;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public int field8214;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public static int field8217;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "I")
    public int field8218;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    public int field8222;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    public int field8223;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public int field8228;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "Ljava/applet/Applet;")
    public static Applet field8227;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "[B")
    public byte[] field8203;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "[B")
    public byte[] field8212;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 3)
    public static void method3333(int arg0) {
        if (arg0 != 18002) {
            method3334((byte) -23);
        }
        field8227 = null;
        field8201 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)[Lhm;", line = 75)
    public static final class223[] method3334(byte arg0) {
        field8202++;
        if (arg0 > -92) {
            method3334((byte) -19);
        }
        return new class223[] { class160.field2194, class386.field4927, class89.field1240, class218.field2939, class33.field549, class99.field1381, class479.field6521, class521.field7308, class721.field10033, class231.field3032 };
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V", line = 114)
    public static final void method3335(int arg0, int arg1) {
        class702.field9764 = new int[arg1];
        class449.field5944 = new int[arg1];
        class609.field8449 = new int[arg1];
        class85.field1180 = new int[arg1];
        class741.field10342 = new int[arg1];
        field8217++;
        if (arg0 != 22531) {
            field8201 = null;
        }
    }
}
