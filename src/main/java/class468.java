import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class468 {

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "Lfr;")
    private class231 field6946 = new class231(64);

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    public int field6956 = 0;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "Lqs;")
    private class496 field6953;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public int field6945;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    public static int field6951 = 0;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "Lnk;")
    public static class326 field6952 = new class326(66, 4);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field6947;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public static int field6950;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "Lws;")
    public static class379 field6955;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "Lit;")
    public static class514 field6957;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
    public static void method2778(int arg0) {
        field6955 = null;
        field6957 = null;
        field6952 = null;
        int var1 = -81 / ((arg0 - 56) / 47);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)V")
    public final void method2779(int arg0, byte arg1) {
        class231 var3 = this.field6946;
        synchronized (this.field6946) {
            this.field6946.method1603((byte) -102, arg0);
        }
        field6943++;
        int var4 = -83 / ((-arg1 - 12) / 63);
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(IB)Lfv;")
    public final class471 method2780(int arg0, byte arg1) {
        field6948++;
        class231 var3 = this.field6946;
        class471 var4;
        synchronized (this.field6946) {
            var4 = (class471) this.field6946.method1593((byte) -67, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field6953;
        byte[] var6;
        synchronized (this.field6953) {
            var6 = this.field6953.method2926(arg0, arg1 - 63, 4);
            if (arg1 != -48) {
                this.method2783((byte) -101);
            }
        }
        class471 var7 = new class471();
        var7.field6984 = arg0;
        var7.field6989 = this;
        if (var6 != null) {
            var7.method2791(14, new class23(var6));
        }
        var7.method2790(-13831);
        class231 var8 = this.field6946;
        synchronized (this.field6946) {
            this.field6946.method1595(var7, (long) arg0, (byte) -104);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
    public final void method2781(byte arg0) {
        field6949++;
        int var2 = -50 % ((33 - arg0) / 52);
        class231 var3 = this.field6946;
        synchronized (this.field6946) {
            this.field6946.method1604(4);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)Z")
    public static final boolean method2782(int arg0, int arg1) {
        field6950++;
        if (class406.field6157[arg0]) {
            return true;
        } else if (class162.field2580.method2925(0, arg0)) {
            int var2 = class162.field2580.method2940(arg0, -10511);
            if (var2 == 0) {
                class406.field6157[arg0] = true;
                return true;
            }
            if (class508.field7389[arg0] == null) {
                class508.field7389[arg0] = new class68[var2];
            }
            if (arg1 != -24955) {
                return false;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class508.field7389[arg0][var3] == null) {
                    byte[] var4 = class162.field2580.method2926(var3, arg1 + 24850, arg0);
                    if (var4 != null) {
                        class68 var5 = class508.field7389[arg0][var3] = new class68();
                        var5.field1059 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method454(true, new class23(var4));
                    }
                }
            }
            class406.field6157[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V")
    public final void method2783(byte arg0) {
        class231 var2 = this.field6946;
        synchronized (this.field6946) {
            this.field6946.method1598(-114);
        }
        if (arg0 > -6) {
            this.method2783((byte) 81);
        }
        field6947++;
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lwv;ILqs;)V")
    public class468(class535 arg0, int arg1, class496 arg2) {
        this.field6953 = arg2;
        this.field6945 = this.field6953.method2940(4, -10511);
    }
}
