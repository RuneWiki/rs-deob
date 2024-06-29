import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class48 {

    @OriginalMember(owner = "client!hia", name = "m", descriptor = "I")
    public int field544 = -1;

    @OriginalMember(owner = "client!hia", name = "K", descriptor = "I")
    public int field567 = 0;

    @OriginalMember(owner = "client!hia", name = "v", descriptor = "Ljava/lang/String;")
    public String field553 = null;

    @OriginalMember(owner = "client!hia", name = "S", descriptor = "I")
    public int field575 = -1;

    @OriginalMember(owner = "client!hia", name = "D", descriptor = "I")
    public static int field560 = -1;

    @OriginalMember(owner = "client!hia", name = "G", descriptor = "Ljk;")
    public static class788 field563 = new class788("game4", 3);

    @OriginalMember(owner = "client!hia", name = "Q", descriptor = "Laf;")
    public static class39 field573 = new class39(8);

    @OriginalMember(owner = "client!hia", name = "U", descriptor = "Z")
    public static boolean field577 = false;

    @OriginalMember(owner = "client!hia", name = "d", descriptor = "B")
    public byte field535;

    @OriginalMember(owner = "client!hia", name = "k", descriptor = "B")
    public byte field542;

    @OriginalMember(owner = "client!hia", name = "C", descriptor = "B")
    public byte field559;

    @OriginalMember(owner = "client!hia", name = "O", descriptor = "B")
    public byte field571;

    @OriginalMember(owner = "client!hia", name = "c", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!hia", name = "g", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!hia", name = "h", descriptor = "I")
    public int field539;

    @OriginalMember(owner = "client!hia", name = "i", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!hia", name = "l", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!hia", name = "p", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!hia", name = "q", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!hia", name = "s", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!hia", name = "t", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!hia", name = "u", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!hia", name = "w", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!hia", name = "y", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!hia", name = "z", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!hia", name = "E", descriptor = "I")
    public int field561;

    @OriginalMember(owner = "client!hia", name = "F", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!hia", name = "I", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!hia", name = "J", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!hia", name = "L", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!hia", name = "M", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!hia", name = "N", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!hia", name = "P", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!hia", name = "R", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!hia", name = "T", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!hia", name = "V", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!hia", name = "e", descriptor = "J")
    public long field536;

    @OriginalMember(owner = "client!hia", name = "o", descriptor = "Llk;")
    private class638 field546;

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "Z")
    private boolean field533;

    @OriginalMember(owner = "client!hia", name = "x", descriptor = "Z")
    public boolean field555;

    @OriginalMember(owner = "client!hia", name = "X", descriptor = "Z")
    private boolean field580;

    @OriginalMember(owner = "client!hia", name = "H", descriptor = "[B")
    public byte[] field564;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "[I")
    private int[] field532;

    @OriginalMember(owner = "client!hia", name = "r", descriptor = "[I")
    private int[] field549;

    @OriginalMember(owner = "client!hia", name = "W", descriptor = "[I")
    public static int[] field579;

    @OriginalMember(owner = "client!hia", name = "j", descriptor = "[J")
    private long[] field541;

    @OriginalMember(owner = "client!hia", name = "n", descriptor = "[J")
    private long[] field545;

    @OriginalMember(owner = "client!hia", name = "f", descriptor = "[Ljava/lang/String;")
    public String[] field537;

    @OriginalMember(owner = "client!hia", name = "A", descriptor = "[Ljava/lang/String;")
    public String[] field558;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(Ljava/lang/String;II)Z")
    public final boolean method389(String arg0, int arg1, int arg2) {
        if (arg0 == null) {
            arg0 = "";
        } else if (arg0.length() > 80) {
            arg0 = arg0.substring(0, 80);
        }
        if (arg1 != -1) {
            return true;
        }
        field547++;
        if (this.field546 == null) {
            this.field546 = new class638(4);
        } else {
            class69 var4 = this.field546.method3669(false, (long) arg2);
            if (var4 != null) {
                if (var4 instanceof class282) {
                    class282 var5 = (class282) var4;
                    if (var5.field4042.equals(arg0)) {
                        return false;
                    }
                    var5.field4042 = arg0;
                    return true;
                }
                var4.method527(-11229);
            }
        }
        this.field546.method3666((byte) 65, (long) arg2, new class282(arg0));
        return true;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(BII)I")
    public final int method390(byte arg0, int arg1, int arg2) {
        field550++;
        if (arg0 == 126 || arg0 == 127) {
            return -1;
        }
        if (arg1 != -2453) {
            this.field567 = -18;
        }
        if (this.field575 == arg2 && (this.field544 == -1 || this.field564[this.field544] < 125)) {
            return -1;
        } else if (this.field564[arg2] == arg0) {
            return -1;
        } else {
            this.field564[arg2] = arg0;
            this.method395(arg1 + 2570);
            return arg2;
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(II)Ljava/lang/Integer;")
    public final Integer method391(int arg0, int arg1) {
        if (arg0 <= 121) {
            this.field571 = -7;
        }
        field554++;
        if (this.field546 == null) {
            return null;
        } else {
            class69 var3 = this.field546.method3669(false, (long) arg1);
            return var3 != null && var3 instanceof class324 ? Integer.valueOf(((class324) var3).field4575) : null;
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(Ljava/lang/String;IJ)V")
    public final void method392(String arg0, int arg1, long arg2) {
        field565++;
        if (arg0 != null && arg0.length() == 0) {
            arg0 = null;
        }
        if (this.field580 == arg2 <= 0L) {
            throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.field580 + " but userhash:" + arg2);
        }
        if (arg1 != -1) {
            this.field539 = 13;
        }
        if (arg0 == null == this.field533) {
            throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.field533 + " but displayname:" + arg0);
        }
        if (arg2 > 0L && (this.field545 == null || this.field539 >= this.field545.length) || arg0 != null && (this.field558 == null || this.field539 >= this.field558.length)) {
            this.method407(-87, this.field539 + 5);
        }
        if (this.field545 != null) {
            this.field545[this.field539] = arg2;
        }
        if (this.field558 != null) {
            this.field558[this.field539] = arg0;
        }
        this.field539++;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)[I")
    public final int[] method393(int arg0) {
        if (arg0 >= -100) {
            field579 = null;
        }
        if (this.field549 == null) {
            String[] var2 = new String[this.field561];
            this.field549 = new int[this.field561];
            int var3 = 0;
            while (var3 < this.field561) {
                var2[var3] = this.field537[var3];
                this.field549[var3] = var3++;
            }
            class43.method344(this.field549, var2, (byte) 68);
        }
        field557++;
        return this.field549;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(BIIII)I")
    public final int method394(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field534++;
        int var6 = (0x1 << arg4) - 1;
        int var7 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        int var8 = arg1 << arg4;
        int var9 = var7 ^ var6;
        int var10 = -127 / ((34 - arg0) / 39);
        int var11 = var8 & var9;
        int var12 = this.field532[arg3];
        if ((var12 & var9) == var11) {
            return -1;
        } else {
            int var13 = var12 & ~var9;
            this.field532[arg3] = class613.method3544(var13, var11);
            return arg3;
        }
    }

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "(I)V")
    private final void method395(int arg0) {
        field543++;
        if (this.field561 == 0) {
            this.field575 = -1;
            this.field544 = -1;
            return;
        }
        this.field544 = -1;
        this.field575 = -1;
        int var2 = 0;
        byte var3 = this.field564[0];
        for (int var4 = 1; var4 < this.field561; var4++) {
            if (this.field564[var4] > var3) {
                if (var3 == 125) {
                    this.field544 = var2;
                }
                var2 = var4;
                var3 = this.field564[var4];
            } else if (this.field544 == -1 && this.field564[var4] == 125) {
                this.field544 = var4;
            }
        }
        if (arg0 < 23) {
            this.field571 = 66;
        }
        this.field575 = var2;
        if (this.field575 != -1) {
            this.field564[this.field575] = 126;
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(BLjava/lang/String;J)V")
    public final void method396(byte arg0, String arg1, long arg2) {
        field576++;
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (arg2 > 0L != this.field580) {
            throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.field580 + " but userhash:" + arg2);
        } else if (arg1 != null != this.field533) {
            throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.field533 + " but displayname:" + arg1);
        } else if (arg0 > 84) {
            if (arg2 > 0L && (this.field541 == null || this.field561 >= this.field541.length) || arg1 != null && (this.field537 == null || this.field561 >= this.field537.length)) {
                this.method405(this.field561 + 5, false);
            }
            if (this.field541 != null) {
                this.field541[this.field561] = arg2;
            }
            if (this.field537 != null) {
                this.field537[this.field561] = arg1;
            }
            if (this.field575 == -1) {
                this.field575 = this.field561;
                this.field564[this.field561] = 126;
            } else {
                this.field564[this.field561] = 0;
            }
            this.field532[this.field561] = 0;
            this.field561++;
            this.field549 = null;
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(ZIJ)Z")
    public final boolean method397(boolean arg0, int arg1, long arg2) {
        field540++;
        if (this.field546 == null) {
            this.field546 = new class638(4);
        } else {
            class69 var5 = this.field546.method3669(false, (long) arg1);
            if (var5 != null) {
                if (var5 instanceof class664) {
                    class664 var6 = (class664) var5;
                    if (var6.field9333 == arg2) {
                        return false;
                    }
                    var6.field9333 = arg2;
                    return true;
                }
                var5.method527(-11229);
            }
        }
        this.field546.method3666((byte) 65, (long) arg1, new class664(arg2));
        if (arg0) {
            field563 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "(II)V")
    public final void method398(int arg0, int arg1) {
        this.field539--;
        field570++;
        if (this.field539 == 0) {
            this.field558 = null;
            this.field545 = null;
        } else {
            if (this.field545 != null) {
                class335.method2120(this.field545, arg0 + 1, this.field545, arg0, this.field539 - arg0);
            }
            if (this.field558 != null) {
                class335.method2123(this.field558, arg0 + 1, this.field558, arg0, this.field539 - arg0);
            }
        }
        if (arg1 != -584) {
            this.method395(-58);
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(ZIII)I")
    public final int method399(boolean arg0, int arg1, int arg2, int arg3) {
        field548++;
        int var5 = arg3 == 31 ? -1 : (0x1 << arg3 + 1) - 1;
        return arg0 ? (this.field532[arg2] & var5) >>> arg1 : 45;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIII)Ljava/lang/Integer;")
    public final Integer method400(int arg0, int arg1, int arg2, int arg3) {
        field566++;
        if (this.field546 == null) {
            return null;
        }
        class69 var5 = this.field546.method3669(false, (long) arg3);
        if (arg1 != 7222) {
            this.field544 = -54;
        }
        if (var5 != null && var5 instanceof class324) {
            int var6 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
            return Integer.valueOf((var6 & ((class324) var5).field4575) >>> arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hia", name = "c", descriptor = "(II)V")
    public final void method401(int arg0, int arg1) {
        field556++;
        if (arg1 < 0 || arg1 >= this.field561) {
            throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg1 + " memberCount:" + this.field561);
        }
        this.field561--;
        this.field549 = null;
        if (this.field561 == 0) {
            this.field564 = null;
            this.field532 = null;
            this.field544 = -1;
            this.field575 = -1;
            this.field537 = null;
            this.field541 = null;
        } else {
            class335.method2118(this.field564, arg1 + 1, this.field564, arg1, this.field561 - arg1);
            class335.method2124(this.field532, arg1 + 1, this.field532, arg1, this.field561 - arg1);
            if (this.field541 != null) {
                class335.method2120(this.field541, arg1 + 1, this.field541, arg1, this.field561 - arg1);
            }
            if (this.field537 != null) {
                class335.method2123(this.field537, arg1 + 1, this.field537, arg1, this.field561 - arg1);
            }
            if (this.field575 == arg1 || this.field544 == arg1) {
                this.method395(36);
            }
        }
        if (arg0 >= -39) {
            this.field536 = 37L;
        }
    }

    @OriginalMember(owner = "client!hia", name = "d", descriptor = "(II)Ljava/lang/Long;")
    public final Long method402(int arg0, int arg1) {
        field538++;
        if (arg0 != 1) {
            return null;
        } else if (this.field546 == null) {
            return null;
        } else {
            class69 var3 = this.field546.method3669(false, (long) arg1);
            return var3 != null && var3 instanceof class664 ? Long.valueOf(((class664) var3).field9333) : null;
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIIBI)Z")
    public final boolean method403(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field574++;
        if (arg3 > -61) {
            this.method408((byte) 3, null);
        }
        int var6 = (0x1 << arg4) - 1;
        int var7 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
        int var8 = var7 ^ var6;
        int var9 = arg1 << arg4;
        int var10 = var9 & var8;
        if (this.field546 == null) {
            this.field546 = new class638(4);
        } else {
            class69 var11 = this.field546.method3669(false, (long) arg2);
            if (var11 != null) {
                if (var11 instanceof class324) {
                    class324 var12 = (class324) var11;
                    if ((var8 & var12.field4575) == var10) {
                        return false;
                    }
                    var12.field4575 &= ~var8;
                    var12.field4575 |= var10;
                    return true;
                }
                var11.method527(-11229);
            }
        }
        this.field546.method3666((byte) 65, (long) arg2, new class324(var10));
        return true;
    }

    @OriginalMember(owner = "client!hia", name = "c", descriptor = "(I)I")
    public static final int method404(int arg0) {
        field562++;
        int var1 = class570.field8022.method3480(13807);
        if ((class386.field5508.length - 1) > var1) {
            class570.field8022 = class386.field5508[var1 + 1];
        }
        if (arg0 > -5) {
            field579 = null;
        }
        return 100;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(IZ)V")
    private final void method405(int arg0, boolean arg1) {
        if (this.field580) {
            if (this.field541 == null) {
                this.field541 = new long[arg0];
            } else {
                class335.method2120(this.field541, 0, this.field541 = new long[arg0], 0, this.field561);
            }
        }
        field568++;
        if (this.field533) {
            if (this.field537 == null) {
                this.field537 = new String[arg0];
            } else {
                class335.method2123(this.field537, 0, this.field537 = new String[arg0], 0, this.field561);
            }
        }
        if (arg1) {
            this.field546 = null;
        }
        if (this.field564 == null) {
            this.field564 = new byte[arg0];
        } else {
            class335.method2118(this.field564, 0, this.field564 = new byte[arg0], 0, this.field561);
        }
        if (this.field532 == null) {
            this.field532 = new int[arg0];
        } else {
            class335.method2124(this.field532, 0, this.field532 = new int[arg0], 0, this.field561);
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method406(int arg0, String arg1) {
        field552++;
        if (arg1 == null || arg1.length() == 0) {
            return -1;
        }
        if (arg0 != -1) {
            this.method411(39, 18, -111);
        }
        for (int var3 = 0; var3 < this.field561; var3++) {
            if (this.field537[var3].equals(arg1)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hia", name = "e", descriptor = "(II)V")
    private final void method407(int arg0, int arg1) {
        int var3 = 95 % ((-arg0 - 33) / 40);
        field572++;
        if (this.field580) {
            if (this.field545 == null) {
                this.field545 = new long[arg1];
            } else {
                class335.method2120(this.field545, 0, this.field545 = new long[arg1], 0, this.field539);
            }
        }
        if (!this.field533) {
            return;
        }
        if (this.field558 == null) {
            this.field558 = new String[arg1];
        } else {
            class335.method2123(this.field558, 0, this.field558 = new String[arg1], 0, this.field539);
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(BLgga;)V")
    private final void method408(byte arg0, class511 arg1) {
        field578++;
        int var3 = arg1.method3013(arg0 + 87);
        if (var3 < 1 || var3 > 3) {
            throw new RuntimeException("Unsupported ClanSettings version: " + var3);
        }
        int var4 = arg1.method3013(95);
        if ((var4 & 0x2) != 0) {
            this.field533 = true;
        }
        if ((var4 & 0x1) != 0) {
            this.field580 = true;
        }
        if (!this.field580) {
            this.field545 = null;
            this.field541 = null;
        }
        if (arg0 != -90) {
            this.method401(-93, -62);
        }
        if (!this.field533) {
            this.field558 = null;
            this.field537 = null;
        }
        this.field567 = arg1.method3008(64);
        arg1.method3008(64);
        this.field561 = arg1.method3002(-1);
        this.field539 = arg1.method3013(-104);
        this.field553 = arg1.method2993((byte) -77);
        this.field555 = arg1.method3013(127) == 1;
        this.field559 = arg1.method3030(-25984);
        this.field571 = arg1.method3030(arg0 - 25894);
        this.field542 = arg1.method3030(-25984);
        this.field535 = arg1.method3030(-25984);
        if (this.field561 > 0) {
            if (this.field580 && (this.field541 == null || this.field561 > this.field541.length)) {
                this.field541 = new long[this.field561];
            }
            if (this.field533 && (this.field537 == null || this.field537.length < this.field561)) {
                this.field537 = new String[this.field561];
            }
            if (this.field564 == null || this.field561 > this.field564.length) {
                this.field564 = new byte[this.field561];
            }
            if (this.field532 == null || this.field561 > this.field532.length) {
                this.field532 = new int[this.field561];
            }
            for (int var5 = 0; var5 < this.field561; var5++) {
                if (this.field580) {
                    this.field541[var5] = arg1.method3020(true);
                }
                if (this.field533) {
                    this.field537[var5] = arg1.method2998((byte) -97);
                }
                this.field564[var5] = arg1.method3030(-25984);
                if (var3 >= 2) {
                    this.field532[var5] = arg1.method3008(64);
                }
            }
            this.method395(103);
        }
        if (this.field539 > 0) {
            if (this.field580 && (this.field545 == null || this.field545.length < this.field539)) {
                this.field545 = new long[this.field539];
            }
            if (this.field533 && (this.field558 == null || this.field558.length < this.field539)) {
                this.field558 = new String[this.field539];
            }
            for (int var6 = 0; var6 < this.field539; var6++) {
                if (this.field580) {
                    this.field545[var6] = arg1.method3020(true);
                }
                if (this.field533) {
                    this.field558[var6] = arg1.method2998((byte) -105);
                }
            }
        }
        if (var3 < 3) {
            return;
        }
        int var7 = arg1.method3002(arg0 + 89);
        if (var7 <= 0) {
            return;
        }
        this.field546 = new class638(var7 >= 16 ? 16 : class179.method1142(var7, -95));
        while (var7-- > 0) {
            int var8 = arg1.method3008(64);
            int var9 = var8 & 0x3FFFFFFF;
            int var10 = var8 >>> 30;
            if (var10 == 0) {
                int var11 = arg1.method3008(64);
                this.field546.method3666((byte) 65, (long) var9, new class324(var11));
            } else if (var10 == 1) {
                long var12 = arg1.method3020(true);
                this.field546.method3666((byte) 65, (long) var9, new class664(var12));
            } else if (var10 == 2) {
                String var14 = arg1.method2993((byte) -121);
                this.field546.method3666((byte) 65, (long) var9, new class282(var14));
            }
        }
        return;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(IB)Ljava/lang/String;")
    public final String method409(int arg0, byte arg1) {
        field551++;
        if (this.field546 == null) {
            return null;
        }
        class69 var3 = this.field546.method3669(false, (long) arg0);
        if (arg1 <= 7) {
            this.method403(36, 127, -91, (byte) -124, 53);
        }
        return var3 != null && var3 instanceof class282 ? ((class282) var3).field4042 : null;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(Z)V")
    public static void method410(boolean arg0) {
        field573 = null;
        field579 = null;
        field563 = null;
        if (arg0) {
            method404(-17);
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(III)Z")
    public final boolean method411(int arg0, int arg1, int arg2) {
        field569++;
        if (this.field546 == null) {
            this.field546 = new class638(4);
        } else {
            class69 var4 = this.field546.method3669(false, (long) arg2);
            if (var4 != null) {
                if (var4 instanceof class324) {
                    class324 var5 = (class324) var4;
                    if (var5.field4575 == arg1) {
                        return false;
                    }
                    var5.field4575 = arg1;
                    return true;
                }
                var4.method527(-11229);
            }
        }
        int var6 = 13 % ((-arg0 - 81) / 44);
        this.field546.method3666((byte) 65, (long) arg2, new class324(arg1));
        return true;
    }

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lgga;)V")
    public class48(class511 arg0) {
        this.method408((byte) -90, arg0);
    }

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "()V")
    private class48() {
    }
}
