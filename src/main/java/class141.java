import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class141 {

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    private int field2659 = 0;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    private int field2658 = -1;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Lvb;")
    private class192 field2653 = new class192();

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "Z")
    public boolean field2664 = false;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "[Ltb;")
    private class174[] field2663;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    private int field2656;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    private int field2662;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "[[[I")
    private int[][][] field2651;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Lai;")
    public static class10 field2650 = class44.method278("Okay", -112);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lai;")
    private static class10 field2647 = class44.method278("Please wait)3)3)3", -104);

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static volatile int field2655 = 0;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "Lai;")
    public static class10 field2660 = null;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Lai;")
    public static class10 field2657 = field2647;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "[J")
    public static long[] field2661 = new long[100];

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lc;Lai;Lai;I)Lta;")
    public static final class173 method953(class21 arg0, class10 arg1, class10 arg2, int arg3) {
        field2648++;
        if (arg3 >= -25) {
            method953(null, null, null, -122);
        }
        int var4 = arg0.method156(0, arg2);
        int var5 = arg0.method154(var4, true, arg1);
        return class144.method982(var5, arg0, (byte) 88, var4);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method954(int arg0) {
        field2657 = null;
        field2647 = null;
        field2660 = null;
        field2650 = null;
        if (arg0 != 5978) {
            field2647 = null;
        }
        field2661 = null;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public final void method955(int arg0) {
        if (arg0 != -974755577) {
            this.field2662 = 76;
        }
        field2649++;
        for (int var2 = 0; var2 < this.field2662; var2++) {
            this.field2651[var2][0] = null;
            this.field2651[var2][1] = null;
            this.field2651[var2][2] = null;
            this.field2651[var2] = null;
        }
        this.field2651 = null;
        this.field2663 = null;
        this.field2653.method1224((byte) 24);
        this.field2653 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[[I")
    public final int[][] method956(int arg0, int arg1) {
        field2652++;
        if (arg1 >= -89) {
            return null;
        } else if (this.field2662 == this.field2656) {
            this.field2664 = this.field2663[arg0] == null;
            this.field2663[arg0] = class42.field693;
            return this.field2651[arg0];
        } else if (this.field2662 == 1) {
            this.field2664 = this.field2658 != arg0;
            this.field2658 = arg0;
            return this.field2651[0];
        } else {
            class174 var3 = this.field2663[arg0];
            if (this.field2664 = var3 == null) {
                if (this.field2662 > this.field2659) {
                    var3 = new class174(arg0, this.field2659);
                    this.field2659++;
                } else {
                    class174 var4 = (class174) this.field2653.method1219(-14190);
                    var3 = new class174(arg0, var4.field3346);
                    this.field2663[var4.field3349] = null;
                    var4.method848(false);
                }
                this.field2663[arg0] = var3;
            }
            this.field2653.method1231((byte) -8, var3);
            return this.field2651[var3.field3346];
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
    public static final void method957(int arg0, int arg1, int arg2) {
        field2654++;
        if (class126.field2404 != 0 && class126.field2404 != 3 || (arg0 != -4 || class25.field384 != 1)) {
            return;
        }
        int var3 = class172.field3330 - arg1 - 25;
        int var4 = class5.field58 - arg2 - 5;
        if (var3 < 0 || var4 < 0 || var3 >= 146 || var4 >= 151) {
            return;
        }
        var4 -= 75;
        var3 -= 73;
        int var5 = class53.field950 + class171.field3316 & 0x7FF;
        int var6 = class113.field2124[var5];
        int var7 = class113.field2120[var5];
        int var8 = (class42.field698 + 256) * var6 >> 8;
        int var9 = (class42.field698 + 256) * var7 >> 8;
        int var10 = var3 * var9 + var4 * var8 >> 11;
        int var11 = var4 * var9 - var3 * var8 >> 11;
        int var12 = class145.field2767.field1100 + var10 >> 7;
        int var13 = class145.field2767.field1097 - var11 >> 7;
        boolean var14 = class84.method514(var12, 1, 0, 0, var13, 0, 1, 0, class145.field2767.field1099[0], 0, class145.field2767.field1106[0], true);
        if (!var14) {
            return;
        }
        class76.field1323.method781(arg0 ^ 0xFFFFFFFC, var3);
        class76.field1323.method781(0, var4);
        class76.field1323.method793(105, class171.field3316);
        class76.field1323.method781(0, 57);
        class76.field1323.method781(0, class53.field950);
        class76.field1323.method781(0, class42.field698);
        class76.field1323.method781(0, 89);
        class76.field1323.method793(88, class145.field2767.field1100);
        class76.field1323.method793(95, class145.field2767.field1097);
        class76.field1323.method781(0, class63.field1059);
        class76.field1323.method781(0, 63);
        return;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(III)V")
    public class141(int arg0, int arg1, int arg2) {
        this.field2663 = new class174[arg1];
        this.field2656 = arg1;
        this.field2662 = arg0;
        this.field2651 = new int[arg0][3][arg2];
    }
}
