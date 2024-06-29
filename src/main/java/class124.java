import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class124 {

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Lrg;")
    public static class248 field1973 = null;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "[I")
    public static int[] field1970 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIBI)V")
    public static final void method849(int arg0, int arg1, byte arg2, int arg3) {
        field1974++;
        int var4 = class44.field654 * arg1 >> 8;
        int var5 = 40 / ((55 - arg2) / 56);
        if (var4 != 0 && arg3 != -1) {
            class251.method1707(-28138, false, arg3, var4, class221.field3482, 0);
            class85.field1355 = true;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method850(int arg0) {
        field1973 = null;
        field1970 = null;
        if (arg0 < 56) {
            field1970 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)I")
    public static final int method851(int arg0) {
        field1971++;
        if (arg0 != 0) {
            method853(-91, -38);
        }
        return 2;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
    public static final void method852(int arg0) {
        if (arg0 <= 1) {
            field1973 = null;
        }
        field1965++;
        for (int var1 = 0; var1 < class57.field830; var1++) {
            int var2 = class189.field3100[var1];
            class12 var3 = class28.field494[var2];
            int var4 = class229.field3584.method1849(255);
            if ((var4 & 0x40) != 0) {
                var4 += class229.field3584.method1849(255) << 8;
            }
            class41.method285((byte) 20, var3, var4, var2);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
    public static final void method853(int arg0, int arg1) {
        if (arg0 > -78) {
            method850(-38);
        }
        class146.field2348.method1880(-66, arg1);
        field1967++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BIILgi;)Le;")
    public static final class67 method854(byte arg0, int arg1, int arg2, class164 arg3) {
        field1972++;
        if (class284.method1927(arg1, (byte) -78, arg2, arg3)) {
            int var4 = 37 % ((54 - arg0) / 33);
            return class214.method1473(82);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
    public static final void method855(int arg0) {
        int var1 = -107 / ((arg0 + 46) / 62);
        field1966++;
        int[] var2 = new int[class140.field2283];
        int var3 = 0;
        for (int var4 = 0; var4 < class140.field2283; var4++) {
            class158 var6 = class107.method754(-20563, var4);
            if (var6.field2543 >= 0 || var6.field2549 >= 0) {
                var2[var3++] = var4;
            }
        }
        class178.field2953 = new int[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            class178.field2953[var5] = var2[var5];
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILfj;)Ljava/lang/String;")
    public static final String method856(int arg0, class274 arg1) {
        if (arg0 == 0) {
            field1968++;
            return class297.method2042(32767, -15156, arg1);
        } else {
            return null;
        }
    }
}
