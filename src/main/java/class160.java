import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class160 {

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    private int field3088 = -1;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    private int field3099 = 0;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Lwi;")
    private class248 field3080 = new class248();

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "Z")
    public boolean field3100 = false;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    private int field3089;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "[[I")
    private int[][] field3093;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    private int field3090;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "[Loc;")
    private class155[] field3097;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "S")
    public static short field3085 = 320;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "Li;")
    public static class88 field3091 = class208.method1425(105, " )2>");

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "[I")
    public static int[] field3094 = new int[200];

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "Li;")
    private static class88 field3096 = class208.method1425(105, "glow2:");

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "Li;")
    public static class88 field3086 = field3096;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Li;")
    public static class88 field3083 = field3096;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method1076(int arg0) {
        field3091 = null;
        int var1 = 30 / ((arg0 + 10) / 61);
        field3094 = null;
        field3096 = null;
        field3086 = null;
        field3083 = null;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)[[I")
    public final int[][] method1077(int arg0) {
        field3092++;
        if (this.field3090 != this.field3089) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        int var3 = -68 % ((36 - arg0) / 63);
        while (var2 < this.field3089) {
            this.field3097[var2] = class87.field1572;
            var2++;
        }
        return this.field3093;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lbb;")
    public static final class14 method1078(Throwable arg0, String arg1) {
        field3087++;
        class14 var2;
        if (arg0 instanceof class14) {
            var2 = (class14) arg0;
            var2.field210 = var2.field210 + ' ' + arg1;
        } else {
            var2 = new class14(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)I")
    public static final int method1079(boolean arg0, int arg1) {
        if (arg0) {
            return -123;
        } else {
            field3081++;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(ZI)[I")
    public final int[] method1080(boolean arg0, int arg1) {
        field3082++;
        if (arg0) {
            this.field3089 = 30;
        }
        if (this.field3090 == this.field3089) {
            this.field3100 = this.field3097[arg1] == null;
            this.field3097[arg1] = class87.field1572;
            return this.field3093[arg1];
        } else if (this.field3089 == 1) {
            this.field3100 = this.field3088 != arg1;
            this.field3088 = arg1;
            return this.field3093[0];
        } else {
            class155 var3 = this.field3097[arg1];
            if (var3 == null) {
                this.field3100 = true;
                if (this.field3089 > this.field3099) {
                    var3 = new class155(arg1, this.field3099);
                    this.field3099++;
                } else {
                    class155 var4 = (class155) this.field3080.method1614((byte) -25);
                    var3 = new class155(arg1, var4.field3003);
                    this.field3097[var4.field2994] = null;
                    var4.method460(!arg0);
                }
                this.field3097[arg1] = var3;
            } else {
                this.field3100 = false;
            }
            this.field3080.method1617(24290, var3);
            return this.field3093[var3.field3003];
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
    public static final void method1081(int arg0) {
        if (arg0 <= 30) {
            method1076(-60);
        }
        field3079++;
        class12.field174.method671(120);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)I")
    public static final int method1082(int arg0, int arg1, int arg2) {
        field3084++;
        if (arg2 > -78) {
            return 31;
        } else {
            int var3 = arg1 - 1 & arg0 >> 31;
            return ((arg0 >>> 31) + arg0) % arg1 + var3;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public final void method1083(byte arg0) {
        field3098++;
        int var2 = 0;
        if (arg0 != 11) {
            this.field3080 = null;
        }
        while (var2 < this.field3089) {
            this.field3093[var2] = null;
            var2++;
        }
        this.field3093 = null;
        this.field3097 = null;
        this.field3080.method1618(-3);
        this.field3080 = null;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(III)V")
    public class160(int arg0, int arg1, int arg2) {
        this.field3089 = arg0;
        this.field3093 = new int[this.field3089][arg2];
        this.field3090 = arg1;
        this.field3097 = new class155[this.field3090];
    }
}
