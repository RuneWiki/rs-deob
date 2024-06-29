import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class342 {

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Luc;")
    public class59 field5020 = new class59();

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field5018 = -1;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Luc;")
    private class59 field5023;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([BZ)[B", line = 12)
    public static final byte[] method2258(byte[] arg0, boolean arg1) {
        field5028++;
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class111.method770(arg0, 0, var2, 0, arg0.length);
            return arg1 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLmb;)I", line = 32)
    public static final int method2259(byte arg0, class259 arg1) {
        field5019++;
        if (arg0 <= 101) {
            method2259((byte) 69, (class259) null);
        }
        String var2 = client.method1570(-61, arg1);
        int[] var3 = null;
        if (class425.method2728((byte) 123, arg1.field3777)) {
            var3 = class166.method1031((int) arg1.field3772, false).field2724;
        } else if (class60.method404((byte) 45, arg1.field3777)) {
            class129 var4 = class23.field408[(int) arg1.field3772];
            if (var4 != null) {
                var3 = var4.field1714.field5616;
            }
        } else if (class433.method2747(arg1.field3777, (byte) -102)) {
            if (arg1.field3777 == 1009) {
                var3 = class165.method1020((int) arg1.field3772, 121).field6001;
            } else {
                var3 = class165.method1020((int) (arg1.field3772 >>> 32 & 0x7FFFFFFFL), 113).field6001;
            }
        }
        if (var3 != null) {
            var2 = var2 + class88.method544(105, var3);
        }
        return class272.field3986.method1022(class417.field6208, var2, (byte) -43);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)Luc;", line = 76)
    public final class59 method2260(int arg0) {
        if (arg0 != 28148) {
            return null;
        }
        field5026++;
        class59 var2 = this.field5023;
        if (this.field5020 == var2) {
            this.field5023 = null;
            return null;
        } else {
            this.field5023 = var2.field859;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V", line = 111)
    public class342() {
        this.field5020.field860 = this.field5020;
        this.field5020.field859 = this.field5020;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILuc;)V", line = 120)
    public final void method2261(int arg0, class59 arg1) {
        if (arg0 != 0) {
            return;
        }
        if (arg1.field860 != null) {
            arg1.method401(5);
        }
        field5025++;
        arg1.field859 = this.field5020;
        arg1.field860 = this.field5020.field860;
        arg1.field860.field859 = arg1;
        arg1.field859.field860 = arg1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)Luc;", line = 138)
    public final class59 method2262(byte arg0) {
        field5024++;
        if (arg0 < 37) {
            method2259((byte) 30, (class259) null);
        }
        class59 var2 = this.field5020.field859;
        if (this.field5020 == var2) {
            this.field5023 = null;
            return null;
        } else {
            this.field5023 = var2.field859;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V", line = 159)
    public final void method2263(boolean arg0) {
        while (true) {
            class59 var2 = this.field5020.field859;
            if (this.field5020 == var2) {
                if (arg0) {
                    return;
                }
                field5022++;
                this.field5023 = null;
                return;
            }
            var2.method401(5);
        }
    }
}
