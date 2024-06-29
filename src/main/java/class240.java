import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class240 extends class42 {

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "J")
    public long field3204;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "Lvj;")
    public static class304 field3206 = new class304("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field3208 = -1;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lmd;Z)V", line = 4)
    public static final void method1478(class379 arg0, boolean arg1) {
        field3203++;
        if (!arg1) {
            return;
        }
        byte[] var2 = new byte[24];
        if (class202.field2803 != null) {
            try {
                class202.field2803.method2637(0L, -115);
                class202.field2803.method2629(var2, (byte) 36);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method2211(0, 24, var2, (byte) -111);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)I", line = 49)
    public static final int method1479(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            method1481(86, null, 66);
        }
        field3205++;
        int var5 = arg2 & 0xF;
        int var6 = var5 < 8 ? arg1 : arg4;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg1 : arg3) : arg4;
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BZI)V", line = 66)
    public static final void method1480(byte arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            class370.field4984 = class162.method1100(class66.field1022, (byte) 124, class154.field2244.field7756 * 2, class518.field7663, class389.field5281, arg2);
        } else {
            if (arg1) {
                class370.field4984 = class162.method1100(class66.field1022, (byte) 124, 0, class518.field7663, class389.field5281, 0);
                class370.field4984.method550(0);
                class425 var3 = class321.method1851(class165.field2406, (byte) 48, class201.field2790, 0);
                class489 var4 = class370.field4984.method589(var3, class134.method937(class71.field1082, class165.field2406, 0), true);
                class253.method1525(class299.field3960.method1764(class489.field6789, false), var4, 1, true);
                class370.field4984.method529();
                class124.method909(3545);
                class370.field4984.method1095(15512);
            }
            try {
                class370.field4984 = class162.method1100(class66.field1022, (byte) 124, class154.field2244.field7756 * 2, class518.field7663, class389.field5281, arg2);
                if (class370.field4984.method570()) {
                    class16 var5 = class370.field4984.method533(78643200);
                    class370.field4984.method617(var5);
                }
            } catch (Throwable var7) {
                arg2 = 0;
                class370.field4984 = class162.method1100(class66.field1022, (byte) 124, 0, class518.field7663, class389.field5281, 0);
            }
        }
        field3209++;
        class166.field2414 = arg2;
        class456.method2604((byte) -30);
        if (!class370.field4984.method567()) {
            class22.field391 = 1;
        }
        class370.field4984.method535(class22.field391);
        class370.field4984.method625(0);
        class370.field4984.method626(8);
        class130.field1895 = class370.field4984.method538();
        class141.field2045 = class370.field4984.method538();
        int var6 = -77 / ((-arg0 - 65) / 42);
        class247.method1498(-123);
        class370.field4984.method624(!class154.field2244.field7749);
        if (class370.field4984.method554()) {
            class362.method2105(true, class154.field2244.field7755);
        }
        class99.method707(class289.field3782 >> 3, class12.field251 >> 3, 73, class370.field4984);
        class489.method2809(0);
        class121.field1774 = false;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILcr;I)I", line = 132)
    public static final int method1481(int arg0, class403 arg1, int arg2) {
        field3207++;
        if (!client.method1255(arg1).method2044(arg2, 99) && arg1.field5506 == null) {
            return -1;
        } else {
            if (arg0 != -10108) {
                method1478(null, true);
            }
            return arg1.field5456 == null || arg1.field5456.length <= arg2 ? -1 : arg1.field5456[arg2];
        }
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V", line = 146)
    public class240() {
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V", line = 149)
    public static void method1482(byte arg0) {
        if (arg0 <= 43) {
            method1478(null, false);
        }
        field3206 = null;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(J)V", line = 163)
    public class240(long arg0) {
        this.field3204 = arg0;
    }
}
