import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class49 {

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "Lqv;")
    public static class316 field912 = new class316(3, 0);

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "[Lmc;")
    public static class90[] field914 = new class90[6];

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "Lhh;")
    public static class86 field909;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V", line = 3)
    public static void method442(byte arg0) {
        int var1 = 35 % ((73 - arg0) / 50);
        field912 = null;
        field914 = null;
        field909 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)Z", line = 20)
    public static final boolean method443(int arg0, int arg1, int arg2) {
        field911++;
        if (arg2 == -1551) {
            return (arg1 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)I", line = 36)
    public static final int method444(int arg0, int arg1) {
        return class18.field198 == null ? 0 : class18.field198[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V", line = 39)
    public static final void method445(int arg0, int arg1) {
        if (arg0 == 19464) {
            field910++;
            class275 var2 = class213.method1433((byte) 64, 16, arg1);
            var2.method1774((byte) -108);
        }
    }
}
