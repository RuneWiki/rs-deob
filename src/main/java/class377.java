import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class377 {

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "Ltm;")
    public static class334 field5671 = new class334(63, 6);

    @OriginalMember(owner = "client!afa", name = "i", descriptor = "I")
    public static int field5675 = 0;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!afa", name = "h", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!afa", name = "j", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!afa", name = "g", descriptor = "Ltc;")
    public static class73 field5673;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIBIIII)I", line = 5)
    public static final int method2377(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        field5670++;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg0;
            arg0 = var8;
        }
        if (arg2 != -32) {
            field5675 = -29;
        }
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return arg4;
        } else if (var7 == 2) {
            return 7 + 1 - arg1 - arg6;
        } else {
            return 8 - arg0 - arg4;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V", line = 36)
    public static final void method2378(int arg0) {
        if (arg0 != 20000) {
            field5676 = 20;
        }
        class357.field5400 = true;
        field5669++;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZB[B)V", line = 47)
    public static final void method2379(boolean arg0, byte arg1, byte[] arg2) {
        field5668++;
        if (class400.field5943 == null) {
            class400.field5943 = new class301(20000);
        }
        class400.field5943.method1946(1735499792, arg2, 0, arg2.length);
        if (arg1 < 42 || !arg0) {
            return;
        }
        class601.method3450(class400.field5943.field4543, (byte) -115);
        class94.field1406 = new class225[class7.field68];
        int var3 = 0;
        for (int var4 = class27.field275; var4 <= class404.field5993; var4++) {
            class225 var5 = class119.method941(var4, 66);
            if (var5 != null) {
                class94.field1406[var3++] = var5;
            }
        }
        class606.field8565 = false;
        class110.field1717 = class18.method109(-11121);
        class400.field5943 = null;
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)V", line = 89)
    public static void method2380(int arg0) {
        field5671 = null;
        field5673 = null;
        if (arg0 != 1) {
            method2378(77);
        }
    }

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "(I)V", line = 107)
    public static final void method2381(int arg0) {
        field5672++;
        int var1 = 80 / ((81 - arg0) / 37);
        for (class208 var2 = (class208) class344.field5093.method3463((byte) -50); var2 != null; var2 = (class208) class344.field5093.method3469((byte) 107)) {
            if (class455.method2793(0, var2.field3488)) {
                class187.method1423(true, var2);
            }
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lfc;I)[Lhga;", line = 127)
    public static final class300[] method2382(class731 arg0, int arg1) {
        field5667++;
        if (!arg0.method4061(arg1 ^ 0x40F8)) {
            return new class300[0];
        }
        class162 var2 = arg0.method4062(83);
        while (var2.field2512 == 0) {
            class484.method2932(true, 10L);
        }
        if (arg1 != -29631) {
            method2379(false, (byte) -29, null);
        }
        if (var2.field2512 == 2) {
            return new class300[0];
        }
        int[] var3 = (int[]) var2.field2517;
        class300[] var4 = new class300[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class300 var6 = new class300();
            var4[var5] = var6;
            var6.field4523 = var3[var5 << 2];
            var6.field4527 = var3[(var5 << 2) + 1];
            var6.field4526 = var3[(var5 << 2) + 2];
            var6.field4525 = var3[(var5 << 2) + 3];
        }
        return var4;
    }
}
