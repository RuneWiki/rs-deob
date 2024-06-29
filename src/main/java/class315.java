import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class315 {

    @OriginalMember(owner = "client!jha", name = "e", descriptor = "Lui;")
    private class251 field4314 = new class251(128);

    @OriginalMember(owner = "client!jha", name = "c", descriptor = "Lui;")
    public class251 field4319 = new class251(64);

    @OriginalMember(owner = "client!jha", name = "i", descriptor = "Llga;")
    public class47 field4315;

    @OriginalMember(owner = "client!jha", name = "h", descriptor = "Llga;")
    private class47 field4310;

    @OriginalMember(owner = "client!jha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4321 = new String[] { method2511(method2510(";u\u0002\u0013py")), method2511(method2510(";u\u0002\u0013qy")), method2511(method2510(";u\u0002\u0013ty")), method2511(method2510(";u\u0002\u0013ry")), method2511(method2510(";u\u0002\u0013wy")), method2511(method2510(";u\u0002\u0013sy")), method2511(method2510("*3M\u0013K")), method2511(method2510(";u\u0002\u0013\n8s\nI\by")), method2511(method2510("?h\u000fQ")), method2511(method2510(";u\u0002\u0013uy")) };

    @OriginalMember(owner = "client!jha", name = "j", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!jha", name = "d", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!jha", name = "g", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!jha", name = "f", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!jha", name = "k", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(IZI)V")
    public final void method2503(int arg0, boolean arg1, int arg2) {
        try {
            if (!arg1) {
                this.field4314 = null;
            }
            field4311++;
            this.field4314 = new class251(arg2);
            this.field4319 = new class251(arg0);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4321[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(B)V")
    public static final void method2504(byte arg0) {
        try {
            class345.field5028 = 0;
            field4320++;
            class477.field7028 = -1;
            class346.field5032 = -1;
            if (arg0 == -102) {
                ;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4321[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(ZB)V")
    public static final void method2505(boolean arg0, byte arg1) {
        try {
            if (arg0) {
                if (class572.field8291 != -1) {
                    class247.method2015(class572.field8291, arg1 + 6);
                }
                for (class509 var2 = (class509) class104.field1375.method3696(0); var2 != null; var2 = (class509) class104.field1375.method3697(-67)) {
                    if (!var2.method4293(-118)) {
                        var2 = (class509) class104.field1375.method3696(0);
                        if (var2 == null) {
                            break;
                        }
                    }
                    class394.method3082(var2, true, false, arg1 - 4500);
                }
                class572.field8291 = -1;
                class104.field1375 = new class477(8);
                class690.method4928((byte) -92);
                class572.field8291 = class265.field3741;
                class273.method2240(16664, false);
                class591.method4369(0);
                class158.method1326(class572.field8291);
            }
            field4316++;
            class316.method2515((byte) -57);
            class24.field285 = false;
            class179.method1495((byte) 98);
            class670.field9445 = -1;
            class714.method5172(class204.field2993, -1);
            class203.field2988 = new class339();
            class203.field2988.field2252[0] = class625.field8929 / 2;
            class203.field2988.field2984 = class14.field187 * 512 / 2;
            class203.field2988.field2969 = class625.field8929 * 512 / 2;
            if (arg1 == 62) {
                class688.field9635 = 0;
                class670.field9442 = 0;
                class203.field2988.field2256[0] = class14.field187 / 2;
                if (class596.field8579 == 2) {
                    class688.field9635 = class767.field10954 << 9;
                    class670.field9442 = class152.field1944 << 9;
                } else {
                    class738.method5354(arg1 - 180);
                }
                class180.method1498((byte) 126);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4321[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "(B)V")
    public final void method2506(byte arg0) {
        try {
            field4318++;
            if (arg0 < 113) {
                this.method2507(false, 31);
            }
            class251 var2 = this.field4314;
            synchronized (this.field4314) {
                this.field4314.method2043(false);
            }
            class251 var3 = this.field4319;
            synchronized (this.field4319) {
                this.field4319.method2043(false);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4321[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(ZI)V")
    public final void method2507(boolean arg0, int arg1) {
        try {
            class251 var3 = this.field4314;
            synchronized (this.field4314) {
                this.field4314.method2038(0, arg1);
            }
            field4317++;
            class251 var4 = this.field4319;
            synchronized (this.field4319) {
                this.field4319.method2038(0, arg1);
            }
            if (arg0) {
                this.field4310 = null;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4321[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(IZ)Luja;")
    public final class475 method2508(int arg0, boolean arg1) {
        try {
            field4312++;
            class251 var3 = this.field4314;
            class475 var4;
            synchronized (this.field4314) {
                var4 = (class475) this.field4314.method2053(0, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field4310;
            byte[] var6;
            synchronized (this.field4310) {
                var6 = this.field4310.method512(arg0, 36, (byte) -42);
            }
            class475 var7 = new class475();
            var7.field7002 = this;
            var7.field6960 = arg0;
            if (var6 != null) {
                var7.method3667(0, new class711(var6));
            }
            var7.method3671(121);
            class251 var8 = this.field4314;
            synchronized (this.field4314) {
                this.field4314.method2051((long) arg0, var7, 93);
                if (arg1) {
                    this.field4314 = null;
                }
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field4321[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(I)V")
    public final void method2509(int arg0) {
        try {
            field4313++;
            class251 var2 = this.field4314;
            synchronized (this.field4314) {
                this.field4314.method2047(11914);
                if (arg0 != 512) {
                    this.field4310 = null;
                }
            }
            class251 var3 = this.field4319;
            synchronized (this.field4319) {
                this.field4319.method2047(arg0 ^ 0x2C8A);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field4321[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lfs;ILlga;Llga;)V")
    public class315(class796 arg0, int arg1, class47 arg2, class47 arg3) {
        try {
            this.field4315 = arg3;
            this.field4310 = arg2;
            this.field4310.method509(true, 36);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4321[7] + (arg0 == null ? field4321[8] : field4321[6]) + ',' + arg1 + ',' + (arg2 == null ? field4321[8] : field4321[6]) + ',' + (arg3 == null ? field4321[8] : field4321[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!jha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2510(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2511(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 29;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 61;
                    break;
                default:
                    var10005 = 54;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
