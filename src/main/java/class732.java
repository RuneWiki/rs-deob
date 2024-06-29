import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public abstract class class732 {

    @OriginalMember(owner = "client!dha", name = "C", descriptor = "[B")
    private byte[] field10307;

    @OriginalMember(owner = "client!dha", name = "z", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field10304;

    @OriginalMember(owner = "client!dha", name = "s", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field10297;

    @OriginalMember(owner = "client!dha", name = "B", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field10306;

    @OriginalMember(owner = "client!dha", name = "o", descriptor = "Lpl;")
    private class616 field10293;

    @OriginalMember(owner = "client!dha", name = "l", descriptor = "I")
    public static int field10290 = 0;

    @OriginalMember(owner = "client!dha", name = "m", descriptor = "Ltm;")
    public static class334 field10291 = new class334(82, -2);

    @OriginalMember(owner = "client!dha", name = "E", descriptor = "F")
    public static float field10309;

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "I")
    public static int field10280;

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "I")
    public static int field10281;

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "I")
    public static int field10282;

    @OriginalMember(owner = "client!dha", name = "e", descriptor = "I")
    public static int field10283;

    @OriginalMember(owner = "client!dha", name = "g", descriptor = "I")
    public static int field10285;

    @OriginalMember(owner = "client!dha", name = "i", descriptor = "I")
    public static int field10287;

    @OriginalMember(owner = "client!dha", name = "j", descriptor = "I")
    public static int field10288;

    @OriginalMember(owner = "client!dha", name = "k", descriptor = "I")
    public static int field10289;

    @OriginalMember(owner = "client!dha", name = "n", descriptor = "I")
    public static int field10292;

    @OriginalMember(owner = "client!dha", name = "p", descriptor = "I")
    public static int field10294;

    @OriginalMember(owner = "client!dha", name = "r", descriptor = "I")
    public static int field10296;

    @OriginalMember(owner = "client!dha", name = "u", descriptor = "I")
    public static int field10299;

    @OriginalMember(owner = "client!dha", name = "v", descriptor = "I")
    public static int field10300;

    @OriginalMember(owner = "client!dha", name = "w", descriptor = "I")
    public static int field10301;

    @OriginalMember(owner = "client!dha", name = "y", descriptor = "I")
    public static int field10303;

    @OriginalMember(owner = "client!dha", name = "F", descriptor = "I")
    public static int field10310;

    @OriginalMember(owner = "client!dha", name = "G", descriptor = "I")
    public static int field10311;

    @OriginalMember(owner = "client!dha", name = "x", descriptor = "Lnr;")
    private class149 field10302;

    @OriginalMember(owner = "client!dha", name = "f", descriptor = "Lml;")
    private class175 field10284;

    @OriginalMember(owner = "client!dha", name = "D", descriptor = "Lrga;")
    private class290 field10308;

    @OriginalMember(owner = "client!dha", name = "q", descriptor = "Ljava/lang/String;")
    private String field10295;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "Z")
    private boolean field10279;

    @OriginalMember(owner = "client!dha", name = "h", descriptor = "Z")
    private boolean field10286;

    @OriginalMember(owner = "client!dha", name = "t", descriptor = "Z")
    private boolean field10298;

    @OriginalMember(owner = "client!dha", name = "A", descriptor = "Z")
    private boolean field10305;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)V", line = 4)
    public static void method4074(int arg0) {
        field10291 = null;
        if (arg0 != 1) {
            field10309 = -1.2730229F;
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(B)V", line = 18)
    private final void method4075(byte arg0) throws IOException {
        field10283++;
        while (this.field10308.field6535.packetOut(this.field10306) != 1) {
            class448 var3 = this.method4091(-51);
            if (var3 == null) {
                if (this.field10305) {
                    this.method4087(1);
                }
                return;
            }
            if (this.field10302 == var3) {
                this.method4086(119);
            }
        }
        int var2 = -108 % ((-arg0 - 35) / 45);
        this.field10308.method2758(this.field10306, (byte) 18);
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Z)Lrga;", line = 49)
    public final class290 method4076(boolean arg0) {
        if (arg0) {
            field10281++;
            return this.field10308;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(Z)Lnr;", line = 61)
    public final class149 method4077(boolean arg0) {
        field10288++;
        return arg0 ? null : this.field10302;
    }

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "(Z)V", line = 72)
    public final void method4078(boolean arg0) throws IOException {
        field10287++;
        if (this.field10286) {
            return;
        }
        while (!this.field10298) {
            class448 var2;
            if (this.field10279) {
                var2 = (class448) this.field10293.method3512(true, (long) this.field10297.getSerialNumber());
            } else {
                var2 = this.method4091(-51);
                if (var2 == null) {
                    if (this.field10305) {
                        this.method4087(1);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field10279 = true;
            }
            if (this.field10284 == var2) {
                if (this.field10284.method1376(true) >= 50) {
                    return;
                }
                while (this.field10284.field6535.packetOut(this.field10306) == 1) {
                    this.field10284.method2758(this.field10306, (byte) 38);
                    this.method4086(111);
                    if (this.field10308 != null) {
                        double var3 = this.field10308.method1892(0);
                        for (int var5 = 0; var5 < 10 && this.method4084((byte) -124); var5++) {
                            this.method4075((byte) -83);
                            if (this.field10298) {
                                return;
                            }
                        }
                        if (this.field10308.method1892(0) > var3) {
                            return;
                        }
                    }
                    if (this.field10284.method1376(arg0) >= 50) {
                        return;
                    }
                }
            } else if (var2 instanceof class149) {
                this.method4086(110);
            } else if (this.field10308 != var2) {
                while (var2.field6535.packetOut(this.field10306) == 1) {
                    if (var2.field6534 == 1 && var2 instanceof class149) {
                        this.method4080(this.field10295, (byte) -115);
                    }
                    var2.method2758(this.field10306, (byte) 109);
                }
            } else if (this.field10284 == null && !this.field10286) {
                for (int var6 = 0; var6 < 10 && this.method4084((byte) -56); var6++) {
                    this.method4075((byte) -100);
                    if (this.field10298) {
                        return;
                    }
                }
                return;
            }
            this.field10279 = false;
        }
        if (!arg0) {
            this.field10297 = null;
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lhw;I)V", line = 198)
    public static final void method4079(class613 arg0, int arg1) {
        int var2 = -43 % ((72 - arg1) / 52);
        class378.field5677 = arg0;
        field10292++;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 208)
    public final void method4080(String arg0, byte arg1) {
        this.field10295 = arg0;
        if (arg1 > -74) {
            return;
        }
        field10285++;
        if (this.field10295 == null) {
            this.field10302 = null;
            return;
        }
        if (this.field10302 != null && !this.field10295.equals(this.field10302.method1130((byte) -57))) {
            this.field10302 = null;
        }
        if (this.field10302 != null) {
            return;
        }
        for (class448 var3 = (class448) this.field10293.method3508((byte) -48); var3 != null; var3 = (class448) this.field10293.method3520(-1)) {
            if (var3 instanceof class149) {
                class149 var4 = (class149) var3;
                if (this.field10295.equals(var4.method1130((byte) -57))) {
                    this.field10302 = var4;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(BI)Z", line = 262)
    public static final boolean method4081(byte arg0, int arg1) {
        field10289++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else if (arg1 == -51) {
            return var2 < 128 || var2 >= 160 || class173.field2952[var2 - 128] != '\u0000';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(B)Lml;", line = 287)
    public final class175 method4082(byte arg0) {
        field10310++;
        if (arg0 != 81) {
            this.method4082((byte) -50);
        }
        return this.field10284;
    }

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "(B)D", line = 298)
    public final double method4083(byte arg0) {
        field10300++;
        if (this.field10284 != null) {
            return this.field10284.method1374(1);
        } else if (this.field10308 == null) {
            return arg0 >= -50 ? 0.945691861403888D : 0.0D;
        } else {
            return this.field10308.method1892(0);
        }
    }

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "(B)Z", line = 323)
    private final boolean method4084(byte arg0) {
        field10282++;
        if (arg0 > -37) {
            return true;
        } else if (this.field10284 == null) {
            double var2 = (double) this.field10308.method1891((byte) 89);
            return var2 == 0.0D || (double) class18.method109(-11121) >= 1000.0D / var2 + (double) this.field10308.method1889(110);
        } else {
            return !this.field10308.method1890(-1) || this.method4083((byte) -78) > this.field10308.method1892(0);
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(ZB)V", line = 347)
    public final void method4085(boolean arg0, byte arg1) {
        field10280++;
        if (this.field10284 != null) {
            class122 var3 = this.field10284.method1377(24);
            if (var3 != null) {
                var3.method955((byte) -97, arg0);
            }
        }
        if (arg1 != 84) {
            method4079(null, -46);
        }
        this.field10286 = !this.field10286;
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(I)V", line = 370)
    private final void method4086(int arg0) {
        field10303++;
        if (arg0 < 109) {
            this.method4083((byte) 16);
        }
        for (class448 var2 = (class448) this.field10293.method3508((byte) -74); var2 != null; var2 = (class448) this.field10293.method3520(-1)) {
            if (var2 instanceof class149) {
                class149 var3 = (class149) var2;
                while ((var3.field6534 <= 8 || this.method4083((byte) -82) > (double) var3.method1131(14615)) && var3.field6535.packetOut(this.field10306) == 1) {
                    var3.method2758(this.field10306, (byte) 62);
                }
            }
        }
        this.method4080(this.field10295, (byte) -99);
    }

    @OriginalMember(owner = "client!dha", name = "c", descriptor = "(I)V", line = 409)
    private final void method4087(int arg0) {
        field10311++;
        if (arg0 != 1) {
            this.field10284 = null;
        }
        for (class448 var2 = (class448) this.field10293.method3508((byte) -122); var2 != null; var2 = (class448) this.field10293.method3520(-1)) {
            if (this.field10308 != var2) {
                while (var2.field6535.packetOut() == 1) {
                    var2.method2758(this.field10306, (byte) 113);
                }
            }
        }
        if (this.field10308 == null) {
            return;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (!this.method4084((byte) -63)) {
                return;
            }
            if (this.field10308.field6535.packetOut() != 1) {
                this.method4089(true);
                return;
            }
            this.field10308.method2758(this.field10306, (byte) 29);
        }
    }

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "(I)Z", line = 452)
    public final boolean method4088(int arg0) {
        if (arg0 != 255) {
            return true;
        }
        field10296++;
        if (this.field10298 || this.field10305) {
            return this.field10284 == null || this.field10284.method1376(true) <= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "(Z)V", line = 473)
    public final void method4089(boolean arg0) {
        field10299++;
        if (this.field10298) {
            return;
        }
        for (class448 var2 = (class448) this.field10293.method3508((byte) -51); var2 != null; var2 = (class448) this.field10293.method3520(-1)) {
            var2.method1134(-108);
            var2.field6535.method725();
        }
        this.field10306.method725();
        this.field10297.method725();
        this.field10304.method725();
        this.field10298 = arg0;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(IIIIIIII)V", line = 501)
    public static final void method4090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field10294++;
        if (arg0 == arg2) {
            class416.method2559(arg1, (byte) -114, arg7, arg4, arg3, arg6, arg2);
            return;
        }
        if (class184.field3102 <= (arg6 - arg2) && arg2 + arg6 <= class657.field9347 && class76.field1126 <= (arg1 - arg0) && class461.field6699 >= arg0 + arg1) {
            class185.method1416(arg1, arg4, arg3, arg0, arg5 - 23692, arg7, arg2, arg6);
        } else {
            class44.method462(arg2, arg1, (byte) 122, arg4, arg3, arg6, arg7, arg0);
        }
        if (arg5 != 23813) {
            method4074(-25);
        }
    }

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(I)V", line = 525)
    public class732(int arg0) {
        if (!class541.method3169("jagtheora", -33)) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field10307 = new byte[arg0];
        this.field10304 = new OggSyncState();
        this.field10297 = new OggPage();
        this.field10306 = new OggPacket();
        this.field10293 = new class616(8);
    }

    @OriginalMember(owner = "client!dha", name = "e", descriptor = "(I)Lwt;", line = 540)
    private final class448 method4091(int arg0) throws IOException {
        field10301++;
        if (this.field10298) {
            throw new IllegalStateException();
        }
        if (arg0 != -51) {
            this.method4083((byte) 87);
        }
        if (this.field10305) {
            return null;
        }
        while (this.field10304.pageOut(this.field10297) <= 0) {
            int var10 = this.method1163(-2, this.field10307);
            if (var10 == -1) {
                this.field10305 = true;
                return null;
            }
            if (var10 == 0) {
                return null;
            }
            if (!this.field10304.write(this.field10307, var10)) {
                throw new RuntimeException("");
            }
        }
        int var2 = this.field10297.getSerialNumber();
        if (!this.field10297.isBOS()) {
            class448 var3 = (class448) this.field10293.method3512(true, (long) var2);
            if (!var3.field6535.pageIn(this.field10297)) {
                throw new IllegalStateException();
            }
            return var3;
        }
        OggStreamState var4 = new OggStreamState(var2);
        if (!var4.pageIn(this.field10297)) {
            throw new IllegalStateException();
        } else if (var4.packetPeek(this.field10306) == 1) {
            class448 var5;
            if (this.field10308 == null && this.field10306.isTheora()) {
                this.field10308 = new class290(var4);
                var5 = this.field10308;
            } else if (this.field10284 == null && this.field10306.isVorbis()) {
                this.field10284 = new class175(var4);
                var5 = this.field10284;
            } else {
                byte[] var6 = this.field10306.getData();
                StringBuffer var7 = new StringBuffer();
                for (int var8 = 1; var6.length > var8 && Character.isLetterOrDigit((char) var6[var8]); var8++) {
                    var7.append((char) var6[var8]);
                }
                String var9 = var7.toString();
                if (var9.equals("kate")) {
                    var5 = new class149(var4);
                } else {
                    var5 = new class425(var4);
                }
            }
            this.field10293.method3516(255, (long) var2, var5);
            return var5;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(I[B)I")
    public abstract int method1163(int arg0, byte[] arg1) throws IOException;
}
