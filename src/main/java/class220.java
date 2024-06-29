import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class220 implements class72 {

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "Z")
    private boolean field3688 = false;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    private int field3694 = 50;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "Lda;")
    private class22 field3699;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "Lda;")
    private class22 field3701;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "Lod;")
    private class127 field3667;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "[B")
    private byte[] field3672;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "[Z")
    private boolean[] field3675;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "[Z")
    private boolean[] field3693;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "[S")
    private short[] field3678;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "[Z")
    private boolean[] field3689;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "[B")
    private byte[] field3680;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "[Z")
    private boolean[] field3684;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "[Z")
    private boolean[] field3704;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "[B")
    private byte[] field3677;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "[B")
    private byte[] field3665;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Lce;")
    public static class10 field3676 = null;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Lij;")
    public static class50 field3681 = class78.method578(126, "null");

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Z")
    public static boolean field3683 = false;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "Lij;")
    public static class50 field3700 = class78.method578(124, "scrollen:");

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "Lij;")
    private static class50 field3697 = class78.method578(121, "Use");

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Lij;")
    public static class50 field3686 = field3697;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field3679;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "[Ljd;")
    public static class85[] field3671;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "[S")
    public static short[] field3682;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([Lij;Z[S)V")
    public static final void method1503(class50[] arg0, boolean arg1, short[] arg2) {
        if (!arg1) {
            field3686 = null;
        }
        class252.method1707(arg0, -114, arg0.length - 1, arg2, 0);
        field3666++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)Z")
    public final boolean method542(int arg0, int arg1) {
        int var3 = -26 / ((arg0 + 43) / 55);
        field3687++;
        return this.field3693[arg1];
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(BI)Z")
    public final boolean method547(byte arg0, int arg1) {
        field3692++;
        if (this.field3688 || this.field3689[arg1]) {
            return true;
        } else {
            if (arg0 > -74) {
                method1509(2, -67, -38, 0);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(BI)Lad;")
    private final class210 method1504(byte arg0, int arg1) {
        field3670++;
        class210 var3 = (class210) this.field3667.method912((long) arg1, (byte) 46);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field3701.method190((byte) -127, 0, arg1);
        if (var4 == null) {
            return null;
        }
        class217 var5 = new class217(var4);
        if (arg0 >= -96) {
            this.method1504((byte) 19, 110);
        }
        class210 var6 = new class210(var5);
        this.field3667.method913(var6, 115, (long) arg1);
        return var6;
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(II)V")
    public final void method1505(int arg0, int arg1) {
        for (class210 var3 = (class210) this.field3667.method910(false); var3 != null; var3 = (class210) this.field3667.method914(50)) {
            if (var3.field3488) {
                var3.method1404((byte) 117, arg1);
                var3.field3488 = false;
            }
        }
        if (arg0 != 25239) {
            this.method1505(-16, -26);
        }
        field3685++;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)Z")
    public final boolean method544(int arg0, int arg1) {
        if (arg0 < 18) {
            this.field3672 = null;
        }
        field3673++;
        return this.field3704[arg1];
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
    public static final void method1506(int arg0, int arg1, int arg2) {
        field3668++;
        int[] var3 = new int[4];
        int var4 = 1;
        int[] var5 = new int[4];
        var5[0] = arg1;
        var3[0] = arg0;
        if (arg2 != 10169) {
            field3681 = null;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            if (class244.field4251[var6] != arg1) {
                var5[var4] = class244.field4251[var6];
                var3[var4] = class179.field2988[var6];
                var4++;
            }
        }
        class179.field2988 = var3;
        class244.field4251 = var5;
        class33.method272(class243.field4244, 0, class243.field4244.length - 1, true);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
    public final void method1507(int arg0, boolean arg1) {
        this.field3688 = arg1;
        if (arg0 != 4609) {
            this.field3678 = null;
        }
        this.method1510(arg0 ^ 0xFFFFED85);
        field3674++;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(II)Z")
    public final boolean method546(int arg0, int arg1) {
        field3679++;
        if (arg1 != -48) {
            this.method1510(104);
        }
        class210 var3 = this.method1504((byte) -126, arg0);
        return var3 == null ? false : var3.method1407(this.field3699, -20662, this);
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(II)I")
    public final int method545(int arg0, int arg1) {
        field3695++;
        if (arg0 != -5423) {
            this.field3704 = null;
        }
        return this.field3678[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(FII)[I")
    public final int[] method541(float arg0, int arg1, int arg2) {
        if (arg2 != -29535) {
            field3681 = null;
        }
        field3696++;
        class210 var4 = this.method1504((byte) -113, arg1);
        if (var4 == null) {
            return null;
        } else {
            var4.field3488 = true;
            return var4.method1408(this, arg0, (byte) -115, this.field3699, this.field3688 || this.field3689[arg1]);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(IZ)V")
    public static final void method1508(int arg0, boolean arg1) {
        field3669++;
        byte[][] var2 = class120.field2113;
        byte var3 = 4;
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var11 = (class252.field4371[var5] >> 8) * 64 - class61.field1124;
            int var12 = (class252.field4371[var5] & 0xFF) * 64 - class254.field4394;
            byte[] var13 = var2[var5];
            if (var13 != null) {
                class244.method1665(0);
                class3.method15(class20.field422 * 8 - 48, -3, var13, var11, arg1, var12, class45.field826, class31.field619 * 8 - 48);
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class252.field4371[var6] & 0xFF) * 64 - class254.field4394;
            int var8 = (class252.field4371[var6] >> 8) * 64 - class61.field1124;
            byte[] var9 = var2[var6];
            if (var9 == null && class20.field422 < 800) {
                class244.method1665(0);
                for (int var10 = 0; var10 < var3; var10++) {
                    class204.method1379(var10, var8, -1, 64, 64, var7);
                }
            }
        }
        if (arg0 > -64) {
            field3676 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)I")
    public static final int method1509(int arg0, int arg1, int arg2, int arg3) {
        field3703++;
        int var4 = arg0 / arg1;
        int var5 = arg1 - 1 & arg0;
        int var6 = arg2 & arg1 - 1;
        int var7 = arg2 / arg1;
        int var8 = class237.method1610((byte) 57, var4, var7);
        int var9 = class237.method1610((byte) 57, var4 + 1, var7);
        int var10 = class237.method1610((byte) 57, var4, var7 + 1);
        int var11 = class237.method1610((byte) 57, var4 + 1, var7 + 1);
        int var12 = class87.method693(arg1, var8, var5, arg3 + 29067, var9);
        if (arg3 != 0) {
            field3686 = null;
        }
        int var13 = class87.method693(arg1, var10, var5, arg3 + 29067, var11);
        return class87.method693(arg1, var12, var6, arg3 + 29067, var13);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)[I")
    public final int[] method543(byte arg0, int arg1) {
        field3691++;
        class210 var3 = this.method1504((byte) -108, arg1);
        if (arg0 != 25) {
            field3671 = null;
        }
        return var3 == null ? null : var3.method1403(this.field3699, this, this.field3688 || this.field3689[arg1], (byte) 105);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public final void method1510(int arg0) {
        this.field3667.method911(-16079);
        field3698++;
        if (arg0 >= -109) {
            method1509(-31, -26, 34, 70);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public static void method1511(int arg0) {
        field3697 = null;
        field3676 = null;
        field3681 = null;
        if (arg0 < -66) {
            field3682 = null;
            field3671 = null;
            field3700 = null;
            field3686 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lda;Lda;Lda;IZ)V")
    public class220(class22 arg0, class22 arg1, class22 arg2, int arg3, boolean arg4) {
        this.field3694 = arg3;
        this.field3699 = arg2;
        this.field3701 = arg0;
        this.field3688 = arg4;
        this.field3667 = new class127(this.field3694);
        class217 var6 = new class217(arg1.method190((byte) -23, 0, 0));
        int var7 = var6.method1441(-18);
        this.field3672 = new byte[var7];
        this.field3675 = new boolean[var7];
        this.field3693 = new boolean[var7];
        this.field3678 = new short[var7];
        this.field3689 = new boolean[var7];
        this.field3680 = new byte[var7];
        this.field3684 = new boolean[var7];
        this.field3704 = new boolean[var7];
        this.field3677 = new byte[var7];
        this.field3665 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field3684[var8] = var6.method1487(255) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field3684[var9]) {
                this.field3704[var9] = var6.method1487(255) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field3684[var10]) {
                this.field3693[var10] = var6.method1487(255) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field3684[var11]) {
                this.field3689[var11] = var6.method1487(255) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field3684[var12]) {
                this.field3675[var12] = var6.method1487(255) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field3684[var13]) {
                this.field3680[var13] = var6.method1444((byte) -71);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field3684[var14]) {
                this.field3672[var14] = var6.method1444((byte) -128);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field3684[var15]) {
                this.field3665[var15] = var6.method1444((byte) -97);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field3684[var16]) {
                this.field3677[var16] = var6.method1444((byte) -82);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field3684[var17]) {
                this.field3678[var17] = (short) var6.method1441(74);
            }
        }
    }
}
