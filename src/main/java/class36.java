import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class class36 extends class568 {

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field421 = new String[] { method363(method362("Y{r\u0003~")), method363(method362("Y{r\u0002~")), method363(method362("Bj0&")), method363(method362("W1rd+")) };

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static final void method358(int arg0) {
        try {
            field420++;
            class454.method3525((byte) 27, class360.field5806);
            class504.field7551++;
            if (class548.field8053 && class535.field7853) {
                int var1 = 0;
                int var2 = 0;
                if (class316.field5141) {
                    var1 = class50.method516(false);
                    var2 = class568.method4171(0);
                }
                int var3 = class15.field174.method5051(arg0 ^ arg0) + var1;
                int var4 = class15.field174.method5048(true) + var2;
                int var5 = var4 - class472.field7215;
                int var6 = var3 - class772.field11312;
                if (class362.field5830 > var6) {
                    var6 = class362.field5830;
                }
                if (var5 < class726.field10647) {
                    var5 = class726.field10647;
                }
                if (var6 + class360.field5806.field9797 > class362.field5830 + class546.field8028.field9797) {
                    var6 = class362.field5830 + class546.field8028.field9797 - class360.field5806.field9797;
                }
                if (class360.field5806.field9777 + var5 > class726.field10647 + class546.field8028.field9777) {
                    var5 = class726.field10647 - (class360.field5806.field9777 - class546.field8028.field9777);
                }
                int var7 = var6 + class546.field8028.field9739 - class362.field5830;
                int var8 = class546.field8028.field9744 + var5 - class726.field10647;
                if (class15.field174.method5230(118)) {
                    if (class360.field5806.field9773 < class504.field7551) {
                        int var9 = var6 - class338.field5512;
                        int var10 = var5 - class622.field8983;
                        if (var9 > class360.field5806.field9783 || var9 < -class360.field5806.field9783 || class360.field5806.field9783 < var10 || var10 < (-class360.field5806.field9783)) {
                            class456.field7040 = true;
                        }
                    }
                    if (class360.field5806.field9855 != null && class456.field7040) {
                        class730 var11 = new class730();
                        var11.field10692 = class360.field5806.field9855;
                        var11.field10694 = var8;
                        var11.field10693 = class360.field5806;
                        var11.field10695 = var7;
                        class598.method4378(var11);
                        return;
                    }
                } else {
                    if (class456.field7040) {
                        class318.method2729(22906);
                        if (class360.field5806.field9761 != null) {
                            class730 var12 = new class730();
                            var12.field10692 = class360.field5806.field9761;
                            var12.field10695 = var7;
                            var12.field10690 = class309.field5061;
                            var12.field10693 = class360.field5806;
                            var12.field10694 = var8;
                            class598.method4378(var12);
                        }
                        if (class309.field5061 != null && client.method2719(class360.field5806) != null) {
                            class615.method4491(class360.field5806, 0, class309.field5061);
                        }
                    } else if ((class748.field11033 == 1 || class774.method5575((byte) -119)) && class320.field5213 > 2) {
                        class737.method5350(arg0 - 197, class772.field11312 + class338.field5512, class622.field8983 + class472.field7215);
                    } else if (class548.method4068(false)) {
                        class737.method5350(-40, class772.field11312 + class338.field5512, class622.field8983 + class472.field7215);
                    }
                    class360.field5806 = null;
                }
            } else if (class504.field7551 > 1) {
                class360.field5806 = null;
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field421[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lwt;I)V")
    public abstract void method359(class328 arg0, int arg1);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[BII)Ljava/lang/String;")
    public static final String method360(int arg0, byte[] arg1, int arg2, int arg3) {
        try {
            field418++;
            char[] var4 = new char[arg3];
            if (arg2 != 192) {
                method360(-57, null, 36, 83);
            }
            int var5 = 0;
            int var6 = arg0;
            int var7 = arg0 + arg3;
            while (var7 > var6) {
                int var8 = arg1[var6++] & 0xFF;
                int var9;
                if (var8 >= 128) {
                    if (var8 < 192) {
                        var9 = 65533;
                    } else if (var8 < 224) {
                        if (var7 > var6 && (arg1[var6] & 0xC0) == 128) {
                            var9 = var8 & 0x1F << 6 | arg1[var6++] & 0x3F;
                            if (var9 < 128) {
                                var9 = 65533;
                            }
                        } else {
                            var9 = 65533;
                        }
                    } else if (var8 >= 240) {
                        if (var8 >= 248) {
                            var9 = 65533;
                        } else if (var7 > (var6 + 2) && (arg1[var6] & 0xC0) == 128 && (arg1[var6 + 1] & 0xC0) == 128 && (arg1[var6 + 2] & 0xC0) == 128) {
                            int var10 = var8 & 0x7 << 18 | (arg1[var6++] & 0x3F) << 12 | arg1[var6++] & 0x3F << 6 | arg1[var6++] & 0x3F;
                            if (var10 >= 65536 && var10 <= 1114111) {
                                var9 = 65533;
                            } else {
                                var9 = 65533;
                            }
                        } else {
                            var9 = 65533;
                        }
                    } else if (var6 + 1 < var7 && (arg1[var6] & 0xC0) == 128 && (arg1[var6 + 1] & 0xC0) == 128) {
                        var9 = arg1[var6++] & 0x3F << 6 | (var8 & 0xF) << 12 | arg1[var6++] & 0x3F;
                        if (var9 < 2048) {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var8 == 0) {
                    var9 = 65533;
                } else {
                    var9 = var8;
                }
                var4[var5++] = (char) var9;
            }
            return new String(var4, 0, var5);
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field421[1] + arg0 + ',' + (arg1 == null ? field421[2] : field421[3]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lwq;I)V")
    public abstract void method361(class176 arg0, int arg1);

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method362(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x56);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method363(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 44;
                    break;
                case 1:
                    var10005 = 31;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 74;
                    break;
                default:
                    var10005 = 86;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
