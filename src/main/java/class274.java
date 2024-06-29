import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class274 {

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4205 = "Examine";

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lhb;")
    public static class318 field4203 = new class318(50);

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public int field4195;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public int field4196;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    private int field4209;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Lgl;")
    public static class262 field4200;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "Ljd;")
    public static class92 field4208;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Z")
    public static boolean field4207;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lre;IIB)V", line = 7)
    private final void method1929(class263 arg0, int arg1, int arg2, byte arg3) {
        int var5 = -113 / ((arg3 - 54) / 35);
        field4198++;
        if (arg1 == 1) {
            this.field4209 = arg0.method1830((byte) -77);
        } else if (arg1 == 2) {
            this.field4195 = arg0.method1787(false);
            this.field4196 = arg0.method1787(false);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 31)
    public static final void method1930(String arg0, boolean arg1, int arg2) {
        field4197++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = class84.field1247.method625(arg0, 250);
        int var6 = var3 + 6;
        int var7 = class84.field1247.method613(arg0, 250) * 13;
        if (class117.field1817) {
            class308.method2126(var6 - var3, -var3 + var4, var3 + var5 + var3, var3 + var7 - -var3, 0);
            class308.method2128(var6 - var3, -var3 + var4, var3 + var5 + var3, var3 + var7 + var3, 16777215);
        } else {
            class46.method312(var6 - var3, -var3 + var4, var5 + var3 + var3, var3 + var7 + var3, 0);
            class46.method318(var6 - var3, -var3 + var4, var3 + var3 + var5, var3 + var7 + var3, 16777215);
        }
        class84.field1247.method614(arg0, var6, var4, var5, var7, 16777215, -1, arg2, 1, 0);
        class252.method1704(var4 - var3, false, var6 - var3, var7 - (-var3 - var3), var3 + var5 + var3);
        if (!arg1) {
            class162.method1147(var6, var5, var4, 5, var7);
        } else if (class117.field1817) {
            class117.method826();
        } else {
            try {
                Graphics var8 = class315.field4764.getGraphics();
                class171.field2574.method238(0, var8, 0, 0);
            } catch (Exception var10) {
                class315.field4764.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)V", line = 83)
    public static final void method1931(byte arg0, int arg1) {
        field4193++;
        class169 var2 = class101.method712(arg1, 4, 2089666400);
        int var3 = -120 / ((-arg0 - 59) / 54);
        var2.method1178((byte) 64);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)Lle;", line = 96)
    public final class127 method1932(byte arg0) {
        field4206++;
        class127 var2 = (class127) class97.field1460.method2180((long) this.field4209, (byte) 31);
        if (arg0 != -92) {
            field4207 = true;
        }
        if (var2 != null) {
            return var2;
        }
        class127 var3 = class91.method643(class94.field1425, (byte) -64, 0, this.field4209);
        if (var3 != null) {
            class97.field1460.method2175((long) this.field4209, var3, 110);
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 120)
    public static void method1933(int arg0) {
        field4203 = null;
        field4205 = null;
        if (arg0 != 29432) {
            method1933(69);
        }
        field4200 = null;
        field4208 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Ldf;", line = 135)
    public static final class168 method1934(int arg0, int arg1) {
        field4199++;
        class168 var2 = (class168) class73.field957.method2180((long) arg1, (byte) 31);
        if (var2 != null) {
            return var2;
        } else if (arg0 < 68) {
            return (class168) null;
        } else {
            byte[] var3 = class295.field4519.method1441(class161.method1140((byte) -56, arg1), (byte) -44, class233.method1604(arg1, 1));
            class168 var4 = new class168();
            if (var3 != null) {
                var4.method1173(99, new class263(var3));
            }
            class73.field957.method2175((long) arg1, var4, 102);
            return var4;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILre;I)V", line = 162)
    public final void method1935(int arg0, class263 arg1, int arg2) {
        if (arg0 != 16777215) {
            method1934(11, 67);
        }
        while (true) {
            int var4 = arg1.method1787(false);
            if (var4 == 0) {
                field4204++;
                return;
            }
            this.method1929(arg1, var4, arg2, (byte) -16);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIII)V", line = 195)
    public static final void method1936(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class223 var5 = (class223) class295.field4520.method1320((long) arg1, 13002);
        if (arg2 > -109) {
            field4205 = (String) null;
        }
        field4194++;
        if (var5 == null) {
            var5 = new class223();
            class295.field4520.method1319(117, (long) arg1, var5);
        }
        if (var5.field3398.length <= arg0) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field3398.length; var8++) {
                var6[var8] = var5.field3398[var8];
                var7[var8] = var5.field3395[var8];
            }
            for (int var9 = var5.field3398.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field3395 = var7;
            var5.field3398 = var6;
        }
        var5.field3398[arg0] = arg4;
        var5.field3395[arg0] = arg3;
    }
}
