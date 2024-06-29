import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class582 {

    @OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
    public int field7942 = -1;

    @OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
    public int field7943 = -1;

    @OriginalMember(owner = "client!fs", name = "k", descriptor = "Z")
    public boolean field7940 = false;

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "Z")
    public boolean field7944 = false;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public int field7934 = -1;

    @OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
    public int field7941 = 2;

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "Z")
    public boolean field7932 = false;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "Z")
    public boolean field7933 = false;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    public int field7947 = 5;

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
    public int field7950 = -1;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
    public int field7945 = 99;

    @OriginalMember(owner = "client!fs", name = "B", descriptor = "I")
    public int field7957 = -1;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field7930;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
    public static int field7931;

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
    public static int field7946;

    @OriginalMember(owner = "client!fs", name = "w", descriptor = "I")
    public int field7952;

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "I")
    public static int field7953;

    @OriginalMember(owner = "client!fs", name = "y", descriptor = "I")
    public static int field7954;

    @OriginalMember(owner = "client!fs", name = "A", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!fs", name = "C", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!fs", name = "j", descriptor = "Laaa;")
    public class644 field7939;

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "[I")
    private int[] field7935;

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "[I")
    public int[] field7936;

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "[I")
    public int[] field7948;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "[I")
    public int[] field7949;

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "[I")
    public int[] field7955;

    @OriginalMember(owner = "client!fs", name = "D", descriptor = "[I")
    public int[] field7959;

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "[Z")
    public boolean[] field7951;

    @OriginalMember(owner = "client!fs", name = "i", descriptor = "[[I")
    public int[][] field7938;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Les;B)V")
    public final void method3350(class403 arg0, byte arg1) {
        if (arg1 <= 17) {
            return;
        }
        while (true) {
            int var3 = arg0.method2396((byte) -105);
            if (var3 == 0) {
                field7954++;
                return;
            }
            this.method3354(var3, true, arg0);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIILka;IB)Lka;")
    public final class498 method3351(int arg0, int arg1, int arg2, class498 arg3, int arg4, byte arg5) {
        field7931++;
        int var7 = this.field7936[arg1];
        int var8 = this.field7955[arg1];
        class338 var9 = this.field7939.method3602(var8 >> 16, (byte) -35);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method364((byte) 1, arg0, true);
        }
        class338 var11 = null;
        if ((this.field7932 || class688.field9381) && arg4 != -1 && this.field7955.length > arg4) {
            int var12 = this.field7955[arg4];
            var11 = this.field7939.method3602(var12 >> 16, (byte) -37);
            arg4 = var12 & 0xFFFF;
        }
        class338 var13 = null;
        class338 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field7935 != null) {
            if (arg1 < this.field7935.length) {
                var15 = this.field7935[arg1];
                if (var15 != 65535) {
                    var13 = this.field7939.method3602(var15 >> 16, (byte) -40);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field7932 || class688.field9381) && arg4 != -1 && this.field7935.length > arg4) {
                var16 = this.field7935[arg4];
                if (var16 != 65535) {
                    var14 = this.field7939.method3602(var16 >> 16, (byte) -72);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field7940) {
            arg0 |= 0x200;
        }
        if (var9.method1998(var10, (byte) 17)) {
            arg0 |= 0x80;
        }
        if (var9.method2001(var10, 7402)) {
            arg0 |= 0x100;
        }
        if (var9.method1997(var10, true)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1998(var15, (byte) 17)) {
                arg0 |= 0x80;
            }
            if (var13.method2001(var15, 7402)) {
                arg0 |= 0x100;
            }
            if (var13.method1997(var15, true)) {
                arg0 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method1998(arg4, (byte) 17)) {
                arg0 |= 0x80;
            }
            if (var11.method2001(arg4, 7402)) {
                arg0 |= 0x100;
            }
            if (var11.method1997(arg4, true)) {
                arg0 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method1998(var16, (byte) 17)) {
                arg0 |= 0x80;
            }
            if (var14.method2001(var16, 7402)) {
                arg0 |= 0x100;
            }
            if (var14.method1997(var16, true)) {
                arg0 |= 0x400;
            }
        }
        int var17 = arg0 | 0x20;
        class498 var18 = arg3.method364((byte) 1, var17, true);
        var18.method2944(var10, var7, var11, this.field7940, 99, arg2 - 1, var9, 0, arg4);
        if (arg5 < 95) {
            this.method3353(19, -30, -5, (byte) 113, -85, -125, null, true);
        }
        if (var13 != null) {
            var18.method2944(var15, var7, var14, this.field7940, 22, arg2 - 1, var13, 0, var16);
        }
        return var18;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZIZ)I")
    public final int method3352(int arg0, boolean arg1, int arg2, boolean arg3) {
        field7953++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field7955[arg2];
        class338 var8 = null;
        if (!arg3) {
            this.field7949 = null;
        }
        class338 var9 = this.field7939.method3602(var7 >> 16, (byte) -38);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field7932 || class688.field9381) && arg0 != -1 && this.field7955.length > arg0) {
            int var11 = this.field7955[arg0];
            var8 = this.field7939.method3602(var11 >> 16, (byte) -44);
            var6 = var11 & 0xFFFF;
        }
        if (this.field7940) {
            var5 |= 0x200;
        }
        if (var9.method1998(var10, (byte) 17)) {
            var5 |= 0x80;
        }
        if (var9.method2001(var10, 7402)) {
            var5 |= 0x100;
        }
        if (var9.method1997(var10, arg3)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method1998(var6, (byte) 17)) {
                var5 |= 0x80;
            }
            if (var8.method2001(var6, 7402)) {
                var5 |= 0x100;
            }
            if (var8.method1997(var6, true)) {
                var5 |= 0x400;
            }
        }
        if (this.field7935 != null && arg1) {
            if (this.field7935.length > arg2) {
                int var12 = this.field7935[arg2];
                if (var12 != 65535) {
                    class338 var13 = this.field7939.method3602(var12 >> 16, (byte) -79);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method1998(var14, (byte) 17)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2001(var14, 7402)) {
                            var5 |= 0x100;
                        }
                        if (var13.method1997(var14, true)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field7932 || class688.field9381) && arg0 != -1 && arg0 < this.field7935.length) {
                int var15 = this.field7935[arg0];
                if (var15 != 65535) {
                    class338 var16 = this.field7939.method3602(var15 >> 16, (byte) -112);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method1998(var17, (byte) 17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2001(var17, 7402)) {
                            var5 |= 0x100;
                        }
                        if (var16.method1997(var17, true)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIBIILka;Z)Lka;")
    public final class498 method3353(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class498 arg6, boolean arg7) {
        field7946++;
        int var9 = this.field7936[arg2];
        int var10 = this.field7955[arg2];
        class338 var11 = this.field7939.method3602(var10 >> 16, (byte) -37);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg6.method364(arg3, arg1, true);
        }
        class338 var13 = null;
        if ((this.field7932 || class688.field9381) && arg0 != -1 && arg0 < this.field7955.length) {
            int var14 = this.field7955[arg0];
            var13 = this.field7939.method3602(var14 >> 16, (byte) -78);
            arg0 = var14 & 0xFFFF;
        }
        if (this.field7940) {
            arg1 |= 0x200;
        }
        if (var11.method1998(var12, (byte) 17)) {
            arg1 |= 0x80;
        }
        if (var11.method2001(var12, 7402)) {
            arg1 |= 0x100;
        }
        if (var11.method1997(var12, arg7)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method1998(arg0, (byte) 17)) {
                arg1 |= 0x80;
            }
            if (var13.method2001(arg0, 7402)) {
                arg1 |= 0x100;
            }
            if (var13.method1997(arg0, true)) {
                arg1 |= 0x400;
            }
        }
        int var15 = arg1 | 0x20;
        class498 var16 = arg6.method364(arg3, var15, arg7);
        var16.method2944(var12, var9, var13, this.field7940, 120, arg5 - 1, var11, arg4, arg0);
        return var16;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZLes;)V")
    private final void method3354(int arg0, boolean arg1, class403 arg2) {
        if (arg0 == 1) {
            int var16 = arg2.method2390((byte) 68);
            this.field7936 = new int[var16];
            for (int var17 = 0; var17 < var16; var17++) {
                this.field7936[var17] = arg2.method2390((byte) -104);
            }
            this.field7955 = new int[var16];
            for (int var18 = 0; var18 < var16; var18++) {
                this.field7955[var18] = arg2.method2390((byte) -125);
            }
            for (int var19 = 0; var19 < var16; var19++) {
                this.field7955[var19] += arg2.method2390((byte) -97) << 16;
            }
        } else if (arg0 == 2) {
            this.field7957 = arg2.method2390((byte) 93);
        } else if (arg0 == 3) {
            this.field7951 = new boolean[256];
            int var4 = arg2.method2396((byte) 36);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7951[arg2.method2396((byte) -102)] = true;
            }
        } else if (arg0 == 5) {
            this.field7947 = arg2.method2396((byte) 11);
        } else if (arg0 == 6) {
            this.field7934 = arg2.method2390((byte) 10);
        } else if (arg0 == 7) {
            this.field7942 = arg2.method2390((byte) 100);
        } else if (arg0 == 8) {
            this.field7945 = arg2.method2396((byte) 99);
        } else if (arg0 == 9) {
            this.field7943 = arg2.method2396((byte) -78);
        } else if (arg0 == 10) {
            this.field7950 = arg2.method2396((byte) -128);
        } else if (arg0 == 11) {
            this.field7941 = arg2.method2396((byte) 113);
        } else if (arg0 == 12) {
            int var6 = arg2.method2396((byte) -97);
            this.field7935 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field7935[var7] = arg2.method2390((byte) -122);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field7935[var8] = (arg2.method2390((byte) -112) << 16) + this.field7935[var8];
            }
        } else if (arg0 == 13) {
            int var9 = arg2.method2390((byte) 60);
            this.field7938 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg2.method2396((byte) 58);
                if (var11 > 0) {
                    this.field7938[var10] = new int[var11];
                    this.field7938[var10][0] = arg2.method2358(69);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field7938[var10][var12] = arg2.method2390((byte) 96);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field7940 = true;
        } else if (arg0 == 15) {
            this.field7932 = true;
        } else if (arg0 == 16) {
            this.field7944 = true;
        } else if (arg0 == 18) {
            this.field7933 = true;
        } else if (arg0 == 19) {
            if (this.field7949 == null) {
                this.field7949 = new int[this.field7938.length];
                for (int var15 = 0; var15 < this.field7938.length; var15++) {
                    this.field7949[var15] = 255;
                }
            }
            this.field7949[arg2.method2396((byte) 97)] = arg2.method2396((byte) -106);
        } else if (arg0 == 20) {
            if (this.field7948 == null || this.field7959 == null) {
                this.field7948 = new int[this.field7938.length];
                this.field7959 = new int[this.field7938.length];
                for (int var13 = 0; var13 < this.field7938.length; var13++) {
                    this.field7948[var13] = 256;
                    this.field7959[var13] = 256;
                }
            }
            int var14 = arg2.method2396((byte) -82);
            this.field7948[var14] = arg2.method2390((byte) -128);
            this.field7959[var14] = arg2.method2390((byte) 87);
        }
        if (!arg1) {
            this.method3356((byte) 13);
        }
        field7930++;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method3355(int arg0, int arg1, int arg2, Class arg3) {
        class727 var4 = class107.field1351[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class10 var5 = var4.field10174; var5 != null; var5 = var5.field186) {
            class712 var6 = var5.field187;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field9994 == arg1 && var6.field9997 == arg2) {
                class327.method1946(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)V")
    public final void method3356(byte arg0) {
        field7937++;
        if (this.field7943 == -1) {
            if (this.field7951 == null) {
                this.field7943 = 0;
            } else {
                this.field7943 = 2;
            }
        }
        if (this.field7950 == -1) {
            if (this.field7951 == null) {
                this.field7950 = 0;
            } else {
                this.field7950 = 2;
            }
        }
        if (arg0 <= 36) {
            this.field7938 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lqh;B)V")
    public static final void method3357(class75 arg0, byte arg1) {
        field7958++;
        if (arg0 == null) {
            return;
        }
        class5.field52.method2732(arg0, arg1 ^ 0xFFFFAA6D);
        class245.field2894++;
        if (arg1 != -34) {
            field7956 = 69;
        }
        Object var2 = null;
        class581 var5;
        if (arg0.field1031 || "".equals(arg0.field1028)) {
            var5 = new class581(arg0.field1028);
            class282.field3279++;
        } else {
            long var3 = arg0.field1024;
            for (var5 = (class581) class90.field1207.method2121(79, var3); var5 != null && !var5.field7922.equals(arg0.field1028); var5 = (class581) class90.field1207.method2118(0)) {
            }
            if (var5 == null) {
                var5 = (class581) class488.field6822.method1684(var3, -359);
                if (var5 != null && !var5.field7922.equals(arg0.field1028)) {
                    var5 = null;
                }
                if (var5 == null) {
                    var5 = new class581(arg0.field1028);
                }
                class90.field1207.method2112(var5, (byte) 6, var3);
                class282.field3279++;
            }
        }
        if (var5.method3349(20413, arg0)) {
            class119.method934(var5, (byte) 67);
        }
    }
}
