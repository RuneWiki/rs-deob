import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public abstract class class183 {

    @OriginalMember(owner = "client!up", name = "e", descriptor = "Lob;")
    public static class521 field2729 = new class521(15, 8);

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)Los;")
    public static final class309 method1213(int arg0, int arg1) {
        field2728++;
        if (arg1 >= -90) {
            method1219(null, null, false, 44);
        }
        class309[] var2 = class91.method744(-1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class309 var4 = var2[var3];
            if (var4.field4654 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)Z")
    public abstract boolean method1214(boolean arg0);

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)I")
    public abstract int method1215(byte arg0);

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(Z)J")
    public abstract long method1216(boolean arg0);

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)I")
    public abstract int method1217(int arg0);

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)Lgo;")
    public static final class445 method1218(int arg0) {
        field2725++;
        if (class210.field3428.length > class102.field1462) {
            return class210.field3428[class102.field1462++];
        } else {
            if (arg0 >= -126) {
                field2729 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Lul;Ljava/lang/String;ZI)Lcu;")
    public static final class149 method1219(class406 arg0, String arg1, boolean arg2, int arg3) {
        field2726++;
        int var4 = arg0.method2537(arg1, arg3 + 76);
        if (var4 == -1) {
            return new class149(0);
        }
        int[] var5 = arg0.method2540(arg3 - 103, var4);
        class149 var6 = new class149(var5.length);
        int var7 = 0;
        int var8 = arg3;
        while (true) {
            while (var7 < var6.field2238) {
                class217 var9 = new class217(arg0.method2536(var4, 0, var5[var8++]));
                int var10 = var9.method1556(101);
                int var11 = var9.method1511(82);
                int var12 = var9.method1515((byte) 123);
                if (!arg2 && var12 == 1) {
                    var6.field2238--;
                } else {
                    var6.field2237[var7] = var10;
                    var6.field2239[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
    public static void method1220(int arg0) {
        field2729 = null;
        if (arg0 != 8) {
            field2729 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "d", descriptor = "(I)C")
    public abstract char method1221(int arg0);

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Luq;III)V")
    public static final void method1222(class114 arg0, int arg1, int arg2, int arg3) {
        class271.field4150 = arg1;
        field2727++;
        class509.field7449 = arg0;
        if (arg2 != 0) {
            method1213(-46, -94);
        }
        class109.field1531 = arg3;
    }
}
