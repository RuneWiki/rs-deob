import jaggl.OpenGL;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class184 extends class7 {

    @OriginalMember(owner = "client!tca", name = "K", descriptor = "I")
    private int field2472 = -1;

    @OriginalMember(owner = "client!tca", name = "I", descriptor = "I")
    private int field2470 = -1;

    @OriginalMember(owner = "client!tca", name = "D", descriptor = "I")
    public int field2465;

    @OriginalMember(owner = "client!tca", name = "O", descriptor = "I")
    public int field2476;

    @OriginalMember(owner = "client!tca", name = "v", descriptor = "I")
    public static int field2457 = 0;

    @OriginalMember(owner = "client!tca", name = "z", descriptor = "I")
    public static int field2461 = 0;

    @OriginalMember(owner = "client!tca", name = "u", descriptor = "I")
    public static int field2456 = 0;

    @OriginalMember(owner = "client!tca", name = "C", descriptor = "I")
    public static int field2464 = 0;

    @OriginalMember(owner = "client!tca", name = "w", descriptor = "[I")
    public static int[] field2458 = new int[5];

    @OriginalMember(owner = "client!tca", name = "L", descriptor = "I")
    public static int field2473 = -1;

    @OriginalMember(owner = "client!tca", name = "M", descriptor = "I")
    public static int field2474 = 0;

    @OriginalMember(owner = "client!tca", name = "A", descriptor = "Lmga;")
    public static class739 field2462 = new class739(57, -1);

    @OriginalMember(owner = "client!tca", name = "x", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!tca", name = "y", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!tca", name = "B", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!tca", name = "E", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!tca", name = "F", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!tca", name = "G", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!tca", name = "H", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!tca", name = "J", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!tca", name = "N", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Ldia;IIIIZ[BIZ)V")
    public class184(class246 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7, boolean arg8) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2465 = arg4;
        this.field2476 = arg3;
        if (arg8) {
            byte[] var10 = new byte[arg6.length];
            for (int var11 = 0; ~var11 > ~arg4; ++var11) {
                int var12 = arg3 * var11;
                int var13 = (-var11 + -1 + arg4) * arg3;
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    var10[var12++] = arg6[var13++];
                }
            }
            arg6 = var10;
        }
        super.field81.method1653((byte) 104, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg5 && super.field68 != 34037) {
            class224.method1482(arg4, arg6, arg3, (byte) -119, arg7, arg1, arg2);
            this.method57((byte) 109, true);
        } else {
            OpenGL.glTexImage2Dub(super.field68, 0, super.field67, this.field2476, this.field2465, 0, arg7, 5121, arg6, 0);
            this.method57((byte) 110, false);
        }
        OpenGL.glPixelStorei(3317, 4);
        this.method52(false, true);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZZI)V")
    public final void method1274(boolean arg0, boolean arg1, int arg2) {
        if (super.field68 == 3553) {
            super.field81.method1653((byte) 98, this);
            OpenGL.glTexParameteri(super.field68, 10242, !arg1 ? 33071 : 10497);
            OpenGL.glTexParameteri(super.field68, 10243, !arg0 ? 33071 : 10497);
        }
        ++field2459;
        if (arg2 != 10242) {
            field2458 = null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "(B)V")
    public static void method1275(byte arg0) {
        field2458 = null;
        if (arg0 != -19) {
            field2457 = 8;
        }
        field2462 = null;
    }

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "(B)V")
    public static final void method1276(byte arg0) {
        ++field2463;
        if (~class583.field7786 > -103) {
            class583.field7786 += 6;
        }
        if (class380.field5556 != -1 && ~class302.method1910(0) < ~class430.field6120) {
            for (int var1 = class380.field5556; ~class517.field7063.length < ~var1; ++var1) {
                if (class517.field7063[var1].startsWith("pause")) {
                    int var2 = 5;
                    try {
                        var2 = Integer.parseInt(class517.field7063[var1].substring(6));
                    } catch (Exception var14) {
                    }
                    class164.method1188((byte) -125, "Pausing for " + var2 + " seconds...");
                    class380.field5556 = var1 + 1;
                    class430.field6120 = (long) (var2 * 1000) + class302.method1910(0);
                    return;
                }
                class704.field9864 = class517.field7063[var1];
                class210.method1395(false, -18422);
            }
            class380.field5556 = -1;
        }
        int var3 = -89 % ((arg0 - 60) / 59);
        if (~class491.field6815 != -1) {
            class700.field9809 -= class491.field6815 * 5;
            if (class332.field4784 <= class700.field9809) {
                class700.field9809 = class332.field4784 + -1;
            }
            class491.field6815 = 0;
            if (class700.field9809 < 0) {
                class700.field9809 = 0;
            }
        }
        for (int var4 = 0; ~var4 > ~class301.field4350; ++var4) {
            class313 var5 = class503.field6968[var4];
            int var6 = var5.method1975(-115);
            char var7 = var5.method1976((byte) -119);
            int var8 = var5.method1973(true);
            if (~var6 == -85) {
                class210.method1395(false, -18422);
            }
            if (var6 == 80) {
                class210.method1395(true, -18422);
            } else if (~var6 == -67 && (var8 & 4) != 0) {
                if (class599.field8153 != null) {
                    String var9 = "";
                    for (int var10 = class257.field3837.length - 1; var10 >= 0; --var10) {
                        if (class257.field3837[var10] != null && class257.field3837[var10].length() > 0) {
                            var9 = var9 + class257.field3837[var10] + '\n';
                        }
                    }
                    class599.field8153.setContents(new StringSelection(var9), (ClipboardOwner) null);
                }
            } else if (var6 == 67 && (var8 & 4) != 0) {
                if (class599.field8153 != null) {
                    Transferable var11 = class599.field8153.getContents((Object) null);
                    if (var11 != null) {
                        try {
                            String var12 = (String) var11.getTransferData(DataFlavor.stringFlavor);
                            if (var12 != null) {
                                String[] var13 = class46.method355(var12, 0, '\n');
                                class271.method1763(-31780, var13);
                            }
                        } catch (Exception var15) {
                        }
                    }
                }
            } else if (~var6 == -86 && class643.field8926 > 0) {
                class704.field9864 = class704.field9864.substring(0, class643.field8926 + -1) + class704.field9864.substring(class643.field8926);
                --class643.field8926;
            } else if (~var6 == -102 && class643.field8926 < class704.field9864.length()) {
                class704.field9864 = class704.field9864.substring(0, class643.field8926) + class704.field9864.substring(class643.field8926 + 1);
            } else if (var6 == 96 && ~class643.field8926 < -1) {
                --class643.field8926;
            } else if (~var6 == -98 && class643.field8926 < class704.field9864.length()) {
                ++class643.field8926;
            } else if (~var6 == -103) {
                class643.field8926 = 0;
            } else if (~var6 == -104) {
                class643.field8926 = class704.field9864.length();
            } else if (var6 == 104 && ~class226.field3100 > ~class257.field3837.length) {
                ++class226.field3100;
                class258.method1714((byte) 20);
                class643.field8926 = class704.field9864.length();
            } else if (~var6 == -106 && ~class226.field3100 < -1) {
                --class226.field3100;
                class258.method1714((byte) 52);
                class643.field8926 = class704.field9864.length();
            } else if (class103.method795(64, var7) || "\\/.:, _-+[]~@".indexOf(var7) != -1) {
                class704.field9864 = class704.field9864.substring(0, class643.field8926) + class503.field6968[var4].method1976((byte) 80) + class704.field9864.substring(class643.field8926);
                ++class643.field8926;
            }
        }
        class301.field4350 = 0;
        class494.field6839 = 0;
        class229.method1502(0);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V")
    public final void method58(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field2472, this.field2470, super.field68, 0, 0);
        ++field2471;
        this.field2472 = -1;
        this.field2470 = arg0;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIZII[BIIII)V")
    public final void method1277(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == 0) {
            arg1 = arg0;
        }
        ++field2469;
        if (arg2) {
            int var11 = class639.method3561(arg6, false);
            int var12 = arg0 * var11;
            int var13 = arg1 * var11;
            byte[] var14 = new byte[arg4 * var12];
            for (int var15 = 0; ~arg4 < ~var15; ++var15) {
                int var16 = var12 * var15;
                int var17 = (-var15 + arg4 + -1) * var13 + arg8;
                for (int var18 = 0; ~var12 < ~var18; ++var18) {
                    var14[var16++] = arg5[var17++];
                }
            }
            arg5 = var14;
        }
        super.field81.method1653((byte) 81, this);
        OpenGL.glPixelStorei(3317, 1);
        if (arg0 != arg1) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Dub(super.field68, 0, arg9, arg7, arg0, arg4, arg6, 5121, arg5, arg8);
        if (~arg0 != ~arg1) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        int var19 = 63 % ((arg3 - 49) / 61);
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Ldia;IIII)V")
    public class184(class246 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3 * arg4, false);
        this.field2465 = arg4;
        this.field2476 = arg3;
        super.field81.method1653((byte) 124, this);
        OpenGL.glTexImage2Dub(super.field68, 0, super.field67, arg3, arg4, 0, class544.method3097(super.field67, 72), 5121, (byte[]) null, 0);
        this.method52(false, true);
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Ldia;IIIII)V")
    public class184(class246 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, 6407, arg4 * arg5, false);
        this.field2465 = arg5;
        this.field2476 = arg4;
        int var7 = -arg3 - (arg5 - super.field81.field3500);
        super.field81.method1653((byte) 82, this);
        OpenGL.glCopyTexImage2D(super.field68, 0, super.field67, arg2, var7, arg4, arg5, 0);
        this.method52(false, true);
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Ldia;IIIIZ[FI)V")
    public class184(class246 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2476 = arg3;
        this.field2465 = arg4;
        super.field81.method1653((byte) 118, this);
        if (arg5 && ~super.field68 != -34038) {
            class730.method4054(arg3, arg7, arg4, arg1, arg2, 90, arg6);
            this.method57((byte) 110, true);
        } else {
            OpenGL.glTexImage2Df(super.field68, 0, super.field67, this.field2476, this.field2465, 0, arg7, 5126, arg6, 0);
            this.method57((byte) -29, false);
        }
        this.method52(false, true);
    }

    @OriginalMember(owner = "client!tca", name = "h", descriptor = "(B)V")
    public static final void method1278(byte arg0) throws class566 {
        ++field2467;
        if (arg0 < 112) {
            field2458 = null;
        }
        if (class669.field9399 != 1) {
            class86.field1200.method504(0, 0);
        } else {
            class86.field1200.method504(class109.field1510, class107.field1479);
        }
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Ldia;IIIIZ[IIIZ)V")
    public class184(class246 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int[] arg6, int arg7, int arg8, boolean arg9) {
        super(arg0, arg1, arg2, arg3 * arg4, arg5);
        this.field2476 = arg3;
        this.field2465 = arg4;
        if (arg9) {
            int[] var11 = new int[arg6.length];
            for (int var12 = 0; arg4 > var12; ++var12) {
                int var13 = arg3 * var12;
                int var14 = (-var12 + -1 + arg4) * arg3;
                for (int var15 = 0; var15 < arg3; ++var15) {
                    var11[var13++] = arg6[var14++];
                }
            }
            arg6 = var11;
        }
        super.field81.method1653((byte) 117, this);
        if (super.field68 != 34037 && arg5 && arg7 == 0 && ~arg8 == -1) {
            class774.method4295(super.field68, arg6, this.field2476, this.field2465, 32993, super.field81.field3596, 5056, super.field67);
            this.method57((byte) -43, true);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Di(super.field68, 0, super.field67, this.field2476, this.field2465, 0, 32993, super.field81.field3596, arg6, arg8 * 4);
            OpenGL.glPixelStorei(3314, 0);
            this.method57((byte) 123, false);
        }
        this.method52(false, true);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IBII)V")
    public final void method1279(int arg0, byte arg1, int arg2, int arg3) {
        OpenGL.glFramebufferTexture2DEXT(arg0, arg2, super.field68, super.field82, arg3);
        ++field2468;
        this.field2470 = arg2;
        if (arg1 == -69) {
            this.field2472 = arg0;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZIIIII)V")
    public final void method1280(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2466;
        if (!arg1) {
            int var8 = -arg5 + super.field81.field3500 + -arg4;
            super.field81.method1653((byte) 85, this);
            OpenGL.glCopyTexSubImage2D(super.field68, 0, arg6, -arg4 + this.field2465 + -arg2, arg0, var8, arg3, arg4);
            OpenGL.glFlush();
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "([IZIIIIIII)V")
    public final void method1281(int[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (~arg6 == -1) {
            arg6 = arg7;
        }
        ++field2460;
        if (arg1) {
            int[] var10 = new int[arg5 * arg7];
            for (int var11 = 0; arg5 > var11; ++var11) {
                int var12 = arg7 * var11;
                int var13 = (arg5 - 1 + -var11) * arg6 + arg4;
                for (int var14 = 0; arg7 > var14; ++var14) {
                    var10[var12++] = arg0[var13++];
                }
            }
            arg0 = var10;
        }
        super.field81.method1653((byte) 115, this);
        int var15 = -112 % ((-76 - arg3) / 45);
        if (arg6 != arg7) {
            OpenGL.glPixelStorei(3314, arg6);
        }
        OpenGL.glTexSubImage2Di(super.field68, 0, arg8, -arg2 + this.field2465 + -arg5, arg7, arg5, 32993, super.field81.field3596, arg0, arg4);
        if (arg6 != arg7) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }
}
