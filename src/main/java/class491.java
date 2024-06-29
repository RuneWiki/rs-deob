import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class491 extends class513 {

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "I")
    public int field6603;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "I")
    public int field6600;

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "I")
    public int field6606;

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
    public int field6595;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "Z")
    public boolean field6596;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "I")
    public int field6601;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "Lag;")
    public static class214 field6597 = new class214(5, 1);

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "[I")
    public static int[] field6607 = new int[32];

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "[[I")
    public static int[][] field6605;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "[[Lpaa;")
    public static class712[][] field6599;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V", line = 5)
    public static void method2865(int arg0) {
        field6607 = null;
        field6599 = null;
        field6605 = null;
        field6597 = null;
        if (arg0 != 29779) {
            field6599 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)V", line = 23)
    public static final void method2866(boolean arg0) {
        if (arg0) {
            class126.field1741.method570(class721.field10176, class644.field9131, class321.field4137);
            field6598++;
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V", line = 35)
    public static final void method2867(int arg0) {
        if (arg0 != 1) {
            method2865(-41);
        }
        field6604++;
        class146.field2024.method3210(false);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)Lbe;", line = 50)
    public static final class230 method2868(int arg0, int arg1) {
        if (arg0 == 32) {
            field6602++;
            return new class230(arg1, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(IIIIIZ)V", line = 69)
    public class491(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field6603 = arg2;
        this.field6600 = arg4;
        this.field6606 = arg3;
        this.field6595 = arg0;
        this.field6596 = arg5;
        this.field6601 = arg1;
    }
}
