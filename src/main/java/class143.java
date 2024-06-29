import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public abstract class class143 {

    @OriginalMember(owner = "client!um", name = "g", descriptor = "[S")
    public static short[] field2590 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field2587 = 0;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "Z")
    public static boolean field2584 = false;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "Lhc;")
    public static class171 field2592 = new class171(64);

    @OriginalMember(owner = "client!um", name = "m", descriptor = "Lud;")
    private static class279 field2596 = class130.method1024("Examine", 255);

    @OriginalMember(owner = "client!um", name = "p", descriptor = "Lud;")
    public static class279 field2599 = class130.method1024("3D)2Softwarebibliothek gestartet)3", 255);

    @OriginalMember(owner = "client!um", name = "q", descriptor = "Lud;")
    public static class279 field2600 = field2596;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public static int field2598 = 0;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    public static int field2597 = 0;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public int field2585;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public int field2591;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public int field2594;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)Z", line = 8)
    public final boolean method1094(int arg0) {
        if (arg0 != 0) {
            this.method1094(26);
        }
        field2595++;
        return (this.field2591 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 21)
    public static void method1095(int arg0) {
        field2600 = null;
        field2590 = null;
        if (arg0 == 0) {
            field2596 = null;
            field2592 = null;
            field2599 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Z", line = 35)
    public final boolean method1096(byte arg0) {
        field2586++;
        int var2 = 88 / ((36 - arg0) / 34);
        return (this.field2591 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lud;II)V", line = 45)
    public static final void method1097(class279 arg0, int arg1, int arg2) {
        if (arg2 != -2) {
            field2599 = (class279) null;
        }
        class279 var3 = arg0.method1980((byte) -17).method2016(arg2 - 30);
        field2589++;
        boolean var4 = false;
        for (int var5 = 0; var5 < class103.field1931; var5++) {
            class239 var6 = class96.field1780[class252.field4503[var5]];
            if (var6 != null && var6.field4197 != null && var6.field4197.method2010(var3, (byte) 96)) {
                var4 = true;
                class315.method2228(var6.field11[0], 2, class72.field1420.field34[0], -22495, 0, 0, 1, 0, false, 1, class72.field1420.field11[0], var6.field34[0]);
                if (arg1 == 1) {
                    class309.field5481++;
                    class314.field5534.method1634(79, arg2 ^ 0xFFFFFFFE);
                    class314.field5534.method485(class252.field4503[var5], arg2 ^ 0xFFFFFFE1);
                } else if (arg1 == 4) {
                    class314.field5534.method1634(70, 0);
                    class294.field5248++;
                    class314.field5534.method462(class252.field4503[var5], true);
                } else if (arg1 == 5) {
                    class103.field1942++;
                    class314.field5534.method1634(195, 0);
                    class314.field5534.method505(class252.field4503[var5], (byte) 7);
                } else if (arg1 == 6) {
                    class314.field5534.method1634(192, 0);
                    class314.field5534.method485(class252.field4503[var5], 88);
                    class74.field1466++;
                } else if (arg1 == 7) {
                    class179.field3244++;
                    class314.field5534.method1634(224, arg2 ^ 0xFFFFFFFE);
                    class314.field5534.method485(class252.field4503[var5], 87);
                }
                break;
            }
        }
        if (!var4) {
            class59.method532(class115.method929(new class279[] { class253.field4511, var3 }, (byte) 60), class60.field1265, 0, 29437);
        }
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)Z", line = 126)
    public final boolean method1098(int arg0) {
        if (arg0 == 2) {
            field2588++;
            return (this.field2591 & 0x2) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)Z", line = 142)
    public final boolean method1099(int arg0) {
        if (arg0 == 4259) {
            field2593++;
            return (this.field2591 & 0x8) != 0;
        } else {
            return true;
        }
    }
}
