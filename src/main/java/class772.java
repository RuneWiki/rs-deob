import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class772 {

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    private int field11215 = -1;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Ljava/lang/String;")
    private String field11213 = "";

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    private int field11228 = -1;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public int field11214 = -1;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public int field11224 = 0;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    private int field11225 = -1;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public int field11220 = 0;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    private int field11217 = -1;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public int field11212 = -1;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public int field11219 = -1;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public int field11235 = 16777215;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public int field11233 = 70;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public int field11236 = 0;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field11237 = new String[] { method5600(method5599("PDx$B")), method5600(method5599("\u001d\u0011")), method5600(method5599("VU:\u000b")), method5600(method5599("C\u000exI\u0017")), method5600(method5599("PDx,B")), method5600(method5599("PDx/B")), method5600(method5599("PDx.B")), method5600(method5599("PDx-B")), method5600(method5599("PDx\"B")), method5600(method5599("PDx#B")), method5600(method5599("PDx%B")), method5600(method5599("PDx+B")), method5600(method5599("PDx&B")), method5600(method5599("PDx B")), method5600(method5599("PDx!B")) };

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "[I")
    public static int[] field11227 = new int[2];

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field11210;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field11211;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field11216;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field11218;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field11222;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field11223;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public static int field11226;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field11229;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field11230;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field11231;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field11232;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field11234;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Lmj;")
    public class680 field11221;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(ILha;)Lfs;", line = 7)
    public final class581 method5587(int arg0, class66 arg1) {
        try {
            int var3 = 8 / ((arg0 - 10) / 48);
            field11222++;
            if (this.field11225 < 0) {
                return null;
            }
            class581 var4 = (class581) this.field11221.field9854.method1558((byte) 96, (long) this.field11225);
            if (var4 == null) {
                this.method5592(25526, arg1);
                var4 = (class581) this.field11221.field9854.method1558((byte) 96, (long) this.field11225);
            }
            return var4;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field11237[10] + arg0 + ',' + (arg1 == null ? field11237[2] : field11237[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 31)
    public final String method5588(int arg0, byte arg1) {
        try {
            if (arg1 > -30) {
                return null;
            }
            field11232++;
            String var3 = this.field11213;
            while (true) {
                int var4 = var3.indexOf(field11237[1]);
                if (var4 < 0) {
                    return var3;
                }
                var3 = var3.substring(0, var4) + class377.method3039(arg0, false, 90) + var3.substring(var4 + 2);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field11237[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(JB)V", line = 59)
    public static final void method5589(long arg0, byte arg1) {
        try {
            if (arg1 == 120) {
                field11230++;
                try {
                    Thread.sleep(arg0);
                } catch (InterruptedException var4) {
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field11237[12] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILha;)Lfs;", line = 78)
    public final class581 method5590(int arg0, class66 arg1) {
        try {
            field11226++;
            if (~this.field11217 > arg0) {
                return null;
            }
            class581 var3 = (class581) this.field11221.field9854.method1558((byte) 96, (long) this.field11217);
            if (var3 == null) {
                this.method5592(arg0 + 25527, arg1);
                var3 = (class581) this.field11221.field9854.method1558((byte) 96, (long) this.field11217);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field11237[6] + arg0 + ',' + (arg1 == null ? field11237[2] : field11237[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZII)Ltf;", line = 98)
    public static final class310 method5591(boolean arg0, int arg1, int arg2) {
        try {
            field11218++;
            class614[] var3 = class504.field7310;
            synchronized (class504.field7310) {
                if (arg1 != 0) {
                    field11216 = -26;
                }
                class310 var4;
                if (class504.field7310.length <= arg2 || class504.field7310[arg2].method4542(0)) {
                    var4 = new class310();
                    var4.field4918 = new class359[arg2];
                    for (int var5 = 0; var5 < arg2; var5++) {
                        var4.field4918[var5] = new class359();
                    }
                } else {
                    var4 = (class310) class504.field7310[arg2].method4546((byte) 122);
                    var4.method4696(47);
                    int var10002 = class217.field3326[arg2]--;
                }
                var4.field4914 = arg0;
                return var4;
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field11237[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(ILha;)V", line = 146)
    private final void method5592(int arg0, class66 arg1) {
        try {
            field11231++;
            class476 var3 = this.field11221.field9853;
            if (this.field11225 >= 0 && this.field11221.field9854.method1558((byte) 96, (long) this.field11225) == null && var3.method3618(this.field11225, 96)) {
                class481 var4 = class481.method3669(var3, this.field11225);
                this.field11221.field9854.method1556((long) this.field11225, arg1.method487(var4, true), 1);
            }
            if (arg0 != 25526) {
                this.field11236 = -62;
            }
            if (this.field11217 >= 0 && this.field11221.field9854.method1558((byte) 96, (long) this.field11217) == null && var3.method3618(this.field11217, 62)) {
                class481 var5 = class481.method3669(var3, this.field11217);
                this.field11221.field9854.method1556((long) this.field11217, arg1.method487(var5, true), 1);
            }
            if (this.field11215 >= 0 && this.field11221.field9854.method1558((byte) 96, (long) this.field11215) == null && var3.method3618(this.field11215, 111)) {
                class481 var6 = class481.method3669(var3, this.field11215);
                this.field11221.field9854.method1556((long) this.field11215, arg1.method487(var6, true), 1);
            }
            if (this.field11228 >= 0 && this.field11221.field9854.method1558((byte) 96, (long) this.field11228) == null && var3.method3618(this.field11228, 105)) {
                class481 var7 = class481.method3669(var3, this.field11228);
                this.field11221.field9854.method1556((long) this.field11228, arg1.method487(var7, true), 1);
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field11237[5] + arg0 + ',' + (arg1 == null ? field11237[2] : field11237[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 211)
    public static void method5593(int arg0) {
        try {
            field11227 = null;
            if (arg0 >= -64) {
                field11216 = 108;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field11237[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBLib;)V", line = 221)
    private final void method5594(int arg0, byte arg1, class163 arg2) {
        try {
            field11229++;
            if (arg0 == 1) {
                this.field11219 = arg2.method1445((byte) 126);
            } else if (arg0 == 2) {
                this.field11235 = arg2.method1436((byte) 113);
            } else if (arg0 == 3) {
                this.field11225 = arg2.method1445((byte) 104);
            } else if (arg0 == 4) {
                this.field11215 = arg2.method1445((byte) 105);
            } else if (arg0 == 5) {
                this.field11217 = arg2.method1445((byte) 116);
            } else if (arg0 == 6) {
                this.field11228 = arg2.method1445((byte) 123);
            } else if (arg0 == 7) {
                this.field11236 = arg2.method1442(65280);
            } else if (arg0 == 8) {
                this.field11213 = arg2.method1399(-31376);
            } else if (arg0 == 9) {
                this.field11233 = arg2.method1445((byte) 126);
            } else if (arg0 == 10) {
                this.field11224 = arg2.method1442(65280);
            } else if (arg0 == 11) {
                this.field11212 = 0;
            } else if (arg0 == 12) {
                this.field11214 = arg2.method1455((byte) 62);
            } else if (arg0 == 13) {
                this.field11220 = arg2.method1442(65280);
            } else if (arg0 == 14) {
                this.field11212 = arg2.method1445((byte) 109);
            }
            int var4 = 43 / ((8 - arg1) / 34);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field11237[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field11237[2] : field11237[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLib;)V", line = 291)
    public final void method5595(byte arg0, class163 arg1) {
        try {
            if (arg0 == -125) {
                field11210++;
                while (true) {
                    int var3 = arg1.method1455((byte) 62);
                    if (var3 == 0) {
                        return;
                    }
                    this.method5594(var3, (byte) 51, arg1);
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field11237[13] + arg0 + ',' + (arg1 == null ? field11237[2] : field11237[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILla;I)Lju;", line = 326)
    public static final class137 method5596(int arg0, int arg1, class476 arg2, int arg3) {
        try {
            if (arg1 != 25329) {
                field11216 = 75;
            }
            field11211++;
            byte[] var4 = arg2.method3632(arg3, arg0, 7);
            return var4 == null ? null : new class137(var4);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field11237[11] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field11237[2] : field11237[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(ILha;)Lfs;", line = 346)
    public final class581 method5597(int arg0, class66 arg1) {
        try {
            field11234++;
            if (this.field11215 < 0) {
                return null;
            }
            if (arg0 != 28566) {
                this.field11215 = 42;
            }
            class581 var3 = (class581) this.field11221.field9854.method1558((byte) 96, (long) this.field11215);
            if (var3 == null) {
                this.method5592(25526, arg1);
                var3 = (class581) this.field11221.field9854.method1558((byte) 96, (long) this.field11215);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field11237[14] + arg0 + ',' + (arg1 == null ? field11237[2] : field11237[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lha;I)Lfs;", line = 376)
    public final class581 method5598(class66 arg0, int arg1) {
        try {
            field11223++;
            if (this.field11228 < 0) {
                return null;
            }
            class581 var3 = (class581) this.field11221.field9854.method1558((byte) 96, (long) this.field11228);
            if (arg1 != 14528) {
                this.field11212 = -58;
            }
            if (var3 == null) {
                this.method5592(arg1 ^ 0x5B76, arg0);
                var3 = (class581) this.field11221.field9854.method1558((byte) 96, (long) this.field11228);
            }
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field11237[9] + (arg0 == null ? field11237[2] : field11237[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5599(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5600(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 56;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 86;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 106;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
