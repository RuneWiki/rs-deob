import java.awt.Component;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class327 {

    @OriginalMember(owner = "client!on", name = "h", descriptor = "Z")
    public boolean field4998 = false;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "Ljava/util/Calendar;")
    public static Calendar field5001 = Calendar.getInstance();

    @OriginalMember(owner = "client!on", name = "o", descriptor = "I")
    public static int field5005 = 0;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "[I")
    public static int[] field5008 = new int[25];

    @OriginalMember(owner = "client!on", name = "t", descriptor = "[I")
    public static int[] field5010 = new int[32];

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public int field4993;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public int field4996;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!on", name = "l", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!on", name = "n", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "[Lpi;")
    public static class150[] field5009;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "[Lfg;")
    public static class191[] field4992;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 5)
    public static final void method2260(byte arg0, Component arg1) {
        arg1.removeKeyListener(class277.field4249);
        arg1.removeFocusListener(class277.field4249);
        if (arg0 > 27) {
            class280.field4312 = -1;
            field4994++;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIIIIZI)V", line = 29)
    public static final void method2261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field4999++;
        if (class165.method1056(arg3, (byte) 24)) {
            class203.method1360(class138.field2300[arg3], arg4, arg8, arg5, arg1, -1, arg7, arg0, arg2, arg6);
            if (arg7) {
                field5009 = (class150[]) null;
            }
        } else if (arg0 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class337.field5220[var9] = true;
            }
        } else {
            class337.field5220[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IILbg;IZII)Lbg;", line = 64)
    public static final class309 method2262(int arg0, int arg1, class309 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field5003++;
        long var7 = (long) arg3;
        class309 var9 = (class309) class159.field2602.method1881(!arg4, var7);
        if (var9 == null) {
            class3 var10 = class3.method33(class136.field2278, arg3, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method28(64, 768, -50, -10, -50);
            class159.field2602.method1880(var9, var7, 54);
        }
        int var11 = arg2.method165();
        int var12 = arg2.method164();
        int var13 = arg2.method146();
        int var14 = arg2.method162();
        class309 var15 = var9.method144(true, true, true);
        if (arg4) {
            field5004 = -46;
        }
        if (arg0 != 0) {
            var15.method132(arg0);
        }
        if (class249.field3893) {
            class184 var18 = (class184) var15;
            if (class325.method2250(arg6 + var13, 22771, class289.field4438, arg5 + var11) != arg1 || arg1 != class325.method2250(arg6 + var14, 22771, class289.field4438, arg5 + var12)) {
                for (int var19 = 0; var19 < var18.field2947; var19++) {
                    var18.field2948[var19] += class325.method2250(var18.field2954[var19] + arg6, 22771, class289.field4438, var18.field2955[var19] + arg5) - arg1;
                }
                var18.field2941.field3470 = false;
                var18.field2963.field244 = false;
            }
        } else {
            class20 var16 = (class20) var15;
            if (arg1 != class325.method2250(arg6 + var13, 22771, class289.field4438, arg5 + var11) || arg1 != class325.method2250(arg6 + var14, 22771, class289.field4438, arg5 + var12)) {
                for (int var17 = 0; var17 < var16.field368; var17++) {
                    var16.field393[var17] += class325.method2250(var16.field349[var17] + arg6, 22771, class289.field4438, var16.field359[var17] + arg5) - arg1;
                }
                var16.field375 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 147)
    public static void method2263(int arg0) {
        if (arg0 != -11591) {
            field5009 = (class150[]) null;
        }
        field5008 = null;
        field5010 = null;
        field5009 = null;
        field4992 = null;
        field5001 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lag;IIB)V", line = 161)
    private final void method2264(class202 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 >= -5) {
            field5004 = -118;
        }
        field4997++;
        if (arg1 == 1) {
            this.field4993 = arg0.method1315(14289);
        } else if (arg1 == 2) {
            this.field4996 = arg0.method1352((byte) 126);
        } else if (arg1 == 3) {
            this.field4998 = true;
        } else if (arg1 == 4) {
            this.field4993 = -1;
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V", line = 190)
    public static final void method2265(int arg0) {
        field5007++;
        for (int var1 = 0; var1 < 5; var1++) {
            class39.field747[var1] = false;
        }
        class247.field3821 = arg0;
        class344.field5340 = -1;
        class196.field3155 = 0;
        class220.field3497 = -1;
        class135.field2271 = 1;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 213)
    public static final void method2266(boolean arg0, String arg1) {
        System.out.println("Error: " + class33.method267(arg1, "%0a", 17912, "\n"));
        if (arg0) {
            field5010 = (int[]) null;
        }
        field4995++;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BILag;)V", line = 229)
    public final void method2267(byte arg0, int arg1, class202 arg2) {
        field4991++;
        if (arg0 != 74) {
            method2263(82);
        }
        while (true) {
            int var4 = arg2.method1317((byte) -93);
            if (var4 == 0) {
                return;
            }
            this.method2264(arg2, var4, arg1, (byte) -45);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZII)Lmg;", line = 254)
    public final class113 method2268(boolean arg0, int arg1, int arg2) {
        if (arg1 != 21130) {
            method2263(-108);
        }
        class113 var4 = (class113) class28.field533.method1881(true, (long) (this.field4993 | arg2 << 16 | (arg0 ? 262144 : 0)));
        field5000++;
        if (var4 != null) {
            return var4;
        }
        class40.field783.method2051(-100, this.field4993);
        class113 var5 = class212.method1435(class40.field783, false, this.field4993, 0);
        if (var5 != null) {
            var5.method734(class252.field3944, class43.field821, class18.field333);
            var5.field1973 = var5.field1970;
            var5.field1971 = var5.field1968;
            if (arg0) {
                var5.method730();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method726();
            }
            class28.field533.method1880(var5, (long) ((arg0 ? 262144 : 0) | arg2 << 16 | this.field4993), 121);
        }
        return var5;
    }
}
