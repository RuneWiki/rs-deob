import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class49 {

    @OriginalMember(owner = "client!m", name = "p", descriptor = "B")
    private byte field701;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public int field692;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public int field689;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public int field695;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "F")
    public static float field700;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Lcg;")
    public static class316 field693;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "[Lek;")
    public static class220[] field688;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lcd;Lwn;I)Lrc;", line = 10)
    public static final class206 method315(class69 arg0, class278 arg1, int arg2) {
        field687++;
        long var3 = ((long) arg1.field4485 << 56) + ((long) arg1.field4486 << 32) + (long) (arg1.field4488 - -(arg1.field4490 + 1 << 16));
        if (arg2 != 469531296) {
            return (class206) null;
        }
        class206 var5 = (class206) arg0.method451(var3, (byte) 100);
        if (var5 == null) {
            var5 = new class206(arg1.field4490, (float) arg1.field4488, true, false, arg1.field4486);
            arg0.method461(72, var3, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)I", line = 32)
    public final int method316(int arg0) {
        field699++;
        if (arg0 != 469531296) {
            field700 = 1.9442018F;
        }
        return this.field701 & 0x7;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)I", line = 48)
    public final int method317(boolean arg0) {
        if (arg0) {
            field690++;
            return (this.field701 & 0x8) == 8 ? 1 : 0;
        } else {
            return 86;
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 67)
    public static final void method318(int arg0) {
        class21.field301.method707(0);
        field686++;
        if (arg0 != 1) {
            method319(4);
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V", line = 82)
    public static void method319(int arg0) {
        if (arg0 <= 13) {
            method319(-83);
        }
        field688 = null;
        field693 = null;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V", line = 91)
    public class49() {
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ljj;)V", line = 93)
    public class49(class44 arg0) {
        this.field701 = arg0.method246((byte) -68);
        this.field694 = arg0.method271(21081);
        this.field697 = arg0.method238((byte) 82);
        this.field692 = arg0.method238((byte) 82);
        this.field689 = arg0.method238((byte) 82);
        this.field695 = arg0.method238((byte) 82);
    }
}
