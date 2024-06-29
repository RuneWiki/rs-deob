import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class42 extends class210 {

    @OriginalMember(owner = "client!gs", name = "P", descriptor = "I")
    private int field558 = 0;

    @OriginalMember(owner = "client!gs", name = "R", descriptor = "I")
    private int field560 = 4096;

    @OriginalMember(owner = "client!gs", name = "Q", descriptor = "I")
    private int field559 = 0;

    @OriginalMember(owner = "client!gs", name = "I", descriptor = "I")
    private int field551 = 16;

    @OriginalMember(owner = "client!gs", name = "N", descriptor = "I")
    private int field556 = 2000;

    @OriginalMember(owner = "client!gs", name = "M", descriptor = "Lbt;")
    public static class363 field555 = new class363(64);

    @OriginalMember(owner = "client!gs", name = "S", descriptor = "Ljm;")
    public static class167 field561 = new class167("", 16);

    @OriginalMember(owner = "client!gs", name = "V", descriptor = "I")
    public static int field564 = 0;

    @OriginalMember(owner = "client!gs", name = "W", descriptor = "Ljn;")
    public static class409 field565 = new class409("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!gs", name = "X", descriptor = "Ljn;")
    public static class409 field566 = new class409("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!gs", name = "Z", descriptor = "I")
    public static int field568 = 1407;

    @OriginalMember(owner = "client!gs", name = "Y", descriptor = "Lkg;")
    public static class223 field567 = null;

    @OriginalMember(owner = "client!gs", name = "ab", descriptor = "[J")
    public static long[] field569 = new long[100];

    @OriginalMember(owner = "client!gs", name = "bb", descriptor = "F")
    public static float field570;

    @OriginalMember(owner = "client!gs", name = "J", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!gs", name = "K", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!gs", name = "L", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!gs", name = "O", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!gs", name = "T", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!gs", name = "U", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "(I)V")
    public static void method360(int arg0) {
        field565 = null;
        field566 = null;
        field555 = null;
        if (arg0 != -21897) {
            method362(95, -118);
        }
        field567 = null;
        field561 = null;
        field569 = null;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IB)[I")
    public final int[] method361(int arg0, byte arg1) {
        ++field557;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (arg1 != -38) {
            this.method363(125);
        }
        if (super.field2950.field4111) {
            int var4 = this.field560 >> 1;
            int[][] var5 = super.field2950.method1888(0);
            Random var6 = new Random((long) this.field558);
            for (int var7 = 0; var7 < this.field556; ++var7) {
                int var8 = this.field560 <= 0 ? this.field559 : -var4 + this.field559 + class435.method2683(var6, (byte) -75, this.field560);
                int var9 = var8 >> 4 & 255;
                int var10 = class435.method2683(var6, (byte) -75, class202.field2852);
                int var11 = class435.method2683(var6, (byte) -75, class130.field1771);
                int var12 = var10 - -(class311.field4580[var9] * this.field551 >> 12);
                int var13 = var11 - -(class92.field1136[var9] * this.field551 >> 12);
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || ~var14 != -1) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (~var10 < ~var12) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var12 = var19;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = var13 - var11;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class435.method2683(var6, (byte) -75, 4096) >> 2);
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = var11 < var13 ? 1 : -1;
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = var28 & class437.field6373;
                        int var31 = var21 & class139.field1911;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        var24 += var23;
                        if (~var24 < -1) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(II)Lip;")
    public static final class52 method362(int arg0, int arg1) {
        ++field553;
        class52 var2 = (class52) class215.field3047.method2310((byte) -128, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            if (arg1 != 100) {
                method362(118, 66);
            }
            byte[] var3 = class239.field3559.method715(arg0, (byte) 108, 33);
            class52 var4 = new class52();
            if (var3 != null) {
                var4.method405(arg0, new class256(var3), arg1 + -97);
            }
            class215.field3047.method2299(true, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "(I)V")
    public final void method363(int arg0) {
        ++field562;
        class51.method392(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
    public class42() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            this.field560 = arg2.method1767(arg1 + 1930505517);
                        }
                    } else {
                        this.field559 = arg2.method1767(1930493576);
                    }
                } else {
                    this.field551 = arg2.method1738((byte) -97);
                }
            } else {
                this.field556 = arg2.method1767(arg1 ^ -1930481709);
            }
        } else {
            this.field558 = arg2.method1738((byte) -70);
        }
        if (arg1 != -11941) {
            method360(-19);
        }
        ++field552;
    }
}
