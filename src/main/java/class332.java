import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class332 {

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "Lkm;")
    private class121 field4447 = null;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "Z")
    private boolean field4479;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public int field4445;

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "Lpe;")
    private class163 field4453;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "[I")
    public static int[] field4451 = new int[16];

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field4440;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "Ljm;")
    public static class285 field4461;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "[Ljava/lang/Object;")
    private Object[] field4469;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4471;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)Z")
    public final boolean method1931(int arg0, int arg1) {
        field4458++;
        if (!this.method1949(true)) {
            return false;
        } else if (this.field4447.field1576.length == 1) {
            return this.method1962(arg1, 109, 0);
        } else if (!this.method1950(arg1, (byte) 117)) {
            return false;
        } else if (this.field4447.field1576[arg1] == arg0) {
            return this.method1962(0, 113, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V")
    private final void method1932(int arg0, int arg1) {
        if (arg1 != 12176) {
            this.method1963(-111, null);
        }
        field4457++;
        if (this.field4479) {
            this.field4469[arg0] = this.field4453.method1000(arg0, -103);
        } else {
            this.field4469[arg0] = class440.method2477(this.field4453.method1000(arg0, -103), (byte) -70, false);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)I")
    public final int method1933(int arg0) {
        field4444++;
        if (arg0 > -108) {
            field4451 = null;
        }
        return this.method1949(true) ? this.field4447.field1576.length : -1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static void method1934(byte arg0) {
        field4451 = null;
        if (arg0 == 100) {
            field4461 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)I")
    public final int method1935(int arg0) {
        field4480++;
        if (!this.method1949(true)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4469.length; var4++) {
            if (this.field4447.field1570[var4] > 0) {
                var2 += 100;
                var3 += this.method1948(var4, 14112);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return arg0 * var3 / var2;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[III)Z")
    private final boolean method1936(int arg0, int[] arg1, int arg2, int arg3) {
        field4446++;
        if (!this.method1950(arg3, (byte) 104)) {
            return false;
        } else if (this.field4469[arg3] == null) {
            return false;
        } else {
            int var5 = this.field4447.field1570[arg3];
            int[] var6 = this.field4447.field1565[arg3];
            if (this.field4471[arg3] == null) {
                this.field4471[arg3] = new Object[this.field4447.field1576[arg3]];
            }
            Object[] var7 = this.field4471[arg3];
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
            if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
                var11 = class116.method682(this.field4469[arg3], true, (byte) -128);
                class157 var12 = new class157(var11);
                var12.method966(arg1, var12.field2199.length, arg2 ^ 0xC66, 5);
            } else {
                var11 = class116.method682(this.field4469[arg3], false, (byte) -123);
            }
            byte[] var13;
            try {
                var13 = class209.method1326(arg2, var11);
            } catch (RuntimeException var49) {
                throw class407.method2312(var49, "T3 - " + (arg1 != null) + "," + arg3 + "," + var11.length + "," + class77.method420(-3282, var11, var11.length) + "," + class77.method420(-3282, var11, var11.length - 2) + "," + this.field4447.field1562[arg3] + "," + this.field4447.field1583);
            }
            if (this.field4479) {
                this.field4469[arg3] = null;
            }
            if (var5 <= 1) {
                int var48;
                if (var6 == null) {
                    var48 = 0;
                } else {
                    var48 = var6[0];
                }
                if (this.field4445 == 0) {
                    var7[var48] = class440.method2477(var13, (byte) -88, false);
                } else {
                    var7[var48] = var13;
                }
            } else if (this.field4445 == 2) {
                int var31 = var13.length;
                int var51 = var31 - 1;
                int var32 = var13[var51] & 0xFF;
                int var33 = var51 - var5 * var32 * 4;
                class157 var34 = new class157(var13);
                int var35 = 0;
                int var36 = 0;
                var34.field2219 = var33;
                for (int var37 = 0; var37 < var32; var37++) {
                    int var38 = 0;
                    for (int var39 = 0; var39 < var5; var39++) {
                        var38 += var34.method908(false);
                        int var40;
                        if (var6 == null) {
                            var40 = var39;
                        } else {
                            var40 = var6[var39];
                        }
                        if (arg0 == var40) {
                            var36 = var40;
                            var35 += var38;
                        }
                    }
                }
                if (var35 == 0) {
                    return true;
                }
                byte[] var41 = new byte[var35];
                var34.field2219 = var33;
                int var42 = 0;
                int var43 = 0;
                for (int var44 = 0; var44 < var32; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var34.method908(false);
                        int var47;
                        if (var6 == null) {
                            var47 = var46;
                        } else {
                            var47 = var6[var46];
                        }
                        if (arg0 == var47) {
                            class2.method9(var13, var43, var41, var42, var45);
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
                class157 var18 = new class157(var13);
                var18.field2219 = var17;
                int[] var19 = new int[var5];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var18.method908(false);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var18.field2219 = var17;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var18.method908(false);
                        class2.method9(var13, var25, var23[var28], var19[var28], var27);
                        var19[var28] += var27;
                        var25 += var27;
                    }
                }
                for (int var29 = 0; var29 < var5; var29++) {
                    int var30;
                    if (var6 == null) {
                        var30 = var29;
                    } else {
                        var30 = var6[var29];
                    }
                    if (this.field4445 == 0) {
                        var7[var30] = class440.method2477(var23[var29], (byte) -123, false);
                    } else {
                        var7[var30] = var23[var29];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([IIII)[B")
    public final byte[] method1937(int[] arg0, int arg1, int arg2, int arg3) {
        field4468++;
        if (!this.method1952(arg2, arg3, arg1)) {
            return null;
        }
        if (this.field4471[arg1] == null || this.field4471[arg1][arg2] == null) {
            boolean var5 = this.method1936(arg2, arg0, arg3, arg1);
            if (!var5) {
                this.method1932(arg1, 12176);
                boolean var6 = this.method1936(arg2, arg0, 0, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class116.method682(this.field4471[arg1][arg2], false, (byte) -85);
        if (this.field4445 == 1) {
            this.field4471[arg1][arg2] = null;
            if (this.field4447.field1576[arg1] == 1) {
                this.field4471[arg1] = null;
            }
        } else if (this.field4445 == 2) {
            this.field4471[arg1] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)[B")
    public final byte[] method1938(int arg0, int arg1, int arg2) {
        field4477++;
        return arg2 == -17 ? this.method1937(null, arg1, arg0, 0) : null;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)I")
    public final int method1939(int arg0, int arg1) {
        if (arg0 == 0) {
            field4476++;
            return this.method1950(arg1, (byte) 110) ? this.field4447.field1576[arg1] : 0;
        } else {
            return 36;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method1940(byte arg0, String arg1) {
        field4467++;
        if (!this.method1949(true)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field4447.field1563.method1908(class324.method1883((byte) -103, var3), 0);
        this.method1941(var4, arg0 - 16980);
        if (arg0 != 120) {
            this.field4445 = -71;
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(II)V")
    private final void method1941(int arg0, int arg1) {
        if (arg1 == -16860) {
            field4462++;
            this.field4453.method1004(arg0, (byte) 118);
        }
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(II)I")
    public final int method1942(int arg0, int arg1) {
        field4439++;
        if (!this.method1949(true)) {
            return -1;
        }
        int var3 = this.field4447.field1563.method1908(arg1, 0);
        if (arg0 >= -90) {
            return 51;
        } else if (this.method1950(var3, (byte) 120)) {
            return var3;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1943(String arg0, int arg1) {
        field4450++;
        if (this.method1949(true)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4447.field1563.method1908(class324.method1883((byte) -75, var3), 0);
            return ~var4 <= arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZBZ)V")
    public final void method1944(boolean arg0, byte arg1, boolean arg2) {
        field4470++;
        if (arg1 < 29 || !this.method1949(true)) {
            return;
        }
        if (arg2) {
            this.field4447.field1574 = null;
            this.field4447.field1580 = null;
        }
        if (arg0) {
            this.field4447.field1563 = null;
            this.field4447.field1566 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
    public final boolean method1945(String arg0, int arg1, String arg2) {
        field4472++;
        if (!this.method1949(true)) {
            return false;
        }
        if (arg1 >= -26) {
            this.field4469 = null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field4447.field1563.method1908(class324.method1883((byte) -75, var4), 0);
        if (var6 < 0) {
            return false;
        } else {
            int var7 = this.field4447.field1574[var6].method1908(class324.method1883((byte) -81, var5), 0);
            return var7 >= 0;
        }
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(II)[B")
    public final byte[] method1946(int arg0, int arg1) {
        field4466++;
        if (!this.method1949(true)) {
            return null;
        } else if (this.field4447.field1576.length == 1) {
            return this.method1938(arg1, 0, -17);
        } else if (!this.method1950(arg1, (byte) 127)) {
            return null;
        } else if (this.field4447.field1576[arg1] == 1) {
            return this.method1938(0, arg1, -17);
        } else if (arg0 == 0) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method1947(int arg0, String arg1, String arg2) {
        if (arg0 != 5) {
            this.method1938(-101, 41, -14);
        }
        field4475++;
        if (!this.method1949(true)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field4447.field1563.method1908(class324.method1883((byte) -75, var4), 0);
        if (this.method1950(var6, (byte) 125)) {
            int var7 = this.field4447.field1574[var6].method1908(class324.method1883((byte) -92, var5), 0);
            return this.method1938(var7, var6, -17);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(II)I")
    private final int method1948(int arg0, int arg1) {
        field4449++;
        if (!this.method1950(arg0, (byte) 118)) {
            return 0;
        } else if (arg1 == 14112) {
            return this.field4469[arg0] == null ? this.field4453.method1001(arg0, (byte) -79) : 100;
        } else {
            return -35;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)Z")
    private final boolean method1949(boolean arg0) {
        field4442++;
        if (!arg0) {
            this.method1945(null, -36, null);
        }
        if (this.field4447 == null) {
            this.field4447 = this.field4453.method999(0);
            if (this.field4447 == null) {
                return false;
            }
            this.field4471 = new Object[this.field4447.field1564][];
            this.field4469 = new Object[this.field4447.field1564];
        }
        return true;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)Z")
    private final boolean method1950(int arg0, byte arg1) {
        if (arg1 <= 101) {
            this.method1945(null, -52, null);
        }
        field4478++;
        if (!this.method1949(true)) {
            return false;
        } else if (arg0 >= 0 && this.field4447.field1576.length > arg0 && this.field4447.field1576[arg0] != 0) {
            return true;
        } else if (class693.field9766) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public final void method1951(int arg0) {
        if (this.field4471 != null) {
            for (int var2 = 0; var2 < this.field4471.length; var2++) {
                this.field4471[var2] = null;
            }
        }
        field4448++;
        int var3 = 105 % ((-arg0 - 4) / 56);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)Z")
    private final boolean method1952(int arg0, int arg1, int arg2) {
        field4464++;
        if (!this.method1949(true)) {
            return false;
        } else if (arg2 >= arg1 && arg0 >= 0 && this.field4447.field1576.length > arg2 && arg0 < this.field4447.field1576[arg2]) {
            return true;
        } else if (class693.field9766) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)Z")
    public final boolean method1953(int arg0) {
        field4460++;
        if (arg0 < 119) {
            this.method1948(-70, -6);
        }
        if (!this.method1949(true)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field4447.field1569.length; var3++) {
            int var4 = this.field4447.field1569[var3];
            if (this.field4469[var4] == null) {
                this.method1932(var4, 12176);
                if (this.field4469[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "(II)[I")
    public final int[] method1954(int arg0, int arg1) {
        field4455++;
        if (!this.method1950(arg1, (byte) 108)) {
            return null;
        }
        if (arg0 != 0) {
            this.field4471 = null;
        }
        int[] var3 = this.field4447.field1565[arg1];
        if (var3 == null) {
            var3 = new int[this.field4447.field1570[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    private final boolean method1955(String arg0, String arg1, int arg2) {
        field4441++;
        int var4 = 56 / ((arg2 - 30) / 43);
        if (!this.method1949(true)) {
            return false;
        }
        String var5 = arg0.toLowerCase();
        String var6 = arg1.toLowerCase();
        int var7 = this.field4447.field1563.method1908(class324.method1883((byte) -122, var5), 0);
        if (this.method1950(var7, (byte) 110)) {
            int var8 = this.field4447.field1574[var7].method1908(class324.method1883((byte) -111, var6), 0);
            return this.method1962(var8, 125, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)I")
    public final int method1956(int arg0) {
        if (arg0 > -126) {
            this.field4479 = false;
        }
        field4440++;
        if (!this.method1949(true)) {
            throw new IllegalStateException("");
        }
        return this.field4447.field1583;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BI)V")
    public final void method1957(byte arg0, int arg1) {
        field4463++;
        if (!this.method1950(arg1, (byte) 111)) {
            return;
        }
        if (this.field4471 != null) {
            this.field4471[arg1] = null;
        }
        if (arg0 != -68) {
            this.field4469 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
    public final void method1958(int arg0) {
        if (this.field4469 != null) {
            for (int var2 = 0; var2 < this.field4469.length; var2++) {
                this.field4469[var2] = null;
            }
        }
        if (arg0 == -29002) {
            field4454++;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method1959(int arg0, String arg1) {
        if (arg0 != 5743) {
            return -59;
        }
        field4473++;
        if (this.method1949(true)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field4447.field1563.method1908(class324.method1883((byte) -101, var3), 0);
            return this.method1950(var4, (byte) 116) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(BI)Z")
    public final boolean method1960(byte arg0, int arg1) {
        field4452++;
        int var3 = 58 / ((arg0 + 32) / 55);
        if (!this.method1950(arg1, (byte) 127)) {
            return false;
        } else if (this.field4469[arg1] == null) {
            this.method1932(arg1, 12176);
            return this.field4469[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public final boolean method1961(String arg0, boolean arg1) {
        if (arg1) {
            method1934((byte) 94);
        }
        field4459++;
        if (this.method1949(true)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4447.field1563.method1908(class324.method1883((byte) -120, var3), 0);
            return this.method1960((byte) -112, var4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(III)Z")
    public final boolean method1962(int arg0, int arg1, int arg2) {
        field4465++;
        if (!this.method1952(arg0, 0, arg2)) {
            return false;
        } else if (this.field4471[arg2] != null && this.field4471[arg2][arg0] != null) {
            return true;
        } else if (this.field4469[arg2] == null) {
            this.method1932(arg2, 12176);
            if (arg1 <= 107) {
                return true;
            } else {
                return this.field4469[arg2] != null;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1963(int arg0, String arg1) {
        field4474++;
        int var3 = this.method1959(5743, "");
        if (var3 == -1) {
            int var4 = 81 / ((9 - arg0) / 34);
            return this.method1955(arg1, "", -31);
        } else {
            return this.method1955("", arg1, 79);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method1964(String arg0, byte arg1) {
        field4456++;
        if (!this.method1949(true)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 >= -17) {
            return -102;
        } else {
            int var4 = this.field4447.field1563.method1908(class324.method1883((byte) -66, var3), 0);
            return this.method1948(var4, 14112);
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lpe;ZI)V")
    public class332(class163 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field4479 = arg1;
        this.field4445 = arg2;
        this.field4453 = arg0;
    }
}
