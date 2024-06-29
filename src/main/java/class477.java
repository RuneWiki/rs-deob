import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class class477 {

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Liu;")
    public static class390 field6866;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lgn;")
    public static class475 field6867;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Ljava/lang/String;")
    public static String field6870;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Z")
    public static boolean field6873;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Z")
    public static boolean field6872;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Ljava/lang/String;")
    public static String field6874;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lwt;")
    public static class194 field6868;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "F")
    public static float field6871;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field6865;

    static {
        new class256("", 73);
        field6866 = new class390(5, 0);
        field6867 = new class475(79, 2);
        field6869 = 0;
        field6870 = null;
        field6873 = true;
        field6872 = true;
        field6874 = "";
        field6868 = new class194("K", "T", "K", "K");
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2785(boolean arg0) {
        field6874 = null;
        field6868 = null;
        field6867 = null;
        field6866 = null;
        if (!arg0) {
            field6870 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 21)
    public static final void method2786(int arg0) {
        field6863++;
        class350.method2124(2, 22050, -97, class118.field1533.field6884);
        class289.field4142 = new class242();
        class289.field4142.method1508((byte) 48, 9, 128);
        class121.field1587 = class423.method2524(arg0 ^ 0xFFFFF612, 0, 22050, class498.field7590, class86.field1182);
        class121.field1587.method1712(class289.field4142, 106);
        if (arg0 != -1) {
            field6874 = null;
        }
        class335.method2027(class469.field6782, class238.field3338, -15729, class289.field4142, class380.field5671);
        class342.field4970 = class423.method2524(arg0 + 2542, 1, 2048, class498.field7590, class86.field1182);
        class375.field5607 = new class108();
        class342.field4970.method1712(class375.field5607, 16);
        class222.field3135 = new class100(22050, class266.field3763);
        class105.field1412 = class389.field5781.method1444("scape main", (byte) 83);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLhe;Lhe;)I", line = 45)
    public static final int method2787(byte arg0, class239 arg1, class239 arg2) {
        field6861++;
        int var3 = 0;
        if (arg1.method1442(class501.field7660, (byte) -116)) {
            var3++;
        }
        if (arg1.method1442(class43.field648, (byte) -122)) {
            var3++;
        }
        if (arg1.method1442(class216.field3042, (byte) -112)) {
            var3++;
        }
        if (arg2.method1442(class501.field7660, (byte) -122)) {
            var3++;
        }
        if (arg2.method1442(class43.field648, (byte) -120)) {
            var3++;
        }
        if (arg0 != 20) {
            method2789(-49, -111, 22, -1);
        }
        if (arg2.method1442(class216.field3042, (byte) -123)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(FFIF)F", line = 87)
    public static final float method2788(float arg0, float arg1, int arg2, float arg3) {
        field6864++;
        if (arg2 != -11001) {
            method2785(false);
        }
        return (arg0 - arg3) * arg1 + arg3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)I", line = 100)
    public static final int method2789(int arg0, int arg1, int arg2, int arg3) {
        field6862++;
        int var4 = arg0 / arg3;
        int var5 = arg3 - 1 & arg0;
        int var6 = arg1 / arg3;
        int var7 = arg3 - 1 & arg1;
        int var8 = class484.method2822(var6, (byte) -104, var4);
        int var9 = class484.method2822(var6, (byte) -104, var4 + 1);
        int var10 = class484.method2822(var6 + 1, (byte) -104, var4);
        int var11 = class484.method2822(var6 + 1, (byte) -104, var4 + 1);
        if (arg2 <= 125) {
            field6872 = false;
        }
        int var12 = class322.method1931(arg3, -22186, var8, var9, var5);
        int var13 = class322.method1931(arg3, -22186, var10, var11, var5);
        return class322.method1931(arg3, -22186, var12, var13, var7);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIFBIIFI[FFF)V")
    public abstract void method917(int arg0, int arg1, float arg2, byte arg3, int arg4, int arg5, float arg6, int arg7, float[] arg8, float arg9, float arg10);
}
