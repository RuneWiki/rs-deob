import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class8 extends class424 {

    @OriginalMember(owner = "client!kp", name = "N", descriptor = "I")
    private int field68 = 0;

    @OriginalMember(owner = "client!kp", name = "S", descriptor = "I")
    private int field73 = 0;

    @OriginalMember(owner = "client!kp", name = "L", descriptor = "I")
    private int field66 = 1365;

    @OriginalMember(owner = "client!kp", name = "Q", descriptor = "I")
    private int field71 = 20;

    @OriginalMember(owner = "client!kp", name = "M", descriptor = "Lhc;")
    public static class368 field67 = new class368("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!kp", name = "O", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!kp", name = "P", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!kp", name = "R", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!kp", name = "T", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!kp", name = "U", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
    public class8() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        if (arg1 != -10) {
            return null;
        } else {
            ++field74;
            int[] var3 = super.field5892.method783(arg0, (byte) -76);
            if (super.field5892.field1427) {
                for (int var4 = 0; ~var4 > ~class303.field4135; ++var4) {
                    int var5 = (class332.field4478[var4] << 12) / this.field66 - -this.field68;
                    int var6 = (class409.field5711[arg0] << 12) / this.field66 - -this.field73;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (var11 - -var12 < 16384 && ~var13 > ~this.field71) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = -var12 + var11 + var7;
                        ++var13;
                        var11 = var9 * var9 >> 12;
                        var12 = var10 * var10 >> 12;
                    }
                    var3[var4] = this.field71 + -1 > var13 ? (var13 << 12) / this.field71 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "(I)V")
    public static void method44(int arg0) {
        field67 = null;
        if (arg0 >= -52) {
            field67 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "(I)V")
    public static final void method45(int arg0) {
        class447.field6315.method2530((byte) -115);
        ++field75;
        if (arg0 >= -39) {
            method44(-104);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        ++field69;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 == -4) {
                        this.field73 = arg0.method2297(arg1 ^ -13320);
                    }
                } else {
                    this.field68 = arg0.method2297(13352);
                }
            } else {
                this.field71 = arg0.method2297(13352);
            }
        } else {
            this.field66 = arg0.method2297(arg1 ^ -13320);
        }
        if (arg1 != -48) {
            this.method43(-107, (byte) 37);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljq;B)V")
    public static final void method46(class185 arg0, byte arg1) {
        ++field70;
        int var2 = 118 % ((29 - arg1) / 40);
        int var3 = -class246.field3467 + arg0.field2627;
        int var4 = arg0.field2623 * 128 + arg0.method1285(-97) * 64;
        int var5 = arg0.field2642 * 128 - -(arg0.method1285(-119) * 64);
        arg0.field44 += (-arg0.field44 + var5) / var3;
        arg0.field40 += (-arg0.field40 + var4) / var3;
        arg0.field2664 = 0;
        if (~arg0.field2635 == -1) {
            arg0.method1289(8192, true);
        }
        if (~arg0.field2635 == -2) {
            arg0.method1289(12288, true);
        }
        if (~arg0.field2635 == -3) {
            arg0.method1289(0, true);
        }
        if (~arg0.field2635 == -4) {
            arg0.method1289(4096, true);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lij;Lea;B)V")
    public static final void method47(class316 arg0, class58 arg1, byte arg2) {
        ++field72;
        class96[] var3 = class96.method748(arg0, class192.field2768, 0);
        class221.field3104 = new class77[var3.length];
        for (int var4 = 0; var3.length > var4; ++var4) {
            class221.field3104[var4] = arg1.method199(var3[var4], true);
        }
        class96[] var5 = class96.method748(arg0, class120.field1821, 0);
        class344.field4644 = new class77[var5.length];
        for (int var6 = 0; ~var5.length < ~var6; ++var6) {
            class344.field4644[var6] = arg1.method199(var5[var6], true);
        }
        class96[] var7 = class96.method748(arg0, class119.field1815, 0);
        class134.field2005 = new class77[var7.length];
        for (int var8 = 0; ~var7.length < ~var8; ++var8) {
            class134.field2005[var8] = arg1.method199(var7[var8], true);
        }
        class96[] var9 = class96.method748(arg0, class404.field5594, 0);
        class361.field4987 = new class77[var9.length];
        for (int var10 = 0; var10 < var9.length; ++var10) {
            class361.field4987[var10] = arg1.method199(var9[var10], true);
        }
        class96[] var11 = class96.method748(arg0, class149.field2165, 0);
        class90.field1259 = new class77[var11.length];
        for (int var12 = 0; ~var12 > ~var11.length; ++var12) {
            class90.field1259[var12] = arg1.method199(var11[var12], true);
        }
        class96[] var13 = class96.method748(arg0, class118.field1800, 0);
        class191.field2751 = new class77[var13.length];
        for (int var14 = 0; var13.length > var14; ++var14) {
            class191.field2751[var14] = arg1.method199(var13[var14], true);
        }
        class96[] var15 = class96.method748(arg0, class373.field5169, 0);
        class253.field3517 = new class77[var15.length];
        for (int var16 = 0; ~var16 > ~var15.length; ++var16) {
            class253.field3517[var16] = arg1.method199(var15[var16], true);
        }
        class96[] var17 = class96.method748(arg0, class339.field4595, 0);
        class276.field3767 = new class77[var17.length];
        for (int var18 = 0; ~var18 > ~var17.length; ++var18) {
            class276.field3767[var18] = arg1.method199(var17[var18], true);
        }
        class96[] var19 = class96.method748(arg0, class98.field1342, 0);
        class310.field4208 = new class77[var19.length];
        for (int var20 = 0; ~var19.length < ~var20; ++var20) {
            class310.field4208[var20] = arg1.method199(var19[var20], true);
        }
        class96[] var21 = class96.method748(arg0, class25.field323, 0);
        class363.field4995 = new class77[var21.length];
        for (int var22 = 0; ~var22 > ~var21.length; ++var22) {
            class363.field4995[var22] = arg1.method199(var21[var22], true);
        }
        class96[] var23 = class96.method748(arg0, class442.field6216, 0);
        class328.field4462 = new class77[var23.length];
        for (int var24 = 0; var24 < var23.length; ++var24) {
            class328.field4462[var24] = arg1.method199(var23[var24], true);
        }
        class96[] var25 = class96.method748(arg0, class341.field4603, 0);
        class242.field3429 = new class77[var25.length];
        for (int var26 = 0; ~var25.length < ~var26; ++var26) {
            class242.field3429[var26] = arg1.method199(var25[var26], true);
        }
        class96[] var27 = class96.method748(arg0, class237.field3377, 0);
        class21.field269 = new class77[var27.length];
        if (arg2 != 115) {
            field67 = null;
        }
        for (int var28 = 0; ~var28 > ~var27.length; ++var28) {
            class21.field269[var28] = arg1.method199(var27[var28], true);
        }
        class405.field5613 = arg1.method199(class96.method739(arg0, class213.field2976, 0), true);
    }

    static {
        new class368("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
    }
}
