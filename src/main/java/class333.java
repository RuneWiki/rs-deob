import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class333 {

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    public static int field4631 = 0;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "Lir;")
    public static class226 field4634;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2096(int arg0, String arg1) {
        field4630++;
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class363.method2237(-403, var6);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        if (arg0 == 16383) {
            return new String(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
    public static void method2097(int arg0) {
        if (arg0 == -18267) {
            field4634 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(BLkk;)Ldr;")
    public static final class385 method2098(byte arg0, class161 arg1) {
        field4633++;
        if (arg0 <= 6) {
            method2096(36, (String) null);
        }
        class385 var2 = new class385();
        var2.field5278 = arg1.method1134(-16848);
        var2.field5279 = class172.method1244(32767, var2.field5278);
        return var2;
    }

    static {
        new class151((String) null, "die kürzlich gesprochen oder gehandelt haben.", (String) null, (String) null);
    }
}
