import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class177 extends class287 {

    @OriginalMember(owner = "client!o", name = "t", descriptor = "Lcca;")
    public static class462 field2398 = new class462(16);

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Lgca;")
    private class209 field2401;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "Lsv;")
    public static class59 field2403;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
    public final String method1107(String arg0, int arg1, int arg2) {
        field2399++;
        if (this.field2401 == null) {
            return arg0;
        }
        if (arg1 != 41) {
            this.method1109(-5, -110, 52);
        }
        class407 var4 = (class407) this.field2401.method1381(true, (long) arg2);
        return var4 == null ? arg0 : var4.field5650;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lvj;I)V")
    public final void method1108(class26 arg0, int arg1) {
        if (arg1 != 25024) {
            field2403 = null;
        }
        while (true) {
            int var3 = arg0.method194((byte) 119);
            if (var3 == 0) {
                field2400++;
                return;
            }
            this.method1111(var3, arg0, -70);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)I")
    public final int method1109(int arg0, int arg1, int arg2) {
        field2404++;
        if (this.field2401 == null) {
            return arg0;
        } else if (arg1 == -250) {
            class285 var4 = (class285) this.field2401.method1381(true, (long) arg2);
            return var4 == null ? arg0 : var4.field3770;
        } else {
            return 72;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method1110(int arg0) {
        field2398 = null;
        field2403 = null;
        if (arg0 != 10639) {
            method1110(-121);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILvj;I)V")
    private final void method1111(int arg0, class26 arg1, int arg2) {
        int var4 = -40 % ((3 - arg2) / 43);
        if (arg0 == 249) {
            int var5 = arg1.method194((byte) 119);
            if (this.field2401 == null) {
                int var6 = class670.method3834(var5, 23538);
                this.field2401 = new class209(var6);
            }
            for (int var7 = 0; var7 < var5; var7++) {
                boolean var8 = arg1.method194((byte) 119) == 1;
                int var9 = arg1.method186((byte) 94);
                class513 var10;
                if (var8) {
                    var10 = new class407(arg1.method196((byte) -92));
                } else {
                    var10 = new class285(arg1.method189(255));
                }
                this.field2401.method1387(var10, (long) var9, (byte) -118);
            }
        }
        field2402++;
    }
}
