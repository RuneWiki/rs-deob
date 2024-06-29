import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class705 {

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "[[Z")
    public static boolean[][] field9809 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public static int field9807;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    public static int field9808;

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
    public static int field9811;

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
    public static int field9812;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "Lfp;")
    public static class323 field9810;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)V")
    public static void method3962(boolean arg0) {
        field9809 = null;
        field9810 = null;
        if (!arg0) {
            method3964(-76, null);
        }
    }

    @OriginalMember(owner = "client!pw", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9807++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)Lch;")
    public static final class463 method3963(int arg0) {
        field9812++;
        class68 var1 = null;
        class463 var2 = new class463(class633.field8733, 0);
        if (arg0 >= -109) {
            method3962(false);
        }
        try {
            class249 var3 = class202.field2644.method2048(true, "", -4053);
            while (var3.field3310 == 0) {
                class756.method4205(1L, 0);
            }
            if (var3.field3310 == 1) {
                var1 = (class68) var3.field3311;
                byte[] var4 = new byte[(int) var1.method561((byte) 69)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var1.method565(var5, (byte) 94, var4.length - var5, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                var2 = new class463(new class675(var4), class633.field8733, 0);
            }
        } catch (Exception var8) {
        }
        try {
            if (var1 != null) {
                var1.method562(-47);
            }
        } catch (Exception var7) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method3964(int arg0, String arg1) {
        field9808++;
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var2 < var3 && class534.method3104(arg1.charAt(var2), false)) {
            var2++;
        }
        while (var3 > var2 && class534.method3104(arg1.charAt(var3 - 1), false)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class756.method4203(var7, 0)) {
                char var8 = class719.method4039(35, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == arg0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lha;ZLfp;)V")
    public static final void method3965(class58 arg0, boolean arg1, class323 arg2) {
        field9811++;
        class204[] var3 = class204.method1235(arg2, class196.field2613, 0);
        class712.field9898 = new class88[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class712.field9898[var4] = arg0.method484(var3[var4], true);
        }
        class204[] var5 = class204.method1235(arg2, class404.field5715, 0);
        class104.field1242 = new class88[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class104.field1242[var6] = arg0.method484(var5[var6], true);
        }
        class204[] var7 = class204.method1235(arg2, class350.field4954, 0);
        class69.field849 = new class88[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class69.field849[var8] = arg0.method484(var7[var8], true);
        }
        class204[] var9 = class204.method1235(arg2, class514.field7337, 0);
        class675.field9177 = new class88[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class675.field9177[var10] = arg0.method484(var9[var10], true);
        }
        class204[] var11 = class204.method1235(arg2, class8.field119, 0);
        class392.field5545 = new class88[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class392.field5545[var12] = arg0.method484(var11[var12], true);
        }
        class204[] var13 = class204.method1235(arg2, class734.field10236, 0);
        class346.field4870 = new class88[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class346.field4870[var14] = arg0.method484(var13[var14], true);
        }
        if (arg1) {
            field9810 = null;
        }
        class204[] var15 = class204.method1235(arg2, class734.field10235, 0);
        class587.field8274 = new class88[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class587.field8274[var16] = arg0.method484(var15[var16], true);
        }
        class204[] var17 = class204.method1235(arg2, class563.field7902, 0);
        class13.field250 = new class88[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class13.field250[var18] = arg0.method484(var17[var18], true);
        }
        class204[] var19 = class204.method1235(arg2, class29.field392, 0);
        class458.field6452 = new class88[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class458.field6452[var20] = arg0.method484(var19[var20], true);
        }
        class204[] var21 = class204.method1235(arg2, class609.field8565, 0);
        class48.field566 = new class88[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class48.field566[var22] = arg0.method484(var21[var22], true);
        }
        class204[] var23 = class204.method1235(arg2, class144.field2054, 0);
        class103.field1225 = new class88[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class103.field1225[var24] = arg0.method484(var23[var24], true);
        }
        class204[] var25 = class204.method1235(arg2, class237.field3178, 0);
        class716.field9948 = new class88[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class716.field9948[var26] = arg0.method484(var25[var26], true);
        }
        class510.field7297 = arg0.method484(class204.method1237(arg2, class153.field2152, 0), true);
        class322.field4456 = arg0.method484(class204.method1237(arg2, class381.field5460, 0), true);
        class204[] var27 = class204.method1235(arg2, class337.field4696, 0);
        class731.field10207 = new class88[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class731.field10207[var28] = arg0.method484(var27[var28], true);
        }
    }
}
