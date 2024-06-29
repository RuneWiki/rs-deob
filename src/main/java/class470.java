import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class470 {

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
    public int field6145 = 1;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "[S")
    public static short[] field6139 = new short[] { 20, 46, 9, 2, 47, 58, 59, 12 };

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field6144 = 0;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "C")
    public char field6138;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field6146;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLfd;I)V", line = 4)
    private final void method2608(byte arg0, class418 arg1, int arg2) {
        if (arg2 == 1) {
            this.field6138 = class103.method778(12270, arg1.method2387((byte) -63));
        } else if (arg2 == 2) {
            this.field6145 = 0;
        }
        field6143++;
        int var4 = 37 / ((54 - arg0) / 61);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILfd;)V", line = 23)
    public final void method2609(int arg0, class418 arg1) {
        if (arg0 != 0) {
            field6144 = -46;
        }
        while (true) {
            int var3 = arg1.method2396(-117);
            if (var3 == 0) {
                field6142++;
                return;
            }
            this.method2608((byte) 115, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V", line = 43)
    public static final void method2610(int arg0, int arg1) {
        field6140++;
        class367 var2 = class573.method3057(16, arg1, 2);
        var2.method2113(69);
        if (arg0 != -8160) {
            method2612(119);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Liaa;[[BB)V", line = 62)
    public static final void method2611(class99 arg0, byte[][] arg1, byte arg2) {
        for (int var3 = 0; var3 < arg0.field4216; var3++) {
            class424.method2439(26);
            for (int var4 = 0; var4 < class611.field8258 >> 3; var4++) {
                for (int var5 = 0; var5 < class656.field9155 >> 3; var5++) {
                    int var6 = class325.field4211[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg0.field4215 || var7 == 0) {
                            int var8 = (var6 & 0x6) >> 1;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FFB) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class547.field7096.length; var12++) {
                                if (class547.field7096[var12] == var11 && arg1[var12] != null) {
                                    arg0.method740(var5 * 8, var7, (var9 & 0x7) * 8, var8, (var10 & 0x7) * 8, -1, var4 * 8, class703.field9806, arg1[var12], class520.field6799, var3);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field6141++;
        if (arg2 != 83) {
            field6146 = 21;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 138)
    public static void method2612(int arg0) {
        field6139 = null;
        if (arg0 > -127) {
            field6146 = -124;
        }
    }
}
