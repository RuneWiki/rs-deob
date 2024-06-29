import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class587 extends class25 {

    @OriginalMember(owner = "client!at", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field8251;

    @OriginalMember(owner = "client!at", name = "I", descriptor = "Lki;")
    public static class320 field8253 = new class320();

    @OriginalMember(owner = "client!at", name = "K", descriptor = "[Lwa;")
    public static class662[] field8255 = new class662[14];

    @OriginalMember(owner = "client!at", name = "B", descriptor = "I")
    public static int field8246;

    @OriginalMember(owner = "client!at", name = "C", descriptor = "I")
    public static int field8247;

    @OriginalMember(owner = "client!at", name = "D", descriptor = "I")
    public static int field8248;

    @OriginalMember(owner = "client!at", name = "E", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!at", name = "F", descriptor = "I")
    public static int field8250;

    @OriginalMember(owner = "client!at", name = "H", descriptor = "I")
    public static int field8252;

    @OriginalMember(owner = "client!at", name = "J", descriptor = "Lrc;")
    public static class29 field8254;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "(B)Z")
    public final boolean method175(byte arg0) {
        int var2 = 63 / ((-arg0 - 70) / 55);
        field8252++;
        return false;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;BLjava/lang/String;)V")
    public static final void method3232(String arg0, String arg1, int arg2, int arg3, int arg4, String arg5, String arg6, byte arg7, String arg8) {
        field8248++;
        if (arg7 <= 99) {
            method3233(68);
        }
        class364 var9 = class233.field2904[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class233.field2904[var10] = class233.field2904[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class364(arg2, arg3, arg8, arg5, arg0, arg6, arg4, arg1);
        } else {
            var9.method2000(arg6, arg1, arg8, arg5, arg2, arg3, arg4, false, arg0);
        }
        class612.field8581++;
        class39.field525 = class450.field5767;
        class233.field2904[0] = var9;
    }

    @OriginalMember(owner = "client!at", name = "i", descriptor = "(I)V")
    public static void method3233(int arg0) {
        if (arg0 != 27843) {
            method3232(null, null, -24, 82, -42, null, null, (byte) -28, null);
        }
        field8255 = null;
        field8254 = null;
        field8253 = null;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method174(int arg0) {
        if (arg0 == -9023) {
            field8247++;
            return this.field8251;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!at", name = "f", descriptor = "(B)V")
    public static final void method3234(byte arg0) {
        class337.field4338.method1054(((float) class301.field3698.field6649 * 0.1F + 0.7F) * class406.field5079);
        field8246++;
        class337.field4338.method994(class184.field2339, class30.field431, class462.field5894, (float) (class323.field4133 << 2), (float) (class389.field4909 << 2), (float) (class272.field3442 << 2));
        class337.field4338.method980(class395.field4968);
        if (arg0 != -38) {
            method3236(-31, -98, 74, null);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IB)Z")
    public static final boolean method3235(int arg0, byte arg1) {
        if (arg1 >= -77) {
            return false;
        } else {
            field8249++;
            return arg0 == 3 || arg0 == 4;
        }
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lgj;Ljava/lang/Object;I)V")
    public class587(class96 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field8251 = arg1;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIILdfa;)V")
    public static final void method3236(int arg0, int arg1, int arg2, class391 arg3) {
        class75 var4 = class128.method683(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field1031 = arg3;
        int var5 = class699.field9887 == class491.field6485 ? 1 : 0;
        if (arg3.method68((byte) 115)) {
            if (arg3.method83((byte) 23)) {
                class337.field4341[var5][class173.field2256[var5]++] = arg3;
                return;
            }
            class102.field1375[var5][class593.field8335[var5]++] = arg3;
            return;
        }
        class252.field3090[var5][class469.field5960[var5]++] = arg3;
    }
}
