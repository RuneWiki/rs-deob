import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class28 {

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "[I")
    public static int[] field321 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field322 = 0;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "Ljava/lang/String;")
    public static String field325 = "Loaded fonts";

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 7)
    public static void method182(int arg0) {
        field325 = null;
        int var1 = 52 % ((arg0 + 27) / 37);
        field321 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)Lij;", line = 19)
    public static final class117 method183(int arg0, boolean arg1) {
        field323++;
        class117 var2 = (class117) class100.field1306.method1116(17301, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class161.field2300.method1089(1, (byte) 115, arg0);
        } else {
            var3 = class52.field680.method1089(1, (byte) 112, arg0 & 0x7FFF);
        }
        class117 var4 = new class117();
        if (var3 != null) {
            var4.method859(new class299(var3), 0);
        }
        if (!arg1) {
            method184((byte) 59, -17);
        }
        if (arg0 >= 32768) {
            var4.method861(90);
        }
        class100.field1306.method1115((long) arg0, 69, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 61)
    public static final String method184(byte arg0, int arg1) {
        if (arg0 < 74) {
            method182(-68);
        }
        field319++;
        return class328.field4805[arg1].length() <= 0 ? class185.field2524[arg1] : class185.field2524[arg1] + class91.field1156 + class328.field4805[arg1];
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V", line = 79)
    public static final void method185(int arg0) {
        field320++;
        class268.field3861.method2262(false);
        if (arg0 == -14307) {
            class357.field5586.method2262(false);
        }
    }
}
