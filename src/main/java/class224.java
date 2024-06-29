import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class224 extends class173 {

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "[B")
    public byte[] field3038;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "Ljf;")
    public static class667 field3039 = new class667();

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
    public static int field3042 = 0;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
    public static int field3043 = 0;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method1449(int arg0) {
        if (arg0 != -7184) {
            field3042 = 82;
        }
        field3039 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IJI)Ljava/lang/String;")
    public static final String method1450(int arg0, long arg1, int arg2) {
        field3040++;
        class525.method2886(74, arg1);
        int var4 = class368.field4508.get(5);
        int var5 = class368.field4508.get(arg0);
        int var6 = class368.field4508.get(1);
        return arg2 == 3 ? class230.method1478(arg1, (byte) 85, arg2) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class349.field4274[arg2][var5] + "-" + var6;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "([B)V")
    public class224(byte[] arg0) {
        this.field3038 = arg0;
    }
}
