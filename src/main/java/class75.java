import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public abstract class class75 {

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Z")
    public static volatile boolean field1294 = true;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Lli;")
    public static class185 field1296 = class245.method1649("Chargement en cours)3 Veuillez patienter)3", 122);

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lli;")
    public static class185 field1297 = class245.method1649("gleiten:", -17);

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lli;")
    public static class185 field1299 = class245.method1649("hitmarks", -65);

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Lp;")
    public static class82 field1292;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static void method487(byte arg0) {
        field1292 = null;
        field1297 = null;
        field1296 = null;
        field1299 = null;
        int var1 = 6 % ((69 - arg0) / 36);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "()I")
    public abstract int method62();

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIII)V")
    public abstract void method46(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "()Z")
    public boolean method65() {
        field1298++;
        return false;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V")
    public static final void method488(byte arg0, int arg1) {
        field1293++;
        class174 var2 = class249.method1671(1, arg1, (byte) -117);
        if (arg0 != -37) {
            method488((byte) -119, 113);
        }
        var2.method1234((byte) -26);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)Lbb;")
    public class75 method51(int arg0, int arg1, int arg2) {
        field1295++;
        return this;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIIIJILga;)V")
    public abstract void method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class16 arg10);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lbb;IIIZ)V")
    public void method70(class75 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1300++;
    }
}
