import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class4 extends class259 {

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "Lkb;")
    public class190 field54;

    @OriginalMember(owner = "client!se", name = "M", descriptor = "Ljava/lang/String;")
    public static String field50 = "Allocated memory";

    @OriginalMember(owner = "client!se", name = "P", descriptor = "Lhl;")
    public static class139 field53 = new class139(64);

    @OriginalMember(owner = "client!se", name = "S", descriptor = "I")
    public static int field56 = 0;

    @OriginalMember(owner = "client!se", name = "T", descriptor = "[[I")
    public static int[][] field57 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!se", name = "U", descriptor = "Ljava/lang/String;")
    public static String field58 = null;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!se", name = "N", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!se", name = "O", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!se", name = "R", descriptor = "Z")
    public static boolean field55;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "(I)V")
    public static final void method46(int arg0) {
        if (arg0 >= -60) {
            return;
        }
        for (int var1 = 0; var1 < class165.field2426; var1++) {
            int var2 = class148.field2149[var1];
            class224 var3 = class166.field2438[var2];
            int var4 = class173.field2543.method407(255);
            if ((var4 & 0x4) != 0) {
                var4 += class173.field2543.method407(255) << 8;
            }
            class139.method943(var3, var2, (byte) -126, var4);
        }
        field52++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII)V")
    public static final void method47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class251.method1710(arg2, (byte) 27, class175.field2557, class91.field1381);
        field49++;
        int var7 = class251.method1710(arg0, (byte) 27, class175.field2557, class91.field1381);
        int var8 = class251.method1710(arg4, (byte) 27, class196.field2961, class84.field1287);
        int var9 = class251.method1710(arg5, (byte) 27, class196.field2961, class84.field1287);
        int var10 = var6;
        if (arg3 != 1) {
            method49(98);
        }
        while (var7 >= var10) {
            class222.method1519((byte) -126, var8, class241.field3751[var10], var9, arg1);
            var10++;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
    public static final void method48(byte arg0) {
        field51++;
        try {
            if (class287.field4391 == 1) {
                int var1 = class148.field2151.method1428(true);
                if (var1 > 0 && class148.field2151.method1397((byte) 97)) {
                    int var2 = var1 - class37.field649;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class148.field2151.method1425(0, var2);
                    return;
                }
                class148.field2151.method1434(-2080769);
                class148.field2151.method1412(-1);
                class245.field3794 = null;
                if (class11.field162 == null) {
                    class287.field4391 = 0;
                } else {
                    class287.field4391 = 2;
                }
                class9.field107 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class148.field2151.method1434(-2080769);
            class11.field162 = null;
            class9.field107 = null;
            class245.field3794 = null;
            class287.field4391 = 0;
        }
        if (arg0 > -85) {
            method48((byte) -99);
        }
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(I)V")
    public static void method49(int arg0) {
        field50 = null;
        field58 = null;
        field53 = null;
        if (arg0 != 0) {
            method46(-26);
        }
        field57 = null;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lkb;)V")
    public class4(class190 arg0) {
        this.field54 = arg0;
    }
}
