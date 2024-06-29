import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!qa")
public class class32 {

    @OriginalMember(owner = "mapview!qa", name = "d", descriptor = "I")
    public int field388 = 0;

    @OriginalMember(owner = "mapview!qa", name = "f", descriptor = "[Z")
    public boolean[] field390 = new boolean[256];

    @OriginalMember(owner = "mapview!qa", name = "t", descriptor = "[B")
    public byte[] field404 = new byte[18002];

    @OriginalMember(owner = "mapview!qa", name = "l", descriptor = "[I")
    public int[] field396 = new int[256];

    @OriginalMember(owner = "mapview!qa", name = "r", descriptor = "[[I")
    public int[][] field402 = new int[6][258];

    @OriginalMember(owner = "mapview!qa", name = "s", descriptor = "[[I")
    public int[][] field403 = new int[6][258];

    @OriginalMember(owner = "mapview!qa", name = "b", descriptor = "[[B")
    public byte[][] field386 = new byte[6][258];

    @OriginalMember(owner = "mapview!qa", name = "F", descriptor = "I")
    public int field415 = 0;

    @OriginalMember(owner = "mapview!qa", name = "z", descriptor = "[B")
    public byte[] field410 = new byte[256];

    @OriginalMember(owner = "mapview!qa", name = "J", descriptor = "[Z")
    public boolean[] field419 = new boolean[16];

    @OriginalMember(owner = "mapview!qa", name = "p", descriptor = "[I")
    public int[] field400 = new int[16];

    @OriginalMember(owner = "mapview!qa", name = "I", descriptor = "[I")
    public int[] field418 = new int[6];

    @OriginalMember(owner = "mapview!qa", name = "v", descriptor = "[[I")
    public int[][] field406 = new int[6][258];

    @OriginalMember(owner = "mapview!qa", name = "B", descriptor = "[B")
    public byte[] field411 = new byte[18002];

    @OriginalMember(owner = "mapview!qa", name = "u", descriptor = "[I")
    public int[] field405 = new int[257];

    @OriginalMember(owner = "mapview!qa", name = "E", descriptor = "[B")
    public byte[] field414 = new byte[4096];

    @OriginalMember(owner = "mapview!qa", name = "m", descriptor = "Lu;")
    public static class38 field397 = class9.method45(-41, "Cookery Shop");

    @OriginalMember(owner = "mapview!qa", name = "h", descriptor = "Lu;")
    public static class38 field392 = class9.method45(-41, "Suchen");

    @OriginalMember(owner = "mapview!qa", name = "x", descriptor = "Lu;")
    public static class38 field408 = class9.method45(-41, "Loading )3)3)3");

    @OriginalMember(owner = "mapview!qa", name = "D", descriptor = "I")
    public static int field413 = 0;

    @OriginalMember(owner = "mapview!qa", name = "n", descriptor = "B")
    public byte field398;

    @OriginalMember(owner = "mapview!qa", name = "c", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "mapview!qa", name = "e", descriptor = "I")
    public int field389;

    @OriginalMember(owner = "mapview!qa", name = "g", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "mapview!qa", name = "i", descriptor = "I")
    public int field393;

    @OriginalMember(owner = "mapview!qa", name = "k", descriptor = "I")
    public int field395;

    @OriginalMember(owner = "mapview!qa", name = "o", descriptor = "I")
    public int field399;

    @OriginalMember(owner = "mapview!qa", name = "q", descriptor = "I")
    public int field401;

    @OriginalMember(owner = "mapview!qa", name = "y", descriptor = "I")
    public int field409;

    @OriginalMember(owner = "mapview!qa", name = "C", descriptor = "I")
    public int field412;

    @OriginalMember(owner = "mapview!qa", name = "G", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "mapview!qa", name = "H", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "mapview!qa", name = "K", descriptor = "I")
    public int field420;

    @OriginalMember(owner = "mapview!qa", name = "P", descriptor = "I")
    public int field424;

    @OriginalMember(owner = "mapview!qa", name = "j", descriptor = "Ljava/awt/Image;")
    public static Image field394;

    @OriginalMember(owner = "mapview!qa", name = "L", descriptor = "[B")
    public byte[] field421;

    @OriginalMember(owner = "mapview!qa", name = "M", descriptor = "[B")
    public byte[] field422;

    @OriginalMember(owner = "mapview!qa", name = "w", descriptor = "[I")
    public static int[] field407;

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "[Lg;")
    public static class13[] field385;

    @OriginalMember(owner = "mapview!qa", name = "N", descriptor = "[Lu;")
    public static class38[] field423;

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(B)V", line = 21)
    public static void method180(byte arg0) {
        field423 = null;
        field408 = null;
        field397 = null;
        field407 = null;
        field392 = null;
        field385 = null;
        if (arg0 > -115) {
            method181((byte) 7, null);
        }
        field394 = null;
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(B[B)[B", line = 114)
    public static final byte[] method181(byte arg0, byte[] arg1) {
        class33 var2 = new class33(arg1);
        int var3 = var2.method188((byte) -53);
        int var4 = var2.method190(4096);
        if (var4 < 0 || class25.field225 != 0 && class25.field225 < var4) {
            throw new RuntimeException();
        }
        if (arg0 >= -92) {
            method180((byte) 91);
        }
        if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method184(var4, var7, -21414, 0);
            return var7;
        }
        int var5 = var2.method190(4096);
        if (var5 < 0 || class25.field225 != 0 && class25.field225 < var5) {
            throw new RuntimeException();
        }
        byte[] var6 = new byte[var5];
        if (var3 == 1) {
            class24.method119(var6, var5, arg1, var4, 9);
        } else {
            class1.field5.method121(0, var2, var6);
        }
        return var6;
    }
}
