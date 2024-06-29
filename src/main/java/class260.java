import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class260 {

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public int field3918;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Z")
    public static boolean field3916 = false;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "S")
    public static short field3919 = 32767;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public int field3915;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public int field3920;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public int field3932;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "Loa;")
    public class150 field3929;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "[I")
    public int[] field3921;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
    public int[] field3922;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "[I")
    public int[] field3925;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "[I")
    public int[] field3926;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "[I")
    public int[] field3928;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "[I")
    public int[] field3930;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "[Loa;")
    public class150[] field3923;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "[[I")
    public int[][] field3924;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "[[I")
    public int[][] field3931;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V")
    public static final void method1875(int arg0, int arg1, int arg2) {
        field3927++;
        class74 var3 = class220.method1679((byte) -15, arg1);
        int var4 = var3.field1276;
        int var5 = var3.field1281;
        int var6 = var3.field1275;
        int var7 = class263.field3962[var6 - var5];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        if (arg0 > 113) {
            int var8 = var7 << var5;
            class141.method1130(class351.field4987[var4] & ~var8 | arg2 << var5 & var8, var4, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([BI)V")
    private final void method1876(byte[] arg0, int arg1) {
        field3917++;
        class37 var3 = new class37(class315.method2127(25055, arg0));
        int var4 = var3.method271((byte) 124);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field3932 = var3.method278(-122);
        } else {
            this.field3932 = 0;
        }
        int var5 = var3.method271((byte) 115);
        this.field3920 = var3.method320((byte) -87);
        int var6 = 0;
        this.field3926 = new int[this.field3920];
        int var7 = -1;
        if (arg1 < 117) {
            this.field3921 = null;
        }
        for (int var8 = 0; var8 < this.field3920; var8++) {
            this.field3926[var8] = var6 += var3.method320((byte) -87);
            if (this.field3926[var8] > var7) {
                var7 = this.field3926[var8];
            }
        }
        this.field3915 = var7 + 1;
        this.field3931 = new int[this.field3915][];
        this.field3925 = new int[this.field3915];
        this.field3928 = new int[this.field3915];
        this.field3922 = new int[this.field3915];
        this.field3930 = new int[this.field3915];
        if (var5 != 0) {
            this.field3921 = new int[this.field3915];
            for (int var9 = 0; var9 < this.field3915; var9++) {
                this.field3921[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3920; var10++) {
                this.field3921[this.field3926[var10]] = var3.method278(-127);
            }
            this.field3929 = new class150(this.field3921);
        }
        for (int var11 = 0; var11 < this.field3920; var11++) {
            this.field3925[this.field3926[var11]] = var3.method278(-117);
        }
        for (int var12 = 0; var12 < this.field3920; var12++) {
            this.field3930[this.field3926[var12]] = var3.method278(-121);
        }
        for (int var13 = 0; var13 < this.field3920; var13++) {
            this.field3928[this.field3926[var13]] = var3.method320((byte) -87);
        }
        for (int var14 = 0; var14 < this.field3920; var14++) {
            int var21 = this.field3926[var14];
            int var22 = 0;
            int var23 = this.field3928[var21];
            this.field3931[var21] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field3931[var21][var25] = var22 += var3.method320((byte) -87);
                if (var24 < var26) {
                    var24 = var26;
                }
            }
            this.field3922[var21] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field3931[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field3923 = new class150[var7 + 1];
        this.field3924 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field3920; var15++) {
            int var16 = this.field3926[var15];
            int var17 = this.field3928[var16];
            this.field3924[var16] = new int[this.field3922[var16]];
            for (int var18 = 0; var18 < this.field3922[var16]; var18++) {
                this.field3924[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field3931[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field3931[var16][var19];
                }
                this.field3924[var16][var20] = var3.method278(57);
            }
            this.field3923[var16] = new class150(this.field3924[var16]);
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "([BI)V")
    public class260(byte[] arg0, int arg1) {
        this.field3918 = class15.method92((byte) 85, arg0.length, arg0);
        if (this.field3918 != arg1) {
            throw new RuntimeException();
        }
        this.method1876(arg0, 121);
    }
}
