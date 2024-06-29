import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class232 {

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public int field3504 = 0;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3506 = "white:";

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field3505 = 0;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "[I")
    public static int[] field3499;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "[S")
    public static short[] field3501;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BJ)V")
    public static final void method1478(byte arg0, long arg1) {
        field3507++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class154.field2307; var3++) {
            if (class35.field493[var3] == arg1) {
                class251.field3819++;
                class154.field2307--;
                for (int var4 = var3; var4 < class154.field2307; var4++) {
                    class35.field493[var4] = class35.field493[var4 + 1];
                    class71.field1130[var4] = class71.field1130[var4 + 1];
                    class27.field335[var4] = class27.field335[var4 + 1];
                }
                class112.field1724 = class68.field1077;
                class196.field2979.method1106(65, false);
                class196.field2979.method1610(791715792, arg1);
                break;
            }
        }
        if (arg0 != 82) {
            method1480(9, (byte) 24);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public static void method1479(int arg0) {
        int var1 = 126 % ((arg0 - 2) / 39);
        field3506 = null;
        field3499 = null;
        field3501 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)I")
    public static final int method1480(int arg0, byte arg1) {
        if (arg1 >= -108) {
            field3503 = 64;
        }
        field3500++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lfl;I)V")
    public final void method1481(class248 arg0, int arg1) {
        field3508++;
        while (true) {
            int var3 = arg0.method1593((byte) 27);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    field3506 = null;
                    return;
                }
            }
            this.method1482(26093, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILfl;)V")
    private final void method1482(int arg0, int arg1, class248 arg2) {
        field3502++;
        if (arg1 == 5) {
            this.field3504 = arg2.method1575(false);
        }
        if (arg0 != 26093) {
            method1479(87);
        }
    }
}
