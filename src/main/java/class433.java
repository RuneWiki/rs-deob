import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public abstract class class433 {

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "[B")
    private byte[] field6243;

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field6250;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field6258;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field6237;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "Ltca;")
    private class184 field6248;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "Ljb;")
    public static class519 field6249 = new class519(40, 2);

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "Ljb;")
    public static class519 field6259 = new class519(18, -1);

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "Lgn;")
    private class728 field6251;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "Lhb;")
    private class755 field6244;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "Lu;")
    private class81 field6241;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Ljava/lang/String;")
    private String field6235;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Z")
    private boolean field6232;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "Z")
    private boolean field6239;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "Z")
    private boolean field6246;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "Z")
    private boolean field6253;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBI)I", line = 3)
    public static final int method2584(int arg0, byte arg1, int arg2) {
        if (arg1 != 109) {
            method2585((byte) 72);
        }
        field6242++;
        int var3 = 0;
        while (arg0 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
            arg0--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 24)
    public static void method2585(byte arg0) {
        field6259 = null;
        if (arg0 <= 37) {
            method2585((byte) -36);
        }
        field6249 = null;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)V", line = 37)
    public final void method2586(byte arg0) throws IOException {
        field6229++;
        if (this.field6232) {
            return;
        }
        while (!this.field6239) {
            class111 var3;
            if (this.field6246) {
                var3 = (class111) this.field6248.method1248(116, (long) this.field6258.getSerialNumber());
            } else {
                var3 = this.method2595((byte) 126);
                if (var3 == null) {
                    if (this.field6253) {
                        this.method2588(88);
                    }
                    return;
                }
                if (var3 == null) {
                    throw new IllegalStateException();
                }
                this.field6246 = true;
            }
            if (this.field6251 == var3) {
                if (this.field6251.method4024(true) >= 50) {
                    return;
                }
                while (this.field6251.field1530.packetOut(this.field6237) == 1) {
                    this.field6251.method829(this.field6237, 66);
                    this.method2587(123);
                    if (this.field6241 != null) {
                        double var4 = this.field6241.method641(true);
                        for (int var6 = 0; var6 < 10 && this.method2590(0); var6++) {
                            this.method2597(-110);
                            if (this.field6239) {
                                return;
                            }
                        }
                        if (this.field6241.method641(true) > var4) {
                            return;
                        }
                    }
                    if (this.field6251.method4024(true) >= 50) {
                        return;
                    }
                }
            } else if (var3 instanceof class755) {
                this.method2587(104);
            } else if (this.field6241 != var3) {
                while (var3.field1530.packetOut(this.field6237) == 1) {
                    if (var3.field1531 == 1 && var3 instanceof class755) {
                        this.method2601(this.field6235, (byte) 103);
                    }
                    var3.method829(this.field6237, 66);
                }
            } else if (this.field6251 == null && !this.field6232) {
                for (int var7 = 0; var7 < 10 && this.method2590(0); var7++) {
                    this.method2597(64);
                    if (this.field6239) {
                        return;
                    }
                }
                return;
            }
            this.field6246 = false;
        }
        int var2 = 110 / ((arg0 - 76) / 48);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 156)
    private final void method2587(int arg0) {
        if (arg0 <= 103) {
            this.method2587(-96);
        }
        for (class111 var2 = (class111) this.field6248.method1249((byte) -118); var2 != null; var2 = (class111) this.field6248.method1246(true)) {
            if (var2 instanceof class755) {
                class755 var3 = (class755) var2;
                while ((var3.field1531 <= 8 || this.method2592(false) > (double) var3.method4141((byte) 106)) && var3.field1530.packetOut(this.field6237) == 1) {
                    var3.method829(this.field6237, 70);
                }
            }
        }
        field6257++;
        this.method2601(this.field6235, (byte) 24);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 192)
    private final void method2588(int arg0) {
        field6255++;
        if (arg0 < 50) {
            return;
        }
        for (class111 var2 = (class111) this.field6248.method1249((byte) -114); var2 != null; var2 = (class111) this.field6248.method1246(true)) {
            if (this.field6241 != var2) {
                while (var2.field1530.packetOut() == 1) {
                    var2.method829(this.field6237, 62);
                }
            }
        }
        if (this.field6241 == null) {
            return;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (!this.method2590(0)) {
                return;
            }
            if (this.field6241.field1530.packetOut() != 1) {
                this.method2591(false);
                return;
            }
            this.field6241.method829(this.field6237, 115);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lha;Ljs;ILef;ZIIILsu;)V", line = 239)
    public static final void method2589(class66 arg0, class349 arg1, int arg2, class513 arg3, boolean arg4, int arg5, int arg6, int arg7, class223 arg8) {
        field6233++;
        int var9 = arg6 - (arg7 / 2) - 5;
        int var10 = arg5 + 2;
        if (arg1.field5058 != 0) {
            arg0.method529(arg2 * arg3.method2996() + (arg5 + 1 - var10), var10, arg7 + 10, var9, arg1.field5058, 1);
        }
        if (arg1.field5101 != 0) {
            arg0.method553(arg7 + 10, var9, var10, arg1.field5101, 99, arg5 + (arg3.method2996() * arg2) - (var10 - 1));
        }
        int var11 = arg1.field5073;
        if (arg8.field2891 && arg1.field5097 != -1) {
            var11 = arg1.field5097;
        }
        if (!arg4) {
            method2585((byte) -93);
        }
        for (int var12 = 0; var12 < arg2; var12++) {
            String var13 = class571.field7777[var12];
            if (arg2 - 1 > var12) {
                var13 = var13.substring(0, var13.length() - 4);
            }
            arg3.method3000(arg0, var13, arg6, arg5, var11, true);
            arg5 += arg3.method2996();
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)Z", line = 281)
    private final boolean method2590(int arg0) {
        field6231++;
        if (arg0 != 0) {
            return true;
        } else if (this.field6251 == null) {
            double var2 = (double) this.field6241.method645((byte) 113);
            return var2 == 0.0D || (double) class401.method2440(false) >= (double) this.field6241.method642(-1) + 1000.0D / var2;
        } else {
            return !this.field6241.method644(99) || this.method2592(false) > this.field6241.method641(true);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V", line = 301)
    public final void method2591(boolean arg0) {
        field6230++;
        if (this.field6239) {
            return;
        }
        class111 var2 = (class111) this.field6248.method1249((byte) -110);
        if (arg0) {
            return;
        }
        while (var2 != null) {
            var2.method643(-1);
            var2.field1530.method4074();
            var2 = (class111) this.field6248.method1246(true);
        }
        this.field6237.method4074();
        this.field6258.method4074();
        this.field6250.method4074();
        this.field6239 = true;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Z)D", line = 332)
    public final double method2592(boolean arg0) {
        field6238++;
        if (this.field6251 != null) {
            return this.field6251.method4027(-113);
        } else if (this.field6241 == null) {
            if (arg0) {
                this.field6235 = null;
            }
            return 0.0D;
        } else {
            return this.field6241.method641(!arg0);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)V", line = 354)
    public final void method2593(int arg0, boolean arg1) {
        if (arg0 != 1) {
            return;
        }
        if (this.field6251 != null) {
            class774 var3 = this.field6251.method4028(-57);
            if (var3 != null) {
                var3.method4256(arg0 + 28, arg1);
            }
        }
        field6236++;
        this.field6232 = !this.field6232;
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)Z", line = 375)
    public final boolean method2594(int arg0) {
        field6254++;
        if (!this.field6239 && !this.field6253) {
            return false;
        } else if (this.field6251 == null || this.field6251.method4024(true) <= 0) {
            if (arg0 <= 100) {
                this.method2594(123);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(B)Lqha;", line = 395)
    private final class111 method2595(byte arg0) throws IOException {
        field6240++;
        if (this.field6239) {
            throw new IllegalStateException();
        } else if (this.field6253) {
            return null;
        } else {
            while (this.field6250.pageOut(this.field6258) <= 0) {
                int var10 = this.method2600(0, this.field6243);
                if (var10 == -1) {
                    this.field6253 = true;
                    return null;
                }
                if (var10 == 0) {
                    return null;
                }
                if (!this.field6250.write(this.field6243, var10)) {
                    throw new RuntimeException("");
                }
            }
            if (arg0 < 103) {
                return null;
            }
            int var2 = this.field6258.getSerialNumber();
            if (!this.field6258.isBOS()) {
                class111 var9 = (class111) this.field6248.method1248(110, (long) var2);
                if (!var9.field1530.pageIn(this.field6258)) {
                    throw new IllegalStateException();
                }
                return var9;
            }
            OggStreamState var3 = new OggStreamState(var2);
            if (!var3.pageIn(this.field6258)) {
                throw new IllegalStateException();
            } else if (var3.packetPeek(this.field6237) == 1) {
                class111 var4;
                if (this.field6241 == null && this.field6237.isTheora()) {
                    this.field6241 = new class81(var3);
                    var4 = this.field6241;
                } else if (this.field6251 == null && this.field6237.isVorbis()) {
                    this.field6251 = new class728(var3);
                    var4 = this.field6251;
                } else {
                    byte[] var5 = this.field6237.getData();
                    StringBuffer var6 = new StringBuffer();
                    for (int var7 = 1; var7 < var5.length && Character.isLetterOrDigit((char) var5[var7]); var7++) {
                        var6.append((char) var5[var7]);
                    }
                    String var8 = var6.toString();
                    if (var8.equals("kate")) {
                        var4 = new class755(var3);
                    } else {
                        var4 = new class738(var3);
                    }
                }
                this.field6248.method1247(4070, (long) var2, var4);
                return var4;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(B)Lu;", line = 516)
    public final class81 method2596(byte arg0) {
        field6247++;
        return arg0 > -12 ? null : this.field6241;
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(I)V", line = 528)
    private final void method2597(int arg0) throws IOException {
        int var2 = 59 / ((-arg0 - 6) / 57);
        field6245++;
        while (this.field6241.field1530.packetOut(this.field6237) != 1) {
            class111 var3 = this.method2595((byte) 118);
            if (var3 == null) {
                if (this.field6253) {
                    this.method2588(80);
                }
                return;
            }
            if (this.field6244 == var3) {
                this.method2587(108);
            }
        }
        this.field6241.method829(this.field6237, 100);
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "(I)Lhb;", line = 567)
    public final class755 method2598(int arg0) {
        field6234++;
        if (arg0 != -1) {
            this.field6241 = null;
        }
        return this.field6244;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(Z)Lgn;", line = 579)
    public final class728 method2599(boolean arg0) {
        field6256++;
        return arg0 ? null : this.field6251;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 592)
    public final void method2601(String arg0, byte arg1) {
        field6252++;
        this.field6235 = arg0;
        if (this.field6235 == null) {
            this.field6244 = null;
            return;
        }
        int var3 = -128 % ((arg1 + 38) / 35);
        if (this.field6244 != null && !this.field6235.equals(this.field6244.method4139((byte) 93))) {
            this.field6244 = null;
        }
        if (this.field6244 != null) {
            return;
        }
        for (class111 var4 = (class111) this.field6248.method1249((byte) -110); var4 != null; var4 = (class111) this.field6248.method1246(true)) {
            if (var4 instanceof class755) {
                class755 var5 = (class755) var4;
                if (this.field6235.equals(var5.method4139((byte) 93))) {
                    this.field6244 = var5;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(I)V", line = 647)
    public class433(int arg0) {
        if (!class289.method1854((byte) -95, "jagtheora")) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field6243 = new byte[arg0];
        this.field6250 = new OggSyncState();
        this.field6258 = new OggPage();
        this.field6237 = new OggPacket();
        this.field6248 = new class184(8);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I[B)I")
    public abstract int method2600(int arg0, byte[] arg1) throws IOException;
}
