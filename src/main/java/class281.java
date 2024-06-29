import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class281 {

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "Z")
    public static boolean field3974 = false;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "Lkaa;")
    public static class47 field3981 = new class47(5, 7);

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "[F")
    public static float[] field3985 = new float[4];

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "B")
    public byte field3980;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "I")
    public int field3983;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "J")
    public static long field3982;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "Ljava/awt/Image;")
    public static Image field3984;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "Ljava/lang/String;")
    public String field3972;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "Ljava/lang/String;")
    public String field3973;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "Ljava/lang/String;")
    public String field3976;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "Ljava/lang/String;")
    public String field3977;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "[I")
    public static int[] field3978;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lwu;I)V")
    public static final void method1731(class376 arg0, int arg1) {
        int var2 = 121 % ((44 - arg1) / 61);
        class2.field28 = arg0.method2223((byte) 105, "p11_full");
        field3979++;
        class511.field6790 = arg0.method2223((byte) 112, "p12_full");
        class573.field7524 = arg0.method2223((byte) 61, "b12_full");
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public static void method1732(int arg0) {
        field3981 = null;
        field3985 = null;
        field3978 = null;
        field3984 = null;
        if (arg0 != -2001) {
            field3981 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)Z")
    public static final boolean method1733(int arg0) {
        field3975++;
        if (class436.field6017 == null) {
            return false;
        }
        if (class436.field6017.field5963 >= 2000) {
            class436.field6017.field5963 -= 2000;
        }
        if (class436.field6017.field5963 == 1003) {
            return true;
        } else {
            if (arg0 != -555) {
                method1732(52);
            }
            return false;
        }
    }
}
