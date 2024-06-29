import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class376 {

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "Lqia;")
    private class20 field5214 = null;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "Lud;")
    private class35 field5204;

    @OriginalMember(owner = "client!wu", name = "M", descriptor = "Z")
    private boolean field5238;

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "I")
    public int field5225;

    @OriginalMember(owner = "client!wu", name = "D", descriptor = "Z")
    public static boolean field5229 = false;

    @OriginalMember(owner = "client!wu", name = "F", descriptor = "Z")
    public static boolean field5231 = true;

    @OriginalMember(owner = "client!wu", name = "I", descriptor = "Lkaa;")
    public static class47 field5234 = new class47(44, 3);

    @OriginalMember(owner = "client!wu", name = "R", descriptor = "I")
    public static int field5243 = 0;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!wu", name = "t", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!wu", name = "u", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!wu", name = "v", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!wu", name = "w", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!wu", name = "x", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!wu", name = "y", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!wu", name = "A", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!wu", name = "B", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!wu", name = "C", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!wu", name = "E", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!wu", name = "G", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!wu", name = "H", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!wu", name = "J", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!wu", name = "K", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!wu", name = "L", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!wu", name = "N", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!wu", name = "O", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!wu", name = "P", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!wu", name = "Q", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!wu", name = "S", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!wu", name = "T", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!wu", name = "r", descriptor = "[Ljava/lang/Object;")
    private Object[] field5217;

    @OriginalMember(owner = "client!wu", name = "q", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field5216;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZI)I", line = 6)
    private final int method2194(boolean arg0, int arg1) {
        field5232++;
        if (!this.method2217((byte) -103, arg1)) {
            return 0;
        } else if (this.field5217[arg1] == null) {
            if (arg0) {
                this.field5214 = null;
            }
            return this.field5204.method287(arg1, 1113);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)I", line = 28)
    public final int method2195(int arg0, int arg1) {
        field5203++;
        if (this.method2217((byte) -76, arg0)) {
            if (arg1 != 0) {
                field5229 = true;
            }
            return this.field5214.field339[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(II)V", line = 46)
    private final void method2196(int arg0, int arg1) {
        field5244++;
        if (this.field5238) {
            this.field5217[arg0] = this.field5204.method291(arg0, 0);
        } else {
            this.field5217[arg0] = class166.method1195(false, this.field5204.method291(arg0, arg1 + 24659), (byte) 114);
        }
        if (arg1 != -24659) {
            this.method2216(-81, 28);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)Z", line = 66)
    private final boolean method2197(byte arg0) {
        if (arg0 != -18) {
            return true;
        }
        field5212++;
        if (this.field5214 == null) {
            this.field5214 = this.field5204.method290(arg0 ^ 0x3A);
            if (this.field5214 == null) {
                return false;
            }
            this.field5217 = new Object[this.field5214.field354];
            this.field5216 = new Object[this.field5214.field354][];
        }
        return true;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)I", line = 88)
    public final int method2198(int arg0) {
        if (arg0 != 0) {
            this.method2205(36, 48);
        }
        field5208++;
        return this.method2197((byte) -18) ? this.field5214.field339.length : -1;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(III)Z", line = 103)
    private final boolean method2199(int arg0, int arg1, int arg2) {
        field5233++;
        if (!this.method2197((byte) -18)) {
            return false;
        }
        if (arg1 > -13) {
            this.method2210(59);
        }
        if (arg2 >= 0 && arg0 >= 0 && arg2 < this.field5214.field339.length && this.field5214.field339[arg2] > arg0) {
            return true;
        } else if (class402.field5606) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IB)I", line = 132)
    public final int method2200(int arg0, byte arg1) {
        field5220++;
        if (!this.method2197((byte) -18)) {
            return -1;
        }
        int var3 = this.field5214.field349.method2000((byte) 105, arg0);
        if (arg1 < 97) {
            return 15;
        } else if (this.method2217((byte) -123, var3)) {
            return var3;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V", line = 154)
    public final void method2201(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field5202++;
        if (this.field5217 != null) {
            for (int var2 = 0; var2 < this.field5217.length; var2++) {
                this.field5217[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(II)Z", line = 179)
    public final boolean method2202(int arg0, int arg1) {
        field5210++;
        if (arg0 != -14491) {
            return false;
        } else if (!this.method2217((byte) -78, arg1)) {
            return false;
        } else if (this.field5217[arg1] == null) {
            this.method2196(arg1, arg0 - 10168);
            return this.field5217[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(II)V", line = 201)
    private final void method2203(int arg0, int arg1) {
        field5207++;
        if (arg1 != 0) {
            this.field5214 = null;
        }
        this.field5204.method288((byte) 76, arg0);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)[B", line = 214)
    public final byte[] method2204(String arg0, String arg1, byte arg2) {
        field5226++;
        if (!this.method2197((byte) -18)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        if (arg2 <= 61) {
            field5231 = true;
        }
        String var5 = arg0.toLowerCase();
        int var6 = this.field5214.field349.method2000((byte) 117, method2220(var4, false));
        if (this.method2217((byte) -56, var6)) {
            int var7 = this.field5214.field340[var6].method2000((byte) 113, method2220(var5, false));
            return this.method2218((byte) 115, var6, var7);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "(II)V", line = 240)
    public final void method2205(int arg0, int arg1) {
        field5219++;
        if (arg0 >= -96) {
            this.method2219(null, 69);
        }
        if (this.method2217((byte) -41, arg1) && this.field5216 != null) {
            this.field5216[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(IB)V", line = 260)
    public static final void method2206(int arg0, byte arg1) {
        field5222++;
        if (class77.field943 == null) {
            class77.field943 = new byte[4][class719.field10004][class107.field1453];
        }
        for (int var2 = arg0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class719.field10004; var3++) {
                for (int var4 = 0; var4 < class107.field1453; var4++) {
                    class77.field943[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "([IIII)[B", line = 293)
    public final byte[] method2207(int[] arg0, int arg1, int arg2, int arg3) {
        field5213++;
        if (!this.method2199(arg1, -63, arg2)) {
            return null;
        }
        if (this.field5216[arg2] == null || this.field5216[arg2][arg1] == null) {
            boolean var5 = this.method2221(arg0, arg2, arg1, false);
            if (!var5) {
                this.method2196(arg2, arg3 - 24661);
                boolean var6 = this.method2221(arg0, arg2, arg1, false);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class464.method2631(this.field5216[arg2][arg1], false, -30711);
        if (this.field5225 == 1) {
            this.field5216[arg2][arg1] = null;
            if (this.field5214.field339[arg2] == 1) {
                this.field5216[arg2] = null;
            }
        } else if (this.field5225 == 2) {
            this.field5216[arg2] = null;
        }
        if (arg3 != 2) {
            field5231 = false;
        }
        return var7;
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)V", line = 344)
    public final void method2208(int arg0) {
        if (this.field5216 != null) {
            for (int var2 = 0; var2 < this.field5216.length; var2++) {
                this.field5216[var2] = null;
            }
        }
        if (arg0 == 0) {
            field5221++;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 367)
    public final boolean method2209(String arg0, boolean arg1) {
        if (arg1) {
            this.field5238 = true;
        }
        field5215++;
        if (this.method2197((byte) -18)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field5214.field349.method2000((byte) 112, method2220(var3, arg1));
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(I)Z", line = 388)
    public final boolean method2210(int arg0) {
        field5224++;
        if (!this.method2197((byte) -18)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 != 23094821) {
            this.field5238 = false;
        }
        for (int var3 = 0; var3 < this.field5214.field344.length; var3++) {
            int var4 = this.field5214.field344[var3];
            if (this.field5217[var4] == null) {
                this.method2196(var4, -24659);
                if (this.field5217[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lud;ZI)V", line = 1142)
    public class376(class35 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field5204 = arg0;
        this.field5238 = arg1;
        this.field5225 = arg2;
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(III)Z", line = 428)
    public final boolean method2211(int arg0, int arg1, int arg2) {
        field5218++;
        if (!this.method2199(arg1, -43, arg2)) {
            return false;
        } else if (arg0 <= 33) {
            return false;
        } else if (this.field5216[arg2] != null && this.field5216[arg2][arg1] != null) {
            return true;
        } else if (this.field5217[arg2] == null) {
            this.method2196(arg2, -24659);
            return this.field5217[arg2] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILjava/lang/String;)I", line = 453)
    public final int method2212(int arg0, String arg1) {
        field5230++;
        if (this.method2197((byte) -18)) {
            String var3 = arg1.toLowerCase();
            int var4 = 83 / ((arg0 - 54) / 53);
            int var5 = this.field5214.field349.method2000((byte) 106, method2220(var3, false));
            return this.method2194(false, var5);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B[ILfs;I)V", line = 470)
    public static final void method2213(byte arg0, int[] arg1, class556 arg2, int arg3) {
        field5201++;
        if (arg0 <= 1) {
            method2206(62, (byte) -82);
        }
        if (arg2.field10227 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg2.field10227.length; var5++) {
                if (arg2.field10227[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg2.field10257 != -1) {
                class456 var6 = class509.field6780.method663((byte) -90, arg2.field10257);
                int var7 = var6.field6214;
                if (var7 == 1) {
                    arg2.field10279 = 0;
                    arg2.field10220 = 1;
                    arg2.field10233 = 0;
                    arg2.field10237 = arg3;
                    arg2.field10232 = 0;
                    if (!arg2.field10252) {
                        class514.method2871(var6, arg2.field10233, arg2, true);
                    }
                }
                if (var7 == 2) {
                    arg2.field10232 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg1.length; var9++) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg2.field10227 == null || arg2.field10227[var9] == -1 || class509.field6780.method663((byte) -90, arg1[var9]).field6213 >= class509.field6780.method663((byte) -90, arg2.field10227[var9]).field6213) {
                arg2.field10227 = arg1;
                arg2.field10237 = arg3;
                arg2.field10318 = arg2.field10316;
            }
        }
        if (var8) {
            arg2.field10237 = arg3;
            arg2.field10227 = arg1;
            arg2.field10318 = arg2.field10316;
        }
    }

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "(II)[I", line = 558)
    public final int[] method2214(int arg0, int arg1) {
        field5241++;
        if (!this.method2217((byte) -56, arg0)) {
            return null;
        }
        int var3 = 113 % ((22 - arg1) / 36);
        int[] var4 = this.field5214.field356[arg0];
        if (var4 == null) {
            var4 = new int[this.field5214.field343[arg0]];
            int var5 = 0;
            while (var5 < var4.length) {
                var4[var5] = var5++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "(I)I", line = 593)
    public final int method2215(int arg0) {
        field5242++;
        if (arg0 != 1010) {
            return -33;
        } else if (this.method2197((byte) -18)) {
            return this.field5214.field336;
        } else {
            throw new IllegalStateException("");
        }
    }

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "(II)Z", line = 617)
    public final boolean method2216(int arg0, int arg1) {
        field5236++;
        if (!this.method2197((byte) -18)) {
            return false;
        } else if (this.field5214.field339.length == 1) {
            return this.method2211(91, arg0, 0);
        } else if (!this.method2217((byte) -48, arg0)) {
            return false;
        } else if (this.field5214.field339[arg0] == 1) {
            return this.method2211(47, 0, arg0);
        } else {
            int var3 = 44 % ((5 - arg1) / 54);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BI)Z", line = 647)
    private final boolean method2217(byte arg0, int arg1) {
        if (arg0 > -21) {
            return false;
        }
        field5240++;
        if (!this.method2197((byte) -18)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field5214.field339.length && this.field5214.field339[arg1] != 0) {
            return true;
        } else if (class402.field5606) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BII)[B", line = 674)
    public final byte[] method2218(byte arg0, int arg1, int arg2) {
        field5209++;
        if (arg0 <= 107) {
            this.method2225(null, 5);
        }
        return this.method2207(null, arg2, arg1, 2);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 692)
    public final void method2219(String arg0, int arg1) {
        field5205++;
        if (this.method2197((byte) -18)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field5214.field349.method2000((byte) 115, method2220(var3, false));
            this.method2203(var4, arg1);
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(Ljava/lang/String;Z)I", line = 713)
    private static final int method2220(String arg0, boolean arg1) {
        field5245++;
        int var2 = arg0.length();
        int var3 = 0;
        int var4 = 0;
        if (arg1) {
            method2220(null, true);
        }
        while (var2 > var4) {
            var3 = (var3 << 5) + class295.method1826(9, arg0.charAt(var4)) - var3;
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "([IIIZ)Z", line = 735)
    private final boolean method2221(int[] arg0, int arg1, int arg2, boolean arg3) {
        field5200++;
        if (!this.method2217((byte) -92, arg1)) {
            return false;
        } else if (this.field5217[arg1] == null) {
            return false;
        } else {
            int var5 = this.field5214.field343[arg1];
            int[] var6 = this.field5214.field356[arg1];
            if (arg3) {
                return true;
            }
            if (this.field5216[arg1] == null) {
                this.field5216[arg1] = new Object[this.field5214.field339[arg1]];
            }
            Object[] var7 = this.field5216[arg1];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var11 = class464.method2631(this.field5217[arg1], true, -30711);
                class677 var12 = new class677(var11);
                var12.method3779(var12.field9399.length, arg0, false, 5);
            } else {
                var11 = class464.method2631(this.field5217[arg1], false, -30711);
            }
            byte[] var13;
            try {
                var13 = class83.method646(var11, 22047);
            } catch (RuntimeException var49) {
                throw class737.method4117(var49, "T3 - " + (arg0 != null) + "," + arg1 + "," + var11.length + "," + class209.method1396(var11.length, (byte) 88, var11) + "," + class209.method1396(var11.length - 2, (byte) 120, var11) + "," + this.field5214.field353[arg1] + "," + this.field5214.field336);
            }
            if (this.field5238) {
                this.field5217[arg1] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field5225 == 0) {
                    var7[var15] = class166.method1195(false, var13, (byte) 96);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field5225 == 2) {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var5 * var33 * 4;
                class677 var35 = new class677(var13);
                int var36 = 0;
                var35.field9419 = var34;
                int var37 = 0;
                for (int var38 = 0; var38 < var33; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var35.method3799(false);
                        int var41;
                        if (var6 == null) {
                            var41 = var40;
                        } else {
                            var41 = var6[var40];
                        }
                        if (arg2 == var41) {
                            var37 = var41;
                            var36 += var39;
                        }
                    }
                }
                if (var36 == 0) {
                    return true;
                }
                byte[] var42 = new byte[var36];
                int var43 = 0;
                var35.field9419 = var34;
                int var44 = 0;
                for (int var45 = 0; var45 < var33; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var35.method3799(false);
                        int var48;
                        if (var6 == null) {
                            var48 = var47;
                        } else {
                            var48 = var6[var47];
                        }
                        if (arg2 == var48) {
                            class335.method2020(var13, var44, var42, var43, var46);
                            var43 += var46;
                        }
                        var44 += var46;
                    }
                }
                var7[var37] = var42;
            } else {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var17 * 4 * var5;
                class677 var19 = new class677(var13);
                var19.field9419 = var18;
                int[] var20 = new int[var5];
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var19.method3799(false);
                        var20[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var5][];
                for (int var25 = 0; var25 < var5; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var19.field9419 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var5; var29++) {
                        var28 += var19.method3799(false);
                        class335.method2020(var13, var26, var24[var29], var20[var29], var28);
                        var26 += var28;
                        var20[var29] += var28;
                    }
                }
                for (int var30 = 0; var30 < var5; var30++) {
                    int var31;
                    if (var6 == null) {
                        var31 = var30;
                    } else {
                        var31 = var6[var30];
                    }
                    if (this.field5225 == 0) {
                        var7[var31] = class166.method1195(false, var24[var30], (byte) 88);
                    } else {
                        var7[var31] = var24[var30];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BZZ)V", line = 1019)
    public final void method2222(byte arg0, boolean arg1, boolean arg2) {
        field5228++;
        if (!this.method2197((byte) -18)) {
            return;
        }
        if (arg2) {
            this.field5214.field349 = null;
            this.field5214.field346 = null;
        }
        if (arg0 != 1) {
            this.method2215(-123);
        }
        if (arg1) {
            this.field5214.field340 = null;
            this.field5214.field355 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(BLjava/lang/String;)I", line = 1047)
    public final int method2223(byte arg0, String arg1) {
        field5235++;
        if (!this.method2197((byte) -18)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field5214.field349.method2000((byte) 107, method2220(var3, false));
        if (arg0 <= 49) {
            return 12;
        } else if (this.method2217((byte) -71, var4)) {
            return var4;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 1070)
    public final boolean method2224(String arg0, String arg1, int arg2) {
        field5211++;
        if (!this.method2197((byte) -18)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        if (arg2 < 59) {
            this.method2209(null, true);
        }
        String var5 = arg0.toLowerCase();
        int var6 = this.field5214.field349.method2000((byte) 123, method2220(var4, false));
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field5214.field340[var6].method2000((byte) 114, method2220(var5, false));
            return var7 >= 0;
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(Ljava/lang/String;I)Z", line = 1102)
    public final boolean method2225(String arg0, int arg1) {
        field5223++;
        int var3 = this.method2223((byte) 60, "");
        return arg1 == var3 ? this.method2228("", 19, arg0) : this.method2228(arg0, 10, "");
    }

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "(II)[B", line = 1116)
    public final byte[] method2226(int arg0, int arg1) {
        field5206++;
        if (!this.method2197((byte) -18)) {
            return null;
        } else if (this.field5214.field339.length == 1) {
            return this.method2218((byte) 111, 0, arg1);
        } else if (!this.method2217((byte) -127, arg1)) {
            return null;
        } else if (this.field5214.field339[arg1] == 1) {
            return this.method2218((byte) 110, arg1, 0);
        } else {
            if (arg0 != -1) {
                field5243 = 17;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(Ljava/lang/String;Z)Z", line = 1159)
    public final boolean method2227(String arg0, boolean arg1) {
        if (!arg1) {
            this.field5214 = null;
        }
        field5227++;
        if (this.method2197((byte) -18)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field5214.field349.method2000((byte) 116, method2220(var3, false));
            return this.method2202(-14491, var4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 1176)
    private final boolean method2228(String arg0, int arg1, String arg2) {
        field5239++;
        if (!this.method2197((byte) -18)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = 45 % ((arg1 + 62) / 33);
        int var7 = this.field5214.field349.method2000((byte) 119, method2220(var4, false));
        if (this.method2217((byte) -78, var7)) {
            int var8 = this.field5214.field340[var7].method2000((byte) 119, method2220(var5, false));
            return this.method2211(70, var8, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(B)I", line = 1203)
    public final int method2229(byte arg0) {
        field5237++;
        if (!this.method2197((byte) -18)) {
            return 0;
        }
        if (arg0 >= -97) {
            this.method2200(31, (byte) -32);
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field5217.length; var4++) {
            if (this.field5214.field343[var4] > 0) {
                var3 += this.method2194(false, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(B)V", line = 1245)
    public static void method2230(byte arg0) {
        field5234 = null;
        if (arg0 <= 9) {
            field5243 = 112;
        }
    }
}
