import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public abstract class class10 {

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "[[B")
    public static byte[][] field89 = new byte[50][];

    @OriginalMember(owner = "mapview!ea", name = "i", descriptor = "Lu;")
    public static class38 field97 = class9.method45(-41, "mapfunction");

    @OriginalMember(owner = "mapview!ea", name = "g", descriptor = "Lu;")
    public static class38 field95 = class9.method45(-41, "b12_full");

    @OriginalMember(owner = "mapview!ea", name = "j", descriptor = "Lu;")
    public static class38 field98 = class9.method45(-41, "Overview");

    @OriginalMember(owner = "mapview!ea", name = "h", descriptor = "Lu;")
    public static class38 field96 = class9.method45(-41, "overlay2)3dat");

    @OriginalMember(owner = "mapview!ea", name = "e", descriptor = "I")
    public static int field93 = 0;

    @OriginalMember(owner = "mapview!ea", name = "k", descriptor = "Lu;")
    public static class38 field99 = class9.method45(-41, "Jewellery");

    @OriginalMember(owner = "mapview!ea", name = "l", descriptor = "Lu;")
    public static class38 field100 = class9.method45(-41, "Silk Trader");

    @OriginalMember(owner = "mapview!ea", name = "m", descriptor = "Lu;")
    public static class38 field101 = class9.method45(-41, "Fishing Shop");

    @OriginalMember(owner = "mapview!ea", name = "n", descriptor = "Lu;")
    public static class38 field102 = class9.method45(-41, "Gem Shop");

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "mapview!ea", name = "f", descriptor = "Lca;")
    public static class6 field94;

    @OriginalMember(owner = "mapview!ea", name = "d", descriptor = "Ljava/lang/String;")
    public static String field92;

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "Z")
    public static boolean field91;

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "([Lu;IZI)Lu;", line = 5)
    public static final class38 method53(class38[] arg0, int arg1, boolean arg2, int arg3) {
        int var4 = 0;
        if (!arg2) {
            field102 = null;
        }
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg0[arg3 + var5] == null) {
                arg0[arg3 + var5] = mapview.field303;
            }
            var4 += arg0[arg3 + var5].field492;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg1; var8++) {
            class38 var9 = arg0[arg3 + var8];
            class21.method99(var9.field487, 0, var6, var7, var9.field492);
            var7 += var9.field492;
        }
        class38 var10 = new class38();
        var10.field492 = var4;
        var10.field487 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(Ljava/awt/Component;III)Lfa;", line = 58)
    public static final class12 method54(Component arg0, int arg1, int arg2, int arg3) {
        try {
            Class var4 = Class.forName("pa");
            class12 var5 = (class12) var4.getDeclaredConstructor().newInstance();
            var5.method63(arg2, arg0, arg1, 15564);
            if (arg3 != 17072) {
                method58((byte) 21);
            }
            return var5;
        } catch (Throwable var8) {
            class28 var7 = new class28();
            var7.method63(arg2, arg0, arg1, arg3 - 1508);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(B)B", line = 77)
    public static final byte method55(byte arg0) {
        if (arg0 != -53) {
            field96 = null;
        }
        return class19.field186 == null ? 0 : class19.field186[class14.field139];
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(B)V", line = 125)
    public static void method58(byte arg0) {
        field102 = null;
        field98 = null;
        field92 = null;
        field96 = null;
        field95 = null;
        field97 = null;
        if (arg0 != 44) {
            field101 = null;
        }
        field94 = null;
        field99 = null;
        field100 = null;
        field101 = null;
        field89 = null;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(ZZII)Lu;", line = 149)
    public static final class38 method59(boolean arg0, boolean arg1, int arg2, int arg3) {
        if (arg3 < 1 || arg3 > 36) {
            arg3 = 10;
        }
        if (arg0) {
            method55((byte) 122);
        }
        int var4 = 1;
        int var5 = arg2 / arg3;
        while (var5 != 0) {
            var5 /= arg3;
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg1) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg2 % arg3;
            if (var9 < 0) {
                var9 = -var9;
            }
            arg2 /= arg3;
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class38 var10 = new class38();
        var10.field487 = var7;
        var10.field492 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I)[B")
    public abstract byte[] method56(int arg0);

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "([BB)V")
    public abstract void method57(byte[] arg0, byte arg1);
}
