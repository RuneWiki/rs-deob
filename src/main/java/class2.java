import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class2 {

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field9 = -1;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "Lqu;")
    public static class364 field11 = new class364(1, -1);

    @OriginalMember(owner = "client!is", name = "f", descriptor = "Z")
    public static boolean field13 = true;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V", line = 13)
    public static void method5(int arg0) {
        field11 = null;
        if (arg0 != 22556) {
            field11 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)Las;", line = 28)
    public static final class25 method6(byte arg0) {
        field8++;
        if (arg0 != -48) {
            return null;
        }
        class25 var1 = (class25) class233.field3434.method774(3);
        if (var1 == null) {
            return new class25();
        } else {
            class141.field1847--;
            return var1;
        }
    }
}
