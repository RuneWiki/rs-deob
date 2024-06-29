import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public abstract class class641 {

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "[B")
    private byte[] field8581;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field8587;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field8591;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field8601;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Lbaa;")
    private class130 field8579;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Lst;")
    public static class335 field8584 = new class335(17, 8);

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "Z")
    public static boolean field8597 = false;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field8575;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field8577;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field8580;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field8582;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field8588;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field8589;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field8590;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field8596;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    public static int field8600;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Luc;")
    private class127 field8585;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Lij;")
    private class164 field8593;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Ljaa;")
    private class750 field8583;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "Ljava/lang/String;")
    private String field8603;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Z")
    private boolean field8578;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Z")
    private boolean field8586;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "Z")
    private boolean field8595;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "Z")
    private boolean field8599;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 7)
    public final void method3571(int arg0) throws IOException {
        field8602++;
        if (this.field8599 || arg0 != -2) {
            return;
        }
        while (!this.field8595) {
            class619 var2;
            if (this.field8586) {
                var2 = (class619) this.field8579.method812(121, (long) this.field8591.getSerialNumber());
            } else {
                var2 = this.method3575((byte) 21);
                if (var2 == null) {
                    if (this.field8578) {
                        this.method3572((byte) -62);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field8586 = true;
            }
            if (this.field8583 == var2) {
                if (this.field8583.method4164((byte) -86) >= 50) {
                    return;
                }
                while (this.field8583.field8305.packetOut(this.field8601) == 1) {
                    this.field8583.method3498(this.field8601, 80);
                    this.method3579(-114);
                    if (this.field8585 != null) {
                        double var4 = this.field8585.method801((byte) -82);
                        for (int var6 = 0; var6 < 10 && this.method3585((byte) 107); var6++) {
                            this.method3582(114);
                            if (this.field8595) {
                                return;
                            }
                        }
                        if (var4 < this.field8585.method801((byte) -82)) {
                            return;
                        }
                    }
                    if (this.field8583.method4164((byte) -92) >= 50) {
                        return;
                    }
                }
            } else if (var2 instanceof class164) {
                this.method3579(-111);
            } else if (this.field8585 != var2) {
                while (var2.field8305.packetOut(this.field8601) == 1) {
                    if (var2.field8306 == 1 && var2 instanceof class164) {
                        this.method3574((byte) -80, this.field8603);
                    }
                    var2.method3498(this.field8601, 119);
                }
            } else if (this.field8583 == null && !this.field8599) {
                for (int var3 = 0; var3 < 10 && this.method3585((byte) 37); var3++) {
                    this.method3582(103);
                    if (this.field8595) {
                        return;
                    }
                }
                return;
            }
            this.field8586 = false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 128)
    private final void method3572(byte arg0) {
        field8577++;
        if (arg0 != -62) {
            return;
        }
        for (class619 var2 = (class619) this.field8579.method821((byte) 120); var2 != null; var2 = (class619) this.field8579.method818(arg0 + 165)) {
            if (this.field8585 != var2) {
                while (var2.field8305.packetOut() == 1) {
                    var2.method3498(this.field8601, 111);
                }
            }
        }
        if (this.field8585 == null) {
            return;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (!this.method3585((byte) 58)) {
                return;
            }
            if (this.field8585.field8305.packetOut() != 1) {
                this.method3573(arg0 ^ 0xFFFFFFF0);
                return;
            }
            this.field8585.method3498(this.field8601, 89);
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V", line = 172)
    public final void method3573(int arg0) {
        field8598++;
        if (this.field8595) {
            return;
        }
        for (class619 var2 = (class619) this.field8579.method821((byte) 119); var2 != null; var2 = (class619) this.field8579.method818(113)) {
            var2.method804((byte) 118);
            var2.field8305.method602();
        }
        if (arg0 == 50) {
            this.field8601.method602();
            this.field8591.method602();
            this.field8587.method602();
            this.field8595 = true;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLjava/lang/String;)V", line = 201)
    public final void method3574(byte arg0, String arg1) {
        field8575++;
        this.field8603 = arg1;
        if (this.field8603 == null) {
            this.field8593 = null;
            return;
        }
        if (arg0 >= -74) {
            this.field8603 = null;
        }
        if (this.field8593 != null && !this.field8603.equals(this.field8593.method1016((byte) -74))) {
            this.field8593 = null;
        }
        if (this.field8593 != null) {
            return;
        }
        for (class619 var3 = (class619) this.field8579.method821((byte) 113); var3 != null; var3 = (class619) this.field8579.method818(97)) {
            if (var3 instanceof class164) {
                class164 var4 = (class164) var3;
                if (this.field8603.equals(var4.method1016((byte) -60))) {
                    this.field8593 = var4;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)Lpl;", line = 255)
    private final class619 method3575(byte arg0) throws IOException {
        field8580++;
        if (arg0 <= 6) {
            return null;
        } else if (this.field8595) {
            throw new IllegalStateException();
        } else if (this.field8578) {
            return null;
        } else {
            while (this.field8587.pageOut(this.field8591) <= 0) {
                int var10 = this.method720(this.field8581, 127);
                if (var10 == -1) {
                    this.field8578 = true;
                    return null;
                }
                if (var10 == 0) {
                    return null;
                }
                if (!this.field8587.write(this.field8581, var10)) {
                    throw new RuntimeException("");
                }
            }
            int var2 = this.field8591.getSerialNumber();
            if (!this.field8591.isBOS()) {
                class619 var9 = (class619) this.field8579.method812(109, (long) var2);
                if (!var9.field8305.pageIn(this.field8591)) {
                    throw new IllegalStateException();
                }
                return var9;
            }
            OggStreamState var3 = new OggStreamState(var2);
            if (!var3.pageIn(this.field8591)) {
                throw new IllegalStateException();
            } else if (var3.packetPeek(this.field8601) == 1) {
                class619 var4;
                if (this.field8585 == null && this.field8601.isTheora()) {
                    this.field8585 = new class127(var3);
                    var4 = this.field8585;
                } else if (this.field8583 == null && this.field8601.isVorbis()) {
                    this.field8583 = new class750(var3);
                    var4 = this.field8583;
                } else {
                    byte[] var5 = this.field8601.getData();
                    StringBuffer var6 = new StringBuffer();
                    for (int var7 = 1; var7 < var5.length && Character.isLetterOrDigit((char) var5[var7]); var7++) {
                        var6.append((char) var5[var7]);
                    }
                    String var8 = var6.toString();
                    if (var8.equals("kate")) {
                        var4 = new class164(var3);
                    } else {
                        var4 = new class675(var3);
                    }
                }
                this.field8579.method820((long) var2, (byte) -42, var4);
                return var4;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)Z", line = 376)
    public final boolean method3576(int arg0) {
        field8594++;
        if (this.field8595 || this.field8578) {
            if (arg0 != -1) {
                this.field8585 = null;
            }
            return this.field8583 == null || this.field8583.method4164((byte) -119) <= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)Luc;", line = 394)
    public final class127 method3577(int arg0) {
        if (arg0 == 1) {
            field8590++;
            return this.field8585;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)D", line = 405)
    public final double method3578(int arg0) {
        field8596++;
        if (arg0 != 0) {
            this.field8593 = null;
        }
        if (this.field8583 == null) {
            return this.field8585 == null ? 0.0D : this.field8585.method801((byte) -82);
        } else {
            return this.field8583.method4165(arg0);
        }
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)V", line = 426)
    private final void method3579(int arg0) {
        field8576++;
        if (arg0 > -96) {
            return;
        }
        for (class619 var2 = (class619) this.field8579.method821((byte) 123); var2 != null; var2 = (class619) this.field8579.method818(41)) {
            if (var2 instanceof class164) {
                class164 var3 = (class164) var2;
                while ((var3.field8306 <= 8 || this.method3578(0) > (double) var3.method1019(1425)) && var3.field8305.packetOut(this.field8601) == 1) {
                    var3.method3498(this.field8601, 68);
                }
            }
        }
        this.method3574((byte) -92, this.field8603);
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(B)V", line = 465)
    public static void method3580(byte arg0) {
        if (arg0 >= -24) {
            method3580((byte) -85);
        }
        field8584 = null;
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)Ljaa;", line = 479)
    public final class750 method3581(int arg0) {
        if (arg0 != -452) {
            this.field8599 = true;
        }
        field8600++;
        return this.field8583;
    }

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "(I)V", line = 490)
    private final void method3582(int arg0) throws IOException {
        if (arg0 < 99) {
            method3580((byte) 22);
        }
        field8592++;
        while (this.field8585.field8305.packetOut(this.field8601) != 1) {
            class619 var2 = this.method3575((byte) 111);
            if (var2 == null) {
                if (this.field8578) {
                    this.method3572((byte) -62);
                }
                return;
            }
            if (this.field8593 == var2) {
                this.method3579(-104);
            }
        }
        this.field8585.method3498(this.field8601, 77);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)V", line = 521)
    public final void method3583(int arg0, boolean arg1) {
        if (this.field8583 != null) {
            class463 var3 = this.field8583.method4168((byte) 90);
            if (var3 != null) {
                var3.method2837(true, arg1);
            }
        }
        if (arg0 != 1659) {
            this.method3573(124);
        }
        field8582++;
        this.field8599 = !this.field8599;
    }

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "(I)Lij;", line = 546)
    public final class164 method3584(int arg0) {
        if (arg0 != 1) {
            this.field8599 = true;
        }
        field8589++;
        return this.field8593;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(B)Z", line = 570)
    private final boolean method3585(byte arg0) {
        field8588++;
        if (arg0 < 3) {
            return false;
        } else if (this.field8583 == null) {
            double var2 = (double) this.field8585.method798(32);
            return var2 == 0.0D || (double) class97.method664((byte) -50) >= (double) this.field8585.method800(0) + 1000.0D / var2;
        } else {
            return !this.field8585.method796((byte) 28) || this.method3578(0) > this.field8585.method801((byte) -82);
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I)V", line = 589)
    public class641(int arg0) {
        if (!class715.method4015("jagtheora", -1)) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field8581 = new byte[arg0];
        this.field8587 = new OggSyncState();
        this.field8591 = new OggPage();
        this.field8601 = new OggPacket();
        this.field8579 = new class130(8);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([BI)I")
    public abstract int method720(byte[] arg0, int arg1) throws IOException;
}
