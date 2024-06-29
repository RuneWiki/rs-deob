import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class418 extends class180 {

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "Lsm;")
    public class249 field5749 = new class249();

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "[I")
    public static int[] field5747;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "[I")
    public static int[] field5746;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "F")
    public static float field5750;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method2439(String arg0, byte arg1) {
        field5748++;
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        if (arg1 <= 118) {
            field5746 = null;
        }
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
    public static void method2440(byte arg0) {
        if (arg0 == 92) {
            field5746 = null;
            field5747 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)I")
    public static final int method2441(int arg0, int arg1, int arg2, int arg3) {
        field5745++;
        if (class317.field4306 == null) {
            return 0;
        }
        if (arg3 != -16778) {
            method2441(37, -75, -29, 8);
        }
        int var4 = arg2 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || (class200.field2875 - 1) < var4 || (class422.field5811 - 1) < var5) {
            return 0;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class205.field2947[1][var4][var5] & 0x2) != 0) {
            var6 = arg1 + 1;
        }
        return class317.field4306[var6].method701(arg2, arg0);
    }

    static {
        new class112("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field5747 = new int[100];
        field5746 = new int[1000];
        field5750 = 0.0F;
    }
}
