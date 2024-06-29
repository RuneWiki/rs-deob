import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class487 {

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "J")
    private long field6572 = -1L;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "Ljia;")
    private class645 field6571 = new class645();

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "Lvl;")
    public static class15 field6573 = new class15(64, 11);

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "I")
    public static int field6579 = 0;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
    public static int field6576;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "J")
    private long field6574;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "Lnf;")
    public static class604 field6578;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V")
    public static void method2778(int arg0) {
        field6573 = null;
        if (arg0 != 65535) {
            field6578 = null;
        }
        field6578 = null;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lfca;I)V")
    private final void method2779(class93 arg0, int arg1) {
        if (arg1 != -5) {
            return;
        }
        field6575++;
        this.field6574 = arg0.method770((byte) 123);
        this.field6572 = arg0.method770((byte) 115);
        for (int var3 = arg0.method793((byte) 96); var3 != 0; var3 = arg0.method793((byte) 53)) {
            class406 var4;
            if (var3 == 1) {
                var4 = new class208();
            } else if (var3 == 4) {
                var4 = new class449();
            } else if (var3 == 3) {
                var4 = new class165();
            } else if (var3 == 2) {
                var4 = new class769();
            } else {
                throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
            }
            var4.method1292(arg0, false);
            this.field6571.method3594((byte) 110, var4);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lgca;I)V")
    public final void method2780(class265 arg0, int arg1) {
        if (arg1 < 104) {
            method2781(-34, 45L, 6, null, 47, 1, null, 114, 102);
        }
        field6576++;
        if (this.field6574 != arg0.field2528 || this.field6572 != arg0.field3725) {
            throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.field2528 + " updateNum:" + arg0.field3725 + " delta.clanHash:" + this.field6574 + " updateNum:" + this.field6572);
        }
        for (class406 var3 = (class406) this.field6571.method3589((byte) -128); var3 != null; var3 = (class406) this.field6571.method3591(0)) {
            var3.method1291(true, arg0);
        }
        arg0.field3725++;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IJILkh;IILaa;II)V")
    public static final void method2781(int arg0, long arg1, int arg2, class17 arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8) {
        field6580++;
        int var10 = arg0 * arg0 + arg2 * arg2;
        if (arg5 <= 58 || arg1 < ((long) var10)) {
            return;
        }
        int var11 = Math.min(arg3.field347 / 2, arg3.field330 / 2);
        if (var10 <= var11 * var11) {
            class536.method3036(arg2, arg4, class724.field9959[arg8], arg6, (byte) 70, arg7, arg0, arg3);
            return;
        }
        var11 -= 10;
        int var12;
        if (class536.field7291 == 4) {
            var12 = (int) class53.field763 & 0x3FFF;
        } else {
            var12 = (int) class53.field763 + class408.field5599 & 0x3FFF;
        }
        int var13 = class191.field2937[var12];
        int var14 = class191.field2936[var12];
        if (class536.field7291 != 4) {
            var13 = var13 * 256 / (class301.field4140 + 256);
            var14 = var14 * 256 / (class301.field4140 + 256);
        }
        int var15 = arg0 * var14 + arg2 * var13 >> 14;
        int var16 = arg2 * var14 - (arg0 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var11);
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class259.field3631[arg8].method3431((float) arg3.field347 / 2.0F + (float) arg4 + (float) var19, (float) arg3.field330 / 2.0F + (float) arg7 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lfca;)V")
    public class487(class93 arg0) {
        this.method2779(arg0, -5);
    }
}
