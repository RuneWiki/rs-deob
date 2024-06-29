import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class182 {

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public int field2971 = -1;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public int field2974 = -1;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public int field2980 = 0;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public int field2965 = 0;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
    public int field2988 = -1;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public int field2979 = 0;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public int field2981 = -1;

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "I")
    public int field2994 = -1;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public int field2975 = -1;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public int field2970 = 0;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public int field2982 = 0;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public int field2976 = -1;

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
    public int field2989 = -1;

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "I")
    public int field2993 = -1;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public int field2966 = -1;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public int field2977 = -1;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    public int field2985 = -1;

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "I")
    public int field2998 = -1;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "I")
    public int field2986 = -1;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
    public int field2987 = -1;

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "I")
    public int field2996 = -1;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public int field2969 = 0;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    public int field2983 = -1;

    @OriginalMember(owner = "client!dm", name = "L", descriptor = "I")
    public int field3001 = 0;

    @OriginalMember(owner = "client!dm", name = "P", descriptor = "I")
    public int field3005 = 0;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public int field2978 = -1;

    @OriginalMember(owner = "client!dm", name = "N", descriptor = "I")
    public int field3003 = -1;

    @OriginalMember(owner = "client!dm", name = "O", descriptor = "I")
    public int field3004 = -1;

    @OriginalMember(owner = "client!dm", name = "M", descriptor = "I")
    public int field3002 = 0;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "I")
    public int field2995 = 0;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public int field2973 = -1;

    @OriginalMember(owner = "client!dm", name = "R", descriptor = "I")
    public int field3007 = -1;

    @OriginalMember(owner = "client!dm", name = "Q", descriptor = "I")
    public int field3006 = -1;

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "Z")
    public static boolean field2999 = false;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "Laj;")
    public static class123 field2968 = new class123();

    @OriginalMember(owner = "client!dm", name = "S", descriptor = "I")
    public static int field3008 = 0;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!dm", name = "T", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "[[I")
    public int[][] field2990;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILbm;II)V")
    public static final void method1316(int arg0, class131 arg1, int arg2, int arg3) {
        if (arg1.field699 == arg2 && arg2 != -1) {
            class307 var4 = class22.method121(arg2, true);
            int var5 = var4.field4893;
            if (var5 == 1) {
                arg1.field617 = 0;
                arg1.field686 = 0;
                arg1.field717 = arg3;
                arg1.field688 = 1;
                arg1.field619 = 0;
                class274.method1838(arg1.field710, false, var4, arg1.field686, (byte) -112, arg1.field637);
            }
            if (var5 == 2) {
                arg1.field617 = 0;
            }
        } else if (arg2 == -1 || arg1.field699 == -1 || class22.method121(arg2, true).field4898 >= class22.method121(arg1.field699, true).field4898) {
            arg1.field688 = 1;
            arg1.field619 = 0;
            arg1.field699 = arg2;
            arg1.field717 = arg3;
            arg1.field686 = 0;
            arg1.field617 = 0;
            arg1.field636 = arg1.field674;
            if (arg1.field699 != -1) {
                class274.method1838(arg1.field710, false, class22.method121(arg1.field699, true), arg1.field686, (byte) -115, arg1.field637);
            }
        }
        if (arg0 >= 83) {
            field3000++;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIZ)Lcf;")
    public static final class175 method1317(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1317(-100, -8, false);
        }
        class175 var3 = (class175) class218.field3574.method1059(0, (long) arg0 << 32 | (long) arg1);
        if (var3 == null) {
            var3 = new class175(arg0, arg1);
            class218.field3574.method1052(var3.field2012, (byte) -65, var3);
        }
        field2972++;
        return var3;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ICI)C")
    public static final char method1318(int arg0, char arg1, int arg2) {
        field2991++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg0 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg0 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        int var3 = 23 / ((arg2 + 59) / 32);
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)V")
    public static void method1319(boolean arg0) {
        if (arg0) {
            field3009 = 27;
        }
        field2968 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public final void method1320(int arg0) {
        if (arg0 <= 122) {
            this.field2987 = 71;
        }
        field2984++;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static final void method1321(byte arg0) {
        field2967++;
        class212.field3508.method1257(122);
        if (arg0 >= -101) {
            field2992 = -68;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lwd;I)V")
    public final void method1322(class162 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1133((byte) 53);
            if (var3 == 0) {
                if (arg1 != 0) {
                    method1321((byte) -53);
                }
                field2964++;
                return;
            }
            this.method1323(var3, arg1 - 6496, arg0);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILwd;)V")
    private final void method1323(int arg0, int arg1, class162 arg2) {
        if (arg0 == 1) {
            this.field3006 = arg2.method1142(arg1 ^ 0x5346);
            this.field2976 = arg2.method1142(-18970);
            if (this.field3006 == 65535) {
                this.field3006 = -1;
            }
            if (this.field2976 == 65535) {
                this.field2976 = -1;
            }
        } else if (arg0 == 2) {
            this.field2987 = arg2.method1142(-18970);
        } else if (arg0 == 3) {
            this.field2981 = arg2.method1142(-18970);
        } else if (arg0 == 4) {
            this.field2996 = arg2.method1142(-18970);
        } else if (arg0 == 5) {
            this.field2994 = arg2.method1142(-18970);
        } else if (arg0 == 6) {
            this.field2985 = arg2.method1142(-18970);
        } else if (arg0 == 7) {
            this.field2988 = arg2.method1142(-18970);
        } else if (arg0 == 8) {
            this.field2998 = arg2.method1142(-18970);
        } else if (arg0 == 9) {
            this.field2986 = arg2.method1142(arg1 ^ 0x5346);
        } else if (arg0 == 26) {
            this.field2970 = (short) (arg2.method1133((byte) 53) * 4);
            this.field2982 = (short) (arg2.method1133((byte) 53) * 4);
        } else if (arg0 == 27) {
            if (this.field2990 == null) {
                this.field2990 = new int[12][];
            }
            int var4 = arg2.method1133((byte) 53);
            this.field2990[var4] = new int[6];
            for (int var5 = 0; var5 < 6; var5++) {
                this.field2990[var4][var5] = arg2.method1146(2);
            }
        } else if (arg0 == 29) {
            this.field2969 = arg2.method1133((byte) 53);
        } else if (arg0 == 30) {
            this.field3005 = arg2.method1142(-18970);
        } else if (arg0 == 31) {
            this.field3001 = arg2.method1133((byte) 53);
        } else if (arg0 == 32) {
            this.field3002 = arg2.method1142(-18970);
        } else if (arg0 == 33) {
            this.field2995 = arg2.method1146(2);
        } else if (arg0 == 34) {
            this.field2965 = arg2.method1133((byte) 53);
        } else if (arg0 == 35) {
            this.field2980 = arg2.method1142(-18970);
        } else if (arg0 == 36) {
            this.field2979 = arg2.method1146(2);
        } else if (arg0 == 37) {
            this.field2989 = arg2.method1133((byte) 53);
        } else if (arg0 == 38) {
            this.field3004 = arg2.method1142(arg1 - 12474);
        } else if (arg0 == 39) {
            this.field2974 = arg2.method1142(-18970);
        } else if (arg0 == 40) {
            this.field2978 = arg2.method1142(-18970);
        } else if (arg0 == 41) {
            this.field2971 = arg2.method1142(-18970);
        } else if (arg0 == 42) {
            this.field2977 = arg2.method1142(arg1 ^ 0x5346);
        } else if (arg0 == 43) {
            arg2.method1142(-18970);
        } else if (arg0 == 44) {
            arg2.method1142(-18970);
        } else if (arg0 == 45) {
            this.field2983 = arg2.method1142(-18970);
        } else if (arg0 == 46) {
            this.field2966 = arg2.method1142(-18970);
        } else if (arg0 == 47) {
            this.field2993 = arg2.method1142(-18970);
        } else if (arg0 == 48) {
            this.field3007 = arg2.method1142(-18970);
        } else if (arg0 == 49) {
            this.field2975 = arg2.method1142(-18970);
        } else if (arg0 == 50) {
            this.field2973 = arg2.method1142(-18970);
        } else if (arg0 == 51) {
            this.field3003 = arg2.method1142(-18970);
        }
        field2997++;
        if (arg1 != -6496) {
            this.method1322((class162) null, 13);
        }
    }
}
