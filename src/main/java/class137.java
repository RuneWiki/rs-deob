import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class137 {

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field2274 = 0;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lta;")
    public static class300 field2273 = new class300(64);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "[I")
    public static int[] field2275;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 4)
    public static final void method1036(boolean arg0, String arg1) {
        field2271++;
        if (!arg0) {
            field2273 = (class300) null;
        }
        if (arg1 == null) {
            return;
        }
        String var2 = class81.method660(arg1, -239);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class93.field1561; var3++) {
            String var4 = class81.method660(class239.field3946[var3], -239);
            if (var4 != null && var4.equals(var2)) {
                class93.field1561--;
                for (int var5 = var3; var5 < class93.field1561; var5++) {
                    class239.field3946[var5] = class239.field3946[var5 + 1];
                    class92.field1553[var5] = class92.field1553[var5 + 1];
                    class362.field5745[var5] = class362.field5745[var5 + 1];
                }
                class44.field683 = class55.field908;
                class238.field3931++;
                class36.field520.method2228(19, 16547);
                class36.field520.method1712(class163.method1261(1, arg1), -80);
                class36.field520.method1709(arg1, (byte) 125);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V", line = 67)
    public static void method1037(byte arg0) {
        field2275 = null;
        field2273 = null;
        int var1 = 124 / ((-arg0 - 38) / 55);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)I", line = 77)
    public static final int method1038(boolean arg0) {
        field2272++;
        if (class129.field2192) {
            return 0;
        }
        if (!arg0) {
            method1037((byte) -56);
        }
        if (class215.method1621(25)) {
            return class160.field2561 ? 2 : 1;
        } else {
            return 1;
        }
    }
}
