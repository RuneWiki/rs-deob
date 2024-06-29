import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class165 extends class60 {

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "Lub;")
    public class227 field2765;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "Lub;")
    public static class227 field2768 = class257.method1749(":", 17263);

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "Lub;")
    public static class227 field2770 = class257.method1749(": ", 17263);

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2767 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "Lrb;")
    public static class254 field2771 = new class254(64);

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "Lub;")
    private static class227 field2773 = class257.method1749("Discard", 17263);

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "Lub;")
    public static class227 field2772 = field2773;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Lth;")
    public static class239 field2766;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public static final void method1018(int arg0) {
        class214.method1360(arg0 ^ 0xFFFFFF7D);
        class210.method1341(-1);
        field2769++;
        class114.method723((byte) 30);
        class46.method260(-111);
        class227.method1498(-1743);
        if (arg0 != 255) {
            return;
        }
        class88.method526((byte) 126);
        class38.method204((byte) 5);
        class125.method772(-1595657136);
        class14.method72(0);
        class236.method1572(arg0 ^ 0xFF00);
        class85.method516((byte) 126);
        class99.method611(-85);
        class162.method994(0);
        class2.method8((byte) -100);
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public static void method1019(int arg0) {
        field2773 = null;
        field2766 = null;
        if (arg0 != 3) {
            method1021(-1);
        }
        field2771 = null;
        field2770 = null;
        field2767 = null;
        field2772 = null;
        field2768 = null;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    public class165() {
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lub;)V")
    public class165(class227 arg0) {
        this.field2765 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZIIIIIIII)V")
    public static final void method1020(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (!arg1) {
            return;
        }
        field2763++;
        if (arg2 == arg7 && arg4 == arg5 && arg0 == arg3 && arg6 == arg8) {
            class173.method1107(-121, arg7, arg9, arg5, arg0, arg8);
            return;
        }
        int var10 = arg5;
        int var11 = arg7;
        int var12 = arg7 * 3;
        int var13 = arg2 * 3;
        int var14 = arg5 * 3;
        int var15 = arg6 * 3;
        int var16 = arg4 * 3;
        int var17 = arg3 * 3;
        int var18 = arg8 + var16 - var15 - arg5;
        int var19 = var17 + var12 - var13 - var13;
        int var20 = arg0 + var13 - arg7 - var17;
        int var21 = var14 + var15 - var16 - var16;
        int var22 = var13 - var12;
        int var23 = var16 - var14;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var19 * var25;
            int var28 = var18 * var26;
            int var29 = var20 * var26;
            int var30 = var21 * var25;
            int var31 = var23 * var24;
            int var32 = var22 * var24;
            int var33 = arg7 + (var27 + var29 + var32 >> 12);
            int var34 = arg5 + (var28 + var31 + var30 >> 12);
            class173.method1107(-63, var11, arg9, var10, var33, var34);
            var11 = var33;
            var10 = var34;
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)[Lnf;")
    public static final class213[] method1021(int arg0) {
        field2764++;
        class213[] var1 = new class213[class168.field2810];
        for (int var2 = 0; var2 < class168.field2810; var2++) {
            int var4 = class214.field3613[var2] * class177.field2982[var2];
            byte[] var5 = class26.field427[var2];
            if (class169.field2828[var2]) {
                int[] var8 = new int[var4];
                byte[] var9 = class122.field2205[var2];
                for (int var10 = 0; var10 < var4; var10++) {
                    var8[var10] = class246.method1640(class76.method446(var9[var10] << 24, -16777216), class63.field1153[class76.method446(var5[var10], 255)]);
                }
                var1[var2] = new class129(class161.field2727, class241.field4197, class58.field1068[var2], class176.field2934[var2], class177.field2982[var2], class214.field3613[var2], var8);
            } else {
                int[] var6 = new int[var4];
                for (int var7 = 0; var7 < var4; var7++) {
                    var6[var7] = class63.field1153[class76.method446(var5[var7], 255)];
                }
                var1[var2] = new class163(class161.field2727, class241.field4197, class58.field1068[var2], class176.field2934[var2], class177.field2982[var2], class214.field3613[var2], var6);
            }
        }
        class57.method350((byte) -85);
        int var3 = 60 % ((arg0 - 14) / 54);
        return var1;
    }
}
