import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class308 {

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "[Lfr;")
    private class375[] field4559;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    private int field4558;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lmf;")
    public static class382 field4556 = new class382(128, 4);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "J")
    private long field4560;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lfr;")
    private class375 field4561;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lfr;JB)V", line = 6)
    public final void method1958(class375 arg0, long arg1, byte arg2) {
        field4562++;
        if (arg0.field5349 != null) {
            arg0.method2258((byte) 127);
        }
        class375 var5 = this.field4559[(int) (arg1 & (long) (this.field4558 - 1))];
        arg0.field5347 = var5;
        if (arg2 != -108) {
            method1961(-65, 20, -124, 95, -38, -78, -89);
        }
        arg0.field5349 = var5.field5349;
        arg0.field5349.field5347 = arg0;
        arg0.field5344 = arg1;
        arg0.field5347.field5349 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 29)
    public static void method1959(byte arg0) {
        field4556 = null;
        if (arg0 != 4) {
            method1961(3, 74, -72, -38, 81, -17, 98);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)Lfr;", line = 47)
    public final class375 method1960(byte arg0) {
        field4557++;
        if (this.field4561 == null) {
            return null;
        }
        class375 var2 = this.field4559[(int) (this.field4560 & (long) (this.field4558 - 1))];
        while (this.field4561 != var2) {
            if (this.field4561.field5344 == this.field4560) {
                class375 var3 = this.field4561;
                this.field4561 = this.field4561.field5347;
                return var3;
            }
            this.field4561 = this.field4561.field5347;
        }
        this.field4561 = null;
        if (arg0 != 41) {
            method1961(62, 103, 53, -45, -69, 53, -39);
        }
        return null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIII)V", line = 87)
    public static final void method1961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 4) {
            method1959((byte) -80);
        }
        class68.field1239 = arg2;
        class162.field2326 = arg1;
        field4554++;
        class24.field328 = arg4;
        class66.field1224 = arg6;
        class520.field7324 = arg5;
        class690.field9711 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BJ)Lfr;", line = 104)
    public final class375 method1962(byte arg0, long arg1) {
        if (arg0 != -23) {
            this.field4561 = null;
        }
        field4555++;
        this.field4560 = arg1;
        class375 var4 = this.field4559[(int) (arg1 & (long) (this.field4558 - 1))];
        for (this.field4561 = var4.field5347; this.field4561 != var4; this.field4561 = this.field4561.field5347) {
            if (this.field4561.field5344 == arg1) {
                class375 var5 = this.field4561;
                this.field4561 = this.field4561.field5347;
                return var5;
            }
        }
        this.field4561 = null;
        return null;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(I)V", line = 135)
    public class308(int arg0) {
        this.field4559 = new class375[arg0];
        this.field4558 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class375 var3 = this.field4559[var2] = new class375();
            var3.field5349 = var3;
            var3.field5347 = var3;
        }
    }
}
