import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class452 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "[I")
    public static int[] field6305 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field6307 = 0;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field6306;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "[Lsg;")
    public static class226[] field6309;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "[Lpg;")
    public static class437[] field6308;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method2803(int arg0) {
        field6308 = null;
        field6309 = null;
        field6305 = null;
        if (arg0 != 4) {
            field6308 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILnq;II)Lgi;")
    public static final class405 method2804(int arg0, class268 arg1, int arg2, int arg3) {
        field6306++;
        class11 var4 = new class11(arg1.method1745(arg2, (byte) -120, arg0));
        class405 var5 = new class405(arg2, var4.method171(-9265), var4.method171(-9265), var4.method185(25239), var4.method185(25239), var4.method172((byte) 52) == arg3, var4.method172((byte) 52), var4.method172((byte) 52));
        int var6 = var4.method172((byte) 52);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field5752.method643(new class278(var4.method172((byte) 52), var4.method174(255), var4.method174(255), var4.method174(255), var4.method174(arg3 ^ 0xFE), var4.method174(arg3 ^ 0xFE), var4.method174(255), var4.method174(255), var4.method174(255)), arg3 ^ 0xFFFFFFAE);
        }
        var5.method2546(-1777);
        return var5;
    }
}
