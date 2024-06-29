import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class620 extends class399 {

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "F")
    public static float field8432 = 0.0F;

    @OriginalMember(owner = "client!pt", name = "t", descriptor = "Lvi;")
    public static class560 field8434 = new class560(4);

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public int field8423;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public static int field8424;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
    public int field8426;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
    public int field8427;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "I")
    public static int field8428;

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "I")
    public int field8430;

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "I")
    public int field8431;

    @OriginalMember(owner = "client!pt", name = "s", descriptor = "I")
    public int field8433;

    @OriginalMember(owner = "client!pt", name = "u", descriptor = "I")
    public static int field8435;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "J")
    public static long field8422;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "Ljava/lang/String;")
    public String field8425;

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "[Lmh;")
    public static class556[] field8429;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)V", line = 8)
    public static final void method3392(byte arg0) {
        field8428++;
        if (arg0 >= -119) {
            field8435 = -100;
        }
        for (class192 var1 = (class192) class234.field3049.method374((byte) 80); var1 != null; var1 = (class192) class234.field3049.method372(-20740)) {
            if (var1.field2504 == -1) {
                var1.field2501 = 0;
                if (var1.field2493 >= 0 && var1.field2487 >= 0 && class588.field8082 > var1.field2493 && var1.field2487 < class12.field113) {
                    class210.method1314(var1, (byte) -54);
                }
            } else {
                var1.method175(30604);
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)V", line = 44)
    public static void method3393(int arg0) {
        field8429 = null;
        if (arg0 != 2162) {
            method3393(-42);
        }
        field8434 = null;
    }
}
