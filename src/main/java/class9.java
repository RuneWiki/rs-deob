import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 {

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Lfa;")
    private class156 field109 = new class156(256);

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Lfs;")
    private class387 field107;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Lbg;")
    public static class324 field105 = new class324(39, 8);

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Lbf;")
    public static class372 field113 = new class372(3, 7);

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "Lsl;")
    public static class318 field114 = new class318(78, -1);

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "[Lqc;")
    public static class521[] field115;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Z")
    public static final boolean method58(int arg0, int arg1) {
        field106++;
        if (arg1 == 18 || arg1 == 45 || arg1 == 23 || arg1 == 25 || arg1 == 1007) {
            return true;
        } else if (arg0 > -96) {
            return false;
        } else {
            return arg1 == 30 || arg1 == 1010;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static final void method59(byte arg0) {
        if (arg0 != 28) {
            return;
        }
        field110++;
        class75.field1027 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            class72.field921[var1] = null;
            class373.field5539[var1] = 1;
            class133.field1940[var1] = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
    public final void method60(byte arg0) {
        field112++;
        class156 var2 = this.field109;
        synchronized (this.field109) {
            this.field109.method1105(false);
            int var3 = 42 % ((arg0 + 51) / 63);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)V")
    public final void method61(boolean arg0, int arg1) {
        field111++;
        if (arg0) {
            class156 var3 = this.field109;
            synchronized (this.field109) {
                this.field109.method1116(arg1, -50);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
    public static final void method62(byte arg0) {
        int var1 = -53 / ((58 - arg0) / 63);
        class77.field1041.method2810(2);
        field104++;
        class372.field5534 = 1;
        class127.field1852 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public final void method63(int arg0) {
        field108++;
        if (arg0 == -2049) {
            class156 var2 = this.field109;
            synchronized (this.field109) {
                this.field109.method1119(115);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)Lrk;")
    public final class25 method64(int arg0, int arg1) {
        field103++;
        class156 var3 = this.field109;
        class25 var4;
        synchronized (this.field109) {
            var4 = (class25) this.field109.method1115((long) arg0, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field107.method2363(arg0, 26, arg1 + 128);
        class25 var6 = new class25();
        if (var5 != null) {
            var6.method216(76, new class65(var5));
        }
        class156 var7 = this.field109;
        synchronized (this.field109) {
            if (arg1 == -24) {
                this.field109.method1107(1, (long) arg0, var6);
                return var6;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public static void method65(boolean arg0) {
        field105 = null;
        field113 = null;
        field114 = null;
        field115 = null;
        if (arg0) {
            field115 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Ljk;ILfs;)V")
    public class9(class446 arg0, int arg1, class387 arg2) {
        this.field107 = arg2;
        this.field107.method2367(26, 28724);
    }
}
