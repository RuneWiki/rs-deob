import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class196 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field3157 = 0;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field3159 = 0;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Z")
    public static boolean field3158 = false;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field3162 = 1;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Lpf;")
    public static class17 field3156 = new class17(260);

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "[Lim;")
    public static class309[] field3167 = new class309[50];

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Lpb;")
    public static class141 field3164;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Ljl;")
    public static class16 field3166;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Ljh;")
    public static class238 field3165;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Ljava/awt/Image;")
    public static Image field3160;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method1397(int arg0) {
        field3167 = null;
        int var1 = 104 / ((-arg0 - 69) / 38);
        field3164 = null;
        field3160 = null;
        field3165 = null;
        field3156 = null;
        field3166 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)[Lbj;")
    public static final class92[] method1398(byte arg0) {
        field3163++;
        class92[] var1 = new class92[class206.field3317];
        if (arg0 != -41) {
            method1398((byte) -14);
        }
        for (int var2 = 0; var2 < class206.field3317; var2++) {
            int var3 = class43.field656[var2] * class297.field4859[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class289.field4758[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class185.field2952[class15.method84(var5[var6], 255)];
            }
            var1[var2] = new class92(class134.field2214, class253.field4293, class49.field842[var2], class73.field1283[var2], class297.field4859[var2], class43.field656[var2], var4);
        }
        class155.method1175(arg0 - 78);
        return var1;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILjl;)V")
    public static final void method1399(int arg0, class16 arg1) {
        field3166 = arg1;
        field3161++;
        if (arg0 != 0) {
            method1397(-8);
        }
    }
}
