import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class243 extends class119 {

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
    private int field3143 = -1;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    private int field3146 = -1;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    public int field3145;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public int field3144;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "Z")
    public static boolean field3148;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([[BILft;)V")
    public static final void method1479(byte[][] arg0, int arg1, class4 arg2) {
        ++field3149;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = 0;
        if (arg1 <= -56) {
            while (arg2.field959 > var4) {
                class139.method946(-44);
                for (int var5 = 0; ~(class452.field6526 >> 3) < ~var5; ++var5) {
                    for (int var6 = 0; var6 < class440.field6307 >> 3; ++var6) {
                        boolean var7 = false;
                        int var8 = class225.field2867[var4][var5][var6];
                        if (~var8 != 0) {
                            int var9 = (var8 & 61800442) >> 24;
                            if (!arg2.field978 || var9 == 0) {
                                int var10 = 3 & var8 >> 1;
                                int var11 = (16761842 & var8) >> 14;
                                int var12 = var8 >> 3 & 2047;
                                int var13 = (var11 / 8 << 8) + var12 / 8;
                                for (int var14 = 0; ~var14 > ~class79.field1025.length; ++var14) {
                                    if (class79.field1025[var14] == var13 && arg0[var14] != null) {
                                        class463 var15 = new class463(arg0[var14]);
                                        arg2.method653(var5 * 8, var4, var15, var12, var6 * 8, var11, var9, (byte) 126, var10, class172.field2185);
                                        var7 = true;
                                        arg2.method21(var11, var15, var9, var10, var3[0] != -1 ? null : var3, var12, var5 * 8, class33.field416, var6 * 8, 30208, var4);
                                        break;
                                    }
                                }
                            }
                        }
                        if (!var7) {
                            arg2.method652(var5 * 8, var6 * 8, 8, 8, var4, 102);
                        }
                    }
                }
                ++var4;
            }
            if (var3[0] != -1) {
                class521.field7538 = class456.field6572.method747(var3[2], -17653, var3[1], var3[3], class375.field4840, var3[0]);
                class293.field3756 = var3[4];
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V")
    public static final void method1480(int arg0) {
        class2.field24 = 0;
        ++field3141;
        class201.field2616.method154(7491);
        if (arg0 != 4) {
            field3148 = true;
        }
        class201.field2616.method163(class271.field3417, 0);
        ++class2.field24;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public final void method864(int arg0) {
        ++field3140;
        OpenGL.glFramebufferTexture3DEXT(this.field3146, this.field3143, super.field1604, 0, 0, 0);
        this.field3143 = -1;
        this.field3146 = arg0;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lug;IIII[BI)V")
    public class243(class395 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field3145 = arg3;
        this.field3144 = arg4;
        this.field3147 = arg2;
        super.field1607.method2322(this, 14);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field1604, 0, super.field1611, this.field3147, this.field3145, this.field3144, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method861(true, 9984);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIZIIII)V")
    public final void method1481(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3150;
        super.field1607.method2322(this, 14);
        if (arg3) {
            OpenGL.glCopyTexSubImage3D(super.field1604, 0, arg4, arg7, arg1, arg0, arg5, arg2, arg6);
            OpenGL.glFlush();
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lug;IIII)V")
    public class243(class395 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field3147 = arg2;
        this.field3144 = arg4;
        this.field3145 = arg3;
        super.field1607.method2322(this, 14);
        OpenGL.glTexImage3Dub(super.field1604, 0, super.field1611, this.field3147, this.field3145, this.field3144, 0, class100.method757(super.field1611, (byte) -40), 5121, (byte[]) null, 0);
        this.method861(true, 9984);
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(III)Ljava/lang/String;")
    public static final String method1482(int arg0, int arg1, int arg2) {
        ++field3142;
        int var3 = -arg0 + arg2;
        if (~var3 > 8) {
            return "<col=ff0000>";
        } else if (~var3 > 5) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (~var3 < -7) {
            return "<col=40ff00>";
        } else if (~var3 < -4) {
            return "<col=80ff00>";
        } else {
            return arg1 > ~var3 ? "<col=c0ff00>" : "<col=ffff00>";
        }
    }

    static {
        new class335("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
    }
}
