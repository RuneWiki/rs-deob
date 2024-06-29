import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public abstract class class715 {

    @OriginalMember(owner = "client!kha", name = "e", descriptor = "[B")
    private byte[] field9975;

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field9973;

    @OriginalMember(owner = "client!kha", name = "t", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field9990;

    @OriginalMember(owner = "client!kha", name = "d", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field9974;

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "Lsi;")
    private class769 field9972;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "I")
    public static int field9971;

    @OriginalMember(owner = "client!kha", name = "f", descriptor = "I")
    public static int field9976;

    @OriginalMember(owner = "client!kha", name = "g", descriptor = "I")
    public static int field9977;

    @OriginalMember(owner = "client!kha", name = "h", descriptor = "I")
    public static int field9978;

    @OriginalMember(owner = "client!kha", name = "j", descriptor = "I")
    public static int field9980;

    @OriginalMember(owner = "client!kha", name = "l", descriptor = "I")
    public static int field9982;

    @OriginalMember(owner = "client!kha", name = "q", descriptor = "I")
    public static int field9987;

    @OriginalMember(owner = "client!kha", name = "r", descriptor = "I")
    public static int field9988;

    @OriginalMember(owner = "client!kha", name = "u", descriptor = "I")
    public static int field9991;

    @OriginalMember(owner = "client!kha", name = "v", descriptor = "I")
    public static int field9992;

    @OriginalMember(owner = "client!kha", name = "x", descriptor = "I")
    public static int field9994;

    @OriginalMember(owner = "client!kha", name = "y", descriptor = "I")
    public static int field9995;

    @OriginalMember(owner = "client!kha", name = "z", descriptor = "I")
    public static int field9996;

    @OriginalMember(owner = "client!kha", name = "A", descriptor = "I")
    public static int field9997;

    @OriginalMember(owner = "client!kha", name = "p", descriptor = "Lik;")
    private class125 field9986;

    @OriginalMember(owner = "client!kha", name = "k", descriptor = "Lbka;")
    private class562 field9981;

    @OriginalMember(owner = "client!kha", name = "m", descriptor = "Lqa;")
    private class747 field9983;

    @OriginalMember(owner = "client!kha", name = "B", descriptor = "Ljava/lang/String;")
    private String field9998;

    @OriginalMember(owner = "client!kha", name = "i", descriptor = "Z")
    private boolean field9979;

    @OriginalMember(owner = "client!kha", name = "n", descriptor = "Z")
    private boolean field9984;

    @OriginalMember(owner = "client!kha", name = "o", descriptor = "Z")
    private boolean field9985;

    @OriginalMember(owner = "client!kha", name = "s", descriptor = "Z")
    private boolean field9989;

    @OriginalMember(owner = "client!kha", name = "w", descriptor = "[S")
    public static short[] field9993;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method3972(int arg0) {
        field9997++;
        if (!this.field9989 && !this.field9979) {
            return false;
        } else if (this.field9986 == null || this.field9986.method1079(true) <= 0) {
            if (arg0 <= 21) {
                this.field9975 = null;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(BZ)V", line = 26)
    public final void method3973(byte arg0, boolean arg1) {
        field9978++;
        if (this.field9986 != null) {
            class330 var3 = this.field9986.method1084((byte) 53);
            if (var3 != null) {
                var3.method2018((byte) 77, arg1);
            }
        }
        this.field9985 = !this.field9985;
        if (arg0 >= -37) {
            this.field9998 = null;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(B)V", line = 51)
    public static void method3974(byte arg0) {
        field9993 = null;
        int var1 = 63 / ((arg0 + 11) / 61);
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(I)Z", line = 72)
    private final boolean method3975(int arg0) {
        if (arg0 != 24518) {
            this.field9990 = null;
        }
        field9992++;
        if (this.field9986 == null) {
            double var2 = (double) this.field9983.method4119((byte) -45);
            return var2 == 0.0D || (double) class337.method2062(false) >= 1000.0D / var2 + (double) this.field9983.method4118(0);
        } else {
            return !this.field9983.method4114(-6991) || this.method3979((byte) 44) > this.field9983.method4117(0);
        }
    }

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "(I)V", line = 94)
    private final void method3976(int arg0) throws IOException {
        field9991++;
        if (arg0 != 1) {
            this.method3978(null, (byte) -42);
        }
        while (this.field9983.field2275.packetOut(this.field9974) != 1) {
            class137 var2 = this.method3980((byte) -74);
            if (var2 == null) {
                if (this.field9979) {
                    this.method3981(1);
                }
                return;
            }
            if (this.field9981 == var2) {
                this.method3984(-2);
            }
        }
        this.field9983.method1129(16354, this.field9974);
    }

    @OriginalMember(owner = "client!kha", name = "d", descriptor = "(I)V", line = 125)
    public final void method3977(int arg0) {
        field9994++;
        if (this.field9989) {
            return;
        }
        if (arg0 <= 107) {
            this.method3978(null, (byte) -122);
        }
        for (class137 var2 = (class137) this.field9972.method4254((byte) 8); var2 != null; var2 = (class137) this.field9972.method4251(-94)) {
            var2.method1085(0);
            var2.field2275.method1199();
        }
        this.field9974.method1199();
        this.field9990.method1199();
        this.field9973.method1199();
        this.field9989 = true;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 152)
    public final void method3978(String arg0, byte arg1) {
        this.field9998 = arg0;
        field9982++;
        if (this.field9998 == null) {
            this.field9981 = null;
            return;
        }
        if (this.field9981 != null && !this.field9998.equals(this.field9981.method3275(4983))) {
            this.field9981 = null;
        }
        if (this.field9981 == null) {
            for (class137 var3 = (class137) this.field9972.method4254((byte) 8); var3 != null; var3 = (class137) this.field9972.method4251(-84)) {
                if (var3 instanceof class562) {
                    class562 var4 = (class562) var3;
                    if (this.field9998.equals(var4.method3275(4983))) {
                        this.field9981 = var4;
                        return;
                    }
                }
            }
        }
        if (arg1 != 52) {
            this.method3981(-82);
        }
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(B)D", line = 204)
    public final double method3979(byte arg0) {
        field9971++;
        if (this.field9986 == null) {
            if (arg0 != 44) {
                this.field9975 = null;
            }
            return this.field9983 == null ? 0.0D : this.field9983.method4117(0);
        } else {
            return this.field9986.method1082(0);
        }
    }

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "(B)Lni;", line = 224)
    private final class137 method3980(byte arg0) throws IOException {
        field9977++;
        if (this.field9989) {
            throw new IllegalStateException();
        }
        if (arg0 > -40) {
            this.method3983((byte) -23);
        }
        if (this.field9979) {
            return null;
        }
        while (this.field9973.pageOut(this.field9990) <= 0) {
            int var10 = this.method3403(this.field9975, (byte) 57);
            if (var10 == -1) {
                this.field9979 = true;
                return null;
            }
            if (var10 == 0) {
                return null;
            }
            if (!this.field9973.write(this.field9975, var10)) {
                throw new RuntimeException("");
            }
        }
        int var2 = this.field9990.getSerialNumber();
        if (!this.field9990.isBOS()) {
            class137 var3 = (class137) this.field9972.method4253((long) var2, -1);
            if (!var3.field2275.pageIn(this.field9990)) {
                throw new IllegalStateException();
            }
            return var3;
        }
        OggStreamState var4 = new OggStreamState(var2);
        if (!var4.pageIn(this.field9990)) {
            throw new IllegalStateException();
        } else if (var4.packetPeek(this.field9974) == 1) {
            class137 var5;
            if (this.field9983 == null && this.field9974.isTheora()) {
                this.field9983 = new class747(var4);
                var5 = this.field9983;
            } else if (this.field9986 == null && this.field9974.isVorbis()) {
                this.field9986 = new class125(var4);
                var5 = this.field9986;
            } else {
                byte[] var6 = this.field9974.getData();
                StringBuffer var7 = new StringBuffer();
                for (int var8 = 1; var6.length > var8 && Character.isLetterOrDigit((char) var6[var8]); var8++) {
                    var7.append((char) var6[var8]);
                }
                String var9 = var7.toString();
                if (var9.equals("kate")) {
                    var5 = new class562(var4);
                } else {
                    var5 = new class752(var4);
                }
            }
            this.field9972.method4252(false, var5, (long) var2);
            return var5;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!kha", name = "e", descriptor = "(I)V", line = 344)
    private final void method3981(int arg0) {
        field9995++;
        for (class137 var2 = (class137) this.field9972.method4254((byte) 8); var2 != null; var2 = (class137) this.field9972.method4251(-86)) {
            if (this.field9983 != var2) {
                while (var2.field2275.packetOut() == 1) {
                    var2.method1129(16354, this.field9974);
                }
            }
        }
        if (arg0 != 1) {
            this.method3979((byte) -78);
        }
        if (this.field9983 == null) {
            return;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (!this.method3975(arg0 ^ 0x5FC7)) {
                return;
            }
            if (this.field9983.field2275.packetOut() != 1) {
                this.method3977(120);
                return;
            }
            this.field9983.method1129(16354, this.field9974);
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Z)Lik;", line = 389)
    public final class125 method3982(boolean arg0) {
        field9976++;
        if (arg0) {
            this.field9989 = false;
        }
        return this.field9986;
    }

    @OriginalMember(owner = "client!kha", name = "d", descriptor = "(B)Lbka;", line = 400)
    public final class562 method3983(byte arg0) {
        if (arg0 == 22) {
            field9980++;
            return this.field9981;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kha", name = "f", descriptor = "(I)V", line = 412)
    private final void method3984(int arg0) {
        for (class137 var2 = (class137) this.field9972.method4254((byte) 8); var2 != null; var2 = (class137) this.field9972.method4251(-54)) {
            if (var2 instanceof class562) {
                class562 var3 = (class562) var2;
                while ((var3.field2273 <= 8 || this.method3979((byte) 44) > (double) var3.method3272(128)) && var3.field2275.packetOut(this.field9974) == 1) {
                    var3.method1129(16354, this.field9974);
                }
            }
        }
        field9987++;
        if (arg0 != -2) {
            this.method3977(118);
        }
        this.method3978(this.field9998, (byte) 52);
    }

    @OriginalMember(owner = "client!kha", name = "g", descriptor = "(I)V", line = 453)
    public final void method3985(int arg0) throws IOException {
        field9988++;
        if (this.field9985) {
            return;
        }
        while (!this.field9989) {
            class137 var2;
            if (this.field9984) {
                var2 = (class137) this.field9972.method4253((long) this.field9990.getSerialNumber(), -1);
            } else {
                var2 = this.method3980((byte) -83);
                if (var2 == null) {
                    if (this.field9979) {
                        this.method3981(arg0 + 3);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field9984 = true;
            }
            if (this.field9986 == var2) {
                if (this.field9986.method1079(true) >= 50) {
                    return;
                }
                while (this.field9986.field2275.packetOut(this.field9974) == 1) {
                    this.field9986.method1129(16354, this.field9974);
                    this.method3984(-2);
                    if (this.field9983 != null) {
                        double var3 = this.field9983.method4117(0);
                        for (int var5 = 0; var5 < 10 && this.method3975(24518); var5++) {
                            this.method3976(1);
                            if (this.field9989) {
                                return;
                            }
                        }
                        if (var3 < this.field9983.method4117(0)) {
                            return;
                        }
                    }
                    if (this.field9986.method1079(true) >= 50) {
                        return;
                    }
                }
            } else if (var2 instanceof class562) {
                this.method3984(arg0);
            } else if (this.field9983 != var2) {
                while (var2.field2275.packetOut(this.field9974) == 1) {
                    if (var2.field2273 == 1 && var2 instanceof class562) {
                        this.method3978(this.field9998, (byte) 52);
                    }
                    var2.method1129(16354, this.field9974);
                }
            } else if (this.field9986 == null && !this.field9985) {
                for (int var6 = 0; var6 < 10 && this.method3975(24518); var6++) {
                    this.method3976(1);
                    if (this.field9989) {
                        return;
                    }
                }
                return;
            }
            this.field9984 = false;
        }
        if (arg0 != -2) {
            this.method3982(false);
        }
    }

    @OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(I)V", line = 572)
    public class715(int arg0) {
        if (!class27.method224(125, "jagtheora")) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field9975 = new byte[arg0];
        this.field9973 = new OggSyncState();
        this.field9990 = new OggPage();
        this.field9974 = new OggPacket();
        this.field9972 = new class769(8);
    }

    @OriginalMember(owner = "client!kha", name = "h", descriptor = "(I)Lqa;", line = 587)
    public final class747 method3986(int arg0) {
        if (arg0 < 33) {
            this.method3979((byte) -35);
        }
        field9996++;
        return this.field9983;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "([BB)I")
    public abstract int method3403(byte[] arg0, byte arg1) throws IOException;
}
