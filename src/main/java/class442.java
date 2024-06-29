import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class442 {

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "Los;")
    public static class408 field6728 = new class408(1);

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field6734 = 0;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field6730;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field6732;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "([BI)[B", line = 8)
    public final byte[] method2791(byte[] arg0, int arg1) {
        field6731++;
        class6 var3 = new class6(arg0);
        var3.field57 = arg0.length - 4;
        if (arg1 > -3) {
            this.method2792(null, 107, null);
        }
        int var4 = var3.method55(80);
        var3.field57 = 0;
        byte[] var5 = new byte[var4];
        this.method2792(var3, -1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V", line = 28)
    public class442() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lie;I[B)V", line = 32)
    public final void method2792(class6 arg0, int arg1, byte[] arg2) {
        if (arg1 != -1) {
            method2794(null, null, -109);
        }
        field6727++;
        if (arg0.field96[arg0.field57] != 31 || arg0.field96[arg0.field57 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field6732 == null) {
            this.field6732 = new Inflater(true);
        }
        try {
            this.field6732.setInput(arg0.field96, arg0.field57 + 10, arg0.field96.length + -8 + -arg0.field57 + -10);
            this.field6732.inflate(arg2);
        } catch (Exception var4) {
            this.field6732.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field6732.reset();
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V", line = 59)
    public static void method2793(int arg0) {
        if (arg0 != -21325) {
            method2794(null, null, -128);
        }
        field6728 = null;
        field6730 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lfa;Lr;I)V", line = 77)
    public static final void method2794(class214 arg0, class167 arg1, int arg2) {
        field6733++;
        if (class378.field5872 == null) {
            return;
        }
        if (class579.field8251 < 10) {
            if (!class378.field5868.method947((byte) -105, class378.field5872.field5651)) {
                class579.field8251 = class660.field9199.method935(class378.field5872.field5651, -12) / 10;
                return;
            }
            class192.method1529((byte) -96);
            class579.field8251 = 10;
        }
        if (class579.field8251 == 10) {
            class378.field5901 = class378.field5872.field5647 >> 6 << 6;
            class378.field5902 = class378.field5872.field5655 >> 6 << 6;
            class378.field5888 = (class378.field5872.field5648 >> 6 << 6) + 64 - class378.field5902;
            class378.field5905 = (class378.field5872.field5646 >> 6 << 6) + 64 - class378.field5901;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class378.field5872.method2377((class567.field8141.field9696 >> 9) + class612.field8702, var3, (class567.field8141.field9705 >> 9) + class626.field8855, 12800, class567.field8141.field9695)) {
                var5 = var3[2] - class378.field5902;
                var4 = var3[1] - class378.field5901;
            }
            if (!class74.field941 && var4 >= 0 && var4 < class378.field5905 && var5 >= 0 && class378.field5888 > var5) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class528.field7705 = var6;
                class97.field1570 = var7;
            } else if (class353.field5600 == -1 || class313.field4922 == -1) {
                class378.field5872.method2381(true, class378.field5872.field5644 & 0x3FFF, class378.field5872.field5644 >> 14 & 0x3FFF, var3);
                class97.field1570 = var3[2] - class378.field5902;
                class528.field7705 = var3[1] - class378.field5901;
            } else {
                class378.field5872.method2381(true, class313.field4922, class353.field5600, var3);
                if (var3 != null) {
                    class528.field7705 = var3[1] - class378.field5901;
                    class97.field1570 = var3[2] - class378.field5902;
                }
                class313.field4922 = -1;
                class353.field5600 = -1;
                class74.field941 = false;
            }
            if (class378.field5872.field5641 == 37) {
                class378.field5877 = 3.0F;
                class378.field5884 = 3.0F;
            } else if (class378.field5872.field5641 == 50) {
                class378.field5877 = 4.0F;
                class378.field5884 = 4.0F;
            } else if (class378.field5872.field5641 == 75) {
                class378.field5877 = 6.0F;
                class378.field5884 = 6.0F;
            } else if (class378.field5872.field5641 == 100) {
                class378.field5877 = 8.0F;
                class378.field5884 = 8.0F;
            } else if (class378.field5872.field5641 == 200) {
                class378.field5877 = 16.0F;
                class378.field5884 = 16.0F;
            } else {
                class378.field5877 = 8.0F;
                class378.field5884 = 8.0F;
            }
            class378.field5876 = (int) class378.field5877 >> 1;
            class378.field5878 = class417.method2651(-44, class378.field5876);
            class555.method3320(-7733);
            class378.method2476();
            class167.field2803 = new class594();
            class378.field5881 += (int) (Math.random() * 5.0D) - 2;
            if (class378.field5881 < -8) {
                class378.field5881 = -8;
            }
            if (class378.field5881 > 8) {
                class378.field5881 = 8;
            }
            class378.field5879 += (int) (Math.random() * 5.0D) - 2;
            if (class378.field5879 < -16) {
                class378.field5879 = -16;
            }
            if (class378.field5879 > 16) {
                class378.field5879 = 16;
            }
            class378.method2480(arg0, class378.field5881 >> 2 << 10, class378.field5879 >> 1);
            class378.field5873.method3287(9729, 1024, 256);
            class378.field5869.method1888((byte) -106, 256, 256);
            class378.field5874.method97(4096, (byte) 107);
            class585.field8317.method719(256, 97);
            class579.field8251 = 20;
        } else if (class579.field8251 == 20) {
            class645.method3734(true, (byte) 35);
            class378.method2487(arg1, class378.field5881, class378.field5879);
            class579.field8251 = 60;
            class645.method3734(true, (byte) 35);
            class466.method2904((byte) 119);
        } else if (class579.field8251 == arg2) {
            if (class378.field5868.method943(class378.field5872.field5651 + "_staticelements", (byte) -36)) {
                if (!class378.field5868.method947((byte) -89, class378.field5872.field5651 + "_staticelements")) {
                    return;
                }
                class378.field5880 = class74.method744(124, class378.field5868, class378.field5872.field5651 + "_staticelements", class609.field8649);
            } else {
                class378.field5880 = new class595(0);
            }
            class378.method2485();
            class579.field8251 = 70;
            class645.method3734(true, (byte) 35);
            class466.method2904((byte) 70);
        } else if (class579.field8251 == 70) {
            class642.field9031 = new class82(arg1, 11, true, class271.field4377);
            class579.field8251 = 73;
            class645.method3734(true, (byte) 35);
            class466.method2904((byte) 119);
        } else if (class579.field8251 == 73) {
            class238.field3776 = new class82(arg1, 12, true, class271.field4377);
            class579.field8251 = 76;
            class645.method3734(true, (byte) 35);
            class466.method2904((byte) -122);
        } else if (class579.field8251 == 76) {
            class286.field4544 = new class82(arg1, 14, true, class271.field4377);
            class579.field8251 = 79;
            class645.method3734(true, (byte) 35);
            class466.method2904((byte) 123);
        } else if (class579.field8251 == 79) {
            class338.field5492 = new class82(arg1, 17, true, class271.field4377);
            class579.field8251 = 82;
            class645.method3734(true, (byte) 35);
            class466.method2904((byte) -124);
        } else if (class579.field8251 == 82) {
            class294.field4614 = new class82(arg1, 19, true, class271.field4377);
            class579.field8251 = 85;
            class645.method3734(true, (byte) 35);
            class466.method2904((byte) 36);
        } else if (class579.field8251 == 85) {
            class522.field7574 = new class82(arg1, 22, true, class271.field4377);
            class579.field8251 = 88;
            class645.method3734(true, (byte) 35);
            class466.method2904((byte) -96);
        } else if (class579.field8251 == 88) {
            class182.field3063 = new class82(arg1, 26, true, class271.field4377);
            class579.field8251 = 91;
            class645.method3734(true, (byte) 35);
            class466.method2904((byte) -105);
        } else {
            class413.field6346 = new class82(arg1, 30, true, class271.field4377);
            class579.field8251 = 100;
            class645.method3734(true, (byte) 35);
            class466.method2904((byte) 80);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(III)V", line = 312)
    private class442(int arg0, int arg1, int arg2) {
    }
}
