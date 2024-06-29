import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class347 {

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "Lvg;")
    private class49 field5573 = new class49(64);

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "Lri;")
    private class97 field5569;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public int field5567;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "Z")
    public static boolean field5566 = false;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "Lhga;")
    public static class158 field5572 = new class158(66, -2);

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLjava/lang/String;I)V")
    public static final void method2344(byte arg0, String arg1, int arg2) {
        if (arg0 != 121) {
            field5572 = null;
        }
        field5571++;
        class413 var3 = class674.method3852(2, arg2, 127);
        var3.method2633(16777215);
        var3.field6339 = arg1;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II[S)[S")
    public static final short[] method2345(int arg0, int arg1, short[] arg2) {
        field5565++;
        short[] var3 = new short[arg0];
        if (arg1 != -20836) {
            field5572 = null;
        }
        class398.method2567(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILpca;II)V")
    public static final void method2346(int arg0, class665 arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            field5570++;
            class464.field6927 = arg0;
            class101.field1678 = arg3;
            class239.field3780 = arg1;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public static void method2347(int arg0) {
        if (arg0 != -129) {
            method2345(112, -103, null);
        }
        field5572 = null;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BII)Z")
    public static final boolean method2348(byte arg0, int arg1, int arg2) {
        field5568++;
        if (arg0 <= 102) {
            return true;
        } else {
            return (arg1 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)Lir;")
    public final class25 method2349(int arg0, int arg1) {
        if (arg1 != 2146) {
            method2350((byte) -116, -9);
        }
        field5564++;
        class49 var3 = this.field5573;
        class25 var4;
        synchronized (this.field5573) {
            var4 = (class25) this.field5573.method560(false, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class97 var5 = this.field5569;
        byte[] var6;
        synchronized (this.field5569) {
            var6 = this.field5569.method926(19, arg1 ^ 0xFFFFF7E2, arg0);
        }
        class25 var7 = new class25();
        if (var6 != null) {
            var7.method417(-1, new class6(var6));
        }
        class49 var8 = this.field5573;
        synchronized (this.field5573) {
            this.field5573.method559(var7, (long) arg0, 0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BI)Z")
    public static final boolean method2350(byte arg0, int arg1) {
        field5574++;
        int var2 = arg0 & 0xFF;
        if (arg1 != -161) {
            method2350((byte) 115, -113);
        }
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class43.field600[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lei;ILri;)V")
    public class347(class162 arg0, int arg1, class97 arg2) {
        this.field5569 = arg2;
        this.field5567 = this.field5569.method949(19, 0);
    }
}
