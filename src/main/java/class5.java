import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class5 extends class79 {

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "I")
    public int field135;

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "[Z")
    public boolean[] field127;

    @OriginalMember(owner = "client!ej", name = "A", descriptor = "[I")
    public int[] field131;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "[[I")
    public int[][] field126;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "I")
    public static int field132 = 20;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "Lck;")
    public static class119 field136 = class298.method1987((byte) 50, "<col=c0ff00>");

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "[I")
    public static int[] field128;

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "[Lmd;")
    public static class88[] field129;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lva;B)V", line = 4)
    public static final void method80(class36 arg0, byte arg1) {
        if (arg1 < 78) {
            method80((class36) null, (byte) -127);
        }
        class53.field856 = arg0;
        field134++;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V", line = 16)
    public static void method81(byte arg0) {
        field128 = null;
        if (arg0 > -3) {
            method81((byte) -90);
        }
        field129 = null;
        field136 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)V", line = 38)
    public static final void method82(int arg0, int arg1, int arg2, int arg3) {
        class104 var4 = class150.field2390[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class106 var5 = var4.field1590;
        if (var5 != null) {
            var5.field1634 = var5.field1634 * arg3 / 16;
            var5.field1628 = var5.field1628 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(I[B)V", line = 70)
    public class5(int arg0, byte[] arg1) {
        this.field135 = arg0;
        class3 var3 = new class3(arg1);
        this.field130 = var3.method64((byte) -96);
        this.field127 = new boolean[this.field130];
        this.field131 = new int[this.field130];
        this.field126 = new int[this.field130][];
        for (int var4 = 0; var4 < this.field130; var4++) {
            this.field131[var4] = var3.method64((byte) -83);
        }
        for (int var5 = 0; var5 < this.field130; var5++) {
            this.field127[var5] = var3.method64((byte) 95) == 1;
        }
        for (int var6 = 0; var6 < this.field130; var6++) {
            this.field126[var6] = new int[var3.method64((byte) -116)];
        }
        for (int var7 = 0; var7 < this.field130; var7++) {
            for (int var8 = 0; var8 < this.field126[var7].length; var8++) {
                this.field126[var7][var8] = var3.method64((byte) 8);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V", line = 121)
    public static final void method83(int arg0, int arg1) {
        class260.field4167.method999(new class204(arg1), (byte) -108);
        if (arg0 != 0) {
            method80((class36) null, (byte) -26);
        }
        field133++;
    }
}
