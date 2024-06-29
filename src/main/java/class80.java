import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class80 extends class134 {

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public int field1215 = 0;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field1212 = 0;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field1213 = 0;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "Lnf;")
    public static class162 field1226 = new class162(5);

    @OriginalMember(owner = "client!te", name = "M", descriptor = "[Lai;")
    public static class89[] field1236 = new class89[4];

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public int field1216;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public int field1221;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public int field1222;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public int field1224;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public int field1225;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!te", name = "H", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!te", name = "I", descriptor = "I")
    public int field1232;

    @OriginalMember(owner = "client!te", name = "J", descriptor = "I")
    public int field1233;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "Lvj;")
    public class119 field1219;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "Lvj;")
    public class119 field1220;

    @OriginalMember(owner = "client!te", name = "K", descriptor = "Lfh;")
    public class136 field1234;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "Lgk;")
    public class161 field1218;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "Lah;")
    public class295 field1230;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "Z")
    public boolean field1217;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "[I")
    public int[] field1214;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLcc;)V")
    public static final void method628(byte arg0, class222 arg1) {
        if (class182.field2874 == arg1.field3467) {
            class247.field3933[arg1.field3492] = true;
        }
        if (arg0 <= -63) {
            field1227++;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Z)V")
    public final void method629(boolean arg0) {
        if (arg0) {
            this.field1235 = -44;
        }
        int var2 = this.field1231;
        field1229++;
        if (this.field1230 != null) {
            class295 var3 = this.field1230.method1956(25748);
            if (var3 == null) {
                this.field1228 = 0;
                this.field1225 = 0;
                this.field1235 = 0;
                this.field1214 = null;
                this.field1232 = 0;
                this.field1231 = -1;
            } else {
                this.field1232 = var3.field4610;
                this.field1225 = var3.field4643 * 128;
                this.field1235 = var3.field4575;
                this.field1214 = var3.field4601;
                this.field1228 = var3.field4583;
                this.field1231 = var3.field4590;
            }
        } else if (this.field1218 != null) {
            int var4 = class298.method2002(this.field1218, (byte) 99);
            if (var2 != var4) {
                this.field1231 = var4;
                class95 var5 = this.field1218.field2421;
                if (var5.field1547 != null) {
                    var5 = var5.method741(94);
                }
                if (var5 == null) {
                    this.field1232 = this.field1225 = 0;
                } else {
                    this.field1232 = var5.field1493;
                    this.field1225 = var5.field1541 * 128;
                }
            }
        } else if (this.field1234 != null) {
            this.field1231 = class91.method691(21272, this.field1234);
            this.field1225 = this.field1234.field2031 * 128;
            this.field1232 = this.field1234.field2041;
        }
        if (this.field1231 != var2 && this.field1220 != null) {
            class83.field1251.method243(this.field1220);
            this.field1220 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)Lfg;")
    public static final class12 method630(byte arg0, int arg1) {
        field1223++;
        class12 var2 = (class12) class213.field3271.method1173((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class180.field2818.method721((byte) -117, arg1, 0);
        if (arg0 != 115) {
            field1236 = null;
        }
        class12 var4 = new class12(var3);
        var4.method1787(class54.field863, (int[]) null);
        class213.field3271.method1167((byte) -25, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
    public static void method631(boolean arg0) {
        field1226 = null;
        if (arg0) {
            field1236 = null;
        }
    }
}
