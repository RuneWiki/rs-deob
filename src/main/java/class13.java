import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class class13 {

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "I")
    public static volatile int field165 = -1;

    @OriginalMember(owner = "mapview!g", name = "c", descriptor = "[[B")
    public static byte[][] field167 = new byte[1000][];

    @OriginalMember(owner = "mapview!g", name = "d", descriptor = "Lt;")
    public static class35 field168 = class3.method28(false, "Water Source");

    @OriginalMember(owner = "mapview!g", name = "h", descriptor = "Lt;")
    public static class35 field172 = class3.method28(false, "75(U");

    @OriginalMember(owner = "mapview!g", name = "g", descriptor = "I")
    public static int field171 = 0;

    @OriginalMember(owner = "mapview!g", name = "f", descriptor = "Lt;")
    public static class35 field170 = class3.method28(false, "Gem Shop");

    @OriginalMember(owner = "mapview!g", name = "k", descriptor = "Lt;")
    public static class35 field175 = class3.method28(false, "Spice Shop");

    @OriginalMember(owner = "mapview!g", name = "e", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "Ljava/awt/Image;")
    public static Image field166;

    @OriginalMember(owner = "mapview!g", name = "i", descriptor = "[B")
    public static byte[] field173;

    @OriginalMember(owner = "mapview!g", name = "j", descriptor = "[[B")
    public static byte[][] field174;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(B)V", line = 14)
    public static void method88(byte arg0) {
        field168 = null;
        field172 = null;
        if (arg0 != -30) {
            method88((byte) 4);
        }
        field174 = null;
        field175 = null;
        field166 = null;
        field173 = null;
        field170 = null;
        field167 = null;
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "([BB)[B", line = 50)
    public static final byte[] method89(byte[] arg0, byte arg1) {
        class18 var2 = new class18(arg0);
        int var3 = var2.method110(57);
        int var4 = 41 / (-arg1 / 36);
        int var5 = var2.method109((byte) -107);
        if (var5 < 0 || class32.field404 != 0 && class32.field404 < var5) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var6 = new byte[var5];
            var2.method112(-2, var6, var5, 0);
            return var6;
        } else {
            int var7 = var2.method109((byte) -120);
            if (var7 < 0 || class32.field404 != 0 && class32.field404 < var7) {
                throw new RuntimeException();
            }
            byte[] var8 = new byte[var7];
            if (var3 == 1) {
                class9.method60(var8, var7, arg0, var5, 9);
            } else {
                try {
                    DataInputStream var9 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, var5)));
                    var9.readFully(var8);
                    var9.close();
                } catch (IOException var11) {
                }
            }
            return var8;
        }
    }
}
