import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class621 {

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field8437;

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "Lmca;")
    private class500 field8440;

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field8442;

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "Lkl;")
    private class502 field8439;

    @OriginalMember(owner = "client!lda", name = "j", descriptor = "Lie;")
    private class371 field8445;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "Lrh;")
    public static class59 field8441 = new class59();

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "I")
    public static int field8436;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
    public static int field8438;

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "I")
    public static int field8444;

    @OriginalMember(owner = "client!lda", name = "l", descriptor = "I")
    public static int field8447;

    @OriginalMember(owner = "client!lda", name = "k", descriptor = "Ldga;")
    private class138 field8446;

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "[Llm;")
    private class256[] field8443;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lvh;Lvh;II)Llm;")
    public final class256 method3394(class403 arg0, class403 arg1, int arg2, int arg3) {
        field8444++;
        if (arg3 != 0) {
            this.field8445 = null;
        }
        return this.method3397(arg0, arg2, false, arg1, true);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)V")
    public static void method3395(byte arg0) {
        int var1 = 112 % ((50 - arg0) / 53);
        field8441 = null;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lhc;Z)Z")
    public static final boolean method3396(class293 arg0, boolean arg1) {
        boolean var2 = class397.field5666 == class185.field2270;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method233((byte) -91);
        if (arg0.field3921 < 0 || arg0.field3920 < 0 || arg0.field3928 >= class149.field1872 || arg0.field3923 >= class334.field4887) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field3921; var7 <= arg0.field3928; var7++) {
            for (int var10 = arg0.field3920; var10 <= arg0.field3923; var10++) {
                class651 var11 = class29.method180(arg0.field3925, var7, var10);
                if (var11 != null) {
                    int var12 = 0;
                    if (var7 > arg0.field3921) {
                        var12++;
                    }
                    if (var7 < arg0.field3928) {
                        var12 += 4;
                    }
                    if (var10 > arg0.field3920) {
                        var12 += 8;
                    }
                    if (var10 < arg0.field3923) {
                        var12 += 2;
                    }
                    class82 var13 = class689.method3812((byte) 27, var12, arg0);
                    class82 var14 = var11.field9228;
                    if (var14 == null) {
                        var11.field9228 = var13;
                    } else {
                        while (var14.field1024 != null) {
                            var14 = var14.field1024;
                        }
                        var14.field1024 = var13;
                    }
                    var11.field9237 = (byte) (var11.field9237 | var12);
                    if (var2 && (class659.field9291[var7][var10] & 0xFF000000) != 0) {
                        var3 = class659.field9291[var7][var10];
                        var4 = class629.field8555[var7][var10];
                        var5 = class298.field3992[var7][var10];
                    }
                    if (var11.field9227 != null && var11.field9227.field4842 > var6) {
                        var6 = var11.field9227.field4842;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field3921; var8 <= arg0.field3928; var8++) {
                for (int var9 = arg0.field3920; var9 <= arg0.field3923; var9++) {
                    if ((class659.field9291[var8][var9] & 0xFF000000) == 0) {
                        class659.field9291[var8][var9] = var3;
                        class629.field8555[var8][var9] = var4;
                        class298.field3992[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class438.field6043[class85.field1046++] = arg0;
        }
        if (arg1) {
            arg0.field3930 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lvh;IZLvh;Z)Llm;")
    private final class256 method3397(class403 arg0, int arg1, boolean arg2, class403 arg3, boolean arg4) {
        field8436++;
        if (this.field8446 == null) {
            throw new RuntimeException();
        } else if (arg1 < 0 || this.field8443.length <= arg1) {
            throw new RuntimeException();
        } else if (this.field8443[arg1] == null) {
            this.field8446.field1745 = arg1 * 72 + 6;
            int var6 = this.field8446.method943(-117);
            int var7 = this.field8446.method943(-128);
            byte[] var8 = new byte[64];
            if (arg2) {
                this.field8439 = null;
            }
            this.field8446.method934(8, 0, 64, var8);
            class256 var9 = new class256(arg1, arg3, arg0, this.field8439, this.field8440, var6, var8, var7, arg4);
            this.field8443[arg1] = var9;
            return var9;
        } else {
            return this.field8443[arg1];
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)Z")
    public final boolean method3398(int arg0) {
        field8447++;
        if (this.field8446 != null) {
            return true;
        }
        if (this.field8445 == null) {
            if (this.field8439.method2840(6)) {
                return false;
            }
            this.field8445 = this.field8439.method2830(255, true, (byte) 0, 104, 255);
        }
        if (this.field8445.field5297) {
            return false;
        }
        class138 var2 = new class138(this.field8445.method88(38));
        var2.field1745 = 5;
        int var3 = var2.method957((byte) -96);
        var2.field1745 += var3 * 72;
        byte[] var4 = new byte[var2.field1712.length - var2.field1745];
        var2.method934(8, 0, var4.length, var4);
        byte[] var7;
        if (this.field8442 == null || this.field8437 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field8442, this.field8437);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class666.method3699((byte) 0, var2.field1745 - var4.length - 5, 5, var2.field1712);
        if (arg0 != -16834) {
            return false;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field8443 = new class256[var3];
        this.field8446 = var2;
        return true;
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)V")
    public final void method3399(int arg0) {
        field8438++;
        if (this.field8443 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field8443.length; var2++) {
            if (this.field8443[var2] != null) {
                this.field8443[var2].method1607(-31823);
            }
        }
        for (int var3 = arg0; var3 < this.field8443.length; var3++) {
            if (this.field8443[var3] != null) {
                this.field8443[var3].method1617(-13694);
            }
        }
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lkl;Lmca;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class621(class502 arg0, class500 arg1, BigInteger arg2, BigInteger arg3) {
        this.field8437 = arg3;
        this.field8440 = arg1;
        this.field8442 = arg2;
        this.field8439 = arg0;
        if (!this.field8439.method2840(6)) {
            this.field8445 = this.field8439.method2830(255, true, (byte) 0, -108, 255);
        }
    }
}
