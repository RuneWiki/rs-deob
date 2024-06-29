import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class357 extends class426 {

    @OriginalMember(owner = "client!jn", name = "N", descriptor = "B")
    public static byte field5255;

    @OriginalMember(owner = "client!jn", name = "K", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!jn", name = "L", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!jn", name = "M", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!jn", name = "T", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!jn", name = "U", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!jn", name = "V", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!jn", name = "W", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!jn", name = "X", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!jn", name = "bb", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!jn", name = "cb", descriptor = "I")
    public static int field5269;

    @OriginalMember(owner = "client!jn", name = "Y", descriptor = "Liq;")
    public static class134 field5265;

    @OriginalMember(owner = "client!jn", name = "Z", descriptor = "Liq;")
    public static class134 field5266;

    @OriginalMember(owner = "client!jn", name = "R", descriptor = "Ljava/lang/String;")
    public String field5258;

    @OriginalMember(owner = "client!jn", name = "Q", descriptor = "[C")
    public char[] field5257;

    @OriginalMember(owner = "client!jn", name = "S", descriptor = "[C")
    public char[] field5259;

    @OriginalMember(owner = "client!jn", name = "P", descriptor = "[I")
    public int[] field5256;

    @OriginalMember(owner = "client!jn", name = "ab", descriptor = "[I")
    public int[] field5267;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "(I)V")
    public final void method2139(int arg0) {
        field5254++;
        if (arg0 <= 102) {
            return;
        }
        if (this.field5256 != null) {
            for (int var2 = 0; var2 < this.field5256.length; var2++) {
                this.field5256[var2] = class276.method1712(this.field5256[var2], 32768);
            }
        }
        if (this.field5267 != null) {
            for (int var3 = 0; var3 < this.field5267.length; var3++) {
                this.field5267[var3] = class276.method1712(this.field5267[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZC)I")
    public final int method2140(boolean arg0, char arg1) {
        field5269++;
        if (this.field5267 == null) {
            return -1;
        }
        if (!arg0) {
            method2143(-33);
        }
        for (int var3 = 0; var3 < this.field5267.length; var3++) {
            if (this.field5257[var3] == arg1) {
                return this.field5267[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)V")
    public static final void method2141(int arg0, boolean arg1) {
        field5263++;
        if (!arg1) {
            field5266 = null;
        }
        class32 var2 = class136.method854(7, (byte) 105, arg0);
        var2.method192(-17451);
    }

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "(I)Lef;")
    public static final class385 method2142(int arg0) {
        field5268++;
        class385 var1 = new class385(38);
        var1.method2366(15, true);
        var1.method2366(class105.field1410, true);
        var1.method2366(class71.field935 ? 1 : 0, true);
        var1.method2366(class213.field3198 ? 1 : 0, true);
        var1.method2366(class345.field5157 ? 1 : 0, true);
        var1.method2366(class39.field477 ? 1 : 0, true);
        var1.method2366(0, true);
        var1.method2366(class424.field6237 ? 1 : 0, true);
        var1.method2366(class151.field2090 ? 1 : 0, true);
        var1.method2366(class52.field684 ? 1 : 0, true);
        var1.method2366(class97.field1334, true);
        var1.method2366(class451.field6650 ? 1 : 0, true);
        var1.method2366(class244.field3651 ? 1 : 0, true);
        var1.method2366(class431.field6332 ? 1 : 0, true);
        var1.method2366(class95.field1324, true);
        var1.method2366(class1.field12 ? 1 : 0, true);
        var1.method2366(class465.field6842, true);
        if (arg0 != 1) {
            field5266 = null;
        }
        var1.method2366(class438.field6450, true);
        var1.method2366(client.field6666, true);
        var1.method2377(class57.field767, -78);
        var1.method2377(class243.field3646, -84);
        var1.method2366(class390.method2405(arg0 - 13795), true);
        var1.method2381(class439.field6455, 0);
        var1.method2366(class376.field5479, true);
        var1.method2366(class121.field1597 ? 1 : 0, true);
        var1.method2366(class212.field3193 ? 1 : 0, true);
        var1.method2366(class109.field1445, true);
        var1.method2366(class289.field4391 ? 1 : 0, true);
        var1.method2366(class15.field188 ? 1 : 0, true);
        var1.method2366(class452.field6683, true);
        var1.method2366(class341.field5111 ? 1 : 0, true);
        var1.method2366(class14.field176, true);
        var1.method2366(class350.field5205, true);
        return var1;
    }

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "(I)V")
    public static final void method2143(int arg0) {
        class241 var1 = class80.field1055;
        synchronized (class80.field1055) {
            class80.field1055.method1482((byte) 109);
        }
        field5260++;
        if (arg0 != 0) {
            method2149((byte) 30);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILef;Z)V")
    private final void method2144(int arg0, class385 arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        field5262++;
        if (arg0 == 1) {
            this.field5258 = arg1.method2332(102);
        } else if (arg0 == 2) {
            int var4 = arg1.method2343(255);
            this.field5257 = new char[var4];
            this.field5267 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5267[var5] = arg1.method2323(-102);
                byte var6 = arg1.method2341((byte) 54);
                this.field5257[var5] = var6 == 0 ? 0 : class398.method2517(var6, (byte) -13);
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method2343(255);
            this.field5259 = new char[var7];
            this.field5256 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5256[var8] = arg1.method2323(-53);
                byte var9 = arg1.method2341((byte) 54);
                this.field5259[var8] = var9 == 0 ? 0 : class398.method2517(var9, (byte) 101);
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "(I)Z")
    public static final boolean method2145(int arg0) {
        if (arg0 != 1) {
            return true;
        }
        field5252++;
        if (class120.field1585) {
            try {
                class232.method1404(class79.field1043.field3583, arg0 + 111, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(Lef;I)V")
    public final void method2146(class385 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2343(255);
            if (var3 == 0) {
                field5253++;
                if (arg1 <= 29) {
                    method2143(-111);
                    return;
                }
                return;
            }
            this.method2144(var3, arg0, false);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BC)I")
    public final int method2147(byte arg0, char arg1) {
        field5264++;
        if (this.field5256 == null) {
            return -1;
        }
        if (arg0 >= -20) {
            field5255 = -21;
        }
        for (int var3 = 0; var3 < this.field5256.length; var3++) {
            if (this.field5259[var3] == arg1) {
                return this.field5256[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BI)I")
    public static final int method2148(byte arg0, int arg1) {
        field5261++;
        int var2 = -23 / ((-arg0 - 17) / 49);
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "(B)V")
    public static void method2149(byte arg0) {
        field5265 = null;
        if (arg0 == -66) {
            field5266 = null;
        }
    }
}
