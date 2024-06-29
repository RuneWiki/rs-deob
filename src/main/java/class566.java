import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public abstract class class566 {

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "[B")
    private byte[] field8007;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field8011;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field7991;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field8005;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "Lmp;")
    private class758 field7998;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field7985 = "";

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "Z")
    public static boolean field8004 = false;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field7986;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field7993;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field7994;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field7999;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public static int field8001;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public static int field8008;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
    public static int field8010;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field8013;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
    public static int field8014;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "Lgg;")
    private class173 field8006;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "Lfda;")
    private class319 field7995;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "Ldp;")
    private class3 field8003;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "Ljava/lang/String;")
    private String field8009;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Z")
    private boolean field7987;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Z")
    private boolean field7997;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "Z")
    private boolean field8000;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "Z")
    private boolean field8002;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)D", line = 10)
    public final double method3299(int arg0) {
        if (arg0 != 16177) {
            this.field7997 = true;
        }
        field8012++;
        if (this.field8003 == null) {
            return this.field7995 == null ? 0.0D : this.field7995.method2052(-1);
        } else {
            return this.field8003.method10(arg0 ^ 0x3F27);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BIIIILha;)V", line = 38)
    public static final void method3300(byte arg0, int arg1, int arg2, int arg3, int arg4, class58 arg5) {
        field8001++;
        class154.field2309 = arg5;
        int var6 = -37 / ((arg0 - 27) / 46);
        class160.field2389 = class154.field2309.method558();
        class224.field3198 = class154.field2309.method558();
        class483.field6841 = class154.field2309.method558();
        class685.field9658 = arg2;
        class700.field9834 = arg3;
        class435.field6079 = 0;
        class724.field10127 = null;
        class168.field2469 = null;
        class223.method1547(arg1, arg4, (byte) 42);
        class32.field424 = -1;
        class609.field8824 = -1;
        class501.field7165 = -1;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V", line = 61)
    private final void method3301(int arg0) throws IOException {
        if (arg0 != 1) {
            this.method3306(-9);
        }
        field7992++;
        while (this.field7995.field2246.packetOut(this.field8005) != 1) {
            class147 var2 = this.method3304(false);
            if (var2 == null) {
                if (this.field7987) {
                    this.method3305((byte) -113);
                }
                return;
            }
            if (this.field8006 == var2) {
                this.method3313(true);
            }
        }
        this.field7995.method1140(this.field8005, 2749);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 90)
    public final void method3302(byte arg0) throws IOException {
        field7990++;
        if (this.field8002) {
            return;
        }
        if (arg0 != -12) {
            this.method3309(17);
        }
        while (!this.field8000) {
            class147 var2;
            if (this.field7997) {
                var2 = (class147) this.field7998.method4203(true, (long) this.field7991.getSerialNumber());
            } else {
                var2 = this.method3304(false);
                if (var2 == null) {
                    if (this.field7987) {
                        this.method3305((byte) -113);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field7997 = true;
            }
            if (this.field8003 == var2) {
                if (this.field8003.method11(118) >= 50) {
                    return;
                }
                while (this.field8003.field2246.packetOut(this.field8005) == 1) {
                    this.field8003.method1140(this.field8005, 2749);
                    this.method3313(true);
                    if (this.field7995 != null) {
                        double var3 = this.field7995.method2052(arg0 ^ 0xB);
                        for (int var5 = 0; var5 < 10 && this.method3306(80); var5++) {
                            this.method3301(1);
                            if (this.field8000) {
                                return;
                            }
                        }
                        if (this.field7995.method2052(arg0 + 11) > var3) {
                            return;
                        }
                    }
                    if (this.field8003.method11(arg0 + 135) >= 50) {
                        return;
                    }
                }
            } else if ((var2 instanceof class173)) {
                this.method3313(true);
            } else if (this.field7995 != var2) {
                while (var2.field2246.packetOut(this.field8005) == 1) {
                    if (var2.field2248 == 1 && var2 instanceof class173) {
                        this.method3314(-2, this.field8009);
                    }
                    var2.method1140(this.field8005, 2749);
                }
            } else if (this.field8003 == null && !this.field8002) {
                for (int var6 = 0; var6 < 10 && this.method3306(68); var6++) {
                    this.method3301(1);
                    if (this.field8000) {
                        return;
                    }
                }
                return;
            }
            this.field7997 = false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)Lgg;", line = 212)
    public final class173 method3303(int arg0) {
        field7999++;
        if (arg0 != 6643) {
            this.method3306(-11);
        }
        return this.field8006;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)Lmg;", line = 223)
    private final class147 method3304(boolean arg0) throws IOException {
        field7993++;
        if (this.field8000) {
            throw new IllegalStateException();
        } else if (this.field7987) {
            return null;
        } else {
            while (this.field8011.pageOut(this.field7991) <= 0) {
                int var10 = this.method1242(-68, this.field8007);
                if (var10 == -1) {
                    this.field7987 = true;
                    return null;
                }
                if (var10 == 0) {
                    return null;
                }
                if (!this.field8011.write(this.field8007, var10)) {
                    throw new RuntimeException("");
                }
            }
            int var2 = this.field7991.getSerialNumber();
            if (arg0) {
                return null;
            } else if (this.field7991.isBOS()) {
                OggStreamState var4 = new OggStreamState(var2);
                if (!var4.pageIn(this.field7991)) {
                    throw new IllegalStateException();
                } else if (var4.packetPeek(this.field8005) == 1) {
                    class147 var5;
                    if (this.field7995 == null && this.field8005.isTheora()) {
                        this.field7995 = new class319(var4);
                        var5 = this.field7995;
                    } else if (this.field8003 == null && this.field8005.isVorbis()) {
                        this.field8003 = new class3(var4);
                        var5 = this.field8003;
                    } else {
                        byte[] var6 = this.field8005.getData();
                        StringBuffer var7 = new StringBuffer();
                        for (int var8 = 1; var6.length > var8 && Character.isLetterOrDigit((char) var6[var8]); var8++) {
                            var7.append((char) var6[var8]);
                        }
                        String var9 = var7.toString();
                        if (var9.equals("kate")) {
                            var5 = new class173(var4);
                        } else {
                            var5 = new class444(var4);
                        }
                    }
                    this.field7998.method4211(var5, (byte) 115, (long) var2);
                    return var5;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                class147 var3 = (class147) this.field7998.method4203(true, (long) var2);
                if (!var3.field2246.pageIn(this.field7991)) {
                    throw new IllegalStateException();
                }
                return var3;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)V", line = 341)
    private final void method3305(byte arg0) {
        field7996++;
        if (arg0 != -113) {
            this.method3303(-82);
        }
        for (class147 var2 = (class147) this.field7998.method4209(false); var2 != null; var2 = (class147) this.field7998.method4207(9356)) {
            if (this.field7995 != var2) {
                while (var2.field2246.packetOut() == 1) {
                    var2.method1140(this.field8005, 2749);
                }
            }
        }
        if (this.field7995 == null) {
            return;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (!this.method3306(arg0 + 206)) {
                return;
            }
            if (this.field7995.field2246.packetOut() != 1) {
                this.method3308(121);
                return;
            }
            this.field7995.method1140(this.field8005, 2749);
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)Z", line = 385)
    private final boolean method3306(int arg0) {
        if (arg0 < 55) {
            return true;
        }
        field7994++;
        if (this.field8003 == null) {
            double var2 = (double) this.field7995.method2049(true);
            return var2 == 0.0D || (double) class742.method4128(1) >= (double) this.field7995.method2057(true) + 1000.0D / var2;
        } else {
            return !this.field7995.method2055(75) || this.method3299(16177) > this.field7995.method2052(-1);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)V", line = 408)
    public final void method3307(boolean arg0, int arg1) {
        if (this.field8003 != null) {
            class493 var3 = this.field8003.method12(true);
            if (var3 != null) {
                var3.method2965(arg0, -81);
            }
        }
        field7986++;
        int var4 = -10 / ((arg1 + 40) / 46);
        this.field8002 = !this.field8002;
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V", line = 430)
    public final void method3308(int arg0) {
        field7988++;
        if (this.field8000) {
            return;
        }
        if (arg0 <= 118) {
            this.method3303(75);
        }
        for (class147 var2 = (class147) this.field7998.method4209(false); var2 != null; var2 = (class147) this.field7998.method4207(9356)) {
            var2.method8(0);
            var2.field2246.method3970();
        }
        this.field8005.method3970();
        this.field7991.method3970();
        this.field8011.method3970();
        this.field8000 = true;
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)Lfda;", line = 462)
    public final class319 method3309(int arg0) {
        if (arg0 != -31453) {
            this.field8009 = null;
        }
        field7989++;
        return this.field7995;
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)Z", line = 474)
    public final boolean method3310(int arg0) {
        field8014++;
        if (this.field8000 || this.field7987) {
            if (arg0 <= 24) {
                this.field8003 = null;
            }
            return this.field8003 == null || this.field8003.method11(123) <= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "(I)Ldp;", line = 493)
    public final class3 method3311(int arg0) {
        field8008++;
        return arg0 == 31615 ? this.field8003 : null;
    }

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "(I)V", line = 506)
    public static void method3312(int arg0) {
        if (arg0 != -11) {
            method3312(105);
        }
        field7985 = null;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)V", line = 516)
    private final void method3313(boolean arg0) {
        for (class147 var2 = (class147) this.field7998.method4209(false); var2 != null; var2 = (class147) this.field7998.method4207(9356)) {
            if (var2 instanceof class173) {
                class173 var3 = (class173) var2;
                while ((var3.field2248 <= 8 || this.method3299(16177) > (double) var3.method1263(arg0)) && var3.field2246.packetOut(this.field8005) == 1) {
                    var3.method1140(this.field8005, 2749);
                }
            }
        }
        field8013++;
        if (!arg0) {
            this.field8003 = null;
        }
        this.method3314(-2, this.field8009);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILjava/lang/String;)V", line = 555)
    public final void method3314(int arg0, String arg1) {
        if (arg0 != -2) {
            this.method3311(-61);
        }
        this.field8009 = arg1;
        field8010++;
        if (this.field8009 == null) {
            this.field8006 = null;
            return;
        }
        if (this.field8006 != null && !this.field8009.equals(this.field8006.method1262((byte) 113))) {
            this.field8006 = null;
        }
        if (this.field8006 != null) {
            return;
        }
        for (class147 var3 = (class147) this.field7998.method4209(false); var3 != null; var3 = (class147) this.field7998.method4207(9356)) {
            if (var3 instanceof class173) {
                class173 var4 = (class173) var3;
                if (this.field8009.equals(var4.method1262((byte) 113))) {
                    this.field8006 = var4;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(I)V", line = 606)
    public class566(int arg0) {
        if (!class96.method870(0, "jagtheora")) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field8007 = new byte[arg0];
        this.field8011 = new OggSyncState();
        this.field7991 = new OggPage();
        this.field8005 = new OggPacket();
        this.field7998 = new class758(8);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[B)I")
    public abstract int method1242(int arg0, byte[] arg1) throws IOException;
}
