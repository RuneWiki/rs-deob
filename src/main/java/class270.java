import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class270 extends class288 {

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "[Lwk;")
    public static class157[] field4366 = new class157[29];

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "[I")
    public static int[] field4368 = new int[500];

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "Lge;")
    public static class137 field4367;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)Z")
    public static final boolean method1821(int arg0, boolean arg1) {
        class219 var2 = class268.method1817(arg0, -94);
        ++field4362;
        if (var2 == null) {
            return false;
        } else if (class255.field4071 != 1 && ~class255.field4071 != -3 && ~class92.field1312 != -3) {
            String var3 = "";
            if (class92.field1312 != 0) {
                var3 = ":" + (var2.field3508 - -7000);
            }
            String var4 = "";
            if (class236.field3762 != null) {
                var4 = "/p=" + class236.field3762;
            }
            String var5 = "http://" + var2.field3505 + var3 + "/l=" + class261.field4147 + "/a=" + class286.field4561 + var4 + "/j" + (!class256.field4096 ? "0" : "1") + ",o" + (class221.field3528 ? "1" : "0") + ",a2,m" + (!class238.field3793 ? "0" : "1");
            try {
                class85.field1168.getAppletContext().showDocument(new URL(var5), "_self");
                if (!arg1) {
                    field4368 = null;
                }
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class111.field1920 = var2.field3505;
            class125.field2088 = var2.field3508;
            if (~class92.field1312 != -1) {
                class233.field3697 = class125.field2088 + 40000;
                class75.field1027 = class125.field2088 + 50000;
                class223.field3541 = class233.field3697;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)I")
    public static final int method1822(int arg0, int arg1, int arg2) {
        class204 var3 = (class204) class78.field1067.method457((long) arg0, (byte) -115);
        int var4 = 114 / ((24 - arg2) / 61);
        ++field4363;
        if (var3 == null) {
            return 0;
        } else if (~arg1 == 0) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var3.field3274.length > var6; ++var6) {
                if (~var3.field3276[var6] == ~arg1) {
                    var5 += var3.field3274[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)V")
    public static void method1823(byte arg0) {
        field4366 = null;
        if (arg0 >= -109) {
            field4367 = null;
        }
        field4368 = null;
        field4367 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field4365;
        if (arg0 != 0) {
            method1821(-14, true);
        }
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            int[][] var4 = this.method1930(0, arg1, (byte) -111);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class186.field2986 < ~var8; ++var8) {
                var3[var8] = (var6[var8] - -var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class270() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIB)V")
    public static final void method1824(int arg0, int arg1, int arg2, byte arg3) {
        ++field4364;
        if (arg3 == 24) {
            class283 var4 = class46.method360(11, -78, arg1);
            var4.method1893(0);
            var4.field4528 = arg0;
            var4.field4527 = arg2;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method1825(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (~arg2 <= ~class58.field817 && arg1 <= class121.field2042 && ~arg3 <= ~class156.field2507 && client.field3617 >= arg6) {
            class45.method351(arg3, arg2, arg5, arg4, arg1, arg6, (byte) -73, arg7);
        } else {
            class11.method65(arg4, arg1, arg2, arg5, arg6, 25342, arg7, arg3);
        }
        if (arg0 < 104) {
            field4366 = null;
        }
        ++field4369;
    }
}
