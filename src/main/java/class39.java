import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class39 {

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public static int field626 = 2;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "Lwe;")
    public static class24 field628 = new class24(8);

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public int field622;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "Lqj;")
    public static class238 field632;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "Lqa;")
    public static class243 field629;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "Lme;")
    public class361 field621;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "Lis;")
    public class39 field627;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "[[[Lpm;")
    public static class10[][][] field633;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V", line = 4)
    public final void method302(int arg0) {
        field631++;
        if (class398.field5955 >= 500) {
            return;
        }
        this.field622 = arg0;
        this.field627 = class329.field4731;
        this.field621 = null;
        class398.field5955++;
        class329.field4731 = this;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V", line = 20)
    public static void method303(int arg0) {
        field629 = null;
        if (arg0 != 1) {
            method307(-33, 5);
        }
        field632 = null;
        field628 = null;
        field633 = null;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lvp;[IZ[I[I)V", line = 41)
    public static final void method304(class194 arg0, int[] arg1, boolean arg2, int[] arg3, int[] arg4) {
        if (arg2) {
            field629 = null;
        }
        for (int var5 = 0; var5 < arg1.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg3[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var7 != 0 && arg0.field288.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field288[var9] = null;
                    } else {
                        class15 var10 = class391.method2551(var6, (byte) -111);
                        int var11 = var10.field166;
                        class445 var12 = arg0.field288[var9];
                        if (var12 != null) {
                            if (var12.field6483 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field288[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field6482 = var8;
                                    var12.field6486 = 0;
                                    var12.field6479 = 0;
                                    var12.field6480 = 1;
                                    var12.field6481 = 0;
                                    class277.method1770(arg0.field5284, 21155, class100.field1350 == arg0, 0, arg0.field5298, var10);
                                } else if (var11 == 2) {
                                    var12.field6479 = 0;
                                }
                            } else if (var10.field153 >= class391.method2551(var12.field6483, (byte) -109).field153) {
                                var12 = arg0.field288[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class445 var13 = arg0.field288[var9] = new class445();
                            var13.field6482 = var8;
                            var13.field6486 = 0;
                            var13.field6481 = 0;
                            var13.field6483 = var6;
                            var13.field6480 = 1;
                            var13.field6479 = 0;
                            class277.method1770(arg0.field5284, 21155, class100.field1350 == arg0, 0, arg0.field5298, var10);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field625++;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lqj;BLqj;)I", line = 139)
    public static final int method305(class238 arg0, byte arg1, class238 arg2) {
        if (arg1 > -6) {
            return -93;
        }
        field623++;
        int var3 = 0;
        if (arg2.method1451(-124, class27.field483)) {
            var3++;
        }
        if (arg2.method1451(-114, class247.field3443)) {
            var3++;
        }
        if (arg2.method1451(-115, class81.field1132)) {
            var3++;
        }
        if (arg0.method1451(-121, class27.field483)) {
            var3++;
        }
        if (arg0.method1451(-128, class247.field3443)) {
            var3++;
        }
        if (arg0.method1451(-111, class81.field1132)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIIIII)V", line = 182)
    public static final void method306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 >= class203.field2942 && class297.field4268 >= arg4 && arg1 >= class180.field2375 && arg5 <= class50.field695) {
            class116.method819(arg5, arg0, arg4, arg2, 12, arg1);
        } else {
            class50.method348(arg0, arg2, arg4, arg5, arg1, (byte) -128);
        }
        field630++;
        if (arg3 != 1) {
            field632 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(II)I", line = 200)
    public static final int method307(int arg0, int arg1) {
        field624++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= arg0) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }
}
