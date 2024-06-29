import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class451 extends class313 {

    @OriginalMember(owner = "client!ega", name = "i", descriptor = "[Lbl;")
    public class468[] field6569;

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!ega", name = "f", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "Leaa;")
    public static class380 field6568;

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)V", line = 5)
    public static void method2767(int arg0) {
        if (arg0 != 16) {
            method2768(null, -56, 75);
        }
        field6568 = null;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lla;II)Lit;", line = 15)
    public static final class34 method2768(class422 arg0, int arg1, int arg2) {
        if (arg1 >= -5) {
            method2767(-125);
        }
        field6567++;
        class34 var3 = (class34) class237.field3808.method80((byte) -20, (long) arg2);
        if (var3 == null) {
            if (class186.field3117) {
                var3 = class364.field5573.method310(class726.method4014(arg0, arg2), true);
            } else {
                var3 = class577.method3339(arg0.method2633(true, arg2), (byte) -81);
            }
            class237.field3808.method67((long) arg2, var3, -6772);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "([Lbl;)V", line = 41)
    public class451(class468[] arg0) {
        this.field6569 = arg0;
    }

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "(I)I", line = 49)
    public static final int method2769(int arg0) {
        if (arg0 != 9264) {
            return 115;
        }
        field6566++;
        if (class146.field2298 == null) {
            if (!class32.field304 && class237.field3813 != null) {
                return class237.field3813.field3487;
            }
            int var1 = class651.field9244.method2915(-8463);
            int var2 = class651.field9244.method2921((byte) 28);
            if (class467.field6801) {
                if (var1 > class713.field10029 && var1 < (class713.field10029 + class662.field9427)) {
                    int var3 = -1;
                    for (int var4 = 0; var4 < class124.field1898; var4++) {
                        if (class207.field3468) {
                            int var9 = var4 * 16 + class677.field9542 + 33;
                            if (var2 > (var9 - 13) && var2 <= (var9 + 3)) {
                                var3 = var4;
                            }
                        } else {
                            int var8 = var4 * 16 + class677.field9542 + 31;
                            if ((var8 - 13) < var2 && var2 <= var8 + 3) {
                                var3 = var4;
                            }
                        }
                    }
                    if (var3 != -1) {
                        int var5 = 0;
                        class271 var6 = new class271(class26.field263);
                        for (class180 var7 = (class180) var6.method1783(arg0 ^ 0xFFFFDBE8); var7 != null; var7 = (class180) var6.method1784((byte) 49)) {
                            if (var5++ == var3) {
                                return ((class208) var7.field3055.field9552.field3449).field3487;
                            }
                        }
                    }
                } else if (class74.field1107 != null && class598.field8460 < var1 && class598.field8460 + class265.field4129 > var1) {
                    int var10 = -1;
                    for (int var11 = 0; var11 < class74.field1107.field3056; var11++) {
                        if (class207.field3468) {
                            int var15 = class85.field1258 + (var11 * 16) + 33;
                            if (var2 > var15 - 13 && var2 <= var15 + 3) {
                                var10 = var11;
                            }
                        } else {
                            int var16 = class85.field1258 + (var11 * 16) + 31;
                            if ((var16 - 13) < var2 && var16 + 3 >= var2) {
                                var10 = var11;
                            }
                        }
                    }
                    if (var10 != -1) {
                        int var12 = 0;
                        class271 var13 = new class271(class74.field1107.field3055);
                        for (class208 var14 = (class208) var13.method1783(arg0 - 9185); var14 != null; var14 = (class208) var13.method1784((byte) 87)) {
                            if (var12++ == var10) {
                                return var14.field3487;
                            }
                        }
                    }
                }
            } else if (var1 > class713.field10029 && class713.field10029 + class662.field9427 > var1) {
                int var17 = -1;
                for (int var18 = 0; var18 < class608.field8588; var18++) {
                    if (class207.field3468) {
                        int var23 = (class608.field8588 - var18 - 1) * 16 + class677.field9542 + 33;
                        if (var2 > var23 - 13 && (var23 + 3) >= var2) {
                            var17 = var18;
                        }
                    } else {
                        int var22 = (class608.field8588 - var18 - 1) * 16 + class677.field9542 + 31;
                        if (var2 > var22 - 13 && var2 <= var22 + 3) {
                            var17 = var18;
                        }
                    }
                }
                if (var17 != -1) {
                    int var19 = 0;
                    class40 var20 = new class40(class344.field5093);
                    for (class208 var21 = (class208) var20.method444(arg0 ^ 0x2440); var21 != null; var21 = (class208) var20.method446((byte) 66)) {
                        if ((var19++) == var17) {
                            return var21.field3487;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
