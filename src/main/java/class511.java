import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class511 {

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "Le;")
    public static class479 field6895;

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field6893;

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "()V")
    public class511() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)[Llp;")
    public static final class270[] method2887(int arg0) {
        field6896++;
        return arg0 == 3914 ? new class270[] { class431.field5987, class562.field7686, class186.field2284, class456.field6214, class464.field6343, class679.field9654, class142.field1810, class314.field4513, class282.field3785, class238.field3144, class645.field9139, class506.field6858, class139.field1783, class677.field9600 } : null;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
    public static final void method2888(byte arg0) {
        class465.field6344 = null;
        class172.field2152 = null;
        class41.field535 = null;
        if (arg0 != 67) {
            field6895 = null;
        }
        class622.field8452 = null;
        class137.field1708 = null;
        class261.field3605 = null;
        class198.field2619 = null;
        class161.field2033 = null;
        field6892++;
        class361.field5208 = null;
        class448.field6138 = null;
        class611.field8323 = null;
        class637.field8700 = null;
        class395.field5658 = null;
        class521.field7222 = null;
        class426.field5926 = null;
        class167.field2089 = null;
        class615.field8391 = null;
        class60.field841 = null;
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(B)V")
    public static void method2889(byte arg0) {
        field6895 = null;
        if (arg0 != -109) {
            field6895 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "([SZ)[S")
    public static final short[] method2890(short[] arg0, boolean arg1) {
        field6897++;
        if (arg1) {
            return null;
        } else if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class657.method3637(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLdga;[B)V")
    public final void method2891(byte arg0, class138 arg1, byte[] arg2) {
        field6889++;
        if (arg1.field1712[arg1.field1745] != 31 || arg1.field1712[arg1.field1745 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field6893 == null) {
            this.field6893 = new Inflater(true);
        }
        try {
            this.field6893.setInput(arg1.field1712, arg1.field1745 + 10, arg1.field1712.length - 10 - arg1.field1745 + -8);
            this.field6893.inflate(arg2);
        } catch (Exception var4) {
            this.field6893.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg0 == -118) {
            this.field6893.reset();
        }
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V")
    public static final void method2892(int arg0) {
        if (arg0 < ~class52.field677) {
            class522.field7230 = -1;
            class52.field677 = 0;
            class92.field1131 = -1;
        }
        field6894++;
        if (class52.field677 > class561.field7676) {
            class92.field1131 = -1;
            class522.field7230 = -1;
            class52.field677 = class561.field7676;
        }
        if (class351.field5122 < 0) {
            class351.field5122 = 0;
            class92.field1131 = -1;
            class522.field7230 = -1;
        }
        if (class561.field7667 < class351.field5122) {
            class351.field5122 = class561.field7667;
            class522.field7230 = -1;
            class92.field1131 = -1;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IZ)V")
    public static final void method2893(int arg0, boolean arg1) {
        if (class80.field1014 != null) {
            class80.field1014.method971(3289650);
            class80.field1014 = null;
        }
        field6891++;
        class243.field3275 = 0;
        class308.method1848(true);
        class275.method1673();
        if (arg0 != 1000000) {
            field6888 = 31;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            class624.field8489[var2].method1502(false);
        }
        class227.method1389(64, false);
        System.gc();
        class308.method1844(2, arg0 ^ 0xF4220);
        class677.field9606 = false;
        class133.field1688 = -1;
        class243.method1489(true, (byte) 106);
        class429.field5954 = 0;
        class258.field3579 = 0;
        class690.field9747 = 0;
        class186.field2280 = 0;
        class253.field3490 = 0;
        class179.field2235 = 0;
        for (int var3 = 0; var3 < class249.field3357.length; var3++) {
            class249.field3357[var3] = null;
        }
        class501.method2821((byte) 95);
        for (int var4 = 0; var4 < 2048; var4++) {
            class292.field3912[var4] = null;
        }
        class306.field4106 = 0;
        class77.field955.method2510(-1);
        class327.field4786 = 0;
        class645.field9141.method2510(-1);
        class401.method2364(26061);
        class545.field7473 = 0;
        class327.field4771.method2154(true);
        class560.method3141((byte) 111);
        class521.method2977((byte) -9);
        class46.field626 = 0L;
        class335.field4940 = null;
        if (arg1) {
            class676.method3739(-22149, 12);
            return;
        }
        class676.method3739(arg0 ^ 0xFFF0EB3B, 3);
        try {
            class302.method1821(class372.field5359, 10049, "loggedout");
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IZI)I")
    public static final int method2894(int arg0, boolean arg1, int arg2) {
        field6890++;
        if (arg1) {
            return -74;
        } else if (arg2 == -1) {
            return 12345678;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(III)V")
    private class511(int arg0, int arg1, int arg2) {
    }
}
