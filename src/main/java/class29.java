import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!pa")
public class class29 {

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "[I")
    public int[] field372 = new int[257];

    @OriginalMember(owner = "mapview!pa", name = "x", descriptor = "[Z")
    public boolean[] field395 = new boolean[256];

    @OriginalMember(owner = "mapview!pa", name = "m", descriptor = "I")
    public int field384 = 0;

    @OriginalMember(owner = "mapview!pa", name = "v", descriptor = "[I")
    public int[] field393 = new int[6];

    @OriginalMember(owner = "mapview!pa", name = "h", descriptor = "[[I")
    public int[][] field379 = new int[6][258];

    @OriginalMember(owner = "mapview!pa", name = "k", descriptor = "[I")
    public int[] field382 = new int[256];

    @OriginalMember(owner = "mapview!pa", name = "F", descriptor = "[[B")
    public byte[][] field403 = new byte[6][258];

    @OriginalMember(owner = "mapview!pa", name = "u", descriptor = "[[I")
    public int[][] field392 = new int[6][258];

    @OriginalMember(owner = "mapview!pa", name = "G", descriptor = "I")
    public int field404 = 0;

    @OriginalMember(owner = "mapview!pa", name = "p", descriptor = "[Z")
    public boolean[] field387 = new boolean[16];

    @OriginalMember(owner = "mapview!pa", name = "i", descriptor = "[B")
    public byte[] field380 = new byte[256];

    @OriginalMember(owner = "mapview!pa", name = "K", descriptor = "[[I")
    public int[][] field408 = new int[6][258];

    @OriginalMember(owner = "mapview!pa", name = "P", descriptor = "[B")
    public byte[] field413 = new byte[4096];

    @OriginalMember(owner = "mapview!pa", name = "Q", descriptor = "[B")
    public byte[] field414 = new byte[18002];

    @OriginalMember(owner = "mapview!pa", name = "M", descriptor = "[I")
    public int[] field410 = new int[16];

    @OriginalMember(owner = "mapview!pa", name = "t", descriptor = "[B")
    public byte[] field391 = new byte[18002];

    @OriginalMember(owner = "mapview!pa", name = "c", descriptor = "Ll;")
    public static class22 field374 = class33.method229("Mining Shop", -80);

    @OriginalMember(owner = "mapview!pa", name = "q", descriptor = "Ll;")
    public static class22 field388 = class33.method229("Kebab Seller", -71);

    @OriginalMember(owner = "mapview!pa", name = "r", descriptor = "Ll;")
    public static class22 field389 = class33.method229("(U", -123);

    @OriginalMember(owner = "mapview!pa", name = "B", descriptor = "I")
    public static int field399 = 0;

    @OriginalMember(owner = "mapview!pa", name = "I", descriptor = "I")
    public static volatile int field406 = -1;

    @OriginalMember(owner = "mapview!pa", name = "L", descriptor = "I")
    public static int field409 = 0;

    @OriginalMember(owner = "mapview!pa", name = "J", descriptor = "Ll;")
    public static class22 field407 = class33.method229("floorcol)3dat", -42);

    @OriginalMember(owner = "mapview!pa", name = "e", descriptor = "B")
    public byte field376;

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "mapview!pa", name = "d", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "mapview!pa", name = "f", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "mapview!pa", name = "j", descriptor = "I")
    public int field381;

    @OriginalMember(owner = "mapview!pa", name = "l", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "mapview!pa", name = "n", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "mapview!pa", name = "s", descriptor = "I")
    public int field390;

    @OriginalMember(owner = "mapview!pa", name = "z", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "mapview!pa", name = "A", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "mapview!pa", name = "C", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "mapview!pa", name = "D", descriptor = "I")
    public int field401;

    @OriginalMember(owner = "mapview!pa", name = "E", descriptor = "I")
    public int field402;

    @OriginalMember(owner = "mapview!pa", name = "H", descriptor = "I")
    public int field405;

    @OriginalMember(owner = "mapview!pa", name = "N", descriptor = "I")
    public int field411;

    @OriginalMember(owner = "mapview!pa", name = "O", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "mapview!pa", name = "o", descriptor = "[B")
    public byte[] field386;

    @OriginalMember(owner = "mapview!pa", name = "w", descriptor = "[B")
    public byte[] field394;

    @OriginalMember(owner = "mapview!pa", name = "y", descriptor = "[B")
    public static byte[] field396;

    @OriginalMember(owner = "mapview!pa", name = "g", descriptor = "[I")
    public static int[] field378;

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 36)
    public static final void method204(Component arg0, int arg1) {
        int var2 = 88 / ((arg1 - 61) / 34);
        arg0.removeKeyListener(class13.field132);
        arg0.removeFocusListener(class13.field132);
    }

    @OriginalMember(owner = "mapview!pa", name = "a", descriptor = "(I)B", line = 126)
    public static final byte method205(int arg0) {
        if (arg0 != 0) {
            field389 = null;
        }
        return class1.field3 == null ? 0 : class1.field3[class35.field471];
    }

    @OriginalMember(owner = "mapview!pa", name = "b", descriptor = "(I)V", line = 140)
    public static void method206(int arg0) {
        if (arg0 != 258) {
            return;
        }
        field374 = null;
        field407 = null;
        field388 = null;
        field396 = null;
        field389 = null;
        field378 = null;
    }
}
