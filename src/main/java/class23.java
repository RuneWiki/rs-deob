import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ma")
public class class23 {

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "Lv;")
    public static class40 field262 = class24.method170("Short)2cut", (byte) 24);

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "Lqa;")
    public static class31 field261 = new class31();

    @OriginalMember(owner = "mapview!ma", name = "f", descriptor = "Lv;")
    public static class40 field266 = class24.method170("50(U", (byte) -80);

    @OriginalMember(owner = "mapview!ma", name = "h", descriptor = "Lv;")
    public static class40 field268 = class24.method170("Hunter Training", (byte) -123);

    @OriginalMember(owner = "mapview!ma", name = "c", descriptor = "B")
    public byte field263;

    @OriginalMember(owner = "mapview!ma", name = "e", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "mapview!ma", name = "d", descriptor = "[B")
    public byte[] field264;

    @OriginalMember(owner = "mapview!ma", name = "g", descriptor = "[B")
    public static byte[] field267;

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(Z)V", line = 10)
    public static void method146(boolean arg0) {
        field266 = null;
        field268 = null;
        field267 = null;
        field262 = null;
        field261 = null;
        if (arg0) {
            field261 = null;
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(BLo;Lv;Lv;)[Le;", line = 30)
    public static final class9[] method147(byte arg0, class26 arg1, class40 arg2, class40 arg3) {
        int var4 = arg1.method184(arg2, -20310);
        if (arg0 > -84) {
            return (class9[]) null;
        } else {
            int var5 = arg1.method185(var4, (byte) 98, arg3);
            return class24.method172(var5, var4, -22795, arg1);
        }
    }

    @OriginalMember(owner = "mapview!ma", name = "b", descriptor = "(Z)[Lv;", line = 61)
    public static final class40[] method148(boolean arg0) {
        return arg0 ? new class40[] { class29.field422, class8.field96, class25.field371, class41.field534, class34.field456, class27.field411, class41.field533, class32.field443, class39.field498, class26.field399, class35.field467, class32.field438, class24.field365, class25.field385 } : (class40[]) null;
    }

    @OriginalMember(owner = "mapview!ma", name = "a", descriptor = "(I)V", line = 74)
    public final void method149(int arg0) {
        boolean var2 = true;
        if (this.field264 != null) {
            this.field263 = this.field264[0];
            for (int var3 = 0; var3 < 4096; var3++) {
                if (this.field264[var3] != this.field263) {
                    var2 = false;
                    break;
                }
            }
            if (var2) {
                this.field264 = null;
            }
        }
        if (arg0 != -4097) {
            field261 = null;
        }
    }
}
