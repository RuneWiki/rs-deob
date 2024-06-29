import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 extends class188 {

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    private int field73 = -1;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    private int field77 = -1;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public int field71;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "[I")
    public static int[] field76 = new int[2];

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "[I")
    public static int[] field75;

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lht;IIZ[[BI)V")
    public class7(class410 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field71 = arg2;
        super.field2615.method2412((byte) 4, this);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field2601, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method1132(true, (byte) 62);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lht;II)V")
    public class7(class410 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
        this.field71 = arg2;
        super.field2615.method2412((byte) 4, this);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field2601, arg2, arg2, 0, class162.method1005(super.field2601, -114), 5121, (byte[]) null, 0);
        }
        this.method1132(true, (byte) 62);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II)I")
    public static final int method38(int arg0, int arg1) {
        ++field70;
        if (class117.field1578 != null) {
            class117.field1578.method644(arg1 + 25239);
            class117.field1578 = null;
        }
        ++class493.field7285;
        if (~class493.field7285 < -5) {
            class493.field7285 = 0;
            class527.field7736 = 0;
            return arg0;
        } else {
            class527.field7736 = 0;
            if (~class414.field6081 != ~class321.field4432) {
                class414.field6081 = class321.field4432;
            } else {
                class414.field6081 = class109.field1503;
            }
            if (arg1 != -25350) {
                field76 = null;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V")
    public static final void method39(int arg0, int arg1, int arg2) {
        class61 var3 = class385.field5410[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field825 != null) {
                var3.field825 = null;
            }
            if (var3.field816 != null) {
                var3.field816 = null;
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IBIII)V")
    public final void method40(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field72;
        OpenGL.glFramebufferTexture2DEXT(arg4, arg2, arg3, super.field2608, arg0);
        if (arg1 >= -96) {
            method38(15, 51);
        }
        this.field73 = arg2;
        this.field77 = arg4;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lht;IIZ[[I)V")
    public class7(class410 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field71 = arg2;
        super.field2615.method2412((byte) 4, this);
        if (!arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(34069 - -var6, 0, super.field2601, arg2, arg2, 0, 32993, super.field2615.field5963, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                class270.method1540(super.field2615.field5963, super.field2601, var7 + 34069, true, 32993, arg2, arg4[var7], arg2);
            }
        }
        this.method1132(true, (byte) 62);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lbt;Z)Z")
    public static final boolean method41(class33 arg0, boolean arg1) {
        boolean var2 = class383.field5391 == class364.field5058;
        int var3 = 0;
        byte var4 = 0;
        byte var5 = 0;
        arg0.method157(116);
        if (arg0.field463 >= 0 && arg0.field468 >= 0 && arg0.field456 < class469.field6860 && arg0.field471 < class472.field6900) {
            for (int var6 = arg0.field463; var6 <= arg0.field456; ++var6) {
                for (int var9 = arg0.field468; var9 <= arg0.field471; ++var9) {
                    class61 var10 = class176.method1082(arg0.field464, var6, var9);
                    if (var10 != null) {
                        int var11 = 0;
                        if (var6 > arg0.field463) {
                            ++var11;
                        }
                        if (var6 < arg0.field456) {
                            var11 += 4;
                        }
                        if (var9 > arg0.field468) {
                            var11 += 8;
                        }
                        if (var9 < arg0.field471) {
                            var11 += 2;
                        }
                        class302 var12 = class391.method2239(var11, arg0, 1);
                        class302 var13 = var10.field819;
                        if (var13 == null) {
                            var10.field819 = var12;
                        } else {
                            while (var13.field4140 != null) {
                                var13 = var13.field4140;
                            }
                            var13.field4140 = var12;
                        }
                        var10.field828 = (byte) (var10.field828 | var11);
                        if (var2 && (class453.field6629[var6][var9] & -16777216) != 0) {
                            var3 = class453.field6629[var6][var9];
                            var4 = class171.field2451[var6][var9];
                            var5 = class393.field5478[var6][var9];
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var7 = arg0.field463; var7 <= arg0.field456; ++var7) {
                    for (int var8 = arg0.field468; var8 <= arg0.field471; ++var8) {
                        if ((class453.field6629[var7][var8] & -16777216) == 0) {
                            class453.field6629[var7][var8] = var3;
                            class171.field2451[var7][var8] = var4;
                            class393.field5478[var7][var8] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class26.field406[class451.field6505++] = arg0;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!il", name = "g", descriptor = "(I)V")
    public static void method42(int arg0) {
        if (arg0 != 0) {
            method41((class33) null, true);
        }
        field75 = null;
        field76 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public final void method43(int arg0) {
        ++field74;
        OpenGL.glFramebufferTexture2DEXT(this.field77, this.field73, 3553, 0, 0);
        this.field73 = -1;
        this.field77 = -1;
        int var2 = 52 % ((arg0 - -72) / 38);
    }
}
