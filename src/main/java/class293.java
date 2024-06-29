import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class293 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Lcc;")
    public static class327 field4260 = new class327(50);

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4265 = "green:";

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4266 = new String[1000];

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field4267 = 0;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Lfh;")
    public static class140 field4264;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Lke;")
    public static class230 field4263;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 10)
    public static final void method2005(byte arg0) {
        field4262++;
        if (arg0 != -5) {
            return;
        }
        for (int var1 = 0; var1 < class186.field2553; var1++) {
            class201 var2 = class292.method2002((byte) -128, var1);
            if (var2 != null && var2.field2820 == 0) {
                class360.field5638[var1] = 0;
                class208.field2956[var1] = 0;
            }
        }
        class322.field4726 = new class329(16);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V", line = 44)
    public static final void method2006(int arg0, int arg1) {
        field4261++;
        class42 var2 = class166.method1242(4, arg1, arg0 - 1249071392);
        if (arg0 != 0) {
            field4266 = (String[]) null;
        }
        var2.method306((byte) -104);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLwf;)Ljava/lang/String;", line = 65)
    public static final String method2007(byte arg0, class333 arg1) {
        field4268++;
        if (client.method891(arg1).method1100(1105924391) == 0) {
            return null;
        } else if (arg1.field5214 == null || arg1.field5214.trim().length() == 0) {
            return class40.field503 ? "Hidden-use" : null;
        } else if (arg0 <= 114) {
            return (String) null;
        } else {
            return arg1.field5214;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 96)
    public static void method2008(int arg0) {
        field4260 = null;
        field4265 = null;
        field4264 = null;
        if (arg0 != 0) {
            field4265 = (String) null;
        }
        field4266 = null;
        field4263 = null;
    }
}
