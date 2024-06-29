import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class54 extends class182 {

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
    private int field1078 = -1;

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "[I")
    public static int[] field1074 = new int[100];

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "Lea;")
    public static class227 field1072 = new class227();

    @OriginalMember(owner = "client!fk", name = "V", descriptor = "I")
    public static int field1082 = 0;

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "[Leb;")
    public static class133[] field1079 = new class133[14];

    @OriginalMember(owner = "client!fk", name = "X", descriptor = "I")
    public static int field1084 = 0;

    @OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
    private int field1070;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!fk", name = "M", descriptor = "I")
    private int field1073;

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!fk", name = "W", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "[I")
    private int[] field1076;

    @OriginalMember(owner = "client!fk", name = "U", descriptor = "[[[B")
    public static byte[][][] field1081;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)[[I", line = 7)
    public final int[][] method122(int arg0, int arg1) {
        if (arg1 != 4944) {
            this.method122(39, -122);
        }
        field1080++;
        int[][] var3 = this.field3152.method1953(arg0, 106);
        if (this.field3152.field4493 && this.method467((byte) 108)) {
            int var4 = (class334.field5323 == this.field1073 ? arg0 : this.field1073 * arg0 / class334.field5323) * this.field1070;
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            if (class26.field672 == this.field1070) {
                for (int var11 = 0; var11 < class26.field672; var11++) {
                    int var12 = this.field1076[var4++];
                    var6[var11] = class83.method613(var12 << 4, 4080);
                    var5[var11] = class83.method613(var12, 65280) >> 4;
                    var7[var11] = class83.method613(var12 >> 12, 4080);
                }
            } else {
                for (int var8 = 0; var8 < class26.field672; var8++) {
                    int var9 = this.field1070 * var8 / class26.field672;
                    int var10 = this.field1076[var4 + var9];
                    var6[var8] = class83.method613(255, var10) << 4;
                    var5[var8] = class83.method613(65280, var10) >> 4;
                    var7[var8] = class83.method613(16711680, var10) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Loe;IB)V", line = 77)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            this.field1078 = arg0.method989(75);
        }
        field1071++;
        if (arg2 != 60) {
            this.field1078 = -25;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)Z", line = 91)
    private final boolean method467(byte arg0) {
        field1075++;
        if (this.field1076 != null) {
            return true;
        }
        int var2 = 108 % ((-arg0 - 37) / 43);
        if (this.field1078 < 0) {
            return false;
        }
        int var3 = class334.field5323;
        int var4 = class26.field672;
        int var5 = class253.field4161.method1732(0, this.field1078).field2392 ? 64 : 128;
        this.field1076 = class253.field4161.method1734(1.0F, false, var5, 2, var5, this.field1078);
        this.field1073 = var5;
        this.field1070 = var5;
        class101.method764((byte) -113, var3, var4);
        return this.field1076 != null;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)V", line = 119)
    public static void method468(byte arg0) {
        field1074 = null;
        field1072 = null;
        if (arg0 <= -54) {
            field1079 = null;
            field1081 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)I", line = 135)
    public final int method469(int arg0) {
        if (arg0 <= 69) {
            method468((byte) 115);
        }
        field1069++;
        return this.field1078;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V", line = 146)
    public final void method470(int arg0) {
        super.method470(arg0);
        this.field1076 = null;
        field1077++;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V", line = 161)
    public class54() {
        super(0, false);
    }
}
