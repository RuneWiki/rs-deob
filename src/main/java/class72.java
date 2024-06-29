import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public abstract class class72 {

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lcf;")
    public static class93 field1297 = class147.method1066(" weitere Optionen", -48);

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field1299 = 0;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "S")
    public static short field1295 = 32767;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field1293 = 0;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field1302 = 0;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field1300 = 0;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "[Lee;")
    public static class280[] field1301 = new class280[2048];

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "[I")
    public static int[] field1292;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "[Z")
    public static boolean[] field1291;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)I")
    public static final int method479(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1296++;
        if (arg0 != 0) {
            field1302 = -76;
        }
        int var5 = 65536 - class179.field3158[arg2 * 1024 / arg1] >> 1;
        return ((65536 - var5) * arg4 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method480(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method481(byte arg0, Component arg1);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static void method482(int arg0) {
        field1292 = null;
        if (arg0 != 26144) {
            method482(-73);
        }
        field1301 = null;
        field1291 = null;
        field1297 = null;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)I")
    public abstract int method483(int arg0);
}
