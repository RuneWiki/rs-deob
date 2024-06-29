import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class397 {

    @OriginalMember(owner = "client!me", name = "c", descriptor = "[B")
    private byte[] field5772;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field5761;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field5769;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field5760;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "Ldfa;")
    private class477 field5770;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field5785 = new String[] { method3114(method3113("\u0011\u001c\r\u0014h")), method3114(method3113("\u0017\u0018W8")), method3114(method3113("\u0011\u001c\r\u0012h")), method3114(method3113("\u0011\u001c\r\u0016h")), method3114(method3113("\u0011\u001c\r\u0017h")), method3114(method3113("\u0011\u001c\r\u001eh")), method3114(method3113("\u0011\u001c\r\u0011h")), method3114(method3113("\u0011\u001c\r\u0010h")), method3114(method3113("\u0011\u001c\r\rh")), method3114(method3113("\u0011\u001c\r\u001ch")), method3114(method3113("\u0011\u001c\r\u001ah")), method3114(method3113("\u0011\u001c\r\u0018h")), method3114(method3113("\u0011\u001c\r\u0019h")), method3114(method3113("\u0012\fO1")), method3114(method3113("\u0007W\rs=")), method3114(method3113("\u0011\u001c\r\u001fh")), method3114(method3113("\u0011\u001c\r\u001bh")), method3114(method3113("\u0011\u001c\r\u0015h")), method3114(method3113("\u0011\u001c\ra)\u0012\u0010Wch")), method3114(method3113("\u0016\u0018D)(\u0019\u0016Q<")), method3114(method3113(":\u0018J1%\u0018YW2`\u0010\u0016B9`\u0016\u0018D)(\u0019\u0016Q<`\u0010\u0010A/!\u000e\u0000")) };

    @OriginalMember(owner = "client!me", name = "o", descriptor = "Z")
    public static boolean field5768 = false;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "Lsb;")
    public static class261 field5757 = new class261(72, 1);

    @OriginalMember(owner = "client!me", name = "g", descriptor = "J")
    public static long field5777 = 0L;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "I")
    public static int field5753;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public static int field5778;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field5781;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field5782;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Lsga;")
    private class107 field5774;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "Lgd;")
    public static class133 field5776;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Lrda;")
    private class378 field5765;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "Lvia;")
    private class89 field5763;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "Ljava/lang/String;")
    private String field5762;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "Z")
    private boolean field5766;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "Z")
    private boolean field5775;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "Z")
    private boolean field5779;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "Z")
    private boolean field5784;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public static void method3098(int arg0) {
        try {
            if (arg0 == -11) {
                field5757 = null;
                field5776 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5785[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BZ)V")
    public final void method3099(byte arg0, boolean arg1) {
        try {
            if (this.field5763 != null) {
                class754 var3 = this.field5763.method882(0);
                if (var3 != null) {
                    var3.method5464(arg1, (byte) -104);
                }
            }
            field5758++;
            if (arg0 < 42) {
                this.method3102(31);
            }
            this.field5779 = !this.field5779;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5785[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)Z")
    public final boolean method3100(int arg0) {
        try {
            int var2 = -49 / ((arg0 - 75) / 44);
            field5755++;
            if (this.field5775 || this.field5784) {
                return this.field5763 == null || this.field5763.method881((byte) 114) <= 0;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5785[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)Lvia;")
    public final class89 method3101(byte arg0) {
        try {
            field5756++;
            if (arg0 >= -64) {
                this.field5772 = null;
            }
            return this.field5763;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5785[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "g", descriptor = "(I)V")
    private final void method3102(int arg0) {
        try {
            field5759++;
            for (class659 var2 = (class659) this.field5770.method3696(arg0 ^ arg0); var2 != null; var2 = (class659) this.field5770.method3697(-111)) {
                if (var2 instanceof class107) {
                    class107 var3 = (class107) var2;
                    while ((var3.field9332 <= 8 || this.method3106((byte) -93) > (double) var3.method1019(true)) && var3.field9331.packetOut(this.field5760) == 1) {
                        var3.method4783(this.field5760, -93);
                    }
                }
            }
            this.method3112((byte) -78, this.field5762);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5785[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)Lsga;")
    public final class107 method3103(byte arg0) {
        try {
            if (arg0 > 0) {
                this.method3099((byte) -105, true);
            }
            field5778++;
            return this.field5774;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5785[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)Z")
    private final boolean method3104(byte arg0) {
        try {
            field5780++;
            int var2 = 103 % ((arg0 + 59) / 52);
            if (this.field5763 == null) {
                double var3 = (double) this.field5765.method2993(6488);
                return var3 == 0.0D || (double) class614.method4531(-82) >= (double) this.field5765.method2989(-102) + 1000.0D / var3;
            } else {
                return !this.field5765.method2987(1024) || this.method3106((byte) -63) > this.field5765.method2986((byte) -110);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field5785[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    private final void method3105(int arg0) throws IOException {
        try {
            if (arg0 == -2) {
                field5783++;
                while (this.field5765.field9331.packetOut(this.field5760) != 1) {
                    class659 var2 = this.method3109((byte) -126);
                    if (var2 == null) {
                        if (this.field5784) {
                            this.method3108(arg0 + 15990);
                        }
                        return;
                    }
                    if (this.field5774 == var2) {
                        this.method3102(13538);
                    }
                }
                this.field5765.method4783(this.field5760, arg0 - 59);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5785[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(B)D")
    public final double method3106(byte arg0) {
        try {
            int var2 = -58 / ((arg0 - 9) / 42);
            field5773++;
            if (this.field5763 == null) {
                return this.field5765 == null ? 0.0D : this.field5765.method2986((byte) 95);
            } else {
                return this.field5763.method883(5455);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5785[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([BI)I")
    public abstract int method1718(byte[] arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(B)V")
    public final void method3107(byte arg0) throws IOException {
        try {
            field5771++;
            if (arg0 != -79) {
                this.method3110(50);
            }
            if (!this.field5779) {
                while (!this.field5775) {
                    class659 var2;
                    if (this.field5766) {
                        var2 = (class659) this.field5770.method3693(false, (long) this.field5769.getSerialNumber());
                    } else {
                        var2 = this.method3109((byte) -126);
                        if (var2 == null) {
                            if (this.field5784) {
                                this.method3108(15988);
                            }
                            return;
                        }
                        if (var2 == null) {
                            throw new IllegalStateException();
                        }
                        this.field5766 = true;
                    }
                    if (this.field5763 == var2) {
                        if (this.field5763.method881((byte) 125) >= 50) {
                            return;
                        }
                        while (this.field5763.field9331.packetOut(this.field5760) == 1) {
                            this.field5763.method4783(this.field5760, -103);
                            this.method3102(13538);
                            if (this.field5765 != null) {
                                double var3 = this.field5765.method2986((byte) -118);
                                for (int var5 = 0; var5 < 10 && this.method3104((byte) 9); var5++) {
                                    this.method3105(-2);
                                    if (this.field5775) {
                                        return;
                                    }
                                }
                                if (this.field5765.method2986((byte) -107) > var3) {
                                    return;
                                }
                            }
                            if (this.field5763.method881((byte) 77) >= 50) {
                                return;
                            }
                        }
                    } else if ((var2 instanceof class107)) {
                        this.method3102(13538);
                    } else if (this.field5765 != var2) {
                        while (var2.field9331.packetOut(this.field5760) == 1) {
                            if (var2.field9332 == 1 && var2 instanceof class107) {
                                this.method3112((byte) -78, this.field5762);
                            }
                            var2.method4783(this.field5760, -65);
                        }
                    } else if (this.field5763 == null && !this.field5779) {
                        for (int var6 = 0; var6 < 10 && this.method3104((byte) 123); var6++) {
                            this.method3105(arg0 ^ 0x4F);
                            if (this.field5775) {
                                return;
                            }
                        }
                        return;
                    }
                    this.field5766 = false;
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field5785[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
    private final void method3108(int arg0) {
        try {
            if (arg0 == 15988) {
                for (class659 var2 = (class659) this.field5770.method3696(0); var2 != null; var2 = (class659) this.field5770.method3697(-66)) {
                    if (var2 != this.field5765) {
                        while (var2.field9331.packetOut() == 1) {
                            var2.method4783(this.field5760, -67);
                        }
                    }
                }
                field5782++;
                if (this.field5765 != null) {
                    for (int var3 = 0; var3 < 10; var3++) {
                        if (!this.method3104((byte) -121)) {
                            return;
                        }
                        if (this.field5765.field9331.packetOut() != 1) {
                            this.method3111(arg0 - 11481);
                            return;
                        }
                        this.field5765.method4783(this.field5760, -50);
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5785[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)Lnc;")
    private final class659 method3109(byte arg0) throws IOException {
        try {
            field5753++;
            if (this.field5775) {
                throw new IllegalStateException();
            } else if (this.field5784) {
                return null;
            } else {
                if (arg0 != -126) {
                    this.field5760 = null;
                }
                while (this.field5761.pageOut(this.field5769) <= 0) {
                    int var2 = this.method1718(this.field5772, 1);
                    if (var2 == -1) {
                        this.field5784 = true;
                        return null;
                    }
                    if (var2 == 0) {
                        return null;
                    }
                    if (!this.field5761.write(this.field5772, var2)) {
                        throw new RuntimeException("");
                    }
                }
                int var3 = this.field5769.getSerialNumber();
                if (!this.field5769.isBOS()) {
                    class659 var4 = (class659) this.field5770.method3693(false, (long) var3);
                    if (!var4.field9331.pageIn(this.field5769)) {
                        throw new IllegalStateException();
                    }
                    return var4;
                }
                OggStreamState var5 = new OggStreamState(var3);
                if (!var5.pageIn(this.field5769)) {
                    throw new IllegalStateException();
                } else if (var5.packetPeek(this.field5760) == 1) {
                    class659 var6;
                    if (this.field5765 == null && this.field5760.isTheora()) {
                        this.field5765 = new class378(var5);
                        var6 = this.field5765;
                    } else if (this.field5763 == null && this.field5760.isVorbis()) {
                        this.field5763 = new class89(var5);
                        var6 = this.field5763;
                    } else {
                        byte[] var7 = this.field5760.getData();
                        StringBuffer var8 = new StringBuffer();
                        for (int var9 = 1; var9 < var7.length && Character.isLetterOrDigit((char) var7[var9]); var9++) {
                            var8.append((char) var7[var9]);
                        }
                        String var10 = var8.toString();
                        if (var10.equals(field5785[1])) {
                            var6 = new class107(var5);
                        } else {
                            var6 = new class653(var5);
                        }
                    }
                    this.field5770.method3691(var6, (long) var3, -1);
                    return var6;
                } else {
                    throw new IllegalStateException();
                }
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field5785[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)Lrda;")
    public final class378 method3110(int arg0) {
        try {
            if (arg0 != 1) {
                this.method3111(-46);
            }
            field5754++;
            return this.field5765;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5785[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
    public final void method3111(int arg0) {
        try {
            field5764++;
            if (!this.field5775 && arg0 == 4507) {
                for (class659 var2 = (class659) this.field5770.method3696(0); var2 != null; var2 = (class659) this.field5770.method3697(arg0 ^ 0xFFFFEE2B)) {
                    var2.method879((byte) 41);
                    var2.field9331.method4094();
                }
                this.field5760.method4094();
                this.field5769.method4094();
                this.field5761.method4094();
                this.field5775 = true;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5785[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method3112(byte arg0, String arg1) {
        try {
            field5767++;
            this.field5762 = arg1;
            if (this.field5762 == null) {
                this.field5774 = null;
            } else {
                if (this.field5774 != null && !this.field5762.equals(this.field5774.method1016((byte) -126))) {
                    this.field5774 = null;
                }
                if (this.field5774 == null) {
                    for (class659 var3 = (class659) this.field5770.method3696(0); var3 != null; var3 = (class659) this.field5770.method3697(-123)) {
                        if (var3 instanceof class107) {
                            class107 var4 = (class107) var3;
                            if (this.field5762.equals(var4.method1016((byte) -121))) {
                                this.field5774 = var4;
                                return;
                            }
                        }
                    }
                }
                if (arg0 > -58) {
                    this.method3106((byte) 43);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field5785[12] + arg0 + ',' + (arg1 == null ? field5785[13] : field5785[14]) + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(I)V")
    public class397(int arg0) {
        try {
            if (!class743.method5382(field5785[19], true)) {
                throw new RuntimeException(field5785[20]);
            }
            this.field5772 = new byte[arg0];
            this.field5761 = new OggSyncState();
            this.field5769 = new OggPage();
            this.field5760 = new OggPacket();
            this.field5770 = new class477(8);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5785[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!me", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3113(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!me", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3114(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 124;
                    break;
                case 1:
                    var10005 = 121;
                    break;
                case 2:
                    var10005 = 35;
                    break;
                case 3:
                    var10005 = 93;
                    break;
                default:
                    var10005 = 64;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
