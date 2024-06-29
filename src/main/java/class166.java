import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class166 extends class577 {

    @OriginalMember(owner = "client!wea", name = "u", descriptor = "Lfba;")
    public static class27 field2622 = new class27(59, 1);

    @OriginalMember(owner = "client!wea", name = "w", descriptor = "F")
    public static float field2624;

    @OriginalMember(owner = "client!wea", name = "l", descriptor = "I")
    public int field2613;

    @OriginalMember(owner = "client!wea", name = "m", descriptor = "I")
    public int field2614;

    @OriginalMember(owner = "client!wea", name = "o", descriptor = "I")
    public int field2616;

    @OriginalMember(owner = "client!wea", name = "p", descriptor = "I")
    public int field2617;

    @OriginalMember(owner = "client!wea", name = "q", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!wea", name = "s", descriptor = "I")
    public int field2620;

    @OriginalMember(owner = "client!wea", name = "t", descriptor = "I")
    public int field2621;

    @OriginalMember(owner = "client!wea", name = "x", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!wea", name = "y", descriptor = "Ltea;")
    public static class250 field2626;

    @OriginalMember(owner = "client!wea", name = "v", descriptor = "Lmea;")
    public class451 field2623;

    @OriginalMember(owner = "client!wea", name = "z", descriptor = "Lmea;")
    public class451 field2627;

    @OriginalMember(owner = "client!wea", name = "A", descriptor = "Ljava/lang/String;")
    public String field2628;

    @OriginalMember(owner = "client!wea", name = "n", descriptor = "Z")
    public boolean field2615;

    @OriginalMember(owner = "client!wea", name = "r", descriptor = "[Ljava/lang/Object;")
    public Object[] field2619;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(BI)Lmea;", line = 8)
    public static final class451 method1238(byte arg0, int arg1) {
        field2625++;
        if (arg0 > -19) {
            return null;
        }
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (class787.field10812[var2] == null || class787.field10812[var2][var3] == null) {
            boolean var4 = class217.method1490(var2, -1);
            if (!var4) {
                return null;
            }
        }
        return class787.field10812[var2][var3];
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Z)V", line = 34)
    public static void method1239(boolean arg0) {
        if (arg0) {
            method1238((byte) 17, 90);
        }
        field2622 = null;
        field2626 = null;
    }
}
