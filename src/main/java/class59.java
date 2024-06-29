import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class59 {

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "Lmf;")
    private class382 field1128 = new class382(64);

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "Lpu;")
    private class522 field1135;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "I")
    public int field1136;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field1134 = 0;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "[I")
    public static int[] field1130;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V", line = 9)
    public static void method630(int arg0) {
        int var1 = 58 % ((arg0 - 64) / 61);
        field1130 = null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIII)V", line = 20)
    public static final void method631(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 << arg0;
        field1131++;
        int var5 = arg3 << 3;
        int var6 = arg2 << 3;
        class630.field8811 = var5;
        class105.field1635 = var4;
        if (class43.field700 == 2) {
            class637.field9001 = var5;
            class544.field7662 = var4;
            class300.field4472 = var6;
        }
        class592.method3353(true);
        class700.field9892 = true;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)I", line = 41)
    public static final int method632(int arg0, int arg1, int arg2) {
        field1129++;
        if (arg2 != 606845215) {
            method630(29);
        }
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZZLjava/lang/Object;)[B", line = 59)
    public static final byte[] method633(boolean arg0, boolean arg1, Object arg2) {
        field1137++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class630.method3511(arg0, var3) : var3;
        } else if (arg2 instanceof class70) {
            class70 var4 = (class70) arg2;
            return var4.method685(-47);
        } else {
            if (arg0) {
                field1134 = -106;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILpu;)V", line = 97)
    public static final void method634(int arg0, class522 arg1) {
        class366.field5235 = arg1.method2980(-9104, "hitmarks");
        field1133++;
        class125.field1872 = arg1.method2980(-9104, "hitbar_default");
        class356.field5113 = arg1.method2980(-9104, "timerbar_default");
        class705.field9920 = arg1.method2980(-9104, "headicons_pk");
        if (arg0 < 119) {
            field1130 = null;
        }
        class665.field9389 = arg1.method2980(-9104, "headicons_prayer");
        class577.field8132 = arg1.method2980(-9104, "hint_headicons");
        class313.field4632 = arg1.method2980(-9104, "hint_mapmarkers");
        class583.field8195 = arg1.method2980(-9104, "mapflag");
        class104.field1621 = arg1.method2980(-9104, "cross");
        class455.field6533 = arg1.method2980(-9104, "mapdots");
        class228.field3304 = arg1.method2980(-9104, "scrollbar");
        class688.field9690 = arg1.method2980(-9104, "name_icons");
        class216.field3031 = arg1.method2980(-9104, "floorshadows");
        class639.field9018 = arg1.method2980(-9104, "compass");
        class46.field722 = arg1.method2980(-9104, "otherlevel");
        class232.field3614 = arg1.method2980(-9104, "hint_mapedge");
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lkr;ILpu;)V", line = 173)
    public class59(class693 arg0, int arg1, class522 arg2) {
        this.field1135 = arg2;
        this.field1136 = this.field1135.method2988(-2, 19);
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(III)I", line = 131)
    public static final int method635(int arg0, int arg1, int arg2) {
        field1132++;
        if (arg2 > -35) {
            return 123;
        } else {
            int var3 = arg0 >> 31 & arg1 - 1;
            return ((arg0 >>> 31) + arg0) % arg1 + var3;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI)Lef;", line = 145)
    public final class450 method636(byte arg0, int arg1) {
        field1127++;
        class382 var3 = this.field1128;
        class450 var4;
        synchronized (this.field1128) {
            var4 = (class450) this.field1128.method2287(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field1135;
        byte[] var6;
        synchronized (this.field1135) {
            var6 = this.field1135.method3007(19, arg1, 5);
        }
        class450 var7 = new class450();
        if (var6 != null) {
            var7.method2669(true, new class695(var6));
        }
        class382 var8 = this.field1128;
        synchronized (this.field1128) {
            this.field1128.method2291(var7, (long) arg1, 1);
        }
        if (arg0 > -54) {
            method633(true, true, null);
        }
        return var7;
    }
}
