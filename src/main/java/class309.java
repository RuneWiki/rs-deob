import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class309 extends class162 {

    @OriginalMember(owner = "client!p", name = "B", descriptor = "Lhj;")
    public class73 field5004;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "[I")
    public static int[] field5007 = new int[500];

    @OriginalMember(owner = "client!p", name = "F", descriptor = "Z")
    public static boolean field5008 = false;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "Lcl;")
    public static class208 field5006;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIILfa;)[Lea;")
    public static final class38[] method2106(int arg0, int arg1, int arg2, class273 arg3) {
        field5003++;
        if (arg0 != -6409) {
            method2107(95, 22, 101, 82);
        }
        return class163.method1081(0, arg3, arg1, arg2) ? class59.method367(false) : null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)Llf;")
    public static final class229 method2107(int arg0, int arg1, int arg2, int arg3) {
        class229 var4 = new class229();
        field5010++;
        var4.field3654 = arg1;
        var4.field3658 = arg2;
        class258.field4241.method857(false, var4, (long) arg3);
        class135.method905(arg2, (byte) 104);
        if (arg0 > -47) {
            field5008 = true;
        }
        class254 var5 = class80.method534(-82, arg3);
        if (var5 != null) {
            class58.method354(true, var5);
        }
        if (class296.field4862 != null) {
            class58.method354(true, class296.field4862);
            class296.field4862 = null;
        }
        int var6 = class18.field251;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class184.method1219(class70.field1016[var7], (byte) -82)) {
                class72.method458(3, var7);
            }
        }
        if (class18.field251 == 1) {
            class220.field3525 = false;
            class208.method1473(class120.field1847, (byte) 96, class307.field4990, class248.field3950, class307.field4997);
        } else {
            class208.method1473(class120.field1847, (byte) 83, class307.field4990, class248.field3950, class307.field4997);
            int var8 = class202.field3227.method736(class262.field4333);
            for (int var9 = 0; var9 < class18.field251; var9++) {
                int var10 = class202.field3227.method736(class11.method60(0, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class307.field4997 = var8 + 8;
            class307.field4990 = (class163.field2563 ? 26 : 22) + class18.field251 * 15;
        }
        if (var5 != null) {
            class58.method358(false, var5, (byte) -16);
        }
        class125.method836(-4, arg2);
        if (class160.field2523 != -1) {
            class117.method756(false, class160.field2523, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lhj;)V")
    public class309(class73 arg0) {
        this.field5004 = arg0;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V")
    public static void method2108(boolean arg0) {
        field5006 = null;
        field5007 = null;
        if (arg0) {
            field5007 = null;
        }
    }
}
