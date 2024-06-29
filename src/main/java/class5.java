import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class5 {

    @OriginalMember(owner = "client!mca", name = "e", descriptor = "I")
    public int field40 = 128;

    @OriginalMember(owner = "client!mca", name = "l", descriptor = "I")
    public int field47 = 128;

    @OriginalMember(owner = "client!mca", name = "h", descriptor = "I")
    public int field43;

    @OriginalMember(owner = "client!mca", name = "f", descriptor = "I")
    public int field41;

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "I")
    public int field39;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "I")
    public int field37;

    @OriginalMember(owner = "client!mca", name = "k", descriptor = "Liu;")
    public static class517 field46 = new class517(75, 0);

    @OriginalMember(owner = "client!mca", name = "m", descriptor = "[I")
    public static int[] field48;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!mca", name = "g", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!mca", name = "i", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!mca", name = "j", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)Lmca;")
    public final class5 method11(int arg0) {
        if (arg0 == -3308) {
            field42++;
            return new class5(this.field43, this.field40, this.field47, this.field39, this.field37, this.field41);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IILjj;IZZ[BI)Log;")
    public static final class98 method12(int arg0, int arg1, class66 arg2, int arg3, boolean arg4, boolean arg5, byte[] arg6, int arg7) {
        field38++;
        if (!arg4) {
            method13(-118);
        }
        if (arg2.field1164 || class32.method294(arg7, false) && class32.method294(arg3, !arg4)) {
            return new class98(arg2, 3553, arg1, arg7, arg3, arg5, arg6, arg0);
        } else if (arg2.field1158) {
            return new class98(arg2, 34037, arg1, arg7, arg3, arg5, arg6, arg0);
        } else {
            return new class98(arg2, arg1, arg7, arg3, class243.method1546(-26367, arg7), class243.method1546(-26367, arg3), arg6, arg0);
        }
    }

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)V")
    public static void method13(int arg0) {
        field48 = null;
        field46 = null;
        if (arg0 <= 19) {
            method15((byte) 105);
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIIZI)V")
    public static final void method14(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class337.field4833 = 0L;
        field45++;
        int var5 = class512.method2868(2);
        int var6 = -43 / ((arg1 + 3) / 53);
        if (arg4 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (!class159.field2378.method635()) {
            arg3 = true;
        }
        class492.method2812(var5, (byte) -105, arg2, arg4, arg3, arg0);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V")
    public static final void method15(byte arg0) {
        class343.field4929 = -1;
        field44++;
        class490.field6891 = 1;
        long var1 = 0L;
        if (arg0 != -114) {
            method12(75, -78, null, -22, false, false, null, 119);
        }
        if (class258.field3752 == null) {
            class276.method1780(16711935, 35);
        } else {
            class268 var3 = new class268(class230.method1513((byte) -97, class639.method3689(class258.field3752, (byte) 45)));
            long var4 = var3.method1690(false);
            class301.field4353 = var3.method1690(false);
            class480.method2765(true, arg0 ^ 0xFFFFFF8E, "", class555.method3108(var4, 0));
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILmca;)V")
    public final void method16(int arg0, class5 arg1) {
        this.field37 = arg1.field37;
        this.field47 = arg1.field47;
        field36++;
        if (arg0 != 2167) {
            method15((byte) 4);
        }
        this.field41 = arg1.field41;
        this.field40 = arg1.field40;
        this.field43 = arg1.field43;
        this.field39 = arg1.field39;
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(I)V")
    public class5(int arg0) {
        this.field43 = arg0;
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(IIIIII)V")
    private class5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field47 = arg2;
        this.field43 = arg0;
        this.field41 = arg5;
        this.field39 = arg3;
        this.field40 = arg1;
        this.field37 = arg4;
    }

    static {
        new class567("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field48 = new int[13];
    }
}
