import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class234 {

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "Lui;")
    private class251 field3372 = new class251(64);

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "Llga;")
    private class47 field3371;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public int field3374;

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3385 = new String[] { method1945(method1944("8^5_>")), method1945(method1944("4^wv")), method1945(method1944("!\u000554k")), method1945(method1944("8^5X>")), method1945(method1944("8^5]>")), method1945(method1944("8^5[>")), method1945(method1944("8^5Y>")), method1945(method1944("8^5\\>")), method1945(method1944("8^5&\u007f4Bo$>")), method1945(method1944("8^5^>")) };

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "Lmv;")
    public static class125 field3373 = new class125(75, 18);

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "Lvo;")
    public static class782 field3384 = null;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!bu", name = "n", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "Llga;")
    public static class47 field3375;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "Llga;")
    public static class47 field3383;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)V", line = 6)
    public static void method1937(boolean arg0) {
        try {
            field3383 = null;
            field3375 = null;
            if (!arg0) {
                method1941(11, 3, -72, null, 63, -20);
            }
            field3373 = null;
            field3384 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3385[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V", line = 19)
    public final void method1938(byte arg0) {
        try {
            field3378++;
            class251 var2 = this.field3372;
            synchronized (this.field3372) {
                this.field3372.method2047(11914);
            }
            if (arg0 <= 123) {
                this.field3374 = -81;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3385[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(II)V", line = 33)
    public final void method1939(int arg0, int arg1) {
        try {
            field3376++;
            class251 var3 = this.field3372;
            synchronized (this.field3372) {
                this.field3372.method2038(arg1 + 1, arg0);
                if (arg1 != -1) {
                    method1941(52, -72, -89, null, 83, 31);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3385[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)Lwda;", line = 46)
    public final class141 method1940(int arg0, int arg1) {
        try {
            field3380++;
            class251 var3 = this.field3372;
            class141 var4;
            synchronized (this.field3372) {
                var4 = (class141) this.field3372.method2053(arg0 ^ arg0, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field3371;
            byte[] var6;
            synchronized (this.field3371) {
                var6 = this.field3371.method512(arg1, 16, (byte) -115);
            }
            class141 var7 = new class141();
            if (var6 != null) {
                var7.method1222(114, new class711(var6));
            }
            class251 var8 = this.field3372;
            synchronized (this.field3372) {
                this.field3372.method2051((long) arg1, var7, arg0 + 15661);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field3385[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIILao;II)V", line = 74)
    public static final void method1941(int arg0, int arg1, int arg2, class626 arg3, int arg4, int arg5) {
        try {
            if (arg2 == -1) {
                field3382++;
                if (arg1 >= 1 && arg5 >= 1 && arg1 <= class625.field8929 - 2 && arg5 <= class14.field187 - 2) {
                    if (class608.field8715 == null) {
                        return;
                    }
                    class675 var6 = class334.field4579.method5723(false, arg0, arg5, arg1, arg4);
                    if (var6 != null) {
                        if (var6 instanceof class55) {
                            ((class55) var6).method574(arg3, false);
                            return;
                        }
                        if (var6 instanceof class800) {
                            ((class800) var6).method5771((byte) 89, arg3);
                            return;
                        }
                        if ((var6 instanceof class466)) {
                            ((class466) var6).method3583(-903, arg3);
                        } else if (var6 instanceof class710) {
                            ((class710) var6).method5077(0, arg3);
                            return;
                        }
                        return;
                    }
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3385[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field3385[1] : field3385[2]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIIII)V", line = 125)
    public static final void method1942(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field3381++;
            if (arg1 != 8) {
                method1941(109, 43, -58, null, -16, 45);
            }
            if (arg6 == 8 || arg6 == 16) {
                if (arg6 != 8) {
                    int var8 = (arg4 << class179.field2328) + class768.field10975;
                    int var9 = var8 - class768.field10975;
                    int var10 = arg3 << class179.field2328;
                    int var11 = class768.field10975 + var10;
                    int var12 = class213.field3124[arg2].method5442(arg4 + 1, arg3, 31844);
                    int var13 = class213.field3124[arg2].method5442(arg4, arg3 + 1, 31844);
                    class503.field7357[class151.field1936++] = new class182(arg6, arg2, var8, var9, var9, var8, var12, var13, var13 - arg5, -arg5 + var12, var10, var11, var11, var10);
                    return;
                }
                int var14 = arg4 << class179.field2328;
                int var15 = class768.field10975 + var14;
                int var16 = arg3 << class179.field2328;
                int var17 = var16 + class768.field10975;
                int var18 = class213.field3124[arg2].method5442(arg4, arg3, 31844);
                int var19 = class213.field3124[arg2].method5442(arg4 + 1, arg3 + 1, 31844);
                class503.field7357[class151.field1936++] = new class182(arg6, arg2, var14, var15, var15, var14, var18, var19, var19 - arg5, -arg5 + var18, var16, var17, var17, var16);
            } else {
                class621 var7 = class608.field8715[arg2][arg4][arg3];
                if (var7 == null) {
                    var7 = new class621(arg2);
                }
                if (arg6 == 1) {
                    var7.field8851 = (short) arg0;
                    var7.field8843 = (short) arg5;
                } else if (arg6 == 2) {
                    var7.field8853 = (short) arg5;
                    var7.field8854 = (short) arg0;
                }
                if (class397.field5768) {
                    class258.method2152(100);
                    return;
                }
            }
        } catch (RuntimeException var21) {
            throw class665.method4799(var21, field3385[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lfs;ILlga;)V", line = 216)
    public class234(class796 arg0, int arg1, class47 arg2) {
        try {
            this.field3371 = arg2;
            if (this.field3371 == null) {
                this.field3374 = 0;
            } else {
                this.field3374 = this.field3371.method509(true, 16);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3385[8] + (arg0 == null ? field3385[1] : field3385[2]) + ',' + arg1 + ',' + (arg2 == null ? field3385[1] : field3385[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)V", line = 200)
    public final void method1943(byte arg0) {
        try {
            field3377++;
            class251 var2 = this.field3372;
            synchronized (this.field3372) {
                if (arg0 == -63) {
                    this.field3372.method2043(false);
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field3385[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1944(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x16);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1945(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 90;
                    break;
                case 1:
                    var10005 = 43;
                    break;
                case 2:
                    var10005 = 27;
                    break;
                case 3:
                    var10005 = 26;
                    break;
                default:
                    var10005 = 22;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
