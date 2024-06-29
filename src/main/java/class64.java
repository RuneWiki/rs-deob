import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class64 extends class170 {

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field955 = 0;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "Ljava/lang/String;")
    public static String field958 = "cyan:";

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field960 = 0;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field954 = 0;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "Lm;")
    public static class48 field956;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "[[[B")
    public static byte[][][] field959;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 10)
    public static final void method552(int arg0) {
        field961++;
        if (class281.method1978((byte) 75) != 2) {
            return;
        }
        byte var1 = (byte) (class255.field3812 - 4 & 0xFF);
        int var2 = class255.field3812 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class183.field2773[var3][var2][var4] = var1;
            }
        }
        if (arg0 != 2586) {
            method552(-31);
        }
        if (class50.field775 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class31.field401[var5] = -1000000;
            class321.field4991[var5] = 1000000;
            class100.field1496[var5] = 0;
            class39.field584[var5] = 1000000;
            class105.field1609[var5] = 0;
        }
        if (class78.field1104 != 1) {
            int var6 = class294.method2080(899, class311.field4845, class220.field3455, class50.field775);
            if ((var6 - class294.field4628) < 800 && (class208.field3272[class50.field775][class220.field3455 >> 7][class311.field4845 >> 7] & 0x4) != 0) {
                class86.method711(false, arg0 ^ 0xFFFFF59A, 1, class220.field3455 >> 7, class250.field3746, class311.field4845 >> 7);
            }
            return;
        }
        if ((class208.field3272[class50.field775][class235.field3602.field4507 >> 7][class235.field3602.field4496 >> 7] & 0x4) != 0) {
            class86.method711(false, 33, 0, class235.field3602.field4507 >> 7, class250.field3746, class235.field3602.field4496 >> 7);
        }
        if (class89.field1299 >= 310) {
            return;
        }
        int var7 = class311.field4845 >> 7;
        int var8 = class220.field3455 >> 7;
        int var9 = class235.field3602.field4507 >> 7;
        int var10;
        if (var8 < var9) {
            var10 = var9 - var8;
        } else {
            var10 = var8 - var9;
        }
        int var11 = class235.field3602.field4496 >> 7;
        int var12;
        if (var7 < var11) {
            var12 = var11 - var7;
        } else {
            var12 = var7 - var11;
        }
        if (var10 > var12) {
            int var15 = var12 * 65536 / var10;
            int var16 = 32768;
            while (var8 != var9) {
                if (var9 > var8) {
                    var8++;
                } else if (var8 > var9) {
                    var8--;
                }
                if ((class208.field3272[class50.field775][var8][var7] & 0x4) != 0) {
                    class86.method711(false, arg0 - 2564, 1, var8, class250.field3746, var7);
                    break;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    if (var7 < var11) {
                        var7++;
                    } else if (var11 < var7) {
                        var7--;
                    }
                    var16 -= 65536;
                    if ((class208.field3272[class50.field775][var8][var7] & 0x4) != 0) {
                        class86.method711(false, 34, 1, var8, class250.field3746, var7);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var10 * 65536 / var12;
        int var14 = 32768;
        while (var7 != var11) {
            if (var11 > var7) {
                var7++;
            } else if (var7 > var11) {
                var7--;
            }
            if ((class208.field3272[class50.field775][var8][var7] & 0x4) != 0) {
                class86.method711(false, arg0 ^ 0xA05, 1, var8, class250.field3746, var7);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                var14 -= 65536;
                if (var8 < var9) {
                    var8++;
                } else if (var8 > var9) {
                    var8--;
                }
                if ((class208.field3272[class50.field775][var8][var7] & 0x4) != 0) {
                    class86.method711(false, -125, 1, var8, class250.field3746, var7);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V", line = 196)
    public static void method553(boolean arg0) {
        if (arg0) {
            field959 = (byte[][][]) ((byte[][][]) null);
        }
        field959 = (byte[][][]) null;
        field958 = null;
        field956 = null;
    }
}
