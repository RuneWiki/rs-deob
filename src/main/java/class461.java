import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class461 {

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "Llh;")
    private class364 field6807 = new class364(64);

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "Llh;")
    public class364 field6812 = new class364(2);

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "Lhh;")
    private class84 field6806;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "Lhh;")
    public class84 field6802;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public static int field6805 = 0;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field6808 = 0;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Lnk;")
    public static class500 field6804 = new class500("LOCAL", 4);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "[I")
    public static int[] field6801;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public final void method2759(byte arg0) {
        class364 var2 = this.field6807;
        synchronized (this.field6807) {
            this.field6807.method2350((byte) 112);
        }
        field6799++;
        if (arg0 != 23) {
            field6804 = null;
        }
        class364 var3 = this.field6812;
        synchronized (this.field6812) {
            this.field6812.method2350((byte) 112);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public final void method2760(int arg0) {
        class364 var2 = this.field6807;
        synchronized (this.field6807) {
            this.field6807.method2349(arg0 ^ arg0);
        }
        field6813++;
        class364 var3 = this.field6812;
        synchronized (this.field6812) {
            this.field6812.method2349(0);
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
    public static void method2761(byte arg0) {
        if (arg0 < 14) {
            method2761((byte) 82);
        }
        field6801 = null;
        field6804 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZZILjava/lang/String;IIJLjava/lang/String;IIZ)V")
    public static final void method2762(boolean arg0, boolean arg1, int arg2, String arg3, int arg4, int arg5, long arg6, String arg7, int arg8, int arg9, boolean arg10) {
        field6800++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class303 var14 = new class303(128);
        var14.method1923((byte) 62, 10);
        var14.method1874((arg10 ? 2 : 0) | (arg1 ? 1 : 0) | (arg0 ? 4 : 0), (byte) -110);
        var14.method1872(-1, arg6);
        var14.method1892(arg5 ^ 0x17B65517, var12[0]);
        var14.method1882((byte) 28, arg7);
        var14.method1892(arg5 + 397825257, var12[1]);
        var14.method1874(class389.field5759, (byte) -110);
        var14.method1923((byte) 62, arg8);
        var14.method1923((byte) 62, arg4);
        var14.method1892(397825512, var12[2]);
        var14.method1874(arg2, (byte) -110);
        var14.method1874(arg9, (byte) -110);
        var14.method1892(397825512, var12[3]);
        var14.method1913(class256.field3696, 97, class520.field7635);
        class303 var15 = new class303(350);
        var15.method1882((byte) 6, arg3);
        if (arg5 != 255) {
            return;
        }
        int var16 = 8 - class8.method57(-127, arg3) % 8;
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1923((byte) 62, (int) (Math.random() * 255.0D));
        }
        var15.method1912((byte) 90, var12);
        class86.field1436.field4333 = 0;
        class86.field1436.method1923((byte) 62, class224.field3255.field6584);
        class86.field1436.method1874(var14.field4333 + var15.field4333 + 2, (byte) -110);
        class86.field1436.method1874(588, (byte) -110);
        class86.field1436.method1876(0, arg5 - 251, var14.field4326, var14.field4333);
        class86.field1436.method1876(0, 4, var15.field4326, var15.field4333);
        class412.field6071 = -3;
        class267.field3859 = 1;
        class343.field5238 = 0;
        class303.field4362 = 0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)Leh;")
    public final class241 method2763(int arg0, int arg1) {
        field6810++;
        if (arg0 != 10) {
            method2762(true, true, 107, null, -42, -72, 52L, null, -66, 77, true);
        }
        class364 var3 = this.field6807;
        class241 var4;
        synchronized (this.field6807) {
            var4 = (class241) this.field6807.method2339(arg0 - 123, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6806.method683(33, arg1, 5);
        class241 var6 = new class241();
        var6.field3499 = this;
        if (var5 != null) {
            var6.method1560((byte) 80, new class303(var5));
        }
        class364 var7 = this.field6807;
        synchronized (this.field6807) {
            this.field6807.method2342((long) arg1, var6, 14);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)V")
    public final void method2764(int arg0, int arg1) {
        int var3 = 7 % ((27 - arg0) / 53);
        field6803++;
        class364 var4 = this.field6807;
        synchronized (this.field6807) {
            this.field6807.method2348(arg1, -127);
        }
        class364 var5 = this.field6812;
        synchronized (this.field6812) {
            this.field6812.method2348(arg1, 56);
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lmt;ILhh;Lhh;)V")
    public class461(class271 arg0, int arg1, class84 arg2, class84 arg3) {
        this.field6806 = arg2;
        this.field6802 = arg3;
        this.field6806.method656((byte) 122, 33);
    }
}
