import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class326 {

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "[Z")
    public static boolean[] field4346 = new boolean[100];

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "[C")
    public static char[] field4349 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public int field4343;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public int field4344;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public int field4345;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field4351;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kn", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field4352;

    // $FF: synthetic method
    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2047(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)Lfo;", line = 6)
    public static final class12 method2042(int arg0) {
        field4351++;
        if (arg0 != 0) {
            method2042(-71);
        }
        class12 var1 = (class12) class345.field4686.method1027(arg0 ^ 0xFFFFAF9E);
        if (var1 != null) {
            var1.method263(false);
            var1.method1123((byte) -31);
            return var1;
        }
        class12 var2;
        do {
            var2 = (class12) class390.field5321.method1027(-20578);
            if (var2 == null) {
                return null;
            }
            if (var2.method64((byte) -62) > class164.method1038(8635)) {
                return null;
            }
            var2.method263(false);
            var2.method1123((byte) -31);
        } while ((Long.MIN_VALUE & var2.field2090) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILbg;)V", line = 51)
    private final void method2043(int arg0, int arg1, class242 arg2) {
        if (arg0 <= 110) {
            return;
        }
        field4350++;
        if (arg1 == 1) {
            this.field4344 = arg2.method1587((byte) -102);
            this.field4343 = arg2.method1563(-128);
            this.field4345 = arg2.method1563(-128);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BLbg;)V", line = 72)
    public final void method2044(byte arg0, class242 arg1) {
        field4348++;
        while (true) {
            int var3 = arg1.method1563(-128);
            if (var3 == 0) {
                if (arg0 <= 11) {
                    this.field4345 = -97;
                    return;
                } else {
                    return;
                }
            }
            this.method2043(116, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V", line = 97)
    public static void method2045(int arg0) {
        field4346 = null;
        if (arg0 == 15632) {
            field4349 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIZILg;Luo;II)V", line = 108)
    public static final void method2046(int arg0, int arg1, boolean arg2, int arg3, class366 arg4, class118 arg5, int arg6, int arg7) {
        field4347++;
        class171 var8 = null;
        if (!arg2) {
            field4349 = null;
        }
        if (arg6 == 0) {
            var8 = (class171) class440.method2708(arg0, arg7, arg3);
        }
        if (arg6 == 1) {
            var8 = (class171) class65.method373(arg0, arg7, arg3);
        }
        if (arg6 == 2) {
            var8 = (class171) class246.method1610(arg0, arg7, arg3, field4352 == null ? (field4352 = method2047("ol")) : field4352);
        }
        if (arg6 == 3) {
            var8 = (class171) class451.method2792(arg0, arg7, arg3);
        }
        if (var8 == null) {
            return;
        }
        int var9 = var8.method420((byte) 113);
        int var10 = var8.method417((byte) -116);
        class446 var11 = class380.method2361(var8.method409(-50), -29012);
        if (var11.method2761((byte) 82)) {
            class115.method671(arg0, true, arg7, var11, arg3);
        }
        if (var8.method412(18942)) {
            var8.method411(arg5, (byte) 88);
        }
        if (arg6 != 0) {
            if (arg6 == 1) {
                class342.method2188(arg0, arg7, arg3);
                return;
            }
            if (arg6 != 2) {
                if (arg6 == 3) {
                    class52.method300(arg0, arg7, arg3);
                    if (var11.field6179 == 1) {
                        arg4.method2308(arg7, arg3, -1);
                        return;
                    }
                }
                return;
            }
            class35.method228(arg0, arg7, arg3, field4352 == null ? (field4352 = method2047("ol")) : field4352);
            if (var11.field6179 != 0 && class22.field232 > var11.field6244 + arg7 && class196.field2329 > var11.field6244 + arg3 && class22.field232 > arg7 + var11.field6170 && class196.field2329 > var11.field6170 + arg3) {
                arg4.method2302(var10, var11.field6170, (byte) -89, var11.field6238, var11.field6244, !var11.field6222, arg7, arg3);
                return;
            }
            return;
        }
        class152.method981(arg0, arg7, arg3);
        if (var11.field6179 != 0) {
            arg4.method2307(arg7, arg3, !var11.field6222, var9, true, var10, var11.field6238);
            return;
        }
    }
}
