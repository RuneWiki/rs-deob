import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public abstract class class776 {

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "[B")
    private byte[] field10680;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field10693;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field10686;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field10697;

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "Ltga;")
    private class64 field10702;

    @OriginalMember(owner = "client!kr", name = "B", descriptor = "[F")
    public static float[] field10704 = new float[16384];

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "[F")
    public static float[] field10701 = new float[16384];

    @OriginalMember(owner = "client!kr", name = "F", descriptor = "I")
    public static int field10708;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public static int field10678;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field10679;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field10681;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field10682;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public static int field10684;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
    public static int field10687;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
    public static int field10688;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    public static int field10689;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    public static int field10690;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "I")
    public static int field10695;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public static int field10696;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "I")
    public static int field10698;

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "I")
    public static int field10699;

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "I")
    public static int field10700;

    @OriginalMember(owner = "client!kr", name = "E", descriptor = "I")
    public static int field10707;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "Lus;")
    private class1 field10683;

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "Lnj;")
    private class255 field10703;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "Lpp;")
    private class410 field10692;

    @OriginalMember(owner = "client!kr", name = "D", descriptor = "Ljava/lang/String;")
    private String field10706;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "Z")
    private boolean field10685;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "Z")
    private boolean field10691;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "Z")
    private boolean field10694;

    @OriginalMember(owner = "client!kr", name = "C", descriptor = "Z")
    private boolean field10705;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field10704[var2] = (float) Math.sin((double) var2 * var0);
            field10701[var2] = (float) Math.cos((double) var2 * var0);
        }
        field10708 = -1;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Lui;", line = 8)
    private final class238 method4252(byte arg0) throws IOException {
        field10687++;
        if (this.field10705) {
            throw new IllegalStateException();
        } else if (this.field10691) {
            return null;
        } else {
            while (this.field10693.pageOut(this.field10686) <= 0) {
                int var10 = this.method1521((byte) -81, this.field10680);
                if (var10 == -1) {
                    this.field10691 = true;
                    return null;
                }
                if (var10 == 0) {
                    return null;
                }
                if (!this.field10693.write(this.field10680, var10)) {
                    throw new RuntimeException("");
                }
            }
            if (arg0 > -6) {
                method4263(-9);
            }
            int var2 = this.field10686.getSerialNumber();
            if (!this.field10686.isBOS()) {
                class238 var9 = (class238) this.field10702.method380((byte) -3, (long) var2);
                if (!var9.field3430.pageIn(this.field10686)) {
                    throw new IllegalStateException();
                }
                return var9;
            }
            OggStreamState var3 = new OggStreamState(var2);
            if (!var3.pageIn(this.field10686)) {
                throw new IllegalStateException();
            } else if (var3.packetPeek(this.field10697) == 1) {
                class238 var4;
                if (this.field10692 == null && this.field10697.isTheora()) {
                    this.field10692 = new class410(var3);
                    var4 = this.field10692;
                } else if (this.field10703 == null && this.field10697.isVorbis()) {
                    this.field10703 = new class255(var3);
                    var4 = this.field10703;
                } else {
                    byte[] var5 = this.field10697.getData();
                    StringBuffer var6 = new StringBuffer();
                    for (int var7 = 1; var7 < var5.length && Character.isLetterOrDigit((char) var5[var7]); var7++) {
                        var6.append((char) var5[var7]);
                    }
                    String var8 = var6.toString();
                    if (var8.equals("kate")) {
                        var4 = new class1(var3);
                    } else {
                        var4 = new class564(var3);
                    }
                }
                this.field10702.method384((long) var2, var4, false);
                return var4;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 128)
    private final void method4253(int arg0) {
        for (class238 var2 = (class238) this.field10702.method382(0); var2 != null; var2 = (class238) this.field10702.method391(37)) {
            if (this.field10692 != var2) {
                while (var2.field3430.packetOut() == 1) {
                    var2.method1630(this.field10697, 73);
                }
            }
        }
        if (arg0 != -2) {
            return;
        }
        field10707++;
        if (this.field10692 == null) {
            return;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (!this.method4265(true)) {
                return;
            }
            if (this.field10692.field3430.packetOut() != 1) {
                this.method4260(124);
                return;
            }
            this.field10692.method1630(this.field10697, 73);
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V", line = 176)
    private final void method4254(byte arg0) throws IOException {
        field10688++;
        while (this.field10692.field3430.packetOut(this.field10697) != 1) {
            class238 var2 = this.method4252((byte) -63);
            if (var2 == null) {
                if (this.field10691) {
                    this.method4253(-2);
                }
                return;
            }
            if (this.field10683 == var2) {
                this.method4262(false);
            }
        }
        if (arg0 >= 70) {
            this.field10692.method1630(this.field10697, 73);
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)D", line = 207)
    public final double method4255(int arg0) {
        field10689++;
        if (this.field10703 != null) {
            return this.field10703.method1681(arg0 ^ 0xFFFFFF9C);
        } else if (arg0 == 0) {
            return this.field10692 == null ? 0.0D : this.field10692.method2464(-1);
        } else {
            return -0.6623028757908203D;
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)V", line = 226)
    public final void method4256(int arg0) throws IOException {
        field10699++;
        if (this.field10685) {
            return;
        }
        if (arg0 != 1575) {
            this.method4258((byte) 15);
        }
        while (!this.field10705) {
            class238 var2;
            if (this.field10694) {
                var2 = (class238) this.field10702.method380((byte) -3, (long) this.field10686.getSerialNumber());
            } else {
                var2 = this.method4252((byte) -7);
                if (var2 == null) {
                    if (this.field10691) {
                        this.method4253(arg0 ^ 0xFFFFF9D9);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field10694 = true;
            }
            if (this.field10703 == var2) {
                if (this.field10703.method1683((byte) -67) >= 50) {
                    return;
                }
                while (this.field10703.field3430.packetOut(this.field10697) == 1) {
                    this.field10703.method1630(this.field10697, 73);
                    this.method4262(false);
                    if (this.field10692 != null) {
                        double var4 = this.field10692.method2464(-1);
                        for (int var6 = 0; var6 < 10 && this.method4265(true); var6++) {
                            this.method4254((byte) 95);
                            if (this.field10705) {
                                return;
                            }
                        }
                        if (var4 < this.field10692.method2464(arg0 ^ 0xFFFFF9D8)) {
                            return;
                        }
                    }
                    if (this.field10703.method1683((byte) -67) >= 50) {
                        return;
                    }
                }
            } else if ((var2 instanceof class1)) {
                this.method4262(false);
            } else if (this.field10692 != var2) {
                while (var2.field3430.packetOut(this.field10697) == 1) {
                    if (var2.field3438 == 1 && var2 instanceof class1) {
                        this.method4266(this.field10706, -18099);
                    }
                    var2.method1630(this.field10697, 73);
                }
            } else if (this.field10703 == null && !this.field10685) {
                for (int var3 = 0; var3 < 10 && this.method4265(true); var3++) {
                    this.method4254((byte) 93);
                    if (this.field10705) {
                        return;
                    }
                }
                return;
            }
            this.field10694 = false;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "([Ljava/lang/String;[IIBI)V", line = 347)
    public static final void method4257(String[] arg0, int[] arg1, int arg2, byte arg3, int arg4) {
        field10695++;
        if (arg4 < arg2) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg4; var9 < arg2; var9++) {
                if (var7 == null || arg0[var9] != null && arg0[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    int var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method4257(arg0, arg1, var6 - 1, (byte) -119, arg4);
            method4257(arg0, arg1, arg2, (byte) -2, var6 + 1);
        }
        int var12 = -128 % ((arg3 + 63) / 46);
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(B)Lnj;", line = 402)
    public final class255 method4258(byte arg0) {
        if (arg0 != -99) {
            this.method4255(2);
        }
        field10690++;
        return this.field10703;
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)Z", line = 415)
    public final boolean method4259(int arg0) {
        field10681++;
        if (!this.field10705 && !this.field10691) {
            return false;
        } else if (this.field10703 == null || this.field10703.method1683((byte) -67) <= 0) {
            if (arg0 != -27418) {
                this.field10680 = null;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "(I)V", line = 435)
    public final void method4260(int arg0) {
        field10698++;
        if (arg0 <= 114) {
            field10704 = null;
        }
        if (this.field10705) {
            return;
        }
        for (class238 var2 = (class238) this.field10702.method382(0); var2 != null; var2 = (class238) this.field10702.method391(37)) {
            var2.method10(12056);
            var2.field3430.method4144();
        }
        this.field10697.method4144();
        this.field10686.method4144();
        this.field10693.method4144();
        this.field10705 = true;
    }

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "(I)Lus;", line = 462)
    public final class1 method4261(int arg0) {
        if (arg0 != -2) {
            method4257(null, null, -8, (byte) -123, 16);
        }
        field10696++;
        return this.field10683;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)V", line = 474)
    private final void method4262(boolean arg0) {
        for (class238 var2 = (class238) this.field10702.method382(0); var2 != null; var2 = (class238) this.field10702.method391(37)) {
            if (var2 instanceof class1) {
                class1 var3 = (class1) var2;
                while ((var3.field3438 <= 8 || this.method4255(0) > (double) var3.method5(false)) && var3.field3430.packetOut(this.field10697) == 1) {
                    var3.method1630(this.field10697, 73);
                }
            }
        }
        field10678++;
        if (!arg0) {
            this.method4266(this.field10706, -18099);
        }
    }

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "(I)V", line = 519)
    public static void method4263(int arg0) {
        field10701 = null;
        if (arg0 >= -98) {
            field10701 = null;
        }
        field10704 = null;
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(B)Lpp;", line = 531)
    public final class410 method4264(byte arg0) {
        if (arg0 != -71) {
            this.method4262(true);
        }
        field10679++;
        return this.field10692;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)Z", line = 547)
    private final boolean method4265(boolean arg0) {
        if (!arg0) {
            this.field10692 = null;
        }
        field10700++;
        if (this.field10703 == null) {
            double var2 = (double) this.field10692.method2467(0);
            return var2 == 0.0D || (double) class109.method731(35) >= 1000.0D / var2 + (double) this.field10692.method2470(1024);
        } else {
            return !this.field10692.method2462(-1) || this.method4255(0) > this.field10692.method2464(-1);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 568)
    public final void method4266(String arg0, int arg1) {
        field10684++;
        if (arg1 != -18099) {
            this.field10705 = false;
        }
        this.field10706 = arg0;
        if (this.field10706 == null) {
            this.field10683 = null;
            return;
        }
        if (this.field10683 != null && !this.field10706.equals(this.field10683.method3(arg1 ^ 0xFFFFB908))) {
            this.field10683 = null;
        }
        if (this.field10683 != null) {
            return;
        }
        for (class238 var3 = (class238) this.field10702.method382(0); var3 != null; var3 = (class238) this.field10702.method391(37)) {
            if (var3 instanceof class1) {
                class1 var4 = (class1) var3;
                if (this.field10706.equals(var4.method3(34))) {
                    this.field10683 = var4;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZZ)V", line = 620)
    public final void method4267(boolean arg0, boolean arg1) {
        field10682++;
        if (this.field10703 != null) {
            class430 var3 = this.field10703.method1680(2);
            if (var3 != null) {
                var3.method2588(arg1, 0);
            }
        }
        this.field10685 = !this.field10685;
        if (arg0) {
            this.method4258((byte) -111);
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(I)V", line = 660)
    public class776(int arg0) {
        if (!class291.method1971("jagtheora", 0)) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field10680 = new byte[arg0];
        this.field10693 = new OggSyncState();
        this.field10686 = new OggPage();
        this.field10697 = new OggPacket();
        this.field10702 = new class64(8);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B[B)I")
    public abstract int method1521(byte arg0, byte[] arg1) throws IOException;
}
