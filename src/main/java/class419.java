import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class419 extends class535 implements class583 {

    @OriginalMember(owner = "client!tb", name = "jb", descriptor = "Z")
    private boolean field6180;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "B")
    private byte field6173;

    @OriginalMember(owner = "client!tb", name = "ob", descriptor = "S")
    private short field6186;

    @OriginalMember(owner = "client!tb", name = "mb", descriptor = "Z")
    private boolean field6183;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "B")
    private byte field6171;

    @OriginalMember(owner = "client!tb", name = "bb", descriptor = "Z")
    private boolean field6178;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "Lr;")
    private class194 field6181;

    @OriginalMember(owner = "client!tb", name = "J", descriptor = "Lka;")
    private class497 field6174;

    @OriginalMember(owner = "client!tb", name = "qb", descriptor = "[Ljava/lang/String;")
    private static final String[] field6196 = new String[] { method3250(method3249("q\\,rU")), method3250(method3249("~\u0010,`Ad\u001bvb\u0000")), method3250(method3249("d\u0007n0")), method3250(method3249("~\u0010,\u001fi\"")), method3250(method3249("~\u0010,\u0017\u0000")), method3250(method3249("~\u0010,\b\u0000")), method3250(method3249("~\u0010,\n\u0000")), method3250(method3249("~\u0010,\r\u0000")), method3250(method3249("~\u0010,\u001ei\"")), method3250(method3249("~\u0010,\u001di\"")), method3250(method3249("~\u0010,\u000b\u0000")), method3250(method3249("~\u0010,\u0012\u0000")), method3250(method3249("~\u0010,\f\u0000")), method3250(method3249("~\u0010,\u0015\u0000")), method3250(method3249("~\u0010,\u0010\u0000")), method3250(method3249("~\u0010,\u0011\u0000")), method3250(method3249("~\u0010,\u0014\u0000")), method3250(method3249("~\u0010,\u000f\u0000")), method3250(method3249("~\u0010,\t\u0000")), method3250(method3249("~\u0010,\u0013\u0000")), method3250(method3249("~\u0010,\u0016\u0000")), method3250(method3249("~\u0010,\u000e\u0000")) };

    @OriginalMember(owner = "client!tb", name = "eb", descriptor = "[Z")
    public static boolean[] field6166 = new boolean[100];

    @OriginalMember(owner = "client!tb", name = "ib", descriptor = "I")
    public static int field6182 = 0;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!tb", name = "fb", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!tb", name = "pb", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!tb", name = "Z", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!tb", name = "nb", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!tb", name = "kb", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!tb", name = "cb", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!tb", name = "ab", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!tb", name = "X", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!tb", name = "W", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!tb", name = "gb", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!tb", name = "Y", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!tb", name = "lb", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!tb", name = "db", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "Lcca;")
    private class260 field6194;

    @OriginalMember(owner = "client!tb", name = "hb", descriptor = "Lne;")
    public static class336 field6176;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
    public final void method1085(int arg0) {
        try {
            if (arg0 != -2939) {
                this.method1087(-80);
            }
            if (this.field6174 != null) {
                this.field6174.method322();
            }
            ++field6188;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6196[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)Z")
    public final boolean method1082(byte arg0) {
        try {
            if (arg0 != 27) {
                this.method1087(114);
            }
            ++field6167;
            if (this.field6174 != null) {
                return !this.field6174.method321();
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6196[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)I")
    public final int method1083(byte arg0) {
        try {
            int var2 = -38 / ((arg0 - 53) / 51);
            ++field6170;
            return 65535 & this.field6186;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6196[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILha;)Lka;")
    private final class497 method3245(int arg0, int arg1, class66 arg2) {
        try {
            ++field6168;
            if (this.field6174 != null && arg2.method509(this.field6174.method330(), arg1) == 0) {
                return this.field6174;
            } else {
                class433 var4 = this.method3247(arg2, false, arg0 + arg0, arg1);
                return var4 != null ? var4.field6363 : null;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6196[21] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6196[0] : field6196[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lha;Lc;IIIIIZIIII)V")
    public class419(class66 arg0, class198 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        try {
            super.field6197 = arg4;
            this.field6180 = arg1.field3082 != 0 && !arg7;
            this.field6173 = (byte) arg10;
            this.field6186 = (short) arg1.field3014;
            super.field6211 = arg6;
            this.field6183 = arg7;
            this.field6171 = (byte) arg11;
            this.field6178 = arg0.method559() && arg1.field3036 && !this.field6183 && ~class289.field4305.field810.method112(false) != -1;
            class433 var13 = this.method3247(arg0, this.field6178, 0, 2048);
            if (var13 != null) {
                this.field6181 = var13.field6364;
                this.field6174 = var13.field6363;
            }
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field6196[1] + (arg0 != null ? field6196[0] : field6196[2]) + ',' + (arg1 != null ? field6196[0] : field6196[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "(I)V")
    public static void method3246(int arg0) {
        try {
            field6176 = null;
            if (arg0 >= -9) {
                field6166 = null;
            }
            field6166 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6196[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lha;ZII)Llg;")
    private final class433 method3247(class66 arg0, boolean arg1, int arg2, int arg3) {
        try {
            ++field6169;
            class198 var5 = class417.field6144.method3030(arg2, this.field6186 & 65535);
            class294 var6;
            class294 var7;
            if (!this.field6183) {
                var6 = class184.field2541[super.field6205];
                if (super.field6205 < 3) {
                    var7 = class184.field2541[super.field6205 - -1];
                } else {
                    var7 = null;
                }
            } else {
                var6 = class195.field2617[super.field6205];
                var7 = class184.field2541[0];
            }
            return var5.method1779(arg3, super.field6211, super.field6199, super.field6197, arg2 + 50, arg0, var7, this.field6171, this.field6173, var6, arg1, (class282) null);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field6196[19] + (arg0 != null ? field6196[0] : field6196[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)I")
    public final int method1093(int arg0) {
        try {
            ++field6172;
            if (arg0 != -3) {
                this.field6174 = null;
            }
            return this.field6174 == null ? 0 : this.field6174.method327();
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6196[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(ILha;)V")
    public final void method1081(int arg0, class66 arg1) {
        try {
            ++field6177;
            if (arg0 != 0) {
                this.field6178 = true;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6196[10] + arg0 + ',' + (arg1 != null ? field6196[0] : field6196[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)Z")
    public final boolean method1098(boolean arg0) {
        try {
            ++field6190;
            if (arg0) {
                this.method3245(-97, 49, (class66) null);
            }
            return this.field6174 != null ? this.field6174.method307() : false;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6196[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(ILha;)V")
    public final void method1090(int arg0, class66 arg1) {
        try {
            ++field6195;
            int var3 = 34 % ((-53 - arg0) / 61);
            Object var4 = null;
            class194 var5;
            if (this.field6181 == null && this.field6178) {
                class433 var6 = this.method3247(arg1, true, 0, 262144);
                var5 = var6 == null ? null : var6.field6364;
            } else {
                var5 = this.field6181;
                this.field6181 = null;
            }
            if (var5 != null) {
                class670.method4926(var5, super.field6205, super.field6197, super.field6211, (boolean[]) null);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6196[15] + arg0 + ',' + (arg1 != null ? field6196[0] : field6196[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Z")
    public final boolean method1095(int arg0) {
        try {
            if (arg0 != -9842) {
                return false;
            } else {
                ++field6185;
                return this.field6178;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6196[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILha;B)Z")
    public final boolean method1091(int arg0, int arg1, class66 arg2, byte arg3) {
        try {
            ++field6189;
            if (arg3 >= -43) {
                return true;
            } else {
                class497 var5 = this.method3245(0, 131072, arg2);
                if (var5 != null) {
                    class501 var6 = arg2.method511();
                    var6.method2389(super.field6197, super.field6199, super.field6211);
                    return class640.field9291 ? var5.method314(arg1, arg0, var6, false, 0, class726.field10487) : var5.method297(arg1, arg0, var6, false, 0);
                } else {
                    return false;
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6196[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6196[0] : field6196[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "(I)I")
    public final int method1088(int arg0) {
        try {
            ++field6191;
            if (arg0 != -2226) {
                this.field6180 = false;
            }
            return this.field6174 == null ? 0 : this.field6174.method305();
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6196[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)I")
    public final int method1097(boolean arg0) {
        try {
            ++field6184;
            if (arg0) {
                field6176 = null;
            }
            return this.field6171;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6196[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lha;I)Lcca;")
    public final class260 method1086(class66 arg0, int arg1) {
        try {
            if (arg1 <= 65) {
                this.field6173 = -18;
            }
            if (this.field6194 == null) {
                this.field6194 = class505.method3806(40, this.method3245(0, 0, arg0), super.field6199, super.field6197, super.field6211);
            }
            ++field6187;
            return this.field6194;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6196[13] + (arg0 != null ? field6196[0] : field6196[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lha;B)V")
    public static final void method3248(class66 arg0, byte arg1) {
        try {
            if (arg1 <= 62) {
                field6166 = null;
            }
            ++field6179;
            if (class141.field1680.method3874(-32154) != 0) {
                if (~class289.field4305.field812.method1610(false) != -1) {
                    if (class232.field3505 == null) {
                        Canvas var2 = new Canvas();
                        var2.setSize(36, 32);
                        class232.field3505 = class289.method2345(0, var2, 0, 107, class278.field4183, class426.field6273);
                        class528.field7672 = class232.field3505.method563(class106.method933(0, class431.field6336, (byte) 122, class753.field10953), class481.method3673(class383.field5798, class431.field6336, 0), true);
                    }
                    for (class327 var3 = (class327) class141.field1680.method3863((byte) 64); var3 != null; var3 = (class327) class141.field1680.method3862(-353)) {
                        class540.field7920.method4994(var3.field5152, class232.field3505, var3.field5155, var3.field5151 ? class225.field3446.field10513 : null, arg0, false, class528.field7672, var3.field5157, var3.field5153, var3.field5154, false, -1);
                        var3.method1824(1);
                    }
                } else {
                    for (class327 var4 = (class327) class141.field1680.method3863((byte) 64); var4 != null; var4 = (class327) class141.field1680.method3862(-353)) {
                        class540.field7920.method4994(var4.field5152, arg0, var4.field5155, var4.field5151 ? class225.field3446.field10513 : null, arg0, false, class562.field8349, var4.field5157, var4.field5153, var4.field5154, false, -1);
                        var4.method1824(1);
                    }
                    class649.method4771((byte) -120);
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6196[4] + (arg0 != null ? field6196[0] : field6196[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)I")
    public final int method1087(int arg0) {
        try {
            if (arg0 != 18636) {
                return -23;
            } else {
                ++field6175;
                return this.field6173;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6196[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILha;)V")
    public final void method1096(int arg0, class66 arg1) {
        try {
            ++field6193;
            if (arg0 > -77) {
                this.field6178 = true;
            }
            Object var3 = null;
            class194 var4;
            if (this.field6181 == null && this.field6178) {
                class433 var5 = this.method3247(arg1, true, 0, 262144);
                var4 = var5 != null ? var5.field6364 : null;
            } else {
                var4 = this.field6181;
                this.field6181 = null;
            }
            if (var4 != null) {
                class188.method1632(var4, super.field6205, super.field6197, super.field6211, (boolean[]) null);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6196[3] + arg0 + ',' + (arg1 != null ? field6196[0] : field6196[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLha;)Ltf;")
    public final class310 method1094(byte arg0, class66 arg1) {
        try {
            if (arg0 != -104) {
                this.field6178 = true;
            }
            ++field6192;
            if (this.field6174 == null) {
                return null;
            } else {
                class501 var3 = arg1.method511();
                var3.method2389(super.field6197 - -super.field7829, super.field6199, super.field7830 + super.field6211);
                class310 var4 = class772.method5591(this.field6180, 0, 1);
                if (!class640.field9291) {
                    this.field6174.method333(var3, var4.field4918[0], 0);
                } else {
                    this.field6174.method323(var3, var4.field4918[0], class726.field10487, 0);
                }
                return var4;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field6196[9] + arg0 + ',' + (arg1 != null ? field6196[0] : field6196[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3249(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3250(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 114;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 92;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
