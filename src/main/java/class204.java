import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class204 extends class107 {

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    public int field3412;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    private int field3407;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "[[I")
    public int[][] field3414;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "[I")
    public int[] field3404;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "[Z")
    public boolean[] field3406;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "Ldf;")
    private static class51 field3402 = class46.method233("Loading wordpack )2 ", 100);

    @OriginalMember(owner = "client!md", name = "C", descriptor = "Ldf;")
    public static class51 field3408 = field3402;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "[I")
    public static int[] field3405 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!md", name = "w", descriptor = "Lqh;")
    public static class189 field3403 = new class189(30);

    @OriginalMember(owner = "client!md", name = "H", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3413 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

    @OriginalMember(owner = "client!md", name = "K", descriptor = "Ldf;")
    private static class51 field3416 = class46.method233("red:", 100);

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    public static int field3418 = 0;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "Ldf;")
    public static class51 field3417 = field3416;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "Ldf;")
    public static class51 field3421 = field3416;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "Lu;")
    public static class111 field3420;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "Lfd;")
    public static class114 field3415;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V")
    public static void method1412(byte arg0) {
        field3408 = null;
        field3417 = null;
        field3403 = null;
        field3415 = null;
        if (arg0 < 116) {
            return;
        }
        field3402 = null;
        field3405 = null;
        field3413 = null;
        field3420 = null;
        field3416 = null;
        field3421 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZIII)Ldf;")
    public static final class51 method1413(boolean arg0, int arg1, int arg2, int arg3) {
        field3411++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var4 = 1;
        for (int var5 = arg2 / arg3; var5 != 0; var5 /= arg3) {
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = arg1; var8 < var4; var8++) {
            int var10 = arg2 % arg3;
            arg2 /= arg3;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class51 var9 = new class51();
        var9.field855 = var6;
        var9.field813 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(I[B)V")
    public class204(int arg0, byte[] arg1) {
        this.field3412 = arg0;
        class121 var3 = new class121(arg1);
        this.field3407 = var3.method897(124);
        this.field3414 = new int[this.field3407][];
        this.field3404 = new int[this.field3407];
        this.field3406 = new boolean[this.field3407];
        for (int var4 = 0; var4 < this.field3407; var4++) {
            this.field3404[var4] = var3.method897(123);
        }
        for (int var5 = 0; var5 < this.field3407; var5++) {
            this.field3406[var5] = var3.method897(110) == 1;
        }
        for (int var6 = 0; var6 < this.field3407; var6++) {
            this.field3414[var6] = new int[var3.method897(-34)];
        }
        for (int var7 = 0; var7 < this.field3407; var7++) {
            for (int var8 = 0; var8 < this.field3414[var7].length; var8++) {
                this.field3414[var7][var8] = var3.method897(118);
            }
        }
    }
}
