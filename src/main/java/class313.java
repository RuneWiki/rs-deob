import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public abstract class class313 {

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "[B")
    private byte[] field3999;

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field4016;

    @OriginalMember(owner = "client!ko", name = "x", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field4013;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field4001;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "Lsga;")
    private class583 field4008;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "Lmq;")
    public static class78 field3997 = new class78(42, 4);

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "Lbi;")
    private class148 field4009;

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "Lqea;")
    private class340 field4011;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "Lce;")
    private class563 field3994;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "Ljava/lang/String;")
    private String field4000;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "Z")
    private boolean field3993;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "Z")
    private boolean field3996;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "Z")
    private boolean field4005;

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "Z")
    private boolean field4017;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V", line = 7)
    private final void method1816(byte arg0) {
        field4002++;
        class170 var2 = (class170) this.field4008.method3245(false);
        if (arg0 != 84) {
            this.method1827(94);
        }
        while (var2 != null) {
            if (this.field3994 != var2) {
                while (var2.field2235.packetOut() == 1) {
                    var2.method1063(31067, this.field4001);
                }
            }
            var2 = (class170) this.field4008.method3252(12938);
        }
        if (this.field3994 == null) {
            return;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (!this.method1831(arg0 ^ 0x5E)) {
                return;
            }
            if (this.field3994.field2235.packetOut() != 1) {
                this.method1825(10);
                return;
            }
            this.field3994.method1063(31067, this.field4001);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 53)
    public final void method1817(String arg0, byte arg1) {
        field4006++;
        this.field4000 = arg0;
        int var3 = -85 / ((arg1 + 22) / 48);
        if (this.field4000 == null) {
            this.field4009 = null;
            return;
        }
        if (this.field4009 != null && !this.field4000.equals(this.field4009.method928(false))) {
            this.field4009 = null;
        }
        if (this.field4009 != null) {
            return;
        }
        for (class170 var4 = (class170) this.field4008.method3245(false); var4 != null; var4 = (class170) this.field4008.method3252(12938)) {
            if (var4 instanceof class148) {
                class148 var5 = (class148) var4;
                if (this.field4000.equals(var5.method928(false))) {
                    this.field4009 = var5;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)V", line = 105)
    private final void method1818(int arg0) {
        for (class170 var2 = (class170) this.field4008.method3245(false); var2 != null; var2 = (class170) this.field4008.method3252(12938)) {
            if (var2 instanceof class148) {
                class148 var3 = (class148) var2;
                while ((var3.field2240 <= 8 || this.method1829((byte) -32) > (double) var3.method930((byte) 104)) && var3.field2235.packetOut(this.field4001) == 1) {
                    var3.method1063(31067, this.field4001);
                }
            }
        }
        if (arg0 != 10) {
            this.method1827(-98);
        }
        field4014++;
        this.method1817(this.field4000, (byte) -79);
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)Z", line = 140)
    public final boolean method1819(int arg0) {
        field4010++;
        if (!this.field3993 && !this.field4005) {
            return false;
        } else if (this.field4011 == null || this.field4011.method1989(127) <= 0) {
            return arg0 >= 71;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V", line = 161)
    private final void method1820(int arg0) throws IOException {
        field3998++;
        while (this.field3994.field2235.packetOut(this.field4001) != 1) {
            class170 var2 = this.method1824(105);
            if (var2 == null) {
                if (this.field4005) {
                    this.method1816((byte) 84);
                }
                return;
            }
            if (this.field4009 == var2) {
                this.method1818(10);
            }
        }
        if (arg0 != 1) {
            this.method1822(85);
        }
        this.field3994.method1063(31067, this.field4001);
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)V", line = 192)
    public static final void method1821(int arg0) {
        class101.field1245 = arg0;
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)Lce;", line = 195)
    public final class563 method1822(int arg0) {
        if (arg0 != 7531) {
            this.method1829((byte) -65);
        }
        field3995++;
        return this.field3994;
    }

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "(I)V", line = 207)
    public final void method1823(int arg0) throws IOException {
        field3992++;
        if (arg0 < 121) {
            this.field4011 = null;
        }
        if (this.field3996) {
            return;
        }
        while (!this.field3993) {
            class170 var2;
            if (this.field4017) {
                var2 = (class170) this.field4008.method3248((long) this.field4013.getSerialNumber(), 0);
            } else {
                var2 = this.method1824(110);
                if (var2 == null) {
                    if (this.field4005) {
                        this.method1816((byte) 84);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field4017 = true;
            }
            if (this.field4011 == var2) {
                if (this.field4011.method1989(118) >= 50) {
                    return;
                }
                while (this.field4011.field2235.packetOut(this.field4001) == 1) {
                    this.field4011.method1063(31067, this.field4001);
                    this.method1818(10);
                    if (this.field3994 != null) {
                        double var4 = this.field3994.method3182(118);
                        for (int var6 = 0; var6 < 10 && this.method1831(10); var6++) {
                            this.method1820(1);
                            if (this.field3993) {
                                return;
                            }
                        }
                        if (this.field3994.method3182(110) > var4) {
                            return;
                        }
                    }
                    if (this.field4011.method1989(108) >= 50) {
                        return;
                    }
                }
            } else if ((var2 instanceof class148)) {
                this.method1818(10);
            } else if (this.field3994 != var2) {
                while (var2.field2235.packetOut(this.field4001) == 1) {
                    if (var2.field2240 == 1 && var2 instanceof class148) {
                        this.method1817(this.field4000, (byte) -87);
                    }
                    var2.method1063(31067, this.field4001);
                }
            } else if (this.field4011 == null && !this.field3996) {
                for (int var3 = 0; var3 < 10 && this.method1831(10); var3++) {
                    this.method1820(1);
                    if (this.field3993) {
                        return;
                    }
                }
                return;
            }
            this.field4017 = false;
        }
    }

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)Loga;", line = 327)
    private final class170 method1824(int arg0) throws IOException {
        field4015++;
        if (this.field3993) {
            throw new IllegalStateException();
        } else if (this.field4005) {
            return null;
        } else if (arg0 < 44) {
            return null;
        } else {
            while (this.field4016.pageOut(this.field4013) <= 0) {
                int var10 = this.method1830(this.field3999, (byte) -116);
                if (var10 == -1) {
                    this.field4005 = true;
                    return null;
                }
                if (var10 == 0) {
                    return null;
                }
                if (!this.field4016.write(this.field3999, var10)) {
                    throw new RuntimeException("");
                }
            }
            int var2 = this.field4013.getSerialNumber();
            if (!this.field4013.isBOS()) {
                class170 var9 = (class170) this.field4008.method3248((long) var2, 0);
                if (!var9.field2235.pageIn(this.field4013)) {
                    throw new IllegalStateException();
                }
                return var9;
            }
            OggStreamState var3 = new OggStreamState(var2);
            if (!var3.pageIn(this.field4013)) {
                throw new IllegalStateException();
            } else if (var3.packetPeek(this.field4001) == 1) {
                class170 var4;
                if (this.field3994 == null && this.field4001.isTheora()) {
                    this.field3994 = new class563(var3);
                    var4 = this.field3994;
                } else if (this.field4011 == null && this.field4001.isVorbis()) {
                    this.field4011 = new class340(var3);
                    var4 = this.field4011;
                } else {
                    byte[] var5 = this.field4001.getData();
                    StringBuffer var6 = new StringBuffer();
                    for (int var7 = 1; var5.length > var7 && Character.isLetterOrDigit((char) var5[var7]); var7++) {
                        var6.append((char) var5[var7]);
                    }
                    String var8 = var6.toString();
                    if (var8.equals("kate")) {
                        var4 = new class148(var3);
                    } else {
                        var4 = new class715(var3);
                    }
                }
                this.field4008.method3249((long) var2, var4, (byte) -112);
                return var4;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "(I)V", line = 450)
    public final void method1825(int arg0) {
        field3990++;
        if (this.field3993) {
            return;
        }
        for (class170 var2 = (class170) this.field4008.method3245(false); var2 != null; var2 = (class170) this.field4008.method3252(12938)) {
            var2.method926(true);
            var2.field2235.method892();
        }
        this.field4001.method892();
        if (arg0 != 10) {
            this.method1832(110);
        }
        this.field4013.method892();
        this.field4016.method892();
        this.field3993 = true;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZB)V", line = 480)
    public final void method1826(boolean arg0, byte arg1) {
        field4012++;
        if (this.field4011 != null) {
            class146 var3 = this.field4011.method1994((byte) -124);
            if (var3 != null) {
                var3.method913((byte) -122, arg0);
            }
        }
        int var4 = 49 % ((arg1 + 58) / 56);
        this.field3996 = !this.field3996;
    }

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "(I)Lbi;", line = 499)
    public final class148 method1827(int arg0) {
        if (arg0 >= -28) {
            return null;
        } else {
            field4003++;
            return this.field4009;
        }
    }

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "(I)V", line = 511)
    public static void method1828(int arg0) {
        field3997 = null;
        if (arg0 != 1) {
            method1828(120);
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)D", line = 524)
    public final double method1829(byte arg0) {
        if (arg0 >= -25) {
            this.field4011 = null;
        }
        field4004++;
        if (this.field4011 == null) {
            return this.field3994 == null ? 0.0D : this.field3994.method3182(126);
        } else {
            return this.field4011.method1990(0);
        }
    }

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "(I)Z", line = 553)
    private final boolean method1831(int arg0) {
        if (arg0 != 10) {
            this.method1816((byte) 5);
        }
        field4007++;
        if (this.field4011 == null) {
            double var2 = (double) this.field3994.method3176(arg0 - 138);
            return var2 == 0.0D || (double) class97.method654((byte) 77) >= (double) this.field3994.method3179(-1) + 1000.0D / var2;
        } else {
            return !this.field3994.method3178(-121) || this.method1829((byte) -69) > this.field3994.method3182(117);
        }
    }

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "(I)Lqea;", line = 575)
    public final class340 method1832(int arg0) {
        if (arg0 >= -32) {
            method1821(-22);
        }
        field3991++;
        return this.field4011;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(I)V", line = 589)
    public class313(int arg0) {
        if (!class10.method50("jagtheora", (byte) -72)) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field3999 = new byte[arg0];
        this.field4016 = new OggSyncState();
        this.field4013 = new OggPage();
        this.field4001 = new OggPacket();
        this.field4008 = new class583(8);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([BB)I")
    public abstract int method1830(byte[] arg0, byte arg1) throws IOException;
}
