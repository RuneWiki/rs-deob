import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class297 extends class15 {

    @OriginalMember(owner = "client!vm", name = "L", descriptor = "Lmg;")
    public class59 field4937;

    @OriginalMember(owner = "client!vm", name = "M", descriptor = "Lml;")
    public static class160 field4938 = new class160(500);

    @OriginalMember(owner = "client!vm", name = "N", descriptor = "Lce;")
    public static class126 field4939 = class206.method1445(-7923, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!vm", name = "Q", descriptor = "Z")
    public static boolean field4942 = true;

    @OriginalMember(owner = "client!vm", name = "S", descriptor = "I")
    public static int field4944 = 0;

    @OriginalMember(owner = "client!vm", name = "T", descriptor = "I")
    public static int field4945 = 0;

    @OriginalMember(owner = "client!vm", name = "K", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!vm", name = "P", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!vm", name = "R", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!vm", name = "O", descriptor = "[[[Lma;")
    public static class5[][][] field4940;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lgd;I)V", line = 7)
    public static final void method2002(class138 arg0, int arg1) {
        if (class249.field4174 == arg0.field2479 || arg0.field2476 == -1 || arg0.field2449 != 0 || arg0.field2484 + 1 > class110.method721(-128, arg0.field2476).field4905[arg0.field2509]) {
            int var2 = arg0.field2479 - arg0.field2455;
            int var3 = class249.field4174 - arg0.field2455;
            int var4 = arg0.field2469 * 128 + arg0.method1013(false) * 64;
            int var5 = arg0.field2452 * 128 + (arg0.method1013(false) * 64);
            int var6 = arg0.field2512 * 128 + arg0.method1013(false) * 64;
            int var7 = arg0.field2450 * 128 + (arg0.method1013(false) * 64);
            arg0.field2461 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg0.field2487 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        arg0.field2490 = 0;
        if (arg0.field2499 == 0) {
            arg0.field2444 = 1024;
        }
        field4941++;
        if (arg0.field2499 == 1) {
            arg0.field2444 = 1536;
        }
        if (arg0.field2499 == 2) {
            arg0.field2444 = 0;
        }
        if (arg0.field2499 == 3) {
            arg0.field2444 = 512;
        }
        arg0.field2483 = arg0.field2444;
        if (arg1 != 27461) {
            method2002((class138) null, -39);
        }
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(II)V", line = 51)
    public static final void method2003(int arg0, int arg1) {
        field4943++;
        class68 var2 = class183.field3191.method1630((byte) 56);
        if (arg1 >= -57) {
            method2003(63, -70);
        }
        while (var2 != null) {
            if ((var2.field1117 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method499((byte) 64);
            }
            var2 = class183.field3191.method1632(-126);
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lmg;)V", line = 94)
    public class297(class59 arg0) {
        this.field4937 = arg0;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V", line = 103)
    public static void method2004(int arg0) {
        if (arg0 > -78) {
            field4939 = (class126) null;
        }
        field4940 = (class5[][][]) null;
        field4939 = null;
        field4938 = null;
    }
}
