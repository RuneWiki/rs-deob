import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class71 extends class112 {

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "Lnf;")
    public class14 field1184;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "Ljava/lang/String;")
    public static String field1185 = "M";

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "J")
    public static long field1182 = 0L;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public static int field1191 = 0;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "[I")
    public static int[] field1189 = new int[14];

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "Lsb;")
    public static class124 field1183;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/awt/Component;ZILne;I)Lef;")
    public static final class241 method549(Component arg0, boolean arg1, int arg2, class78 arg3, int arg4) {
        field1187++;
        if (class23.field359 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class241 var5 = (class241) Class.forName("li").getDeclaredConstructor().newInstance();
                var5.field3827 = arg4;
                if (!arg1) {
                    field1185 = null;
                }
                var5.field3817 = new int[(class116.field1955 ? 2 : 1) * 256];
                var5.method1428(arg0);
                var5.field3826 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field3826 > 16384) {
                    var5.field3826 = 16384;
                }
                var5.method1424(var5.field3826);
                if (class100.field1538 > 0 && class94.field1463 == null) {
                    class94.field1463 = new class49();
                    class94.field1463.field903 = arg3;
                    arg3.method628(class100.field1538, class94.field1463, (byte) 82);
                }
                if (class94.field1463 != null) {
                    if (class94.field1463.field891[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class94.field1463.field891[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class275 var6 = new class275(arg3, arg2);
                    var6.field3817 = new int[(class116.field1955 ? 2 : 1) * 256];
                    var6.field3827 = arg4;
                    var6.method1428(arg0);
                    var6.field3826 = 16384;
                    var6.method1424(var6.field3826);
                    if (class100.field1538 > 0 && class94.field1463 == null) {
                        class94.field1463 = new class49();
                        class94.field1463.field903 = arg3;
                        arg3.method628(class100.field1538, class94.field1463, (byte) 82);
                    }
                    if (class94.field1463 != null) {
                        if (class94.field1463.field891[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class94.field1463.field891[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class241();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static void method550(int arg0) {
        field1183 = null;
        if (arg0 == 16384) {
            field1189 = null;
            field1185 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Lnf;)V")
    public class71(class14 arg0) {
        this.field1184 = arg0;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lti;B)I")
    public static final int method551(class139 arg0, byte arg1) {
        class165 var2 = arg0.field2321;
        int var3 = -128 % ((71 - arg1) / 50);
        field1181++;
        if (var2.field2741 != null) {
            var2 = var2.method1188((byte) -114);
            if (var2 == null) {
                return -1;
            }
        }
        int var4 = var2.field2700;
        class38 var5 = arg0.method1224(-1);
        if (arg0.field2901 == var5.field651) {
            var4 = var2.field2732;
        } else if (arg0.field2901 == var5.field665 || arg0.field2901 == var5.field672 || arg0.field2901 == var5.field670 || arg0.field2901 == var5.field658) {
            var4 = var2.field2731;
        } else if (arg0.field2901 == var5.field638 || arg0.field2901 == var5.field660 || arg0.field2901 == var5.field668 || arg0.field2901 == var5.field635) {
            var4 = var2.field2697;
        }
        return var4;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(Z)V")
    public static final void method552(boolean arg0) {
        field1190++;
        if (!arg0) {
            class26.field448.method1157(760);
            class152.field2489.method1157(760);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Lrl;")
    public static final class293 method553(int arg0, int arg1) {
        field1186++;
        if (arg1 >= -98) {
            method553(-103, -24);
        }
        class293 var2 = (class293) class89.field1420.method1518((long) arg0, 109);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class19.field304.method900(class104.method777(true, arg0), class257.method1718(arg0, -93), false);
        class293 var4 = new class293();
        if (var3 != null) {
            var4.method1969(959, new class136(var3));
        }
        class89.field1420.method1514(false, var4, (long) arg0);
        return var4;
    }
}
