import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class461 implements class16 {

    @OriginalMember(owner = "client!og", name = "e", descriptor = "Law;")
    private class55 field6867 = new class55(256);

    @OriginalMember(owner = "client!og", name = "f", descriptor = "Lfo;")
    private class361 field6868;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "Lfo;")
    private class361 field6863;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "[Liq;")
    private class433[] field6873;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "I")
    public static int field6877 = 0;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field6876;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "Lfo;")
    public static class361 field6872;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 4)
    public static final String method2831(long arg0, int arg1) {
        field6874++;
        class246.field3237.setTime(new Date(arg0));
        int var3 = class246.field3237.get(7);
        int var4 = class246.field3237.get(5);
        if (arg1 != 28026) {
            method2833(69);
        }
        int var5 = class246.field3237.get(2);
        int var6 = class246.field3237.get(1);
        int var7 = class246.field3237.get(11);
        int var8 = class246.field3237.get(12);
        int var9 = class246.field3237.get(13);
        return class277.field3687[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class223.field2990[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIFZ)[I", line = 34)
    public final int[] method92(int arg0, int arg1, int arg2, int arg3, float arg4, boolean arg5) {
        if (arg0 == 2384) {
            field6864++;
            return this.method2832(256, arg3).method1955(this, this.field6868, (double) arg4, (byte) 49, arg2, arg1, this.field6873[arg3].field6325);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIZIF)[F", line = 45)
    public final float[] method93(int arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5) {
        field6871++;
        if (arg0 != 7474) {
            this.field6868 = null;
        }
        return this.method2832(256, arg4).method1953(arg1, this, this.field6873[arg4].field6325, -11564, this.field6868, arg2);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)Lap;", line = 58)
    private final class335 method2832(int arg0, int arg1) {
        field6865++;
        class507 var3 = this.field6867.method324((long) arg1, 4);
        if (var3 != null) {
            return (class335) var3;
        }
        byte[] var4 = this.field6863.method2128(arg0 - 258, arg1);
        if (var4 == null) {
            return null;
        }
        if (arg0 != 256) {
            this.field6863 = null;
        }
        class335 var5 = new class335(new class396(var4));
        this.field6867.method322((long) arg1, var5, (byte) -75);
        return var5;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)Z", line = 88)
    public final boolean method91(int arg0, int arg1) {
        if (arg1 == -1221) {
            field6870++;
            class335 var3 = this.method2832(arg1 + 1477, arg0);
            return var3 != null && var3.method1952(this.field6868, this, (byte) -119);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lfo;Lfo;Lfo;)V", line = 114)
    public class461(class361 arg0, class361 arg1, class361 arg2) {
        this.field6868 = arg2;
        this.field6863 = arg1;
        class396 var4 = new class396(arg0.method2130(0, 0, -72));
        int var5 = var4.method2386(-23648);
        this.field6873 = new class433[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method2388((byte) -116) == 1) {
                this.field6873[var6] = new class433();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field6873[var7] != null) {
                this.field6873[var7].field6305 = var4.method2388((byte) -124) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field6873[var8] != null) {
                this.field6873[var8].field6311 = var4.method2388((byte) -124) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field6873[var9] != null) {
                this.field6873[var9].field6302 = var4.method2388((byte) -127) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field6873[var10] != null) {
                this.field6873[var10].field6310 = var4.method2388((byte) -123) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field6873[var11] != null) {
                this.field6873[var11].field6303 = var4.method2418(112);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field6873[var12] != null) {
                this.field6873[var12].field6317 = var4.method2418(125);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field6873[var13] != null) {
                this.field6873[var13].field6320 = var4.method2418(101);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field6873[var14] != null) {
                this.field6873[var14].field6312 = var4.method2418(111);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field6873[var15] != null) {
                this.field6873[var15].field6309 = (short) var4.method2386(-23648);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field6873[var16] != null) {
                this.field6873[var16].field6315 = var4.method2418(-124);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field6873[var17] != null) {
                this.field6873[var17].field6313 = var4.method2418(-105);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field6873[var18] != null) {
                this.field6873[var18].field6324 = var4.method2388((byte) -123) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field6873[var19] != null) {
                this.field6873[var19].field6325 = var4.method2388((byte) -116) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field6873[var20] != null) {
                this.field6873[var20].field6323 = var4.method2418(104);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field6873[var21] != null) {
                this.field6873[var21].field6322 = var4.method2388((byte) -110) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field6873[var22] != null) {
                this.field6873[var22].field6316 = var4.method2388((byte) -122) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field6873[var23] != null) {
                this.field6873[var23].field6318 = var4.method2388((byte) -118) == 1;
            }
        }
        for (int var24 = 0; var24 < var5; var24++) {
            if (this.field6873[var24] != null) {
                this.field6873[var24].field6306 = var4.method2388((byte) -123);
            }
        }
        for (int var25 = 0; var25 < var5; var25++) {
            if (this.field6873[var25] != null) {
                this.field6873[var25].field6321 = var4.method2406((byte) -68);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 105)
    public static void method2833(int arg0) {
        field6872 = null;
        if (arg0 != 1) {
            method2834(80, 40, 31);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)Liq;", line = 315)
    public final class433 method94(int arg0, byte arg1) {
        if (arg1 == -72) {
            field6869++;
            return this.field6873[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)I", line = 326)
    public static final int method2834(int arg0, int arg1, int arg2) {
        field6875++;
        int var3 = 0;
        while (arg0 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg2 >>>= 0x1;
            arg0--;
        }
        if (arg1 != 1) {
            field6872 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(FZZIII)[I", line = 349)
    public final int[] method90(float arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg2) {
            return null;
        } else {
            field6866++;
            return this.method2832(256, arg3).method1951(this.field6873[arg3].field6325, this.field6868, arg1, arg5, arg4, (byte) 83, this, (double) arg0);
        }
    }
}
