import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class101 extends class125 {

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
    private int field1728;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "[Z")
    public boolean[] field1729;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "[[I")
    public int[][] field1726;

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "[I")
    public int[] field1723;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "[I")
    public static int[] field1722 = new int[1000];

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "[Z")
    public static boolean[] field1720 = new boolean[100];

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "Loa;")
    public static class99 field1724 = class221.method1463(2844, "<br>");

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public static int field1719 = 0;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "Loa;")
    public static class99 field1721 = class221.method1463(2844, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "Lng;")
    public static class76 field1730 = new class76();

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "Loa;")
    public static class99 field1731 = class221.method1463(2844, "Attaquer");

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "Loh;")
    public static class275 field1725;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
    public static void method713(int arg0) {
        field1725 = null;
        field1722 = null;
        field1724 = null;
        field1720 = null;
        field1731 = null;
        field1721 = null;
        int var1 = -10 / ((42 - arg0) / 36);
        field1730 = null;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(I[B)V")
    public class101(int arg0, byte[] arg1) {
        this.field1727 = arg0;
        class261 var3 = new class261(arg1);
        this.field1728 = var3.method1693((byte) 91);
        this.field1729 = new boolean[this.field1728];
        this.field1726 = new int[this.field1728][];
        this.field1723 = new int[this.field1728];
        for (int var4 = 0; var4 < this.field1728; var4++) {
            this.field1723[var4] = var3.method1693((byte) 33);
        }
        for (int var5 = 0; var5 < this.field1728; var5++) {
            this.field1729[var5] = var3.method1693((byte) 77) == 1;
        }
        for (int var6 = 0; var6 < this.field1728; var6++) {
            this.field1726[var6] = new int[var3.method1693((byte) 40)];
        }
        for (int var7 = 0; var7 < this.field1728; var7++) {
            for (int var8 = 0; var8 < this.field1726[var7].length; var8++) {
                this.field1726[var7][var8] = var3.method1693((byte) 81);
            }
        }
    }
}
