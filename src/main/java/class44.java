import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class44 extends class164 {

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "[J")
    private long[] field912 = new long[10];

    @OriginalMember(owner = "client!dj", name = "D", descriptor = "I")
    private int field923 = 1;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    private int field920 = 256;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    private int field913 = 0;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "J")
    private long field904 = class217.method1351(61);

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "Loc;")
    public static class151 field908 = class137.method873(2, "welle2:");

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field907 = 0;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field916 = 20;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public static int field919 = 0;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "Loc;")
    public static class151 field918 = class137.method873(2, "; Expires=");

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "Loc;")
    public static class151 field914 = class137.method873(2, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Z")
    public static boolean field909 = true;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public static int field921 = 0;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    private int field905;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "Leb;")
    public static class47 field917;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B[B)V")
    public static final void method316(byte arg0, byte[] arg1) {
        field910++;
        int var2 = 0;
        int var3 = 83 / ((arg0 - 26) / 50);
        while (true) {
            while (var2 < arg1.length) {
                int var4 = arg1[var2++] * 64 - class63.field1228;
                int var5 = arg1[var2++] * 64 - class36.field759;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class217.field3788 && class27.field581 > var5 + 64) {
                    int var6 = var4 >> 6;
                    int var7 = class27.field581 - var5 - 1 >> 6;
                    for (int var8 = 0; var8 < 64; var8++) {
                        for (int var9 = -64; var9 < 0; var9++) {
                            byte var10 = arg1[var2++];
                            if (var10 != 0) {
                                if ((var10 & 0x1) == 1) {
                                    byte var11 = arg1[var2++];
                                    if (class166.field3007[var6][var7] == null) {
                                        class166.field3007[var6][var7] = new byte[4096];
                                    }
                                    class166.field3007[var6][var7][(-(var9 + 1) << 6) + var8] = (byte) var11;
                                }
                                if ((var10 & 0x2) == 2) {
                                    byte var12 = arg1[var2++];
                                    if (class106.field1876[var6][var7] == null) {
                                        class106.field1876[var6][var7] = new byte[4096];
                                    }
                                    class106.field1876[var6][var7][(-(var9 + 1) << 6) + var8] = (byte) (var12 - 28);
                                }
                                if ((var10 & 0x4) == 4) {
                                    var2 += 3;
                                    int var13 = (arg1[var2 - 1] & 0xFF) + ((arg1[var2 - 3] & 0xFF) << 16) + ((arg1[var2 + -2] & 0xFF) << 8);
                                    if (class175.field3171[var6][var7] == null) {
                                        class175.field3171[var6][var7] = new int[4096];
                                    }
                                    var13--;
                                    class93 var14 = class5.method32((byte) 119, var13);
                                    if (var14.field1746 != null) {
                                        var14 = var14.method591((byte) -127);
                                        if (var14 == null || var14.field1708 == -1) {
                                            continue;
                                        }
                                    }
                                    class175.field3171[var6][var7][(-(var9 + 1) << 6) + var8] = var14.field1709 + 1;
                                    class117 var15 = new class117();
                                    var15.field2107 = var14.field1708;
                                    var15.field2102 = class27.field581 - var5;
                                    var15.field2106 = var4;
                                    client.field699.method1361(var15, (byte) 71);
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < 64; var16++) {
                        for (int var17 = -64; var17 < 0; var17++) {
                            byte var18 = arg1[var2++];
                            if (var18 != 0) {
                                if ((var18 & 0x1) == 1) {
                                    var2++;
                                }
                                if ((var18 & 0x2) == 2) {
                                    var2++;
                                }
                                if ((var18 & 0x4) == 4) {
                                    var2 += 3;
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lw;Z)V")
    public static final void method317(class228 arg0, boolean arg1) {
        field922++;
        if (arg0.field3984 == 0) {
            return;
        }
        if (arg0.field3969 != -1 && arg0.field3969 < 32768) {
            class203 var2 = class122.field2190[arg0.field3969];
            if (var2 != null) {
                int var3 = arg0.field3976 - var2.field3976;
                int var4 = arg0.field4029 - var2.field4029;
                if (var3 != 0 || var4 != 0) {
                    arg0.field4017 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field3969 >= 32768) {
            int var5 = arg0.field3969 - 32768;
            if (class163.field2943 == var5) {
                var5 = 2047;
            }
            class20 var6 = class179.field3229[var5];
            if (var6 != null) {
                int var7 = arg0.field4029 - var6.field4029;
                int var8 = arg0.field3976 - var6.field3976;
                if (var8 != 0 || var7 != 0) {
                    arg0.field4017 = (int) (Math.atan2((double) var8, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field4018 != 0 || arg0.field3990 != 0) && (arg0.field3999 == 0 || arg0.field4003 > 0)) {
            int var9 = arg0.field3976 - (arg0.field4018 - class232.field4188 - class232.field4188) * 64;
            int var10 = arg0.field4029 - (arg0.field3990 - class64.field1255 - class64.field1255) * 64;
            if (var9 != 0 || var10 != 0) {
                arg0.field4017 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg0.field3990 = 0;
            arg0.field4018 = 0;
        }
        if (arg1) {
            method318(-66);
        }
        int var11 = arg0.field4017 - arg0.field4024 & 0x7FF;
        if (var11 == 0) {
            arg0.field4019 = 0;
            return;
        }
        arg0.field4019++;
        if (var11 > 1024) {
            arg0.field4024 -= arg0.field3984;
            boolean var12 = true;
            if (var11 < arg0.field3984 || 2048 - arg0.field3984 < var11) {
                arg0.field4024 = arg0.field4017;
                var12 = false;
            }
            if (arg0.field4002 == arg0.field3993 && (arg0.field4019 > 25 || var12)) {
                if (arg0.field4036 == -1) {
                    arg0.field3993 = arg0.field4025;
                } else {
                    arg0.field3993 = arg0.field4036;
                }
            }
        } else {
            arg0.field4024 += arg0.field3984;
            boolean var13 = true;
            if (var11 < arg0.field3984 || var11 > 2048 - arg0.field3984) {
                var13 = false;
                arg0.field4024 = arg0.field4017;
            }
            if (arg0.field4002 == arg0.field3993 && (arg0.field4019 > 25 || var13)) {
                if (arg0.field3971 == -1) {
                    arg0.field3993 = arg0.field4025;
                } else {
                    arg0.field3993 = arg0.field3971;
                }
            }
        }
        arg0.field4024 &= 0x7FF;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
    public static void method318(int arg0) {
        field908 = null;
        field914 = null;
        field918 = null;
        int var1 = -82 % ((arg0 + 26) / 32);
        field917 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public final void method319(int arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field912[var2] = 0L;
        }
        if (arg0 <= -79) {
            field915++;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)I")
    public final int method320(int arg0, int arg1, int arg2) {
        field911++;
        int var4 = this.field920;
        this.field920 = 300;
        int var5 = this.field923;
        this.field923 = 1;
        this.field904 = class217.method1351(-110);
        if (this.field912[this.field905] == 0L) {
            this.field920 = var4;
            this.field923 = var5;
        } else if (this.field912[this.field905] < this.field904) {
            this.field920 = (int) ((long) (arg1 * 2560) / (this.field904 - this.field912[this.field905]));
        }
        if (this.field920 < 25) {
            this.field920 = 25;
        }
        if (arg2 < 77) {
            return 25;
        }
        if (this.field920 > 256) {
            this.field920 = 256;
            this.field923 = (int) ((long) arg1 - (this.field904 - this.field912[this.field905]) / 10L);
        }
        if (arg1 < this.field923) {
            this.field923 = arg1;
        }
        this.field912[this.field905] = this.field904;
        this.field905 = (this.field905 + 1) % 10;
        if (this.field923 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field912[var6] != 0L) {
                    this.field912[var6] += this.field923;
                }
            }
        }
        int var7 = 0;
        if (arg0 > this.field923) {
            this.field923 = arg0;
        }
        class156.method1027(0, (long) this.field923);
        while (this.field913 < 256) {
            this.field913 += this.field920;
            var7++;
        }
        this.field913 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class44() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field912[var1] = this.field904;
        }
    }
}
