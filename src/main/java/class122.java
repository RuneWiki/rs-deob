import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public abstract class class122 extends class196 {

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "S")
    public short field2341 = -32768;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "Lai;")
    public static class10 field2339 = class44.method278("ams", -86);

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "Lai;")
    public static class10 field2338 = class44.method278(":chalreq:", -107);

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "Lth;")
    public static class180 field2342 = null;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "Lai;")
    public static class10 field2346 = class44.method278("sl_stars", 121);

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "Lvg;")
    public static class197 field2344;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "Lc;")
    public static class21 field2347;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
    public static void method857(int arg0) {
        field2347 = null;
        field2344 = null;
        field2346 = null;
        field2339 = null;
        if (arg0 != -32768) {
            method857(-52);
        }
        field2338 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIIIIII)V")
    public void method253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class164 var10 = this.method264(127);
        field2340++;
        if (var10 != null) {
            var10.method253(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2341 = var10.field2341;
        }
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)Lsa;")
    public class164 method264(int arg0) {
        int var2 = -68 % ((arg0 - 66) / 59);
        field2345++;
        return null;
    }
}
