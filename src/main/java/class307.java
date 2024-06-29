import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class307 extends class264 {

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public int field4528;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public int field4530;

    @OriginalMember(owner = "client!ed", name = "y", descriptor = "[Z")
    public boolean[] field4534;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "[I")
    public int[] field4526;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "[[I")
    public int[][] field4529;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "[I")
    public int[] field4527;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field4525 = -1;

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "Ljn;")
    public static class409 field4532 = new class409("Drop", "Fallen lassen", "Poser", "Largar");

    @OriginalMember(owner = "client!ed", name = "E", descriptor = "[Ltp;")
    public static class196[] field4539 = new class196[14];

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!ed", name = "x", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!ed", name = "C", descriptor = "Lct;")
    public static class104 field4537;

    @OriginalMember(owner = "client!ed", name = "D", descriptor = "Lqm;")
    public static class297 field4538;

    @OriginalMember(owner = "client!ed", name = "z", descriptor = "Z")
    public static boolean field4535;

    @OriginalMember(owner = "client!ed", name = "B", descriptor = "[I")
    public static int[] field4536;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V", line = 6)
    public static final void method2049(int arg0) {
        field4533++;
        if (class125.field1668 == 5 && arg0 <= -113) {
            class125.field1668 = 6;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 25)
    public static final void method2050(int arg0, int arg1, int arg2, Class arg3) {
        class369 var4 = class178.field2530[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class206 var5 = var4.field5345; var5 != null; var5 = var5.field2882) {
            class336 var6 = var5.field2880;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field4961 == arg1 && var6.field4959 == arg2) {
                class195.method1354(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[B)Z", line = 51)
    public static final boolean method2051(int arg0, byte[] arg1) {
        field4531++;
        class256 var2 = new class256(arg1);
        int var3 = var2.method1738((byte) -90);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1738((byte) 56) == 1;
        if (var4) {
            class430.method2645(var2, false);
        }
        class9.method120(var2, arg0 ^ arg0);
        return true;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(I[B)V", line = 82)
    public class307(int arg0, byte[] arg1) {
        this.field4528 = arg0;
        class256 var3 = new class256(arg1);
        this.field4530 = var3.method1738((byte) -108);
        this.field4534 = new boolean[this.field4530];
        this.field4526 = new int[this.field4530];
        this.field4529 = new int[this.field4530][];
        this.field4527 = new int[this.field4530];
        for (int var4 = 0; var4 < this.field4530; var4++) {
            this.field4526[var4] = var3.method1738((byte) -56);
        }
        for (int var5 = 0; var5 < this.field4530; var5++) {
            this.field4534[var5] = var3.method1738((byte) 84) == 1;
        }
        for (int var6 = 0; var6 < this.field4530; var6++) {
            this.field4527[var6] = var3.method1767(1930493576);
        }
        for (int var7 = 0; var7 < this.field4530; var7++) {
            this.field4529[var7] = new int[var3.method1738((byte) -22)];
        }
        for (int var8 = 0; var8 < this.field4530; var8++) {
            for (int var9 = 0; var9 < this.field4529[var8].length; var9++) {
                this.field4529[var8][var9] = var3.method1738((byte) 118);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)V", line = 140)
    public static void method2052(int arg0) {
        field4539 = null;
        field4536 = null;
        field4532 = null;
        field4538 = null;
        if (arg0 != -20203) {
            method2049(-52);
        }
        field4537 = null;
    }
}
