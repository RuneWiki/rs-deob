import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class254 extends class329 {

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "[Lnd;")
    public static class138[] field3765 = new class138[0];

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "F")
    private float field3761;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "F")
    public static float field3763;

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "F")
    private float field3767;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
    private int field3768;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
    private int field3769;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "Ljava/lang/String;")
    private String field3766;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "Ljava/lang/String;")
    private String field3773;

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "Ljava/lang/String;")
    private String field3776;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V", line = 4)
    public final void method342(boolean arg0) {
        if (arg0) {
            this.field3769 = 80;
        }
        ++field3762;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)F", line = 14)
    public final float method1697(boolean arg0) {
        ++field3764;
        if (arg0) {
            this.field3776 = null;
        }
        return this.field3767;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljagtheora/ogg/OggPacket;I)V", line = 30)
    public final void method337(OggPacket arg0, int arg1) {
        ++field3775;
        int var3 = -60 / ((71 - arg1) / 44);
        if (super.field4616 <= 0 || "SUB".equals(this.field3776)) {
            class511 var4 = new class511(arg0.getData());
            int var5 = var4.method3013(-128);
            if (super.field4616 <= 8) {
                if (~(128 | var5) == -1) {
                    throw new IllegalStateException();
                }
                if (~super.field4616 != -1) {
                    return;
                }
                var4.field6962 += 23;
                this.field3769 = var4.method3019(127);
                this.field3768 = var4.method3019(127);
                if (this.field3769 == 0 || this.field3768 == 0) {
                    throw new IllegalStateException();
                }
                class511 var13 = new class511(16);
                var4.method3014(16, var13.field6979, 75212712, 0);
                this.field3766 = var13.method2993((byte) -60);
                var13.field6962 = 0;
                var4.method3014(16, var13.field6979, 75212712, 0);
                this.field3776 = var13.method2993((byte) -75);
            } else {
                if (~var5 == -1) {
                    long var6 = var4.method3007(86);
                    long var8 = var4.method3007(18);
                    long var10 = var4.method3007(85);
                    if (~var6 > -1L || ~var8 > -1L || var10 < 0L || var10 > var6) {
                        throw new IllegalStateException();
                    }
                    this.field3761 = (float) ((long) this.field3768 * var6) / (float) this.field3769;
                    this.field3767 = (float) ((var6 + var8) * (long) this.field3768) / (float) this.field3769;
                    int var12 = var4.method3019(127);
                    if (var12 < 0 || ~var12 < ~(var4.field6979.length + -var4.field6962)) {
                        throw new IllegalStateException();
                    }
                    this.field3773 = class729.method4052((byte) 7, var4.field6962, var12, var4.field6979);
                }
                if (~(var5 | 128) != -1) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(Z)Ljava/lang/String;", line = 104)
    public final String method1698(boolean arg0) {
        ++field3771;
        return !arg0 ? null : this.field3773;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)Ljava/lang/String;", line = 118)
    public final String method1699(int arg0) {
        if (arg0 < 114) {
            this.method1699(83);
        }
        ++field3774;
        return this.field3766;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 130)
    public static void method1700(byte arg0) {
        field3765 = null;
        int var1 = 59 / ((arg0 - -9) / 55);
    }

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "(Z)F", line = 148)
    public final float method1701(boolean arg0) {
        ++field3770;
        if (arg0) {
            this.field3767 = 1.2824799F;
        }
        return this.field3761;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Ljagtheora/ogg/OggStreamState;)V", line = 160)
    public class254(OggStreamState arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V", line = 163)
    public static final void method1702(int arg0) {
        ++field3772;
        int var1 = 0;
        for (int var2 = 0; class741.field10208 > var2; ++var2) {
            for (int var3 = 0; ~class525.field7224 < ~var3; ++var3) {
                if (class4.method10(class59.field688, arg0 + 5439472, var1, var3, var2, true)) {
                    ++var1;
                }
                if (~var1 <= -513) {
                    return;
                }
            }
        }
        if (arg0 != 16) {
            field3765 = null;
        }
    }
}
