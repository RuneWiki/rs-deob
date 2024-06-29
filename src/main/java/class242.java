import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class242 extends class337 {

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "J")
    public long field3570;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "Lri;")
    public static class73 field3571 = new class73(24, 2);

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "Llt;")
    public static class475 field3572 = new class475("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    public static int field3573 = 0;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "I")
    public static int field3574 = 0;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "[I")
    public static int[] field3575;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIZ)I", line = 5)
    public static final int method1627(int arg0, int arg1, boolean arg2) {
        field3569++;
        if (arg2) {
            return -36;
        }
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)Z", line = 34)
    public static final boolean method1628(boolean arg0) {
        for (int var1 = class449.field6688; var1 < class208.field2979; var1++) {
            class518[][] var2 = class108.field1553[var1];
            for (int var3 = -class367.field5607; var3 <= 0; var3++) {
                int var4 = class381.field5776 + var3;
                int var5 = class381.field5776 - var3;
                if (var4 >= class14.field173 || var5 < class147.field2175) {
                    for (int var6 = -class367.field5607; var6 <= 0; var6++) {
                        int var7 = class346.field4983 + var6;
                        int var8 = class346.field4983 - var6;
                        if (var4 >= class14.field173) {
                            if (var7 >= class23.field237) {
                                class518 var9 = var2[var4][var7];
                                if (var9 != null && var9.field7566) {
                                    class209.field3029 = arg0;
                                    class42.field640.method946(-81, var9);
                                    class42.field640.method949(38);
                                }
                            }
                            if (var8 < class18.field193) {
                                class518 var10 = var2[var4][var8];
                                if (var10 != null && var10.field7566) {
                                    class209.field3029 = arg0;
                                    class42.field640.method946(-111, var10);
                                    class42.field640.method949(38);
                                }
                            }
                        }
                        if (var5 < class147.field2175) {
                            if (var7 >= class23.field237) {
                                class518 var11 = var2[var5][var7];
                                if (var11 != null && var11.field7566) {
                                    class209.field3029 = arg0;
                                    class42.field640.method946(-92, var11);
                                    class42.field640.method949(38);
                                }
                            }
                            if (var8 < class18.field193) {
                                class518 var12 = var2[var5][var8];
                                if (var12 != null && var12.field7566) {
                                    class209.field3029 = arg0;
                                    class42.field640.method946(-81, var12);
                                    class42.field640.method949(38);
                                }
                            }
                        }
                        if (class98.field1439 == 0) {
                            if (class420.field6326) {
                                class42.field640.method950(24, (byte) 41);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V", line = 141)
    public static void method1629(int arg0) {
        field3571 = null;
        field3572 = null;
        field3575 = null;
        int var1 = 59 % ((-arg0 - 58) / 40);
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V", line = 153)
    public class242() {
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(J)V", line = 158)
    public class242(long arg0) {
        this.field3570 = arg0;
    }
}
