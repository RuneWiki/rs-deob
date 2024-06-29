import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class106 {

    @OriginalMember(owner = "client!nia", name = "n", descriptor = "[I")
    private int[] field1384 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!nia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1398 = new String[] { method1014(method1013("\u0016[(\u0010lP")), method1014(method1013("\u0003\u001cg\u0010S")), method1014(method1013("\u0016[(\u0010jP")), method1014(method1013("\u0016G%R")), method1014(method1013("\u0016[(\u0010kP")), method1014(method1013("\u0016[(\u0010hP")), method1014(method1013("\u0016[(\u0010mP")), method1014(method1013("\u0016[(\u0010iP")), method1014(method1013("\u0016[(\u0010oP")) };

    @OriginalMember(owner = "client!nia", name = "k", descriptor = "[Z")
    public static boolean[] field1387 = new boolean[100];

    @OriginalMember(owner = "client!nia", name = "j", descriptor = "F")
    public static float field1391;

    @OriginalMember(owner = "client!nia", name = "g", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!nia", name = "d", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!nia", name = "h", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!nia", name = "f", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!nia", name = "o", descriptor = "Lrl;")
    public class343 field1389;

    @OriginalMember(owner = "client!nia", name = "m", descriptor = "[I")
    private int[] field1394;

    @OriginalMember(owner = "client!nia", name = "i", descriptor = "[S")
    private short[] field1386;

    @OriginalMember(owner = "client!nia", name = "l", descriptor = "[S")
    private short[] field1390;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "[S")
    private short[] field1395;

    @OriginalMember(owner = "client!nia", name = "e", descriptor = "[S")
    private short[] field1397;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)Lrha;", line = 3)
    public final class60 method1006(int arg0) {
        try {
            field1383++;
            if (this.field1394 == null) {
                return null;
            }
            class60[] var2 = new class60[this.field1394.length];
            class47 var3 = this.field1389.field4992;
            synchronized (this.field1389.field4992) {
                int var4 = 0;
                while (true) {
                    if (var4 >= this.field1394.length) {
                        break;
                    }
                    var2[var4] = class372.method2951(this.field1394[var4], 0, (byte) -3, this.field1389.field4992);
                    var4++;
                }
            }
            for (int var5 = 0; var5 < this.field1394.length; var5++) {
                if (var2[var5].field902 < 13) {
                    var2[var5].method644(124, 2);
                }
            }
            class60 var6;
            if (var2.length == 1) {
                var6 = var2[0];
            } else {
                var6 = new class60(var2, var2.length);
            }
            if (arg0 != 13) {
                this.method1010((byte) 111);
            }
            if (var6 == null) {
                return null;
            }
            if (this.field1390 != null) {
                for (int var7 = 0; var7 < this.field1390.length; var7++) {
                    var6.method648(this.field1395[var7], this.field1390[var7], (byte) -54);
                }
            }
            if (this.field1386 != null) {
                for (int var8 = 0; var8 < this.field1386.length; var8++) {
                    var6.method645(this.field1386[var8], arg0 ^ 0x2470, this.field1397[var8]);
                }
            }
            return var6;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field1398[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Ljc;I)V", line = 80)
    public final void method1007(class711 arg0, int arg1) {
        try {
            field1392++;
            if (arg1 != -23200) {
                this.method1008(null, -38, 61);
            }
            while (true) {
                int var3 = arg0.method5128(0);
                if (var3 == 0) {
                    return;
                }
                this.method1008(arg0, var3, -2805);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1398[4] + (arg0 == null ? field1398[3] : field1398[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Ljc;II)V", line = 104)
    private final void method1008(class711 arg0, int arg1, int arg2) {
        try {
            field1385++;
            if (arg2 == -2805) {
                if (arg1 == 1) {
                    arg0.method5128(0);
                } else if (arg1 == 2) {
                    int var4 = arg0.method5128(0);
                    this.field1394 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1394[var5] = arg0.method5116((byte) -123);
                    }
                } else if (arg1 != 3) {
                    if (arg1 == 40) {
                        int var8 = arg0.method5128(arg2 ^ 0xFFFFF50B);
                        this.field1390 = new short[var8];
                        this.field1395 = new short[var8];
                        for (int var9 = 0; var9 < var8; var9++) {
                            this.field1390[var9] = (short) arg0.method5116((byte) -122);
                            this.field1395[var9] = (short) arg0.method5116((byte) -120);
                        }
                    } else if (arg1 == 41) {
                        int var6 = arg0.method5128(0);
                        this.field1397 = new short[var6];
                        this.field1386 = new short[var6];
                        for (int var7 = 0; var7 < var6; var7++) {
                            this.field1386[var7] = (short) arg0.method5116((byte) -105);
                            this.field1397[var7] = (short) arg0.method5116((byte) -118);
                        }
                    } else if (arg1 >= 60 && arg1 < 70) {
                        this.field1384[arg1 - 60] = arg0.method5116((byte) -110);
                        return;
                    }
                }
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field1398[2] + (arg0 == null ? field1398[3] : field1398[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "(I)Z", line = 186)
    public final boolean method1009(int arg0) {
        try {
            field1396++;
            if (this.field1394 == null) {
                return true;
            }
            boolean var2 = true;
            class47 var3 = this.field1389.field4992;
            synchronized (this.field1389.field4992) {
                for (int var4 = 0; var4 < this.field1394.length; var4++) {
                    if (!this.field1389.field4992.method506(arg0 - 11589, this.field1394[var4], 0)) {
                        var2 = false;
                    }
                }
                if (arg0 != 11519) {
                    this.field1389 = null;
                }
                return var2;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1398[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(B)Lrha;", line = 217)
    public final class60 method1010(byte arg0) {
        try {
            field1393++;
            class60[] var2 = new class60[5];
            int var3 = 0;
            class47 var4 = this.field1389.field4992;
            synchronized (this.field1389.field4992) {
                for (int var5 = 0; var5 < 5; var5++) {
                    if (this.field1384[var5] != -1) {
                        var2[var3++] = class372.method2951(this.field1384[var5], 0, (byte) -3, this.field1389.field4992);
                    }
                }
            }
            for (int var6 = 0; var6 < 5; var6++) {
                if (var2[var6] != null && var2[var6].field902 < 13) {
                    var2[var6].method644(121, 2);
                }
            }
            class60 var7 = new class60(var2, var3);
            if (this.field1390 != null) {
                for (int var8 = 0; var8 < this.field1390.length; var8++) {
                    var7.method648(this.field1395[var8], this.field1390[var8], (byte) -100);
                }
            }
            if (this.field1386 != null) {
                for (int var9 = 0; var9 < this.field1386.length; var9++) {
                    var7.method645(this.field1386[var9], 9341, this.field1397[var9]);
                }
            }
            int var10 = -91 / ((1 - arg0) / 33);
            return var7;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field1398[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(B)Z", line = 295)
    public final boolean method1011(byte arg0) {
        try {
            field1388++;
            if (arg0 != 76) {
                return false;
            }
            boolean var2 = true;
            class47 var3 = this.field1389.field4992;
            synchronized (this.field1389.field4992) {
                for (int var4 = 0; var4 < 5; var4++) {
                    if (this.field1384[var4] != -1 && !this.field1389.field4992.method506(-95, this.field1384[var4], 0)) {
                        var2 = false;
                    }
                }
                return var2;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1398[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(I)V", line = 333)
    public static void method1012(int arg0) {
        try {
            field1387 = null;
            if (arg0 != -6) {
                method1012(-69);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1398[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1013(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1014(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 120;
                    break;
                case 1:
                    var10005 = 50;
                    break;
                case 2:
                    var10005 = 73;
                    break;
                case 3:
                    var10005 = 62;
                    break;
                default:
                    var10005 = 46;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
