import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class421 {

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "[I")
    private int[] field6643 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!jba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6655 = new String[] { method3354(method3353("`Nkv&\"")), method3354(method3353("q\u0002$v\u001d")), method3354(method3353("dYf4")), method3354(method3353("`Nkv#\"")), method3354(method3353("`Nkv\"\"")), method3354(method3353("`Nkv%\"")), method3354(method3353("`Nkv!\"")), method3354(method3353("`Nkv$\"")) };

    @OriginalMember(owner = "client!jba", name = "n", descriptor = "I")
    public static int field6647 = 0;

    @OriginalMember(owner = "client!jba", name = "h", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!jba", name = "g", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!jba", name = "k", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
    public static int field6652;

    @OriginalMember(owner = "client!jba", name = "l", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!jba", name = "m", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!jba", name = "j", descriptor = "Lps;")
    public class101 field6642;

    @OriginalMember(owner = "client!jba", name = "i", descriptor = "[I")
    private int[] field6650;

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "[S")
    private short[] field6641;

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "[S")
    private short[] field6646;

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "[S")
    private short[] field6648;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "[S")
    private short[] field6651;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)Lkc;", line = 3)
    public final class141 method3347(int arg0) {
        try {
            field6653++;
            if (this.field6650 == null) {
                return null;
            }
            class141[] var2 = new class141[this.field6650.length];
            class58 var3 = this.field6642.field1480;
            synchronized (this.field6642.field1480) {
                int var4 = 0;
                while (true) {
                    if (this.field6650.length <= var4) {
                        break;
                    }
                    var2[var4] = class108.method1007(this.field6642.field1480, this.field6650[var4], 0, 109);
                    var4++;
                }
            }
            int var5 = 0;
            if (arg0 != -17847) {
                this.field6650 = null;
            }
            while (var5 < this.field6650.length) {
                if (var2[var5].field2003 < 13) {
                    var2[var5].method1312(2, false);
                }
                var5++;
            }
            class141 var6;
            if (var2.length == 1) {
                var6 = var2[0];
            } else {
                var6 = new class141(var2, var2.length);
            }
            if (var6 == null) {
                return null;
            }
            if (this.field6641 != null) {
                for (int var7 = 0; var7 < this.field6641.length; var7++) {
                    var6.method1305(this.field6641[var7], this.field6648[var7], true);
                }
            }
            if (this.field6646 != null) {
                for (int var8 = 0; var8 < this.field6646.length; var8++) {
                    var6.method1304(false, this.field6646[var8], this.field6651[var8]);
                }
            }
            return var6;
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field6655[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZLwq;)V", line = 83)
    private final void method3348(int arg0, boolean arg1, class176 arg2) {
        try {
            if (arg0 == 1) {
                arg2.method1645((byte) -71);
            } else if (arg0 == 2) {
                int var4 = arg2.method1645((byte) -83);
                this.field6650 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field6650[var5] = arg2.method1687((byte) -71);
                }
            } else if (arg0 != 3) {
                if (arg0 == 40) {
                    int var8 = arg2.method1645((byte) -75);
                    this.field6641 = new short[var8];
                    this.field6648 = new short[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field6641[var9] = (short) arg2.method1687((byte) -86);
                        this.field6648[var9] = (short) arg2.method1687((byte) -57);
                    }
                } else if (arg0 == 41) {
                    int var6 = arg2.method1645((byte) -86);
                    this.field6646 = new short[var6];
                    this.field6651 = new short[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field6646[var7] = (short) arg2.method1687((byte) -116);
                        this.field6651[var7] = (short) arg2.method1687((byte) -111);
                    }
                } else if (arg0 >= 60 && arg0 < 70) {
                    this.field6643[arg0 - 60] = arg2.method1687((byte) -48);
                }
            }
            if (arg1) {
                field6654++;
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field6655[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6655[2] : field6655[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)Z", line = 167)
    public final boolean method3349(byte arg0) {
        try {
            field6652++;
            if (arg0 != -113) {
                this.method3351(72);
            }
            boolean var2 = true;
            class58 var3 = this.field6642.field1480;
            synchronized (this.field6642.field1480) {
                for (int var4 = 0; var4 < 5; var4++) {
                    if (this.field6643[var4] != -1 && !this.field6642.field1480.method586(this.field6643[var4], -25034, 0)) {
                        var2 = false;
                    }
                }
                return var2;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6655[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILwq;)V", line = 204)
    public final void method3350(int arg0, class176 arg1) {
        try {
            if (arg0 != 25624) {
                field6647 = -57;
            }
            while (true) {
                int var3 = arg1.method1645((byte) -100);
                if (var3 == 0) {
                    field6645++;
                    return;
                }
                this.method3348(var3, true, arg1);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6655[3] + arg0 + ',' + (arg1 == null ? field6655[2] : field6655[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)Z", line = 227)
    public final boolean method3351(int arg0) {
        try {
            field6644++;
            if (this.field6650 == null) {
                return true;
            }
            boolean var2 = true;
            class58 var3 = this.field6642.field1480;
            synchronized (this.field6642.field1480) {
                for (int var4 = arg0; var4 < this.field6650.length; var4++) {
                    if (!this.field6642.field1480.method586(this.field6650[var4], -25034, 0)) {
                        var2 = false;
                    }
                }
                return var2;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6655[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "(I)Lkc;", line = 252)
    public final class141 method3352(int arg0) {
        try {
            field6649++;
            class141[] var2 = new class141[5];
            int var3 = 0;
            class58 var4 = this.field6642.field1480;
            synchronized (this.field6642.field1480) {
                for (int var5 = 0; var5 < 5; var5++) {
                    if (this.field6643[var5] != -1) {
                        var2[var3++] = class108.method1007(this.field6642.field1480, this.field6643[var5], 0, 101);
                    }
                }
            }
            for (int var6 = arg0; var6 < 5; var6++) {
                if (var2[var6] != null && var2[var6].field2003 < 13) {
                    var2[var6].method1312(2, false);
                }
            }
            class141 var7 = new class141(var2, var3);
            if (this.field6641 != null) {
                for (int var8 = 0; var8 < this.field6641.length; var8++) {
                    var7.method1305(this.field6641[var8], this.field6648[var8], true);
                }
            }
            if (this.field6646 != null) {
                for (int var9 = 0; var9 < this.field6646.length; var9++) {
                    var7.method1304(false, this.field6646[var9], this.field6651[var9]);
                }
            }
            return var7;
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field6655[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3353(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x60);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3354(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 44;
                    break;
                case 2:
                    var10005 = 10;
                    break;
                case 3:
                    var10005 = 88;
                    break;
                default:
                    var10005 = 96;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
