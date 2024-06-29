import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class87 extends class416 {

    @OriginalMember(owner = "client!eda", name = "n", descriptor = "Z")
    public static boolean field1061 = false;

    @OriginalMember(owner = "client!eda", name = "q", descriptor = "Lrl;")
    public static class672 field1064 = new class672(52, 8);

    @OriginalMember(owner = "client!eda", name = "w", descriptor = "Lrl;")
    public static class672 field1070 = new class672(54, 3);

    @OriginalMember(owner = "client!eda", name = "r", descriptor = "F")
    public static float field1065;

    @OriginalMember(owner = "client!eda", name = "i", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "client!eda", name = "j", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "client!eda", name = "k", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!eda", name = "l", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "client!eda", name = "m", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!eda", name = "o", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!eda", name = "p", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "client!eda", name = "s", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!eda", name = "t", descriptor = "I")
    public int field1067;

    @OriginalMember(owner = "client!eda", name = "u", descriptor = "Lf;")
    public static class702 field1068;

    @OriginalMember(owner = "client!eda", name = "v", descriptor = "Ljava/lang/String;")
    public String field1069;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IC)Z")
    public static final boolean method799(int arg0, char arg1) {
        field1058++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        }
        if (arg1 != '\u0000') {
            char[] var2 = class43.field600;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg1 == var4) {
                    return true;
                }
            }
        }
        int var5 = 95 % ((66 - arg0) / 34);
        return false;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)V")
    public static final void method800(byte arg0) {
        if (arg0 != 7) {
            method800((byte) -46);
        }
        field1062++;
        class9.method191(-1, 255, arg0 + 4265);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V")
    public static void method801(int arg0) {
        field1068 = null;
        field1064 = null;
        if (arg0 != 52) {
            method801(-7);
        }
        field1070 = null;
    }
}
