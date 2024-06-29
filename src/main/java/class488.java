import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class488 {

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Z")
    public boolean field6696 = true;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Lgo;")
    public static class581 field6699 = new class581(9, 0, 4, 1);

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "C")
    private char field6695;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public int field6697;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field6698;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field6700;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "Ljava/lang/String;")
    public String field6701;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLac;)V", line = 5)
    public final void method2769(byte arg0, class501 arg1) {
        while (true) {
            int var3 = arg1.method2874((byte) -75);
            if (var3 == 0) {
                int var4 = -47 / ((17 - arg0) / 54);
                field6698++;
                return;
            }
            this.method2771((byte) -63, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V", line = 26)
    public static void method2770(int arg0) {
        field6699 = null;
        if (arg0 != -11301) {
            field6699 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BLac;I)V", line = 39)
    private final void method2771(byte arg0, class501 arg1, int arg2) {
        field6694++;
        int var4 = 125 / ((21 - arg0) / 61);
        if (arg2 == 1) {
            this.field6695 = class435.method2490(-128, arg1.method2863(123));
        } else if (arg2 == 2) {
            this.field6697 = arg1.method2840(false);
        } else if (arg2 == 4) {
            this.field6696 = false;
        } else if (arg2 == 5) {
            this.field6701 = arg1.method2851((byte) -123);
            return;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Z", line = 66)
    public final boolean method2772(int arg0) {
        field6700++;
        if (arg0 <= 110) {
            this.method2772(24);
        }
        return this.field6695 == 's';
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lac;B)Ljava/lang/String;", line = 91)
    public static final String method2773(class501 arg0, byte arg1) {
        if (arg1 != 111) {
            field6699 = null;
        }
        field6693++;
        return class254.method1560(arg0, (byte) -64, 32767);
    }
}
