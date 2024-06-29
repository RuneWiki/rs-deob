import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class282 {

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public int field3765 = -1;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "Z")
    public boolean field3768 = false;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    private int field3776 = 0;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    private int field3777 = 0;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Z")
    public boolean field3770 = false;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    private int field3767 = 128;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    private int field3775 = 0;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    private int field3774 = 128;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "[I")
    public static int[] field3772 = new int[256];

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public int field3761;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    private int field3771;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "[S")
    private short[] field3762;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "[S")
    private short[] field3764;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "[S")
    private short[] field3773;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "[S")
    private short[] field3778;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZIILpe;II)Lsj;", line = 16)
    public final class73 method1780(boolean arg0, int arg1, int arg2, class391 arg3, int arg4, int arg5) {
        field3769++;
        int var7 = arg5;
        class209 var8 = this.field3765 == -1 || arg1 == -1 ? null : class288.method1819(this.field3765, (byte) 105);
        if (var8 != null) {
            var7 = arg5 | var8.method1438(arg1, false, arg2, (byte) -78);
        }
        if (this.field3774 != 128) {
            var7 |= 0x2;
        }
        if (this.field3767 != 128 || this.field3776 != 0) {
            var7 |= 0x5;
        }
        class410 var9 = class167.field2487;
        class73 var10;
        synchronized (class167.field2487) {
            var10 = (class73) class167.field2487.method2537(-126, (long) (this.field3761 |= arg3.field5484 << 29));
        }
        if (var10 == null || arg3.method183(var10.method426(), var7) != 0) {
            if (var10 != null) {
                var7 = arg3.method163(var7, var10.method426());
            }
            int var11 = var7;
            if (this.field3778 != null) {
                var11 = var7 | 0x2000;
            }
            if (this.field3773 != null) {
                var11 |= 0x4000;
            }
            class84 var12 = class128.method1002(this.field3771, (byte) 126, 0, class218.field3033);
            if (var12 == null) {
                return null;
            }
            var10 = arg3.method237(var12, var11, class26.field468, this.field3775 + 64, this.field3777 + 850);
            if (this.field3778 != null) {
                for (int var13 = 0; var13 < this.field3778.length; var13++) {
                    var10.method424(this.field3778[var13], this.field3764[var13]);
                }
            }
            if (this.field3773 != null) {
                for (int var14 = 0; var14 < this.field3773.length; var14++) {
                    var10.method418(this.field3773[var14], this.field3762[var14]);
                }
            }
            var10.method463(var7);
            class410 var15 = class167.field2487;
            synchronized (class167.field2487) {
                class167.field2487.method2542(var10, (byte) -76, (long) (this.field3761 |= arg3.field5484 << 29));
            }
        }
        class73 var16 = var10.method440((byte) 2, var7, arg0);
        if (var8 != null) {
            var16 = var8.method1440((byte) 2, arg1, arg2, -593, 0, arg4, var7, var16);
        }
        if (this.field3767 != 128 || this.field3774 != 128) {
            var16.method445(this.field3767, this.field3774, this.field3767);
        }
        if (this.field3776 != 0) {
            if (this.field3776 == 90) {
                var16.method439(4096);
            }
            if (this.field3776 == 180) {
                var16.method439(8192);
            }
            if (this.field3776 == 270) {
                var16.method439(12288);
            }
        }
        var16.method463(arg5);
        return var16;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILap;)V", line = 127)
    public final void method1781(int arg0, class289 arg1) {
        if (arg0 != 0) {
            return;
        }
        field3766++;
        while (true) {
            int var3 = arg1.method1861((byte) -72);
            if (var3 == 0) {
                return;
            }
            this.method1782(var3, arg0 + 124, arg1);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILap;)V", line = 148)
    private final void method1782(int arg0, int arg1, class289 arg2) {
        int var4 = -94 / ((arg1 - 67) / 55);
        field3763++;
        if (arg0 == 1) {
            this.field3771 = arg2.method1853(91);
        } else if (arg0 == 2) {
            this.field3765 = arg2.method1853(125);
        } else if (arg0 == 4) {
            this.field3767 = arg2.method1853(-31);
        } else if (arg0 == 5) {
            this.field3774 = arg2.method1853(104);
        } else if (arg0 == 6) {
            this.field3776 = arg2.method1853(-70);
        } else if (arg0 == 7) {
            this.field3775 = arg2.method1861((byte) -72);
        } else if (arg0 == 8) {
            this.field3777 = arg2.method1861((byte) -72);
        } else if (arg0 == 9) {
            this.field3770 = true;
        } else if (arg0 == 10) {
            this.field3768 = true;
        } else if (arg0 == 40) {
            int var7 = arg2.method1861((byte) -72);
            this.field3778 = new short[var7];
            this.field3764 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3778[var8] = (short) arg2.method1853(94);
                this.field3764[var8] = (short) arg2.method1853(-120);
            }
        } else if (arg0 == 41) {
            int var5 = arg2.method1861((byte) -72);
            this.field3773 = new short[var5];
            this.field3762 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3773[var6] = (short) arg2.method1853(105);
                this.field3762[var6] = (short) arg2.method1853(102);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 244)
    public static void method1783(int arg0) {
        if (arg0 <= 39) {
            method1783(-73);
        }
        field3772 = null;
    }
}
