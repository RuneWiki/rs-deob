import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class176 {

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
    public int field2611;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    public int field2603;

    @OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
    public int field2612;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
    public int field2607;

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "Lqp;")
    public static class466 field2610 = new class466("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!kv", name = "k", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!kv", name = "l", descriptor = "Ljf;")
    public static class144 field2614;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method1133(int arg0, String arg1) {
        field2604++;
        int var2 = arg1.length();
        long var3 = (long) arg0;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg1.charAt(var5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZIIII)V")
    public static final void method1134(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg1) {
            return;
        }
        if (arg2 >= class424.field6204 && class76.field1021 >= arg4 && class417.field6057 <= arg3 && arg5 <= class224.field3193) {
            class508.method3045(arg0, arg2, arg4, arg5, arg3, (byte) 26);
        } else {
            class357.method2137(arg0, arg4, arg2, (byte) 44, arg3, arg5);
        }
        field2608++;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(III)Lvr;")
    public static final class90 method1135(int arg0, int arg1, int arg2) {
        class486 var3 = class89.field1305[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7114;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
    public static void method1136(byte arg0) {
        field2610 = null;
        field2614 = null;
        if (arg0 > -115) {
            method1136((byte) 0);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)Lkv;")
    public final class176 method1137(int arg0, int arg1) {
        field2613++;
        return arg0 < 55 ? null : new class176(this.field2612, arg1, this.field2607, this.field2611);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V")
    public static final void method1138(boolean arg0) {
        if (arg0) {
            return;
        }
        field2605++;
        for (class12 var1 = (class12) class438.field6435.method2818((byte) -63); var1 != null; var1 = (class12) class438.field6435.method2820((byte) -58)) {
            if (var1.field188 > 0) {
                var1.field188--;
            }
            if (var1.field188 != 0) {
                if (var1.field185 > 0) {
                    var1.field185--;
                }
                if (var1.field185 == 0 && var1.field190 >= 1 && var1.field191 >= 1 && class527.field7799 - 2 >= var1.field190 && var1.field191 <= class422.field6182 - 2 && (var1.field179 < 0 || class361.method2172(var1.field179, -106, var1.field184))) {
                    class333.method1915(var1.field189, var1.field179, var1.field190, -1, var1.field191, var1.field175, var1.field187, (byte) 124, var1.field184);
                    var1.field185 = -1;
                    if (var1.field193 == var1.field179 && var1.field193 == -1) {
                        var1.method1565(0);
                    } else if (var1.field193 == var1.field179 && var1.field178 == var1.field175 && var1.field186 == var1.field184) {
                        var1.method1565(0);
                    }
                }
            } else if (var1.field193 < 0 || class361.method2172(var1.field193, -123, var1.field186)) {
                class333.method1915(var1.field189, var1.field193, var1.field190, -1, var1.field191, var1.field178, var1.field187, (byte) -122, var1.field186);
                var1.method1565(0);
            }
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(BLol;II)Leh;")
    public static final class242 method1139(byte arg0, class187 arg1, int arg2, int arg3) {
        field2609++;
        int var4 = arg1.field2708 | arg2 << 8;
        class242 var5 = (class242) class106.field1592.method3117((long) var4 << 16, 56);
        if (var5 != null) {
            return var5;
        }
        if (arg0 >= -84) {
            field2614 = null;
        }
        byte[] var6 = class481.field7022.method742(class481.field7022.method733(var4, true), 1);
        if (var6 == null) {
            int var8 = arg1.field2708 | arg3 + 65536 << 8;
            class242 var9 = (class242) class106.field1592.method3117((long) var8 << 16, 94);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class481.field7022.method742(class481.field7022.method733(var8, true), 1);
            if (var10 == null) {
                int var12 = arg1.field2708 | 0xFFFF00;
                class242 var13 = (class242) class106.field1592.method3117((long) var12 << 16, 67);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class481.field7022.method742(class481.field7022.method733(var12, true), 1);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class242 var15 = class265.method1589(var14, 3);
                    var15.field3379 = arg1;
                    class106.field1592.method3113(var15, (byte) -47, (long) var12 << 16);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class242 var11 = class265.method1589(var10, 3);
                var11.field3379 = arg1;
                class106.field1592.method3113(var11, (byte) -47, (long) var8 << 16);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class242 var7 = class265.method1589(var6, 3);
            var7.field3379 = arg1;
            class106.field1592.method3113(var7, (byte) -47, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(IIII)V")
    public class176(int arg0, int arg1, int arg2, int arg3) {
        this.field2611 = arg3;
        this.field2603 = arg1;
        this.field2612 = arg0;
        this.field2607 = arg2;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IZI)V")
    public static final void method1140(int arg0, boolean arg1, int arg2) {
        field2606++;
        if (arg1) {
            method1133(75, null);
        }
        class97 var3 = class348.method2064(arg0, 12, -77);
        var3.method712((byte) -86);
        var3.field1468 = arg2;
    }
}
