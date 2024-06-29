import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class18 {

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "[I")
    public static int[] field170 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Ljava/lang/String;")
    public static String field176 = "Discard";

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "[I")
    public static int[] field175 = new int[13];

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "[I")
    public static int[] field171 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V")
    public static final void method81(int arg0, int arg1) {
        field178++;
        class114 var2 = class374.field5258;
        synchronized (class374.field5258) {
            class374.field5258.method614(-121, arg0);
            int var3 = 30 % ((arg1 + 2) / 43);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)V")
    public static final void method82(int arg0, byte arg1) {
        field172++;
        class87.field988 = arg0;
        class114 var2 = class203.field2718;
        synchronized (class203.field2718) {
            class203.field2718.method613(true);
        }
        if (arg1 != -17) {
            method83((byte) -16);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static void method83(byte arg0) {
        field176 = null;
        field171 = null;
        if (arg0 != 80) {
            method86(-71);
        }
        field170 = null;
        field175 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZIZ)Ljava/lang/String;")
    public static final String method84(int arg0, boolean arg1, int arg2, boolean arg3) {
        field177++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg3 && arg2 >= 0) {
            int var4 = 2;
            for (int var5 = arg2 / arg0; var5 != 0; var5 /= arg0) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            if (!arg1) {
                return null;
            }
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg0;
                int var9 = var8 - (arg0 * arg2);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static final void method85(int arg0) {
        class95.method517();
        field173++;
        if (arg0 != -2720) {
            field176 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public static final void method86(int arg0) {
        field174++;
        for (int var1 = 0; var1 < 5; var1++) {
            class118.field1473[var1] = false;
        }
        class128.field1658 = class308.field4177;
        class141.field1804 = -1;
        class306.field4149 = class175.field2197;
        class168.field2130 = 0;
        class294.field3993 = 5;
        class80.field889 = class234.field3224;
        class212.field2874 = class67.field700;
        class61.field622 = -1;
        class300.field4093 = class127.field1633;
        if (arg0 < 77) {
            method85(-108);
        }
        class177.field2216 = class180.field2272;
        class219.field2934 = 0;
    }
}
