import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class102 implements class167 {

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "Ltda;")
    private class665 field1327;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "Lbt;")
    private class48 field1322;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "Ltf;")
    private class312 field1323;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "Lhj;")
    public static class596 field1321;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)V")
    public final void method684(int arg0) {
        this.field1323 = class481.method2858(this.field1327.field9135, -1, this.field1322);
        if (arg0 != 30573) {
            this.field1327 = null;
        }
        field1326++;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)Z")
    public final boolean method685(int arg0) {
        field1324++;
        if (arg0 != -18299) {
            this.field1327 = null;
        }
        return this.field1322.method433((byte) -79, this.field1327.field9135);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IZ)V")
    public final void method821(int arg0, boolean arg1) {
        field1325++;
        int var3 = 63 % ((53 - arg0) / 52);
        if (!arg1) {
            return;
        }
        int var4 = class701.field9880 <= class243.field2870 ? class243.field2870 : class701.field9880;
        int var5 = class705.field9921 <= class412.field5381 ? class412.field5381 : class705.field9921;
        int var6 = this.field1323.method1634();
        int var7 = this.field1323.method1636();
        int var8 = 0;
        int var9 = var4;
        int var10 = var4 * var7 / var6;
        int var11 = (var5 - var10) / 2;
        if (var10 > var5) {
            var9 = var5 * var6 / var7;
            var10 = var5;
            var11 = 0;
            var8 = (var4 - var9) / 2;
        }
        this.field1323.method1837(var8, var11, var9, var10);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)V")
    public static void method850(byte arg0) {
        field1321 = null;
        int var1 = -22 / ((56 - arg0) / 36);
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lbt;Ltda;)V")
    public class102(class48 arg0, class665 arg1) {
        this.field1327 = arg1;
        this.field1322 = arg0;
    }
}
