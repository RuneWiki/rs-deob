import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class67 {

    @OriginalMember(owner = "client!hia", name = "d", descriptor = "Lde;")
    private class534 field958 = new class534(64);

    @OriginalMember(owner = "client!hia", name = "h", descriptor = "Lnd;")
    private class547 field962;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!hia", name = "c", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!hia", name = "e", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!hia", name = "f", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!hia", name = "g", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)V", line = 12)
    public final void method618(int arg0) {
        if (arg0 != 64) {
            return;
        }
        class534 var2 = this.field958;
        synchronized (this.field958) {
            this.field958.method3065(true);
        }
        field957++;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(II)Lvaa;", line = 25)
    public final class471 method619(int arg0, int arg1) {
        field959++;
        class534 var3 = this.field958;
        class471 var4;
        synchronized (this.field958) {
            var4 = (class471) this.field958.method3079((long) arg0, arg1 - 256);
        }
        if (var4 != null) {
            return var4;
        }
        class547 var5 = this.field962;
        byte[] var6;
        synchronized (this.field962) {
            var6 = this.field962.method3153(arg0, 0, 31);
        }
        class471 var7 = new class471();
        if (var6 != null) {
            var7.method2682(arg1 ^ 0x2907, new class461(var6));
        }
        class534 var8 = this.field958;
        synchronized (this.field958) {
            this.field958.method3077((byte) 105, (long) arg0, var7);
            if (arg1 != 256) {
                this.method622((byte) 26, -62);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "(I)V", line = 55)
    public final void method620(int arg0) {
        if (arg0 > -117) {
            this.field962 = null;
        }
        field960++;
        class534 var2 = this.field958;
        synchronized (this.field958) {
            this.field958.method3064(false);
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(IZ)V", line = 69)
    public static final void method621(int arg0, boolean arg1) {
        field956++;
        if (arg1 && class73.field1020 != null) {
            class7.field70 = class73.field1020.field6965;
        } else {
            class7.field70 = -1;
        }
        class553.field7719 = 0;
        class190.field2623 = null;
        class73.field1020 = null;
        class537.field7459 = null;
        class73.method655();
        class73.field1026.method3668(0);
        class73.field1025 = null;
        class276.field3469 = null;
        class234.field3058 = null;
        class108.field1561 = -1;
        class94.field1319 = null;
        class127.field1809 = null;
        class231.field3034 = null;
        class362.field4669 = null;
        class96.field1334 = null;
        class103.field1422 = null;
        class584.field8165 = null;
        class557.field7751 = -1;
        if (class73.field1015 != null) {
            class73.field1015.method3086(0);
            class73.field1015.method3080(64, (byte) 78, 128);
        }
        if (class73.field1019 != null) {
            class73.field1019.method585(64, 64, (byte) 107);
        }
        if (class73.field1014 != null) {
            class73.field1014.method3385(64, (byte) 117);
        }
        class33.field550.method3401((byte) 1, arg0);
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(BI)V", line = 116)
    public final void method622(byte arg0, int arg1) {
        class534 var3 = this.field958;
        synchronized (this.field958) {
            this.field958.method3070(arg1, 125);
        }
        if (arg0 != 104) {
            this.method620(16);
        }
        field961++;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIBLaa;IJIILria;)V", line = 129)
    public static final void method623(int arg0, int arg1, byte arg2, class489 arg3, int arg4, long arg5, int arg6, int arg7, class288 arg8) {
        field955++;
        if (arg2 != -85) {
            return;
        }
        int var10 = arg0 * arg0 + arg6 * arg6;
        if (((long) var10) > arg5) {
            return;
        }
        int var11 = Math.min(arg8.field3617 / 2, arg8.field3714 / 2);
        if (var10 <= (var11 * var11)) {
            class211.method1356(arg0, arg3, class468.field6279[arg7], arg4, (byte) -126, arg6, arg8, arg1);
            return;
        }
        var11 -= 10;
        int var12;
        if (class650.field9023 == 4) {
            var12 = (int) class521.field7309 & 0x3FFF;
        } else {
            var12 = (int) class521.field7309 + class683.field9519 & 0x3FFF;
        }
        int var13 = class16.field320[var12];
        int var14 = class16.field322[var12];
        if (class650.field9023 != 4) {
            var13 = var13 * 256 / (class127.field1815 + 256);
            var14 = var14 * 256 / (class127.field1815 + 256);
        }
        int var15 = arg0 * var14 + arg6 * var13 >> 14;
        int var16 = arg6 * var14 - (arg0 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var11);
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class680.field9496[arg7].method2765((float) arg8.field3617 / 2.0F + (float) arg4 + (float) var19, (float) arg8.field3714 / 2.0F + (float) arg1 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(III)Lim;", line = 182)
    public static final class573 method624(int arg0, int arg1, int arg2) {
        class14 var3 = class197.field2689[arg0][arg1][arg2];
        return var3 == null ? null : var3.field277;
    }

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lal;ILnd;)V", line = 194)
    public class67(class102 arg0, int arg1, class547 arg2) {
        this.field962 = arg2;
        this.field962.method3178((byte) 50, 31);
    }
}
