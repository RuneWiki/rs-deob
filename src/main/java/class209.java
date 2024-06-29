import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class209 extends class28 {

    @OriginalMember(owner = "client!f", name = "L", descriptor = "[Ldb;")
    public class157[] field3765;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "Lgk;")
    public static class6 field3760 = null;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "[Lnc;")
    public static class122[] field3766 = new class122[2048];

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Z")
    public static final boolean method1433(int arg0, int arg1) {
        if (arg0 < 66) {
            method1435(72);
        }
        field3763++;
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)V")
    public static final void method1434(int arg0, int arg1) {
        if (!class110.field1924) {
            arg0 = -1;
        }
        if (arg1 != 12781) {
            field3760 = null;
        }
        field3761++;
        if (class70.field1350 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class82 var2 = class227.method1543((byte) -73, arg0);
            class88 var3 = var2.method564(28756);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class281.field4957.method1534((byte) -16, var3.field1907, new Point(var2.field1545, var2.field1539), var3.field1900, class125.field2241, var3.method599());
                class70.field1350 = arg0;
            }
        }
        if (arg0 == -1 && class70.field1350 != -1) {
            class281.field4957.method1534((byte) -16, -1, new Point(), -1, class125.field2241, (int[]) null);
            class70.field1350 = -1;
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
    public static void method1435(int arg0) {
        field3766 = null;
        if (arg0 == -1616312024) {
            field3760 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(II)Z")
    public final boolean method1436(int arg0, int arg1) {
        if (arg1 != -27056) {
            method1434(73, 91);
        }
        field3764++;
        return this.field3765[arg0].field2889;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILvf;)Z")
    public static final boolean method1437(int arg0, class265 arg1) {
        field3762++;
        if (arg0 >= -95) {
            method1434(57, 40);
        }
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class89.field1603; var2++) {
            if (arg1.method1791(class198.field3530[var2], (byte) -98)) {
                return true;
            }
        }
        return arg1.method1791(class214.field3827.field2163, (byte) -98);
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lfl;Lfl;IZ)V")
    public class209(class192 arg0, class192 arg1, int arg2, boolean arg3) {
        class117 var5 = new class117();
        int var6 = arg0.method1331(arg2, (byte) 120);
        this.field3765 = new class157[var6];
        int[] var7 = arg0.method1303(0, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1332(true, var7[var8], arg2);
            class7 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class7 var12 = (class7) var5.method789((byte) -99); var12 != null; var12 = (class7) var5.method787((byte) -76)) {
                if (var12.field253 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1304(38, var11, 0);
                } else {
                    var13 = arg1.method1304(-123, 0, var11);
                }
                var10 = new class7(var11, var13);
                var5.method785(var10, -29);
            }
            this.field3765[var7[var8]] = new class157(var9, var10);
        }
    }
}
