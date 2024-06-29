import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class663 {

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public int field9378;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "[I")
    public int[] field9377;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "[I")
    public int[] field9374;

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9379 = new String[] { method4797(method4796("CTtI\u0001DM.K@")), method4797(method4796("CTt6@")), method4797(method4796("CTt7@")), method4797(method4796("DQ6\u0019")), method4797(method4796("Q\nt[\u0015")), method4797(method4796("IL;")), method4797(method4796("DW4F")), method4797(method4796("DW4G")), method4797(method4796("DW4D")), method4797(method4796("DW4E")), method4797(method4796("CTt4@")) };

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "[I")
    public static int[] field9371 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "Lsb;")
    public static class261 field9376 = new class261(124, -1);

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public static int field9372;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public static int field9375;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "Lfl;")
    public static class794 field9373;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Leea;Z)V")
    public static final void method4793(class476 arg0, boolean arg1) {
        try {
            field9375++;
            int var2 = 0;
            arg0.method3678(-1);
            for (int var3 = 0; var3 < class689.field9642; var3++) {
                int var4 = class599.field8595[var3];
                if ((class356.field5179[var4] & 0x1) == 0) {
                    if (var2 > 0) {
                        var2--;
                        class356.field5179[var4] = (byte) class10.method71(class356.field5179[var4], 2);
                    } else {
                        int var5 = arg0.method3677(-67, 1);
                        if (var5 == 0) {
                            var2 = class721.method5220(arg0, (byte) -125);
                            class356.field5179[var4] = (byte) class10.method71(class356.field5179[var4], 2);
                        } else {
                            class616.method4540((byte) -52, var4, arg0);
                        }
                    }
                }
            }
            arg0.method3681(-113);
            if (var2 != 0) {
                throw new RuntimeException(field9379[9]);
            }
            arg0.method3678(-1);
            for (int var6 = 0; var6 < class689.field9642; var6++) {
                int var7 = class599.field8595[var6];
                if ((class356.field5179[var7] & 0x1) != 0) {
                    if (var2 > 0) {
                        class356.field5179[var7] = (byte) class10.method71(class356.field5179[var7], 2);
                        var2--;
                    } else {
                        int var8 = arg0.method3677(-97, 1);
                        if (var8 == 0) {
                            var2 = class721.method5220(arg0, (byte) -122);
                            class356.field5179[var7] = (byte) class10.method71(class356.field5179[var7], 2);
                        } else {
                            class616.method4540((byte) -66, var7, arg0);
                        }
                    }
                }
            }
            arg0.method3681(-111);
            if (var2 != 0) {
                throw new RuntimeException(field9379[8]);
            }
            arg0.method3678(-1);
            for (int var9 = 0; var9 < class597.field8584; var9++) {
                int var10 = class751.field10698[var9];
                if ((class356.field5179[var10] & 0x1) != 0) {
                    if (var2 > 0) {
                        class356.field5179[var10] = (byte) class10.method71(class356.field5179[var10], 2);
                        var2--;
                    } else {
                        int var11 = arg0.method3677(-105, 1);
                        if (var11 == 0) {
                            var2 = class721.method5220(arg0, (byte) -116);
                            class356.field5179[var10] = (byte) class10.method71(class356.field5179[var10], 2);
                        } else if (class674.method4837(arg0, var10, 5)) {
                            class356.field5179[var10] = (byte) class10.method71(class356.field5179[var10], 2);
                        }
                    }
                }
            }
            arg0.method3681(-113);
            if (var2 != 0) {
                throw new RuntimeException(field9379[7]);
            }
            arg0.method3678(-1);
            for (int var12 = 0; var12 < class597.field8584; var12++) {
                int var13 = class751.field10698[var12];
                if ((class356.field5179[var13] & 0x1) == 0) {
                    if (var2 > 0) {
                        class356.field5179[var13] = (byte) class10.method71(class356.field5179[var13], 2);
                        var2--;
                    } else {
                        int var14 = arg0.method3677(-71, 1);
                        if (var14 == 0) {
                            var2 = class721.method5220(arg0, (byte) -120);
                            class356.field5179[var13] = (byte) class10.method71(class356.field5179[var13], 2);
                        } else if (class674.method4837(arg0, var13, 5)) {
                            class356.field5179[var13] = (byte) class10.method71(class356.field5179[var13], 2);
                        }
                    }
                }
            }
            arg0.method3681(-66);
            if (var2 != 0) {
                throw new RuntimeException(field9379[6]);
            }
            class689.field9642 = 0;
            class597.field8584 = 0;
            int var15 = 1;
            if (!arg1) {
                method4794(null, (byte) -34, false);
            }
            while (var15 < 2048) {
                class356.field5179[var15] = (byte) (class356.field5179[var15] >> 1);
                class339 var16 = class748.field10666[var15];
                if (var16 == null) {
                    class751.field10698[class597.field8584++] = var15;
                } else {
                    class599.field8595[class689.field9642++] = var15;
                }
                var15++;
            }
        } catch (RuntimeException var18) {
            throw class665.method4799(var18, field9379[10] + (arg0 == null ? field9379[3] : field9379[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "([BBZ)Ljava/lang/Object;")
    public static final Object method4794(byte[] arg0, byte arg1, boolean arg2) {
        try {
            field9372++;
            if (arg0 == null) {
                return null;
            }
            if (arg0.length > 136 && !class412.field5929) {
                try {
                    class76 var3 = (class76) Class.forName(field9379[5]).getDeclaredConstructor().newInstance();
                    var3.method540(arg0, 123);
                    return var3;
                } catch (Throwable var5) {
                    class412.field5929 = true;
                }
            }
            if (arg1 != -57) {
                method4794(null, (byte) 65, true);
            }
            return arg2 ? class526.method3995(arg0, false) : arg0;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9379[2] + (arg0 == null ? field9379[3] : field9379[4]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    public static void method4795(int arg0) {
        try {
            field9373 = null;
            field9371 = null;
            int var1 = 85 / ((41 - arg0) / 47);
            field9376 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9379[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(I)V")
    public class663(int arg0) {
        try {
            this.field9378 = arg0;
            this.field9377 = new int[this.field9378];
            this.field9374 = new int[this.field9378];
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9379[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4796(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x68);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4797(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 42;
                    break;
                case 1:
                    var10005 = 36;
                    break;
                case 2:
                    var10005 = 90;
                    break;
                case 3:
                    var10005 = 117;
                    break;
                default:
                    var10005 = 104;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
