import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!da")
public abstract class class8 {

    @OriginalMember(owner = "mapview!da", name = "d", descriptor = "Ld;")
    public static class7 field87 = class38.method251((byte) 127, "Mini)2Game");

    @OriginalMember(owner = "mapview!da", name = "e", descriptor = "[[B")
    public static byte[][] field88 = new byte[1000][];

    @OriginalMember(owner = "mapview!da", name = "c", descriptor = "Ld;")
    public static class7 field86 = class38.method251((byte) -118, "Furnace");

    @OriginalMember(owner = "mapview!da", name = "f", descriptor = "I")
    public static int field89 = 1;

    @OriginalMember(owner = "mapview!da", name = "h", descriptor = "Ld;")
    public static class7 field91 = class38.method251((byte) -111, "Platebody Shop");

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "Ld;")
    public static class7 field85 = class38.method251((byte) -128, "Food Shop");

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "Ld;")
    public static class7 field84 = class38.method251((byte) -75, "Platelegs Shop");

    @OriginalMember(owner = "mapview!da", name = "i", descriptor = "Ld;")
    public static class7 field92 = class38.method251((byte) 118, "Altar");

    @OriginalMember(owner = "mapview!da", name = "l", descriptor = "Ld;")
    public static class7 field95 = class38.method251((byte) 100, "Overview");

    @OriginalMember(owner = "mapview!da", name = "g", descriptor = "[[B")
    public static byte[][] field90 = new byte[250][];

    @OriginalMember(owner = "mapview!da", name = "j", descriptor = "Ld;")
    public static class7 field93 = class38.method251((byte) 98, "Mining Site");

    @OriginalMember(owner = "mapview!da", name = "m", descriptor = "I")
    public static int field96 = 0;

    @OriginalMember(owner = "mapview!da", name = "k", descriptor = "[[[I")
    public static int[][][] field94;

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(B)[Le;", line = 19)
    public static final class9[] method81(byte arg0) {
        class9[] var1 = new class9[class18.field195];
        for (int var2 = 0; var2 < class18.field195; var2++) {
            class9 var3 = var1[var2] = new class9();
            var3.field98 = class24.field259[var2];
            var3.field99 = class16.field177[var2];
            var3.field97 = class11.field126[var2];
            var3.field100 = class36.field479[var2];
            byte[] var4 = mapview.field289[var2];
            int var5 = var3.field97 * var3.field100;
            var3.field101 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                var3.field101[var6] = class37.field487[class38.method243(255, var4[var6])];
            }
        }
        int var7 = 103 / ((73 - arg0) / 50);
        class21.method151((byte) 91);
        return var1;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lfa;", line = 80)
    public static final class12 method82(Throwable arg0, String arg1) {
        class12 var2;
        if (arg0 instanceof class12) {
            var2 = (class12) arg0;
            var2.field137 = var2.field137 + ' ' + arg1;
        } else {
            var2 = new class12(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(I)V", line = 111)
    public static void method83(int arg0) {
        field95 = null;
        field85 = null;
        field88 = null;
        field84 = null;
        field91 = null;
        field86 = null;
        field93 = null;
        field94 = null;
        field90 = null;
        field87 = null;
        field92 = null;
        if (arg0 != 0) {
            method85(-45, false, -111, 79);
        }
    }

    @OriginalMember(owner = "mapview!da", name = "a", descriptor = "(IZII)Ld;", line = 154)
    public static final class7 method85(int arg0, boolean arg1, int arg2, int arg3) {
        int var4 = 1;
        if (arg3 < 1 || arg3 > 36) {
            arg3 = 10;
        }
        for (int var5 = arg0 / arg3; var5 != 0; var5 /= arg3) {
            var4++;
        }
        int var6 = var4;
        if (arg0 < 0 || arg1) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        int var8 = 0;
        if (arg2 <= 123) {
            field88 = null;
        }
        while (var8 < var4) {
            int var9 = arg0 % arg3;
            arg0 /= arg3;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
            var8++;
        }
        class7 var10 = new class7();
        var10.field75 = var7;
        var10.field76 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!da", name = "b", descriptor = "(I)[B")
    public abstract byte[] method84(int arg0);
}
