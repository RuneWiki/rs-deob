import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class325 extends class61 {

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field5662 = 0;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "[I")
    public static int[] field5668 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "[I")
    public static int[] field5670 = new int[2048];

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "Lol;")
    private class231 field5666;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lhi;I)V", line = 16)
    public final void method2283(class291 arg0, int arg1) {
        field5674++;
        while (true) {
            int var3 = arg0.method2011(-16);
            if (var3 == 0) {
                if (arg1 != -2) {
                    field5673 = -90;
                }
                return;
            }
            this.method2284(var3, arg0, (byte) -62);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILhi;B)V", line = 47)
    private final void method2284(int arg0, class291 arg1, byte arg2) {
        if (arg0 == 249) {
            int var4 = arg1.method2011(-88);
            if (this.field5666 == null) {
                int var5 = class270.method1847(var4, 96);
                this.field5666 = new class231(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method2011(-25) == 1;
                int var8 = arg1.method2009((byte) 64);
                class273 var9;
                if (var7) {
                    var9 = new class74(arg1.method2017(true));
                } else {
                    var9 = new class114(arg1.method1969((byte) -16));
                }
                this.field5666.method1593((long) var8, var9, 27497);
            }
        }
        field5675++;
        int var10 = 110 % ((arg2 - 38) / 54);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V", line = 91)
    public static final void method2285(byte arg0) {
        field5671++;
        int var1 = class73.field1058.method1075(false, 8);
        if (class194.field3114 > var1) {
            for (int var2 = var1; var2 < class194.field3114; var2++) {
                class305.field5243[class26.field452++] = field5670[var2];
            }
        }
        if (var1 > class194.field3114) {
            throw new RuntimeException("gppov1");
        }
        class194.field3114 = 0;
        int var3 = 0;
        if (arg0 != 82) {
            return;
        }
        while (var3 < var1) {
            int var4 = field5670[var3];
            class12 var5 = class22.field380[var4];
            int var6 = class73.field1058.method1075(false, 1);
            if (var6 == 0) {
                field5670[class194.field3114++] = var4;
                var5.field4251 = class142.field2187;
            } else {
                int var7 = class73.field1058.method1075(false, 2);
                if (var7 == 0) {
                    field5670[class194.field3114++] = var4;
                    var5.field4251 = class142.field2187;
                    class235.field3851[class238.field3912++] = var4;
                } else if (var7 == 1) {
                    field5670[class194.field3114++] = var4;
                    var5.field4251 = class142.field2187;
                    int var12 = class73.field1058.method1075(false, 3);
                    var5.method1702(1, (byte) 126, var12);
                    int var13 = class73.field1058.method1075(false, 1);
                    if (var13 == 1) {
                        class235.field3851[class238.field3912++] = var4;
                    }
                } else if (var7 == 2) {
                    field5670[class194.field3114++] = var4;
                    var5.field4251 = class142.field2187;
                    if (class73.field1058.method1075(false, 1) == 1) {
                        int var8 = class73.field1058.method1075(false, 3);
                        var5.method1702(2, (byte) -75, var8);
                        int var9 = class73.field1058.method1075(false, 3);
                        var5.method1702(2, (byte) 126, var9);
                    } else {
                        int var10 = class73.field1058.method1075(false, 3);
                        var5.method1702(0, (byte) 125, var10);
                    }
                    int var11 = class73.field1058.method1075(false, 1);
                    if (var11 == 1) {
                        class235.field3851[class238.field3912++] = var4;
                    }
                } else if (var7 == 3) {
                    class305.field5243[class26.field452++] = var4;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BILwm;)Lwm;", line = 210)
    public final class152 method2286(byte arg0, int arg1, class152 arg2) {
        field5664++;
        if (this.field5666 == null) {
            return arg2;
        }
        class74 var4 = (class74) this.field5666.method1586((long) arg1, -82);
        if (var4 == null) {
            return arg2;
        } else {
            int var5 = -94 % ((arg0 + 11) / 51);
            return var4.field1074;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V", line = 231)
    public static void method2287(byte arg0) {
        field5668 = null;
        if (arg0 <= -16) {
            field5670 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)I", line = 249)
    public final int method2288(int arg0, int arg1, int arg2) {
        field5665++;
        if (this.field5666 == null) {
            return arg2;
        } else if (arg0 == 30291) {
            class114 var4 = (class114) this.field5666.method1586((long) arg1, arg0 - 30412);
            return var4 == null ? arg2 : var4.field1616;
        } else {
            return -47;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II[I[II)V", line = 270)
    public static final void method2289(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        field5669++;
        if (arg4 > arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg0; var9 < arg4; var9++) {
                if (arg3[var9] > var7 + (var9 & 0x1)) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg3[arg4] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var8;
            method2289(arg0, -9044, arg2, arg3, var6 - 1);
            method2289(var6 + 1, arg1 ^ 0x0, arg2, arg3, arg4);
        }
        if (arg1 != -9044) {
            field5670 = (int[]) null;
        }
    }
}
