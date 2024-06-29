import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class231 extends class86 {

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public int field3228;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Lwt;")
    public static class194 field3225 = new class194("red:", "rot:", "rouge:", "vermelho:");

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "Lgn;")
    public static class475 field3229 = new class475(70, -1);

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field3230 = 0;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field3231 = 205;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "Liu;")
    public static class390 field3232 = new class390(49, -1);

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method1406(int arg0) {
        field3229 = null;
        if (arg0 <= 55) {
            field3229 = null;
        }
        field3225 = null;
        field3232 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIILuf;)V")
    public static final void method1407(int arg0, int arg1, int arg2, int arg3, class296 arg4) {
        class468 var5 = class323.method1937(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field4325 = (arg1 << class41.field628) + class170.field2281;
        arg4.field4316 = arg3;
        arg4.field4323 = (arg2 << class41.field628) + class170.field2281;
        for (class323 var7 = var5.field6769; var7 != null; var7 = var7.field4727) {
            if (var7.field4726.field2967) {
                int var8 = var7.field4726.method724((byte) -32);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field4316 += var6;
            arg4.field4322 = true;
        }
        var5.field6770 = arg4;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(II)V")
    public class231(int arg0, int arg1) {
        this.field3226 = arg0;
        this.field3228 = arg1;
    }
}
