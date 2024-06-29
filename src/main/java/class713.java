import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public abstract class class713 {

    @OriginalMember(owner = "client!fv", name = "s", descriptor = "[B")
    private byte[] field10049;

    @OriginalMember(owner = "client!fv", name = "D", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field10060;

    @OriginalMember(owner = "client!fv", name = "u", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field10051;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field10041;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "Lqp;")
    private class715 field10032;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "[J")
    public static long[] field10034 = new long[100];

    @OriginalMember(owner = "client!fv", name = "A", descriptor = "Z")
    public static boolean field10057 = true;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public static int field10033;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
    public static int field10038;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public static int field10040;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
    public static int field10043;

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "I")
    public static int field10044;

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
    public static int field10046;

    @OriginalMember(owner = "client!fv", name = "q", descriptor = "I")
    public static int field10047;

    @OriginalMember(owner = "client!fv", name = "r", descriptor = "I")
    public static int field10048;

    @OriginalMember(owner = "client!fv", name = "t", descriptor = "I")
    public static int field10050;

    @OriginalMember(owner = "client!fv", name = "v", descriptor = "I")
    public static int field10052;

    @OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
    public static int field10053;

    @OriginalMember(owner = "client!fv", name = "x", descriptor = "I")
    public static int field10054;

    @OriginalMember(owner = "client!fv", name = "y", descriptor = "I")
    public static int field10055;

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "I")
    public static int field10056;

    @OriginalMember(owner = "client!fv", name = "F", descriptor = "I")
    public static int field10062;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "Lwm;")
    private class28 field10036;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "Lqb;")
    private class332 field10037;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "Ljia;")
    public static class336 field10039;

    @OriginalMember(owner = "client!fv", name = "C", descriptor = "Lpt;")
    public static class441 field10059;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "Lgq;")
    private class94 field10031;

    @OriginalMember(owner = "client!fv", name = "E", descriptor = "Ljava/lang/String;")
    private String field10061;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "Z")
    private boolean field10035;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "Z")
    private boolean field10042;

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "Z")
    private boolean field10045;

    @OriginalMember(owner = "client!fv", name = "B", descriptor = "Z")
    private boolean field10058;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)Lwm;")
    public final class28 method3986(int arg0) {
        if (arg0 > -72) {
            this.method3999(-118);
        }
        field10052++;
        return this.field10036;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V")
    private final void method3987(int arg0) {
        field10055++;
        for (class434 var2 = (class434) this.field10032.method4023((byte) -30); var2 != null; var2 = (class434) this.field10032.method4021((byte) 80)) {
            if (this.field10031 != var2) {
                while (var2.field6221.packetOut() == 1) {
                    var2.method2666((byte) -128, this.field10041);
                }
            }
        }
        if (this.field10031 == null) {
            return;
        }
        for (int var3 = arg0; var3 < 10; var3++) {
            if (!this.method4000(0)) {
                return;
            }
            if (this.field10031.field6221.packetOut() != 1) {
                this.method3993((byte) -88);
                return;
            }
            this.field10031.method2666((byte) -97, this.field10041);
        }
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)V")
    public final void method3988(int arg0) throws IOException {
        if (arg0 != -2) {
            this.method3991(101, null);
        }
        field10054++;
        if (this.field10035) {
            return;
        }
        while (!this.field10045) {
            class434 var2;
            if (this.field10058) {
                var2 = (class434) this.field10032.method4020((long) this.field10051.getSerialNumber(), (byte) -76);
            } else {
                var2 = this.method3996(-1);
                if (var2 == null) {
                    if (this.field10042) {
                        this.method3987(0);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field10058 = true;
            }
            if (this.field10036 == var2) {
                if (this.field10036.method137((byte) 52) >= 50) {
                    return;
                }
                while (this.field10036.field6221.packetOut(this.field10041) == 1) {
                    this.field10036.method2666((byte) 111, this.field10041);
                    this.method3994(0);
                    if (this.field10031 != null) {
                        double var3 = this.field10031.method726(true);
                        for (int var5 = 0; var5 < 10 && this.method4000(0); var5++) {
                            this.method3992((byte) 70);
                            if (this.field10045) {
                                return;
                            }
                        }
                        if (this.field10031.method726(true) > var3) {
                            return;
                        }
                    }
                    if (this.field10036.method137((byte) 126) >= 50) {
                        return;
                    }
                }
            } else if (var2 instanceof class332) {
                this.method3994(arg0 ^ 0xFFFFFFFE);
            } else if (this.field10031 != var2) {
                while (var2.field6221.packetOut(this.field10041) == 1) {
                    if (var2.field6217 == 1 && var2 instanceof class332) {
                        this.method3991(1, this.field10061);
                    }
                    var2.method2666((byte) 123, this.field10041);
                }
            } else if (this.field10036 == null && !this.field10035) {
                for (int var6 = 0; var6 < 10 && this.method4000(0); var6++) {
                    this.method3992((byte) 70);
                    if (this.field10045) {
                        return;
                    }
                }
                return;
            }
            this.field10058 = false;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)D")
    public final double method3989(boolean arg0) {
        field10050++;
        if (this.field10036 != null) {
            return this.field10036.method139(111);
        } else if (this.field10031 == null) {
            if (!arg0) {
                this.method3999(-34);
            }
            return 0.0D;
        } else {
            return this.field10031.method726(true);
        }
    }

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)Lqb;")
    public final class332 method3990(int arg0) {
        if (arg0 == -51) {
            field10053++;
            return this.field10037;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method3991(int arg0, String arg1) {
        this.field10061 = arg1;
        field10062++;
        if (this.field10061 == null) {
            this.field10037 = null;
            return;
        }
        if (this.field10037 != null && !this.field10061.equals(this.field10037.method2040(arg0 + 118))) {
            this.field10037 = null;
        }
        if (this.field10037 == null) {
            for (class434 var3 = (class434) this.field10032.method4023((byte) -38); var3 != null; var3 = (class434) this.field10032.method4021((byte) 80)) {
                if (var3 instanceof class332) {
                    class332 var4 = (class332) var3;
                    if (this.field10061.equals(var4.method2040(121))) {
                        this.field10037 = var4;
                        return;
                    }
                }
            }
        }
        if (arg0 != 1) {
            this.field10032 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V")
    private final void method3992(byte arg0) throws IOException {
        field10040++;
        while (this.field10031.field6221.packetOut(this.field10041) != 1) {
            class434 var2 = this.method3996(-1);
            if (var2 == null) {
                if (this.field10042) {
                    this.method3987(0);
                }
                return;
            }
            if (this.field10037 == var2) {
                this.method3994(0);
            }
        }
        if (arg0 == 70) {
            this.field10031.method2666((byte) -80, this.field10041);
        }
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(B)V")
    public final void method3993(byte arg0) {
        field10044++;
        if (this.field10045) {
            return;
        }
        for (class434 var2 = (class434) this.field10032.method4023((byte) -92); var2 != null; var2 = (class434) this.field10032.method4021((byte) 80)) {
            var2.method138(arg0 + 88);
            var2.field6221.method675();
        }
        if (arg0 != -88) {
            field10039 = null;
        }
        this.field10041.method675();
        this.field10051.method675();
        this.field10060.method675();
        this.field10045 = true;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I[B)I")
    public abstract int method2113(int arg0, byte[] arg1) throws IOException;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "(I)V")
    private final void method3994(int arg0) {
        for (class434 var2 = (class434) this.field10032.method4023((byte) -82); var2 != null; var2 = (class434) this.field10032.method4021((byte) 80)) {
            if (var2 instanceof class332) {
                class332 var3 = (class332) var2;
                while ((var3.field6217 <= 8 || this.method3989(true) > (double) var3.method2042(-99)) && var3.field6221.packetOut(this.field10041) == 1) {
                    var3.method2666((byte) -77, this.field10041);
                }
            }
        }
        if (arg0 != 0) {
            field10043 = -22;
        }
        field10048++;
        this.method3991(1, this.field10061);
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(B)V")
    public static void method3995(byte arg0) {
        if (arg0 > 100) {
            field10059 = null;
            field10039 = null;
            field10034 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "(I)Lbs;")
    private final class434 method3996(int arg0) throws IOException {
        if (arg0 != -1) {
            this.method3993((byte) -18);
        }
        field10047++;
        if (this.field10045) {
            throw new IllegalStateException();
        } else if (this.field10042) {
            return null;
        } else {
            while (this.field10060.pageOut(this.field10051) <= 0) {
                int var10 = this.method2113(-128, this.field10049);
                if (var10 == -1) {
                    this.field10042 = true;
                    return null;
                }
                if (var10 == 0) {
                    return null;
                }
                if (!this.field10060.write(this.field10049, var10)) {
                    throw new RuntimeException("");
                }
            }
            int var2 = this.field10051.getSerialNumber();
            if (!this.field10051.isBOS()) {
                class434 var9 = (class434) this.field10032.method4020((long) var2, (byte) -111);
                if (!var9.field6221.pageIn(this.field10051)) {
                    throw new IllegalStateException();
                }
                return var9;
            }
            OggStreamState var3 = new OggStreamState(var2);
            if (!var3.pageIn(this.field10051)) {
                throw new IllegalStateException();
            } else if (var3.packetPeek(this.field10041) == 1) {
                class434 var4;
                if (this.field10031 == null && this.field10041.isTheora()) {
                    this.field10031 = new class94(var3);
                    var4 = this.field10031;
                } else if (this.field10036 == null && this.field10041.isVorbis()) {
                    this.field10036 = new class28(var3);
                    var4 = this.field10036;
                } else {
                    byte[] var5 = this.field10041.getData();
                    StringBuffer var6 = new StringBuffer();
                    for (int var7 = 1; var7 < var5.length && Character.isLetterOrDigit((char) var5[var7]); var7++) {
                        var6.append((char) var5[var7]);
                    }
                    String var8 = var6.toString();
                    if (var8.equals("kate")) {
                        var4 = new class332(var3);
                    } else {
                        var4 = new class303(var3);
                    }
                }
                this.field10032.method4022(var4, 113, (long) var2);
                return var4;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IZ)V")
    public final void method3997(int arg0, boolean arg1) {
        if (this.field10036 != null) {
            class236 var3 = this.field10036.method140((byte) 98);
            if (var3 != null) {
                var3.method1652(arg1, -10650);
            }
        }
        field10046++;
        int var4 = 67 % ((arg0 + 38) / 48);
        this.field10035 = !this.field10035;
    }

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "(I)Lgq;")
    public final class94 method3998(int arg0) {
        if (arg0 == 10) {
            field10056++;
            return this.field10031;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "(I)Z")
    public final boolean method3999(int arg0) {
        field10033++;
        if (!this.field10045 && !this.field10042) {
            return false;
        } else if (this.field10036 == null || this.field10036.method137((byte) 79) <= 0) {
            if (arg0 != -8065) {
                this.method4000(-54);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "(I)Z")
    private final boolean method4000(int arg0) {
        if (arg0 != 0) {
            this.field10058 = false;
        }
        field10038++;
        if (this.field10036 == null) {
            double var2 = (double) this.field10031.method725(0);
            return var2 == 0.0D || (double) class465.method2818(arg0 ^ 0xFF) >= (double) this.field10031.method731((byte) -17) + 1000.0D / var2;
        } else {
            return !this.field10031.method730((byte) 54) || this.method3989(true) > this.field10031.method726(true);
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(I)V")
    public class713(int arg0) {
        if (!class151.method1095("jagtheora", 3)) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field10049 = new byte[arg0];
        this.field10060 = new OggSyncState();
        this.field10051 = new OggPage();
        this.field10041 = new OggPacket();
        this.field10032 = new class715(8);
    }
}
