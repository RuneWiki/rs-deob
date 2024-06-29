import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class259 extends class65 {

    @OriginalMember(owner = "client!s", name = "z", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BIII)V")
    public final void method524(byte arg0, int arg1, int arg2, int arg3) {
        ++field3564;
        super.field994 = arg1;
        super.field1000 = arg2;
        if (arg0 == -116) {
            super.field998 = arg3;
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IIIIIF)V")
    public class259(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(FB)V")
    public final void method525(float arg0, byte arg1) {
        super.field987 = arg0;
        if (arg1 == -10) {
            ++field3562;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;B)V")
    public static final void method1586(Throwable arg0, String arg1, byte arg2) {
        ++field3567;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class541.method2985(arg0, (byte) 116);
            }
            if (arg2 != 8) {
                field3563 = -112;
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class201.method1317((byte) -118, var3);
            String var4 = class608.method3339(":", var3, "%3a", (byte) -56);
            String var5 = class608.method3339("@", var4, "%40", (byte) -56);
            String var6 = class608.method3339("&", var5, "%26", (byte) -56);
            String var7 = class608.method3339("#", var6, "%23", (byte) -56);
            if (class193.field2829 != null) {
                class192 var8 = class48.field694.method2894(new URL(class193.field2829.getCodeBase(), "clienterror.ws?c=" + class224.field3162 + "&u=" + class77.field1206 + "&v1=" + class519.field6928 + "&v2=" + class519.field6920 + "&e=" + var7), (byte) 51);
                while (var8.field2816 == 0) {
                    class486.method2722(arg2 + -8, 1L);
                }
                if (~var8.field2816 == -2) {
                    DataInputStream var9 = (DataInputStream) var8.field2820;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(JI)V")
    public static final void method1587(long arg0, int arg1) {
        ++field3561;
        int var3 = 73 / ((arg1 - 59) / 32);
        int var4 = class247.field3443;
        int var5 = class412.field5654;
        if (class193.field2827 != var4) {
            int var6 = -class193.field2827 + var4;
            int var7 = (int) ((long) var6 * arg0 / 320L);
            if (~var6 < -1) {
                if (var7 == 0) {
                    var7 = 1;
                } else if (~var7 < ~var6) {
                    var7 = var6;
                }
            } else if (var7 != 0) {
                if (var7 < var6) {
                    var7 = var6;
                }
            } else {
                var7 = -1;
            }
            class193.field2827 += var7;
        }
        if (class338.field4683 != var5) {
            int var8 = -class338.field4683 + var5;
            int var9 = (int) ((long) var8 * arg0 / 320L);
            if (~var8 < -1) {
                if (var9 == 0) {
                    var9 = 1;
                } else if (var8 < var9) {
                    var9 = var8;
                }
            } else if (~var9 == -1) {
                var9 = -1;
            } else if (var9 < var8) {
                var9 = var8;
            }
            class338.field4683 += var9;
        }
        if (!class344.field4718.field5425) {
            class463.field6263 += (float) arg0 * class344.field4710 / 40.0F * 8.0F;
            class42.field602 += (float) arg0 * class432.field5908 / 40.0F * 8.0F;
        }
        class680.method3794((byte) -55);
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(B)V")
    public static final void method1588(byte arg0) {
        ++field3565;
        int var1 = class664.field9426;
        int[] var2 = class55.field762;
        for (int var3 = 0; ~var3 > ~var1; ++var3) {
            class403 var9 = class572.field7601[var2[var3]];
            if (var9 != null && ~var9.field5599 < -1) {
                --var9.field5599;
                if (var9.field5599 == 0) {
                    var9.field5587 = null;
                }
            }
        }
        if (arg0 < 25) {
            field3563 = -31;
        }
        for (int var4 = 0; class92.field1396 > var4; ++var4) {
            long var5 = (long) class415.field5681[var4];
            class280 var7 = (class280) class616.field8143.method2918(var5, (byte) -128);
            if (var7 != null) {
                class287 var8 = var7.field3983;
                if (var8.field5599 > 0) {
                    --var8.field5599;
                    if (var8.field5599 == 0) {
                        var8.field5587 = null;
                    }
                }
            }
        }
    }
}
