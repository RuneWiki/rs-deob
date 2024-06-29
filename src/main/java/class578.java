import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class578 {

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "Lru;")
    private class177 field8398 = new class177();

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "Ljava/lang/String;")
    public static String field8409 = null;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "[I")
    public static int[] field8402 = new int[120];

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field8399;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field8400;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field8401;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field8403;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field8404;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field8405;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field8406;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "Lru;")
    private class177 field8408;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)Lru;")
    public final class177 method3314(int arg0) {
        field8405++;
        class177 var2 = this.field8398.field2889;
        if (this.field8398 == var2) {
            return null;
        } else {
            var2.method1318(8);
            return arg0 == -121 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public final void method3315(byte arg0) {
        while (true) {
            class177 var2 = this.field8398.field2889;
            if (this.field8398 == var2) {
                if (arg0 != 68) {
                    return;
                }
                field8411++;
                this.field8408 = null;
                return;
            }
            var2.method1318(8);
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)Lru;")
    public final class177 method3316(int arg0) {
        field8401++;
        if (arg0 != -7405) {
            this.method3320((byte) 32);
        }
        class177 var2 = this.field8398.field2887;
        if (this.field8398 == var2) {
            this.field8408 = null;
            return null;
        } else {
            this.field8408 = var2.field2887;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)Lru;")
    public final class177 method3317(int arg0) {
        if (arg0 != -121) {
            this.field8398 = null;
        }
        field8404++;
        class177 var2 = this.field8398.field2889;
        if (this.field8398 == var2) {
            this.field8408 = null;
            return null;
        } else {
            this.field8408 = var2.field2889;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V")
    public static void method3318(int arg0) {
        field8402 = null;
        field8409 = null;
        if (arg0 != -12570) {
            method3318(-5);
        }
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)V")
    public static final void method3319(int arg0) {
        class628.field9056 = true;
        if (arg0 != 120) {
            field8403 = 112;
        }
        field8400++;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)I")
    public final int method3320(byte arg0) {
        field8407++;
        int var2 = 0;
        if (arg0 >= -8) {
            this.method3317(-22);
        }
        for (class177 var3 = this.field8398.field2889; var3 != this.field8398; var3 = var3.field2889) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)Lru;")
    public final class177 method3321(int arg0) {
        field8410++;
        class177 var2 = this.field8408;
        if (this.field8398 == var2) {
            this.field8408 = null;
            return null;
        }
        this.field8408 = var2.field2889;
        if (arg0 != -121) {
            this.method3315((byte) -89);
        }
        return var2;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lru;I)V")
    public final void method3322(class177 arg0, int arg1) {
        if (arg0.field2887 != null) {
            arg0.method1318(8);
        }
        field8399++;
        arg0.field2887 = this.field8398.field2887;
        arg0.field2889 = this.field8398;
        arg0.field2887.field2889 = arg0;
        if (arg1 > -7) {
            this.method3316(69);
        }
        arg0.field2889.field2887 = arg0;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
    public class578() {
        this.field8398.field2889 = this.field8398;
        this.field8398.field2887 = this.field8398;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)Z")
    public final boolean method3323(byte arg0) {
        field8406++;
        if (arg0 > -46) {
            this.method3315((byte) 91);
        }
        return this.field8398.field2889 == this.field8398;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field8402[var1] = var0 / 4;
        }
    }
}
