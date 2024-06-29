import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class278 extends class122 {

    @OriginalMember(owner = "client!sh", name = "Y", descriptor = "[B")
    public byte[] field4701;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "Lqd;")
    public static class40 field4690 = class147.method1106("floorshadows", (byte) -111);

    @OriginalMember(owner = "client!sh", name = "S", descriptor = "Lqd;")
    public static class40 field4695 = class147.method1106("::clientdrop", (byte) -52);

    @OriginalMember(owner = "client!sh", name = "W", descriptor = "Lqd;")
    public static class40 field4699 = class147.method1106("mapscene", (byte) -100);

    @OriginalMember(owner = "client!sh", name = "U", descriptor = "Lqd;")
    public static class40 field4697 = class147.method1106("Wordpack geladen)3", (byte) -46);

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!sh", name = "P", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!sh", name = "T", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!sh", name = "V", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!sh", name = "X", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!sh", name = "Q", descriptor = "[[I")
    public static int[][] field4693;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIIII)V", line = 9)
    public static final void method1944(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4696++;
        if (arg7 >= 1 && arg0 >= 1 && arg7 <= 102 && arg0 <= 102) {
            if (!class118.method893(2) && (class274.field4564[0][arg7][arg0] & 0x2) == 0) {
                int var8 = arg2;
                if ((class274.field4564[arg2][arg7][arg0] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class188.field3022 != var8) {
                    return;
                }
            }
            int var9 = arg2;
            if (arg2 < 3 && (class274.field4564[1][arg7][arg0] & 0x2) == 2) {
                var9 = arg2 + 1;
            }
            class17.method96((byte) 48, arg2, var9, arg4, class255.field4247[arg2], arg7, arg0);
            if (arg3 >= 0) {
                boolean var10 = class217.field3623;
                class217.field3623 = true;
                class58.method494(false, arg0, false, arg5, arg7, arg2, arg1, var9, class255.field4247[arg2], (byte) 68, arg3);
                class217.field3623 = var10;
            }
        }
        if (arg6 >= -71) {
            method1945(false, -61);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)V", line = 65)
    public static final void method1945(boolean arg0, int arg1) {
        field4694++;
        if ((class255.field4233.field1531 >> 7) == class185.field2985 && (class255.field4233.field1497 >> 7) == class170.field2794) {
            class185.field2985 = 0;
        }
        int var2 = class159.field2663;
        if (arg1 != -65) {
            method1946(true);
        }
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            long var4;
            class258 var6;
            if (arg0) {
                var4 = 8791798054912L;
                var6 = class255.field4233;
            } else {
                var6 = class298.field4979[class212.field3390[var3]];
                var4 = (long) class212.field3390[var3] << 32;
            }
            if (var6 != null && var6.method386(~arg1)) {
                var6.field4324 = false;
                int var7 = var6.field1531 >> 7;
                if ((class250.field4144 && class159.field2663 > 200 || class159.field2663 > 50) && !arg0 && var6.field1533 == var6.field1514) {
                    var6.field4324 = true;
                }
                int var8 = var6.field1497 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field4305 == null || var6.field4313 > class256.field4266 || var6.field4304 <= class256.field4266) {
                        if (var6.method666(24207) == 1 && (var6.field1531 & 0x7F) == 64 && (var6.field1497 & 0x7F) == 64) {
                            if (class206.field3282[var7][var8] == class55.field1069) {
                                continue;
                            }
                            class206.field3282[var7][var8] = class55.field1069;
                        }
                        var6.field1539 = class293.method2012(class160.field2671, var6.field1497, arg1 ^ 0xFFFFFFBF, var6.field1531);
                        class208.method1470(class160.field2671, var6.field1531, var6.field1497, var6.field1539, var6.method666(24207) * 64 - 4, var6, var6.field1507, var4, var6.field1530);
                    } else {
                        var6.field4324 = false;
                        var6.field1539 = class293.method2012(class160.field2671, var6.field1497, 0, var6.field1531);
                        class39.method323(class160.field2671, var6.field1531, var6.field1497, var6.field1539, var6, var6.field1507, var4, var6.field4295, var6.field4302, var6.field4321, var6.field4311);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V", line = 152)
    public static final void method1946(boolean arg0) {
        if (class306.field5135 != null) {
            class95 var1 = class306.field5135;
            synchronized (class306.field5135) {
                class306.field5135 = null;
            }
        }
        if (arg0) {
            method1945(false, 6);
        }
        field4700++;
    }

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "(I)V", line = 189)
    public static final void method1947(int arg0) {
        field4698++;
        if (~class54.field1062 == arg0) {
            class54.field1062 = 6;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)V", line = 203)
    public static void method1948(boolean arg0) {
        if (!arg0) {
            field4699 = (class40) null;
        }
        field4699 = null;
        field4697 = null;
        field4693 = (int[][]) null;
        field4690 = null;
        field4695 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZ)V", line = 230)
    public static final void method1949(int arg0, boolean arg1) {
        class194.method1385(arg0 ^ 0xFFFFFFC9);
        field4692++;
        if (class6.field87 != 30 && class6.field87 != 25) {
            return;
        }
        class177.field2917++;
        if (~class177.field2917 > arg0 && !arg1) {
            return;
        }
        class177.field2917 = 0;
        if (!class225.field3727 && class140.field2369 != null) {
            class19.field295.method1464(190, 0);
            try {
                class140.field2369.method779(class19.field295.field478, 16333, 0, class19.field295.field472);
                class19.field295.field478 = 0;
            } catch (IOException var3) {
                class225.field3727 = true;
            }
            class243.field4006++;
        }
        class194.method1385(4);
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "([B)V", line = 258)
    public class278(byte[] arg0) {
        this.field4701 = arg0;
    }
}
