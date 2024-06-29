import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class586 {

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    private int field8174 = 128;

    @OriginalMember(owner = "client!or", name = "g", descriptor = "Z")
    public boolean field8178 = false;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "I")
    public int field8185 = -1;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "I")
    private int field8180 = 0;

    @OriginalMember(owner = "client!or", name = "k", descriptor = "I")
    private int field8182 = 0;

    @OriginalMember(owner = "client!or", name = "p", descriptor = "B")
    public byte field8187 = 0;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "I")
    private int field8181 = 0;

    @OriginalMember(owner = "client!or", name = "t", descriptor = "I")
    private int field8191 = 128;

    @OriginalMember(owner = "client!or", name = "x", descriptor = "I")
    private int field8195 = -1;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "[I")
    public static int[] field8179 = new int[4096];

    @OriginalMember(owner = "client!or", name = "s", descriptor = "Lfc;")
    public static class235 field8190 = new class235(10, -2);

    @OriginalMember(owner = "client!or", name = "y", descriptor = "Ljg;")
    public static class308 field8196 = new class308();

    @OriginalMember(owner = "client!or", name = "z", descriptor = "[I")
    public static int[] field8197 = new int[250];

    @OriginalMember(owner = "client!or", name = "A", descriptor = "Luc;")
    public static class27 field8198 = new class27(30, 8);

    @OriginalMember(owner = "client!or", name = "C", descriptor = "Z")
    public static boolean field8200 = true;

    @OriginalMember(owner = "client!or", name = "B", descriptor = "[B")
    public static byte[] field8199;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    public static int field8172;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field8175;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field8177;

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!or", name = "o", descriptor = "I")
    private int field8186;

    @OriginalMember(owner = "client!or", name = "u", descriptor = "I")
    public static int field8192;

    @OriginalMember(owner = "client!or", name = "v", descriptor = "I")
    public int field8193;

    @OriginalMember(owner = "client!or", name = "w", descriptor = "I")
    public static int field8194;

    @OriginalMember(owner = "client!or", name = "D", descriptor = "Lln;")
    public static class345 field8201;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "Lsg;")
    public class363 field8173;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "[S")
    private short[] field8176;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "[S")
    private short[] field8184;

    @OriginalMember(owner = "client!or", name = "q", descriptor = "[S")
    private short[] field8188;

    @OriginalMember(owner = "client!or", name = "r", descriptor = "[S")
    private short[] field8189;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljr;Z)V")
    public final void method3264(class96 arg0, boolean arg1) {
        if (arg1) {
            this.field8189 = null;
        }
        field8175++;
        while (true) {
            int var3 = arg0.method718(123);
            if (var3 == 0) {
                return;
            }
            this.method3265(25257, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IILjr;)V")
    private final void method3265(int arg0, int arg1, class96 arg2) {
        if (arg1 == 1) {
            this.field8186 = arg2.method743((byte) -65);
        } else if (arg1 == 2) {
            this.field8185 = arg2.method743((byte) -47);
        } else if (arg1 == 4) {
            this.field8191 = arg2.method743((byte) -34);
        } else if (arg1 == 5) {
            this.field8174 = arg2.method743((byte) -81);
        } else if (arg1 == 6) {
            this.field8181 = arg2.method743((byte) -102);
        } else if (arg1 == 7) {
            this.field8180 = arg2.method718(-73);
        } else if (arg1 == 8) {
            this.field8182 = arg2.method718(104);
        } else if (arg1 == 9) {
            this.field8195 = 8224;
            this.field8187 = 3;
        } else if (arg1 == 10) {
            this.field8178 = true;
        } else if (arg1 == 11) {
            this.field8187 = 1;
        } else if (arg1 == 12) {
            this.field8187 = 4;
        } else if (arg1 == 13) {
            this.field8187 = 5;
        } else if (arg1 == 14) {
            this.field8187 = 2;
            this.field8195 = arg2.method718(106) * 256;
        } else if (arg1 == 15) {
            this.field8187 = 3;
            this.field8195 = arg2.method743((byte) -107);
        } else if (arg1 == 16) {
            this.field8187 = 3;
            this.field8195 = arg2.method714(false);
        } else if (arg1 == 40) {
            int var6 = arg2.method718(-63);
            this.field8189 = new short[var6];
            this.field8188 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field8189[var7] = (short) arg2.method743((byte) -50);
                this.field8188[var7] = (short) arg2.method743((byte) -29);
            }
        } else if (arg1 == 41) {
            int var4 = arg2.method718(-66);
            this.field8176 = new short[var4];
            this.field8184 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8184[var5] = (short) arg2.method743((byte) -119);
                this.field8176[var5] = (short) arg2.method743((byte) -20);
            }
        }
        field8192++;
        if (arg0 != 25257) {
            this.method3265(-48, 73, null);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZILur;IILoa;IILd;ILd;BII)Lba;")
    private final class352 method3266(boolean arg0, int arg1, class493 arg2, int arg3, int arg4, class638 arg5, int arg6, int arg7, class136 arg8, int arg9, class136 arg10, byte arg11, int arg12, int arg13) {
        field8183++;
        int var15 = arg9;
        class131 var16 = this.field8185 == -1 || arg3 == -1 ? null : arg2.method2763(this.field8185, arg13 + 31702);
        boolean var17 = arg0 & this.field8187 != 0;
        if (var16 != null) {
            var15 = arg9 | var16.method908(false, 128, arg3, arg6);
        }
        if (var17) {
            var15 |= this.field8187 == 3 ? 7 : 2;
        }
        if (this.field8174 != 128) {
            var15 |= 0x2;
        }
        if (this.field8191 != 128 || this.field8181 != 0) {
            var15 |= 0x5;
        }
        class328 var18 = this.field8173.field5186;
        class352 var19;
        synchronized (this.field8173.field5186) {
            var19 = (class352) this.field8173.field5186.method1986((byte) -93, (long) (this.field8193 |= arg5.field9051 << 29));
        }
        if (arg13 != -6) {
            return null;
        }
        if (var19 == null || arg5.method431(var19.method189(), var15) != 0) {
            if (var19 != null) {
                var15 = arg5.method444(var15, var19.method189());
            }
            int var20 = var15;
            if (this.field8189 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field8184 != null) {
                var20 |= 0x8000;
            }
            class661 var21 = class383.method2210(false, 0, this.field8173.field5177, this.field8186);
            if (var21 == null) {
                return null;
            }
            if (var21.field9323 < 13) {
                var21.method3660((byte) 116, 2);
            }
            var19 = arg5.method379(var21, var20, this.field8173.field5187, this.field8180 + 64, this.field8182 - -850);
            if (this.field8189 != null) {
                for (int var22 = 0; var22 < this.field8189.length; var22++) {
                    var19.method213(this.field8189[var22], this.field8188[var22]);
                }
            }
            if (this.field8184 != null) {
                for (int var23 = 0; var23 < this.field8184.length; var23++) {
                    var19.method204(this.field8184[var23], this.field8176[var23]);
                }
            }
            var19.method216(var15);
            class328 var24 = this.field8173.field5186;
            synchronized (this.field8173.field5186) {
                this.field8173.field5186.method1985(var19, (long) (this.field8193 |= arg5.field9051 << 29), (byte) -102);
            }
        }
        class352 var25 = var16 == null ? var19.method235(arg11, var15, true) : var16.method912(arg6, 128, var15, 0, arg11, arg3, var19, arg7);
        if (this.field8191 != 128 || this.field8174 != 128) {
            var25.method217(this.field8191, this.field8174, this.field8191);
        }
        if (this.field8181 != 0) {
            if (this.field8181 == 90) {
                var25.method225(4096);
            }
            if (this.field8181 == 180) {
                var25.method225(8192);
            }
            if (this.field8181 == 270) {
                var25.method225(12288);
            }
        }
        if (var17) {
            var25.method187(this.field8187, this.field8195, arg8, arg10, arg4, arg1, arg12);
        }
        var25.method216(arg9);
        return var25;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIILur;BLoa;I)Lba;")
    public final class352 method3267(int arg0, int arg1, int arg2, class493 arg3, byte arg4, class638 arg5, int arg6) {
        field8177++;
        if (arg4 >= -48) {
            this.field8187 = 65;
        }
        return this.method3266(false, 0, arg3, arg6, 0, arg5, arg1, arg0, null, arg2, null, (byte) 2, 0, -6);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
    public static void method3268(int arg0) {
        field8198 = null;
        field8190 = null;
        field8201 = null;
        field8199 = null;
        if (arg0 != 15261) {
            method3268(-92);
        }
        field8197 = null;
        field8179 = null;
        field8196 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZIIIILur;ILoa;IBLd;ILd;)Lba;")
    public final class352 method3269(boolean arg0, int arg1, int arg2, int arg3, int arg4, class493 arg5, int arg6, class638 arg7, int arg8, byte arg9, class136 arg10, int arg11, class136 arg12) {
        field8194++;
        int var14 = 122 % ((-arg9 - 13) / 44);
        return this.method3266(arg0, arg6, arg5, arg2, arg11, arg7, arg8, arg4, arg10, arg3, arg12, (byte) 2, arg1, -6);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILoa;ILur;III)Lba;")
    public final class352 method3270(int arg0, class638 arg1, int arg2, class493 arg3, int arg4, int arg5, int arg6) {
        if (arg6 == -22255) {
            field8172++;
            return this.method3266(false, 0, arg3, arg0, 0, arg1, arg2, arg4, null, arg5, null, (byte) 5, 0, arg6 + 22249);
        } else {
            return null;
        }
    }

    static {
        int var0 = 0;
        field8199 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field8199[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
