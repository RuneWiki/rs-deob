import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class195 {

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field3333 = 0;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Ljava/util/Random;")
    public static Random field3334 = new Random();

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lhf;")
    public static class197 field3336 = new class197(0, 0);

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "[Loe;")
    public static class55[] field3339 = new class55[50];

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Lda;")
    private static class275 field3341 = class255.method1672(102, "purple:");

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "Lda;")
    public static class275 field3337 = field3341;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Lda;")
    public static class275 field3338 = field3341;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "[Lrj;")
    public static class13[] field3340;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method1270(int arg0) {
        field3336 = null;
        field3339 = null;
        field3338 = null;
        field3341 = null;
        field3340 = null;
        field3334 = null;
        if (arg0 == 8) {
            field3337 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
    public static final void method1271(int arg0, int arg1) {
        if (arg1 == 8) {
            field3330++;
            class233.field4072.method988(arg0, -100);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIZII)V")
    public static final void method1272(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3332++;
        class184 var5 = class147.method1044(8, (byte) 114, arg0);
        var5.method1226((byte) 26);
        if (!arg2) {
            var5.field3148 = arg3;
            var5.field3151 = arg1;
            var5.field3145 = arg4;
        }
    }
}
