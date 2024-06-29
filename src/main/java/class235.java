import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class235 extends class381 {

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
    public volatile int field3251 = -1;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "Ljava/lang/String;")
    public volatile String field3250;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "[Loa;")
    public static class151[] field3247 = new class151[4];

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3254 = " from your ignore list first.";

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "Lrk;")
    public static class427 field3252;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;", line = 5)
    public static final Class method1570(byte arg0, String arg1) throws ClassNotFoundException {
        field3248++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg0 < 95) {
            return null;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILjava/awt/Canvas;)Lfl;", line = 51)
    public static final class386 method1571(int arg0, Canvas arg1) {
        field3249++;
        try {
            if (arg0 != -1) {
                method1571(-64, (Canvas) null);
            }
            Class var2 = Class.forName("mh");
            class386 var3 = (class386) var2.getDeclaredConstructor().newInstance();
            var3.method1606(arg1, (byte) -88);
            return var3;
        } catch (Throwable var5) {
            class373 var4 = new class373();
            var4.method1606(arg1, (byte) -88);
            return var4;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB[BI)Z", line = 76)
    public static final boolean method1572(int arg0, byte arg1, byte[] arg2, int arg3) {
        field3253++;
        boolean var4 = true;
        class289 var5 = new class289(arg2);
        int var6 = -1;
        int var7 = 74 % ((arg1 + 63) / 48);
        label70: while (true) {
            int var8 = var5.method1881(32767);
            if (var8 == 0) {
                return var4;
            }
            var6 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                int var14;
                class372 var17;
                do {
                    int var15;
                    int var16;
                    do {
                        do {
                            do {
                                do {
                                    while (var10) {
                                        int var18 = var5.method1821(-72);
                                        if (var18 == 0) {
                                            continue label70;
                                        }
                                        var5.method1861((byte) -72);
                                    }
                                    int var11 = var5.method1821(-95);
                                    if (var11 == 0) {
                                        continue label70;
                                    }
                                    var9 += var11 - 1;
                                    int var12 = var9 & 0x3F;
                                    int var13 = var9 >> 6 & 0x3F;
                                    var14 = var5.method1861((byte) -72) >> 2;
                                    var15 = var13 + arg3;
                                    var16 = var12 + arg0;
                                } while (var15 <= 0);
                            } while (var16 <= 0);
                        } while (var15 >= (class116.field1621 - 1));
                    } while (var16 >= (class385.field5425 - 1));
                    var17 = class10.method53(var6, true);
                } while (var14 == 22 && !class162.field2401 && var17.field5204 == 0 && var17.field5221 != 1 && !var17.field5208);
                if (!var17.method2324(126)) {
                    var4 = false;
                    class186.field2696++;
                }
                var10 = true;
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(B)V", line = 161)
    public static void method1573(byte arg0) {
        field3252 = null;
        field3254 = null;
        field3247 = null;
        int var1 = 10 % ((arg0 - 14) / 40);
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 178)
    public class235(String arg0) {
        this.field3250 = arg0;
    }
}
