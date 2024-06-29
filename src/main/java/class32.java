import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class32 {

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
    public int field496 = 0;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
    public int field503 = 0;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "Lmf;")
    private class382 field506 = new class382(64);

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "Loe;")
    private class183 field511 = null;

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "Lpu;")
    private class522 field510;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "Lpu;")
    private class522 field498;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "[[B")
    public static byte[][] field495 = new byte[1000][];

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "I")
    public static int field502 = 0;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "[I")
    public static int[] field505 = new int[5];

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field508 = new String[5];

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    public static int field501 = -1;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B[IJLff;)Ljava/lang/String;")
    public final String method355(byte arg0, int[] arg1, long arg2, class9 arg3) {
        field509++;
        if (this.field511 != null) {
            String var6 = this.field511.method1232(arg3, arg2, 0, arg1);
            if (var6 != null) {
                return var6;
            }
        }
        return arg0 <= 31 ? null : Long.toString(arg2);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lmo;I)Lui;")
    public static final class206 method356(class695 arg0, int arg1) {
        field500++;
        if (arg1 <= 63) {
            field502 = 108;
        }
        return new class206(arg0.method3814(false), arg0.method3814(false), arg0.method3814(false), arg0.method3814(false), arg0.method3873(255), arg0.method3826(false));
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IBI)V")
    public static final void method357(int arg0, byte arg1, int arg2) {
        field499++;
        class248 var3 = class115.field1765[arg2][arg0];
        if (var3 != null) {
            class258.field3941 = var3.field3839;
            class401.field5906 = var3.field3843;
            class585.field8199 = var3.field3847;
        }
        class268.method1750((byte) 75);
        if (arg1 != -93) {
            field501 = -60;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(III)V")
    public static final void method358(int arg0, int arg1, int arg2) {
        class40 var3 = class153.field2210[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class300.method1929(var3.field665);
        class300.method1929(var3.field662);
        if (var3.field665 != null) {
            var3.field665 = null;
        }
        if (var3.field662 != null) {
            var3.field662 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
    public static final void method359(int arg0) {
        class308.field4556.method2285((byte) -124);
        if (arg0 > 45) {
            field507++;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
    public static void method360(byte arg0) {
        int var1 = -71 / ((63 - arg0) / 46);
        field505 = null;
        field508 = null;
        field495 = null;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)Lrh;")
    public final class239 method361(int arg0, int arg1) {
        field504++;
        class239 var3 = (class239) this.field506.method2287(1, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field510.method3007(1, arg1 & 0x7FFF, 5);
        } else {
            var4 = this.field498.method3007(1, arg1, 5);
        }
        class239 var5 = new class239();
        var5.field3733 = this;
        if (var4 != null) {
            var5.method1630(0, new class695(var4));
        }
        if (arg0 > -107) {
            this.method355((byte) -119, null, -87L, null);
        }
        if (arg1 >= 32768) {
            var5.method1634(1);
        }
        this.field506.method2291(var5, (long) arg1, 1);
        return var5;
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(ILpu;Lpu;Loe;)V")
    public class32(int arg0, class522 arg1, class522 arg2, class183 arg3) {
        this.field510 = arg2;
        this.field511 = arg3;
        this.field498 = arg1;
        if (this.field498 != null) {
            this.field503 = this.field498.method2988(72, 1);
        }
        if (this.field510 != null) {
            this.field496 = this.field510.method2988(-7, 1);
        }
    }
}
