import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class192 {

    @OriginalMember(owner = "client!fl", name = "O", descriptor = "Loc;")
    private class121 field3465 = null;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "Z")
    private boolean field3439;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "Z")
    private boolean field3447;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Lmi;")
    private class228 field3428;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field3427 = 0;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!fl", name = "x", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!fl", name = "y", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!fl", name = "A", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!fl", name = "M", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!fl", name = "C", descriptor = "[Ljava/lang/Object;")
    private Object[] field3453;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3443;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)V")
    public final void method1302(byte arg0, int arg1) {
        field3426++;
        if (this.method1321((byte) -28, arg1) && arg0 >= 88 && this.field3443 != null) {
            this.field3443[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)[I")
    public final int[] method1303(int arg0, int arg1) {
        field3446++;
        if (!this.method1321((byte) -29, arg1)) {
            return null;
        }
        if (arg0 != 0) {
            this.field3453 = null;
        }
        int[] var3 = this.field3465.field2142[arg1];
        if (var3 == null) {
            var3 = new int[this.field3465.field2154[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)[B")
    public final byte[] method1304(int arg0, int arg1, int arg2) {
        field3425++;
        if (!this.method1333(arg2, 94, arg1)) {
            return null;
        }
        if (this.field3443[arg2] == null || this.field3443[arg2][arg1] == null) {
            boolean var4 = this.method1325((int[]) null, (byte) 58, arg2);
            if (!var4) {
                this.method1314((byte) 119, arg2);
                boolean var5 = this.method1325((int[]) null, (byte) 64, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class139.method958(false, this.field3443[arg2][arg1], -72);
        int var7 = 16 / ((-arg0 - 33) / 51);
        return var6;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLvf;Lvf;)Z")
    public final boolean method1305(byte arg0, class265 arg1, class265 arg2) {
        field3462++;
        if (!this.method1313(-29782)) {
            return false;
        }
        class265 var4 = arg2.method1804(125);
        class265 var5 = arg1.method1804(-63);
        int var6 = this.field3465.field2144.method1049((byte) 103, var4.method1811(24290));
        if (this.method1321((byte) -33, var6)) {
            int var7 = this.field3465.field2149[var6].method1049((byte) -52, var5.method1811(24290));
            int var8 = -109 / ((arg0 - 23) / 62);
            return this.method1310(var6, 2, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lvf;I)V")
    public final void method1306(class265 arg0, int arg1) {
        field3430++;
        if (!this.method1313(-29782)) {
            return;
        }
        class265 var3 = arg0.method1804(127);
        int var4 = this.field3465.field2144.method1049((byte) 47, var3.method1811(24290));
        this.method1319(arg1 - 5489, var4);
        if (arg1 != 5489) {
            this.method1316(89, 96);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)Z")
    public final boolean method1307(int arg0, byte arg1) {
        field3435++;
        if (!this.method1321((byte) 126, arg0)) {
            return false;
        } else if (this.field3453[arg0] == null) {
            this.method1314((byte) 119, arg0);
            if (this.field3453[arg0] == null) {
                return arg1 >= -70;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)Z")
    public final boolean method1308(byte arg0) {
        field3432++;
        if (!this.method1313(-29782)) {
            return false;
        }
        if (arg0 < 65) {
            this.method1331(-41, (byte) -5);
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field3465.field2140.length; var3++) {
            int var4 = this.field3465.field2140[var3];
            if (this.field3453[var4] == null) {
                this.method1314((byte) 119, var4);
                if (this.field3453[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZI[I)[B")
    public final byte[] method1309(int arg0, boolean arg1, int arg2, int[] arg3) {
        field3444++;
        if (!this.method1333(arg2, 118, arg0)) {
            return null;
        }
        if (this.field3443[arg2] == null || this.field3443[arg2][arg0] == null) {
            boolean var5 = this.method1325(arg3, (byte) 64, arg2);
            if (!var5) {
                this.method1314((byte) 119, arg2);
                boolean var6 = this.method1325(arg3, (byte) -104, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class139.method958(arg1, this.field3443[arg2][arg0], -78);
        if (this.field3447) {
            this.field3443[arg2][arg0] = null;
            if (this.field3465.field2145[arg2] == 1) {
                this.field3443[arg2] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(III)Z")
    public final boolean method1310(int arg0, int arg1, int arg2) {
        field3448++;
        if (arg1 != 2) {
            this.method1316(-127, -103);
        }
        if (!this.method1333(arg0, 88, arg2)) {
            return false;
        } else if (this.field3443[arg0] != null && this.field3443[arg0][arg2] != null) {
            return true;
        } else if (this.field3453[arg0] == null) {
            this.method1314((byte) 119, arg0);
            return this.field3453[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)I")
    public final int method1311(int arg0) {
        int var2 = -20 / ((arg0 + 78) / 33);
        field3460++;
        if (!this.method1313(-29782)) {
            throw new IllegalStateException("");
        }
        return this.field3465.field2152;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(Lvf;I)Z")
    public final boolean method1312(class265 arg0, int arg1) {
        field3433++;
        if (arg1 != 1) {
            this.field3443 = null;
        }
        if (this.method1313(arg1 ^ 0xFFFF8BAB)) {
            class265 var3 = arg0.method1804(arg1 ^ 0x7C);
            int var4 = this.field3465.field2144.method1049((byte) -53, var3.method1811(arg1 + 24289));
            return this.method1307(var4, (byte) -122);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)Z")
    private final boolean method1313(int arg0) {
        field3461++;
        if (arg0 != -29782) {
            field3427 = 92;
        }
        if (this.field3465 == null) {
            this.field3465 = this.field3428.method89(arg0 + 29910);
            if (this.field3465 == null) {
                return false;
            }
            this.field3453 = new Object[this.field3465.field2138];
            this.field3443 = new Object[this.field3465.field2138][];
        }
        return true;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(BI)V")
    private final void method1314(byte arg0, int arg1) {
        if (arg0 != 119) {
            return;
        }
        if (this.field3439) {
            this.field3453[arg1] = this.field3428.method88(arg1, 0);
        } else {
            this.field3453[arg1] = class145.method1001(false, this.field3428.method88(arg1, 0), true);
        }
        field3458++;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)I")
    public final int method1315(int arg0) {
        field3464++;
        if (this.method1313(-29782)) {
            return arg0 == 0 ? this.field3465.field2145.length : -33;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(II)I")
    private final int method1316(int arg0, int arg1) {
        field3445++;
        if (this.method1321((byte) 116, arg0)) {
            if (arg1 >= -98) {
                this.method1304(16, 76, 88);
            }
            return this.field3453[arg0] == null ? this.field3428.method78((byte) -102, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)I")
    public final int method1317(int arg0) {
        field3463++;
        if (!this.method1313(-29782)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3453.length; var4++) {
            if (this.field3465.field2154[var4] > 0) {
                var2 += 100;
                var3 += this.method1316(var4, -108);
            }
        }
        if (arg0 != 16040) {
            method1324(45, (byte) -52, 102, -90, -115, 108, 32, -47, -99, 29);
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lra;I)V")
    public static final void method1318(class277 arg0, int arg1) {
        class96.method645(arg1, (byte) 113, arg0);
        field3449++;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(II)V")
    private final void method1319(int arg0, int arg1) {
        this.field3428.method80(arg1, (byte) 91);
        field3429++;
        if (arg0 != 0) {
            this.method1313(-70);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILvf;Lvf;)[B")
    public final byte[] method1320(int arg0, class265 arg1, class265 arg2) {
        field3437++;
        if (!this.method1313(-29782)) {
            return null;
        }
        class265 var4 = arg2.method1804(125);
        class265 var5 = arg1.method1804(-21);
        int var6 = this.field3465.field2144.method1049((byte) 124, var4.method1811(24290));
        if (this.method1321((byte) 114, var6)) {
            int var7 = this.field3465.field2149[var6].method1049((byte) -90, var5.method1811(24290));
            int var8 = 70 / ((arg0 - 63) / 59);
            return this.method1332(true, var7, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(BI)Z")
    private final boolean method1321(byte arg0, int arg1) {
        field3456++;
        int var3 = -123 % ((51 - arg0) / 61);
        if (!this.method1313(-29782)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field3465.field2145.length && this.field3465.field2145[arg1] != 0) {
            return true;
        } else if (class22.field669) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
    public final void method1322(int arg0) {
        if (this.field3443 != null) {
            for (int var2 = 0; var2 < this.field3443.length; var2++) {
                this.field3443[var2] = null;
            }
        }
        if (arg0 == 0) {
            field3454++;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLvf;)Z")
    public final boolean method1323(byte arg0, class265 arg1) {
        field3440++;
        if (arg0 != -45) {
            this.field3443 = null;
        }
        if (this.method1313(-29782)) {
            class265 var3 = arg1.method1804(126);
            int var4 = this.field3465.field2144.method1049((byte) -31, var3.method1811(24290));
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method1324(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 >= class107.field1890 && arg3 <= class79.field1510 && arg4 >= class107.field1890 && class79.field1510 >= arg4 && arg8 >= class107.field1890 && arg8 <= class79.field1510 && arg2 >= class107.field1890 && arg2 <= class79.field1510 && arg6 >= class81.field1521 && arg6 <= class205.field3681 && class81.field1521 <= arg7 && arg7 <= class205.field3681 && class81.field1521 <= arg5 && arg5 <= class205.field3681 && arg0 >= class81.field1521 && arg0 <= class205.field3681) {
            class268.method1821(arg4, arg2, arg5, arg8, arg7, arg3, arg0, arg6, (byte) -88, arg9);
        } else {
            class183.method1223(arg6, 73, arg0, arg7, arg3, arg2, arg9, arg4, arg5, arg8);
        }
        field3441++;
        int var10 = -5 / ((18 - arg1) / 57);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "([IBI)Z")
    private final boolean method1325(int[] arg0, byte arg1, int arg2) {
        field3431++;
        if (!this.method1321((byte) 116, arg2)) {
            return false;
        } else if (this.field3453[arg2] == null) {
            return false;
        } else {
            int[] var4 = this.field3465.field2142[arg2];
            int var5 = this.field3465.field2154[arg2];
            if (this.field3443[arg2] == null) {
                this.field3443[arg2] = new Object[this.field3465.field2145[arg2]];
            }
            Object[] var6 = this.field3443[arg2];
            boolean var7 = true;
            for (int var8 = 0; var8 < var5; var8++) {
                int var9;
                if (var4 == null) {
                    var9 = var8;
                } else {
                    var9 = var4[var8];
                }
                if (var6[var9] == null) {
                    var7 = false;
                    break;
                }
            }
            if (var7) {
                return true;
            }
            byte[] var10;
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var10 = class139.method958(false, this.field3453[arg2], -79);
            } else {
                var10 = class139.method958(true, this.field3453[arg2], -118);
                class135 var11 = new class135(var10);
                var11.method902(5, var11.field2483.length, arg0, (byte) -57);
            }
            int var12 = 71 / ((-arg1 - 46) / 58);
            byte[] var13;
            try {
                var13 = class45.method376(-74, var10);
            } catch (RuntimeException var32) {
                throw class178.method1156(var32, "T3 - " + (arg0 != null) + "," + arg2 + "," + var10.length + "," + class238.method1587(var10, true, var10.length) + "," + class238.method1587(var10, true, var10.length - 2) + "," + this.field3465.field2141[arg2] + "," + this.field3465.field2152);
            }
            if (this.field3439) {
                this.field3453[arg2] = null;
            }
            if (var5 > 1) {
                int var15 = var13.length;
                int var33 = var15 - 1;
                int var16 = var13[var33] & 0xFF;
                int var17 = var33 - var5 * var16 * 4;
                int[] var18 = new int[var5];
                class135 var19 = new class135(var13);
                var19.field2449 = var17;
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var19.method949(3933);
                        var18[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var18[var24]];
                    var18[var24] = 0;
                }
                var19.field2449 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var19.method949(3933);
                        class194.method1342(var13, var25, var23[var28], var18[var28], var27);
                        var18[var28] += var27;
                        var25 += var27;
                    }
                }
                for (int var29 = 0; var29 < var5; var29++) {
                    int var30;
                    if (var4 == null) {
                        var30 = var29;
                    } else {
                        var30 = var4[var29];
                    }
                    if (this.field3447) {
                        var6[var30] = var23[var29];
                    } else {
                        var6[var30] = class145.method1001(false, var23[var29], true);
                    }
                }
            } else {
                int var31;
                if (var4 == null) {
                    var31 = 0;
                } else {
                    var31 = var4[0];
                }
                if (this.field3447) {
                    var6[var31] = var13;
                } else {
                    var6[var31] = class145.method1001(false, var13, true);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(BLvf;)I")
    public final int method1326(byte arg0, class265 arg1) {
        field3451++;
        if (!this.method1313(-29782)) {
            return -1;
        }
        class265 var3 = arg1.method1804(arg0 ^ 0xFFFFFF97);
        if (arg0 != -21) {
            this.field3443 = null;
        }
        int var4 = this.field3465.field2144.method1049((byte) 94, var3.method1811(arg0 + 24311));
        return this.method1321((byte) 125, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(II)[B")
    public final byte[] method1327(int arg0, int arg1) {
        field3436++;
        if (!this.method1313(arg0 ^ 0x3D08)) {
            return null;
        } else if (this.field3465.field2145.length == 1) {
            return this.method1332(true, arg1, 0);
        } else if (!this.method1321((byte) -105, arg1)) {
            return null;
        } else if (this.field3465.field2145[arg1] == 1) {
            return this.method1332(true, 0, arg1);
        } else if (arg0 == -18782) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZBZ)V")
    public final void method1328(boolean arg0, byte arg1, boolean arg2) {
        field3450++;
        if (!this.method1313(-29782)) {
            return;
        }
        if (arg1 > -87) {
            this.field3453 = null;
        }
        if (arg2) {
            this.field3465.field2149 = null;
            this.field3465.field2151 = null;
        }
        if (arg0) {
            this.field3465.field2137 = null;
            this.field3465.field2144 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIIIBILng;Z)V")
    public static final void method1329(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, class135 arg7, boolean arg8) {
        if (arg5 < 2) {
            field3427 = -93;
        }
        field3438++;
        if (arg2 < 0 || arg2 >= 104 || arg1 < 0 || arg1 >= 104) {
            while (true) {
                int var11 = arg7.method920((byte) 122);
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg7.method920((byte) 91);
                    return;
                }
                if (var11 <= 49) {
                    arg7.method920((byte) 112);
                }
            }
        }
        if (!arg8) {
            class230.field4064[arg3][arg2][arg1] = 0;
        }
        while (true) {
            int var9 = arg7.method920((byte) 43);
            if (var9 == 0) {
                if (arg8) {
                    class279.field4936[0][arg2][arg1] = class83.field1557[0][arg2][arg1];
                    return;
                } else if (arg3 == 0) {
                    class279.field4936[0][arg2][arg1] = -class134.method890(-127, arg1 + arg4 + 556238, 932731 - -arg0 + arg2) * 8;
                    return;
                } else {
                    class279.field4936[arg3][arg2][arg1] = class279.field4936[arg3 - 1][arg2][arg1] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg7.method920((byte) 24);
                if (arg8) {
                    class279.field4936[0][arg2][arg1] = var10 * 8 + class83.field1557[0][arg2][arg1];
                    return;
                }
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg3 != 0) {
                    class279.field4936[arg3][arg2][arg1] = class279.field4936[arg3 - 1][arg2][arg1] - var10 * 8;
                    return;
                }
                class279.field4936[0][arg2][arg1] = -var10 * 8;
                return;
            }
            if (var9 <= 49) {
                class282.field4966[arg3][arg2][arg1] = arg7.method929((byte) -3);
                class283.field4984[arg3][arg2][arg1] = (byte) ((var9 - 2) / 4);
                class81.field1528[arg3][arg2][arg1] = (byte) class203.method1395(3, var9 + arg6 - 2);
            } else if (var9 > 81) {
                class14.field423[arg3][arg2][arg1] = (byte) (var9 - 81);
            } else if (!arg8) {
                class230.field4064[arg3][arg2][arg1] = (byte) (var9 - 49);
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(IB)Z")
    public final boolean method1330(int arg0, byte arg1) {
        field3455++;
        if (!this.method1313(-29782)) {
            return false;
        }
        if (arg1 > -6) {
            this.field3428 = null;
        }
        if (this.field3465.field2145.length == 1) {
            return this.method1310(0, 2, arg0);
        } else if (!this.method1321((byte) 125, arg0)) {
            return false;
        } else if (this.field3465.field2145[arg0] == 1) {
            return this.method1310(arg0, 2, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(IB)I")
    public final int method1331(int arg0, byte arg1) {
        field3459++;
        if (this.method1321((byte) -100, arg0)) {
            if (arg1 <= 95) {
                this.method1304(20, -61, 107);
            }
            return this.field3465.field2145[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZII)[B")
    public final byte[] method1332(boolean arg0, int arg1, int arg2) {
        field3452++;
        return arg0 ? this.method1309(arg1, false, arg2, (int[]) null) : null;
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(III)Z")
    private final boolean method1333(int arg0, int arg1, int arg2) {
        field3442++;
        if (!this.method1313(-29782)) {
            return false;
        }
        if (arg1 < 67) {
            this.field3428 = null;
        }
        if (arg0 >= 0 && arg2 >= 0 && arg0 < this.field3465.field2145.length && this.field3465.field2145[arg0] > arg2) {
            return true;
        } else if (class22.field669) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(Lvf;I)I")
    public final int method1334(class265 arg0, int arg1) {
        field3434++;
        if (!this.method1313(-29782)) {
            return 0;
        }
        if (arg1 != 0) {
            this.method1326((byte) -24, (class265) null);
        }
        class265 var3 = arg0.method1804(123);
        int var4 = this.field3465.field2144.method1049((byte) -57, var3.method1811(24290));
        return this.method1316(var4, -111);
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lmi;ZZ)V")
    public class192(class228 arg0, boolean arg1, boolean arg2) {
        this.field3439 = arg1;
        this.field3447 = arg2;
        this.field3428 = arg0;
    }
}
