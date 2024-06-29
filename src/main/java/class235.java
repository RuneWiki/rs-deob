import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class235 {

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "S")
    public static short field3197 = 1;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)V")
    public static final void method1496(int arg0, int arg1) {
        field3195++;
        class331 var2 = class123.field1633;
        synchronized (class123.field1633) {
            class123.field1633.method2054(-49, arg1);
        }
        class331 var3 = class171.field2392;
        synchronized (class171.field2392) {
            class171.field2392.method2054(-87, arg1);
        }
        int var4 = 55 / ((arg0 + 84) / 32);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZZZ)V")
    public static final void method1497(boolean arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method1497(true, true, true);
        }
        if (arg2) {
            class295.field4220--;
            if (class295.field4220 == 0) {
                class262.field3658 = null;
            }
        }
        field3198++;
        if (!arg0) {
            return;
        }
        class233.field3168--;
        if (class233.field3168 == 0) {
            class310.field4421 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method1498(String arg0, int arg1) throws ClassNotFoundException {
        int var2 = -72 % ((5 - arg1) / 59);
        field3193++;
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
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(II)V")
    public static final void method1499(int arg0, int arg1) {
        class238 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class319 var4 = class78.field887[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class52.field598; var5++) {
                    for (int var6 = 0; var6 < class158.field2245; var6++) {
                        var2 = var4.method1979(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << 7;
                            int var8 = var5 << 7;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class319 var10 = class78.field887[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1990(var6, var5) - var10.method1990(var6, var5);
                                    int var12 = var4.method1990(var6 + 1, var5) - var10.method1990(var6 + 1, var5);
                                    int var13 = var4.method1990(var6 + 1, var5 + 1) - var10.method1990(var6 + 1, var5 + 1);
                                    int var14 = var4.method1990(var6, var5 + 1) - var10.method1990(var6, var5 + 1);
                                    var10.method1980(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lra;I)V")
    public static final void method1500(class57 arg0, int arg1) {
        field3196++;
        if (arg1 != 32768) {
            method1500((class57) null, 84);
        }
        class383.field5620 = arg0;
    }
}
