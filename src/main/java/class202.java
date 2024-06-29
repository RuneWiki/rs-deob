import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class202 {

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field3199 = 0;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "Lml;")
    public static class134 field3208 = null;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public int field3202;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public int field3203;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public int field3206;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public int field3207;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public int field3210;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "[B")
    public byte[] field3201;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "[B")
    public byte[] field3211;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "[I")
    public static int[] field3209;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method1282(byte arg0, int arg1) {
        class182.field2892 = arg1;
        field3200++;
        class25.field380 = 50;
        if (arg0 >= -74) {
            method1283(-72);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 54)
    public static void method1283(int arg0) {
        field3208 = null;
        if (arg0 <= -127) {
            field3209 = null;
        }
    }
}
