import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class231 extends class395 {

    @OriginalMember(owner = "client!bk", name = "T", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "Z")
    public static boolean field3492;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!bk", name = "V", descriptor = "Lus;")
    public static class1 field3497;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!bk", name = "U", descriptor = "[Ltr;")
    public static class176[] field3496;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)Z")
    public static final boolean method1468(int arg0) {
        if (arg0 == 0) {
            field3491++;
            return class476.field6690 > 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
    public static void method1469(byte arg0) {
        field3497 = null;
        if (arg0 == 50) {
            field3496 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIILjava/lang/Class;)Lnm;")
    public static final class304 method1470(int arg0, int arg1, int arg2, Class arg3) {
        class88 var4 = class330.field4786[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class93 var5 = var4.field1068; var5 != null; var5 = var5.field1178) {
            class304 var6 = var5.field1177;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field4330 == arg1 && var6.field4324 == arg2) {
                return var6;
            }
        }
        return null;
    }

    static {
        new class326("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field3495 = 0;
        field3492 = false;
        field3493 = 0;
        field3494 = -1;
        field3497 = new class1(102, 8);
    }
}
