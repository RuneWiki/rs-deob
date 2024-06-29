import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class55 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "[I")
    public static int[] field1154 = new int[50];

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field1157 = 0;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field1160 = 0;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field1161 = 20;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)Lw;")
    public static final class141 method349(boolean arg0) {
        int var1 = class198.field3583[0] * class181.field3289[0];
        field1158++;
        byte[] var2 = class191.field3425[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class103.field1965[class263.method1777(var2[var4], 255)];
        }
        class140 var5 = new class140(class240.field4200, class2.field46, class198.field3584[0], class46.field1003[0], class198.field3583[0], class181.field3289[0], var3);
        if (arg0) {
            method350(19);
        }
        class14.method111(0);
        return var5;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)Lje;")
    public static final class179 method350(int arg0) {
        field1156++;
        try {
            return arg0 == 17859 ? (class179) Class.forName("ck").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static void method351(byte arg0) {
        field1154 = null;
        int var1 = 19 % ((30 - arg0) / 37);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I")
    public static final int method352(int arg0, int arg1) {
        field1159++;
        if (arg1 != 1023) {
            field1160 = 71;
        }
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)V")
    public static final void method353(int arg0, int arg1) {
        field1161 = 1000 / arg1;
        field1155++;
        if (arg0 < 52) {
            field1162 = 106;
        }
    }
}
