import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public abstract class class241 {

    @OriginalMember(owner = "client!td", name = "c", descriptor = "[I")
    public static int[] field3628 = new int[14];

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lad;")
    public static class128 field3626 = new class128();

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3632 = "Continue";

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V", line = 12)
    public static void method1668(byte arg0) {
        field3628 = null;
        field3626 = null;
        field3632 = null;
        if (arg0 != -68) {
            field3628 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLlb;Llb;)V", line = 26)
    public static final void method1669(byte arg0, class211 arg1, class211 arg2) {
        field3627++;
        class191.field3053 = arg2;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        class97.field1444 = arg1;
        int var4 = (int) (Math.random() * 21.0D) - 10;
        class97.field1444.method1523(9271, 34);
        if (arg0 >= -18) {
            method1669((byte) 95, (class211) null, (class211) null);
        }
        int var5 = (int) (Math.random() * 41.0D) - 20;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class34.field420 = var3 + var5;
        class71.field1035 = var4 + var5;
        class33.field414 = var5 + var6;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 54)
    public static final boolean method1670(boolean arg0, String arg1) {
        field3630++;
        if (arg1 == null) {
            return false;
        } else if (arg0) {
            for (int var2 = 0; var2 < class291.field4577; var2++) {
                if (arg1.equalsIgnoreCase(class190.field3041[var2])) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)Lji;", line = 87)
    public static final class105 method1671(int arg0, int arg1) {
        field3629++;
        class105 var2 = (class105) class314.field4862.method1432((byte) 114, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 == 0) {
            byte[] var3 = class15.field180.method1507(arg1, (byte) 44, 16);
            class105 var4 = new class105();
            if (var3 != null) {
                var4.method813((byte) -128, new class35(var3));
            }
            class314.field4862.method1436(false, var4, (long) arg1);
            return var4;
        } else {
            return (class105) null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method989(int arg0, Component arg1);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method990(Component arg0, int arg1);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)I")
    public abstract int method988(boolean arg0);
}
