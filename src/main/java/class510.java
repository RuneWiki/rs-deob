import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public abstract class class510 {

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "[B")
    private byte[] field6905;

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field6902;

    @OriginalMember(owner = "client!lda", name = "F", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field6932;

    @OriginalMember(owner = "client!lda", name = "s", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field6919;

    @OriginalMember(owner = "client!lda", name = "C", descriptor = "Llk;")
    private class638 field6929;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "Ljn;")
    public static class134 field6906 = new class134(120, -2);

    @OriginalMember(owner = "client!lda", name = "y", descriptor = "I")
    public static int field6925 = 0;

    @OriginalMember(owner = "client!lda", name = "w", descriptor = "I")
    public static int field6923 = 4;

    @OriginalMember(owner = "client!lda", name = "A", descriptor = "[I")
    public static int[] field6927 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!lda", name = "z", descriptor = "Lqk;")
    public static class1 field6926 = new class1(71, 8);

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!lda", name = "j", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!lda", name = "k", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!lda", name = "l", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!lda", name = "m", descriptor = "I")
    public static int field6913;

    @OriginalMember(owner = "client!lda", name = "n", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!lda", name = "o", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!lda", name = "p", descriptor = "I")
    public static int field6916;

    @OriginalMember(owner = "client!lda", name = "q", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!lda", name = "r", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!lda", name = "v", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!lda", name = "x", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!lda", name = "B", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!lda", name = "E", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!lda", name = "H", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!lda", name = "I", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!lda", name = "J", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "Lwk;")
    private class254 field6901;

    @OriginalMember(owner = "client!lda", name = "G", descriptor = "Lk;")
    private class43 field6933;

    @OriginalMember(owner = "client!lda", name = "t", descriptor = "Ldi;")
    private class483 field6920;

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "Ljava/lang/String;")
    private String field6907;

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "Z")
    private boolean field6904;

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "Z")
    private boolean field6909;

    @OriginalMember(owner = "client!lda", name = "u", descriptor = "Z")
    private boolean field6921;

    @OriginalMember(owner = "client!lda", name = "D", descriptor = "Z")
    private boolean field6930;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V")
    private final void method2957(int arg0) {
        if (arg0 != 0) {
            this.method2973(68);
        }
        for (class329 var2 = (class329) this.field6929.method3668(-106); var2 != null; var2 = (class329) this.field6929.method3667((byte) 62)) {
            if (var2 instanceof class254) {
                class254 var3 = (class254) var2;
                while ((var3.field4616 <= 8 || this.method2959(arg0 ^ 0x7D) > (double) var3.method1697(false)) && var3.field4613.packetOut(this.field6919) == 1) {
                    var3.method2077((byte) -68, this.field6919);
                }
            }
        }
        field6934++;
        this.method2964(10777, this.field6907);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)Lfr;")
    private final class329 method2958(byte arg0) throws IOException {
        field6910++;
        if (this.field6930) {
            throw new IllegalStateException();
        } else if (this.field6904) {
            return null;
        } else if (arg0 >= -66) {
            return null;
        } else {
            while (this.field6902.pageOut(this.field6932) <= 0) {
                int var10 = this.method1620(this.field6905, 0);
                if (var10 == -1) {
                    this.field6904 = true;
                    return null;
                }
                if (var10 == 0) {
                    return null;
                }
                if (!this.field6902.write(this.field6905, var10)) {
                    throw new RuntimeException("");
                }
            }
            int var2 = this.field6932.getSerialNumber();
            if (!this.field6932.isBOS()) {
                class329 var9 = (class329) this.field6929.method3669(false, (long) var2);
                if (!var9.field4613.pageIn(this.field6932)) {
                    throw new IllegalStateException();
                }
                return var9;
            }
            OggStreamState var3 = new OggStreamState(var2);
            if (!var3.pageIn(this.field6932)) {
                throw new IllegalStateException();
            } else if (var3.packetPeek(this.field6919) == 1) {
                class329 var4;
                if (this.field6933 == null && this.field6919.isTheora()) {
                    this.field6933 = new class43(var3);
                    var4 = this.field6933;
                } else if (this.field6920 == null && this.field6919.isVorbis()) {
                    this.field6920 = new class483(var3);
                    var4 = this.field6920;
                } else {
                    byte[] var5 = this.field6919.getData();
                    StringBuffer var6 = new StringBuffer();
                    for (int var7 = 1; var5.length > var7 && Character.isLetterOrDigit((char) var5[var7]); var7++) {
                        var6.append((char) var5[var7]);
                    }
                    String var8 = var6.toString();
                    if (var8.equals("kate")) {
                        var4 = new class254(var3);
                    } else {
                        var4 = new class505(var3);
                    }
                }
                this.field6929.method3666((byte) 65, (long) var2, var4);
                return var4;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)D")
    public final double method2959(int arg0) {
        field6916++;
        if (arg0 <= 35) {
            field6923 = 43;
        }
        if (this.field6920 == null) {
            return this.field6933 == null ? 0.0D : this.field6933.method341((byte) 20);
        } else {
            return this.field6920.method2870(0);
        }
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(B)V")
    public static void method2960(byte arg0) {
        field6927 = null;
        field6906 = null;
        field6926 = null;
        int var1 = 108 / ((16 - arg0) / 58);
    }

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "(B)Z")
    private final boolean method2961(byte arg0) {
        field6924++;
        int var2 = 14 / ((5 - arg0) / 32);
        if (this.field6920 == null) {
            double var3 = (double) this.field6933.method338((byte) 106);
            return var3 == 0.0D || (double) class683.method3903((byte) 4) >= 1000.0D / var3 + (double) this.field6933.method343(-29610);
        } else {
            return !this.field6933.method340(true) || this.method2959(105) > this.field6933.method341((byte) 49);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZB)V")
    public final void method2962(boolean arg0, byte arg1) {
        if (arg1 <= 70) {
            return;
        }
        field6936++;
        if (this.field6920 != null) {
            class271 var3 = this.field6920.method2869(-7532);
            if (var3 != null) {
                var3.method1759(arg0, -7906);
            }
        }
        this.field6921 = !this.field6921;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)V")
    private final void method2963(boolean arg0) throws IOException {
        field6914++;
        if (arg0) {
            this.method2961((byte) -101);
        }
        while (this.field6933.field4613.packetOut(this.field6919) != 1) {
            class329 var2 = this.method2958((byte) -93);
            if (var2 == null) {
                if (this.field6904) {
                    this.method2965(arg0);
                }
                return;
            }
            if (this.field6901 == var2) {
                this.method2957(0);
            }
        }
        this.field6933.method2077((byte) -118, this.field6919);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method2964(int arg0, String arg1) {
        field6911++;
        this.field6907 = arg1;
        if (this.field6907 == null) {
            this.field6901 = null;
            return;
        }
        if (this.field6901 != null && !this.field6907.equals(this.field6901.method1699(116))) {
            this.field6901 = null;
        }
        if (this.field6901 == null) {
            for (class329 var3 = (class329) this.field6929.method3668(-92); var3 != null; var3 = (class329) this.field6929.method3667((byte) 80)) {
                if (var3 instanceof class254) {
                    class254 var4 = (class254) var3;
                    if (this.field6907.equals(var4.method1699(122))) {
                        this.field6901 = var4;
                        return;
                    }
                }
            }
        }
        if (arg0 != 10777) {
            method2960((byte) 57);
        }
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(Z)V")
    private final void method2965(boolean arg0) {
        class329 var2 = (class329) this.field6929.method3668(30);
        if (arg0) {
            field6918 = 63;
        }
        while (var2 != null) {
            if (this.field6933 != var2) {
                while (var2.field4613.packetOut() == 1) {
                    var2.method2077((byte) -61, this.field6919);
                }
            }
            var2 = (class329) this.field6929.method3667((byte) -60);
        }
        field6931++;
        if (this.field6933 == null) {
            return;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (!this.method2961((byte) -107)) {
                return;
            }
            if (this.field6933.field4613.packetOut() != 1) {
                this.method2968((byte) -47);
                return;
            }
            this.field6933.method2077((byte) -94, this.field6919);
        }
    }

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "(B)V")
    public static final void method2966(byte arg0) {
        class231.field3485.method2708(5, true);
        field6912++;
        class632.field8833.method3364(5, -126);
        class15.field91.method2617(-16777216, 5);
        class390.field5558.method3061(5, -1);
        class104.field1201.method4320(5, -1295);
        class35.field367.method3047(5, 1);
        class571.field8029.method3693(5, -31435);
        class576.field8094.method4136(5, (byte) 90);
        class650.field9089.method1964(5, (byte) 55);
        class206.field2895.method1928(5, (byte) 118);
        class326.field4583.method1351(0, 5);
        class671.field9419.method2875((byte) -42, 5);
        class657.field9274.method515(5, true);
        class35.field354.method2916(5, (byte) 30);
        class734.field10126.method705(0, 5);
        class545.field7585.method2790(5, (byte) -91);
        class72.field790.method672(5, 29);
        class651.field9101.method553(28295, 5);
        class444.field6154.method3189(-224, 5);
        class315.field4514.method1870(5, (byte) -8);
        class616.field8649.method2431((byte) 34, 5);
        class10.field67.method2204(false, 5);
        class553.method3260(0, 5);
        class8.method20(50, (byte) 98);
        class44.method350(88, 50);
        class175.method1123(true, 5);
        if (arg0 < 111) {
            field6923 = 92;
        }
        class353.method2224(-114, 5);
        class766.field10538.method308(-1, 5);
        class380.field5447.method308(-1, 5);
        class170.field2167.method308(-1, 5);
        class463.field6468.method308(-1, 5);
        class700.field9741.method308(-1, 5);
    }

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "(B)V")
    public final void method2967(byte arg0) throws IOException {
        field6908++;
        if (arg0 < 14) {
            this.field6907 = null;
        }
        if (this.field6921) {
            return;
        }
        while (!this.field6930) {
            class329 var2;
            if (this.field6909) {
                var2 = (class329) this.field6929.method3669(false, (long) this.field6932.getSerialNumber());
            } else {
                var2 = this.method2958((byte) -87);
                if (var2 == null) {
                    if (this.field6904) {
                        this.method2965(false);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field6909 = true;
            }
            if (this.field6920 == var2) {
                if (this.field6920.method2868(1) >= 50) {
                    return;
                }
                while (this.field6920.field4613.packetOut(this.field6919) == 1) {
                    this.field6920.method2077((byte) -111, this.field6919);
                    this.method2957(0);
                    if (this.field6933 != null) {
                        double var4 = this.field6933.method341((byte) 110);
                        for (int var6 = 0; var6 < 10 && this.method2961((byte) -93); var6++) {
                            this.method2963(false);
                            if (this.field6930) {
                                return;
                            }
                        }
                        if (this.field6933.method341((byte) -15) > var4) {
                            return;
                        }
                    }
                    if (this.field6920.method2868(1) >= 50) {
                        return;
                    }
                }
            } else if (var2 instanceof class254) {
                this.method2957(0);
            } else if (this.field6933 != var2) {
                while (var2.field4613.packetOut(this.field6919) == 1) {
                    if (var2.field4616 == 1 && var2 instanceof class254) {
                        this.method2964(10777, this.field6907);
                    }
                    var2.method2077((byte) -54, this.field6919);
                }
            } else if (this.field6920 == null && !this.field6921) {
                for (int var3 = 0; var3 < 10 && this.method2961((byte) -47); var3++) {
                    this.method2963(false);
                    if (this.field6930) {
                        return;
                    }
                }
                return;
            }
            this.field6909 = false;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "([BI)I")
    public abstract int method1620(byte[] arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "(B)V")
    public final void method2968(byte arg0) {
        field6928++;
        if (this.field6930) {
            return;
        }
        if (arg0 != -47) {
            this.method2971(-33);
        }
        for (class329 var2 = (class329) this.field6929.method3668(arg0 ^ 0xFFFFFFEF); var2 != null; var2 = (class329) this.field6929.method3667((byte) -67)) {
            var2.method342(false);
            var2.field4613.method994();
        }
        this.field6919.method994();
        this.field6932.method994();
        this.field6902.method994();
        this.field6930 = true;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "([BII)I")
    public static final int method2969(byte[] arg0, int arg1, int arg2) {
        field6917++;
        return arg1 == 0 ? class226.method1521(arg2, arg0, 0, -96) : -45;
    }

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "(I)Lk;")
    public final class43 method2970(int arg0) {
        field6903++;
        if (arg0 >= -108) {
            field6923 = 107;
        }
        return this.field6933;
    }

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "(I)Ldi;")
    public final class483 method2971(int arg0) {
        if (arg0 != 0) {
            this.field6902 = null;
        }
        field6935++;
        return this.field6920;
    }

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "(I)Z")
    public final boolean method2972(int arg0) {
        field6913++;
        if (this.field6930 || this.field6904) {
            if (arg0 != 0) {
                method2969(null, -36, -45);
            }
            return this.field6920 == null || this.field6920.method2868(1) <= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "(I)Lwk;")
    public final class254 method2973(int arg0) {
        if (arg0 != -1123) {
            field6925 = 100;
        }
        field6915++;
        return this.field6901;
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(I)V")
    public class510(int arg0) {
        if (!class161.method1027(51, "jagtheora")) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field6905 = new byte[arg0];
        this.field6902 = new OggSyncState();
        this.field6932 = new OggPage();
        this.field6919 = new OggPacket();
        this.field6929 = new class638(8);
    }
}
