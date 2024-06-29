import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class128 {

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "[I")
    private int[] field1961 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "Lfba;")
    public static class27 field1956 = new class27(15, -1);

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Lib;")
    public class163 field1962;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "[I")
    private int[] field1958;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "[S")
    private short[] field1960;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "[S")
    private short[] field1963;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "[S")
    private short[] field1966;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "[S")
    private short[] field1973;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)Z")
    public final boolean method954(int arg0) {
        field1964++;
        boolean var2 = true;
        class791 var3 = this.field1962.field2581;
        synchronized (this.field1962.field2581) {
            int var4 = 0;
            int var5 = -3 / ((-arg0 - 65) / 48);
            while (var4 < 5) {
                if (this.field1961[var4] != -1 && !this.field1962.field2581.method4359(this.field1961[var4], 0, 0)) {
                    var2 = false;
                }
                var4++;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public static void method955(byte arg0) {
        field1956 = null;
        if (arg0 != 22) {
            field1956 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIBI)V")
    public static final void method956(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field1970++;
        int var6 = arg2 - arg5;
        int var7 = arg1 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class515.method3104(arg0, arg4 - 212, arg2, arg5, arg3);
            }
        } else if (var6 == 0) {
            class739.method4116(arg0, arg1, arg4 - 74, arg3, arg5);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            if (arg4 == 85) {
                boolean var8 = var7 < var6;
                if (var8) {
                    int var9 = arg3;
                    int var10 = arg1;
                    arg3 = arg5;
                    arg1 = arg2;
                    arg5 = var9;
                    arg2 = var10;
                }
                if (arg1 < arg3) {
                    int var11 = arg3;
                    int var12 = arg5;
                    arg3 = arg1;
                    arg1 = var11;
                    arg5 = arg2;
                    arg2 = var12;
                }
                int var13 = arg5;
                int var14 = arg1 - arg3;
                int var15 = arg2 - arg5;
                int var16 = -(var14 >> 1);
                if (var15 < 0) {
                    var15 = -var15;
                }
                int var17 = arg5 >= arg2 ? -1 : 1;
                if (var8) {
                    for (int var19 = arg3; var19 <= arg1; var19++) {
                        var16 += var15;
                        class746.field10330[var19][var13] = arg0;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                } else {
                    for (int var18 = arg3; var18 <= arg1; var18++) {
                        var16 += var15;
                        class746.field10330[var13][var18] = arg0;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)Ldba;")
    public final class100 method957(byte arg0) {
        field1965++;
        if (this.field1958 == null) {
            return null;
        }
        class100[] var2 = new class100[this.field1958.length];
        class791 var3 = this.field1962.field2581;
        synchronized (this.field1962.field2581) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field1958.length) {
                    break;
                }
                var2[var4] = class488.method2912(this.field1962.field2581, (byte) 66, this.field1958[var4], 0);
                var4++;
            }
        }
        if (arg0 != -49) {
            return null;
        }
        for (int var5 = 0; var5 < this.field1958.length; var5++) {
            if (var2[var5].field1150 < 13) {
                var2[var5].method715((byte) 126, 2);
            }
        }
        class100 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class100(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field1973 != null) {
            for (int var7 = 0; var7 < this.field1973.length; var7++) {
                var6.method718((byte) -59, this.field1973[var7], this.field1960[var7]);
            }
        }
        if (this.field1963 != null) {
            for (int var8 = 0; var8 < this.field1963.length; var8++) {
                var6.method707(this.field1963[var8], (byte) 5, this.field1966[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V")
    public static final void method958(byte arg0) {
        class571.field8060.method550(class784.field10773);
        field1971++;
        class571.field8060.method503(class10.field192, class5.field44, class377.field5207, class77.field874);
        if (arg0 < 70) {
            field1956 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIII)I")
    public static final int method959(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1957++;
        int var5 = arg2 & 0xF;
        int var6 = var5 >= 8 ? arg4 : arg1;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg1 : arg0) : arg4;
        return arg3 > -66 ? -21 : ((var5 & 0x2) == 0 ? var7 : -var7) + (~(var5 & 0x1) == -1 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILso;)V")
    public final void method960(int arg0, class494 arg1) {
        while (true) {
            int var3 = arg1.method2964((byte) 114);
            if (var3 == 0) {
                if (arg0 != 14) {
                    method955((byte) 77);
                }
                field1959++;
                return;
            }
            this.method964(var3, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)Ldba;")
    public final class100 method961(boolean arg0) {
        field1969++;
        class100[] var2 = new class100[5];
        int var3 = 0;
        class791 var4 = this.field1962.field2581;
        synchronized (this.field1962.field2581) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    if (!arg0) {
                        this.field1963 = null;
                    }
                    break;
                }
                if (this.field1961[var5] != -1) {
                    var2[var3++] = class488.method2912(this.field1962.field2581, (byte) -127, this.field1961[var5], 0);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field1150 < 13) {
                var2[var6].method715((byte) 107, 2);
            }
        }
        class100 var7 = new class100(var2, var3);
        if (this.field1973 != null) {
            for (int var8 = 0; var8 < this.field1973.length; var8++) {
                var7.method718((byte) -59, this.field1973[var8], this.field1960[var8]);
            }
        }
        if (this.field1963 != null) {
            for (int var9 = 0; var9 < this.field1963.length; var9++) {
                var7.method707(this.field1963[var9], (byte) 5, this.field1966[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(IIIII)V")
    public static final void method962(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1967++;
        class313 var5 = class312.method1998((long) arg1, arg2, arg2 ^ 0xFFFFFFF7);
        var5.method2001((byte) -67);
        var5.field4464 = arg0;
        var5.field4455 = arg4;
        var5.field4450 = arg3;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)Z")
    public final boolean method963(int arg0) {
        field1972++;
        if (this.field1958 == null) {
            return true;
        }
        boolean var2 = true;
        class791 var3 = this.field1962.field2581;
        synchronized (this.field1962.field2581) {
            for (int var4 = arg0; var4 < this.field1958.length; var4++) {
                if (!this.field1962.field2581.method4359(this.field1958[var4], arg0, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILso;)V")
    private final void method964(int arg0, int arg1, class494 arg2) {
        if (arg0 == 1) {
            arg2.method2964((byte) 84);
        } else if (arg0 == 2) {
            int var4 = arg2.method2964((byte) 94);
            this.field1958 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1958[var5] = arg2.method2998(true);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var6 = arg2.method2964((byte) 122);
                this.field1960 = new short[var6];
                this.field1973 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field1973[var7] = (short) arg2.method2998(true);
                    this.field1960[var7] = (short) arg2.method2998(true);
                }
            } else if (arg0 == 41) {
                int var8 = arg2.method2964((byte) 72);
                this.field1966 = new short[var8];
                this.field1963 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field1963[var9] = (short) arg2.method2998(true);
                    this.field1966[var9] = (short) arg2.method2998(true);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field1961[arg0 - 60] = arg2.method2998(true);
            }
        }
        if (arg1 == 0) {
            field1968++;
        }
    }
}
