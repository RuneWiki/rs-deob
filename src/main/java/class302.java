import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class302 {

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "I")
    private int field4355 = -1;

    @OriginalMember(owner = "client!qw", name = "p", descriptor = "I")
    private int field4370 = 0;

    @OriginalMember(owner = "client!qw", name = "e", descriptor = "Lfea;")
    private class47 field4359 = new class47();

    @OriginalMember(owner = "client!qw", name = "q", descriptor = "Z")
    public boolean field4371 = false;

    @OriginalMember(owner = "client!qw", name = "o", descriptor = "I")
    private int field4369;

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "I")
    private int field4366;

    @OriginalMember(owner = "client!qw", name = "h", descriptor = "[[[I")
    private int[][][] field4362;

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "[Lgi;")
    private class589[] field4364;

    @OriginalMember(owner = "client!qw", name = "n", descriptor = "[I")
    public static int[] field4368 = new int[2048];

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!qw", name = "d", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!qw", name = "f", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!qw", name = "g", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!qw", name = "k", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)[[[I", line = 3)
    public final int[][][] method1882(byte arg0) {
        field4358++;
        if (this.field4369 != this.field4366) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != 35) {
            method1883(-106, -115, -67, (byte) -109, -80);
        }
        for (int var2 = 0; var2 < this.field4366; var2++) {
            this.field4364[var2] = class589.field8380;
        }
        return this.field4362;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIBI)V", line = 27)
    public static final void method1883(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = 57 % ((11 - arg3) / 46);
        field4356++;
        int var6 = 0;
        int var7 = arg2;
        int var8 = -arg2;
        int var9 = -1;
        class614.method3490(arg0, arg4 - arg2, -95, class495.field6944[arg1], arg4 + arg2);
        while (var7 > var6) {
            var9 += 2;
            var8 += var9;
            var6++;
            if (var8 >= 0) {
                var7--;
                var8 -= var7 << 1;
                int[] var10 = class495.field6944[arg1 + var7];
                int[] var11 = class495.field6944[arg1 - var7];
                int var12 = arg4 + var6;
                int var13 = arg4 - var6;
                class614.method3490(arg0, var13, -89, var10, var12);
                class614.method3490(arg0, var13, -120, var11, var12);
            }
            int var14 = arg4 + var7;
            int var15 = arg4 - var7;
            int[] var16 = class495.field6944[arg1 + var6];
            int[] var17 = class495.field6944[arg1 - var6];
            class614.method3490(arg0, var15, -103, var16, var14);
            class614.method3490(arg0, var15, -91, var17, var14);
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIII)I", line = 82)
    public static final int method1884(int arg0, int arg1, int arg2, int arg3) {
        field4360++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (arg2 < 16) {
            return -127;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return 1023 - arg3;
        }
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(III)V", line = 288)
    public class302(int arg0, int arg1, int arg2) {
        this.field4369 = arg1;
        this.field4366 = arg0;
        this.field4362 = new int[this.field4366][3][arg2];
        this.field4364 = new class589[this.field4369];
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V", line = 112)
    public static void method1885(int arg0) {
        int var1 = -115 % ((20 - arg0) / 53);
        field4368 = null;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(BI)[[I", line = 122)
    public final int[][] method1886(byte arg0, int arg1) {
        int var3 = 102 % ((arg0 + 27) / 38);
        field4365++;
        if (this.field4369 == this.field4366) {
            this.field4371 = this.field4364[arg1] == null;
            this.field4364[arg1] = class589.field8380;
            return this.field4362[arg1];
        } else if (this.field4366 == 1) {
            this.field4371 = this.field4355 != arg1;
            this.field4355 = arg1;
            return this.field4362[0];
        } else {
            class589 var4 = this.field4364[arg1];
            if (var4 == null) {
                this.field4371 = true;
                if (this.field4366 > this.field4370) {
                    var4 = new class589(arg1, this.field4370);
                    this.field4370++;
                } else {
                    class589 var5 = (class589) this.field4359.method428(2000);
                    var4 = new class589(arg1, var5.field8376);
                    this.field4364[var5.field8378] = null;
                    var5.method911(-52);
                }
                this.field4364[arg1] = var4;
            } else {
                this.field4371 = false;
            }
            this.field4359.method415((byte) 38, var4);
            return this.field4362[var4.field8376];
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(B)V", line = 188)
    public static final void method1887(byte arg0) {
        field4357++;
        if (arg0 >= -46) {
            field4368 = null;
        }
        if (class127.field2087 != null) {
            class127.field2087.method2069((byte) -93);
        }
        if (class384.field5706 != null) {
            class384.field5706.method2069((byte) -116);
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(BI)Lio;", line = 209)
    public static final class151 method1888(byte arg0, int arg1) {
        field4363++;
        class151[] var2 = class211.method1384(14);
        if (arg0 != 10) {
            return null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field2281 == arg1) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 235)
    public static final int method1889(String arg0, boolean arg1) {
        field4361++;
        return arg1 ? -117 : class362.method2188(arg0, 66, true, 10);
    }

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "(B)V", line = 254)
    public final void method1890(byte arg0) {
        int var2 = 0;
        if (arg0 != -82) {
            this.field4369 = 2;
        }
        while (var2 < this.field4366) {
            this.field4362[var2][0] = null;
            this.field4362[var2][1] = null;
            this.field4362[var2][2] = null;
            this.field4362[var2] = null;
            var2++;
        }
        field4367++;
        this.field4362 = null;
        this.field4364 = null;
        this.field4359.method425(arg0 ^ 0x7A);
        this.field4359 = null;
    }
}
