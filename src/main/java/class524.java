import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class524 {

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "[F")
    public static float[] field7706 = new float[4];

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Lla;")
    public static class319 field7707 = new class319(96, 12);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field7708;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method3108(int arg0) {
        if (arg0 > -80) {
            method3108(69);
        }
        field7707 = null;
        field7708 = null;
        field7706 = null;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Lwh;")
    public static final class101 method3109(int arg0, int arg1) {
        field7705++;
        class101[] var2 = class254.method1646(false);
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class101 var4 = var2[var3];
            if (var4.field1469 == arg1) {
                return var4;
            }
        }
        return null;
    }
}
