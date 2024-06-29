import java.awt.Frame;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class24 extends class355 {

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field314 = new CRC32();

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public static int field320 = -1;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "B")
    public byte field317;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public int field316;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "Lre;")
    public class446 field319;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLtq;)V", line = 8)
    public static final void method213(byte arg0, class63 arg1) {
        ++field318;
        if (!class486.field6828) {
            class142.method977(arg1, 108);
        } else {
            class302.method1880(-19151, arg1);
        }
        if (arg0 > -110) {
            field314 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lje;II)Ljava/lang/String;", line = 25)
    public static final String method214(class178 arg0, int arg1, int arg2) {
        ++field313;
        if (!client.method2777(arg0).method1208(arg2 ^ 197496199, arg1) && arg0.field2574 == null) {
            return null;
        } else if (arg0.field2587 != null && arg0.field2587.length > arg1 && arg0.field2587[arg1] != null && arg0.field2587[arg1].trim().length() != 0) {
            if (arg2 != -1402) {
                method213((byte) 57, (class63) null);
            }
            return arg0.field2587[arg1];
        } else {
            return class365.field5528 ? "Hidden-" + arg1 : null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)I", line = 50)
    public final int method138(int arg0) {
        ++field312;
        if (this.field319 == null) {
            return 0;
        } else {
            int var2 = -95 % ((53 - arg0) / 40);
            return this.field319.field6315 * 100 / (this.field319.field6316.length - this.field317);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lng;IIIBI)Ljava/awt/Frame;", line = 68)
    public static final Frame method215(class153 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field311;
        if (!arg0.method1034(false)) {
            return null;
        } else {
            if (arg1 == 0) {
                class426[] var6 = class295.method1852(arg0, 1467792898);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; var6.length > var8; ++var8) {
                    if (~var6[var8].field6085 == ~arg2 && ~var6[var8].field6088 == ~arg5 && (arg3 == 0 || ~var6[var8].field6086 == ~arg3) && (!var7 || var6[var8].field6089 > arg1)) {
                        arg1 = var6[var8].field6089;
                        var7 = true;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            class397 var9 = arg0.method1045(arg1, true, arg2, arg3, arg5);
            if (arg4 > -11) {
                field314 = null;
            }
            while (var9.field5822 == 0) {
                class325.method2005(true, 10L);
            }
            Frame var10 = (Frame) var9.field5823;
            if (var10 == null) {
                return null;
            } else if (var9.field5822 == 2) {
                class475.method2766(arg0, var10, (byte) 70);
                return null;
            } else {
                return var10;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)[B", line = 142)
    public final byte[] method133(int arg0) {
        ++field315;
        if (!super.field5386 && this.field319.field6316.length + -this.field317 <= this.field319.field6315) {
            if (arg0 != -1) {
                method213((byte) -111, (class63) null);
            }
            return this.field319.field6316;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "(I)V", line = 160)
    public static void method216(int arg0) {
        field314 = null;
        if (arg0 != -7525) {
            field314 = null;
        }
    }
}
