import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class374 extends class446 {

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    private int field5699 = -1;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    private int field5697 = -1;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public int field5694;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "Lfe;")
    public static class400 field5695;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 6)
    public final void method1726(int arg0) {
        ++field5700;
        OpenGL.glFramebufferTexture2DEXT(this.field5697, this.field5699, 3553, arg0, 0);
        this.field5699 = -1;
        this.field5697 = -1;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[[[BIBII)V", line = 20)
    public static final void method2295(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++class337.field4744;
        class98.field1439 = 0;
        for (int var6 = class449.field6688; var6 < class208.field2979; ++var6) {
            class518[][] var17 = class108.field1553[var6];
            for (int var18 = class14.field173; var18 < class147.field2175; ++var18) {
                for (int var19 = class23.field237; var19 < class18.field193; ++var19) {
                    class518 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (!class329.field4682[var18 - class381.field5776 + class367.field5607][var19 - class346.field4983 + class367.field5607] || arg1 != null && var6 >= arg2 && arg1[var6][var18][var19] == arg3) {
                            var20.field7566 = false;
                            var20.field7560 = false;
                            var20.field7555 = 0;
                            if (var18 >= class381.field5776 - 16 && var18 <= class381.field5776 + 16 && var19 >= class346.field4983 - 16 && var19 <= class346.field4983 + 16 && (var20.field7559 != null || var20.field7570 != null || var20.field7551 != null || var20.field7552 != null || var20.field7550 != null || var20.field7569 != null)) {
                                class42.field640.method943(true, var20);
                            }
                        } else {
                            var20.field7566 = true;
                            var20.field7560 = true;
                            if (var20.field7569 != null) {
                                var20.field7557 = true;
                            } else {
                                var20.field7557 = false;
                            }
                            ++class98.field1439;
                        }
                    }
                }
            }
        }
        boolean var7 = class86.field1324 == class31.field335;
        for (int var8 = class449.field6688; var8 < class208.field2979; ++var8) {
            float var9 = var7 ? 251.5F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class271.field3941.method1073() && var8 >= arg2 && arg1 != null) {
                int var10 = class329.field4682.length;
                if (class329.field4682.length + class14.field173 > class361.field5554) {
                    var10 -= class329.field4682.length + class14.field173 - class361.field5554;
                }
                int var11 = class329.field4682[0].length;
                if (class329.field4682[0].length + class23.field237 > class484.field7096) {
                    var11 -= class329.field4682[0].length + class23.field237 - class484.field7096;
                }
                int var12 = class88.field1340;
                while (true) {
                    if (var12 >= var10) {
                        class42.field640.method951((byte) -128, var9, class86.field1324[var8], var8, true);
                        break;
                    }
                    int var13 = class14.field173 + var12 - class88.field1340;
                    for (int var14 = class211.field3085; var14 < var11; ++var14) {
                        class467.field6892[var12][var14] = false;
                        if (class329.field4682[var12][var14]) {
                            int var15 = class23.field237 + var14 - class211.field3085;
                            for (int var16 = var8; var16 >= 0; --var16) {
                                if (class108.field1553[var16][var13][var15] != null && class108.field1553[var16][var13][var15].field7553 == var8) {
                                    class467.field6892[var12][var14] = class108.field1553[var16][var13][var15].field7566;
                                    break;
                                }
                            }
                        }
                    }
                    ++var12;
                }
            } else {
                class42.field640.method951((byte) -128, var9, class86.field1324[var8], var8, false);
            }
            class42.field640.method949(38);
        }
        if (!class242.method1628(true)) {
            class242.method1628(false);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V", line = 159)
    public final void method2296(int arg0, int arg1, int arg2, int arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg3, arg2, arg0, super.field6640, arg1);
        if (arg4 != -1403048020) {
            field5696 = -13;
        }
        ++field5693;
        this.field5699 = arg2;
        this.field5697 = arg3;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lod;IIZ[[BI)V", line = 172)
    public class374(class349 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field5694 = arg2;
        super.field6637.method2200(this, (byte) 112);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field6646, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2683(true, 0);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lod;IIZ[[I)V", line = 191)
    public class374(class349 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field5694 = arg2;
        super.field6637.method2200(this, (byte) 122);
        if (arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                class524.method3100(255, var6 + 34069, arg4[var6], arg2, 32993, super.field6637.field5340, arg2, super.field6646);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                OpenGL.glTexImage2Di(34069 - -var7, 0, super.field6646, arg2, arg2, 0, 32993, super.field6637.field5340, arg4[var7], 0);
            }
        }
        this.method2683(true, 0);
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lod;II)V", line = 222)
    public class374(class349 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field5694 = arg2;
        super.field6637.method2200(this, (byte) 120);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field6646, arg2, arg2, 0, class301.method1901(super.field6646, false), 5121, (byte[]) null, 0);
        }
        this.method2683(true, 0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZI)V", line = 240)
    public static final void method2297(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            if (~class320.field4579 != ~arg0) {
                class517.field7539 = new int[arg0];
                for (int var3 = 0; var3 < arg0; ++var3) {
                    class517.field7539[var3] = (var3 << 12) / arg0;
                }
                class304.field4339 = arg0 + -1;
                class320.field4579 = arg0;
                class392.field5915 = arg0 * 32;
            }
            ++field5698;
            if (class238.field3506 != arg2) {
                if (class320.field4579 != arg2) {
                    class456.field6752 = new int[arg2];
                    for (int var4 = 0; ~arg2 < ~var4; ++var4) {
                        class456.field6752[var4] = (var4 << 12) / arg2;
                    }
                } else {
                    class456.field6752 = class517.field7539;
                }
                class39.field569 = arg2 - 1;
                class238.field3506 = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "()V", line = 287)
    public static final void method2298() {
        for (int var0 = 0; var0 < class526.field7784; ++var0) {
            class117 var1 = class377.field5758[var0];
            class22.method143(var1);
            class377.field5758[var0] = null;
        }
        class526.field7784 = 0;
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V", line = 308)
    public static void method2299(int arg0) {
        field5695 = null;
        if (arg0 < 109) {
            method2298();
        }
    }
}
