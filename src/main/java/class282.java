import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class282 {

    @OriginalMember(owner = "client!j", name = "a", descriptor = "Lud;")
    public static class279 field5032 = class130.method1024("<col=ffb000>", 255);

    @OriginalMember(owner = "client!j", name = "f", descriptor = "[I")
    public static int[] field5037 = new int[14];

    @OriginalMember(owner = "client!j", name = "k", descriptor = "Lud;")
    public static class279 field5042 = class130.method1024(")4a=", 255);

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Lhc;")
    public static class171 field5034 = new class171(64);

    @OriginalMember(owner = "client!j", name = "d", descriptor = "F")
    public static float field5035;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public int field5038;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Lgd;")
    public class307 field5033;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "[I")
    public int[] field5041;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "[Lof;")
    public static class236[] field5039;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V", line = 12)
    public static void method2029(byte arg0) {
        field5042 = null;
        field5034 = null;
        field5037 = null;
        int var1 = 39 % ((arg0 - 20) / 51);
        field5039 = null;
        field5032 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)V", line = 28)
    public static final void method2030(int arg0, byte arg1) {
        field5040++;
        if (!class283.method2031(20714, arg0)) {
            return;
        }
        class8[] var2 = class18.field545[arg0];
        if (arg1 >= -2) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class8 var4 = var2[var3];
            if (var4 != null) {
                var4.field222 = 0;
                var4.field298 = 1;
                var4.field217 = 0;
            }
        }
    }
}
