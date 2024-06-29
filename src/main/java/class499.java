import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public abstract class class499 {

    @OriginalMember(owner = "client!va", name = "g", descriptor = "[B")
    private byte[] field7029;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field7028;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field7042;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field7045;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Ltba;")
    private class165 field7023;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "Llb;")
    public static class545 field7034 = new class545(0, 0);

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field7032;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "Lkh;")
    private class15 field7047;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Llr;")
    private class754 field7024;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "Lff;")
    private class9 field7033;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "Ljava/lang/String;")
    private String field7036;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Z")
    private boolean field7025;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "Z")
    private boolean field7041;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "Z")
    private boolean field7046;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "Z")
    private boolean field7052;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "[[[Z")
    public static boolean[][][] field7027;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIZZ)I")
    public static final int method2913(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        if (arg2 != 19152) {
            return -22;
        }
        field7030++;
        class515 var5 = class534.method3075(arg4, arg1, arg2 - 19258);
        if (var5 == null) {
            return 0;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var5.field7226.length; var7++) {
            if (var5.field7226[var7] >= 0 && var5.field7226[var7] < class21.field381.field3322) {
                class639 var8 = class21.field381.method1583(-14, var5.field7226[var7]);
                int var9 = var8.method3594(118, arg0, class513.field7206.method791((byte) 46, arg0).field3137);
                if (arg3) {
                    var6 += var5.field7228[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)Lff;")
    public final class9 method2914(int arg0) {
        int var2 = -96 / ((arg0 - 16) / 43);
        field7049++;
        return this.field7033;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static void method2915(byte arg0) {
        field7034 = null;
        field7027 = null;
        if (arg0 != -69) {
            method2915((byte) -48);
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)Lkh;")
    public final class15 method2916(int arg0) {
        field7037++;
        if (arg0 != 0) {
            this.field7025 = true;
        }
        return this.field7047;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)Z")
    public final boolean method2917(byte arg0) {
        field7050++;
        if (!this.field7041 && !this.field7046) {
            return false;
        } else if (arg0 == 102) {
            return this.field7024 == null || this.field7024.method4189(false) <= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)V")
    public final void method2918(int arg0, boolean arg1) {
        field7051++;
        if (this.field7024 != null) {
            class629 var3 = this.field7024.method4187(3);
            if (var3 != null) {
                var3.method3529(arg1, (byte) 50);
            }
        }
        if (arg0 == -12405) {
            this.field7052 = !this.field7052;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)D")
    public final double method2919(int arg0) {
        field7032++;
        if (this.field7024 == null) {
            if (arg0 >= -14) {
                this.field7024 = null;
            }
            return this.field7033 == null ? 0.0D : this.field7033.method60(-1025);
        } else {
            return this.field7024.method4192(0);
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(B)V")
    private final void method2920(byte arg0) {
        field7048++;
        for (class541 var2 = (class541) this.field7023.method1156(0); var2 != null; var2 = (class541) this.field7023.method1158(22706)) {
            if (this.field7033 != var2) {
                while (var2.field7489.packetOut() == 1) {
                    var2.method3105(-1, this.field7045);
                }
            }
        }
        int var3 = 56 % ((39 - arg0) / 44);
        if (this.field7033 == null) {
            return;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (!this.method2922(124)) {
                return;
            }
            if (this.field7033.field7489.packetOut() != 1) {
                this.method2924(50);
                return;
            }
            this.field7033.method3105(-1, this.field7045);
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)Lrc;")
    private final class541 method2921(int arg0) throws IOException {
        field7043++;
        if (this.field7041) {
            throw new IllegalStateException();
        } else if (this.field7046) {
            return null;
        } else {
            while (this.field7028.pageOut(this.field7042) <= 0) {
                int var10 = this.method728(this.field7029, -8051);
                if (var10 == -1) {
                    this.field7046 = true;
                    return null;
                }
                if (var10 == 0) {
                    return null;
                }
                if (!this.field7028.write(this.field7029, var10)) {
                    throw new RuntimeException("");
                }
            }
            if (arg0 != 0) {
                this.field7024 = null;
            }
            int var2 = this.field7042.getSerialNumber();
            if (!this.field7042.isBOS()) {
                class541 var9 = (class541) this.field7023.method1160((long) var2, arg0 + 123);
                if (!var9.field7489.pageIn(this.field7042)) {
                    throw new IllegalStateException();
                }
                return var9;
            }
            OggStreamState var3 = new OggStreamState(var2);
            if (!var3.pageIn(this.field7042)) {
                throw new IllegalStateException();
            } else if (var3.packetPeek(this.field7045) == 1) {
                class541 var4;
                if (this.field7033 == null && this.field7045.isTheora()) {
                    this.field7033 = new class9(var3);
                    var4 = this.field7033;
                } else if (this.field7024 == null && this.field7045.isVorbis()) {
                    this.field7024 = new class754(var3);
                    var4 = this.field7024;
                } else {
                    byte[] var5 = this.field7045.getData();
                    StringBuffer var6 = new StringBuffer();
                    for (int var7 = 1; var7 < var5.length && Character.isLetterOrDigit((char) var5[var7]); var7++) {
                        var6.append((char) var5[var7]);
                    }
                    String var8 = var6.toString();
                    if (var8.equals("kate")) {
                        var4 = new class15(var3);
                    } else {
                        var4 = new class472(var3);
                    }
                }
                this.field7023.method1153(var4, (long) var2, ~arg0);
                return var4;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)Z")
    private final boolean method2922(int arg0) {
        int var2 = 114 / ((arg0 - 61) / 62);
        field7044++;
        if (this.field7024 == null) {
            double var3 = (double) this.field7033.method55(26399);
            return var3 == 0.0D || (double) class446.method2525(500) >= 1000.0D / var3 + (double) this.field7033.method56(1);
        } else {
            return !this.field7033.method59((byte) -57) || this.method2919(-48) > this.field7033.method60(-1025);
        }
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)Llr;")
    public final class754 method2923(int arg0) {
        field7040++;
        return arg0 > -91 ? null : this.field7024;
    }

    @OriginalMember(owner = "client!va", name = "g", descriptor = "(I)V")
    public final void method2924(int arg0) {
        field7035++;
        if (this.field7041) {
            return;
        }
        if (arg0 != 50) {
            this.method2924(24);
        }
        for (class541 var2 = (class541) this.field7023.method1156(0); var2 != null; var2 = (class541) this.field7023.method1158(arg0 + 22656)) {
            var2.method62(false);
            var2.field7489.method4007();
        }
        this.field7045.method4007();
        this.field7042.method4007();
        this.field7028.method4007();
        this.field7041 = true;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
    public final void method2925(boolean arg0) throws IOException {
        if (!arg0) {
            this.field7029 = null;
        }
        field7026++;
        if (this.field7052) {
            return;
        }
        while (!this.field7041) {
            class541 var2;
            if (this.field7025) {
                var2 = (class541) this.field7023.method1160((long) this.field7042.getSerialNumber(), 121);
            } else {
                var2 = this.method2921(0);
                if (var2 == null) {
                    if (this.field7046) {
                        this.method2920((byte) 87);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field7025 = true;
            }
            if (this.field7024 == var2) {
                if (this.field7024.method4189(false) >= 50) {
                    return;
                }
                while (this.field7024.field7489.packetOut(this.field7045) == 1) {
                    this.field7024.method3105(-1, this.field7045);
                    this.method2926(-9);
                    if (this.field7033 != null) {
                        double var4 = this.field7033.method60(-1025);
                        for (int var6 = 0; var6 < 10 && this.method2922(-42); var6++) {
                            this.method2927(1);
                            if (this.field7041) {
                                return;
                            }
                        }
                        if (this.field7033.method60(-1025) > var4) {
                            return;
                        }
                    }
                    if (this.field7024.method4189(false) >= 50) {
                        return;
                    }
                }
            } else if ((var2 instanceof class15)) {
                this.method2926(-9);
            } else if (this.field7033 != var2) {
                while (var2.field7489.packetOut(this.field7045) == 1) {
                    if (var2.field7488 == 1 && var2 instanceof class15) {
                        this.method2928(-90, this.field7036);
                    }
                    var2.method3105(-1, this.field7045);
                }
            } else if (this.field7024 == null && !this.field7052) {
                for (int var3 = 0; var3 < 10 && this.method2922(-95); var3++) {
                    this.method2927(1);
                    if (this.field7041) {
                        return;
                    }
                }
                return;
            }
            this.field7025 = false;
        }
    }

    @OriginalMember(owner = "client!va", name = "h", descriptor = "(I)V")
    private final void method2926(int arg0) {
        for (class541 var2 = (class541) this.field7023.method1156(0); var2 != null; var2 = (class541) this.field7023.method1158(22706)) {
            if (var2 instanceof class15) {
                class15 var3 = (class15) var2;
                while ((var3.field7488 <= 8 || this.method2919(-111) > (double) var3.method107(arg0 ^ 0xFFFFD49D)) && var3.field7489.packetOut(this.field7045) == 1) {
                    var3.method3105(-1, this.field7045);
                }
            }
        }
        field7031++;
        this.method2928(-126, this.field7036);
        if (arg0 != -9) {
            this.field7025 = false;
        }
    }

    @OriginalMember(owner = "client!va", name = "i", descriptor = "(I)V")
    private final void method2927(int arg0) throws IOException {
        if (arg0 != 1) {
            this.method2914(124);
        }
        field7053++;
        while (this.field7033.field7489.packetOut(this.field7045) != 1) {
            class541 var2 = this.method2921(0);
            if (var2 == null) {
                if (this.field7046) {
                    this.method2920((byte) 118);
                }
                return;
            }
            if (this.field7047 == var2) {
                this.method2926(-9);
            }
        }
        this.field7033.method3105(-1, this.field7045);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method2928(int arg0, String arg1) {
        field7039++;
        this.field7036 = arg1;
        if (this.field7036 == null) {
            this.field7047 = null;
            return;
        }
        if (this.field7047 != null && !this.field7036.equals(this.field7047.method108(false))) {
            this.field7047 = null;
        }
        if (arg0 >= -67 || this.field7047 != null) {
            return;
        }
        for (class541 var3 = (class541) this.field7023.method1156(0); var3 != null; var3 = (class541) this.field7023.method1158(22706)) {
            if (var3 instanceof class15) {
                class15 var4 = (class15) var3;
                if (this.field7036.equals(var4.method108(false))) {
                    this.field7047 = var4;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "([BI)I")
    public abstract int method728(byte[] arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(I)V")
    public class499(int arg0) {
        if (!class633.method3549("jagtheora", 99)) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field7029 = new byte[arg0];
        this.field7028 = new OggSyncState();
        this.field7042 = new OggPage();
        this.field7045 = new OggPacket();
        this.field7023 = new class165(8);
    }
}
