import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class349 extends class416 {

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "[I")
    public static int[] field5578 = new int[4];

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "I")
    public int field5579;

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "I")
    public int field5581;

    @OriginalMember(owner = "client!dda", name = "n", descriptor = "I")
    public int field5583;

    @OriginalMember(owner = "client!dda", name = "o", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!dda", name = "p", descriptor = "I")
    public int field5585;

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "Lol;")
    public class260 field5582;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V", line = 4)
    public static void method2352(int arg0) {
        field5578 = null;
        if (arg0 >= -2) {
            method2352(24);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILjava/lang/String;)V", line = 17)
    public static final void method2353(int arg0, String arg1) {
        field5584++;
        if (!class145.field2450 || (class73.field918 & 0x18) == 0) {
            return;
        }
        boolean var2 = false;
        int var3 = class99.field1607;
        int[] var4 = class359.field5700;
        if (arg0 != 24348) {
            method2352(56);
        }
        for (int var5 = 0; var5 < var3; var5++) {
            class304 var6 = class597.field8465[var4[var5]];
            if (var6.field4792 != null && var6.field4792.equalsIgnoreCase(arg1) && (class567.field8141 == var6 && (class73.field918 & 0x10) != 0 || var6 != null && (class73.field918 & 0x8) != 0)) {
                class240.field3794++;
                class165 var7 = class271.method1917(class420.field6424, (byte) -68, class530.field7729);
                var7.field2776.method36((byte) -120, 0);
                var7.field2776.method59((byte) -93, class198.field3243);
                var7.field2776.method56(class219.field3577, true);
                var7.field2776.method56(class517.field7498, true);
                var7.field2776.method25(true, var4[var5]);
                class642.method3726(-684096285, var7);
                class388.method2522(var6.field4265[0], var6.method1841(20744), var6.field4264[0], var6.method1841(20744), 0, -2, (byte) 31, 0, true);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class307.method2122(4, class122.field1993.method1091(class135.field2206, 1) + arg1, (byte) 119);
        }
        if (class145.field2450) {
            class490.method3001((byte) 112);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(III)Z", line = 72)
    public static final boolean method2354(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method2353(-56, null);
        }
        field5580++;
        return (arg0 & 0x20) != 0;
    }
}
