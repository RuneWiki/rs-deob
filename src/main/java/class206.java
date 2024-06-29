import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class206 {

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public int field3082;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3084 = "Walk here";

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "[Leb;")
    public static class247[] field3080 = new class247[14];

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "Lhg;")
    public static class181 field3085;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Lpf;")
    public static class294 field3081;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public static void method1301(byte arg0) {
        field3081 = null;
        if (arg0 != -61) {
            method1303(83, (class107) null);
        }
        field3085 = null;
        field3080 = null;
        field3084 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)V")
    public static final void method1302(int arg0, byte arg1) {
        if (!class4.field81) {
            arg0 = -1;
        }
        field3087++;
        if (class118.field1785 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class94 var2 = class292.method1936(104, arg0);
            class201 var3 = var2.method605(84);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class209.field3147.method62(new Point(var2.field1487, var2.field1485), var3.method1273(), var3.field3470, var3.field3463, arg1 ^ 0x19, class47.field762);
                class118.field1785 = arg0;
            }
        }
        if (arg0 == -1 && class118.field1785 != -1) {
            class209.field3147.method62(new Point(), (int[]) null, -1, -1, 17, class47.field762);
            class118.field1785 = -1;
        }
        if (arg1 != 8) {
            method1304(49, 50, -84, 24);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILjj;)V")
    public static final void method1303(int arg0, class107 arg1) {
        if (arg0 > -101) {
            field3080 = null;
        }
        field3091++;
        class151 var2 = (class151) class278.field4193.method1666(class94.method604((byte) 126, arg1.field1663), (byte) -112);
        if (var2 == null) {
            return;
        }
        if (var2.field2175 != null) {
            class213.field3187.method378(var2.field2175);
            var2.field2175 = null;
        }
        var2.method538(124);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)Lcl;")
    public static final class199 method1304(int arg0, int arg1, int arg2, int arg3) {
        field3089++;
        class199 var4 = new class199();
        var4.field3026 = arg1;
        var4.field3024 = arg0;
        class229.field3449.method1663((long) arg2, var4, arg3 ^ 0x7A9);
        class235.method1492(arg1, (byte) 76);
        class289 var5 = class89.method574((byte) -15, arg2);
        if (var5 != null) {
            class295.method1980(var5, 0);
        }
        if (class224.field3355 != null) {
            class295.method1980(class224.field3355, 0);
            class224.field3355 = null;
        }
        int var6 = class218.field3278;
        if (arg3 != -2003) {
            field3085 = null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            if (class195.method1218(-5, class84.field1339[var7])) {
                class13.method73(var7, 1);
            }
        }
        if (class218.field3278 == 1) {
            class218.field3275 = false;
            class8.method40(arg3 ^ 0xFFFFF82D, class213.field3190, class283.field4239, class32.field470, class236.field3558);
        } else {
            class8.method40(0, class213.field3190, class283.field4239, class32.field470, class236.field3558);
            int var8 = class192.field2953.method1036(class96.field1514);
            for (int var9 = 0; var9 < class218.field3278; var9++) {
                int var10 = class192.field2953.method1036(class233.method1486(arg3 + 2003, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class32.field470 = (class141.field2060 ? 26 : 22) + class218.field3278 * 15;
            class283.field4239 = var8 + 8;
        }
        if (var5 != null) {
            class163.method1010(false, var5, true);
        }
        class160.method997(arg1, 29283);
        if (class136.field1987 != -1) {
            class273.method1811(true, class136.field1987, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILpf;I)Lsb;")
    public static final class230 method1305(int arg0, class294 arg1, int arg2) {
        field3083++;
        if (arg0 != 20527) {
            field3084 = null;
        }
        return class225.method1431(arg2, arg1, (byte) 119) ? class83.method548((byte) 114) : null;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V")
    public class206() {
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lqh;)V")
    public class206(class206 arg0) {
        this.field3082 = arg0.field3082;
        this.field3088 = arg0.field3088;
        this.field3086 = arg0.field3086;
        this.field3090 = arg0.field3090;
    }
}
