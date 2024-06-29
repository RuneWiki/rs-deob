import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class75 extends class444 {

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "Lmd;")
    public static class323 field986;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "Ltj;")
    public static class108 field983;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "Lwe;")
    public class233 field989;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "[B")
    public byte[] field990;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "[[B")
    public static byte[][] field991;

    static {
        new class349("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field986 = class154.method1146(126);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)[B", line = 9)
    public final byte[] method448(int arg0) {
        ++field988;
        if (super.field6348) {
            throw new RuntimeException();
        } else {
            return arg0 != 17484 ? null : this.field990;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V", line = 29)
    public static final void method449(int arg0) {
        int var1 = 38 % ((arg0 - -59) / 60);
        ++field987;
        if (!class189.field2710) {
            class56.field744 = true;
            class189.field2710 = true;
            if (!class24.field304) {
                class198.field2835 += (12.0F - class198.field2835) / 2.0F;
            } else {
                class241.field3553 = (float) ((int) class241.field3553 - -47 & -16);
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBII)Lhk;", line = 54)
    public static final class54 method450(int arg0, byte arg1, int arg2, int arg3) {
        ++field984;
        int var4 = arg2 << 8 | arg3;
        class54 var5 = (class54) class308.field4476.method1972((long) var4 << 16, 0);
        if (var5 != null) {
            return var5;
        } else {
            byte[] var6 = class311.field4563.method645((byte) 80, class311.field4563.method637(118, var4));
            if (var6 != null) {
                if (~var6.length >= -2) {
                    return null;
                } else {
                    class54 var7 = class200.method1413(-101, var6);
                    var7.field702 = arg3;
                    class308.field4476.method1975(var7, (long) var4 << 16, false);
                    return var7;
                }
            } else {
                int var8 = arg0 - -65536 << 8 | arg3;
                class54 var9 = (class54) class308.field4476.method1972((long) var8 << 16, 0);
                if (var9 != null) {
                    return var9;
                } else {
                    byte[] var10 = class311.field4563.method645((byte) 80, class311.field4563.method637(115, var8));
                    if (var10 != null) {
                        if (var10.length <= 1) {
                            return null;
                        } else {
                            class54 var11 = class200.method1413(-101, var10);
                            var11.field702 = arg3;
                            class308.field4476.method1975(var11, (long) var8 << 16, false);
                            return var11;
                        }
                    } else {
                        int var12 = arg3 | 16776960;
                        class54 var13 = (class54) class308.field4476.method1972((long) var12 << 16, 0);
                        if (var13 != null) {
                            return var13;
                        } else {
                            int var14 = 30 / ((-55 - arg1) / 46);
                            byte[] var15 = class311.field4563.method645((byte) 80, class311.field4563.method637(109, var12));
                            if (var15 != null) {
                                if (~var15.length >= -2) {
                                    return null;
                                } else {
                                    class54 var16 = class200.method1413(-101, var15);
                                    var16.field702 = arg3;
                                    class308.field4476.method1975(var16, (long) var12 << 16, false);
                                    return var16;
                                }
                            } else {
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)V", line = 129)
    public static final void method451(byte arg0) {
        class25.field311.method102((byte) -106);
        ++field981;
        class109.field1413.method102((byte) -75);
        class40.field548.method102((byte) -104);
        if (arg0 == -93) {
            class53.field686.method102((byte) -105);
            class295.field4267.method102((byte) -94);
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V", line = 144)
    public static void method452(int arg0) {
        if (arg0 != 0) {
            field991 = null;
        }
        field991 = null;
        field986 = null;
        field983 = null;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(Z)I", line = 156)
    public final int method453(boolean arg0) {
        ++field982;
        if (!arg0) {
            method449(91);
        }
        return super.field6348 ? 0 : 100;
    }
}
