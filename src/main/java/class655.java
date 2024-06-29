import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class class655 {

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "[B")
    private byte[] field9148;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Ljagtheora/ogg/OggSyncState;")
    private OggSyncState field9139;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Ljagtheora/ogg/OggPage;")
    private OggPage field9136;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Ljagtheora/ogg/OggPacket;")
    private OggPacket field9125;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "Lwr;")
    private class459 field9140;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Z")
    public static boolean field9126 = false;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "[I")
    public static int[] field9137 = new int[3];

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field9122;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field9123;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field9124;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field9127;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field9128;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field9135;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field9141;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public static int field9142;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public static int field9144;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field9147;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
    public static int field9149;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "Lsb;")
    private class293 field9145;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lcga;")
    private class482 field9133;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lwda;")
    private class638 field9121;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Ljava/lang/String;")
    private String field9131;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Z")
    private boolean field9129;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Z")
    private boolean field9130;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "Z")
    private boolean field9143;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "Z")
    private boolean field9150;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBIII)V")
    public static final void method3694(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class29.field238 = arg2;
        if (arg1 <= -47) {
            class165.field2070 = arg0;
            field9138++;
            class759.field10576 = arg3;
            class122.field1604 = arg4;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[B)I")
    public abstract int method593(int arg0, byte[] arg1) throws IOException;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Lcga;")
    public final class482 method3695(byte arg0) {
        field9142++;
        return arg0 == -79 ? this.field9133 : null;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)D")
    public final double method3696(byte arg0) {
        field9122++;
        if (this.field9133 != null) {
            return this.field9133.method2708(0);
        } else if (this.field9145 == null) {
            if (arg0 > -80) {
                method3701(108);
            }
            return 0.0D;
        } else {
            return this.field9145.method1751(0);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Z")
    public final boolean method3697(boolean arg0) {
        field9127++;
        if (!arg0) {
            field9126 = true;
        }
        if (this.field9150 || this.field9130) {
            return this.field9133 == null || this.field9133.method2711((byte) -110) <= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public final void method3698(int arg0) {
        field9123++;
        if (this.field9150 || arg0 != 8) {
            return;
        }
        for (class340 var2 = (class340) this.field9140.method2560(108); var2 != null; var2 = (class340) this.field9140.method2557(-1)) {
            var2.method1723(-1128);
            var2.field4580.method3996();
        }
        this.field9125.method3996();
        this.field9136.method3996();
        this.field9139.method3996();
        this.field9150 = true;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)V")
    public final void method3699(boolean arg0) throws IOException {
        field9147++;
        if (arg0 || this.field9143) {
            return;
        }
        while (!this.field9150) {
            class340 var2;
            if (this.field9129) {
                var2 = (class340) this.field9140.method2552((long) this.field9136.getSerialNumber(), -1);
            } else {
                var2 = this.method3709(1);
                if (var2 == null) {
                    if (this.field9130) {
                        this.method3702(-2);
                    }
                    return;
                }
                if (var2 == null) {
                    throw new IllegalStateException();
                }
                this.field9129 = true;
            }
            if (this.field9133 == var2) {
                if (this.field9133.method2711((byte) -18) >= 50) {
                    return;
                }
                while (this.field9133.field4580.packetOut(this.field9125) == 1) {
                    this.field9133.method2008(this.field9125, 21000);
                    this.method3705((byte) 119);
                    if (this.field9145 != null) {
                        double var3 = this.field9145.method1751(0);
                        for (int var5 = 0; var5 < 10 && this.method3707((byte) -59); var5++) {
                            this.method3700(-88);
                            if (this.field9150) {
                                return;
                            }
                        }
                        if (this.field9145.method1751(0) > var3) {
                            return;
                        }
                    }
                    if (this.field9133.method2711((byte) -63) >= 50) {
                        return;
                    }
                }
            } else if ((var2 instanceof class638)) {
                this.method3705((byte) 127);
            } else if (this.field9145 != var2) {
                while (var2.field4580.packetOut(this.field9125) == 1) {
                    if (var2.field4578 == 1 && var2 instanceof class638) {
                        this.method3704(!arg0, this.field9131);
                    }
                    var2.method2008(this.field9125, 21000);
                }
            } else if (this.field9133 == null && !this.field9143) {
                for (int var6 = 0; var6 < 10 && this.method3707((byte) -59); var6++) {
                    this.method3700(-95);
                    if (this.field9150) {
                        return;
                    }
                }
                return;
            }
            this.field9129 = false;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    private final void method3700(int arg0) throws IOException {
        field9149++;
        while (this.field9145.field4580.packetOut(this.field9125) != 1) {
            class340 var2 = this.method3709(1);
            if (var2 == null) {
                if (this.field9130) {
                    this.method3702(-2);
                }
                return;
            }
            if (this.field9121 == var2) {
                this.method3705((byte) 109);
            }
        }
        this.field9145.method2008(this.field9125, 21000);
        if (arg0 >= -83) {
            this.method3703(40);
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
    public static void method3701(int arg0) {
        field9137 = null;
        if (arg0 != 10) {
            field9126 = true;
        }
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
    private final void method3702(int arg0) {
        for (class340 var2 = (class340) this.field9140.method2560(97); var2 != null; var2 = (class340) this.field9140.method2557(-1)) {
            if (this.field9145 != var2) {
                while (var2.field4580.packetOut() == 1) {
                    var2.method2008(this.field9125, arg0 + 21002);
                }
            }
        }
        if (arg0 != -2) {
            method3694(-96, (byte) 32, 48, 89, 40);
        }
        field9144++;
        if (this.field9145 == null) {
            return;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (!this.method3707((byte) -59)) {
                return;
            }
            if (this.field9145.field4580.packetOut() != 1) {
                this.method3698(8);
                return;
            }
            this.field9145.method2008(this.field9125, 21000);
        }
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)Lsb;")
    public final class293 method3703(int arg0) {
        if (arg0 != -32675) {
            this.field9136 = null;
        }
        field9132++;
        return this.field9145;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public final void method3704(boolean arg0, String arg1) {
        field9135++;
        if (!arg0) {
            this.field9131 = null;
        }
        this.field9131 = arg1;
        if (this.field9131 == null) {
            this.field9121 = null;
            return;
        }
        if (this.field9121 != null && !this.field9131.equals(this.field9121.method3589(arg0))) {
            this.field9121 = null;
        }
        if (this.field9121 != null) {
            return;
        }
        for (class340 var3 = (class340) this.field9140.method2560(111); var3 != null; var3 = (class340) this.field9140.method2557(-1)) {
            if (var3 instanceof class638) {
                class638 var4 = (class638) var3;
                if (this.field9131.equals(var4.method3589(true))) {
                    this.field9121 = var4;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V")
    private final void method3705(byte arg0) {
        for (class340 var2 = (class340) this.field9140.method2560(101); var2 != null; var2 = (class340) this.field9140.method2557(-1)) {
            if (var2 instanceof class638) {
                class638 var3 = (class638) var2;
                while ((var3.field4578 <= 8 || this.method3696((byte) -112) > (double) var3.method3591(-6085)) && var3.field4580.packetOut(this.field9125) == 1) {
                    var3.method2008(this.field9125, 21000);
                }
            }
        }
        if (arg0 < 102) {
            this.field9150 = true;
        }
        field9141++;
        this.method3704(true, this.field9131);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZB)V")
    public final void method3706(boolean arg0, byte arg1) {
        if (this.field9133 != null) {
            class333 var3 = this.field9133.method2707((byte) 88);
            if (var3 != null) {
                var3.method1988(arg0, arg1 ^ 0xFC7F699F);
            }
        }
        field9146++;
        if (arg1 != 22) {
            this.field9139 = null;
        }
        this.field9143 = !this.field9143;
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)Z")
    private final boolean method3707(byte arg0) {
        field9128++;
        if (arg0 != -59) {
            this.method3704(true, null);
        }
        if (this.field9133 == null) {
            double var2 = (double) this.field9145.method1745(-1);
            return var2 == 0.0D || (double) class538.method2963(-47) >= (double) this.field9145.method1749(false) + 1000.0D / var2;
        } else {
            return !this.field9145.method1747(1024) || this.method3696((byte) -117) > this.field9145.method1751(0);
        }
    }

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)Lwda;")
    public final class638 method3708(int arg0) {
        if (arg0 != 1) {
            this.method3697(false);
        }
        field9124++;
        return this.field9121;
    }

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "(I)Lrd;")
    private final class340 method3709(int arg0) throws IOException {
        if (arg0 != 1) {
            this.method3703(110);
        }
        field9134++;
        if (this.field9150) {
            throw new IllegalStateException();
        } else if (this.field9130) {
            return null;
        } else {
            while (this.field9139.pageOut(this.field9136) <= 0) {
                int var10 = this.method593(arg0 + 48, this.field9148);
                if (var10 == -1) {
                    this.field9130 = true;
                    return null;
                }
                if (var10 == 0) {
                    return null;
                }
                if (!this.field9139.write(this.field9148, var10)) {
                    throw new RuntimeException("");
                }
            }
            int var2 = this.field9136.getSerialNumber();
            if (!this.field9136.isBOS()) {
                class340 var3 = (class340) this.field9140.method2552((long) var2, -1);
                if (!var3.field4580.pageIn(this.field9136)) {
                    throw new IllegalStateException();
                }
                return var3;
            }
            OggStreamState var4 = new OggStreamState(var2);
            if (!var4.pageIn(this.field9136)) {
                throw new IllegalStateException();
            } else if (var4.packetPeek(this.field9125) == 1) {
                class340 var5;
                if (this.field9145 == null && this.field9125.isTheora()) {
                    this.field9145 = new class293(var4);
                    var5 = this.field9145;
                } else if (this.field9133 == null && this.field9125.isVorbis()) {
                    this.field9133 = new class482(var4);
                    var5 = this.field9133;
                } else {
                    byte[] var6 = this.field9125.getData();
                    StringBuffer var7 = new StringBuffer();
                    for (int var8 = 1; var8 < var6.length && Character.isLetterOrDigit((char) var6[var8]); var8++) {
                        var7.append((char) var6[var8]);
                    }
                    String var9 = var7.toString();
                    if (var9.equals("kate")) {
                        var5 = new class638(var4);
                    } else {
                        var5 = new class287(var4);
                    }
                }
                this.field9140.method2558(var5, (long) var2, -1);
                return var5;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
    public class655(int arg0) {
        if (!class492.method2758("jagtheora", (byte) -36)) {
            throw new RuntimeException("Failed to load jagtheora library");
        }
        this.field9148 = new byte[arg0];
        this.field9139 = new OggSyncState();
        this.field9136 = new OggPage();
        this.field9125 = new OggPacket();
        this.field9140 = new class459(8);
    }
}
