import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class40 {

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public int field552 = -1;

    @OriginalMember(owner = "client!gs", name = "o", descriptor = "Z")
    public boolean field558 = false;

    @OriginalMember(owner = "client!gs", name = "s", descriptor = "[I")
    private int[] field562 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "[I")
    public static int[] field550 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!gs", name = "p", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!gs", name = "q", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!gs", name = "r", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!gs", name = "t", descriptor = "I")
    public static int field563;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gs", name = "u", descriptor = "Ljava/lang/Class;")
    public static Class field564;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "[I")
    private int[] field544;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "[S")
    private short[] field548;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "[S")
    private short[] field553;

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "[S")
    private short[] field555;

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "[S")
    private short[] field557;

    // $FF: synthetic method
    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method293(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;", line = 5)
    public static final String[] method281(String[] arg0, int arg1) {
        field561++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        if (arg1 != -3) {
            field550 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)Lwp;", line = 33)
    public final class245 method282(int arg0) {
        field559++;
        if (this.field544 == null) {
            return null;
        }
        class245[] var2 = new class245[this.field544.length];
        class347 var3 = class354.field5127;
        synchronized (class354.field5127) {
            int var4 = arg0;
            while (true) {
                if (this.field544.length <= var4) {
                    break;
                }
                var2[var4] = class235.method1410(-7137, this.field544[var4], class354.field5127, 0);
                var4++;
            }
        }
        class245 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class245(var2, var2.length);
        }
        if (var5 == null) {
            return null;
        }
        if (this.field555 != null) {
            for (int var6 = 0; var6 < this.field555.length; var6++) {
                var5.method1480(arg0 - 117, this.field553[var6], this.field555[var6]);
            }
        }
        if (this.field557 != null) {
            for (int var7 = 0; var7 < this.field557.length; var7++) {
                var5.method1476(this.field557[var7], this.field548[var7], 0);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)Z", line = 93)
    public final boolean method283(byte arg0) {
        field546++;
        boolean var2 = true;
        class347 var3 = class354.field5127;
        synchronized (class354.field5127) {
            if (arg0 < 96) {
                method289(53, 93, -107, 68, -54, (class405) null, -19, -100, 124);
            }
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field562[var4] != -1 && !class354.field5127.method2263(this.field562[var4], 0, 114)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BILnj;)V", line = 125)
    private final void method284(byte arg0, int arg1, class228 arg2) {
        field549++;
        if (arg1 == 1) {
            this.field552 = arg2.method1348(-97);
        } else if (arg1 == 2) {
            int var4 = arg2.method1348(-117);
            this.field544 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field544[var5] = arg2.method1343(255);
            }
        } else if (arg1 == 3) {
            this.field558 = true;
        } else if (arg1 == 40) {
            int var8 = arg2.method1348(-111);
            this.field553 = new short[var8];
            this.field555 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field555[var9] = (short) arg2.method1343(255);
                this.field553[var9] = (short) arg2.method1343(arg0 + 268);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method1348(-96);
            this.field557 = new short[var6];
            this.field548 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field557[var7] = (short) arg2.method1343(255);
                this.field548[var7] = (short) arg2.method1343(255);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field562[arg1 - 60] = arg2.method1343(255);
        }
        if (arg0 != -13) {
            method292(88, -115, 51);
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V", line = 203)
    public static final void method285(int arg0) {
        field554++;
        class250.field3435.method1141(arg0 ^ 0x100);
        class420.field6213.method1141(256);
        if (arg0 != 0) {
            field550 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)V", line = 218)
    public static void method286(byte arg0) {
        field550 = null;
        if (arg0 >= -92) {
            field550 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lps;I)Ljava/lang/String;", line = 228)
    public static final String method287(class394 arg0, int arg1) {
        field556++;
        if (~client.method1544(arg0).method2066((byte) -125) == arg1) {
            return null;
        } else if (arg0.field5700 == null || arg0.field5700.trim().length() == 0) {
            return class62.field818 ? "Hidden-use" : null;
        } else {
            return arg0.field5700;
        }
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)Z", line = 251)
    public final boolean method288(int arg0) {
        field547++;
        if (this.field544 == null) {
            return true;
        }
        boolean var2 = true;
        class347 var3 = class354.field5127;
        synchronized (class354.field5127) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field544.length) {
                    break;
                }
                if (!class354.field5127.method2263(this.field544[var4], 0, 117)) {
                    var2 = false;
                }
                var4++;
            }
        }
        if (arg0 <= 19) {
            this.method284((byte) -62, 85, (class228) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIILii;III)V", line = 279)
    public static final void method289(int arg0, int arg1, int arg2, int arg3, int arg4, class405 arg5, int arg6, int arg7, int arg8) {
        field545++;
        class425 var9 = (class425) method292(arg0, arg2, arg7);
        if (var9 != null) {
            class104 var10 = class329.method2190((byte) 63, var9.method121(-15123));
            int var11 = var9.method120(25940) & 0x3;
            int var12 = var9.method105(-77);
            if (var10.field1496 == -1) {
                int var13 = arg1;
                if (var10.field1455 > 0) {
                    var13 = arg4;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg5.method2615(var13, 4, arg8, arg3, -116);
                    } else if (var11 == 1) {
                        arg5.method2612(arg3, var13, arg8, 1, 4);
                    } else if (var11 == 2) {
                        arg5.method2615(var13, 4, arg8, arg3 + 3, arg6 + 81);
                    } else if (var11 == 3) {
                        arg5.method2612(arg3, var13, arg8 + 3, arg6 + -2, 4);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg5.method2610(1, var13, true, 1, arg3, arg8);
                    } else if (var11 == 1) {
                        arg5.method2610(1, var13, true, 1, arg3 + 3, arg8);
                    } else if (var11 == 2) {
                        arg5.method2610(1, var13, true, 1, arg3 + 3, arg8 + 3);
                    } else if (var11 == 3) {
                        arg5.method2610(1, var13, true, 1, arg3, arg8 + 3);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg5.method2612(arg3, var13, arg8, arg6 ^ 0x2, 4);
                    } else if (var11 == 1) {
                        arg5.method2615(var13, 4, arg8, arg3 + 3, 13);
                    } else if (var11 == 2) {
                        arg5.method2612(arg3, var13, arg8 + 3, arg6 + -2, 4);
                    } else if (var11 == 3) {
                        arg5.method2615(var13, 4, arg8, arg3, -118);
                    }
                }
            } else {
                class372.method2411(arg5, arg8, var10, (byte) -96, var11, arg3);
            }
        }
        class425 var14 = (class425) class243.method1460(arg0, arg2, arg7, field564 == null ? (field564 = method293("jb")) : field564);
        if (var14 != null) {
            class104 var15 = class329.method2190((byte) 63, var14.method121(arg6 ^ 0xFFFFC4EE));
            int var16 = var14.method120(25940) & 0x3;
            int var17 = var14.method105(arg6 ^ 0xFFFFFFE5);
            if (var15.field1496 != -1) {
                class372.method2411(arg5, arg8, var15, (byte) -81, var16, arg3);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field1455 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg5.method2614(arg3 + 3, arg8 + 3, arg3, arg8, var18, false);
                } else {
                    arg5.method2614(arg3 + 3, arg8, arg3, arg8 + 3, var18, false);
                }
            }
        }
        class425 var19 = (class425) class130.method823(arg0, arg2, arg7);
        if (var19 != null) {
            class104 var20 = class329.method2190((byte) 63, var19.method121(-15123));
            int var21 = var19.method120(arg6 + 25937) & 0x3;
            if (var20.field1496 != -1) {
                class372.method2411(arg5, arg8, var20, (byte) -117, var21, arg3);
            }
        }
        if (arg6 != 3) {
            field550 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lnj;B)V", line = 420)
    public final void method290(class228 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1348(-123);
            if (var3 == 0) {
                field563++;
                if (arg1 != -89) {
                    method292(118, 10, -93);
                    return;
                }
                return;
            }
            this.method284((byte) -13, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "(I)Lwp;", line = 447)
    public final class245 method291(int arg0) {
        field560++;
        class245[] var2 = new class245[arg0];
        int var3 = 0;
        class347 var4 = class354.field5127;
        synchronized (class354.field5127) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field562[var5] != -1) {
                    var2[var3++] = class235.method1410(class399.method2571(arg0, -7142), this.field562[var5], class354.field5127, 0);
                }
            }
        }
        class245 var6 = new class245(var2, var3);
        if (this.field555 != null) {
            for (int var7 = 0; var7 < this.field555.length; var7++) {
                var6.method1480(arg0 ^ 0xFFFFFFAA, this.field553[var7], this.field555[var7]);
            }
        }
        if (this.field557 != null) {
            for (int var8 = 0; var8 < this.field557.length; var8++) {
                var6.method1476(this.field557[var8], this.field548[var8], arg0 ^ 0x5);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)Le;", line = 504)
    public static final class97 method292(int arg0, int arg1, int arg2) {
        class254 var3 = class213.field2852[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3510;
    }
}
