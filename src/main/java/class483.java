import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class483 extends class130 {

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "S")
    public short field7074;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "Ljp;")
    public static class55 field7075 = new class55(50, -2);

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    public static int field7078 = -1;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public static int field7070;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "[I")
    public static int[] field7077;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "[Lo;")
    public static class363[] field7076;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V")
    public static void method2911(byte arg0) {
        field7076 = null;
        field7075 = null;
        if (arg0 >= 82) {
            field7077 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)V")
    public static final void method2912(byte arg0) {
        class218.field3284 = true;
        field7073++;
        if (arg0 != -50) {
            field7078 = -97;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([ILsj;[I[II)V")
    public static final void method2913(int[] arg0, class511 arg1, int[] arg2, int[] arg3, int arg4) {
        field7072++;
        if (arg4 != 23487) {
            return;
        }
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg0[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var7 != 0 && arg1.field7606.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field7606[var9] = null;
                    } else {
                        class61 var10 = class393.field5735.method1538(-4031, var6);
                        int var11 = var10.field954;
                        class390 var12 = arg1.field7606[var9];
                        if (var12 != null) {
                            if (var12.field5716 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field7606[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field5709 = 0;
                                    var12.field5711 = 0;
                                    var12.field5710 = 0;
                                    var12.field5707 = 1;
                                    var12.field5704 = var8;
                                    class439.method2721(class116.field1781 == arg1, var10, arg1.field1275, 0, (byte) 116, arg1.field1279, arg1.field1274);
                                } else if (var11 == 2) {
                                    var12.field5709 = 0;
                                }
                            } else if (var10.field971 >= class393.field5735.method1538(-4031, var12.field5716).field971) {
                                var12 = arg1.field7606[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class390 var13 = arg1.field7606[var9] = new class390();
                            var13.field5716 = var6;
                            var13.field5711 = 0;
                            var13.field5709 = 0;
                            var13.field5707 = 1;
                            var13.field5704 = var8;
                            var13.field5710 = 0;
                            class439.method2721(class116.field1781 == arg1, var10, arg1.field1275, 0, (byte) 116, arg1.field1279, arg1.field1274);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(BI)Z")
    public static final boolean method2914(byte arg0, int arg1) {
        field7071++;
        if (arg0 != -34) {
            field7075 = null;
        }
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IC)Z")
    public static final boolean method2915(int arg0, char arg1) {
        field7070++;
        if (arg0 == 50) {
            return arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
    public class483() {
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(S)V")
    public class483(short arg0) {
        this.field7074 = arg0;
    }
}
