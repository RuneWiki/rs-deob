import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class274 {

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field4368 = 0;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Llg;")
    public static class13 field4366 = null;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4371 = "yellow:";

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field4373 = 0;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field4367 = 0;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Lub;")
    public static class92 field4369;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "[I")
    public static int[] field4370;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)I")
    public static final int method1871(int arg0, int arg1, int arg2) {
        field4372++;
        class198 var3 = (class198) class94.field1480.method2043((long) arg1, -1);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = arg2; var5 < var3.field3078.length; var5++) {
                if (var3.field3086[var5] == arg0) {
                    var4 += var3.field3078[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
    public static void method1872(boolean arg0) {
        field4366 = null;
        field4371 = null;
        field4370 = null;
        field4369 = null;
        if (arg0) {
            field4370 = null;
        }
    }
}
