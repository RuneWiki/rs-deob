import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class661 {

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "Lwq;")
    private class178 field9552 = new class178(64);

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "Lla;")
    private class476 field9551;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "Lkca;")
    public class91 field9561;

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9564 = new String[] { method4854(method4853("\\N\"s%")), method4854(method4853("AK`Z")), method4854(method4853("T\u0010\"\u0018p")), method4854(method4853("\\N\"~%")), method4854(method4853("\\N\"\ndAWx\b%")), method4854(method4853("\\N\"p%")), method4854(method4853("\\N\"r%")), method4854(method4853("\\N\"t%")), method4854(method4853("\\N\"q%")), method4854(method4853("\u000f\u00132\u00161LQ`\u000bkIXj\u0006=\u0011")), method4854(method4853("\\N\"w%")), method4854(method4853("\u000f\u0016")), method4854(method4853("\u0013]cZ0IXjP=\u001f\u0000")), method4854(method4853("\\N\"u%")) };

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "Lpq;")
    public static class205 field9557 = class590.method4391(0);

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "Lvha;")
    public static class713 field9560 = new class713(9, 7);

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "Lwia;")
    public static class790 field9562 = new class790(37, -1);

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "Lqha;")
    public static class112 field9563 = new class112(8);

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
    public static int field9550;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
    public static int field9553;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
    public static int field9554;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field9555;

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "I")
    public static int field9556;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
    public static int field9558;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    public static int field9559;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
    public static void method4845(int arg0) {
        try {
            field9557 = null;
            field9563 = null;
            field9562 = null;
            field9560 = null;
            if (arg0 != 0) {
                method4851(true, null);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9564[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)V")
    public final void method4846(int arg0, int arg1) {
        try {
            class178 var3 = this.field9552;
            synchronized (this.field9552) {
                this.field9552.method1557(arg0, (byte) -119);
                if (arg1 != 256) {
                    method4850((byte) -106, 36, null);
                }
            }
            field9555++;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9564[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(II)Leea;")
    public final class144 method4847(int arg0, int arg1) {
        try {
            field9558++;
            class178 var3 = this.field9552;
            class144 var4;
            synchronized (this.field9552) {
                var4 = (class144) this.field9552.method1558((byte) 96, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field9551;
            byte[] var6;
            synchronized (this.field9551) {
                if (arg1 != 32259) {
                    this.method4847(32, -125);
                }
                var6 = this.field9551.method3632(32, arg0, -119);
            }
            class144 var7 = new class144();
            var7.field1774 = this;
            if (var6 != null) {
                var7.method1218(new class163(var6), arg1 - 10084);
            }
            class178 var8 = this.field9552;
            synchronized (this.field9552) {
                this.field9552.method1556((long) arg0, var7, 1);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field9564[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IZLnw;)V")
    public static final void method4848(int arg0, boolean arg1, class612 arg2) {
        try {
            field9550++;
            if (class593.field8707 < 400) {
                if (arg0 > -122) {
                    field9562 = null;
                }
                class496 var3 = arg2.field8947;
                String var4 = arg2.field8938;
                if (var3.field7110 != null) {
                    var3 = var3.method3742(-1, class276.field4168);
                    if (var3 == null) {
                        return;
                    }
                    var4 = var3.field7136;
                }
                if (var3.field7119) {
                    if (arg2.field8945 != 0) {
                        String var5 = class447.field6576 == class239.field3624 ? class309.field4877.method2616(false, class167.field2300) : class309.field4875.method2616(false, class167.field2300);
                        var4 = var4 + class733.method5345(arg2.field8945, class225.field3446.field10509, 20883) + field9564[11] + var5 + arg2.field8945 + ")";
                    }
                    if (class728.field10555 && !arg1) {
                        class181 var6 = class263.field4037 == -1 ? null : class566.field8395.method3413((byte) -34, class263.field4037);
                        if ((class517.field7484 & 0x2) != 0 && (var6 == null || var3.method3743(class263.field4037, 0, var6.field2506) != var6.field2506)) {
                            class512.field7360++;
                            class719.method5244(0, (long) arg2.field3780, false, (long) arg2.field3780, class10.field116, 0, false, class740.field10757 + field9564[9] + var4, class586.field8637, (byte) -39, 10, true, -1);
                        }
                    }
                    if (!arg1) {
                        String[] var7 = var3.field7168;
                        if (class690.field10071) {
                            var7 = class104.method917((byte) 126, var7);
                        }
                        if (var7 != null) {
                            for (int var8 = 4; var8 >= 0; var8--) {
                                if (var7[var8] != null && (var3.field7141 == 0 || !var7[var8].equalsIgnoreCase(class309.field4870.method2616(false, class167.field2300)))) {
                                    byte var9 = 0;
                                    if (var8 == 0) {
                                        var9 = 48;
                                    }
                                    int var10 = class330.field5190;
                                    if (var8 == 1) {
                                        var9 = 5;
                                    }
                                    if (var8 == 2) {
                                        var9 = 21;
                                    }
                                    if (var8 == 3) {
                                        var9 = 50;
                                    }
                                    if (var3.field7150 == var8) {
                                        var10 = var3.field7181;
                                    }
                                    if (var8 == 4) {
                                        var9 = 60;
                                    }
                                    if (var3.field7134 == var8) {
                                        var10 = var3.field7115;
                                    }
                                    class409.field6063++;
                                    class719.method5244(0, (long) arg2.field3780, false, (long) arg2.field3780, var7[var8], 0, false, field9564[12] + var4, var7[var8].equalsIgnoreCase(class309.field4870.method2616(false, class167.field2300)) ? var3.field7186 : var10, (byte) 127, var9, true, -1);
                                }
                            }
                        }
                        if (var3.field7141 == 1 && var7 != null) {
                            for (int var11 = 4; var11 >= 0; var11--) {
                                if (var7[var11] != null && var7[var11].equalsIgnoreCase(class309.field4870.method2616(false, class167.field2300))) {
                                    short var12 = 0;
                                    if (class225.field3446.field10509 < arg2.field8945) {
                                        var12 = 2000;
                                    }
                                    short var13 = 0;
                                    if (var11 == 0) {
                                        var13 = 48;
                                    }
                                    if (var11 == 1) {
                                        var13 = 5;
                                    }
                                    if (var11 == 2) {
                                        var13 = 21;
                                    }
                                    if (var11 == 3) {
                                        var13 = 50;
                                    }
                                    if (var11 == 4) {
                                        var13 = 60;
                                    }
                                    if (var13 != 0) {
                                        var13 += var12;
                                    }
                                    class167.field2301++;
                                    class719.method5244(0, (long) arg2.field3780, false, (long) arg2.field3780, var7[var11], 0, false, field9564[12] + var4, var3.field7186, (byte) 123, var13, true, -1);
                                }
                            }
                        }
                    }
                    class719.method5244(0, (long) arg2.field3780, arg1, (long) arg2.field3780, class309.field4869.method2616(false, class167.field2300), 0, false, field9564[12] + var4, class622.field9117, (byte) 127, 1007, true, -1);
                    class257.field3984++;
                }
            }
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field9564[10] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9564[1] : field9564[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
    public final void method4849(int arg0) {
        try {
            field9559++;
            class178 var2 = this.field9552;
            synchronized (this.field9552) {
                if (arg0 >= -78) {
                    method4848(48, false, null);
                }
                this.field9552.method1559(0);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9564[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BILec;)V")
    public static final void method4850(byte arg0, int arg1, class247 arg2) {
        try {
            field9553++;
            int var3 = -1;
            int var4 = 0;
            if (arg0 != -89) {
                method4848(-27, true, null);
            }
            if (arg2.field3827 > class375.field5711) {
                class66.method544(arg2, 4);
            } else if (class375.field5711 <= arg2.field3833) {
                class46.method359(arg2, (byte) -113);
            } else {
                class215.method1880(false, arg2, false);
                var4 = class458.field6669;
                var3 = class372.field5672;
            }
            if (arg2.field6197 < 512 || arg2.field6211 < 512 || arg2.field6197 >= (class648.field9378 - 1) * 512 || arg2.field6211 >= class659.field9506 * 512 - 512) {
                arg2.field3833 = 0;
                var4 = 0;
                var3 = -1;
                arg2.field3827 = 0;
                arg2.field3841 = null;
                arg2.field3814 = -1;
                arg2.field6197 = arg2.field3859[0] * 512 + (arg2.method2101(31463) * 256);
                arg2.field6211 = arg2.field3863[0] * 512 + arg2.method2101(31463) * 256;
                arg2.method2092((byte) 91);
                for (int var5 = 0; var5 < arg2.field3775.length; var5++) {
                    arg2.field3775[var5].field563 = -1;
                }
            }
            if (class225.field3446 == arg2 && (arg2.field6197 < 6144 || arg2.field6211 < 6144 || arg2.field6197 >= class648.field9378 * 512 - 6144 || (class659.field9506 - 12) * 512 <= arg2.field6211)) {
                arg2.field3827 = 0;
                arg2.field3833 = 0;
                arg2.field3814 = -1;
                var3 = -1;
                var4 = 0;
                arg2.field3841 = null;
                arg2.field6197 = arg2.field3859[0] * 512 + arg2.method2101(31463) * 256;
                arg2.field6211 = arg2.field3863[0] * 512 + (arg2.method2101(31463) * 256);
                arg2.method2092((byte) 74);
                for (int var6 = 0; var6 < arg2.field3775.length; var6++) {
                    arg2.field3775[var6].field563 = -1;
                }
            }
            int var7 = class11.method76(-1, arg2);
            class751.method5462(arg2, (byte) -124);
            class231.method1978((byte) -1, var4, var7, var3, arg2);
            class396.method3129(arg2, arg0 ^ 0xFFFFFFA7, var3);
            class234.method1996(126, arg2);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field9564[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9564[1] : field9564[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZLib;)Loca;")
    public static final class276 method4851(boolean arg0, class163 arg1) {
        try {
            if (arg0) {
                field9562 = null;
            }
            field9554++;
            return new class276(arg1.method1442(65280), arg1.method1442(65280), arg1.method1442(65280), arg1.method1442(65280), arg1.method1436((byte) 89), arg1.method1455((byte) 62));
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9564[8] + arg0 + ',' + (arg1 == null ? field9564[1] : field9564[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Z)V")
    public final void method4852(boolean arg0) {
        try {
            field9556++;
            class178 var2 = this.field9552;
            synchronized (this.field9552) {
                if (!arg0) {
                    method4850((byte) -70, 58, null);
                }
                this.field9552.method1569(10574);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field9564[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lto;ILla;Lkca;)V")
    public class661(class8 arg0, int arg1, class476 arg2, class91 arg3) {
        try {
            this.field9551 = arg2;
            this.field9551.method3646(32, (byte) -119);
            this.field9561 = arg3;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9564[4] + (arg0 == null ? field9564[1] : field9564[2]) + ',' + arg1 + ',' + (arg2 == null ? field9564[1] : field9564[2]) + ',' + (arg3 == null ? field9564[1] : field9564[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4853(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xD);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4854(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 47;
                    break;
                case 1:
                    var10005 = 62;
                    break;
                case 2:
                    var10005 = 12;
                    break;
                case 3:
                    var10005 = 54;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
