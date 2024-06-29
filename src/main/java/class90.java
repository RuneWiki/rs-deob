import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class90 extends class182 {

    @OriginalMember(owner = "client!k", name = "z", descriptor = "Lsg;")
    private static class169 field1635 = class165.method1060("Type", 1536);

    @OriginalMember(owner = "client!k", name = "C", descriptor = "Lsg;")
    public static class169 field1638 = field1635;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "[I")
    public static int[] field1640 = new int[50];

    @OriginalMember(owner = "client!k", name = "H", descriptor = "Lua;")
    public static class181 field1643 = new class181(64);

    @OriginalMember(owner = "client!k", name = "O", descriptor = "Lsg;")
    private static class169 field1650 = class165.method1060("Your account is already logged in)3", 1536);

    @OriginalMember(owner = "client!k", name = "P", descriptor = "I")
    public static volatile int field1651 = 0;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "B")
    public static byte field1648 = 0;

    @OriginalMember(owner = "client!k", name = "L", descriptor = "I")
    public static int field1647 = 0;

    @OriginalMember(owner = "client!k", name = "K", descriptor = "Lsg;")
    public static class169 field1646 = field1650;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    public int field1632;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    public int field1634;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!k", name = "J", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "Lke;")
    public static class95 field1641;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "[I")
    public int[] field1631;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "[I")
    public int[] field1636;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "[I")
    public int[] field1639;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "[Lsh;")
    public class170[] field1630;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "[Lsh;")
    public class170[] field1642;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "[[[B")
    public byte[][][] field1649;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)Z")
    public static final boolean method526(int arg0, byte arg1) {
        field1644++;
        if (arg1 >= -15) {
            return false;
        } else {
            return (arg0 >> 20 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V")
    public static final void method527(int arg0) {
        for (int var1 = -1; var1 < class141.field2631; var1++) {
            int var3;
            if (var1 == -1) {
                var3 = 2047;
            } else {
                var3 = class202.field3932[var1];
            }
            class196 var4 = class65.field1213[var3];
            if (var4 != null) {
                class191.method1263((byte) 113, var4, 1);
            }
        }
        int var2 = 75 / ((arg0 + 45) / 43);
        field1637++;
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(I)V")
    public static void method528(int arg0) {
        field1646 = null;
        if (arg0 != 1668462) {
            field1648 = -115;
        }
        field1638 = null;
        field1640 = null;
        field1641 = null;
        field1635 = null;
        field1643 = null;
        field1650 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static final void method529(byte arg0) {
        if (arg0 != -105) {
            method528(37);
        }
        field1633++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class20.field436 - 1; var2++) {
                if (class149.field2746[var2] < 1000 && class149.field2746[var2 + 1] > 1000) {
                    var1 = false;
                    class169 var3 = class154.field2967[var2];
                    class154.field2967[var2] = class154.field2967[var2 + 1];
                    class154.field2967[var2 + 1] = var3;
                    class169 var4 = class63.field1166[var2];
                    class63.field1166[var2] = class63.field1166[var2 + 1];
                    class63.field1166[var2 + 1] = var4;
                    int var5 = class149.field2746[var2];
                    class149.field2746[var2] = class149.field2746[var2 + 1];
                    class149.field2746[var2 + 1] = var5;
                    int var6 = class123.field2271[var2];
                    class123.field2271[var2] = class123.field2271[var2 + 1];
                    class123.field2271[var2 + 1] = var6;
                    int var7 = class155.field2978[var2];
                    class155.field2978[var2] = class155.field2978[var2 + 1];
                    class155.field2978[var2 + 1] = var7;
                    int var8 = class22.field472[var2];
                    class22.field472[var2] = class22.field472[var2 + 1];
                    class22.field472[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lke;Lsg;Lsg;I)Lbg;")
    public static final class18 method530(class95 arg0, class169 arg1, class169 arg2, int arg3) {
        field1645++;
        int var4 = arg0.method553(-70, arg1);
        int var5 = arg0.method562(var4, arg2, arg3 ^ 0x6BE);
        if (arg3 != 25722) {
            field1650 = null;
        }
        return class200.method1309(0, arg0, var4, var5);
    }
}
