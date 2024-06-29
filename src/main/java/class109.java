import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class109 extends class382 {

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "I")
    public static int field1310 = class378.method2374((byte) 112, 1600);

    @OriginalMember(owner = "client!rv", name = "w", descriptor = "F")
    public static float field1321;

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
    public static int field1311;

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "I")
    public int field1315;

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "I")
    public int field1318;

    @OriginalMember(owner = "client!rv", name = "u", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "client!rv", name = "v", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!rv", name = "x", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!rv", name = "y", descriptor = "J")
    public long field1323;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "()V", line = 9)
    public static final void method771() {
        for (int var0 = 0; var0 < class682.field9362.length; var0++) {
            class682.field9362[var0].method595();
        }
        class682.field9362 = null;
    }

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)I", line = 22)
    public final int method772(int arg0) {
        field1312++;
        return arg0 == -5 ? this.field1318 : -71;
    }

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)J", line = 33)
    public final long method773(int arg0) {
        if (arg0 <= 75) {
            return -25L;
        } else {
            field1313++;
            return this.field1323;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIII)I", line = 54)
    public static final int method774(int arg0, int arg1, int arg2, int arg3) {
        field1311++;
        if (class725.field10122 < 100) {
            return -2;
        } else if (arg3 == 0) {
            int var4 = -2;
            int var5 = Integer.MAX_VALUE;
            int var6 = arg2 - class678.field9294;
            int var7 = arg1 - class678.field9304;
            for (class507 var8 = (class507) class678.field9278.method2765(arg3 ^ 0xFFFFD01B); var8 != null; var8 = (class507) class678.field9278.method2759(-15361)) {
                if (var8.field7257 == arg0) {
                    int var9 = var8.field7263;
                    int var10 = var8.field7262;
                    int var11 = class678.field9304 + var10 | class678.field9294 + var9 << 14;
                    int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                    if (var4 < 0 || var5 > var12) {
                        var5 = var12;
                        var4 = var11;
                    }
                }
            }
            return var4;
        } else {
            return -44;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lha;Ljb;I)V", line = 102)
    public static final void method775(class58 arg0, class493 arg1, int arg2) {
        field1320++;
        if (arg2 > -108) {
            method777(-28, -5, (byte) 58);
        }
        boolean var3 = class682.field9361.method3414(arg0, arg1.field7039 | 0xFF000000, arg1.field6959, arg1.field6951, arg1.field6970 ? class660.field9039.field3983 : null, (byte) -100, arg1.field7057, arg1.field6952) == null;
        if (var3) {
            class591.field8332.method2770((byte) -13, new class712(arg1.field6952, arg1.field7057, arg1.field6951, arg1.field7039 | 0xFF000000, arg1.field6959, arg1.field6970));
            class543.method3149(arg1, 1);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)I", line = 124)
    public final int method776(int arg0) {
        if (arg0 > -111) {
            this.method779((byte) -97);
        }
        field1324++;
        return this.field1316;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIB)Z", line = 136)
    public static final boolean method777(int arg0, int arg1, byte arg2) {
        if (arg2 != -6) {
            field1310 = -107;
        }
        field1317++;
        return class686.method3837(arg0, arg1, 30743) | (arg1 & 0x60000) != 0 || class129.method862(4285, arg1, arg0) || class117.method820(5, arg0, arg1);
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)I", line = 148)
    public final int method778(int arg0) {
        if (arg0 == 0) {
            field1314++;
            return this.field1315;
        } else {
            return -67;
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)I", line = 163)
    public final int method779(byte arg0) {
        field1322++;
        int var2 = 84 / ((-arg0 - 14) / 60);
        return this.field1319;
    }
}
