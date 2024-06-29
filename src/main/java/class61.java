import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class61 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "[[B")
    public byte[][] field849 = new byte[6][258];

    @OriginalMember(owner = "client!l", name = "d", descriptor = "[I")
    public int[] field852 = new int[257];

    @OriginalMember(owner = "client!l", name = "f", descriptor = "[[I")
    public int[][] field854 = new int[6][258];

    @OriginalMember(owner = "client!l", name = "s", descriptor = "[[I")
    public int[][] field867 = new int[6][258];

    @OriginalMember(owner = "client!l", name = "p", descriptor = "[B")
    public byte[] field864 = new byte[256];

    @OriginalMember(owner = "client!l", name = "q", descriptor = "[[I")
    public int[][] field865 = new int[6][258];

    @OriginalMember(owner = "client!l", name = "m", descriptor = "[Z")
    public boolean[] field861 = new boolean[16];

    @OriginalMember(owner = "client!l", name = "r", descriptor = "[B")
    public byte[] field866 = new byte[18002];

    @OriginalMember(owner = "client!l", name = "D", descriptor = "[I")
    public int[] field878 = new int[16];

    @OriginalMember(owner = "client!l", name = "C", descriptor = "[B")
    public byte[] field877 = new byte[4096];

    @OriginalMember(owner = "client!l", name = "y", descriptor = "I")
    public int field873 = 0;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "[Z")
    public boolean[] field876 = new boolean[256];

    @OriginalMember(owner = "client!l", name = "L", descriptor = "[I")
    public int[] field886 = new int[256];

    @OriginalMember(owner = "client!l", name = "K", descriptor = "[I")
    public int[] field885 = new int[6];

    @OriginalMember(owner = "client!l", name = "N", descriptor = "[B")
    public byte[] field888 = new byte[18002];

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    public int field890 = 0;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field858 = new String[200];

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field868 = -1;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field875 = 0;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "[I")
    public static int[] field884 = new int[100];

    @OriginalMember(owner = "client!l", name = "G", descriptor = "B")
    public byte field881;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public int field851;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public int field853;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public int field856;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public int field857;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public int field862;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public int field869;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public int field872;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public int field874;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "I")
    public int field887;

    @OriginalMember(owner = "client!l", name = "O", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Lgn;")
    public static class77 field859;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "[B")
    public byte[] field860;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "[B")
    public byte[] field880;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "[[Lnf;")
    public static class149[][] field870;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Loa;", line = 31)
    public static final class153 method411(int arg0, int arg1, int arg2) {
        class204 var3 = class324.field5032[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3360; var4++) {
            class153 var5 = var3.field3343[var4];
            if ((var5.field2358 >> 29 & 0x3L) == 2L && var5.field2371 == arg1 && var5.field2366 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljh;I)V", line = 54)
    public static final void method412(class124 arg0, int arg1) {
        field889++;
        class313 var2 = null;
        try {
            if (arg1 != 3) {
                method414((class44) null, 110, -20);
            }
            class161 var3 = arg0.method894("runescape", (byte) -106);
            while (var3.field2661 == 0) {
                class121.method867((byte) -105, 1L);
            }
            if (var3.field2661 == 1) {
                var2 = (class313) var3.field2664;
                class44 var4 = class54.method348((byte) -96);
                var2.method2204(var4.field573, var4.field586, 0, (byte) 4);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2203(-1);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 102)
    public static void method413(int arg0) {
        field859 = null;
        field870 = (class149[][]) null;
        field884 = null;
        field858 = null;
        if (arg0 != 100) {
            field884 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljj;II)Loc;", line = 141)
    public static final class291 method414(class44 arg0, int arg1, int arg2) {
        field850++;
        class291 var3 = new class291(arg1, arg0.method265(arg2 ^ arg2), arg0.method265(0), arg0.method238((byte) 82), arg0.method238((byte) 82), arg0.method286((byte) -112) == 1, arg0.method286((byte) -102));
        int var4 = arg0.method286((byte) -127);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field4664.method1232(106, new class119(arg0.method286((byte) -87), arg0.method286((byte) -76), arg0.method271(21081), arg0.method271(21081), arg0.method271(arg2 ^ 0xFFFFD915), arg0.method271(arg2 ^ 0xFFFFD915), arg0.method271(21081), arg0.method271(arg2 ^ 0xFFFFD915), arg0.method271(21081), arg0.method271(21081)));
        }
        var3.method2082((byte) 111);
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZZ)V", line = 176)
    public static final void method415(int arg0, int arg1, boolean arg2, boolean arg3) {
        field891++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class338.field5275 = arg1;
        class44.field553 = arg2;
        class178.field2958 = arg0;
        if (!arg3) {
            field859 = (class77) null;
        }
    }
}
