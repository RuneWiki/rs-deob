import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class258 {

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "B")
    public byte field3579 = 0;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    private int field3574 = 0;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public int field3583 = -1;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    private int field3581 = 128;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    private int field3575 = 0;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    private int field3585 = -1;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    private int field3594 = 128;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    private int field3586 = 0;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "Z")
    public boolean field3590 = false;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Lcba;")
    public static class471 field3592 = new class471(93, 6);

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "[F")
    public static float[] field3597 = new float[16384];

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field3599 = 0;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "[F")
    public static float[] field3596 = new float[16384];

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "[Z")
    public static boolean[] field3600 = new boolean[8];

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    private int field3598;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public int field3601;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Lnb;")
    public class251 field3591;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "[S")
    private short[] field3573;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "[S")
    private short[] field3576;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "[S")
    private short[] field3578;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "[S")
    private short[] field3587;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ldaa;I)V")
    public final void method1655(class11 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method110((byte) 36);
            if (var3 == 0) {
                field3580++;
                if (arg1 != 974) {
                    method1660(false);
                    return;
                }
                return;
            }
            this.method1661(arg0, var3, (byte) -81);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lsa;IIIIZLsa;IIBILbu;ILqa;)Lr;")
    private final class157 method1656(class174 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class174 arg6, int arg7, int arg8, byte arg9, int arg10, class18 arg11, int arg12, class207 arg13) {
        field3582++;
        int var15 = arg2;
        class78 var16 = this.field3583 == -1 || arg7 == -1 ? null : arg11.method195(this.field3583, (byte) 13);
        boolean var17 = arg5 & this.field3579 != 0;
        if (var16 != null) {
            var15 = arg2 | var16.method603(-112, arg4, false, arg7);
        }
        if (var17) {
            var15 |= this.field3579 == 3 ? 7 : 2;
        }
        if (this.field3581 != 128) {
            var15 |= 0x2;
        }
        if (this.field3594 != 128 || this.field3575 != 0) {
            var15 |= 0x5;
        }
        class571 var18 = this.field3591.field3486;
        class157 var19;
        synchronized (this.field3591.field3486) {
            var19 = (class157) this.field3591.field3486.method3252((long) (this.field3601 |= arg13.field2923 << 29), (byte) 39);
        }
        if (var19 == null || arg13.method1357(var19.method166(), var15) != 0) {
            if (var19 != null) {
                var15 = arg13.method1306(var15, var19.method166());
            }
            int var20 = var15;
            if (this.field3587 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field3578 != null) {
                var20 |= 0x8000;
            }
            class317 var21 = class428.method2544(-93, 0, this.field3598, this.field3591.field3479);
            if (var21 == null) {
                return null;
            }
            if (var21.field4281 < 13) {
                var21.method1971(0, -120);
            }
            var19 = arg13.method1293(var21, var20, this.field3591.field3487, this.field3574 + 64, this.field3586 + 850);
            if (this.field3587 != null) {
                for (int var22 = 0; var22 < this.field3587.length; var22++) {
                    var19.method137(this.field3587[var22], this.field3573[var22]);
                }
            }
            if (this.field3578 != null) {
                for (int var23 = 0; var23 < this.field3578.length; var23++) {
                    var19.method130(this.field3578[var23], this.field3576[var23]);
                }
            }
            var19.method138(var15);
            class571 var24 = this.field3591.field3486;
            synchronized (this.field3591.field3486) {
                this.field3591.field3486.method3243(var19, (long) (this.field3601 |= arg13.field2923 << 29), -49);
            }
        }
        class157 var25 = var16 == null ? var19.method163(arg9, var15, true) : var16.method608(-15299, var19, arg9, arg4, 0, var15, arg7, arg1);
        if (arg10 >= -76) {
            this.field3586 = 8;
        }
        if (this.field3594 != 128 || this.field3581 != 128) {
            var25.method162(this.field3594, this.field3581, this.field3594);
        }
        if (this.field3575 != 0) {
            if (this.field3575 == 90) {
                var25.method140(4096);
            }
            if (this.field3575 == 180) {
                var25.method140(8192);
            }
            if (this.field3575 == 270) {
                var25.method140(12288);
            }
        }
        if (var17) {
            var25.method145(this.field3579, this.field3585, arg6, arg0, arg8, arg12, arg3);
        }
        var25.method138(arg2);
        return var25;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILqa;IIILbu;I)Lr;")
    public final class157 method1657(int arg0, class207 arg1, int arg2, int arg3, int arg4, class18 arg5, int arg6) {
        field3577++;
        if (arg2 != 31570) {
            this.method1655(null, 54);
        }
        return this.method1656(null, arg4, arg3, 0, arg6, false, null, arg0, 0, (byte) 5, -80, arg5, 0, arg1);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BIIILbu;Lqa;I)Lr;")
    public final class157 method1658(byte arg0, int arg1, int arg2, int arg3, class18 arg4, class207 arg5, int arg6) {
        field3588++;
        if (arg0 >= -27) {
            this.method1659(86, -89, null, -105, 120, (byte) -82, 96, null, null, -54, null, true, -29);
        }
        return this.method1656(null, arg1, arg2, 0, arg6, false, null, arg3, 0, (byte) 2, -81, arg4, 0, arg5);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IILqa;IIBILbu;Lsa;ILsa;ZI)Lr;")
    public final class157 method1659(int arg0, int arg1, class207 arg2, int arg3, int arg4, byte arg5, int arg6, class18 arg7, class174 arg8, int arg9, class174 arg10, boolean arg11, int arg12) {
        if (arg5 != 12) {
            method1660(false);
        }
        field3593++;
        return this.method1656(arg8, arg4, arg6, arg1, arg12, arg11, arg10, arg3, arg9, (byte) 2, -94, arg7, arg0, arg2);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
    public static void method1660(boolean arg0) {
        if (arg0) {
            field3592 = null;
        }
        field3596 = null;
        field3600 = null;
        field3592 = null;
        field3597 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ldaa;IB)V")
    private final void method1661(class11 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field3598 = arg0.method93((byte) 121);
        } else if (arg1 == 2) {
            this.field3583 = arg0.method93((byte) 116);
        } else if (arg1 == 4) {
            this.field3594 = arg0.method93((byte) 114);
        } else if (arg1 == 5) {
            this.field3581 = arg0.method93((byte) 81);
        } else if (arg1 == 6) {
            this.field3575 = arg0.method93((byte) 106);
        } else if (arg1 == 7) {
            this.field3574 = arg0.method110((byte) 80);
        } else if (arg1 == 8) {
            this.field3586 = arg0.method110((byte) 36);
        } else if (arg1 == 9) {
            this.field3579 = 3;
            this.field3585 = 8224;
        } else if (arg1 == 10) {
            this.field3590 = true;
        } else if (arg1 == 11) {
            this.field3579 = 1;
        } else if (arg1 == 12) {
            this.field3579 = 4;
        } else if (arg1 == 13) {
            this.field3579 = 5;
        } else if (arg1 == 14) {
            this.field3579 = 2;
            this.field3585 = arg0.method110((byte) 119) * 256;
        } else if (arg1 == 15) {
            this.field3579 = 3;
            this.field3585 = arg0.method93((byte) 102);
        } else if (arg1 == 16) {
            this.field3579 = 3;
            this.field3585 = arg0.method119(-66);
        } else if (arg1 == 40) {
            int var4 = arg0.method110((byte) 67);
            this.field3587 = new short[var4];
            this.field3573 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3587[var5] = (short) arg0.method93((byte) 122);
                this.field3573[var5] = (short) arg0.method93((byte) 124);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method110((byte) 92);
            this.field3576 = new short[var6];
            this.field3578 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3578[var7] = (short) arg0.method93((byte) 86);
                this.field3576[var7] = (short) arg0.method93((byte) 91);
            }
        }
        field3584++;
        if (arg2 != -81) {
            this.method1658((byte) 69, 91, 14, -106, null, null, 13);
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field3597[var2] = (float) Math.sin((double) var2 * var0);
            field3596[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
