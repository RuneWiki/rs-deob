import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class206 {

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Liha;")
    private class29 field3224 = new class29(64);

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Liha;")
    public class29 field3228 = new class29(60);

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "Lgda;")
    public class58 field3220;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Lgda;")
    private class58 field3225;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3230 = new String[] { method1868(method1867("S\u001d1\u007f\f")), method1868(method1867("S\u001d1~\f")), method1868(method1867("\\Y1\u0014Y")), method1868(method1867("I\u0002sV")), method1868(method1867("S\u001d1y\f")), method1868(method1867("S\u001d1{\f")), method1868(method1867("S\u001d1\u0006MI\u001ek\u0004\f")), method1868(method1867("S\u001d1r\f")), method1868(method1867("S\u001d1s\f")), method1868(method1867("S\u001d1x\f")), method1868(method1867("S\u001d1}\f")), method1868(method1867("S\u001d1|\f")) };

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "Lmp;")
    public static class796 field3218 = new class796(method1868(method1867("p#Hst")), method1868(method1867("H\u0011ySGB")), method1868(method1867("x\u0000vJ")), 3);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public int field3229;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public final void method1858(byte arg0) {
        try {
            class29 var2 = this.field3224;
            synchronized (this.field3224) {
                this.field3224.method298(5);
            }
            field3219++;
            class29 var3 = this.field3228;
            synchronized (this.field3228) {
                this.field3228.method298(5);
                if (arg0 != 117) {
                    method1861(null, -77, 28, null, -75);
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3230[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)Lpv;")
    public final class75 method1859(byte arg0, int arg1) {
        try {
            int var3 = 62 / ((20 - arg0) / 62);
            field3221++;
            class29 var4 = this.field3224;
            class75 var5;
            synchronized (this.field3224) {
                var5 = (class75) this.field3224.method302(-118, (long) arg1);
            }
            if (var5 != null) {
                return var5;
            }
            class58 var6 = this.field3225;
            byte[] var7;
            synchronized (this.field3225) {
                var7 = this.field3225.method604((byte) 87, class418.method3334(arg1, -31075), class292.method2486(2, arg1));
            }
            class75 var8 = new class75();
            var8.field1081 = arg1;
            var8.field1090 = this;
            if (var7 != null) {
                var8.method785(-46, new class176(var7));
            }
            class29 var9 = this.field3224;
            synchronized (this.field3224) {
                this.field3224.method295(false, (long) arg1, var8);
                return var8;
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field3230[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V")
    public static void method1860(boolean arg0) {
        try {
            field3218 = null;
            if (!arg0) {
                field3218 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3230[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([Ljava/lang/Object;II[II)V")
    public static final void method1861(Object[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        try {
            if (arg1 < arg2) {
                int var5 = (arg1 + arg2) / 2;
                int var6 = arg1;
                int var7 = arg3[var5];
                arg3[var5] = arg3[arg2];
                arg3[arg2] = var7;
                Object var8 = arg0[var5];
                arg0[var5] = arg0[arg2];
                arg0[arg2] = var8;
                int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
                for (int var10 = arg1; var10 < arg2; var10++) {
                    if (var7 + (var10 & var9) > arg3[var10]) {
                        int var11 = arg3[var10];
                        arg3[var10] = arg3[var6];
                        arg3[var6] = var11;
                        Object var12 = arg0[var10];
                        arg0[var10] = arg0[var6];
                        arg0[var6++] = var12;
                    }
                }
                arg3[arg2] = arg3[var6];
                arg3[var6] = var7;
                arg0[arg2] = arg0[var6];
                arg0[var6] = var8;
                method1861(arg0, arg1, var6 - 1, arg3, 4602);
                method1861(arg0, var6 + 1, arg2, arg3, arg4);
            }
            field3226++;
            if (arg4 != 4602) {
                field3218 = null;
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field3230[11] + (arg0 == null ? field3230[3] : field3230[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field3230[3] : field3230[2]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V")
    public final void method1862(int arg0, int arg1) {
        try {
            if (arg1 != 0) {
                field3218 = null;
            }
            field3216++;
            this.field3229 = arg0;
            class29 var3 = this.field3228;
            synchronized (this.field3228) {
                this.field3228.method304(1);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3230[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public final void method1863(int arg0) {
        try {
            field3222++;
            class29 var2 = this.field3224;
            synchronized (this.field3224) {
                this.field3224.method304(arg0);
            }
            class29 var3 = this.field3228;
            synchronized (this.field3228) {
                this.field3228.method304(arg0);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3230[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B[Lmj;I)V")
    public static final void method1864(byte arg0, class683[] arg1, int arg2) {
        try {
            field3215++;
            if (arg0 < -113) {
                for (int var3 = 0; var3 < arg1.length; var3++) {
                    class683 var4 = arg1[var3];
                    if (var4 != null && var4.field9764 == arg2 && !client.method2713(var4)) {
                        if (var4.field9782 == 0) {
                            method1864((byte) -117, arg1, var4.field9774);
                            if (var4.field9825 != null) {
                                method1864((byte) -116, var4.field9825, var4.field9774);
                            }
                            class23 var5 = (class23) class632.field9082.method737((byte) -39, (long) var4.field9774);
                            if (var5 != null) {
                                class764.method5511(98, var5.field219);
                            }
                        }
                        if (var4.field9782 == 6 && var4.field9824 != -1) {
                            class210 var6 = class397.field6293.method2058(var4.field9824, (byte) 122);
                            if (var6 != null) {
                                var4.field9874 += class778.field11350;
                                int var7 = var4.field9769;
                                while (var4.field9874 > var6.field3334[var4.field9769]) {
                                    var4.field9874 -= var6.field3334[var4.field9769];
                                    var4.field9769++;
                                    if (var6.field3327.length <= var4.field9769) {
                                        var4.field9769 -= var6.field3343;
                                        if (var4.field9769 < 0 || var4.field9769 >= var6.field3327.length) {
                                            var4.field9769 = 0;
                                        }
                                    }
                                    var4.field9873 = var4.field9769 + 1;
                                    if (var6.field3327.length <= var4.field9873) {
                                        var4.field9873 -= var6.field3343;
                                        if (var4.field9873 < 0 || var6.field3327.length <= var4.field9873) {
                                            var4.field9873 = -1;
                                        }
                                    }
                                    class454.method3525((byte) 27, var4);
                                }
                                if (var7 != var4.field9769) {
                                    class290.method2443((byte) -97, var4.field9769, var6);
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field3230[9] + arg0 + ',' + (arg1 == null ? field3230[3] : field3230[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)V")
    public final void method1865(boolean arg0, int arg1) {
        try {
            field3223++;
            class29 var3 = this.field3224;
            synchronized (this.field3224) {
                this.field3224.method294(arg1, -630);
            }
            class29 var4 = this.field3228;
            synchronized (this.field3228) {
                this.field3228.method294(arg1, -630);
                if (arg0) {
                    field3218 = null;
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3230[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I[[[Lgf;)V")
    public static final void method1866(int arg0, class290[][][] arg1) {
        try {
            field3227++;
            for (int var2 = arg0; var2 < arg1.length; var2++) {
                class290[][] var3 = arg1[var2];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    for (int var5 = 0; var5 < var3[var4].length; var5++) {
                        class290 var6 = var3[var4][var5];
                        if (var6 != null) {
                            if (var6.field4677 instanceof class3) {
                                ((class3) var6.field4677).method30(20235);
                            }
                            if (var6.field4673 instanceof class3) {
                                ((class3) var6.field4673).method30(20235);
                            }
                            if (var6.field4669 instanceof class3) {
                                ((class3) var6.field4669).method30(20235);
                            }
                            if (var6.field4684 instanceof class3) {
                                ((class3) var6.field4684).method30(20235);
                            }
                            if (var6.field4678 instanceof class3) {
                                ((class3) var6.field4678).method30(arg0 ^ 0x4F0B);
                            }
                            for (class135 var7 = var6.field4670; var7 != null; var7 = var7.field1912) {
                                class185 var8 = var7.field1911;
                                if (var8 instanceof class3) {
                                    ((class3) var8).method30(arg0 ^ 0x4F0B);
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field3230[4] + arg0 + ',' + (arg1 == null ? field3230[3] : field3230[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lpo;ILgda;Lgda;)V")
    public class206(class585 arg0, int arg1, class58 arg2, class58 arg3) {
        try {
            this.field3220 = arg3;
            this.field3225 = arg2;
            int var5 = this.field3225.method600(1) - 1;
            this.field3225.method580(105, var5);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3230[6] + (arg0 == null ? field3230[3] : field3230[2]) + ',' + arg1 + ',' + (arg2 == null ? field3230[3] : field3230[2]) + ',' + (arg3 == null ? field3230[3] : field3230[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1867(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x24);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1868(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 119;
                    break;
                case 2:
                    var10005 = 31;
                    break;
                case 3:
                    var10005 = 58;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
