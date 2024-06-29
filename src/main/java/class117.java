import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class117 extends class24 {

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public int field1817 = 0;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public int field1831 = -1;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field1820 = 0;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field1824 = 0;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field1822 = 0;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public int field1816;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public int field1819;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public int field1823;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public int field1825;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public int field1827;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    public int field1832;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V", line = 20)
    public static final void method846(boolean arg0) {
        field1830++;
        boolean var1 = arg0;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class22.field275 - 1; var2++) {
                if (class61.field804[var2] < 1000 && class61.field804[var2 + 1] > 1000) {
                    var1 = false;
                    class168 var3 = class274.field4606[var2];
                    class274.field4606[var2] = class274.field4606[var2 + 1];
                    class274.field4606[var2 + 1] = var3;
                    class168 var4 = class224.field3625[var2];
                    class224.field3625[var2] = class224.field3625[var2 + 1];
                    class224.field3625[var2 + 1] = var4;
                    int var5 = class77.field1046[var2];
                    class77.field1046[var2] = class77.field1046[var2 + 1];
                    class77.field1046[var2 + 1] = var5;
                    int var6 = class241.field3946[var2];
                    class241.field3946[var2] = class241.field3946[var2 + 1];
                    class241.field3946[var2 + 1] = var6;
                    short var7 = class61.field804[var2];
                    class61.field804[var2] = class61.field804[var2 + 1];
                    class61.field804[var2 + 1] = var7;
                    long var8 = class187.field2960[var2];
                    class187.field2960[var2] = class187.field2960[var2 + 1];
                    class187.field2960[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[B)[B", line = 78)
    public static final byte[] method847(int arg0, byte[] arg1) {
        field1818++;
        if (arg0 <= 25) {
            method846(true);
        }
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class185.method1308(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }
}
