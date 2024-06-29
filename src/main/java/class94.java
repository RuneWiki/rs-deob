import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class94 extends class159 {

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public int field1373;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field1378 = 0;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "Lhh;")
    public static class56 field1375 = new class56();

    @OriginalMember(owner = "client!p", name = "n", descriptor = "F")
    public static float field1371;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Llj;")
    public static class289 field1377;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "[I")
    public static int[] field1379;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 4)
    public static final void method623(byte arg0) {
        if (arg0 < -37) {
            field1372++;
            class202.field3101.method651(0);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V", line = 15)
    public static final void method624(int arg0, int arg1) {
        field1369++;
        class220 var2 = (class220) class294.field4888.method29((long) arg1, 103);
        if (var2 != null) {
            for (int var3 = arg0; var3 < var2.field3377.length; var3++) {
                var2.field3377[var3] = -1;
                var2.field3375[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 38)
    public static final void method625(String arg0, int arg1) {
        field1376++;
        if (class166.field2623 == null) {
            return;
        }
        int var2 = 0;
        long var3 = class265.method1872(arg0, 101);
        if (var3 == 0L || arg1 != -12605) {
            return;
        }
        while (var2 < class166.field2623.length && class166.field2623[var2].field2549 != var3) {
            var2++;
        }
        if (var2 < class166.field2623.length && class166.field2623[var2] != null) {
            class195.field2992.method250(21066, 145);
            class20.field235++;
            class195.field2992.method2228(class166.field2623[var2].field2549, true);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 81)
    public static final String method626(int arg0, boolean arg1) {
        field1374++;
        if (!arg1) {
            field1378 = 9;
        }
        return arg0 >= 999999999 ? "*" : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V", line = 97)
    public static final void method627(byte arg0) {
        if (arg0 != 25) {
            return;
        }
        field1381++;
        if (class55.field843 == 0) {
            return;
        }
        try {
            if ((++class26.field399) > 2000) {
                if (class346.field5545 != null) {
                    class346.field5545.method674((byte) -83);
                    class346.field5545 = null;
                }
                if (class268.field4421 >= 1) {
                    class45.field654 = -5;
                    class55.field843 = 0;
                    return;
                }
                class268.field4421++;
                if (class285.field4669 == class21.field248) {
                    class285.field4669 = class273.field4500;
                } else {
                    class285.field4669 = class21.field248;
                }
                class55.field843 = 1;
                class26.field399 = 0;
            }
            if (class55.field843 == 1) {
                class218.field3366 = class96.field1382.method1950(class242.field3811, class285.field4669, 117);
                class55.field843 = 2;
            }
            if (class55.field843 == 2) {
                if (class218.field3366.field2542 == 2) {
                    throw new IOException();
                }
                if (class218.field3366.field2542 != 1) {
                    return;
                }
                class346.field5545 = new class102((Socket) class218.field3366.field2538, class96.field1382);
                class218.field3366 = null;
                class346.field5545.method669(0, class195.field2992.field5124, class195.field2992.field5137, (byte) -102);
                if (class291.field4828 != null) {
                    class291.field4828.method1096(false);
                }
                if (class15.field199 != null) {
                    class15.field199.method1096(false);
                }
                int var1 = class346.field5545.method668(0);
                if (class291.field4828 != null) {
                    class291.field4828.method1096(false);
                }
                if (class15.field199 != null) {
                    class15.field199.method1096(false);
                }
                if (var1 != 21) {
                    class55.field843 = 0;
                    class45.field654 = var1;
                    class346.field5545.method674((byte) -83);
                    class346.field5545 = null;
                    return;
                }
                class55.field843 = 3;
            }
            if (class55.field843 == 3) {
                if (class346.field5545.method667(true) < 1) {
                    return;
                }
                class61.field938 = new String[class346.field5545.method668(0)];
                class55.field843 = 4;
            }
            if (class55.field843 == 4) {
                if (class346.field5545.method667(true) < (class61.field938.length * 8)) {
                    return;
                }
                class159.field2552.field5137 = 0;
                class346.field5545.method670(0, class159.field2552.field5124, (byte) 18, class61.field938.length * 8);
                for (int var2 = 0; var2 < class61.field938.length; var2++) {
                    class61.field938[var2] = class267.method1884(arg0 - 65562, class159.field2552.method2204(true));
                }
                class55.field843 = 0;
                class45.field654 = 21;
                class346.field5545.method674((byte) -83);
                class346.field5545 = null;
                return;
            }
        } catch (IOException var4) {
            if (class346.field5545 != null) {
                class346.field5545.method674((byte) -83);
                class346.field5545 = null;
            }
            if (class268.field4421 >= 1) {
                class45.field654 = -4;
                class55.field843 = 0;
            } else {
                class26.field399 = 0;
                class55.field843 = 1;
                class268.field4421++;
                if (class285.field4669 == class21.field248) {
                    class285.field4669 = class273.field4500;
                } else {
                    class285.field4669 = class21.field248;
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V", line = 251)
    public static void method628(int arg0) {
        int var1 = 119 % ((arg0 + 7) / 63);
        field1377 = null;
        field1375 = null;
        field1379 = null;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V", line = 263)
    public class94() {
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(I)V", line = 270)
    public class94(int arg0) {
        this.field1373 = arg0;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Lsi;", line = 283)
    public static final class264 method629(int arg0, int arg1) {
        field1380++;
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        if (arg0 != 5386) {
            method626(83, true);
        }
        if (class167.field2627[var2] == null || class167.field2627[var2][var3] == null) {
            boolean var4 = class31.method266(var2, 1);
            if (!var4) {
                return null;
            }
        }
        return class167.field2627[var2][var3];
    }
}
