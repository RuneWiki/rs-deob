import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class258 {

    @OriginalMember(owner = "client!sda", name = "h", descriptor = "B")
    private byte field3157;

    @OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
    public int field3158;

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
    public int field3152;

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "I")
    public int field3155;

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
    public int field3154;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "Lpia;")
    public static class94 field3150 = new class94(15, 8);

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!sda", name = "j", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)V", line = 5)
    public static void method1545(byte arg0) {
        if (arg0 <= -87) {
            field3150 = null;
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIB)Lgp;", line = 16)
    public static final class47 method1546(int arg0, int arg1, byte arg2) {
        field3153++;
        class47 var3 = (class47) class382.field5225.method1754(false, (long) arg0 << 32 | (long) arg1);
        if (var3 == null) {
            var3 = new class47(arg0, arg1);
            class382.field5225.method1751(var3, 3970, var3.field1522);
        }
        if (arg2 != 121) {
            method1546(-112, -4, (byte) -16);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)I", line = 40)
    public final int method1547(int arg0) {
        if (arg0 == 8) {
            field3159++;
            return (this.field3157 & 0x8) == 8 ? 1 : 0;
        } else {
            return 17;
        }
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "()V", line = 57)
    public class258() {
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lig;)V", line = 61)
    public class258(class244 arg0) {
        this.field3157 = arg0.method1448((byte) -106);
        this.field3158 = arg0.method1476(-101);
        this.field3152 = arg0.method1438(104);
        this.field3155 = arg0.method1438(114);
        this.field3151 = arg0.method1438(103);
        this.field3154 = arg0.method1438(108);
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(B)I", line = 75)
    public final int method1548(byte arg0) {
        field3156++;
        int var2 = 70 / ((-arg0 - 17) / 52);
        return this.field3157 & 0x7;
    }
}
