import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class262 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "[B")
    private byte[] field3640;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field3652;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field3655;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field3670;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "Ldu;")
    private class360 field3661;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field3656 = 0;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "Lei;")
    private class179 field3663;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "Lsc;")
    private class352 field3667;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "Llb;")
    private class543 field3645;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Ljava/lang/String;")
    private String field3641;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Z")
    private boolean field3642;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Z")
    private boolean field3648;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Z")
    private boolean field3650;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Z")
    private boolean field3658;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method1582(int arg0) {
        if (arg0 != 0) {
            return false;
        }
        field3666++;
        if (this.field3650 || this.field3658) {
            return this.field3667 == null || this.field3667.method2108((byte) -122) <= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 25)
    private final void method1583(int arg0) {
        field3644++;
        for (class370 var2 = (class370) this.field3661.method2144(true); var2 != null; var2 = (class370) this.field3661.method2146(false)) {
            if (this.field3663 != var2) {
                while (var2.field5157.packetOut() == 1) {
                    var2.method2175(this.field3670, 127);
                }
            }
        }
        if (this.field3663 == null) {
            return;
        }
        for (int var3 = 0; var3 < 10 && this.method1592(-111); var3++) {
            if (this.field3663.field5157.packetOut() != 1) {
                this.method1589(16383);
                return;
            }
            this.field3663.method2175(this.field3670, 104);
        }
        if (arg0 >= -109) {
            this.method1595(false);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Llb;", line = 69)
    public final class543 method1584(byte arg0) {
        if (arg0 != 6) {
            this.field3667 = null;
        }
        field3660++;
        return this.field3645;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V", line = 83)
    private final void method1585(int arg0) {
        field3646++;
        int var2 = 32 / ((arg0 + 4) / 35);
        for (class370 var3 = (class370) this.field3661.method2144(true); var3 != null; var3 = (class370) this.field3661.method2146(false)) {
            if (var3 instanceof class543) {
                class543 var4 = (class543) var3;
                while ((var4.field5162 <= 8 || this.method1595(false) > (double) var4.method3040(0)) && var4.field5157.packetOut(this.field3670) == 1) {
                    var4.method2175(this.field3670, 112);
                }
            }
        }
        this.method1597((byte) 103, this.field3641);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V", line = 119)
    private final void method1586(byte arg0) throws IOException {
        if (arg0 <= 120) {
            this.field3642 = false;
        }
        field3659++;
        while (this.field3663.field5157.packetOut(this.field3670) != 1) {
            class370 var2 = this.method1593((byte) 126);
            if (var2 == null) {
                if (this.field3658) {
                    this.method1583(-114);
                }
                return;
            }
            if (this.field3645 == var2) {
                this.method1585(77);
            }
        }
        this.field3663.method2175(this.field3670, 120);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lvfa;BIILrc;Ljava/lang/String;IIIILda;Laa;)V", line = 158)
    public static final void method1587(class672 arg0, byte arg1, int arg2, int arg3, class539 arg4, String arg5, int arg6, int arg7, int arg8, int arg9, class60 arg10, class490 arg11) {
        field3649++;
        int var12;
        if (class278.field3898 == 4) {
            var12 = (int) class547.field7230 & 0x3FFF;
        } else {
            var12 = (int) class547.field7230 + class649.field8626 & 0x3FFF;
        }
        int var13 = Math.max(arg0.field9287 / 2, arg0.field9178 / 2) + 10;
        if (arg1 > -43) {
            method1587(null, (byte) 65, -121, 106, null, null, -30, 104, -80, -3, null, null);
        }
        int var14 = arg2 * arg2 + arg8 * arg8;
        if ((var13 * var13) < var14) {
            return;
        }
        int var15 = class451.field6174[var12];
        int var16 = class451.field6177[var12];
        if (class278.field3898 != 4) {
            var15 = var15 * 256 / (class260.field3629 + 256);
            var16 = var16 * 256 / (class260.field3629 + 256);
        }
        int var17 = arg2 * var15 + arg8 * var16 >> 14;
        int var18 = arg2 * var16 - (arg8 * var15) >> 14;
        int var19 = arg4.method3003(arg5, -127, null, 100);
        int var20 = arg4.method2998(-1, arg5, 100, null, 0);
        int var21 = var17 - var19 / 2;
        if (-arg0.field9287 <= var21 && arg0.field9287 >= var21 && var18 >= (-arg0.field9178) && arg0.field9178 >= var18) {
            arg10.method528(arg6 - var18 - (-(arg0.field9178 / 2) - (-arg9 + -var20)), 0, arg11, arg5, arg6, null, arg3, arg0.field9287 / 2 + (var21 + arg7), 50, 0, 0, 0, null, arg7, 1, var19);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V", line = 207)
    public static final void method1588(int arg0, int arg1, int arg2) {
        field3651++;
        if (arg1 != 2) {
            method1587(null, (byte) 30, -112, 45, null, null, -125, 6, -115, -50, null, null);
        }
        if (class30.field479 == 1) {
            class75.method608(false, arg0, arg2, class348.field4895);
        } else if (class30.field479 == 2) {
            if (class24.field412) {
                class540.method3014(arg2 + class367.method2167(-2), 5966, arg0 + class672.method3717((byte) -26));
            } else {
                class540.method3014(arg2, 5966, arg0);
            }
        }
        class348.field4895 = null;
        class30.field479 = 0;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V", line = 233)
    public final void method1589(int arg0) {
        field3664++;
        if (this.field3650) {
            return;
        }
        for (class370 var2 = (class370) this.field3661.method2144(true); var2 != null; var2 = (class370) this.field3661.method2146(false)) {
            var2.method1226((byte) -98);
            var2.field5157.method4006();
        }
        this.field3670.method4006();
        this.field3655.method4006();
        this.field3652.method4006();
        if (arg0 == 16383) {
            this.field3650 = true;
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)Lei;", line = 263)
    public final class179 method1590(byte arg0) {
        field3671++;
        return arg0 > -50 ? null : this.field3663;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V", line = 274)
    public final void method1591(boolean arg0, int arg1) {
        if (this.field3667 != null) {
            class421 var3 = this.field3667.method2109((byte) 81);
            if (var3 != null) {
                var3.method2438((byte) 113, arg0);
            }
        }
        if (arg1 <= -74) {
            field3657++;
            this.field3642 = !this.field3642;
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)Z", line = 295)
    private final boolean method1592(int arg0) {
        int var2 = -40 / ((arg0 + 57) / 53);
        field3653++;
        if (this.field3667 == null) {
            double var3 = (double) this.field3663.method1237((byte) -19);
            return var3 == 0.0D || (double) class375.method2193(116) >= 1000.0D / var3 + (double) this.field3663.method1244(0);
        } else {
            return !this.field3663.method1243((byte) -45) || this.method1595(false) > this.field3663.method1238((byte) -121);
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)Lbc;", line = 317)
    private final class370 method1593(byte arg0) throws IOException {
        field3669++;
        if (this.field3650) {
            throw new IllegalStateException();
        } else if (this.field3658) {
            return null;
        } else {
            while (this.field3652.pageOut(this.field3655) <= 0) {
                int var10 = this.method1360(this.field3640, 2);
                if (var10 == -1) {
                    this.field3658 = true;
                    return null;
                }
                if (var10 == 0) {
                    return null;
                }
                if (!this.field3652.write(this.field3640, var10)) {
                    throw new RuntimeException("");
                }
            }
            int var2 = this.field3655.getSerialNumber();
            if (arg0 <= 124) {
                this.method1585(82);
            }
            if (!this.field3655.isBOS()) {
                class370 var9 = (class370) this.field3661.method2135((long) var2, (byte) 31);
                if (!var9.field5157.pageIn(this.field3655)) {
                    throw new IllegalStateException();
                }
                return var9;
            }
            OggStreamState var3 = new OggStreamState(var2);
            if (!var3.pageIn(this.field3655)) {
                throw new IllegalStateException();
            } else if (var3.packetPeek(this.field3670) == 1) {
                class370 var4;
                if (this.field3663 == null && this.field3670.isTheora()) {
                    this.field3663 = new class179(var3);
                    var4 = this.field3663;
                } else if (this.field3667 == null && this.field3670.isVorbis()) {
                    this.field3667 = new class352(var3);
                    var4 = this.field3667;
                } else {
                    byte[] var5 = this.field3670.getData();
                    StringBuffer var6 = new StringBuffer();
                    for (int var7 = 1; var5.length > var7 && Character.isLetterOrDigit((char) var5[var7]); var7++) {
                        var6.append((char) var5[var7]);
                    }
                    String var8 = var6.toString();
                    if (var8.equals("kate")) {
                        var4 = new class543(var3);
                    } else {
                        var4 = new class175(var3);
                    }
                }
                this.field3661.method2143(-1, var4, (long) var2);
                return var4;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)Lsc;", line = 438)
    public final class352 method1594(int arg0) {
        field3668++;
        int var2 = -98 / ((arg0 + 71) / 55);
        return this.field3667;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)D", line = 450)
    public final double method1595(boolean arg0) {
        field3662++;
        if (arg0) {
            return 0.6367509784599686D;
        } else if (this.field3667 == null) {
            return this.field3663 == null ? 0.0D : this.field3663.method1238((byte) -121);
        } else {
            return this.field3667.method2106(3);
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)V", line = 475)
    public final void method1596(byte arg0) throws IOException {
        field3665++;
        if (this.field3642) {
            return;
        }
        if (arg0 <= 111) {
            this.method1595(true);
        }
        while (!this.field3650) {
            class370 var2;
            if (this.field3648) {
                var2 = (class370) this.field3661.method2135((long) this.field3655.getSerialNumber(), (byte) 31);
            } else {
                var2 = this.method1593((byte) 126);
                if (var2 == null) {
                    if (this.field3658) {
                        this.method1583(-125);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field3648 = true;
            }
            if (this.field3667 == var2) {
                if (this.field3667.method2108((byte) 84) >= 50) {
                    return;
                }
                while (this.field3667.field5157.packetOut(this.field3670) == 1) {
                    this.field3667.method2175(this.field3670, 113);
                    this.method1585(-80);
                    if (this.field3663 != null) {
                        double var3 = this.field3663.method1238((byte) -121);
                        for (int var5 = 0; var5 < 10 && this.method1592(118); var5++) {
                            this.method1586((byte) 126);
                            if (this.field3650) {
                                return;
                            }
                        }
                        if (this.field3663.method1238((byte) -121) > var3) {
                            return;
                        }
                    }
                    if (this.field3667.method2108((byte) 86) >= 50) {
                        return;
                    }
                }
            } else if ((var2 instanceof class543)) {
                this.method1585(66);
            } else if (this.field3663 != var2) {
                while (var2.field5157.packetOut(this.field3670) == 1) {
                    if (var2.field5162 == 1 && var2 instanceof class543) {
                        this.method1597((byte) 124, this.field3641);
                    }
                    var2.method2175(this.field3670, 123);
                }
            } else if (this.field3667 == null && !this.field3642) {
                for (int var6 = 0; var6 < 10 && this.method1592(3); var6++) {
                    this.method1586((byte) 124);
                    if (this.field3650) {
                        return;
                    }
                }
                return;
            }
            this.field3648 = false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(I)V", line = 596)
    public class262(int arg0) {
        if (!class702.method3952(-121, "jagtheora")) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field3640 = new byte[arg0];
        this.field3652 = new OggSyncState();
        this.field3655 = new OggPage();
        this.field3670 = new OggPacket();
        this.field3661 = new class360(8);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLjava/lang/String;)V", line = 615)
    public final void method1597(byte arg0, String arg1) {
        this.field3641 = arg1;
        field3647++;
        if (this.field3641 == null) {
            this.field3645 = null;
            return;
        }
        if (arg0 < 45) {
            method1587(null, (byte) 100, -106, -16, null, null, 101, 91, 64, 33, null, null);
        }
        if (this.field3645 != null && !this.field3641.equals(this.field3645.method3043(false))) {
            this.field3645 = null;
        }
        if (this.field3645 != null) {
            return;
        }
        for (class370 var3 = (class370) this.field3661.method2144(true); var3 != null; var3 = (class370) this.field3661.method2146(false)) {
            if (var3 instanceof class543) {
                class543 var4 = (class543) var3;
                if (this.field3641.equals(var4.method3043(false))) {
                    this.field3645 = var4;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([BI)I")
    public abstract int method1360(byte[] arg0, int arg1) throws IOException;
}
