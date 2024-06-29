import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bba")
public class class125 extends class535 implements class583 {

    @OriginalMember(owner = "client!bba", name = "bb", descriptor = "Z")
    private boolean field1461 = false;

    @OriginalMember(owner = "client!bba", name = "Y", descriptor = "Lnc;")
    public class26 field1459;

    @OriginalMember(owner = "client!bba", name = "U", descriptor = "Z")
    private boolean field1475;

    @OriginalMember(owner = "client!bba", name = "kb", descriptor = "[Ljava/lang/String;")
    private static final String[] field1483 = new String[] { method1100(method1099("Lf<?\u007fo,")), method1100(method1099("Lf<?v\u0006")), method1100(method1099("Lf<?w\u0006")), method1100(method1099("Lf<?r\u0006")), method1100(method1099("U*s?@")), method1100(method1099("@q1}")), method1100(method1099("Lf<?l\u0006")), method1100(method1099("Lf<?h\u0006")), method1100(method1099("Lf<?k\u0006")), method1100(method1099("Lf<?s\u0006")), method1100(method1099("Lf<?i\u0006")), method1100(method1099("Lf<?~o,")), method1100(method1099("Lf<?j\u0006")), method1100(method1099("Lf<?m\u0006")), method1100(method1099("Lf<?n\u0006")), method1100(method1099("Lf<?q\u0006")), method1100(method1099("Lf<?u\u0006")), method1100(method1099("Lf<?\u0001Gj4e\u0003\u0006")), method1100(method1099("Lf<?p\u0006")), method1100(method1099("Lf<?|o,")), method1100(method1099("Lf<?t\u0006")) };

    @OriginalMember(owner = "client!bba", name = "X", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!bba", name = "Z", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!bba", name = "ab", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!bba", name = "N", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!bba", name = "hb", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!bba", name = "jb", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!bba", name = "P", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!bba", name = "db", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!bba", name = "ib", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!bba", name = "S", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!bba", name = "W", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!bba", name = "fb", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!bba", name = "T", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!bba", name = "O", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!bba", name = "R", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!bba", name = "Q", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!bba", name = "J", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!bba", name = "eb", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!bba", name = "cb", descriptor = "Lcca;")
    private class260 field1474;

    @OriginalMember(owner = "client!bba", name = "gb", descriptor = "Lmca;")
    public static class33 field1465;

