import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class6 extends class164 {

    @OriginalMember(owner = "client!dg", name = "Ab", descriptor = "I")
    public static int field71 = 0;

    @OriginalMember(owner = "client!dg", name = "Cb", descriptor = "Lph;")
    public static class229 field73 = class266.method1858("<br>(X100(U(Y", 0);

    @OriginalMember(owner = "client!dg", name = "yb", descriptor = "Lph;")
    public static class229 field69 = class266.method1858("<col=ffffff>", 0);

    @OriginalMember(owner = "client!dg", name = "zb", descriptor = "Lph;")
    public static class229 field70 = class266.method1858(":", 0);

    @OriginalMember(owner = "client!dg", name = "Hb", descriptor = "Lph;")
    public static class229 field78 = class266.method1858(" s(West d-Bconnect-B)3", 0);

    @OriginalMember(owner = "client!dg", name = "Qb", descriptor = "I")
    public static int field87 = 0;

    @OriginalMember(owner = "client!dg", name = "xb", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!dg", name = "Db", descriptor = "I")
    private int field74;

    @OriginalMember(owner = "client!dg", name = "Eb", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!dg", name = "Fb", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!dg", name = "Gb", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!dg", name = "Ib", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!dg", name = "Jb", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!dg", name = "Kb", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!dg", name = "Lb", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!dg", name = "Nb", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!dg", name = "Ob", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!dg", name = "Pb", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!dg", name = "Rb", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!dg", name = "Sb", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!dg", name = "Bb", descriptor = "Lbf;")
    private class114 field72;

    @OriginalMember(owner = "client!dg", name = "Mb", descriptor = "Lsi;")
    public static class66 field83;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "(I)I", line = 9)
    public final int method31(int arg0) {
        field75++;
        if (arg0 != -27227) {
            this.method31(87);
        }
        return this.field2668[this.field2670++] - this.field72.method865(false) & 0xFF;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 24)
    public static final void method32(int arg0, Component arg1) {
        field76++;
        Method var2 = class92.field1566;
        if (arg0 != -15012) {
            field71 = 31;
        }
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class251.field4208);
        arg1.addFocusListener(class251.field4208);
    }

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "(I)V", line = 55)
    public static void method33(int arg0) {
        field73 = null;
        if (arg0 != 3183) {
            method42((byte) 9, -52);
        }
        field83 = null;
        field78 = null;
        field70 = null;
        field69 = null;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(I)V", line = 68)
    public class6(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "(II)I", line = 74)
    public final int method34(int arg0, int arg1) {
        field68++;
        int var3 = -113 / ((arg0 - 74) / 35);
        int var4 = this.field74 >> 3;
        int var5 = 8 - (this.field74 & 0x7);
        int var6 = 0;
        this.field74 += arg1;
        while (arg1 > var5) {
            var6 += (this.field2668[var4++] & class224.field3675[var5]) << arg1 - var5;
            arg1 -= var5;
            var5 = 8;
        }
        int var7;
        if (arg1 == var5) {
            var7 = (class224.field3675[var5] & this.field2668[var4]) + var6;
        } else {
            var7 = (this.field2668[var4] >> var5 - arg1 & class224.field3675[arg1]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "(B)V", line = 107)
    public final void method35(byte arg0) {
        if (arg0 < 57) {
            this.field74 = -11;
        }
        field80++;
        this.field2670 = (this.field74 + 7) / 8;
    }

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "(II)I", line = 119)
    public final int method36(int arg0, int arg1) {
        field84++;
        if (arg1 != 8) {
            field70 = (class229) null;
        }
        return arg0 * 8 - this.field74;
    }

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "(II)V", line = 130)
    public final void method37(int arg0, int arg1) {
        field82++;
        if (arg0 < 13) {
            field69 = (class229) null;
        }
        this.field2668[this.field2670++] = (byte) (this.field72.method865(false) + arg1);
    }

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "(II)Lti;", line = 142)
    public static final class156 method38(int arg0, int arg1) {
        class156 var2 = (class156) class105.field1786.method1413((long) arg1, true);
        if (arg0 != -31037) {
            return (class156) null;
        }
        field89++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class294.field4815.method523(-52, class156.method1122(arg1, -120), class88.method661(true, arg1));
        class156 var4 = new class156();
        if (var3 != null) {
            var4.method1125(new class164(var3), arg0 ^ 0x7951);
        }
        class105.field1786.method1419((long) arg1, 5216, var4);
        return var4;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[I)V", line = 182)
    public final void method39(int arg0, int[] arg1) {
        this.field72 = new class114(arg1);
        field79++;
        if (arg0 != -483455965) {
            this.method31(-56);
        }
    }

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "(I)V", line = 195)
    public final void method40(int arg0) {
        this.field74 = this.field2670 * arg0;
        field86++;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BII[B)V", line = 205)
    public final void method41(byte arg0, int arg1, int arg2, byte[] arg3) {
        field88++;
        for (int var5 = 0; var5 < arg2; var5++) {
            arg3[arg1 + var5] = (byte) (this.field2668[this.field2670++] - this.field72.method865(false));
        }
        if (arg0 != -32) {
            this.method41((byte) -32, 98, -51, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(BI)V", line = 223)
    public static final void method42(byte arg0, int arg1) {
        field85++;
        if (arg1 == -1) {
            return;
        }
        if (arg0 <= 108) {
            field69 = (class229) null;
        }
        if (!class69.method542(arg1, -1)) {
            return;
        }
        class301[] var2 = class37.field604[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class301 var4 = var2[var3];
            if (var4.field5047 != null) {
                class157 var5 = new class157();
                var5.field2552 = var4.field5047;
                var5.field2551 = var4;
                class315.method2139(var5, 2000000, (byte) 127);
            }
        }
    }
}
