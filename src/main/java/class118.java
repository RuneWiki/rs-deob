import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class118 extends class412 {

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "Lkn;")
    public class442 field1596 = new class442();

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "Llk;")
    public class351 field1598 = new class351();

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "Lmn;")
    private class206 field1593;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "Lpm;")
    public static class349 field1604 = new class349("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "[I")
    public static int[] field1606 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "Z")
    public static boolean field1607 = false;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "[I")
    public static int[] field1605 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "()I", line = 5)
    public final int method720() {
        field1597++;
        return 0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILoa;[IIII)V", line = 16)
    private final void method721(int arg0, class415 arg1, int[] arg2, int arg3, int arg4, int arg5) {
        if ((this.field1593.field2941[arg1.field5942] & 0x4) != 0 && arg1.field5923 < 0) {
            int var7 = this.field1593.field2923[arg1.field5942] / class246.field3671;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field5943) / var7;
                if (arg3 < var8) {
                    arg1.field5943 += arg3 * var7;
                    break;
                }
                arg1.field5927.method724(arg2, arg4, var8);
                arg3 -= var8;
                arg1.field5943 += var7 * var8 - 1048576;
                arg4 += var8;
                int var9 = class246.field3671 / 100;
                int var10 = 262144 / var7;
                if (var9 > var10) {
                    var9 = var10;
                }
                class244 var11 = arg1.field5927;
                if (this.field1593.field2900[arg1.field5942] == 0) {
                    arg1.field5927 = class244.method1680(arg1.field5925, var11.method1691(), var11.method1672(), var11.method1699());
                } else {
                    arg1.field5927 = class244.method1680(arg1.field5925, var11.method1691(), 0, var11.method1699());
                    this.field1593.method1457(51, arg1, arg1.field5931.field6487[arg1.field5930] < 0);
                    arg1.field5927.method1698(var9, var11.method1672());
                }
                if (arg1.field5931.field6487[arg1.field5930] < 0) {
                    arg1.field5927.method1693(-1);
                }
                var11.method1661(var9);
                var11.method724(arg2, arg4, arg0 - arg4);
                if (var11.method1690()) {
                    this.field1598.method2291(var11);
                }
            }
        }
        field1602++;
        if (arg5 >= 98) {
            arg1.field5927.method724(arg2, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 79)
    public final void method722(int arg0) {
        field1599++;
        this.field1598.method722(arg0);
        for (class415 var2 = (class415) this.field1596.method2752(-76); var2 != null; var2 = (class415) this.field1596.method2754(-1)) {
            if (!this.field1593.method1455(var2, false)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field5918) {
                        this.method723(-19, var3, var2);
                        var2.field5918 -= var3;
                        break;
                    }
                    this.method723(18, var2.field5918, var2);
                    var3 -= var2.field5918;
                } while (!this.field1593.method1441(var3, 0, (int[]) null, 65280, var2));
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lmn;)V", line = 236)
    public class118(class206 arg0) {
        this.field1593 = arg0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILoa;)V", line = 120)
    private final void method723(int arg0, int arg1, class415 arg2) {
        if ((this.field1593.field2941[arg2.field5942] & 0x4) != 0 && arg2.field5923 < 0) {
            int var4 = this.field1593.field2923[arg2.field5942] / class246.field3671;
            int var5 = (var4 + 1048575 - arg2.field5943) / var4;
            arg2.field5943 = arg1 * var4 + arg2.field5943 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field1593.field2900[arg2.field5942] == 0) {
                    arg2.field5927 = class244.method1680(arg2.field5925, arg2.field5927.method1691(), arg2.field5927.method1672(), arg2.field5927.method1699());
                } else {
                    arg2.field5927 = class244.method1680(arg2.field5925, arg2.field5927.method1691(), 0, arg2.field5927.method1699());
                    this.field1593.method1457(114, arg2, arg2.field5931.field6487[arg2.field5930] < 0);
                }
                if (arg2.field5931.field6487[arg2.field5930] < 0) {
                    arg2.field5927.method1693(-1);
                }
                arg1 = arg2.field5943 / var4;
            }
        }
        field1603++;
        arg2.field5927.method722(arg1);
        int var6 = -31 % ((-arg0 - 76) / 50);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([III)V", line = 163)
    public final void method724(int[] arg0, int arg1, int arg2) {
        field1600++;
        this.field1598.method724(arg0, arg1, arg2);
        for (class415 var4 = (class415) this.field1596.method2752(-91); var4 != null; var4 = (class415) this.field1596.method2754(-1)) {
            if (!this.field1593.method1455(var4, false)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field5918 >= var6) {
                        this.method721(var5 + var6, var4, arg0, var6, var5, 126);
                        var4.field5918 -= var6;
                        break;
                    }
                    this.method721(var5 + var6, var4, arg0, var4.field5918, var5, 122);
                    var6 -= var4.field5918;
                    var5 += var4.field5918;
                } while (!this.field1593.method1441(var6, var5, arg0, 65280, var4));
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "()Lkb;", line = 205)
    public final class412 method725() {
        field1594++;
        class415 var1 = (class415) this.field1596.method2752(-100);
        if (var1 == null) {
            return null;
        } else if (var1.field5927 == null) {
            return this.method727();
        } else {
            return var1.field5927;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V", line = 223)
    public static void method726(int arg0) {
        field1604 = null;
        field1606 = null;
        field1605 = null;
        if (arg0 != 17209) {
            field1606 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "()Lkb;", line = 244)
    public final class412 method727() {
        field1595++;
        class415 var1;
        do {
            var1 = (class415) this.field1596.method2754(-1);
            if (var1 == null) {
                return null;
            }
        } while (var1.field5927 == null);
        return var1.field5927;
    }
}
