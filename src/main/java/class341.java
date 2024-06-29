import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class341 {

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public int field5398;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public int field5407;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public int field5409;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Lhm;")
    public class24 field5400;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Z")
    public static boolean field5406 = false;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Lsf;")
    public static class124 field5402 = new class124(64);

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field5410 = 0;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field5403;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "[[B")
    public static byte[][] field5405;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "[[Lwl;")
    public static class102[][] field5399;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method2410(boolean arg0) {
        class79.field1400++;
        class51.field1038.method291((byte) 81, 189);
        field5404++;
        for (class355 var1 = (class355) class34.field758.method2345((byte) -117); var1 != null; var1 = (class355) class34.field758.method2336(-98)) {
            if (var1.field5661 == 0) {
                class6.method44(var1, true, (byte) -83);
            }
        }
        if (class140.field2371 != null) {
            class52.method459(128, class140.field2371);
            class140.field2371 = null;
        }
        if (!arg0) {
            method2410(false);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)I", line = 45)
    public static final int method2411(int arg0, byte arg1, int arg2) {
        if (arg1 != 127) {
            field5406 = false;
        }
        int var3 = class166.method1185(arg0 + 91923, arg2 + 45365, 4, (byte) -117) + ((class166.method1185(arg0 + 37821, arg2 + 10294, 2, (byte) 66) + -128 >> 1) - -(class166.method1185(arg0, arg2, 1, (byte) -109) - 128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        field5408++;
        return var4;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V", line = 72)
    public static void method2412(byte arg0) {
        field5405 = (byte[][]) null;
        field5402 = null;
        int var1 = 58 / ((arg0 - 69) / 36);
        field5399 = (class102[][]) null;
        field5403 = null;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IIII)V", line = 84)
    public class341(int arg0, int arg1, int arg2, int arg3) {
        class24 var5 = class15.method157(arg0, (byte) 118);
        this.field5398 = arg3;
        this.field5407 = arg2;
        this.field5409 = arg1;
        if (class241.field4016 || var5.field584 == -1) {
            this.field5400 = var5;
        } else {
            this.field5400 = class15.method157(var5.field584, (byte) 59);
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lhm;III)V", line = 104)
    public class341(class24 arg0, int arg1, int arg2, int arg3) {
        this.field5400 = arg0;
        this.field5407 = arg2;
        this.field5398 = arg3;
        this.field5409 = arg1;
    }
}
