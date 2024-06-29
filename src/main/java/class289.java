import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public class class289 extends class69 {

    @OriginalMember(owner = "client!vja", name = "bb", descriptor = "I")
    public int field4287 = -1;

    @OriginalMember(owner = "client!vja", name = "U", descriptor = "I")
    public int field4289 = 0;

    @OriginalMember(owner = "client!vja", name = "R", descriptor = "Z")
    private boolean field4290 = false;

    @OriginalMember(owner = "client!vja", name = "fb", descriptor = "I")
    public int field4298 = -1;

    @OriginalMember(owner = "client!vja", name = "S", descriptor = "I")
    private int field4299 = 0;

    @OriginalMember(owner = "client!vja", name = "W", descriptor = "[Ljava/lang/String;")
    private static final String[] field4308 = new String[] { method2352(method2351(">5r\u001de`")), method2352(method2351("3q=\u001dP")), method2352(method2351("&*\u007f_")), method2352(method2351(">5r\u001d}`")), method2352(method2351(">5r\u001d|`")), method2352(method2351(">5r\u001dd\tw")), method2352(method2351(">5r\u001dd`")), method2352(method2351(">5r\u001di\tw")), method2352(method2351(">5r\u001dh\tw")), method2352(method2351(">5r\u001de\tw")), method2352(method2351(">5r\u001do\tw")), method2352(method2351(">5r\u001dy`")), method2352(method2351(">5r\u001dl\tw")), method2352(method2351(">5r\u001dj\tw")), method2352(method2351(">5r\u001dz`")) };

    @OriginalMember(owner = "client!vja", name = "mb", descriptor = "Lel;")
    public static class573 field4293 = new class573(130, 12);

    @OriginalMember(owner = "client!vja", name = "gb", descriptor = "I")
    public int field4284;

    @OriginalMember(owner = "client!vja", name = "P", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!vja", name = "cb", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!vja", name = "kb", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!vja", name = "Z", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!vja", name = "nb", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!vja", name = "X", descriptor = "I")
    public int field4294;

    @OriginalMember(owner = "client!vja", name = "ab", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!vja", name = "Y", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!vja", name = "db", descriptor = "I")
    public int field4297;

    @OriginalMember(owner = "client!vja", name = "lb", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!vja", name = "ib", descriptor = "I")
    public int field4301;

    @OriginalMember(owner = "client!vja", name = "T", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!vja", name = "Q", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!vja", name = "eb", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!vja", name = "V", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!vja", name = "jb", descriptor = "Lrd;")
    public static class354 field4303;

    @OriginalMember(owner = "client!vja", name = "hb", descriptor = "Lhia;")
    public static class73 field4305;

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(ILjava/awt/Canvas;IILd;Lla;)Lha;", line = 7)
    public static final class66 method2345(int arg0, Canvas arg1, int arg2, int arg3, class160 arg4, class476 arg5) {
        try {
            ++field4291;
            int var6 = 0;
            int var7 = 0;
            if (arg3 < 51) {
                method2348(54);
            }
            if (arg1 != null) {
                Dimension var8 = arg1.getSize();
                var7 = var8.height;
                var6 = var8.width;
            }
            return class66.method518(arg4, arg2, 68, var6, var7, arg0, arg5, arg1);
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field4308[5] + arg0 + ',' + (arg1 != null ? field4308[1] : field4308[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4308[1] : field4308[2]) + ',' + (arg5 != null ? field4308[1] : field4308[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "b", descriptor = "(Z)Z", line = 32)
    public final boolean method1098(boolean arg0) {
        try {
            ++field4302;
            if (arg0) {
                field4305 = null;
            }
            return this.field4290;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4308[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "b", descriptor = "(B)Z", line = 45)
    public final boolean method1082(byte arg0) {
        try {
            if (arg0 != 27) {
                this.field4294 = -63;
            }
            ++field4295;
            return false;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4308[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(IIIII)V", line = 223)
    public class289(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vja", name = "g", descriptor = "(I)I", line = 59)
    public final int method2346(int arg0) {
        try {
            ++field4296;
            class530 var2 = class540.field7920.method5000(this.field4301, (byte) 122);
            int var3 = var2.field7753;
            if (~this.field4298 != 0) {
                class530 var4 = class540.field7920.method5000(this.field4298, (byte) 42);
                if (~var4.field7753 < ~var3) {
                    var3 = var4.field7753;
                }
            }
            if (arg0 != 1) {
                field4303 = null;
            }
            if (~this.field4287 != 0) {
                class530 var5 = class540.field7920.method5000(this.field4287, (byte) 52);
                if (var5.field7753 > var3) {
                    var3 = var5.field7753;
                }
            }
            return var3;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field4308[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(Ltw;)V", line = 96)
    public static final void method2347(class214 arg0) {
        class675.field9785 = arg0;
    }

    @OriginalMember(owner = "client!vja", name = "c", descriptor = "(I)V", line = 103)
    public static final void method2348(int arg0) {
        try {
            ++field4292;
            class404.method3177();
            int var1 = -61 % ((-63 - arg0) / 51);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4308[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIB)Z", line = 114)
    public static final boolean method2349(int arg0, int arg1, byte arg2) {
        try {
            int var3 = -98 / ((arg2 - 76) / 44);
            ++field4286;
            return ~(262144 & arg0) != -1 | class551.method4147((byte) 101, arg1, arg0) || class547.method4125(arg0, arg1, (byte) 109);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4308[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "b", descriptor = "(I)V", line = 125)
    public static void method2350(int arg0) {
        try {
            field4293 = null;
            field4303 = null;
            field4305 = null;
            if (arg0 != 10265) {
                method2350(96);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4308[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "h", descriptor = "(I)I", line = 141)
    public final int method1093(int arg0) {
        try {
            if (arg0 != -3) {
                this.method2346(-63);
            }
            ++field4285;
            return this.field4299;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4308[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(Lha;I)Lcca;", line = 155)
    public final class260 method1086(class66 arg0, int arg1) {
        try {
            ++field4306;
            return arg1 < 65 ? null : null;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4308[6] + (arg0 != null ? field4308[1] : field4308[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(IILha;B)Z", line = 166)
    public final boolean method1091(int arg0, int arg1, class66 arg2, byte arg3) {
        try {
            ++field4307;
            class501 var5 = arg2.method511();
            var5.method2389(super.field6197, super.field6199 + -10, super.field6211);
            class530 var6 = class540.field7920.method5000(this.field4301, (byte) 45);
            if (arg3 >= -43) {
                return true;
            } else {
                class497 var7 = var6.method4007((class704) null, 114, 0, 0, -1, this.field4284, (class344) null, arg2, 131072);
                if (var7 != null && (!class640.field9291 ? var7.method297(arg1, arg0, var5, true, var6.field7753) : var7.method314(arg1, arg0, var5, true, var6.field7753, class726.field10487))) {
                    return true;
                } else {
                    if (this.field4298 != -1) {
                        class530 var8 = class540.field7920.method5000(this.field4298, (byte) 86);
                        class497 var9 = var8.method4007((class704) null, 89, 0, 0, -1, this.field4297, (class344) null, arg2, 131072);
                        if (var9 != null && (!class640.field9291 ? var9.method297(arg1, arg0, var5, true, var8.field7753) : var9.method314(arg1, arg0, var5, true, var8.field7753, class726.field10487))) {
                            return true;
                        }
                    }
                    if (this.field4287 != -1) {
                        class530 var10 = class540.field7920.method5000(this.field4287, (byte) 49);
                        class497 var11 = var10.method4007((class704) null, 105, 0, 0, -1, this.field4294, (class344) null, arg2, 131072);
                        if (var11 != null && (class640.field9291 ? var11.method314(arg1, arg0, var5, true, var10.field7753, class726.field10487) : var11.method297(arg1, arg0, var5, true, var10.field7753))) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field4308[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4308[1] : field4308[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "c", descriptor = "(ILha;)V", line = 209)
    public final void method1081(int arg0, class66 arg1) {
        try {
            if (arg0 != 0) {
                this.method1082((byte) 18);
            }
            ++field4288;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4308[14] + arg0 + ',' + (arg1 != null ? field4308[1] : field4308[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "j", descriptor = "(I)I", line = 229)
    public final int method1088(int arg0) {
        try {
            ++field4300;
            return arg0 != -2226 ? -36 : -10;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4308[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(BLha;)Ltf;", line = 248)
    public final class310 method1094(byte arg0, class66 arg1) {
        try {
            ++field4304;
            class681 var3 = class186.method1621(super.field6200, super.field6197 >> class602.field8828, super.field6211 >> class602.field8828);
            class749 var4 = class89.method766(super.field6200, super.field6197 >> class602.field8828, super.field6211 >> class602.field8828);
            int var5 = 0;
            if (var3 != null && var3.field9867.field5333) {
                var5 = var3.field9867.method1088(arg0 ^ 2262);
            }
            if (var4 != null && ~(-var5) > ~var4.field10900) {
                var5 = -var4.field10900;
            }
            if (arg0 != -104) {
                this.field4294 = -50;
            }
            if (this.field4289 != var5) {
                super.field6199 -= this.field4289;
                this.field4289 = var5;
                super.field6199 += var5;
            }
            class501 var6 = arg1.method511();
            var6.method2383();
            if (this.field4289 == 0) {
                boolean var7 = false;
                boolean var8 = false;
                boolean var9 = false;
                class294 var10 = class555.field8261[super.field6205];
                int var11 = this.field4299 << 1;
                int var13 = -var11 / 2;
                int var14 = -var11 / 2;
                int var15 = var10.method2404((byte) 113, super.field6197 + var13, super.field6211 - -var14);
                int var16 = var11 / 2;
                int var17 = -var11 / 2;
                int var18 = var10.method2404((byte) 104, super.field6197 + var16, super.field6211 - -var17);
                int var19 = -var11 / 2;
                int var20 = var11 / 2;
                int var21 = var10.method2404((byte) 123, super.field6197 + var19, super.field6211 + var20);
                int var22 = var11 / 2;
                int var23 = var11 / 2;
                int var24 = var10.method2404((byte) 103, super.field6197 + var22, super.field6211 + var23);
                int var25 = ~var18 < ~var15 ? var15 : var18;
                int var26 = var21 < var24 ? var21 : var24;
                int var27 = var24 <= var18 ? var24 : var18;
                int var28 = var21 > var15 ? var15 : var21;
                if (var11 != 0) {
                    int var29 = (int) (Math.atan2((double) (var25 - var26), (double) var11) * 2607.5945876176133D) & 16383;
                    if (var29 != 0) {
                        var6.method2369(var29);
                    }
                }
                int var30 = var15 + var24;
                if (var11 != 0) {
                    int var31 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) (var28 - var27), (double) var11));
                    if (var31 != 0) {
                        var6.method2386(-var31);
                    }
                }
                if (~var30 < ~(var18 - -var21)) {
                    var30 = var18 + var21;
                }
                int var32 = (var30 >> 1) + -super.field6199;
                if (~var32 != -1) {
                    var6.method2375(0, var32, 0);
                }
            }
            var6.method2375(super.field6197, super.field6199 + -10, super.field6211);
            class310 var33 = class772.method5591(true, 0, 3);
            this.field4290 = false;
            this.field4299 = 0;
            if (this.field4287 != -1) {
                class497 var34 = class540.field7920.method5000(this.field4287, (byte) 81).method4007((class704) null, 94, 0, 0, -1, this.field4294, (class344) null, arg1, 2048);
                if (var34 != null) {
                    if (class640.field9291) {
                        var34.method323(var6, var33.field4918[2], class726.field10487, 0);
                    } else {
                        var34.method333(var6, var33.field4918[2], 0);
                    }
                    this.field4290 |= var34.method307();
                    this.field4299 = var34.method327();
                }
            }
            if (~this.field4298 != 0) {
                class497 var35 = class540.field7920.method5000(this.field4298, (byte) 51).method4007((class704) null, arg0 ^ -43, 0, 0, -1, this.field4297, (class344) null, arg1, 2048);
                if (var35 != null) {
                    if (!class640.field9291) {
                        var35.method333(var6, var33.field4918[1], 0);
                    } else {
                        var35.method323(var6, var33.field4918[1], class726.field10487, 0);
                    }
                    this.field4290 |= var35.method307();
                    if (var35.method327() > this.field4299) {
                        this.field4299 = var35.method327();
                    }
                }
            }
            class497 var36 = class540.field7920.method5000(this.field4301, (byte) 97).method4007((class704) null, arg0 ^ -93, 0, 0, -1, this.field4284, (class344) null, arg1, 2048);
            if (var36 != null) {
                if (class640.field9291) {
                    var36.method323(var6, var33.field4918[0], class726.field10487, 0);
                } else {
                    var36.method333(var6, var33.field4918[0], 0);
                }
                this.field4290 |= var36.method307();
                if (var36.method327() > this.field4299) {
                    this.field4299 = var36.method327();
                }
            }
            return var33;
        } catch (RuntimeException var38) {
            throw class759.method5498(var38, field4308[12] + arg0 + ',' + (arg1 != null ? field4308[1] : field4308[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2351(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2352(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 95;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 51;
                    break;
                default:
                    var10005 = 45;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
