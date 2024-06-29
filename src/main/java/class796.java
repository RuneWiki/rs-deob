import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class796 {

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public int field11632;

    @OriginalMember(owner = "client!mp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11633 = new String[] { method5719(method5718("\u0016KV7\u001a\u0015R\f5[")), method5719(method5718("\u0000\u0015V%\u000e")), method5719(method5718("\u0015N\u0014g")), method5719(method5718("\u0016KV\u007f\u001c(O\nb\u001d\u001c\u0013")), method5719(method5718("\u0016KVO[")), method5719(method5718("\u0016KVI[")), method5719(method5718("\u0016KVH[")), method5719(method5718("\u0016KVJ[")) };

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field11627;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public static int field11628;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field11629;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field11630;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field11631;

    @OriginalMember(owner = "client!mp", name = "toString", descriptor = "()Ljava/lang/String;", line = 7)
    public final String toString() {
        try {
            field11627++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11633[3] + ')');
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)V", line = 17)
    public static final void method5714(int arg0, int arg1, int arg2) {
        try {
            field11629++;
            class551 var3 = class380.method3113(-116, (long) arg2 << 32 | (long) arg0, 19);
            var3.method4089(63);
            if (arg1 != -23608) {
                method5716(-42, true, -13, -87, -90);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11633[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V", line = 32)
    public static final void method5715(byte arg0) {
        try {
            field11628++;
            if (class640.method4638(class315.field5127, (byte) -104)) {
                if (class185.field2943.field2644 == null) {
                    class302.method2598(5, -3);
                } else {
                    class302.method2598(7, -3);
                }
            } else if (class315.field5127 == 5 || class315.field5127 == 6) {
                class302.method2598(3, -3);
            } else if (class315.field5127 == 13) {
                class302.method2598(3, -3);
            }
            if (arg0 <= 104) {
                method5715((byte) 2);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11633[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZIII)V", line = 69)
    public static final void method5716(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        try {
            field11631++;
            if (arg1 || class586.field8499 != arg0 || class608.field8762 != arg4 || class673.field9554 != class262.field4264 && class623.field8996.field6356.method4838(true) != 1) {
                class608.field8762 = arg4;
                class262.field4264 = class673.field9554;
                class586.field8499 = arg0;
                if (class623.field8996.field6356.method4838(true) == 1) {
                    class262.field4264 = 0;
                }
                class302.method2598(arg3, -3);
                class567.method4167(true, (byte) 118, class662.field9437, class64.field877, class709.field10214.method5154(class795.field11624, (byte) 65), class213.field3367);
                int var5 = class397.field6289;
                class397.field6289 = (class586.field8499 - (class126.field1823 >> 4)) * 8;
                int var6 = class141.field2011;
                class141.field2011 = (class608.field8762 - (class169.field2725 >> 4)) * 8;
                class750.field11048 = class770.method5561(class586.field8499 * 8, class608.field8762 * 8);
                class620.field8960 = null;
                int var7 = class397.field6289 - var5;
                int var8 = class141.field2011 - var6;
                if (arg3 == 12) {
                    for (int var9 = 0; var9 < class421.field6647; var9++) {
                        class19 var10 = class78.field1214[var9];
                        if (var10 != null) {
                            class426 var11 = var10.field194;
                            for (int var12 = 0; var12 < 10; var12++) {
                                var11.field1201[var12] -= var7;
                                var11.field1200[var12] -= var8;
                            }
                            var11.field9985 -= var7 * 512;
                            var11.field9983 -= var8 * 512;
                        }
                    }
                } else {
                    boolean var13 = false;
                    class632.field9088 = 0;
                    int var14 = (class126.field1823 - 1) * 512;
                    int var15 = class169.field2725 * 512 - 512;
                    for (int var16 = 0; var16 < class421.field6647; var16++) {
                        class19 var17 = class78.field1214[var16];
                        if (var17 != null) {
                            class426 var18 = var17.field194;
                            var18.field9983 -= var8 * 512;
                            var18.field9985 -= var7 * 512;
                            if (var18.field9985 >= 0 && var18.field9985 <= var14 && var18.field9983 >= 0 && var15 >= var18.field9983) {
                                boolean var19 = true;
                                for (int var20 = 0; var20 < 10; var20++) {
                                    var18.field1201[var20] -= var7;
                                    var18.field1200[var20] -= var8;
                                    if (var18.field1201[var20] < 0 || var18.field1201[var20] >= class126.field1823 || var18.field1200[var20] < 0 || var18.field1200[var20] >= class169.field2725) {
                                        var19 = false;
                                    }
                                }
                                if (var19) {
                                    class263.field4278[class632.field9088++] = var18.field1129;
                                } else {
                                    var18.method3382(0, null);
                                    var13 = true;
                                    var17.method4173(-1);
                                }
                            } else {
                                var18.method3382(0, null);
                                var17.method4173(-1);
                                var13 = true;
                            }
                        }
                    }
                    if (var13) {
                        class421.field6647 = class176.field2797.method733((byte) 38);
                        class176.field2797.method732(-14248, class78.field1214);
                    }
                }
                int var21 = 20 / ((arg2 + 16) / 35);
                for (int var22 = 0; var22 < 2048; var22++) {
                    class738 var23 = class33.field395[var22];
                    if (var23 != null) {
                        for (int var24 = 0; var24 < 10; var24++) {
                            var23.field1201[var24] -= var7;
                            var23.field1200[var24] -= var8;
                        }
                        var23.field9983 -= var8 * 512;
                        var23.field9985 -= var7 * 512;
                    }
                }
                class165[] var25 = class262.field4273;
                for (int var26 = 0; var26 < var25.length; var26++) {
                    class165 var27 = var25[var26];
                    if (var27 != null) {
                        var27.field2675 -= var7 * 512;
                        var27.field2683 -= var8 * 512;
                    }
                }
                for (class10 var28 = (class10) class702.field10091.method3228(11); var28 != null; var28 = (class10) class702.field10091.method3216(true)) {
                    var28.field116 -= var8;
                    var28.field114 -= var7;
                    if (class507.field7569 != 4 && (var28.field114 < 0 || var28.field116 < 0 || var28.field114 >= class126.field1823 || class169.field2725 <= var28.field116)) {
                        var28.method4173(-1);
                    }
                }
                for (class10 var29 = (class10) class344.field5596.method3228(11); var29 != null; var29 = (class10) class344.field5596.method3216(true)) {
                    var29.field114 -= var7;
                    var29.field116 -= var8;
                    if (class507.field7569 != 4 && (var29.field114 < 0 || var29.field116 < 0 || var29.field114 >= class126.field1823 || class169.field2725 <= var29.field116)) {
                        var29.method4173(-1);
                    }
                }
                if (class507.field7569 != 4) {
                    for (class430 var30 = (class430) class96.field1407.method735(0); var30 != null; var30 = (class430) class96.field1407.method734((byte) -50)) {
                        int var31 = (int) (var30.field8252 & 0x3FFFL);
                        int var32 = var31 - class397.field6289;
                        int var33 = (int) (var30.field8252 >> 14 & 0x3FFFL);
                        int var34 = var33 - class141.field2011;
                        if (var32 < 0 || var34 < 0 || class126.field1823 <= var32 || var34 >= class169.field2725) {
                            var30.method4173(-1);
                        }
                    }
                }
                if (class83.field1262 != 0) {
                    class232.field3598 -= var8;
                    class83.field1262 -= var7;
                }
                class570.method4199(true);
                if (arg3 != 12) {
                    class791.field11550 -= var7 * 512;
                    class307.field4978 -= var8;
                    class6.field47 -= var7;
                    class133.field1899 -= var7;
                    class133.field1896 -= var8 * 512;
                    class30.field323 -= var8;
                    if (Math.abs(var7) > class126.field1823 || Math.abs(var8) > class169.field2725) {
                        class262.method2282(true);
                    }
                } else if (class401.field6334 == 4) {
                    class537.field7887 -= var7 * 512;
                    class147.field2059 -= var8 * 512;
                    class505.field7560 -= var8 * 512;
                    class524.field7735 -= var7 * 512;
                } else {
                    class401.field6334 = 1;
                    class210.field3323 = -1;
                    class344.field5593 = -1;
                }
                class38.method369(109);
                class95.method918((byte) -105);
                class90.field1334.method3224(false);
                class650.field9317.method3224(false);
                class195.field3093.method745(102);
                class433.method3420(6);
            }
        } catch (RuntimeException var36) {
            throw class590.method4333(var36, field11633[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IB)Z", line = 354)
    public static final boolean method5717(int arg0, byte arg1) {
        try {
            if (arg1 == -124) {
                field11630++;
                return arg0 == 11 || arg0 == 12 || arg0 == 13;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11633[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 364)
    public class796(String arg0, String arg1, String arg2, int arg3) {
        try {
            this.field11632 = arg3;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field11633[0] + (arg0 == null ? field11633[2] : field11633[1]) + ',' + (arg1 == null ? field11633[2] : field11633[1]) + ',' + (arg2 == null ? field11633[2] : field11633[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!mp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5718(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x73);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5719(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 123;
                    break;
                case 1:
                    var10005 = 59;
                    break;
                case 2:
                    var10005 = 120;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 115;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
