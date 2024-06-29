import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class309 extends class324 {

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    private int field4541;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Z")
    private boolean field4535;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    private int field4551;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    private int field4544;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    private int field4538;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    private int field4539;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    private int field4547;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Z")
    private boolean field4536;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    private int field4549;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    private int field4540;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "Lhb;")
    public static class629 field4543 = new class629(5, 5);

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4552 = "";

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "Lig;")
    public static class206 field4553 = new class206(90, 10);

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)Z", line = 10)
    public static final boolean method2047(int arg0, int arg1, int arg2) {
        int var3 = -104 / ((arg2 - 36) / 32);
        field4548++;
        return (arg0 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLrt;)V", line = 20)
    public final void method2048(byte arg0, class194 arg1) {
        field4542++;
        arg1.method1205((byte) -69, 2);
        arg1.method1205((byte) -69, this.field4541);
        arg1.method1205((byte) -69, this.field4535 ? 1 : 0);
        arg1.method1205((byte) -69, this.field4551);
        if (arg0 != -26) {
            return;
        }
        arg1.method1205((byte) -69, this.field4544);
        arg1.method1205((byte) -69, this.field4538);
        arg1.method1205((byte) -69, this.field4547);
        arg1.method1205((byte) -69, this.field4536 ? 1 : 0);
        arg1.method1229(this.field4549, 30364);
        arg1.method1205((byte) -69, this.field4539);
        arg1.method1240(this.field4540, (byte) 108);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 42)
    public static void method2049(int arg0) {
        field4543 = null;
        field4553 = null;
        if (arg0 != 83128144) {
            field4550 = 1;
        }
        field4552 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lqb;II)V", line = 62)
    public static final void method2050(class191 arg0, int arg1, int arg2) {
        field4545++;
        int var3 = -1;
        int var4 = 0;
        if (arg0.field2459 > class287.field3982) {
            class395.method2537((byte) 109, arg0);
        } else if (arg0.field2498 < class287.field3982) {
            class46.method247(0, false, arg0);
            var4 = class248.field3528;
            var3 = class119.field1501;
        } else {
            class563.method3257(arg0, (byte) 45);
        }
        if (arg0.field1764 < 512 || arg0.field1768 < 512 || class90.field1032 * 512 - 512 <= arg0.field1764 || (class30.field349 * 512 - 512) <= arg0.field1768) {
            arg0.field2421 = -1;
            var3 = -1;
            arg0.field2459 = 0;
            arg0.field2472 = -1;
            arg0.field2498 = 0;
            arg0.field2502 = -1;
            var4 = 0;
            arg0.field1764 = arg0.field2515[0] * 512 + (arg0.method1153(true) * 256);
            arg0.field1768 = arg0.field2524[0] * 512 + arg0.method1153(true) * 256;
            arg0.method1147(22);
        }
        if (class439.field6548 == arg0 && (arg0.field1764 < 6144 || arg0.field1768 < 6144 || ((class90.field1032 - 12) * 512) <= arg0.field1764 || arg0.field1768 >= (class30.field349 * 512 - 6144))) {
            arg0.field2472 = -1;
            arg0.field2459 = 0;
            arg0.field2421 = -1;
            arg0.field2502 = -1;
            arg0.field2498 = 0;
            var4 = 0;
            var3 = -1;
            arg0.field1764 = arg0.field2515[0] * 512 + (arg0.method1153(true) * 256);
            arg0.field1768 = arg0.field2524[0] * 512 + (arg0.method1153(true) * 256);
            arg0.method1147(-105);
        }
        int var5 = class603.method3503(arg0, -1);
        class406.method2574(var4, var5, var3, false, arg0);
        class139.method836(arg0, (byte) -18);
        if (arg1 != 2) {
            method2047(54, 118, 106);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lqf;B)Ljava/lang/String;", line = 127)
    public static final String method2051(class593 arg0, byte arg1) {
        field4546++;
        if (arg1 != 102) {
            method2052(true, 16);
        }
        if (client.method1682(arg0).method1771((byte) 82) == 0) {
            return null;
        } else if (arg0.field8589 == null || arg0.field8589.trim().length() == 0) {
            return class541.field7761 ? "Hidden-use" : null;
        } else {
            return arg0.field8589;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)I", line = 150)
    public static final int method2052(boolean arg0, int arg1) {
        if (!arg0) {
            method2051(null, (byte) 62);
        }
        field4537++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(ZLtq;)V", line = 174)
    public class309(boolean arg0, class545 arg1) {
        if (arg0) {
            if (class545.field7788.startsWith("win")) {
                this.field4541 = 1;
            } else if (class545.field7788.startsWith("mac")) {
                this.field4541 = 2;
            } else if (class545.field7788.startsWith("linux")) {
                this.field4541 = 3;
            } else {
                this.field4541 = 4;
            }
            if (class545.field7806.startsWith("amd64") || class545.field7806.startsWith("x86_64")) {
                this.field4535 = true;
            } else {
                this.field4535 = false;
            }
            if (class545.field7798.toLowerCase().indexOf("sun") != -1) {
                this.field4551 = 1;
            } else if (class545.field7798.toLowerCase().indexOf("microsoft") != -1) {
                this.field4551 = 2;
            } else if (class545.field7798.toLowerCase().indexOf("apple") == -1) {
                this.field4551 = 4;
            } else {
                this.field4551 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (class545.field7787.length() > var3) {
                    char var5 = class545.field7787.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var3++;
                    var4 = var4 * 10 + var5 - 48;
                }
            } catch (Exception var15) {
            }
            this.field4544 = var4;
            int var6 = class545.field7787.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (var6 < class545.field7787.length()) {
                    char var8 = class545.field7787.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7 = var7 * 10 + var8 - 48;
                    var6++;
                }
            } catch (Exception var14) {
            }
            this.field4538 = var7;
            int var9 = 0;
            int var10 = class545.field7787.indexOf(95, 4) + 1;
            try {
                while (class545.field7787.length() > var10) {
                    char var11 = class545.field7787.charAt(var10);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var9 = var9 * 10 + var11 - 48;
                    var10++;
                }
            } catch (Exception var13) {
            }
            if (this.field4544 <= 3) {
                this.field4539 = 0;
            } else {
                this.field4539 = class510.field7466;
            }
            this.field4547 = var9;
            if (arg1.field7804) {
                this.field4536 = false;
            } else {
                this.field4536 = true;
            }
            this.field4549 = class362.field5189;
            try {
                this.field4540 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var12) {
                this.field4540 = 0;
            }
        }
    }
}
