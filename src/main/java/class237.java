import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class237 extends class321 {

    @OriginalMember(owner = "client!us", name = "D", descriptor = "J")
    public static long field4093 = -1L;

    @OriginalMember(owner = "client!us", name = "E", descriptor = "Llo;")
    public static class306 field4094 = new class306("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!us", name = "J", descriptor = "Llo;")
    public static class306 field4099 = new class306("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!us", name = "A", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!us", name = "B", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!us", name = "C", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!us", name = "F", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!us", name = "H", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!us", name = "I", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!us", name = "G", descriptor = "[B")
    private byte[] field4096;

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V", line = 6)
    public class237() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(IIII)[B", line = 9)
    public final byte[] method1624(int arg0, int arg1, int arg2, int arg3) {
        this.field4096 = new byte[arg1 * arg3 * arg0 * 2];
        field4097++;
        if (arg2 != -6441) {
            method1627(6);
        }
        this.method2024(arg0, -124, arg1, arg3);
        return this.field4096;
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(I)[Lvv;", line = 22)
    public static final class313[] method1625(int arg0) {
        if (arg0 >= -30) {
            method1625(-67);
        }
        field4095++;
        class313[] var10000 = new class313[] { class81.field1440, class106.field1896, class216.field3758, class302.field4846, class153.field2494, class216.field3767, class395.field6044, class392.field6003, class65.field972, class338.field5300, class315.field4952, class23.field279, class220.field3805, class256.field4327, class505.field7358, class235.field4080, class42.field687, class30.field479, class53.field859, class318.field4999, class319.field5012, class394.field6028, class23.field312, class71.field1238, class489.field7155, class120.field2116, class222.field3812, class136.field2296, class507.field7381, class190.field2962, class293.field4743, class432.field6463, class84.field1464, class4.field34, class93.field1554, class83.field1453, class83.field1454, class70.field1204, class224.field3863, class154.field2508, class188.field2945, class416.field6308, class2.field14, class131.field2247, class430.field6446, class442.field6591, class494.field7221, class88.field1481, class172.field2751, class389.field5972, class236.field4081, class450.field6707, class435.field6497, class235.field4079, class222.field3834, class441.field6574, class426.field6403, class243.field4169, class191.field2966, class250.field4265, class68.field993, class366.field5689, class128.field2206, class192.field2989, class426.field6407, class530.field7794, class439.field6558, class75.field1283, class117.field2085, class32.field514, class457.field6803, class189.field2955, class212.field3371, class131.field2243, class121.field2130, class502.field7329, class348.field5460, class271.field4507, class150.field2405, class422.field6378, class45.field739, class18.field202, class415.field6305, class403.field6124, class497.field7299, class77.field1349, class392.field6006, class511.field7484, class530.field7793, class45.field732, class359.field5590, class309.field4911, class153.field2484, class436.field6512, class359.field5584, class90.field1494, class134.field2279, class208.field3293, class178.field2823, class220.field3800, class156.field2534, class240.field4129, class216.field3766, class465.field6892, class405.field6152, class466.field6925, class505.field7353, class180.field2852, class77.field1352, class356.field5546, class439.field6565, class206.field3261, class397.field6076 };
        if (class93.field1559) {
        }
        return var10000;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIB)V", line = 34)
    public final void method1626(int arg0, int arg1, byte arg2) {
        if (arg0 != 6448) {
            this.method1624(-47, -21, -98, 86);
        }
        field4091++;
        int var4 = arg1 * 2;
        byte var5 = (byte) (((arg2 & 0xFF) >> 1) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field4096[var10001] = var5;
        this.field4096[var6] = var5;
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(I)V", line = 49)
    public static final void method1627(int arg0) {
        if (arg0 != 549) {
            field4094 = null;
        }
        for (class122 var1 = (class122) class305.field4876.method573(24037); var1 != null; var1 = (class122) class305.field4876.method576(14)) {
            var1.method970();
        }
        field4092++;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljava/awt/Component;BZ)Lgo;", line = 80)
    public static final class334 method1628(Component arg0, byte arg1, boolean arg2) {
        field4098++;
        return arg1 == 12 ? new class241(arg0, arg2) : null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(II)I", line = 91)
    public static final int method1629(int arg0, int arg1) {
        field4090++;
        int var2 = 57 / ((-arg1 - 10) / 34);
        int var3 = arg0 >>> 1;
        int var4 = var3 | var3 >>> 1;
        int var5 = var4 | var4 >>> 2;
        int var6 = var5 | var5 >>> 4;
        int var7 = var6 | var6 >>> 8;
        int var8 = var7 | var7 >>> 16;
        return arg0 & ~var8;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)V", line = 108)
    public static void method1630(boolean arg0) {
        field4099 = null;
        field4094 = null;
        if (arg0) {
            method1625(21);
        }
    }
}
