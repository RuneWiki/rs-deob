import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class356 extends class24 {

    @OriginalMember(owner = "client!on", name = "G", descriptor = "J")
    public static long field5220 = -1L;

    @OriginalMember(owner = "client!on", name = "D", descriptor = "Laca;")
    public static class758 field5217 = new class758(0, 0);

    @OriginalMember(owner = "client!on", name = "H", descriptor = "I")
    public static int field5221 = 0;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "B")
    private byte field5210;

    @OriginalMember(owner = "client!on", name = "C", descriptor = "B")
    private byte field5216;

    @OriginalMember(owner = "client!on", name = "E", descriptor = "B")
    private byte field5218;

    @OriginalMember(owner = "client!on", name = "F", descriptor = "B")
    private byte field5219;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!on", name = "z", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!on", name = "B", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!on", name = "I", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "Z")
    private boolean field5211;

    @OriginalMember(owner = "client!on", name = "A", descriptor = "[S")
    public static short[] field5214;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "(B)V")
    public static void method2241(byte arg0) {
        field5217 = null;
        int var1 = 77 % ((58 - arg0) / 59);
        field5214 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILjp;)V")
    public final void method191(int arg0, class376 arg1) {
        field5215++;
        this.field5211 = arg1.method2398(-1372747256) == 1;
        if (arg0 < -56) {
            this.field5216 = arg1.method2387((byte) -84);
            this.field5219 = arg1.method2387((byte) 108);
            this.field5218 = arg1.method2387((byte) -76);
            this.field5210 = arg1.method2387((byte) 103);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lnb;Z)Z")
    public static final boolean method2242(class319 arg0, boolean arg1) {
        boolean var2 = class538.field7317 == class528.field7227;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method226(-125);
        if (arg0.field4600 < 0 || arg0.field4590 < 0 || arg0.field4595 >= class405.field5875 || arg0.field4585 >= class710.field9947) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field4600; var7 <= arg0.field4595; var7++) {
            for (int var11 = arg0.field4590; var11 <= arg0.field4585; var11++) {
                class243 var12 = class501.method2895(arg0.field2250, var7, var11);
                if (var12 != null) {
                    class48 var13 = class69.method608(arg0, 120);
                    class48 var14 = var12.field3272;
                    if (var14 == null) {
                        var12.field3272 = var13;
                    } else {
                        while (var14.field726 != null) {
                            var14 = var14.field726;
                        }
                        var14.field726 = var13;
                    }
                    if (var2 && (class176.field2351[var7][var11] & 0xFF000000) != 0) {
                        var3 = class176.field2351[var7][var11];
                        var4 = class767.field10581[var7][var11];
                        var5 = class261.field3883[var7][var11];
                    }
                    if (!arg1 && var12.field3280 != null && var12.field3280.field63 > var6) {
                        var6 = var12.field3280.field63;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field4600; var8 <= arg0.field4595; var8++) {
                for (int var9 = arg0.field4590; var9 <= arg0.field4585; var9++) {
                    if ((class176.field2351[var8][var9] & 0xFF000000) == 0) {
                        class176.field2351[var8][var9] = var3;
                        class767.field10581[var8][var9] = var4;
                        class261.field3883[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class200.field2657[class186.field2480++] = arg0;
        } else {
            int var10 = class538.field7317 == class528.field7227 ? 1 : 0;
            if (!arg0.method19(-123)) {
                arg0.field2252 = class503.field6961[var10];
                class503.field6961[var10] = arg0;
            } else if (arg0.method21(0)) {
                arg0.field2252 = class563.field7549[var10];
                class563.field7549[var10] = arg0;
            } else {
                arg0.field2252 = class308.field4450[var10];
                class308.field4450[var10] = arg0;
                class768.field10591 = true;
            }
        }
        if (arg1) {
            arg0.field2246 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lke;I)V")
    public final void method190(class625 arg0, int arg1) {
        arg0.field8412 = this.field5211;
        arg0.field8429 = this.field5218;
        arg0.field8417 = this.field5216;
        arg0.field8414 = this.field5219;
        field5212++;
        if (arg1 != 5) {
            method2241((byte) -33);
        }
        arg0.field8406 = this.field5210;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(II)I")
    public static final int method2243(int arg0, int arg1) {
        return class176.field2351 == null ? 0 : class176.field2351[arg0][arg1] & 0xFFFFFF;
    }
}
