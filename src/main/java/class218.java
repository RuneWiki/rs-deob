import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class218 {

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "B")
    private byte field3133;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public int field3128;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public int field3127;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public int field3130;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field3132 = -1;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)I")
    public final int method1516(byte arg0) {
        field3125++;
        int var2 = 38 / ((27 - arg0) / 34);
        return this.field3133 & 0x7;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLtj;)V")
    public static final void method1517(byte arg0, class108 arg1) {
        if (arg0 > -31) {
            method1517((byte) 64, (class108) null);
        }
        field3131++;
        class43.field587 = arg1;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class218() {
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)I")
    public final int method1518(byte arg0) {
        if (arg0 != -46) {
            this.method1518((byte) 104);
        }
        field3134++;
        return (this.field3133 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Llf;)V")
    public class218(class130 arg0) {
        this.field3133 = arg0.method823((byte) 114);
        this.field3135 = arg0.method798(false);
        this.field3128 = arg0.method815(true);
        this.field3126 = arg0.method815(true);
        this.field3127 = arg0.method815(true);
        this.field3130 = arg0.method815(true);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(CBLjava/lang/String;)I")
    public static final int method1519(char arg0, byte arg1, String arg2) {
        field3129++;
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0 == arg2.charAt(var5)) {
                var3++;
            }
        }
        if (arg1 >= 0) {
            method1519('-', (byte) -63, (String) null);
        }
        return var3;
    }
}
