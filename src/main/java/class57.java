import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class57 extends class112 {

    @OriginalMember(owner = "client!il", name = "M", descriptor = "I")
    private int field875;

    @OriginalMember(owner = "client!il", name = "O", descriptor = "Lol;")
    public static class231 field877 = new class231(16);

    @OriginalMember(owner = "client!il", name = "P", descriptor = "I")
    public static int field878 = 0;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "Lwm;")
    private static class152 field879 = class157.method1048("Cancel", 125);

    @OriginalMember(owner = "client!il", name = "T", descriptor = "Lwm;")
    public static class152 field882 = class157.method1048("<col=00ff80>", 106);

    @OriginalMember(owner = "client!il", name = "R", descriptor = "Lwm;")
    public static class152 field880 = field879;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IILhi;)V", line = 5)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg0 != 31164) {
            method376(-31, 32, -58, -62, 121, -6, -3, -89);
        }
        if (arg1 == 0) {
            this.field875 = (arg2.method2011(-128) << 12) / 255;
        }
        field874++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)[I", line = 36)
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -3) {
            method377(52);
        }
        field881++;
        int[] var3 = this.field1585.method1952(arg1, (byte) 81);
        if (this.field1585.field4935) {
            class187.method1245(var3, 0, class58.field889, this.field875);
        }
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIII)V", line = 58)
    public static final void method376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 >= 0 && arg3 >= 0 && arg5 < 103 && arg3 < 103) {
            if (arg0 == 0) {
                class294 var8 = class235.method1615(arg7, arg5, arg3);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field5019 >>> 32);
                    if (arg1 == 2) {
                        var8.field5026 = new class175(var9, 2, arg4 + 4, arg7, arg5, arg3, arg6, false, var8.field5026);
                        var8.field5028 = new class175(var9, 2, arg4 + 1 & 0x3, arg7, arg5, arg3, arg6, false, var8.field5028);
                    } else {
                        var8.field5026 = new class175(var9, arg1, arg4, arg7, arg5, arg3, arg6, false, var8.field5026);
                    }
                }
            }
            if (arg0 == 1) {
                class275 var10 = class58.method383(arg7, arg5, arg3);
                if (var10 != null) {
                    int var11 = (int) (var10.field4717 >>> 32) & Integer.MAX_VALUE;
                    if (arg1 == 4 || arg1 == 5) {
                        var10.field4707 = new class175(var11, 4, arg4, arg7, arg5, arg3, arg6, false, var10.field4707);
                    } else if (arg1 == 6) {
                        var10.field4707 = new class175(var11, 4, arg4 + 4, arg7, arg5, arg3, arg6, false, var10.field4707);
                    } else if (arg1 == 7) {
                        var10.field4707 = new class175(var11, 4, (arg4 + 2 & 0x3) + 4, arg7, arg5, arg3, arg6, false, var10.field4707);
                    } else if (arg1 == 8) {
                        var10.field4707 = new class175(var11, 4, arg4 + 4, arg7, arg5, arg3, arg6, false, var10.field4707);
                        var10.field4700 = new class175(var11, 4, (arg4 + 2 & 0x3) + 4, arg7, arg5, arg3, arg6, false, var10.field4700);
                    }
                }
            }
            if (arg0 == 2) {
                if (arg1 == 11) {
                    arg1 = 10;
                }
                class248 var12 = class289.method1943(arg7, arg5, arg3);
                if (var12 != null) {
                    var12.field4144 = new class175((int) (var12.field4156 >>> 32) & Integer.MAX_VALUE, arg1, arg4, arg7, arg5, arg3, arg6, false, var12.field4144);
                }
            }
            if (arg0 == 3) {
                class120 var13 = class163.method1096(arg7, arg5, arg3);
                if (var13 != null) {
                    var13.field1684 = new class175(Integer.MAX_VALUE & (int) (var13.field1685 >>> 32), 22, arg4, arg7, arg5, arg3, arg6, false, var13.field1684);
                }
            }
        }
        if (arg2 == 3491) {
            field876++;
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V", line = 147)
    public class57() {
        this(4096);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(I)V", line = 151)
    private class57(int arg0) {
        super(0, true);
        this.field875 = 4096;
        this.field875 = arg0;
    }

    @OriginalMember(owner = "client!il", name = "h", descriptor = "(I)V", line = 167)
    public static void method377(int arg0) {
        field880 = null;
        field882 = null;
        if (arg0 < -117) {
            field877 = null;
            field879 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "i", descriptor = "(I)V", line = 188)
    public static final void method378(int arg0) {
        field873++;
        if (arg0 > -24) {
            field882 = (class152) null;
        }
        class174 var1 = new class174();
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class131.field1994[var2][var3] = var1;
            }
        }
    }
}
