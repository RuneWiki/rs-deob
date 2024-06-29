import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class68 extends class23 {

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    private int field1238 = 10;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "I")
    private int field1242 = 2048;

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "I")
    private int field1247 = 0;

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "Lpl;")
    public static class186 field1245 = new class186(5);

    @OriginalMember(owner = "client!v", name = "ob", descriptor = "I")
    public static int field1253 = 0;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!v", name = "jb", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!v", name = "kb", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!v", name = "lb", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!v", name = "mb", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!v", name = "nb", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!v", name = "pb", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "[I")
    private int[] field1240;

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "[I")
    private int[] field1246;

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V", line = 7)
    public class68() {
        super(0, true);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 11)
    public final void method61(byte arg0) {
        this.method532(4096);
        if (arg0 == 4) {
            field1251++;
        }
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V", line = 22)
    public static void method528(int arg0) {
        if (arg0 < 110) {
            field1245 = (class186) null;
        }
        field1245 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)[I", line = 33)
    public final int[] method32(byte arg0, int arg1) {
        if (arg0 != -94) {
            method529(-40, 88);
        }
        int[] var3 = this.field403.method724((byte) -49, arg1);
        field1244++;
        if (this.field403.field1760) {
            int var4 = class150.field2509[arg1];
            if (this.field1247 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field1238; var6++) {
                    if (this.field1240[var6] <= var4 && var4 < this.field1240[var6 + 1]) {
                        if (this.field1246[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class234.method1625(var3, 0, class52.field1007, var5);
            } else {
                for (int var7 = 0; var7 < class52.field1007; var7++) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class315.field5345[var7];
                    int var11 = this.field1247;
                    if (var11 == 1) {
                        var8 = var10;
                    } else if (var11 == 2) {
                        var8 = (var10 + var4 - 4096 >> 1) + 2048;
                    } else if (var11 == 3) {
                        var8 = (var10 - var4 >> 1) + 2048;
                    }
                    for (int var12 = 0; var12 < this.field1238; var12++) {
                        if (this.field1240[var12] <= var8 && var8 < this.field1240[var12 + 1]) {
                            if (this.field1246[var12] > var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)I", line = 150)
    public static final int method529(int arg0, int arg1) {
        field1243++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + arg0;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(II)I", line = 163)
    public static final int method530(int arg0, int arg1) {
        if (arg0 != 441739911) {
            method528(52);
        }
        field1237++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(II)Ln;", line = 183)
    public static final class274 method531(int arg0, int arg1) {
        if (arg1 != 32767) {
            return (class274) null;
        }
        field1248++;
        class274 var2 = (class274) class290.field4846.method984(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class29.field624.method1651(1, arg0, -1);
        } else {
            var3 = class162.field2696.method1651(1, arg0 & 0x7FFF, -1);
        }
        class274 var4 = new class274();
        if (var3 != null) {
            var4.method1908(12101, new class26(var3));
        }
        if (arg0 >= 32768) {
            var4.method1898((byte) -32);
        }
        class290.field4846.method982(var4, (long) arg0, (byte) 79);
        return var4;
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "(I)V", line = 214)
    private final void method532(int arg0) {
        this.field1240 = new int[this.field1238 + 1];
        int var2 = 0;
        field1250++;
        this.field1246 = new int[this.field1238 + 1];
        int var3 = arg0 / this.field1238;
        int var4 = this.field1242 * var3 >> 12;
        for (int var5 = 0; var5 < this.field1238; var5++) {
            this.field1240[var5] = var2;
            this.field1246[var5] = var2 + var4;
            var2 += var3;
        }
        this.field1240[this.field1238] = 4096;
        this.field1246[this.field1238] = this.field1246[0] + 4096;
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(II)V", line = 244)
    public static final void method533(int arg0, int arg1) {
        field1241++;
        class255.field4252--;
        if (class255.field4252 == arg1) {
            return;
        }
        class234.method1623(class246.field4079, arg1 + 1, class246.field4079, arg1, class255.field4252 - arg1);
        class234.method1623(class3.field37, arg1 + 1, class3.field37, arg1, class255.field4252 - arg1);
        class234.method1628(class288.field4832, arg1 + 1, class288.field4832, arg1, class255.field4252 - arg1);
        if (arg0 != 8422) {
            method534(-24, 53, -111, -57, 49, -107, 65);
        }
        class234.method1629(class50.field958, arg1 + 1, class50.field958, arg1, class255.field4252 - arg1);
        class234.method1624(class159.field2652, arg1 + 1, class159.field2652, arg1, class255.field4252 - arg1);
        class234.method1624(class197.field3169, arg1 + 1, class197.field3169, arg1, class255.field4252 - arg1);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILsd;)V", line = 276)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg0 == 0) {
            this.field1238 = arg2.method226(255);
        } else if (arg0 == 1) {
            this.field1242 = arg2.method197(-1);
        } else if (arg0 == 2) {
            this.field1247 = arg2.method226(arg1 ^ 0xFF);
        }
        field1254++;
        if (arg1 != 0) {
            field1245 = (class186) null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIII)I", line = 317)
    public static final int method534(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg3 & 0x1) == 1) {
            int var7 = arg5;
            arg5 = arg0;
            arg0 = var7;
        }
        int var8 = -39 % ((arg2 + 21) / 43);
        int var9 = arg1 & 0x3;
        field1239++;
        if (var9 == 0) {
            return arg4;
        } else if (var9 == 1) {
            return 7 - arg6 - (arg5 + -1);
        } else if (var9 == 2) {
            return 1 + 7 - arg0 - arg4;
        } else {
            return arg6;
        }
    }
}
