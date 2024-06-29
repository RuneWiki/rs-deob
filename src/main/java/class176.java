import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class176 extends class430 {

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public int field2462;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public int field2469;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Lgr;")
    public static class530 field2463 = new class530(24, 0);

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "Llc;")
    public static class435 field2465 = new class435(17, 0);

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method1263(byte arg0, String arg1) {
        field2461++;
        if (arg0 >= -114) {
            field2465 = null;
        }
        return class138.field1891.containsKey(arg1);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static final void method1264(int arg0) {
        field2464++;
        int[] var1 = new int[class425.field6147.field10379];
        int var2 = 0;
        for (int var3 = 0; var3 < class425.field6147.field10379; var3++) {
            class424 var5 = class425.field6147.method4144(var3, 123);
            if (var5.field6110 >= 0 || var5.field6109 >= 0) {
                var1[var2++] = var3;
            }
        }
        class146.field1982 = new int[var2];
        for (int var4 = arg0; var4 < var2; var4++) {
            class146.field1982[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(Z)V")
    public static final void method1265(boolean arg0) {
        if (arg0) {
            return;
        }
        if (class703.field9912 != null) {
            class703.field9912.method1426(!arg0);
        }
        field2467++;
        if (class623.field8862 == null) {
            return;
        }
        while (true) {
            try {
                class623.field8862.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)[Leda;")
    public static final class14[] method1266(int arg0) {
        if (arg0 == 24) {
            field2460++;
            return new class14[] { class424.field6143, class588.field8373, class372.field5401 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
    public static void method1267(int arg0) {
        field2465 = null;
        field2463 = null;
        if (arg0 != -23994) {
            field2463 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIB)V")
    public static final void method1268(int arg0, int arg1, byte arg2) {
        class642.field9136++;
        field2459++;
        class88 var3 = class448.method2741((byte) 89, class272.field3853, class583.field8319);
        if (arg2 == 73) {
            var3.field1260.method2862(arg0, arg2 - 1166933729);
            var3.field1260.method2927((byte) -54, arg1);
            class523.method3183(var3, (byte) 31);
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
    public static final void method1269(int arg0) {
        field2468++;
        if (arg0 != 26017) {
            method1268(23, -120, (byte) 49);
        }
        int var1 = class468.field6665;
        int[] var2 = class38.field500;
        for (int var3 = 0; var3 < var1; var3++) {
            class639 var4 = class536.field7796[var2[var3]];
            if (var4 != null) {
                class78.method645((byte) -111, var4.method2053(true), var4);
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method1270(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2466++;
        if ((arg0 + arg3) <= arg8 || arg0 >= (arg8 + arg2)) {
            return false;
        } else if ((arg5 + arg6) > arg7 && arg7 + arg4 > arg5) {
            return arg1 == 0 ? true : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(II)V")
    public class176(int arg0, int arg1) {
        this.field2462 = arg0;
        this.field2469 = arg1;
    }
}
