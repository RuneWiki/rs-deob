import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class106 extends class181 {

    @OriginalMember(owner = "client!iv", name = "L", descriptor = "[I")
    public static int[] field1469 = new int[14];

    @OriginalMember(owner = "client!iv", name = "C", descriptor = "Lmga;")
    public static class739 field1461 = new class739(43, -1);

    @OriginalMember(owner = "client!iv", name = "F", descriptor = "F")
    private float field1464;

    @OriginalMember(owner = "client!iv", name = "K", descriptor = "F")
    private float field1468;

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "I")
    private int field1455;

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "I")
    private int field1456;

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!iv", name = "B", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!iv", name = "E", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!iv", name = "H", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!iv", name = "J", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!iv", name = "D", descriptor = "Lvr;")
    public static class147 field1462;

    @OriginalMember(owner = "client!iv", name = "y", descriptor = "Ljava/lang/String;")
    private String field1457;

    @OriginalMember(owner = "client!iv", name = "A", descriptor = "Ljava/lang/String;")
    private String field1459;

    @OriginalMember(owner = "client!iv", name = "G", descriptor = "Ljava/lang/String;")
    private String field1465;

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class106(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        ++field1467;
        if (arg0 != -30243) {
            field1469 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
    public static void method807(int arg0) {
        field1462 = null;
        if (arg0 != -3938) {
            field1462 = null;
        }
        field1461 = null;
        field1469 = null;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Laj;IIJBZI)V")
    public static final void method808(class333 arg0, int arg1, int arg2, long arg3, byte arg4, boolean arg5, int arg6) {
        int var8 = -6 / ((arg4 - 17) / 34);
        class45.method348(arg0, arg6, arg5, -17838, arg3, arg1, arg2, 0);
        ++field1460;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)F")
    public final float method809(byte arg0) {
        ++field1458;
        if (arg0 < 40) {
            this.field1457 = null;
        }
        return this.field1464;
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(Z)Ljava/lang/String;")
    public final String method810(boolean arg0) {
        if (!arg0) {
            return null;
        } else {
            ++field1463;
            return this.field1459;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;B)V")
    public final void method387(OggPacket arg0, byte arg1) {
        ++field1453;
        if (super.field2398 <= 0 || "SUB".equals(this.field1465)) {
            class376 var3 = new class376(arg0.getData());
            if (arg1 != -13) {
                this.field1464 = 0.46147597F;
            }
            int var4 = var3.method2398(-1372747256);
            if (super.field2398 > 8) {
                if (var4 == 0) {
                    long var5 = var3.method2404(arg1 + -110);
                    long var7 = var3.method2404(-119);
                    long var9 = var3.method2404(-116);
                    if (~var5 > -1L || ~var7 > -1L || var9 < 0L || ~var5 > ~var9) {
                        throw new IllegalStateException();
                    }
                    this.field1468 = (float) ((long) this.field1455 * var5) / (float) this.field1456;
                    this.field1464 = (float) ((var5 + var7) * (long) this.field1455) / (float) this.field1456;
                    int var11 = var3.method2399((byte) 119);
                    if (~var11 > -1 || var11 > var3.field5518.length + -var3.field5459) {
                        throw new IllegalStateException();
                    }
                    this.field1459 = class21.method166(var3.field5518, var11, var3.field5459, 7956);
                }
                if (~(128 | var4) != -1) {
                    return;
                }
            } else {
                if (~(128 | var4) == -1) {
                    throw new IllegalStateException();
                }
                if (~super.field2398 != -1) {
                    return;
                }
                var3.field5459 += 23;
                this.field1456 = var3.method2399((byte) -105);
                this.field1455 = var3.method2399((byte) 33);
                if (this.field1456 == 0 || this.field1455 == 0) {
                    throw new IllegalStateException();
                }
                class376 var12 = new class376(16);
                var3.method2389(0, 689125352, 16, var12.field5518);
                this.field1457 = var12.method2379((byte) 85);
                var12.field5459 = 0;
                var3.method2389(0, 689125352, 16, var12.field5518);
                this.field1465 = var12.method2379((byte) 85);
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)Ljava/lang/String;")
    public final String method811(int arg0) {
        ++field1466;
        return arg0 >= -25 ? null : this.field1457;
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(B)F")
    public final float method812(byte arg0) {
        ++field1454;
        if (arg0 != -19) {
            this.method387((OggPacket) null, (byte) 61);
        }
        return this.field1468;
    }
}
