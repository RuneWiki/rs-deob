import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class306 extends class97 {

    @OriginalMember(owner = "client!ps", name = "v", descriptor = "Ljava/lang/String;")
    public String field4623;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
    public int field4616;

    @OriginalMember(owner = "client!ps", name = "w", descriptor = "I")
    public int field4624;

    @OriginalMember(owner = "client!ps", name = "y", descriptor = "J")
    public long field4626;

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "Ljava/lang/String;")
    public String field4621;

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
    public int field4618;

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
    public int field4619;

    @OriginalMember(owner = "client!ps", name = "u", descriptor = "Z")
    public boolean field4622;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "Z")
    public boolean field4615;

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "Ljg;")
    public static class241 field4617 = new class241(64);

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "Ljg;")
    public static class241 field4627 = new class241(64);

    @OriginalMember(owner = "client!ps", name = "A", descriptor = "Z")
    public static boolean field4628 = false;

    @OriginalMember(owner = "client!ps", name = "D", descriptor = "[I")
    public static int[] field4631 = new int[2500];

    @OriginalMember(owner = "client!ps", name = "E", descriptor = "Lnn;")
    public static class151 field4632 = new class151("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!ps", name = "F", descriptor = "Ljg;")
    public static class241 field4633 = new class241(5);

    @OriginalMember(owner = "client!ps", name = "B", descriptor = "F")
    public static float field4629;

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!ps", name = "x", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!ps", name = "C", descriptor = "[Lod;")
    public static class411[] field4630;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lfh;B)V")
    public static final void method1881(class170 arg0, byte arg1) {
        field4625++;
        if (arg1 > -114) {
            return;
        }
        class170 var2 = class364.method2186(arg0, (byte) -111);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class161.field2232;
            var4 = class221.field3368;
        } else {
            var4 = var2.field2561;
            var3 = var2.field2501;
        }
        class205.method1211(126, var4, arg0, var3, false);
        class425.method2620(var4, arg0, var3, (byte) 75);
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)V")
    public static void method1882(int arg0) {
        field4632 = null;
        field4627 = null;
        field4631 = null;
        field4633 = null;
        field4630 = null;
        if (arg0 != 23344) {
            field4628 = false;
        }
        field4617 = null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1883(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != -100) {
            return;
        }
        field4620++;
        if (arg0 == arg2) {
            class236.method1425(arg3, arg1, (byte) -113, arg0, arg5);
        } else if (class192.field2917 <= arg5 - arg0 && (arg0 + arg5) <= class39.field497 && arg3 - arg2 >= class189.field2831 && (arg2 + arg3) <= class204.field3060) {
            class373.method2239(arg3, arg2, arg1, -87, arg0, arg5);
        } else {
            class330.method2027(arg1, arg2, arg0, (byte) 125, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJIIZZ)V")
    public class306(String arg0, String arg1, int arg2, int arg3, long arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.field4623 = arg0;
        this.field4616 = arg3;
        this.field4624 = arg2;
        this.field4626 = arg4;
        this.field4621 = arg1;
        this.field4618 = arg5;
        this.field4619 = arg6;
        this.field4622 = arg8;
        this.field4615 = arg7;
    }
}
