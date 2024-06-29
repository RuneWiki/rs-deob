import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class572 extends class477 {

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "Z")
    public boolean field7932 = true;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public static int field7918 = -50;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "[I")
    public static int[] field7921 = new int[1000];

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "Ljj;")
    public static class398 field7920 = new class398(19, 7);

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field7916;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field7919;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public static int field7923;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public static int field7924;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field7926;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    public static int field7927;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public static int field7928;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public static int field7929;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
    public static int field7930;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    public static int field7933;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "I")
    public static int field7934;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "Lcd;")
    public class498 field7936;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "[I")
    public int[] field7917;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "[I")
    private int[] field7925;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "[I")
    public static int[] field7935;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field7922;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "[[I")
    private int[][] field7931;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLdga;)V")
    public final void method3228(byte arg0, class138 arg1) {
        if (arg0 != 4) {
            return;
        }
        while (true) {
            int var3 = arg1.method957((byte) -106);
            if (var3 == 0) {
                field7933++;
                return;
            }
            this.method3229(0, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILdga;)V")
    private final void method3229(int arg0, int arg1, class138 arg2) {
        if (arg1 == 1) {
            this.field7922 = class105.method562(arg2.method907(false), '<', true);
        } else if (arg1 == 2) {
            int var4 = arg2.method957((byte) -78);
            this.field7917 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7917[var5] = arg2.method922((byte) -119);
            }
        } else if (arg1 == 3) {
            int var6 = arg2.method957((byte) -128);
            this.field7925 = new int[var6];
            this.field7931 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method922((byte) -127);
                class270 var9 = class496.method2799((byte) -117, var8);
                if (var9 != null) {
                    this.field7925[var7] = var8;
                    this.field7931[var7] = new int[var9.field3678];
                    for (int var10 = 0; var10 < var9.field3678; var10++) {
                        this.field7931[var7][var10] = arg2.method922((byte) -116);
                    }
                }
            }
        } else if (arg1 == 4) {
            this.field7932 = false;
        }
        if (arg0 != 0) {
            this.field7917 = null;
        }
        field7928++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Ljava/lang/String;")
    public final String method3230(int arg0) {
        field7916++;
        StringBuffer var2 = new StringBuffer(arg0);
        if (this.field7922 == null) {
            return "";
        }
        var2.append(this.field7922[0]);
        for (int var3 = 1; var3 < this.field7922.length; var3++) {
            var2.append("...");
            var2.append(this.field7922[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Loa;ZJ)V")
    public static final void method3231(class689 arg0, boolean arg1, long arg2) {
        class84.field1036 = 0;
        class667.field9493 = class443.field6116;
        if (!arg1) {
            method3234(true);
        }
        field7919++;
        class443.field6116 = 0;
        long var4 = class669.method3713(0);
        for (class117 var6 = (class117) class379.field5440.method2224((byte) -112); var6 != null; var6 = (class117) class379.field5440.method2222((byte) -26)) {
            if (var6.method719(arg0, arg2)) {
                class84.field1036++;
            }
        }
        if (class291.field3891 && (arg2 % 100L) == 0L) {
            System.out.println("Particle system count: " + class379.field5440.method2221(false) + ", running: " + class84.field1036 + ". Particles: " + class443.field6116 + ". Time taken: " + (class669.method3713(0) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)I")
    public final int method3232(int arg0, int arg1, int arg2) {
        field7926++;
        if (this.field7925 == null || arg2 < 0 || arg2 > this.field7925.length) {
            return -1;
        } else if (this.field7931[arg2] == null || arg1 < 0 || this.field7931[arg2].length < arg1) {
            return -1;
        } else {
            int var4 = -77 / ((45 - arg0) / 51);
            return this.field7931[arg2][arg1];
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILdga;)Ljava/lang/String;")
    public final String method3233(int arg0, class138 arg1) {
        field7923++;
        StringBuffer var3 = new StringBuffer(80);
        int var4 = 49 / ((arg0 + 60) / 32);
        if (this.field7925 != null) {
            for (int var5 = 0; var5 < this.field7925.length; var5++) {
                var3.append(this.field7922[var5]);
                var3.append(this.field7936.method2806(this.field7931[var5], arg1.method918((byte) 67, class496.method2799((byte) 64, this.field7925[var5]).field3676), this.method3235(var5, (byte) -78), true));
            }
        }
        var3.append(this.field7922[this.field7922.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
    public static void method3234(boolean arg0) {
        field7920 = null;
        if (arg0) {
            field7921 = null;
            field7935 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)Llp;")
    public final class270 method3235(int arg0, byte arg1) {
        field7924++;
        int var3 = 20 % ((-arg1 - 32) / 43);
        return this.field7925 == null || arg0 < 0 || this.field7925.length < arg0 ? null : class496.method2799((byte) 27, this.field7925[arg0]);
    }

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)I")
    public final int method3236(int arg0) {
        field7927++;
        if (this.field7925 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.method3228((byte) -5, null);
            }
            return this.field7925.length;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ldga;B[I)V")
    public final void method3237(class138 arg0, byte arg1, int[] arg2) {
        field7929++;
        if (this.field7925 == null) {
            return;
        }
        int var4 = 0;
        if (arg1 != -61) {
            return;
        }
        while (var4 < this.field7925.length) {
            if (arg2.length <= var4) {
                return;
            }
            int var5 = this.method3235(var4, (byte) 90).field3677;
            if (var5 > 0) {
                arg0.method938((long) arg2[var4], false, var5);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)V")
    public final void method3238(int arg0) {
        if (arg0 != 32768) {
            return;
        }
        field7934++;
        if (this.field7917 != null) {
            for (int var2 = 0; var2 < this.field7917.length; var2++) {
                this.field7917[var2] = class288.method1722(this.field7917[var2], 32768);
            }
        }
    }
}
