import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class82 {

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lcd;")
    public static class23 field1776 = class54.method414("<)4col> x", -1);

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field1780 = 0;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lgd;")
    public static class58 field1779;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)Lda;")
    public static final class29 method553(byte arg0, int arg1) {
        field1781++;
        class29 var2 = (class29) class162.field3248.method995(arg0 + 115, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 6) {
            method557(105, null, 39, -116, 49, 116, -81, 10);
        }
        byte[] var3 = class181.field3581.method651(4, arg1, 13);
        class29 var4 = new class29();
        var4.field633 = arg1;
        if (var3 != null) {
            var4.method220(new class189(var3), arg0 ^ 0xFFFFFFF9);
        }
        class162.field3248.method990(var4, (long) arg1, -119);
        return var4;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)I")
    public static final int method554(int arg0, int arg1, int arg2, int arg3) {
        field1775++;
        return arg0 == 4096 ? (4096 - arg2) * arg3 + arg1 * arg2 >> 12 : -43;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method555(int arg0) {
        field1776 = null;
        field1779 = null;
        if (arg0 != -10173) {
            field1776 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)Z")
    public static final boolean method556(int arg0, byte arg1) {
        field1777++;
        if (class129.field2678[arg0]) {
            return true;
        } else if (class107.field2289.method655(0, arg0)) {
            int var2 = class107.field2289.method660(arg1 ^ 0x7C, arg0);
            if (var2 == 0) {
                class129.field2678[arg0] = true;
                return true;
            }
            if (class100.field2114[arg0] == null) {
                class100.field2114[arg0] = new class47[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class100.field2114[arg0][var3] == null) {
                    byte[] var4 = class107.field2289.method651(4, var3, arg0);
                    if (var4 != null) {
                        class100.field2114[arg0][var3] = new class47();
                        class100.field2114[arg0][var3].field1071 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class100.field2114[arg0][var3].method366(11869, new class189(var4));
                        } else {
                            class100.field2114[arg0][var3].method376((byte) -37, new class189(var4));
                        }
                    }
                }
            }
            if (arg1 != -7) {
                field1779 = null;
            }
            class129.field2678[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILfa;IIIIII)V")
    public static final void method557(int arg0, class47 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class50.field1191) {
            class139.field2872 = 32;
        } else {
            class139.field2872 = 0;
        }
        field1778++;
        class50.field1191 = false;
        if (class105.field2277 != 0) {
            if (arg5 <= arg2 && arg5 + 16 > arg2 && arg6 <= arg0 && arg6 + 16 > arg0) {
                arg1.field1065 -= 4;
                class3.method12(arg1, false);
            } else if (arg5 <= arg2 && arg5 + 16 > arg2 && arg0 >= arg7 + arg6 - 16 && arg0 < arg6 + arg7) {
                arg1.field1065 += 4;
                class3.method12(arg1, false);
            } else if (arg2 >= arg5 - class139.field2872 && arg2 < class139.field2872 + arg5 + 16 && arg0 >= arg6 + 16 && arg0 < arg6 + arg7 - 16) {
                int var8 = (arg7 - 32) * arg7 / arg4;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg7 - var8 - 32;
                int var10 = arg0 - var8 / 2 - arg6 - 16;
                arg1.field1065 = (arg4 - arg7) * var10 / var9;
                class3.method12(arg1, false);
                class50.field1191 = true;
            }
        }
        if (arg3 != 16 || class89.field1925 == 0) {
            return;
        }
        int var11 = arg1.field1125;
        if (arg2 >= arg5 - var11 && arg0 >= arg6 && arg5 + 16 > arg2 && arg0 <= arg6 + arg7) {
            arg1.field1065 += class89.field1925 * 45;
            class3.method12(arg1, false);
            return;
        }
    }
}
