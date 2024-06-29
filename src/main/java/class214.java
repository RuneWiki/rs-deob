import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class214 {

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "Leba;")
    public class614 field3269 = new class614();

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "Z")
    public boolean field3271 = false;

    @OriginalMember(owner = "client!tw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3272 = new String[] { method1877(method1876("i\u001b$AN")), method1877(method1876("|@f\u0003")), method1877(method1876("fB$+\u001b")), method1877(method1876("fB$,\u001b")), method1877(method1876("fB$-\u001b")), method1877(method1876("fB$SZ|\\~Q\u001b")), method1877(method1876("fB$.\u001b")) };

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "[Z")
    public static boolean[] field3265 = new boolean[100];

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "Lla;")
    public static class476 field3266;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(ILtf;)V", line = 11)
    public final void method1872(int arg0, class310 arg1) {
        try {
            field3268++;
            class420 var3 = arg1.field4915;
            boolean var4 = true;
            class359[] var5 = arg1.field4918;
            int var6 = 0;
            if (arg0 == 24082) {
                while (var5.length > var6) {
                    if (var5[var6].field5492) {
                        var4 = false;
                        break;
                    }
                    var6++;
                }
                if (!var4) {
                    if (this.field3271) {
                        for (class310 var7 = (class310) this.field3269.method4538(false); var7 != null; var7 = (class310) this.field3269.method4543(0)) {
                            if (var7.field4915 == var3) {
                                var7.method4696(-98);
                                class79.method692(var7, 0);
                            }
                        }
                    }
                    for (class310 var8 = (class310) this.field3269.method4538(false); var8 != null; var8 = (class310) this.field3269.method4543(0)) {
                        if (var3.field6208 >= var8.field4915.field6208) {
                            class280.method2296(arg1, var8, false);
                            return;
                        }
                    }
                    this.field3269.method4541((byte) -122, arg1);
                }
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field3272[4] + arg0 + ',' + (arg1 == null ? field3272[1] : field3272[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)I", line = 79)
    public static final int method1873(byte arg0, String arg1, int arg2, String arg3) {
        try {
            field3267++;
            int var4 = arg1.length();
            int var5 = arg3.length();
            int var6 = 0;
            int var7 = 0;
            char var8 = 0;
            char var9 = 0;
            while (var4 > (var6 - var8) || (var7 - var9) < var5) {
                if (var4 <= (var6 - var8)) {
                    return -1;
                }
                if (var5 <= (var7 - var9)) {
                    return 1;
                }
                char var10;
                if (var8 == '\u0000') {
                    var10 = arg1.charAt(var6++);
                } else {
                    var10 = var8;
                    boolean var11 = false;
                }
                char var12;
                if (var9 == '\u0000') {
                    var12 = arg3.charAt(var7++);
                } else {
                    var12 = var9;
                    boolean var13 = false;
                }
                var8 = class98.method818(-761, var10);
                var9 = class98.method818(-761, var12);
                char var14 = class187.method1626((byte) 116, var10, arg2);
                char var15 = class187.method1626((byte) 119, var12, arg2);
                if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                    char var16 = Character.toLowerCase(var14);
                    char var17 = Character.toLowerCase(var15);
                    if (var16 != var17) {
                        return class366.method2964(var16, false, arg2) - class366.method2964(var17, false, arg2);
                    }
                }
            }
            int var18 = 35 % ((7 - arg0) / 52);
            int var19 = Math.min(var4, var5);
            for (int var20 = 0; var20 < var19; var20++) {
                int var21;
                int var22;
                if (arg2 == 2) {
                    var21 = var5 - var20 - 1;
                    var22 = var4 - var20 - 1;
                } else {
                    var21 = var20;
                    var22 = var20;
                }
                char var23 = arg1.charAt(var22);
                char var24 = arg3.charAt(var21);
                if (var23 != var24 && Character.toUpperCase(var23) != Character.toUpperCase(var24)) {
                    char var25 = Character.toLowerCase(var23);
                    char var26 = Character.toLowerCase(var24);
                    if (var25 != var26) {
                        return class366.method2964(var25, false, arg2) - class366.method2964(var26, false, arg2);
                    }
                }
            }
            int var27 = var4 - var5;
            if (var27 != 0) {
                return var27;
            }
            for (int var28 = 0; var28 < var19; var28++) {
                char var29 = arg1.charAt(var28);
                char var30 = arg3.charAt(var28);
                if (var29 != var30) {
                    return class366.method2964(var29, false, arg2) - class366.method2964(var30, false, arg2);
                }
            }
            return 0;
        } catch (RuntimeException var32) {
            throw class759.method5498(var32, field3272[2] + arg0 + ',' + (arg1 == null ? field3272[1] : field3272[0]) + ',' + arg2 + ',' + (arg3 == null ? field3272[1] : field3272[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V", line = 203)
    public final void method1874(int arg0) {
        try {
            field3270++;
            while (true) {
                class310 var2 = (class310) this.field3269.method4545((byte) -80);
                if (var2 == null) {
                    if (arg0 == 27105) {
                        return;
                    } else {
                        this.field3271 = false;
                        return;
                    }
                }
                var2.method4696(-118);
                class79.method692(var2, 0);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3272[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Z)V", line = 244)
    public class214(boolean arg0) {
        try {
            this.field3271 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3272[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)V", line = 234)
    public static void method1875(byte arg0) {
        try {
            field3266 = null;
            field3265 = null;
            if (arg0 != -24) {
                field3265 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3272[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1876(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x33);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1877(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 18;
                    break;
                case 1:
                    var10005 = 53;
                    break;
                case 2:
                    var10005 = 10;
                    break;
                case 3:
                    var10005 = 111;
                    break;
                default:
                    var10005 = 51;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
