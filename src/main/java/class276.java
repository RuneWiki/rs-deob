import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class276 {

    @OriginalMember(owner = "client!oba", name = "h", descriptor = "I")
    private int field3232;

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
    private int field3231;

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
    private int field3226;

    @OriginalMember(owner = "client!oba", name = "i", descriptor = "I")
    private int field3233;

    @OriginalMember(owner = "client!oba", name = "m", descriptor = "I")
    public int field3237;

    @OriginalMember(owner = "client!oba", name = "o", descriptor = "I")
    public int field3239;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "I")
    public int field3225;

    @OriginalMember(owner = "client!oba", name = "c", descriptor = "I")
    public int field3227;

    @OriginalMember(owner = "client!oba", name = "d", descriptor = "I")
    public int field3228;

    @OriginalMember(owner = "client!oba", name = "j", descriptor = "I")
    public int field3234;

    @OriginalMember(owner = "client!oba", name = "l", descriptor = "Lhj;")
    public static class596 field3236 = new class596(113, 1);

    @OriginalMember(owner = "client!oba", name = "p", descriptor = "Lsv;")
    public static class688 field3240 = new class688();

    @OriginalMember(owner = "client!oba", name = "e", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!oba", name = "k", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!oba", name = "n", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIIIIIIIIII)V")
    public final void method1608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field3233 = arg3 * arg3;
        field3230++;
        this.field3231 = arg9;
        this.field3226 = arg0;
        this.field3232 = arg5;
        this.field3225 = this.field3226 + arg7;
        this.field3239 = this.field3226 + arg8;
        this.field3234 = this.field3231 + arg10;
        if (arg1 != 113) {
            method1610(true);
        }
        this.field3228 = this.field3232 + arg6;
        this.field3227 = this.field3231 + arg4;
        this.field3237 = this.field3232 + arg2;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IBII)Z")
    public final boolean method1609(int arg0, byte arg1, int arg2, int arg3) {
        field3235++;
        if (arg1 > -71) {
            return false;
        } else if (arg2 < this.field3234 || this.field3227 < arg2) {
            return false;
        } else if (arg0 < this.field3237 || this.field3228 < arg0) {
            return false;
        } else if (arg3 >= this.field3225 && arg3 <= this.field3239) {
            int var5 = arg2 - this.field3231;
            int var6 = arg3 - this.field3226;
            return this.field3233 > (var5 * var5 + (var6 * var6));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(Z)V")
    public static void method1610(boolean arg0) {
        if (arg0) {
            field3240 = null;
            field3236 = null;
        }
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V")
    public static final void method1611(int arg0) {
        class65.field887.method3476(52);
        field3229++;
        class100.field1304.method1151(false);
        class692.field9423.method3092(-9493);
        class379.field4811.method4193((byte) 46);
        class444.field5956.method1073(-18389);
        if (arg0 != 113) {
            method1611(120);
        }
        class121.field1555.method2881(-1);
        class362.field4504.method3601(2);
        class740.field10303.method1479(arg0 ^ 0x8F);
        class687.field9368.method4184(-71);
        class116.field1481.method2622(true);
        class204.field2444.method3553(108);
        class249.field2932.method1413(false);
        class495.field6886.method1703((byte) -123);
        class2.field33.method4137((byte) -31);
        class500.field7002.method1914(arg0 ^ 0x79AD);
        class113.field1426.method4362((byte) -113);
        class153.field1907.method1236(arg0 ^ 0x15);
        class305.field3675.method3681(20399);
        class520.field7343.method2824(31);
        class5.field63.method2468((byte) 0);
        class347.field4336.method1025(1);
        class607.field8173.method2833((byte) 57);
        class467.method2796(71);
        class418.method2497(8302);
        class83.method778(99);
        class96.method839((byte) -121);
        if (class737.field10285 != class446.field6003) {
            for (int var1 = 0; var1 < class118.field1500.length; var1++) {
                class118.field1500[var1] = null;
            }
            class785.field10836 = 0;
        }
        class108.method876((byte) 85);
        class513.method3078(-94);
        class45.method411((byte) 117);
        class386.method2263((byte) -59);
        class275.method1607(arg0 ^ 0xFFFFFF8E);
        class142.field1780.method1690(arg0 - 113);
        class363.field4526.method647();
        class737.method4148(-1);
        class372.method2177((byte) -55);
        class210.field2495.method429(arg0 - 185);
        class227.field2659.method429(-122);
        class483.field6745.method429(-104);
        class503.field7120.method429(-28);
        class257.field3050.method429(-12);
        class340.field4208.method429(-78);
        class599.field8106.method429(-122);
        class733.field10257.method429(arg0 - 213);
        class208.field2470.method429(-115);
        class36.field541.method429(arg0 ^ 0xFFFFFFDD);
        class514.field7247.method429(arg0 - 150);
        class385.field4939.method429(-121);
        class251.field2945.method429(arg0 - 224);
        class625.field8577.method429(-113);
        class709.field9956.method429(-51);
        class4.field48.method429(-51);
        class392.field5080.method429(-63);
        class691.field9407.method429(-55);
        class410.field5375.method429(-90);
        class481.field6728.method429(-71);
        class53.field720.method429(arg0 - 183);
        class277.field3243.method429(-108);
        class512.field7239.method429(arg0 - 142);
        class132.field1645.method429(-39);
        class410.field5372.method429(-17);
        class85.field1137.method429(arg0 ^ 0xFFFFFFE6);
        class195.field2336.method429(-83);
        class497.field6954.method429(arg0 ^ 0xFFFFFFFC);
        class318.field3910.method429(-84);
        class747.field10371.method429(-24);
        class459.field6470.method429(arg0 - 219);
        class519.field7331.method429(arg0 - 164);
        class466.field6519.method429(arg0 ^ 0xFFFFFFCD);
        class629.field8596.method1690(arg0 - 113);
        class303.field3617.method1690(arg0 - 113);
        class400.field5226.method1690(0);
        class710.field9963.method1690(0);
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field3232 = arg1;
        this.field3231 = arg0;
        this.field3226 = arg2;
        this.field3233 = arg3 * arg3;
        this.field3237 = this.field3232 + arg6;
        this.field3239 = this.field3226 + arg9;
        this.field3225 = this.field3226 + arg8;
        this.field3227 = this.field3231 + arg5;
        this.field3228 = this.field3232 + arg7;
        this.field3234 = this.field3231 + arg4;
    }
}
