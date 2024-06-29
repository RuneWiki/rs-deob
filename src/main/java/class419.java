import java.awt.Container;
import java.awt.Insets;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public abstract class class419 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "[I")
    public static int[] field6272 = new int[25];

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "Ldp;")
    public static class347 field6276 = new class347("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "Luv;")
    public static class2 field6277 = new class2(65, -1);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field6271;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILya;II)Z")
    public abstract boolean method233(int arg0, class11 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lya;IIILqj;IZ)V")
    public abstract void method224(class11 arg0, int arg1, int arg2, int arg3, class419 arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lya;I)V")
    public abstract void method234(class11 arg0, int arg1);

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(Lya;I)Lmo;")
    public abstract class268 method238(class11 arg0, int arg1);

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V")
    public abstract void method239(int arg0);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lok;Z)V")
    public static final void method2495(class74 arg0, boolean arg1) {
        field6275++;
        class158.field2385 = 0;
        class393.field5898 = 0;
        class534.field7857 = new class521();
        class81.field1184 = new class453[1024];
        class176.method1203(34963, arg0);
        if (arg1) {
            class288.method1782(arg0, -51);
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V")
    public static final void method2496(byte arg0) {
        field6274++;
        class415 var1 = null;
        try {
            class533 var2 = class25.field375.method825(0, "2", true);
            while (var2.field7848 == 0) {
                class389.method2332(-2, 1L);
            }
            if (var2.field7848 == 1) {
                var1 = (class415) var2.field7849;
                byte[] var3 = new byte[(int) var1.method2484(68)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2488(var4, var3, 0, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class257.method1526(new class468(var3), (byte) -84);
            }
        } catch (Exception var7) {
        }
        try {
            if (arg0 >= -3) {
                method2497(true);
            }
            if (var1 != null) {
                var1.method2485(110);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(Z)V")
    public static final void method2497(boolean arg0) {
        field6273++;
        if (class237.field3314 != null) {
            return;
        }
        Container var1;
        if (class176.field2596 == null) {
            var1 = class25.field375.field1611;
        } else {
            var1 = class176.field2596;
        }
        class455.field6669 = var1.getSize().width;
        class69.field921 = var1.getSize().height;
        if (!arg0) {
            method2498(87, 20);
        }
        if (class176.field2596 == var1) {
            Insets var2 = class176.field2596.getInsets();
            class455.field6669 -= var2.right + var2.left;
            class69.field921 -= var2.top + var2.bottom;
        }
        if (class437.method2568(-92) == 1) {
            class252.field3438 = (class455.field6669 - class227.field3206) / 2;
            class155.field2347 = class227.field3206;
            class33.field457 = 0;
            class413.field6241 = class97.field1506;
        } else if (class521.field7648 < 96 && class113.field1723 == 0) {
            int var3 = class455.field6669 > 1024 ? 1024 : class455.field6669;
            class155.field2347 = var3;
            int var4 = class69.field921 > 768 ? 768 : class69.field921;
            class252.field3438 = (class455.field6669 - var3) / 2;
            class413.field6241 = var4;
            class33.field457 = 0;
        } else {
            class155.field2347 = class455.field6669;
            class413.field6241 = class69.field921;
            class33.field457 = 0;
            class252.field3438 = 0;
        }
        if (class52.field674 != class149.field2269) {
            boolean var10000;
            if (class155.field2347 < 1024 && class413.field6241 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class357.field5469.setSize(class155.field2347, class413.field6241);
        if (class407.field6147 != null) {
            class407.field6147.method99(class357.field5469);
        }
        if (class176.field2596 == var1) {
            Insets var5 = class176.field2596.getInsets();
            class357.field5469.setLocation(class252.field3438 + var5.left, class33.field457 + var5.top);
        } else {
            class357.field5469.setLocation(class252.field3438, class33.field457);
        }
        if (class256.field3477 != -1) {
            class123.method914(true, arg0);
        }
        class111.method864(-11481);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)I")
    public static final int method2498(int arg0, int arg1) {
        if (arg0 > -36) {
            return -26;
        } else {
            field6271++;
            return arg1 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V")
    public static void method2499(int arg0) {
        field6272 = null;
        field6276 = null;
        field6277 = null;
        if (arg0 >= -116) {
            field6277 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "(I)Z")
    public abstract boolean method230(int arg0);
}
