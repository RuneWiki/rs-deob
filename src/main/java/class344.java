import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class344 {

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "Ljf;")
    public static class119 field5061 = null;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field5057 = 0;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "S")
    public static short field5062 = 1;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "[I")
    public static int[] field5064 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "B")
    public byte field5056;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
    public int field5059;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "Ljava/lang/String;")
    public String field5054;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "Ljava/lang/String;")
    public String field5055;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "Ljava/lang/String;")
    public String field5058;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "[Lkh;")
    public static class11[] field5066;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BI)Z")
    public static final boolean method2202(byte arg0, int arg1) {
        int var2 = 19 % ((-arg0 - 18) / 32);
        field5063++;
        if (class45.field542[arg1]) {
            return true;
        } else if (class172.field2401.method339(arg1, false)) {
            int var3 = class172.field2401.method352(arg1, (byte) -75);
            if (var3 == 0) {
                class45.field542[arg1] = true;
                return true;
            }
            if (class224.field3054[arg1] == null) {
                class224.field3054[arg1] = new class119[var3];
            }
            for (int var4 = 0; var4 < var3; var4++) {
                if (class224.field3054[arg1][var4] == null) {
                    byte[] var5 = class172.field2401.method361(arg1, 116, var4);
                    if (var5 != null) {
                        class119 var6 = class224.field3054[arg1][var4] = new class119();
                        var6.field1424 = (arg1 << 16) + var4;
                        if (var5[0] == -1) {
                            var6.method681(-117, new class211(var5));
                        } else {
                            var6.method668(new class211(var5), -66);
                        }
                    }
                }
            }
            class45.field542[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
    public static void method2203(byte arg0) {
        field5066 = null;
        field5061 = null;
        int var1 = -30 / ((arg0 - 54) / 34);
        field5064 = null;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(JB)V")
    public static final void method2204(long arg0, byte arg1) {
        field5065++;
        int var3 = class51.field591 + class390.field5715.field1304;
        int var4 = class393.field5742 + class390.field5715.field1311;
        if ((class297.field4241 - var3) < -500 || (class297.field4241 - var3) > 500 || class10.field113 - var4 < -500 || class10.field113 - var4 > 500) {
            class10.field113 = var4;
            class297.field4241 = var3;
        }
        if (class297.field4241 != var3) {
            int var5 = var3 - class297.field4241;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class297.field4241 += var6;
        }
        if (class10.field113 != var4) {
            int var7 = var4 - class10.field113;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class10.field113 += var8;
        }
        if (arg1 <= 108) {
            return;
        }
        if (!class291.field4173) {
            class276.field3893 += (float) arg0 * class8.field107 / 6.0F;
            class135.field1886 += (float) arg0 * class102.field1155 / 6.0F;
        }
        class324.method1998((byte) 116);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Len;Lng;I)I")
    public static final int method2205(class174 arg0, class190 arg1, int arg2) {
        field5067++;
        int var3 = -12 % ((arg2 - 89) / 37);
        if (arg1.field2581 != -1) {
            return arg1.field2581;
        }
        if (arg1.field2584 != -1) {
            class311 var4 = class225.field3070.method371(arg0.method996() ? arg1.field2584 : arg1.field2592, (byte) 96);
            if (!var4.field4436) {
                return var4.field4451;
            }
        }
        return arg1.field2596;
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V")
    public static final void method2206(byte arg0) {
        field5068++;
        if (arg0 > -69) {
            field5066 = null;
        }
        if (class378.field5553 != 3) {
            class23.field229 = -1;
        }
    }
}
