import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class67 extends class1 {

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "[B")
    public byte[] field1066;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "Ljava/lang/String;")
    public static String field1068 = "Examine";

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "[I")
    public static int[] field1065;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "[[[I")
    public static int[][][] field1072;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)I")
    public static final int method453(boolean arg0) {
        if (arg0) {
            return -88;
        } else {
            field1070++;
            return class99.field1563 && class140.field2048[81] && class218.field3278 > 2 ? client.field2371[class218.field3278 - 2] : client.field2371[class218.field3278 - 1];
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lpf;Lpf;B)V")
    public static final void method454(class294 arg0, class294 arg1, byte arg2) {
        field1069++;
        class99.field1565 = arg0;
        if (arg2 != 49) {
            field1072 = null;
        }
        class1.field9 = arg1;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        class99.field1565.method1976(1, 34);
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 41.0D) - 20;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class162.field2492 = var5 + var6;
        class290.field4572 = var3 + var5;
        class278.field4186 = var4 + var5;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "([B)V")
    public class67(byte[] arg0) {
        this.field1066 = arg0;
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)V")
    public static void method455(int arg0) {
        field1068 = null;
        field1065 = null;
        if (arg0 != 81) {
            method453(false);
        }
        field1072 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lpf;I)V")
    public static final void method456(class294 arg0, int arg1) {
        field1067++;
        if (arg1 != 21) {
            method455(70);
        }
        class258.field3939 = arg0;
        class183.field2759 = class258.field3939.method1976(1, 16);
    }
}
