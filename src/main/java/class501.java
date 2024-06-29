import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class501 {

    @OriginalMember(owner = "client!ria", name = "c", descriptor = "Z")
    public boolean field7002 = false;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "Z")
    public boolean field7000 = false;

    @OriginalMember(owner = "client!ria", name = "j", descriptor = "I")
    public int field7009 = 64;

    @OriginalMember(owner = "client!ria", name = "i", descriptor = "I")
    public int field7008 = 1;

    @OriginalMember(owner = "client!ria", name = "e", descriptor = "I")
    public int field7004 = -1;

    @OriginalMember(owner = "client!ria", name = "h", descriptor = "I")
    public int field7007 = 2;

    @OriginalMember(owner = "client!ria", name = "p", descriptor = "I")
    public int field7015 = 64;

    @OriginalMember(owner = "client!ria", name = "d", descriptor = "[I")
    public static int[] field7003 = new int[4096];

    @OriginalMember(owner = "client!ria", name = "k", descriptor = "Lbh;")
    public static class538 field7010 = new class538(20);

    @OriginalMember(owner = "client!ria", name = "q", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field7016 = new CRC32();

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!ria", name = "g", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!ria", name = "l", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!ria", name = "m", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!ria", name = "n", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!ria", name = "o", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!ria", name = "f", descriptor = "Lcj;")
    public static class443 field7005;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(B)V", line = 8)
    public static final void method2992(byte arg0) {
        field7001++;
        for (class6 var1 = (class6) class478.field6510.method3118((byte) 73); var1 != null; var1 = (class6) class478.field6510.method3111(119)) {
            if (class282.method1686(var1.field60, -6)) {
                class417.method2536(-41, var1);
            }
        }
        if (arg0 != -50) {
            method2992((byte) -34);
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Z)V", line = 34)
    public static void method2993(boolean arg0) {
        if (arg0) {
            field7016 = null;
        }
        field7010 = null;
        field7016 = null;
        field7003 = null;
        field7005 = null;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lvj;BI)V", line = 51)
    public final void method2994(class26 arg0, byte arg1, int arg2) {
        while (true) {
            int var4 = arg0.method194((byte) 119);
            if (var4 == 0) {
                if (arg1 <= 59) {
                    field7010 = null;
                }
                field7012++;
                return;
            }
            this.method2995(arg2, var4, arg0, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IILvj;B)V", line = 72)
    private final void method2995(int arg0, int arg1, class26 arg2, byte arg3) {
        if (arg1 == 1) {
            this.field7004 = arg2.method193(2);
            if (this.field7004 == 65535) {
                this.field7004 = -1;
            }
        } else if (arg1 == 2) {
            this.field7009 = arg2.method193(2) + 1;
            this.field7015 = arg2.method193(2) + 1;
        } else if (arg1 == 3) {
            arg2.method195(128);
        } else if (arg1 == 4) {
            this.field7007 = arg2.method194((byte) 119);
        } else if (arg1 == 5) {
            this.field7008 = arg2.method194((byte) 119);
        } else if (arg1 == 6) {
            this.field7000 = true;
        } else if (arg1 == 7) {
            this.field7002 = true;
        }
        if (arg3 <= 36) {
            this.field7008 = -36;
        }
        field7013++;
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IILjava/lang/String;)V", line = 137)
    public static final void method2996(int arg0, int arg1, String arg2) {
        field7014++;
        class118 var3 = class126.method814(true, arg1, 2);
        var3.method771(-30559);
        var3.field1638 = arg2;
        int var4 = -38 % ((arg0 + 57) / 43);
    }

    @OriginalMember(owner = "client!ria", name = "b", descriptor = "(B)V", line = 153)
    public static final void method2997(byte arg0) {
        field7011++;
        class647.method3754(11, true);
        class154.method976(0);
        System.gc();
        if (arg0 != 5) {
            method2993(false);
        }
    }
}
