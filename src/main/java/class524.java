import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class524 {

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public int field7663;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "[B")
    public static byte[] field7667 = new byte[2048];

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "Lak;")
    public static class234 field7674 = new class234("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public static int field7676 = 16777215;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public int field7659;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public int field7662;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public int field7665;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Lkm;")
    public class238 field7660;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Lad;")
    public static class295 field7661;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "Lul;")
    public static class406 field7677;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "[I")
    public int[] field7656;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "[I")
    public int[] field7666;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "[I")
    public int[] field7669;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "[I")
    public int[] field7670;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "[I")
    public int[] field7671;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "[I")
    public int[] field7673;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "[Lkm;")
    public class238[] field7672;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "[[I")
    public int[][] field7657;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "[[I")
    public int[][] field7658;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 15)
    public static void method3113(int arg0) {
        field7677 = null;
        field7661 = null;
        field7674 = null;
        field7667 = null;
        if (arg0 != 0) {
            field7677 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B[B)V", line = 30)
    private final void method3114(byte arg0, byte[] arg1) {
        field7664++;
        class217 var3 = new class217(class173.method1168(-44, arg1));
        int var4 = var3.method1515((byte) 125);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field7665 = var3.method1556(98);
        } else {
            this.field7665 = 0;
        }
        int var5 = var3.method1515((byte) 126);
        this.field7662 = var3.method1511(-104);
        int var6 = 0;
        this.field7666 = new int[this.field7662];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field7662; var8++) {
            this.field7666[var8] = var6 += var3.method1511(arg0 + 96);
            if (this.field7666[var8] > var7) {
                var7 = this.field7666[var8];
            }
        }
        this.field7659 = var7 + 1;
        this.field7669 = new int[this.field7659];
        this.field7673 = new int[this.field7659];
        this.field7657 = new int[this.field7659][];
        this.field7671 = new int[this.field7659];
        this.field7670 = new int[this.field7659];
        if (var5 != 0) {
            this.field7656 = new int[this.field7659];
            for (int var9 = 0; var9 < this.field7659; var9++) {
                this.field7656[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field7662; var10++) {
                this.field7656[this.field7666[var10]] = var3.method1556(class425.method2656(arg0, 126));
            }
            this.field7660 = new class238(this.field7656);
        }
        for (int var11 = 0; var11 < this.field7662; var11++) {
            this.field7669[this.field7666[var11]] = var3.method1556(106);
        }
        for (int var12 = 0; var12 < this.field7662; var12++) {
            this.field7673[this.field7666[var12]] = var3.method1556(104);
        }
        for (int var13 = 0; var13 < this.field7662; var13++) {
            this.field7671[this.field7666[var13]] = var3.method1511(-42);
        }
        if (arg0 != 18) {
            this.field7669 = null;
        }
        for (int var14 = 0; var14 < this.field7662; var14++) {
            int var21 = this.field7666[var14];
            int var22 = this.field7671[var21];
            int var23 = 0;
            this.field7657[var21] = new int[var22];
            int var24 = -1;
            for (int var25 = 0; var25 < var22; var25++) {
                int var26 = this.field7657[var21][var25] = var23 += var3.method1511(-81);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field7670[var21] = var24 + 1;
            if ((var24 + 1) == var22) {
                this.field7657[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field7658 = new int[var7 + 1][];
        this.field7672 = new class238[var7 + 1];
        for (int var15 = 0; var15 < this.field7662; var15++) {
            int var16 = this.field7666[var15];
            int var17 = this.field7671[var16];
            this.field7658[var16] = new int[this.field7670[var16]];
            for (int var18 = 0; var18 < this.field7670[var16]; var18++) {
                this.field7658[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field7657[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field7657[var16][var19];
                }
                this.field7658[var16][var20] = var3.method1556(118);
            }
            this.field7672[var16] = new class238(this.field7658[var16]);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 209)
    public static final void method3115(int arg0) {
        field7668++;
        class65.field843 = false;
        class505.field7384 = null;
        class151.field2254 = null;
        class458.field6665 = null;
        class334.field4992 = null;
        class55.field686 = null;
        if (arg0 != -1) {
            method3113(-61);
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([BI)V", line = 231)
    public class524(byte[] arg0, int arg1) {
        this.field7663 = class70.method606(0, arg0, arg0.length);
        if (this.field7663 != arg1) {
            throw new RuntimeException();
        }
        this.method3114((byte) 18, arg0);
    }
}
