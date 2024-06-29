import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public class DoublyLinkable extends Linkable {

    @OriginalMember(owner = "mapview!ca", name = "l", descriptor = "Lv;")
    public static JagString field45 = class1.method2(255, "Suchen");

    @OriginalMember(owner = "mapview!ca", name = "k", descriptor = "I")
    public static int field44 = 0;

    @OriginalMember(owner = "mapview!ca", name = "n", descriptor = "I")
    public static volatile int field47 = 0;

    @OriginalMember(owner = "mapview!ca", name = "m", descriptor = "Lv;")
    public static JagString field46 = class1.method2(255, "Makeover Mage");

    @OriginalMember(owner = "mapview!ca", name = "o", descriptor = "Lv;")
    public static JagString field48 = class1.method2(255, "labels)3dat");

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(II[B)I", line = 4)
    public static final int method19(int arg0, int arg1, byte[] arg2) {
        if (arg0 != 27) {
            field44 = 18;
        }
        return GZip.method51((byte) -8, arg2, arg1, 0);
    }

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "(I)B", line = 14)
    public static final byte method20(int arg0) {
        if (arg0 != 26068) {
            field44 = -123;
        }
        return JavaKeyboard.field16 == null ? 0 : JavaKeyboard.field16[JavaKeyboard.field12];
    }

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "(I)V", line = 29)
    public static void method21(int arg0) {
        field46 = null;
        if (arg0 != 222) {
            method22(null, null, null, (byte) -105);
        }
        field48 = null;
        field45 = null;
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Lv;Lo;Lv;B)[Lb;", line = 52)
    public static final Pix24[] method22(JagString arg0, Js5Index arg1, JagString arg2, byte arg3) {
        int var4 = -97 % (arg3 / 43);
        int var5 = arg1.method128((byte) -107, arg0);
        int var6 = arg1.method132(-9751, var5, arg2);
        return mapview.method95(85, var5, arg1, var6);
    }

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(Lv;Lo;Lv;I)Ls;", line = 69)
    public static final PixFont method23(JagString arg0, Js5Index arg1, JagString arg2, int arg3) {
        int var4 = arg1.method128((byte) -124, arg0);
        if (arg3 != 28) {
            method23(null, null, null, -2);
        }
        int var5 = arg1.method132(arg3 - 9779, var4, arg2);
        return Js5Index.method124((byte) 119, var4, var5, arg1);
    }

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "(I)V", line = 94)
    public static final void method24(int arg0) {
        if (arg0 >= -64) {
            return;
        }
        if (Signlink.field461.toLowerCase().indexOf("microsoft") != -1) {
            ByteArrayPool.field178[221] = 43;
            ByteArrayPool.field178[188] = 71;
            ByteArrayPool.field178[189] = 26;
            ByteArrayPool.field178[191] = 73;
            ByteArrayPool.field178[192] = 58;
            ByteArrayPool.field178[222] = 59;
            ByteArrayPool.field178[187] = 27;
            ByteArrayPool.field178[190] = 72;
            ByteArrayPool.field178[186] = 57;
            ByteArrayPool.field178[219] = 42;
            ByteArrayPool.field178[220] = 74;
            ByteArrayPool.field178[223] = 28;
            return;
        }
        ByteArrayPool.field178[92] = 74;
        ByteArrayPool.field178[45] = 26;
        ByteArrayPool.field178[93] = 43;
        ByteArrayPool.field178[61] = 27;
        ByteArrayPool.field178[47] = 73;
        ByteArrayPool.field178[46] = 72;
        ByteArrayPool.field178[59] = 57;
        if (Signlink.field456 == null) {
            ByteArrayPool.field178[222] = 59;
            ByteArrayPool.field178[192] = 58;
        } else {
            ByteArrayPool.field178[520] = 59;
            ByteArrayPool.field178[222] = 58;
            ByteArrayPool.field178[192] = 28;
        }
        ByteArrayPool.field178[91] = 42;
        ByteArrayPool.field178[44] = 71;
    }
}
