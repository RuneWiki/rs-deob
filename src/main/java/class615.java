import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public abstract class class615 {

    @OriginalMember(owner = "client!aaa", name = "G", descriptor = "[B")
    private byte[] field8831;

    @OriginalMember(owner = "client!aaa", name = "n", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field8812;

    @OriginalMember(owner = "client!aaa", name = "s", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field8817;

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field8804;

    @OriginalMember(owner = "client!aaa", name = "h", descriptor = "Lpfa;")
    private class295 field8806;

    @OriginalMember(owner = "client!aaa", name = "p", descriptor = "Lpia;")
    public static class94 field8814 = new class94(12, -1);

    @OriginalMember(owner = "client!aaa", name = "z", descriptor = "[I")
    public static int[] field8824 = new int[32];

    @OriginalMember(owner = "client!aaa", name = "E", descriptor = "F")
    public static float field8829;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!aaa", name = "i", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!aaa", name = "j", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!aaa", name = "k", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!aaa", name = "m", descriptor = "I")
    public static int field8811;

    @OriginalMember(owner = "client!aaa", name = "r", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!aaa", name = "t", descriptor = "I")
    public static int field8818;

    @OriginalMember(owner = "client!aaa", name = "v", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!aaa", name = "w", descriptor = "I")
    public static int field8821;

    @OriginalMember(owner = "client!aaa", name = "x", descriptor = "I")
    public static int field8822;

    @OriginalMember(owner = "client!aaa", name = "A", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!aaa", name = "B", descriptor = "I")
    public static int field8826;

    @OriginalMember(owner = "client!aaa", name = "D", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!aaa", name = "F", descriptor = "I")
    public static int field8830;

    @OriginalMember(owner = "client!aaa", name = "u", descriptor = "Lej;")
    private class122 field8819;

    @OriginalMember(owner = "client!aaa", name = "o", descriptor = "Luea;")
    private class315 field8813;

    @OriginalMember(owner = "client!aaa", name = "H", descriptor = "Lis;")
    private class501 field8832;

    @OriginalMember(owner = "client!aaa", name = "l", descriptor = "Ljava/lang/String;")
    private String field8810;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "Z")
    private boolean field8801;

    @OriginalMember(owner = "client!aaa", name = "g", descriptor = "Z")
    private boolean field8805;

    @OriginalMember(owner = "client!aaa", name = "q", descriptor = "Z")
    private boolean field8815;

    @OriginalMember(owner = "client!aaa", name = "C", descriptor = "Z")
    private boolean field8827;

    @OriginalMember(owner = "client!aaa", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field8823;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V", line = 3)
    private final void method3475(byte arg0) {
        field8799++;
        if (arg0 != 31) {
            this.method3487(false);
        }
        for (class12 var2 = (class12) this.field8806.method1753(0); var2 != null; var2 = (class12) this.field8806.method1755(-127)) {
            if (this.field8813 != var2) {
                while (var2.field93.packetOut() == 1) {
                    var2.method53((byte) 1, this.field8804);
                }
            }
        }
        if (this.field8813 == null) {
            return;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (!this.method3485((byte) 53)) {
                return;
            }
            if (this.field8813.field93.packetOut() != 1) {
                this.method3491(-1);
                return;
            }
            this.field8813.method53((byte) 1, this.field8804);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)Lma;", line = 51)
    private final class12 method3476(int arg0) throws IOException {
        field8818++;
        if (this.field8827) {
            throw new IllegalStateException();
        } else if (this.field8815) {
            return null;
        } else {
            while (this.field8812.pageOut(this.field8817) <= 0) {
                int var10 = this.method3490(this.field8831, (byte) -86);
                if (var10 == -1) {
                    this.field8815 = true;
                    return null;
                }
                if (var10 == 0) {
                    return null;
                }
                if (!this.field8812.write(this.field8831, var10)) {
                    throw new RuntimeException("");
                }
            }
            int var2 = this.field8817.getSerialNumber();
            if (arg0 != 8) {
                this.field8812 = null;
            }
            if (!this.field8817.isBOS()) {
                class12 var3 = (class12) this.field8806.method1754(false, (long) var2);
                if (!var3.field93.pageIn(this.field8817)) {
                    throw new IllegalStateException();
                }
                return var3;
            }
            OggStreamState var4 = new OggStreamState(var2);
            if (!var4.pageIn(this.field8817)) {
                throw new IllegalStateException();
            } else if (var4.packetPeek(this.field8804) == 1) {
                class12 var5;
                if (this.field8813 == null && this.field8804.isTheora()) {
                    this.field8813 = new class315(var4);
                    var5 = this.field8813;
                } else if (this.field8819 == null && this.field8804.isVorbis()) {
                    this.field8819 = new class122(var4);
                    var5 = this.field8819;
                } else {
                    byte[] var6 = this.field8804.getData();
                    StringBuffer var7 = new StringBuffer();
                    for (int var8 = 1; var8 < var6.length && Character.isLetterOrDigit((char) var6[var8]); var8++) {
                        var7.append((char) var6[var8]);
                    }
                    String var9 = var7.toString();
                    if (var9.equals("kate")) {
                        var5 = new class501(var4);
                    } else {
                        var5 = new class461(var4);
                    }
                }
                this.field8806.method1751(var5, 3970, (long) var2);
                return var5;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILoh;)V", line = 173)
    public static final void method3477(int arg0, class404 arg1) {
        class190.field2244 = arg1;
        int var2 = 61 / ((arg0 + 51) / 34);
        field8809++;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "([FII)[F", line = 184)
    public static final float[] method3478(float[] arg0, int arg1, int arg2) {
        field8828++;
        float[] var3 = new float[arg2];
        class143.method897(arg0, 0, var3, 0, arg2);
        int var4 = 100 / ((-arg1 - 3) / 48);
        return var3;
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)Z", line = 197)
    public final boolean method3479(int arg0) {
        field8816++;
        if (!this.field8827 && !this.field8815) {
            return false;
        } else if (this.field8819 == null || this.field8819.method781(-5313) <= 0) {
            return arg0 > 17;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "(I)V", line = 220)
    public final void method3480(int arg0) throws IOException {
        field8807++;
        if (this.field8801) {
            return;
        }
        if (arg0 != -32465) {
            this.field8831 = null;
        }
        while (!this.field8827) {
            class12 var2;
            if (this.field8805) {
                var2 = (class12) this.field8806.method1754(false, (long) this.field8817.getSerialNumber());
            } else {
                var2 = this.method3476(8);
                if (var2 == null) {
                    if (this.field8815) {
                        this.method3475((byte) 31);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field8805 = true;
            }
            if (this.field8819 == var2) {
                if (this.field8819.method781(-5313) >= 50) {
                    return;
                }
                while (this.field8819.field93.packetOut(this.field8804) == 1) {
                    this.field8819.method53((byte) 1, this.field8804);
                    this.method3481(true);
                    if (this.field8813 != null) {
                        double var3 = this.field8813.method1877(-123);
                        for (int var5 = 0; var5 < 10 && this.method3485((byte) 50); var5++) {
                            this.method3488(1);
                            if (this.field8827) {
                                return;
                            }
                        }
                        if (this.field8813.method1877(-100) > var3) {
                            return;
                        }
                    }
                    if (this.field8819.method781(-5313) >= 50) {
                        return;
                    }
                }
            } else if ((var2 instanceof class501)) {
                this.method3481(true);
            } else if (this.field8813 != var2) {
                while (var2.field93.packetOut(this.field8804) == 1) {
                    if (var2.field95 == 1 && var2 instanceof class501) {
                        this.method3486(this.field8810, 14994);
                    }
                    var2.method53((byte) 1, this.field8804);
                }
            } else if (this.field8819 == null && !this.field8801) {
                for (int var6 = 0; var6 < 10 && this.method3485((byte) 50); var6++) {
                    this.method3488(1);
                    if (this.field8827) {
                        return;
                    }
                }
                return;
            }
            this.field8805 = false;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Z)V", line = 340)
    private final void method3481(boolean arg0) {
        field8830++;
        for (class12 var2 = (class12) this.field8806.method1753(0); var2 != null; var2 = (class12) this.field8806.method1755(-57)) {
            if (var2 instanceof class501) {
                class501 var3 = (class501) var2;
                while ((var3.field95 <= 8 || this.method3483((byte) -34) > (double) var3.method2974(false)) && var3.field93.packetOut(this.field8804) == 1) {
                    var3.method53((byte) 1, this.field8804);
                }
            }
        }
        this.method3486(this.field8810, 14994);
        if (!arg0) {
            this.method3487(false);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "(I)Lej;", line = 375)
    public final class122 method3482(int arg0) {
        int var2 = -97 / ((arg0 + 39) / 56);
        field8822++;
        return this.field8819;
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)D", line = 390)
    public final double method3483(byte arg0) {
        field8803++;
        if (arg0 > -3) {
            return -0.0896816954661441D;
        } else if (this.field8819 == null) {
            return this.field8813 == null ? 0.0D : this.field8813.method1877(-75);
        } else {
            return this.field8819.method784((byte) 49);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ZI)V", line = 414)
    public final void method3484(boolean arg0, int arg1) {
        field8820++;
        if (arg1 != -51) {
            method3492((byte) -66);
        }
        if (this.field8819 != null) {
            class370 var3 = this.field8819.method785((byte) -86);
            if (var3 != null) {
                var3.method2154(arg1 + 19316, arg0);
            }
        }
        this.field8801 = !this.field8801;
    }

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "(B)Z", line = 436)
    private final boolean method3485(byte arg0) {
        int var2 = -128 / ((-arg0 - 49) / 34);
        field8826++;
        if (this.field8819 == null) {
            double var3 = (double) this.field8813.method1874(-30011);
            return var3 == 0.0D || (double) class652.method3700(-1) >= (double) this.field8813.method1871(-108) + 1000.0D / var3;
        } else {
            return !this.field8813.method1872(321947886) || this.method3483((byte) -65) > this.field8813.method1877(-82);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 456)
    public final void method3486(String arg0, int arg1) {
        field8808++;
        this.field8810 = arg0;
        if (this.field8810 == null) {
            this.field8832 = null;
            return;
        }
        if (arg1 != 14994) {
            this.field8810 = null;
        }
        if (this.field8832 != null && !this.field8810.equals(this.field8832.method2972(72))) {
            this.field8832 = null;
        }
        if (this.field8832 != null) {
            return;
        }
        for (class12 var3 = (class12) this.field8806.method1753(arg1 ^ 0x3A92); var3 != null; var3 = (class12) this.field8806.method1755(arg1 - 15121)) {
            if (var3 instanceof class501) {
                class501 var4 = (class501) var3;
                if (this.field8810.equals(var4.method2972(arg1 ^ 0x3AC7))) {
                    this.field8832 = var4;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(Z)Luea;", line = 506)
    public final class315 method3487(boolean arg0) {
        if (arg0) {
            this.method3481(false);
        }
        field8802++;
        return this.field8813;
    }

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "(I)V", line = 523)
    private final void method3488(int arg0) throws IOException {
        field8825++;
        while (this.field8813.field93.packetOut(this.field8804) != 1) {
            class12 var2 = this.method3476(arg0 + 7);
            if (var2 == null) {
                if (this.field8815) {
                    this.method3475((byte) 31);
                }
                return;
            }
            if (this.field8832 == var2) {
                this.method3481(true);
            }
        }
        this.field8813.method53((byte) 1, this.field8804);
        if (arg0 != 1) {
            this.method3485((byte) 112);
        }
    }

    @OriginalMember(owner = "client!aaa", name = "d", descriptor = "(B)Lis;", line = 554)
    public final class501 method3489(byte arg0) {
        if (arg0 <= 73) {
            field8814 = null;
        }
        field8811++;
        return this.field8832;
    }

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "(I)V", line = 577)
    public final void method3491(int arg0) {
        field8800++;
        if (this.field8827) {
            return;
        }
        for (class12 var2 = (class12) this.field8806.method1753(0); var2 != null; var2 = (class12) this.field8806.method1755(arg0 - 77)) {
            var2.method56(3376);
            var2.field93.method3981();
        }
        this.field8804.method3981();
        this.field8817.method3981();
        this.field8812.method3981();
        if (arg0 != -1) {
            this.method3491(86);
        }
        this.field8827 = true;
    }

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "(B)V", line = 609)
    public static void method3492(byte arg0) {
        field8814 = null;
        field8823 = null;
        if (arg0 != -96) {
            method3492((byte) 17);
        }
        field8824 = null;
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(I)V", line = 622)
    public class615(int arg0) {
        if (!class79.method555(33, "jagtheora")) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field8831 = new byte[arg0];
        this.field8812 = new OggSyncState();
        this.field8817 = new OggPage();
        this.field8804 = new OggPacket();
        this.field8806 = new class295(8);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "([BB)I")
    public abstract int method3490(byte[] arg0, byte arg1) throws IOException;
}
