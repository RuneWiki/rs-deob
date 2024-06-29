import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class118 extends class150 {

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    private int field2090;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    private int field2104;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    private int field2088;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "I")
    private int field2102;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field2089 = 0;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field2087 = 50;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "[I")
    public static int[] field2092 = new int[field2087];

    @OriginalMember(owner = "client!th", name = "x", descriptor = "[I")
    public static int[] field2096 = new int[field2087];

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field2094 = 0;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "[I")
    public static int[] field2095 = new int[field2087];

    @OriginalMember(owner = "client!th", name = "y", descriptor = "[I")
    public static int[] field2097 = new int[field2087];

    @OriginalMember(owner = "client!th", name = "h", descriptor = "[I")
    public static int[] field2080 = new int[field2087];

    @OriginalMember(owner = "client!th", name = "l", descriptor = "[I")
    public static int[] field2084 = new int[field2087];

    @OriginalMember(owner = "client!th", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field2085 = new String[field2087];

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field2100 = 0;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public static int field2098 = 100;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "[I")
    public static int[] field2081 = new int[field2087];

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2099;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Lri;")
    public static final class267 method810(int arg0, int arg1) {
        ++field2083;
        class267 var2 = (class267) class46.field737.method3(32, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            int var3 = -30 % ((-57 - arg0) / 60);
            byte[] var4;
            if (arg1 < 32768) {
                var4 = class111.field2003.method746(arg1, (byte) -128, 0);
            } else {
                var4 = class246.field4038.method746(32767 & arg1, (byte) -128, 0);
            }
            class267 var5 = new class267();
            if (var4 != null) {
                var5.method1758((byte) 27, new class101(var4));
            }
            if (~arg1 <= -32769) {
                var5.method1760(-692);
            }
            class46.field737.method4(0, var5, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)I")
    public static final int method811(boolean arg0) {
        ++field2101;
        if (!arg0) {
            method810(80, 109);
        }
        return class51.field890;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)I")
    public static final int method812(boolean arg0, int arg1) {
        if (arg0) {
            method814((byte) 98);
        }
        ++field2079;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IBI)V")
    public final void method220(int arg0, byte arg1, int arg2) {
        int var4 = 98 / ((arg1 - 39) / 62);
        int var5 = this.field2090 * arg0 >> 12;
        ++field2086;
        int var6 = this.field2104 * arg0 >> 12;
        int var7 = this.field2102 * arg2 >> 12;
        int var8 = this.field2088 * arg2 >> 12;
        class56.method349(var6, var8, var5, super.field2517, -7349, var7);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)V")
    public static final void method813(boolean arg0) {
        class239.field3925.method53(true);
        if (arg0) {
            field2096 = null;
        }
        class153.field2549.method53(!arg0);
        ++field2103;
        class189.field3067.method53(!arg0);
        class264.field4291.method53(true);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BII)V")
    public final void method221(byte arg0, int arg1, int arg2) {
        ++field2093;
        int var4 = this.field2090 * arg2 >> 12;
        int var5 = this.field2104 * arg2 >> 12;
        int var6 = -116 % ((arg0 - 7) / 63);
        int var7 = this.field2102 * arg1 >> 12;
        int var8 = this.field2088 * arg1 >> 12;
        class82.method538(var7, super.field2518, var8, (byte) 63, var4, super.field2513, var5);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
    public static void method814(byte arg0) {
        field2099 = null;
        field2085 = null;
        int var1 = -96 / ((30 - arg0) / 40);
        field2092 = null;
        field2080 = null;
        field2081 = null;
        field2096 = null;
        field2095 = null;
        field2084 = null;
        field2097 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
    public final void method218(int arg0, int arg1, int arg2) {
        ++field2091;
        if (arg0 != 0) {
            this.method218(-92, -118, -81);
        }
        int var4 = this.field2090 * arg1 >> 12;
        int var5 = this.field2104 * arg1 >> 12;
        int var6 = this.field2102 * arg2 >> 12;
        int var7 = this.field2088 * arg2 >> 12;
        class69.method419(super.field2513, var6, (byte) 82, super.field2517, super.field2518, var5, var7, var4);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILvh;Lvh;)V")
    public static final void method815(int arg0, class108 arg1, class108 arg2) {
        class246.field4038 = arg1;
        if (arg0 > 60) {
            class111.field2003 = arg2;
            ++field2082;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(IIIIIII)V")
    public class118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2090 = arg2;
        this.field2104 = arg0;
        this.field2088 = arg3;
        this.field2102 = arg1;
    }
}
