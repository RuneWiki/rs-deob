import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class146 {

    @OriginalMember(owner = "client!w", name = "a", descriptor = "[S")
    public static short[] field2319 = new short[500];

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Lre;")
    public static class228 field2321;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Ljava/lang/String;")
    public String field2320;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method988(int arg0) {
        field2319 = null;
        if (arg0 != -4811) {
            field2323 = -64;
        }
        field2321 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)Lfi;")
    public static final class112 method989(int arg0, int arg1) {
        field2325++;
        class112 var2 = (class112) class267.field4259.method728((long) arg0, (byte) -115);
        if (var2 != null) {
            return var2;
        }
        int var3 = 53 % ((18 - arg1) / 38);
        byte[] var4 = class56.field931.method1590(arg0, (byte) -25, 5);
        class112 var5 = new class112();
        if (var4 != null) {
            var5.method793((byte) 127, new class88(var4));
        }
        class267.field4259.method737((long) arg0, 0, var5);
        return var5;
    }
}
