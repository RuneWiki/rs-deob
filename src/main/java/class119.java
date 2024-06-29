import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class119 extends class498 {

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "I")
    public int field1640;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public int field1641;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "[I")
    public int[] field1649;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "[I")
    public int[] field1642;

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "[Z")
    public boolean[] field1646;

    @OriginalMember(owner = "client!gg", name = "w", descriptor = "[[I")
    public int[][] field1647;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    public static int field1644 = 0;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method802(int arg0, int arg1, Random arg2) {
        field1645++;
        if (arg0 >= arg1) {
            throw new IllegalArgumentException();
        } else if (class51.method407(arg1, arg0 + 1024)) {
            return (int) ((long) arg1 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class178.method1112(arg1, var4, arg0 - 10551);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZII)Lkw;")
    public static final class167 method803(boolean arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method804((byte) 126);
        }
        field1639++;
        long var3 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
        return (class167) class502.field7099.method2405(var3, -94);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static final void method804(byte arg0) {
        field1648++;
        int var1 = class144.field1908;
        if (arg0 != -7) {
            field1643 = 109;
        }
        int[] var2 = class521.field7674;
        for (int var3 = 0; var3 < var1; var3++) {
            class22 var9 = class378.field5355[var2[var3]];
            if (var9 != null && var9.field3323 > 0) {
                var9.field3323--;
                if (var9.field3323 == 0) {
                    var9.field3315 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class434.field6110; var4++) {
            long var5 = (long) class488.field6834[var4];
            class378 var7 = (class378) class125.field1687.method2405(var5, -106);
            if (var7 != null) {
                class429 var8 = var7.field5353;
                if (var8.field3323 > 0) {
                    var8.field3323--;
                    if (var8.field3323 == 0) {
                        var8.field3315 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I[B)V")
    public class119(int arg0, byte[] arg1) {
        this.field1640 = arg0;
        class403 var3 = new class403(arg1);
        this.field1641 = var3.method2357((byte) 122);
        this.field1649 = new int[this.field1641];
        this.field1642 = new int[this.field1641];
        this.field1646 = new boolean[this.field1641];
        this.field1647 = new int[this.field1641][];
        for (int var4 = 0; var4 < this.field1641; var4++) {
            this.field1649[var4] = var3.method2357((byte) 117);
        }
        for (int var5 = 0; var5 < this.field1641; var5++) {
            this.field1646[var5] = var3.method2357((byte) 118) == 1;
        }
        for (int var6 = 0; var6 < this.field1641; var6++) {
            this.field1642[var6] = var3.method2338(0);
        }
        for (int var7 = 0; var7 < this.field1641; var7++) {
            this.field1647[var7] = new int[var3.method2357((byte) 120)];
        }
        for (int var8 = 0; var8 < this.field1641; var8++) {
            for (int var9 = 0; var9 < this.field1647[var8].length; var9++) {
                this.field1647[var8][var9] = var3.method2357((byte) 113);
            }
        }
    }
}
