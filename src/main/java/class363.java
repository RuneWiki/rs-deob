import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class363 extends class392 {

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "Lsv;")
    public static class570 field5158 = new class570(59, 3);

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field5167 = new String[5];

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)I")
    public final int method2184(int arg0) {
        if (arg0 != 17539) {
            this.method290(-21, 59);
        }
        ++field5161;
        return super.field5452;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(Z)V")
    public final void method291(boolean arg0) {
        ++field5163;
        if (arg0) {
            method2186(false, 40);
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(ILw;)V")
    public class363(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lw;)V")
    public class363(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V")
    public static void method2185(int arg0) {
        if (arg0 != 993) {
            field5167 = null;
        }
        field5158 = null;
        field5167 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)I")
    public final int method292(boolean arg0) {
        ++field5159;
        if (!arg0) {
            this.method292(false);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZI)V")
    public static final void method2186(boolean arg0, int arg1) {
        if (arg0) {
            if (~class379.field5314 != 0) {
                class604.method3507(class379.field5314, -1);
            }
            for (class27 var2 = (class27) class37.field437.method4254((byte) 8); var2 != null; var2 = (class27) class37.field437.method4251(arg1 ^ -96)) {
                if (!var2.method4235(-128)) {
                    var2 = (class27) class37.field437.method4254((byte) 8);
                    if (var2 == null) {
                        break;
                    }
                }
                class251.method1663(false, false, var2, true);
            }
            class379.field5314 = -1;
            class37.field437 = new class769(8);
            class416.method2446(-105);
            class379.field5314 = class420.field5819;
            class106.method857(false, 0);
            class31.method262((byte) -104);
            class46.method354(class379.field5314);
        }
        if (arg1 == 0) {
            ++field5165;
            class759.field10515 = true;
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)I")
    public final int method290(int arg0, int arg1) {
        if (arg1 > -124) {
            field5167 = null;
        }
        ++field5160;
        return 1;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BI)V")
    public final void method286(byte arg0, int arg1) {
        super.field5452 = arg1;
        ++field5162;
        int var3 = -51 % ((-80 - arg0) / 38);
    }
}
