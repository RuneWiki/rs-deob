import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class461 extends class656 {

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "I")
    public int field6312 = 0;

    @OriginalMember(owner = "client!wr", name = "m", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!wr", name = "q", descriptor = "I")
    public int field6306;

    @OriginalMember(owner = "client!wr", name = "r", descriptor = "I")
    public int field6307;

    @OriginalMember(owner = "client!wr", name = "t", descriptor = "I")
    public int field6309;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
    public int field6310;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    public int field6311;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "I")
    public static int field6313;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "I")
    public int field6314;

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "I")
    public int field6315;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "I")
    public int field6318;

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "I")
    public int field6319;

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
    public int field6320;

    @OriginalMember(owner = "client!wr", name = "F", descriptor = "I")
    public int field6321;

    @OriginalMember(owner = "client!wr", name = "H", descriptor = "I")
    public int field6323;

    @OriginalMember(owner = "client!wr", name = "I", descriptor = "I")
    public int field6324;

    @OriginalMember(owner = "client!wr", name = "J", descriptor = "I")
    public int field6325;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "Lqfa;")
    public class100 field6301;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "Lct;")
    public class147 field6300;

    @OriginalMember(owner = "client!wr", name = "M", descriptor = "Lct;")
    public class147 field6328;

    @OriginalMember(owner = "client!wr", name = "s", descriptor = "Lfha;")
    public class383 field6308;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "Lhr;")
    public class527 field6299;

    @OriginalMember(owner = "client!wr", name = "p", descriptor = "Lhr;")
    public class527 field6305;

    @OriginalMember(owner = "client!wr", name = "o", descriptor = "Lfs;")
    public class556 field6304;

    @OriginalMember(owner = "client!wr", name = "G", descriptor = "Loo;")
    public class627 field6322;

    @OriginalMember(owner = "client!wr", name = "L", descriptor = "Loo;")
    public class627 field6327;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "Z")
    public boolean field6298;

    @OriginalMember(owner = "client!wr", name = "n", descriptor = "Z")
    public boolean field6303;

    @OriginalMember(owner = "client!wr", name = "K", descriptor = "Z")
    public boolean field6326;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "[I")
    public int[] field6317;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)I", line = 4)
    public static final int method2620(byte arg0) {
        field6302++;
        byte var1;
        if (class365.field5128 < 96) {
            var1 = 1;
            class656.method3567(1, true);
        } else {
            int var2 = class256.method1556((byte) 63);
            if (var2 <= 100) {
                var1 = 4;
                class660.method3578((byte) -95);
            } else if (var2 <= 500) {
                class588.method3212(0);
                var1 = 3;
            } else if (var2 > 1000) {
                var1 = 1;
                class656.method3567(1, true);
            } else {
                class615.method3356((byte) -118);
                var1 = 2;
            }
        }
        if (class411.field5711.field3913.method3282(true) != 0) {
            class411.field5711.method1677(class411.field5711.field3877, (byte) -71, 0);
            class421.method2435(false, -110, 0);
        }
        if (arg0 == 62) {
            class2.method15(17458);
            return var1;
        } else {
            return -18;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V", line = 67)
    public final void method2621(int arg0) {
        field6316++;
        int var2 = this.field6307;
        boolean var3 = this.field6326;
        if (this.field6301 != null) {
            class100 var6 = this.field6301.method748(class74.field901, 127);
            if (var6 == null) {
                this.field6298 = false;
                this.field6325 = 0;
                this.field6323 = 256;
                this.field6317 = null;
                this.field6321 = 0;
                this.field6309 = 0;
                this.field6326 = false;
                this.field6310 = 0;
                this.field6315 = 0;
                this.field6318 = 256;
                this.field6307 = -1;
            } else {
                this.field6325 = var6.field1353;
                this.field6307 = var6.field1350;
                this.field6317 = var6.field1304;
                this.field6309 = var6.field1286 << 9;
                this.field6318 = var6.field1308;
                this.field6326 = var6.field1337;
                this.field6315 = var6.field1276;
                this.field6298 = var6.field1362;
                this.field6323 = var6.field1328;
                this.field6321 = var6.field1336;
            }
        } else if (this.field6304 != null) {
            int var4 = class483.method2731(this.field6304, (byte) 116);
            if (var2 != var4) {
                this.field6307 = var4;
                class166 var5 = this.field6304.field7328;
                if (var5.field2575 != null) {
                    var5 = var5.method1190((byte) 121, class74.field901);
                }
                if (var5 == null) {
                    this.field6318 = 256;
                    this.field6325 = this.field6309 = this.field6310 = 0;
                    this.field6323 = 256;
                    this.field6326 = this.field6304.field7328.field2534;
                } else {
                    this.field6318 = var5.field2553;
                    this.field6326 = var5.field2534;
                    this.field6310 = var5.field2526 << 9;
                    this.field6323 = var5.field2536;
                    this.field6309 = var5.field2543 << 9;
                    this.field6325 = var5.field2514;
                }
            }
        } else if (this.field6308 != null) {
            this.field6307 = class416.method2417(this.field6308, (byte) 23);
            this.field6318 = 256;
            this.field6325 = this.field6308.field5350;
            this.field6309 = this.field6308.field5337 << 9;
            this.field6326 = this.field6308.field5354;
            this.field6310 = 0;
            this.field6323 = 256;
        }
        if (arg0 != 256) {
            this.field6327 = null;
        }
        if (this.field6307 == var2 && var3 == this.field6326) {
            return;
        }
        if (this.field6305 == null) {
            return;
        }
        class603.field7927.method1612(this.field6305);
        this.field6305 = null;
        this.field6328 = null;
        this.field6327 = null;
    }

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V", line = 184)
    public static final void method2622(int arg0) {
        if (class453.field6187 != null) {
            class453.field6187.method1794(-127);
        }
        field6313++;
        if (arg0 == -1409991511 && class507.field6770 != null) {
            class507.field6770.method1794(-120);
        }
    }
}
