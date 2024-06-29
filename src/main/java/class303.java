import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class303 {

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "J")
    public long field4858;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "Lih;")
    private class214 field4854;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Lfr;")
    public static class231 field4852 = new class231(10);

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Z")
    public static boolean field4857 = false;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Llo;")
    public static class306 field4855 = new class306("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "Lit;")
    public static class514 field4859;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "[I")
    public static int[] field4856;

    @OriginalMember(owner = "client!aj", name = "finalize", descriptor = "()V", line = 5)
    protected final void finalize() throws Throwable {
        this.field4854.method1414(true, this.field4858);
        field4851++;
        super.finalize();
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 14)
    public static void method1940(int arg0) {
        field4855 = null;
        field4852 = null;
        field4856 = null;
        if (arg0 != 0) {
            method1941(44, false, null);
        }
        field4859 = null;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lih;JI)V", line = 39)
    public class303(class214 arg0, long arg1, int arg2) {
        this.field4858 = arg1;
        this.field4854 = arg0;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 54)
    public static final void method1941(int arg0, boolean arg1, String arg2) {
        field4853++;
        if (arg2 == null) {
            return;
        }
        if (class14.field160 >= 100) {
            class467.method2774(class218.field3786.method1954(class300.field4813, -30366), (byte) 107);
            return;
        }
        String var3 = class162.method1121(arg2, 1);
        if (var3 == null) {
            return;
        }
        if (arg0 > -70) {
            field4856 = null;
        }
        for (int var4 = 0; var4 < class14.field160; var4++) {
            String var8 = class162.method1121(class322.field5057[var4], 1);
            if (var8 != null && var8.equals(var3)) {
                class467.method2774(arg2 + class64.field956.method1954(class300.field4813, -30366), (byte) 87);
                return;
            }
            if (class376.field5861[var4] != null) {
                String var9 = class162.method1121(class376.field5861[var4], 1);
                if (var9 != null && var9.equals(var3)) {
                    class467.method2774(arg2 + class64.field956.method1954(class300.field4813, -30366), (byte) 86);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class139.field2317; var5++) {
            String var6 = class162.method1121(class485.field7122[var5], 1);
            if (var6 != null && var6.equals(var3)) {
                class467.method2774(class35.field530.method1954(class300.field4813, -30366) + arg2 + class379.field5879.method1954(class300.field4813, -30366), (byte) 126);
                return;
            }
            if (class5.field48[var5] != null) {
                String var7 = class162.method1121(class5.field48[var5], 1);
                if (var7 != null && var7.equals(var3)) {
                    class467.method2774(class35.field530.method1954(class300.field4813, -30366) + arg2 + class379.field5879.method1954(class300.field4813, -30366), (byte) 111);
                    return;
                }
            }
        }
        if (class162.method1121(class302.field4850.field2652, 1).equals(var3)) {
            class467.method2774(class407.field6179.method1954(class300.field4813, -30366), (byte) 70);
            return;
        }
        class265.method1775(-2, class469.field6966);
        class103.field1697++;
        class261.field4357.method163(class323.method2037(arg2, -1) + 1, (byte) 49);
        class261.field4357.method145(arg2, (byte) 0);
        class261.field4357.method163(arg1 ? 1 : 0, (byte) 49);
    }
}
