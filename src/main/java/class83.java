import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class83 {

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "Lge;")
    public class47 field2059 = new class47();

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "Loc;")
    public static class99 field2060 = class48.method402((byte) -104, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "[I")
    public static int[] field2064 = new int[4000];

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Loc;")
    private static class99 field2048 = class48.method402((byte) -104, "Welcome to RuneScape");

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Loc;")
    public static class99 field2057 = class48.method402((byte) -104, ")4l");

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "Loc;")
    public static class99 field2068 = field2048;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Loc;")
    public static class99 field2051 = class48.method402((byte) -104, "logo");

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "Lr;")
    public static class118 field2066 = new class118(50);

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "Loc;")
    public static class99 field2073 = class48.method402((byte) -104, "_");

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "Ljava/lang/Object;")
    public static Object field2072 = new Object();

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "Loc;")
    private static class99 field2075 = class48.method402((byte) -104, " from your friend list first");

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "Loc;")
    public static class99 field2074 = field2075;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Lge;")
    private class47 field2063;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "[Z")
    public static boolean[] field2053;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)Ljc;")
    public static final class64 method712(byte arg0) {
        field2046++;
        class64 var1 = new class64();
        var1.field1683 = class47.field1150;
        var1.field1681 = class119.field2929[0];
        var1.field1687 = class95.field2319[0];
        var1.field1685 = class81.field1999;
        byte[] var2 = class86.field2142[0];
        int var3 = var1.field1687 * var1.field1681;
        var1.field1682 = class5.field96[0];
        var1.field1684 = class74.field1887[0];
        var1.field1686 = new int[var3];
        int var4 = -111 / ((34 - arg0) / 56);
        for (int var5 = 0; var5 < var3; var5++) {
            var1.field1686[var5] = class21.field508[class17.method171(255, var2[var5])];
        }
        class89.method746(123);
        return var1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILge;Lge;)V")
    public final void method713(int arg0, class47 arg1, class47 arg2) {
        field2062++;
        if (arg2.field1145 != null) {
            arg2.method394((byte) -38);
        }
        arg2.field1146 = arg1;
        if (arg0 <= 113) {
            this.method726(-40);
        }
        arg2.field1145 = arg1.field1145;
        arg2.field1145.field1146 = arg2;
        arg2.field1146.field1145 = arg2;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(B)V")
    public final void method714(byte arg0) {
        field2056++;
        if (arg0 != 76) {
            field2072 = null;
        }
        while (true) {
            class47 var2 = this.field2059.field1146;
            if (this.field2059 == var2) {
                return;
            }
            var2.method394((byte) -117);
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(B)Lge;")
    public final class47 method715(byte arg0) {
        int var2 = 1 % ((-arg0 - 9) / 49);
        field2055++;
        class47 var3 = this.field2059.field1145;
        if (this.field2059 == var3) {
            this.field2063 = null;
            return null;
        } else {
            this.field2063 = var3.field1145;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)Lge;")
    public final class47 method716(boolean arg0) {
        field2071++;
        class47 var2 = this.field2063;
        if (this.field2059 == var2) {
            this.field2063 = null;
            return null;
        }
        if (!arg0) {
            method723(-85, null);
        }
        this.field2063 = var2.field1146;
        return var2;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Lcb;")
    public static final class16 method717(int arg0, int arg1) {
        field2047++;
        class16 var2 = (class16) class43.field1054.method997(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class113.field2827.method903(arg0, (byte) -128, arg1);
        class16 var4 = new class16();
        var4.field387 = arg1;
        if (var3 != null) {
            var4.method156(new class57(var3), 118);
        }
        var4.method164(false);
        if (var4.field374) {
            var4.field441 = false;
            var4.field403 = false;
        }
        class43.field1054.method993((byte) 100, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static final void method718(int arg0) {
        class140.field3456.method17(14);
        field2058++;
        for (int var1 = arg0; var1 < 32; var1++) {
            class141.field3497[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class93.field2275[var2] = 0L;
        }
        class133.field3252 = 0;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)V")
    public static final void method719(int arg0, int arg1) {
        class46.method384((byte) -102, arg0);
        field2045++;
        if (arg1 < 54) {
            field2066 = null;
        }
        class61.method539(arg0, true);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lge;I)V")
    public final void method720(class47 arg0, int arg1) {
        field2054++;
        if (arg0.field1145 != null) {
            arg0.method394((byte) 121);
        }
        arg0.field1145 = this.field2059.field1145;
        if (arg1 == 0) {
            arg0.field1146 = this.field2059;
            arg0.field1145.field1146 = arg0;
            arg0.field1146.field1145 = arg0;
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(B)V")
    public static void method721(byte arg0) {
        field2053 = null;
        field2068 = null;
        field2075 = null;
        field2074 = null;
        field2073 = null;
        field2064 = null;
        if (arg0 > -69) {
            return;
        }
        field2057 = null;
        field2072 = null;
        field2066 = null;
        field2051 = null;
        field2060 = null;
        field2048 = null;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)Lge;")
    public final class47 method722(int arg0) {
        if (arg0 < 107) {
            field2057 = null;
        }
        field2050++;
        class47 var2 = this.field2059.field1146;
        if (this.field2059 == var2) {
            this.field2063 = null;
            return null;
        } else {
            this.field2063 = var2.field1146;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method723(int arg0, Component arg1) {
        field2052++;
        Method var2 = class50.field1210;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class39.field978);
        arg1.addFocusListener(class39.field978);
        int var3 = 49 / ((arg0 - 42) / 57);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Lge;I)V")
    public final void method724(class47 arg0, int arg1) {
        if (arg1 != 0) {
            method723(-20, null);
        }
        field2069++;
        if (arg0.field1145 != null) {
            arg0.method394((byte) 118);
        }
        arg0.field1146 = this.field2059.field1146;
        arg0.field1145 = this.field2059;
        arg0.field1145.field1146 = arg0;
        arg0.field1146.field1145 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)Lge;")
    public final class47 method725(int arg0) {
        field2070++;
        class47 var2 = this.field2059.field1146;
        if (this.field2059 == var2) {
            return null;
        } else {
            var2.method394((byte) -99);
            return arg0 == 14538 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)Lge;")
    public final class47 method726(int arg0) {
        if (arg0 != -13083) {
            field2053 = null;
        }
        field2065++;
        class47 var2 = this.field2063;
        if (this.field2059 == var2) {
            this.field2063 = null;
            return null;
        } else {
            this.field2063 = var2.field1145;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILta;)V")
    public static final void method727(int arg0, class127 arg1) {
        if (class101.field2444 == arg1.field3101 || arg1.field3132 == -1 || arg1.field3128 != 0 || arg1.field3104 + 1 > class142.method1163(-124, arg1.field3132).field2016[arg1.field3081]) {
            int var2 = class101.field2444 - arg1.field3074;
            int var3 = arg1.field3119 * 64 + arg1.field3063 * 128;
            int var4 = arg1.field3101 - arg1.field3074;
            int var5 = arg1.field3119 * 64 + arg1.field3095 * 128;
            int var6 = arg1.field3119 * 64 + arg1.field3097 * 128;
            int var7 = arg1.field3066 * 128 + arg1.field3119 * 64;
            arg1.field3115 = ((var4 - var2) * var3 + var2 * var6) / var4;
            arg1.field3077 = ((var4 - var2) * var5 + var2 * var7) / var4;
        }
        arg1.field3118 = 0;
        field2049++;
        if (arg1.field3102 == 0) {
            arg1.field3064 = 1024;
        }
        if (arg1.field3102 == 1) {
            arg1.field3064 = 1536;
        }
        if (arg1.field3102 == arg0) {
            arg1.field3064 = 0;
        }
        if (arg1.field3102 == 3) {
            arg1.field3064 = 512;
        }
        arg1.field3107 = arg1.field3064;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class83() {
        this.field2059.field1146 = this.field2059;
        this.field2059.field1145 = this.field2059;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)Lge;")
    public final class47 method728(boolean arg0) {
        if (arg0) {
            field2053 = null;
        }
        class47 var2 = this.field2059.field1145;
        field2067++;
        if (this.field2059 == var2) {
            return null;
        } else {
            var2.method394((byte) 94);
            return var2;
        }
    }
}
