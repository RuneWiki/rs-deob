import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class85 {

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "Lui;")
    private class251 field1206 = new class251(64);

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "Llga;")
    private class47 field1211;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
    public int field1214;

    @OriginalMember(owner = "client!ur", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1216 = new String[] { method860(method859("Q\u00197xB")), method860(method859("Q\u00197\u007fB")), method860(method859("_E7\u0013\u0017")), method860(method859("J\u001euQ")), method860(method859("Q\u00197|B")), method860(method859("S\u0002w")), method860(method859("Q\u00197tB")), method860(method859("Q\u00197yB")), method860(method859("Q\u00197{B")), method860(method859("Q\u00197zB")), method860(method859("Q\u00197\u0001\u0003J\u0002m\u0003B")), method860(method859("Q\u00197~B")), method860(method859("Q\u00197uB")) };

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)Lec;")
    public final class67 method850(int arg0, int arg1) {
        try {
            field1213++;
            class251 var3 = this.field1206;
            class67 var4;
            synchronized (this.field1206) {
                var4 = (class67) this.field1206.method2053(arg0 ^ arg0, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field1211;
            byte[] var6;
            synchronized (this.field1211) {
                var6 = this.field1211.method512(arg1, 47, (byte) -65);
            }
            class67 var7 = new class67();
            if (var6 != null) {
                var7.method707((byte) 71, new class711(var6));
            }
            class251 var8 = this.field1206;
            synchronized (this.field1206) {
                this.field1206.method2051((long) arg1, var7, 93);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field1216[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(Z)Lob;")
    public static final class779 method851(boolean arg0) {
        try {
            field1215++;
            if (arg0) {
                return null;
            } else if (class322.method2551(class559.field8139, -126)) {
                return class60.field911;
            } else {
                return class60.field916;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1216[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V")
    public final void method852(boolean arg0) {
        try {
            class251 var2 = this.field1206;
            synchronized (this.field1206) {
                this.field1206.method2047(11914);
                if (!arg0) {
                    method856((byte) 87);
                }
            }
            field1209++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1216[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BII)V")
    public static final void method853(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 <= -66) {
                field1208++;
                int var3 = class520.field7584.method1368(class537.field7854.method4068((byte) -63, class405.field5883), -79);
                int var6;
                if (class493.field7252) {
                    for (class801 var7 = (class801) class520.field7588.method3932((byte) -47); var7 != null; var7 = (class801) class520.field7588.method3939((byte) -75)) {
                        int var8;
                        if (var7.field11653 == 1) {
                            var8 = class725.method5253((class228) var7.field11651.field7555.field9626, 43);
                        } else {
                            var8 = class199.method1717(0, var7);
                        }
                        if (var8 > var3) {
                            var3 = var8;
                        }
                    }
                    var6 = class17.field221 * 16 + 21;
                    class118.field1499 = class17.field221 * 16 + (class728.field10430 ? 26 : 22);
                    var3 += 8;
                } else {
                    for (class228 var4 = (class228) class45.field644.method3977((byte) -113); var4 != null; var4 = (class228) class45.field644.method3987(0)) {
                        int var5 = class725.method5253(var4, 78);
                        if (var5 > var3) {
                            var3 = var5;
                        }
                    }
                    var6 = class72.field1049 * 16 + 21;
                    var3 += 8;
                    class118.field1499 = (class728.field10430 ? 26 : 22) + class72.field1049 * 16;
                }
                int var9 = arg1 - (var3 / 2);
                if (var3 + var9 > class391.field5700) {
                    var9 = class391.field5700 - var3;
                }
                if (var9 < 0) {
                    var9 = 0;
                }
                int var10 = arg2;
                if (class711.field9998 < var6 + arg2) {
                    var10 = class711.field9998 - var6;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                class637.field9012 = var9;
                class525.field7646 = var3;
                class433.field6281 = var10;
                class86.field1217 = true;
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field1216[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(BIILlga;)Lcd;")
    public static final class161 method854(byte arg0, int arg1, int arg2, class47 arg3) {
        try {
            field1204++;
            byte[] var4 = arg3.method512(arg2, arg1, (byte) -37);
            if (var4 == null) {
                return null;
            } else if (arg0 >= -104) {
                return null;
            } else {
                return new class161(var4);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1216[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field1216[3] : field1216[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)V")
    public final void method855(int arg0, int arg1) {
        try {
            class251 var3 = this.field1206;
            synchronized (this.field1206) {
                if (arg1 != -27159) {
                    this.method852(false);
                }
                this.field1206.method2038(0, arg0);
            }
            field1207++;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1216[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)I")
    public static final int method856(byte arg0) {
        try {
            field1210++;
            boolean var1 = false;
            boolean var2 = false;
            boolean var3 = false;
            if (class651.field9249.field2479 && !class651.field9249.field2483) {
                var1 = true;
                if (class799.field11611.field337 < 512 && class799.field11611.field337 != 0) {
                    var1 = false;
                }
                if (class188.field2485.startsWith(field1216[5])) {
                    var3 = true;
                    var2 = true;
                } else {
                    var2 = true;
                }
            }
            if (class309.field4258) {
                var3 = false;
            }
            if (class669.field9439) {
                var1 = false;
            }
            if (class479.field7066) {
                var2 = false;
            }
            if (!var1 && !var2 && !var3) {
                return class744.method5388((byte) -97);
            }
            int var4 = -1;
            int var5 = -1;
            int var6 = -1;
            if (var1) {
                try {
                    var4 = class598.method4413(2, (byte) -77, 1000);
                } catch (Exception var16) {
                }
            }
            if (var3) {
                try {
                    var6 = class598.method4413(3, (byte) -77, 1000);
                    if (class451.field6612.field9134.method4717(3) == 3) {
                        class254 var7 = class236.field3418.method210();
                        long var8 = var7.field3633 & 0xFFFFFFFFFFFFL;
                        int var10 = var7.field3632;
                        if (var10 == 4318) {
                            var2 &= var8 >= 64425238954L;
                        } else if (var10 == 4098) {
                            var2 &= var8 >= 60129613779L;
                        }
                    }
                } catch (Exception var15) {
                }
            }
            if (var2) {
                try {
                    var5 = class598.method4413(1, (byte) -77, 1000);
                } catch (Exception var14) {
                }
            }
            if (var4 == -1 && var5 == -1 && var6 == -1) {
                return class744.method5388((byte) 110);
            }
            int var11 = (int) ((float) var6 * 1.1F);
            int var12 = (int) ((float) var5 * 1.1F);
            if (arg0 != 42) {
                method851(true);
            }
            if (var4 > var11 && var4 > var12) {
                return class786.method5661(120, var4);
            } else if (var12 >= var11) {
                return class215.method1804((byte) -81, 1, var12);
            } else {
                return class215.method1804((byte) -111, 3, var11);
            }
        } catch (RuntimeException var17) {
            throw class665.method4799(var17, field1216[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)Z")
    public static final boolean method857(int arg0, int arg1, int arg2) {
        try {
            field1205++;
            int var3 = -81 % ((15 - arg2) / 63);
            return class462.method3551((byte) 107, arg0, arg1) || class754.method5469(arg0, arg1, 12529);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1216[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
    public final void method858(int arg0) {
        try {
            field1212++;
            class251 var2 = this.field1206;
            synchronized (this.field1206) {
                if (arg0 == 47) {
                    this.field1206.method2043(false);
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1216[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lfs;ILlga;)V")
    public class85(class796 arg0, int arg1, class47 arg2) {
        try {
            this.field1211 = arg2;
            if (this.field1211 == null) {
                this.field1214 = 0;
            } else {
                this.field1214 = this.field1211.method509(true, 47);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1216[10] + (arg0 == null ? field1216[3] : field1216[2]) + ',' + arg1 + ',' + (arg2 == null ? field1216[3] : field1216[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ur", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method859(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ur", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method860(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 36;
                    break;
                case 1:
                    var10005 = 107;
                    break;
                case 2:
                    var10005 = 25;
                    break;
                case 3:
                    var10005 = 61;
                    break;
                default:
                    var10005 = 106;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
