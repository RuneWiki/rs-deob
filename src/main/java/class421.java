import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class421 extends class347 {

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "B")
    public byte field6200 = 5;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "Lvp;")
    public static class123 field6192;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public int field6185;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public int field6186;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public int field6188;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public int field6191;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public int field6194;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public int field6196;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "Z")
    public boolean field6198;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method2577(int arg0, int arg1, String arg2) {
        if (arg1 < 80) {
            field6199 = -72;
        }
        field6195++;
        int var3 = class333.field5117;
        int[] var4 = class459.field6766;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class62 var7 = class390.field5783[var4[var6]];
            if (var7 != null && class95.field1558 != var7 && var7.field1094 != null && var7.field1094.equalsIgnoreCase(arg2)) {
                if (arg0 == 1) {
                    class248.field3576++;
                    class114.method841(false, class117.field1847);
                    class86.field1436.method1915((byte) -64, 0);
                    class86.field1436.method1874(var4[var6], (byte) -110);
                } else if (arg0 == 4) {
                    class283.field4128++;
                    class114.method841(false, class366.field5497);
                    class86.field1436.method1875(var4[var6], (byte) -91);
                    class86.field1436.method1915((byte) -96, 0);
                } else if (arg0 == 5) {
                    class13.field223++;
                    class114.method841(false, class187.field2781);
                    class86.field1436.method1923((byte) 62, 0);
                    class86.field1436.method1905(var4[var6], -98);
                } else if (arg0 == 6) {
                    class408.field5999++;
                    class114.method841(false, class202.field2923);
                    class86.field1436.method1924((byte) -117, 0);
                    class86.field1436.method1874(var4[var6], (byte) -110);
                } else if (arg0 == 7) {
                    class114.method841(false, class451.field6585);
                    class106.field1665++;
                    class86.field1436.method1875(var4[var6], (byte) -91);
                    class86.field1436.method1914(-103, 0);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class460.method2756(class447.field6545.method1273(true, class370.field5530) + arg2, false);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)Ltn;")
    public static final class58 method2578(int arg0, int arg1) {
        field6190++;
        int var2 = arg1 >> 16;
        if (arg0 != -4179) {
            method2578(124, 25);
        }
        int var3 = arg1 & 0xFFFF;
        if (class416.field6157[var2] == null || class416.field6157[var2][var3] == null) {
            boolean var4 = class91.method738(false, var2);
            if (!var4) {
                return null;
            }
        }
        return class416.field6157[var2][var3];
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB)I")
    public static final int method2579(int arg0, int arg1, byte arg2) {
        field6189++;
        int var3 = 71 % ((arg2 - 91) / 32);
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var4 = (arg1 & 0x7F) * arg0 >> 7;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg1 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
    public static void method2580(int arg0) {
        field6192 = null;
        if (arg0 != 2) {
            method2578(-103, 40);
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(II)V")
    public static final void method2581(int arg0, int arg1) {
        if (arg0 < 75) {
            field6199 = -35;
        }
        field6193++;
        class219.field3159 = arg1;
        class455.field6737.method2349(0);
    }

    static {
        new class180("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field6192 = new class123(35, 7);
    }
}
