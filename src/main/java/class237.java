import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class237 extends class213 {

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "[[[Lpk;")
    public static class98[][][] field4090 = new class98[4][104][104];

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public static int field4092 = 0;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public static volatile int field4097 = 0;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "Leb;")
    public static class230 field4100 = null;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "S")
    public static short field4102 = 256;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "[[[I")
    public static int[][][] field4098;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZI)I")
    public static final int method1663(boolean arg0, int arg1) {
        field4095++;
        if (arg1 < 0) {
            return 0;
        }
        class212 var2 = (class212) class75.field1366.method394((long) arg1, -21083);
        if (var2 == null) {
            return class182.method1309(-94, arg1).field2971;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field3685.length; var4++) {
            if (var2.field3685[var4] == -1) {
                var3++;
            }
        }
        int var5 = var3 + class182.method1309(-96, arg1).field2971 - var2.field3685.length;
        if (arg0) {
            field4092 = 21;
        }
        return var5;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Leb;I)V")
    public static final void method1664(class230 arg0, int arg1) {
        field4091++;
        int var2 = class227.method1568(arg0, (byte) -2);
        if (var2 == -1) {
            return;
        }
        class68.field1270 = class124.field2172.field2782[var2] - class72.field1319;
        int var3 = class68.field1270 - ((int) ((float) class6.field87.field4325 / class99.field1830));
        int var4 = -50 / ((arg1 + 71) / 41);
        int var5 = (int) ((float) class6.field87.field4325 / class99.field1830) + class68.field1270;
        class160.field2858 = class178.field3119 + class249.field4417 - class124.field2172.field2780[var2] - 1;
        if (var3 < 0) {
            class68.field1270 = (int) ((float) class6.field87.field4325 / class99.field1830);
        }
        if (var5 > field4094) {
            class68.field1270 = field4094 - ((int) ((float) class6.field87.field4325 / class99.field1830));
        }
        int var6 = class160.field2858 - ((int) ((float) class6.field87.field4307 / class99.field1830));
        int var7 = (int) ((float) class6.field87.field4307 / class99.field1830) + class160.field2858;
        if (var6 < 0) {
            class160.field2858 = (int) ((float) class6.field87.field4307 / class99.field1830);
        }
        if (class249.field4417 < var7) {
            class160.field2858 = class249.field4417 - ((int) ((float) class6.field87.field4307 / class99.field1830));
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
    public static final void method1665(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class197 var5 = class164.method1228(8, arg3, -1665874464);
        field4101++;
        var5.method1402((byte) -102);
        var5.field3527 = arg4;
        var5.field3524 = arg0;
        if (arg2 == 0) {
            var5.field3532 = arg1;
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
    public static void method1666(int arg0) {
        field4098 = null;
        if (arg0 != 0) {
            field4097 = 45;
        }
        field4090 = null;
        field4100 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lsa;")
    public static final class249 method1667(int arg0, int arg1) {
        field4096++;
        class249 var2 = (class249) class102.field1866.method1125((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        int var3 = -91 / ((-arg1 - 67) / 49);
        byte[] var4 = class29.field532.method1546(class23.method249(arg0, (byte) 67), (byte) -100, class62.method526((byte) 82, arg0));
        class249 var5 = new class249();
        if (var4 != null) {
            var5.method1729(103, new class14(var4));
        }
        var5.method1741(-95);
        class102.field1866.method1129((long) arg0, true, var5);
        return var5;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)Z")
    public static final boolean method1668(int arg0, int arg1) {
        if (arg1 <= 24) {
            return false;
        } else {
            field4099++;
            return (arg0 >> 28 & 0x1) != 0;
        }
    }
}
