import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class189 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "J")
    public long field2546;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Lm;")
    public class189 field2543;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Lm;")
    public class189 field2545;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)Z")
    public static final boolean method1184(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            field2540++;
            return class418.method2567(false, arg0, arg1) || class748.method4157(arg0, arg1, 55);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V")
    public final void method1185(int arg0) {
        field2541++;
        if (arg0 >= -26) {
            field2539 = 33;
        }
        if (this.field2545 != null) {
            this.field2545.field2543 = this.field2543;
            this.field2543.field2545 = this.field2545;
            this.field2545 = null;
            this.field2543 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIBII)V")
    public static final void method1186(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2544++;
        if (class221.field2883 != 1) {
            return;
        }
        int var5 = arg3 / class338.field4700;
        int var6 = arg1 / class338.field4700;
        int var7 = arg4 / class47.field555;
        int var8 = arg0 / class47.field555;
        if (class224.field3008 <= var5 || var6 < 0 || class296.field4168 <= var7 || var8 < 0) {
            return;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var8 >= class296.field4168) {
            var8 = class296.field4168 - 1;
        }
        if (var6 >= class224.field3008) {
            var6 = class224.field3008 - 1;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        for (int var9 = var7; var9 <= var8; var9++) {
            int var10 = class415.method2548(class233.field3144 + var9, class296.field4168, false) * class224.field3008;
            for (int var11 = var5; var11 <= var6; var11++) {
                int var12 = var10 + class415.method2548(class584.field8213 + var11, class224.field3008, false);
                class518.field7371[var12] = class681.field9340;
            }
        }
        if (arg2 >= -60) {
            field2539 = -93;
        }
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)Z")
    public final boolean method1187(int arg0) {
        if (arg0 == 0) {
            field2542++;
            return this.field2545 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static final void method1188(byte arg0) {
        class156.field2179 = true;
        if (arg0 >= -66) {
            field2539 = -80;
        }
        field2547++;
    }
}
