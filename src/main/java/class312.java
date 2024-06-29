import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class312 {

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "Ljava/lang/String;")
    private String field4634 = "null";

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Lfc;")
    public static class235 field4626 = new class235(86, 6);

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4636 = new CRC32();

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "Lkf;")
    public static class229 field4637 = new class229(2);

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    public static int field4638 = 0;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "C")
    public char field4621;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "C")
    public char field4628;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    private int field4620;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "Loj;")
    private class346 field4627;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "Loj;")
    public class346 field4630;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 6)
    private final void method1911(int arg0) {
        field4623++;
        if (arg0 != 2) {
            return;
        }
        this.field4627 = new class346(this.field4630.method2058(arg0 ^ 0xFFFFFFFD));
        for (class615 var2 = (class615) this.field4630.method2066(false); var2 != null; var2 = (class615) this.field4630.method2062(arg0 - 19706)) {
            class656 var3 = new class656(var2.field8520, (int) var2.field7311);
            this.field4627.method2063(class166.method1146(var2.field8520, (byte) -30), 1, var3);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 33)
    private final void method1912(byte arg0) {
        this.field4627 = new class346(this.field4630.method2058(-1));
        if (arg0 < 83) {
            return;
        }
        field4632++;
        for (class108 var2 = (class108) this.field4630.method2066(false); var2 != null; var2 = (class108) this.field4630.method2062(-19704)) {
            class108 var3 = new class108((int) var2.field7311);
            this.field4627.method2063((long) var2.field1479, 1, var3);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjr;)V", line = 55)
    public final void method1913(int arg0, class96 arg1) {
        if (arg0 != -27481) {
            return;
        }
        field4631++;
        while (true) {
            int var3 = arg1.method718(-88);
            if (var3 == 0) {
                return;
            }
            this.method1920((byte) -50, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V", line = 80)
    public static void method1914(byte arg0) {
        field4637 = null;
        field4636 = null;
        if (arg0 != -2) {
            field4637 = null;
        }
        field4626 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Ljava/lang/String;", line = 92)
    public final String method1915(int arg0, int arg1) {
        field4624++;
        if (arg1 <= 95) {
            this.method1916(-48, 43);
        }
        if (this.field4630 == null) {
            return this.field4634;
        } else {
            class615 var3 = (class615) this.field4630.method2061(-17305, (long) arg0);
            return var3 == null ? this.field4634 : var3.field8520;
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)Z", line = 114)
    public final boolean method1916(int arg0, int arg1) {
        field4629++;
        if (arg1 != 6) {
            this.field4621 = 'L';
        }
        if (this.field4630 == null) {
            return false;
        }
        if (this.field4627 == null) {
            this.method1912((byte) 86);
        }
        class108 var3 = (class108) this.field4627.method2061(-17305, (long) arg0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 137)
    public final boolean method1917(int arg0, String arg1) {
        field4635++;
        if (this.field4630 == null) {
            return false;
        }
        if (this.field4627 == null) {
            this.method1911(2);
        }
        for (class656 var3 = (class656) this.field4627.method2061(-17305, class166.method1146(arg1, (byte) -30)); var3 != null; var3 = (class656) this.field4627.method2064(6654)) {
            if (var3.field9241.equals(arg1)) {
                return true;
            }
        }
        if (arg0 <= 81) {
            field4626 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(II)I", line = 165)
    public static final int method1918(int arg0, int arg1) {
        field4633++;
        int var2 = -74 % ((arg1 - 43) / 58);
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)I", line = 175)
    public final int method1919(byte arg0, int arg1) {
        field4625++;
        if (arg0 >= -31) {
            this.method1915(69, 7);
        }
        if (this.field4630 == null) {
            return this.field4620;
        } else {
            class108 var3 = (class108) this.field4630.method2061(-17305, (long) arg1);
            return var3 == null ? this.field4620 : var3.field1479;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLjr;I)V", line = 215)
    private final void method1920(byte arg0, class96 arg1, int arg2) {
        if (arg2 == 1) {
            this.field4628 = class274.method1671(arg1.method748(-813976688), true);
        } else if (arg2 == 2) {
            this.field4621 = class274.method1671(arg1.method748(-813976688), true);
        } else if (arg2 == 3) {
            this.field4634 = arg1.method739(108);
        } else if (arg2 == 4) {
            this.field4620 = arg1.method714(false);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method743((byte) -13);
            this.field4630 = new class346(class350.method2082(126, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method714(false);
                class539 var7;
                if (arg2 == 5) {
                    var7 = new class615(arg1.method739(-4));
                } else {
                    var7 = new class108(arg1.method714(false));
                }
                this.field4630.method2063((long) var6, 1, var7);
            }
        }
        if (arg0 >= -48) {
            this.method1913(-77, null);
        }
        field4622++;
    }
}
