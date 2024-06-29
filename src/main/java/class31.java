import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class31 extends class449 {

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "I")
    public int field320 = 0;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public int field314;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
    public int field319;

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "I")
    public int field321;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "I")
    public int field323;

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "I")
    public int field325;

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!mm", name = "D", descriptor = "I")
    public int field327;

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "I")
    public int field328;

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
    public int field329;

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "Llr;")
    public class215 field318;

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "Llr;")
    public class215 field335;

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "Lnm;")
    public class267 field337;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "Lwg;")
    public class361 field317;

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "Lgf;")
    public class39 field333;

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "Lja;")
    public static class411 field332;

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "Lrp;")
    public static class419 field331;

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "Z")
    public boolean field330;

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "[I")
    public int[] field334;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILnl;)I")
    public static final int method196(int arg0, class435 arg1) {
        field324++;
        int var2 = 0;
        if (arg1.method2627((byte) 53, class278.field3997)) {
            var2++;
        }
        if (arg0 != 128) {
            method196(7, (class435) null);
        }
        if (arg1.method2627((byte) 55, class345.field4775)) {
            var2++;
        }
        if (arg1.method2627((byte) 66, class182.field2747)) {
            var2++;
        }
        if (arg1.method2627((byte) 44, class161.field2330)) {
            var2++;
        }
        if (arg1.method2627((byte) 97, class369.field5088)) {
            var2++;
        }
        if (arg1.method2627((byte) 100, class138.field1922)) {
            var2++;
        }
        if (arg1.method2627((byte) 35, class161.field2329)) {
            var2++;
        }
        if (arg1.method2627((byte) 83, class165.field2405)) {
            var2++;
        }
        if (arg1.method2627((byte) 55, class48.field731)) {
            var2++;
        }
        if (arg1.method2627((byte) 66, class4.field34)) {
            var2++;
        }
        if (arg1.method2627((byte) 83, class201.field2973)) {
            var2++;
        }
        if (arg1.method2627((byte) 66, class133.field1865)) {
            var2++;
        }
        if (arg1.method2627((byte) 127, class128.field1755)) {
            var2++;
        }
        if (arg1.method2627((byte) 106, class437.field6217)) {
            var2++;
        }
        if (arg1.method2627((byte) 83, class487.field6895)) {
            var2++;
        }
        if (arg1.method2627((byte) 45, class161.field2333)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)V")
    public static void method197(int arg0) {
        field331 = null;
        field332 = null;
        if (arg0 != 18689) {
            method196(120, (class435) null);
        }
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)V")
    public final void method198(int arg0) {
        field316++;
        int var2 = this.field328;
        if (this.field337 != null) {
            class267 var5 = this.field337.method1799(class416.field5691, (byte) -111);
            if (var5 == null) {
                this.field315 = 0;
                this.field334 = null;
                this.field325 = 0;
                this.field328 = -1;
                this.field321 = 0;
                this.field336 = 0;
            } else {
                this.field325 = var5.field3872 * 128;
                this.field328 = var5.field3906;
                this.field334 = var5.field3886;
                this.field336 = var5.field3875;
                this.field321 = var5.field3914;
                this.field315 = var5.field3892;
            }
        } else if (this.field317 != null) {
            int var3 = class349.method2164(-15368, this.field317);
            if (var2 != var3) {
                this.field328 = var3;
                class37 var4 = this.field317.field4952;
                if (var4.field434 != null) {
                    var4 = var4.method232(class416.field5691, -1);
                }
                if (var4 == null) {
                    this.field321 = this.field325 = 0;
                } else {
                    this.field321 = var4.field466;
                    this.field325 = var4.field410 * 128;
                }
            }
        } else if (this.field333 != null) {
            this.field328 = class77.method677((byte) 101, this.field333);
            this.field321 = this.field333.field521;
            this.field325 = this.field333.field517 * 128;
        }
        if (arg0 > -96) {
            this.field315 = 25;
        }
        if (this.field328 != var2 && this.field335 != null) {
            class332.field4613.method2406(this.field335);
            this.field335 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILwg;)V")
    public static final void method199(int arg0, class361 arg1) {
        field326++;
        if (arg0 < 35) {
            return;
        }
        for (class31 var2 = (class31) class357.field4928.method775(1); var2 != null; var2 = (class31) class357.field4928.method763(0)) {
            if (var2.field317 == arg1) {
                if (var2.field335 != null) {
                    class332.field4613.method2406(var2.field335);
                    var2.field335 = null;
                }
                var2.method2714(-56);
                return;
            }
        }
    }
}
