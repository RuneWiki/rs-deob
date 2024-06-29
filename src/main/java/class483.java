import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class483 {

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "Lqr;")
    private class65 field6600 = new class65(64);

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "Lqr;")
    public class65 field6609 = new class65(2);

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "Lwu;")
    private class376 field6597;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "Lwu;")
    public class376 field6605;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "Lkaa;")
    public static class47 field6603 = new class47(65, -1);

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "I")
    public static int field6608 = 0;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
    public static int field6602;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
    public static int field6604;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "I")
    public static int field6606;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "[[[Lih;")
    public static class701[][][] field6607;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BI)V")
    public final void method2727(byte arg0, int arg1) {
        field6599++;
        class65 var3 = this.field6600;
        synchronized (this.field6600) {
            this.field6600.method553(arg1, -15782);
        }
        if (arg0 >= 87) {
            class65 var4 = this.field6609;
            synchronized (this.field6609) {
                this.field6609.method553(arg1, -15782);
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)Lof;")
    public final class622 method2728(int arg0, int arg1) {
        field6598++;
        class65 var3 = this.field6600;
        class622 var4;
        synchronized (this.field6600) {
            var4 = (class622) this.field6600.method552(4, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field6597;
        byte[] var6;
        synchronized (this.field6597) {
            var6 = this.field6597.method2218((byte) 127, arg1, arg0);
        }
        class622 var7 = new class622();
        var7.field8292 = this;
        if (var6 != null) {
            var7.method3424((byte) 97, new class677(var6));
        }
        class65 var8 = this.field6600;
        synchronized (this.field6600) {
            this.field6600.method556((byte) 0, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
    public final void method2729(int arg0) {
        class65 var2 = this.field6600;
        synchronized (this.field6600) {
            this.field6600.method561((byte) -78);
        }
        if (arg0 != 64) {
            return;
        }
        field6604++;
        class65 var3 = this.field6609;
        synchronized (this.field6609) {
            this.field6609.method561((byte) -78);
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V")
    public static void method2730(int arg0) {
        if (arg0 != -18039) {
            field6608 = -80;
        }
        field6603 = null;
        field6607 = null;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lfs;B)I")
    public static final int method2731(class556 arg0, byte arg1) {
        field6606++;
        class166 var2 = arg0.field7328;
        if (var2.field2575 != null) {
            var2 = var2.method1190((byte) 69, class74.field901);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2532;
        if (arg1 <= 82) {
            return -18;
        }
        class98 var4 = arg0.method4141(0);
        if (arg0.field10247 == -1 || arg0.field10304) {
            var3 = var2.field2529;
        } else if (arg0.field10247 == var4.field1209 || arg0.field10247 == var4.field1212 || arg0.field10247 == var4.field1241 || arg0.field10247 == var4.field1225) {
            var3 = var2.field2568;
        } else if (arg0.field10247 == var4.field1223 || arg0.field10247 == var4.field1263 || arg0.field10247 == var4.field1257 || arg0.field10247 == var4.field1211) {
            var3 = var2.field2578;
        }
        return var3;
    }

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "(I)V")
    public final void method2732(int arg0) {
        field6602++;
        class65 var2 = this.field6600;
        synchronized (this.field6600) {
            this.field6600.method558(0);
        }
        class65 var3 = this.field6609;
        synchronized (this.field6609) {
            this.field6609.method558(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IC)Z")
    public static final boolean method2733(int arg0, char arg1) {
        field6601++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class460.method2619(65, arg1)) {
            return true;
        } else {
            char[] var2 = class472.field6452;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            if (arg0 != -32723) {
                return true;
            }
            char[] var4 = class452.field6179;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lms;ILwu;Lwu;)V")
    public class483(class763 arg0, int arg1, class376 arg2, class376 arg3) {
        this.field6597 = arg2;
        this.field6605 = arg3;
        this.field6597.method2195(33, 0);
    }
}
