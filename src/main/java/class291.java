import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public abstract class class291 {

    @OriginalMember(owner = "client!jfa", name = "r", descriptor = "[B")
    private byte[] field4082;

    @OriginalMember(owner = "client!jfa", name = "j", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field4074;

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field4068;

    @OriginalMember(owner = "client!jfa", name = "p", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field4080;

    @OriginalMember(owner = "client!jfa", name = "H", descriptor = "Leq;")
    private class213 field4098;

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "I")
    public static int field4071 = 4;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "Z")
    public static boolean field4066 = false;

    @OriginalMember(owner = "client!jfa", name = "G", descriptor = "F")
    public static float field4097;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!jfa", name = "h", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!jfa", name = "i", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!jfa", name = "k", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!jfa", name = "l", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!jfa", name = "m", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!jfa", name = "o", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!jfa", name = "q", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!jfa", name = "s", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!jfa", name = "t", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!jfa", name = "u", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!jfa", name = "w", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!jfa", name = "y", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!jfa", name = "z", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!jfa", name = "A", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!jfa", name = "B", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!jfa", name = "v", descriptor = "Lts;")
    private class535 field4086;

    @OriginalMember(owner = "client!jfa", name = "E", descriptor = "Ljm;")
    private class689 field4095;

    @OriginalMember(owner = "client!jfa", name = "x", descriptor = "Lnaa;")
    private class72 field4088;

    @OriginalMember(owner = "client!jfa", name = "F", descriptor = "Ljava/lang/String;")
    private String field4096;

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "Z")
    private boolean field4070;

    @OriginalMember(owner = "client!jfa", name = "n", descriptor = "Z")
    private boolean field4078;

    @OriginalMember(owner = "client!jfa", name = "C", descriptor = "Z")
    private boolean field4093;

    @OriginalMember(owner = "client!jfa", name = "D", descriptor = "Z")
    private boolean field4094;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V", line = 3)
    private final void method1898(int arg0) {
        if (arg0 != 1999) {
            this.field4082 = null;
        }
        field4069++;
        for (class734 var2 = (class734) this.field4098.method1469(0); var2 != null; var2 = (class734) this.field4098.method1467(0)) {
            if (var2 instanceof class535) {
                class535 var3 = (class535) var2;
                while ((var3.field9905 <= 8 || this.method1913(arg0 ^ 0x7B2) > (double) var3.method3081((byte) 97)) && var3.field9906.packetOut(this.field4080) == 1) {
                    var3.method4049(this.field4080, arg0 + 14385);
                }
            }
        }
        this.method1903(arg0 - 2012, this.field4096);
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)V", line = 41)
    private final void method1899(byte arg0) throws IOException {
        field4083++;
        while (this.field4088.field9906.packetOut(this.field4080) != 1) {
            class734 var2 = this.method1915(1);
            if (var2 == null) {
                if (this.field4078) {
                    this.method1905(-2);
                }
                return;
            }
            if (this.field4086 == var2) {
                this.method1898(1999);
            }
        }
        this.field4088.method4049(this.field4080, 16384);
        if (arg0 < 58) {
            this.field4068 = null;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Z)Lnaa;", line = 73)
    public final class72 method1900(boolean arg0) {
        field4089++;
        return arg0 ? null : this.field4088;
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(Z)Z", line = 86)
    private final boolean method1901(boolean arg0) {
        if (arg0) {
            this.method1905(-113);
        }
        field4073++;
        if (this.field4095 == null) {
            double var2 = (double) this.field4088.method691(0);
            return var2 == 0.0D || (double) class554.method3190(-74) >= 1000.0D / var2 + (double) this.field4088.method693(30);
        } else {
            return !this.field4088.method690(-1) || this.method1913(126) > this.field4088.method694((byte) 100);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)V", line = 109)
    public final void method1902(int arg0) {
        field4076++;
        if (this.field4094) {
            return;
        }
        class734 var2 = (class734) this.field4098.method1469(0);
        if (arg0 != 1) {
            this.field4078 = true;
        }
        while (var2 != null) {
            var2.method689((byte) 13);
            var2.field9906.method3950();
            var2 = (class734) this.field4098.method1467(arg0 ^ 0x1);
        }
        this.field4080.method3950();
        this.field4068.method3950();
        this.field4074.method3950();
        this.field4094 = true;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILjava/lang/String;)V", line = 137)
    public final void method1903(int arg0, String arg1) {
        field4067++;
        this.field4096 = arg1;
        if (this.field4096 == null) {
            this.field4086 = null;
            return;
        }
        if (arg0 > -4) {
            field4071 = -61;
        }
        if (this.field4086 != null && !this.field4096.equals(this.field4086.method3083(52))) {
            this.field4086 = null;
        }
        if (this.field4086 != null) {
            return;
        }
        for (class734 var3 = (class734) this.field4098.method1469(0); var3 != null; var3 = (class734) this.field4098.method1467(0)) {
            if (var3 instanceof class535) {
                class535 var4 = (class535) var3;
                if (this.field4096.equals(var4.method3083(41))) {
                    this.field4086 = var4;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(B)Z", line = 189)
    public final boolean method1904(byte arg0) {
        field4091++;
        int var2 = 65 / ((arg0 + 74) / 47);
        if (this.field4094 || this.field4078) {
            return this.field4095 == null || this.field4095.method3848(-11020) <= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "(I)V", line = 214)
    private final void method1905(int arg0) {
        field4090++;
        for (class734 var2 = (class734) this.field4098.method1469(0); var2 != null; var2 = (class734) this.field4098.method1467(arg0 + 2)) {
            if (this.field4088 != var2) {
                while (var2.field9906.packetOut() == 1) {
                    var2.method4049(this.field4080, arg0 ^ 0xFFFFBFFE);
                }
            }
        }
        if (this.field4088 == null) {
            return;
        }
        if (arg0 != -2) {
            method1912(null, (byte) 10);
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (!this.method1901(false)) {
                return;
            }
            if (this.field4088.field9906.packetOut() != 1) {
                this.method1902(1);
                return;
            }
            this.field4088.method4049(this.field4080, 16384);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "(I)Ljm;", line = 269)
    public final class689 method1906(int arg0) {
        if (arg0 != 0) {
            this.method1906(120);
        }
        field4092++;
        return this.field4095;
    }

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "(I)Lts;", line = 281)
    public final class535 method1907(int arg0) {
        field4065++;
        if (arg0 != 50) {
            this.field4095 = null;
        }
        return this.field4086;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(BZ)V", line = 295)
    public final void method1908(byte arg0, boolean arg1) {
        field4072++;
        if (this.field4095 != null) {
            class30 var3 = this.field4095.method3850(-96);
            if (var3 != null) {
                var3.method411(1, arg1);
            }
        }
        if (arg0 <= 114) {
            this.field4078 = true;
        }
        this.field4093 = !this.field4093;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIIIII)V", line = 316)
    public static final void method1909(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4077++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg4 * arg4;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = -27 / ((38 - arg5) / 62);
        int var13 = arg3 << 1;
        int var14 = (1 - var13) * var8 + var10;
        int var15 = var9 - ((var13 - 1) * var11);
        int var16 = var8 << 2;
        int var17 = var9 << 2;
        int var18 = ((var6 << 1) + 3) * var10;
        int var19 = ((arg3 << 1) - 3) * var11;
        int var20 = (var6 + 1) * var17;
        class47.method550(-27, arg1 + arg4, class691.field9345[arg2], arg1 - arg4, arg0);
        int var21 = (arg3 - 1) * var16;
        while (var7 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var15 += var20;
                    var14 += var18;
                    var6++;
                    var20 += var17;
                    var18 += var17;
                }
            }
            if (var15 < 0) {
                var15 += var20;
                var14 += var18;
                var6++;
                var20 += var17;
                var18 += var17;
            }
            var15 += -var19;
            var14 += -var21;
            var21 -= var16;
            var19 -= var16;
            var7--;
            int var22 = arg2 - var7;
            int var23 = arg2 + var7;
            int var24 = arg1 + var6;
            int var25 = arg1 - var6;
            class47.method550(-27, var24, class691.field9345[var22], var25, arg0);
            class47.method550(-27, var24, class691.field9345[var23], var25, arg0);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "(I)V", line = 402)
    public final void method1911(int arg0) throws IOException {
        if (arg0 != -2) {
            return;
        }
        field4075++;
        if (this.field4093) {
            return;
        }
        while (!this.field4094) {
            class734 var2;
            if (this.field4070) {
                var2 = (class734) this.field4098.method1465((long) this.field4068.getSerialNumber(), -6008);
            } else {
                var2 = this.method1915(1);
                if (var2 == null) {
                    if (this.field4078) {
                        this.method1905(arg0);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field4070 = true;
            }
            if (this.field4095 == var2) {
                if (this.field4095.method3848(-11020) >= 50) {
                    return;
                }
                while (this.field4095.field9906.packetOut(this.field4080) == 1) {
                    this.field4095.method4049(this.field4080, arg0 + 16386);
                    this.method1898(1999);
                    if (this.field4088 != null) {
                        double var3 = this.field4088.method694((byte) 100);
                        for (int var5 = 0; var5 < 10 && this.method1901(false); var5++) {
                            this.method1899((byte) 98);
                            if (this.field4094) {
                                return;
                            }
                        }
                        if (this.field4088.method694((byte) 100) > var3) {
                            return;
                        }
                    }
                    if (this.field4095.method3848(-11020) >= 50) {
                        return;
                    }
                }
            } else if ((var2 instanceof class535)) {
                this.method1898(1999);
            } else if (this.field4088 != var2) {
                while (var2.field9906.packetOut(this.field4080) == 1) {
                    if (var2.field9905 == 1 && var2 instanceof class535) {
                        this.method1903(-22, this.field4096);
                    }
                    var2.method4049(this.field4080, 16384);
                }
            } else if (this.field4095 == null && !this.field4093) {
                for (int var6 = 0; var6 < 10 && this.method1901(false); var6++) {
                    this.method1899((byte) 80);
                    if (this.field4094) {
                        return;
                    }
                }
                return;
            }
            this.field4070 = false;
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 519)
    public static final void method1912(String arg0, byte arg1) {
        System.exit(1);
        field4084++;
        int var2 = 97 % ((-arg1 - 66) / 54);
    }

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "(I)D", line = 535)
    public final double method1913(int arg0) {
        int var2 = 6 % ((arg0 - 89) / 35);
        field4079++;
        if (this.field4095 == null) {
            return this.field4088 == null ? 0.0D : this.field4088.method694((byte) 100);
        } else {
            return this.field4095.method3852((byte) 123);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lse;I)Z", line = 554)
    public static final boolean method1914(class258 arg0, int arg1) {
        field4087++;
        class99 var2 = class76.field1366.method1680(0, arg0.method589(-94));
        if (var2.field1710 == -1) {
            return true;
        } else {
            class754 var3 = class351.field4888.method1035((byte) 31, var2.field1710);
            return var3.field10526 == arg1 ? true : var3.method4207(106);
        }
    }

    @OriginalMember(owner = "client!jfa", name = "h", descriptor = "(I)Lau;", line = 574)
    private final class734 method1915(int arg0) throws IOException {
        field4085++;
        if (this.field4094) {
            throw new IllegalStateException();
        } else if (this.field4078) {
            return null;
        } else {
            while (this.field4074.pageOut(this.field4068) <= 0) {
                int var10 = this.method1910((byte) 21, this.field4082);
                if (var10 == -1) {
                    this.field4078 = true;
                    return null;
                }
                if (var10 == 0) {
                    return null;
                }
                if (!this.field4074.write(this.field4082, var10)) {
                    throw new RuntimeException("");
                }
            }
            int var2 = this.field4068.getSerialNumber();
            if (arg0 != 1) {
                this.field4095 = null;
            }
            if (!this.field4068.isBOS()) {
                class734 var3 = (class734) this.field4098.method1465((long) var2, -6008);
                if (!var3.field9906.pageIn(this.field4068)) {
                    throw new IllegalStateException();
                }
                return var3;
            }
            OggStreamState var4 = new OggStreamState(var2);
            if (!var4.pageIn(this.field4068)) {
                throw new IllegalStateException();
            } else if (var4.packetPeek(this.field4080) == 1) {
                class734 var5;
                if (this.field4088 == null && this.field4080.isTheora()) {
                    this.field4088 = new class72(var4);
                    var5 = this.field4088;
                } else if (this.field4095 == null && this.field4080.isVorbis()) {
                    this.field4095 = new class689(var4);
                    var5 = this.field4095;
                } else {
                    byte[] var6 = this.field4080.getData();
                    StringBuffer var7 = new StringBuffer();
                    for (int var8 = 1; var6.length > var8 && Character.isLetterOrDigit((char) var6[var8]); var8++) {
                        var7.append((char) var6[var8]);
                    }
                    String var9 = var7.toString();
                    if (var9.equals("kate")) {
                        var5 = new class535(var4);
                    } else {
                        var5 = new class199(var4);
                    }
                }
                this.field4098.method1468((byte) 92, (long) var2, var5);
                return var5;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(I)V", line = 698)
    public class291(int arg0) {
        if (!class98.method915(-30282, "jagtheora")) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field4082 = new byte[arg0];
        this.field4074 = new OggSyncState();
        this.field4068 = new OggPage();
        this.field4080 = new OggPacket();
        this.field4098 = new class213(8);
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B[B)I")
    public abstract int method1910(byte arg0, byte[] arg1) throws IOException;
}
