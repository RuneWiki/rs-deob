import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class683 extends class574 {

    @OriginalMember(owner = "client!qp", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field9907 = new String[] { method5012(method5011("F^[^p")), method5012(method5011("F^[Rp")), method5012(method5011("F^[Xp")), method5012(method5011("F^[Yp")), method5012(method5011("L\u0000[:%")), method5012(method5011("F^[_p")), method5012(method5011("Y[\u0019x")), method5012(method5011("F^[Zp")) };

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "J")
    public static long field9904 = -1L;

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "I")
    public static int field9896;

    @OriginalMember(owner = "client!qp", name = "B", descriptor = "I")
    public int field9898;

    @OriginalMember(owner = "client!qp", name = "A", descriptor = "I")
    public static int field9899;

    @OriginalMember(owner = "client!qp", name = "F", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!qp", name = "C", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!qp", name = "I", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!qp", name = "D", descriptor = "I")
    public static int field9906;

    @OriginalMember(owner = "client!qp", name = "H", descriptor = "Llp;")
    public class411 field9903;

    @OriginalMember(owner = "client!qp", name = "E", descriptor = "[B")
    public byte[] field9901;

    @OriginalMember(owner = "client!qp", name = "G", descriptor = "[[Lcn;")
    public static class541[][] field9897;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(BII)Z")
    public static final boolean method5007(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 != -106) {
                return true;
            } else {
                ++field9896;
                return ~(arg1 & 256) != -1;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9907[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "(B)[B")
    public final byte[] method4281(byte arg0) {
        try {
            ++field9905;
            if (super.field8473) {
                throw new RuntimeException();
            } else {
                if (arg0 != -68) {
                    this.method4281((byte) -41);
                }
                return this.field9901;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9907[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIZI)V")
    public static final void method5008(int arg0, int arg1, boolean arg2, int arg3) {
        try {
            if (class195.field2615.method977((long) arg1, 1) == null) {
                if (!class204.field3168) {
                    class387.method3086(arg2, arg1, -88);
                } else {
                    class753 var4 = new class753(arg1, new class388(4096, class433.field6362, arg1), arg3, arg2);
                    var4.field10955.method919((byte) 99, class754.field10978[class167.field2300]);
                    class195.field2615.method968((byte) -111, (long) arg1, var4);
                }
            }
            ++field9902;
            if (arg0 <= 74) {
                method5010(-6, (class66) null, -50, 86, 51, 45, 13);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9907[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V")
    public static void method5009(boolean arg0) {
        try {
            if (arg0) {
                method5009(false);
            }
            field9897 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9907[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(B)I")
    public final int method4285(byte arg0) {
        try {
            if (arg0 != -42) {
                this.method4281((byte) -114);
            }
            ++field9906;
            return super.field8473 ? 0 : 100;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9907[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILha;IIIII)V")
    public static final void method5010(int arg0, class66 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            if (arg6 != 0) {
                method5010(-110, (class66) null, 23, -107, -127, -98, -41);
            }
            if ((class511.field7358 == null || class108.field1255 == null || class163.field2257 == null) && class383.field5798.method3618(class182.field2517, 54) && class383.field5798.method3618(class224.field3437, 106) && class383.field5798.method3618(class540.field7915, arg6 + 91)) {
                class481 var7 = class481.method3675(class383.field5798, class224.field3437, 0);
                class108.field1255 = arg1.method487(var7, true);
                var7.method3672();
                class286.field4251 = arg1.method487(var7, true);
                class511.field7358 = arg1.method487(class481.method3675(class383.field5798, class182.field2517, 0), true);
                class481 var8 = class481.method3675(class383.field5798, class540.field7915, 0);
                class163.field2257 = arg1.method487(var8, true);
                var8.method3672();
                class269.field4102 = arg1.method487(var8, true);
            }
            ++field9900;
            if (class511.field7358 != null && class108.field1255 != null && class163.field2257 != null) {
                int var9 = (-(2 * class163.field2257.method991()) + arg5) / class511.field7358.method991();
                for (int var10 = 0; ~var9 < ~var10; ++var10) {
                    class511.field7358.method4347(class163.field2257.method991() + (arg2 - -(class511.field7358.method991() * var10)), arg4 - (-arg0 - -class511.field7358.method986()));
                }
                int var11 = (-class163.field2257.method986() + -arg3 + arg0) / class108.field1255.method986();
                for (int var12 = 0; var12 < var11; ++var12) {
                    class108.field1255.method4347(arg2, arg3 + arg4 + var12 * class108.field1255.method986());
                    class286.field4251.method4347(-class286.field4251.method991() + arg2 + arg5, var12 * class108.field1255.method986() + arg3 + arg4);
                }
                class163.field2257.method4347(arg2, arg4 + arg0 + -class163.field2257.method986());
                class269.field4102.method4347(-class163.field2257.method991() + arg2 + arg5, arg0 + arg4 - class163.field2257.method986());
            }
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field9907[5] + arg0 + ',' + (arg1 != null ? field9907[4] : field9907[6]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5011(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 88);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5012(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 55;
                    break;
                case 1:
                    var10005 = 46;
                    break;
                case 2:
                    var10005 = 117;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 88;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
