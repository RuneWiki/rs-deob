import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class312 implements Runnable {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "[Lfr;")
    public volatile class493[] field4025 = new class493[2];

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Z")
    public volatile boolean field4026 = false;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Z")
    public volatile boolean field4027 = false;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "[I")
    public static int[] field4029 = new int[14];

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field4024 = 503;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lhs;")
    public class441 field4028;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static final void method1859(int arg0) {
        field4030++;
        class211.field2717.method22((byte) -6);
        class89.field1245.method1638((byte) -90);
        class167.field2161.method2325(-1500);
        class52.field715.method1159(83);
        class192.field2495.method1870(0);
        class89.field1238.method115(256);
        class403.field5429.method1961((byte) -102);
        class472.field6897.method1493((byte) -66);
        class301.field3898.method1529(false);
        class251.field3196.method714(-5959);
        class331.field4255.method1883(false);
        class471.field6882.method1561((byte) -46);
        class117.field1643.method1091(arg0 ^ 0x5C74);
        class285.field3637.method1245(false);
        class495.field7242.method1834((byte) 106);
        class264.field3355.method433(29539);
        class261.field3316.method1273(arg0 ^ arg0);
        class96.field1342.method1604(-23);
        class363.field4684.method1101((byte) -71);
        class381.field4967.method2054(false);
        class24.method162(false);
        class301.method1809((byte) 75);
        class489.method2919(true);
        if (class246.field3151 != class222.field2867) {
            for (int var1 = 0; var1 < class258.field3264.length; var1++) {
                class258.field3264[var1] = null;
            }
            class182.field2378 = 0;
        }
        class10.method64((byte) 123);
        class202.method1327(0);
        class195.method1263((byte) 122);
        class375.method2193(arg0 - 5);
        class429.method2538((byte) -107);
        class490.field7165.method90((byte) -27);
        class512.field7538.method892();
        class489.field7136.method671(true);
        class288.method1745((byte) 91);
        class65.field823.method1319(71);
        class120.field1676.method1319(105);
        class523.field7751.method1319(63);
        class257.field3251.method1319(72);
        class135.field1829.method1319(arg0 ^ 0x62);
        class354.field4551.method1319(87);
        class288.field3685.method1319(98);
        class83.field1031.method1319(51);
        class391.field5121.method1319(49);
        class271.field3430.method1319(85);
        class29.field499.method1319(63);
        class6.field53.method1319(arg0 + 57);
        class491.field7174.method1319(51);
        class256.field3245.method1319(117);
        class351.field4485.method1319(arg0 + 78);
        class235.field3059.method1319(94);
        class270.field3423.method1319(105);
        class138.field1848.method1319(109);
        class197.field2545.method1319(69);
        class114.field1565.method1319(96);
        class511.field7533.method1319(arg0 ^ 0x7D);
        class11.field179.method1319(arg0 + 92);
        class9.field93.method1319(83);
        class236.field3075.method1319(109);
        class522.field7745.method1319(119);
        class221.field2851.method1319(102);
        class352.field4500.method1319(84);
        class7.field59.method1319(102);
        class494.field7224.method1319(75);
        class168.field2189.method1319(arg0 + 57);
        class485.field7052.method90((byte) -27);
        class452.field6297.method90((byte) -27);
        class308.field3963.method90((byte) -27);
        class437.field5993.method90((byte) -27);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZI)I")
    public static final int method1860(int arg0, boolean arg1, int arg2) {
        field4023++;
        if (arg1) {
            field4024 = 117;
        }
        return arg0 == 4 || arg0 == 5 ? class385.field5064[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static void method1861(int arg0) {
        int var1 = -52 / ((-arg0 - 46) / 49);
        field4029 = null;
    }

    @OriginalMember(owner = "client!mc", name = "run", descriptor = "()V")
    public final void run() {
        this.field4027 = true;
        field4031++;
        try {
            while (!this.field4026) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class493 var2 = this.field4025[var1];
                    if (var2 != null) {
                        var2.method2947(105);
                    }
                }
                class463.method2773(10L, -6);
                class104.method696(this.field4028, null, -51);
            }
        } catch (Exception var9) {
            class375.method2192((byte) -57, var9, null);
        } finally {
            Object var6 = null;
            this.field4027 = false;
        }
    }
}
