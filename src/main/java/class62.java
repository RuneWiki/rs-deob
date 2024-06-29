import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class62 {

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "Lnga;")
    private class510 field1132 = new class510(64);

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public int field1137 = 0;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Leq;")
    private class209 field1126;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public int field1124;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "Lts;")
    public static class532 field1125;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "Lts;")
    public static class532 field1128 = field1125 = new class532(false);

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "Lnt;")
    public static class220 field1134 = new class220();

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 3)
    public static void method670(byte arg0) {
        field1134 = null;
        field1128 = null;
        field1125 = null;
        if (arg0 != 127) {
            method670((byte) 2);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIILdm;)V", line = 15)
    public static final void method671(int arg0, int arg1, int arg2, class50 arg3) {
        class647.field9166 = arg1;
        if (arg2 <= -59) {
            class456.field6596 = arg0;
            class66.field1201 = arg3;
            field1127++;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 31)
    public static final void method672(int arg0) {
        field1131++;
        if (class611.field8839 == 7) {
            class144.method1123(false, (byte) -38);
            return;
        }
        class351.field4952 = class555.field7776;
        if (arg0 != 64) {
            method677(null, true, -15, 73);
        }
        class555.field7776 = null;
        class19.method122(arg0 ^ 0x41, 13);
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V", line = 52)
    public final void method673(int arg0) {
        class510 var2 = this.field1132;
        synchronized (this.field1132) {
            this.field1132.method3048(false);
        }
        field1133++;
        if (arg0 < 115) {
            this.field1137 = -66;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V", line = 68)
    public final void method674(byte arg0) {
        class510 var2 = this.field1132;
        synchronized (this.field1132) {
            this.field1132.method3050(false);
        }
        if (arg0 != 49) {
            this.method674((byte) 74);
        }
        field1123++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)Lul;", line = 85)
    public final class569 method675(int arg0, int arg1) {
        field1136++;
        class510 var3 = this.field1132;
        class569 var4;
        synchronized (this.field1132) {
            var4 = (class569) this.field1132.method3054((byte) -113, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field1126;
        byte[] var6;
        synchronized (this.field1126) {
            var6 = this.field1126.method1453(arg0, -128, arg1);
        }
        class569 var7 = new class569();
        var7.field8097 = this;
        var7.field8096 = arg0;
        if (var6 != null) {
            var7.method3324(-87, new class35(var6));
        }
        var7.method3321(-1);
        class510 var8 = this.field1132;
        synchronized (this.field1132) {
            this.field1132.method3047(false, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)V", line = 114)
    public final void method676(byte arg0, int arg1) {
        class510 var3 = this.field1132;
        synchronized (this.field1132) {
            this.field1132.method3049(arg1, (byte) 126);
        }
        field1129++;
        if (arg0 != 27) {
            this.field1137 = -15;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ldm;ZII)V", line = 132)
    public static final void method677(class50 arg0, boolean arg1, int arg2, int arg3) {
        field1130++;
        if (class755.field10512 != null || class34.field450 || arg0 == null || class571.method3332((byte) -29, arg0) == null) {
            return;
        }
        class755.field10512 = arg0;
        class148.field2266 = class571.method3332((byte) -29, arg0);
        class246.field3441 = arg1;
        class404.field5633 = arg2;
        class593.field8316 = 0;
        class128.field1933 = arg3;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lcw;ILeq;)V", line = 165)
    public class62(class179 arg0, int arg1, class209 arg2) {
        this.field1126 = arg2;
        this.field1124 = this.field1126.method1477(0, 4);
    }
}
