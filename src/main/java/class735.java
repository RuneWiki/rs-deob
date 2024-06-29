import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class735 {

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "Ljava/lang/String;")
    private String field10693 = field10706[2];

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10706 = new String[] { method5374(method5373("eR%\u000e-")), method5374(method5373("eR%\t-")), method5374(method5373("`Ng&")), method5374(method5373("eR%\r-")), method5374(method5373("eR%\u0003-")), method5374(method5373("eR%\u000b-")), method5374(method5373("u\u0015%dx")), method5374(method5373("eR%\u0000-")), method5374(method5373("eR%\b-")), method5374(method5373("eR%\f-")), method5374(method5373("eR%\u0002-")), method5374(method5373("eR%\u000f-")) };

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Lup;")
    public static class290 field10700 = new class290();

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "C")
    public char field10692;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "C")
    public char field10704;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field10689;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    private int field10690;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    private int field10691;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field10694;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public static int field10695;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field10696;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field10697;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field10701;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field10702;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field10703;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field10705;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Lqha;")
    public class112 field10698;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Lqha;")
    private class112 field10699;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLib;)V", line = 6)
    public final void method5363(byte arg0, class163 arg1) {
        try {
            if (arg0 != 63) {
                this.field10704 = (char) 65463;
            }
            field10701++;
            while (true) {
                int var3 = arg1.method1455((byte) 62);
                if (var3 == 0) {
                    return;
                }
                this.method5365(var3, arg1, false);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10706[10] + arg0 + ',' + (arg1 == null ? field10706[2] : field10706[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V", line = 28)
    public static final void method5364(int arg0) {
        try {
            field10695++;
            int var1 = 0;
            if (class289.field4305.field801.method1028(false) == 1) {
                int var2 = var1 | 0x1;
                int var3 = var2 | 0x10;
                int var4 = var3 | 0x20;
                int var5 = var4 | 0x2;
                var1 = var5 | 0x4;
            }
            if (class289.field4305.field835.method1184(false) == 0) {
                var1 |= 0x40;
            }
            class127.method1111(0, var1);
            class417.field6144.method3029(true, var1);
            if (arg0 != 2) {
                field10700 = null;
            }
            class540.field7920.method5004(-66, var1);
            class262.field4035.method4257(var1, true);
            class771.field11208.method2503(90, var1);
            class476.method3615(125, var1);
            class137.method1170(false, var1);
            class728.method5310((byte) -39, var1);
            class572.method4275(var1, (byte) -73);
            class152.method1273((byte) -24);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field10706[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILib;Z)V", line = 68)
    private final void method5365(int arg0, class163 arg1, boolean arg2) {
        try {
            if (arg0 == 1) {
                this.field10692 = class259.method2185(-161, arg1.method1414(1));
            } else if (arg0 == 2) {
                this.field10704 = class259.method2185(-161, arg1.method1414(1));
            } else if (arg0 == 3) {
                this.field10693 = arg1.method1423(68);
            } else if (arg0 == 4) {
                this.field10691 = arg1.method1453((byte) 82);
            } else if (arg0 == 5 || arg0 == 6) {
                this.field10690 = arg1.method1445((byte) 118);
                this.field10698 = new class112(class12.method83((byte) -1, this.field10690));
                for (int var4 = 0; var4 < this.field10690; var4++) {
                    int var5 = arg1.method1453((byte) 101);
                    class206 var6;
                    if (arg0 == 5) {
                        var6 = new class78(arg1.method1423(116));
                    } else {
                        var6 = new class609(arg1.method1453((byte) 90));
                    }
                    this.field10698.method968((byte) -111, (long) var5, var6);
                }
            }
            field10702++;
            if (arg2) {
                this.method5370(-43, -107);
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10706[5] + arg0 + ',' + (arg1 == null ? field10706[2] : field10706[6]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 120)
    public static void method5366(int arg0) {
        try {
            if (arg0 != -4) {
                field10700 = null;
            }
            field10700 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10706[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)Ljava/lang/String;", line = 135)
    public final String method5367(int arg0, int arg1) {
        try {
            field10697++;
            if (this.field10698 == null) {
                return this.field10693;
            }
            if (arg0 != -29506) {
                this.method5365(100, null, true);
            }
            class78 var3 = (class78) this.field10698.method977((long) arg1, 1);
            return var3 == null ? this.field10693 : var3.field893;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10706[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 157)
    private final void method5368(byte arg0) {
        try {
            field10703++;
            this.field10699 = new class112(this.field10698.method976(54));
            class609 var2 = (class609) this.field10698.method971(347);
            if (arg0 <= 8) {
                this.method5368((byte) -16);
            }
            while (var2 != null) {
                class609 var3 = new class609((int) var2.field3177);
                this.field10699.method968((byte) -111, (long) var2.field8902, var3);
                var2 = (class609) this.field10698.method973(true);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10706[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 179)
    public final boolean method5369(int arg0, String arg1) {
        try {
            if (arg0 < 68) {
                this.field10692 = (char) 65467;
            }
            field10705++;
            if (this.field10698 == null) {
                return false;
            }
            if (this.field10699 == null) {
                this.method5372(115);
            }
            for (class784 var3 = (class784) this.field10699.method977(class40.method267((byte) -115, arg1), 1); var3 != null; var3 = (class784) this.field10699.method969(-54)) {
                if (var3.field11419.equals(arg1)) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10706[11] + arg0 + ',' + (arg1 == null ? field10706[2] : field10706[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Z", line = 212)
    public final boolean method5370(int arg0, int arg1) {
        try {
            field10696++;
            if (arg1 >= -98) {
                field10700 = null;
            }
            if (this.field10698 == null) {
                return false;
            }
            if (this.field10699 == null) {
                this.method5368((byte) 112);
            }
            class609 var3 = (class609) this.field10699.method977((long) arg0, 1);
            return var3 != null;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10706[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)I", line = 237)
    public final int method5371(boolean arg0, int arg1) {
        try {
            field10694++;
            if (this.field10698 == null) {
                return this.field10691;
            }
            class609 var3 = (class609) this.field10698.method977((long) arg1, 1);
            if (arg0) {
                this.field10691 = -8;
            }
            return var3 == null ? this.field10691 : var3.field8902;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10706[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V", line = 258)
    private final void method5372(int arg0) {
        try {
            this.field10699 = new class112(this.field10698.method976(69));
            if (arg0 <= 93) {
                this.method5369(-31, null);
            }
            field10689++;
            for (class78 var2 = (class78) this.field10698.method971(347); var2 != null; var2 = (class78) this.field10698.method973(true)) {
                class784 var3 = new class784(var2.field893, (int) var2.field3177);
                this.field10699.method968((byte) -111, class40.method267((byte) -19, var2.field893), var3);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10706[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5373(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5374(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 59;
                    break;
                case 2:
                    var10005 = 11;
                    break;
                case 3:
                    var10005 = 74;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
