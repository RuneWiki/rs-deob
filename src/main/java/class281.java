import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class281 extends class240 {

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "I")
    private int field4830 = 0;

    @OriginalMember(owner = "client!gm", name = "Z", descriptor = "I")
    private int field4841 = 4096;

    @OriginalMember(owner = "client!gm", name = "S", descriptor = "Lcd;")
    public static class64 field4834 = class44.method335((byte) 71, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!gm", name = "T", descriptor = "I")
    public static int field4835 = 0;

    @OriginalMember(owner = "client!gm", name = "V", descriptor = "I")
    public static int field4837 = 0;

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!gm", name = "Q", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!gm", name = "R", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!gm", name = "U", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!gm", name = "W", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!gm", name = "X", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!gm", name = "Y", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(IIII)I", line = 19)
    public static final int method1941(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 - 1 & arg3;
        field4839++;
        int var5 = arg3 / arg1;
        int var6 = arg2 / arg1;
        int var7 = arg1 - 1 & arg2;
        int var8 = class280.method1940(var5, var6, 98);
        int var9 = class280.method1940(var5 + 1, var6, arg0 ^ 0x6D);
        int var10 = class280.method1940(var5, var6 + 1, arg0 + 126);
        if (arg0 != 0) {
            field4837 = 97;
        }
        int var11 = class280.method1940(var5 + 1, var6 - -1, 99);
        int var12 = class314.method2175(arg1, var8, var9, arg0 ^ 0x10000, var4);
        int var13 = class314.method2175(arg1, var10, var11, 65536, var4);
        return class314.method2175(arg1, var12, var13, arg0 ^ 0x10000, var7);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILgk;II)V", line = 52)
    public static final void method1942(int arg0, int arg1, class6 arg2, int arg3, int arg4) {
        if (arg1 != -6475) {
            return;
        }
        field4831++;
        if (class220.field3736 >= 400) {
            return;
        }
        if (arg2.field144 != null) {
            arg2 = arg2.method66(0);
        }
        if (arg2 == null || !arg2.field133) {
            return;
        }
        class64 var5 = arg2.field161;
        if (arg2.field131 != 0) {
            var5 = class104.method768(new class64[] { var5, class236.method1687(class139.field2472.field659, arg1 + 36879, arg2.field131), class240.field4102, class31.field523, class310.method2149(arg2.field131, (byte) -25), class259.field4469 }, false);
        }
        if (class77.field1453 == 1) {
            class248.method1792(class104.method768(new class64[] { class32.field534, class165.field2893, var5 }, false), arg0, arg3, (byte) 121, (long) arg4, (short) 16, class213.field3588);
            class266.field4572++;
        } else if (!class42.field690) {
            class60.field1139++;
            class64[] var6 = arg2.field115;
            if (class220.field3719) {
                var6 = class269.method1885((byte) 26, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class172.field2971 != 0 || !var6[var7].method515(-64, class106.field1959))) {
                        class246.field4295++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 14;
                        }
                        if (var7 == 1) {
                            var8 = 44;
                        }
                        if (var7 == 2) {
                            var8 = 41;
                        }
                        if (var7 == 3) {
                            var8 = 51;
                        }
                        if (var7 == 4) {
                            var8 = 26;
                        }
                        class248.method1792(class104.method768(new class64[] { class295.field5071, var5 }, false), arg0, arg3, (byte) 122, (long) arg4, var8, var6[var7]);
                    }
                }
            }
            if (class172.field2971 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method515(-64, class106.field1959)) {
                        class313.field5308++;
                        short var10 = 0;
                        short var11 = 0;
                        if (arg2.field131 > class139.field2472.field659) {
                            var10 = 2000;
                        }
                        if (var9 == 0) {
                            var11 = 14;
                        }
                        if (var9 == 1) {
                            var11 = 44;
                        }
                        if (var9 == 2) {
                            var11 = 41;
                        }
                        if (var9 == 3) {
                            var11 = 51;
                        }
                        if (var9 == 4) {
                            var11 = 26;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class248.method1792(class104.method768(new class64[] { class295.field5071, var5 }, false), arg0, arg3, (byte) 124, (long) arg4, var11, var6[var9]);
                    }
                }
            }
            class248.method1792(class104.method768(new class64[] { class295.field5071, var5 }, false), arg0, arg3, (byte) -63, (long) arg4, (short) 1005, class107.field1983);
        } else if ((class164.field2883 & 0x2) == 2) {
            class65.field1304++;
            class248.method1792(class104.method768(new class64[] { class103.field1891, class165.field2893, var5 }, false), arg0, arg3, (byte) 123, (long) arg4, (short) 48, class43.field708);
        }
    }

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "(I)V", line = 204)
    public static void method1943(int arg0) {
        if (arg0 != 1) {
            field4834 = (class64) null;
        }
        field4834 = null;
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V", line = 219)
    public class281() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IILkh;)V", line = 239)
    public final void method16(int arg0, int arg1, class13 arg2) {
        if (arg1 == 0) {
            this.field4830 = arg2.method112((byte) 92);
        } else if (arg1 == 1) {
            this.field4841 = arg2.method112((byte) 92);
        } else if (arg1 == 2) {
            this.field4113 = arg2.method152((byte) -116) == 1;
        }
        if (arg0 != 2) {
            this.method286((byte) 88, 17);
        }
        field4838++;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BI)[[I", line = 273)
    public final int[][] method286(byte arg0, int arg1) {
        field4833++;
        int[][] var3 = this.field4095.method1797(arg1, -58);
        if (arg0 <= 34) {
            field4834 = (class64) null;
        }
        if (this.field4095.field4355) {
            int[][] var4 = this.method1746(7, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class169.field2936; var11++) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 < this.field4830) {
                    var9[var11] = this.field4830;
                } else if (var12 <= this.field4841) {
                    var9[var11] = var12;
                } else {
                    var9[var11] = this.field4841;
                }
                if (var14 < this.field4830) {
                    var8[var11] = this.field4830;
                } else if (var14 <= this.field4841) {
                    var8[var11] = var14;
                } else {
                    var8[var11] = this.field4841;
                }
                if (this.field4830 > var13) {
                    var10[var11] = this.field4830;
                } else if (var13 > this.field4841) {
                    var10[var11] = this.field4841;
                } else {
                    var10[var11] = var13;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(II)Lia;", line = 355)
    public static final class199 method1944(int arg0, int arg1) {
        field4836++;
        class199 var2 = (class199) class76.field1432.method1194((long) arg0, (byte) -67);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class216.field3625.method1580(arg1, class141.method1003(arg1 ^ 0x7F, arg0), class113.method811(arg0, 56));
        class199 var4 = new class199();
        if (var3 != null) {
            var4.method1395(true, new class13(var3));
        }
        var4.method1390((byte) -16);
        class76.field1432.method1190(12669, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(II)[I", line = 388)
    public final int[] method12(int arg0, int arg1) {
        field4840++;
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            int[] var4 = this.method1745(arg1, 0, (byte) 108);
            for (int var5 = 0; var5 < class169.field2936; var5++) {
                int var6 = var4[var5];
                if (this.field4830 > var6) {
                    var3[var5] = this.field4830;
                } else if (this.field4841 >= var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field4841;
                }
            }
        }
        if (arg0 != 64) {
            method1946(-120, -53, 9);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 430)
    public static final void method1945(int arg0, Component arg1) {
        arg1.removeKeyListener(class29.field477);
        if (arg0 == -7058) {
            field4832++;
            arg1.removeFocusListener(class29.field477);
            class276.field4746 = -1;
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(III)Z", line = 443)
    public static final boolean method1946(int arg0, int arg1, int arg2) {
        int var3 = class106.field1957[arg0][arg1][arg2];
        if (-class226.field3837 == var3) {
            return false;
        } else if (class226.field3837 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class164.method1178(var4 + 1, class96.field1764[arg0][arg1][arg2], var5 + 1) && class164.method1178(var4 + 128 - 1, class96.field1764[arg0][arg1 + 1][arg2], var5 + 1) && class164.method1178(var4 + 128 - 1, class96.field1764[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class164.method1178(var4 + 1, class96.field1764[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class106.field1957[arg0][arg1][arg2] = class226.field3837;
                return true;
            } else {
                class106.field1957[arg0][arg1][arg2] = -class226.field3837;
                return false;
            }
        }
    }
}
