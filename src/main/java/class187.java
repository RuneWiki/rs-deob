import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class187 implements class456 {

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public int field2708;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "F")
    public static float field2712;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field2713;

    static {
        new class466("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field2712 = 0.0F;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILju;)I", line = 4)
    public static final int method1175(int arg0, class82 arg1) {
        field2710++;
        String var2 = class113.method813(arg1, -2048);
        int[] var3 = null;
        if (class256.method1540(arg1.field1230, arg0 + 889)) {
            var3 = class328.field4480.method3091(52, (int) arg1.field1238).field7552;
        } else if (arg1.field1235 != -1) {
            var3 = class328.field4480.method3091(arg0 + 1134, arg1.field1235).field7552;
        } else if (class442.method2632((byte) -98, arg1.field1230)) {
            class502 var4 = class378.field5533[(int) arg1.field1238];
            if (var4 != null) {
                class79 var5 = var4.field7387;
                if (var5.field1143 != null) {
                    var5 = var5.method646(0, class421.field6166);
                }
                if (var5 != null) {
                    var3 = var5.field1209;
                }
            }
        } else if (class90.method672(arg1.field1230, (byte) -128)) {
            Object var6 = null;
            class220 var7;
            if (arg1.field1230 == 1006) {
                var7 = class78.field1141.method2103((int) arg1.field1238, true);
            } else {
                var7 = class78.field1141.method2103((int) (arg1.field1238 >>> 32 & 0x7FFFFFFFL), true);
            }
            if (var7.field3080 != null) {
                var7 = var7.method1362(true, class421.field6166);
            }
            if (var7 != null) {
                var3 = var7.field3132;
            }
        }
        if (var3 != null) {
            var2 = var2 + class235.method1451(0, var3);
        }
        int var8 = class407.field5952.method2876(var2, arg0 ^ 0xFFFFFCEE, class150.field2264);
        if (arg0 != -1007) {
            field2712 = 1.142801F;
        }
        if (arg1.field1236) {
            var8 += class511.field7573.method102() + 4;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILsi;)V", line = 76)
    public static final void method1176(int arg0, class391 arg1) {
        field2709++;
        byte[] var2 = new byte[24];
        if (class82.field1237 != null) {
            try {
                class82.field1237.method2710(true, 0L);
                class82.field1237.method2709(var2, (byte) 81);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method2315(4, 24, var2, arg0);
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 129)
    public class187(String arg0, int arg1) {
        this.field2708 = arg1;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILjava/lang/String;)V", line = 148)
    public static final void method1177(int arg0, String arg1) {
        field2706++;
        if (!class59.field720) {
            return;
        }
        boolean var2 = false;
        int var3 = class375.field5498;
        if (arg0 != 16703) {
            return;
        }
        int[] var4 = class397.field5793;
        for (int var5 = 0; var5 < var3; var5++) {
            class438 var6 = class12.field182[var4[var5]];
            if (var6 != null && class316.field4324 != var6 && var6.field6421 != null && var6.field6421.equalsIgnoreCase(arg1)) {
                class491.method2878((byte) 92, class74.field1004);
                class421.field6165++;
                class481.field7027.method2360(32, var4[var5]);
                class481.field7027.method2312((byte) -84, 0);
                class481.field7027.method2323(class11.field171, arg0 - 16632);
                class481.field7027.method2331(class250.field3462, false);
                class481.field7027.method2323(class214.field2994, 24);
                var2 = true;
                class506.method3020(0, 0, arg0 - 18799, true, -2, var6.method626((byte) 120), var6.field1117[0], var6.method626((byte) 120), var6.field1127[0]);
                break;
            }
        }
        if (!var2) {
            class49.method438(class351.field5152.method2731(arg0 ^ 0x4101, class372.field5455) + arg1, (byte) -68);
        }
        if (class59.field720) {
            class88.method668((byte) -70);
        }
    }

    @OriginalMember(owner = "client!ol", name = "toString", descriptor = "()Ljava/lang/String;", line = 206)
    public final String toString() {
        field2711++;
        throw new IllegalStateException();
    }
}
