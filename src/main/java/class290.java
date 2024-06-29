import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class290 {

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public int field4164 = 0;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "Lao;")
    public static class188 field4161 = new class188(109, -1);

    @OriginalMember(owner = "client!un", name = "h", descriptor = "Ldq;")
    public static class489 field4165 = new class489(12, 16);

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
    public static void method1801(byte arg0) {
        field4165 = null;
        if (arg0 > 87) {
            field4161 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILqa;)V")
    public static final void method1802(int arg0, class162 arg1) {
        arg1.method509(0, 0, class112.field1780, 350);
        field4163++;
        arg1.method471(0, 0, class112.field1780, 350, class134.field2069 << 24 | 0x332277, 1);
        int var2 = 350 / class507.field7417;
        if (class227.field3337 > 0) {
            int var3 = 346 - class507.field7417 - 4;
            int var4 = var2 * var3 / (class227.field3337 + var2 - 1);
            int var5 = 4;
            if (class227.field3337 > 1) {
                var5 += (class227.field3337 - class337.field5142 - 1) * (var3 - var4) / (class227.field3337 - 1);
            }
            arg1.method471(class112.field1780 - 16, var5, 12, var4, class134.field2069 << 24 | 0x332277, 2);
            for (int var6 = class337.field5142; (class337.field5142 + var2) > var6 && var6 < class227.field3337; var6++) {
                String[] var7 = class82.method650(false, '\b', class82.field1358[var6]);
                int var8 = (class112.field1780 - 8 - 16) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = (var8 * var9) + 8;
                    arg1.method509(var10, 0, var10 + var8 - 8, 350);
                    class55.field808.method2912(-16777216, 350 - ((var6 - class337.field5142) * class507.field7417) - class42.field639.field201 - class436.field6340 - 2, -1, var10, var7[var9], (byte) -50);
                }
            }
        }
        arg1.method509(0, arg0, class112.field1780, 350);
        arg1.method1173(-120, 0, -1, class112.field1780, 350 - class436.field6340);
        class526.field7731.method2912(-16777216, 349 - class476.field6998.field201, -1, 10, "--> " + class41.field633, (byte) -74);
        int var11 = -1;
        if ((class180.field2734 % 30) > 15) {
            var11 = 16777215;
        }
        arg1.method1169(arg0 - 29109, var11, 12, class476.field6998.method105("--> " + class41.field633.substring(0, class192.field2812), 1) + 10, -class476.field6998.field201 + -11 + 350);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BLti;)V")
    public final void method1803(byte arg0, class303 arg1) {
        if (arg0 != -32) {
            this.method1803((byte) -126, null);
        }
        while (true) {
            int var3 = arg1.method1918((byte) 111);
            if (var3 == 0) {
                field4158++;
                return;
            }
            this.method1804(var3, 5, arg1);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IILti;)V")
    private final void method1804(int arg0, int arg1, class303 arg2) {
        if (arg0 == arg1) {
            this.field4164 = arg2.method1868(0);
        }
        field4160++;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ltn;B)Ltn;")
    public static final class58 method1805(class58 arg0, byte arg1) {
        if (arg1 != 71) {
            method1805(null, (byte) 40);
        }
        field4159++;
        if (arg0.field876 != -1) {
            return class421.method2578(arg1 ^ 0xFFFFEFEA, arg0.field876);
        }
        int var2 = arg0.field955 >>> 16;
        class422 var3 = new class422(class466.field6844);
        for (class183 var4 = (class183) var3.method2584(1384084872); var4 != null; var4 = (class183) var3.method2585(-1)) {
            if (var4.field2753 == var2) {
                return class421.method2578(-4179, (int) var4.field6399);
            }
        }
        return null;
    }
}
