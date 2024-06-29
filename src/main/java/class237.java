import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class237 extends class171 {

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    public int field3960;

    @OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
    public int field3958;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "Lok;")
    private static class146 field3951 = class235.method1724(-12908, "Examine");

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "[[Z")
    public static boolean[][] field3949 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "I")
    public static int field3953 = 0;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "Lok;")
    public static class146 field3954 = field3951;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "Loh;")
    public static class15 field3955;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILk;ZZILk;I)I", line = 4)
    public static final int method1729(int arg0, class228 arg1, boolean arg2, boolean arg3, int arg4, class228 arg5, int arg6) {
        field3956++;
        int var7 = class207.method1571(arg0, arg1, arg5, arg3, arg6 ^ 0x7);
        if (var7 != 0) {
            return arg3 ? -var7 : var7;
        } else if (~arg4 == arg6) {
            return 0;
        } else {
            int var8 = class207.method1571(arg4, arg1, arg5, arg2, 7);
            return arg2 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIII)V", line = 46)
    public static final void method1730(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 19384) {
            method1733(88);
        }
        field3957++;
        if (class271.field4640) {
            class131.method973(arg3, arg4, arg1 + arg3, arg2 + arg4);
            class131.method978(arg3, arg4, arg1, arg2, 0);
        } else {
            class181.method1420(arg3, arg4, arg1 + arg3, arg2 + arg4);
            class181.method1416(arg3, arg4, arg1, arg2, 0);
        }
        if (class57.field1010 < 100) {
            return;
        }
        if (class278.field4768 == null || class278.field4768.field1145 != arg1 || class278.field4768.field1155 != arg2) {
            class307 var5 = new class307(arg1, arg2);
            class181.method1430(var5.field5243, arg1, arg2);
            class121.method841(class33.field639, class118.field1916, arg0 + 1983143320, 0, arg2, 0, 0, 0, arg1);
            if (class271.field4640) {
                class278.field4768 = new class8(var5);
            } else {
                class278.field4768 = var5;
            }
            if (class271.field4640) {
                class181.field3040 = null;
            } else {
                class139.field2307.method146(20200);
            }
        }
        class278.field4768.method49(arg3, arg4);
        int var6 = class86.field1375 * arg1 / class118.field1916 + arg3;
        int var7 = class174.field2916 * arg2 / class33.field639 + arg4;
        int var8 = 16711680;
        int var9 = class14.field265 * arg2 / class33.field639;
        if (class95.field1530 == 1) {
            var8 = 16777215;
        }
        int var10 = class195.field3243 * arg1 / class118.field1916;
        if (class271.field4640) {
            class131.method974(var6, var7, var10, var9, var8, 128);
            class131.method965(var6, var7, var10, var9, var8);
        } else {
            class181.method1428(var6, var7, var10, var9, var8, 128);
            class181.method1435(var6, var7, var10, var9, var8);
        }
        if (class198.field3306 <= 0 || class198.field3306 % 10 >= 5) {
            return;
        }
        for (class2 var11 = (class2) class215.field3547.method1251(-51); var11 != null; var11 = (class2) class215.field3547.method1253(81)) {
            if (class309.field5259 == var11.field9) {
                int var12 = var11.field8 * arg2 / class33.field639 + arg4;
                int var13 = arg3 + (var11.field11 * arg1 / class118.field1916);
                if (class271.field4640) {
                    class131.method978(var13 - 2, var12 - 2, 4, 4, 16776960);
                } else {
                    class181.method1416(var13 - 2, var12 + -2, 4, 4, 16776960);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V", line = 150)
    public static final void method1731(int arg0, int arg1, int arg2) {
        field3948++;
        class160 var3 = class268.field4614[class203.field3387][arg2][arg0];
        if (var3 == null) {
            class76.method557(class203.field3387, arg2, arg0);
            return;
        }
        class39 var4 = (class39) var3.method1251(-72);
        class39 var5 = null;
        int var6 = -99999999;
        while (var4 != null) {
            class248 var7 = class84.method589(false, var4.field686.field3381);
            int var8 = var7.field4138;
            if (var7.field4118 == 1) {
                var8 = (var4.field686.field3386 + 1) * var8;
            }
            if (var6 < var8) {
                var6 = var8;
                var5 = var4;
            }
            var4 = (class39) var3.method1253(85);
        }
        if (var5 == null) {
            class76.method557(class203.field3387, arg2, arg0);
            return;
        }
        int var9 = -105 / ((-arg1 - 45) / 32);
        var3.method1252((byte) -60, var5);
        class203 var10 = null;
        class39 var11 = (class39) var3.method1251(96);
        class203 var12 = null;
        while (var11 != null) {
            class203 var13 = var11.field686;
            if (var5.field686.field3381 != var13.field3381) {
                if (var12 == null) {
                    var12 = var13;
                }
                if (var12.field3381 != var13.field3381 && var10 == null) {
                    var10 = var13;
                }
            }
            var11 = (class39) var3.method1253(123);
        }
        long var14 = (long) ((arg0 << 7) + (arg2 + 1610612736));
        class85.method599(class203.field3387, arg2, arg0, class19.method141(arg2 * 128 + 64, class203.field3387, arg0 * 128 + 64, 123), var5.field686, var14, var12, var10);
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V", line = 232)
    public static void method1732(int arg0) {
        field3951 = null;
        int var1 = -8 / ((arg0 + 74) / 49);
        field3955 = null;
        field3949 = (boolean[][]) null;
        field3954 = null;
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V", line = 260)
    public static final void method1733(int arg0) {
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class93.field1494 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
        field3950++;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(II)V", line = 280)
    public class237(int arg0, int arg1) {
        this.field3960 = arg1;
        this.field3958 = arg0;
    }
}
