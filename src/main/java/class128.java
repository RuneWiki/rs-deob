import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class128 {

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "Z")
    public boolean field1549 = false;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "Lnk;")
    public static class459 field1548 = new class459();

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
    public static int field1555 = 0;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public int field1544;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public int field1551;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "Lln;")
    public class237 field1553;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "Lwc;")
    public static class376 field1554;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILtn;I)V")
    private final void method826(int arg0, class179 arg1, int arg2) {
        field1546++;
        if (arg0 != 2916) {
            return;
        }
        if (arg2 == 1) {
            this.field1551 = arg1.method1107(false);
        } else if (arg2 == 2) {
            this.field1544 = arg1.method1114(arg0 ^ 0xB11);
        } else if (arg2 == 3) {
            this.field1549 = true;
        } else if (arg2 == 4) {
            this.field1551 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZZILha;)Lac;")
    public final class712 method827(boolean arg0, boolean arg1, int arg2, class454 arg3) {
        field1547++;
        long var5 = (long) (arg3.field6368 << 19 | (arg0 ? 262144 : 0) | this.field1551 | arg2 << 16);
        if (arg1) {
            this.field1553 = null;
        }
        class712 var7 = (class712) this.field1553.field3070.method778(var5, -79);
        if (var7 != null) {
            return var7;
        } else if (this.field1553.field3069.method3827(this.field1551, (byte) 68)) {
            class196 var8 = class196.method1231(this.field1553.field3069, this.field1551, 0);
            if (var8 != null) {
                var8.field2524 = var8.field2526 = var8.field2528 = var8.field2522 = 0;
                if (arg0) {
                    var8.method1224();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method1233();
                }
            }
            class712 var10 = arg3.method60(var8, true);
            if (var10 != null) {
                this.field1553.field3070.method774(var5, -12, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method828(int arg0, int arg1) {
        field1552++;
        class303 var2 = (class303) class274.field3460.method3248((long) arg1, 0);
        if (var2 != null) {
            class148 var3 = var2.field3898.method1827(-38);
            if (var3 != null) {
                double var4 = var2.field3898.method1829((byte) -76);
                if (var4 >= (double) var3.method929(-1) && var4 <= (double) var3.method930((byte) 84)) {
                    return var3.method927((byte) -113);
                }
            }
        }
        int var6 = 21 / ((-arg0 - 12) / 45);
        return null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V")
    public static void method829(int arg0) {
        field1554 = null;
        if (arg0 >= -64) {
            method829(-79);
        }
        field1548 = null;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Z")
    public final boolean method830(int arg0) {
        if (arg0 <= 63) {
            this.method826(49, null, -65);
        }
        field1545++;
        return this.field1553.field3069.method3827(this.field1551, (byte) 67);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ltn;I)V")
    public final void method831(class179 arg0, int arg1) {
        int var3 = 107 % ((arg1 - 1) / 61);
        while (true) {
            int var4 = arg0.method1094(255);
            if (var4 == 0) {
                field1550++;
                return;
            }
            this.method826(2916, arg0, var4);
        }
    }
}
