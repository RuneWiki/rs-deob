import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class260 {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Lcc;")
    public static class222 field4115 = null;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "F")
    public static float field4118 = 0.0F;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "[I")
    public static int[] field4113 = new int[32];

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "F")
    public static float field4119;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Lub;")
    public static class92 field4121;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1743(String arg0, String arg1, String arg2, int arg3) {
        field4116++;
        int var4 = arg2.length();
        int var5 = arg1.length();
        int var6 = arg0.length();
        if (~var5 == arg3) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg2.indexOf(arg1, var9);
                if (var10 < 0) {
                    break;
                }
                var7 += var8;
                var9 = var5 + var10;
            }
        }
        StringBuffer var11 = new StringBuffer(var7);
        int var12 = 0;
        while (true) {
            int var13 = arg2.indexOf(arg1, var12);
            if (var13 < 0) {
                var11.append(arg2.substring(var12));
                return var11.toString();
            }
            var11.append(arg2.substring(var12, var13));
            var12 = var5 + var13;
            var11.append(arg0);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static void method1744(byte arg0) {
        field4121 = null;
        int var1 = 53 / ((arg0 - 14) / 43);
        field4113 = null;
        field4115 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)V")
    public static final void method1745(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return;
        }
        field4120++;
        int var3 = class85.field1274 * arg2 >> 8;
        if (arg0 == -1 && !class41.field697) {
            class180.method1290((byte) 116);
        } else if (arg0 != -1 && (class75.field1164 != arg0 || !class257.method1735((byte) 113)) && var3 != 0 && !class41.field697) {
            class296.method1986(false, arg0, -23335, 2, var3, 0, class205.field3153);
        }
        class75.field1164 = arg0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static final void method1746(int arg0) {
        class94.field1480 = new class305(arg0);
        field4117++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method1747(byte arg0, String arg1) {
        field4114++;
        if (arg0 < 97) {
            field4119 = 0.12656194F;
        }
        if (class183.field2895 == null || arg1.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class183.field2895.field4783; var2++) {
            if (class183.method1313(0, method1743(" ", "<br>", class183.field2895.field4797[var2], -1), arg1)) {
                return var2;
            }
        }
        return -1;
    }
}
