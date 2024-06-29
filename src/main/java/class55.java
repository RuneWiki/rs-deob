import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class class55 {

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "J")
    public static long field907 = 0L;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field908 = 1;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "[I")
    public static int[] field906 = new int[64];

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "Lhk;")
    public static class71 field903;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lwf;B)Ljava/lang/String;", line = 10)
    public static final String method432(class250 arg0, byte arg1) {
        field904++;
        if (arg1 >= -98) {
            method435((byte) -111);
        }
        if (client.method336(arg0).method812(true) == 0) {
            return null;
        } else if (arg0.field4089 == null || arg0.field4089.trim().length() == 0) {
            return class178.field2857 ? "Hidden-use" : null;
        } else {
            return arg0.field4089;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIZJLjava/lang/String;ILjava/lang/String;S)V", line = 37)
    public static final void method434(int arg0, int arg1, boolean arg2, long arg3, String arg4, int arg5, String arg6, short arg7) {
        field909++;
        if (class358.field5687 || arg2 || class104.field1683 >= 500) {
            return;
        }
        class22.field249[class104.field1683] = arg6;
        class200.field3193[class104.field1683] = arg4;
        class149.field2379[class104.field1683] = arg1 == -1 ? class232.field3847 : arg1;
        class51.field810[class104.field1683] = arg7;
        class13.field144[class104.field1683] = arg3;
        class252.field4258[class104.field1683] = arg5;
        class230.field3819[class104.field1683] = arg0;
        class104.field1683++;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 65)
    public static void method435(byte arg0) {
        field903 = null;
        if (arg0 != 4) {
            field906 = (int[]) null;
        }
        field906 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)I")
    public abstract int method433(int arg0, int arg1);

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)V")
    public abstract void method436(int arg0, int arg1);

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)Lha;")
    public abstract class221 method437(byte arg0);

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)[B")
    public abstract byte[] method438(int arg0, int arg1);
}
