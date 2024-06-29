import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class278 {

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "J")
    public long field4527 = 0L;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field4524 = 0;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public static int field4542 = 1;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "Z")
    public static boolean field4540 = false;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4541 = "level: ";

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public int field4521;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public int field4522;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public int field4523;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public int field4525;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public int field4530;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public int field4531;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public int field4532;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public int field4535;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public int field4536;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public int field4538;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public int field4544;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "Lml;")
    public class152 field4529;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "Lek;")
    public static class206 field4543;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "Lsc;")
    public static class288 field4526;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 11)
    public static final void method1967(int arg0) {
        class345.field5444.method889((byte) 108);
        if (arg0 != 0) {
            method1967(116);
        }
        field4534++;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V", line = 35)
    public static void method1968(int arg0) {
        if (arg0 == 11799) {
            field4541 = null;
            field4543 = null;
            field4526 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 50)
    public static final void method1969(String arg0, byte arg1) {
        field4539++;
        if (arg0 == null) {
            return;
        }
        String var2 = class310.method2259(arg0, arg1 ^ 0xFFFFFFFA);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class317.field5171; var3++) {
            String var4 = class310.method2259(class306.field4974[var3], -15);
            if (var4 != null && var4.equals(var2)) {
                class317.field5171--;
                class199.field3333++;
                for (int var5 = var3; var5 < class317.field5171; var5++) {
                    class306.field4974[var5] = class306.field4974[var5 + 1];
                    class178.field2945[var5] = class178.field2945[var5 + 1];
                    class76.field1369[var5] = class76.field1369[var5 + 1];
                }
                class70.field1286 = class83.field1436;
                class51.field1038.method291((byte) 41, 126);
                class51.field1038.method1027(class148.method1066(arg0, (byte) 57), -20374);
                class51.field1038.method1012(arg0, (byte) 99);
                break;
            }
        }
        if (arg1 != 18) {
            field4526 = (class288) null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 110)
    public static final int method1970(String arg0, boolean arg1) {
        int var2 = arg0.length();
        field4537++;
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = arg0.charAt(var4) + ((var3 << 5) - var3);
        }
        if (arg1) {
            field4528 = 13;
        }
        return var3;
    }
}
