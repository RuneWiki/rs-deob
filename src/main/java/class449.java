import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class449 {

    @OriginalMember(owner = "client!iha", name = "f", descriptor = "Lui;")
    private class251 field6587 = new class251(64);

    @OriginalMember(owner = "client!iha", name = "d", descriptor = "Lui;")
    public class251 field6588 = new class251(60);

    @OriginalMember(owner = "client!iha", name = "h", descriptor = "Llga;")
    private class47 field6585;

    @OriginalMember(owner = "client!iha", name = "o", descriptor = "Llga;")
    public class47 field6581;

    @OriginalMember(owner = "client!iha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6591 = new String[] { method3484(method3483("o#\u0007\u0007 .")), method3484(method3483("o#\u0007\u0007!.")), method3484(method3483("o#\u0007\u0007-.")), method3484(method3483("o#\u0007\u0007%.")), method3484(method3483("o#\u0007\u0007..")), method3484(method3483("o#\u0007\u0007\".")), method3484(method3483("h>\nE")), method3484(method3483("}eH\u0007\u001a")), method3484(method3483("o#\u0007\u0007[o%\u000f]Y.")), method3484(method3483("j*\u0007")), method3484(method3483("o#\u0007\u0007#.")), method3484(method3483("o#\u0007\u0007$.")) };

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "Lsb;")
    public static class261 field6576 = new class261(7, -1);

    @OriginalMember(owner = "client!iha", name = "n", descriptor = "F")
    public static float field6583;

    @OriginalMember(owner = "client!iha", name = "p", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!iha", name = "e", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!iha", name = "g", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!iha", name = "k", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!iha", name = "i", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!iha", name = "l", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!iha", name = "j", descriptor = "I")
    public int field6589;

    @OriginalMember(owner = "client!iha", name = "m", descriptor = "Llga;")
    public static class47 field6575;

    // $FF: synthetic field
    @OriginalMember(owner = "client!iha", name = "a", descriptor = "Ljava/lang/Class;")
    public static Class field6590;

    // $FF: synthetic method
    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3482(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "()V", line = 13)
    public static final void method3472() {
        for (int var0 = 0; var0 < class156.field1988; var0++) {
            if (!client.field9714[var0]) {
                class382 var1 = class678.field9526[var0];
                class330 var2 = var1.field5573;
                int var3 = var1.field5559;
                int var4 = var2.method2594((byte) 21) - class157.field2000;
                int var5 = (var4 * 2 >> class179.field2328) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2595((byte) 90) - var4 >> class179.field2328;
                int var9 = var2.method2592(true) - var4 >> class179.field2328;
                int var10 = var2.method2592(true) + var4 >> class179.field2328;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class700.field9795) {
                    var10 = class700.field9795 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field5561[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class508.field7455) {
                        var16 = class508.field7455 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class604 var19 = class590.method4352(var3, var17, var11, field6590 == null ? (field6590 = method3482(field6591[9])) : field6590);
                        if (var19 != null && var19.field8664 != 0) {
                            if (var19.field8664 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field5561[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field5561[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field5561[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field5561[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                client.field9714[var0] = true;
                class107.field1413[var3].method2481(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(BI)V", line = 186)
    public final void method3473(byte arg0, int arg1) {
        try {
            field6586++;
            class251 var3 = this.field6587;
            synchronized (this.field6587) {
                this.field6587.method2038(arg0 + 40, arg1);
                if (arg0 != -40) {
                    this.field6587 = null;
                }
            }
            class251 var4 = this.field6588;
            synchronized (this.field6588) {
                this.field6588.method2038(0, arg1);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field6591[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(IJ)V", line = 202)
    public static final void method3474(int arg0, long arg1) {
        try {
            field6582++;
            if (arg0 != 20817) {
                method3472();
            }
            if (arg1 > 0L) {
                if (arg1 % 10L == 0L) {
                    class261.method2166(arg1 - 1L, (byte) -124);
                    class261.method2166(1L, (byte) -80);
                } else {
                    class261.method2166(arg1, (byte) -95);
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6591[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(I)V", line = 223)
    public final void method3475(int arg0) {
        try {
            field6580++;
            class251 var2 = this.field6587;
            synchronized (this.field6587) {
                this.field6587.method2043(false);
                if (arg0 != 19311) {
                    this.method3475(3);
                }
            }
            class251 var3 = this.field6588;
            synchronized (this.field6588) {
                this.field6588.method2043(false);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6591[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(ZB)V", line = 240)
    public static final void method3476(boolean arg0, byte arg1) {
        try {
            field6584++;
            if (arg0) {
                if (class572.field8291 != -1) {
                    class247.method2015(class572.field8291, 107);
                }
                for (class509 var2 = (class509) class104.field1375.method3696(0); var2 != null; var2 = (class509) class104.field1375.method3697(arg1 - 101)) {
                    if (!var2.method4293(arg1 ^ 0x76)) {
                        var2 = (class509) class104.field1375.method3696(0);
                        if (var2 == null) {
                            break;
                        }
                    }
                    class394.method3082(var2, true, false, -4438);
                }
                class572.field8291 = -1;
                class104.field1375 = new class477(8);
                class690.method4928((byte) -92);
                class572.field8291 = class397.field5781;
                class273.method2240(arg1 + 16669, false);
                class591.method4369(0);
                class158.method1326(class572.field8291);
            }
            class24.field285 = true;
            if (arg1 != -5) {
                method3474(-106, 56L);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6591[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "c", descriptor = "(I)V", line = 283)
    public static void method3477(int arg0) {
        try {
            field6575 = null;
            field6576 = null;
            if (arg0 != 255) {
                method3478();
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6591[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "()V", line = 296)
    public static final void method3478() {
        for (int var0 = 0; var0 < class433.field6273; var0++) {
            class604 var1 = class640.field9121[var0];
            class625.method4589(var1, true);
            class640.field9121[var0] = null;
        }
        class433.field6273 = 0;
    }

    @OriginalMember(owner = "client!iha", name = "b", descriptor = "(II)Laja;", line = 311)
    public final class595 method3479(int arg0, int arg1) {
        try {
            field6578++;
            class251 var3 = this.field6587;
            class595 var4;
            synchronized (this.field6587) {
                var4 = (class595) this.field6587.method2053(0, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field6585;
            byte[] var6;
            synchronized (this.field6585) {
                var6 = this.field6585.method512(class221.method1858(106, arg0), class608.method4489(arg0, 13), (byte) -66);
            }
            if (arg1 <= 99) {
                method3474(-68, 57L);
            }
            class595 var7 = new class595();
            var7.field8558 = arg0;
            var7.field8550 = this;
            if (var6 != null) {
                var7.method4391(new class711(var6), 12026);
            }
            class251 var8 = this.field6587;
            synchronized (this.field6587) {
                this.field6587.method2051((long) arg0, var7, 93);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field6591[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V", line = 351)
    public final void method3480(int arg0) {
        try {
            class251 var2 = this.field6587;
            synchronized (this.field6587) {
                this.field6587.method2047(11914);
            }
            field6577++;
            class251 var3 = this.field6588;
            synchronized (this.field6588) {
                this.field6588.method2047(11914);
                int var4 = -96 % ((arg0 - 52) / 59);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field6591[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "a", descriptor = "(II)V", line = 367)
    public final void method3481(int arg0, int arg1) {
        try {
            field6579++;
            this.field6589 = arg1;
            class251 var3 = this.field6588;
            synchronized (this.field6588) {
                if (arg0 > -124) {
                    this.method3473((byte) 111, 100);
                }
                this.field6588.method2043(false);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field6591[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lfs;ILlga;Llga;)V", line = 388)
    public class449(class796 arg0, int arg1, class47 arg2, class47 arg3) {
        try {
            this.field6585 = arg2;
            this.field6581 = arg3;
            int var5 = this.field6585.method535((byte) -110) - 1;
            this.field6585.method509(true, var5);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6591[8] + (arg0 == null ? field6591[6] : field6591[7]) + ',' + arg1 + ',' + (arg2 == null ? field6591[6] : field6591[7]) + ',' + (arg3 == null ? field6591[6] : field6591[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!iha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3483(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x67);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3484(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 6;
                    break;
                case 1:
                    var10005 = 75;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 41;
                    break;
                default:
                    var10005 = 103;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
