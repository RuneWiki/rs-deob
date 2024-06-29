import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class class185 extends class159 {

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public static int field2867 = 0;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "[I")
    public static int[] field2875 = new int[2000];

    @OriginalMember(owner = "client!je", name = "x", descriptor = "Ljava/lang/String;")
    public static String field2877 = "flash2:";

    @OriginalMember(owner = "client!je", name = "p", descriptor = "F")
    public static float field2869;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "Lsi;")
    public static class264 field2876;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "Z")
    public boolean field2873;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)Z", line = 19)
    public final boolean method1277(int arg0) {
        if (arg0 == -17255) {
            field2865++;
            return this.field2873;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V", line = 30)
    public static void method1278(boolean arg0) {
        field2875 = null;
        field2876 = null;
        if (!arg0) {
            method1278(false);
        }
        field2877 = null;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "()I", line = 42)
    public int method744() {
        field2872++;
        return 0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)I", line = 51)
    public static int method1279(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)[Lle;", line = 58)
    public static final class137[] method1280(byte arg0) {
        field2866++;
        class137[] var1 = new class137[class2.field9];
        if (arg0 != 43) {
            return (class137[]) null;
        }
        for (int var2 = 0; var2 < class2.field9; var2++) {
            int var3 = class94.field1379[var2] * class322.field5289[var2];
            byte[] var4 = class105.field1522[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class201.field3085[class235.method1623(255, var4[var6])];
            }
            var1[var2] = new class137(class300.field4961, class96.field1400, class18.field228[var2], class28.field419[var2], class322.field5289[var2], class94.field1379[var2], var5);
        }
        class167.method1164(false);
        return var1;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)Z", line = 104)
    public final boolean method1281(byte arg0) {
        if (arg0 != -97) {
            field2867 = 88;
        }
        field2870++;
        return false;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)I", line = 115)
    public final int method1282(byte arg0) {
        field2874++;
        int var2 = 10 / ((arg0 - 37) / 47);
        return 1;
    }

    @OriginalMember(owner = "client!je", name = "f", descriptor = "(I)Z", line = 127)
    public final boolean method1283(int arg0) {
        if (arg0 == 0) {
            field2868++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIII)V")
    public abstract void method749(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
    public abstract void method746(int arg0);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()Z")
    public abstract boolean method750();

    @OriginalMember(owner = "client!je", name = "c", descriptor = "()Z")
    public abstract boolean method745();

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)V")
    public abstract void method747(int arg0, int arg1);

    @OriginalMember(owner = "client!je", name = "d", descriptor = "()V")
    public abstract void method748();
}
