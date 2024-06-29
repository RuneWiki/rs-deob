import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class166 {

    @OriginalMember(owner = "client!me", name = "e", descriptor = "Lh;")
    private class571 field2385 = new class571(256);

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Lgi;")
    private class583 field2384;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Ln;")
    private class17 field2381;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Llf;")
    public static class200 field2388 = new class200();

    @OriginalMember(owner = "client!me", name = "k", descriptor = "F")
    public static float field2391;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "F")
    public static float field2392;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2390;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public final void method1063(int arg0) {
        if (arg0 == 64) {
            this.field2385.method3246(false);
            field2387++;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)V")
    public static final void method1064(int arg0, int arg1, int arg2, int arg3) {
        field2386++;
        String var4 = "tele " + arg3 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
        System.out.println(var4);
        if (arg1 != -1601088218) {
            field2392 = -1.0849757F;
        }
        class557.method3165(0, false, var4, true);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public final void method1065(byte arg0) {
        this.field2385.method3253(5, -123);
        field2383++;
        if (arg0 != 101) {
            this.method1067(-43, (byte) 99);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static void method1066(int arg0) {
        field2388 = null;
        field2390 = null;
        if (arg0 != 3553) {
            method1064(6, -122, 92, 95);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)Lob;")
    public final class629 method1067(int arg0, byte arg1) {
        field2382++;
        Object var3 = this.field2385.method3252((long) arg0, (byte) 67);
        if (var3 != null) {
            return (class629) var3;
        } else if (this.field2381.method188(arg0, -106)) {
            if (arg1 != 121) {
                method1064(-63, -124, -124, -15);
            }
            class211 var4 = this.field2381.method190((byte) -89, arg0);
            int var5 = var4.field2965 ? 64 : this.field2384.field8190;
            class629 var7;
            if (var4.field2987 && this.field2384.method1328()) {
                float[] var6 = this.field2381.method187(arg0, var5, (byte) 121, var5, false, 0.7F);
                var7 = new class629(this.field2384, 3553, 34842, var5, var5, var4.field2980 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field2970) {
                    var8 = this.field2381.method185(false, 0.7F, var5, arg0, var5, (byte) 49);
                } else {
                    var8 = this.field2381.method186(true, arg0, 10350, var5, var5, 0.7F);
                }
                var7 = new class629(this.field2384, 3553, 6408, var5, var5, var4.field2980 != 0, var8, false);
            }
            var7.method3666(36, var4.field2985, var4.field2974);
            this.field2385.method3243(var7, (long) arg0, 60);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lgi;Ln;)V")
    public class166(class583 arg0, class17 arg1) {
        this.field2384 = arg0;
        this.field2381 = arg1;
    }
}
