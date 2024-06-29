import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class16 extends class137 {

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
    public int field231;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "[[I")
    public int[][] field236;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "[I")
    public int[] field227;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "[Z")
    public boolean[] field230;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "Lhh;")
    public static class163 field224 = class137.method1065("showingVideoAd", 17);

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "Lhh;")
    public static class163 field229 = class137.method1065("Sprites geladen)3", 17);

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "Lhh;")
    public static class163 field234 = class137.method1065(")3)3)3", 17);

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "Lpa;")
    public static class123 field225;

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "Lpa;")
    public static class123 field233;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "[Lrh;")
    public static class242[] field223;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "[S")
    public static short[] field237;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZ)V")
    public static final void method108(int arg0, boolean arg1) {
        class37.field631 = new int[104];
        class76.field1429 = 99;
        class131.field2542 = new int[104];
        class60.field1020 = new int[104];
        class3.field71 = new int[104];
        field226++;
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class233.field4164 = new int[var2][105][105];
        class116.field2206 = new byte[var2][104][104];
        class58.field959 = new byte[var2][104][104];
        class119.field2241 = new byte[var2][105][105];
        class222.field4048 = new byte[var2][104][104];
        class234.field4180 = new byte[var2][104][104];
        class260.field4553 = new int[104];
        if (arg0 <= 74) {
            field225 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V")
    public static void method109(boolean arg0) {
        field233 = null;
        if (arg0) {
            method108(-36, true);
        }
        field237 = null;
        field224 = null;
        field229 = null;
        field223 = null;
        field225 = null;
        field234 = null;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(I[B)V")
    public class16(int arg0, byte[] arg1) {
        this.field231 = arg0;
        class81 var3 = new class81(arg1);
        this.field228 = var3.method622(true);
        this.field236 = new int[this.field228][];
        this.field227 = new int[this.field228];
        this.field230 = new boolean[this.field228];
        for (int var4 = 0; var4 < this.field228; var4++) {
            this.field227[var4] = var3.method622(true);
        }
        for (int var5 = 0; var5 < this.field228; var5++) {
            this.field230[var5] = var3.method622(true) == 1;
        }
        for (int var6 = 0; var6 < this.field228; var6++) {
            this.field236[var6] = new int[var3.method622(true)];
        }
        for (int var7 = 0; var7 < this.field228; var7++) {
            for (int var8 = 0; var8 < this.field236[var7].length; var8++) {
                this.field236[var7][var8] = var3.method622(true);
            }
        }
    }
}
