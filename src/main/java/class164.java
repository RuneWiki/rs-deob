import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class164 extends class619 {

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "Lmga;")
    public static class30 field2263 = new class30("LOCAL", "", "local", 4);

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "F")
    private float field2254;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "F")
    private float field2256;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
    private int field2261;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    private int field2262;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "J")
    public static long field2268;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "Ljava/lang/String;")
    private String field2255;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "Ljava/lang/String;")
    private String field2264;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "Ljava/lang/String;")
    private String field2267;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)Ljava/lang/String;", line = 3)
    public final String method1016(byte arg0) {
        if (arg0 >= -34) {
            return null;
        } else {
            ++field2253;
            return this.field2255;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Ljagtheora/ogg/OggPacket;I)V", line = 15)
    public final void method799(OggPacket arg0, int arg1) {
        ++field2260;
        if (~super.field8306 >= -1 || "SUB".equals(this.field2264)) {
            if (arg1 == 16) {
                class63 var3 = new class63(arg0.getData());
                int var4 = var3.method505((byte) -119);
                if (~super.field8306 < -9) {
                    if (~var4 == -1) {
                        long var5 = var3.method481((byte) 67);
                        long var7 = var3.method481((byte) 85);
                        long var9 = var3.method481((byte) 100);
                        if (~var5 > -1L || ~var7 > -1L || var9 < 0L || ~var9 < ~var5) {
                            throw new IllegalStateException();
                        }
                        this.field2254 = (float) ((var5 + var7) * (long) this.field2262) / (float) this.field2261;
                        this.field2256 = (float) ((long) this.field2262 * var5) / (float) this.field2261;
                        int var11 = var3.method472(-884507928);
                        if (var11 < 0 || var3.field954.length + -var3.field956 < var11) {
                            throw new IllegalStateException();
                        }
                        this.field2267 = class379.method2376(var3.field954, (byte) -116, var11, var3.field956);
                    }
                    if (~(var4 | 128) != -1) {
                        return;
                    }
                } else {
                    if ((var4 | 128) == 0) {
                        throw new IllegalStateException();
                    }
                    if (~super.field8306 != -1) {
                        return;
                    }
                    var3.field956 += 23;
                    this.field2261 = var3.method472(-884507928);
                    this.field2262 = var3.method472(-884507928);
                    if (this.field2261 == 0 || ~this.field2262 == -1) {
                        throw new IllegalStateException();
                    }
                    class63 var12 = new class63(16);
                    var3.method449(0, 16, var12.field954, (byte) -126);
                    this.field2255 = var12.method479((byte) -12);
                    var12.field956 = 0;
                    var3.method449(0, 16, var12.field954, (byte) -128);
                    this.field2264 = var12.method479((byte) -15);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V", line = 88)
    public final void method804(byte arg0) {
        ++field2257;
        if (arg0 < 81) {
            this.field2261 = 115;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)F", line = 100)
    public final float method1017(int arg0) {
        ++field2266;
        if (arg0 >= -96) {
            method1018((byte) -25);
        }
        return this.field2256;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)V", line = 111)
    public static void method1018(byte arg0) {
        field2263 = null;
        if (arg0 > -30) {
            method1018((byte) 121);
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)F", line = 131)
    public final float method1019(int arg0) {
        if (arg0 != 1425) {
            this.method1016((byte) -33);
        }
        ++field2265;
        return this.field2254;
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)Ljava/lang/String;", line = 142)
    public final String method1020(int arg0) {
        int var2 = -104 % ((-28 - arg0) / 61);
        ++field2259;
        return this.field2267;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 153)
    public class164(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)V", line = 156)
    public static final void method1021(byte arg0, int arg1) {
        client.field6237 = new int[arg1];
        if (arg0 != 0) {
            field2263 = null;
        }
        class724.field10047 = new int[arg1];
        class147.field2055 = new int[arg1];
        class563.field7819 = new int[arg1];
        class92.field1282 = new int[arg1];
        ++field2258;
    }
}
