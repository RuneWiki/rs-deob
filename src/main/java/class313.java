import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class313 extends class42 {

    @OriginalMember(owner = "client!os", name = "t", descriptor = "I")
    private int field4662;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "Z")
    private boolean field4668;

    @OriginalMember(owner = "client!os", name = "F", descriptor = "I")
    private int field4674;

    @OriginalMember(owner = "client!os", name = "v", descriptor = "I")
    private int field4664;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "I")
    private int field4660;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "I")
    private int field4657;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "I")
    private int field4661;

    @OriginalMember(owner = "client!os", name = "q", descriptor = "Z")
    private boolean field4659;

    @OriginalMember(owner = "client!os", name = "p", descriptor = "I")
    private int field4658;

    @OriginalMember(owner = "client!os", name = "A", descriptor = "Lqt;")
    public static class459 field4669 = new class459(64, 3);

    @OriginalMember(owner = "client!os", name = "B", descriptor = "[Z")
    public static boolean[] field4670 = new boolean[100];

    @OriginalMember(owner = "client!os", name = "G", descriptor = "[F")
    public static float[] field4675 = new float[4];

    @OriginalMember(owner = "client!os", name = "C", descriptor = "I")
    public static int field4671 = 0;

    @OriginalMember(owner = "client!os", name = "H", descriptor = "Lqv;")
    public static class316 field4676 = new class316(70, -1);

    @OriginalMember(owner = "client!os", name = "u", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!os", name = "w", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!os", name = "x", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!os", name = "y", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!os", name = "E", descriptor = "I")
    public static int field4673;

    // $FF: synthetic field
    @OriginalMember(owner = "client!os", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field4677;

    @OriginalMember(owner = "client!os", name = "D", descriptor = "[I")
    public static int[] field4672;

    // $FF: synthetic method
    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1990(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lwn;I)V", line = 7)
    public final void method1986(class519 arg0, int arg1) {
        field4666++;
        if (arg1 != 0) {
            method1988((byte) -43);
        }
        arg0.method3048(-2034159384, 1);
        arg0.method3048(-2034159384, this.field4662);
        arg0.method3048(-2034159384, this.field4668 ? 1 : 0);
        arg0.method3048(-2034159384, this.field4674);
        arg0.method3048(-2034159384, this.field4664);
        arg0.method3048(-2034159384, this.field4661);
        arg0.method3048(-2034159384, this.field4659 ? 1 : 0);
        arg0.method3016(this.field4657, -121);
        arg0.method3048(-2034159384, this.field4660);
        arg0.method3056(arg1 - 115, this.field4658);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lpg;ILpg;)V", line = 27)
    public static final void method1987(class525 arg0, int arg1, class525 arg2) {
        if (arg2.field7662 != null) {
            arg2.method3115((byte) 103);
        }
        field4665++;
        arg2.field7662 = arg0;
        if (arg1 != -26480) {
            field4673 = 54;
        }
        arg2.field7660 = arg0.field7660;
        arg2.field7662.field7660 = arg2;
        arg2.field7660.field7662 = arg2;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V", line = 45)
    public static void method1988(byte arg0) {
        field4672 = null;
        if (arg0 != -9) {
            field4670 = null;
        }
        field4670 = null;
        field4676 = null;
        field4669 = null;
        field4675 = null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ILsh;)V", line = 65)
    public static final void method1989(int arg0, class50 arg1) {
        field4663++;
        if (class461.field6675 == null) {
            return;
        }
        class534 var2 = null;
        if (arg1.field930 == 0) {
            var2 = (class534) class500.method2921(arg1.field931, arg1.field924, arg1.field919);
        }
        if (arg1.field930 == 1) {
            var2 = (class534) class415.method2475(arg1.field931, arg1.field924, arg1.field919);
        }
        if (arg0 != 70) {
            method1987(null, -5, null);
        }
        if (arg1.field930 == 2) {
            var2 = (class534) class413.method2470(arg1.field931, arg1.field924, arg1.field919, field4677 == null ? (field4677 = method1990("wo")) : field4677);
        }
        if (arg1.field930 == 3) {
            var2 = (class534) class388.method2347(arg1.field931, arg1.field924, arg1.field919);
        }
        if (var2 == null) {
            arg1.field925 = 0;
            arg1.field922 = -1;
            arg1.field918 = 0;
        } else {
            arg1.field922 = var2.method561((byte) -85);
            arg1.field918 = var2.method559((byte) 67);
            arg1.field925 = var2.method560(-29863);
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V", line = 121)
    public class313() {
        if (class411.field5820.startsWith("win")) {
            this.field4662 = 1;
        } else if (class411.field5820.startsWith("mac")) {
            this.field4662 = 2;
        } else if (class411.field5820.startsWith("linux")) {
            this.field4662 = 3;
        } else {
            this.field4662 = 4;
        }
        if (class411.field5815.startsWith("amd64") || class411.field5815.startsWith("x86_64")) {
            this.field4668 = true;
        } else {
            this.field4668 = false;
        }
        if (class411.field5811.toLowerCase().indexOf("sun") != -1) {
            this.field4674 = 1;
        } else if (class411.field5811.toLowerCase().indexOf("microsoft") != -1) {
            this.field4674 = 2;
        } else if (class411.field5811.toLowerCase().indexOf("apple") == -1) {
            this.field4674 = 4;
        } else {
            this.field4674 = 3;
        }
        int var1 = 2;
        int var2 = 0;
        try {
            while (var1 < class411.field5816.length()) {
                char var3 = class411.field5816.charAt(var1);
                if (var3 < '0' || var3 > '9') {
                    break;
                }
                var2 = var2 * 10 - (48 - var3);
                var1++;
            }
        } catch (Exception var9) {
        }
        this.field4664 = var2;
        int var4 = class411.field5816.indexOf(46, 2);
        int var5 = 0;
        try {
            while (var4 < class411.field5816.length()) {
                char var6 = class411.field5816.charAt(var4);
                if (var6 < '0' || var6 > '9') {
                    break;
                }
                var4++;
                var5 = var5 * 10 + var6 - 48;
            }
        } catch (Exception var8) {
        }
        if (this.field4664 <= 3) {
            this.field4660 = 0;
        } else {
            this.field4660 = class290.field4316;
        }
        this.field4657 = class414.field5859;
        this.field4661 = var5;
        if (class411.field5809 == 3) {
            this.field4659 = true;
        } else {
            this.field4659 = false;
        }
        try {
            this.field4658 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
        } catch (Throwable var7) {
            this.field4658 = 0;
        }
    }
}
