import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class398 {

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Lem;")
    private class434 field6012 = new class434();

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    private int field6009;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    private int field6006;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "Lru;")
    private class177 field6018;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field6001 = 0;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lbi;")
    public static class104 field6000 = new class104(95, 0);

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "Z")
    public static boolean field6019 = false;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ldd;B)Ljava/lang/Object;")
    public final Object method2559(class480 arg0, byte arg1) {
        field6017++;
        if (arg1 != -115) {
            this.method2564(-97);
        }
        long var3 = arg0.method76((byte) -68);
        for (class105 var5 = (class105) this.field6018.method1122((byte) 59, var3); var5 != null; var5 = (class105) this.field6018.method1124((byte) -63)) {
            if (var5.field1536.method78(arg0, -28282)) {
                Object var6 = var5.method226(1);
                if (var6 != null) {
                    if (var5.method227(122)) {
                        class237 var7 = new class237(arg0, var6, var5.field1534);
                        this.field6018.method1127(var7, (byte) 19, var5.field7780);
                        this.field6012.method2731(var7, (byte) 49);
                        var7.field5226 = 0L;
                        var5.method3149(arg1 + 195);
                        var5.method2219(0);
                    } else {
                        this.field6012.method2731(var5, (byte) 49);
                        var5.field5226 = 0L;
                    }
                    return var6;
                }
                var5.method3149(91);
                var5.method2219(0);
                this.field6009 += var5.field1534;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ldd;Ljava/lang/Object;I)V")
    public final void method2560(class480 arg0, Object arg1, int arg2) {
        this.method2571(arg1, arg0, -11730, 1);
        field6016++;
        int var4 = 19 / ((arg2 + 22) / 56);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)I")
    public final int method2561(int arg0) {
        field5999++;
        if (arg0 != 0) {
            this.field6006 = -10;
        }
        return this.field6006;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2562(int arg0, String arg1) {
        field6004++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class162.field2352; var2++) {
            if (arg1.equalsIgnoreCase(class401.field6038[var2])) {
                return var2;
            }
        }
        int var3 = -123 % ((41 - arg0) / 46);
        return -1;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public final void method2563(int arg0) {
        field6003++;
        this.field6012.method2730(0);
        this.field6018.method1128(-112);
        if (arg0 <= 115) {
            this.field6009 = 104;
        }
        this.field6009 = this.field6006;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)I")
    public final int method2564(int arg0) {
        field6008++;
        if (arg0 != 0) {
            field6001 = -78;
        }
        return this.field6009;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
    public final void method2565(int arg0) {
        if (arg0 != 0) {
            field6000 = null;
        }
        field6002++;
        for (class105 var2 = (class105) this.field6012.method2732(34); var2 != null; var2 = (class105) this.field6012.method2729(83)) {
            if (var2.method227(125)) {
                var2.method3149(83);
                var2.method2219(0);
                this.field6009 += var2.field1534;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
    public final void method2566(int arg0, int arg1) {
        if (arg1 != 6780) {
            this.field6006 = -119;
        }
        if (class432.field6532 != null) {
            for (class105 var3 = (class105) this.field6012.method2732(arg1 ^ 0x1A5E); var3 != null; var3 = (class105) this.field6012.method2729(127)) {
                if (var3.method227(arg1 - 6658)) {
                    if (var3.method226(1) == null) {
                        var3.method3149(arg1 - 6674);
                        var3.method2219(0);
                        this.field6009 += var3.field1534;
                    }
                } else if ((++var3.field5226) > ((long) arg0)) {
                    class105 var4 = class432.field6532.method2386(107, var3);
                    this.field6018.method1127(var4, (byte) 45, var3.field7780);
                    class382.method2468(var3, var4, false);
                    var3.method3149(arg1 - 6712);
                    var3.method2219(arg1 - 6780);
                }
            }
        }
        field6013++;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ldd;I)V")
    private final void method2567(class480 arg0, int arg1) {
        field6011++;
        long var3 = arg0.method76((byte) -68);
        if (arg1 != 10322) {
            this.field6009 = -122;
        }
        for (class105 var5 = (class105) this.field6018.method1122((byte) 59, var3); var5 != null; var5 = (class105) this.field6018.method1124((byte) -100)) {
            if (var5.field1536.method78(arg0, arg1 - 38604)) {
                this.method2568(var5, arg1 - 10203);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lmh;I)V")
    private final void method2568(class105 arg0, int arg1) {
        if (arg0 != null) {
            arg0.method3149(57);
            arg0.method2219(0);
            this.field6009 += arg0.field1534;
        }
        field6005++;
        if (arg1 <= 91) {
            this.method2563(-62);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIZIBI)V")
    public static final void method2569(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        if (class216.field3671 != null && (arg0 != 3 || class141.field1911.field6117 != arg1 || class141.field1911.field6116 != arg3)) {
            class355.method2342((byte) 126, class339.field5294, class216.field3671);
            class216.field3671 = null;
        }
        field6015++;
        if (arg0 == 3 && class216.field3671 == null) {
            class216.field3671 = class162.method996(class339.field5294, arg1, 0, 0, 2015625216, arg3);
            if (class216.field3671 != null) {
                class141.field1911.field6117 = arg1;
                class141.field1911.field6116 = arg3;
                class141.field1911.method1638(32749, class339.field5294);
            }
        }
        if (arg0 == 3 && class216.field3671 == null) {
            method2569(class141.field1911.field6110, -1, true, -1, (byte) 126, arg5);
            return;
        }
        if (arg4 <= 55) {
            field6007 = 26;
        }
        Container var7;
        if (class216.field3671 != null) {
            class414.field6267 = arg1;
            var7 = class216.field3671;
            class329.field5175 = arg3;
        } else if (class92.field1342 == null) {
            var7 = class339.field5294.field27;
            class414.field6267 = var7.getSize().width;
            class329.field5175 = var7.getSize().height;
        } else {
            Insets var6 = class92.field1342.getInsets();
            class414.field6267 = class92.field1342.getSize().width - var6.right - var6.left;
            class329.field5175 = class92.field1342.getSize().height - var6.bottom - var6.top;
            var7 = class92.field1342;
        }
        if (arg0 == 1) {
            class219.field3715 = class95.field1391;
            class50.field638 = (class414.field6267 - class437.field6752) / 2;
            class489.field7400 = class437.field6752;
            class14.field149 = 0;
        } else if (class491.field7438 < 96 && class452.field7013 == 0) {
            int var8 = class414.field6267 <= 1024 ? class414.field6267 : 1024;
            int var9 = class329.field5175 <= 768 ? class329.field5175 : 768;
            class50.field638 = (class414.field6267 - var8) / 2;
            class489.field7400 = var8;
            class219.field3715 = var9;
            class14.field149 = 0;
        } else {
            class14.field149 = 0;
            class489.field7400 = class414.field6267;
            class50.field638 = 0;
            class219.field3715 = class329.field5175;
        }
        if (class209.field3228 != class181.field2626) {
            boolean var10000;
            if (class489.field7400 < 1024 && class219.field3715 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg2) {
            class88.method608(44);
        } else {
            class320.field4980.setSize(class489.field7400, class219.field3715);
            class19.field198.method1253(class320.field4980);
            if (class92.field1342 == var7) {
                Insets var10 = class92.field1342.getInsets();
                class320.field4980.setLocation(var10.left + class50.field638, class14.field149 + var10.top);
            } else {
                class320.field4980.setLocation(class50.field638, class14.field149);
            }
        }
        if (arg0 < 2) {
            class209.field3229 = false;
        } else {
            class209.field3229 = true;
        }
        if (class509.field7597 != -1) {
            class154.method942(true, 54);
        }
        if (class338.field5281 != null && class163.method1031(class148.field1994, 11)) {
            class411.method2628(0);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class520.field7707[var11] = true;
        }
        class372.field5718 = true;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
    public static void method2570(int arg0) {
        if (arg0 != 0) {
            field6014 = -78;
        }
        field6000 = null;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V")
    public class398(int arg0) {
        this.field6009 = arg0;
        this.field6006 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field6018 = new class177(var2);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ljava/lang/Object;Ldd;II)V")
    private final void method2571(Object arg0, class480 arg1, int arg2, int arg3) {
        field6010++;
        if (arg3 > this.field6006) {
            throw new IllegalStateException("s>cs");
        }
        this.method2567(arg1, arg2 ^ 0xFFFFFA7C);
        this.field6009 -= arg3;
        if (arg2 != -11730) {
            return;
        }
        while (this.field6009 < 0) {
            class105 var6 = (class105) this.field6012.method2735((byte) -114);
            this.method2568(var6, arg2 + 11833);
        }
        class237 var5 = new class237(arg1, arg0, arg3);
        this.field6018.method1127(var5, (byte) 99, arg1.method76((byte) -68));
        this.field6012.method2731(var5, (byte) 49);
        var5.field5226 = 0L;
    }
}
