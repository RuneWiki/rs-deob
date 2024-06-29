import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class290 {

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "Z")
    public static boolean field4137 = false;

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "Llu;")
    public static class714 field4142 = new class714(0);

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field4146 = new String[100];

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    public static int field4147 = -1;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public int field4139;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public int field4140;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public int field4145;

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "[Lhu;")
    public static class133[] field4143;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public static final void method1799(int arg0) {
        field4144++;
        if (arg0 <= -8) {
            class384.field5373.method558(0);
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
    public static void method1800(int arg0) {
        field4143 = null;
        field4142 = null;
        field4146 = null;
        if (arg0 != -1) {
            field4142 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ILwd;)V")
    public static final void method1801(int arg0, class276 arg1) {
        if (arg0 <= 82) {
            field4147 = 35;
        }
        field4141++;
        for (int var2 = 0; var2 < class408.field5673; var2++) {
            int var3 = class189.field2853[var2];
            class383 var4 = class248.field3438[var3];
            int var5 = arg1.method3821((byte) 73);
            if ((var5 & 0x4) != 0) {
                var5 += arg1.method3821((byte) -51) << 8;
            }
            if ((var5 & 0x200) != 0) {
                var5 += arg1.method3821((byte) -112) << 16;
            }
            class589.method3215(var4, -5, arg1, var5, var3);
        }
    }
}
