import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class451 {

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "Ltq;")
    private class536 field5890 = new class536(64);

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "Lwm;")
    private class30 field5886;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public int field5883;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "Luw;")
    public static class208 field5891 = new class208(38, 7);

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "F")
    public static float field5885;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "Lpj;")
    public static class44 field5893;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5894;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "Z")
    public static boolean field5882;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 5)
    public static void method2567(int arg0) {
        field5893 = null;
        field5894 = null;
        field5891 = null;
        if (arg0 >= -87) {
            field5891 = null;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)V", line = 17)
    public final void method2568(byte arg0) {
        class536 var2 = this.field5890;
        synchronized (this.field5890) {
            if (arg0 != -118) {
                field5892 = 20;
            }
            this.field5890.method2932((byte) 80);
        }
        field5884++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIII)I", line = 34)
    public static final int method2569(int arg0, int arg1, int arg2, int arg3) {
        field5881++;
        int var4 = ((arg1 & arg0) * arg3 & 0xFF00FF00 | (arg0 & 0xFF00) * arg3 & 0xFF0000) >>> 8;
        int var5 = 255 - arg3;
        return (((arg2 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg2 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Lega;ILwm;)V", line = 111)
    public class451(class473 arg0, int arg1, class30 arg2) {
        this.field5886 = arg2;
        if (this.field5886 == null) {
            this.field5883 = 0;
        } else {
            this.field5883 = this.field5886.method138(0, 16);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V", line = 54)
    public final void method2570(byte arg0) {
        class536 var2 = this.field5890;
        synchronized (this.field5890) {
            if (arg0 != 34) {
                this.method2572(-126, 43);
            }
            this.field5890.method2919(0);
        }
        field5887++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)V", line = 68)
    public final void method2571(int arg0, byte arg1) {
        if (arg1 != 85) {
            field5894 = null;
        }
        field5889++;
        class536 var3 = this.field5890;
        synchronized (this.field5890) {
            this.field5890.method2928(true, arg0);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)Laq;", line = 81)
    public final class329 method2572(int arg0, int arg1) {
        field5888++;
        class536 var3 = this.field5890;
        class329 var4;
        synchronized (this.field5890) {
            var4 = (class329) this.field5890.method2931((long) arg1, (byte) -89);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field5886;
        byte[] var6;
        synchronized (this.field5886) {
            var6 = this.field5886.method139(16, (byte) -94, arg1);
        }
        class329 var7 = new class329();
        if (arg0 >= -58) {
            this.field5883 = -27;
        }
        if (var6 != null) {
            var7.method1910(new class234(var6), (byte) 98);
        }
        class536 var8 = this.field5890;
        synchronized (this.field5890) {
            this.field5890.method2918((long) arg1, var7, 92);
            return var7;
        }
    }
}
