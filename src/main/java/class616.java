import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class616 {

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "Lwo;")
    public class314 field8623 = new class314();

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "Z")
    public boolean field8628 = false;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "[I")
    public static int[] field8621 = new int[50];

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!dt", name = "d", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!dt", name = "f", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    public static int field8627;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Z)V")
    public static void method3379(boolean arg0) {
        field8621 = null;
        if (arg0) {
            field8621 = null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(Lie;I)V")
    public final void method3380(class607 arg0, int arg1) {
        field8622++;
        class410 var3 = arg0.field8417;
        boolean var4 = true;
        class678[] var5 = arg0.field8425;
        for (int var6 = arg1; var6 < var5.length; var6++) {
            if (var5[var6].field9208) {
                var4 = false;
                break;
            }
        }
        if (var4) {
            return;
        }
        if (this.field8628) {
            for (class607 var7 = (class607) this.field8623.method1839(57); var7 != null; var7 = (class607) this.field8623.method1836((byte) -26)) {
                if (var7.field8417 == var3) {
                    var7.method3869(true);
                    class87.method610(var7, 0);
                }
            }
        }
        for (class607 var8 = (class607) this.field8623.method1839(39); var8 != null; var8 = (class607) this.field8623.method1836((byte) -26)) {
            if (var3.field5783 >= var8.field8417.field5783) {
                class63.method485(arg0, var8, (byte) -99);
                return;
            }
        }
        this.field8623.method1840(18, arg0);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
    public final void method3381(int arg0) {
        if (arg0 != 2) {
            this.method3381(-59);
        }
        while (true) {
            class607 var2 = (class607) this.field8623.method1834(arg0 ^ 0x2);
            if (var2 == null) {
                field8624++;
                return;
            }
            var2.method3869(true);
            class87.method610(var2, 0);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIIII)V")
    public static final void method3382(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -8 % ((5 - arg1) / 49);
        if (arg3 >= arg0) {
            class284.method1709(class15.field220[arg2], arg3, -8251, arg0, arg4);
        } else {
            class284.method1709(class15.field220[arg2], arg0, -8251, arg3, arg4);
        }
        field8625++;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZLjava/lang/String;ZLnga;I)V")
    public static final void method3383(boolean arg0, String arg1, boolean arg2, class256 arg3, int arg4) {
        field8626++;
        if (arg4 < 96) {
            field8621 = null;
        }
        if (!arg2) {
            class174.method1078(arg3, (byte) 46, 3, arg1);
            return;
        }
        if (class256.field3250.startsWith("win") && arg3.field3251) {
            String var5 = null;
            if (class745.field10393 != null) {
                var5 = class745.field10393.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class435 var6 = class174.method1078(arg3, (byte) 121, 0, arg1);
                class331.field4207 = var6;
                class634.field8794 = arg1;
                class728.field10190 = arg3;
                return;
            }
        }
        if (class256.field3250.startsWith("mac")) {
            String var7 = null;
            if (class745.field10393 != null) {
                var7 = class745.field10393.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg0) {
                class174.method1078(arg3, (byte) 86, 1, arg1);
                return;
            }
        }
        class174.method1078(arg3, (byte) 104, 2, arg1);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BIIII)V")
    public static final void method3384(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field8627++;
        float var5 = (float) class341.field4437 / (float) class341.field4439;
        int var6 = arg1;
        int var7 = arg3;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg3 / var5);
        }
        int var8 = arg4 - (arg3 - var7) / 2;
        int var9 = arg2 - (arg1 - var6) / 2;
        class90.field1143 = -1;
        class345.field4470 = -1;
        if (arg0 < 76) {
            field8621 = null;
        }
        class513.field7232 = class341.field4439 * var9 / var6;
        class758.field10552 = class341.field4437 - class341.field4437 * var8 / var7;
        class608.method3333((byte) 0);
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Z)V")
    public class616(boolean arg0) {
        this.field8628 = arg0;
    }
}
