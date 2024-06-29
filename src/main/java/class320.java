import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class320 {

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "[I")
    private int[] field5421;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Ljf;")
    public static class229 field5406 = class212.method1457((byte) 69, "::fps ");

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Z")
    public static boolean field5415 = true;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Z")
    public static boolean field5408 = false;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "Ljf;")
    public static class229 field5420 = class212.method1457((byte) 64, ")4a=");

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Ljf;")
    public static class229 field5417 = class212.method1457((byte) 75, "Hierhin drehen");

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field5419 = 0;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "Ljf;")
    public static class229 field5423 = class212.method1457((byte) 77, "hint_mapmarkers");

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "Z")
    public static boolean field5424 = false;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field5410;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "Lek;")
    public static class185 field5409;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Lek;")
    public static class185 field5413;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "[Lrm;")
    public static class248[] field5416;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "[[[Llf;")
    public static class125[][][] field5411;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V", line = 5)
    public static final void method2153(byte arg0) {
        field5422++;
        int var1 = 89 / ((-arg0 - 20) / 53);
        class93.field1685.method226((byte) -97);
        class249.field4383.method226((byte) -124);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)Z", line = 20)
    public static final boolean method2154(int arg0, int arg1, int arg2) {
        class83 var3 = class271.method1909(126, arg0);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg2 != 1) {
            method2157((byte) 107, (Object[]) null, (int[]) null);
        }
        field5407++;
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method588((byte) -61, arg1);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)I", line = 44)
    public final int method2155(int arg0, int arg1) {
        field5410++;
        int var3 = (this.field5421.length >> 1) - 1;
        if (arg1 != -8252) {
            field5419 = -96;
        }
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field5421[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field5421[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;I)Ljf;", line = 74)
    public static final class229 method2156(String arg0, int arg1) {
        field5418++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg0.getBytes();
        }
        class229 var4 = new class229();
        var4.field3973 = 0;
        var4.field3944 = var2;
        for (int var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != 0) {
                var2[var4.field3973++] = var2[var5];
            }
        }
        if (arg1 == -1) {
            return var4;
        } else {
            return (class229) null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B[Ljava/lang/Object;[I)V", line = 113)
    public static final void method2157(byte arg0, Object[] arg1, int[] arg2) {
        field5414++;
        if (arg0 > -91) {
            method2153((byte) 7);
        }
        class155.method1037(arg2.length - 1, (byte) 0, arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 125)
    public static void method2158(int arg0) {
        field5409 = null;
        field5406 = null;
        if (arg0 != -12) {
            return;
        }
        field5411 = (class125[][][]) null;
        field5417 = null;
        field5413 = null;
        field5423 = null;
        field5420 = null;
        field5416 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V", line = 142)
    public static final void method2159(boolean arg0) {
        if (arg0) {
            field5417 = (class229) null;
        }
        if (class301.field5117 != null) {
            class253 var1 = class301.field5117;
            synchronized (class301.field5117) {
                class301.field5117 = null;
            }
        }
        field5412++;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([I)V", line = 195)
    public class320(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field5421 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field5421[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field5421[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field5421[var5 + var5] = arg0[var4];
            this.field5421[var5 + var5 + 1] = var4++;
        }
    }
}
