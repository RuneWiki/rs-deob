import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class53 {

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
    public int field774 = 0;

    @OriginalMember(owner = "client!aw", name = "m", descriptor = "I")
    public int field783 = 0;

    @OriginalMember(owner = "client!aw", name = "u", descriptor = "Z")
    private boolean field791 = false;

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "Lcv;")
    public static class398 field777 = new class398(8);

    @OriginalMember(owner = "client!aw", name = "p", descriptor = "Lvp;")
    public static class123 field786 = new class123(0, 5);

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
    public int field771;

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
    private int field776;

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
    public int field779;

    @OriginalMember(owner = "client!aw", name = "j", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!aw", name = "k", descriptor = "I")
    public int field781;

    @OriginalMember(owner = "client!aw", name = "l", descriptor = "I")
    public int field782;

    @OriginalMember(owner = "client!aw", name = "n", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!aw", name = "o", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!aw", name = "q", descriptor = "I")
    public int field787;

    @OriginalMember(owner = "client!aw", name = "r", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!aw", name = "s", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!aw", name = "t", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "J")
    public long field775;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method382(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class439.field6402[arg0][var8][var14] == -class12.field196) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class225.field3278) + 1;
            int var10 = (arg3 << class225.field3278) + 2;
            int var11 = class529.field7807[arg0].method271(arg1, arg3) + arg5;
            if (!class475.method2842(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class225.field3278) - 1;
            if (!class475.method2842(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class225.field3278) - 1;
            if (!class475.method2842(var9, var11, var13)) {
                return false;
            } else if (class475.method2842(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class170.method1208(arg0, arg1, arg3)) {
            int var6 = arg1 << class225.field3278;
            int var7 = arg3 << class225.field3278;
            return class475.method2842(var6 + 1, class529.field7807[arg0].method271(arg1, arg3) + arg5, var7 + 1) && class475.method2842(class427.field6246 + var6 - 1, class529.field7807[arg0].method271(arg1 + 1, arg3) + arg5, var7 + 1) && class475.method2842(class427.field6246 + var6 - 1, class529.field7807[arg0].method271(arg1 + 1, arg3 + 1) + arg5, class427.field6246 + var7 - 1) && class475.method2842(var6 + 1, class529.field7807[arg0].method271(arg1, arg3 + 1) + arg5, class427.field6246 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IBI)V")
    public static final void method383(int arg0, byte arg1, int arg2) {
        field772++;
        class511.field7539 = arg0 - class2.field40;
        class504.field7389 = arg2 - class2.field44;
        if (arg1 > -73) {
            field777 = null;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)V")
    public static final void method384(int arg0, int arg1) {
        class165 var2 = class36.field545[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class165 var4 = class36.field545[var3][arg0][arg1] = class36.field545[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2488--;
                for (class525 var5 = var4.field2490; var5 != null; var5 = var5.field7716) {
                    class370 var6 = var5.field7711;
                    if (var6.field5532 == arg0 && var6.field5535 == arg1) {
                        var6.field5538--;
                    }
                }
            }
        }
        if (class36.field545[0][arg0][arg1] == null) {
            class36.field545[0][arg0][arg1] = new class165(0, arg0, arg1);
            class36.field545[0][arg0][arg1].field2475 = 1;
        }
        class36.field545[0][arg0][arg1].field2477 = var2;
        class36.field545[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IILti;)V")
    private final void method385(int arg0, int arg1, class303 arg2) {
        if (arg1 == 1) {
            this.field776 = arg2.method1868(arg0 - 17885);
        } else if (arg1 == 2) {
            arg2.method1918((byte) 73);
        } else if (arg1 == 3) {
            this.field790 = arg2.method1870(-1945262512);
            this.field787 = arg2.method1870(-1945262512);
            this.field771 = arg2.method1870(arg0 ^ 0x8C0DE38D);
        } else if (arg1 == 4) {
            this.field782 = arg2.method1918((byte) 83);
            this.field788 = arg2.method1870(-1945262512);
        } else if (arg1 == 6) {
            this.field781 = arg2.method1918((byte) -99);
        } else if (arg1 == 8) {
            this.field774 = 1;
        } else if (arg1 == 9) {
            this.field783 = 1;
        } else if (arg1 == 10) {
            this.field791 = true;
        }
        field773++;
        if (arg0 != 17885) {
            this.field781 = 71;
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lti;I)V")
    public final void method386(class303 arg0, int arg1) {
        field785++;
        while (true) {
            int var3 = arg0.method1918((byte) 105);
            if (var3 == 0) {
                int var4 = 87 % ((29 - arg1) / 53);
                return;
            }
            this.method385(17885, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIII)V")
    public static final void method387(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 0) {
            field786 = null;
        }
        if (arg3 > arg2) {
            class217.method1448(class436.field6332[arg4], arg2, arg0, 4, arg3);
        } else {
            class217.method1448(class436.field6332[arg4], arg3, arg0, 4, arg2);
        }
        field780++;
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        this.field778 = class324.field4974[this.field776 << 3];
        field784++;
        this.field779 = (int) Math.sqrt((double) (this.field790 * this.field790 + this.field787 * this.field787 + this.field771 * this.field771));
        if (this.field788 == 0) {
            this.field788 = 1;
        }
        if (arg0 != 1) {
            method384(-11, -32);
        }
        if (this.field782 == 0) {
            this.field775 = 2147483647L;
        } else if (this.field782 == 1) {
            this.field775 = (this.field779 * 8 / this.field788);
            this.field775 *= this.field775;
        } else if (this.field782 == 2) {
            this.field775 = (this.field779 * 8 / this.field788);
        }
        if (this.field791) {
            this.field779 *= -1;
        }
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V")
    public static void method389(int arg0) {
        if (arg0 != 0) {
            method384(1, 97);
        }
        field777 = null;
        field786 = null;
    }
}
