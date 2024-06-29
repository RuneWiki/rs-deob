import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class46 {

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    private int field827 = 0;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "[Lki;")
    public class61[] field816;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "Leb;")
    public static class230 field805 = class68.method589(0, "::fps ");

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "Leb;")
    public static class230 field817 = class68.method589(0, "<br>(X");

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "[I")
    public static int[] field809 = new int[500];

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "Leb;")
    public static class230 field826 = class68.method589(0, "lila:");

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Lv;")
    public static class147 field806 = new class147(50);

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "F")
    public static float field813;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "J")
    private long field808;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Lki;")
    private class61 field812;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "Lki;")
    private class61 field823;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIZZIII)V")
    public static final void method387(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg4 < 58) {
            return;
        }
        field821++;
        if (arg0 >= arg5) {
            return;
        }
        int var7 = (arg0 + arg5) / 2;
        int var8 = arg0;
        class23 var9 = class189.field3325[var7];
        class189.field3325[var7] = class189.field3325[arg5];
        class189.field3325[arg5] = var9;
        for (int var10 = arg0; var10 < arg5; var10++) {
            if (class16.method212(arg6, arg3, var9, class189.field3325[var10], arg2, (byte) 116, arg1) <= 0) {
                class23 var11 = class189.field3325[var10];
                class189.field3325[var10] = class189.field3325[var8];
                class189.field3325[var8++] = var11;
            }
        }
        class189.field3325[arg5] = class189.field3325[var8];
        class189.field3325[var8] = var9;
        method387(arg0, arg1, arg2, arg3, 80, var8 - 1, arg6);
        method387(var8 + 1, arg1, arg2, arg3, 127, arg5, arg6);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IJLki;)V")
    public final void method388(int arg0, long arg1, class61 arg2) {
        field807++;
        if (arg2.field1163 != null) {
            arg2.method518(87);
        }
        class61 var5 = this.field816[(int) (arg1 & (long) (this.field819 + arg0))];
        arg2.field1166 = arg1;
        arg2.field1169 = var5;
        arg2.field1163 = var5.field1163;
        arg2.field1163.field1169 = arg2;
        arg2.field1169.field1163 = arg2;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public final void method389(byte arg0) {
        field820++;
        int var2 = -53 % ((-arg0 - 25) / 62);
        for (int var3 = 0; var3 < this.field819; var3++) {
            class61 var4 = this.field816[var3];
            while (true) {
                class61 var5 = var4.field1169;
                if (var4 == var5) {
                    break;
                }
                var5.method518(121);
            }
        }
        this.field812 = null;
        this.field823 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Lki;")
    public final class61 method390(int arg0) {
        field811++;
        if (arg0 != -1) {
            field806 = null;
        }
        if (this.field827 > 0 && this.field816[this.field827 - 1] != this.field823) {
            class61 var2 = this.field823;
            this.field823 = var2.field1169;
            return var2;
        }
        while (this.field827 < this.field819) {
            class61 var3 = this.field816[this.field827++].field1169;
            if (this.field816[this.field827 - 1] != var3) {
                this.field823 = var3.field1169;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public static void method391(int arg0) {
        if (arg0 != 1) {
            method387(-8, -60, false, false, 6, -119, 24);
        }
        field809 = null;
        field826 = null;
        field806 = null;
        field817 = null;
        field805 = null;
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)Lki;")
    public final class61 method392(int arg0) {
        this.field827 = arg0;
        field818++;
        return this.method390(-1);
    }

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)I")
    public final int method393(int arg0) {
        if (arg0 == -1) {
            field822++;
            return this.field819;
        } else {
            return 96;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(JI)Lki;")
    public final class61 method394(long arg0, int arg1) {
        field824++;
        this.field808 = arg0;
        if (arg1 != -21083) {
            field805 = null;
        }
        class61 var4 = this.field816[(int) (arg0 & (long) (this.field819 - 1))];
        for (this.field812 = var4.field1169; this.field812 != var4; this.field812 = this.field812.field1169) {
            if (this.field812.field1166 == arg0) {
                class61 var5 = this.field812;
                this.field812 = this.field812.field1169;
                return var5;
            }
        }
        this.field812 = null;
        return null;
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "(I)I")
    public final int method395(int arg0) {
        int var2 = 0;
        if (arg0 < 82) {
            this.method396(35);
        }
        for (int var3 = 0; var3 < this.field819; var3++) {
            class61 var4 = this.field816[var3];
            for (class61 var5 = var4.field1169; var5 != var4; var5 = var5.field1169) {
                var2++;
            }
        }
        field810++;
        return var2;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(I)V")
    public class46(int arg0) {
        this.field816 = new class61[arg0];
        this.field819 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class61 var3 = this.field816[var2] = new class61();
            var3.field1163 = var3;
            var3.field1169 = var3;
        }
    }

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "(I)Lki;")
    public final class61 method396(int arg0) {
        field815++;
        if (this.field812 == null) {
            return null;
        }
        class61 var2 = this.field816[(int) ((long) (this.field819 - arg0) & this.field808)];
        while (this.field812 != var2) {
            if (this.field812.field1166 == this.field808) {
                class61 var3 = this.field812;
                this.field812 = this.field812.field1169;
                return var3;
            }
            this.field812 = this.field812.field1169;
        }
        this.field812 = null;
        return null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILka;I)V")
    public static final void method397(int arg0, int arg1, class245 arg2, int arg3) {
        field814++;
        if (arg2.field4317 == 0) {
            arg2.field4223 = arg2.field4262;
        } else if (arg2.field4317 == 1) {
            arg2.field4223 = (arg0 - arg2.field4307) / 2 + arg2.field4262;
        } else if (arg2.field4317 == 2) {
            arg2.field4223 = arg0 - arg2.field4307 - arg2.field4262;
        } else if (arg2.field4317 == 3) {
            arg2.field4223 = arg2.field4262 * arg0 >> 14;
        } else if (arg2.field4317 == 4) {
            arg2.field4223 = (arg2.field4262 * arg0 >> 14) + (arg0 - arg2.field4307) / 2;
        } else {
            arg2.field4223 = arg0 - (arg2.field4262 * arg0 >> 14) - arg2.field4307;
        }
        if (arg1 != 500) {
            method387(-40, -75, true, false, 114, -103, 89);
        }
        if (arg2.field4315 == 0) {
            arg2.field4252 = arg2.field4349;
        } else if (arg2.field4315 == 1) {
            arg2.field4252 = (arg3 - arg2.field4325) / 2 + arg2.field4349;
        } else if (arg2.field4315 == 2) {
            arg2.field4252 = arg3 - arg2.field4349 - arg2.field4325;
        } else if (arg2.field4315 == 3) {
            arg2.field4252 = arg2.field4349 * arg3 >> 14;
        } else if (arg2.field4315 == 4) {
            arg2.field4252 = (arg2.field4349 * arg3 >> 14) + (arg3 - arg2.field4325) / 2;
        } else {
            arg2.field4252 = arg3 - arg2.field4325 - (arg2.field4349 * arg3 >> 14);
        }
        if (!class271.field4786 || client.method1167(arg2) == 0 && arg2.field4306 != 0) {
            return;
        }
        if (arg2.field4252 < 0) {
            arg2.field4252 = 0;
        } else if (arg3 < arg2.field4252 + arg2.field4325) {
            arg2.field4252 = arg3 - arg2.field4325;
        }
        if (arg2.field4223 < 0) {
            arg2.field4223 = 0;
        } else if (arg2.field4223 + arg2.field4307 > arg0) {
            arg2.field4223 = arg0 - arg2.field4307;
            return;
        }
    }
}
