import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Lv;")
    public static class146 field141 = class159.method1226((byte) -37, "Clientscript error in: ");

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field131 = 0;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field136 = -1;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Lv;")
    private static class146 field135 = class159.method1226((byte) -37, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lv;")
    private static class146 field130 = class159.method1226((byte) -37, "Loaded sprites");

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "Lv;")
    public static class146 field144 = class159.method1226((byte) -37, "<col=ffff00>");

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Lv;")
    public static class146 field137 = field130;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Lv;")
    public static class146 field132 = field135;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "Lv;")
    public static class146 field147 = class159.method1226((byte) -37, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "Lv;")
    private static class146 field148 = class159.method1226((byte) -37, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Lv;")
    public static class146 field134 = field148;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field140 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Loa;")
    public static class98 field150 = new class98();

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "J")
    public static long field133;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "Z")
    public static boolean field149;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static final void method49(int arg0) {
        int var1 = arg0;
        field142++;
        if (class100.field2430 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class100.field2430 > 768) {
                    class97.field2349[var2] = class142.method1058(class77.field1871[var2], class76.field1810[var2], 1024 - class100.field2430, (byte) -110);
                } else if (class100.field2430 > 256) {
                    class97.field2349[var2] = class76.field1810[var2];
                } else {
                    class97.field2349[var2] = class142.method1058(class76.field1810[var2], class77.field1871[var2], 256 - class100.field2430, (byte) -125);
                }
            }
        } else if (class103.field2514 <= 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                class97.field2349[var3] = class77.field1871[var3];
            }
        } else {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class103.field2514 > 768) {
                    class97.field2349[var4] = class142.method1058(class77.field1871[var4], class125.field2911[var4], 1024 - class103.field2514, (byte) -111);
                } else if (class103.field2514 > 256) {
                    class97.field2349[var4] = class125.field2911[var4];
                } else {
                    class97.field2349[var4] = class142.method1058(class125.field2911[var4], class77.field1871[var4], 256 - class103.field2514, (byte) -120);
                }
            }
        }
        class56.method387(0, 9, 128, arg0 + 7);
        class88.field2090.method430(0, 0);
        int var5 = 0;
        class56.method376();
        int var6 = 6885;
        for (int var7 = 1; var7 < var1 - 1; var7++) {
            int var20 = (var1 - var7) * class70.field1635[var7] / var1;
            int var21 = var20 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var23 = class49.field1121[var5++];
                if (var23 == 0) {
                    var6++;
                } else {
                    int var25 = 256 - var23;
                    int var26 = class97.field2349[var23];
                    int var27 = class141.field3233.field3474[var6];
                    class141.field3233.field3474[var6++] = class90.method711(-16711936, var23 * class90.method711(var26, 16711935) + var25 * class90.method711(16711935, var27)) + class90.method711(class90.method711(65280, var27) * var25 + class90.method711(65280, var26) * var23, 16711680) >> 8;
                }
            }
            var6 += var21 + 765 - 128;
        }
        int var8 = 0;
        class56.method387(637, 9, 765, var1 + 7);
        class81.field1971.method430(382, 0);
        class56.method376();
        int var9 = 7546;
        for (int var10 = 1; var10 < var1 - 1; var10++) {
            int var11 = (var1 - var10) * class70.field1635[var10] / var1;
            int var12 = var9 + var11;
            int var13 = 103 - var11;
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = class49.field1121[var8++];
                if (var15 == 0) {
                    var12++;
                } else {
                    int var17 = 256 - var15;
                    int var18 = class141.field3233.field3474[var12];
                    int var19 = class97.field2349[var15];
                    class141.field3233.field3474[var12++] = class90.method711(-16711936, var15 * class90.method711(var19, 16711935) + var17 * class90.method711(16711935, var18)) + class90.method711(var15 * class90.method711(var19, 65280) + var17 * class90.method711(65280, var18), 16711680) >> 8;
                }
            }
            var9 = var12 + 765 - var13 - var11;
            var8 += 128 - var13;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public static final void method50(boolean arg0) {
        if (arg0) {
            method50(false);
        }
        field138++;
        Object var1 = class119.field2764;
        synchronized (class119.field2764) {
            if (class117.field2724 != 0) {
                class117.field2724 = 1;
                try {
                    class119.field2764.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(JI)V")
    public static final void method51(long arg0, int arg1) {
        field145++;
        if (arg1 != -14344 || arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class91.method721(true, arg0 - 1L);
            class91.method721(true, 1L);
        } else {
            class91.method721(true, arg0);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BII)V")
    public static final void method52(byte arg0, int arg1, int arg2) {
        field139++;
        if (class54.method365(29657, arg2)) {
            class5.method47(class34.field736[arg2], arg0 ^ 0xB, arg1);
            if (arg0 != -11) {
                field131 = 57;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    public static void method53(int arg0) {
        field141 = null;
        field130 = null;
        if (arg0 != 65280) {
            field137 = null;
        }
        field140 = null;
        field137 = null;
        field134 = null;
        field148 = null;
        field147 = null;
        field144 = null;
        field132 = null;
        field135 = null;
        field150 = null;
    }
}
