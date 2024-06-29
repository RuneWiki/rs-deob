import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class185 extends class86 {

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    private int field2898;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field2895 = -1;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2903 = "purple:";

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "Lrn;")
    public static class18 field2897;

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 5)
    public class185() {
        this(4096);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IZLug;)V", line = 9)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        if (arg1) {
            method1428(-52, 16, 125, (byte) 21);
        }
        if (arg0 == 0) {
            this.field2898 = (arg2.method281(124) << 12) / 255;
        }
        field2901++;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(I)V", line = 39)
    public class185(int arg0) {
        super(0, true);
        this.field2898 = 4096;
        this.field2898 = arg0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)Lck;", line = 48)
    public static final class86 method1425(byte arg0, int arg1) {
        if (arg0 != 75) {
            field2896 = 108;
        }
        field2900++;
        if (arg1 == 0) {
            return new class185();
        } else if (arg1 == 1) {
            return new class245();
        } else if (arg1 == 2) {
            return new class53();
        } else if (arg1 == 3) {
            return new class58();
        } else if (arg1 == 4) {
            return new class310();
        } else if (arg1 == 5) {
            return new class296();
        } else if (arg1 == 6) {
            return new class128();
        } else if (arg1 == 7) {
            return new class48();
        } else if (arg1 == 8) {
            return new class194();
        } else if (arg1 == 9) {
            return new class197();
        } else if (arg1 == 10) {
            return new class188();
        } else if (arg1 == 11) {
            return new class199();
        } else if (arg1 == 12) {
            return new class271();
        } else if (arg1 == 13) {
            return new class209();
        } else if (arg1 == 14) {
            return new class94();
        } else if (arg1 == 15) {
            return new class360();
        } else if (arg1 == 16) {
            return new class254();
        } else if (arg1 == 17) {
            return new class167();
        } else if (arg1 == 18) {
            return new class318();
        } else if (arg1 == 19) {
            return new class327();
        } else if (arg1 == 20) {
            return new class334();
        } else if (arg1 == 21) {
            return new class282();
        } else if (arg1 == 22) {
            return new class249();
        } else if (arg1 == 23) {
            return new class14();
        } else if (arg1 == 24) {
            return new class277();
        } else if (arg1 == 25) {
            return new class63();
        } else if (arg1 == 26) {
            return new class135();
        } else if (arg1 == 27) {
            return new class301();
        } else if (arg1 == 28) {
            return new class79();
        } else if (arg1 == 29) {
            return new class238();
        } else if (arg1 == 30) {
            return new class74();
        } else if (arg1 == 31) {
            return new class259();
        } else if (arg1 == 32) {
            return new class51();
        } else if (arg1 == 33) {
            return new class41();
        } else if (arg1 == 34) {
            return new class49();
        } else if (arg1 == 35) {
            return new class343();
        } else if (arg1 == 36) {
            return new class129();
        } else if (arg1 == 37) {
            return new class258();
        } else if (arg1 == 38) {
            return new class247();
        } else if (arg1 == 39) {
            return new class191();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)[I", line = 369)
    public final int[] method158(int arg0, int arg1) {
        if (arg1 <= 7) {
            method1428(72, 7, 52, (byte) 127);
        }
        int[] var3 = this.field1225.method1914(arg0, 121);
        field2902++;
        if (this.field1225.field3995) {
            class65.method639(var3, 0, class93.field1424, this.field2898);
        }
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V", line = 397)
    public static void method1426(int arg0) {
        field2903 = null;
        field2897 = null;
        if (arg0 != -7) {
            field2897 = (class18) null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLjava/lang/String;Lrn;Z)Leh;", line = 413)
    public static final class59 method1427(boolean arg0, String arg1, class18 arg2, boolean arg3) {
        int var4 = arg2.method186(false, arg1);
        field2894++;
        if (var4 == -1) {
            return new class59(0);
        }
        int[] var5 = arg2.method183(!arg0, var4);
        class59 var6 = new class59(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var8 < var6.field920) {
                class25 var9 = new class25(arg2.method187(var4, var5[var7++], -1));
                int var10 = var9.method262((byte) 44);
                int var11 = var9.method314((byte) 52);
                int var12 = var9.method281(8);
                if (!arg3 && var12 == 1) {
                    var6.field920--;
                } else {
                    var6.field914[var8] = var10;
                    var6.field922[var8] = new class22();
                    var6.field922[var8].field349 = var11;
                    var8++;
                }
            }
            if (!arg0) {
                return (class59) null;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIB)I", line = 461)
    public static final int method1428(int arg0, int arg1, int arg2, byte arg3) {
        field2899++;
        if (arg0 > 243) {
            arg1 >>= 0x4;
        } else if (arg0 > 217) {
            arg1 >>= 0x3;
        } else if (arg0 > 192) {
            arg1 >>= 0x2;
        } else if (arg0 > 179) {
            arg1 >>= 0x1;
        }
        int var4 = -15 / ((arg3 + 15) / 40);
        return (arg2 >> 2 << 10) + ((arg1 >> 5 << 7) + (arg0 >> 1));
    }
}
