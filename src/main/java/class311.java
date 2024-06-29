import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class311 {

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "Lc;")
    public static class331 field4920 = new class331();

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "[Luj;")
    public static class156[] field4922 = new class156[8];

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4925 = "cyan:";

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field4933 = -1;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public int field4919;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public int field4921;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public int field4923;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public int field4927;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public int field4928;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public int field4929;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public int field4931;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "[B")
    public byte[] field4930;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "[B")
    public byte[] field4932;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "[[S")
    public static short[][] field4934;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method2152(int arg0, int arg1, int arg2) {
        field4926++;
        if (!class207.field3515) {
            return false;
        }
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class109.field1852[var3] == null || class109.field1852[var3][var4] == null) {
            return false;
        }
        class137 var5 = class109.field1852[var3][var4];
        if (~arg1 == arg2 && var5.field2490 == 0) {
            for (int var6 = 0; var6 < class293.field4708; var6++) {
                if (class276.field4401[var6] == 11 || class276.field4401[var6] == 1002 || class276.field4401[var6] == 14 || class276.field4401[var6] == 38 || class276.field4401[var6] == 42) {
                    for (class137 var7 = class146.method1167(1169843632, class70.field1135[var6]); var7 != null; var7 = class190.method1439(1, var7)) {
                        if (var5.field2462 == var7.field2462) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class293.field4708; var8++) {
                if (class161.field2863[var8] == arg1 && class70.field1135[var8] == var5.field2462 && (class276.field4401[var8] == 11 || class276.field4401[var8] == 1002 || class276.field4401[var8] == 14 || class276.field4401[var8] == 38 || class276.field4401[var8] == 42)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 79)
    public static void method2153(int arg0) {
        field4920 = null;
        if (arg0 == -1003) {
            field4925 = null;
            field4934 = (short[][]) null;
            field4922 = null;
        }
    }
}
