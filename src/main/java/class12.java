import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class12 {

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "Llq;")
    public class578 field140 = null;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "Lda;")
    public class67 field147 = null;

    @OriginalMember(owner = "client!daa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field149 = new String[] { method87(method86("g\u0015\t~\u001b+")), method87(method86("m\u0001\u0004<")), method87(method86("xZF~'")), method87(method86("g\u0015\t~\u001f+")), method87(method86("g\u0015\t~fj\u001a\u0001$d+")), method87(method86("g\u0015\t~\u0019+")), method87(method86("g\u0015\t~\u001e+")), method87(method86("g\u0015\t~\u0018+")) };

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
    public static int field142 = -1;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "[I")
    public static int[] field146 = new int[500];

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "I")
    public static int field143 = 0;

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method81(boolean arg0) {
        try {
            field148++;
            if (!arg0 && class610.field8913 != null) {
                if (class235.field3549) {
                    class769.method5552((byte) -92);
                }
                class675.field9785.method1874(27105);
                class299.method2523();
                class233.method1993((byte) -30);
                class49.method378(2);
                class104.method918(0);
                class677.method4967(0);
                if (class492.field7061 != null) {
                    class492.field7061.method3503(127);
                }
                class289.method2348(-120);
                class344.method2848(-6177);
                class184.method1609(-1);
                class753.method5470(109);
                class123.method1069(false, arg0);
                for (int var1 = 0; var1 < 2048; var1++) {
                    class726 var2 = class197.field2685[var1];
                    if (var2 != null) {
                        for (int var3 = 0; var3 < var2.field3865.length; var3++) {
                            var2.field3865[var3] = null;
                        }
                    }
                }
                for (int var4 = 0; var4 < class750.field10912; var4++) {
                    class612 var5 = class753.field10966[var4].field5799;
                    if (var5 != null) {
                        for (int var6 = 0; var6 < var5.field3865.length; var6++) {
                            var5.field3865[var6] = null;
                        }
                    }
                }
                class272.field4126 = null;
                class70.field751 = null;
                class610.field8913.method579((byte) -117);
                class610.field8913 = null;
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field149[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILha;I)V", line = 88)
    public static final void method82(int arg0, class66 arg1, int arg2) {
        try {
            field141++;
            if (class64.field658 && class16.field197) {
                if (class21.field248) {
                    class588.field8651 = class371.field5648.method165((byte) -102);
                }
                class26.field324 = 0;
                class519.field7615 = 0;
                class673.field9770 = 0;
                int[] var3 = arg1.method548();
                class301.field4725 = (int) ((float) var3[2] / 3.0F);
                class240.field3636 = (int) ((float) var3[3] / 3.0F);
                arg1.method539(class792.field11530);
                if (((int) ((float) class792.field11530[0] / 3.0F)) != class756.field10986 || (int) ((float) class792.field11530[1] / 3.0F) != class58.field617) {
                    class756.field10986 = (int) ((float) class792.field11530[0] / 3.0F);
                    class58.field617 = (int) ((float) class792.field11530[1] / 3.0F);
                    class690.field9995 = class756.field10986 >> 1;
                    class253.field3934 = class58.field617 >> 1;
                    class21.field249 = new int[class756.field10986 * class58.field617];
                }
                class440.field6490 = arg1.method577();
                class655.field9468 = 0;
                for (int var4 = 0; var4 < class48.field547; var4++) {
                    class339.method2823(class340.field5291[var4], arg1, (byte) 94, arg0);
                }
                int var5 = 0;
                if (arg2 >= 76) {
                    while (var5 < class440.field6489) {
                        class339.method2823(class137.field1598[var5], arg1, (byte) 94, arg0);
                        var5++;
                    }
                    for (int var6 = 0; var6 < class241.field3642; var6++) {
                        class339.method2823(class107.field1235[var6], arg1, (byte) 94, arg0);
                    }
                    class73.field850 = 0;
                    if (class655.field9468 > 0) {
                        int var7 = class21.field249.length;
                        int var8 = var7 - var7 & 0x7;
                        int var9 = 0;
                        while (var8 > var9) {
                            class21.field249[var9++] = Integer.MAX_VALUE;
                            class21.field249[var9++] = Integer.MAX_VALUE;
                            class21.field249[var9++] = Integer.MAX_VALUE;
                            class21.field249[var9++] = Integer.MAX_VALUE;
                            class21.field249[var9++] = Integer.MAX_VALUE;
                            class21.field249[var9++] = Integer.MAX_VALUE;
                            class21.field249[var9++] = Integer.MAX_VALUE;
                            class21.field249[var9++] = Integer.MAX_VALUE;
                        }
                        while (var7 > var9) {
                            class21.field249[var9++] = Integer.MAX_VALUE;
                        }
                        class394.field5911 = 1;
                        for (int var10 = 0; var10 < class655.field9468; var10++) {
                            class367 var11 = class247.field3848[var10];
                            class282.method2310(var11.field5622[0], var11.field5613[3], var11.field5616[0], var11.field5613[0], -32280, var11.field5622[1], var11.field5616[1], var11.field5616[3], var11.field5613[1], var11.field5622[3]);
                            class282.method2310(var11.field5622[1], var11.field5613[3], var11.field5616[1], var11.field5613[1], -32280, var11.field5622[2], var11.field5616[2], var11.field5616[3], var11.field5613[2], var11.field5622[3]);
                        }
                        class394.field5911 = 2;
                    }
                    if (class21.field248) {
                        class506.field7334 = class371.field5648.method165((byte) 122) - class588.field8651;
                    }
                }
            } else {
                class655.field9468 = 0;
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field149[3] + arg0 + ',' + (arg1 == null ? field149[1] : field149[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(BI)I", line = 192)
    public static final int method83(byte arg0, int arg1) {
        try {
            if (arg0 != -1) {
                method83((byte) -86, -9);
            }
            int var4 = arg1 - 1;
            field144++;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            int var8 = var7 | var7 >>> 8;
            int var9 = var8 | var8 >>> 16;
            return var9 + 1;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field149[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)[Ldv;", line = 214)
    public static final class685[] method84(int arg0) {
        try {
            field145++;
            if (arg0 != 19814) {
                field142 = -9;
            }
            return new class685[] { class208.field3191, class166.field2288, class506.field7333, class758.field10999, class146.field1793, class460.field6716, class129.field1512, class248.field3873, class656.field9474, class353.field5445, class95.field1067, class599.field8808, class555.field8288, class224.field3426 };
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field149[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lda;)V", line = 253)
    public class12(class67 arg0) {
        try {
            this.field147 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field149[4] + (arg0 == null ? field149[1] : field149[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lda;Llq;)V", line = 260)
    public class12(class67 arg0, class578 arg1) {
        try {
            this.field147 = arg0;
            this.field140 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field149[4] + (arg0 == null ? field149[1] : field149[2]) + ',' + (arg1 == null ? field149[1] : field149[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "(I)V", line = 235)
    public static void method85(int arg0) {
        try {
            field146 = null;
            if (arg0 != 0) {
                field143 = 84;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field149[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!daa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method86(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!daa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method87(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 3;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 104;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 90;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
