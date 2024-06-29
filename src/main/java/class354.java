import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class354 extends class520 {

    @OriginalMember(owner = "client!kda", name = "i", descriptor = "[Lth;")
    public class553[] field4704;

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "[I")
    public static int[] field4700 = new int[14];

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "[Lba;")
    public static class352[] field4703 = new class352[300];

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "Llh;")
    public static class487 field4701 = new class487(13, -1);

    @OriginalMember(owner = "client!kda", name = "k", descriptor = "F")
    public static float field4706;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)V", line = 7)
    public static void method2032(int arg0) {
        field4700 = null;
        field4703 = null;
        field4701 = null;
        if (arg0 < 67) {
            field4705 = -41;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)Lfc;", line = 25)
    public static final class235 method2033(int arg0, int arg1) {
        field4702++;
        if (arg0 != -27378) {
            return null;
        }
        class235[] var2 = class249.method1535(109);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class235 var4 = var2[var3];
            if (var4.field3245 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "([Lth;)V", line = 54)
    public class354(class553[] arg0) {
        this.field4704 = arg0;
    }
}
