import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 {

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "J")
    private long field36 = -1L;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "J")
    private long field48 = -1L;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    private int field49 = 0;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Lub;")
    private class132 field31;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "J")
    private long field53;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "J")
    private long field58;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "[B")
    private byte[] field57;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "[B")
    private byte[] field46;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "J")
    private long field47;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "Z")
    public static boolean field43 = false;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "Lmb;")
    private static class84 field52 = class79.method672(true, "green:");

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "Z")
    public static boolean field42 = false;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "Lmb;")
    private static class84 field50 = class79.method672(true, "Choose Option");

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "[I")
    public static int[] field38 = new int[500];

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "Lmb;")
    public static class84 field54 = class79.method672(true, "leuchten1:");

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "Lmb;")
    public static class84 field59 = class79.method672(true, ":chalreq:");

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Lmb;")
    public static class84 field41 = field50;

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "Lmb;")
    public static class84 field60 = field52;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    private int field32;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "J")
    private long field56;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "[I")
    public static int[] field51;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    private final void method9(int arg0) throws IOException {
        if (this.field48 != -1L) {
            long var2 = -1L;
            if (this.field56 != this.field48) {
                this.field31.method1063(0, this.field48);
                this.field56 = this.field48;
            }
            this.field31.method1065(this.field57, 0, (byte) 95, this.field49);
            long var4 = -1L;
            this.field56 += this.field49;
            if (this.field48 >= this.field36 && this.field48 < (long) this.field32 + this.field36) {
                var2 = this.field48;
            } else if (this.field36 >= this.field48 && this.field36 < (long) this.field49 + this.field48) {
                var2 = this.field36;
            }
            if (this.field53 < this.field56) {
                this.field53 = this.field56;
            }
            if (this.field36 < (long) this.field49 + this.field48 && (long) this.field32 + this.field36 >= (long) this.field49 + this.field48) {
                var4 = this.field48 + (long) this.field49;
            } else if (this.field36 + (long) this.field32 > this.field48 && (long) this.field49 + this.field48 >= this.field36 - -((long) this.field32)) {
                var4 = (long) this.field32 + this.field36;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class55.method449(this.field57, (int) (var2 - this.field48), this.field46, (int) (var2 - this.field36), var6);
            }
            this.field49 = 0;
            this.field48 = -1L;
        }
        if (arg0 > 61) {
            field35++;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III[B)V")
    public final void method10(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field29++;
        try {
            if ((long) arg1 + this.field47 > this.field58) {
                this.field58 = (long) arg1 + this.field47;
            }
            if (this.field48 != -1L && (this.field47 < this.field48 || this.field47 > (long) this.field49 + this.field48)) {
                this.method9(99);
            }
            if (this.field48 != -1L && (long) arg1 + this.field47 > (long) this.field57.length + this.field48) {
                int var5 = (int) (this.field48 + (long) this.field57.length - this.field47);
                arg1 -= var5;
                class55.method449(arg3, arg0, this.field57, (int) (this.field47 - this.field48), var5);
                this.field47 += var5;
                arg0 += var5;
                this.field49 = this.field57.length;
                this.method9(85);
            }
            if (arg1 > this.field57.length) {
                if (this.field56 != this.field47) {
                    this.field31.method1063(0, this.field47);
                    this.field56 = this.field47;
                }
                long var6 = -1L;
                this.field31.method1065(arg3, arg0, (byte) 66, arg1);
                long var8 = -1L;
                this.field56 += arg1;
                if (this.field47 >= this.field36 && (long) this.field32 + this.field36 > this.field47) {
                    var8 = this.field47;
                } else if (this.field47 <= this.field36 && (long) arg1 + this.field47 > this.field36) {
                    var8 = this.field36;
                }
                if (this.field56 > this.field53) {
                    this.field53 = this.field56;
                }
                if ((long) arg1 + this.field47 > this.field36 && this.field47 + (long) arg1 <= this.field36 - -((long) this.field32)) {
                    var6 = this.field47 + (long) arg1;
                } else if (this.field47 < (long) this.field32 + this.field36 && (long) arg1 + this.field47 >= (long) this.field32 + this.field36) {
                    var6 = this.field36 + (long) this.field32;
                }
                if (var8 > -1L && var8 < var6) {
                    int var10 = (int) (var6 - var8);
                    class55.method449(arg3, (int) ((long) arg0 + var8 - this.field47), this.field46, (int) (var8 - this.field36), var10);
                }
                this.field47 += arg1;
            } else if (arg1 > 0) {
                if (this.field48 == -1L) {
                    this.field48 = this.field47;
                }
                class55.method449(arg3, arg0, this.field57, (int) (this.field47 - this.field48), arg1);
                this.field47 += arg1;
                if ((long) this.field49 < this.field47 - this.field48) {
                    this.field49 = (int) (this.field47 - this.field48);
                }
            } else {
                int var11 = -117 % ((9 - arg2) / 46);
            }
        } catch (IOException var13) {
            this.field56 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public static final void method11(int arg0) {
        field37++;
        if (class118.field2827 == 0) {
            return;
        }
        class28 var1 = class95.field2364;
        int var2 = 0;
        if (class68.field1644 != 0) {
            var2 = 1;
        }
        if (arg0 < 8) {
            return;
        }
        for (int var3 = 0; var3 < 100; var3++) {
            if (class74.field1792[var3] != null) {
                class84 var4 = class49.field1048[var3];
                int var5 = class17.field377[var3];
                byte var6 = 0;
                if (var4 != null && var4.method703(class75.field1857, 0)) {
                    var4 = var4.method697(98, 5);
                    var6 = 1;
                }
                if (var4 != null && var4.method703(class24.field566, 0)) {
                    var6 = 2;
                    var4 = var4.method697(31, 5);
                }
                if ((var5 == 3 || var5 == 7) && (var5 == 7 || class47.field1028 == 0 || class47.field1028 == 1 && class88.method752(0, var4))) {
                    byte var7 = 4;
                    int var8 = 329 - var2 * 13;
                    var2++;
                    var1.method205(class90.field2260, var7, var8, 0);
                    var1.method205(class90.field2260, var7, var8 - 1, 65535);
                    int var9 = var7 + var1.method219(class90.field2260);
                    int var10 = var9 + var1.method208(32);
                    if (var6 == 1) {
                        class20.field413[0].method979(var10, var8 - 12);
                        var10 += 14;
                    }
                    if (var6 == 2) {
                        class20.field413[1].method979(var10, var8 - 12);
                        var10 += 14;
                    }
                    var1.method205(class51.method408(new class84[] { var4, class66.field1621, class74.field1792[var3] }, 10), var10, var8, 0);
                    var1.method205(class51.method408(new class84[] { var4, class66.field1621, class74.field1792[var3] }, -47), var10, var8 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var5 == 5 && class47.field1028 < 2) {
                    int var11 = 329 - var2 * 13;
                    var2++;
                    var1.method205(class74.field1792[var3], 4, var11, 0);
                    var1.method205(class74.field1792[var3], 4, var11 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
                if (var5 == 6 && class47.field1028 < 2) {
                    int var12 = 329 - var2 * 13;
                    var1.method205(class51.method408(new class84[] { class136.field3238, class16.field348, var4, class66.field1621, class74.field1792[var3] }, 124), 4, var12, 0);
                    var2++;
                    var1.method205(class51.method408(new class84[] { class136.field3238, class16.field348, var4, class66.field1621, class74.field1792[var3] }, 126), 4, var12 - 1, 65535);
                    if (var2 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)J")
    public final long method12(boolean arg0) {
        field30++;
        if (arg0) {
            this.method20((byte) 111, 121L);
        }
        return this.field58;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)V")
    public final void method13(int arg0) throws IOException {
        field33++;
        this.method9(112);
        if (arg0 != 25691) {
            method19(-93, 106);
        }
        this.field31.method1066((byte) 59);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    private final void method14(byte arg0) throws IOException {
        if (arg0 != 31) {
            method11(4);
        }
        field39++;
        this.field32 = 0;
        if (this.field56 != this.field47) {
            this.field31.method1063(arg0 - 31, this.field47);
            this.field56 = this.field47;
        }
        this.field36 = this.field47;
        while (this.field32 < this.field46.length) {
            int var2 = this.field31.method1064(this.field32, arg0 ^ 0x4252, this.field46.length - this.field32, this.field46);
            if (var2 == -1) {
                break;
            }
            this.field56 += var2;
            this.field32 += var2;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lia;I)Z")
    public static final boolean method15(class57 arg0, int arg1) {
        int var2 = arg0.field1382;
        field55++;
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            class19.field402++;
            class88.field2203++;
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 >= 101) {
                var2 -= 101;
            } else {
                var2--;
            }
            class129.method1051(0, 6, class51.method408(new class84[] { class51.field1093, class27.field646[var2] }, -123), 16711680, 0, 0, class69.field1690);
            class129.method1051(0, 39, class51.method408(new class84[] { class51.field1093, class27.field646[var2] }, -28), 16711680, 0, 0, class146.field3596);
            return true;
        } else if (var2 >= 401 && var2 <= 500) {
            class129.method1051(0, 54, class51.method408(new class84[] { class51.field1093, arg0.field1377 }, -84), 16711680, 0, 0, class69.field1690);
            class13.field252++;
            return true;
        } else if (arg1 == 2) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
    public static final void method16(byte arg0) {
        field40++;
        try {
            if (class58.field1453 == 1) {
                int var1 = class69.field1689.method1094((byte) -23);
                if (var1 > 0 && class69.field1689.method1105(-552143504)) {
                    int var2 = var1 - class84.field2101;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class69.field1689.method1088(var2, (byte) 117);
                    return;
                }
                class69.field1689.method1108((byte) 123);
                class69.field1689.method1112(114);
                class27.field652 = null;
                class27.field656 = null;
                if (class60.field1486 == null) {
                    class58.field1453 = 0;
                } else {
                    class58.field1453 = 2;
                }
            }
            int var3 = 122 % ((arg0 - 21) / 36);
        } catch (Exception var5) {
            var5.printStackTrace();
            class69.field1689.method1108((byte) -90);
            class27.field656 = null;
            class58.field1453 = 0;
            class60.field1486 = null;
            class27.field652 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II[BI)V")
    public final void method17(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field34++;
        try {
            if (arg2.length < arg1 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg1 - arg2.length);
            }
            if (this.field48 != -1L && this.field48 <= this.field47 && (long) this.field49 + this.field48 >= (long) arg3 + this.field47) {
                class55.method449(this.field57, (int) (this.field47 - this.field48), arg2, arg1, arg3);
                this.field47 += arg3;
                return;
            }
            int var5 = arg1;
            int var6 = arg3;
            long var7 = this.field47;
            if (this.field47 >= this.field36 && this.field36 + (long) this.field32 > this.field47) {
                int var9 = (int) (this.field36 + (long) this.field32 - this.field47);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                arg3 -= var9;
                class55.method449(this.field46, (int) (this.field47 - this.field36), arg2, arg1, var9);
                arg1 += var9;
                this.field47 += var9;
            }
            if (arg3 > this.field46.length) {
                this.field31.method1063(arg0, this.field47);
                this.field56 = this.field47;
                while (arg3 > 0) {
                    int var10 = this.field31.method1064(arg1, 16973, arg3, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 -= var10;
                    arg1 += var10;
                    this.field56 += var10;
                    this.field47 += var10;
                }
            } else if (arg3 > 0) {
                this.method14((byte) 31);
                int var11 = arg3;
                if (this.field32 < arg3) {
                    var11 = this.field32;
                }
                class55.method449(this.field46, 0, arg2, arg1, var11);
                arg3 -= var11;
                arg1 += var11;
                this.field47 += var11;
            }
            if (this.field48 != -1L) {
                if (this.field47 < this.field48 && arg3 > 0) {
                    int var12 = (int) (this.field48 - this.field47) + arg1;
                    if (arg1 + arg3 < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (arg1 < var12) {
                        arg3--;
                        arg2[arg1++] = 0;
                        this.field47++;
                    }
                }
                long var13 = -1L;
                if (this.field48 >= var7 && this.field48 < (long) var6 + var7) {
                    var13 = this.field48;
                } else if (this.field48 <= var7 && var7 < (long) this.field49 + this.field48) {
                    var13 = var7;
                }
                long var15 = -1L;
                if ((long) this.field49 + this.field48 > var7 && this.field48 + (long) this.field49 <= (long) var6 + var7) {
                    var15 = (long) this.field49 + this.field48;
                } else if (this.field48 < var7 + (long) var6 && (long) this.field49 + this.field48 >= var7 - -((long) var6)) {
                    var15 = (long) var6 + var7;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class55.method449(this.field57, (int) (var13 - this.field48), arg2, (int) (var13 - var7) + var5, var17);
                    if (this.field47 < var15) {
                        arg3 = (int) ((long) arg3 + this.field47 - var15);
                        this.field47 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field56 = -1L;
            throw var19;
        }
        if (arg3 > arg0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
    public static void method18(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field52 = null;
        field51 = null;
        field38 = null;
        field59 = null;
        field60 = null;
        field54 = null;
        field41 = null;
        field50 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)V")
    public static final void method19(int arg0, int arg1) {
        field45++;
        class37 var2 = (class37) class105.field2552.method959(true, (long) arg1);
        if (var2 != null) {
            var2.method121(false);
            if (arg0 != 29782) {
                field59 = null;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BJ)V")
    public final void method20(byte arg0, long arg1) {
        field44++;
        if (arg1 >= 0L) {
            if (arg0 >= -82) {
                method11(-78);
            }
            this.field47 = arg1;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lub;II)V")
    public class2(class132 arg0, int arg1, int arg2) throws IOException {
        this.field31 = arg0;
        this.field58 = this.field53 = arg0.method1062(92);
        this.field57 = new byte[arg2];
        this.field46 = new byte[arg1];
        this.field47 = 0L;
    }
}
