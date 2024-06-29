import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class296 {

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field4277 = 52;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lpm;")
    public static class349 field4274 = new class349("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field4283 = 0;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "B")
    public byte field4276;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public int field4280;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Lclient;")
    public static client field4282;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "Ljava/lang/String;")
    public String field4273;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Ljava/lang/String;")
    public String field4279;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "Ljava/lang/String;")
    public String field4281;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "[I")
    public static int[] field4284;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)Z", line = 17)
    public static final boolean method2000(byte arg0) {
        if (arg0 >= 0) {
            return true;
        } else {
            field4275++;
            return class110.field1418 == 0 ? class399.field5615 : true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V", line = 41)
    public static void method2001(byte arg0) {
        field4274 = null;
        field4282 = null;
        if (arg0 <= 19) {
            field4274 = null;
        }
        field4284 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 55)
    public static final void method2002(int arg0) {
        field4278++;
        class390.method2463(25, true);
        if (arg0 > -89) {
            method2001((byte) 99);
        }
        class96.method573((byte) 57);
        System.gc();
    }
}
