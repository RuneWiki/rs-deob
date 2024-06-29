import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class225 extends class28 {

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public int field4175 = 0;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public static int field4172 = 0;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "Lqe;")
    public static class179 field4179 = class206.method1380("m", (byte) -128);

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)I")
    public static final int method1473(int arg0, int arg1) {
        class23 var2 = class95.method619(true, arg1);
        int var3 = var2.field559;
        field4180++;
        int var4 = var2.field565;
        int var5 = var2.field570;
        if (arg0 != -13545) {
            field4172 = 43;
        }
        int var6 = class60.field1285[var5 - var4];
        return class14.field355[var3] >> var4 & var6;
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(B)V")
    public static void method1474(byte arg0) {
        field4179 = null;
        if (arg0 >= -101) {
            method1475(-128, 76);
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(II)V")
    public static final void method1475(int arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field4174++;
        class177 var2 = (class177) class155.field2777.method909(arg1, (long) arg0);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field3221.length; var3++) {
                var2.field3221[var3] = -1;
                var2.field3219[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILra;)V")
    private final void method1476(int arg0, int arg1, class185 arg2) {
        if (arg0 == 2) {
            this.field4175 = arg2.method1252(2);
        }
        field4173++;
        if (arg1 <= 110) {
            this.method1476(109, 63, null);
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(B)V")
    public static final void method1477(byte arg0) {
        field4178++;
        class36.field789.method73(false);
        int var1 = class36.field789.method71(8, 128);
        if (class186.field3456 > var1) {
            for (int var2 = var1; var2 < class186.field3456; var2++) {
                class29.field640[class102.field1961++] = class233.field4297[var2];
            }
        }
        if (var1 > class186.field3456) {
            throw new RuntimeException("gnpov1");
        }
        class186.field3456 = 0;
        int var3 = 0;
        int var4 = -24 / ((-arg0 - 27) / 62);
        while (var3 < var1) {
            int var5 = class233.field4297[var3];
            class188 var6 = class53.field1152[var5];
            int var7 = class36.field789.method71(1, 128);
            if (var7 == 0) {
                class233.field4297[class186.field3456++] = var5;
                var6.field3152 = class13.field322;
            } else {
                int var8 = class36.field789.method71(2, 128);
                if (var8 == 0) {
                    class233.field4297[class186.field3456++] = var5;
                    var6.field3152 = class13.field322;
                    class74.field1449[class202.field3742++] = var5;
                } else if (var8 == 1) {
                    class233.field4297[class186.field3456++] = var5;
                    var6.field3152 = class13.field322;
                    int var9 = class36.field789.method71(3, 128);
                    var6.method1106(var9, (byte) 7, false);
                    int var10 = class36.field789.method71(1, 128);
                    if (var10 == 1) {
                        class74.field1449[class202.field3742++] = var5;
                    }
                } else if (var8 == 2) {
                    class233.field4297[class186.field3456++] = var5;
                    var6.field3152 = class13.field322;
                    int var11 = class36.field789.method71(3, 128);
                    var6.method1106(var11, (byte) 7, true);
                    int var12 = class36.field789.method71(3, 128);
                    var6.method1106(var12, (byte) 7, true);
                    int var13 = class36.field789.method71(1, 128);
                    if (var13 == 1) {
                        class74.field1449[class202.field3742++] = var5;
                    }
                } else if (var8 == 3) {
                    class29.field640[class102.field1961++] = var5;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILra;)V")
    public final void method1478(int arg0, class185 arg1) {
        if (arg0 != 0) {
            return;
        }
        field4171++;
        while (true) {
            int var3 = arg1.method1243(arg0 ^ 0x3);
            if (var3 == 0) {
                return;
            }
            this.method1476(var3, arg0 + 125, arg1);
        }
    }
}
