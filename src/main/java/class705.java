import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class705 extends class424 implements class258 {

    @OriginalMember(owner = "client!pw", name = "A", descriptor = "Z")
    private boolean field9543 = false;

    @OriginalMember(owner = "client!pw", name = "W", descriptor = "Lbv;")
    public class309 field9550;

    @OriginalMember(owner = "client!pw", name = "U", descriptor = "Z")
    private boolean field9548;

    @OriginalMember(owner = "client!pw", name = "H", descriptor = "Lmu;")
    public static class303 field9544 = new class303(23, 6);

    @OriginalMember(owner = "client!pw", name = "nb", descriptor = "[I")
    public static int[] field9567 = new int[3];

    @OriginalMember(owner = "client!pw", name = "jb", descriptor = "Lmu;")
    public static class303 field9563 = new class303(2, 6);

    @OriginalMember(owner = "client!pw", name = "S", descriptor = "I")
    public static int field9546;

    @OriginalMember(owner = "client!pw", name = "T", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!pw", name = "V", descriptor = "I")
    public static int field9549;

    @OriginalMember(owner = "client!pw", name = "X", descriptor = "I")
    public static int field9551;

    @OriginalMember(owner = "client!pw", name = "Y", descriptor = "I")
    public static int field9552;

    @OriginalMember(owner = "client!pw", name = "Z", descriptor = "I")
    public static int field9553;

    @OriginalMember(owner = "client!pw", name = "ab", descriptor = "I")
    public static int field9554;

    @OriginalMember(owner = "client!pw", name = "bb", descriptor = "I")
    public static int field9555;

    @OriginalMember(owner = "client!pw", name = "cb", descriptor = "I")
    public static int field9556;

    @OriginalMember(owner = "client!pw", name = "db", descriptor = "I")
    public static int field9557;

    @OriginalMember(owner = "client!pw", name = "eb", descriptor = "I")
    public static int field9558;

    @OriginalMember(owner = "client!pw", name = "fb", descriptor = "I")
    public static int field9559;

    @OriginalMember(owner = "client!pw", name = "gb", descriptor = "I")
    public static int field9560;

    @OriginalMember(owner = "client!pw", name = "hb", descriptor = "I")
    public static int field9561;

    @OriginalMember(owner = "client!pw", name = "ib", descriptor = "I")
    public static int field9562;

    @OriginalMember(owner = "client!pw", name = "kb", descriptor = "I")
    public static int field9564;

    @OriginalMember(owner = "client!pw", name = "lb", descriptor = "I")
    public static int field9565;

    @OriginalMember(owner = "client!pw", name = "mb", descriptor = "I")
    public static int field9566;

    @OriginalMember(owner = "client!pw", name = "O", descriptor = "Lhw;")
    private class132 field9545;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lha;I)V", line = 5)
    public final void method591(class59 arg0, int arg1) {
        ++field9546;
        this.field9550.method2018(arg1 + 14217, arg0);
        if (arg1 != -14218) {
            this.method582(127);
        }
    }

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "(Z)I", line = 16)
    public final int method38(boolean arg0) {
        ++field9552;
        if (!arg0) {
            this.field9548 = false;
        }
        return this.field9550.method2007(101);
    }

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "(I)I", line = 28)
    public final int method588(int arg0) {
        ++field9565;
        if (arg0 != -32228) {
            this.method31((class59) null, 89);
        }
        return this.field9550.field4279;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)Z", line = 39)
    public final boolean method584(int arg0) {
        ++field9557;
        if (arg0 != -18443) {
            this.field9543 = false;
        }
        return this.field9550.method2009(arg0 + 18445);
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lha;Liv;IIIIIZIIIII)V", line = 211)
    public class705(class59 arg0, class99 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field9550 = new class309(arg0, arg1, arg10, arg11, super.field5926, arg3, this, arg7, arg12);
        this.field9548 = arg1.field1709 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILha;)V", line = 53)
    public final void method583(int arg0, class59 arg1) {
        if (arg0 == 836) {
            this.field9550.method2011((byte) 116, arg1);
            ++field9560;
        }
    }

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "(I)I", line = 64)
    public final int method589(int arg0) {
        ++field9566;
        return arg0 > -62 ? 40 : this.field9550.field4290;
    }

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "(Lha;I)V", line = 78)
    public final void method31(class59 arg0, int arg1) {
        if (arg1 >= -125) {
            this.field9543 = false;
        }
        ++field9549;
        class472 var3 = this.field9550.method2012(false, true, -127, 262144, arg0);
        if (var3 != null) {
            int var4 = super.field5922 >> 9;
            int var5 = super.field5933 >> 9;
            class661 var6 = arg0.method322();
            var6.method744(super.field5922, super.field5927, super.field5933);
            this.field9550.method2014(var4, var6, var5, arg0, var4, var3, false, (byte) -73, var5);
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(I)I", line = 104)
    public final int method594(int arg0) {
        ++field9556;
        int var2 = -29 % ((-91 - arg0) / 35);
        return this.field9550.field4306;
    }

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "(I)Z", line = 114)
    public final boolean method45(int arg0) {
        if (arg0 >= -12) {
            return false;
        } else {
            ++field9561;
            return false;
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(ILha;)Ljda;", line = 125)
    public final class228 method41(int arg0, class59 arg1) {
        ++field9554;
        class472 var3 = this.field9550.method2012(false, true, -127, 2048, arg1);
        if (var3 == null) {
            return null;
        } else {
            class661 var4 = arg1.method322();
            var4.method744(super.field6120 + super.field5922, super.field5927, super.field6108 + super.field5933);
            class228 var5 = class345.method2171(arg0, this.field9548, false);
            int var6 = super.field5922 >> 9;
            int var7 = super.field5933 >> 9;
            this.field9550.method2014(var6, var4, var7, arg1, var6, var3, true, (byte) -73, var7);
            if (!class458.field6459) {
                var3.method521(var4, var5.field3313[0], 0);
            } else {
                var3.method497(var4, var5.field3313[0], class58.field1146, 0);
            }
            if (this.field9550.field4308 != null) {
                class266 var8 = this.field9550.field4308.method2419();
                if (!class458.field6459) {
                    arg1.method208(var8);
                } else {
                    arg1.method295(var8, class58.field1146);
                }
            }
            this.field9543 = var3.method488() || this.field9550.field4308 != null;
            if (this.field9545 == null) {
                this.field9545 = class689.method3846(super.field5922, var3, super.field5933, super.field5927, 2);
            } else {
                class20.method157(super.field5933, super.field5927, this.field9545, var3, false, super.field5922);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(Lha;I)Lhw;", line = 174)
    public final class132 method40(class59 arg0, int arg1) {
        ++field9564;
        return arg1 != 7 ? null : this.field9545;
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)Z", line = 187)
    public final boolean method49(byte arg0) {
        ++field9553;
        return arg0 != 122 ? false : this.field9543;
    }

    @OriginalMember(owner = "client!pw", name = "p", descriptor = "(I)V", line = 198)
    public static void method3930(int arg0) {
        if (arg0 != 1) {
            field9558 = -36;
        }
        field9544 = null;
        field9563 = null;
        field9567 = null;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lha;III)Z", line = 220)
    public final boolean method42(class59 arg0, int arg1, int arg2, int arg3) {
        ++field9547;
        class472 var5 = this.field9550.method2012(false, false, -128, 131072, arg0);
        if (var5 == null) {
            return false;
        } else if (arg3 != 0) {
            return true;
        } else {
            class661 var6 = arg0.method322();
            var6.method744(super.field6120 + super.field5922, super.field5927, super.field6108 + super.field5933);
            return class458.field6459 ? var5.method492(arg2, arg1, var6, false, 0, class58.field1146) : var5.method503(arg2, arg1, var6, false, 0);
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lqo;I[Ltba;)Ldw;", line = 240)
    public static final class716 method3931(class22 arg0, int arg1, class164[] arg2) {
        ++field9562;
        for (int var3 = 0; ~arg2.length < ~var3; ++var3) {
            if (arg2[var3] == null || arg2[var3].field2593 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; ~var6 > ~arg2.length; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field2593);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class186.field2803, 0);
        if (~class186.field2803[0] == arg1) {
            if (class186.field2803[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class186.field2803, 1);
            if (class186.field2803[1] > 1) {
                byte[] var7 = new byte[class186.field2803[1]];
                OpenGL.glGetInfoLogARB(var4, class186.field2803[1], class186.field2803, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class186.field2803[0] == 0) {
                for (int var8 = 0; arg2.length > var8; ++var8) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field2593);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class716(arg0, var4, arg2);
    }

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "(I)I", line = 310)
    public final int method37(int arg0) {
        ++field9555;
        if (arg0 != -25675) {
            this.field9548 = false;
        }
        return this.field9550.method2008(-119);
    }

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "(I)V", line = 324)
    public final void method582(int arg0) {
        if (arg0 == -12031) {
            ++field9551;
        }
    }
}
