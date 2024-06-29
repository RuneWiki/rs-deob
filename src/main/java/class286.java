import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public abstract class class286 {

    @OriginalMember(owner = "client!np", name = "b", descriptor = "Lbj;")
    public static class131 field4032 = new class131(128);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "Lwk;")
    public static class76 field4036;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "Z")
    public static boolean field4033;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1864(boolean arg0) {
        if (arg0) {
            method1870(103, (byte) -102);
        }
        field4036 = null;
        field4032 = null;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V", line = 19)
    public static final void method1867(int arg0) {
        field4037++;
        class131 var1 = class304.field4200;
        synchronized (class304.field4200) {
            class304.field4200.method900(0);
            if (arg0 != 255) {
                field4032 = null;
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIB[B)Ljava/lang/String;", line = 34)
    public static final String method1868(int arg0, int arg1, byte arg2, byte[] arg3) {
        field4034++;
        char[] var4 = new char[arg0];
        int var5 = -6 / ((-arg2 - 19) / 59);
        int var6 = 0;
        for (int var7 = 0; var7 < arg0; var7++) {
            int var8 = arg3[arg1 + var7] & 0xFF;
            if (var8 != 0) {
                if (var8 >= 128 && var8 < 160) {
                    char var9 = class95.field1335[var8 - 128];
                    if (var9 == '\u0000') {
                        var9 = '?';
                    }
                    var8 = var9;
                }
                var4[var6++] = (char) var8;
            }
        }
        return new String(var4, 0, var6);
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILnq;)V", line = 80)
    public static final void method1869(int arg0, class268 arg1) {
        class30.field495 = arg1;
        if (arg0 != -1) {
            method1867(109);
        }
        field4031++;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IB)V", line = 91)
    public static final void method1870(int arg0, byte arg1) {
        class131 var2 = class39.field570;
        synchronized (class39.field570) {
            class39.field570.method901(arg0, 12223);
        }
        field4035++;
        class131 var3 = class450.field6291;
        synchronized (class450.field6291) {
            class450.field6291.method901(arg0, 12223);
        }
        int var4 = 103 / ((arg1 + 8) / 36);
        class131 var5 = class440.field6202;
        synchronized (class440.field6202) {
            class440.field6202.method901(arg0, 12223);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
    public abstract void method1865(byte arg0);

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(B)V")
    public abstract void method1866(byte arg0);

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(B)Lfn;")
    public abstract class73 method1871(byte arg0);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Z")
    public abstract boolean method1872(int arg0, int arg1);
}
