import jaclib.hardware_info.HardwareInfo;
import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class120 extends class665 {

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    private int field1811;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Z")
    private boolean field1813;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    private int field1810;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    private int field1812;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    private int field1822;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    private int field1819;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "Z")
    private boolean field1818;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    private int field1814;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    private int field1821;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    private int field1809;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    private int field1815;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    private int field1820;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "Lmf;")
    public static class382 field1823 = new class382(3000000, 200);

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field1824 = -1;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "Z")
    public static boolean field1825 = false;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "[I")
    public static int[] field1827 = new int[4096];

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "Z")
    public static boolean field1828 = false;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "Lpu;")
    public static class522 field1826;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 15)
    public static void method915(int arg0) {
        field1823 = null;
        if (arg0 == -48) {
            field1826 = null;
            field1827 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLvh;Lr;I)V", line = 27)
    public static final void method916(byte arg0, class327 arg1, class166 arg2, int arg3) {
        field1816++;
        int var4 = 11 % ((-arg0 - 75) / 48);
        if (class23.field317 != null && arg3 <= arg1.field4834) {
            for (int var5 = 0; var5 < class23.field317.length; var5++) {
                if (class23.field317[var5] != -1000000 && (arg1.field4839[0] <= class23.field317[var5] || class23.field317[var5] >= arg1.field4839[1] || arg1.field4839[2] <= class23.field317[var5] || class23.field317[var5] >= arg1.field4839[3]) && (class533.field7477[var5] >= arg1.field4846[0] || arg1.field4846[1] <= class533.field7477[var5] || class533.field7477[var5] >= arg1.field4846[2] || class533.field7477[var5] >= arg1.field4846[3]) && (arg1.field4846[0] >= class573.field8064[var5] || class573.field8064[var5] <= arg1.field4846[1] || arg1.field4846[2] >= class573.field8064[var5] || arg1.field4846[3] >= class573.field8064[var5]) && (class473.field6759[var5] >= arg1.field4840[0] || class473.field6759[var5] >= arg1.field4840[1] || class473.field6759[var5] >= arg1.field4840[2] || arg1.field4840[3] <= class473.field6759[var5]) && (class596.field8427[var5] <= arg1.field4840[0] || arg1.field4840[1] >= class596.field8427[var5] || class596.field8427[var5] <= arg1.field4840[2] || arg1.field4840[3] >= class596.field8427[var5])) {
                    return;
                }
            }
        }
        if (arg1.field4835 == 1) {
            int var6 = arg1.field4842 + class196.field2802 - class435.field6354;
            if (var6 >= 0 && var6 <= (class196.field2802 + class196.field2802)) {
                int var7 = class196.field2802 + arg1.field4849 - class612.field8575;
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > (class196.field2802 + class196.field2802)) {
                    return;
                }
                int var8 = class196.field2802 + arg1.field4843 - class612.field8575;
                if (class196.field2802 + class196.field2802 < var8) {
                    var8 = class196.field2802 + class196.field2802;
                } else if (var8 < 0) {
                    return;
                }
                boolean var9 = false;
                while (var7 <= var8) {
                    if (class260.field3949[var6][var7++]) {
                        var9 = true;
                        break;
                    }
                }
                if (var9) {
                    float var10 = (float) (class55.field1071 - arg1.field4846[0]);
                    if (var10 < 0.0F) {
                        var10 *= -1.0F;
                    }
                    if (!((float) class101.field1583 > var10) && class226.method1488(0, arg1, (byte) 77) && class226.method1488(1, arg1, (byte) 64) && class226.method1488(2, arg1, (byte) 65) && class226.method1488(3, arg1, (byte) 93)) {
                        class612.field8574[class266.field4020++] = arg1;
                    }
                }
            }
        } else if (arg1.field4835 == 2) {
            int var11 = class196.field2802 + arg1.field4849 - class612.field8575;
            if (var11 >= 0 && var11 <= class196.field2802 + class196.field2802) {
                int var12 = arg1.field4842 + class196.field2802 - class435.field6354;
                if (var12 < 0) {
                    var12 = 0;
                } else if (class196.field2802 + class196.field2802 < var12) {
                    return;
                }
                int var13 = class196.field2802 + arg1.field4837 - class435.field6354;
                if (var13 > (class196.field2802 + class196.field2802)) {
                    var13 = class196.field2802 + class196.field2802;
                } else if (var13 < 0) {
                    return;
                }
                boolean var14 = false;
                while (var13 >= var12) {
                    if (class260.field3949[var12++][var11]) {
                        var14 = true;
                        break;
                    }
                }
                if (var14) {
                    float var15 = (float) (class628.field8790 - arg1.field4840[0]);
                    if (var15 < 0.0F) {
                        var15 *= -1.0F;
                    }
                    if (!(var15 < (float) class101.field1583) && class226.method1488(0, arg1, (byte) 81) && class226.method1488(1, arg1, (byte) 93) && class226.method1488(2, arg1, (byte) 82) && class226.method1488(3, arg1, (byte) 77)) {
                        class612.field8574[class266.field4020++] = arg1;
                    }
                }
            }
        } else if (arg1.field4835 == 16 || arg1.field4835 == 8) {
            int var24 = arg1.field4842 + class196.field2802 - class435.field6354;
            if (var24 >= 0 && var24 <= class196.field2802 + class196.field2802) {
                int var25 = class196.field2802 + arg1.field4849 - class612.field8575;
                if (var25 >= 0 && (class196.field2802 + class196.field2802) >= var25 && class260.field3949[var24][var25]) {
                    float var26 = (float) (class55.field1071 - arg1.field4846[0]);
                    if (var26 < 0.0F) {
                        var26 *= -1.0F;
                    }
                    float var27 = (float) (class628.field8790 - arg1.field4840[0]);
                    if (var27 < 0.0F) {
                        var27 *= -1.0F;
                    }
                    if (!(var26 < (float) class101.field1583) || !(var27 < (float) class101.field1583) && class226.method1488(0, arg1, (byte) 118) && class226.method1488(1, arg1, (byte) 114) && class226.method1488(2, arg1, (byte) 120) && class226.method1488(3, arg1, (byte) 105)) {
                        class612.field8574[class266.field4020++] = arg1;
                    }
                }
            }
        } else if (arg1.field4835 == 4) {
            float var16 = (float) (arg1.field4839[0] - class688.field9688);
            if (!(var16 <= (float) class565.field7971)) {
                int var17 = arg1.field4849 + class196.field2802 - class612.field8575;
                if (var17 < 0) {
                    var17 = 0;
                } else if (var17 > (class196.field2802 + class196.field2802)) {
                    return;
                }
                int var18 = class196.field2802 + arg1.field4843 - class612.field8575;
                if (var18 > class196.field2802 + class196.field2802) {
                    var18 = class196.field2802 + class196.field2802;
                } else if (var18 < 0) {
                    return;
                }
                int var19 = arg1.field4842 + class196.field2802 - class435.field6354;
                if (var19 < 0) {
                    var19 = 0;
                } else if (var19 > (class196.field2802 + class196.field2802)) {
                    return;
                }
                int var20 = arg1.field4837 - (class435.field6354 - class196.field2802);
                if ((class196.field2802 + class196.field2802) < var20) {
                    var20 = class196.field2802 + class196.field2802;
                } else if (var20 < 0) {
                    return;
                }
                boolean var21 = false;
                label292: for (int var22 = var19; var22 <= var20; var22++) {
                    for (int var23 = var17; var23 <= var18; var23++) {
                        if (class260.field3949[var22][var23]) {
                            var21 = true;
                            break label292;
                        }
                    }
                }
                if (var21 && class226.method1488(0, arg1, (byte) 109) && class226.method1488(1, arg1, (byte) 115) && class226.method1488(2, arg1, (byte) 63) && class226.method1488(3, arg1, (byte) 101)) {
                    class612.field8574[class266.field4020++] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(JJ)J", line = 360)
    public static long method917(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lmo;I)V", line = 367)
    public final void method918(class695 arg0, int arg1) {
        arg0.method3853((byte) 51, 3);
        field1817++;
        arg0.method3853((byte) 51, this.field1811);
        arg0.method3853((byte) 51, this.field1813 ? 1 : 0);
        arg0.method3853((byte) 51, this.field1810);
        if (arg1 != 56) {
            return;
        }
        arg0.method3853((byte) 51, this.field1812);
        arg0.method3853((byte) 51, this.field1822);
        arg0.method3853((byte) 51, this.field1819);
        arg0.method3853((byte) 51, this.field1809);
        arg0.method3853((byte) 51, this.field1818 ? 1 : 0);
        arg0.method3852(false, this.field1821);
        arg0.method3853((byte) 51, this.field1814);
        arg0.method3831((byte) -123, this.field1815);
        arg0.method3868(this.field1820, arg1 - 318419392);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(ZLft;)V", line = 391)
    public class120(boolean arg0, class4 arg1) {
        if (arg0) {
            if (class4.field22.startsWith("win")) {
                this.field1811 = 1;
            } else if (class4.field22.startsWith("mac")) {
                this.field1811 = 2;
            } else if (class4.field22.startsWith("linux")) {
                this.field1811 = 3;
            } else {
                this.field1811 = 4;
            }
            if (class4.field40.startsWith("amd64") || class4.field40.startsWith("x86_64")) {
                this.field1813 = true;
            } else {
                this.field1813 = false;
            }
            if (this.field1811 == 1) {
                if (class4.field33.indexOf("4.0") != -1) {
                    this.field1810 = 1;
                } else if (class4.field33.indexOf("4.1") != -1) {
                    this.field1810 = 2;
                } else if (class4.field33.indexOf("4.9") != -1) {
                    this.field1810 = 3;
                } else if (class4.field33.indexOf("5.0") != -1) {
                    this.field1810 = 4;
                } else if (class4.field33.indexOf("5.1") != -1) {
                    this.field1810 = 5;
                } else if (class4.field33.indexOf("6.0") != -1) {
                    this.field1810 = 6;
                } else if (class4.field33.indexOf("6.1") != -1) {
                    this.field1810 = 7;
                }
            } else if (this.field1811 == 2) {
                if (class4.field33.indexOf("10.4") != -1) {
                    this.field1810 = 20;
                } else if (class4.field33.indexOf("10.5") != -1) {
                    this.field1810 = 21;
                } else if (class4.field33.indexOf("10.6") != -1) {
                    this.field1810 = 22;
                }
            }
            if (class4.field28.toLowerCase().indexOf("sun") != -1) {
                this.field1812 = 1;
            } else if (class4.field28.toLowerCase().indexOf("microsoft") != -1) {
                this.field1812 = 2;
            } else if (class4.field28.toLowerCase().indexOf("apple") == -1) {
                this.field1812 = 4;
            } else {
                this.field1812 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (var3 < class4.field35.length()) {
                    char var5 = class4.field35.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 - (48 - var5);
                    var3++;
                }
            } catch (Exception var16) {
            }
            this.field1822 = var4;
            int var6 = class4.field35.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (var6 < class4.field35.length()) {
                    char var8 = class4.field35.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7 = var7 * 10 + var8 - 48;
                    var6++;
                }
            } catch (Exception var15) {
            }
            this.field1819 = var7;
            int var9 = class4.field35.indexOf(95, 4) + 1;
            int var10 = 0;
            try {
                while (var9 < class4.field35.length()) {
                    char var11 = class4.field35.charAt(var9);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9++;
                    var10 = var10 * 10 + var11 - 48;
                }
            } catch (Exception var14) {
            }
            if (arg1.field49) {
                this.field1818 = false;
            } else {
                this.field1818 = true;
            }
            if (this.field1822 > 3) {
                this.field1814 = class187.field2693;
            } else {
                this.field1814 = 0;
            }
            this.field1821 = class266.field4022;
            this.field1809 = var10;
            try {
                this.field1815 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var13) {
                this.field1815 = 0;
            }
            try {
                this.field1820 = HardwareInfo.getPackedBasicCPUInfo();
            } catch (Throwable var12) {
            }
        }
    }
}
