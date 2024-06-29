import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class312 extends class97 {

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
    public int field4689;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    public int field4687;

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "Lwl;")
    public static class452 field4692 = new class452(66, 0);

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "Lwl;")
    public static class452 field4699 = new class452(34, -1);

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "Z")
    public static boolean field4703 = false;

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "Lnn;")
    public static class151 field4704 = new class151("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "Lpf;")
    public static class425 field4705 = new class425(67, 8);

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!vo", name = "v", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!vo", name = "w", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!vo", name = "y", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!vo", name = "A", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)Z")
    public final boolean method1897(int arg0) {
        field4697++;
        int var2 = 4 % ((arg0 - 19) / 49);
        return ((this.field4689 & 0x2E0E5B) >> 21) != 0;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZI)V")
    public static final void method1898(boolean arg0, int arg1) {
        class115.field1515 = 0;
        class324.field4875 = 0;
        if (arg1 != 3) {
            return;
        }
        field4701++;
        class365.method2191((byte) -110);
        class219.method1333(arg0, true);
        class331.method2035(5283);
        for (int var2 = 0; var2 < class115.field1515; var2++) {
            int var4 = class148.field2046[var2];
            if (class26.field332 != class170.field2626[var4].field1977) {
                if (class170.field2626[var4].field2137.method1690(-70)) {
                    class422.method2606((byte) -56, class170.field2626[var4]);
                }
                class170.field2626[var4].method956((class271) null, 0);
                class170.field2626[var4] = null;
            }
        }
        if (class44.field547 != class424.field6232.field5666) {
            throw new RuntimeException("gnp1 pos:" + class424.field6232.field5666 + " psize:" + class44.field547);
        }
        for (int var3 = 0; var3 < class38.field458; var3++) {
            if (class170.field2626[class87.field1235[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class38.field458);
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)V")
    public static void method1899(byte arg0) {
        field4699 = null;
        field4705 = null;
        field4704 = null;
        if (arg0 <= 91) {
            field4703 = false;
        }
        field4692 = null;
    }

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "(I)Z")
    public final boolean method1900(int arg0) {
        field4693++;
        int var2 = -66 / ((-arg0 - 21) / 39);
        return (this.field4689 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZLjava/lang/String;II)Z")
    public static final boolean method1901(boolean arg0, String arg1, int arg2, int arg3) {
        field4688++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        if (arg3 != 13633) {
            return false;
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg2 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if ((var10 / arg2) != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lfh;III)V")
    public static final void method1902(class170 arg0, int arg1, int arg2, int arg3) {
        field4698++;
        class153 var4 = arg0.method1047((byte) 80, class196.field2965);
        if (var4 == null) {
            return;
        }
        class196.field2965.method436(arg2, arg3, arg0.field2561 + arg2, arg3 - -arg0.field2501);
        if (class97.field1337 >= 3) {
            class196.field2965.method419(-16777216, var4, arg2, arg3);
        } else {
            class246.field3691.method1415((float) arg0.field2561 / 2.0F + (float) arg2, (float) arg0.field2501 / 2.0F + (float) arg3, 4096, ((int) (-class462.field6810) & 0x3FFF) << 2, var4, arg2, arg3);
        }
        if (arg1 != 16383) {
            method1905(57, (class261) null, 53, 22);
        }
    }

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "(I)I")
    public final int method1903(int arg0) {
        if (arg0 != 5) {
            field4703 = true;
        }
        field4700++;
        return class414.method2587(this.field4689, 112);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)Z")
    public final boolean method1904(int arg0, int arg1) {
        field4691++;
        if (arg1 != 36) {
            field4704 = null;
        }
        return (this.field4689 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(II)V")
    public class312(int arg0, int arg1) {
        this.field4689 = arg0;
        this.field4687 = arg1;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILdr;II)V")
    public static final void method1905(int arg0, class261 arg1, int arg2, int arg3) {
        if (arg2 != 1) {
            method1898(false, -80);
        }
        class247.field3702 = new class451[arg3][arg0];
        field4690++;
        class375.field5461 = arg1;
        if (class416.field6182 != null) {
            class57.field763 = method1908(class416.field6182[5], class416.field6182[2], (byte) -83, class416.field6182[1], class416.field6182[0], class416.field6182[4], class416.field6182[3]);
        }
        class446.field6560 = new class451();
        class310.method1892(false);
    }

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "(I)I")
    public final int method1906(int arg0) {
        field4695++;
        if (arg0 != -16777216) {
            field4699 = null;
        }
        return this.field4689 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "(I)Z")
    public final boolean method1907(int arg0) {
        field4694++;
        if (arg0 != -1) {
            this.method1904(102, -16);
        }
        return ((this.field4689 & 0x48C8BB) >> 22) != 0;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIBIIII)Ltc;")
    public static final class396 method1908(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field4696++;
        long var7 = (long) arg0 * 76724863L ^ (long) arg5 * 32147369L ^ (long) arg6 * 986053L ^ (long) arg3 * 97549L ^ (long) arg4 * 67481L ^ (long) arg1 * 475427L;
        class396 var9 = (class396) class109.field1444.method1491(var7, 0);
        if (var9 != null) {
            return var9;
        }
        class396 var10 = class375.field5461.method411(arg4, arg3, arg1, arg6, arg5, arg0);
        class109.field1444.method1488(128, var7, var10);
        if (arg2 != -83) {
            method1901(false, (String) null, 95, 36);
        }
        return var10;
    }

    static {
        new class151("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field4706 = 0;
    }
}
