import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class37 extends class109 {

    @OriginalMember(owner = "client!df", name = "E", descriptor = "Z")
    public boolean field825;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "[Ldf;")
    public class37[] field819;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "Ldd;")
    private static class35 field808 = class180.method1196((byte) -5, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!df", name = "p", descriptor = "[I")
    public static int[] field810 = new int[5];

    @OriginalMember(owner = "client!df", name = "B", descriptor = "Ldd;")
    public static class35 field822 = class180.method1196((byte) 127, "Spiel)2Engine wird gestartet)3)3)3");

    @OriginalMember(owner = "client!df", name = "x", descriptor = "Ldd;")
    private static class35 field818 = class180.method1196((byte) 127, "M");

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static volatile int field809 = 0;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "Ldd;")
    public static class35 field823 = field818;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "Z")
    public static boolean field826 = false;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public static int field830 = 0;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "Ldd;")
    public static class35 field829 = field808;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "Ldd;")
    public static class35 field833 = field818;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public int field820;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!df", name = "N", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "Lsh;")
    public class178 field816;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "Lii;")
    public class88 field832;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)I")
    public int method366(byte arg0) {
        field814++;
        return arg0 == 76 ? -1 : 100;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[[I")
    public int[][] method14(int arg0, int arg1) {
        if (arg1 <= 5) {
            return null;
        } else {
            field811++;
            throw new IllegalStateException("This operation does not have a colour output");
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)I")
    public int method367(byte arg0) {
        field827++;
        int var2 = 33 / ((arg0 - 4) / 49);
        return -1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)[I")
    public int[] method7(byte arg0, int arg1) {
        if (arg0 == 75) {
            field813++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Z)V")
    public void method11(boolean arg0) {
        if (arg0) {
            method373(-21);
        }
        field834++;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    public final void method368(int arg0) {
        if (arg0 != 3) {
            this.method11(true);
        }
        if (this.field825) {
            this.field816.method1186(104);
            this.field816 = null;
        } else {
            this.field832.method649(0);
            this.field832 = null;
        }
        field835++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IILce;)V")
    public void method1(int arg0, int arg1, class26 arg2) {
        field821++;
        if (arg1 != 1) {
            field833 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIB)[I")
    public final int[] method369(int arg0, int arg1, byte arg2) {
        if (arg2 < 121) {
            this.method368(-12);
        }
        field824++;
        return this.field819[arg0].field825 ? this.field819[arg0].method7((byte) 75, arg1) : this.field819[arg0].method14(arg1, 56)[0];
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)[[I")
    public final int[][] method370(int arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            return null;
        }
        field812++;
        if (this.field819[arg1].field825) {
            int[] var4 = this.field819[arg1].method7((byte) 75, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field819[arg1].method14(arg0, 87);
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(B)V")
    public static final void method371(byte arg0) {
        field831++;
        try {
            if (arg0 > -12) {
                field808 = null;
            }
            if (class54.field1204 == 1) {
                int var1 = class83.field1920.method1128(-9028);
                if (var1 > 0 && class83.field1920.method1153((byte) -85)) {
                    int var2 = var1 - class56.field1392;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class83.field1920.method1140(117, var2);
                } else {
                    class83.field1920.method1150(8342426);
                    class83.field1920.method1143((byte) -70);
                    class107.field2395 = null;
                    if (class127.field2757 == null) {
                        class54.field1204 = 0;
                    } else {
                        class54.field1204 = 2;
                    }
                    class96.field2120 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class83.field1920.method1150(8342426);
            class54.field1204 = 0;
            class96.field2120 = null;
            class107.field2395 = null;
            class127.field2757 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(III)V")
    public final void method372(int arg0, int arg1, int arg2) {
        int var4 = -67 % ((arg1 - 74) / 51);
        field817++;
        int var5 = this.field828 == 255 ? arg2 : this.field828;
        if (this.field825) {
            this.field816 = new class178(var5, arg2, arg0);
        } else {
            this.field832 = new class88(var5, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IZ)V")
    public class37(int arg0, boolean arg1) {
        this.field825 = arg1;
        this.field819 = new class37[arg0];
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
    public static void method373(int arg0) {
        field829 = null;
        field808 = null;
        if (arg0 != 18831) {
            method371((byte) 96);
        }
        field822 = null;
        field810 = null;
        field823 = null;
        field833 = null;
        field818 = null;
    }
}
