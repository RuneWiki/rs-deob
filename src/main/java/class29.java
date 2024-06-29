import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class29 extends class154 {

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public int field448;

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
    public int field455;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "[I")
    public int[] field446;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "[[I")
    public int[][] field450;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "[I")
    public int[] field447;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "[Z")
    public boolean[] field445;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "Z")
    public static boolean field453 = false;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "[I")
    public static int[] field454 = new int[14];

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "Lnh;")
    public static class305 field449;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "Z")
    public static boolean field452;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method187(byte arg0) {
        if (arg0 >= -115) {
            method187((byte) -104);
        }
        field454 = null;
        field449 = null;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I[B)V")
    public class29(int arg0, byte[] arg1) {
        this.field448 = arg0;
        class215 var3 = new class215(arg1);
        this.field455 = var3.method1374((byte) -60);
        this.field446 = new int[this.field455];
        this.field450 = new int[this.field455][];
        this.field447 = new int[this.field455];
        this.field445 = new boolean[this.field455];
        for (int var4 = 0; var4 < this.field455; var4++) {
            this.field447[var4] = var3.method1374((byte) -60);
        }
        for (int var5 = 0; var5 < this.field455; var5++) {
            this.field445[var5] = var3.method1374((byte) -60) == 1;
        }
        for (int var6 = 0; var6 < this.field455; var6++) {
            this.field446[var6] = var3.method1379(-125);
        }
        for (int var7 = 0; var7 < this.field455; var7++) {
            this.field450[var7] = new int[var3.method1374((byte) -60)];
        }
        for (int var8 = 0; var8 < this.field455; var8++) {
            for (int var9 = 0; var9 < this.field450[var8].length; var9++) {
                this.field450[var8][var9] = var3.method1374((byte) -60);
            }
        }
    }
}
