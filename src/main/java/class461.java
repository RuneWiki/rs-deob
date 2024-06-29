import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public abstract class class461 {

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "[B")
    private byte[] field6393;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field6377;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field6384;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field6372;

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "Lee;")
    private class706 field6380;

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "Lss;")
    public static class457 field6387 = new class457();

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
    public static int field6389 = 0;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field6368;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!gr", name = "B", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!gr", name = "C", descriptor = "Liv;")
    private class106 field6392;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "Laj;")
    public static class333 field6394;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "Ltda;")
    private class665 field6371;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "Ldv;")
    private class687 field6381;

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "Ljava/lang/String;")
    private String field6376;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "Z")
    private boolean field6366;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "Z")
    private boolean field6370;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "Z")
    private boolean field6374;

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "Z")
    private boolean field6390;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 3)
    public final void method2718(int arg0) throws IOException {
        field6388++;
        if (arg0 != -2 || this.field6390) {
            return;
        }
        while (!this.field6366) {
            class181 var2;
            if (this.field6374) {
                var2 = (class181) this.field6380.method3953((long) this.field6384.getSerialNumber(), arg0 ^ 0xFFFFFFF0);
            } else {
                var2 = this.method2733((byte) -92);
                if (var2 == null) {
                    if (this.field6370) {
                        this.method2725(arg0 - 13864);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field6374 = true;
            }
            if (this.field6371 == var2) {
                if (this.field6371.method3688(105) >= 50) {
                    return;
                }
                while (this.field6371.field2400.packetOut(this.field6372) == 1) {
                    this.field6371.method1259(true, this.field6372);
                    this.method2734(8);
                    if (this.field6381 != null) {
                        double var4 = this.field6381.method3813(-1);
                        for (int var6 = 0; var6 < 10 && this.method2727((byte) 47); var6++) {
                            this.method2729(19);
                            if (this.field6366) {
                                return;
                            }
                        }
                        if (var4 < this.field6381.method3813(arg0 + 1)) {
                            return;
                        }
                    }
                    if (this.field6371.method3688(arg0 ^ 0xFFFFFF8E) >= 50) {
                        return;
                    }
                }
            } else if ((var2 instanceof class106)) {
                this.method2734(8);
            } else if (this.field6381 != var2) {
                while (var2.field2400.packetOut(this.field6372) == 1) {
                    if (var2.field2398 == 1 && var2 instanceof class106) {
                        this.method2731(this.field6376, -2);
                    }
                    var2.method1259(true, this.field6372);
                }
            } else if (this.field6371 == null && !this.field6390) {
                for (int var3 = 0; var3 < 10 && this.method2727((byte) 125); var3++) {
                    this.method2729(21);
                    if (this.field6366) {
                        return;
                    }
                }
                return;
            }
            this.field6374 = false;
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V", line = 122)
    public final void method2719(int arg0) {
        field6391++;
        if (this.field6366) {
            return;
        }
        for (class181 var2 = (class181) this.field6380.method3960(0); var2 != null; var2 = (class181) this.field6380.method3955((byte) -91)) {
            var2.method388(-30243);
            var2.field2400.method4110();
        }
        this.field6372.method4110();
        this.field6384.method4110();
        if (arg0 != -2) {
            method2730(true);
        }
        this.field6377.method4110();
        this.field6366 = true;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)Z", line = 150)
    public final boolean method2720(boolean arg0) {
        if (!arg0) {
            return false;
        }
        field6364++;
        if (this.field6366 || this.field6370) {
            return this.field6371 == null || this.field6371.method3688(108) <= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(I)Ldv;", line = 167)
    public final class687 method2721(int arg0) {
        if (arg0 <= 7) {
            return null;
        } else {
            field6367++;
            return this.field6381;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)V", line = 179)
    public final void method2722(boolean arg0, int arg1) {
        if (this.field6371 != null) {
            class501 var3 = this.field6371.method3683((byte) -96);
            if (var3 != null) {
                var3.method2902(arg0, 109);
            }
        }
        if (arg1 > -15) {
            this.field6384 = null;
        }
        field6369++;
        this.field6390 = !this.field6390;
    }

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "(I)Liv;", line = 199)
    public final class106 method2723(int arg0) {
        if (arg0 == 15570) {
            field6365++;
            return this.field6392;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "(I)V", line = 218)
    private final void method2725(int arg0) {
        if (arg0 != -13866) {
            field6389 = 26;
        }
        field6386++;
        for (class181 var2 = (class181) this.field6380.method3960(0); var2 != null; var2 = (class181) this.field6380.method3955((byte) -116)) {
            if (this.field6381 != var2) {
                while (var2.field2400.packetOut() == 1) {
                    var2.method1259(true, this.field6372);
                }
            }
        }
        if (this.field6381 == null) {
            return;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (!this.method2727((byte) 93)) {
                return;
            }
            if (this.field6381.field2400.packetOut() != 1) {
                this.method2719(arg0 + 13864);
                return;
            }
            this.field6381.method1259(true, this.field6372);
        }
    }

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "(I)Ltda;", line = 260)
    public final class665 method2726(int arg0) {
        if (arg0 != -2) {
            this.field6377 = null;
        }
        field6382++;
        return this.field6371;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)Z", line = 271)
    private final boolean method2727(byte arg0) {
        field6379++;
        if (arg0 <= 37) {
            this.field6374 = true;
        }
        if (this.field6371 == null) {
            double var2 = (double) this.field6381.method3812((byte) -24);
            return var2 == 0.0D || (double) class302.method1910(0) >= 1000.0D / var2 + (double) this.field6381.method3817(false);
        } else {
            return !this.field6381.method3815(false) || this.method2732(0) > this.field6381.method3813(-1);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)I", line = 294)
    public static final int method2728(int arg0, int arg1) {
        field6375++;
        return arg1 == -7562 ? arg0 >>> 8 : -85;
    }

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "(I)V", line = 306)
    private final void method2729(int arg0) throws IOException {
        field6383++;
        while (this.field6381.field2400.packetOut(this.field6372) != 1) {
            class181 var2 = this.method2733((byte) 104);
            if (var2 == null) {
                if (this.field6370) {
                    this.method2725(-13866);
                }
                return;
            }
            if (this.field6392 == var2) {
                this.method2734(8);
            }
        }
        this.field6381.method1259(true, this.field6372);
        if (arg0 <= 10) {
            this.method2723(-29);
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(Z)V", line = 337)
    public static void method2730(boolean arg0) {
        if (arg0) {
            method2730(false);
        }
        field6394 = null;
        field6387 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 352)
    public final void method2731(String arg0, int arg1) {
        field6378++;
        this.field6376 = arg0;
        if (this.field6376 == null) {
            this.field6392 = null;
            return;
        }
        if (this.field6392 != null && !this.field6376.equals(this.field6392.method811(-61))) {
            this.field6392 = null;
        }
        if (this.field6392 == null) {
            for (class181 var3 = (class181) this.field6380.method3960(arg1 + 2); var3 != null; var3 = (class181) this.field6380.method3955((byte) -71)) {
                if (var3 instanceof class106) {
                    class106 var4 = (class106) var3;
                    if (this.field6376.equals(var4.method811(-127))) {
                        this.field6392 = var4;
                        return;
                    }
                }
            }
        }
        if (arg1 != -2) {
            this.method2727((byte) 45);
        }
    }

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "(I)D", line = 404)
    public final double method2732(int arg0) {
        field6368++;
        if (this.field6371 != null) {
            return this.field6371.method3687(-22940);
        } else if (arg0 == 0) {
            return this.field6381 == null ? 0.0D : this.field6381.method3813(-1);
        } else {
            return -1.1578172819520183D;
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)Lld;", line = 429)
    private final class181 method2733(byte arg0) throws IOException {
        field6373++;
        if (this.field6366) {
            throw new IllegalStateException();
        } else if (this.field6370) {
            return null;
        } else {
            while (this.field6377.pageOut(this.field6384) <= 0) {
                int var11 = this.method2724(this.field6393, (byte) -59);
                if (var11 == -1) {
                    this.field6370 = true;
                    return null;
                }
                if (var11 == 0) {
                    return null;
                }
                if (!this.field6377.write(this.field6393, var11)) {
                    throw new RuntimeException("");
                }
            }
            int var2 = 69 % ((-arg0 - 13) / 39);
            int var3 = this.field6384.getSerialNumber();
            if (!this.field6384.isBOS()) {
                class181 var4 = (class181) this.field6380.method3953((long) var3, 14);
                if (!var4.field2400.pageIn(this.field6384)) {
                    throw new IllegalStateException();
                }
                return var4;
            }
            OggStreamState var5 = new OggStreamState(var3);
            if (!var5.pageIn(this.field6384)) {
                throw new IllegalStateException();
            } else if (var5.packetPeek(this.field6372) == 1) {
                class181 var6;
                if (this.field6381 == null && this.field6372.isTheora()) {
                    this.field6381 = new class687(var5);
                    var6 = this.field6381;
                } else if (this.field6371 == null && this.field6372.isVorbis()) {
                    this.field6371 = new class665(var5);
                    var6 = this.field6371;
                } else {
                    byte[] var7 = this.field6372.getData();
                    StringBuffer var8 = new StringBuffer();
                    for (int var9 = 1; var9 < var7.length && Character.isLetterOrDigit((char) var7[var9]); var9++) {
                        var8.append((char) var7[var9]);
                    }
                    String var10 = var8.toString();
                    if (var10.equals("kate")) {
                        var6 = new class106(var5);
                    } else {
                        var6 = new class53(var5);
                    }
                }
                this.field6380.method3962((long) var3, var6, -108);
                return var6;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "(I)V", line = 562)
    private final void method2734(int arg0) {
        for (class181 var2 = (class181) this.field6380.method3960(0); var2 != null; var2 = (class181) this.field6380.method3955((byte) 43)) {
            if (var2 instanceof class106) {
                class106 var3 = (class106) var2;
                while ((var3.field2398 <= 8 || this.method2732(arg0 ^ 0x8) > (double) var3.method809((byte) 76)) && var3.field2400.packetOut(this.field6372) == 1) {
                    var3.method1259(true, this.field6372);
                }
            }
        }
        field6385++;
        if (arg0 != 8) {
            this.method2720(true);
        }
        this.method2731(this.field6376, arg0 - 10);
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(I)V", line = 598)
    public class461(int arg0) {
        if (!class295.method1877(63, "jagtheora")) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field6393 = new byte[arg0];
        this.field6377 = new OggSyncState();
        this.field6384 = new OggPage();
        this.field6372 = new OggPacket();
        this.field6380 = new class706(8);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "([BB)I")
    public abstract int method2724(byte[] arg0, byte arg1) throws IOException;
}
