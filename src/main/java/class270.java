import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class270 {

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public int field3678;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public int field3676;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
    public int field3677;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
    public int field3685;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3679 = new String[8];

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "Ljj;")
    public static class398 field3681 = new class398(39, 0);

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II[BIII)Z")
    public static final boolean method1655(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field3683++;
        boolean var6 = true;
        class138 var7 = new class138(arg2);
        int var8 = -1;
        if (arg1 != 0) {
            return true;
        }
        label58: while (true) {
            int var9 = var7.method945(84);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method914(66);
                    if (var13 == 0) {
                        continue label58;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = var10 >> 6 & 0x3F;
                    int var16 = var7.method957((byte) -87) >> 2;
                    int var17 = arg5 + var15;
                    int var18 = arg4 + var14;
                    if (var17 > 0 && var18 > 0 && var17 < arg3 - 1 && var18 < (arg0 - 1)) {
                        class252 var19 = class578.field7980.method1746(var8, (byte) 74);
                        if (var16 != 22 || class72.field935.field6500 || var19.field3453 != 0 || var19.field3440 == 1 || var19.field3412) {
                            if (!var19.method1566((byte) 40)) {
                                var6 = false;
                                class398.field5673++;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.method914(-75);
                if (var12 == 0) {
                    break;
                }
                var7.method957((byte) -107);
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
    public static final void method1656(byte arg0) {
        class539.field7388 = null;
        class581.field8013 = null;
        class486.field6568 = null;
        field3680++;
        class46.field629 = null;
        class367.field5293 = null;
        class211.field2758 = null;
        if (arg0 == 89) {
            class485.field6564 = null;
            class548.field7494 = null;
            class56.field785 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
    public static void method1657(int arg0) {
        field3681 = null;
        if (arg0 != 22376) {
            field3679 = null;
        }
        field3679 = null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZLjava/lang/String;Ljava/lang/String;)V")
    public static final void method1658(int arg0, boolean arg1, String arg2, String arg3) {
        class644.field9129 = arg0;
        field3682++;
        class168.field2105 = 2;
        class525.method2994(-1, arg3, arg2, arg1);
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(IIII)V")
    public class270(int arg0, int arg1, int arg2, int arg3) {
        this.field3678 = arg3;
        this.field3676 = arg2;
        this.field3677 = arg1;
        this.field3685 = arg0;
    }

    @OriginalMember(owner = "client!lp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3684++;
        throw new IllegalStateException();
    }
}
