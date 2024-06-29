import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public abstract class class303 {

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "[B")
    private byte[] field4351;

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field4349;

    @OriginalMember(owner = "client!oaa", name = "w", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field4370;

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field4353;

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "Ljo;")
    private class353 field4352;

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!oaa", name = "m", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!oaa", name = "n", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!oaa", name = "p", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!oaa", name = "q", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!oaa", name = "r", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!oaa", name = "t", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!oaa", name = "u", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!oaa", name = "v", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!oaa", name = "A", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!oaa", name = "C", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!oaa", name = "x", descriptor = "Lkk;")
    private class202 field4371;

    @OriginalMember(owner = "client!oaa", name = "s", descriptor = "Lio;")
    private class460 field4366;

    @OriginalMember(owner = "client!oaa", name = "y", descriptor = "Lwaa;")
    private class731 field4372;

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "Ljava/lang/String;")
    private String field4373;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "Z")
    private boolean field4348;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "Z")
    private boolean field4350;

    @OriginalMember(owner = "client!oaa", name = "l", descriptor = "Z")
    private boolean field4359;

    @OriginalMember(owner = "client!oaa", name = "B", descriptor = "Z")
    private boolean field4375;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)Z", line = 5)
    private final boolean method1954(int arg0) {
        field4354++;
        if (arg0 < 8) {
            return true;
        } else if (this.field4372 == null) {
            double var2 = (double) this.field4366.method2738((byte) 126);
            return var2 == 0.0D || (double) class459.method2731(117) >= (double) this.field4366.method2739(0) + 1000.0D / var2;
        } else {
            return !this.field4366.method2741(112) || this.method1970(-53) > this.field4366.method2736(124);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)Z", line = 25)
    public final boolean method1955(byte arg0) {
        int var2 = 82 % ((arg0 + 18) / 48);
        field4369++;
        if (this.field4359 || this.field4348) {
            return this.field4372 == null || this.field4372.method4088((byte) -126) <= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)Lih;", line = 43)
    private final class728 method1956(int arg0) throws IOException {
        field4355++;
        if (this.field4359) {
            throw new IllegalStateException();
        } else if (this.field4348) {
            return null;
        } else if (arg0 == 1) {
            while (this.field4349.pageOut(this.field4370) <= 0) {
                int var10 = this.method1967(this.field4351, false);
                if (var10 == -1) {
                    this.field4348 = true;
                    return null;
                }
                if (var10 == 0) {
                    return null;
                }
                if (!this.field4349.write(this.field4351, var10)) {
                    throw new RuntimeException("");
                }
            }
            int var2 = this.field4370.getSerialNumber();
            if (!this.field4370.isBOS()) {
                class728 var9 = (class728) this.field4352.method2242((long) var2, -1);
                if (!var9.field10053.pageIn(this.field4370)) {
                    throw new IllegalStateException();
                }
                return var9;
            }
            OggStreamState var3 = new OggStreamState(var2);
            if (!var3.pageIn(this.field4370)) {
                throw new IllegalStateException();
            } else if (var3.packetPeek(this.field4353) == 1) {
                class728 var4;
                if (this.field4366 == null && this.field4353.isTheora()) {
                    this.field4366 = new class460(var3);
                    var4 = this.field4366;
                } else if (this.field4372 == null && this.field4353.isVorbis()) {
                    this.field4372 = new class731(var3);
                    var4 = this.field4372;
                } else {
                    byte[] var5 = this.field4353.getData();
                    StringBuffer var6 = new StringBuffer();
                    for (int var7 = 1; var7 < var5.length && Character.isLetterOrDigit((char) var5[var7]); var7++) {
                        var6.append((char) var5[var7]);
                    }
                    String var8 = var6.toString();
                    if (var8.equals("kate")) {
                        var4 = new class202(var3);
                    } else {
                        var4 = new class314(var3);
                    }
                }
                this.field4352.method2241(74, (long) var2, var4);
                return var4;
            } else {
                throw new IllegalStateException();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 164)
    public final void method1957(String arg0, byte arg1) {
        this.field4373 = arg0;
        field4368++;
        if (arg1 != 104) {
            method1961(null, null, null, -32, -125, -39, 76, 46);
        }
        if (this.field4373 == null) {
            this.field4371 = null;
            return;
        }
        if (this.field4371 != null && !this.field4373.equals(this.field4371.method1419(118))) {
            this.field4371 = null;
        }
        if (this.field4371 != null) {
            return;
        }
        for (class728 var3 = (class728) this.field4352.method2243((byte) 100); var3 != null; var3 = (class728) this.field4352.method2248(-15690)) {
            if (var3 instanceof class202) {
                class202 var4 = (class202) var3;
                if (this.field4373.equals(var4.method1419(82))) {
                    this.field4371 = var4;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "(I)V", line = 218)
    private final void method1958(int arg0) throws IOException {
        field4367++;
        while (this.field4366.field10053.packetOut(this.field4353) != 1) {
            class728 var2 = this.method1956(1);
            if (var2 == null) {
                if (this.field4348) {
                    this.method1965(7344);
                }
                return;
            }
            if (this.field4371 == var2) {
                this.method1968((byte) 100);
            }
        }
        this.field4366.method4074(-124, this.field4353);
        if (arg0 != 5098) {
            this.method1959(19);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "(I)Lwaa;", line = 248)
    public final class731 method1959(int arg0) {
        if (arg0 != 1) {
            this.field4370 = null;
        }
        field4360++;
        return this.field4372;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)V", line = 263)
    public final void method1960(boolean arg0) throws IOException {
        if (arg0) {
            method1961(null, null, null, 33, -22, -122, 11, -126);
        }
        field4363++;
        if (this.field4350) {
            return;
        }
        while (!this.field4359) {
            class728 var2;
            if (this.field4375) {
                var2 = (class728) this.field4352.method2242((long) this.field4370.getSerialNumber(), -1);
            } else {
                var2 = this.method1956(1);
                if (var2 == null) {
                    if (this.field4348) {
                        this.method1965(7344);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field4375 = true;
            }
            if (this.field4372 == var2) {
                if (this.field4372.method4088((byte) -116) >= 50) {
                    return;
                }
                while (this.field4372.field10053.packetOut(this.field4353) == 1) {
                    this.field4372.method4074(-57, this.field4353);
                    this.method1968((byte) 103);
                    if (this.field4366 != null) {
                        double var4 = this.field4366.method2736(127);
                        for (int var6 = 0; var6 < 10 && this.method1954(20); var6++) {
                            this.method1958(5098);
                            if (this.field4359) {
                                return;
                            }
                        }
                        if (var4 < this.field4366.method2736(125)) {
                            return;
                        }
                    }
                    if (this.field4372.method4088((byte) -114) >= 50) {
                        return;
                    }
                }
            } else if ((var2 instanceof class202)) {
                this.method1968((byte) 92);
            } else if (this.field4366 != var2) {
                while (var2.field10053.packetOut(this.field4353) == 1) {
                    if (var2.field10052 == 1 && var2 instanceof class202) {
                        this.method1957(this.field4373, (byte) 104);
                    }
                    var2.method4074(-41, this.field4353);
                }
            } else if (this.field4372 == null && !this.field4350) {
                for (int var3 = 0; var3 < 10 && this.method1954(84); var3++) {
                    this.method1958(5098);
                    if (this.field4359) {
                        return;
                    }
                }
                return;
            }
            this.field4375 = false;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lkv;Lav;Lfb;IIIII)V", line = 386)
    public static final void method1961(class282 arg0, class665 arg1, class702 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4364++;
        class513 var8 = new class513();
        var8.field7256 = arg4 << 9;
        var8.field7259 = arg7;
        if (arg5 < 115) {
            return;
        }
        var8.field7264 = arg3 << 9;
        if (arg0 != null) {
            var8.field7261 = arg0;
            int var9 = arg0.field4188;
            int var10 = arg0.field4125;
            if (arg6 == 1 || arg6 == 3) {
                var9 = arg0.field4125;
                var10 = arg0.field4188;
            }
            var8.field7253 = arg0.field4170 << 9;
            var8.field7258 = arg3 + var10 << 9;
            var8.field7244 = arg0.field4173;
            var8.field7243 = arg0.field4132;
            var8.field7247 = arg0.field4136;
            var8.field7234 = arg0.field4140;
            var8.field7242 = arg0.field4146;
            var8.field7255 = arg0.field4167;
            var8.field7266 = arg0.field4148;
            var8.field7262 = arg4 + var9 << 9;
            var8.field7250 = arg0.field4096;
            var8.field7265 = arg0.field4152;
            var8.field7249 = arg0.field4168 << 9;
            if (arg0.field4117 != null) {
                var8.field7241 = true;
                var8.method3095(90);
            }
            if (var8.field7255 != null) {
                var8.field7235 = (int) ((double) (var8.field7243 - var8.field7250) * Math.random()) + var8.field7250;
            }
            class488.field6903.method1727(var8, (byte) 69);
        } else if (arg1 != null) {
            var8.field7248 = arg1;
            class110 var11 = arg1.field9240;
            if (var11.field1657 != null) {
                var8.field7241 = true;
                var11 = var11.method840(class537.field7727, 102);
            }
            if (var11 != null) {
                var8.field7258 = var11.field1635 + arg3 << 9;
                var8.field7262 = var11.field1635 + arg4 << 9;
                var8.field7266 = class48.method339(arg1, true);
                var8.field7234 = var11.field1647;
                var8.field7265 = var11.field1627;
                var8.field7247 = var11.field1668;
                var8.field7253 = var11.field1628 << 9;
                var8.field7244 = var11.field1625;
                var8.field7249 = var11.field1650 << 9;
            }
            class376.field5192.method1727(var8, (byte) 102);
        } else if (arg2 != null) {
            var8.field7257 = arg2;
            var8.field7262 = arg2.method2102(true) + arg4 << 9;
            var8.field7258 = arg3 + arg2.method2102(true) << 9;
            var8.field7266 = class680.method3854(false, arg2);
            var8.field7247 = 256;
            var8.field7244 = arg2.field9759;
            var8.field7249 = 0;
            var8.field7253 = arg2.field9760 << 9;
            var8.field7265 = 256;
            var8.field7234 = arg2.field9782;
            class585.field8269.method2241(-55, (long) arg2.field4640, var8);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(B)Lkk;", line = 493)
    public final class202 method1962(byte arg0) {
        field4357++;
        int var2 = -83 % ((39 - arg0) / 50);
        return this.field4371;
    }

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "(I)Lio;", line = 506)
    public final class460 method1963(int arg0) {
        if (arg0 != -905192855) {
            this.method1963(23);
        }
        field4376++;
        return this.field4366;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IZ)V", line = 518)
    public final void method1964(int arg0, boolean arg1) {
        if (this.field4372 != null) {
            class352 var3 = this.field4372.method4087(true);
            if (var3 != null) {
                var3.method2226(arg1, 256);
            }
        }
        if (arg0 < 60) {
            this.field4372 = null;
        }
        field4356++;
        this.field4350 = !this.field4350;
    }

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "(I)V", line = 541)
    private final void method1965(int arg0) {
        if (arg0 != 7344) {
            return;
        }
        for (class728 var2 = (class728) this.field4352.method2243((byte) 100); var2 != null; var2 = (class728) this.field4352.method2248(-15690)) {
            if (this.field4366 != var2) {
                while (var2.field10053.packetOut() == 1) {
                    var2.method4074(arg0 - 7376, this.field4353);
                }
            }
        }
        field4361++;
        if (this.field4366 == null) {
            return;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (!this.method1954(96)) {
                return;
            }
            if (this.field4366.field10053.packetOut() != 1) {
                this.method1969((byte) -113);
                return;
            }
            this.field4366.method4074(-66, this.field4353);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(III[B[BIIII)V", line = 589)
    public static final void method1966(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        field4362++;
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 0x3);
        if (arg2 >= -72) {
            return;
        }
        for (int var11 = -arg7; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg3[var10001] += arg4[arg6++];
                int var14 = arg1++;
                arg3[var14] += arg4[arg6++];
                int var15 = arg1++;
                arg3[var15] += arg4[arg6++];
                int var16 = arg1++;
                arg3[var16] += arg4[arg6++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg3[var10001] += arg4[arg6++];
            }
            arg6 += arg5;
            arg1 += arg0;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "(B)V", line = 635)
    private final void method1968(byte arg0) {
        field4374++;
        if (arg0 < 89) {
            return;
        }
        for (class728 var2 = (class728) this.field4352.method2243((byte) 100); var2 != null; var2 = (class728) this.field4352.method2248(-15690)) {
            if (var2 instanceof class202) {
                class202 var3 = (class202) var2;
                while ((var3.field10052 <= 8 || this.method1970(-102) > (double) var3.method1413(true)) && var3.field10053.packetOut(this.field4353) == 1) {
                    var3.method4074(-57, this.field4353);
                }
            }
        }
        this.method1957(this.field4373, (byte) 104);
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(I)V", line = 670)
    public class303(int arg0) {
        if (!class581.method3402("jagtheora", (byte) -18)) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field4351 = new byte[arg0];
        this.field4349 = new OggSyncState();
        this.field4370 = new OggPage();
        this.field4353 = new OggPacket();
        this.field4352 = new class353(8);
    }

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "(B)V", line = 686)
    public final void method1969(byte arg0) {
        field4365++;
        if (this.field4359) {
            return;
        }
        for (class728 var2 = (class728) this.field4352.method2243((byte) 100); var2 != null; var2 = (class728) this.field4352.method2248(-15690)) {
            var2.method1416(-12054);
            var2.field10053.method4129();
        }
        if (arg0 > 0) {
            this.field4372 = null;
        }
        this.field4353.method4129();
        this.field4370.method4129();
        this.field4349.method4129();
        this.field4359 = true;
    }

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "(I)D", line = 714)
    public final double method1970(int arg0) {
        field4358++;
        if (this.field4372 == null) {
            if (arg0 >= -42) {
                this.method1965(75);
            }
            return this.field4366 == null ? 0.0D : this.field4366.method2736(127);
        } else {
            return this.field4372.method4092(0);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "([BZ)I")
    public abstract int method1967(byte[] arg0, boolean arg1) throws IOException;
}
