import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class639 {

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Lpq;")
    private class159 field8718;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "[[I")
    private int[][] field8721;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field8716;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field8717;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "I")
    public static int field8719;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field8720;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "Lpq;")
    public static class159 field8722;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V", line = 6)
    public static void method3476(int arg0) {
        if (arg0 < 97) {
            method3476(85);
        }
        field8722 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)[I", line = 17)
    public final int[] method3477(int arg0, int arg1) {
        field8716++;
        if (arg1 == 339) {
            return arg0 >= 0 && this.field8721.length > arg0 ? this.field8721[arg0] : new int[0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(II)I", line = 35)
    public static final int method3478(int arg0, int arg1) {
        int var2 = -22 % ((-arg1 - 26) / 38);
        field8720++;
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BC)Z", line = 45)
    public static final boolean method3479(byte arg0, char arg1) {
        field8719++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        }
        if (arg0 != -96) {
            field8722 = null;
        }
        if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)Lki;", line = 71)
    public final class261 method3480(int arg0, byte arg1) {
        field8717++;
        byte[] var3 = this.field8718.method1087(1, arg0, 1);
        class261 var4 = new class261();
        if (arg1 <= 88) {
            method3476(26);
        }
        var4.method1636((byte) -103, new class138(var3));
        return var4;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Luea;ILpq;)V", line = 87)
    public class639(class484 arg0, int arg1, class159 arg2) {
        this.field8718 = arg2;
        this.field8718.method1076(1, 0);
        class138 var4 = new class138(this.field8718.method1087(0, 0, 1));
        int var5 = var4.method957((byte) -67);
        if (var5 > 1) {
            this.field8721 = new int[0][];
        } else {
            int var6 = var4.method957((byte) -118);
            class606[] var7 = class377.method2291((byte) 50);
            boolean var8 = true;
            if (var7.length == var6) {
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var4.method957((byte) -66);
                    if (var7[var9].field8276 != var10) {
                        var8 = false;
                        break;
                    }
                }
            } else {
                var8 = false;
            }
            if (var8) {
                int var11 = var4.method957((byte) -117);
                int var12 = var4.method957((byte) -87);
                this.field8721 = new int[var12 + 1][];
                for (int var13 = 0; var13 < var11; var13++) {
                    int var14 = var4.method957((byte) -127);
                    int var15 = var4.method922((byte) -128);
                    this.field8721[var14] = new int[var15];
                    for (int var16 = 0; var16 < var15; var16++) {
                        this.field8721[var13][var16] = var4.method922((byte) -114);
                    }
                }
            } else {
                this.field8721 = new int[0][];
            }
        }
    }
}
