import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class126 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Z")
    public static boolean field2206 = false;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Z")
    public static boolean field2210 = true;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field2205 = 0;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "[I")
    public static int[] field2214 = new int[5];

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Lij;")
    public static class50 field2213 = class78.method578(126, ":assist:");

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Lij;")
    public static class50 field2209 = class78.method578(126, "showVideoAd");

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Ljava/awt/Frame;")
    public static Frame field2211;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lqi;")
    public static final class6 method905(Throwable arg0, String arg1) {
        field2207++;
        class6 var2;
        if (arg0 instanceof class6) {
            var2 = (class6) arg0;
            var2.field81 = var2.field81 + ' ' + arg1;
        } else {
            var2 = new class6(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public static void method906(boolean arg0) {
        field2214 = null;
        field2209 = null;
        field2213 = null;
        if (!arg0) {
            field2205 = -51;
        }
        field2211 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BZ)V")
    public static final void method907(byte arg0, boolean arg1) {
        field2212++;
        byte[][] var2 = class148.field2548;
        if (arg0 >= -22) {
            field2209 = null;
        }
        int var3 = class120.field2113.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class252.field4371[var4] & 0xFF) * 64 - class254.field4394;
                int var7 = (class252.field4371[var4] >> 8) * 64 - class61.field1124;
                class244.method1665(0);
                class188.method1267(arg1, class45.field826, var6, var7, 3, var5);
            }
        }
    }
}
