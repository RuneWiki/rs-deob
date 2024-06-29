import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class93 {

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1679 = "level: ";

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field1680 = 0;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "[Lmg;")
    public static class113[] field1678;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lag;I)Lic;", line = 10)
    public static final class21 method625(class202 arg0, int arg1) {
        arg0.method1317((byte) -117);
        int var2 = -114 % ((arg1 + 61) / 63);
        field1682++;
        int var3 = arg0.method1317((byte) -86);
        class21 var4 = class148.method965(var3, -25784);
        var4.field436 = arg0.method1317((byte) -97);
        int var5 = arg0.method1317((byte) -118);
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = arg0.method1317((byte) -101);
            var4.method178(-318, var7, arg0);
        }
        var4.method183((byte) 83);
        return var4;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILve;)V", line = 62)
    public static final void method626(int arg0, class278 arg1) {
        field1683++;
        if (arg0 != 50) {
            method628(-3);
        }
        class174 var2 = (class174) class200.field3197.method303(class116.method767(arg0 - 178, arg1.field4269), (byte) 116);
        if (var2 == null) {
            return;
        }
        if (var2.field2789 != null) {
            class11.field230.method1237(var2.field2789);
            var2.field2789 = null;
        }
        var2.method278((byte) -105);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 94)
    public static void method627(byte arg0) {
        if (arg0 != -55) {
            method625((class202) null, 69);
        }
        field1679 = null;
        field1678 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)I", line = 105)
    public static final int method628(int arg0) {
        field1681++;
        if ((double) class248.field3867 == 3.0D) {
            return 37;
        } else if ((double) class248.field3867 == 4.0D) {
            return 50;
        } else {
            int var1 = -24 / ((48 - arg0) / 53);
            if ((double) class248.field3867 == 6.0D) {
                return 75;
            } else if ((double) class248.field3867 == 8.0D) {
                return 100;
            } else {
                return 200;
            }
        }
    }
}
