import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class590 {

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "Lui;")
    private class251 field8494 = new class251(64);

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "Llga;")
    private class47 field8487;

    @OriginalMember(owner = "client!eca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8496 = new String[] { method4360(method4359("@lC\r\u0013\r")), method4360(method4359("@lC\r\u0012\r")), method4360(method4359("@lC\r\u001f\r")), method4360(method4359("@lC\r\u001d\r")), method4360(method4359("@lC\riLaKWk\r")), method4360(method4359("KzNO")), method4360(method4359("^!\f\r(")), method4360(method4359("@lC\r\u0014\r")), method4360(method4359("@lC\r\u001c\r")), method4360(method4359("@lC\r\u0010\r")), method4360(method4359("@lC\r\u0011\r")) };

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "Lsb;")
    public static class261 field8493 = new class261(100, 0);

    @OriginalMember(owner = "client!eca", name = "j", descriptor = "I")
    public static int field8486;

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "I")
    public static int field8488;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "I")
    public static int field8490;

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!eca", name = "i", descriptor = "I")
    public static int field8492;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
    public static int field8495;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)V", line = 4)
    public static void method4349(byte arg0) {
        try {
            field8493 = null;
            if (arg0 != 103) {
                field8493 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8496[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZI)V", line = 18)
    public final void method4350(boolean arg0, int arg1) {
        try {
            if (!arg0) {
                class251 var3 = this.field8494;
                synchronized (this.field8494) {
                    this.field8494.method2038(0, arg1);
                }
                field8495++;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field8496[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)V", line = 32)
    public final void method4351(byte arg0) {
        try {
            if (arg0 != 102) {
                method4352(-24, -36, -86, null);
            }
            class251 var2 = this.field8494;
            synchronized (this.field8494) {
                this.field8494.method2047(arg0 + 11812);
            }
            field8491++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8496[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIILjava/lang/Class;)Llaa;", line = 50)
    public static final class604 method4352(int arg0, int arg1, int arg2, Class arg3) {
        class621 var4 = class608.field8715[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class219 var5 = var4.field8841; var5 != null; var5 = var5.field3190) {
            class604 var6 = var5.field3188;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field8663 == arg1 && var6.field8669 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "(B)V", line = 75)
    public final void method4353(byte arg0) {
        try {
            class251 var2 = this.field8494;
            synchronized (this.field8494) {
                this.field8494.method2043(false);
                if (arg0 < 10) {
                    this.field8487 = null;
                }
            }
            field8489++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8496[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIBII)V", line = 88)
    public static final void method4354(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        try {
            field8490++;
            class294 var5 = class146.method1261((long) arg3 | (long) arg4 << 32, -124, 19);
            var5.method2378(arg2 - 167);
            var5.field4133 = arg0;
            if (arg2 != 97) {
                field8493 = null;
            }
            var5.field4136 = arg1;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8496[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IB)Lir;", line = 103)
    public final class210 method4355(int arg0, byte arg1) {
        try {
            field8488++;
            class251 var3 = this.field8494;
            class210 var4;
            synchronized (this.field8494) {
                var4 = (class210) this.field8494.method2053(0, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field8487;
            byte[] var6;
            synchronized (this.field8487) {
                var6 = this.field8487.method512(arg0, 31, (byte) -105);
            }
            class210 var7 = new class210();
            if (var6 != null) {
                var7.method1776(121, new class711(var6));
            }
            class251 var8 = this.field8494;
            synchronized (this.field8494) {
                this.field8494.method2051((long) arg0, var7, 93);
            }
            return arg1 < 55 ? null : var7;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field8496[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Ljc;I)Ljava/lang/String;", line = 134)
    public static final String method4356(class711 arg0, int arg1) {
        try {
            if (arg1 != 32767) {
                method4357(null, null);
            }
            field8492++;
            return class287.method2334(arg1 ^ 0x7FFF, arg0, 32767);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8496[9] + (arg0 == null ? field8496[5] : field8496[6]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lrfa;[Lta;)V", line = 147)
    public static final void method4357(class202 arg0, class330[] arg1) {
        if (class721.field10271) {
            int var2 = arg0.method41((byte) 121, arg1);
            class531.field7699.method189(var2, arg1);
        }
        if (class677.field9474 == class107.field1413) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class604) {
                var5 = ((class604) arg0).field8663;
                var6 = ((class604) arg0).field8669;
            } else {
                var5 = arg0.field2969 >> class179.field2328;
                var6 = arg0.field2984 >> class179.field2328;
            }
            class531.field7699.method141(class213.field3124[0].method5440((byte) 15, arg0.field2969, arg0.field2984), class667.method4805(var5, var6), class496.method3816(var5, var6), class429.method3333(var5, var6));
        }
        class297 var7 = arg0.method573(false, class531.field7699);
        if (var7 == null) {
            return;
        }
        if (arg0.field2973) {
            class535[] var8 = var7.field4153;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class535 var10 = var8[var9];
                if (var10.field7769) {
                    class232.method1925(var10.field7764 - var10.field7765, var10.field7766 - var10.field7765, var10.field7768 + var10.field7765, var10.field7767 + var10.field7765, (byte) 110);
                }
            }
        }
        if (var7.field4146) {
            var7.field4150 = arg0;
            if (class335.field4851) {
                class217 var11 = class80.field1125;
                synchronized (class80.field1125) {
                    class80.field1125.method1839(0, var7);
                    return;
                }
            }
            class80.field1125.method1839(0, var7);
            return;
        }
        class228.method1899(-201, var7);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I[SI)[S", line = 221)
    public static final short[] method4358(int arg0, short[] arg1, int arg2) {
        try {
            field8486++;
            short[] var3 = new short[arg2];
            class569.method4241(arg1, 0, var3, arg0, arg2);
            return var3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8496[7] + arg0 + ',' + (arg1 == null ? field8496[5] : field8496[6]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lfs;ILlga;)V", line = 236)
    public class590(class796 arg0, int arg1, class47 arg2) {
        try {
            this.field8487 = arg2;
            this.field8487.method509(true, 31);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8496[4] + (arg0 == null ? field8496[5] : field8496[6]) + ',' + arg1 + ',' + (arg2 == null ? field8496[5] : field8496[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!eca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4359(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x55);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4360(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 37;
                    break;
                case 1:
                    var10005 = 15;
                    break;
                case 2:
                    var10005 = 34;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 85;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
