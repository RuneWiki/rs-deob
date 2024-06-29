import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 extends class253 {

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public int field30;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "Ljd;")
    public static class85 field28 = class221.method1499("blinken3:", (byte) 98);

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "Ljd;")
    public static class85 field27 = class221.method1499("Fallen lassen", (byte) 112);

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
    public static int field38 = 3;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
    public static final void method9(byte arg0) {
        class56.field977 = -1;
        class85.field1593 = 0;
        class52.field902 = false;
        client.field2580 = 0;
        class197.field3380 = 0;
        class207.field3618.field4224 = 0;
        class181.field3100 = -1;
        class7.field79 = 0;
        if (arg0 != -70) {
            method10(114, 25);
        }
        field37++;
        class219.field3861 = 0;
        class115.field2058 = 0;
        class30.field451 = -1;
        class186.field3197 = -1;
        class189.field3249.field4224 = 0;
        for (int var1 = 0; var1 < class249.field4291.length; var1++) {
            if (class249.field4291[var1] != null) {
                class249.field4291[var1].field1007 = -1;
            }
        }
        for (int var2 = 0; var2 < class194.field3320.length; var2++) {
            if (class194.field3320[var2] != null) {
                class194.field3320[var2].field1007 = -1;
            }
        }
        class128.method871(32);
        class273.field4825 = 1;
        class169.method1136(true, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class20.field286[var3] = true;
        }
        class122.method835(arg0 + 70);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
    public static final void method10(int arg0, int arg1) {
        field34++;
        class171 var2 = class85.method579(arg1, arg1 ^ 0x7, arg0);
        var2.method1141(arg1 - 6463);
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
    public static void method11(int arg0) {
        if (arg0 > -126) {
            method10(-65, -42);
        }
        field27 = null;
        field28 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)Z")
    public final boolean method12(int arg0, int arg1, int arg2) {
        field25++;
        if (arg1 != -1) {
            method9((byte) -103);
        }
        return this.field31 <= arg0 && arg0 <= this.field32 && this.field30 <= arg2 && arg2 <= this.field26;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIII)V")
    public class3(int arg0, int arg1, int arg2, int arg3) {
        this.field32 = arg2;
        this.field30 = arg1;
        this.field26 = arg3;
        this.field31 = arg0;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lvb;IIIIII)V")
    public static final void method13(class58 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class92.method670(arg1, arg6, arg5, 1, arg4, arg2, arg0.field1027, arg0.field1042);
        field35++;
        int var7 = 85 % ((-arg3 - 40) / 41);
    }
}
