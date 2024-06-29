import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!o")
public class class28 {

    @OriginalMember(owner = "mapview!o", name = "i", descriptor = "[Z")
    public boolean[] field391 = new boolean[16];

    @OriginalMember(owner = "mapview!o", name = "s", descriptor = "[[I")
    public int[][] field401 = new int[6][258];

    @OriginalMember(owner = "mapview!o", name = "x", descriptor = "[B")
    public byte[] field406 = new byte[4096];

    @OriginalMember(owner = "mapview!o", name = "k", descriptor = "[I")
    public int[] field393 = new int[257];

    @OriginalMember(owner = "mapview!o", name = "C", descriptor = "[I")
    public int[] field411 = new int[16];

    @OriginalMember(owner = "mapview!o", name = "u", descriptor = "[[B")
    public byte[][] field403 = new byte[6][258];

    @OriginalMember(owner = "mapview!o", name = "w", descriptor = "[[I")
    public int[][] field405 = new int[6][258];

    @OriginalMember(owner = "mapview!o", name = "J", descriptor = "[Z")
    public boolean[] field417 = new boolean[256];

    @OriginalMember(owner = "mapview!o", name = "H", descriptor = "I")
    public int field415 = 0;

    @OriginalMember(owner = "mapview!o", name = "A", descriptor = "[B")
    public byte[] field409 = new byte[256];

    @OriginalMember(owner = "mapview!o", name = "L", descriptor = "[[I")
    public int[][] field419 = new int[6][258];

    @OriginalMember(owner = "mapview!o", name = "B", descriptor = "[B")
    public byte[] field410 = new byte[18002];

    @OriginalMember(owner = "mapview!o", name = "I", descriptor = "I")
    public int field416 = 0;

    @OriginalMember(owner = "mapview!o", name = "m", descriptor = "[I")
    public int[] field395 = new int[256];

    @OriginalMember(owner = "mapview!o", name = "N", descriptor = "[B")
    public byte[] field421 = new byte[18002];

    @OriginalMember(owner = "mapview!o", name = "K", descriptor = "[I")
    public int[] field418 = new int[6];

    @OriginalMember(owner = "mapview!o", name = "e", descriptor = "Ld;")
    public static class7 field387 = class38.method251((byte) 121, "Key");

    @OriginalMember(owner = "mapview!o", name = "v", descriptor = "Ld;")
    public static class7 field404 = class38.method251((byte) 102, "null");

    @OriginalMember(owner = "mapview!o", name = "o", descriptor = "Ld;")
    public static class7 field397 = class38.method251((byte) 85, "Fur Trader");

    @OriginalMember(owner = "mapview!o", name = "r", descriptor = "Ld;")
    public static class7 field400 = class38.method251((byte) 89, "75(U");

    @OriginalMember(owner = "mapview!o", name = "y", descriptor = "I")
    public static int field407 = 0;

    @OriginalMember(owner = "mapview!o", name = "M", descriptor = "Z")
    public static boolean field420 = false;

    @OriginalMember(owner = "mapview!o", name = "h", descriptor = "B")
    public byte field390;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "I")
    public int field383;

    @OriginalMember(owner = "mapview!o", name = "c", descriptor = "I")
    public int field385;

    @OriginalMember(owner = "mapview!o", name = "d", descriptor = "I")
    public int field386;

    @OriginalMember(owner = "mapview!o", name = "f", descriptor = "I")
    public int field388;

    @OriginalMember(owner = "mapview!o", name = "g", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "mapview!o", name = "l", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "mapview!o", name = "n", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "mapview!o", name = "p", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "mapview!o", name = "z", descriptor = "I")
    public int field408;

    @OriginalMember(owner = "mapview!o", name = "E", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "mapview!o", name = "F", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "mapview!o", name = "G", descriptor = "I")
    public int field414;

    @OriginalMember(owner = "mapview!o", name = "O", descriptor = "I")
    public int field422;

    @OriginalMember(owner = "mapview!o", name = "j", descriptor = "Lb;")
    public static class3 field392;

    @OriginalMember(owner = "mapview!o", name = "q", descriptor = "Lb;")
    public static class3 field399;

    @OriginalMember(owner = "mapview!o", name = "b", descriptor = "[B")
    public byte[] field384;

    @OriginalMember(owner = "mapview!o", name = "t", descriptor = "[B")
    public byte[] field402;

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(I)V", line = 17)
    public static void method203(int arg0) {
        if (arg0 != 19300) {
            method208(-124, (byte) -64, 71, null);
        }
        field404 = null;
        field392 = null;
        field399 = null;
        field400 = null;
        field397 = null;
        field387 = null;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 37)
    public static final void method204(Component arg0, byte arg1) {
        arg0.addMouseListener(class24.field254);
        arg0.addMouseMotionListener(class24.field254);
        if (arg1 != -72) {
            field407 = 43;
        }
        arg0.addFocusListener(class24.field254);
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(JB)V", line = 83)
    public static final void method205(long arg0, byte arg1) {
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class37.method240((byte) -112, arg0 - 1L);
            class37.method240((byte) -123, 1L);
        } else {
            class37.method240((byte) -127, arg0);
        }
        if (arg1 <= 112) {
            field404 = null;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;", line = 110)
    public static final Object method206(int arg0, byte[] arg1, boolean arg2) {
        if (arg0 != 6) {
            return (Object) null;
        } else if (arg1 == null) {
            return null;
        } else if (arg2) {
            return class21.method153(arg1, 255);
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(IILk;I)[Lna;", line = 150)
    public static final class27[] method207(int arg0, int arg1, class20 arg2, int arg3) {
        if (arg3 != 257) {
            method208(-114, (byte) -11, 86, null);
        }
        return class29.method209(arg2, 23979, arg1, arg0) ? class31.method219(87) : null;
    }

    @OriginalMember(owner = "mapview!o", name = "a", descriptor = "(IBILjava/awt/Component;)Lga;", line = 235)
    public static final class14 method208(int arg0, byte arg1, int arg2, Component arg3) {
        try {
            int var4 = -93 % ((38 - arg1) / 63);
            Class var5 = Class.forName("q");
            class14 var6 = (class14) var5.getDeclaredConstructor().newInstance();
            var6.method110(arg2, arg3, false, arg0);
            return var6;
        } catch (Throwable var9) {
            class25 var8 = new class25();
            var8.method110(arg2, arg3, false, arg0);
            return var8;
        }
    }
}
