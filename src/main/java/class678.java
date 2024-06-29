import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class678 extends class381 {

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public int field9594;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public int field9595;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Z")
    public static boolean field9598 = false;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field9593;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field9597;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field9599;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lks;")
    public static class421 field9596;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "[B")
    public static byte[] field9600;

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(II)V")
    public class678(int arg0, int arg1) {
        this.field9594 = arg0;
        this.field9595 = arg1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)Z")
    public static final boolean method3811(int arg0, int arg1, int arg2) {
        field9593++;
        if (arg1 >= -72) {
            return true;
        } else {
            return (arg0 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)Z")
    public static final boolean method3812(int arg0) {
        field9599++;
        if (arg0 != -30990) {
            field9596 = null;
        }
        return class177.field2475 == 0 ? class416.field6148.method3536((byte) -112) : true;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public static void method3813(boolean arg0) {
        field9596 = null;
        field9600 = null;
        if (arg0) {
            method3811(-111, -57, 103);
        }
    }
}
