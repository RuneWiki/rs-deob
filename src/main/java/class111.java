import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class111 extends class146 {

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public int field1714;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public int field1712;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "[I")
    public int[] field1718;

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "[Z")
    public boolean[] field1724;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "[I")
    public int[] field1715;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "[[I")
    public int[][] field1722;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field1707 = 0;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public static int field1710 = 99;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    public static int field1713 = -1;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
    public static int field1719 = 127;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "S")
    public static short field1721 = 256;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "[I")
    public static int[] field1717 = new int[4];

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "Ljava/lang/String;")
    public static String field1720 = " is already on your ignore list.";

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "[Z")
    public static boolean[] field1711;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)V")
    public static final void method823(byte arg0) {
        if (arg0 != 0) {
            method825(16);
        }
        field1709++;
        try {
            if (class138.field2311 == 1) {
                int var1 = class180.field2996.method201((byte) -82);
                if (var1 > 0 && class180.field2996.method226(128)) {
                    int var2 = var1 - class167.field2753;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class180.field2996.method217(var2, (byte) -61);
                } else {
                    class180.field2996.method218(false);
                    class180.field2996.method197((byte) -104);
                    class81.field1344 = null;
                    if (class225.field3579 == null) {
                        class138.field2311 = 0;
                    } else {
                        class138.field2311 = 2;
                    }
                    class44.field809 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class180.field2996.method218(false);
            class225.field3579 = null;
            class138.field2311 = 0;
            class44.field809 = null;
            class81.field1344 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method824(int arg0, Random arg1, int arg2) {
        field1723++;
        if (arg2 <= arg0) {
            throw new IllegalArgumentException();
        } else if (class232.method1537(-52, arg2)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class82.method660(var4, arg2, (byte) 114);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static void method825(int arg0) {
        field1717 = null;
        field1720 = null;
        field1711 = null;
        if (arg0 >= -3) {
            field1721 = -67;
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(I[B)V")
    public class111(int arg0, byte[] arg1) {
        this.field1714 = arg0;
        class136 var3 = new class136(arg1);
        this.field1712 = var3.method1012(4);
        this.field1718 = new int[this.field1712];
        this.field1724 = new boolean[this.field1712];
        this.field1715 = new int[this.field1712];
        this.field1722 = new int[this.field1712][];
        for (int var4 = 0; var4 < this.field1712; var4++) {
            this.field1715[var4] = var3.method1012(4);
        }
        for (int var5 = 0; var5 < this.field1712; var5++) {
            this.field1724[var5] = var3.method1012(4) == 1;
        }
        for (int var6 = 0; var6 < this.field1712; var6++) {
            this.field1718[var6] = var3.method996(65280);
        }
        for (int var7 = 0; var7 < this.field1712; var7++) {
            this.field1722[var7] = new int[var3.method1012(4)];
        }
        for (int var8 = 0; var8 < this.field1712; var8++) {
            for (int var9 = 0; var9 < this.field1722[var8].length; var9++) {
                this.field1722[var8][var9] = var3.method1012(4);
            }
        }
    }
}
