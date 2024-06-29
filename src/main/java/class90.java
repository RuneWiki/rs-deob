import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class90 {

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "Lvh;")
    public static class62 field1185 = new class62(30);

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "J")
    public static long field1191 = 0L;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "[I")
    public static int[] field1188 = new int[32];

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Z")
    public static boolean field1192 = true;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field1189 = 0;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "F")
    public static float field1190;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "Lnk;")
    public static class16 field1187;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 4)
    public static void method566(int arg0) {
        field1185 = null;
        field1188 = null;
        if (arg0 > -43) {
            field1192 = true;
        }
        field1187 = null;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V", line = 18)
    public static final void method567(int arg0) {
        field1184++;
        if (class231.field3500 == 5) {
            int var1 = 30 % ((-arg0 - 26) / 46);
            class231.field3500 = 6;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)V", line = 61)
    public static final void method568(int arg0, byte arg1) {
        field1186++;
        if (arg1 == 18) {
            class238.field3655.method387(arg0, false);
        }
    }
}
