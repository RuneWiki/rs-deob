import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class315 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public int field4798;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "S")
    public short field4799;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public int field4802;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public int field4812;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public int field4809;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "B")
    public byte field4813;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public int field4806;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "S")
    public short field4814;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Z")
    public boolean field4807;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "B")
    public byte field4801;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "S")
    public short field4800;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Lhv;")
    public static class150 field4810 = new class150();

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field4811 = 0;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Llg;")
    public static class25 field4808;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BZLjava/lang/Object;)[B", line = 7)
    public static final byte[] method2093(byte arg0, boolean arg1, Object arg2) {
        field4803++;
        if (arg2 == null) {
            return null;
        }
        int var3 = -85 % ((arg0 - 36) / 59);
        if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return arg1 ? class86.method766(var4, (byte) 122) : var4;
        } else if (arg2 instanceof class199) {
            class199 var5 = (class199) arg2;
            return var5.method1028(-24533);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[BIB)I", line = 48)
    public static final int method2094(int arg0, byte[] arg1, int arg2, byte arg3) {
        field4805++;
        int var4 = -1;
        for (int var5 = arg2; var5 < arg0; var5++) {
            var4 = var4 >>> 8 ^ class322.field4901[(arg1[var5] ^ var4) & 0xFF];
        }
        int var6 = ~var4;
        int var7 = 63 / ((arg3 + 4) / 57);
        return var6;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 78)
    public static void method2095(int arg0) {
        field4810 = null;
        field4808 = null;
        if (arg0 != -20807) {
            method2096(41);
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)[Lne;", line = 89)
    public static final class139[] method2096(int arg0) {
        field4804++;
        if (arg0 != -1) {
            method2096(-98);
        }
        return new class139[] { class62.field991, class354.field5244, class238.field3584, class463.field6858, class301.field4613, class372.field5519 };
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 106)
    public class315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field4798 = arg3;
        this.field4799 = (short) arg4;
        this.field4802 = arg1;
        this.field4812 = arg11;
        this.field4809 = arg2;
        this.field4813 = (byte) arg8;
        this.field4806 = arg0;
        this.field4814 = (short) arg5;
        this.field4807 = arg10;
        this.field4801 = (byte) arg7;
        this.field4800 = (short) arg6;
    }
}
