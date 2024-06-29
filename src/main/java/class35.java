import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class35 {

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "J")
    public long field863 = 0L;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Lsg;")
    public static class30 field848 = class167.method1221((byte) 33, "Titelbild ge-Offnet)3");

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Lsg;")
    public static class30 field849 = class167.method1221((byte) 33, "loc");

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static volatile int field859 = 0;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "[[I")
    public static int[][] field861 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "Lsg;")
    public static class30 field860 = class167.method1221((byte) 33, "Wordpack geladen)3");

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "Z")
    public static boolean field865 = true;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "Llk;")
    public static class232 field858 = new class232(64);

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "Lsg;")
    public static class30 field866 = class167.method1221((byte) 33, "Sprites geladen)3");

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public int field851;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public int field852;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public int field853;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public int field854;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public int field856;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "I")
    public int field864;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Lmc;")
    public static class151 field862;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Lni;")
    public class20 field857;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)I")
    public static final int method344(int arg0) {
        int var1 = -116 % ((arg0 + 26) / 62);
        field850++;
        return field859;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public static void method345(int arg0) {
        field858 = null;
        field861 = null;
        field862 = null;
        field866 = null;
        field860 = null;
        field849 = null;
        field848 = null;
        if (arg0 >= -127) {
            field865 = false;
        }
    }
}
