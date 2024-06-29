import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class56 {

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "Z")
    public boolean field777 = false;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public int field784 = -1;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public int field776 = 2;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Z")
    public boolean field769 = false;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "Z")
    public boolean field783 = false;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public int field780 = -1;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public int field778 = -1;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public int field785 = 99;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public int field786 = 5;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    public int field791 = -1;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "Z")
    public boolean field792 = false;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public int field796 = -1;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "Lkg;")
    public static class275 field794 = new class275(87, 1);

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "Lru;")
    public class195 field779;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "[I")
    public int[] field767;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "[I")
    public int[] field771;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "[I")
    public int[] field773;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "[I")
    public int[] field774;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "[I")
    private int[] field775;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "[I")
    public int[] field793;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "[Z")
    public boolean[] field795;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "[[I")
    public int[][] field790;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public final void method410(int arg0) {
        if (this.field778 == -1) {
            if (this.field795 == null) {
                this.field778 = 0;
            } else {
                this.field778 = 2;
            }
        }
        field788++;
        if (arg0 >= -82 || this.field780 != -1) {
            return;
        }
        if (this.field795 == null) {
            this.field780 = 0;
        } else {
            this.field780 = 2;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lsl;BI)V")
    private final void method411(class461 arg0, byte arg1, int arg2) {
        field770++;
        int var4 = 87 / ((arg1 - 36) / 55);
        if (arg2 == 1) {
            int var5 = arg0.method2566(-2);
            this.field773 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field773[var6] = arg0.method2566(-2);
            }
            this.field771 = new int[var5];
            for (int var7 = 0; var7 < var5; var7++) {
                this.field771[var7] = arg0.method2566(-2);
            }
            for (int var8 = 0; var8 < var5; var8++) {
                this.field771[var8] += arg0.method2566(-2) << 16;
            }
        } else if (arg2 == 2) {
            this.field791 = arg0.method2566(-2);
        } else if (arg2 == 3) {
            this.field795 = new boolean[256];
            int var9 = arg0.method2600((byte) -126);
            for (int var10 = 0; var10 < var9; var10++) {
                this.field795[arg0.method2600((byte) -124)] = true;
            }
        } else if (arg2 == 5) {
            this.field786 = arg0.method2600((byte) -128);
        } else if (arg2 == 6) {
            this.field784 = arg0.method2566(-2);
        } else if (arg2 == 7) {
            this.field796 = arg0.method2566(-2);
        } else if (arg2 == 8) {
            this.field785 = arg0.method2600((byte) -123);
        } else if (arg2 == 9) {
            this.field780 = arg0.method2600((byte) -128);
        } else if (arg2 == 10) {
            this.field778 = arg0.method2600((byte) -126);
        } else if (arg2 == 11) {
            this.field776 = arg0.method2600((byte) -128);
        } else if (arg2 == 12) {
            int var18 = arg0.method2600((byte) -127);
            this.field775 = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                this.field775[var19] = arg0.method2566(-2);
            }
            for (int var20 = 0; var20 < var18; var20++) {
                this.field775[var20] = (arg0.method2566(-2) << 16) + this.field775[var20];
            }
        } else if (arg2 == 13) {
            int var11 = arg0.method2566(-2);
            this.field790 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg0.method2600((byte) -128);
                if (var13 > 0) {
                    this.field790[var12] = new int[var13];
                    this.field790[var12][0] = arg0.method2576((byte) 42);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field790[var12][var14] = arg0.method2566(-2);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field792 = true;
        } else if (arg2 == 15) {
            this.field777 = true;
        } else if (arg2 == 16) {
            this.field769 = true;
        } else if (arg2 == 18) {
            this.field783 = true;
        } else if (arg2 == 19) {
            if (this.field793 == null) {
                this.field793 = new int[this.field790.length];
                for (int var17 = 0; var17 < this.field790.length; var17++) {
                    this.field793[var17] = 255;
                }
            }
            this.field793[arg0.method2600((byte) -128)] = arg0.method2600((byte) -123);
        } else if (arg2 == 20) {
            if (this.field767 == null || this.field774 == null) {
                this.field767 = new int[this.field790.length];
                this.field774 = new int[this.field790.length];
                for (int var15 = 0; var15 < this.field790.length; var15++) {
                    this.field767[var15] = 256;
                    this.field774[var15] = 256;
                }
            }
            int var16 = arg0.method2600((byte) -127);
            this.field767[var16] = arg0.method2566(-2);
            this.field774[var16] = arg0.method2566(-2);
            return;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIBILka;)Lka;")
    public final class474 method412(int arg0, int arg1, int arg2, byte arg3, int arg4, class474 arg5) {
        field781++;
        int var7 = this.field773[arg2];
        int var8 = this.field771[arg2];
        class701 var9 = this.field779.method1298(var8 >> 16, 72);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg5.method273((byte) 1, arg1, true);
        }
        class701 var11 = null;
        if (arg3 > -58) {
            return null;
        }
        if ((this.field777 || class130.field1838) && arg0 != -1 && arg0 < this.field771.length) {
            int var12 = this.field771[arg0];
            var11 = this.field779.method1298(var12 >> 16, 84);
            arg0 = var12 & 0xFFFF;
        }
        class701 var13 = null;
        class701 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field775 != null) {
            if (this.field775.length > arg2) {
                var15 = this.field775[arg2];
                if (var15 != 65535) {
                    var13 = this.field779.method1298(var15 >> 16, -19);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field777 || class130.field1838) && arg0 != -1 && arg0 < this.field775.length) {
                var16 = this.field775[arg0];
                if (var16 != 65535) {
                    var14 = this.field779.method1298(var16 >> 16, 104);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field792) {
            arg1 |= 0x200;
        }
        if (var9.method3947(var10, (byte) 123)) {
            arg1 |= 0x80;
        }
        if (var9.method3943(var10, (byte) 38)) {
            arg1 |= 0x100;
        }
        if (var9.method3942(var10, (byte) 123)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3947(var15, (byte) 94)) {
                arg1 |= 0x80;
            }
            if (var13.method3943(var15, (byte) -128)) {
                arg1 |= 0x100;
            }
            if (var13.method3942(var15, (byte) -93)) {
                arg1 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method3947(arg0, (byte) 103)) {
                arg1 |= 0x80;
            }
            if (var11.method3943(arg0, (byte) 60)) {
                arg1 |= 0x100;
            }
            if (var11.method3942(arg0, (byte) -91)) {
                arg1 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method3947(var16, (byte) 125)) {
                arg1 |= 0x80;
            }
            if (var14.method3943(var16, (byte) 18)) {
                arg1 |= 0x100;
            }
            if (var14.method3942(var16, (byte) 124)) {
                arg1 |= 0x400;
            }
        }
        int var17 = arg1 | 0x20;
        class474 var18 = arg5.method273((byte) 1, var17, true);
        var18.method2707(this.field792, var11, 0, var10, var9, arg0, 111, var7, arg4 - 1);
        if (var13 != null) {
            var18.method2707(this.field792, var14, 0, var15, var13, var16, 99, var7, arg4 - 1);
        }
        return var18;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILka;BIIIIB)Lka;")
    public final class474 method413(int arg0, class474 arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field782++;
        int var9 = this.field773[arg3];
        int var10 = this.field771[arg3];
        class701 var11 = this.field779.method1298(var10 >> 16, arg7 ^ 0x1);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg1.method273(arg2, arg4, true);
        }
        class701 var13 = null;
        if ((this.field777 || class130.field1838) && arg0 != -1 && arg0 < this.field771.length) {
            int var14 = this.field771[arg0];
            var13 = this.field779.method1298(var14 >> 16, 99);
            arg0 = var14 & 0xFFFF;
        }
        if (this.field792) {
            arg4 |= 0x200;
        }
        if (var11.method3947(var12, (byte) 123)) {
            arg4 |= 0x80;
        }
        if (var11.method3943(var12, (byte) -113)) {
            arg4 |= 0x100;
        }
        if (var11.method3942(var12, (byte) -39)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3947(arg0, (byte) 118)) {
                arg4 |= 0x80;
            }
            if (var13.method3943(arg0, (byte) -119)) {
                arg4 |= 0x100;
            }
            if (var13.method3942(arg0, (byte) 126)) {
                arg4 |= 0x400;
            }
        }
        if (arg7 != 103) {
            this.method417((byte) 39, null);
        }
        int var15 = arg4 | 0x20;
        class474 var16 = arg1.method273(arg2, var15, true);
        var16.method2707(this.field792, var13, arg6, var12, var11, arg0, 116, var9, arg5 - 1);
        return var16;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public static void method414(int arg0) {
        field794 = null;
        if (arg0 != 256) {
            method415(-127, -22);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)I")
    public static final int method415(int arg0, int arg1) {
        field768++;
        if (arg0 < 11) {
            field794 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIBZ)I")
    public final int method416(int arg0, int arg1, byte arg2, boolean arg3) {
        field787++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field771[arg0];
        class701 var8 = null;
        if (arg2 != -90) {
            method414(-109);
        }
        class701 var9 = this.field779.method1298(var7 >> 16, -36);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field777 || class130.field1838) && arg1 != -1 && this.field771.length > arg1) {
            int var11 = this.field771[arg1];
            var8 = this.field779.method1298(var11 >> 16, 120);
            var6 = var11 & 0xFFFF;
        }
        if (this.field792) {
            var5 |= 0x200;
        }
        if (var9.method3947(var10, (byte) 126)) {
            var5 |= 0x80;
        }
        if (var9.method3943(var10, (byte) -8)) {
            var5 |= 0x100;
        }
        if (var9.method3942(var10, (byte) 127)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method3947(var6, (byte) 103)) {
                var5 |= 0x80;
            }
            if (var8.method3943(var6, (byte) 63)) {
                var5 |= 0x100;
            }
            if (var8.method3942(var6, (byte) 123)) {
                var5 |= 0x400;
            }
        }
        if (this.field775 != null && arg3) {
            if (arg0 < this.field775.length) {
                int var12 = this.field775[arg0];
                if (var12 != 65535) {
                    class701 var13 = this.field779.method1298(var12 >> 16, 91);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method3947(var14, (byte) 125)) {
                            var5 |= 0x80;
                        }
                        if (var13.method3943(var14, (byte) -114)) {
                            var5 |= 0x100;
                        }
                        if (var13.method3942(var14, (byte) -44)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field777 || class130.field1838) && arg1 != -1 && arg1 < this.field775.length) {
                int var15 = this.field775[arg1];
                if (var15 != 65535) {
                    class701 var16 = this.field779.method1298(var15 >> 16, 77);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method3947(var17, (byte) 89)) {
                            var5 |= 0x80;
                        }
                        if (var16.method3943(var17, (byte) -110)) {
                            var5 |= 0x100;
                        }
                        if (var16.method3942(var17, (byte) 127)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLsl;)V")
    public final void method417(byte arg0, class461 arg1) {
        field772++;
        if (arg0 <= 26) {
            this.method410(126);
        }
        while (true) {
            int var3 = arg1.method2600((byte) -126);
            if (var3 == 0) {
                return;
            }
            this.method411(arg1, (byte) 116, var3);
        }
    }
}
