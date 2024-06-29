import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class31 {

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field460 = 0;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "[I")
    public static int[] field462 = new int[2500];

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Lhc;")
    public static class235 field459;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Ljb;")
    public static class276 field457;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)Lre;")
    public static final class228 method239(int arg0, int arg1, int arg2) {
        field458++;
        class228 var3 = class84.method596((byte) 35, arg2);
        if (arg0 == arg1) {
            return var3;
        } else if (var3 == null || var3.field3498 == null || var3.field3498.length <= arg0) {
            return null;
        } else {
            return var3.field3498[arg0];
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILwd;)V")
    public static final void method240(int arg0, class23 arg1) {
        arg1.field324 = false;
        field463++;
        if (arg1.field322 != null) {
            arg1.field322.field515 = 0;
        }
        if (arg0 == 0) {
            for (class23 var2 = arg1.method33(); var2 != null; var2 = arg1.method45()) {
                method240(0, var2);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static void method241(byte arg0) {
        if (arg0 == 30) {
            field457 = null;
            field462 = null;
            field459 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIB)I")
    public static final int method242(int arg0, int arg1, byte arg2) {
        field467++;
        int var3 = 105 / ((29 - arg2) / 45);
        int var4 = arg0 >>> 31;
        return (arg0 + var4) / arg1 - var4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lsd;ZII)V")
    public static final void method243(class45 arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            method240(70, (class23) null);
        }
        if (arg0.field2214 == arg3 && arg3 != -1) {
            class30 var4 = class148.method996(-112, arg3);
            int var5 = var4.field450;
            if (var5 == 1) {
                arg0.field2199 = 0;
                arg0.field2239 = arg2;
                arg0.field2296 = 1;
                arg0.field2220 = 0;
                arg0.field2288 = 0;
                class52.method390(false, var4, arg0.field2199, 122, arg0.field2278, arg0.field2240);
            }
            if (var5 == 2) {
                arg0.field2220 = 0;
            }
        } else if (arg3 == -1 || arg0.field2214 == -1 || class148.method996(-54, arg3).field440 >= class148.method996(-103, arg0.field2214).field440) {
            arg0.field2220 = 0;
            arg0.field2239 = arg2;
            arg0.field2296 = 1;
            arg0.field2288 = 0;
            arg0.field2214 = arg3;
            arg0.field2199 = 0;
            arg0.field2281 = arg0.field2263;
            if (arg0.field2214 != -1) {
                class52.method390(false, class148.method996(-102, arg0.field2214), arg0.field2199, 119, arg0.field2278, arg0.field2240);
            }
        }
        field465++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIIILma;I)Z")
    public static final boolean method244(int arg0, byte arg1, int arg2, int arg3, int arg4, class193 arg5, int arg6) {
        class203 var7 = class277.method1872(true, arg5.field3032);
        field464++;
        if (var7.field3168 == -1) {
            return true;
        }
        int var8;
        if (arg5.field2989) {
            int var9 = arg5.field3009 + arg4;
            var8 = var9 & 0x3;
        } else {
            var8 = 0;
        }
        class290 var10 = var7.method1367(var8, arg5.field3043, false);
        if (var10 == null) {
            return false;
        }
        int var11 = arg5.field3063;
        if (arg1 != -67) {
            return false;
        }
        int var12 = arg5.field3028;
        int var13 = var10.field2981;
        if ((var8 & 0x1) == 1) {
            var12 = arg5.field3063;
            var11 = arg5.field3028;
        }
        int var14 = var10.field2980;
        if (var7.field3175) {
            var14 = var12 * 4;
            var13 = var11 * 4;
        }
        if (var7.field3174 == 0) {
            var10.method1942(arg2 * 4 + 48, (-arg0 + 104 + -var12) * 4 + 48, var13, var14);
        } else {
            var10.method1939(arg2 * 4 + 48, (104 - (arg0 + var12)) * 4 + 48, var13, var14, var7.field3174);
        }
        return true;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lai;I)V")
    public static final void method245(class88 arg0, int arg1) {
        field466++;
        int var2 = arg0.method666(false);
        class58.field953 = new class146[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class58.field953[var3] = new class146();
            class58.field953[var3].field2324 = arg0.method666(false);
            class58.field953[var3].field2320 = arg0.method637(false);
        }
        class65.field1085 = arg0.method666(false);
        class52.field770 = arg0.method666(false);
        class265.field4229 = arg0.method666(false);
        class136.field2103 = new class284[class52.field770 + 1 - class65.field1085];
        for (int var4 = 0; var4 < class265.field4229; var4++) {
            int var6 = arg0.method666(false);
            class284 var7 = class136.field2103[var6] = new class284();
            var7.field654 = arg0.method633(57);
            var7.field652 = arg0.method641(-1);
            var7.field4508 = class65.field1085 + var6;
            var7.field4507 = arg0.method637(false);
            var7.field4500 = arg0.method637(false);
        }
        int var5 = -20 % ((43 - arg1) / 44);
        class57.field948 = arg0.method641(-1);
        class40.field572 = true;
    }
}
