import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class343 {

    @OriginalMember(owner = "client!mv", name = "g", descriptor = "Lri;")
    private class97 field5541;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public int field5538;

    @OriginalMember(owner = "client!mv", name = "f", descriptor = "[I")
    public static int[] field5540 = new int[4096];

    @OriginalMember(owner = "client!mv", name = "h", descriptor = "[[I")
    public static int[][] field5542 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!mv", name = "i", descriptor = "I")
    public static int field5543;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mv", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field5544;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
    public static void method2334(int arg0) {
        if (arg0 > 52) {
            field5542 = null;
            field5540 = null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "(I)V")
    public static final void method2335(int arg0) {
        field5537++;
        class68.method715(11, (byte) -122);
        class31.method439(-1);
        System.gc();
        if (arg0 != 0) {
            field5540 = null;
        }
    }

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "(I)V")
    public static final void method2336(int arg0) {
        field5543++;
        if (class402.field6207.field7677) {
            class204.field3324 = 96;
        } else {
            try {
                Method var1 = (field5544 == null ? (field5544 = method2339("java.lang.Runtime")) : field5544).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class204.field3324 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        if (arg0 != 17712) {
            field5536 = -16;
        }
    }

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "(I)V")
    public static final void method2337(int arg0) {
        class558.field8066.method3405(true);
        field5539++;
        int var1 = class558.field8066.method3404(8, 8);
        if (class283.field4523 > var1) {
            for (int var2 = var1; var2 < class283.field4523; var2++) {
                class53.field711[class160.field2734++] = class102.field1690[var2];
            }
        }
        if (var1 > class283.field4523) {
            throw new RuntimeException("gnpov1");
        }
        class283.field4523 = 0;
        for (int var3 = arg0; var3 < var1; var3++) {
            int var4 = class102.field1690[var3];
            class589 var5 = ((class348) class592.field8395.method1558((long) var4, (byte) -93)).field5577;
            int var6 = class558.field8066.method3404(1, 8);
            if (var6 == 0) {
                class102.field1690[class283.field4523++] = var4;
                var5.field4223 = class562.field8084;
            } else {
                int var7 = class558.field8066.method3404(2, arg0 ^ 0x8);
                if (var7 == 0) {
                    class102.field1690[class283.field4523++] = var4;
                    var5.field4223 = class562.field8084;
                    class326.field5075[class373.field5831++] = var4;
                } else if (var7 == 1) {
                    class102.field1690[class283.field4523++] = var4;
                    var5.field4223 = class562.field8084;
                    int var8 = class558.field8066.method3404(3, 8);
                    var5.method3437(2, var8, 1);
                    int var9 = class558.field8066.method3404(1, 8);
                    if (var9 == 1) {
                        class326.field5075[class373.field5831++] = var4;
                    }
                } else if (var7 == 2) {
                    class102.field1690[class283.field4523++] = var4;
                    var5.field4223 = class562.field8084;
                    if (class558.field8066.method3404(1, 8) == 1) {
                        int var11 = class558.field8066.method3404(3, arg0 ^ 0x8);
                        var5.method3437(2, var11, 2);
                        int var12 = class558.field8066.method3404(3, 8);
                        var5.method3437(2, var12, 2);
                    } else {
                        int var10 = class558.field8066.method3404(3, 8);
                        var5.method3437(2, var10, 0);
                    }
                    int var13 = class558.field8066.method3404(1, 8);
                    if (var13 == 1) {
                        class326.field5075[class373.field5831++] = var4;
                    }
                } else if (var7 == 3) {
                    class53.field711[class160.field2734++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(BIII)I")
    public static final int method2338(byte arg0, int arg1, int arg2, int arg3) {
        field5535++;
        if (arg0 < 86) {
            field5542 = null;
        }
        int var4 = ((arg1 & 0xFF00FF) * arg3 & 0xFF00FF00 | (arg1 & 0xFF00) * arg3 & 0xFF0000) >>> 8;
        int var5 = 255 - arg3;
        return (((arg2 & 0xFF00) * var5 & 0xFF0000 | (arg2 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "(Lei;ILri;)V")
    public class343(class162 arg0, int arg1, class97 arg2) {
        new class49(64);
        this.field5541 = arg2;
        this.field5538 = this.field5541.method949(15, 0);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2339(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
