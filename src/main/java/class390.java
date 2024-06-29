import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class390 {

    @OriginalMember(owner = "client!om", name = "f", descriptor = "[I")
    public int[] field5445;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field5443 = 0;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field5444;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "Lha;")
    public static class475 field5440;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "Ldm;")
    public static class765 field5441;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lol;B)V")
    private final void method2342(class431 arg0, byte arg1) {
        field5444++;
        if (arg1 > -44) {
            return;
        }
        while (true) {
            int var3;
            do {
                var3 = arg0.method2557(14929);
                if (var3 == 0) {
                    return;
                }
            } while (var3 != 1);
            int var4 = arg0.method2557(14929);
            this.field5445 = new int[var4];
            for (int var5 = 0; var5 < this.field5445.length; var5++) {
                this.field5445[var5] = arg0.method2557(14929);
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BILmha;ZLmha;)I")
    public static final int method2343(byte arg0, int arg1, class422 arg2, boolean arg3, class422 arg4) {
        field5442++;
        if (arg1 == 1) {
            int var5 = arg2.field2299;
            int var6 = arg4.field2299;
            if (!arg3) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg1 == 2) {
            return class324.method1956(arg4.method2488(-1).field1139, 0, class423.field5892, arg2.method2488(-1).field1139);
        } else if (arg1 == 3) {
            if (arg2.field5871.equals("-")) {
                if (arg4.field5871.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field5871.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class324.method1956(arg4.field5871, 0, class423.field5892, arg2.field5871);
            }
        } else if (arg1 == 4) {
            if (arg2.method1136(true)) {
                return arg4.method1136(true) ? 0 : 1;
            } else if (arg4.method1136(true)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 5) {
            if (arg2.method1138(105)) {
                return arg4.method1138(97) ? 0 : 1;
            } else if (arg4.method1138(104)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 == 6) {
            if (arg2.method1140((byte) -126)) {
                return arg4.method1140((byte) -128) ? 0 : 1;
            } else if (arg4.method1140((byte) 33)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 != 7) {
            if (arg0 >= -73) {
                method2343((byte) -5, 50, null, false, null);
            }
            if (arg1 != 8) {
                return arg2.field5877 - arg4.field5877;
            }
            int var7 = arg2.field5875;
            int var8 = arg4.field5875;
            if (arg3) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var8 == -1) {
                    var8 = 1000;
                }
                if (var7 == -1) {
                    var7 = 1000;
                }
            }
            return var7 - var8;
        } else if (arg2.method1135(1)) {
            return arg4.method1135(1) ? 0 : 1;
        } else if (arg4.method1135(1)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
    public static void method2344(int arg0) {
        field5440 = null;
        if (arg0 > -48) {
            method2343((byte) 30, 89, null, false, null);
        }
        field5441 = null;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lgga;)V")
    public class390(class513 arg0) {
        byte[] var2 = arg0.method2988(6, 0);
        this.method2342(new class431(var2), (byte) -117);
        if (this.field5445 == null) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
    protected class390() {
        this.field5445 = new int[0];
    }
}
