import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class280 {

    @OriginalMember(owner = "client!up", name = "e", descriptor = "I")
    public int field4359;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "Ltt;")
    private class249 field4360;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "Lpn;")
    public static class49 field4357 = new class49(34, 7);

    @OriginalMember(owner = "client!up", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field4362;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "Lpn;")
    public static class49 field4363;

    @OriginalMember(owner = "client!up", name = "j", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "[I")
    public static int[] field4361;

    @OriginalMember(owner = "client!up", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field4358++;
        this.field4360.method1742((byte) 95, this.field4359);
        super.finalize();
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
    public static void method1892(int arg0) {
        field4363 = null;
        if (arg0 != 16) {
            field4362 = null;
        }
        field4362 = null;
        field4357 = null;
        field4361 = null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IZIII)V")
    public static final void method1893(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            field4361 = null;
        }
        field4356++;
        if (class31.method189(14, arg2)) {
            class503.method2996(arg3, arg0, arg1, true, -1, class237.field3555[arg2]);
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1894(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4355++;
        int var8 = class306.method2023(5, class487.field7124, arg5, class232.field3493);
        int var9 = class306.method2023(5, class487.field7124, arg7, class232.field3493);
        int var10 = class306.method2023(5, class232.field3492, arg4, class36.field453);
        int var11 = class306.method2023(5, class232.field3492, arg6, class36.field453);
        int var12 = class306.method2023(5, class487.field7124, arg0 + arg5, class232.field3493);
        int var13 = class306.method2023(5, class487.field7124, arg7 - arg0, class232.field3493);
        for (int var14 = var8; var14 < var12; var14++) {
            class262.method1831(var11, class402.field5946[var14], (byte) 43, arg2, var10);
        }
        if (arg1 <= 72) {
            field4361 = null;
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class262.method1831(var11, class402.field5946[var15], (byte) 43, arg2, var10);
        }
        int var16 = class306.method2023(5, class232.field3492, arg4 + arg0, class36.field453);
        int var17 = class306.method2023(5, class232.field3492, arg6 - arg0, class36.field453);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class402.field5946[var18];
            class262.method1831(var16, var19, (byte) 43, arg2, var10);
            class262.method1831(var17, var19, (byte) 43, arg3, var16);
            class262.method1831(var11, var19, (byte) 43, arg2, var17);
        }
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Ltt;II)V")
    public class280(class249 arg0, int arg1, int arg2) {
        this.field4359 = arg2;
        this.field4360 = arg0;
    }

    static {
        new class179("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field4362 = new String[100];
        field4363 = new class49(16, -1);
        field4364 = 0;
    }
}
