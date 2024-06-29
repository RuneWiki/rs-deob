import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class180 {

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public int field2935;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public int field2938;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
    public int field2945;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "[J")
    public static long[] field2939 = new long[256];

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "[[B")
    public static byte[][] field2944;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
    public static final void method1308(byte arg0) {
        class195.field3151.method1255(-74);
        class100.field1605.method1255(-127);
        if (arg0 < 48) {
            method1308((byte) -117);
        }
        class196.field3177.method1255(-126);
        field2943++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1309(int arg0, int arg1, byte arg2) {
        field2941++;
        if (!class286.field4537) {
            return false;
        }
        if (arg2 < 39) {
            method1313(-72);
        }
        int var3 = arg1 & 0xFFFF;
        int var4 = arg1 >> 16;
        if (class34.field519[var4] == null || class34.field519[var4][var3] == null) {
            return false;
        }
        class211 var5 = class34.field519[var4][var3];
        if (arg0 == -1 && var5.field3385 == 0) {
            for (int var6 = 0; var6 < class83.field1384; var6++) {
                if (class192.field3103[var6] == 9 || class192.field3103[var6] == 1005 || class192.field3103[var6] == 49 || class192.field3103[var6] == 12 || class192.field3103[var6] == 25) {
                    for (class211 var7 = class17.method87(class255.field4124[var6], -20055); var7 != null; var7 = class241.method1622((byte) -17, var7)) {
                        if (var5.field3375 == var7.field3375) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class83.field1384; var8++) {
                if (class64.field1076[var8] == arg0 && class255.field4124[var8] == var5.field3375 && (class192.field3103[var8] == 9 || class192.field3103[var8] == 1005 || class192.field3103[var8] == 49 || class192.field3103[var8] == 12 || class192.field3103[var8] == 25)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V")
    public static final void method1310(int arg0, int arg1) {
        class211.field3332.method1262(arg1, arg0 + 1731);
        if (arg0 != 1005) {
            method1308((byte) 41);
        }
        field2936++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Lwi;")
    public static final class245 method1311(int arg0, byte arg1) {
        field2940++;
        class245 var2 = (class245) class299.field4784.method1261(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class134.field2124.method1680(arg0, 1, -93);
        if (arg1 > -29) {
            field2939 = null;
        }
        class245 var4 = new class245();
        var4.field3898 = arg0;
        if (var3 != null) {
            var4.method1637(new class162(var3), (byte) -21);
        }
        var4.method1639(8881);
        if (var4.field3905 == 2 && class161.field2553.method1059(0, (long) arg0) == null) {
            class161.field2553.method1052((long) arg0, (byte) -65, new class281(class169.field2753));
            class234.field3776[class169.field2753++] = var4;
        }
        class299.field4784.method1264(-1, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
    public static final void method1312(byte arg0) {
        int var1 = 50 / ((-arg0 - 57) / 57);
        if (class46.field775 == 2) {
            if (class43.field624 == class236.field3792 && class265.field4257 == class177.field2905) {
                class46.field775 = 0;
                if (class298.field4759 && class100.field1627[81] && class83.field1384 > 2) {
                    class233.method1575(71, class83.field1384 - 2);
                } else {
                    class233.method1575(116, class83.field1384 - 1);
                }
            }
        } else if (class309.field4941 == class236.field3792 && class42.field609 == class177.field2905) {
            class46.field775 = 0;
            if (class298.field4759 && class100.field1627[81] && class83.field1384 > 2) {
                class233.method1575(97, class83.field1384 - 2);
            } else {
                class233.method1575(102, class83.field1384 - 1);
            }
        } else {
            class265.field4257 = class42.field609;
            class46.field775 = 2;
            class43.field624 = class309.field4941;
        }
        field2937++;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
    public static void method1313(int arg0) {
        field2944 = null;
        field2939 = null;
        if (arg0 != 9) {
            method1309(90, -24, (byte) -29);
        }
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class180() {
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lvc;)V")
    public class180(class180 arg0) {
        this.field2935 = arg0.field2935;
        this.field2938 = arg0.field2938;
        this.field2945 = arg0.field2945;
        this.field2934 = arg0.field2934;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2939[var0] = var1;
        }
    }
}
