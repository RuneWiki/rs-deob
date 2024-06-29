import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public abstract class class61 {

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Ljd;")
    private static class86 field1210 = class122.method868("flash1:", true);

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Ljd;")
    public static class86 field1209 = class122.method868("hint_mapedge", true);

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Ljd;")
    public static class86 field1212 = class122.method868("details", true);

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field1207 = 0;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Ljd;")
    public static class86 field1206 = class122.method868("", true);

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Ljd;")
    public static class86 field1213 = field1210;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Ljd;")
    public static class86 field1211 = field1210;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field1208;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "[I")
    public static int[] field1214;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)[B")
    public abstract byte[] method435(int arg0);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "()V")
    public static final void method436() {
        if (class114.field2191 != null) {
            for (int var0 = 0; var0 < class114.field2191.length; var0++) {
                for (int var1 = 0; var1 < class70.field1424; var1++) {
                    for (int var2 = 0; var2 < class126.field2436; var2++) {
                        class114.field2191[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class76.field1506 != null) {
            for (int var3 = 0; var3 < class76.field1506.length; var3++) {
                for (int var4 = 0; var4 < class70.field1424; var4++) {
                    for (int var5 = 0; var5 < class126.field2436; var5++) {
                        class76.field1506[var3][var4][var5] = null;
                    }
                }
            }
        }
        class113.field2151 = 0;
        if (class247.field4396 != null) {
            for (int var6 = 0; var6 < class113.field2151; var6++) {
                class247.field4396[var6] = null;
            }
        }
        if (class158.field2971 != null) {
            for (int var7 = 0; var7 < class265.field4677; var7++) {
                class158.field2971[var7] = null;
            }
            class265.field4677 = 0;
        }
        if (class60.field1201 != null) {
            for (int var8 = 0; var8 < class60.field1201.length; var8++) {
                class60.field1201[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([BB)V")
    public abstract void method437(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public static void method438(int arg0) {
        field1209 = null;
        field1211 = null;
        field1210 = null;
        field1213 = null;
        if (arg0 != 15681) {
            field1211 = null;
        }
        field1214 = null;
        field1206 = null;
        field1212 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lbj;Lbj;BZ)V")
    public static final void method439(class151 arg0, class151 arg1, byte arg2, boolean arg3) {
        class221.field3971 = arg3;
        class228.field4139 = arg1;
        if (arg2 >= 19) {
            class247.field4391 = arg0;
            field1208++;
        }
    }
}
