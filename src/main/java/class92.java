import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class92 {

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "[I")
    private int[] field1635;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Lqk;")
    public static class207 field1631 = class24.method212(255, ")1a2)1m");

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lqk;")
    public static class207 field1630 = class24.method212(255, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Lqk;")
    public static class207 field1634 = class24.method212(255, "Nehmen");

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Lbf;")
    public static class199 field1628 = new class199(64);

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "Z")
    public static boolean field1638 = false;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Lqk;")
    public static class207 field1637 = class24.method212(255, " ");

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field1640 = -2;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "[Lm;")
    public static class115[] field1639;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "[[[B")
    public static byte[][][] field1632;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)I")
    public final int method662(int arg0, int arg1) {
        field1633++;
        int var3 = 90 % ((arg0 + 40) / 58);
        int var4 = (this.field1635.length >> 1) - 1;
        int var5 = arg1 & var4;
        while (true) {
            int var6 = this.field1635[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field1635[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var4 & var5 + 1;
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)I")
    public static final int method663(int arg0, int arg1) {
        field1629++;
        int var2 = 89 % ((-arg1 - 32) / 43);
        int var3 = arg0 & 0x3F;
        int var4 = arg0 >> 6 & 0x3;
        if (var3 == 18) {
            if (var4 == 0) {
                return 1;
            }
            if (var4 == 1) {
                return 2;
            }
            if (var4 == 2) {
                return 4;
            }
            if (var4 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var4 == 0) {
                return 16;
            }
            if (var4 == 1) {
                return 32;
            }
            if (var4 == 2) {
                return 64;
            }
            if (var4 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static void method664(byte arg0) {
        field1637 = null;
        field1631 = null;
        if (arg0 != 90) {
            field1640 = -28;
        }
        field1628 = null;
        field1634 = null;
        field1632 = null;
        field1639 = null;
        field1630 = null;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "([I)V")
    public class92(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field1635 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1635[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1635[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field1635[var5 + var5] = arg0[var4];
            this.field1635[var5 + var5 + 1] = var4++;
        }
    }
}
