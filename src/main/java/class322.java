import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class322 extends class147 {

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public int field4653;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    public int field4656;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "[[I")
    public int[][] field4660;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "[I")
    public int[] field4658;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "[I")
    public int[] field4657;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "[Z")
    public boolean[] field4654;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    public static int field4659 = 0;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "Lsd;")
    public static class74 field4661 = new class74(62, 8);

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "Lue;")
    public static class142 field4655;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)[Lap;", line = 5)
    public static final class312[] method1964(int arg0) {
        if (arg0 <= 1) {
            return null;
        } else {
            field4652++;
            return new class312[] { class214.field2946, class214.field2948, class214.field2949, class214.field2950, class214.field2951, class214.field2952, class214.field2953, class214.field2954, class214.field2955, class214.field2956 };
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)V", line = 26)
    public static void method1965(int arg0) {
        field4661 = null;
        int var1 = 42 / ((-arg0 - 17) / 50);
        field4655 = null;
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(I[B)V", line = 37)
    public class322(int arg0, byte[] arg1) {
        this.field4653 = arg0;
        class179 var3 = new class179(arg1);
        this.field4656 = var3.method895((byte) -120);
        this.field4660 = new int[this.field4656][];
        this.field4658 = new int[this.field4656];
        this.field4657 = new int[this.field4656];
        this.field4654 = new boolean[this.field4656];
        for (int var4 = 0; var4 < this.field4656; var4++) {
            this.field4658[var4] = var3.method895((byte) -89);
        }
        for (int var5 = 0; var5 < this.field4656; var5++) {
            this.field4654[var5] = var3.method895((byte) -76) == 1;
        }
        for (int var6 = 0; var6 < this.field4656; var6++) {
            this.field4657[var6] = var3.method916(21933);
        }
        for (int var7 = 0; var7 < this.field4656; var7++) {
            this.field4660[var7] = new int[var3.method895((byte) -74)];
        }
        for (int var8 = 0; var8 < this.field4656; var8++) {
            for (int var9 = 0; var9 < this.field4660[var8].length; var9++) {
                this.field4660[var8][var9] = var3.method895((byte) -96);
            }
        }
    }
}
