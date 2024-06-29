import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class324 extends class64 {

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "Lmk;")
    public class154 field4319 = new class154();

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "Lia;")
    public class362 field4330 = new class362();

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "Ls;")
    private class380 field4327;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field4322 = null;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field4321 = -1;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    public static int field4325 = -1;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "B")
    public static byte field4318;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "()V", line = 7)
    public static final void method1864() {
        class320.method1846(1, class366.field5129);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V", line = 15)
    public static void method1865(byte arg0) {
        field4322 = null;
        if (arg0 != -118) {
            field4325 = 39;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "()Lle;", line = 27)
    public final class64 method361() {
        field4328++;
        class398 var1;
        do {
            var1 = (class398) this.field4319.method827(-128);
            if (var1 == null) {
                return null;
            }
        } while (var1.field5733 == null);
        return var1.field5733;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([IIILfa;II)V", line = 49)
    private final void method1866(int[] arg0, int arg1, int arg2, class398 arg3, int arg4, int arg5) {
        if ((this.field4327.field5410[arg3.field5745] & 0x4) != 0 && arg3.field5726 < 0) {
            int var7 = this.field4327.field5372[arg3.field5745] / class432.field6338;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field5721) / var7;
                if (arg5 < var8) {
                    arg3.field5721 += arg5 * var7;
                    break;
                }
                arg3.field5733.method359(arg0, arg2, var8);
                arg5 -= var8;
                arg3.field5721 += var7 * var8 - 1048576;
                arg2 += var8;
                int var9 = class432.field6338 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class336 var11 = arg3.field5733;
                if (this.field4327.field5406[arg3.field5745] == 0) {
                    arg3.field5733 = class336.method1928(arg3.field5750, var11.method1951(), var11.method1925(), var11.method1929());
                } else {
                    arg3.field5733 = class336.method1928(arg3.field5750, var11.method1951(), 0, var11.method1929());
                    this.field4327.method2338(114, arg3.field5737.field1833[arg3.field5724] < 0, arg3);
                    arg3.field5733.method1923(var9, var11.method1925());
                }
                if (arg3.field5737.field1833[arg3.field5724] < 0) {
                    arg3.field5733.method1943(-1);
                }
                var11.method1942(var9);
                var11.method359(arg0, arg2, arg1 - arg2);
                if (var11.method1921()) {
                    this.field4330.method2210(var11);
                }
            }
        }
        field4320++;
        arg3.field5733.method359(arg0, arg2, arg5);
        if (arg4 > -104) {
            this.method365();
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILfa;B)V", line = 110)
    private final void method1867(int arg0, class398 arg1, byte arg2) {
        if ((this.field4327.field5410[arg1.field5745] & 0x4) != 0 && arg1.field5726 < 0) {
            int var4 = this.field4327.field5372[arg1.field5745] / class432.field6338;
            int var5 = (var4 + 1048575 - arg1.field5721) / var4;
            arg1.field5721 = arg0 * var4 + arg1.field5721 & 0xFFFFF;
            if (var5 <= arg0) {
                if (this.field4327.field5406[arg1.field5745] == 0) {
                    arg1.field5733 = class336.method1928(arg1.field5750, arg1.field5733.method1951(), arg1.field5733.method1925(), arg1.field5733.method1929());
                } else {
                    arg1.field5733 = class336.method1928(arg1.field5750, arg1.field5733.method1951(), 0, arg1.field5733.method1929());
                    this.field4327.method2338(108, arg1.field5737.field1833[arg1.field5724] < 0, arg1);
                }
                if (arg1.field5737.field1833[arg1.field5724] < 0) {
                    arg1.field5733.method1943(-1);
                }
                arg0 = arg1.field5721 / var4;
            }
        }
        field4329++;
        arg1.field5733.method360(arg0);
        if (arg2 != -116) {
            method1864();
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "()Lle;", line = 153)
    public final class64 method363() {
        field4317++;
        class398 var1 = (class398) this.field4319.method814((byte) 90);
        if (var1 == null) {
            return null;
        } else if (var1.field5733 == null) {
            return this.method361();
        } else {
            return var1.field5733;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIII)V", line = 174)
    public static final void method1868(int arg0, int arg1, int arg2, int arg3) {
        class96 var4 = class176.field2209[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class274 var5 = var4.field1126;
        class274 var6 = var4.field1140;
        if (var5 != null) {
            var5.field3690 = var5.field3690 * arg3 / 16;
            var5.field3701 = var5.field3701 * arg3 / 16;
        }
        if (var6 != null) {
            var6.field3690 = var6.field3690 * arg3 / 16;
            var6.field3701 = var6.field3701 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V", line = 196)
    public final void method360(int arg0) {
        this.field4330.method360(arg0);
        field4326++;
        for (class398 var2 = (class398) this.field4319.method814((byte) 90); var2 != null; var2 = (class398) this.field4319.method827(-128)) {
            if (!this.field4327.method2337((byte) -52, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field5722 >= var3) {
                        this.method1867(var3, var2, (byte) -116);
                        var2.field5722 -= var3;
                        break;
                    }
                    this.method1867(var2.field5722, var2, (byte) -116);
                    var3 -= var2.field5722;
                } while (!this.field4327.method2321(0, (int[]) null, var3, var2, 2));
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "()I", line = 231)
    public final int method365() {
        field4316++;
        return 0;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Ls;)V", line = 291)
    public class324(class380 arg0) {
        this.field4327 = arg0;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([III)V", line = 243)
    public final void method359(int[] arg0, int arg1, int arg2) {
        field4323++;
        this.field4330.method359(arg0, arg1, arg2);
        for (class398 var4 = (class398) this.field4319.method814((byte) 90); var4 != null; var4 = (class398) this.field4319.method827(-128)) {
            if (!this.field4327.method2337((byte) -52, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field5722) {
                        this.method1866(arg0, var5 + var6, var5, var4, -117, var6);
                        var4.field5722 -= var6;
                        break;
                    }
                    this.method1866(arg0, var5 + var6, var5, var4, -128, var4.field5722);
                    var6 -= var4.field5722;
                    var5 += var4.field5722;
                } while (!this.field4327.method2321(var5, arg0, var6, var4, 2));
            }
        }
    }
}
