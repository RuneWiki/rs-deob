import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public abstract class class382 {

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "[B")
    private byte[] field4861;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field4870;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field4871;

    @OriginalMember(owner = "client!rr", name = "C", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field4887;

    @OriginalMember(owner = "client!rr", name = "A", descriptor = "Ldj;")
    private class362 field4885;

    @OriginalMember(owner = "client!rr", name = "F", descriptor = "I")
    public static int field4890 = 0;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!rr", name = "x", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!rr", name = "D", descriptor = "I")
    public static int field4888;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "Lfv;")
    private class133 field4878;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "Las;")
    private class164 field4864;

    @OriginalMember(owner = "client!rr", name = "E", descriptor = "Lqf;")
    private class711 field4889;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "Ljava/lang/String;")
    private String field4879;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "Z")
    private boolean field4865;

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "Z")
    private boolean field4869;

    @OriginalMember(owner = "client!rr", name = "y", descriptor = "Z")
    private boolean field4883;

    @OriginalMember(owner = "client!rr", name = "B", descriptor = "Z")
    private boolean field4886;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "[Lpt;")
    public static class557[] field4860;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)Lqf;", line = 5)
    public final class711 method2236(int arg0) {
        field4859++;
        int var2 = 1 % ((68 - arg0) / 53);
        return this.field4889;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)Z", line = 16)
    private final boolean method2237(int arg0) {
        field4866++;
        if (arg0 != 9151) {
            this.field4889 = null;
        }
        if (this.field4889 == null) {
            double var2 = (double) this.field4878.method990(arg0 - 9277);
            return var2 == 0.0D || (double) class349.method2069(true) >= (double) this.field4878.method993(100) + 1000.0D / var2;
        } else {
            return !this.field4878.method984(0) || this.method2240((byte) 89) > this.field4878.method992(29033);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIZI)I", line = 36)
    public static final int method2238(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        int var7 = arg0 & 0x3;
        if ((arg6 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg1;
            arg1 = var8;
        }
        field4863++;
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return arg3;
        } else {
            if (!arg5) {
                field4890 = 8;
            }
            return var7 == 2 ? 1 + 7 - arg4 - arg2 : -arg3 + 7 + 1 + -arg1;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)Lfv;", line = 69)
    public final class133 method2239(byte arg0) {
        if (arg0 < 26) {
            this.field4878 = null;
        }
        field4881++;
        return this.field4878;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)D", line = 83)
    public final double method2240(byte arg0) {
        field4862++;
        if (this.field4889 != null) {
            return this.field4889.method4028((byte) -71);
        } else if (arg0 <= 25) {
            return 0.13379510210365256D;
        } else if (this.field4878 == null) {
            return 0.0D;
        } else {
            return this.field4878.method992(29033);
        }
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)V", line = 102)
    public final void method2241(byte arg0) {
        field4868++;
        if (this.field4869) {
            return;
        }
        int var2 = 105 / ((arg0 + 80) / 32);
        for (class219 var3 = (class219) this.field4885.method2119(-89); var3 != null; var3 = (class219) this.field4885.method2111((byte) 74)) {
            var3.method987(0);
            var3.field2572.method4164();
        }
        this.field4887.method4164();
        this.field4871.method4164();
        this.field4870.method4164();
        this.field4869 = true;
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(B)V", line = 140)
    private final void method2242(byte arg0) {
        field4882++;
        for (class219 var2 = (class219) this.field4885.method2119(-37); var2 != null; var2 = (class219) this.field4885.method2111((byte) -118)) {
            if (this.field4878 != var2) {
                while (var2.field2572.packetOut() == 1) {
                    var2.method1357((byte) -59, this.field4887);
                }
            }
        }
        if (this.field4878 == null || arg0 != -96) {
            return;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (!this.method2237(9151)) {
                return;
            }
            if (this.field4878.field2572.packetOut() != 1) {
                this.method2241((byte) -121);
                return;
            }
            this.field4878.method1357((byte) 121, this.field4887);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)V", line = 188)
    public final void method2243(int arg0, boolean arg1) {
        field4876++;
        if (this.field4889 != null) {
            class720 var3 = this.field4889.method4032((byte) -68);
            if (var3 != null) {
                var3.method4080(-1, arg1);
            }
        }
        this.field4886 = !this.field4886;
        if (arg0 > -63) {
            this.method2240((byte) 126);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)V", line = 208)
    private final void method2244(boolean arg0) {
        if (arg0) {
            this.field4864 = null;
        }
        field4884++;
        for (class219 var2 = (class219) this.field4885.method2119(-80); var2 != null; var2 = (class219) this.field4885.method2111((byte) -122)) {
            if (var2 instanceof class164) {
                class164 var3 = (class164) var2;
                while ((var3.field2569 <= 8 || this.method2240((byte) 109) > (double) var3.method1145(false)) && var3.field2572.packetOut(this.field4887) == 1) {
                    var3.method1357((byte) 126, this.field4887);
                }
            }
        }
        this.method2248(this.field4879, 114);
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V", line = 248)
    public final void method2245(int arg0) throws IOException {
        field4874++;
        if (this.field4886) {
            return;
        }
        if (arg0 != -51) {
            method2246(121, null, 3, -31, 101, -5, 63, 115, null);
        }
        while (!this.field4869) {
            class219 var2;
            if (this.field4865) {
                var2 = (class219) this.field4885.method2121(arg0 + 131, (long) this.field4871.getSerialNumber());
            } else {
                var2 = this.method2252(-28995);
                if (var2 == null) {
                    if (this.field4883) {
                        this.method2242((byte) -96);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field4865 = true;
            }
            if (this.field4889 == var2) {
                if (this.field4889.method4030((byte) 41) >= 50) {
                    return;
                }
                while (this.field4889.field2572.packetOut(this.field4887) == 1) {
                    this.field4889.method1357((byte) -95, this.field4887);
                    this.method2244(false);
                    if (this.field4878 != null) {
                        double var3 = this.field4878.method992(29033);
                        for (int var5 = 0; var5 < 10 && this.method2237(9151); var5++) {
                            this.method2250(10171);
                            if (this.field4869) {
                                return;
                            }
                        }
                        if (this.field4878.method992(29033) > var3) {
                            return;
                        }
                    }
                    if (this.field4889.method4030((byte) 41) >= 50) {
                        return;
                    }
                }
            } else if ((var2 instanceof class164)) {
                this.method2244(false);
            } else if (this.field4878 != var2) {
                while (var2.field2572.packetOut(this.field4887) == 1) {
                    if (var2.field2569 == 1 && var2 instanceof class164) {
                        this.method2248(this.field4879, 82);
                    }
                    var2.method1357((byte) -67, this.field4887);
                }
            } else if (this.field4889 == null && !this.field4886) {
                for (int var6 = 0; var6 < 10 && this.method2237(9151); var6++) {
                    this.method2250(10171);
                    if (this.field4869) {
                        return;
                    }
                }
                return;
            }
            this.field4865 = false;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I[BIIIIII[B)V", line = 365)
    public static final void method2246(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field4875++;
        int var9 = -(arg2 >> 2);
        int var10 = -(arg2 & 0x3);
        int var11 = -arg6;
        if (arg3 != -19590) {
            method2253(null, true);
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg8[var10001] += arg1[arg7++];
                int var14 = arg0++;
                arg8[var14] += arg1[arg7++];
                int var15 = arg0++;
                arg8[var15] += arg1[arg7++];
                int var16 = arg0++;
                arg8[var16] += arg1[arg7++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg8[var10001] += arg1[arg7++];
            }
            arg0 += arg4;
            arg7 += arg5;
            var11++;
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(Z)Las;", line = 411)
    public final class164 method2247(boolean arg0) {
        if (arg0) {
            this.method2240((byte) 21);
        }
        field4877++;
        return this.field4864;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 423)
    public final void method2248(String arg0, int arg1) {
        this.field4879 = arg0;
        field4888++;
        if (this.field4879 == null) {
            this.field4864 = null;
            return;
        }
        if (this.field4864 != null && !this.field4879.equals(this.field4864.method1144((byte) 109))) {
            this.field4864 = null;
        }
        if (arg1 <= 46) {
            this.field4886 = true;
        }
        if (this.field4864 != null) {
            return;
        }
        for (class219 var3 = (class219) this.field4885.method2119(-76); var3 != null; var3 = (class219) this.field4885.method2111((byte) 0)) {
            if (var3 instanceof class164) {
                class164 var4 = (class164) var3;
                if (this.field4879.equals(var4.method1144((byte) 12))) {
                    this.field4864 = var4;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)Z", line = 476)
    public final boolean method2249(int arg0) {
        field4872++;
        if (!this.field4869 && !this.field4883) {
            return false;
        } else if (this.field4889 == null || this.field4889.method4030((byte) 41) <= 0) {
            int var2 = 113 / ((arg0 + 33) / 52);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "(I)V", line = 493)
    private final void method2250(int arg0) throws IOException {
        field4880++;
        if (arg0 != 10171) {
            this.method2248(null, -63);
        }
        while (this.field4878.field2572.packetOut(this.field4887) != 1) {
            class219 var2 = this.method2252(-28995);
            if (var2 == null) {
                if (this.field4883) {
                    this.method2242((byte) -96);
                }
                return;
            }
            if (this.field4864 == var2) {
                this.method2244(false);
            }
        }
        this.field4878.method1357((byte) 98, this.field4887);
    }

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "(B)V", line = 522)
    public static void method2251(byte arg0) {
        if (arg0 != -20) {
            field4860 = null;
        }
        field4860 = null;
    }

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "(I)Lhi;", line = 533)
    private final class219 method2252(int arg0) throws IOException {
        field4867++;
        if (this.field4869) {
            throw new IllegalStateException();
        } else if (this.field4883) {
            return null;
        } else {
            while (this.field4870.pageOut(this.field4871) <= 0) {
                int var10 = this.method1493((byte) 120, this.field4861);
                if (var10 == -1) {
                    this.field4883 = true;
                    return null;
                }
                if (var10 == 0) {
                    return null;
                }
                if (!this.field4870.write(this.field4861, var10)) {
                    throw new RuntimeException("");
                }
            }
            if (arg0 != -28995) {
                this.method2243(-116, false);
            }
            int var2 = this.field4871.getSerialNumber();
            if (!this.field4871.isBOS()) {
                class219 var9 = (class219) this.field4885.method2121(arg0 + 29116, (long) var2);
                if (!var9.field2572.pageIn(this.field4871)) {
                    throw new IllegalStateException();
                }
                return var9;
            }
            OggStreamState var3 = new OggStreamState(var2);
            if (!var3.pageIn(this.field4871)) {
                throw new IllegalStateException();
            } else if (var3.packetPeek(this.field4887) == 1) {
                class219 var4;
                if (this.field4878 == null && this.field4887.isTheora()) {
                    this.field4878 = new class133(var3);
                    var4 = this.field4878;
                } else if (this.field4889 == null && this.field4887.isVorbis()) {
                    this.field4889 = new class711(var3);
                    var4 = this.field4889;
                } else {
                    byte[] var5 = this.field4887.getData();
                    StringBuffer var6 = new StringBuffer();
                    for (int var7 = 1; var5.length > var7 && Character.isLetterOrDigit((char) var5[var7]); var7++) {
                        var6.append((char) var5[var7]);
                    }
                    String var8 = var6.toString();
                    if (var8.equals("kate")) {
                        var4 = new class164(var3);
                    } else {
                        var4 = new class314(var3);
                    }
                }
                this.field4885.method2112(var4, (byte) 6, (long) var2);
                return var4;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(I)V", line = 651)
    public class382(int arg0) {
        if (!class37.method326((byte) 111, "jagtheora")) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field4861 = new byte[arg0];
        this.field4870 = new OggSyncState();
        this.field4871 = new OggPage();
        this.field4887 = new OggPacket();
        this.field4885 = new class362(8);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lvk;Z)V", line = 667)
    public static final void method2253(class388 arg0, boolean arg1) {
        field4873++;
        for (class96 var2 = (class96) class599.field8109.method2725(37); var2 != null; var2 = (class96) class599.field8109.method2726(-122)) {
            if (var2.field1281 == arg0) {
                if (var2.field1260 != null) {
                    class783.field10811.method3257(var2.field1260);
                    var2.field1260 = null;
                }
                var2.method2219(13630);
                return;
            }
        }
        if (!arg1) {
            field4890 = -14;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B[B)I")
    public abstract int method1493(byte arg0, byte[] arg1) throws IOException;
}
