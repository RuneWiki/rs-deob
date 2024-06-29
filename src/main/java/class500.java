import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class500 extends class28 {

    @OriginalMember(owner = "client!oaa", name = "u", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!oaa", name = "w", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!oaa", name = "x", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!oaa", name = "y", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!oaa", name = "z", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!oaa", name = "v", descriptor = "Lbc;")
    private class9 field6563;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Lfd;II)V")
    private final void method2704(class418 arg0, int arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg0.method2396(71);
            if (this.field6563 == null) {
                int var5 = class426.method2447(var4, arg1 + 250);
                this.field6563 = new class9(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method2396(arg1 ^ 0x30) == 1;
                int var8 = arg0.method2364(arg1 ^ 0xFFFFFF90);
                class424 var9;
                if (var7) {
                    var9 = new class181(arg0.method2394(4));
                } else {
                    var9 = new class195(arg0.method2355(88));
                }
                this.field6563.method38(var9, 98, (long) var8);
            }
        }
        field6566++;
        if (arg1 != 0) {
            this.method2704(null, -98, 97);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILfd;)V")
    public final void method2705(int arg0, class418 arg1) {
        field6562++;
        int var3 = -77 % ((58 - arg0) / 57);
        while (true) {
            int var4 = arg1.method2396(-119);
            if (var4 == 0) {
                return;
            }
            this.method2704(arg1, 0, var4);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIIII)V")
    public static final void method2706(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6564++;
        class11 var5 = class421.method2423(2);
        var5.field114.method2352(true, class206.field2658.field6068);
        var5.field114.method2352(true, arg3);
        var5.field114.method2352(true, arg2);
        var5.field114.method2386(arg0, arg1 + 1103587288);
        var5.field114.method2386(arg4, 1103587288);
        class100.method760(var5, -127);
        class66.field906 = 0;
        class291.field3766 = -3;
        class45.field627 = 1;
        class340.field4386 = arg1;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
    public final String method2707(int arg0, String arg1, byte arg2) {
        field6565++;
        if (arg2 > -65) {
            this.method2704(null, -25, 117);
        }
        if (this.field6563 == null) {
            return arg1;
        } else {
            class181 var4 = (class181) this.field6563.method39((long) arg0, 31750);
            return var4 == null ? arg1 : var4.field2232;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IIZ)I")
    public final int method2708(int arg0, int arg1, boolean arg2) {
        field6567++;
        if (this.field6563 == null) {
            return arg0;
        }
        if (arg2) {
            this.field6563 = null;
        }
        class195 var4 = (class195) this.field6563.method39((long) arg1, 31750);
        return var4 == null ? arg0 : var4.field2546;
    }
}
