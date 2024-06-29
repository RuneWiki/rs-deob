import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class64 {

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "[C")
    public static char[] field930 = new char[128];

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field929 = 0;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)Z", line = 11)
    public static final boolean method516(int arg0, byte arg1) {
        field932++;
        if (arg1 < 52) {
            field929 = -90;
        }
        class187 var2 = class291.method2036(arg0, 30725);
        if (var2 == null) {
            return false;
        } else if (class137.field2190 == 1 || class137.field2190 == 2 || class6.field109 == 2) {
            class271.field4209 = var2.field3009;
            class9.field170 = var2.field3014;
            if (class6.field109 != 0) {
                class334.field5197 = class271.field4209 + 40000;
                class21.field316 = class271.field4209 + 50000;
                class277.field4286 = class334.field5197;
            }
            return true;
        } else {
            String var3 = "";
            String var4 = "";
            if (class6.field109 != 0) {
                var3 = ":" + (var2.field3009 + 7000);
            }
            if (class315.field4933 != null) {
                var4 = "/p=" + class315.field4933;
            }
            String var5 = "http://" + var2.field3014 + var3 + "/l=" + class141.field2240 + "/a=" + class105.field1393 + var4 + "/j" + (class335.field5223 ? "1" : "0") + ",o" + (class98.field1291 ? "1" : "0") + ",a2,m" + (class62.field914 ? "1" : "0");
            try {
                class96.field1266.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 62)
    public static void method517(int arg0) {
        if (arg0 != 0) {
            field929 = 8;
        }
        field930 = null;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 146)
    public class64() {
        new class48();
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIIIII)V", line = 79)
    public static final void method518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field931++;
        if (arg2 > -115) {
            field929 = 110;
        }
        int var8 = class171.method1280(class42.field579, (byte) -7, class334.field5205, arg0);
        int var9 = class171.method1280(class42.field579, (byte) -7, class334.field5205, arg4);
        int var10 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1);
        int var11 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg3);
        int var12 = class171.method1280(class42.field579, (byte) -7, class334.field5205, arg0 + arg7);
        int var13 = class171.method1280(class42.field579, (byte) -7, class334.field5205, arg4 - arg7);
        for (int var14 = var8; var14 < var12; var14++) {
            class256.method1853(class284.field4402[var14], var10, arg5, var11, 0);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class256.method1853(class284.field4402[var15], var10, arg5, var11, 0);
        }
        int var16 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 + arg7);
        int var17 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg3 - arg7);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class284.field4402[var18];
            class256.method1853(var19, var10, arg5, var16, 0);
            class256.method1853(var19, var16, arg6, var17, 0);
            class256.method1853(var19, var17, arg5, var11, 0);
        }
    }
}
