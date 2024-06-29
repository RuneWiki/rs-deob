import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class60 {

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    private int field778 = -1;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "Z")
    private boolean field787 = true;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "[Ldw;")
    private class690[] field781;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    private int field776;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    private int field775;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    private int field789;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    private int field782;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "Ldw;")
    private class690 field788;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "[Ldw;")
    private class690[] field779;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    private int field774;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    private int field786;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "Lpu;")
    private class772 field790;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IBIII)V")
    public static final void method353(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field784++;
        class614 var5 = class497.method2759(18, 5977, (long) arg2 | (long) arg0 << 32);
        var5.method3277(639);
        var5.field7746 = arg3;
        if (arg1 < -12) {
            var5.field7742 = arg4;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BILha;IIIIIII)V")
    public final void method354(byte arg0, int arg1, class570 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field785++;
        int var11 = arg8 + arg9 & 0x3FFF;
        if (this.field776 == -1 || this.field786 == 0) {
            arg2.method921(arg5, arg4, arg7, arg6, arg1, 0);
        } else {
            class191 var12 = class477.field6188.method1732((byte) 18, this.field776);
            if (this.field790 == null && class477.field6188.method1733(-1852, this.field776)) {
                int[] var13 = var12.field2682 == 2 ? class477.field6188.method1734(-25886, false, this.field786, this.field786, this.field776, 0.7F) : class477.field6188.method1737(this.field776, this.field786, 0.7F, false, this.field786, (byte) 45);
                this.field790 = arg2.method3078((byte) 71, this.field786, this.field786, var13, 0, this.field786);
            }
            if (var12.field2682 == 2) {
                arg2.method921(arg5, arg4, arg7, arg6, arg1, 0);
            }
            if (this.field790 != null) {
                int var14 = var12.field2682 == 2 ? 1 : 0;
                int var15 = arg3 * arg6 / -4096;
                int var16;
                for (var16 = (arg7 - arg6) / 2 + (arg6 * var11 / 4096); var16 > arg6; var16 -= arg6) {
                }
                while (var16 < 0) {
                    var16 += arg6;
                }
                while (arg6 < var15) {
                    var15 -= arg6;
                }
                while (var15 < 0) {
                    var15 += arg6;
                }
                for (int var17 = var16 - arg6; var17 < arg7; var17 += arg6) {
                    for (int var18 = var15 - arg6; var18 < arg6; var18 += arg6) {
                        this.field790.method4199(arg5 + var17, arg4 + var18, arg6, arg6, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field774 - 1; var19 >= 0; var19--) {
            this.field779[var19].method3690(arg2, arg5, arg4, arg7, arg6, arg3, var11);
        }
        int var20 = -128 % ((-arg0 - 79) / 41);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IBLha;)Z")
    public final boolean method355(int arg0, byte arg1, class570 arg2) {
        if (this.field778 != arg0) {
            this.field778 = arg0;
            int var4 = class681.method3659(-124, arg0);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field786 != var4) {
                this.field786 = var4;
                this.field790 = null;
            }
            if (this.field781 != null) {
                this.field774 = 0;
                int[] var5 = new int[this.field781.length];
                for (int var6 = 0; var6 < this.field781.length; var6++) {
                    class690 var7 = this.field781[var6];
                    if (var7.method3684(this.field789, this.field782, this.field775, this.field778)) {
                        var5[this.field774] = var7.field8876;
                        this.field779[this.field774++] = var7;
                    }
                }
                class15.method62(this.field779, false, 0, this.field774 - 1, var5);
            }
            this.field787 = true;
        }
        field777++;
        if (arg1 != 13) {
            this.field776 = -53;
        }
        boolean var8 = false;
        if (this.field787) {
            this.field787 = false;
            for (int var9 = this.field774 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field779[var9].method3691(arg2, this.field788);
                this.field787 |= !var10;
                var8 |= var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
    public final void method356(byte arg0) {
        if (arg0 <= 10) {
            this.field790 = null;
        }
        if (this.field781 != null) {
            for (int var2 = 0; var2 < this.field781.length; var2++) {
                this.field781[var2].method3692();
            }
        }
        field783++;
        this.field790 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([BI)[B")
    public static final byte[] method357(byte[] arg0, int arg1) {
        field780++;
        class234 var2 = new class234(arg0);
        int var3 = var2.method1509(true);
        if (arg1 != -31464) {
            method357(null, -122);
        }
        int var4 = var2.method1497((byte) 116);
        if (var4 < 0 || !(class225.field3054 == 0 || class225.field3054 >= var4)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1495(var4, 0, (byte) -128, var5);
            return var5;
        } else {
            int var6 = var2.method1497((byte) 39);
            if (var6 < 0 || class225.field3054 != 0 && var6 > class225.field3054) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class481.method2703(var7, var6, arg0, var4, 9);
            } else {
                class737 var8 = class191.field2666;
                synchronized (class191.field2666) {
                    class191.field2666.method4001(var2, var7, true);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(I[Ldw;IIII)V")
    public class60(int arg0, class690[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field781 = arg1;
        this.field776 = arg0;
        this.field775 = arg5;
        this.field789 = arg3;
        this.field782 = arg4;
        if (arg1 == null) {
            this.field788 = null;
            this.field779 = null;
        } else {
            this.field779 = new class690[arg1.length];
            this.field788 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
