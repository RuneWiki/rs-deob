import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class26 {

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field375 = 0;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "[Lim;")
    public static class192[] field379 = new class192[2048];

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "Ljava/lang/String;")
    public static String field378 = "Loaded defaults";

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Z")
    public static boolean field383 = false;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/awt/Component;III)Lae;", line = 5)
    public static final class294 method178(Component arg0, int arg1, int arg2, int arg3) {
        field382++;
        try {
            Class var4 = Class.forName("hj");
            class294 var5 = (class294) var4.getDeclaredConstructor().newInstance();
            if (arg1 == -2) {
                var5.method220((byte) -80, arg0, arg2, arg3);
                return var5;
            } else {
                return (class294) null;
            }
        } catch (Throwable var8) {
            class329 var7 = new class329();
            var7.method220((byte) -50, arg0, arg2, arg3);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II[BI)Z", line = 33)
    public static final boolean method179(int arg0, int arg1, byte[] arg2, int arg3) {
        class192 var4 = new class192(arg2);
        boolean var5 = true;
        int var6 = -1;
        if (arg0 != 0) {
            return true;
        }
        field381++;
        label75: while (true) {
            int var7 = var4.method1391(32767);
            if (var7 == 0) {
                return var5;
            }
            var6 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                int var15;
                class149 var16;
                do {
                    int var13;
                    int var14;
                    do {
                        do {
                            do {
                                do {
                                    while (var8) {
                                        int var17 = var4.method1362(arg0 ^ 0x7C);
                                        if (var17 == 0) {
                                            continue label75;
                                        }
                                        var4.method1399(-1172389784);
                                    }
                                    int var10 = var4.method1362(23);
                                    if (var10 == 0) {
                                        continue label75;
                                    }
                                    var9 += var10 - 1;
                                    int var11 = var9 & 0x3F;
                                    int var12 = var9 >> 6 & 0x3F;
                                    var13 = arg1 + var11;
                                    var14 = arg3 + var12;
                                    var15 = var4.method1399(-1172389784) >> 2;
                                } while (var14 <= 0);
                            } while (var13 <= 0);
                        } while (var14 >= 103);
                    } while (var13 >= 103);
                    var16 = class291.method2043(var6, 23006);
                } while (var15 == 22 && !class39.field548 && var16.field2305 == 0 && var16.field2257 != 1 && !var16.field2283);
                var8 = true;
                if (!var16.method1049(-46)) {
                    var5 = false;
                    class295.field4634++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V", line = 121)
    public static void method180(byte arg0) {
        field379 = null;
        int var1 = 81 / ((51 - arg0) / 33);
        field378 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)I", line = 136)
    public static final int method181(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field373++;
        if (arg2 != -2) {
            field379 = (class192[]) null;
        }
        int var5 = 65536 - class25.field359[arg4 * 1024 / arg3] >> 1;
        return ((65536 - var5) * arg1 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILok;)Lok;", line = 148)
    public static final class160 method182(int arg0, class160 arg1) {
        field377++;
        if (arg1.field2544 != arg0) {
            return class37.method238((byte) 50, arg1.field2544);
        }
        int var2 = arg1.field2446 >>> 16;
        class34 var3 = new class34(class176.field2870);
        for (class224 var4 = (class224) var3.method223((byte) -1); var4 != null; var4 = (class224) var3.method224(-128)) {
            if (var4.field3564 == var2) {
                return class37.method238((byte) 118, (int) var4.field916);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIII)I", line = 191)
    public static final int method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~(arg5 & 0x1) == arg1) {
            int var7 = arg2;
            arg2 = arg0;
            arg0 = var7;
        }
        field376++;
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 7 - arg3 - (arg2 + -1);
        } else {
            return 7 - arg6 - (arg0 + -1);
        }
    }
}
