import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class8 extends class25 {

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "[B")
    public byte[] field88;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "[I")
    public static int[] field83 = new int[2];

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field81 = 0;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public static int field85 = 0;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "Ldf;")
    public static class51 field91 = class46.method233("mapdots", 100);

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "Ldf;")
    public static class51 field94 = class46.method233("k", 100);

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "Lwc;")
    public static class213 field82;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "Z")
    public static boolean field93;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V")
    public static void method36(byte arg0) {
        field94 = null;
        field83 = null;
        if (arg0 >= 0) {
            field82 = null;
            field91 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method37(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field86++;
        int var8 = class149.method1074(87, class175.field2867, class36.field542, arg1);
        int var9 = class149.method1074(-71, class175.field2867, class36.field542, arg2);
        int var10 = class149.method1074(-43, class115.field1954, class28.field408, arg4);
        int var11 = class149.method1074(-101, class115.field1954, class28.field408, arg0);
        int var12 = class149.method1074(120, class175.field2867, class36.field542, arg1 + arg5);
        int var13 = class149.method1074(-58, class175.field2867, class36.field542, arg2 - arg5);
        if (arg3 != 0) {
            return;
        }
        for (int var14 = var8; var14 < var12; var14++) {
            class242.method1660((byte) -79, class80.field1324[var14], arg7, var11, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class242.method1660((byte) -79, class80.field1324[var15], arg7, var11, var10);
        }
        int var16 = class149.method1074(118, class115.field1954, class28.field408, arg4 + arg5);
        int var17 = class149.method1074(arg3 + 113, class115.field1954, class28.field408, arg0 - arg5);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class80.field1324[var18];
            class242.method1660((byte) -79, var19, arg7, var16, var10);
            class242.method1660((byte) -79, var19, arg6, var17, var16);
            class242.method1660((byte) -79, var19, arg7, var11, var17);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V")
    public static final void method38(int arg0, int arg1, int arg2) {
        field92++;
        class231 var3 = class46.method232(arg0 ^ 0xFFFFFFA0, arg2);
        int var4 = var3.field4034;
        int var5 = var3.field4035;
        int var6 = var3.field4041;
        int var7 = class191.field3194[var5 - var6];
        if (arg0 > arg1 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var6;
        class261.method1775(var8 & arg1 << var6 | class30.field439[var4] & ~var8, var4, arg0 - 11828);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
    public static final void method39(boolean arg0) {
        field87++;
        class192.field3220.method1350((byte) 126);
        if (arg0) {
            field82 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZ)Lua;")
    public static final class106 method40(int arg0, boolean arg1) {
        field89++;
        class106 var2 = (class106) class33.field489.method1491((long) arg0, (byte) 95);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class109.field1859.method828(26, (byte) 123, arg0);
        class106 var4 = new class106();
        if (var3 != null) {
            var4.method758(new class121(var3), -26293);
        }
        if (!arg1) {
            method39(false);
        }
        class33.field489.method1492(false, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIBIIIIII)V")
    public static final void method41(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field90++;
        if (class207.method1426((byte) 127, arg8)) {
            class82.field1369 = null;
            if (arg2 < 40) {
                method40(-124, true);
            }
            class156.method1112(-1, class10.field106[arg8], 20569, arg4, arg5, arg1, arg0, arg7, arg6, arg3);
            if (class82.field1369 != null) {
                class156.method1112(-1412584499, class82.field1369, 20569, arg4, arg5, arg1, arg0, class41.field641, class242.field4191, arg3);
                class82.field1369 = null;
            }
        } else if (arg5 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class213.field3705[var9] = true;
            }
        } else {
            class213.field3705[arg5] = true;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "([B)V")
    public class8(byte[] arg0) {
        this.field88 = arg0;
    }
}
