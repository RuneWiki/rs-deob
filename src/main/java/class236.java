import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class236 extends class659 {

    @OriginalMember(owner = "client!bea", name = "y", descriptor = "I")
    private int field3148;

    @OriginalMember(owner = "client!bea", name = "t", descriptor = "Ljb;")
    public static class519 field3143 = new class519(13, 2);

    @OriginalMember(owner = "client!bea", name = "B", descriptor = "J")
    public static long field3151 = -1L;

    @OriginalMember(owner = "client!bea", name = "C", descriptor = "F")
    public static float field3152;

    @OriginalMember(owner = "client!bea", name = "u", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!bea", name = "v", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!bea", name = "w", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!bea", name = "x", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!bea", name = "z", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!bea", name = "A", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!bea", name = "D", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!bea", name = "r", descriptor = "[Lvg;")
    public class60[] field3141;

    @OriginalMember(owner = "client!bea", name = "s", descriptor = "[[B")
    private byte[][] field3142;

    @OriginalMember(owner = "client!bea", name = "d", descriptor = "(B)Z")
    public final boolean method1495(byte arg0) {
        field3153++;
        if (this.field3141 != null) {
            return true;
        }
        if (this.field3142 == null) {
            class172 var2 = class366.field5271;
            synchronized (class366.field5271) {
                if (!class366.field5271.method1158(this.field3148, (byte) 66)) {
                    return false;
                }
                int[] var4 = class366.field5271.method1182(this.field3148, (byte) 31);
                this.field3142 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field3142[var5] = class366.field5271.method1188(this.field3148, -18047, var4[var5]);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field3142.length; var7++) {
            byte[] var8 = this.field3142[var7];
            class254 var9 = new class254(var8);
            var9.field3725 = 1;
            int var10 = var9.method1728((byte) 119);
            class172 var11 = class638.field8601;
            synchronized (class638.field8601) {
                var6 &= class638.field8601.method1185(var10, 9330);
            }
        }
        if (!var6) {
            return false;
        }
        class84 var12 = new class84();
        class172 var13 = class366.field5271;
        int[] var16;
        synchronized (class366.field5271) {
            int var14 = class366.field5271.method1175(this.field3148, (byte) 99);
            if (arg0 >= -35) {
                return false;
            }
            this.field3141 = new class60[var14];
            var16 = class366.field5271.method1182(this.field3148, (byte) 31);
        }
        for (int var17 = 0; var17 < var16.length; var17++) {
            byte[] var18 = this.field3142[var17];
            class254 var19 = new class254(var18);
            var19.field3725 = 1;
            int var20 = var19.method1728((byte) 64);
            class226 var21 = null;
            for (class226 var22 = (class226) var12.method679((byte) -86); var22 != null; var22 = (class226) var12.method681(-19)) {
                if (var22.field2925 == var20) {
                    var21 = var22;
                    break;
                }
            }
            if (var21 == null) {
                class172 var23 = class638.field8601;
                synchronized (class638.field8601) {
                    var21 = new class226(var20, class638.field8601.method1176(var20, 75));
                }
                var12.method689(var21, -85);
            }
            this.field3141[var16[var17]] = new class60(var18, var21);
        }
        this.field3142 = null;
        return true;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)Z")
    public final boolean method1496(int arg0, int arg1) {
        if (arg1 != -3) {
            this.method1497(21, (byte) -14);
        }
        field3147++;
        return this.field3141[arg0].field773;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(IB)Z")
    public final boolean method1497(int arg0, byte arg1) {
        field3144++;
        int var3 = -55 % ((arg1 + 31) / 42);
        return this.field3141[arg0].field775;
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
    public static void method1498(int arg0) {
        field3143 = null;
        if (arg0 <= 36) {
            field3145 = 2;
        }
    }

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(BI)Z")
    public static final boolean method1499(byte arg0, int arg1) {
        if (arg0 < 53) {
            return true;
        } else {
            field3146++;
            return arg1 == 0 || arg1 == 1 || arg1 == 2;
        }
    }

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "(II)Z")
    public final boolean method1500(int arg0, int arg1) {
        field3150++;
        if (arg1 != -3) {
            this.method1500(-28, -104);
        }
        return this.field3141[arg0].field769;
    }

    @OriginalMember(owner = "client!bea", name = "e", descriptor = "(B)V")
    public static final void method1501(byte arg0) {
        field3149++;
        if (arg0 != -9) {
            field3151 = 51L;
        }
        for (class749 var1 = (class749) class397.field5692.method679((byte) -86); var1 != null; var1 = (class749) class397.field5692.method681(-91)) {
            class98 var2 = var1.field10087;
            if (class572.field7788 > var2.field1409) {
                var1.method1102((byte) 114);
                var2.method768(0);
            } else if (class572.field7788 >= var2.field1398) {
                var2.method775(true);
                if (var2.field1424 > 0) {
                    class316 var3 = (class316) class176.field2326.method1248(86, (long) (var2.field1424 - 1));
                    if (var3 != null) {
                        class22 var4 = var3.field4455;
                        if (var4.field2802 >= 0 && class102.field1467 * 512 > var4.field2802 && var4.field2810 >= 0 && (class393.field5663 * 512) > var4.field2810) {
                            var2.method778(var4.field2802, class778.method4273(var4.field2810, (byte) -54, var4.field2802, var2.field2813) - var2.field1412, class572.field7788, var4.field2810, 0);
                        }
                    }
                }
                if (var2.field1424 < 0) {
                    int var5 = -var2.field1424 - 1;
                    class758 var6;
                    if (class349.field5065 == var5) {
                        var6 = class625.field8475;
                    } else {
                        var6 = class84.field1204[var5];
                    }
                    if (var6 != null && var6.field2802 >= 0 && (class102.field1467 * 512) > var6.field2802 && var6.field2810 >= 0 && (class393.field5663 * 512) > var6.field2810) {
                        var2.method778(var6.field2802, class778.method4273(var6.field2810, (byte) -35, var6.field2802, var2.field2813) - var2.field1412, class572.field7788, var6.field2810, 0);
                    }
                }
                var2.method770((byte) -124, class643.field8659);
                class359.method2278(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(I)V")
    public class236(int arg0) {
        this.field3148 = arg0;
    }
}
