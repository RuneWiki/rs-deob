import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class485 {

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "Z")
    private boolean field6762 = true;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    private int field6759 = -1;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    private int field6757;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "[Lep;")
    private class443[] field6764;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    private int field6772;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    private int field6761;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    private int field6755;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "[Lep;")
    private class443[] field6758;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "Lep;")
    private class443 field6760;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "Z")
    public static boolean field6770 = false;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    private int field6766;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field6767;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    private int field6773;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "Ltf;")
    private class312 field6769;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 3)
    public final void method2872(int arg0) {
        if (this.field6764 != null) {
            for (int var2 = 0; var2 < this.field6764.length; var2++) {
                this.field6764[var2].method2613();
            }
        }
        field6771++;
        if (arg0 != -8199) {
            this.method2876((byte) -5, null, 93);
        }
        this.field6769 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V", line = 27)
    public static final void method2873(byte arg0) {
        if (arg0 == -25) {
            class761.field10523 = false;
            field6763++;
            class41.method341(-93);
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V", line = 46)
    public static final void method2874(byte arg0) {
        field6767++;
        if (arg0 != 36) {
            field6770 = false;
        }
        for (class188 var1 = (class188) class105.field1346.method2725(37); var1 != null; var1 = (class188) class105.field1346.method2726(-113)) {
            class68 var2 = var1.field2269;
            if (var2.field974 < class228.field2707) {
                var1.method2219(arg0 + 13594);
                var2.method678(0);
            } else if (class228.field2707 >= var2.field939) {
                var2.method673((byte) 106);
                if (var2.field964 > 0) {
                    class273 var3 = (class273) class30.field444.method2121(105, (long) (var2.field964 - 1));
                    if (var3 != null) {
                        class388 var4 = var3.field3210;
                        if (var4.field823 >= 0 && class596.field8090 * 512 > var4.field823 && var4.field813 >= 0 && class107.field1350 * 512 > var4.field813) {
                            var2.method670(arg0 ^ 0x8A730FED, class228.field2707, var4.field813, class483.method2867(var2.field808, (byte) -116, var4.field813, var4.field823) - var2.field971, var4.field823);
                        }
                    }
                }
                if (var2.field964 < 0) {
                    int var5 = -var2.field964 - 1;
                    class521 var6;
                    if (class782.field10790 == var5) {
                        var6 = class300.field3596;
                    } else {
                        var6 = class61.field825[var5];
                    }
                    if (var6 != null && var6.field823 >= 0 && class596.field8090 * 512 > var6.field823 && var6.field813 >= 0 && class107.field1350 * 512 > var6.field813) {
                        var2.method670(-1972170807, class228.field2707, var6.field813, class483.method2867(var2.field808, (byte) -105, var6.field813, var6.field823) - var2.field971, var6.field823);
                    }
                }
                var2.method677(class190.field2279, (byte) -121);
                class36.method321(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(I[Lep;IIII)V", line = 291)
    public class485(int arg0, class443[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6757 = arg3;
        this.field6764 = arg1;
        this.field6772 = arg5;
        this.field6761 = arg4;
        this.field6755 = arg0;
        if (arg1 == null) {
            this.field6758 = null;
            this.field6760 = null;
        } else {
            this.field6758 = new class443[arg1.length];
            this.field6760 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIILha;II)V", line = 130)
    public final void method2875(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class66 arg7, int arg8, int arg9) {
        field6756++;
        int var11 = arg2 + arg9 & 0x3FFF;
        if (this.field6755 == -1 || this.field6773 == 0) {
            arg7.method645(arg3, arg6, arg0, arg5, arg1, 0);
        } else {
            class359 var12 = class627.field8588.method1138(this.field6755, 109);
            if (this.field6769 == null && class627.field8588.method1137(12429, this.field6755)) {
                int[] var13 = var12.field4457 == 2 ? class627.field8588.method1139(this.field6755, 11196, false, this.field6773, this.field6773, 0.7F) : class627.field8588.method1135(this.field6755, 0.7F, false, this.field6773, this.field6773, (byte) -26);
                this.field6769 = arg7.method623(var13, this.field6773, 1, this.field6773, this.field6773, 0);
            }
            if (var12.field4457 == 2) {
                arg7.method645(arg3, arg6, arg0, arg5, arg1, 0);
            }
            if (this.field6769 != null) {
                int var14 = var12.field4457 == 2 ? 1 : 0;
                int var15 = arg4 * arg5 / -4096;
                int var16;
                for (var16 = (arg0 - arg5) / 2 + (arg5 * var11 / 4096); var16 > arg5; var16 -= arg5) {
                }
                while (var16 < 0) {
                    var16 += arg5;
                }
                while (var15 > arg5) {
                    var15 -= arg5;
                }
                while (var15 < 0) {
                    var15 += arg5;
                }
                for (int var17 = var16 - arg5; var17 < arg0; var17 += arg5) {
                    for (int var18 = var15 - arg5; var18 < arg5; var18 += arg5) {
                        this.field6769.method1843(var17 + arg3, var18 - -arg6, arg5, arg5, 1, 0, var14);
                    }
                }
            }
        }
        int var19 = this.field6766 - 1;
        if (arg8 != -1) {
            this.field6760 = null;
        }
        while (var19 >= 0) {
            this.field6758[var19].method2612(arg7, arg3, arg6, arg0, arg5, arg4, var11);
            var19--;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLha;I)Z", line = 214)
    public final boolean method2876(byte arg0, class66 arg1, int arg2) {
        if (this.field6759 != arg2) {
            this.field6759 = arg2;
            int var4 = class381.method2234(-126, arg2);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field6773 != var4) {
                this.field6769 = null;
                this.field6773 = var4;
            }
            if (this.field6764 != null) {
                this.field6766 = 0;
                int[] var5 = new int[this.field6764.length];
                for (int var6 = 0; var6 < this.field6764.length; var6++) {
                    class443 var7 = this.field6764[var6];
                    if (var7.method2614(this.field6757, this.field6761, this.field6772, this.field6759)) {
                        var5[this.field6766] = var7.field5932;
                        this.field6758[this.field6766++] = var7;
                    }
                }
                class227.method1398(this.field6766 - 1, 81, 0, this.field6758, var5);
            }
            this.field6762 = true;
        }
        field6768++;
        boolean var8 = false;
        int var9 = 42 % ((arg0 + 18) / 45);
        if (this.field6762) {
            this.field6762 = false;
            for (int var10 = this.field6766 - 1; var10 >= 0; var10--) {
                boolean var11 = this.field6758[var10].method2608(arg1, this.field6760);
                this.field6762 |= !var11;
                var8 |= var11;
            }
        }
        return var8;
    }
}
