import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class406 extends class115 {

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
    private int field5897 = 1;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    private int field5903 = 204;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    private int field5904 = 1;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
    public static int field5899 = 0;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "J")
    public static long field5901 = 0L;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "Z")
    public static boolean field5900 = false;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "Lin;")
    public static class50 field5896 = new class50();

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(I)V", line = 6)
    public static final void method2563(int arg0) {
        class331 var1 = class42.field512;
        synchronized (class42.field512) {
            class42.field512.method2043(-84);
            if (arg0 != 1) {
                field5901 = -85L;
            }
        }
        ++field5898;
        class331 var2 = class140.field1983;
        synchronized (class140.field1983) {
            class140.field1983.method2043(-62);
        }
        class148 var3 = class134.field1864;
        synchronized (class134.field1864) {
            class134.field1864.method879((byte) 86);
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)[I", line = 28)
    public final int[] method57(int arg0, int arg1) {
        ++field5895;
        if (arg1 != 0) {
            this.field5904 = -48;
        }
        int[] var3 = super.field1340.method14(69, arg0);
        if (super.field1340.field35) {
            for (int var4 = 0; ~class218.field2979 < ~var4; ++var4) {
                int var5 = class43.field530[var4];
                int var6 = class193.field2634[arg0];
                int var7 = this.field5897 * var5 >> 12;
                int var8 = this.field5904 * var6 >> 12;
                int var9 = var5 % (4096 / this.field5897) * this.field5897;
                int var10 = var6 % (4096 / this.field5904) * this.field5904;
                if (this.field5903 > var10) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field5903 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field5903) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 111)
    public class406() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLbk;I)V", line = 118)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (arg0 >= 83) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 == -3) {
                        this.field5903 = arg1.method1355(32136);
                    }
                } else {
                    this.field5904 = arg1.method1342((byte) -126);
                }
            } else {
                this.field5897 = arg1.method1342((byte) -128);
            }
            ++field5905;
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(II)I", line = 162)
    public static final int method2564(int arg0, int arg1) {
        int var2 = -84 % ((75 - arg0) / 32);
        ++field5902;
        int var3 = arg1 >>> 1;
        int var4 = var3 | var3 >>> 1;
        int var5 = var4 | var4 >>> 2;
        int var6 = var5 | var5 >>> 4;
        int var7 = var6 | var6 >>> 8;
        int var8 = var7 | var7 >>> 16;
        return ~var8 & arg1;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V", line = 179)
    public static void method2565(boolean arg0) {
        if (!arg0) {
            method2565(true);
        }
        field5896 = null;
    }
}
