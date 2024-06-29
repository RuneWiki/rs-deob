import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class683 extends class513 implements class243 {

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "Lju;")
    public static class102 field9600 = new class102(78, -1);

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "C")
    public char field9596;

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "D")
    public static double field9603;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
    public static int field9591;

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "I")
    public static int field9592;

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
    public static int field9593;

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
    public int field9595;

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "I")
    public static int field9597;

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "I")
    public int field9598;

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "I")
    public static int field9599;

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "I")
    public int field9601;

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "I")
    public static int field9602;

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "I")
    public static int field9605;

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "J")
    public long field9604;

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "Lrp;")
    public static class134 field9606;

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "[[B")
    public static byte[][] field9594;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)J")
    public final long method1542(boolean arg0) {
        if (arg0) {
            return -23L;
        } else {
            field9593++;
            return this.field9604;
        }
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(B)V")
    public static void method3900(byte arg0) {
        field9594 = null;
        field9606 = null;
        if (arg0 >= -103) {
            field9600 = null;
        }
        field9600 = null;
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)I")
    public final int method1545(byte arg0) {
        field9602++;
        if (arg0 != -52) {
            this.method1543((byte) 44);
        }
        return this.field9598;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)I")
    public final int method1543(byte arg0) {
        if (arg0 <= 70) {
            method3901((byte) -23);
        }
        field9591++;
        return this.field9601;
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(B)V")
    public static final void method3901(byte arg0) {
        field9599++;
        if (class627.field8949) {
            return;
        }
        class675.field9508 += (24.0F - class675.field9508) / 2.0F;
        class627.field8949 = true;
        class263.field3586 = true;
        if (arg0 != 30) {
            field9594 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)C")
    public final char method1544(int arg0) {
        field9605++;
        if (arg0 != -28046) {
            this.method1543((byte) -7);
        }
        return this.field9596;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)I")
    public final int method1541(int arg0) {
        field9597++;
        return arg0 == -26820 ? this.field9595 : 84;
    }

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "(I)V")
    public static final void method3902(int arg0) {
        class150.field2065.method3464(8);
        field9592++;
        int var1 = class150.field2065.method3467(118, 8);
        if (class676.field9533 > var1) {
            for (int var2 = var1; var2 < class676.field9533; var2++) {
                class52.field743[class417.field5805++] = class731.field10231[var2];
            }
        }
        if (var1 > class676.field9533) {
            throw new RuntimeException("gnpov1");
        }
        class676.field9533 = arg0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class731.field10231[var3];
            class55 var5 = ((class15) class403.field5587.method1381(true, (long) var4)).field204;
            int var6 = class150.field2065.method3467(-5, 1);
            if (var6 == 0) {
                class731.field10231[class676.field9533++] = var4;
                var5.field8367 = class575.field8126;
            } else {
                int var7 = class150.field2065.method3467(-28, 2);
                if (var7 == 0) {
                    class731.field10231[class676.field9533++] = var4;
                    var5.field8367 = class575.field8126;
                    class745.field10385[class298.field3905++] = var4;
                } else if (var7 == 1) {
                    class731.field10231[class676.field9533++] = var4;
                    var5.field8367 = class575.field8126;
                    int var8 = class150.field2065.method3467(arg0 - 84, 3);
                    var5.method366(false, var8, 1);
                    int var9 = class150.field2065.method3467(7, 1);
                    if (var9 == 1) {
                        class745.field10385[class298.field3905++] = var4;
                    }
                } else if (var7 == 2) {
                    class731.field10231[class676.field9533++] = var4;
                    var5.field8367 = class575.field8126;
                    if (class150.field2065.method3467(107, 1) == 1) {
                        int var10 = class150.field2065.method3467(-24, 3);
                        var5.method366(false, var10, 2);
                        int var11 = class150.field2065.method3467(-99, 3);
                        var5.method366(false, var11, 2);
                    } else {
                        int var12 = class150.field2065.method3467(arg0 ^ 0xFFFFFFC3, 3);
                        var5.method366(false, var12, 0);
                    }
                    int var13 = class150.field2065.method3467(-119, 1);
                    if (var13 == 1) {
                        class745.field10385[class298.field3905++] = var4;
                    }
                } else if (var7 == 3) {
                    class52.field743[class417.field5805++] = var4;
                }
            }
        }
    }
}
