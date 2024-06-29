import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class class171 extends class65 {

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "Lrs;")
    public class166 field2937;

    @OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!vl", name = "m", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!vl", name = "p", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!vl", name = "o", descriptor = "Z")
    public boolean field2938;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)I", line = 4)
    public final int method1354(byte arg0) {
        if (arg0 < 90) {
            method1355((byte) -93);
        }
        field2939++;
        return 1;
    }

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "(B)V", line = 19)
    public static final void method1355(byte arg0) {
        field2941++;
        class390.method2438(0);
        class495.field7166 = 0;
        class340.field4998 = null;
        if (arg0 < 33) {
            method1355((byte) 63);
        }
        class618.field8707 = 0;
        class624.field8742.field4534 = 0;
        class424.field6233 = null;
        class153.field2383 = null;
        class152.field2373 = 0;
        class263.field4081 = null;
        class4.method18(352);
        class94.method786((byte) -93);
        for (int var1 = 0; var1 < 2048; var1++) {
            class279.field4271[var1] = null;
        }
        class145.field2251 = null;
        for (int var2 = 0; var2 < class271.field4162; var2++) {
            class461 var4 = class501.field7280[var2].field847;
            if (var4 != null) {
                var4.field1687 = -1;
            }
        }
        class368.method2351(-30564);
        class275.field4202 = -1;
        class87.field1279 = -1;
        class639.field8978 = 1;
        class658.method3704(-5697, 10);
        for (int var3 = 0; var3 < 100; var3++) {
            class6.field66[var3] = true;
        }
        class24.method130(1);
        class73.field1102 = 0L;
        class53.field851 = null;
    }

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "(B)Z", line = 76)
    public final boolean method1356(byte arg0) {
        if (arg0 > -35) {
            return true;
        } else {
            field2936++;
            return this.field2938;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Z", line = 89)
    public final boolean method1357(int arg0) {
        field2935++;
        return arg0 != 0;
    }

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "(B)I", line = 107)
    public int method1187(byte arg0) {
        if (arg0 <= 15) {
            this.method1182((byte) -76);
        }
        field2934++;
        return 0;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lrs;)V", line = 117)
    public class171(class166 arg0) {
        this.field2937 = arg0;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILwo;Lwo;)V")
    public abstract void method1181(int arg0, int arg1, class692 arg2, class692 arg3);

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "(B)Z")
    public abstract boolean method1185(byte arg0);

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)V")
    public abstract void method1189(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)Z")
    public abstract boolean method1184(int arg0);

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(II)V")
    public abstract void method1186(int arg0, int arg1);

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "(B)V")
    public abstract void method1182(byte arg0);
}
