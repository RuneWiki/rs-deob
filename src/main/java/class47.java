import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class47 {

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "[I")
    public static int[] field848 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field849 = "Choose Option";

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public int field842;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public int field843;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public int field845;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public int field850;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Lwf;")
    public static class1 field846;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lf;B)Ljava/lang/String;")
    public static final String method378(class36 arg0, byte arg1) {
        field839++;
        if (client.method1093(arg0).method606(1596737886) == 0) {
            return null;
        }
        int var2 = -73 % ((arg1 - 68) / 52);
        if (arg0.field566 == null || arg0.field566.trim().length() == 0) {
            return class103.field1675 ? "Hidden-use" : null;
        } else {
            return arg0.field566;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
    public static final byte[] method379(boolean arg0, Object arg1, int arg2) {
        field847++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg0 ? class146.method996(-17507, var3) : var3;
        } else if (arg1 instanceof class63) {
            class63 var4 = (class63) arg1;
            return var4.method446(arg2 ^ 0x34B4);
        } else {
            if (arg2 != 13508) {
                field846 = null;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method380(int arg0) {
        field849 = null;
        field846 = null;
        int var1 = 31 % ((-arg0 - 4) / 49);
        field848 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILf;IB)V")
    public static final void method381(int arg0, class36 arg1, int arg2, byte arg3) {
        field840++;
        if (client.field2517 != null || class199.field3181 || arg1 == null || class124.method892(325, arg1) == null) {
            return;
        }
        if (arg3 != 18) {
            method380(2);
        }
        client.field2517 = arg1;
        class173.field2725 = class124.method892(325, arg1);
        class241.field3900 = arg2;
        class107.field1711 = arg0;
        class239.field3877 = 0;
        class67.field1108 = false;
    }
}
