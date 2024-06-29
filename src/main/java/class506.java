import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class506 {

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public int field7149;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public int field7154;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Lia;")
    public class506 field7160;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Lm;")
    public class165 field7159;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Z")
    public static boolean field7151 = false;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "[I")
    public static int[] field7157;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public int field7150;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public int field7152;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public int field7156;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public static void method3001(boolean arg0) {
        field7157 = null;
        if (arg0) {
            field7157 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)Lia;")
    public final class506 method3002(int arg0, int arg1) {
        if (arg0 == 0) {
            field7155++;
            return new class506(this.field7154, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(Z)Lvda;")
    public final class158 method3003(boolean arg0) {
        field7153++;
        if (arg0) {
            this.method3002(-78, -60);
        }
        return class286.method1778(this.field7154, (byte) -122);
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(II)V")
    public class506(int arg0, int arg1) {
        this.field7149 = arg1;
        this.field7154 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lia;I)V")
    public class506(class506 arg0, int arg1) {
        this.field7160 = arg0;
        this.field7149 = this.field7160.field7149 + arg1;
        this.field7154 = this.field7160.field7154;
        this.field7159 = this.field7160.field7159;
    }

    static {
        new class572(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
        field7157 = new int[14];
        field7158 = 0;
    }
}
