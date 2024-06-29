import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class85 extends class146 {

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "Ljava/lang/String;")
    public String field1395;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public static int field1391 = 0;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field1393 = 0;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "[Lqi;")
    public static class217[] field1397 = new class217[29];

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILsb;ZI)[Lbf;")
    public static final class102[] method673(int arg0, class124 arg1, boolean arg2, int arg3) {
        field1390++;
        if (class113.method833(arg3, arg1, arg0, -94)) {
            return arg2 ? class27.method242(0) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIZIIIIII)V")
    public static final void method674(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1389++;
        if (arg6 != 1322986288) {
            field1391 = -5;
        }
        int var10 = arg4 - arg0;
        int var11 = (arg5 - arg9 << 16) / var10;
        int var12 = arg7 - arg2;
        int var13 = (arg1 - arg8 << 16) / var12;
        class242.method1606(arg7, 0, arg0, -122, var11, var13, arg8, arg3, arg2, 0, arg4, arg9);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILsb;I)Lbf;")
    public static final class102 method675(int arg0, class124 arg1, int arg2) {
        if (arg2 <= 100) {
            field1397 = null;
        }
        field1392++;
        return class146.method1077(true, arg0, arg1) ? class153.method1110(18975) : null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method676(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class32.field540 <= arg1 && arg7 <= class61.field1034 && arg2 >= class108.field1650 && arg5 <= class154.field2509) {
            class11.method73(arg4, arg6, arg2, arg0, arg5, arg1, arg7, false);
        } else {
            class91.method698(arg6, arg1, arg4, 2691, arg0, arg2, arg7, arg5);
        }
        if (arg3) {
            field1397 = null;
        }
        field1398++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public static final void method677(int arg0) {
        field1394++;
        if (arg0 != 1322986288) {
            field1391 = 125;
        }
        for (int var1 = 0; var1 < class7.field88; var1++) {
            int var2 = class287.field4587[var1];
            class139 var3 = class3.field45[var2];
            if (var3 != null) {
                class149.method1094(-106, var3, var3.field2321.field2682);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class85() {
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)V")
    public static final void method678(byte arg0) {
        field1396++;
        class242.field3836.method1157(760);
        if (arg0 <= 47) {
            method679((byte) 21);
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class85(String arg0) {
        this.field1395 = arg0;
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)V")
    public static void method679(byte arg0) {
        field1397 = null;
        if (arg0 != -97) {
            method674(29, -89, 5, true, -58, 92, -32, 10, 65, 108);
        }
    }
}
