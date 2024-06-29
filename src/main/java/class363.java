import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public class class363 extends class46 {

    @OriginalMember(owner = "client!ija", name = "t", descriptor = "I")
    public int field5555 = 0;

    @OriginalMember(owner = "client!ija", name = "F", descriptor = "I")
    public int field5557 = -1;

    @OriginalMember(owner = "client!ija", name = "s", descriptor = "I")
    public int field5560 = -1;

    @OriginalMember(owner = "client!ija", name = "y", descriptor = "I")
    public int field5562 = 12800;

    @OriginalMember(owner = "client!ija", name = "C", descriptor = "I")
    public int field5565 = 12800;

    @OriginalMember(owner = "client!ija", name = "v", descriptor = "Z")
    public boolean field5569 = true;

    @OriginalMember(owner = "client!ija", name = "w", descriptor = "I")
    public int field5559 = 0;

    @OriginalMember(owner = "client!ija", name = "A", descriptor = "I")
    public int field5554;

    @OriginalMember(owner = "client!ija", name = "I", descriptor = "Ljava/lang/String;")
    public String field5558;

    @OriginalMember(owner = "client!ija", name = "H", descriptor = "Ljava/lang/String;")
    public String field5553;

    @OriginalMember(owner = "client!ija", name = "x", descriptor = "I")
    public int field5561;

    @OriginalMember(owner = "client!ija", name = "B", descriptor = "Lef;")
    public class513 field5563;

    @OriginalMember(owner = "client!ija", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field5570 = new String[] { method2950(method2949("]G[6h")), method2950(method2949("O\u0003\u00146)O\u0007\u001cl+\u000e")), method2950(method2949("H\u001c\u0019t")), method2950(method2949("O\u0003\u00146\\\u000e")), method2950(method2949("O\u0003\u00146S\u000e")), method2950(method2949("O\u0003\u00146]\u000e")), method2950(method2949("O\u0003\u00146_\u000e")), method2950(method2949("O\u0003\u00146R\u000e")) };

    @OriginalMember(owner = "client!ija", name = "D", descriptor = "J")
    public static long field5567 = -1L;

    @OriginalMember(owner = "client!ija", name = "r", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!ija", name = "z", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!ija", name = "E", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!ija", name = "u", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!ija", name = "G", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(I)V")
    public final void method2944(int arg0) {
        try {
            field5552++;
            this.field5559 = 0;
            this.field5565 = 12800;
            this.field5562 = 12800;
            if (arg0 <= -103) {
                this.field5555 = 0;
                for (class448 var2 = (class448) this.field5563.method3863((byte) 64); var2 != null; var2 = (class448) this.field5563.method3862(-353)) {
                    if (var2.field6586 > this.field5559) {
                        this.field5559 = var2.field6586;
                    }
                    if (this.field5555 < var2.field6589) {
                        this.field5555 = var2.field6589;
                    }
                    if (this.field5562 > var2.field6579) {
                        this.field5562 = var2.field6579;
                    }
                    if (this.field5565 > var2.field6592) {
                        this.field5565 = var2.field6592;
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5570[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(III)Z")
    public final boolean method2945(int arg0, int arg1, int arg2) {
        try {
            field5556++;
            if (arg2 != 12800) {
                this.field5559 = -43;
            }
            for (class448 var4 = (class448) this.field5563.method3863((byte) 64); var4 != null; var4 = (class448) this.field5563.method3862(-353)) {
                if (var4.method3452(arg1, arg0, -9626)) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5570[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(III[II)Z")
    public final boolean method2946(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        try {
            field5568++;
            for (class448 var6 = (class448) this.field5563.method3863((byte) 64); var6 != null; var6 = (class448) this.field5563.method3862(-353)) {
                if (var6.method3451(arg0, (byte) -82, arg4, arg2)) {
                    var6.method3448((byte) 92, arg4, arg3, arg2);
                    return true;
                }
            }
            if (arg1 != -1) {
                field5567 = 83L;
            }
            return false;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field5570[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field5570[2] : field5570[0]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ija", name = "b", descriptor = "(II[II)Z")
    public final boolean method2947(int arg0, int arg1, int[] arg2, int arg3) {
        try {
            field5566++;
            if (arg3 != 255) {
                this.field5565 = -121;
            }
            for (class448 var5 = (class448) this.field5563.method3863((byte) 64); var5 != null; var5 = (class448) this.field5563.method3862(-353)) {
                if (var5.method3447(arg0, arg1, (byte) -122)) {
                    var5.method3449(arg1, 2, arg0, arg2);
                    return true;
                }
            }
            return false;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5570[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5570[2] : field5570[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ija", name = "a", descriptor = "(II[II)Z")
    public final boolean method2948(int arg0, int arg1, int[] arg2, int arg3) {
        try {
            field5564++;
            for (class448 var5 = (class448) this.field5563.method3863((byte) 64); var5 != null; var5 = (class448) this.field5563.method3862(-353)) {
                if (var5.method3452(arg0, arg3, -9626)) {
                    var5.method3448((byte) 92, arg3, arg2, arg0);
                    return true;
                }
            }
            int var6 = -85 % ((70 - arg1) / 48);
            return false;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field5570[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5570[2] : field5570[0]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class363(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        try {
            this.field5560 = arg4;
            this.field5554 = arg0;
            this.field5558 = arg2;
            this.field5569 = arg5;
            this.field5553 = arg1;
            this.field5557 = arg6;
            this.field5561 = arg3;
            if (this.field5557 == 255) {
                this.field5557 = 0;
            }
            this.field5563 = new class513();
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field5570[1] + arg0 + ',' + (arg1 == null ? field5570[2] : field5570[0]) + ',' + (arg2 == null ? field5570[2] : field5570[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ija", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2949(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ija", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2950(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 38;
                    break;
                case 1:
                    var10005 = 105;
                    break;
                case 2:
                    var10005 = 117;
                    break;
                case 3:
                    var10005 = 24;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
