import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class100 {

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public int field1459 = -1;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public int field1464 = -1;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "Z")
    public static volatile boolean field1456 = true;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field1458 = 0;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1463 = "Loaded defaults";

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "Lpk;")
    public static class237 field1465;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "[I")
    public int[] field1462;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)V")
    public static final void method731(int arg0, int arg1, int arg2, int arg3) {
        field1452++;
        class105 var4 = class9.method72(9, -1, arg2);
        if (arg3 != 16082) {
            field1456 = true;
        }
        var4.method763(false);
        var4.field1553 = arg0;
        var4.field1545 = arg1;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIILul;B)Z")
    public static final boolean method732(int arg0, int arg1, int arg2, int arg3, int arg4, class188 arg5, byte arg6) {
        field1457++;
        class232 var7 = class167.method1134(-1, arg5.field2776);
        if (var7.field3590 == -1) {
            return true;
        } else if (arg6 > -21) {
            return true;
        } else {
            int var8;
            if (arg5.field2758) {
                int var9 = arg5.field2798 + arg0;
                var8 = var9 & 0x3;
            } else {
                var8 = 0;
            }
            class46 var10 = var7.method1577(79, arg5.field2729, var8);
            if (var10 == null) {
                return false;
            }
            int var11 = arg5.field2757;
            int var12 = arg5.field2805;
            if ((var8 & 0x1) == 1) {
                var12 = arg5.field2757;
                var11 = arg5.field2805;
            }
            int var13 = var10.field3549;
            int var14 = var10.field3537;
            if (var7.field3587) {
                var14 = var12 * 4;
                var13 = var11 * 4;
            }
            if (var7.field3588 == 0) {
                var10.method359(arg3 * 4 + 48, (-arg4 + 104 + -var12) * 4 + 48, var13, var14);
            } else {
                var10.method367((arg3 * 4) + 48, (104 - arg4 - var12) * 4 + 48, var13, var14, var7.field3588);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lgf;B)V")
    public static final void method733(class26 arg0, byte arg1) {
        field1455++;
        class176.field2585 = 3;
        class206.method1362((byte) -117, true);
        class249.field3869 = true;
        class244.field3785 = true;
        class112.field1719 = 127;
        class233.field3602 = 2;
        class109.field1628 = true;
        class188.field2789 = 255;
        class17.field312 = true;
        class127.field1867 = true;
        class10.field145 = true;
        class241.field3755 = true;
        class134.field1967 = true;
        class194.field2934 = 127;
        class162.field2350 = 0;
        class161 var2 = null;
        class25.field431 = true;
        client.field715 = 0;
        class126.field1856 = true;
        class145.field2097 = 0;
        class54.field879 = true;
        class49.field811 = 0;
        if (class155.field2270 >= 96) {
            class31.method214(2);
        } else {
            class31.method214(0);
        }
        class249.field3862 = 0;
        class170.field2503 = false;
        class117.field1767 = false;
        class131.field1939 = false;
        class23.field376 = true;
        class124.field1840 = 0;
        class142.field2039 = 0;
        try {
            class40 var3 = arg0.method183((byte) 106, "runescape");
            while (var3.field713 == 0) {
                client.method323(1L, -114);
            }
            if (var3.field713 == 1) {
                var2 = (class161) var3.field709;
                byte[] var4 = new byte[(int) var2.method1089((byte) -119)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1086(-1, var5, var4, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class227.method1556(-7, new class54(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1087(-105);
            }
            if (arg1 < 35) {
                method737(-62, (class237) null);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IILca;)V")
    public final void method734(int arg0, int arg1, class54 arg2) {
        field1466++;
        while (true) {
            int var4 = arg2.method407(255);
            if (var4 == 0) {
                if (arg1 > -93) {
                    field1463 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method735(0, arg2, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILca;II)V")
    private final void method735(int arg0, class54 arg1, int arg2, int arg3) {
        field1460++;
        if (arg2 == 1) {
            this.field1459 = arg1.method423(arg0 + 110);
        } else if (arg2 == 2) {
            this.field1462 = new int[arg1.method407(arg0 + 255)];
            for (int var5 = 0; var5 < this.field1462.length; var5++) {
                this.field1462[var5] = arg1.method423(-111);
            }
        } else if (arg2 == 3) {
            this.field1464 = arg1.method407(arg0 ^ 0xFF);
        }
        if (arg0 != 0) {
            this.field1462 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static void method736(int arg0) {
        if (arg0 == 2) {
            field1465 = null;
            field1463 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILpk;)V")
    public static final void method737(int arg0, class237 arg1) {
        field1454++;
        class51.field837 = arg1;
        class235.field3617 = class51.field837.method1614(arg0, 4);
    }
}
