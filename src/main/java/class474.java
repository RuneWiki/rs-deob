import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class474 implements class556 {

    @OriginalMember(owner = "client!jea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6884 = new String[] { method3605(method3604("O~<#x\r")), method3605(method3604("^5s#D")), method3605(method3604("Kn1a")), method3605(method3604("O~<#}\r")), method3605(method3604("O~<#|\r")), method3605(method3604("O~<#{\r")), method3605(method3604("O~<#\u007f\r")), method3605(method3604("O~<#z\r")) };

    @OriginalMember(owner = "client!jea", name = "l", descriptor = "Lel;")
    public static class573 field6878;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!jea", name = "j", descriptor = "I")
    public int field6870;

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!jea", name = "n", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!jea", name = "o", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
    public int field6875;

    @OriginalMember(owner = "client!jea", name = "m", descriptor = "I")
    public int field6876;

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "I")
    public int field6879;

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "I")
    public int field6880;

    @OriginalMember(owner = "client!jea", name = "k", descriptor = "I")
    public int field6881;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "I")
    public static int field6883;

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "Z")
    public boolean field6873;

    static {
        new class550("", 76);
        field6878 = new class573(60, 2);
        field6882 = -1;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)J", line = 9)
    public final long method3598(int arg0) {
        try {
            field6869++;
            long[] var2 = class143.field1722;
            long var3 = -1L;
            long var5 = var2[(int) (((long) this.field6875 ^ var3) & 0xFFL)] ^ var3 >>> 8;
            long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field6876 >> 8)) & 0xFFL)];
            long var9 = var2[(int) ((var7 ^ (long) this.field6876) & 0xFFL)] ^ var7 >>> 8;
            long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field6881 >> 24) ^ var9) & 0xFFL)];
            long var13 = var2[(int) (((long) (this.field6881 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var15 = var2[(int) ((var13 ^ (long) (this.field6881 >> 8)) & 0xFFL)] ^ var13 >>> 8;
            long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field6881 ^ var15) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field6880) & 0xFFL)];
            long var21 = var2[(int) ((var19 ^ (long) (this.field6870 >> 24)) & 0xFFL)] ^ var19 >>> 8;
            long var23 = var2[(int) ((var21 ^ (long) (this.field6870 >> 16)) & 0xFFL)] ^ var21 >>> 8;
            if (arg0 >= -22) {
                method3599(-17);
            }
            long var25 = var2[(int) (((long) (this.field6870 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
            long var27 = var2[(int) (((long) this.field6870 ^ var25) & 0xFFL)] ^ var25 >>> 8;
            long var29 = var27 >>> 8 ^ var2[(int) ((var27 ^ (long) this.field6879) & 0xFFL)];
            return var29 >>> 8 ^ var2[(int) (((long) (this.field6873 ? 1 : 0) ^ var29) & 0xFFL)];
        } catch (RuntimeException var34) {
            throw class759.method5498(var34, field6884[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)I", line = 41)
    public static final int method3599(int arg0) {
        try {
            field6871++;
            if (arg0 != -23166) {
                field6882 = -94;
            }
            return class739.field10739;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6884[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILpt;)Z", line = 58)
    public final boolean method3600(int arg0, class556 arg1) {
        try {
            field6872++;
            if (!(arg1 instanceof class474)) {
                return false;
            }
            class474 var3 = (class474) arg1;
            if (this.field6875 != var3.field6875) {
                return false;
            } else if (this.field6876 != var3.field6876) {
                return false;
            } else if (this.field6881 != var3.field6881) {
                return false;
            } else if (this.field6880 != var3.field6880) {
                return false;
            } else if (this.field6870 == var3.field6870) {
                if (arg0 > -1) {
                    method3599(-72);
                }
                if (this.field6879 == var3.field6879) {
                    return this.field6873 == var3.field6873;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6884[0] + arg0 + ',' + (arg1 == null ? field6884[2] : field6884[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)V", line = 100)
    public static void method3601(int arg0) {
        try {
            field6878 = null;
            if (arg0 >= -64) {
                field6878 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6884[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)V", line = 110)
    public static final void method3602(int arg0, int arg1) {
        try {
            class639.field9287 = new int[arg1];
            class49.field556 = new int[arg1];
            field6883++;
            if (arg0 != 1) {
                field6878 = null;
            }
            class152.field1872 = new int[arg1];
            class334.field5223 = new int[arg1];
            class248.field3875 = new int[arg1];
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6884[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIIIII)Z", line = 125)
    public static final boolean method3603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field6877++;
            for (int var6 = arg5; var6 <= arg3; var6++) {
                for (int var7 = arg4; var7 <= arg2; var7++) {
                    if (class91.field1045[var6][var7] == arg1 && class686.field9951[var6][var7] <= 1) {
                        return true;
                    }
                }
            }
            if (arg0 == 1) {
                return false;
            } else {
                return true;
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field6884[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3604(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3605(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 37;
                    break;
                case 1:
                    var10005 = 27;
                    break;
                case 2:
                    var10005 = 93;
                    break;
                case 3:
                    var10005 = 13;
                    break;
                default:
                    var10005 = 57;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
