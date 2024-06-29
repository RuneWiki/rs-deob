import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class232 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "Lli;")
    public static class185 field4171 = class245.method1649(" est d-Bj-9 dans votre liste noire)3", -109);

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "[I")
    public static int[] field4177;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[[[I")
    public static int[][][] field4176;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "[[[I")
    public static int[][][] field4179;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILuc;ILjava/awt/Component;I)Lni;")
    public static final class20 method1587(int arg0, class160 arg1, int arg2, Component arg3, int arg4) {
        if (arg0 != -30600) {
            field4171 = null;
        }
        field4181++;
        if (class271.field4813 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class20 var5 = (class20) Class.forName("pe").getDeclaredConstructor().newInstance();
                var5.field349 = arg4;
                var5.field312 = new int[(class131.field2349 ? 2 : 1) * 256];
                var5.method142(arg3);
                var5.field338 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field338 > 16384) {
                    var5.field338 = 16384;
                }
                var5.method134(var5.field338);
                if (class52.field904 > 0 && class48.field785 == null) {
                    class48.field785 = new class23();
                    class48.field785.field380 = arg1;
                    arg1.method1152(class48.field785, (byte) -47, class52.field904);
                }
                if (class48.field785 != null) {
                    if (class48.field785.field386[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class48.field785.field386[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class51 var6 = new class51(arg1, arg2);
                    var6.field312 = new int[(class131.field2349 ? 2 : 1) * 256];
                    var6.field349 = arg4;
                    var6.method142(arg3);
                    var6.field338 = 16384;
                    var6.method134(var6.field338);
                    if (class52.field904 > 0 && class48.field785 == null) {
                        class48.field785 = new class23();
                        class48.field785.field380 = arg1;
                        arg1.method1152(class48.field785, (byte) -47, class52.field904);
                    }
                    if (class48.field785 != null) {
                        if (class48.field785.field386[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class48.field785.field386[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class20();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Lle;")
    public static final class207 method1588(int arg0, int arg1) {
        field4175++;
        class207 var2 = (class207) class280.field4959.method1615(-28166, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class187.field3465.method1688(0, 0, arg1);
        if (var3 == null) {
            return null;
        }
        class207 var4 = new class207();
        class118 var5 = new class118(var3);
        var5.field2155 = var5.field2115.length - 2;
        int var6 = var5.method827(255);
        int var7 = var5.field2115.length - var6 - 2 - 12;
        var5.field2155 = var7;
        int var8 = var5.method875((byte) 121);
        var4.field3790 = var5.method827(255);
        var4.field3792 = var5.method827(255);
        var4.field3791 = var5.method827(255);
        var4.field3806 = var5.method827(255);
        int var9 = var5.method867(false);
        if (arg0 > -94) {
            method1590(-54);
        }
        if (var9 > 0) {
            var4.field3811 = new class31[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method827(255);
                class31 var12 = new class31(class82.method540(false, var11));
                var4.field3811[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method875((byte) 58);
                    int var14 = var5.method875((byte) 77);
                    var12.method190(new class13(var14), (byte) -84, (long) var13);
                }
            }
        }
        var5.field2155 = 0;
        var4.field3798 = var5.method860(26950);
        var4.field3804 = new class185[var8];
        var4.field3813 = new int[var8];
        var4.field3795 = new int[var8];
        int var15 = 0;
        while (var7 > var5.field2155) {
            int var16 = var5.method827(255);
            if (var16 == 3) {
                var4.field3804[var15] = var5.method865(9199);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field3795[var15] = var5.method867(false);
            } else {
                var4.field3795[var15] = var5.method875((byte) 15);
            }
            var4.field3813[var15++] = var16;
        }
        class280.field4959.method1620(var4, (byte) 49, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static final void method1589(int arg0) {
        class123.field2231 = null;
        class220.field4015 = null;
        if (arg0 != -12) {
            field4171 = null;
        }
        class123.field2232 = null;
        class50.field824 = null;
        class132.field2372 = null;
        field4180++;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static void method1590(int arg0) {
        field4171 = null;
        field4176 = null;
        if (arg0 != 5785) {
            field4172 = -20;
        }
        field4177 = null;
        field4179 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZ)V")
    public static final void method1591(int arg0, boolean arg1) {
        class125.method907((byte) -21);
        field4182++;
        if (class80.field1399 != 30 && class80.field1399 != 25) {
            return;
        }
        class134.field2452++;
        if (class134.field2452 < 50 && !arg1) {
            return;
        }
        if (arg0 <= 59) {
            method1591(-99, false);
        }
        class134.field2452 = 0;
        if (!class80.field1403 && class125.field2252 != null) {
            class142.field2714++;
            class182.field3349.method577(19, 0);
            try {
                class125.field2252.method995(class182.field3349.field2115, 0, -82, class182.field3349.field2155);
                class182.field3349.field2155 = 0;
            } catch (IOException var2) {
                class80.field1403 = true;
            }
        }
        class125.method907((byte) -21);
    }
}
