import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class39 {

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "Luia;")
    private class364 field409 = null;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "Lpm;")
    private class586 field430;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Z")
    private boolean field416;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public int field400;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Lpd;")
    public static class259 field413 = new class259(1);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "[Ljava/lang/Object;")
    private Object[] field431;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field438;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BZZ)V")
    public final void method200(byte arg0, boolean arg1, boolean arg2) {
        field435++;
        if (arg0 != -79 || !this.method207((byte) -66)) {
            return;
        }
        if (arg2) {
            this.field409.field5249 = null;
            this.field409.field5255 = null;
        }
        if (arg1) {
            this.field409.field5257 = null;
            this.field409.field5258 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II[II)Z")
    private final boolean method201(int arg0, int arg1, int[] arg2, int arg3) {
        field425++;
        if (!this.method231(-23423, arg0)) {
            return false;
        } else if (this.field431[arg0] == null) {
            return false;
        } else {
            int var5 = this.field409.field5243[arg0];
            int[] var6 = this.field409.field5250[arg0];
            if (this.field438[arg0] == null) {
                this.field438[arg0] = new Object[this.field409.field5246[arg0]];
            }
            Object[] var7 = this.field438[arg0];
            boolean var8 = true;
            if (arg1 < 20) {
                this.method220(-114);
            }
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
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var11 = class287.method1830(false, -1688, this.field431[arg0]);
            } else {
                var11 = class287.method1830(true, -1688, this.field431[arg0]);
                class645 var12 = new class645(var11);
                var12.method3708(5, (byte) 112, var12.field9068.length, arg2);
            }
            byte[] var13;
            try {
                var13 = class243.method1623((byte) 18, var11);
            } catch (RuntimeException var49) {
                throw class725.method4090(var49, "T3 - " + (arg2 != null) + "," + arg0 + "," + var11.length + "," + class210.method1420(var11, var11.length, 0) + "," + class210.method1420(var11, var11.length - 2, 0) + "," + this.field409.field5252[arg0] + "," + this.field409.field5259);
            }
            if (this.field416) {
                this.field431[arg0] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field400 == 0) {
                    var7[var48] = class597.method3477(false, var13, (byte) 112);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field400 == 2) {
                int var31 = var13.length;
                int var51 = var31 - 1;
                int var32 = var13[var51] & 0xFF;
                int var33 = var51 - var5 * var32 * 4;
                class645 var34 = new class645(var13);
                int var35 = 0;
                int var36 = 0;
                var34.field9084 = var33;
                for (int var37 = 0; var37 < var32; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var34.method3720(-19541);
                        int var40;
                        if (var6 == null) {
                            var40 = var39;
                        } else {
                            var40 = var6[var39];
                        }
                        if (arg3 == var40) {
                            var36 = var40;
                            var35 += var38;
                        }
                    }
                }
                if (var35 == 0) {
                    return true;
                }
                byte[] var41 = new byte[var35];
                var34.field9084 = var33;
                int var42 = 0;
                int var43 = 0;
                for (int var44 = 0; var44 < var32; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var34.method3720(-19541);
                        int var47;
                        if (var6 == null) {
                            var47 = var46;
                        } else {
                            var47 = var6[var46];
                        }
                        if (arg3 == var47) {
                            class319.method2022(var13, var43, var41, var42, var45);
                            var42 += var45;
                        }
                        var43 += var45;
                    }
                }
                var7[var36] = var41;
            } else {
                int var15 = var13.length;
                int var50 = var15 - 1;
                int var16 = var13[var50] & 0xFF;
                int var17 = var50 - var5 * var16 * 4;
                class645 var18 = new class645(var13);
                var18.field9084 = var17;
                int[] var19 = new int[var5];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var18.method3720(-19541);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var18.field9084 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var18.method3720(-19541);
                        class319.method2022(var13, var25, var23[var28], var19[var28], var27);
                        var25 += var27;
                        var19[var28] += var27;
                    }
                }
                for (int var29 = 0; var29 < var5; var29++) {
                    int var30;
                    if (var6 == null) {
                        var30 = var29;
                    } else {
                        var30 = var6[var29];
                    }
                    if (this.field400 == 0) {
                        var7[var30] = class597.method3477(false, var23[var29], (byte) 75);
                    } else {
                        var7[var30] = var23[var29];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)I")
    public final int method202(byte arg0) {
        if (arg0 != -86) {
            this.field430 = null;
        }
        field434++;
        if (!this.method207((byte) -66)) {
            throw new IllegalStateException("");
        }
        return this.field409.field5259;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I")
    private final int method203(int arg0, int arg1) {
        field426++;
        if (arg0 < 26) {
            this.field416 = true;
        }
        if (this.method231(-23423, arg1)) {
            return this.field431[arg1] == null ? this.field430.method3391((byte) 126, arg1) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method204(String arg0, int arg1) {
        if (arg1 <= 17) {
            this.method211(true, -124, -54);
        }
        field420++;
        if (this.method207((byte) -66)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field409.field5249.method3633(class134.method946(6981, var3), (byte) 105);
            return this.method219(2, var4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([BIILno;)Lfk;")
    public static final class656 method205(byte[] arg0, int arg1, int arg2, class704 arg3) {
        field423++;
        if (arg0 == null || arg0.length == 0) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceRawARB(var4, arg0);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class355.field5157, 0);
        if (class355.field5157[0] == arg2) {
            if (class355.field5157[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class355.field5157, 1);
            if (class355.field5157[1] > 1) {
                byte[] var6 = new byte[class355.field5157[1]];
                OpenGL.glGetInfoLogARB(var4, class355.field5157[1], class355.field5157, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class355.field5157[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class656(arg3, var4, arg1);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)V")
    private final void method206(int arg0, int arg1) {
        if (arg0 != 2) {
            this.method218(-95, -47, -127, null);
        }
        field403++;
        if (this.field416) {
            this.field431[arg1] = this.field430.method3392(arg1, (byte) 4);
        } else {
            this.field431[arg1] = class597.method3477(false, this.field430.method3392(arg1, (byte) 4), (byte) 77);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)Z")
    private final boolean method207(byte arg0) {
        field399++;
        if (this.field409 == null) {
            this.field409 = this.field430.method3389((byte) 79);
            if (this.field409 == null) {
                return false;
            }
            this.field431 = new Object[this.field409.field5247];
            this.field438 = new Object[this.field409.field5247][];
        }
        if (arg0 != -66) {
            this.method226(117, -2);
        }
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)Z")
    public final boolean method208(int arg0, byte arg1) {
        if (arg1 != 70) {
            this.method210(null, 24, null);
        }
        field421++;
        if (!this.method207((byte) -66)) {
            return false;
        } else if (this.field409.field5246.length == 1) {
            return this.method214(arg0, 0, 0);
        } else if (!this.method231(-23423, arg0)) {
            return false;
        } else if (this.field409.field5246[arg0] == 1) {
            return this.method214(0, arg0, arg1 - 70);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method209(byte arg0, String arg1) {
        field427++;
        if (!this.method207((byte) -66)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field409.field5249.method3633(class134.method946(6981, var3), (byte) 108);
        if (arg0 == -125) {
            this.method213(var4, (byte) -65);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
    private final boolean method210(String arg0, int arg1, String arg2) {
        field429++;
        if (!this.method207((byte) -66)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field409.field5249.method3633(class134.method946(arg1 + 37011, var4), (byte) 117);
        if (this.method231(-23423, var6)) {
            int var7 = this.field409.field5258[var6].method3633(class134.method946(6981, var5), (byte) 122);
            return arg1 == -30030 ? this.method214(var7, var6, 0) : false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZII)[B")
    public final byte[] method211(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.field409 = null;
        }
        field404++;
        return this.method218(10253, arg2, arg1, null);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
    public final boolean method212(String arg0, int arg1, String arg2) {
        field407++;
        if (!this.method207((byte) -66)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field409.field5249.method3633(class134.method946(6981, var4), (byte) 121);
        if (arg1 != 6559) {
            return false;
        } else if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field409.field5258[var6].method3633(class134.method946(6981, var5), (byte) 114);
            return var7 >= 0;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IB)V")
    private final void method213(int arg0, byte arg1) {
        if (arg1 == -65) {
            this.field430.method3388(arg0, 105);
            field428++;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)Z")
    public final boolean method214(int arg0, int arg1, int arg2) {
        field439++;
        if (!this.method230(arg0, arg1, arg2)) {
            return false;
        } else if (this.field438[arg1] != null && this.field438[arg1][arg0] != null) {
            return true;
        } else if (this.field431[arg1] == null) {
            this.method206(2, arg1);
            return this.field431[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)I")
    public final int method215(int arg0, int arg1) {
        field436++;
        if (!this.method207((byte) -66)) {
            return -1;
        }
        int var3 = this.field409.field5249.method3633(arg0, (byte) 106);
        if (this.method231(-23423, var3)) {
            int var4 = -47 % ((arg1 + 62) / 49);
            return var3;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)I")
    public final int method216(byte arg0) {
        field437++;
        if (!this.method207((byte) -66)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 101 % ((arg0 - 38) / 61);
        int var4 = 0;
        for (int var5 = 0; var5 < this.field431.length; var5++) {
            if (this.field409.field5243[var5] > 0) {
                var4 += this.method203(98, var5);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var4 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method217(String arg0, byte arg1) {
        field433++;
        if (arg1 != -93) {
            return -115;
        } else if (this.method207((byte) -66)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field409.field5249.method3633(class134.method946(6981, var3), (byte) 126);
            return this.method231(arg1 - 23330, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III[I)[B")
    public final byte[] method218(int arg0, int arg1, int arg2, int[] arg3) {
        field415++;
        if (!this.method230(arg1, arg2, arg0 ^ arg0)) {
            return null;
        }
        if (this.field438[arg2] == null || this.field438[arg2][arg1] == null) {
            boolean var5 = this.method201(arg2, 87, arg3, arg1);
            if (!var5) {
                this.method206(arg0 - 10251, arg2);
                boolean var6 = this.method201(arg2, 74, arg3, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class287.method1830(false, -1688, this.field438[arg2][arg1]);
        if (this.field400 == 1) {
            this.field438[arg2][arg1] = null;
            if (this.field409.field5246[arg2] == 1) {
                this.field438[arg2] = null;
            }
        } else if (this.field400 == 2) {
            this.field438[arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(II)Z")
    public final boolean method219(int arg0, int arg1) {
        field412++;
        if (!this.method231(-23423, arg1)) {
            return false;
        } else if (this.field431[arg1] == null) {
            this.method206(arg0, arg1);
            return this.field431[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)Z")
    public final boolean method220(int arg0) {
        field418++;
        if (!this.method207((byte) -66)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field409.field5239.length; var3++) {
            int var4 = this.field409.field5239[var3];
            if (this.field431[var4] == null) {
                this.method206(arg0 + 15565, var4);
                if (this.field431[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 == -15563) {
            return var2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method221(int arg0, String arg1) {
        if (arg0 >= -123) {
            this.method228(-39, (byte) -85);
        }
        field432++;
        if (this.method207((byte) -66)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field409.field5249.method3633(class134.method946(6981, var3), (byte) 115);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)I")
    public final int method222(byte arg0) {
        field411++;
        if (this.method207((byte) -66)) {
            int var2 = 58 / ((arg0 - 70) / 55);
            return this.field409.field5246.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(II)[I")
    public final int[] method223(int arg0, int arg1) {
        field414++;
        int var3 = 74 / ((arg0 + 16) / 61);
        if (!this.method231(-23423, arg1)) {
            return null;
        }
        int[] var4 = this.field409.field5250[arg1];
        if (var4 == null) {
            var4 = new int[this.field409.field5243[arg1]];
            int var5 = 0;
            while (var5 < var4.length) {
                var4[var5] = var5++;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)V")
    public final void method224(byte arg0) {
        if (arg0 < 68) {
            this.field400 = -96;
        }
        if (this.field438 != null) {
            for (int var2 = 0; var2 < this.field438.length; var2++) {
                this.field438[var2] = null;
            }
        }
        field417++;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(ILjava/lang/String;)I")
    public final int method225(int arg0, String arg1) {
        field401++;
        if (this.method207((byte) -66)) {
            int var3 = -30 / ((arg0 - 3) / 60);
            String var4 = arg1.toLowerCase();
            int var5 = this.field409.field5249.method3633(class134.method946(6981, var4), (byte) 108);
            return this.method203(110, var5);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(II)[B")
    public final byte[] method226(int arg0, int arg1) {
        field408++;
        if (!this.method207((byte) -66)) {
            return null;
        } else if (arg0 <= 31) {
            return null;
        } else if (this.field409.field5246.length == 1) {
            return this.method211(true, 0, arg1);
        } else if (!this.method231(-23423, arg1)) {
            return null;
        } else if (this.field409.field5246[arg1] == 1) {
            return this.method211(true, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
    public static void method227(int arg0) {
        field413 = null;
        if (arg0 <= 105) {
            method205(null, 28, -91, null);
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(IB)V")
    public final void method228(int arg0, byte arg1) {
        field406++;
        if (!this.method231(-23423, arg0)) {
            return;
        }
        if (this.field438 != null) {
            this.field438[arg0] = null;
        }
        if (arg1 != -116) {
            this.field431 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(II)I")
    public final int method229(int arg0, int arg1) {
        field410++;
        if (this.method231(-23423, arg0)) {
            if (arg1 != 0) {
                this.method211(false, 91, -126);
            }
            return this.field409.field5246[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)Z")
    private final boolean method230(int arg0, int arg1, int arg2) {
        field419++;
        if (!this.method207((byte) -66)) {
            return false;
        } else if (arg1 >= arg2 && arg0 >= 0 && this.field409.field5246.length > arg1 && arg0 < this.field409.field5246[arg1]) {
            return true;
        } else if (client.field4277) {
            throw new IllegalArgumentException(arg1 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "(II)Z")
    private final boolean method231(int arg0, int arg1) {
        field405++;
        if (arg0 != -23423) {
            this.method219(119, 65);
        }
        if (!this.method207((byte) -66)) {
            return false;
        } else if (arg1 >= 0 && this.field409.field5246.length > arg1 && this.field409.field5246[arg1] != 0) {
            return true;
        } else if (client.field4277) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(B)V")
    public final void method232(byte arg0) {
        if (arg0 >= -105) {
            this.field430 = null;
        }
        field422++;
        if (this.field431 != null) {
            for (int var2 = 0; var2 < this.field431.length; var2++) {
                this.field431[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method233(int arg0, String arg1, String arg2) {
        field402++;
        if (!this.method207((byte) -66)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field409.field5249.method3633(class134.method946(6981, var4), (byte) 117);
        if (!this.method231(-23423, var6)) {
            return null;
        } else if (arg0 > -81) {
            return null;
        } else {
            int var7 = this.field409.field5258[var6].method3633(class134.method946(6981, var5), (byte) 111);
            return this.method211(true, var6, var7);
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lpm;ZI)V")
    public class39(class586 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field430 = arg0;
        this.field416 = arg1;
        this.field400 = arg2;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method234(String arg0, byte arg1) {
        field424++;
        int var3 = this.method217("", (byte) -93);
        int var4 = -115 / ((62 - arg1) / 58);
        return var3 == -1 ? this.method210(arg0, -30030, "") : this.method210("", -30030, arg0);
    }
}
