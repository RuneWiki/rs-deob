import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class164 {

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field2287 = 104;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "[Z")
    public static boolean[] field2290 = new boolean[8];

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field2288 = 0;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field2292 = 0;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZLvh;IZ)V", line = 4)
    public static final void method1057(boolean arg0, class201 arg1, int arg2, boolean arg3) {
        field2293++;
        int var4 = arg1.field2776;
        int var5 = (int) arg1.field5248;
        arg1.method2290((byte) 98);
        if (arg0) {
            class242.method1534(arg2 ^ 0x37, var4);
        }
        class351.method2242(-4113, var4);
        if (arg2 != 0) {
            return;
        }
        class119 var6 = class179.method1170(var5, arg2 ^ 0x30C251F0);
        if (var6 != null) {
            class101.method543((byte) 115, var6);
        }
        class94.method505(false);
        if (!arg3 && class424.field6086 != -1) {
            class237.method1513(1, class424.field6086, 65079);
        }
        class221 var7 = new class221(class396.field5783);
        for (class201 var8 = (class201) var7.method1438(59); var8 != null; var8 = (class201) var7.method1439((byte) -1)) {
            if (!var8.method2289(124)) {
                var8 = (class201) var7.method1438(30);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field2771 == 3) {
                int var9 = (int) var8.field5248;
                if (var9 >>> 16 == var4) {
                    method1057(true, var8, 0, arg3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 63)
    public static void method1058(byte arg0) {
        field2290 = null;
        if (arg0 > -36) {
            method1057(false, (class201) null, -106, true);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)I", line = 96)
    public static int method1059(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
