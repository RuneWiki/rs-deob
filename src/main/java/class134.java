import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class134 extends class403 {

    @OriginalMember(owner = "client!nt", name = "K", descriptor = "I")
    private int field1957;

    @OriginalMember(owner = "client!nt", name = "F", descriptor = "I")
    public static int field1954 = 1339;

    @OriginalMember(owner = "client!nt", name = "B", descriptor = "[Ljava/lang/String;")
    public static String[] field1950 = new String[8];

    @OriginalMember(owner = "client!nt", name = "P", descriptor = "Lmc;")
    public static class78 field1962;

    @OriginalMember(owner = "client!nt", name = "Q", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!nt", name = "C", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!nt", name = "E", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!nt", name = "H", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!nt", name = "J", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!nt", name = "L", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!nt", name = "M", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!nt", name = "O", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!nt", name = "N", descriptor = "[Lnd;")
    public class352[] field1960;

    @OriginalMember(owner = "client!nt", name = "D", descriptor = "[[B")
    private byte[][] field1952;

    static {
        new class206("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field1962 = new class78(76, -1);
        field1963 = 0;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(IB)Z", line = 7)
    public final boolean method814(int arg0, byte arg1) {
        if (arg1 < 6) {
            return true;
        } else {
            field1955++;
            return this.field1960[arg0].field4892;
        }
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)V", line = 18)
    public static void method815(int arg0) {
        if (arg0 != 5384) {
            field1962 = null;
        }
        field1962 = null;
        field1950 = null;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Z", line = 30)
    public final boolean method816(int arg0, int arg1) {
        if (arg0 != 255) {
            field1950 = null;
        }
        field1958++;
        return this.field1960[arg1].field4884;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IZII)I", line = 43)
    public static final int method817(int arg0, boolean arg1, int arg2, int arg3) {
        field1951++;
        if (arg2 != 65280) {
            method815(-83);
        }
        class257 var4 = class80.method525(arg1, -7967, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var4.field3415.length) {
            return var4.field3415[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIIIIIIIIII)V", line = 63)
    public static final void method818(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field1956++;
        if (class221.field2945 == null) {
            return;
        }
        class86 var15;
        if (arg8 < 0) {
            int var14 = -arg8 - 1;
            if (class332.field4494 == var14) {
                var15 = class233.field3103;
            } else {
                var15 = class413.field5644[var14];
            }
        } else {
            int var16 = arg8 - 1;
            var15 = class221.field2941[var16];
        }
        if (var15 == null) {
            return;
        }
        class88 var17 = class1.field23.method935(arg1, (byte) -44);
        int var18;
        int var19;
        if (arg10 == 1 || arg10 == 3) {
            var18 = var17.field1249;
            var19 = var17.field1305;
        } else {
            var18 = var17.field1305;
            var19 = var17.field1249;
        }
        int var20 = (var18 >> 1) + arg0;
        int var21 = -17 / ((64 - arg11) / 42);
        int var22 = arg0 + (var18 + 1 >> 1);
        int var23 = (var19 >> 1) + arg12;
        int var24 = (var19 + 1 >> 1) + arg12;
        class177 var25 = class221.field2945[arg13];
        int var26 = var25.method371(var20, var23) + var25.method371(var22, var23) + (var25.method371(var20, var24) - -var25.method371(var22, var24)) >> 2;
        class160 var27 = new class160();
        var27.field2215 = var15.field6502;
        var27.field2224 = class70.field968 + arg3;
        var27.field2205 = class70.field968 + arg7;
        var27.field2223 = arg0;
        var27.field2214 = arg12;
        var27.field2217 = arg1;
        if (arg5 < arg4) {
            int var28 = arg4;
            arg4 = arg5;
            arg5 = var28;
        }
        var27.field2222 = arg9;
        var27.field2216 = arg10;
        if (arg6 > arg2) {
            int var29 = arg6;
            arg6 = arg2;
            arg2 = var29;
        }
        var27.field2213 = arg0 + arg4;
        var27.field2212 = arg0 + arg5;
        var27.field2209 = (var27.field2223 << 7) + (var18 << 6);
        var27.field2207 = arg6 + arg12;
        var27.field2206 = (var27.field2214 << 7) + (var19 << 6);
        var27.field2218 = arg2 + arg12;
        var27.field2219 = var26;
        class347.field4785.method641(var27, (byte) -93);
        var15.field1201 = var27;
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(I)Z", line = 169)
    public final boolean method819(int arg0) {
        field1959++;
        if (this.field1960 != null) {
            return true;
        }
        if (this.field1952 == null) {
            if (!class291.field3911.method684((byte) -47, this.field1957)) {
                return false;
            }
            int[] var2 = class291.field3911.method690(this.field1957, true);
            this.field1952 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field1952[var3] = class291.field3911.method702((byte) -80, var2[var3], this.field1957);
            }
        }
        boolean var4 = true;
        for (int var5 = arg0; var5 < this.field1952.length; var5++) {
            byte[] var14 = this.field1952[var5];
            int var15 = var14[1] & 0xFF | var14[0] & 0xFF << 8;
            var4 &= class107.field1607.method700((byte) 125, var15);
        }
        if (!var4) {
            return false;
        }
        class105 var6 = new class105();
        int var7 = class291.field3911.method694(this.field1957, (byte) 119);
        this.field1960 = new class352[var7];
        int[] var8 = class291.field3911.method690(this.field1957, true);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field1952[var9];
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            class96 var12 = null;
            for (class96 var13 = (class96) var6.method652((byte) 37); var13 != null; var13 = (class96) var6.method653(80)) {
                if (var13.field1409 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class96(var11, class107.field1607.method695(var11, -127));
                var6.method641(var12, (byte) -93);
            }
            this.field1960[var8[var9]] = new class352(var10, var12);
        }
        this.field1952 = null;
        return true;
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(I)V", line = 265)
    public class134(int arg0) {
        this.field1957 = arg0;
    }
}
