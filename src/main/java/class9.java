import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!e")
public class class9 {

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "I")
    public static int field147 = 0;

    @OriginalMember(owner = "mapview!e", name = "g", descriptor = "Lba;")
    public static class4 field153 = class14.method105((byte) -83, "Prev page");

    @OriginalMember(owner = "mapview!e", name = "h", descriptor = "J")
    public static volatile long field154 = 0L;

    @OriginalMember(owner = "mapview!e", name = "e", descriptor = "Lba;")
    public static class4 field151 = class14.method105((byte) -94, "37(U");

    @OriginalMember(owner = "mapview!e", name = "d", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "mapview!e", name = "i", descriptor = "Loa;")
    public static class29 field155;

    @OriginalMember(owner = "mapview!e", name = "f", descriptor = "Lu;")
    public static class36 field152;

    @OriginalMember(owner = "mapview!e", name = "b", descriptor = "Lda;")
    public static class8 field148;

    @OriginalMember(owner = "mapview!e", name = "c", descriptor = "[[B")
    public static byte[][] field149;

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(ZIII)Lba;", line = 52)
    public static final class4 method85(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = 1;
        if (arg3 < 1 || arg3 > 36) {
            arg3 = 10;
        }
        int var5 = arg1 / arg3;
        while (var5 != 0) {
            var5 /= arg3;
            var4++;
        }
        int var6 = var4;
        if (arg1 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        int var8 = -24 / ((-arg2 - 38) / 60);
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = arg1 % arg3;
            arg1 /= arg3;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var9 - 1] = (byte) (var10 + 48);
        }
        class4 var11 = new class4();
        var11.field84 = var6;
        var11.field82 = var7;
        return var11;
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(I)V", line = 110)
    public static void method86(int arg0) {
        field149 = null;
        field151 = null;
        field152 = null;
        field148 = null;
        field153 = null;
        if (arg0 >= -48) {
            field149 = null;
        }
        field155 = null;
    }

    @OriginalMember(owner = "mapview!e", name = "a", descriptor = "(ILjava/lang/String;)Lba;", line = 127)
    public static final class4 method87(int arg0, String arg1) {
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg1.getBytes();
        }
        class4 var4 = new class4();
        var4.field82 = var2;
        var4.field84 = arg0;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field84++] = var2[var5];
            }
        }
        return var4;
    }
}
