import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class69 {

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "F")
    public static float field981;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZIII)V")
    public static final void method442(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 * class674.field9500.field5121.method3216(0) >> 8;
        field979++;
        if (arg0) {
            field980 = -53;
        }
        if (var4 == 0 || arg1 == -1) {
            return;
        }
        if (!class105.field1538 && class555.field7841 != -1 && class475.method2820((byte) -97) && !class652.method3773(97)) {
            class306.field3970 = class116.method765(-10241);
            class379 var5 = class340.method1965(3, class306.field3970);
            class645.method3739((byte) 97, var5, true);
        }
        class82.method489(arg1, class728.field10211, false, 0, (byte) -31, var4);
        class422.method2575(255, -1, (byte) -79);
        class105.field1538 = true;
    }
}
