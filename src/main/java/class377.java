import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class377 extends class348 {

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "Lsm;")
    public class249 field5329 = new class249();

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "Lad;")
    public class209 field5334 = new class209();

    @OriginalMember(owner = "client!rm", name = "B", descriptor = "Lln;")
    private class35 field5332;

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "Lcs;")
    public static class351 field5330 = new class351(2, -1);

    @OriginalMember(owner = "client!rm", name = "E", descriptor = "Lfn;")
    public static class52 field5335;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!rm", name = "A", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "I")
    public static int field5333;

    static {
        new class112("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
        field5335 = new class52(95, 3);
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V", line = 5)
    public final void method294(int arg0) {
        field5325++;
        this.field5334.method294(arg0);
        for (class8 var2 = (class8) this.field5329.method1544(-89); var2 != null; var2 = (class8) this.field5329.method1546((byte) -42)) {
            if (!this.field5332.method260(var2, 127)) {
                int var3 = arg0;
                do {
                    if (var2.field149 >= var3) {
                        this.method2248(-26726, var2, var3);
                        var2.field149 -= var3;
                        break;
                    }
                    this.method2248(-26726, var2, var2.field149);
                    var3 -= var2.field149;
                } while (!this.field5332.method302(var2, -113, 0, var3, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "()Lgh;", line = 40)
    public final class348 method278() {
        field5324++;
        class8 var1 = (class8) this.field5329.method1544(-89);
        if (var1 == null) {
            return null;
        } else if (var1.field147 == null) {
            return this.method270();
        } else {
            return var1.field147;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILtr;I)V", line = 57)
    private final void method2248(int arg0, class8 arg1, int arg2) {
        if (arg0 != -26726) {
            this.method294(-68);
        }
        if ((this.field5332.field586[arg1.field154] & 0x4) != 0 && arg1.field170 < 0) {
            int var4 = this.field5332.field551[arg1.field154] / class245.field3463;
            int var5 = (var4 + 1048575 - arg1.field163) / var4;
            arg1.field163 = arg2 * var4 + arg1.field163 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field5332.field593[arg1.field154] == 0) {
                    arg1.field147 = class263.method1660(arg1.field156, arg1.field147.method1642(), arg1.field147.method1629(), arg1.field147.method1632());
                } else {
                    arg1.field147 = class263.method1660(arg1.field156, arg1.field147.method1642(), 0, arg1.field147.method1632());
                    this.field5332.method276(arg1, arg1.field155.field4169[arg1.field157] < 0, 255);
                }
                if (arg1.field155.field4169[arg1.field157] < 0) {
                    arg1.field147.method1640(-1);
                }
                arg2 = arg1.field163 / var4;
            }
        }
        field5333++;
        arg1.field147.method294(arg2);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I[ILtr;IBI)V", line = 105)
    private final void method2249(int arg0, int[] arg1, class8 arg2, int arg3, byte arg4, int arg5) {
        if (arg4 < 101) {
            method2251((byte) -89);
        }
        if ((this.field5332.field586[arg2.field154] & 0x4) != 0 && arg2.field170 < 0) {
            int var7 = this.field5332.field551[arg2.field154] / class245.field3463;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field163) / var7;
                if (var8 > arg0) {
                    arg2.field163 += arg0 * var7;
                    break;
                }
                arg2.field147.method267(arg1, arg5, var8);
                arg0 -= var8;
                arg5 += var8;
                arg2.field163 += var7 * var8 - 1048576;
                int var9 = class245.field3463 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class263 var11 = arg2.field147;
                if (this.field5332.field593[arg2.field154] == 0) {
                    arg2.field147 = class263.method1660(arg2.field156, var11.method1642(), var11.method1629(), var11.method1632());
                } else {
                    arg2.field147 = class263.method1660(arg2.field156, var11.method1642(), 0, var11.method1632());
                    this.field5332.method276(arg2, arg2.field155.field4169[arg2.field157] < 0, 255);
                    arg2.field147.method1658(var9, var11.method1629());
                }
                if (arg2.field155.field4169[arg2.field157] < 0) {
                    arg2.field147.method1640(-1);
                }
                var11.method1627(var9);
                var11.method267(arg1, arg5, arg3 - arg5);
                if (var11.method1634()) {
                    this.field5334.method1315(var11);
                }
            }
        }
        field5327++;
        arg2.field147.method267(arg1, arg5, arg0);
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "()I", line = 164)
    public final int method286() {
        field5331++;
        return 0;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "()Lgh;", line = 176)
    public final class348 method270() {
        field5326++;
        class8 var1;
        do {
            var1 = (class8) this.field5329.method1546((byte) -42);
            if (var1 == null) {
                return null;
            }
        } while (var1.field147 == null);
        return var1.field147;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILgh;)V", line = 198)
    public static final void method2250(int arg0, class348 arg1) {
        field5328++;
        if (arg1.field4761 != null) {
            arg1.field4761.field2590 = 0;
        }
        arg1.field4760 = false;
        if (arg0 != 0) {
            field5330 = null;
        }
        for (class348 var2 = arg1.method278(); var2 != null; var2 = arg1.method270()) {
            method2250(0, var2);
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)V", line = 221)
    public static void method2251(byte arg0) {
        field5330 = null;
        if (arg0 <= -74) {
            field5335 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lln;)V", line = 287)
    public class377(class35 arg0) {
        this.field5332 = arg0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([III)V", line = 243)
    public final void method267(int[] arg0, int arg1, int arg2) {
        field5323++;
        this.field5334.method267(arg0, arg1, arg2);
        for (class8 var4 = (class8) this.field5329.method1544(-123); var4 != null; var4 = (class8) this.field5329.method1546((byte) -42)) {
            if (!this.field5332.method260(var4, 124)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field149) {
                        this.method2249(var6, arg0, var4, var5 + var6, (byte) 125, var5);
                        var4.field149 -= var6;
                        break;
                    }
                    this.method2249(var4.field149, arg0, var4, var5 + var6, (byte) 123, var5);
                    var6 -= var4.field149;
                    var5 += var4.field149;
                } while (!this.field5332.method302(var4, -124, var5, var6, arg0));
            }
        }
    }
}
