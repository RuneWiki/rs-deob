import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class133 extends class301 {

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "[Ln;")
    public class315[] field2291;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "Z")
    public static boolean field2281 = false;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    public static int field2289 = 0;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "[Z")
    public static boolean[] field2284 = new boolean[8];

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "Z")
    public static boolean field2290 = true;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    public static int field2279;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "[I")
    public static int[] field2277;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "[Lbn;")
    public static class75[] field2280;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)Lvm;", line = 6)
    public static final class88 method934(int arg0, byte arg1) {
        int var2 = 0 % ((arg1 - 74) / 38);
        field2283++;
        class88 var3 = (class88) class223.field3687.method893((long) arg0, 82);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class16.field475.method1404(class111.method832((byte) 124, arg0), class277.method1966(127, arg0), (byte) -71);
        class88 var5 = new class88();
        var5.field1557 = arg0;
        if (var4 != null) {
            var5.method682(73, new class146(var4));
        }
        var5.method670(0);
        class223.field3687.method888((long) arg0, var5, 89);
        return var5;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V", line = 30)
    public static final void method935(byte arg0) {
        if (class191.field3233 != null) {
            class134 var1 = new class134();
            for (int var2 = 0; var2 < 13; var2++) {
                for (int var3 = 0; var3 < 13; var3++) {
                    class191.field3233[var2][var3] = var1;
                }
            }
        }
        if (arg0 <= 62) {
            field2281 = false;
        }
        field2279++;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)Z", line = 65)
    public final boolean method936(int arg0, int arg1) {
        field2286++;
        return arg0 == 21603 ? this.field2291[arg1].field5123 : false;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)V", line = 83)
    public static void method937(byte arg0) {
        field2280 = null;
        field2277 = null;
        field2284 = null;
        if (arg0 <= 73) {
            method940(-69, 126);
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(IBI)V", line = 104)
    public static final void method938(int arg0, byte arg1, int arg2) {
        field2292++;
        class217.field3612 = class191.field3233[arg2][arg0].field2295;
        class190.field3223 = class191.field3233[arg2][arg0].field2300;
        class79.field1406 = class191.field3233[arg2][arg0].field2305;
        if (arg1 <= 2) {
            field2293 = -44;
        }
        class259.method1814((float) class217.field3612, (float) class190.field3223, (float) class79.field1406);
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(II)Z", line = 124)
    public final boolean method939(int arg0, int arg1) {
        if (arg1 < 103) {
            this.field2291 = (class315[]) null;
        }
        field2282++;
        return this.field2291[arg0].field5125;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(II)Lng;", line = 141)
    public static final class182 method940(int arg0, int arg1) {
        field2288++;
        if (arg0 == 0) {
            return new class285();
        } else if (arg0 == 1) {
            return new class56();
        } else if (arg0 == 2) {
            return new class18();
        } else if (arg0 == 3) {
            return new class207();
        } else if (arg0 == 4) {
            return new class57();
        } else if (arg0 == 5) {
            return new class171();
        } else if (arg0 == 6) {
            return new class180();
        } else if (arg0 == 7) {
            return new class12();
        } else if (arg0 == 8) {
            return new class284();
        } else if (arg0 == 9) {
            return new class277();
        } else if (arg0 == 10) {
            return new class233();
        } else if (arg0 == 11) {
            return new class342();
        } else if (arg0 == 12) {
            return new class55();
        } else if (arg0 == 13) {
            return new class21();
        } else if (arg0 == 14) {
            return new class87();
        } else if (arg0 == 15) {
            return new class41();
        } else if (arg0 == 16) {
            return new class139();
        } else if (arg0 == 17) {
            return new class119();
        } else if (arg0 == 18) {
            return new class137();
        } else if (arg0 == 19) {
            return new class309();
        } else if (arg0 == 20) {
            return new class140();
        } else if (arg0 == 21) {
            return new class235();
        } else if (arg0 == 22) {
            return new class72();
        } else if (arg0 == 23) {
            return new class73();
        } else if (arg0 == 24) {
            return new class155();
        } else if (arg0 == 25) {
            return new class85();
        } else if (arg0 == 26) {
            return new class188();
        } else if (arg0 == 27) {
            return new class92();
        } else if (arg0 == 28) {
            return new class359();
        } else if (arg0 == 29) {
            return new class112();
        } else if (arg0 == 30) {
            return new class71();
        } else if (arg0 == 31) {
            return new class204();
        } else if (arg0 == 32) {
            return new class143();
        } else if (arg0 == 33) {
            return new class293();
        } else if (arg0 == 34) {
            return new class317();
        } else if (arg0 == 35) {
            return new class231();
        } else if (arg0 == 36) {
            return new class54();
        } else if (arg0 == 37) {
            return new class15();
        } else if (arg0 == 38) {
            return new class208();
        } else if (arg0 == 39) {
            return new class197();
        } else if (arg1 < 89) {
            return (class182) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)Lsc;", line = 460)
    public static final class288 method941(boolean arg0) {
        field2285++;
        byte[] var1 = class309.field5053[0];
        int var2 = class9.field284[0] * class76.field1367[0];
        int[] var3 = new int[var2];
        if (!arg0) {
            return (class288) null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class323.field5225[class83.method613(var1[var4], 255)];
        }
        class288 var5 = new class288(class91.field1617, class12.field368, class321.field5218[0], class232.field3804[0], class9.field284[0], class76.field1367[0], var3);
        class213.method1470(false);
        return var5;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lek;Lek;IZ)V", line = 485)
    public class133(class206 arg0, class206 arg1, int arg2, boolean arg3) {
        class49 var5 = new class49();
        int var6 = arg0.method1417(true, arg2);
        this.field2291 = new class315[var6];
        int[] var7 = arg0.method1413(arg2, (byte) -119);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class276 var9 = null;
            byte[] var10 = arg0.method1404(arg2, var7[var8], (byte) -102);
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            for (class276 var12 = (class276) var5.method431(0); var12 != null; var12 = (class276) var5.method439(-28512)) {
                if (var12.field4498 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1426(var11, 0, (byte) -94);
                } else {
                    var13 = arg1.method1426(0, var11, (byte) -85);
                }
                var9 = new class276(var11, var13);
                var5.method437(var9, (byte) 51);
            }
            this.field2291[var7[var8]] = new class315(var10, var9);
        }
    }
}
