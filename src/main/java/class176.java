import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class176 extends class35 {

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "I")
    public int field2506;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
    public int field2504;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
    public static int field2503 = 0;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "[Z")
    public static boolean[] field2498 = new boolean[200];

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)I", line = 3)
    public final int method1207(byte arg0) {
        int var2 = 50 % ((arg0 + 37) / 62);
        field2502++;
        return class69.method608(this.field2506, true);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)Z", line = 17)
    public final boolean method1208(int arg0, int arg1) {
        if (arg0 == -197495039) {
            field2501++;
            return (this.field2506 >> arg1 + 1 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lak;IIIII)V", line = 30)
    public static final void method1209(class32 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field415 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class275.field4190[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class212 var13 = class78.field1108[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field415; var14++) {
                            if (arg0.field418[var14] == var13) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field418[arg0.field415++] = var13;
                        if (arg0.field415 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field415; var15 < 4; var15++) {
            arg0.field418[var15] = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)Z", line = 97)
    public final boolean method1210(int arg0) {
        if (arg0 != 1) {
            this.method1215(65);
        }
        field2500++;
        return ((this.field2506 & 0x66F8F0) >> 22) != 0;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIB)V", line = 108)
    public static final void method1211(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2499++;
        if (arg4 < 104) {
            field2503 = 97;
        }
        if (arg3 > arg0) {
            class345.method2125(false, class49.field723[arg1], arg0, arg3, arg2);
        } else {
            class345.method2125(false, class49.field723[arg1], arg3, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)I", line = 128)
    public final int method1212(int arg0) {
        field2497++;
        if (arg0 != 16) {
            method1211(89, 58, 39, -70, (byte) 66);
        }
        return this.field2506 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)Z", line = 139)
    public final boolean method1213(byte arg0) {
        if (arg0 >= -62) {
            this.method1208(-34, 74);
        }
        field2507++;
        return (this.field2506 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "(I)V", line = 153)
    public static void method1214(int arg0) {
        field2498 = null;
        if (arg0 != -28198) {
            field2498 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)Z", line = 166)
    public final boolean method1215(int arg0) {
        int var2 = 19 / ((9 - arg0) / 52);
        field2505++;
        return (this.field2506 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(II)V", line = 177)
    public class176(int arg0, int arg1) {
        this.field2506 = arg0;
        this.field2504 = arg1;
    }
}
