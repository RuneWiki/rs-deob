import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public abstract class class289 {

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Lada;")
    public static class144 field4017 = new class144(77, 16);

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4019 = new BigInteger("c5ff3e282b45e3b40137bc1abe305cee6e338027414876568cd61a585685177496126972851eab54c1dcf2b6e48c4c3ec3f4ed6eccf1564dc9c2e9be9e58290f", 16);

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "B")
    public static byte field4021;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "F")
    public static float field4018;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "F")
    public static float field4020;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 5)
    public static void method1787(int arg0) {
        field4019 = null;
        int var1 = -26 % ((arg0 + 64) / 36);
        field4017 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public abstract void method1786(byte arg0);

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Z")
    public abstract boolean method1788(int arg0, int arg1);

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
    public abstract void method1789(int arg0);

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)Ldi;")
    public abstract class109 method1790(boolean arg0);
}
