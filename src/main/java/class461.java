import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class461 extends class459 {

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "Z")
    public boolean field7097 = true;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field7109 = new String[] { method3576(method3575("\u001c\u0013\u0019Ww")), method3576(method3575("\u0000O\u0019?\"")), method3576(method3575("\tH[\u0015")), method3576(method3575("\u0000O\u00193\"")), method3576(method3575("\u0000O\u00191\"")), method3576(method3575("\u0000O\u0019>\"")), method3576(method3575("\u0000O\u0019;\"")), method3576(method3575("\u0000O\u0019=\"")), method3576(method3575("\u0000O\u0019<\"")), method3576(method3575("\u0000O\u0019:\"")), method3576(method3575("I\u0013\u0019")), method3576(method3575("\u0000O\u00192\"")), method3576(method3575("\u0000O\u00190\"")), method3576(method3575("\u0000O\u00198\"")) };

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "Lat;")
    public static class398 field7104 = new class398();

    @OriginalMember(owner = "client!gr", name = "O", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!gr", name = "P", descriptor = "I")
    public static int field7091;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
    public static int field7092;

    @OriginalMember(owner = "client!gr", name = "M", descriptor = "I")
    public static int field7093;

    @OriginalMember(owner = "client!gr", name = "L", descriptor = "I")
    public static int field7095;

    @OriginalMember(owner = "client!gr", name = "K", descriptor = "I")
    public static int field7096;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!gr", name = "I", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "Lhk;")
    public static class107 field7107;

    @OriginalMember(owner = "client!gr", name = "N", descriptor = "Lsj;")
    public static class486 field7105;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "Lda;")
    public static class64 field7108;

    @OriginalMember(owner = "client!gr", name = "H", descriptor = "Lqt;")
    public class665 field7089;

    @OriginalMember(owner = "client!gr", name = "Q", descriptor = "[I")
    public int[] field7088;

    @OriginalMember(owner = "client!gr", name = "J", descriptor = "[I")
    private int[] field7094;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "[Ljava/lang/String;")
    private String[] field7102;

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field7106;

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "[[I")
    private int[][] field7101;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lwq;B)Ljava/lang/String;")
    public final String method3564(class176 arg0, byte arg1) {
        try {
            field7093++;
            StringBuffer var3 = new StringBuffer(80);
            if (this.field7094 != null) {
                for (int var4 = 0; var4 < this.field7094.length; var4++) {
                    var3.append(this.field7102[var4]);
                    var3.append(this.field7089.method4828(arg0.method1682(255, class454.method3529(this.field7094[var4], (byte) -78).field9126), false, this.method3574(true, var4), this.field7101[var4]));
                }
            }
            if (arg1 < 65) {
                this.method3564(null, (byte) 33);
            }
            var3.append(this.field7102[this.field7102.length - 1]);
            return var3.toString();
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7109[6] + (arg0 == null ? field7109[2] : field7109[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(I)Ljava/lang/String;")
    public final String method3565(int arg0) {
        try {
            field7098++;
            StringBuffer var2 = new StringBuffer(80);
            if (arg0 != 3855) {
                this.method3567((byte) 26);
            }
            if (this.field7102 == null) {
                return "";
            }
            var2.append(this.field7102[0]);
            for (int var3 = 1; var3 < this.field7102.length; var3++) {
                var2.append(field7109[10]);
                var2.append(this.field7102[var3]);
            }
            return var2.toString();
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7109[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BLwq;[I)V")
    public final void method3566(byte arg0, class176 arg1, int[] arg2) {
        try {
            field7092++;
            if (this.field7094 != null) {
                for (int var4 = 0; var4 < this.field7094.length && var4 < arg2.length; var4++) {
                    int var5 = this.method3574(true, var4).field9122;
                    if (var5 > 0) {
                        arg1.method1620((long) arg2[var4], var5, (byte) -18);
                    }
                }
                if (arg0 != -119) {
                    this.method3566((byte) -99, null, null);
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7109[7] + arg0 + ',' + (arg1 == null ? field7109[2] : field7109[0]) + ',' + (arg2 == null ? field7109[2] : field7109[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)I")
    public final int method3567(byte arg0) {
        try {
            field7091++;
            if (arg0 != -128) {
                this.method3564(null, (byte) 81);
            }
            return this.field7094 == null ? 0 : this.field7094.length;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7109[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BII)I")
    public final int method3568(byte arg0, int arg1, int arg2) {
        try {
            field7099++;
            if (this.field7094 == null || arg1 < 0 || this.field7094.length < arg1) {
                return -1;
            } else {
                if (arg0 < 11) {
                    this.method3572(null, -10, 69);
                }
                return this.field7101[arg1] == null || arg2 < 0 || arg2 > this.field7101[arg1].length ? -1 : this.field7101[arg1][arg2];
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7109[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method3569(int arg0, int arg1) {
        try {
            field7096++;
            class670 var2 = (class670) class700.field10071.method737((byte) -39, (long) arg0);
            if (var2 != null) {
                class337 var3 = var2.field9518.method3062((byte) -86);
                if (var3 != null) {
                    double var4 = var2.field9518.method3073(102);
                    if ((double) var3.method2838(-49) <= var4 && var4 <= (double) var3.method2843(2)) {
                        return var3.method2841(23);
                    }
                }
            }
            if (arg1 > -125) {
                field7105 = null;
            }
            return null;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7109[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lwq;Z)V")
    public final void method3570(class176 arg0, boolean arg1) {
        try {
            if (arg1) {
                this.method3567((byte) 2);
            }
            while (true) {
                int var3 = arg0.method1645((byte) -128);
                if (var3 == 0) {
                    field7103++;
                    return;
                }
                this.method3572(arg0, 97, var3);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7109[3] + (arg0 == null ? field7109[2] : field7109[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
    public final void method3571(int arg0) {
        try {
            field7090++;
            if (arg0 != -1) {
                this.method3564(null, (byte) 42);
            }
            if (this.field7088 != null) {
                for (int var2 = 0; var2 < this.field7088.length; var2++) {
                    this.field7088[var2] = class553.method4099(this.field7088[var2], 32768);
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7109[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lwq;II)V")
    private final void method3572(class176 arg0, int arg1, int arg2) {
        try {
            if (arg1 < 78) {
                field7105 = null;
            }
            if (arg2 == 1) {
                this.field7102 = class444.method3476('<', 11206, arg0.method1635((byte) 93));
            } else if (arg2 == 2) {
                int var4 = arg0.method1645((byte) -113);
                this.field7088 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field7088[var5] = arg0.method1687((byte) -96);
                }
            } else if (arg2 == 3) {
                int var6 = arg0.method1645((byte) -78);
                this.field7094 = new int[var6];
                this.field7101 = new int[var6][];
                for (int var7 = 0; var7 < var6; var7++) {
                    int var8 = arg0.method1687((byte) -56);
                    class636 var9 = class454.method3529(var8, (byte) -78);
                    if (var9 != null) {
                        this.field7094[var7] = var8;
                        this.field7101[var7] = new int[var9.field9127];
                        for (int var10 = 0; var10 < var9.field9127; var10++) {
                            this.field7101[var7][var10] = arg0.method1687((byte) -54);
                        }
                    }
                }
            } else if (arg2 == 4) {
                this.field7097 = false;
            }
            field7100++;
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field7109[1] + (arg0 == null ? field7109[2] : field7109[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "(I)V")
    public static void method3573(int arg0) {
        try {
            if (arg0 != -1) {
                field7106 = null;
            }
            field7105 = null;
            field7107 = null;
            field7104 = null;
            field7106 = null;
            field7108 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7109[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)Lpe;")
    public final class636 method3574(boolean arg0, int arg1) {
        try {
            if (!arg0) {
                this.field7088 = null;
            }
            field7095++;
            return this.field7094 == null || arg1 < 0 || arg1 > this.field7094.length ? null : class454.method3529(this.field7094[arg1], (byte) -78);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7109[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3575(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xA);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3576(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 103;
                    break;
                case 1:
                    var10005 = 61;
                    break;
                case 2:
                    var10005 = 55;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 10;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
