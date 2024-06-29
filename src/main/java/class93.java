import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class93 {

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "Lao;")
    public static class191 field1115 = new class191(1, -1);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    private int field1111;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public int field1118;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "Lao;")
    public static class191 field1117;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "Lne;")
    public class210 field1114;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLwk;)V", line = 4)
    public static final void method516(byte arg0, class96 arg1) {
        field1112++;
        boolean var2 = false;
        if (class532.field7836 == arg1.field1163 || arg1.field1196 == -1 || arg1.field1152 != 0) {
            var2 = true;
        } else {
            class260 var3 = class7.field97.method2951(arg1.field1196, -13765);
            if (var3.field3470 || arg1.field1197 + 1 > var3.field3489[arg1.field1233]) {
                var2 = true;
            }
        }
        if (arg0 <= 53) {
            field1117 = null;
        }
        if (var2) {
            int var4 = arg1.field1163 - arg1.field1213;
            int var5 = class532.field7836 - arg1.field1213;
            int var6 = arg1.field1215 * 128 + (arg1.method546(24273) * 64);
            int var7 = arg1.field1209 * 128 + arg1.method546(24273) * 64;
            int var8 = arg1.field1219 * 128 + arg1.method546(24273) * 64;
            int var9 = arg1.field1222 * 128 + (arg1.method546(24273) * 64);
            arg1.field3694 = ((var4 - var5) * var7 + (var5 * var9)) / var4;
            arg1.field3704 = ((var4 - var5) * var6 + var5 * var8) / var4;
        }
        arg1.field1256 = 0;
        if (arg1.field1199 == 0) {
            arg1.method553(8192, 113);
        }
        if (arg1.field1199 == 1) {
            arg1.method553(12288, 108);
        }
        if (arg1.field1199 == 2) {
            arg1.method553(0, 127);
        }
        if (arg1.field1199 == 3) {
            arg1.method553(4096, 82);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILug;)V", line = 62)
    public final void method517(int arg0, class396 arg1) {
        field1119++;
        if (arg0 <= 94) {
            this.field1114 = null;
        }
        while (true) {
            int var3 = arg1.method2388((byte) -111);
            if (var3 == 0) {
                return;
            }
            this.method521(arg1, 107, var3);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 84)
    public static void method518(int arg0) {
        if (arg0 != -1) {
            field1115 = null;
        }
        field1117 = null;
        field1115 = null;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)Lev;", line = 96)
    public final synchronized class491 method519(int arg0) {
        field1109++;
        class491 var2 = (class491) this.field1114.field2812.method3032(3589, (long) this.field1111);
        if (var2 != null) {
            return var2;
        }
        class491 var3 = class491.method2969(this.field1114.field2810, this.field1111, arg0);
        if (var3 != null) {
            this.field1114.field2812.method3046((long) this.field1111, var3, 1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(III)Z", line = 116)
    public static final boolean method520(int arg0, int arg1, int arg2) {
        if (arg0 >= -80) {
            method520(-57, -12, -35);
        }
        field1107++;
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lug;II)V", line = 130)
    private final void method521(class396 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field1111 = arg0.method2386(-23648);
        } else if (arg2 == 2) {
            this.field1118 = arg0.method2388((byte) -124);
            this.field1108 = arg0.method2388((byte) -123);
        }
        int var4 = 65 / ((arg1 - 43) / 60);
        field1110++;
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)V", line = 157)
    public static final void method522(int arg0) {
        int var1 = 42 % ((arg0 + 9) / 32);
        class226.field3037.method3034((byte) 101);
        field1113++;
        class320.field4268.method3034((byte) 116);
        class483.field7123.method3034((byte) 113);
        class309.field4140.method3034((byte) 79);
        class531.field7821.method3034((byte) 116);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lkh;II)V", line = 173)
    public static final void method523(class13 arg0, int arg1, int arg2) {
        class420.field6104 = false;
        int var3 = -107 / ((arg1 - 90) / 33);
        class154.field2019 = 0;
        field1116++;
        class380.method2323((byte) -105, arg0);
        class213.method1363((byte) -77, arg0);
        if (class420.field6104) {
            System.out.println("---endgpp---");
        }
        if (arg0.field5729 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg0.field5729 + " psize:" + arg2);
        }
    }
}
