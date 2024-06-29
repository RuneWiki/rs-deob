import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class225 {

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "B")
    private byte field3869;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public int field3863;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public int field3870;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public int field3866;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public int field3872;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public int field3858;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Leg;")
    public static class37 field3861 = class174.method1167(" ", -21);

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Leg;")
    public static class37 field3867 = class174.method1167("overlay", -80);

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Leg;")
    public static class37 field3860 = class174.method1167(" s(West connect-B)3", -24);

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "[I")
    public static int[] field3873 = new int[5];

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Ljl;")
    public static class101 field3865;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "Z")
    public static boolean field3868;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)I")
    public final int method1561(int arg0) {
        field3859++;
        if (arg0 != 10469) {
            field3864 = 62;
        }
        return (this.field3869 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;Z)Leg;")
    public static final class37 method1562(String arg0, boolean arg1) {
        field3862++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        class37 var3 = new class37();
        var3.field576 = 0;
        var3.field599 = var2;
        if (arg1) {
            return null;
        }
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field576++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static void method1563(byte arg0) {
        field3867 = null;
        field3873 = null;
        field3865 = null;
        field3860 = null;
        if (arg0 <= -79) {
            field3861 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)I")
    public final int method1564(byte arg0) {
        int var2 = 26 / (-arg0 / 63);
        field3874++;
        return this.field3869 & 0x7;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class225() {
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lva;)V")
    public class225(class187 arg0) {
        this.field3869 = arg0.method1269(255);
        this.field3863 = arg0.method1244(false);
        this.field3870 = arg0.method1290((byte) 90);
        this.field3866 = arg0.method1290((byte) 90);
        this.field3872 = arg0.method1290((byte) 90);
        this.field3858 = arg0.method1290((byte) 90);
    }
}
