import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class38 {

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "B")
    private byte field629;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public int field640;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public int field630;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public int field641;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field625 = -1;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field642 = -1;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Ltb;")
    public static class253 field635;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "Lnh;")
    public static class57 field639;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "[[B")
    public static byte[][] field638;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static final void method197(byte arg0) {
        System.out.println("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
        if (arg0 != -64) {
            method197((byte) -120);
        }
        field634++;
        System.exit(1);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lnh;ILjk;I)V")
    public static final void method198(class57 arg0, int arg1, class192 arg2, int arg3) {
        field643++;
        class41 var4 = new class41();
        var4.field678 = arg2;
        var4.field1113 = (long) arg3;
        var4.field675 = arg0;
        var4.field671 = 1;
        class198 var5 = class192.field3256;
        synchronized (class192.field3256) {
            class192.field3256.method1272(5664, var4);
            if (arg1 != -1) {
                field638 = null;
            }
        }
        class86.method517(1684492428);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)I")
    public final int method199(byte arg0) {
        if (arg0 != 6) {
            field625 = 54;
        }
        field644++;
        return (this.field629 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)I")
    public final int method200(boolean arg0) {
        field637++;
        if (!arg0) {
            this.field630 = 35;
        }
        return this.field629 & 0x7;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Lef;")
    public static final class130 method201(int arg0, int arg1) {
        if (arg1 != -16756) {
            method201(-7, 37);
        }
        class130 var2 = (class130) class153.field2653.method1037(101, (long) arg0);
        field633++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class125.field2245.method884(arg0 & 0x7FFF, -108, 1);
        } else {
            var3 = class177.field2940.method884(arg0, arg1 + 16873, 1);
        }
        class130 var4 = new class130();
        if (var3 != null) {
            var4.method795(new class226(var3), (byte) 101);
        }
        if (arg0 >= 32768) {
            var4.method804(32768);
        }
        class153.field2653.method1032(-810, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V")
    public static void method202(byte arg0) {
        field635 = null;
        int var1 = -94 / ((arg0 - 10) / 42);
        field639 = null;
        field638 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLn;)V")
    public static final void method203(boolean arg0, class138 arg1) {
        if (arg0) {
            field628++;
            class57.field1037 = arg1;
            class140.field2423 = class57.field1037.method875(-2, 16);
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)V")
    public static final void method204(byte arg0) {
        class165.field2771.method1728(true);
        field626++;
        if (arg0 != 5) {
            field636 = 69;
        }
        class31.field499.method1728(true);
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class38() {
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lnj;)V")
    public class38(class226 arg0) {
        this.field629 = arg0.method1428(false);
        this.field631 = arg0.method1447(0);
        this.field640 = arg0.method1478(-32053);
        this.field632 = arg0.method1478(-32053);
        this.field630 = arg0.method1478(-32053);
        this.field641 = arg0.method1478(-32053);
    }
}
