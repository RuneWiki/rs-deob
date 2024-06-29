import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class709 {

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Z")
    public boolean field10276 = false;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10279 = new String[] { method5177(method5176("UL\u00111h")), method5177(method5176("J_S\u0018")), method5177(method5176("_\u0004\u0011Z=")), method5177(method5176("UL\u00110h")), method5177(method5176("UL\u00116h")), method5177(method5176("UL\u00115h")), method5177(method5176("UL\u00112h")), method5177(method5176("UL\u00117h")) };

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Lel;")
    public static class573 field10272 = new class573(37, 28);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "[I")
    public static int[] field10275 = new int[3];

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "[Lks;")
    public static class462[] field10273 = new class462[75];

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Z")
    public static boolean field10277 = false;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field10266;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field10267;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public int field10268;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field10269;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public int field10270;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field10274;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field10278;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Lnu;")
    public class618 field10271;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIZJ)V")
    public static final void method5170(int arg0, int arg1, boolean arg2, long arg3) {
        try {
            field10266++;
            if (arg2) {
                method5171((byte) -40);
            }
            int var5 = ((int) arg3 & 0x7DD48) >> 14;
            int var6 = (int) arg3 >> 20 & 0x3;
            int var7 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
            if (var5 == 10 || var5 == 11 || var5 == 22) {
                class198 var8 = class417.field6144.method3030(0, var7);
                int var9;
                int var10;
                if (var6 == 0 || var6 == 2) {
                    var9 = var8.field3093;
                    var10 = var8.field3087;
                } else {
                    var9 = var8.field3087;
                    var10 = var8.field3093;
                }
                int var11 = var8.field3066;
                if (var6 != 0) {
                    var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
                }
                class471.method3582(true, 0, arg0, 1, 0, arg1, var11, var9, var10);
            } else {
                class471.method3582(true, var6, arg0, 1, var5, arg1, 0, 0, 0);
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field10279[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public static void method5171(byte arg0) {
        try {
            field10273 = null;
            field10272 = null;
            if (arg0 != 39) {
                field10272 = null;
            }
            field10275 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10279[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lib;I)V")
    public final void method5172(class163 arg0, int arg1) {
        try {
            while (true) {
                int var3 = arg0.method1455((byte) 62);
                if (var3 == 0) {
                    field10269++;
                    if (arg1 != -4033) {
                        this.method5172(null, -47);
                        return;
                    }
                    return;
                }
                this.method5174(arg0, arg1 ^ 0xE9E3904C, var3);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10279[4] + (arg0 == null ? field10279[1] : field10279[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Z")
    public final boolean method5173(int arg0) {
        try {
            if (arg0 != 0) {
                method5170(6, 93, false, -17L);
            }
            field10267++;
            return this.field10271.field9088.method3618(this.field10268, arg0 ^ 0x6D);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10279[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lib;II)V")
    private final void method5174(class163 arg0, int arg1, int arg2) {
        try {
            field10274++;
            if (arg1 == 370958451) {
                if (arg2 == 1) {
                    this.field10268 = arg0.method1445((byte) 110);
                } else if (arg2 == 2) {
                    this.field10270 = arg0.method1436((byte) 92);
                } else if (arg2 == 3) {
                    this.field10276 = true;
                } else if (arg2 == 4) {
                    this.field10268 = -1;
                    return;
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10279[5] + (arg0 == null ? field10279[1] : field10279[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZIZLha;)Lfs;")
    public final class581 method5175(boolean arg0, int arg1, boolean arg2, class66 arg3) {
        try {
            field10278++;
            long var5 = (long) (arg3.field688 << 19 | this.field10268 | arg1 << 16 | (arg2 ? 262144 : 0));
            class581 var7 = (class581) this.field10271.field9090.method1558((byte) 96, var5);
            if (var7 != null) {
                return var7;
            } else if (this.field10271.field9088.method3618(this.field10268, 94)) {
                class481 var8 = class481.method3675(this.field10271.field9088, this.field10268, 0);
                if (var8 != null) {
                    var8.field6972 = var8.field6971 = var8.field6974 = var8.field6976 = 0;
                    if (arg2) {
                        var8.method3679();
                    }
                    for (int var9 = 0; var9 < arg1; var9++) {
                        var8.method3676();
                    }
                }
                class581 var10 = arg3.method487(var8, true);
                if (var10 != null) {
                    this.field10271.field9090.method1556(var5, var10, 1);
                }
                if (arg0) {
                    this.field10276 = false;
                }
                return var10;
            } else {
                return null;
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field10279[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field10279[1] : field10279[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5176(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5177(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 36;
                    break;
                case 1:
                    var10005 = 42;
                    break;
                case 2:
                    var10005 = 63;
                    break;
                case 3:
                    var10005 = 116;
                    break;
                default:
                    var10005 = 64;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
