import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class93 extends class32 {

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field1738 = 0;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "Lij;")
    public static class50 field1744 = class78.method578(124, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public static int field1746 = 0;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "Lod;")
    public static class127 field1742 = new class127(64);

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public int field1734;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public int field1735;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public int field1741;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public int field1745;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public int field1747;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "Lce;")
    public class10 field1740;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "Lce;")
    public class10 field1743;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "Lij;")
    public class50 field1733;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "Z")
    public boolean field1737;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "[Ljava/lang/Object;")
    public Object[] field1739;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZBIIILwi;)V")
    public static final void method713(int arg0, boolean arg1, byte arg2, int arg3, int arg4, int arg5, class21 arg6) {
        long var7 = (long) ((arg0 << 16) + arg3);
        field1748++;
        class142 var9 = (class142) class154.field2686.method443(var7, (byte) 106);
        if (arg5 != -69994256 || var9 != null) {
            return;
        }
        class142 var10 = (class142) class104.field1898.method443(var7, (byte) 106);
        if (var10 != null) {
            return;
        }
        class142 var11 = (class142) class232.field3889.method443(var7, (byte) -36);
        if (var11 == null) {
            if (!arg1) {
                class142 var12 = (class142) class136.field2345.method443(var7, (byte) 95);
                if (var12 != null) {
                    return;
                }
            }
            class142 var13 = new class142();
            var13.field2493 = arg4;
            var13.field2487 = arg6;
            var13.field2481 = arg2;
            if (arg1) {
                class154.field2686.method445(arg5 + 69994334, var7, var13);
                class125.field2190++;
            } else {
                class254.field4388.method1681(var13, arg5 ^ 0x110FD591);
                class232.field3889.method445(116, var7, var13);
                class160.field2752++;
            }
        } else if (arg1) {
            var11.method1693(arg5 + 69994319);
            class154.field2686.method445(67, var7, var11);
            class125.field2190++;
            class160.field2752--;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    public static void method714(byte arg0) {
        field1744 = null;
        field1742 = null;
        if (arg0 <= 26) {
            method713(28, false, (byte) 110, 95, -106, -78, (class21) null);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIBIII)V")
    public static final void method715(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (class177.field2953 <= arg1 && arg4 <= class224.field3773 && class100.field1855 <= arg5 && class97.field1816 >= arg0) {
            if (arg6 == 1) {
                class79.method582(arg1, arg5, arg2, false, arg4, arg0);
            } else {
                class101.method772(arg1, arg2, (byte) -58, arg0, arg4, arg6, arg5);
            }
        } else if (arg6 == 1) {
            class144.method1009(arg5, arg1, arg4, arg0, arg2, false);
        } else {
            class183.method1241(arg4, arg5, arg0, (byte) -38, arg6, arg2, arg1);
        }
        if (arg3 > 11) {
            field1736++;
        }
    }
}
