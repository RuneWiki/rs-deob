import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public abstract class class712 extends class241 {

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "Law;")
    public static class76 field9848 = new class76();

    @OriginalMember(owner = "client!ega", name = "l", descriptor = "Lhda;")
    public static class752 field9852 = new class752(28, 1);

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "I")
    public static int field9847;

    @OriginalMember(owner = "client!ega", name = "i", descriptor = "I")
    public static int field9849;

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "I")
    public static int field9850;

    @OriginalMember(owner = "client!ega", name = "k", descriptor = "I")
    public static int field9851;

    @OriginalMember(owner = "client!ega", name = "m", descriptor = "J")
    public static long field9853;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
    public static void method3996(int arg0) {
        field9848 = null;
        field9852 = null;
        int var1 = 118 % ((-arg0 - 40) / 36);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IIIBI)V")
    public static final void method3997(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 >= -108) {
            method3997(-47, -74, 10, (byte) 66, -113);
        }
        field9851++;
        if (arg1 >= class261.field3632 && class209.field3090 >= arg1) {
            int var5 = class10.method99(class431.field5944, 82, class380.field5289, arg4);
            int var6 = class10.method99(class431.field5944, 4, class380.field5289, arg0);
            class55.method372(var6, arg1, arg2, 6, var5);
        }
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(B)V")
    public static final void method3998(byte arg0) {
        int var1 = -18 % ((16 - arg0) / 36);
        field9849++;
        class3.field63.method1661(true);
        int var2 = class3.field63.method1664(2059, 8);
        if (class306.field4404 > var2) {
            for (int var3 = var2; var3 < class306.field4404; var3++) {
                class586.field7661[class315.field4501++] = class628.field8351[var3];
            }
        }
        if (var2 > class306.field4404) {
            throw new RuntimeException("gnpov1");
        }
        class306.field4404 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            int var5 = class628.field8351[var4];
            class556 var6 = ((class134) class390.field5470.method2135((long) var5, (byte) 31)).field2154;
            int var7 = class3.field63.method1664(2059, 1);
            if (var7 == 0) {
                class628.field8351[class306.field4404++] = var5;
                var6.field10265 = class650.field8633;
            } else {
                int var8 = class3.field63.method1664(2059, 2);
                if (var8 == 0) {
                    class628.field8351[class306.field4404++] = var5;
                    var6.field10265 = class650.field8633;
                    class600.field7882[class92.field1118++] = var5;
                } else if (var8 == 1) {
                    class628.field8351[class306.field4404++] = var5;
                    var6.field10265 = class650.field8633;
                    int var9 = class3.field63.method1664(2059, 3);
                    var6.method3100(1, (byte) -76, var9);
                    int var10 = class3.field63.method1664(2059, 1);
                    if (var10 == 1) {
                        class600.field7882[class92.field1118++] = var5;
                    }
                } else if (var8 == 2) {
                    class628.field8351[class306.field4404++] = var5;
                    var6.field10265 = class650.field8633;
                    if (class3.field63.method1664(2059, 1) == 1) {
                        int var11 = class3.field63.method1664(2059, 3);
                        var6.method3100(2, (byte) -85, var11);
                        int var12 = class3.field63.method1664(2059, 3);
                        var6.method3100(2, (byte) -96, var12);
                    } else {
                        int var13 = class3.field63.method1664(2059, 3);
                        var6.method3100(0, (byte) -82, var13);
                    }
                    int var14 = class3.field63.method1664(2059, 1);
                    if (var14 == 1) {
                        class600.field7882[class92.field1118++] = var5;
                    }
                } else if (var8 == 3) {
                    class586.field7661[class315.field4501++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(II)V")
    public static final void method3999(int arg0, int arg1) {
        class65 var2 = class573.field7516;
        synchronized (class573.field7516) {
            class573.field7516.method553(arg0, -15782);
        }
        field9850++;
        if (arg1 > -119) {
            field9848 = null;
        }
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(II)I")
    public static int method4000(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(III)Z")
    public static final boolean method4001(int arg0, int arg1, int arg2) {
        field9847++;
        if (arg0 != -7113) {
            field9848 = null;
        }
        return class481.method2708(arg1, arg2, 102) | (arg2 & 0x70000) != 0 || class601.method3269(arg2, arg1, (byte) 8);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Z)Ljc;")
    public abstract class444 method1922(boolean arg0);
}
