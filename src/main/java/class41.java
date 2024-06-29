import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class41 extends class46 {

    @OriginalMember(owner = "client!be", name = "w", descriptor = "Z")
    public boolean field479 = true;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field496 = new String[] { method288(method287("k'>--")), method288(method287("rl>Kx")), method288(method287("g7|\t")), method288(method287("k'>(-")), method288(method287("k'>5-")), method288(method287("k'>/-")), method288(method287("k'>*-")), method288(method287("k'>)-")), method288(method287("'l>")), method288(method287("k'>,-")), method288(method287("k'>\"-")), method288(method287("k'>+-")), method288(method287("k'>.-")) };

    @OriginalMember(owner = "client!be", name = "v", descriptor = "Llk;")
    public static class613 field494 = new class613();

    @OriginalMember(owner = "client!be", name = "u", descriptor = "[Lkl;")
    public static class87[] field495 = new class87[14];

    @OriginalMember(owner = "client!be", name = "C", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "Log;")
    public class674 field483;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Ljava/applet/Applet;")
    public static Applet field486;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "[I")
    public int[] field478;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "[I")
    private int[] field480;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field491;

    @OriginalMember(owner = "client!be", name = "G", descriptor = "[[I")
    private int[][] field482;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lib;I)Ljava/lang/String;")
    public final String method276(class163 arg0, int arg1) {
        try {
            field485++;
            StringBuffer var3 = new StringBuffer(80);
            if (this.field480 != null) {
                for (int var4 = 0; var4 < this.field480.length; var4++) {
                    var3.append(this.field491[var4]);
                    var3.append(this.field483.method4952(-114, this.method286(false, var4), arg0.method1427(2, class480.method3663(this.field480[var4], (byte) -118).field9934), this.field482[var4]));
                }
            }
            var3.append(this.field491[this.field491.length - 1]);
            if (arg1 > -63) {
                this.field479 = false;
            }
            return var3.toString();
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field496[10] + (arg0 == null ? field496[2] : field496[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method277(int arg0) {
        try {
            int var1 = 15 % ((9 - arg0) / 50);
            field494 = null;
            field486 = null;
            field495 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field496[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)Ljava/lang/String;")
    public final String method278(int arg0) {
        try {
            field481++;
            StringBuffer var2 = new StringBuffer(arg0);
            if (this.field491 == null) {
                return "";
            }
            var2.append(this.field491[0]);
            for (int var3 = 1; var3 < this.field491.length; var3++) {
                var2.append(field496[8]);
                var2.append(this.field491[var3]);
            }
            return var2.toString();
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field496[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lib;BI)V")
    private final void method279(class163 arg0, byte arg1, int arg2) {
        try {
            if (arg1 > 47) {
                if (arg2 == 1) {
                    this.field491 = class350.method2878(arg0.method1423(-22), '<', (byte) 114);
                } else if (arg2 == 2) {
                    int var9 = arg0.method1455((byte) 62);
                    this.field478 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        this.field478[var10] = arg0.method1445((byte) 111);
                    }
                } else if (arg2 == 3) {
                    int var4 = arg0.method1455((byte) 62);
                    this.field482 = new int[var4][];
                    this.field480 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        int var6 = arg0.method1445((byte) 106);
                        class685 var7 = class480.method3663(var6, (byte) -101);
                        if (var7 != null) {
                            this.field480[var5] = var6;
                            this.field482[var5] = new int[var7.field9941];
                            for (int var8 = 0; var8 < var7.field9941; var8++) {
                                this.field482[var5][var8] = arg0.method1445((byte) 113);
                            }
                        }
                    }
                } else if (arg2 == 4) {
                    this.field479 = false;
                }
                field487++;
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field496[5] + (arg0 == null ? field496[2] : field496[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BII)I")
    public final int method280(byte arg0, int arg1, int arg2) {
        try {
            field493++;
            if (this.field480 == null || arg2 < 0 || this.field480.length < arg2) {
                return -1;
            } else {
                int var4 = -91 / ((57 - arg0) / 52);
                return this.field482[arg2] == null || arg1 < 0 || this.field482[arg2].length < arg1 ? -1 : this.field482[arg2][arg1];
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field496[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([ILib;B)V")
    public final void method281(int[] arg0, class163 arg1, byte arg2) {
        try {
            field484++;
            if (this.field480 != null) {
                if (arg2 != -11) {
                    this.field479 = false;
                }
                for (int var4 = 0; var4 < this.field480.length; var4++) {
                    if (arg0.length <= var4) {
                        return;
                    }
                    int var5 = this.method286(false, var4).field9936;
                    if (var5 > 0) {
                        arg1.method1433((long) arg0[var4], 91, var5);
                    }
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field496[0] + (arg0 == null ? field496[2] : field496[1]) + ',' + (arg1 == null ? field496[2] : field496[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(B)V")
    public final void method282(byte arg0) {
        try {
            if (this.field478 != null) {
                for (int var2 = 0; var2 < this.field478.length; var2++) {
                    this.field478[var2] = class544.method4107(this.field478[var2], 32768);
                }
            }
            int var3 = -20 / ((arg0 + 29) / 63);
            field489++;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field496[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()V")
    public static final void method283() {
        class519.method3949(1, class501.field7246);
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(B)I")
    public final int method284(byte arg0) {
        try {
            field488++;
            if (arg0 == 90) {
                return this.field480 == null ? 0 : this.field480.length;
            } else {
                return -13;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field496[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lib;Z)V")
    public final void method285(class163 arg0, boolean arg1) {
        try {
            if (arg1) {
                this.field483 = null;
            }
            field490++;
            while (true) {
                int var3 = arg0.method1455((byte) 62);
                if (var3 == 0) {
                    return;
                }
                this.method279(arg0, (byte) 92, var3);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field496[12] + (arg0 == null ? field496[2] : field496[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)Ldv;")
    public final class685 method286(boolean arg0, int arg1) {
        try {
            field492++;
            if (arg0) {
                this.field482 = null;
            }
            return this.field480 == null || arg1 < 0 || this.field480.length < arg1 ? null : class480.method3663(this.field480[arg1], (byte) -67);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field496[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!be", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method287(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!be", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method288(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 9;
                    break;
                case 1:
                    var10005 = 66;
                    break;
                case 2:
                    var10005 = 16;
                    break;
                case 3:
                    var10005 = 101;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
