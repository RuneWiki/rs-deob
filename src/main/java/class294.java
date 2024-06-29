import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class294 {

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "Lrk;")
    private class277 field4635 = null;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "Lqk;")
    private class213 field4626;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "Z")
    private boolean field4643;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "Z")
    private boolean field4663;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field4647 = 0;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "J")
    public static long field4642 = 0L;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    public static int field4651;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "[Ljava/lang/Object;")
    private Object[] field4632;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4644;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)[B")
    public final byte[] method1942(int arg0, int arg1) {
        if (arg1 != 27157) {
            return null;
        }
        field4654++;
        if (!this.method1949(arg1 - 27214)) {
            return null;
        } else if (this.field4635.field4180.length == 1) {
            return this.method1973(1, 0, arg0);
        } else if (!this.method1952(false, arg0)) {
            return null;
        } else if (this.field4635.field4180[arg0] == 1) {
            return this.method1973(1, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)Z")
    public static final boolean method1943(byte arg0, int arg1) {
        field4625++;
        if (class220.field3307[arg1]) {
            return true;
        } else if (class154.field2312.method1948((byte) -127, arg1)) {
            int var2 = class154.field2312.method1976(1, arg1);
            if (var2 == 0) {
                class220.field3307[arg1] = true;
                return true;
            }
            if (arg0 < 93) {
                method1970((class248) null, true);
            }
            if (class234.field3532[arg1] == null) {
                class234.field3532[arg1] = new class289[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class234.field3532[arg1][var3] == null) {
                    byte[] var4 = class154.field2312.method1973(1, arg1, var3);
                    if (var4 != null) {
                        class289 var5 = class234.field3532[arg1][var3] = new class289();
                        var5.field4504 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1919(new class248(var4), 95);
                        } else {
                            var5.method1923(62, new class248(var4));
                        }
                    }
                }
            }
            class220.field3307[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1944(String arg0, int arg1) {
        field4650++;
        if (arg1 >= -17) {
            this.method1968((String) null, 95);
        }
        if (this.method1949(-64)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4635.field4175.method457(13672, class90.method579(var3, (byte) 44));
            return this.method1948((byte) -120, var4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZIZ)V")
    public final void method1945(boolean arg0, int arg1, boolean arg2) {
        field4641++;
        if (arg1 <= 103 || !this.method1949(-59)) {
            return;
        }
        if (arg0) {
            this.field4635.field4175 = null;
            this.field4635.field4165 = null;
        }
        if (arg2) {
            this.field4635.field4181 = null;
            this.field4635.field4167 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)[I")
    public final int[] method1946(int arg0, int arg1) {
        field4645++;
        if (!this.method1952(false, arg1)) {
            return null;
        }
        if (arg0 != 0) {
            this.field4632 = null;
        }
        int[] var3 = this.field4635.field4168[arg1];
        if (var3 == null) {
            var3 = new int[this.field4635.field4172[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILmi;IZLmi;)I")
    public static final int method1947(int arg0, class266 arg1, int arg2, boolean arg3, class266 arg4) {
        field4661++;
        if (arg2 == 1) {
            int var5 = arg4.field340;
            int var6 = arg1.field340;
            if (!arg3) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class189.method1190(true, arg1.method1769(arg0 + 16418).field788, arg4.method1769(16518).field788, class48.field780);
        } else if (arg2 != 3) {
            if (arg0 != 100) {
                field4647 = 46;
            }
            if (arg2 == 4) {
                if (arg4.method168((byte) 93)) {
                    return arg1.method168((byte) 93) ? 0 : 1;
                } else if (arg1.method168((byte) 93)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg2 == 5) {
                if (arg4.method172(false)) {
                    return arg1.method172(false) ? 0 : 1;
                } else if (arg1.method172(false)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg2 == 6) {
                if (arg4.method173(arg0 ^ 0x60)) {
                    return arg1.method173(4) ? 0 : 1;
                } else if (arg1.method173(4)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg2 != 7) {
                return arg4.field4013 - arg1.field4013;
            } else if (arg4.method167(125)) {
                return arg1.method167(arg0 + 18) ? 0 : 1;
            } else if (arg1.method167(124)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4.field4009.equals("-")) {
            if (arg1.field4009.equals("-")) {
                return 0;
            } else if (arg3) {
                return -1;
            } else {
                return 1;
            }
        } else if (arg1.field4009.equals("-")) {
            return arg3 ? 1 : -1;
        } else {
            return class189.method1190(true, arg1.field4009, arg4.field4009, class48.field780);
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(BI)Z")
    private final boolean method1948(byte arg0, int arg1) {
        field4664++;
        if (!this.method1952(false, arg1)) {
            return false;
        } else if (this.field4632[arg1] == null) {
            this.method1961(arg1, -63);
            if (this.field4632[arg1] == null) {
                return arg0 >= -119 ? false : false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)Z")
    private final boolean method1949(int arg0) {
        field4636++;
        if (this.field4635 == null) {
            this.field4635 = this.field4626.method1359((byte) 106);
            if (this.field4635 == null) {
                return false;
            }
            this.field4644 = new Object[this.field4635.field4171][];
            this.field4632 = new Object[this.field4635.field4171];
        }
        return arg0 < -41;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)I")
    private final int method1950(int arg0, int arg1) {
        field4646++;
        if (!this.method1952(false, arg1)) {
            return 0;
        } else if (this.field4632[arg1] == null) {
            return arg0 == -29363 ? this.field4626.method1365(arg1, (byte) -66) : -105;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(II)V")
    public final void method1951(int arg0, int arg1) {
        field4649++;
        if (this.method1952(false, arg1) && arg0 >= 65 && this.field4644 != null) {
            this.field4644[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)Z")
    private final boolean method1952(boolean arg0, int arg1) {
        if (arg0) {
            return false;
        }
        field4660++;
        if (!this.method1949(-93)) {
            return false;
        } else if (arg1 >= 0 && this.field4635.field4180.length > arg1 && this.field4635.field4180[arg1] != 0) {
            return true;
        } else if (class81.field1309) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIII)I")
    public static final int method1953(int arg0, int arg1, int arg2, int arg3) {
        field4655++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            int var5 = -64 / ((-arg3 - 50) / 61);
            return arg2;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)I")
    public final int method1954(boolean arg0) {
        field4652++;
        if (!this.method1949(-69)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4632.length; var4++) {
            if (this.field4635.field4172[var4] > 0) {
                var2 += this.method1950(-29363, var4);
                var3 += 100;
            }
        }
        if (var3 == 0) {
            return 100;
        } else {
            if (arg0) {
                this.method1972((String) null, (String) null, (byte) 5);
            }
            return var2 * 100 / var3;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Ljava/lang/String;I)V")
    public final void method1955(String arg0, int arg1) {
        field4629++;
        if (!this.method1949(-71)) {
            return;
        }
        if (arg1 != 26544) {
            this.method1963(80, 58);
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field4635.field4175.method457(arg1 ^ 0x52D8, class90.method579(var3, (byte) 44));
        this.method1963(var4, 127);
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
    public final void method1956(int arg0) {
        if (this.field4644 != null) {
            for (int var2 = 0; var2 < this.field4644.length; var2++) {
                this.field4644[var2] = null;
            }
        }
        field4639++;
        if (arg0 != 1) {
            this.field4644 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
    public final byte[] method1957(String arg0, byte arg1, String arg2) {
        int var4 = 90 / ((arg1 - 69) / 39);
        field4630++;
        if (!this.method1949(-81)) {
            return null;
        }
        String var5 = arg2.toLowerCase();
        String var6 = arg0.toLowerCase();
        int var7 = this.field4635.field4175.method457(13672, class90.method579(var5, (byte) 44));
        if (this.method1952(false, var7)) {
            int var8 = this.field4635.field4181[var7].method457(13672, class90.method579(var6, (byte) 44));
            return this.method1973(1, var7, var8);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([IIII)[B")
    public final byte[] method1958(int[] arg0, int arg1, int arg2, int arg3) {
        field4667++;
        if (arg2 < 111) {
            this.field4643 = false;
        }
        if (!this.method1964(arg1, (byte) 82, arg3)) {
            return null;
        }
        if (this.field4644[arg3] == null || this.field4644[arg3][arg1] == null) {
            boolean var5 = this.method1975(arg3, arg0, (byte) 81);
            if (!var5) {
                this.method1961(arg3, -63);
                boolean var6 = this.method1975(arg3, arg0, (byte) -109);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class186.method1155(0, this.field4644[arg3][arg1], false);
        if (this.field4663) {
            this.field4644[arg3][arg1] = null;
            if (this.field4635.field4180[arg3] == 1) {
                this.field4644[arg3] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIILsk;Lsk;IIJ)V")
    public static final void method1959(int arg0, int arg1, int arg2, int arg3, class114 arg4, class114 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class162 var10 = new class162();
        var10.field2496 = arg8;
        var10.field2483 = arg1 * 128 + 64;
        var10.field2495 = arg2 * 128 + 64;
        var10.field2491 = arg3;
        var10.field2489 = arg4;
        var10.field2478 = arg5;
        var10.field2476 = arg6;
        var10.field2477 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class33.field487[var11][arg1][arg2] == null) {
                class33.field487[var11][arg1][arg2] = new class270(var11, arg1, arg2);
            }
        }
        class33.field487[arg0][arg1][arg2].field4084 = var10;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)Z")
    public final boolean method1960(int arg0, byte arg1) {
        field4659++;
        if (!this.method1949(-79)) {
            return false;
        } else if (this.field4635.field4180.length == 1) {
            return this.method1969(0, -120, arg0);
        } else if (this.method1952(false, arg0)) {
            if (arg1 <= 114) {
                this.field4644 = null;
            }
            if (this.field4635.field4180[arg0] != 1) {
                throw new RuntimeException();
            }
            return this.method1969(arg0, -124, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(II)V")
    private final void method1961(int arg0, int arg1) {
        field4651++;
        if (arg1 != -63) {
            field4642 = -117L;
        }
        if (this.field4643) {
            this.field4632[arg0] = this.field4626.method1363((byte) 119, arg0);
        } else {
            this.field4632[arg0] = class243.method1536(36, this.field4626.method1363((byte) 98, arg0), false);
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)I")
    public final int method1962(boolean arg0) {
        if (!arg0) {
            field4642 = 6L;
        }
        field4657++;
        return this.method1949(-126) ? this.field4635.field4180.length : -1;
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(II)V")
    private final void method1963(int arg0, int arg1) {
        field4656++;
        if (arg1 < 120) {
            this.method1966(45);
        }
        this.field4626.method1364(1, arg0);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBI)Z")
    private final boolean method1964(int arg0, byte arg1, int arg2) {
        field4653++;
        if (arg1 < 46) {
            this.field4663 = false;
        }
        if (!this.method1949(-73)) {
            return false;
        } else if (arg2 >= 0 && arg0 >= 0 && this.field4635.field4180.length > arg2 && arg0 < this.field4635.field4180[arg2]) {
            return true;
        } else if (class81.field1309) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(Ljava/lang/String;I)I")
    public final int method1965(String arg0, int arg1) {
        field4666++;
        if (!this.method1949(-89)) {
            return -1;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 > -75) {
            return 118;
        } else {
            int var4 = this.field4635.field4175.method457(13672, class90.method579(var3, (byte) 44));
            return this.method1952(false, var4) ? var4 : -1;
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)I")
    public final int method1966(int arg0) {
        if (arg0 != 20254) {
            this.field4643 = true;
        }
        field4638++;
        if (!this.method1949(-64)) {
            throw new IllegalStateException("");
        }
        return this.field4635.field4169;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)Z")
    public final boolean method1967(byte arg0) {
        field4637++;
        if (!this.method1949(-106)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field4635.field4174.length; var3++) {
            int var4 = this.field4635.field4174[var3];
            if (this.field4632[var4] == null) {
                this.method1961(var4, -63);
                if (this.field4632[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 >= -98) {
            field4647 = -110;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1968(String arg0, int arg1) {
        field4634++;
        if (!this.method1949(-98)) {
            return false;
        }
        if (arg1 != -1) {
            this.field4632 = null;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field4635.field4175.method457(13672, class90.method579(var3, (byte) 44));
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)Z")
    public final boolean method1969(int arg0, int arg1, int arg2) {
        field4648++;
        if (!this.method1964(arg2, (byte) 69, arg0)) {
            return false;
        } else if (this.field4644[arg0] != null && this.field4644[arg0][arg2] != null) {
            return true;
        } else if (this.field4632[arg0] != null) {
            return true;
        } else if (arg1 > -115) {
            return false;
        } else {
            this.method1961(arg0, -63);
            return this.field4632[arg0] != null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lfl;Z)V")
    public static final void method1970(class248 arg0, boolean arg1) {
        field4631++;
        int var2 = class221.field3325 >> 2 << 10;
        int var3 = class85.field1367 >> 1;
        byte[][] var4 = new byte[class106.field1616][class99.field1564];
        while (arg0.field3748 < arg0.field3723.length) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg0.method1593((byte) 27) == 1) {
                var34 = arg0.method1593((byte) 27);
                var33 = true;
                var35 = arg0.method1593((byte) 27);
            }
            int var36 = arg0.method1593((byte) 27);
            int var37 = arg0.method1593((byte) 27);
            int var38 = var36 * 64 - class119.field1798;
            int var39 = class99.field1564 + class79.field1274 - var37 * 64 - 1;
            if (var38 >= 0 && (var39 - 63) >= 0 && class106.field1616 > (var38 + 63) && var39 < class99.field1564) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var38 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || var34 * 8 <= var40 && (var34 * 8 + 8) > var40 && var42 >= var35 * 8 && var42 < var35 * 8 + 8) {
                            var41[var39 - var42] = arg0.method1604(4);
                        }
                    }
                }
            } else if (var33) {
                arg0.field3748 += 64;
            } else {
                arg0.field3748 += 4096;
            }
        }
        if (arg1) {
            field4642 = -127L;
        }
        int var5 = class106.field1616;
        int var6 = class99.field1564;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var27 < var5) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class281 var29 = class270.method1802(var28 - 1, (byte) -88);
                        var7[var13] += var29.field4206;
                        var8[var13] += var29.field4209;
                        var9[var13] += var29.field4204;
                        var11[var13] += var29.field4198;
                        var10002 = var10[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class281 var32 = class270.method1802(var31 - 1, (byte) -88);
                        var7[var13] -= var32.field4206;
                        var8[var13] -= var32.field4209;
                        var9[var13] -= var32.field4204;
                        var11[var13] -= var32.field4198;
                        var10002 = var10[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int[][] var16 = class296.field4687[var12 >> 6];
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    if (var6 > var21) {
                        var15 += var8[var21];
                        var14 += var7[var21];
                        var17 += var10[var21];
                        var18 += var9[var21];
                        var19 += var11[var21];
                    }
                    int var22 = var20 - 5;
                    if (var22 >= 0) {
                        var18 -= var9[var22];
                        var14 -= var7[var22];
                        var17 -= var10[var22];
                        var19 -= var11[var22];
                        var15 -= var8[var22];
                    }
                    if (var20 >= 0 && var17 > 0) {
                        int[] var23 = var16[var20 >> 6];
                        int var24 = var19 == 0 ? 0 : class143.method876(var15 / var17, (byte) -119, var18 / var17, var14 * 256 / var19);
                        if (var4[var12][var20] != 0) {
                            int var25 = (var24 & 0x7F) + var3;
                            if (var23 == null) {
                                var23 = var16[var20 >> 6] = new int[4096];
                            }
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var2 + var24 & 0xFC00) + (var24 & 0x380) + var25;
                            var23[class94.method598(4032, var20 << 6) + class94.method598(63, var12)] = class249.field3766[class296.method1987(65408, var26, 96)];
                        } else if (var23 != null) {
                            var23[class94.method598(var12, 63) + class94.method598(var20 << 6, 4032)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(Ljava/lang/String;I)I")
    public final int method1971(String arg0, int arg1) {
        field4665++;
        if (!this.method1949(-109)) {
            return 0;
        }
        if (arg1 != 0) {
            this.field4663 = true;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field4635.field4175.method457(13672, class90.method579(var3, (byte) 44));
        return this.method1950(-29363, var4);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
    public final boolean method1972(String arg0, String arg1, byte arg2) {
        field4627++;
        if (!this.method1949(-57)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field4635.field4175.method457(13672, class90.method579(var4, (byte) 44));
        if (arg2 > -84) {
            this.method1975(88, (int[]) null, (byte) 30);
        }
        if (this.method1952(false, var6)) {
            int var7 = this.field4635.field4181[var6].method457(13672, class90.method579(var5, (byte) 44));
            return this.method1969(var6, -116, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)[B")
    public final byte[] method1973(int arg0, int arg1, int arg2) {
        if (arg0 == 1) {
            field4628++;
            return this.method1958((int[]) null, arg2, 113, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZI)[B")
    public final byte[] method1974(int arg0, boolean arg1, int arg2) {
        field4662++;
        if (!this.method1964(arg2, (byte) 114, arg0)) {
            return null;
        }
        if (this.field4644[arg0] == null || this.field4644[arg0][arg2] == null) {
            boolean var4 = this.method1975(arg0, (int[]) null, (byte) -106);
            if (!var4) {
                this.method1961(arg0, -63);
                boolean var5 = this.method1975(arg0, (int[]) null, (byte) 27);
                if (!var5) {
                    return null;
                }
            }
        }
        if (!arg1) {
            this.field4626 = null;
        }
        return class186.method1155(0, this.field4644[arg0][arg2], false);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[IB)Z")
    private final boolean method1975(int arg0, int[] arg1, byte arg2) {
        field4640++;
        if (!this.method1952(false, arg0)) {
            return false;
        } else if (this.field4632[arg0] == null) {
            return false;
        } else {
            int var4 = 44 / ((-arg2 - 68) / 38);
            int var5 = this.field4635.field4172[arg0];
            boolean var6 = true;
            int[] var7 = this.field4635.field4168[arg0];
            if (this.field4644[arg0] == null) {
                this.field4644[arg0] = new Object[this.field4635.field4180[arg0]];
            }
            Object[] var8 = this.field4644[arg0];
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var7 == null) {
                    var10 = var9;
                } else {
                    var10 = var7[var9];
                }
                if (var8[var10] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var11;
            if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
                var11 = class186.method1155(0, this.field4632[arg0], false);
            } else {
                var11 = class186.method1155(0, this.field4632[arg0], true);
                class248 var12 = new class248(var11);
                var12.method1614(false, arg1, var12.field3723.length, 5);
            }
            byte[] var13;
            try {
                var13 = class26.method163(var11, (byte) -117);
            } catch (RuntimeException var32) {
                throw class81.method536(var32, "T3 - " + (arg1 != null) + "," + arg0 + "," + var11.length + "," + class167.method1043((byte) -26, var11.length, var11) + "," + class167.method1043((byte) -115, var11.length - 2, var11) + "," + this.field4635.field4176[arg0] + "," + this.field4635.field4169);
            }
            if (this.field4643) {
                this.field4632[arg0] = null;
            }
            if (var5 > 1) {
                int var15 = var13.length;
                int var33 = var15 - 1;
                int var16 = var13[var33] & 0xFF;
                int[] var17 = new int[var5];
                class248 var18 = new class248(var13);
                int var19 = var33 - var5 * var16 * 4;
                var18.field3748 = var19;
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var5; var22++) {
                        var21 += var18.method1576(-17672);
                        var17[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var5][];
                for (int var24 = 0; var24 < var5; var24++) {
                    var23[var24] = new byte[var17[var24]];
                    var17[var24] = 0;
                }
                var18.field3748 = var19;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var5; var28++) {
                        var27 += var18.method1576(-17672);
                        class193.method1210(var13, var25, var23[var28], var17[var28], var27);
                        var17[var28] += var27;
                        var25 += var27;
                    }
                }
                for (int var29 = 0; var29 < var5; var29++) {
                    int var30;
                    if (var7 == null) {
                        var30 = var29;
                    } else {
                        var30 = var7[var29];
                    }
                    if (this.field4663) {
                        var8[var30] = var23[var29];
                    } else {
                        var8[var30] = class243.method1536(36, var23[var29], false);
                    }
                }
            } else {
                int var31;
                if (var7 == null) {
                    var31 = 0;
                } else {
                    var31 = var7[0];
                }
                if (this.field4663) {
                    var8[var31] = var13;
                } else {
                    var8[var31] = class243.method1536(36, var13, false);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lqk;ZZ)V")
    public class294(class213 arg0, boolean arg1, boolean arg2) {
        this.field4626 = arg0;
        this.field4643 = arg1;
        this.field4663 = arg2;
    }

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "(II)I")
    public final int method1976(int arg0, int arg1) {
        field4633++;
        if (arg0 != 1) {
            this.method1957((String) null, (byte) -18, (String) null);
        }
        return this.method1952(false, arg1) ? this.field4635.field4180[arg1] : 0;
    }
}
