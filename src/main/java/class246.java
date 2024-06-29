import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class246 extends class237 {

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
    public int field4057 = 0;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "[Lvd;")
    public class19[] field4038 = new class19[5];

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "[I")
    public int[] field4037 = new int[5];

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public int field4040;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public int field4039;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public int field4036;

    @OriginalMember(owner = "client!tl", name = "P", descriptor = "I")
    public int field4062;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "Lte;")
    public static class244 field4034 = new class244(64);

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "Ljava/lang/String;")
    public static String field4059 = "glow2:";

    @OriginalMember(owner = "client!tl", name = "O", descriptor = "[I")
    public static int[] field4061 = new int[1000];

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public int field4041;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    public int field4044;

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
    public int field4047;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "I")
    public int field4052;

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "I")
    public int field4053;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "Lub;")
    public class11 field4056;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "Lgd;")
    public class128 field4054;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "Lbi;")
    public class185 field4042;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "Lef;")
    public class187 field4046;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "Lpf;")
    public class229 field4055;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "Ltl;")
    public class246 field4058;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "Luh;")
    public class59 field4035;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tl", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field4064;

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "Z")
    public boolean field4048;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "Z")
    public boolean field4051;

    @OriginalMember(owner = "client!tl", name = "Q", descriptor = "Z")
    public boolean field4063;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V")
    public static void method1706(byte arg0) {
        field4059 = null;
        field4061 = null;
        if (arg0 == -54) {
            field4034 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Leh;B)I")
    public static final int method1707(class137 arg0, byte arg1) {
        field4045++;
        int var2 = 0;
        if (arg0.method938(class86.field1059, 843075268)) {
            var2++;
        }
        if (arg1 == 70) {
            if (arg0.method938(class106.field1423, 843075268)) {
                var2++;
            }
            return var2;
        } else {
            return -62;
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
    public static final void method1708(int arg0) {
        field4060++;
        try {
            Method var1 = (field4064 == null ? (field4064 = method1711("java.lang.Runtime")) : field4064).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class202.field3202 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method1709(String arg0, int arg1) throws ClassNotFoundException {
        field4050++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            if (arg1 != 5) {
                method1710(80, false, 102, 66);
            }
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(III)V")
    public class246(int arg0, int arg1, int arg2) {
        this.field4039 = this.field4040 = arg0;
        this.field4036 = arg2;
        this.field4062 = arg1;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZII)Lec;")
    public static final class86 method1710(int arg0, boolean arg1, int arg2, int arg3) {
        class86 var4 = new class86();
        field4043++;
        var4.field1061 = arg3;
        var4.field1064 = arg0;
        class92.field1139.method707((long) arg2, var4, (byte) 120);
        class291.method1957(20470, arg0);
        class123 var5 = class61.method358(arg2, -123);
        if (var5 != null) {
            class129.method875((byte) -21, var5);
        }
        if (class108.field1486 != null) {
            class129.method875((byte) -21, class108.field1486);
            class108.field1486 = null;
        }
        int var6 = class34.field437;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class179.method1246((byte) 125, class155.field2423[var7])) {
                class44.method243(var7, -16729);
            }
        }
        if (class34.field437 == 1) {
            class262.field4250 = false;
            class225.method1589(class190.field3074, class67.field850, class73.field916, 0, class103.field1392);
        } else {
            class225.method1589(class190.field3074, class67.field850, class73.field916, 0, class103.field1392);
            int var8 = class280.field4439.method692(class2.field11);
            for (int var9 = 0; var9 < class34.field437; var9++) {
                int var10 = class280.field4439.method692(class132.method895(var9, 0));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class67.field850 = (class164.field2607 ? 26 : 22) + class34.field437 * 15;
            class103.field1392 = var8 + 8;
        }
        if (var5 != null) {
            class21.method118((byte) -2, false, var5);
        }
        class218.method1542(arg1, arg0);
        if (class164.field2602 != -1) {
            class185.method1294(-72, 1, class164.field2602);
        }
        return var4;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1711(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
