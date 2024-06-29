import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class464 {

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public int field6477 = 128;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public int field6491 = 128;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public int field6486;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public int field6482;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public int field6485;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public int field6483;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Lkn;")
    public static class530 field6479 = new class530("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "[Leb;")
    public static class449[] field6489 = new class449[14];

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "Z")
    public static boolean field6490 = false;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Lkn;")
    public static class530 field6488 = new class530("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public int field6481;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public int field6487;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field6492;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public int field6493;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public int field6494;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Lph;")
    public final class464 method2694(byte arg0) {
        if (arg0 >= -98) {
            this.method2694((byte) -47);
        }
        field6492++;
        return new class464(this.field6486, this.field6477, this.field6491, this.field6482, this.field6483, this.field6485);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BIIII)V")
    public static final void method2695(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class4.field81.field1423 != 0 && arg3 != 0 && class10.field140 < 50 && arg2 != -1) {
            class289.field4229[class10.field140++] = new class78((byte) 1, arg2, arg3, arg1, arg4, 0);
        }
        if (arg0 < 110) {
            field6479 = null;
        }
        field6484++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method2696(int arg0) {
        if (arg0 == -1) {
            field6479 = null;
            field6488 = null;
            field6489 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILph;)V")
    public final void method2697(int arg0, class464 arg1) {
        this.field6477 = arg1.field6477;
        this.field6491 = arg1.field6491;
        this.field6483 = arg1.field6483;
        this.field6482 = arg1.field6482;
        this.field6485 = arg1.field6485;
        this.field6486 = arg1.field6486;
        if (arg0 != 14) {
            this.field6493 = -30;
        }
        field6478++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)Lhr;")
    public static final class371 method2698(int arg0, int arg1, int arg2) {
        class239 var3 = class268.field3910[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class371 var4 = var3.field3495;
            var3.field3495 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(I)V")
    public class464(int arg0) {
        this.field6486 = arg0;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIII)V")
    private class464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6477 = arg1;
        this.field6482 = arg3;
        this.field6485 = arg5;
        this.field6483 = arg4;
        this.field6486 = arg0;
        this.field6491 = arg2;
    }
}
