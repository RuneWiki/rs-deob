import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class611 {

    @OriginalMember(owner = "client!tca", name = "m", descriptor = "Lui;")
    private class251 field8746 = new class251(64);

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "Lui;")
    public class251 field8753 = new class251(2);

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "Llga;")
    private class47 field8747;

    @OriginalMember(owner = "client!tca", name = "n", descriptor = "Llga;")
    public class47 field8748;

    @OriginalMember(owner = "client!tca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8759 = new String[] { method4519(method4518("\u0014v}@bH")), method4519(method4518("\u000e`p\u0002")), method4519(method4518("\u0014v}@aH")), method4519(method4518("\u001b;2@[")), method4519(method4518("\u0014v}@\u001a\t{u\u001a\u0018H")), method4519(method4518("\u0014v}@nH")), method4519(method4518("\u0014v}@cH")), method4519(method4518("\u0014v}@oH")), method4519(method4518("\u0014v}@`H")), method4519(method4518("\u0014v}@eH")), method4519(method4518("\u0014v}@dH")), method4519(method4518("\u0014v}@gH")) };

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "[I")
    public static int[] field8749 = new int[1];

    @OriginalMember(owner = "client!tca", name = "j", descriptor = "I")
    public static int field8745;

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "I")
    public static int field8750;

    @OriginalMember(owner = "client!tca", name = "k", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!tca", name = "h", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!tca", name = "l", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!tca", name = "i", descriptor = "Lwfa;")
    public static class286 field8751;

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V", line = 3)
    public final void method4509(int arg0) {
        try {
            class251 var2 = this.field8746;
            synchronized (this.field8746) {
                this.field8746.method2043(false);
            }
            field8752++;
            class251 var3 = this.field8753;
            synchronized (this.field8753) {
                this.field8753.method2043(false);
            }
            if (arg0 != 33) {
                this.field8746 = null;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8759[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(II)V", line = 21)
    public final void method4510(int arg0, int arg1) {
        try {
            if (arg1 >= 23) {
                field8750++;
                class251 var3 = this.field8746;
                synchronized (this.field8746) {
                    this.field8746.method2038(0, arg0);
                }
                class251 var4 = this.field8753;
                synchronized (this.field8753) {
                    this.field8753.method2038(0, arg0);
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8759[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V", line = 37)
    public final void method4511(int arg0) {
        try {
            field8758++;
            class251 var2 = this.field8746;
            synchronized (this.field8746) {
                if (arg0 != 33) {
                    method4517(-13, null);
                }
                this.field8746.method2047(11914);
            }
            class251 var3 = this.field8753;
            synchronized (this.field8753) {
                this.field8753.method2047(11914);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8759[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(ILlga;)V", line = 54)
    public static final void method4512(int arg0, class47 arg1) {
        try {
            field8756++;
            class12.field167 = arg1;
            if (arg0 != -3769) {
                field8751 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8759[10] + arg0 + ',' + (arg1 == null ? field8759[1] : field8759[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "(I)V", line = 65)
    public static void method4513(int arg0) {
        try {
            field8751 = null;
            if (arg0 <= -49) {
                field8749 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8759[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIILjava/lang/Object;)[B", line = 82)
    public static final byte[] method4514(int arg0, int arg1, int arg2, Object arg3) {
        try {
            field8755++;
            if (arg3 == null) {
                return null;
            } else if (arg3 instanceof byte[]) {
                byte[] var4 = (byte[]) arg3;
                return class132.method1152(arg2, arg1, -87, var4);
            } else if (arg3 instanceof class76) {
                class76 var5 = (class76) arg3;
                return var5.method538(arg1, arg2, true);
            } else {
                if (arg0 > -49) {
                    method4514(103, 45, -81, null);
                }
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8759[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8759[1] : field8759[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(II)Lhf;", line = 115)
    public final class198 method4515(int arg0, int arg1) {
        try {
            field8757++;
            class251 var3 = this.field8746;
            class198 var4;
            synchronized (this.field8746) {
                var4 = (class198) this.field8746.method2053(arg0 - 64, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            if (arg0 != 64) {
                field8749 = null;
            }
            class47 var5 = this.field8747;
            byte[] var6;
            synchronized (this.field8747) {
                var6 = this.field8747.method512(arg1, 33, (byte) -47);
            }
            class198 var7 = new class198();
            var7.field2929 = this;
            if (var6 != null) {
                var7.method1711((byte) 102, new class711(var6));
            }
            class251 var8 = this.field8746;
            synchronized (this.field8746) {
                this.field8746.method2051((long) arg1, var7, 93);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field8759[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lfs;ILlga;Llga;)V", line = 162)
    public class611(class796 arg0, int arg1, class47 arg2, class47 arg3) {
        try {
            this.field8747 = arg2;
            this.field8748 = arg3;
            this.field8747.method509(true, 33);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8759[4] + (arg0 == null ? field8759[1] : field8759[3]) + ',' + arg1 + ',' + (arg2 == null ? field8759[1] : field8759[3]) + ',' + (arg3 == null ? field8759[1] : field8759[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(BI)V", line = 179)
    public static final void method4516(byte arg0, int arg1) {
        try {
            field8745++;
            class294 var2 = class146.method1261((long) arg1, 119, 14);
            var2.method2376(-90);
            if (arg0 <= 14) {
                field8751 = null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8759[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(ILjc;)Lqfa;", line = 192)
    public static final class518 method4517(int arg0, class711 arg1) {
        try {
            field8754++;
            arg1.method5128(0);
            int var2 = arg1.method5128(0);
            class518 var3 = class337.method2710((byte) 84, var2);
            var3.field7571 = arg1.method5128(0);
            int var4 = arg1.method5128(arg0);
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method5128(arg0);
                var3.method17(var6, arg1, -3);
            }
            var3.method12(arg0 ^ 0x7E);
            return var3;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field8759[7] + arg0 + ',' + (arg1 == null ? field8759[1] : field8759[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4518(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x26);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4519(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 21;
                    break;
                case 2:
                    var10005 = 28;
                    break;
                case 3:
                    var10005 = 110;
                    break;
                default:
                    var10005 = 38;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
