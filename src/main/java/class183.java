import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public abstract class class183 extends class45 {

    @OriginalMember(owner = "client!om", name = "p", descriptor = "Ljl;")
    public static class332 field2948 = new class332(8);

    @OriginalMember(owner = "client!om", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2951 = " from your ignore list first.";

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public static int field2955 = 0;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "Z")
    public boolean field2959;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 4)
    public static final void method1436(String arg0, int arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field2953++;
        System.exit(arg1);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)Z", line = 15)
    public final boolean method1438(int arg0) {
        if (arg0 == 23023) {
            field2947++;
            return this.field2959;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)Z", line = 29)
    public final boolean method1440(int arg0) {
        field2958++;
        if (arg0 != 1) {
            field2955 = -20;
        }
        return false;
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)I", line = 40)
    public final int method1441(int arg0) {
        if (arg0 == 5935) {
            field2952++;
            return 1;
        } else {
            return 23;
        }
    }

    @OriginalMember(owner = "client!om", name = "e", descriptor = "(I)Z", line = 51)
    public final boolean method1442(int arg0) {
        field2949++;
        return arg0 != -1;
    }

    @OriginalMember(owner = "client!om", name = "f", descriptor = "(I)V", line = 69)
    public static final void method1443(int arg0) {
        class292.field4724.method2327(arg0);
        field2957++;
        class291.field4704.method2327(arg0);
    }

    @OriginalMember(owner = "client!om", name = "g", descriptor = "(I)V", line = 78)
    public static final void method1444(int arg0) {
        class29.field383.method2231(arg0 ^ 0xFFFF85B5);
        field2950++;
        int var1 = class29.field383.method2227(-27542, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class29.field383.method2227(arg0 ^ 0xFFFFEE49, 2);
        if (arg0 != 31267) {
            field2951 = (String) null;
        }
        if (var2 == 0) {
            class330.field5248[class356.field5645++] = 2047;
        } else if (var2 == 1) {
            int var11 = class29.field383.method2227(arg0 - 58809, 3);
            class6.field55.method1639(true, 1, var11);
            int var12 = class29.field383.method2227(arg0 - 58809, 1);
            if (var12 == 1) {
                class330.field5248[class356.field5645++] = 2047;
            }
        } else if (var2 == 2) {
            if (class29.field383.method2227(-27542, 1) == 1) {
                int var7 = class29.field383.method2227(-27542, 3);
                class6.field55.method1639(true, 2, var7);
                int var8 = class29.field383.method2227(arg0 ^ 0xFFFFEE49, 3);
                class6.field55.method1639(true, 2, var8);
            } else {
                int var9 = class29.field383.method2227(-27542, 3);
                class6.field55.method1639(true, 0, var9);
            }
            int var10 = class29.field383.method2227(-27542, 1);
            if (var10 == 1) {
                class330.field5248[class356.field5645++] = 2047;
            }
        } else if (var2 == 3) {
            int var3 = class29.field383.method2227(-27542, 7);
            int var4 = class29.field383.method2227(arg0 ^ 0xFFFFEE49, 7);
            int var5 = class29.field383.method2227(-27542, 1);
            int var6 = class29.field383.method2227(-27542, 1);
            if (var6 == 1) {
                class330.field5248[class356.field5645++] = 2047;
            }
            class186.field2991 = class29.field383.method2227(-27542, 2);
            class6.field55.method1981(var3, var4, var5 == 1, (byte) -67);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "()I", line = 170)
    public int method1445() {
        field2956++;
        return 0;
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(B)V", line = 188)
    public static void method1450(byte arg0) {
        field2948 = null;
        field2951 = null;
        if (arg0 > -36) {
            method1444(36);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)V")
    public abstract void method1437(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
    public abstract void method1439(int arg0, int arg1);

    @OriginalMember(owner = "client!om", name = "b", descriptor = "()V")
    public abstract void method1446();

    @OriginalMember(owner = "client!om", name = "c", descriptor = "()Z")
    public abstract boolean method1447();

    @OriginalMember(owner = "client!om", name = "d", descriptor = "()Z")
    public abstract boolean method1448();

    @OriginalMember(owner = "client!om", name = "h", descriptor = "(I)V")
    public abstract void method1449(int arg0);
}
