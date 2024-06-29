import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class377 extends class518 {

    @OriginalMember(owner = "client!ku", name = "I", descriptor = "I")
    public static int field5713 = 1406;

    @OriginalMember(owner = "client!ku", name = "v", descriptor = "F")
    private float field5700;

    @OriginalMember(owner = "client!ku", name = "G", descriptor = "F")
    private float field5711;

    @OriginalMember(owner = "client!ku", name = "t", descriptor = "I")
    private int field5698;

    @OriginalMember(owner = "client!ku", name = "u", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!ku", name = "w", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!ku", name = "y", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!ku", name = "A", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!ku", name = "B", descriptor = "I")
    private int field5706;

    @OriginalMember(owner = "client!ku", name = "C", descriptor = "I")
    public static int field5707;

    @OriginalMember(owner = "client!ku", name = "E", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!ku", name = "H", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!ku", name = "x", descriptor = "Ljava/lang/String;")
    private String field5702;

    @OriginalMember(owner = "client!ku", name = "D", descriptor = "Ljava/lang/String;")
    private String field5708;

    @OriginalMember(owner = "client!ku", name = "F", descriptor = "Ljava/lang/String;")
    private String field5710;

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)F")
    public final float method2438(int arg0) {
        ++field5707;
        return arg0 >= -9 ? -1.0017077F : this.field5700;
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class377(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V")
    public final void method1164(OggPacket arg0, int arg1) {
        ++field5705;
        if (~super.field7394 >= -1 || "SUB".equals(this.field5710)) {
            if (arg1 == 0) {
                class645 var3 = new class645(arg0.getData());
                int var4 = var3.method3745(arg1 + -6314);
                if (~super.field7394 >= -9) {
                    if ((128 | var4) == 0) {
                        throw new IllegalStateException();
                    }
                    if (super.field7394 == 0) {
                        var3.field9084 += 23;
                        this.field5706 = var3.method3740((byte) -24);
                        this.field5698 = var3.method3740((byte) -24);
                        if (this.field5706 != 0 && ~this.field5698 != -1) {
                            class645 var5 = new class645(16);
                            var3.method3736(17, var5.field9068, 16, 0);
                            this.field5708 = var5.method3752(-2);
                            var5.field9084 = 0;
                            var3.method3736(-110, var5.field9068, 16, 0);
                            this.field5710 = var5.method3752(arg1 + -2);
                            return;
                        }
                        throw new IllegalStateException();
                    }
                } else {
                    if (~var4 == -1) {
                        long var6 = var3.method3723(arg1 + 835567520);
                        long var8 = var3.method3723(835567520);
                        long var10 = var3.method3723(835567520);
                        if (~var6 > -1L || ~var8 > -1L || var10 < 0L || var10 > var6) {
                            throw new IllegalStateException();
                        }
                        this.field5711 = (float) ((var6 + var8) * (long) this.field5698) / (float) this.field5706;
                        this.field5700 = (float) ((long) this.field5698 * var6) / (float) this.field5706;
                        int var12 = var3.method3740((byte) -24);
                        if (var12 < 0 || ~(var3.field9068.length + -var3.field9084) > ~var12) {
                            throw new IllegalStateException();
                        }
                        this.field5702 = class672.method3845(true, var12, var3.field9068, var3.field9084);
                    }
                    if ((var4 | 128) != 0) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)F")
    public final float method2439(boolean arg0) {
        if (arg0) {
            this.method2439(true);
        }
        ++field5704;
        return this.field5711;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
    public final void method1165(int arg0) {
        int var2 = 25 % ((63 - arg0) / 49);
        ++field5709;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)Z")
    public static final boolean method2440(int arg0, int arg1, int arg2) {
        if (arg2 != 65536) {
            method2440(66, 27, 93);
        }
        ++field5701;
        return ~(65536 & arg0) != -1;
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)Ljava/lang/String;")
    public final String method2441(int arg0) {
        if (arg0 < 87) {
            this.field5706 = 84;
        }
        ++field5699;
        return this.field5708;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)Ljava/lang/String;")
    public final String method2442(byte arg0) {
        if (arg0 > -30) {
            this.field5700 = 0.6368901F;
        }
        ++field5703;
        return this.field5702;
    }
}
