import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class39 extends class177 {

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Lud;")
    public class2 field664 = new class2();

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "Lbe;")
    public class29 field673 = new class29();

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "Lhe;")
    private class20 field667;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "[I")
    public static int[] field668 = new int[100];

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "Ljava/lang/String;")
    public static String field670 = "Continue";

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "Lvd;")
    public static class4 field665;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILub;I)Llg;")
    public static final class13 method349(int arg0, int arg1, class92 arg2, int arg3) {
        field663++;
        if (arg1 > -116) {
            field670 = null;
        }
        return class246.method1668(arg0, arg2, arg3, -1) ? class131.method971((byte) -56) : null;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "()Lga;")
    public final class177 method160() {
        field672++;
        class45 var1 = (class45) this.field664.method6(-119);
        if (var1 == null) {
            return null;
        } else if (var1.field739 == null) {
            return this.method152();
        } else {
            return var1.field739;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "()Lga;")
    public final class177 method152() {
        field674++;
        class45 var1;
        do {
            var1 = (class45) this.field664.method11((byte) 110);
            if (var1 == null) {
                return null;
            }
        } while (var1.field739 == null);
        return var1.field739;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
    public static void method350(int arg0) {
        field670 = null;
        field665 = null;
        if (arg0 != 0) {
            field668 = null;
        }
        field668 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I[IIIILsd;)V")
    private final void method351(int arg0, int[] arg1, int arg2, int arg3, int arg4, class45 arg5) {
        field661++;
        if ((this.field667.field279[arg5.field762] & 0x4) != 0 && arg5.field753 < 0) {
            int var7 = this.field667.field325[arg5.field762] / class174.field2695;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field754) / var7;
                if (arg4 < var8) {
                    arg5.field754 += arg4 * var7;
                    break;
                }
                arg4 -= var8;
                arg5.field739.method178(arg1, arg3, var8);
                class119 var9 = arg5.field739;
                int var10 = class174.field2695 / 100;
                int var11 = 262144 / var7;
                arg5.field754 += var7 * var8 - 1048576;
                arg3 += var8;
                if (var11 < var10) {
                    var10 = var11;
                }
                if (this.field667.field308[arg5.field762] == 0) {
                    arg5.field739 = class119.method891(arg5.field741, var9.method889(), var9.method871(), var9.method873());
                } else {
                    arg5.field739 = class119.method891(arg5.field741, var9.method889(), 0, var9.method873());
                    this.field667.method182(arg5, arg5.field736.field701[arg5.field749] < 0, (byte) 98);
                    arg5.field739.method895(var10, var9.method871());
                }
                if (arg5.field736.field701[arg5.field749] < 0) {
                    arg5.field739.method878(-1);
                }
                var9.method885(var10);
                var9.method178(arg1, arg3, arg0 - arg3);
                if (var9.method870()) {
                    this.field673.method244(var9);
                }
            }
        }
        if (arg2 != 5205) {
            this.method178((int[]) null, 75, 9);
        }
        arg5.field739.method178(arg1, arg3, arg4);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "([III)V")
    public final void method178(int[] arg0, int arg1, int arg2) {
        this.field673.method178(arg0, arg1, arg2);
        field666++;
        for (class45 var4 = (class45) this.field664.method6(-117); var4 != null; var4 = (class45) this.field664.method11((byte) 71)) {
            if (!this.field667.method161(0, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field738) {
                        this.method351(var5 + var6, arg0, 5205, var5, var6, var4);
                        var4.field738 -= var6;
                        break;
                    }
                    this.method351(var5 + var6, arg0, 5205, var5, var4.field738, var4);
                    var5 += var4.field738;
                    var6 -= var4.field738;
                } while (!this.field667.method169((byte) 124, var4, arg0, var5, var6));
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()I")
    public final int method162() {
        field669++;
        return 0;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public final void method156(int arg0) {
        field671++;
        this.field673.method156(arg0);
        for (class45 var2 = (class45) this.field664.method6(-108); var2 != null; var2 = (class45) this.field664.method11((byte) 83)) {
            if (!this.field667.method161(0, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field738 >= var3) {
                        this.method352(-10445, var3, var2);
                        var2.field738 -= var3;
                        break;
                    }
                    this.method352(-10445, var2.field738, var2);
                    var3 -= var2.field738;
                } while (!this.field667.method169((byte) 125, var2, (int[]) null, 0, var3));
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILsd;)V")
    private final void method352(int arg0, int arg1, class45 arg2) {
        field660++;
        if ((this.field667.field279[arg2.field762] & 0x4) != 0 && arg2.field753 < 0) {
            int var4 = this.field667.field325[arg2.field762] / class174.field2695;
            int var5 = (var4 + 1048575 - arg2.field754) / var4;
            arg2.field754 = arg1 * var4 + arg2.field754 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field667.field308[arg2.field762] == 0) {
                    arg2.field739 = class119.method891(arg2.field741, arg2.field739.method889(), arg2.field739.method871(), arg2.field739.method873());
                } else {
                    arg2.field739 = class119.method891(arg2.field741, arg2.field739.method889(), 0, arg2.field739.method873());
                    this.field667.method182(arg2, arg2.field736.field701[arg2.field749] < 0, (byte) -50);
                }
                if (arg2.field736.field701[arg2.field749] < 0) {
                    arg2.field739.method878(-1);
                }
                arg1 = arg2.field754 / var4;
            }
        }
        arg2.field739.method156(arg1);
        if (arg0 != -10445) {
            this.method178((int[]) null, 58, -89);
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lhe;)V")
    public class39(class20 arg0) {
        this.field667 = arg0;
    }
}
