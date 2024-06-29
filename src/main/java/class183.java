import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class183 {

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public int field2888 = 128;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Z")
    public boolean field2889 = true;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public int field2891 = 8;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public int field2895 = 1190717;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public int field2897 = -1;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Z")
    public boolean field2892 = false;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Z")
    public boolean field2893 = true;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public int field2898 = -1;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public int field2906 = 16;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public int field2903 = 0;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static volatile int field2887 = 0;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "Ljava/lang/String;")
    public static String field2901 = "Please remove ";

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "Z")
    public static boolean field2908 = false;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "[I")
    public static int[] field2902;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field2904;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Lme;", line = 4)
    public static final class200 method1330(byte arg0) {
        field2886++;
        class200 var1;
        if (class162.field2623) {
            var1 = new class125(class185.field2926, class112.field1821, class61.field892[0], field2902[0], class309.field4887[0], class83.field1288[0], class207.field3277[0], class260.field3873);
        } else {
            var1 = new class186(class185.field2926, class112.field1821, class61.field892[0], field2902[0], class309.field4887[0], class83.field1288[0], class207.field3277[0], class260.field3873);
        }
        class260.method1796(1952227009);
        if (arg0 != 19) {
            method1332(-37);
        }
        return var1;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBLaj;)V", line = 29)
    public final void method1331(int arg0, byte arg1, class1 arg2) {
        field2900++;
        while (true) {
            int var4 = arg2.method15((byte) 108);
            if (var4 == 0) {
                if (arg1 >= -99) {
                    this.field2891 = -96;
                }
                return;
            }
            this.method1337(arg0, arg2, var4, -122);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 50)
    public static void method1332(int arg0) {
        field2901 = null;
        field2904 = null;
        field2902 = null;
        if (arg0 <= 46) {
            field2887 = -78;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V", line = 79)
    public static final void method1333(byte arg0) {
        field2907++;
        if (arg0 <= 81) {
            field2887 = 23;
        }
        if (class289.field4548 == 10 && class162.field2623) {
            class117.method921((byte) -126, 28);
        }
        if (class289.field4548 == 30) {
            class117.method921((byte) 82, 25);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(CLjava/lang/String;I)[Ljava/lang/String;", line = 100)
    public static final String[] method1334(char arg0, String arg1, int arg2) {
        field2890++;
        int var3 = class244.method1723(arg1, -109, arg0);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = arg2; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0 != arg1.charAt(var8); var8++) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V", line = 130)
    public static final void method1335(int arg0) {
        field2899++;
        if (class128.field2052) {
            return;
        }
        if (class126.field2018) {
            class171.field2747 = (float) ((int) class171.field2747 - 65 & 0xFFFFFF80);
        } else {
            class217.field3376 += (-24.0F - class217.field3376) / 2.0F;
        }
        class128.field2052 = true;
        class6.field134 = true;
        if (arg0 != -128) {
            method1336((StringBuffer) null, 81, 27, (char) 65480);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/StringBuffer;IIC)Ljava/lang/StringBuffer;", line = 168)
    public static final StringBuffer method1336(StringBuffer arg0, int arg1, int arg2, char arg3) {
        field2909++;
        if (arg1 != 3) {
            method1338(true, (Component) null);
        }
        int var4 = arg0.length();
        arg0.setLength(arg2);
        for (int var5 = var4; var5 < arg2; var5++) {
            arg0.setCharAt(var5, arg3);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILaj;II)V", line = 205)
    private final void method1337(int arg0, class1 arg1, int arg2, int arg3) {
        if (arg3 >= -5) {
            method1332(-104);
        }
        field2894++;
        if (arg2 == 1) {
            this.field2903 = class95.method777(true, arg1.method4(true));
        } else if (arg2 == 2) {
            this.field2898 = arg1.method15((byte) 104);
        } else if (arg2 == 3) {
            this.field2898 = arg1.method56(19612);
            if (this.field2898 == 65535) {
                this.field2898 = -1;
            }
        } else if (arg2 == 5) {
            this.field2893 = false;
        } else if (arg2 == 7) {
            this.field2897 = class95.method777(true, arg1.method4(true));
        } else if (arg2 == 8) {
            class76.field1186 = arg0;
        } else if (arg2 == 9) {
            this.field2888 = arg1.method56(19612);
        } else if (arg2 == 10) {
            this.field2889 = false;
        } else if (arg2 == 11) {
            this.field2891 = arg1.method15((byte) 66);
        } else if (arg2 == 12) {
            this.field2892 = true;
        } else if (arg2 == 13) {
            this.field2895 = arg1.method4(true);
        } else if (arg2 == 14) {
            this.field2906 = arg1.method15((byte) 85);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 274)
    public static final void method1338(boolean arg0, Component arg1) {
        field2905++;
        Method var2 = class69.field1056;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class24.field411);
        if (!arg0) {
            arg1.addFocusListener(class24.field411);
        }
    }
}
