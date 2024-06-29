import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class297 {

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public int field4703 = -1;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field4695 = 0;

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4696 = "glow3:";

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field4697 = -1;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public static int field4691 = 0;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "Z")
    public static boolean field4698 = true;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Led;")
    public static class187 field4694 = new class187();

    @OriginalMember(owner = "client!li", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4709 = null;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "I")
    public int field4690;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public int field4692;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "I")
    public int field4693;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public int field4699;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public int field4700;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public int field4701;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public int field4702;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public int field4704;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public int field4708;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "[I")
    public static int[] field4689;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "[Lsg;")
    public static class166[] field4705;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Lul;")
    public static final class193 method1995(int arg0, int arg1) {
        field4707++;
        class193 var2 = (class193) class226.field3630.method1553((long) arg1, (byte) -79);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class106.field1541.method643(arg1, arg0, false);
        class193 var4 = new class193();
        if (var3 != null) {
            var4.method1436((byte) -105, arg1, new class152(var3));
        }
        class226.field3630.method1551(var4, arg0 - 1, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
    public static void method1996(int arg0) {
        field4694 = null;
        if (arg0 != 15596) {
            field4709 = null;
        }
        field4705 = null;
        field4709 = null;
        field4689 = null;
        field4696 = null;
    }
}
