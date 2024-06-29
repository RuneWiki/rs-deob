import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class104 {

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "[Ljava/lang/String;")
    private String[] field1576;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "[[[I")
    public static int[][][] field1573;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lk;III[Z)Z")
    public static final boolean method734(class485 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (client.field3472 != class590.field8430) {
            int var6 = class608.field8767[arg1].method1105(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class174 var8 = class608.field8767[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1105(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1106(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1107(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ldj;ILjava/lang/String;Z)Lci;")
    public static final class382 method735(class288 arg0, int arg1, String arg2, boolean arg3) {
        if (arg3) {
            return null;
        }
        field1571++;
        if (arg1 == 0) {
            return arg0.method1843(arg2, 26573);
        } else if (arg1 == 1) {
            try {
                class54.method510(arg3, "openjs", arg0.field3975, new Object[] { (new URL(arg0.field3975.getCodeBase(), arg2)).toString() });
                class382 var4 = new class382();
                var4.field5134 = 1;
                return var4;
            } catch (Throwable var10) {
                class382 var5 = new class382();
                var5.field5134 = 2;
                return var5;
            }
        } else if (arg1 == 2) {
            try {
                arg0.field3975.getAppletContext().showDocument(new URL(arg0.field3975.getCodeBase(), arg2), "_blank");
                class382 var6 = new class382();
                var6.field5134 = 1;
                return var6;
            } catch (Exception var11) {
                class382 var7 = new class382();
                var7.field5134 = 2;
                return var7;
            }
        } else if (arg1 == 3) {
            try {
                class54.method508((byte) 56, arg0.field3975, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                arg0.field3975.getAppletContext().showDocument(new URL(arg0.field3975.getCodeBase(), arg2), "_top");
                class382 var8 = new class382();
                var8.field5134 = 1;
                return var8;
            } catch (Exception var12) {
                class382 var9 = new class382();
                var9.field5134 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ldaa;Z)V")
    public static final void method736(class11 arg0, boolean arg1) {
        field1575++;
        int var2 = arg0.method112(-8838);
        class246.field3443 = new class329[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class246.field3443[var3] = new class329();
            class246.field3443[var3].field4403 = arg0.method112(-8838);
            class246.field3443[var3].field4401 = arg0.method63(arg1);
        }
        class74.field1186 = arg0.method112(-8838);
        class560.field7763 = arg0.method112(-8838);
        class602.field8671 = arg0.method112(-8838);
        class239.field3332 = new class212[class560.field7763 + 1 - class74.field1186];
        for (int var4 = 0; var4 < class602.field8671; var4++) {
            int var5 = arg0.method112(-8838);
            class212 var6 = class239.field3332[var5] = new class212();
            var6.field4364 = arg0.method110((byte) 65);
            var6.field4366 = arg0.method119(-54);
            var6.field2994 = class74.field1186 + var5;
            var6.field2992 = arg0.method63(arg1);
            var6.field2995 = arg0.method63(true);
        }
        class203.field2850 = arg0.method119(-85);
        class320.field4334 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(III[B[BIIZI)V")
    public static final void method737(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field1572++;
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 0x3);
        if (!arg7) {
            return;
        }
        for (int var11 = -arg2; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg5++;
                arg4[var10001] = (byte) (arg4[var10001] - arg3[arg0++]);
                int var14 = arg5++;
                arg4[var14] = (byte) (arg4[var14] - arg3[arg0++]);
                int var15 = arg5++;
                arg4[var15] = (byte) (arg4[var15] - arg3[arg0++]);
                int var16 = arg5++;
                arg4[var16] = (byte) (arg4[var16] - arg3[arg0++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg5++;
                arg4[var10001] = (byte) (arg4[var10001] - arg3[arg0++]);
            }
            arg5 += arg6;
            arg0 += arg1;
        }
    }

    @OriginalMember(owner = "client!ej", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1577++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public static void method738(int arg0) {
        if (arg0 > -99) {
            field1573 = null;
        }
        field1573 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method739(int arg0, int arg1) {
        field1578++;
        int var3 = -22 / ((arg1 - 4) / 51);
        return this.field1576[arg0];
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILmc;Lmc;)V")
    public static final void method740(int arg0, class114 arg1, class114 arg2) {
        class463.field6513++;
        if (arg0 != 1) {
            field1573 = null;
        }
        class351.method2108(class542.field7547, -10511);
        field1574++;
        class479.field6754.method117(114, arg2.field1810);
        class479.field6754.method84(arg1.field1749, (byte) -95);
        class479.field6754.method118((byte) 74, arg1.field1810);
        class479.field6754.method91((byte) 88, arg2.field1787);
        class479.field6754.method91((byte) 88, arg1.field1787);
        class479.field6754.method91((byte) 88, arg2.field1749);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLmc;)Lmc;")
    public static final class114 method741(byte arg0, class114 arg1) {
        field1579++;
        if (arg1.field1897 != -1) {
            return class612.method3584(arg1.field1897, 0);
        }
        int var2 = arg1.field1810 >>> 16;
        if (arg0 != -128) {
            return null;
        }
        class615 var3 = new class615(class211.field2971);
        for (class128 var4 = (class128) var3.method3591(false); var4 != null; var4 = (class128) var3.method3595((byte) 4)) {
            if (var4.field2065 == var2) {
                return class612.method3584((int) var4.field2524, 0);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class104(String arg0, String arg1, String arg2, String arg3) {
        this.field1576 = new String[] { arg0, arg1, arg2, arg3 };
    }
}
