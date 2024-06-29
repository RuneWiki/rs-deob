import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public abstract class class12 {

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "Llk;")
    public static class638 field74 = new class638(16);

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "Z")
    public static boolean field75 = false;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(III[I)V")
    public abstract void method33(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "([I)V")
    public abstract void method34(int[] arg0);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZI)Z")
    public static final boolean method35(int arg0, boolean arg1, int arg2) {
        field73++;
        if (!class263.field3850) {
            return false;
        }
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class609.field8594[var3] == null || class609.field8594[var3][var4] == null) {
            return false;
        }
        if (!arg1) {
            method35(-107, false, 73);
        }
        class115 var5 = class609.field8594[var3][var4];
        if (arg2 == -1 && var5.field1564 == 0) {
            for (class171 var6 = (class171) class646.field9038.method1041(1048832); var6 != null; var6 = (class171) class646.field9038.method1033(-1)) {
                if (var6.field2174 == 22 || var6.field2174 == 1008 || var6.field2174 == 57 || var6.field2174 == 20 || var6.field2174 == 11) {
                    for (class115 var7 = class384.method2387(!arg1, var6.field2184); var7 != null; var7 = class708.method3991(var7, 2)) {
                        if (var5.field1446 == var7.field1446) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class171 var8 = (class171) class646.field9038.method1041(1048832); var8 != null; var8 = (class171) class646.field9038.method1033(-1)) {
                if (var8.field2181 == arg2 && var5.field1446 == var8.field2184 && (var8.field2174 == 22 || var8.field2174 == 1008 || var8.field2174 == 57 || var8.field2174 == 20 || var8.field2174 == 11)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIILai;I)V")
    public static final void method36(int arg0, int arg1, int arg2, class728 arg3, int arg4) {
        field72++;
        long var5 = (long) (arg4 | arg1 << 14 | arg2 << 28);
        class656 var7 = (class656) class752.field10377.method3669(false, var5);
        if (var7 == null) {
            class656 var8 = new class656();
            class752.field10377.method3666((byte) 65, var5, var8);
            var8.field9258.method1039(arg3, 0);
            return;
        }
        if (arg0 != -18149) {
            field75 = false;
        }
        class581 var9 = class35.field367.method3051((byte) -20, arg3.field10064);
        int var10 = var9.field8201;
        if (var9.field8156 == 1) {
            var10 = (arg3.field10066 + 1) * var10;
        }
        for (class728 var11 = (class728) var7.field9258.method1041(1048832); var11 != null; var11 = (class728) var7.field9258.method1033(-1)) {
            class581 var12 = class35.field367.method3051((byte) -20, var11.field10064);
            int var13 = var12.field8201;
            if (var12.field8156 == 1) {
                var13 = (var11.field10066 + 1) * var13;
            }
            if (var13 < var10) {
                class673.method3836(var11, arg3, arg0 + 18192);
                return;
            }
        }
        var7.field9258.method1039(arg3, 0);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "()Loo;")
    public abstract class12 method37();

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
    public abstract void method38(int arg0);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIIII)V")
    public abstract void method39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)V")
    public abstract void method40(int arg0);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method41(String arg0, byte arg1) {
        if (arg1 >= -46) {
            return -66;
        }
        field71++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class253.method1695(arg0.charAt(var4), -8231) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "()V")
    public abstract void method42();

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(III[I)V")
    public abstract void method43(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V")
    public static void method44(byte arg0) {
        field74 = null;
        if (arg0 != -60) {
            method44((byte) -128);
        }
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V")
    public abstract void method45(int arg0);

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "(I)V")
    public abstract void method46(int arg0);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)V")
    public abstract void method47(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(III[I)V")
    public abstract void method48(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Loo;)V")
    public abstract void method49(class12 arg0);

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(III)V")
    public abstract void method50(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)V")
    public abstract void method51(int arg0);

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "(I)V")
    public abstract void method52(int arg0);
}
