import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class156 {

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public int field2479;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public int field2481;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    public int field2485;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public int field2477;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "Lwm;")
    public static class152 field2480 = class157.method1048("Attaquer", 106);

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public static int field2483 = 50;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "Lwm;")
    private static class152 field2482 = class157.method1048("Connected to update server", 95);

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "Lwm;")
    public static class152 field2478 = field2482;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "Lfd;")
    public static class243 field2473 = new class243(128);

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "Lhh;")
    public static class209 field2486;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Lef;")
    public static class322 field2474;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "[[[B")
    public static byte[][][] field2487;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ldd;I)V", line = 17)
    public static final void method1039(class249 arg0, int arg1) {
        if (arg1 < 31) {
            method1040(63, 3, -35, 42);
        }
        field2475++;
        int var2 = arg0.field4267 - class142.field2187;
        int var3 = arg0.field4184 * 128 + (arg0.method67(-4391) * 64);
        int var4 = arg0.field4235 * 128 + arg0.method67(-4391) * 64;
        arg0.field4231 += (var4 - arg0.field4231) / var2;
        if (arg0.field4176 == 0) {
            arg0.field4209 = 1024;
        }
        arg0.field4162 += (var3 - arg0.field4162) / var2;
        arg0.field4210 = 0;
        if (arg0.field4176 == 1) {
            arg0.field4209 = 1536;
        }
        if (arg0.field4176 == 2) {
            arg0.field4209 = 0;
        }
        if (arg0.field4176 == 3) {
            arg0.field4209 = 512;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIII)I", line = 80)
    public static final int method1040(int arg0, int arg1, int arg2, int arg3) {
        field2484++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 1023 - arg3;
        } else {
            if (arg0 >= -28) {
                field2483 = 8;
            }
            return var4 == 2 ? 1023 - arg2 : arg3;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)Lmj;", line = 107)
    public static final class229 method1041(int arg0) {
        int var1 = 78 / ((-arg0 - 16) / 41);
        class229 var2;
        if (class217.field3516) {
            var2 = new class309(class186.field2975, class193.field3068, class180.field2865[0], class179.field2856[0], class253.field4383[0], class8.field106[0], class23.field403[0], class134.field2070);
        } else {
            var2 = new class300(class186.field2975, class193.field3068, class180.field2865[0], class179.field2856[0], class253.field4383[0], class8.field106[0], class23.field403[0], class134.field2070);
        }
        class132.method841((byte) 90);
        field2476++;
        return var2;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V", line = 123)
    public class156() {
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lll;)V", line = 126)
    public class156(class156 arg0) {
        this.field2479 = arg0.field2479;
        this.field2481 = arg0.field2481;
        this.field2485 = arg0.field2485;
        this.field2477 = arg0.field2477;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V", line = 138)
    public static void method1042(int arg0) {
        if (arg0 <= 74) {
            return;
        }
        field2473 = null;
        field2478 = null;
        field2474 = null;
        field2486 = null;
        field2487 = (byte[][][]) null;
        field2482 = null;
        field2480 = null;
    }
}
