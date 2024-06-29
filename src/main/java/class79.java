import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class79 extends class344 {

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "Lve;")
    public static class331 field939 = new class331(5000);

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "[I")
    public static int[] field943 = new int[50];

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "[I")
    public static int[] field944 = new int[2048];

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "Lpn;")
    public static class72 field949 = new class72(5, 3);

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
    public int field947;

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!sj", name = "V", descriptor = "Lue;")
    public static class142 field951;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "Lhc;")
    public class398 field945;

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "[B")
    public byte[] field946;

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "[Lrg;")
    public static class395[] field950;

    @OriginalMember(owner = "client!sj", name = "W", descriptor = "[[[I")
    public static int[][][] field952;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(B)[B")
    public final byte[] method294(byte arg0) {
        ++field940;
        if (arg0 <= 1) {
            this.field946 = null;
        }
        if (super.field4927) {
            throw new RuntimeException();
        } else {
            return this.field946;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)I")
    public final int method295(int arg0) {
        if (arg0 != 5) {
            field951 = null;
        }
        ++field942;
        return super.field4927 ? 0 : 100;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([I[[BIBI[[B[B[I)I")
    public static final int method396(int[] arg0, byte[][] arg1, int arg2, byte arg3, int arg4, byte[][] arg5, byte[] arg6, int[] arg7) {
        ++field948;
        int var8 = arg0[arg4];
        int var9 = arg7[arg4] + var8;
        int var10 = arg0[arg2];
        int var11 = arg7[arg2] + var10;
        int var12 = var8;
        if (~var8 > ~var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (~var9 < ~var11) {
            var13 = var11;
        }
        int var14 = 255 & arg6[arg4];
        if ((255 & arg6[arg2]) < var14) {
            var14 = arg6[arg2] & 255;
        }
        byte[] var15 = arg5[arg4];
        byte[] var16 = arg1[arg2];
        int var17 = var12 - var8;
        int var18 = -var10 + var12;
        int var19 = var12;
        if (arg3 != 92) {
            field943 = null;
        }
        while (var19 < var13) {
            int var20 = var16[var18++] + var15[var17++];
            if (~var14 < ~var20) {
                var14 = var20;
            }
            ++var19;
        }
        return -var14;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Leg;ILg;)V")
    public static final void method397(class394 arg0, int arg1, class470 arg2) {
        class362.field5218 = arg2;
        ++field938;
        class128.field1585 = arg0;
        if (arg1 != 100) {
            method398((byte[]) null, (byte) -89);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([BB)[B")
    public static final byte[] method398(byte[] arg0, byte arg1) {
        ++field937;
        class179 var2 = new class179(arg0);
        if (arg1 < 84) {
            field939 = null;
        }
        int var3 = var2.method895((byte) -86);
        int var4 = var2.method939((byte) 50);
        if (var4 < 0 || ~class282.field4113 != -1 && var4 > class282.field4113) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method919(false, var7, var4, 0);
            return var7;
        } else {
            int var5 = var2.method939((byte) -59);
            if (~var5 <= -1 && (class282.field4113 == 0 || ~var5 >= ~class282.field4113)) {
                byte[] var6 = new byte[var5];
                if (~var3 != -2) {
                    class278.field3968.method1327(1, var2, var6);
                } else {
                    class339.method2055(var6, var5, arg0, var4, 9);
                }
                return var6;
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BII)B")
    public static final byte method399(byte arg0, int arg1, int arg2) {
        ++field941;
        if (arg0 != -16) {
            field944 = null;
        }
        if (~arg2 != -10) {
            return 0;
        } else {
            return (byte) (~(arg1 & 1) != -1 ? 2 : 1);
        }
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V")
    public static void method400(int arg0) {
        field943 = null;
        if (arg0 != 32765) {
            method398((byte[]) null, (byte) -119);
        }
        field951 = null;
        field950 = null;
        field944 = null;
        field939 = null;
        field952 = null;
        field949 = null;
    }
}
