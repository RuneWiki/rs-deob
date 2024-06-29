import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class107 extends class659 {

    @OriginalMember(owner = "client!sga", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field1414 = new String[] { method1021(method1020("\u0019=r\u000e\"B")), method1021(method1020("\u0019=r\u000e.B")), method1021(method1020("\u0019=r\u000e&B")), method1021(method1020("\u0019=r\u000e!B")), method1021(method1020("\u0019=r\u000e#B")), method1021(method1020("\u0019=r\u000e%B")), method1021(method1020("9\u000fQ")), method1021(method1020("\u0004/\u007fL")), method1021(method1020("\u0011t=\u000e\u001a")), method1021(method1020("\u0019=r\u000e$B")) };

    @OriginalMember(owner = "client!sga", name = "r", descriptor = "Lvs;")
    public static class470 field1412 = new class470();

    @OriginalMember(owner = "client!sga", name = "y", descriptor = "F")
    private float field1399;

    @OriginalMember(owner = "client!sga", name = "B", descriptor = "F")
    private float field1402;

    @OriginalMember(owner = "client!sga", name = "t", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client!sga", name = "D", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!sga", name = "s", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!sga", name = "w", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!sga", name = "z", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "client!sga", name = "C", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!sga", name = "x", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!sga", name = "v", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!sga", name = "A", descriptor = "Ljava/lang/String;")
    private String field1404;

    @OriginalMember(owner = "client!sga", name = "p", descriptor = "Ljava/lang/String;")
    private String field1406;

    @OriginalMember(owner = "client!sga", name = "u", descriptor = "Ljava/lang/String;")
    private String field1411;

    @OriginalMember(owner = "client!sga", name = "q", descriptor = "[Ls;")
    public static class751[] field1413;

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "(B)Ljava/lang/String;", line = 7)
    public final String method1015(byte arg0) {
        try {
            ++field1401;
            if (arg0 != -68) {
                this.method879((byte) 78);
            }
            return this.field1411;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1414[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "(B)Ljava/lang/String;", line = 18)
    public final String method1016(byte arg0) {
        try {
            int var2 = 85 / ((arg0 - -71) / 47);
            ++field1405;
            return this.field1406;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1414[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILjagtheora/ogg/OggPacket;)V", line = 30)
    public final void method884(int arg0, OggPacket arg1) {
        try {
            ++field1408;
            if (super.field9332 <= 0 || field1414[6].equals(this.field1404)) {
                class711 var3 = new class711(arg1.getData());
                int var4 = var3.method5128(arg0 + 9313);
                if (~super.field9332 >= -9) {
                    if ((128 | var4) == 0) {
                        throw new IllegalStateException();
                    }
                    if (~super.field9332 == -1) {
                        var3.field9945 += 23;
                        this.field1400 = var3.method5148(false);
                        this.field1407 = var3.method5148(false);
                        if (this.field1400 == 0 || ~this.field1407 == -1) {
                            throw new IllegalStateException();
                        }
                        class711 var12 = new class711(16);
                        var3.method5117(16, 0, var12.field9996, -128);
                        this.field1406 = var12.method5144(-16414);
                        var12.field9945 = 0;
                        var3.method5117(16, 0, var12.field9996, 48);
                        this.field1404 = var12.method5144(-16414);
                    }
                } else {
                    if (var4 == 0) {
                        long var5 = var3.method5137(-128);
                        long var7 = var3.method5137(103);
                        long var9 = var3.method5137(arg0 + 9350);
                        if (~var5 > -1L || ~var7 > -1L || ~var9 > -1L || ~var5 > ~var9) {
                            throw new IllegalStateException();
                        }
                        this.field1399 = (float) ((var5 + var7) * (long) this.field1407) / (float) this.field1400;
                        this.field1402 = (float) ((long) this.field1407 * var5) / (float) this.field1400;
                        int var11 = var3.method5148(false);
                        if (var11 < 0 || var3.field9996.length - var3.field9945 < var11) {
                            throw new IllegalStateException();
                        }
                        this.field1411 = class216.method1826(var3.field9996, var11, (byte) -86, var3.field9945);
                    }
                    if ((128 | var4) != 0) {
                        return;
                    }
                }
                if (arg0 != -9313) {
                    field1412 = null;
                }
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field1414[9] + arg0 + ',' + (arg1 != null ? field1414[8] : field1414[7]) + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "(B)V", line = 104)
    public static void method1017(byte arg0) {
        try {
            field1412 = null;
            field1413 = null;
            int var1 = -45 % ((21 - arg0) / 44);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1414[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Z)F", line = 115)
    public final float method1018(boolean arg0) {
        try {
            ++field1403;
            if (!arg0) {
                this.field1402 = 1.4913077F;
            }
            return this.field1402;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1414[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(Z)F", line = 126)
    public final float method1019(boolean arg0) {
        try {
            ++field1409;
            return !arg0 ? -0.8232425F : this.field1399;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1414[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)V", line = 138)
    public final void method879(byte arg0) {
        try {
            ++field1410;
            if (arg0 != 41) {
                this.field1402 = -0.20433696F;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1414[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 153)
    public class107(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1020(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 103);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1021(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 106;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 32;
                    break;
                default:
                    var10005 = 103;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
