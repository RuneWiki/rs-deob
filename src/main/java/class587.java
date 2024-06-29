import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class587 {

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
    private int field7954 = -1;

    @OriginalMember(owner = "client!mda", name = "q", descriptor = "I")
    private int field7967 = -32768;

    @OriginalMember(owner = "client!mda", name = "y", descriptor = "Z")
    private boolean field7975 = false;

    @OriginalMember(owner = "client!mda", name = "r", descriptor = "Z")
    private boolean field7968 = false;

    @OriginalMember(owner = "client!mda", name = "B", descriptor = "I")
    private int field7978 = -1;

    @OriginalMember(owner = "client!mda", name = "H", descriptor = "I")
    private int field7984 = -1;

    @OriginalMember(owner = "client!mda", name = "i", descriptor = "I")
    public int field7959;

    @OriginalMember(owner = "client!mda", name = "h", descriptor = "B")
    private byte field7958;

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "I")
    public int field7955;

    @OriginalMember(owner = "client!mda", name = "j", descriptor = "I")
    private int field7960;

    @OriginalMember(owner = "client!mda", name = "G", descriptor = "I")
    private int field7983;

    @OriginalMember(owner = "client!mda", name = "x", descriptor = "B")
    private byte field7974;

    @OriginalMember(owner = "client!mda", name = "z", descriptor = "I")
    public int field7976;

    @OriginalMember(owner = "client!mda", name = "m", descriptor = "Z")
    private boolean field7963;

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "Lki;")
    public static class364 field7952 = new class364();

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "I")
    public static int field7951;

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "I")
    public static int field7953;

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "I")
    public static int field7957;

    @OriginalMember(owner = "client!mda", name = "k", descriptor = "I")
    public static int field7961;

    @OriginalMember(owner = "client!mda", name = "l", descriptor = "I")
    private int field7962;

    @OriginalMember(owner = "client!mda", name = "n", descriptor = "I")
    private int field7964;

    @OriginalMember(owner = "client!mda", name = "o", descriptor = "I")
    public static int field7965;

    @OriginalMember(owner = "client!mda", name = "p", descriptor = "I")
    public static int field7966;

    @OriginalMember(owner = "client!mda", name = "s", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!mda", name = "t", descriptor = "I")
    public static int field7970;

    @OriginalMember(owner = "client!mda", name = "u", descriptor = "I")
    public static int field7971;

    @OriginalMember(owner = "client!mda", name = "w", descriptor = "I")
    public static int field7973;

    @OriginalMember(owner = "client!mda", name = "A", descriptor = "I")
    private int field7977;

    @OriginalMember(owner = "client!mda", name = "D", descriptor = "I")
    public static int field7980;

    @OriginalMember(owner = "client!mda", name = "E", descriptor = "I")
    private int field7981;

    @OriginalMember(owner = "client!mda", name = "F", descriptor = "Lba;")
    private class107 field7982;

    @OriginalMember(owner = "client!mda", name = "C", descriptor = "Lru;")
    public class231 field7979;

    @OriginalMember(owner = "client!mda", name = "I", descriptor = "Ljq;")
    private class348 field7985;

    @OriginalMember(owner = "client!mda", name = "v", descriptor = "Lw;")
    private class605 field7972;

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "[Z")
    private boolean[] field7956;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)Z")
    public final boolean method3200(int arg0) {
        if (arg0 > -44) {
            this.field7981 = -16;
        }
        field7971++;
        return this.field7963;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILoa;ILq;IIZLba;I)V")
    public final void method3201(int arg0, class43 arg1, int arg2, class151 arg3, int arg4, int arg5, boolean arg6, class107 arg7, int arg8) {
        if (arg4 > -50) {
            return;
        }
        field7969++;
        class574[] var10 = arg7.method808();
        class32[] var11 = arg7.method795();
        if ((this.field7979 == null || this.field7979.field3088) && (var10 != null || var11 != null)) {
            class698 var12 = class348.field4436.method1900(-126, this.field7955);
            if (var12.field9630 != null) {
                var12 = var12.method3815(65535, class397.field5054);
            }
            if (var12 != null) {
                this.field7979 = class231.method1467(class424.field5503, true);
            }
        }
        if (this.field7979 == null) {
            return;
        }
        arg7.method819(arg3);
        if (arg6) {
            this.field7979.method1462(arg1, (long) class424.field5503, var10, var11, false);
        } else {
            this.field7979.method1460((long) class424.field5503);
        }
        this.field7979.method1465(this.field7958, arg2, arg8, arg5, arg0);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IZ)V")
    public final void method3202(int arg0, boolean arg1) {
        field7965++;
        if (arg1) {
            this.field7960 = -32;
        }
        this.field7975 = true;
        this.method3206(-66, arg0);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lmca;Z)Z")
    public static final boolean method3203(class34 arg0, boolean arg1) {
        boolean var2 = class477.field6327 == class392.field4997;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method271((byte) -114);
        if (arg0.field497 < 0 || arg0.field502 < 0 || arg0.field501 >= class590.field8010 || arg0.field505 >= class151.field1933) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field497; var7 <= arg0.field501; var7++) {
            for (int var10 = arg0.field502; var10 <= arg0.field505; var10++) {
                class530 var11 = class331.method1910(arg0.field508, var7, var10);
                if (var11 != null) {
                    int var12 = 0;
                    if (var7 > arg0.field497) {
                        var12++;
                    }
                    if (var7 < arg0.field501) {
                        var12 += 4;
                    }
                    if (var10 > arg0.field502) {
                        var12 += 8;
                    }
                    if (var10 < arg0.field505) {
                        var12 += 2;
                    }
                    class571 var13 = class201.method1315(arg0, var12, false);
                    class571 var14 = var11.field6887;
                    if (var14 == null) {
                        var11.field6887 = var13;
                    } else {
                        while (var14.field7445 != null) {
                            var14 = var14.field7445;
                        }
                        var14.field7445 = var13;
                    }
                    var11.field6884 = (byte) (var11.field6884 | var12);
                    if (var2 && (class176.field2196[var7][var10] & 0xFF000000) != 0) {
                        var3 = class176.field2196[var7][var10];
                        var4 = class612.field8277[var7][var10];
                        var5 = class315.field4084[var7][var10];
                    }
                    if (var11.field6878 != null && var11.field6878.field1944 > var6) {
                        var6 = var11.field6878.field1944;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field497; var8 <= arg0.field501; var8++) {
                for (int var9 = arg0.field502; var9 <= arg0.field505; var9++) {
                    if ((class176.field2196[var8][var9] & 0xFF000000) == 0) {
                        class176.field2196[var8][var9] = var3;
                        class612.field8277[var8][var9] = var4;
                        class315.field4084[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class57.field772[class516.field6758++] = arg0;
        }
        if (arg1) {
            arg0.field510 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V")
    public static void method3204(byte arg0) {
        if (arg0 != 58) {
            method3204((byte) 31);
        }
        field7952 = null;
    }

    @OriginalMember(owner = "client!mda", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field7979 != null) {
            this.field7979.method1463();
        }
        field7951++;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ILoa;)V")
    public final void method3205(int arg0, class43 arg1) {
        field7970++;
        this.method3207(arg1, this.field7960, true, 262144, true, arg0 ^ 0x50E2, this.field7983);
        if (arg0 != 8231) {
            method3204((byte) 53);
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(II)V")
    private final void method3206(int arg0, int arg1) {
        field7980++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class698 var5 = class348.field4436.method1900(26, this.field7955);
            class698 var6 = var5;
            if (var5.field9630 != null) {
                var5 = var5.method3815(65535, class397.field5054);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field9653 != null) {
                if (this.field7985 != null && var5.method3814(0, this.field7985.field4439)) {
                    return;
                }
                var3 = var5.method3817(-114);
                if (this.field7978 != var5.field9625) {
                    var4 = var5.field9678;
                }
            } else if (var5.field9637 == -1) {
                if (var6 != null && var6.field9653 != null) {
                    if (this.field7985 != null && var6.method3814(0, this.field7985.field4439)) {
                        return;
                    }
                    var3 = var6.method3817(-103);
                    if (this.field7978 != var6.field9625) {
                        var4 = var6.field9678;
                    }
                } else if (var6 != null && var6.field9637 != -1 && this.field7978 != var6.field9625) {
                    var3 = var6.field9637;
                    var4 = var6.field9678;
                }
            } else if (this.field7978 != var5.field9625) {
                var4 = var5.field9678;
                var3 = var5.field9637;
            }
        }
        if (var3 == -1) {
            this.field7985 = null;
            return;
        }
        this.field7982 = null;
        if (arg0 > -23) {
            this.method3205(76, null);
        }
        if (this.field7985 == null || this.field7985.field4439 != var3) {
            this.field7985 = class552.field7163.method3031(-70, var3);
        } else if (this.field7985.field4447 == 0) {
            return;
        }
        if (this.field7985.field4463 == null) {
            this.field7985 = null;
            return;
        }
        if (var4) {
            this.field7962 = (int) (Math.random() * (double) this.field7985.field4463.length);
            this.field7977 = ((int) ((double) this.field7985.field4453[this.field7962] * Math.random())) + 1;
        } else {
            this.field7977 = 1;
            this.field7962 = 0;
        }
        this.field7981 = this.field7962 + 1;
        if (this.field7981 < 0 || this.field7981 >= this.field7985.field4463.length) {
            this.field7981 = -1;
        }
        this.field7964 = class424.field5503 - this.field7977;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Loa;IZIZII)Lba;")
    public final class107 method3207(class43 arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field7961++;
        class698 var8 = class348.field4436.method1900(43, this.field7955);
        if (var8.field9630 != null) {
            var8 = var8.method3815(65535, class397.field5054);
        }
        if (var8 == null) {
            this.method3210(true, arg0);
            this.field7984 = -1;
            this.field7978 = -1;
            this.field7954 = -1;
            return null;
        } else if (arg5 == 28869) {
            if (!this.field7975 && this.field7978 != var8.field9625) {
                this.field7982 = null;
                this.method3206(arg5 - 28922, -1);
            }
            this.method3208(arg1, arg5 ^ 0xFFFF8F3A, arg6);
            if (arg2) {
                boolean var9 = arg2 & this.field7963 & class260.field3509.method733(class364.field4697, (byte) -81) != 0;
                arg2 = var9 & (this.field7954 != var8.field9625 || this.field7985 != null && class260.field3509.method733(class364.field4697, (byte) -77) >= 2 && (this.field7984 != this.field7962 || (this.field7985.field4457 || class673.field9330) && this.field7981 != this.field7962));
            }
            if (arg4 && !arg2) {
                this.field7978 = var8.field9625;
                return null;
            }
            if (arg2) {
                class567.method3035(this.field7972, this.field7974, this.field7983, this.field7960, this.field7956);
                this.field7954 = -1;
                this.field7984 = -1;
            }
            class88 var10 = class392.field4997[this.field7974];
            class88 var11;
            if (this.field7968) {
                var11 = class353.field4540[0];
            } else {
                var11 = this.field7974 >= 3 ? null : class392.field4997[this.field7974 + 1];
            }
            class107 var12 = null;
            if (this.field7985 != null) {
                if (arg2) {
                    arg3 |= 0x40000;
                }
                var12 = var8.method3818(var11, arg3, this.field7960, var10.method669(this.field7983, this.field7960), this.field7977, this.field7976 == 11 ? this.field7959 + 4 : this.field7959, this.field7985, this.field7962, this.field7981, var10, arg0, this.field7983, (byte) -125, this.field7976 == 11 ? 10 : this.field7976);
                if (var12 == null) {
                    this.field7956 = null;
                    this.field7967 = 0;
                    this.field7972 = null;
                } else {
                    if (arg2) {
                        if (this.field7956 == null) {
                            this.field7956 = new boolean[4];
                        }
                        this.field7972 = var12.method821(this.field7972);
                        class183.method1230(this.field7972, this.field7974, arg6, arg1, this.field7956);
                        this.field7984 = this.field7962;
                        this.field7954 = var8.field9625;
                    }
                    this.field7967 = var12.method816();
                }
                this.field7982 = null;
            } else if (this.field7982 != null && arg3 == (this.field7982.method796() & arg3) && this.field7978 == var8.field9625) {
                var12 = this.field7982;
            } else {
                if (this.field7982 != null) {
                    arg3 |= this.field7982.method796();
                }
                class390 var13 = var8.method3811(arg2, var10, this.field7960, var10.method669(this.field7983, this.field7960), this.field7976 == 11 ? 10 : this.field7976, this.field7976 == 11 ? this.field7959 + 4 : this.field7959, arg0, arg3, var11, -38, this.field7983);
                if (var13 == null) {
                    this.field7956 = null;
                    this.field7967 = 0;
                    this.field7982 = null;
                    this.field7972 = null;
                } else {
                    var12 = var13.field4994;
                    this.field7982 = var13.field4994;
                    if (arg2) {
                        this.field7956 = null;
                        this.field7972 = var13.field4995;
                        class183.method1230(this.field7972, this.field7974, arg6, arg1, null);
                        this.field7984 = -1;
                        this.field7954 = var8.field9625;
                    }
                    this.field7967 = var12.method816();
                }
            }
            this.field7983 = arg6;
            this.field7960 = arg1;
            this.field7978 = var8.field9625;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(III)V")
    private final void method3208(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.field7956 = null;
        }
        field7957++;
        label92: while (true) {
            if (this.field7985 == null) {
                if (this.field7975) {
                    return;
                }
                this.method3206(-52, -1);
                if (this.field7985 == null) {
                    return;
                }
            }
            int var4 = class424.field5503 - this.field7964;
            if (var4 > 100 && this.field7985.field4443 > 0) {
                int var5 = this.field7985.field4463.length - this.field7985.field4443;
                while (this.field7962 < var5 && this.field7985.field4453[this.field7962] < var4) {
                    var4 -= this.field7985.field4453[this.field7962];
                    this.field7962++;
                }
                if (this.field7962 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field7985.field4463.length; var7++) {
                        var6 += this.field7985.field4453[var7];
                    }
                    var4 %= var6;
                }
                this.field7981 = this.field7962 + 1;
                if (this.field7985.field4463.length <= this.field7981) {
                    this.field7981 -= this.field7985.field4443;
                    if (this.field7981 < 0 || this.field7985.field4463.length <= this.field7981) {
                        this.field7981 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field7985.field4453[this.field7962] >= var4) {
                            this.field7964 = class424.field5503 - var4;
                            this.field7977 = var4;
                            return;
                        }
                        class451.method2548(this.field7985, this.field7958, arg0, arg2, 255, false, this.field7962);
                        var4 -= this.field7985.field4453[this.field7962];
                        this.field7962++;
                        if (this.field7962 >= this.field7985.field4463.length) {
                            this.field7962 -= this.field7985.field4443;
                            if (this.field7962 < 0 || this.field7985.field4463.length <= this.field7962) {
                                this.field7985 = null;
                                continue label92;
                            }
                        }
                        this.field7981 = this.field7962 + 1;
                    } while (this.field7985.field4463.length > this.field7981);
                    this.field7981 -= this.field7985.field4443;
                } while (this.field7981 >= 0 && this.field7985.field4463.length > this.field7981);
                this.field7981 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(B)I")
    public final int method3209(byte arg0) {
        field7966++;
        if (arg0 != 38) {
            this.field7967 = -98;
        }
        return this.field7967;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZLoa;)V")
    public final void method3210(boolean arg0, class43 arg1) {
        if (!arg0) {
            this.field7959 = 105;
        }
        if (this.field7972 != null) {
            class567.method3035(this.field7972, this.field7974, this.field7983, this.field7960, this.field7956);
            this.field7956 = null;
            this.field7972 = null;
        }
        field7953++;
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Loa;Lsa;IIIIIIZI)V")
    public class587(class43 arg0, class698 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field7968 = arg8;
        this.field7959 = arg3;
        this.field7958 = (byte) arg4;
        this.field7955 = arg1.field9625;
        this.field7960 = arg7;
        this.field7983 = arg6;
        this.field7974 = (byte) arg5;
        this.field7976 = arg2;
        this.field7963 = arg0.method389() && arg1.field9591 && !this.field7968;
        if (arg9 != -1) {
            this.field7975 = true;
        }
        this.method3206(-27, arg9);
    }
}
