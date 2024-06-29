import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public abstract class class406 extends class307 {

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "Lpn;")
    public static class49 field5997 = new class49(54, 6);

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "Ljava/util/Random;")
    public static Random field5998 = new Random();

    @OriginalMember(owner = "client!tm", name = "m", descriptor = "I")
    public static int field6001 = 0;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "Lpn;")
    public static class49 field6000 = new class49(13, 0);

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "Ljava/lang/String;")
    public static String field6002 = "";

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "[I")
    public static int[] field6003;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)Lrh;")
    public abstract class32 method44(int arg0);

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
    public static void method2555(byte arg0) {
        field5997 = null;
        if (arg0 >= 105) {
            field6000 = null;
            field6002 = null;
            field6003 = null;
            field5998 = null;
        }
    }
}
