import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class6 {

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Lhda;")
    public static class752 field135 = new class752(4, 1);

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "Lwu;")
    public static class376 field138;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method81(int arg0) {
        field138 = null;
        field135 = null;
        if (arg0 != 14205) {
            method82('}', -34);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(CI)I")
    public static final int method82(char arg0, int arg1) {
        if (arg1 != 5041) {
            field135 = null;
        }
        field136++;
        return arg0 >= '\u0000' && arg0 < class709.field9830.length ? class709.field9830[arg0] : -1;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)Lpf;")
    public static final class583 method83(byte arg0) {
        field137++;
        if (class565.field7440 == 0) {
            return new class583();
        } else if (arg0 == -62) {
            return class604.field7934[--class565.field7440];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(FFFB)I")
    public static final int method84(float arg0, float arg1, float arg2, byte arg3) {
        field134++;
        float var4 = (arg0 < 0.0F) ? -arg0 : arg0;
        float var5 = arg1 < 0.0F ? -arg1 : arg1;
        if (arg3 != 49) {
            method81(-27);
        }
        float var6 = arg2 < 0.0F ? -arg2 : arg2;
        if (var5 > var4 && var5 > var6) {
            return (arg1 > 0.0F) ? 0 : 1;
        } else if (var6 > var4 && var6 > var5) {
            return arg2 > 0.0F ? 2 : 3;
        } else if ((arg0 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }
}
