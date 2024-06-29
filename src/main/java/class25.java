import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public abstract class class25 {

    @OriginalMember(owner = "client!na", name = "b", descriptor = "Lqd;")
    public static class40 field436 = class147.method1106("(U4", (byte) -78);

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lqd;")
    public static class40 field437 = class147.method1106("compass", (byte) -87);

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field440 = 0;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Lke;")
    public static class107 field442;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Lce;")
    public static class239 field447;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Z")
    public static boolean field444;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "[Lqd;")
    public static class40[] field435;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)[Log;", line = 14)
    public static final class197[] method181(int arg0) {
        if (arg0 != -25532) {
            field448 = -99;
        }
        field443++;
        if (class240.field3979 == null) {
            class197[] var1 = class265.method1856(class275.field4573, 4);
            class197[] var2 = new class197[var1.length];
            int var3 = 0;
            label56: for (int var4 = 0; var4 < var1.length; var4++) {
                class197 var5 = var1[var4];
                if ((var5.field3158 <= 0 || var5.field3158 >= 24) && var5.field3162 >= 800 && var5.field3163 >= 600) {
                    for (int var6 = 0; var6 < var3; var6++) {
                        class197 var7 = var2[var6];
                        if (var5.field3162 == var7.field3162 && var5.field3163 == var7.field3163) {
                            if (var7.field3158 < var5.field3158) {
                                var2[var6] = var5;
                            }
                            continue label56;
                        }
                    }
                    var2[var3] = var5;
                    var3++;
                }
            }
            class240.field3979 = new class197[var3];
            class234.method1623(var2, 0, class240.field3979, 0, var3);
            int[] var8 = new int[class240.field3979.length];
            for (int var9 = 0; var9 < class240.field3979.length; var9++) {
                class197 var10 = class240.field3979[var9];
                var8[var9] = var10.field3163 * var10.field3162;
            }
            class253.method1781(class240.field3979, -1, var8);
        }
        return class240.field3979;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)V", line = 90)
    public static final void method182(boolean arg0, int arg1) {
        class255 var2 = (class255) class101.field1774.method1971(100);
        if (arg1 != 0) {
            field444 = true;
        }
        while (var2 != null) {
            if (var2.field4234 != null) {
                class89.field1610.method1336(var2.field4234);
                var2.field4234 = null;
            }
            if (var2.field4243 != null) {
                class89.field1610.method1336(var2.field4243);
                var2.field4243 = null;
            }
            var2.method2095(arg1);
            var2 = (class255) class101.field1774.method1967(100);
        }
        if (arg0) {
            for (class255 var3 = (class255) class253.field4194.method1971(100); var3 != null; var3 = (class255) class253.field4194.method1967(100)) {
                if (var3.field4234 != null) {
                    class89.field1610.method1336(var3.field4234);
                    var3.field4234 = null;
                }
                var3.method2095(0);
            }
            for (class255 var4 = (class255) class60.field1143.method1400(-1); var4 != null; var4 = (class255) class60.field1143.method1403(112)) {
                if (var4.field4234 != null) {
                    class89.field1610.method1336(var4.field4234);
                    var4.field4234 = null;
                }
                var4.method2095(arg1 ^ 0x0);
            }
        }
        field439++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Loi;", line = 159)
    public static final class308 method183(int arg0, int arg1) {
        field441++;
        if (arg0 != -14949) {
            field440 = -70;
        }
        class308 var2 = (class308) class181.field2945.method1345((long) arg1, 28150);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class147.field2477.method1651(1, arg1, arg0 + 14948);
        class308 var4 = new class308();
        if (var3 != null) {
            var4.method2103(-52, new class26(var3), arg1);
        }
        class181.field2945.method1350(var4, (long) arg1, -80);
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZZIZI)Lce;", line = 187)
    public static final class239 method184(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field438++;
        class41 var5 = null;
        if (class292.field4886 != null) {
            var5 = new class41(arg4, class292.field4886, class180.field2944[arg4], 1000000);
        }
        if (arg2 != 1000000) {
            field444 = false;
        }
        class96.field1721[arg4] = class31.field644.method1564(-112, arg4, class300.field5023, var5);
        if (arg3) {
            class96.field1721[arg4].method684((byte) -46);
        }
        return new class239(class96.field1721[arg4], arg0, arg1);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(II)V", line = 209)
    public static final void method185(int arg0, int arg1) {
        class89.field1608.method1348(arg1, arg0);
        field445++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V", line = 217)
    public static void method186(byte arg0) {
        field437 = null;
        field435 = null;
        field442 = null;
        field447 = null;
        if (arg0 >= 78) {
            field436 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILrb;)V", line = 262)
    public static final void method188(int arg0, class213 arg1) {
        field446++;
        if (arg0 == 0 && class263.field4393 == arg1.field3564) {
            class229.field3778[arg1.field3423] = true;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([BB)V")
    public abstract void method180(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)[B")
    public abstract byte[] method187(int arg0);
}