    @OriginalMember(owner = "client!bba", name = "V", descriptor = "[Lfs;")
    public static class581[] field1469;

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "(ILha;)V", line = 3)
    public final void method1081(int arg0, class66 arg1) {
        try {
            ++field1477;
            class497 var3 = this.field1459.method183(262144, arg1, -93, true, false);
            if (arg0 == 0) {
                if (var3 != null) {
                    int var4 = super.field6197 >> 9;
                    int var5 = super.field6211 >> 9;
                    class501 var6 = arg1.method511();
                    var6.method2389(super.field6197, super.field6199, super.field6211);
                    this.field1459.method176(var3, var4, var5, var6, var5, arg1, var4, (byte) -114, false);
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1483[12] + arg0 + ',' + (arg1 != null ? field1483[4] : field1483[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(B)Z", line = 28)
    public final boolean method1082(byte arg0) {
        try {
            ++field1462;
            if (arg0 != 27) {
                this.field1475 = true;
            }
            return false;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1483[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)I", line = 40)
    public final int method1083(byte arg0) {
        try {
            int var2 = 93 / ((53 - arg0) / 51);
            ++field1478;
            return this.field1459.field299;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1483[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "m", descriptor = "(I)V", line = 50)
    public static final void method1084(int arg0) {
        try {
            int var1 = -53 / ((45 - arg0) / 60);
            for (class753 var2 = (class753) class195.field2615.method971(347); var2 != null; var2 = (class753) class195.field2615.method973(true)) {
                if (var2.field10954) {
                    var2.field10954 = false;
                } else {
                    class744.method5423(63, var2.field10964);
                }
            }
            ++field1463;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1483[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lha;Lc;IIIIIZIIIII)V", line = 79)
    public class125(class66 arg0, class198 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        try {
            this.field1459 = new class26(arg0, arg1, arg10, arg11, super.field6200, arg3, this, arg7, arg12);
            this.field1475 = arg1.field3082 != 0 && !arg7;
        } catch (RuntimeException var15) {
            throw class759.method5498(var15, field1483[17] + (arg0 != null ? field1483[4] : field1483[5]) + ',' + (arg1 != null ? field1483[4] : field1483[5]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "c", descriptor = "(I)V", line = 96)
    public final void method1085(int arg0) {
        try {
            if (arg0 != -2939) {
                this.method1081(25, (class66) null);
            }
            ++field1482;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1483[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lha;I)Lcca;", line = 106)
    public final class260 method1086(class66 arg0, int arg1) {
        try {
            if (arg1 < 65) {
                return null;
            } else {
                ++field1473;
                return this.field1474;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1483[20] + (arg0 != null ? field1483[4] : field1483[5]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)I", line = 117)
    public final int method1087(int arg0) {
        try {
            ++field1467;
            if (arg0 != 18636) {
                this.method1090(104, (class66) null);
            }
            return this.field1459.field291;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1483[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "j", descriptor = "(I)I", line = 129)
    public final int method1088(int arg0) {
        try {
            if (arg0 != -2226) {
                this.method1086((class66) null, 48);
            }
            ++field1480;
            return this.field1459.method171(-125);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1483[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILrn;)V", line = 144)
    public final void method1089(int arg0, class282 arg1) {
        try {
            this.field1459.method179(0, arg1);
            ++field1464;
            int var3 = 28 / ((arg0 - -51) / 53);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1483[3] + arg0 + ',' + (arg1 != null ? field1483[4] : field1483[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(ILha;)V", line = 155)
    public final void method1090(int arg0, class66 arg1) {
        try {
            int var3 = 90 / ((arg0 - -53) / 61);
            ++field1481;
            this.field1459.method175(11, arg1);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1483[18] + arg0 + ',' + (arg1 != null ? field1483[4] : field1483[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(IILha;B)Z", line = 165)
    public final boolean method1091(int arg0, int arg1, class66 arg2, byte arg3) {
        try {
            if (arg3 > -43) {
                method1092(-121);
            }
            ++field1476;
            class497 var5 = this.field1459.method183(131072, arg2, -125, false, false);
            if (var5 == null) {
                return false;
            } else {
                class501 var6 = arg2.method511();
                var6.method2389(super.field7829 + super.field6197, super.field6199, super.field7830 + super.field6211);
                return class640.field9291 ? var5.method314(arg1, arg0, var6, false, 0, class726.field10487) : var5.method297(arg1, arg0, var6, false, 0);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1483[13] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1483[4] : field1483[5]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "n", descriptor = "(I)V", line = 185)
    public static void method1092(int arg0) {
        try {
            if (arg0 != 2048) {
                method1092(-33);
            }
            field1465 = null;
            field1469 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1483[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "h", descriptor = "(I)I", line = 199)
    public final int method1093(int arg0) {
        try {
            if (arg0 != -3) {
                this.method1086((class66) null, -101);
            }
            ++field1460;
            return this.field1459.method172((byte) -90);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1483[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(BLha;)Ltf;", line = 211)
    public final class310 method1094(byte arg0, class66 arg1) {
        try {
            ++field1470;
            class497 var3 = this.field1459.method183(2048, arg1, -107, true, false);
            if (var3 == null) {
                return null;
            } else {
                class501 var4 = arg1.method511();
                var4.method2389(super.field6197 - -super.field7829, super.field6199, super.field7830 + super.field6211);
                class310 var5 = class772.method5591(this.field1475, 0, 1);
                int var6 = super.field6197 >> 9;
                if (arg0 != -104) {
                    this.method1095(84);
                }
                int var7 = super.field6211 >> 9;
                this.field1459.method176(var3, var6, var7, var4, var7, arg1, var6, (byte) -117, true);
                if (class640.field9291) {
                    var3.method323(var4, var5.field4918[0], class726.field10487, 0);
                } else {
                    var3.method333(var4, var5.field4918[0], 0);
                }
                if (this.field1459.field312 != null) {
                    class580 var8 = this.field1459.field312.method4621();
                    if (!class640.field9291) {
                        arg1.method590(var8);
                    } else {
                        arg1.method500(var8, class726.field10487);
                    }
                }
                this.field1461 = var3.method307() || this.field1459.field312 != null;
                if (this.field1474 == null) {
                    this.field1474 = class505.method3806(126, var3, super.field6199, super.field6197, super.field6211);
                } else {
                    class587.method4377(super.field6197, this.field1474, super.field6199, 113, var3, super.field6211);
                }
                return var5;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field1483[19] + arg0 + ',' + (arg1 != null ? field1483[4] : field1483[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)Z", line = 262)
    public final boolean method1095(int arg0) {
        try {
            ++field1479;
            if (arg0 != -9842) {
                field1465 = null;
            }
            return this.field1459.method181((byte) -65);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1483[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILha;)V", line = 273)
    public final void method1096(int arg0, class66 arg1) {
        try {
            this.field1459.method174(93, arg1);
            ++field1472;
            if (arg0 > -77) {
                field1469 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1483[11] + arg0 + ',' + (arg1 != null ? field1483[4] : field1483[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "a", descriptor = "(Z)I", line = 285)
    public final int method1097(boolean arg0) {
        try {
            ++field1468;
            return arg0 ? -82 : this.field1459.field305;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1483[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "b", descriptor = "(Z)Z", line = 297)
    public final boolean method1098(boolean arg0) {
        try {
            if (arg0) {
                this.method1091(121, 103, (class66) null, (byte) -102);
            }
            ++field1466;
            return this.field1461;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1483[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1099(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 61);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1100(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 46;
                    break;
                case 1:
                    var10005 = 4;
                    break;
                case 2:
                    var10005 = 93;
                    break;
                case 3:
                    var10005 = 17;
                    break;
                default:
                    var10005 = 61;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
