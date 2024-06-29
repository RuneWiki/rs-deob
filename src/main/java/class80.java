import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class80 extends class600 {

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Lvh;")
    public static class125 field1207 = new class125(3, 3);

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field1210 = 0;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "[I")
    public static int[] field1208 = new int[2];

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public int field1209;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Lufa;")
    public class141 field1206;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 14)
    public static void method615(int arg0) {
        field1207 = null;
        field1208 = null;
        if (arg0 != 3980) {
            method615(-80);
        }
    }
}
