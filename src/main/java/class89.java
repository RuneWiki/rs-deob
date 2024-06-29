import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class89 {

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public int field939 = -1;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    private int field938 = -1;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public int field959 = -1;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    private int field960 = -1;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "Z")
    public boolean field956 = false;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    private int field964 = -1;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public int field954 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public int field941 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
    public int field967 = -1;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    private int field947 = -1;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    public int field970 = -1;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public int field949 = 0;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "[Ljava/lang/String;")
    public String[] field948 = new String[5];

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public int field966 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "Z")
    public boolean field968 = true;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "Z")
    public boolean field978 = true;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
    public int field981 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "Z")
    public boolean field953 = true;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    private int field974 = -1;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "F")
    public static float field958 = 1024.0F;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Z")
    public static boolean field946 = false;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    private int field945;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public int field961;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    private int field962;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "I")
    private int field969;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
    private int field975;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "Lbr;")
    public class357 field950;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Ltq;")
    private class572 field944;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "Ljava/lang/String;")
    public String field943;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "Ljava/lang/String;")
    public String field951;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "[I")
    public int[] field972;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 3)
    public final String method550(int arg0, String arg1, int arg2) {
        field980++;
        if (this.field944 == null) {
            return arg1;
        } else {
            int var4 = 56 / ((-arg2 - 48) / 47);
            class210 var5 = (class210) this.field944.method3234((byte) -67, (long) arg0);
            return var5 == null ? arg1 : var5.field2548;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZLoa;B)Lxa;", line = 29)
    public final class458 method551(boolean arg0, class635 arg1, byte arg2) {
        field983++;
        int var4 = arg0 ? this.field939 : this.field970;
        int var5 = var4 | arg1.field8985 << 29;
        class458 var6 = (class458) this.field950.field4688.method3690((byte) 122, (long) var5);
        if (var6 != null) {
            return var6;
        } else if (arg2 >= -111) {
            return null;
        } else if (this.field950.field4682.method1711(var4, 1)) {
            class563 var7 = class563.method3185(this.field950.field4682, var4, 0);
            if (var7 != null) {
                var6 = arg1.method351(var7, true);
                this.field950.field4688.method3683(var6, (byte) -102, (long) var5);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZLoba;)Z", line = 63)
    public final boolean method552(boolean arg0, class237 arg1) {
        if (!arg0) {
            this.field944 = null;
        }
        field963++;
        int var3;
        if (this.field964 == -1) {
            if (this.field947 == -1) {
                return true;
            }
            var3 = arg1.method1372(this.field947, (byte) -61);
        } else {
            var3 = arg1.method1371(this.field964, -13366);
        }
        if (this.field945 > var3 || var3 > this.field962) {
            return false;
        }
        boolean var4 = false;
        int var5;
        if (this.field974 == -1) {
            if (this.field938 == -1) {
                return true;
            }
            var5 = arg1.method1372(this.field938, (byte) -120);
        } else {
            var5 = arg1.method1371(this.field974, -13366);
        }
        return this.field975 <= var5 && var5 <= this.field969;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BC)I", line = 102)
    public static final int method553(byte arg0, char arg1) {
        if (arg0 == 5) {
            field940++;
            return arg1 >= '\u0000' && class115.field1342.length > arg1 ? class115.field1342[arg1] : -1;
        } else {
            return -6;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Loa;B)Lxa;", line = 125)
    public final class458 method554(class635 arg0, byte arg1) {
        field973++;
        class458 var3 = (class458) this.field950.field4688.method3690((byte) 3, (long) (arg0.field8985 << 29 | this.field960 | 0x20000));
        if (var3 != null) {
            return var3;
        }
        this.field950.field4682.method1711(this.field960, arg1 + 39);
        if (arg1 != -38) {
            method553((byte) -92, (char) 65438);
        }
        class563 var4 = class563.method3185(this.field950.field4682, this.field960, 0);
        if (var4 != null) {
            var3 = arg0.method351(var4, true);
            this.field950.field4688.method3683(var3, (byte) -89, (long) (this.field960 | 0x20000 | arg0.field8985 << 29));
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Liaa;ZI)V", line = 156)
    private final void method555(class452 arg0, boolean arg1, int arg2) {
        field957++;
        if (arg2 == 1) {
            this.field970 = arg0.method2574(-1758460248);
        } else if (arg2 == 2) {
            this.field939 = arg0.method2574(-1758460248);
        } else if (arg2 == 3) {
            this.field943 = arg0.method2516(126);
        } else if (arg2 == 4) {
            this.field952 = arg0.method2524(3);
        } else if (arg2 == 5) {
            this.field959 = arg0.method2524(3);
        } else if (arg2 == 6) {
            this.field949 = arg0.method2541(49);
        } else if (arg2 == 7) {
            int var4 = arg0.method2541(126);
            if ((var4 & 0x1) == 0) {
                this.field953 = false;
            }
            if ((var4 & 0x2) == 2) {
                this.field956 = true;
            }
        } else if (arg2 == 8) {
            this.field968 = arg0.method2541(69) == 1;
        } else if (arg2 == 9) {
            this.field947 = arg0.method2574(-1758460248);
            if (this.field947 == 65535) {
                this.field947 = -1;
            }
            this.field964 = arg0.method2574(-1758460248);
            if (this.field964 == 65535) {
                this.field964 = -1;
            }
            this.field945 = arg0.method2575((byte) -48);
            this.field962 = arg0.method2575((byte) -48);
        } else if (arg2 >= 10 && arg2 <= 14) {
            this.field948[arg2 - 10] = arg0.method2516(71);
        } else if (arg2 == 15) {
            int var11 = arg0.method2541(47);
            this.field972 = new int[var11 * 2];
            for (int var12 = 0; var12 < (var11 * 2); var12++) {
                this.field972[var12] = arg0.method2549((byte) 32);
            }
            this.field942 = arg0.method2575((byte) -48);
            this.field971 = arg0.method2575((byte) -48);
        } else if (arg2 == 16) {
            this.field978 = false;
        } else if (arg2 == 17) {
            this.field951 = arg0.method2516(102);
        } else if (arg2 == 18) {
            this.field960 = arg0.method2574(-1758460248);
        } else if (arg2 == 19) {
            this.field967 = arg0.method2574(-1758460248);
        } else if (arg2 == 20) {
            this.field938 = arg0.method2574(-1758460248);
            if (this.field938 == 65535) {
                this.field938 = -1;
            }
            this.field974 = arg0.method2574(-1758460248);
            if (this.field974 == 65535) {
                this.field974 = -1;
            }
            this.field975 = arg0.method2575((byte) -48);
            this.field969 = arg0.method2575((byte) -48);
        } else if (arg2 == 21) {
            this.field979 = arg0.method2575((byte) -48);
        } else if (arg2 == 22) {
            this.field961 = arg0.method2575((byte) -48);
        } else if (arg2 == 249) {
            int var5 = arg0.method2541(75);
            if (this.field944 == null) {
                int var6 = class146.method799(var5, -120);
                this.field944 = new class572(var6);
            }
            for (int var7 = 0; var7 < var5; var7++) {
                boolean var8 = arg0.method2541(60) == 1;
                int var9 = arg0.method2524(3);
                class270 var10;
                if (var8) {
                    var10 = new class210(arg0.method2516(102));
                } else {
                    var10 = new class337(arg0.method2575((byte) -48));
                }
                this.field944.method3235((long) var9, -1, var10);
            }
        }
        if (!arg1) {
            this.method552(true, null);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZLiaa;)V", line = 346)
    public final void method556(boolean arg0, class452 arg1) {
        field965++;
        while (true) {
            int var3 = arg1.method2541(92);
            if (var3 == 0) {
                if (arg0) {
                    field958 = -0.31649545F;
                    return;
                } else {
                    return;
                }
            }
            this.method555(arg1, true, var3);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V", line = 391)
    public final void method557(boolean arg0) {
        if (this.field972 != null) {
            for (int var2 = 0; var2 < this.field972.length; var2 += 2) {
                if (this.field954 > this.field972[var2]) {
                    this.field954 = this.field972[var2];
                } else if (this.field966 < this.field972[var2]) {
                    this.field966 = this.field972[var2];
                }
                if (this.field972[var2 + 1] < this.field941) {
                    this.field941 = this.field972[var2 + 1];
                } else if (this.field981 < this.field972[var2 + 1]) {
                    this.field981 = this.field972[var2 + 1];
                }
            }
        }
        if (!arg0) {
            field977++;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 428)
    public static final void method558(int arg0) {
        field955++;
        if (arg0 != 0) {
            method553((byte) -85, '+');
        }
        class470.field6563 = true;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)I", line = 477)
    public final int method559(int arg0, int arg1, int arg2) {
        field982++;
        if (this.field944 == null) {
            return arg1;
        }
        class337 var4 = (class337) this.field944.method3234((byte) -31, (long) arg2);
        if (arg0 > -122) {
            return 2;
        } else if (var4 == null) {
            return arg1;
        } else {
            return var4.field4415;
        }
    }
}
