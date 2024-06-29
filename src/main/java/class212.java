import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class class212 {

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Lbc;")
    public static class225 field3208 = new class225();

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method1374(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field3207++;
        int var8 = class156.method978(0, arg1, class485.field6827, class345.field5011);
        int var9 = class156.method978(0, arg0, class485.field6827, class345.field5011);
        int var10 = class156.method978(0, arg2, class94.field1209, class168.field2449);
        int var11 = class156.method978(0, arg5, class94.field1209, class168.field2449);
        int var12 = class156.method978(0, arg1 + arg3, class485.field6827, class345.field5011);
        int var13 = class156.method978(0, arg0 - arg3, class485.field6827, class345.field5011);
        for (int var14 = var8; var14 < var12; var14++) {
            class103.method579((byte) 115, var10, var11, arg6, class128.field1676[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class103.method579((byte) 115, var10, var11, arg6, class128.field1676[var15]);
        }
        if (arg4) {
            field3208 = null;
        }
        int var16 = class156.method978(0, arg2 + arg3, class94.field1209, class168.field2449);
        int var17 = class156.method978(0, arg5 - arg3, class94.field1209, class168.field2449);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class128.field1676[var18];
            class103.method579((byte) 115, var10, var16, arg6, var19);
            class103.method579((byte) 115, var16, var17, arg7, var19);
            class103.method579((byte) 115, var17, var11, arg6, var19);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method1375(int arg0) {
        if (arg0 == 0) {
            field3208 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)Z")
    public abstract boolean method179(boolean arg0);

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)Lph;")
    public abstract class421 method189(int arg0);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIZII)Z")
    public static final boolean method1376(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3210++;
        if ((class413.field5813[0][arg4][arg1] & 0x2) != 0) {
            return true;
        } else if (!arg2) {
            return true;
        } else if ((class413.field5813[arg3][arg4][arg1] & 0x10) == 0) {
            return class388.method2334(arg1, arg3, -1, arg4) == arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)Z")
    public final boolean method1377(byte arg0) {
        field3209++;
        if (arg0 < 42) {
            field3208 = null;
        }
        return this.method176(0) || this.method192((byte) -117) || this.method179(true);
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
    public abstract void method182(int arg0);

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)I")
    public abstract int method177(int arg0);

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V")
    public abstract void method186(int arg0);

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)I")
    public abstract int method175(int arg0);

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)Z")
    public abstract boolean method176(int arg0);

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)Z")
    public abstract boolean method192(byte arg0);
}
