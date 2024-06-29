import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class318 {

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "[I")
    public static int[] field5445 = new int[50];

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "[I")
    public static int[] field5451 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "Lce;")
    public static class126 field5447 = class206.method1445(-7923, "Benutzen");

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Lce;")
    private static class126 field5453 = class206.method1445(-7923, "Started 3d Library");

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field5455 = 0;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "Lce;")
    public static class126 field5457 = field5453;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "[I")
    public static int[] field5448 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "Lce;")
    public static class126 field5459 = class206.method1445(-7923, "Memory before cleanup=");

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "Ljk;")
    public static class273 field5449;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2210(int arg0) {
        field5456++;
        class136.field2362.method1185(1);
        class41.field659.method1185(1);
        if (arg0 <= 57) {
            field5455 = -65;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZI)V", line = 21)
    public static final void method2211(boolean arg0, int arg1) {
        class181.method1294(true);
        field5450++;
        if (class280.field4662 != 30 && class280.field4662 != 25) {
            return;
        }
        class58.field899++;
        if (arg1 > class58.field899 && !arg0) {
            return;
        }
        class58.field899 = 0;
        if (!class260.field4370 && class59.field953 != null) {
            class103.field1645.method1238(19, arg1 ^ 0x7F);
            class245.field4146++;
            try {
                class59.field953.method1945(class103.field1645.field2299, true, 0, class103.field1645.field2282);
                class103.field1645.field2299 = 0;
            } catch (IOException var3) {
                class260.field4370 = true;
            }
        }
        class181.method1294(true);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILwd;)Lce;", line = 62)
    public static final class126 method2212(int arg0, class112 arg1) {
        field5458++;
        if (arg0 != 137) {
            field5445 = (int[]) null;
        }
        if (class37.method203(client.method804(arg1), -7622) == 0) {
            return null;
        } else if (arg1.field1777 == null || arg1.field1777.method877(-107).method878((byte) -71) == 0) {
            return class241.field4091 ? class244.field4124 : null;
        } else {
            return arg1.field1777;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBIIILgd;I)V", line = 93)
    public static final void method2213(int arg0, byte arg1, int arg2, int arg3, int arg4, class138 arg5, int arg6) {
        if (arg1 != 93) {
            field5455 = -67;
        }
        field5454++;
        class161.method1188(arg0, true, arg2, arg5.field2487, arg6, arg5.field2461, arg3, arg4);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V", line = 111)
    public static void method2214(boolean arg0) {
        field5457 = null;
        field5448 = null;
        if (arg0) {
            return;
        }
        field5451 = null;
        field5445 = null;
        field5453 = null;
        field5447 = null;
        field5449 = null;
        field5459 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Z", line = 138)
    public static final boolean method2215(int arg0, int arg1) {
        if (arg0 != -1) {
            method2214(true);
        }
        field5446++;
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIJ)Z", line = 173)
    public static final boolean method2216(int arg0, int arg1, int arg2, long arg3) {
        class5 var5 = class297.field4940[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field46 != null && var5.field46.field2230 == arg3) {
            return true;
        } else if (var5.field49 != null && var5.field49.field1678 == arg3) {
            return true;
        } else if (var5.field52 != null && var5.field52.field101 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field61; var6++) {
                if (var5.field54[var6].field4045 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }
}
