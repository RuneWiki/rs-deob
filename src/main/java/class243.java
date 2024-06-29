import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class243 implements class303 {

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field3847 = -1;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Lgi;")
    public static class164 field3844;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(J[III)Ljava/lang/String;")
    public final String method1651(long arg0, int[] arg1, int arg2, int arg3) {
        field3843++;
        if (arg2 != -12) {
            return null;
        } else if (arg3 == 0) {
            class18 var6 = class144.method987((byte) 5, arg1[0]);
            return var6.method140((byte) -102, (int) arg0);
        } else if (arg3 == 1 || arg3 == 10) {
            class158 var7 = class107.method754(arg2 - 20551, (int) arg0);
            return var7.field2532;
        } else if (arg3 == 6 || arg3 == 7 || arg3 == 11) {
            return class144.method987((byte) 5, arg1[0]).method140((byte) -102, (int) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILgi;)V")
    public static final void method1652(int arg0, class164 arg1) {
        field3848++;
        class232.field3624 = arg1;
        if (arg0 < 49) {
            method1655(41);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
    public static final void method1653(boolean arg0) {
        if (arg0) {
            field3844 = null;
        }
        if (class80.field1296 != null) {
            class80.field1296.method115(255);
        }
        field3845++;
        if (class122.field1939 != null) {
            class122.field1939.method115(255);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lrg;B)V")
    public static final void method1654(class248 arg0, byte arg1) {
        field3849++;
        class248 var2 = class58.method370(false, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class195.field3161;
            var4 = class154.field2463;
        } else {
            var3 = var2.field4057;
            var4 = var2.field4016;
        }
        class161.method1104(var4, arg0, -89, var3, false);
        int var5 = 67 / ((arg1 - 81) / 42);
        class28.method216(arg0, var3, var4, -126);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static void method1655(int arg0) {
        if (arg0 == 2680) {
            field3844 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)I")
    public static final int method1656(int arg0) {
        field3846++;
        int var1 = 78 / ((arg0 - 24) / 62);
        return ((class44.field654 == 0 ? 0 : 1) << 21) + ((class129.field2066 == 0 ? 0 : 1) << 20) + (class265.field4313 << 17) + ((class131.field2101 ? 1 : 0) << 15) + ((class240.field3761 & 0x3) << 11) + (((class117.field1804 ? 1 : 0) << 8) + ((class101.field1586 ? 1 : 0) << 7) + ((class33.field545 ? 1 : 0) << 4) + ((class24.field442 ? 1 : 0) << 3) + (class288.field4664 & 0x7) + (((class296.field4835 ? 1 : 0) << 5) - (-((class236.field3701 ? 1 : 0) << 6) + -((class4.field95 ? 1 : 0) << 9)) - (-((class277.field4524 ? 1 : 0) << 10) + -((class244.field3867 ? 1 : 0) << 13))) - (-((class143.field2314 ? 1 : 0) << 16) - ((class127.field2032 ? 1 : 0) << 19) - (((class66.field1067 == 0 ? 0 : 1) << 22) - -(class181.method1272() << 23))));
    }
}
