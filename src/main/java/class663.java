import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class663 {

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "Laq;")
    private class494 field9336 = new class494(64);

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "Lgga;")
    private class513 field9330;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public int field9333;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "Lol;")
    public static class431 field9334 = new class431(1350);

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "[[I")
    public static int[][] field9341 = new int[128][128];

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "[F")
    public static float[] field9339 = new float[4];

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public static int field9328;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public static int field9329;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field9331;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    public static int field9332;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    public static int field9335;

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "I")
    public static int field9337;

    @OriginalMember(owner = "client!jt", name = "m", descriptor = "I")
    public static int field9340;

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "[I")
    public static int[] field9338;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILgga;I)Lmq;")
    public static final class85 method3712(int arg0, class513 arg1, int arg2) {
        if (arg0 < 88) {
            field9338 = null;
        }
        field9328++;
        class85 var3 = (class85) class698.field9802.method2882((long) arg2, (byte) -73);
        if (var3 == null) {
            if (class646.field9184) {
                var3 = class686.field9702.method487(class418.method2464(arg1, arg2), true);
            } else {
                var3 = class590.method3461(arg1.method2988(arg2, 0), -6394);
            }
            class698.field9802.method2890(-7307, (long) arg2, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(BI)Lfp;")
    public final class597 method3713(byte arg0, int arg1) {
        field9335++;
        class494 var3 = this.field9336;
        class597 var4;
        synchronized (this.field9336) {
            var4 = (class597) this.field9336.method2882((long) arg1, (byte) -122);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field9330;
        byte[] var6;
        synchronized (this.field9330) {
            var6 = this.field9330.method3019(16, arg1, 73);
        }
        class597 var7 = new class597();
        if (var6 != null) {
            var7.method3482(new class431(var6), false);
        }
        class494 var8 = this.field9336;
        synchronized (this.field9336) {
            this.field9336.method2890(-7307, (long) arg1, var7);
            if (arg0 >= -45) {
                field9340 = 113;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)V")
    public final void method3714(int arg0, int arg1) {
        class494 var3 = this.field9336;
        synchronized (this.field9336) {
            this.field9336.method2888(arg0, arg1 ^ 0xFFFF85FC);
            if (arg1 != -31353) {
                this.method3718((byte) -30);
            }
        }
        field9337++;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
    public final void method3715(int arg0) {
        field9329++;
        class494 var2 = this.field9336;
        synchronized (this.field9336) {
            this.field9336.method2881((byte) -112);
            if (arg0 != 8) {
                this.method3714(-124, 57);
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lmca;ILgga;)V")
    public class663(class41 arg0, int arg1, class513 arg2) {
        this.field9330 = arg2;
        if (this.field9330 == null) {
            this.field9333 = 0;
        } else {
            this.field9333 = this.field9330.method3007(-1, 16);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V")
    public static void method3716(byte arg0) {
        field9339 = null;
        field9341 = null;
        field9338 = null;
        int var1 = -88 % ((arg0 - 30) / 57);
        field9334 = null;
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(II)V")
    public static final void method3717(int arg0, int arg1) {
        field9332++;
        class371 var2 = class490.method2867((byte) -95, 8, (long) arg1);
        if (arg0 > -124) {
            method3716((byte) -107);
        }
        var2.method2215(4);
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(B)V")
    public final void method3718(byte arg0) {
        class494 var2 = this.field9336;
        synchronized (this.field9336) {
            this.field9336.method2893((byte) 108);
        }
        if (arg0 == 100) {
            field9331++;
        }
    }
}
