import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class147 {

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    private int field2355 = 0;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "Li;")
    private class58 field2353;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field2352 = 0;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Lqi;")
    private class137 field2357;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)Lqi;")
    public final class137 method1001(int arg0) {
        field2359++;
        if (arg0 != -28710) {
            this.field2353 = null;
        }
        this.field2355 = 0;
        return this.method1004(37);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILjava/awt/Component;II)Lw;")
    public static final class152 method1002(int arg0, Component arg1, int arg2, int arg3) {
        field2354++;
        try {
            Class var4 = Class.forName("dd");
            if (arg3 > -78) {
                return null;
            } else {
                class152 var5 = (class152) var4.getDeclaredConstructor().newInstance();
                var5.method974(arg2, arg1, arg0, (byte) 115);
                return var5;
            }
        } catch (Throwable var7) {
            class285 var6 = new class285();
            var6.method974(arg2, arg1, arg0, (byte) 115);
            return var6;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()V")
    public static final void method1003() {
        for (int var0 = 0; var0 < class198.field3188; var0++) {
            class90 var1 = class68.field1093[var0];
            class71.method497(var1);
            class68.field1093[var0] = null;
        }
        class198.field3188 = 0;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)Lqi;")
    public final class137 method1004(int arg0) {
        field2360++;
        if (this.field2355 > 0 && this.field2353.field831[this.field2355 - 1] != this.field2357) {
            class137 var2 = this.field2357;
            this.field2357 = var2.field2216;
            return var2;
        }
        while (this.field2353.field835 > this.field2355) {
            class137 var4 = this.field2353.field831[this.field2355++].field2216;
            if (this.field2353.field831[this.field2355 - 1] != var4) {
                this.field2357 = var4.field2216;
                return var4;
            }
        }
        int var3 = 15 % ((arg0 + 37) / 60);
        return null;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Li;)V")
    public class147(class58 arg0) {
        this.field2353 = arg0;
    }
}
