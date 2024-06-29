import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class173 extends class147 {

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2506 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field2510 = -1;

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public static int field2513 = 0;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "F")
    private float field2502;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "F")
    private float field2503;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    private int field2505;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "I")
    private int field2512;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "Ljava/lang/String;")
    private String field2501;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "Ljava/lang/String;")
    private String field2507;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "Ljava/lang/String;")
    private String field2514;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "[Ls;")
    public static class278[] field2511;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public static void method1261(int arg0) {
        field2511 = null;
        field2506 = null;
        if (arg0 != 128) {
            method1261(57);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)Ljava/lang/String;")
    public final String method1262(byte arg0) {
        if (arg0 < 59) {
            this.field2503 = -0.07906856F;
        }
        ++field2516;
        return this.field2507;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public final void method8(int arg0) {
        if (arg0 != 0) {
            this.method8(75);
        }
        ++field2508;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V")
    public class173(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLjagtheora/ogg/OggPacket;)V")
    public final void method9(boolean arg0, OggPacket arg1) {
        ++field2509;
        if (super.field2248 <= 0 || "SUB".equals(this.field2501)) {
            class35 var3 = new class35(arg1.getData());
            if (!arg0) {
                int var4 = var3.method273(255);
                if (super.field2248 > 8) {
                    if (var4 == 0) {
                        long var5 = var3.method259(12804);
                        long var7 = var3.method259(12804);
                        long var9 = var3.method259(12804);
                        if (var5 < 0L || ~var7 > -1L || ~var9 > -1L || ~var9 < ~var5) {
                            throw new IllegalStateException();
                        }
                        this.field2503 = (float) ((var5 + var7) * (long) this.field2505) / (float) this.field2512;
                        this.field2502 = (float) ((long) this.field2505 * var5) / (float) this.field2512;
                        int var11 = var3.method247(false);
                        if (var11 < 0 || var11 > var3.field483.length + -var3.field469) {
                            throw new IllegalStateException();
                        }
                        this.field2514 = class258.method1749(var3.field469, (byte) 95, var11, var3.field483);
                    }
                    if (~(var4 | 128) != -1) {
                        return;
                    }
                } else {
                    if (~(var4 | 128) == -1) {
                        throw new IllegalStateException();
                    }
                    if (super.field2248 != 0) {
                        return;
                    }
                    var3.field469 += 23;
                    this.field2512 = var3.method247(false);
                    this.field2505 = var3.method247(false);
                    if (this.field2512 == 0 || ~this.field2505 == -1) {
                        throw new IllegalStateException();
                    }
                    class35 var12 = new class35(16);
                    var3.method260(var12.field483, 123, 16, 0);
                    this.field2507 = var12.method272(2);
                    var12.field469 = 0;
                    var3.method260(var12.field483, 108, 16, 0);
                    this.field2501 = var12.method272(2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)F")
    public final float method1263(boolean arg0) {
        ++field2517;
        return !arg0 ? -0.14213197F : this.field2503;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)Ljava/lang/String;")
    public final String method1264(int arg0) {
        ++field2504;
        return arg0 >= -28 ? null : this.field2514;
    }

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)F")
    public final float method1265(int arg0) {
        if (arg0 >= -38) {
            this.field2505 = -72;
        }
        ++field2515;
        return this.field2502;
    }
}
