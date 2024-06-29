import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class class285 {

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lkca;")
    public static class73 field3939 = new class73(43, -1);

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "[I")
    public static int[] field3942;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Loa;)V", line = 15)
    public static final void method1844(class605 arg0) {
        for (int var1 = class87.field993; var1 < class637.field9161; var1++) {
            for (int var2 = 0; var2 < class588.field8441; var2++) {
                for (int var3 = 0; var3 < class91.field1047; var3++) {
                    class99 var4 = class431.field6408[var1][var2][var3];
                    if (var4 != null) {
                        class599 var5 = var4.field1168;
                        class599 var6 = var4.field1176;
                        if (var5 != null && var5.method84(1630)) {
                            class10.method58(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method84(1630)) {
                                class10.method58(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method86(7, 0, 0, var5, arg0, false, 0);
                                var6.method96((byte) -76);
                            }
                            var5.method96((byte) -76);
                        }
                        for (class104 var7 = var4.field1167; var7 != null; var7 = var7.field1251) {
                            class144 var9 = var7.field1253;
                            if (var9 != null && var9.method84(1630)) {
                                class10.method58(arg0, var9, var1, var2, var3, var9.field1762 + 1 - var9.field1773, var9.field1761 - var9.field1758 + 1);
                                var9.method96((byte) -76);
                            }
                        }
                        class111 var8 = var4.field1174;
                        if (var8 != null && var8.method84(1630)) {
                            class3.method13(arg0, var8, var1, var2, var3);
                            var8.method96((byte) -76);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V", line = 91)
    public static void method1845(byte arg0) {
        field3942 = null;
        if (arg0 != -94) {
            method1844(null);
        }
        field3939 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II[BI)V")
    public abstract void method1840(int arg0, int arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public abstract void method1841(int arg0);

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public abstract void method1842(int arg0);

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II[BI)I")
    public abstract int method1843(int arg0, int arg1, byte[] arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Z")
    public abstract boolean method1846(int arg0, int arg1) throws IOException;
}
