import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class342 {

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public int field5225 = 16777215;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public int field5226 = 8;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "[[B")
    public static byte[][] field5213 = new byte[250][];

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field5217 = 1407;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public static int field5221 = 0;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "Z")
    public static boolean field5222 = false;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public int field5211;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public int field5215;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!va", name = "p", descriptor = "I")
    public int field5223;

    @OriginalMember(owner = "client!va", name = "q", descriptor = "I")
    public int field5224;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public int field5227;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "Lf;")
    public static class528 field5219;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Z")
    public boolean field5209;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "[[Z")
    public static boolean[][] field5220;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILti;)V")
    public final void method2229(int arg0, class303 arg1) {
        if (arg0 != 17304) {
            field5220 = null;
        }
        while (true) {
            int var3 = arg1.method1918((byte) -88);
            if (var3 == 0) {
                field5208++;
                return;
            }
            this.method2230(arg1, var3, arg0 ^ 0xFFFFBC27);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lti;II)V")
    private final void method2230(class303 arg0, int arg1, int arg2) {
        field5212++;
        int var4 = 39 / ((-arg2 - 9) / 56);
        if (arg1 == 1) {
            this.field5226 = arg0.method1868(0);
        } else if (arg1 == 2) {
            this.field5209 = true;
        } else if (arg1 == 3) {
            this.field5211 = arg0.method1901(118);
            this.field5215 = arg0.method1901(120);
            this.field5227 = arg0.method1901(127);
        } else if (arg1 == 4) {
            this.field5223 = arg0.method1918((byte) -56);
            return;
        } else if (arg1 == 5) {
            this.field5224 = arg0.method1868(0);
            return;
        } else if (arg1 == 6) {
            this.field5225 = arg0.method1866(false);
            return;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method2231(int arg0) {
        field5219 = null;
        if (arg0 != 6879) {
            method2233(50, (byte) -23, -110, 53, 50, -21, -5);
        }
        field5220 = null;
        field5213 = null;
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public static final void method2232(int arg0) {
        field5216++;
        class22.field343.method2349(arg0);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IBIIIII)V")
    public static final void method2233(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5218++;
        int var7 = -90 % ((arg1 - 71) / 52);
        int var8 = arg0 + arg6;
        int var9 = arg2 - arg0;
        for (int var10 = arg6; var10 < var8; var10++) {
            class217.method1448(class436.field6332[var10], arg3, arg4, 4, arg5);
        }
        int var11 = arg3 + arg0;
        for (int var12 = arg2; var12 > var9; var12--) {
            class217.method1448(class436.field6332[var12], arg3, arg4, 4, arg5);
        }
        int var13 = arg5 - arg0;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class436.field6332[var14];
            class217.method1448(var15, arg3, arg4, 4, var11);
            class217.method1448(var15, var13, arg4, 4, arg5);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method2234(boolean arg0, String arg1) {
        field5210++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        if (!arg0) {
            field5217 = 3;
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
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
}
