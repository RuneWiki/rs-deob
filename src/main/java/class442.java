import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class442 {

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    private int field6899 = 0;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    private int field6898 = -1;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Lat;")
    private class398 field6896 = new class398();

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Z")
    public boolean field6907 = false;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    private int field6903;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    private int field6900;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "[[I")
    private int[][] field6892;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "[Lbm;")
    private class120[] field6901;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6908 = new String[] { method3470(method3469("EG\\S?")), method3470(method3469("k@\u001c5xFM\u000b5eMU\u0000|r^DRt7NT\u001ey7AL\u0013rr\bB\u0013v\u007fM")), method3470(method3469("EG\\Q?")), method3470(method3469("EG\\P?")), method3470(method3469("S\u000f\\;j")), method3470(method3469("FT\u001ey")), method3470(method3469("EG\\R?")), method3470(method3469("FR\u001c$")), method3470(method3469("FR\u001c%")), method3470(method3469("FR\u001c&")), method3470(method3469("FR\u001c'")), method3470(method3469("EG\\W?")), method3470(method3469("EG\\T?")), method3470(method3469("EG\\V?")), method3470(method3469("EG\\)~FH\u0006+?")) };

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field6893 = "";

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field6902;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V", line = 8)
    public static void method3462(int arg0) {
        try {
            field6893 = null;
            if (arg0 <= 52) {
                field6893 = null;
            }
            field6902 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6908[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 19)
    public final void method3463(byte arg0) {
        try {
            if (arg0 >= 42) {
                for (int var2 = 0; var2 < this.field6903; var2++) {
                    this.field6892[var2] = null;
                }
                field6897++;
                this.field6892 = null;
                this.field6901 = null;
                this.field6896.method3224(false);
                this.field6896 = null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6908[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lrv;I)V", line = 43)
    public static final void method3464(class117 arg0, int arg1) {
        try {
            field6894++;
            int var2 = 0;
            arg0.method1156(-127);
            for (int var3 = 0; var3 < class691.field9962; var3++) {
                int var4 = class239.field3685[var3];
                if ((class424.field6682[var4] & 0x1) == 0) {
                    if (var2 > 0) {
                        class424.field6682[var4] = (byte) class553.method4099(class424.field6682[var4], 2);
                        var2--;
                    } else {
                        int var5 = arg0.method1163(1, 58);
                        if (var5 == 0) {
                            var2 = class553.method4096(arg0, 47);
                            class424.field6682[var4] = (byte) class553.method4099(class424.field6682[var4], 2);
                        } else {
                            class514.method3857(var4, (byte) -46, arg0);
                        }
                    }
                }
            }
            arg0.method1160(7);
            if (var2 != 0) {
                throw new RuntimeException(field6908[8]);
            }
            arg0.method1156(-124);
            for (int var6 = 0; var6 < class691.field9962; var6++) {
                int var7 = class239.field3685[var6];
                if ((class424.field6682[var7] & 0x1) != 0) {
                    if (var2 > 0) {
                        class424.field6682[var7] = (byte) class553.method4099(class424.field6682[var7], 2);
                        var2--;
                    } else {
                        int var8 = arg0.method1163(1, -104);
                        if (var8 == 0) {
                            var2 = class553.method4096(arg0, -117);
                            class424.field6682[var7] = (byte) class553.method4099(class424.field6682[var7], 2);
                        } else {
                            class514.method3857(var7, (byte) -46, arg0);
                        }
                    }
                }
            }
            arg0.method1160(7);
            if (var2 != 0) {
                throw new RuntimeException(field6908[7]);
            }
            arg0.method1156(-122);
            for (int var9 = 0; var9 < class378.field6108; var9++) {
                int var10 = class732.field10723[var9];
                if ((class424.field6682[var10] & 0x1) != 0) {
                    if (var2 > 0) {
                        class424.field6682[var10] = (byte) class553.method4099(class424.field6682[var10], 2);
                        var2--;
                    } else {
                        int var11 = arg0.method1163(1, 30);
                        if (var11 == 0) {
                            var2 = class553.method4096(arg0, 35);
                            class424.field6682[var10] = (byte) class553.method4099(class424.field6682[var10], 2);
                        } else if (class760.method5492(var10, arg0, -78)) {
                            class424.field6682[var10] = (byte) class553.method4099(class424.field6682[var10], 2);
                        }
                    }
                }
            }
            arg0.method1160(7);
            if (var2 != 0) {
                throw new RuntimeException(field6908[10]);
            }
            arg0.method1156(-128);
            for (int var12 = 0; var12 < class378.field6108; var12++) {
                int var13 = class732.field10723[var12];
                if ((class424.field6682[var13] & 0x1) == 0) {
                    if (var2 > 0) {
                        class424.field6682[var13] = (byte) class553.method4099(class424.field6682[var13], 2);
                        var2--;
                    } else {
                        int var14 = arg0.method1163(1, 117);
                        if (var14 == 0) {
                            var2 = class553.method4096(arg0, -118);
                            class424.field6682[var13] = (byte) class553.method4099(class424.field6682[var13], 2);
                        } else if (class760.method5492(var13, arg0, -71)) {
                            class424.field6682[var13] = (byte) class553.method4099(class424.field6682[var13], 2);
                        }
                    }
                }
            }
            arg0.method1160(7);
            if (var2 != 0) {
                throw new RuntimeException(field6908[9]);
            }
            class691.field9962 = 0;
            class378.field6108 = 0;
            int var15 = 1;
            if (arg1 >= -23) {
                field6893 = null;
            }
            while (var15 < 2048) {
                class424.field6682[var15] = (byte) (class424.field6682[var15] >> 1);
                class738 var16 = class33.field395[var15];
                if (var16 == null) {
                    class732.field10723[class378.field6108++] = var15;
                } else {
                    class239.field3685[class691.field9962++] = var15;
                }
                var15++;
            }
        } catch (RuntimeException var18) {
            throw class590.method4333(var18, field6908[11] + (arg0 == null ? field6908[5] : field6908[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)[[I", line = 247)
    public final int[][] method3465(int arg0) {
        try {
            field6905++;
            if (this.field6903 != this.field6900) {
                throw new RuntimeException(field6908[1]);
            }
            for (int var2 = arg0; var2 < this.field6903; var2++) {
                this.field6901[var2] = class26.field286;
            }
            return this.field6892;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6908[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLjava/lang/String;IZLjava/lang/String;)V", line = 265)
    public static final void method3466(boolean arg0, String arg1, int arg2, boolean arg3, String arg4) {
        try {
            field6893 = arg1;
            if (!arg0) {
                class222.field3490 = -1;
            }
            field6906++;
            class327.field5371 = arg3;
            class374.field6060 = arg0;
            class89.field1328 = arg4;
            if (!class374.field6060 && (class89.field1328.equals("") || field6893.equals(""))) {
                class252.method2140(3, -128);
            } else {
                if (class193.field3048 != 1) {
                    class293.field4705 = 0;
                    class539.field7917 = -1;
                }
                class683.field9892.field2669 = false;
                class252.method2140(-3, -128);
                class68.field965 = 0;
                if (arg2 != 2116) {
                    method3468((byte) 59, 0);
                }
                class570.field8270 = 0;
                class9.field104 = 1;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6908[6] + arg0 + ',' + (arg1 == null ? field6908[5] : field6908[4]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field6908[5] : field6908[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IB)[I", line = 301)
    public final int[] method3467(int arg0, byte arg1) {
        try {
            field6904++;
            if (arg1 != -61) {
                this.field6896 = null;
            }
            if (this.field6903 == this.field6900) {
                this.field6907 = this.field6901[arg0] == null;
                this.field6901[arg0] = class26.field286;
                return this.field6892[arg0];
            } else if (this.field6903 == 1) {
                this.field6907 = this.field6898 != arg0;
                this.field6898 = arg0;
                return this.field6892[0];
            } else {
                class120 var3 = this.field6901[arg0];
                if (var3 == null) {
                    this.field6907 = true;
                    if (this.field6903 <= this.field6899) {
                        class120 var4 = (class120) this.field6896.method3229(0);
                        var3 = new class120(arg0, var4.field1730);
                        this.field6901[var4.field1731] = null;
                        var4.method4173(-1);
                    } else {
                        var3 = new class120(arg0, this.field6899);
                        this.field6899++;
                    }
                    this.field6901[arg0] = var3;
                } else {
                    this.field6907 = false;
                }
                this.field6896.method3221(var3, (byte) 87);
                return this.field6892[var3.field1730];
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6908[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)Lsm;", line = 373)
    public static final class297 method3468(byte arg0, int arg1) {
        try {
            field6895++;
            class297 var2 = (class297) class299.field4853.method302(-116, (long) arg1);
            if (arg0 < 17) {
                method3464(null, -70);
            }
            if (var2 != null) {
                return var2;
            }
            byte[] var3 = class540.field7958.method604((byte) 48, arg1, 0);
            class297 var4 = new class297();
            if (var3 != null) {
                var4.method2561(4, new class176(var3), arg1);
            }
            class299.field4853.method295(false, (long) arg1, var4);
            return var4;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6908[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(III)V", line = 419)
    public class442(int arg0, int arg1, int arg2) {
        try {
            this.field6903 = arg0;
            this.field6900 = arg1;
            this.field6892 = new int[this.field6903][arg2];
            this.field6901 = new class120[this.field6900];
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6908[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3469(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3470(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 40;
                    break;
                case 1:
                    var10005 = 33;
                    break;
                case 2:
                    var10005 = 114;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 23;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
