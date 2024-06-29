import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class249 extends class81 {

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public int field4331 = 0;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "[I")
    public static int[] field4324 = new int[100];

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "[B")
    public static byte[] field4330 = new byte[520];

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
    public int field4309;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public int field4313;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public int field4315;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public int field4316;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public int field4317;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public int field4318;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
    public int field4319;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public int field4322;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public int field4326;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    public int field4334;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "Lhi;")
    public class210 field4310;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "Ljh;")
    public class271 field4329;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "Lbe;")
    public class28 field4321;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "Lud;")
    public class2 field4333;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "Lud;")
    public class2 field4335;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "Z")
    public boolean field4323;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "[I")
    public int[] field4314;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "[[[I")
    public static int[][][] field4332;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
    public static final void method1701(int arg0) {
        class131.field2298.method934((byte) 62);
        class68.field1332.method934((byte) 62);
        if (arg0 > -24) {
            method1701(-88);
        }
        field4325++;
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V")
    public final void method1702(int arg0) {
        int var2 = this.field4316;
        field4327++;
        if (this.field4321 != null) {
            class28 var3 = this.field4321.method262(true);
            if (var3 == null) {
                this.field4319 = 0;
                this.field4317 = 0;
                this.field4314 = null;
                this.field4334 = 0;
                this.field4316 = -1;
            } else {
                this.field4316 = var3.field550;
                this.field4319 = var3.field498;
                this.field4314 = var3.field496;
                this.field4334 = var3.field505;
                this.field4317 = var3.field526 * 128;
            }
        } else if (this.field4310 != null) {
            int var4 = class268.method1785(this.field4310, -1);
            if (var2 != var4) {
                this.field4316 = var4;
                class231 var5 = this.field4310.field3586;
                if (var5.field3991 != null) {
                    var5 = var5.method1530(-1);
                }
                if (var5 == null) {
                    this.field4317 = 0;
                } else {
                    this.field4317 = var5.field3986 * 128;
                }
            }
        } else if (this.field4329 != null) {
            this.field4316 = class28.method248(this.field4329, -99);
            this.field4317 = this.field4329.field4632 * 128;
        }
        if (arg0 < 89) {
            field4311 = 86;
        }
        if (this.field4316 != var2 && this.field4333 != null) {
            class74.field1424.method583(this.field4333);
            this.field4333 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILfa;B)[Lgk;")
    public static final class154[] method1703(int arg0, int arg1, class239 arg2, byte arg3) {
        if (arg3 != 28) {
            method1701(81);
        }
        field4312++;
        return class123.method883(arg0, arg1, -1, arg2) ? class82.method636(arg3 ^ 0xC3C5E123) : null;
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V")
    public static void method1704(int arg0) {
        field4332 = null;
        field4330 = null;
        if (arg0 == -24568) {
            field4324 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
    public static final void method1705(byte arg0) {
        int var1 = 0;
        if (arg0 != -61) {
            method1704(-81);
        }
        while (class89.field1636 > var1) {
            int var2 = class263.field4498[var1];
            class210 var3 = class232.field4022[var2];
            if (var3 != null) {
                class256.method1728(var3.field3586.field3989, var3, (byte) 103);
            }
            var1++;
        }
        field4328++;
    }
}
