import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class332 extends class434 {

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "[I")
    public static int[] field4509 = new int[50];

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public static int field4511 = 2;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "Lmp;")
    public static class315 field4504 = new class315("game4", 3);

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "F")
    private float field4503;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "F")
    private float field4506;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    private int field4499;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    private int field4500;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "Lcn;")
    public static class306 field4513;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "Ljava/lang/String;")
    private String field4501;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "Ljava/lang/String;")
    private String field4502;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "Ljava/lang/String;")
    private String field4508;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "[I")
    public static int[] field4514;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)Ljava/lang/String;", line = 6)
    public final String method2039(int arg0) {
        if (arg0 != 3) {
            return null;
        } else {
            ++field4505;
            return this.field4502;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 20)
    public class332(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)Ljava/lang/String;", line = 25)
    public final String method2040(int arg0) {
        ++field4507;
        if (arg0 <= 89) {
            this.field4508 = null;
        }
        return this.field4508;
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)V", line = 36)
    public static void method2041(int arg0) {
        field4514 = null;
        field4504 = null;
        if (arg0 != 0) {
            field4514 = null;
        }
        field4509 = null;
        field4513 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;Z)V", line = 52)
    public final void method143(OggPacket arg0, boolean arg1) {
        ++field4498;
        if (super.field6217 <= 0 || "SUB".equals(this.field4501)) {
            class479 var3 = new class479(arg0.getData());
            int var4 = var3.method2886(arg1);
            if (super.field6217 <= 8) {
                if (~(var4 | 128) == -1) {
                    throw new IllegalStateException();
                }
                if (super.field6217 != 0) {
                    return;
                }
                var3.field6864 += 23;
                this.field4499 = var3.method2923((byte) -114);
                this.field4500 = var3.method2923((byte) -93);
                if (~this.field4499 == -1 || ~this.field4500 == -1) {
                    throw new IllegalStateException();
                }
                class479 var12 = new class479(16);
                var3.method2867(-290150072, var12.field6800, 16, 0);
                this.field4508 = var12.method2894(-13192);
                var12.field6864 = 0;
                var3.method2867(-290150072, var12.field6800, 16, 0);
                this.field4501 = var12.method2894(-13192);
            } else {
                if (~var4 == -1) {
                    long var5 = var3.method2873((byte) -115);
                    long var7 = var3.method2873((byte) -115);
                    long var9 = var3.method2873((byte) -115);
                    if (~var5 > -1L || ~var7 > -1L || var9 < 0L || ~var9 < ~var5) {
                        throw new IllegalStateException();
                    }
                    this.field4503 = (float) ((var5 + var7) * (long) this.field4500) / (float) this.field4499;
                    this.field4506 = (float) ((long) this.field4500 * var5) / (float) this.field4499;
                    int var11 = var3.method2923((byte) 54);
                    if (var11 < 0 || ~(var3.field6800.length + -var3.field6864) > ~var11) {
                        throw new IllegalStateException();
                    }
                    this.field4502 = class316.method1942(var3.field6864, var3.field6800, var11, true);
                }
                if (~(128 | var4) != -1) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)F", line = 124)
    public final float method2042(int arg0) {
        int var2 = -110 / ((arg0 - -43) / 53);
        ++field4497;
        return this.field4503;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 138)
    public final void method138(int arg0) {
        if (arg0 != 0) {
            this.field4502 = null;
        }
        ++field4512;
    }

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)F", line = 154)
    public final float method2043(int arg0) {
        if (arg0 != -4335) {
            this.method143((OggPacket) null, false);
        }
        ++field4496;
        return this.field4506;
    }
}
