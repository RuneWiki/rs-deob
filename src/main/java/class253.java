import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class253 {

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Ljava/util/Random;")
    public static Random field4349 = new Random();

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "[S")
    public static short[] field4357 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)I")
    public static final int method1711(int arg0, int arg1, int arg2) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        if (arg2 >= -40) {
            method1711(118, 52, 65);
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        field4352++;
        return arg1;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Z")
    public static final boolean method1712(int arg0, int arg1) {
        field4351++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else if (arg1 >= 129 && arg1 <= 159) {
            return false;
        } else {
            return arg0 == 1;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)I")
    public static final int method1713(int arg0, int arg1) {
        field4355++;
        if (arg1 >= -120) {
            field4349 = null;
        }
        return arg0 == 16711935 ? -1 : class44.method421((byte) -119, arg0);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILpj;)Z")
    public static final boolean method1714(int arg0, class237 arg1) {
        if (arg0 > -41) {
            method1713(-55, 121);
        }
        field4350++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class221.field3810; var2++) {
            if (arg1.method1580(class152.field2694[var2], (byte) 27)) {
                return true;
            }
        }
        return arg1.method1580(class229.field3911.field4655, (byte) 27);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)Lie;")
    public static final class32 method1715(int arg0) {
        field4353++;
        class32 var1 = new class32(30);
        var1.method293((byte) 125, 7);
        var1.method293((byte) 125, class10.field196);
        var1.method293((byte) 125, class271.field4649 ? 1 : 0);
        var1.method293((byte) 125, class92.field1662 ? 1 : 0);
        var1.method293((byte) 125, class22.field401 ? 1 : 0);
        var1.method293((byte) 125, class223.field3837 ? 1 : 0);
        var1.method293((byte) 125, class13.field227 ? 1 : 0);
        if (arg0 != 7493) {
            method1712(127, 7);
        }
        var1.method293((byte) 125, class20.field382 ? 1 : 0);
        var1.method293((byte) 125, class59.field1207 ? 1 : 0);
        var1.method293((byte) 125, class63.field1256 ? 1 : 0);
        var1.method293((byte) 125, class91.field1656);
        var1.method293((byte) 125, class59.field1212 ? 1 : 0);
        var1.method293((byte) 125, class52.field1099 ? 1 : 0);
        var1.method293((byte) 125, class238.field4159 ? 1 : 0);
        var1.method293((byte) 125, class122.field2153);
        var1.method293((byte) 125, class141.field2499 ? 1 : 0);
        var1.method293((byte) 125, class78.field1459);
        var1.method293((byte) 125, class113.field1983);
        var1.method293((byte) 125, class204.field3497);
        var1.method350((byte) 19, class177.field3096);
        var1.method350((byte) 19, class121.field2135);
        var1.method293((byte) 125, 2);
        var1.method290((byte) -20, class31.field619);
        var1.method293((byte) 125, class17.field298);
        var1.method293((byte) 125, class83.field1557 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public static void method1716(int arg0) {
        field4349 = null;
        field4357 = null;
        if (arg0 != 164) {
            field4357 = null;
        }
    }
}
