import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class173 {

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field2826 = -1;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "Lo;")
    public static class227 field2828 = new class227();

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "Lph;")
    public static class229 field2830 = class266.method1858("loginscreen", 0);

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "Lph;")
    public static class229 field2831 = class266.method1858(")4l=", 0);

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "Lsi;")
    public static class66 field2829;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V", line = 9)
    public static void method1248(byte arg0) {
        field2828 = null;
        field2831 = null;
        if (arg0 == 25) {
            field2830 = null;
            field2829 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)Z", line = 22)
    public static final boolean method1249(byte arg0) {
        field2827++;
        class203 var1 = class251.field4208;
        synchronized (class251.field4208) {
            if (class6.field87 == class195.field3252) {
                return false;
            }
            class207.field3409 = class198.field3296[class6.field87];
            class105.field1783 = class171.field2816[class6.field87];
            if (arg0 < 112) {
                return true;
            } else {
                class6.field87 = class6.field87 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 50)
    public static final void method1250(int arg0) {
        class39.field614.method1415(-18218);
        if (arg0 != -12458) {
            method1251(true);
        }
        field2824++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Z)V", line = 62)
    public static final void method1251(boolean arg0) {
        field2825++;
        if (class169.field2795 == null) {
            return;
        }
        if (class119.field2001 < 10) {
            if (!class33.field543.method508((byte) 82, class169.field2795.field3874)) {
                class119.field2001 = class228.field3752.method510((byte) -107, class169.field2795.field3874) / 10;
                return;
            }
            class100.method771(8978);
            class119.field2001 = 10;
        }
        if (class119.field2001 == 10) {
            class54.field786 = class169.field2795.field3865 >> 6 << 6;
            class266.field4487 = class169.field2795.field3869 >> 6 << 6;
            class214.field3537 = (class169.field2795.field3868 >> 6 << 6) + 64 - class266.field4487;
            class95.field1604 = 8.0F;
            class263.field4394 = 8.0F;
            class50.field716 = (class169.field2795.field3872 >> 6 << 6) + 64 - class54.field786;
            int var1 = (class230.field3820.field5147 >> 7) + class1.field9 - class54.field786;
            int var2 = class266.field4487 + class214.field3537 - class1.field1 - (class230.field3820.field5168 >> 7) - 1;
            int var3 = var1 + (int) (Math.random() * 10.0D) - 5;
            int var4 = var2 + (int) (Math.random() * 10.0D) - 5;
            if (var3 >= 0 && var3 < class50.field716 && var4 >= 0 && class214.field3537 > var4) {
                class103.field1767 = var3;
                class324.field5534 = var4;
            } else {
                class324.field5534 = class214.field3537 + class266.field4487 - class169.field2795.field3867 * 64 - 1;
                class103.field1767 = class169.field2795.field3881 * 64 - class54.field786;
            }
            class248.method1742((byte) 114);
            int var5 = class311.field5223 >> 2 << 10;
            int var6 = class214.field3537 >> 6;
            int var7 = class50.field716 >> 6;
            class321.field5438 = new int[var7][var6][];
            class293.field4793 = new int[class100.field1714 + 1];
            class68.field1097 = new byte[var7][var6][];
            class68.field1096 = new int[var7][var6][];
            class186.field3029 = new byte[var7][var6][];
            class5.field54 = new byte[var7][var6][];
            class84.field1451 = new byte[var7][var6][];
            int var8 = class251.field4181 >> 1;
            class243.field4012 = new byte[var7][var6][];
            class38.field612 = new short[var7][var6][];
            class200.method1406(var8, var5, true);
            class119.field2001 = 20;
        } else if (class119.field2001 == 20) {
            class217.method1521(new class164(class33.field543.method497(class169.field2795.field3874, class314.field5353, false)), true);
            class119.field2001 = 30;
            class239.method1685(-31, true);
            class221.method1546((byte) -126);
        } else {
            if (arg0) {
                field2828 = (class227) null;
            }
            if (class119.field2001 == 30) {
                class233.method1658(new class164(class33.field543.method497(class169.field2795.field3874, class328.field5584, false)), !arg0);
                class119.field2001 = 40;
                class221.method1546((byte) -125);
            } else if (class119.field2001 == 40) {
                class77.method581(-97, new class164(class33.field543.method497(class169.field2795.field3874, class279.field4612, false)));
                class119.field2001 = 50;
                class221.method1546((byte) -127);
            } else if (class119.field2001 == 50) {
                class330.method2262(new class164(class33.field543.method497(class169.field2795.field3874, class134.field2175, arg0)), (byte) -107);
                class119.field2001 = 60;
                class239.method1685(-31, true);
                class221.method1546((byte) -126);
            } else if (class119.field2001 == 60) {
                if (class33.field543.method505(class248.method1746(8528, new class229[] { class169.field2795.field3874, class290.field4754 }), (byte) 103)) {
                    if (!class33.field543.method508((byte) -89, class248.method1746(8528, new class229[] { class169.field2795.field3874, class290.field4754 }))) {
                        return;
                    }
                    class1.field5 = class165.method1215(class33.field543, -1, class248.method1746(8528, new class229[] { class169.field2795.field3874, class290.field4754 }));
                } else {
                    class1.field5 = new class61(0);
                }
                class119.field2001 = 70;
                class221.method1546((byte) -126);
            } else if (class119.field2001 == 70) {
                class316.field5373 = new class283(11, true, class214.field3526);
                class119.field2001 = 73;
                class239.method1685(-31, true);
                class221.method1546((byte) -126);
            } else if (class119.field2001 == 73) {
                class145.field2357 = new class283(12, true, class214.field3526);
                class119.field2001 = 76;
                class239.method1685(-31, true);
                class221.method1546((byte) -126);
            } else if (class119.field2001 == 76) {
                class102.field1736 = new class283(14, true, class214.field3526);
                class119.field2001 = 79;
                class239.method1685(-31, true);
                class221.method1546((byte) -125);
            } else if (class119.field2001 == 79) {
                class118.field1988 = new class283(17, true, class214.field3526);
                class119.field2001 = 82;
                class239.method1685(-31, true);
                class221.method1546((byte) -127);
            } else if (class119.field2001 == 82) {
                class118.field1986 = new class283(19, true, class214.field3526);
                class119.field2001 = 85;
                class239.method1685(-31, true);
                class221.method1546((byte) -127);
            } else if (class119.field2001 == 85) {
                class187.field3053 = new class283(22, true, class214.field3526);
                class119.field2001 = 88;
                class239.method1685(-31, true);
                class221.method1546((byte) -125);
            } else if (class119.field2001 == 88) {
                class240.field3966 = new class283(26, true, class214.field3526);
                class119.field2001 = 91;
                class239.method1685(-31, true);
                class221.method1546((byte) -128);
            } else {
                class141.field2276 = new class283(30, true, class214.field3526);
                class119.field2001 = 100;
                class239.method1685(-31, true);
                class221.method1546((byte) -128);
                System.gc();
            }
        }
    }
}
