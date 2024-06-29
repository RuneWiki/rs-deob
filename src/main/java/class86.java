import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class86 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field1096 = 0;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "F")
    public static float field1100;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Lmb;")
    public class86 field1098;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Lmb;")
    public class86 field1099;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 7)
    public final void method623(int arg0) {
        if (arg0 < 58) {
            this.method623(-39);
        }
        field1101++;
        if (this.field1099 != null) {
            this.field1099.field1098 = this.field1098;
            this.field1098.field1099 = this.field1099;
            this.field1099 = null;
            this.field1098 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BIII)V", line = 27)
    public static final void method624(byte arg0, int arg1, int arg2, int arg3) {
        String var4 = "::tele " + arg3 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
        field1095++;
        if (arg0 != -120) {
            method626(true, -59, -54, -1, -83);
        }
        System.out.println(var4);
        class235.method1672((byte) 95, var4);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lfh;I)V", line = 43)
    public static final void method625(class140 arg0, int arg1) {
        field1102++;
        class245.field3587 = arg0.method1079(false, "p11_full");
        class80.field1031 = arg0.method1079(false, "p12_full");
        class195.field2693 = arg0.method1079(false, "b12_full");
        class96.field1262 = arg0.method1079(false, "hitmarks");
        class194.field2679 = arg0.method1079(false, "hitbar_default");
        class137.field1873 = arg0.method1079(false, "headicons_pk");
        class229.field3288 = arg0.method1079(false, "headicons_prayer");
        class115.field1481 = arg0.method1079(false, "hint_headicons");
        class56.field722 = arg0.method1079(false, "hint_mapmarkers");
        if (arg1 <= 55) {
            method625((class140) null, -106);
        }
        class35.field426 = arg0.method1079(false, "mapflag");
        class205.field2859 = arg0.method1079(false, "cross");
        class287.field4156 = arg0.method1079(false, "mapdots");
        class48.field639 = arg0.method1079(false, "scrollbar");
        class319.field4696 = arg0.method1079(false, "name_icons");
        class95.field1241 = arg0.method1079(false, "floorshadows");
        class306.field4481 = arg0.method1079(false, "compass");
        class125.field1654 = arg0.method1079(false, "hint_mapedge");
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZIIII)V", line = 77)
    public static final void method626(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field1097++;
        class40.method281(false, (byte) -93);
        class71.field941 = arg0;
        class185.field2541 = arg2;
        if (arg4 != 27712) {
            method626(false, -77, -74, -1, -82);
        }
        class217.field3064 = arg1;
        class38.method267(arg3);
        class217.field3072 = new class329(8);
        class319.field4693 = new class329(8);
    }
}
