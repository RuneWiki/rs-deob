import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class338 {

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Lg;")
    public static class181 field5359 = null;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "[I")
    public static int[] field5353 = new int[50];

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5354 = "Face here";

    @OriginalMember(owner = "client!c", name = "f", descriptor = "S")
    public static short field5357 = 1;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Lsf;")
    public static class124 field5355 = new class124(64);

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5361 = "Connected to update server";

    @OriginalMember(owner = "client!c", name = "k", descriptor = "F")
    public static float field5362;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field5358;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 9)
    public static final void method2388(byte arg0) {
        field5356++;
        field5355.method895(128);
        if (arg0 != 21) {
            field5361 = (String) null;
        }
        class191.field3242.method895(128);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIII)V", line = 21)
    public static final void method2389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 >= class190.field3224 && arg2 <= class289.field4704 && arg0 >= class87.field1520 && class177.field2930 >= arg4) {
            class72.method547(-120, arg0, arg2, arg4, arg3, arg5);
        } else {
            class162.method1160(arg2, arg5, arg3, true, arg4, arg0);
        }
        if (arg1 != -24690) {
            method2392(-62);
        }
        field5352++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)V", line = 47)
    public static final void method2390(byte arg0, int arg1) {
        int var2 = -42 % ((arg0 - 47) / 47);
        class216.field3607 = arg1;
        class114.method846(26186, 3);
        class114.method846(26186, 4);
        field5360++;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V", line = 61)
    public static final void method2391(byte arg0) {
        field5363++;
        if (arg0 < 44) {
            field5355 = (class124) null;
        }
        class119.field2124.method895(128);
        class147.field2513.method895(128);
        class192.field3251.method895(128);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 92)
    public static void method2392(int arg0) {
        field5353 = null;
        field5355 = null;
        field5358 = null;
        int var1 = 124 / ((-arg0 - 30) / 38);
        field5354 = null;
        field5361 = null;
        field5359 = null;
    }
}
