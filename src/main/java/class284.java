import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class284 {

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "Laf;")
    private class39 field4087 = new class39(64);

    @OriginalMember(owner = "client!uea", name = "m", descriptor = "Laf;")
    public class39 field4096 = new class39(2);

    @OriginalMember(owner = "client!uea", name = "l", descriptor = "Lae;")
    public class283 field4095;

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "Lae;")
    private class283 field4091;

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "I")
    public static int field4090 = 0;

    @OriginalMember(owner = "client!uea", name = "k", descriptor = "I")
    public static int field4094 = -1;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!uea", name = "e", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(II)Ltp;")
    public final class606 method1869(int arg0, int arg1) {
        field4092++;
        class39 var3 = this.field4087;
        class606 var4;
        synchronized (this.field4087) {
            var4 = (class606) this.field4087.method312(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class283 var5 = this.field4091;
        byte[] var6;
        synchronized (this.field4091) {
            var6 = this.field4091.method1849(arg0, (byte) 102, arg1);
        }
        class606 var7 = new class606();
        var7.field8490 = this;
        if (var6 != null) {
            var7.method3496(new class511(var6), arg1 ^ 0x53);
        }
        class39 var8 = this.field4087;
        synchronized (this.field4087) {
            this.field4087.method305(var7, (long) arg0, 18320);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IB)V")
    public final void method1870(int arg0, byte arg1) {
        class39 var3 = this.field4087;
        synchronized (this.field4087) {
            this.field4087.method308(-1, arg0);
        }
        field4084++;
        if (arg1 != -8) {
            this.method1872(-36);
        }
        class39 var4 = this.field4096;
        synchronized (this.field4096) {
            this.field4096.method308(arg1 + 7, arg0);
        }
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(IB)Lts;")
    public static final class41 method1871(int arg0, byte arg1) {
        field4085++;
        class41 var2 = new class41(arg0, false);
        if (arg1 != 1) {
            field4094 = 10;
        }
        return var2;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V")
    public final void method1872(int arg0) {
        field4093++;
        int var2 = -44 % ((arg0 - 57) / 46);
        class39 var3 = this.field4087;
        synchronized (this.field4087) {
            this.field4087.method319(-9);
        }
        class39 var4 = this.field4096;
        synchronized (this.field4096) {
            this.field4096.method319(-96);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Z)V")
    public final void method1873(boolean arg0) {
        field4088++;
        class39 var2 = this.field4087;
        synchronized (this.field4087) {
            this.field4087.method314(-2);
            if (arg0) {
                this.method1873(false);
            }
        }
        class39 var3 = this.field4096;
        synchronized (this.field4096) {
            this.field4096.method314(-2);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(ILgga;B)Ljava/lang/String;")
    public static final String method1874(int arg0, class511 arg1, byte arg2) {
        field4089++;
        try {
            int var3 = arg1.method3043(arg2 ^ 0x7CD9);
            if (var3 > arg0) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            if (arg2 == -112) {
                arg1.field6962 += class259.field3799.method510((byte) -58, var4, 0, arg1.field6979, var3, arg1.field6962);
                return class116.method845(var3, 0, var4, -28992);
            } else {
                return null;
            }
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Ljk;ILae;Lae;)V")
    public class284(class788 arg0, int arg1, class283 arg2, class283 arg3) {
        this.field4095 = arg3;
        this.field4091 = arg2;
        this.field4091.method1867(33, (byte) 49);
    }
}
