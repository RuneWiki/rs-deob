import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class421 {

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Lbd;")
    public static class44 field5971 = new class44("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Lqt;")
    public static class459 field5972 = new class459(61, 3);

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field5973 = 0;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "[I")
    public static int[] field5974 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!id", name = "l", descriptor = "Lvp;")
    public static class127 field5975 = new class127();

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Lqv;")
    public static class316 field5976 = new class316(102, 2);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public int field5965;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public int field5968;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public int field5969;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public int field5970;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method2500(boolean arg0) {
        class276.field4124.field7558 = 0;
        field5966++;
        class501.field7244 = null;
        class505.field7301 = 0;
        class30.field405 = null;
        class126.field1986 = null;
        class269.field4041 = null;
        class305.field4527 = 0;
        class336.field4966.field7558 = 0;
        class246.field3680 = 0;
        class452.method2693(11);
        class100.method738(0);
        for (int var1 = 0; var1 < 2048; var1++) {
            class494.field7143[var1] = null;
        }
        class364.field5293 = null;
        for (int var2 = 0; var2 < class329.field4838; var2++) {
            class279 var4 = class221.field3375[var2].field2805;
            if (var4 != null) {
                var4.field260 = -1;
            }
        }
        if (arg0) {
            field5973 = 88;
        }
        class496.method2908(19692);
        class294.field4381 = 1;
        class170.method1206(1, 9);
        for (int var3 = 0; var3 < 100; var3++) {
            class25.field361[var3] = true;
        }
        class507.method2954(arg0);
        class368.field5312 = null;
        class73.field1194 = 0L;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V", line = 60)
    public static final void method2501(int arg0, int arg1, int arg2) {
        if (arg0 >= 56) {
            field5967++;
            class275 var3 = class213.method1433((byte) 122, 14, arg1);
            var3.method1778(0);
            var3.field4113 = arg2;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 78)
    public static void method2502(int arg0) {
        field5971 = null;
        if (arg0 != 32) {
            field5976 = null;
        }
        field5976 = null;
        field5975 = null;
        field5974 = null;
        field5972 = null;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V", line = 100)
    public static final void method2503(boolean arg0) {
        field5964++;
        if (class332.field4925) {
            class387.field5510 = null;
            class490.field7069 = null;
            class332.field4925 = arg0;
        }
    }
}
