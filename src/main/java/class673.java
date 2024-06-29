import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public abstract class class673 {

    @OriginalMember(owner = "client!mea", name = "g", descriptor = "[B")
    private byte[] field9462;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field9457;

    @OriginalMember(owner = "client!mea", name = "j", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field9465;

    @OriginalMember(owner = "client!mea", name = "C", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field9484;

    @OriginalMember(owner = "client!mea", name = "i", descriptor = "Lgca;")
    private class209 field9464;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
    public static int field9456;

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "I")
    public static int field9459;

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "I")
    public static int field9460;

    @OriginalMember(owner = "client!mea", name = "h", descriptor = "I")
    public static int field9463;

    @OriginalMember(owner = "client!mea", name = "l", descriptor = "I")
    public static int field9467;

    @OriginalMember(owner = "client!mea", name = "m", descriptor = "I")
    public static int field9468;

    @OriginalMember(owner = "client!mea", name = "o", descriptor = "I")
    public static int field9470;

    @OriginalMember(owner = "client!mea", name = "q", descriptor = "I")
    public static int field9472;

    @OriginalMember(owner = "client!mea", name = "r", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!mea", name = "s", descriptor = "I")
    public static int field9474;

    @OriginalMember(owner = "client!mea", name = "u", descriptor = "I")
    public static int field9476;

    @OriginalMember(owner = "client!mea", name = "v", descriptor = "I")
    public static int field9477;

    @OriginalMember(owner = "client!mea", name = "y", descriptor = "I")
    public static int field9480;

    @OriginalMember(owner = "client!mea", name = "A", descriptor = "I")
    public static int field9482;

    @OriginalMember(owner = "client!mea", name = "B", descriptor = "I")
    public static int field9483;

    @OriginalMember(owner = "client!mea", name = "t", descriptor = "Lwda;")
    private class168 field9475;

    @OriginalMember(owner = "client!mea", name = "E", descriptor = "Lop;")
    private class412 field9486;

    @OriginalMember(owner = "client!mea", name = "D", descriptor = "Lbr;")
    private class424 field9485;

    @OriginalMember(owner = "client!mea", name = "n", descriptor = "Lwu;")
    public static class557 field9469;

    @OriginalMember(owner = "client!mea", name = "w", descriptor = "Ljava/lang/String;")
    private String field9478;

    @OriginalMember(owner = "client!mea", name = "f", descriptor = "Z")
    private boolean field9461;

    @OriginalMember(owner = "client!mea", name = "k", descriptor = "Z")
    private boolean field9466;

    @OriginalMember(owner = "client!mea", name = "x", descriptor = "Z")
    private boolean field9479;

    @OriginalMember(owner = "client!mea", name = "z", descriptor = "Z")
    private boolean field9481;

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "[I")
    public static int[] field9458;

    @OriginalMember(owner = "client!mea", name = "p", descriptor = "[I")
    public static int[] field9471;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)Z", line = 5)
    private final boolean method3847(int arg0) {
        if (arg0 != 0) {
            this.field9475 = null;
        }
        field9459++;
        if (this.field9475 == null) {
            double var2 = (double) this.field9485.method2589(arg0 - 62);
            return var2 == 0.0D || (double) class224.method1457((byte) -62) >= 1000.0D / var2 + (double) this.field9485.method2583((byte) -120);
        } else {
            return !this.field9485.method2584(0) || this.method3857(0) > this.field9485.method2586(arg0);
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)Lbr;", line = 25)
    public final class424 method3848(boolean arg0) {
        if (!arg0) {
            field9471 = null;
        }
        field9468++;
        return this.field9485;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)V", line = 37)
    public final void method3849(byte arg0) {
        field9473++;
        if (this.field9481) {
            return;
        }
        for (class719 var2 = (class719) this.field9464.method1382(27901); var2 != null; var2 = (class719) this.field9464.method1383(false)) {
            var2.method940(115);
            var2.field10153.method519();
        }
        this.field9484.method519();
        this.field9465.method519();
        if (arg0 != 22) {
            this.method3860(false);
        }
        this.field9457.method519();
        this.field9481 = true;
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(Z)V", line = 65)
    private final void method3850(boolean arg0) {
        field9476++;
        for (class719 var2 = (class719) this.field9464.method1382(27901); var2 != null; var2 = (class719) this.field9464.method1383(false)) {
            if (this.field9485 != var2) {
                while (var2.field10153.packetOut() == 1) {
                    var2.method4036(this.field9484, (byte) 111);
                }
            }
        }
        if (!arg0) {
            method3855(-74, true);
        }
        if (this.field9485 == null) {
            return;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (!this.method3847(0)) {
                return;
            }
            if (this.field9485.field10153.packetOut() != 1) {
                this.method3849((byte) 22);
                return;
            }
            this.field9485.method4036(this.field9484, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(I)V", line = 114)
    public final void method3851(int arg0) throws IOException {
        field9472++;
        if (arg0 != 0) {
            this.field9486 = null;
        }
        if (this.field9461) {
            return;
        }
        while (!this.field9481) {
            class719 var2;
            if (this.field9479) {
                var2 = (class719) this.field9464.method1381(true, (long) this.field9465.getSerialNumber());
            } else {
                var2 = this.method3856(122);
                if (var2 == null) {
                    if (this.field9466) {
                        this.method3850(true);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field9479 = true;
            }
            if (this.field9475 == var2) {
                if (this.field9475.method1061(85) >= 50) {
                    return;
                }
                while (this.field9475.field10153.packetOut(this.field9484) == 1) {
                    this.field9475.method4036(this.field9484, (byte) 111);
                    this.method3853(arg0 - 13294);
                    if (this.field9485 != null) {
                        double var3 = this.field9485.method2586(0);
                        for (int var5 = 0; var5 < 10 && this.method3847(0); var5++) {
                            this.method3859(-46);
                            if (this.field9481) {
                                return;
                            }
                        }
                        if (var3 < this.field9485.method2586(0)) {
                            return;
                        }
                    }
                    if (this.field9475.method1061(118) >= 50) {
                        return;
                    }
                }
            } else if (var2 instanceof class412) {
                this.method3853(arg0 - 13294);
            } else if (this.field9485 != var2) {
                while (var2.field10153.packetOut(this.field9484) == 1) {
                    if (var2.field10155 == 1 && var2 instanceof class412) {
                        this.method3854((byte) -123, this.field9478);
                    }
                    var2.method4036(this.field9484, (byte) 111);
                }
            } else if (this.field9475 == null && !this.field9461) {
                for (int var6 = 0; var6 < 10 && this.method3847(0); var6++) {
                    this.method3859(-89);
                    if (this.field9481) {
                        return;
                    }
                }
                return;
            }
            this.field9479 = false;
        }
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(B)Lop;", line = 236)
    public final class412 method3852(byte arg0) {
        if (arg0 != 112) {
            this.method3858(-20, false);
        }
        field9470++;
        return this.field9486;
    }

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "(I)V", line = 249)
    private final void method3853(int arg0) {
        field9482++;
        for (class719 var2 = (class719) this.field9464.method1382(27901); var2 != null; var2 = (class719) this.field9464.method1383(false)) {
            if (var2 instanceof class412) {
                class412 var3 = (class412) var2;
                while ((var3.field10155 <= 8 || this.method3857(0) > (double) var3.method2510((byte) -30)) && var3.field10153.packetOut(this.field9484) == 1) {
                    var3.method4036(this.field9484, (byte) 111);
                }
            }
        }
        if (arg0 == -13294) {
            this.method3854((byte) -125, this.field9478);
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(BLjava/lang/String;)V", line = 285)
    public final void method3854(byte arg0, String arg1) {
        if (arg0 > -113) {
            this.method3857(85);
        }
        this.field9478 = arg1;
        field9480++;
        if (this.field9478 == null) {
            this.field9486 = null;
            return;
        }
        if (this.field9486 != null && !this.field9478.equals(this.field9486.method2511(16))) {
            this.field9486 = null;
        }
        if (this.field9486 != null) {
            return;
        }
        for (class719 var3 = (class719) this.field9464.method1382(27901); var3 != null; var3 = (class719) this.field9464.method1383(false)) {
            if (var3 instanceof class412) {
                class412 var4 = (class412) var3;
                if (this.field9478.equals(var4.method2511(16))) {
                    this.field9486 = var4;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZ)I", line = 337)
    public static final int method3855(int arg0, boolean arg1) {
        field9483++;
        if (class586.field8431 == null) {
            return 0;
        } else if (arg1 || class714.field10131 == null) {
            int var2 = 0;
            if (arg0 != -22016) {
                field9471 = null;
            }
            for (int var3 = 0; var3 < class586.field8431.length; var3++) {
                int var4 = class586.field8431[var3];
                if (class565.field8032.method3340(arg0 + 22016, var4)) {
                    var2++;
                }
                if (field9469.method3340(0, var4)) {
                    var2++;
                }
            }
            return var2;
        } else {
            return class586.field8431.length * 2;
        }
    }

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "(I)Lbda;", line = 373)
    private final class719 method3856(int arg0) throws IOException {
        field9460++;
        if (this.field9481) {
            throw new IllegalStateException();
        } else if (arg0 < 86) {
            return null;
        } else if (this.field9466) {
            return null;
        } else {
            while (this.field9457.pageOut(this.field9465) <= 0) {
                int var10 = this.method307(1, this.field9462);
                if (var10 == -1) {
                    this.field9466 = true;
                    return null;
                }
                if (var10 == 0) {
                    return null;
                }
                if (!this.field9457.write(this.field9462, var10)) {
                    throw new RuntimeException("");
                }
            }
            int var2 = this.field9465.getSerialNumber();
            if (!this.field9465.isBOS()) {
                class719 var3 = (class719) this.field9464.method1381(true, (long) var2);
                if (!var3.field10153.pageIn(this.field9465)) {
                    throw new IllegalStateException();
                }
                return var3;
            }
            OggStreamState var4 = new OggStreamState(var2);
            if (!var4.pageIn(this.field9465)) {
                throw new IllegalStateException();
            } else if (var4.packetPeek(this.field9484) == 1) {
                class719 var5;
                if (this.field9485 == null && this.field9484.isTheora()) {
                    this.field9485 = new class424(var4);
                    var5 = this.field9485;
                } else if (this.field9475 == null && this.field9484.isVorbis()) {
                    this.field9475 = new class168(var4);
                    var5 = this.field9475;
                } else {
                    byte[] var6 = this.field9484.getData();
                    StringBuffer var7 = new StringBuffer();
                    for (int var8 = 1; var6.length > var8 && Character.isLetterOrDigit((char) var6[var8]); var8++) {
                        var7.append((char) var6[var8]);
                    }
                    String var9 = var7.toString();
                    if (var9.equals("kate")) {
                        var5 = new class412(var4);
                    } else {
                        var5 = new class144(var4);
                    }
                }
                this.field9464.method1387(var5, (long) var2, (byte) -110);
                return var5;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "(I)D", line = 491)
    public final double method3857(int arg0) {
        field9456++;
        if (this.field9475 != null) {
            return this.field9475.method1062(0);
        } else if (arg0 == 0) {
            return this.field9485 == null ? 0.0D : this.field9485.method2586(arg0);
        } else {
            return -0.2791534258237383D;
        }
    }

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "(IZ)V", line = 518)
    public final void method3858(int arg0, boolean arg1) {
        int var3 = 29 / ((arg0 - 76) / 46);
        if (this.field9475 != null) {
            class560 var4 = this.field9475.method1064((byte) -41);
            if (var4 != null) {
                var4.method3348(0, arg1);
            }
        }
        field9474++;
        this.field9461 = !this.field9461;
    }

    @OriginalMember(owner = "client!mea", name = "f", descriptor = "(I)V", line = 538)
    private final void method3859(int arg0) throws IOException {
        field9463++;
        while (this.field9485.field10153.packetOut(this.field9484) != 1) {
            class719 var2 = this.method3856(116);
            if (var2 == null) {
                if (this.field9466) {
                    this.method3850(true);
                }
                return;
            }
            if (this.field9486 == var2) {
                this.method3853(-13294);
            }
        }
        this.field9485.method4036(this.field9484, (byte) 111);
        if (arg0 > -45) {
            this.field9478 = null;
        }
    }

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "(Z)Z", line = 576)
    public final boolean method3860(boolean arg0) {
        field9467++;
        if (!this.field9481 && !this.field9466) {
            return false;
        } else if (this.field9475 == null || this.field9475.method1061(94) <= 0) {
            if (!arg0) {
                this.method3858(-42, false);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "(B)V", line = 596)
    public static void method3861(byte arg0) {
        field9458 = null;
        if (arg0 != -111) {
            field9471 = null;
        }
        field9471 = null;
        field9469 = null;
    }

    @OriginalMember(owner = "client!mea", name = "g", descriptor = "(I)Lwda;", line = 609)
    public final class168 method3862(int arg0) {
        field9477++;
        if (arg0 >= -78) {
            this.method3860(true);
        }
        return this.field9475;
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(I)V", line = 622)
    public class673(int arg0) {
        if (!class389.method2365("jagtheora", (byte) -106)) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field9462 = new byte[arg0];
        this.field9457 = new OggSyncState();
        this.field9465 = new OggPage();
        this.field9484 = new OggPacket();
        this.field9464 = new class209(8);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I[B)I")
    public abstract int method307(int arg0, byte[] arg1) throws IOException;
}
