import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class286 extends class135 {

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Lsj;")
    public class48 field4555 = new class48();

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "Lcd;")
    public class60 field4563 = new class60();

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Lbc;")
    private class105 field4559;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    public static int field4561 = 0;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "Ljj;")
    public static class134 field4556;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V")
    public static final void method1916(int arg0) {
        int var1 = 42 / ((arg0 - 78) / 45);
        field4564++;
        class254.field4067.method1834(0);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILbb;II[I)V")
    private final void method1917(int arg0, int arg1, class80 arg2, int arg3, int arg4, int[] arg5) {
        if ((this.field4559.field1774[arg2.field1103] & 0x4) != 0 && arg2.field1113 < 0) {
            int var7 = this.field4559.field1794[arg2.field1103] / class29.field343;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field1102) / var7;
                if (arg0 < var8) {
                    arg2.field1102 += arg0 * var7;
                    break;
                }
                arg2.field1105.method284(arg5, arg4, var8);
                arg0 -= var8;
                arg4 += var8;
                int var9 = class29.field343 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                arg2.field1102 += var7 * var8 - 1048576;
                class35 var11 = arg2.field1105;
                if (this.field4559.field1827[arg2.field1103] == 0) {
                    arg2.field1105 = class35.method280(arg2.field1107, var11.method283(), var11.method276(), var11.method240());
                } else {
                    arg2.field1105 = class35.method280(arg2.field1107, var11.method283(), 0, var11.method240());
                    this.field4559.method768(arg2.field1112.field1866[arg2.field1098] < 0, -1933333626, arg2);
                    arg2.field1105.method248(var9, var11.method276());
                }
                if (arg2.field1112.field1866[arg2.field1098] < 0) {
                    arg2.field1105.method241(-1);
                }
                var11.method246(var9);
                var11.method284(arg5, arg4, arg3 - arg4);
                if (var11.method270()) {
                    this.field4563.method451(var11);
                }
            }
        }
        arg2.field1105.method284(arg5, arg4, arg0);
        field4560++;
        if (arg1 > -50) {
            this.method284((int[]) null, -78, 66);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V")
    public static final void method1918(int arg0, int arg1, int arg2) {
        if (arg0 >= -102) {
            field4561 = -29;
        }
        field4562++;
        class283 var3 = class46.method360(1, -81, arg1);
        var3.method1893(0);
        var3.field4528 = arg2;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
    public final void method265(int arg0) {
        this.field4563.method265(arg0);
        field4565++;
        for (class80 var2 = (class80) this.field4555.method365(3); var2 != null; var2 = (class80) this.field4555.method372((byte) 7)) {
            if (!this.field4559.method776(var2, -2148)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1111) {
                        this.method1920(13539, var3, var2);
                        var2.field1111 -= var3;
                        break;
                    }
                    this.method1920(13539, var2.field1111, var2);
                    var3 -= var2.field1111;
                } while (!this.field4559.method766(var2, var3, (byte) -126, (int[]) null, 0));
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method1919(byte arg0) {
        int var1 = -52 / ((arg0 + 63) / 53);
        field4556 = null;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "()Lok;")
    public final class135 method245() {
        field4554++;
        class80 var1;
        do {
            var1 = (class80) this.field4555.method372((byte) 7);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1105 == null);
        return var1.field1105;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "()Lok;")
    public final class135 method262() {
        class80 var1 = (class80) this.field4555.method365(3);
        field4566++;
        if (var1 == null) {
            return null;
        } else if (var1.field1105 == null) {
            return this.method245();
        } else {
            return var1.field1105;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILbb;)V")
    private final void method1920(int arg0, int arg1, class80 arg2) {
        field4557++;
        if ((this.field4559.field1774[arg2.field1103] & 0x4) != 0 && arg2.field1113 < 0) {
            int var4 = this.field4559.field1794[arg2.field1103] / class29.field343;
            int var5 = (var4 + 1048575 - arg2.field1102) / var4;
            arg2.field1102 = arg1 * var4 + arg2.field1102 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field4559.field1827[arg2.field1103] == 0) {
                    arg2.field1105 = class35.method280(arg2.field1107, arg2.field1105.method283(), arg2.field1105.method276(), arg2.field1105.method240());
                } else {
                    arg2.field1105 = class35.method280(arg2.field1107, arg2.field1105.method283(), 0, arg2.field1105.method240());
                    this.field4559.method768(arg2.field1112.field1866[arg2.field1098] < 0, -1933333626, arg2);
                }
                if (arg2.field1112.field1866[arg2.field1098] < 0) {
                    arg2.field1105.method241(-1);
                }
                arg1 = arg2.field1102 / var4;
            }
        }
        if (arg0 != 13539) {
            method1916(103);
        }
        arg2.field1105.method265(arg1);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "([III)V")
    public final void method284(int[] arg0, int arg1, int arg2) {
        field4553++;
        this.field4563.method284(arg0, arg1, arg2);
        for (class80 var4 = (class80) this.field4555.method365(3); var4 != null; var4 = (class80) this.field4555.method372((byte) 7)) {
            if (!this.field4559.method776(var4, -2148)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1111) {
                        this.method1917(var6, -61, var4, var5 + var6, var5, arg0);
                        var4.field1111 -= var6;
                        break;
                    }
                    this.method1917(var4.field1111, -117, var4, var5 + var6, var5, arg0);
                    var6 -= var4.field1111;
                    var5 += var4.field1111;
                } while (!this.field4559.method766(var4, var6, (byte) -127, arg0, var5));
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "()I")
    public final int method263() {
        field4558++;
        return 0;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lbc;)V")
    public class286(class105 arg0) {
        this.field4559 = arg0;
    }
}
