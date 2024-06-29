import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class475 {

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    private int field6858;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field6851 = 1338;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "Lgn;")
    public static class475 field6859 = new class475(15, 8);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field6853;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field6860;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "Lkb;")
    public static class467 field6857;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2778(int arg0, byte arg1, int arg2) {
        int var3 = 32 / ((arg1 - 19) / 60);
        field6853++;
        if (((arg0 & 0x10000) != 0 | class235.method1430(true, arg2, arg0)) || class209.method1293(arg2, -108, arg0)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && class56.method419(arg2, true, arg0);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)I")
    public static final int method2779(int arg0, int arg1) {
        if (arg0 != 1594756519) {
            method2784(39);
        }
        field6855++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ZILjava/lang/Object;)[B")
    public static final byte[] method2780(boolean arg0, int arg1, Object arg2) {
        if (arg1 != -16777216) {
            method2781(5);
        }
        field6850++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg0 ? class304.method1828((byte) -101, var3) : var3;
        } else if (arg2 instanceof class444) {
            class444 var4 = (class444) arg2;
            return var4.method378((byte) -93);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
    public static final void method2781(int arg0) {
        class2.field33 = -1;
        class270.field3778 = -1;
        class495.field7547 = arg0;
        class231.field3230 = 0;
        field6854++;
    }

    @OriginalMember(owner = "client!gn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6852++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)I")
    public final int method2782(byte arg0) {
        field6856++;
        return arg0 == 41 ? this.field6858 : 90;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lhr;Ljava/lang/String;ZI)V")
    public static final void method2783(class348 arg0, String arg1, boolean arg2, int arg3) {
        field6860++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = arg3 + var4;
        int var7 = class93.field1260.method3050(250, arg1, null, false);
        int var8 = class93.field1260.method3052((byte) -128, arg1, null, 250) * 13;
        class481.field6937.method770(var5 - var4, -var4 + var6, var4 + var7 + var4, var8 - (-var4 + -var4), -16777216, 0);
        class481.field6937.method738(var5 - var4, -var4 + var6, var4 + var4 + var7, var4 + var8 + var4, -1, 0);
        arg0.method2110(null, 0, 1, -1, 0, var8, 1, var5, arg1, var6, var7, null, 0, -1, (byte) -113, null);
        class248.method1547(var4 + var4 + var7, -var4 + var5, 320, var6 - var4, var4 + var8 + var4);
        if (arg2) {
            class481.field6937.method743();
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(II)V")
    public class475(int arg0, int arg1) {
        this.field6858 = arg0;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
    public static void method2784(int arg0) {
        field6859 = null;
        field6857 = null;
        int var1 = -95 / ((arg0 - 69) / 51);
    }
}
