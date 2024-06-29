import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class48 extends class56 {

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    private int field838 = 0;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "I")
    private int field843 = -32768;

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    private int field855 = 0;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "Z")
    public boolean field858 = false;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!ej", name = "L", descriptor = "I")
    public int field853;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public int field837;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    public int field851;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    private int field852;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "Lde;")
    private class106 field844;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "Loi;")
    public static class78 field839 = class212.method1456(57);

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "Lve;")
    public static class184 field848 = new class184(500);

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "Ljd;")
    public static class85 field856 = class221.method1499("Lade Titelbild )2 ", (byte) -127);

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "Lpa;")
    public static class204 field857 = new class204(16);

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)Lwb;")
    private final class26 method324(int arg0) {
        if (arg0 != -26965) {
            return null;
        }
        field845++;
        class71 var2 = class87.method647((byte) 77, this.field852);
        class26 var3;
        if (this.field858) {
            var3 = var2.method497(0, -1);
        } else {
            var3 = var2.method497(arg0 ^ 0xFFFF96AB, this.field838);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "()I")
    public final int method6() {
        field850++;
        return this.field843;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(III)V")
    public static final void method325(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class272.field4811; var3++) {
            for (int var4 = 0; var4 < class122.field2140; var4++) {
                for (int var5 = 0; var5 < class202.field3521; var5++) {
                    class208 var6 = class99.field1780[var3][var4][var5];
                    if (var6 != null) {
                        class233 var7 = var6.field3656;
                        if (var7 != null && var7.field4040.method378()) {
                            class73.method516(var7.field4040, var3, var4, var5, 1, 1);
                            if (var7.field4025 != null && var7.field4025.method378()) {
                                class73.method516(var7.field4025, var3, var4, var5, 1, 1);
                                var7.field4040.method373(var7.field4025, 0, 0, 0, false);
                                var7.field4025 = var7.field4025.method381(arg0, arg1, arg2);
                            }
                            var7.field4040 = var7.field4040.method381(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3646; var8++) {
                            class213 var10 = var6.field3650[var8];
                            if (var10 != null && var10.field3724.method378()) {
                                class73.method516(var10.field3724, var3, var4, var5, var10.field3737 + 1 - var10.field3731, var10.field3722 - var10.field3729 + 1);
                                var10.field3724 = var10.field3724.method381(arg0, arg1, arg2);
                            }
                        }
                        class93 var9 = var6.field3653;
                        if (var9 != null && var9.field1700.method378()) {
                            class115.method810(var9.field1700, var3, var4, var5);
                            var9.field1700 = var9.field1700.method381(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field846++;
        class26 var11 = this.method324(-26965);
        if (var11 != null) {
            var11.method1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field843 = var11.method6();
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BLjd;)I")
    public static final int method326(byte arg0, class85 arg1) {
        field842++;
        if (arg0 >= -113) {
            return 123;
        }
        for (int var2 = 0; var2 < class251.field4311.length; var2++) {
            if (class251.field4311[var2].method582(arg1, -59)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lge;I)V")
    public static final void method327(class68 arg0, int arg1) {
        if (arg1 == 500) {
            class73.field1373 = arg0;
            field841++;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(IZ)V")
    public final void method328(int arg0, boolean arg1) {
        field854++;
        if (this.field858) {
            return;
        }
        if (arg1) {
            this.field853 = -42;
        }
        this.field855 += arg0;
        while (this.field844.field1863[this.field838] < this.field855) {
            this.field855 -= this.field844.field1863[this.field838];
            this.field838++;
            if (this.field838 >= this.field844.field1857.length) {
                this.field858 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(IIIIIII)V")
    public class48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field840 = arg4;
        this.field853 = arg5 + arg6;
        this.field837 = arg1;
        this.field851 = arg3;
        this.field847 = arg2;
        this.field852 = arg0;
        int var8 = class87.method647((byte) 91, this.field852).field1329;
        if (var8 == -1) {
            this.field858 = true;
        } else {
            this.field858 = false;
            this.field844 = class101.method704(1, var8);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public static void method329(boolean arg0) {
        field856 = null;
        field839 = null;
        field857 = null;
        field848 = null;
        if (arg0) {
            field839 = null;
        }
    }
}
