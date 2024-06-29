import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class11 extends RuntimeException {

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "Ljava/lang/Throwable;")
    public Throwable field103;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Ljava/lang/String;")
    public String field98;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Lhj;")
    public static class69 field97 = class181.method1318("m-Ochte mit Ihnen handeln)3", (byte) -107);

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field102 = 0;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Lhj;")
    public static class69 field107 = class181.method1318("Suche nach Updates )2 ", (byte) -111);

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Lhj;")
    public static class69 field95 = class181.method1318("details", (byte) -128);

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field105 = 127;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Lta;")
    public static class241 field96 = new class241(500);

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Lvc;")
    public static class185 field108;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "Lue;")
    public static class86 field109;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (!arg6) {
            field97 = null;
        }
        if (arg0 >= class201.field3629 && arg5 <= class35.field485 && arg4 >= class19.field252 && class166.field3075 >= arg3) {
            if (arg2 == 1) {
                class170.method1245(arg5, arg1, arg3, arg4, arg0, (byte) 39);
            } else {
                class94.method681(arg5, arg1, arg3, arg2, arg4, 3454481, arg0);
            }
        } else if (arg2 == 1) {
            class113.method839(arg0, 26921, arg5, arg4, arg3, arg1);
        } else {
            class81.method580(false, arg1, arg0, arg5, arg4, arg3, arg2);
        }
        field106++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static final void method53(int arg0) {
        class156.field2917 = 0;
        class88.field1681 = 0;
        class52.method309((byte) 6);
        class94.method683((byte) 100);
        class68.method433(65535);
        field101++;
        for (int var1 = 0; var1 < class88.field1681; var1++) {
            int var3 = class108.field2071[var1];
            if (class180.field3272 != class131.field2428[var3].field4041) {
                if (class131.field2428[var3].field517.method1359(52)) {
                    class168.method1241(true, class131.field2428[var3]);
                }
                class131.field2428[var3].field517 = null;
                class131.field2428[var3] = null;
            }
        }
        if (class33.field451 != class199.field3595.field2379) {
            throw new RuntimeException("gnp1 pos:" + class199.field3595.field2379 + " psize:" + class33.field451);
        }
        for (int var2 = 0; var2 < class46.field659; var2++) {
            if (class131.field2428[class245.field4490[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class46.field659);
            }
        }
        if (arg0 != 58) {
            method52(-17, -51, -12, 39, -10, -52, true);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method54(byte arg0) {
        field96 = null;
        field108 = null;
        field97 = null;
        field109 = null;
        field107 = null;
        if (arg0 != -54) {
            method55(21);
        }
        field95 = null;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public static final void method55(int arg0) {
        field93++;
        if (arg0 < 57) {
            field97 = null;
        }
        if (!class65.field1254) {
            return;
        }
        class50 var1 = class108.method814(class20.field276, class228.field4164, -13706);
        if (var1 != null && var1.field816 != null) {
            class58 var2 = new class58();
            var2.field1050 = var1.field816;
            var2.field1048 = var1;
            class179.method1304((byte) 43, var2);
        }
        class65.field1254 = false;
        class204.method1478(var1, false);
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class11(Throwable arg0, String arg1) {
        this.field103 = arg0;
        this.field98 = arg1;
    }
}
