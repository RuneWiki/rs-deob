import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class192 extends class83 {

    @OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public int field3102;

    @OriginalMember(owner = "client!pi", name = "r", descriptor = "[I")
    public static int[] field3099 = new int[4096];

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "Z")
    public static boolean field3111 = false;

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "[Lag;")
    public static class196[] field3100 = new class196[29];

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field3110 = new String[100];

    @OriginalMember(owner = "client!pi", name = "n", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "Ldl;")
    public static class46 field3107;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)I")
    public final int method1251(int arg0) {
        if (arg0 != 0) {
            this.method1256(125, (byte) 77);
        }
        field3105++;
        return this.field3096 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)Llg;")
    public static final class11 method1252(int arg0, int arg1, int arg2) {
        class109 var3 = class79.field1367[arg0][arg1][arg2];
        return var3 == null || var3.field1978 == null ? null : var3.field1978;
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)Z")
    public final boolean method1253(int arg0) {
        field3112++;
        if (arg0 != 18483) {
            field3110 = null;
        }
        return (this.field3096 & 0x1789E19C) >> 28 != 0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)Z")
    public final boolean method1254(byte arg0) {
        field3095++;
        if (arg0 == 12) {
            return (this.field3096 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)I")
    public static final int method1255(int arg0, boolean arg1) {
        field3113++;
        if (arg0 < 0) {
            return 0;
        }
        class144 var2 = (class144) class53.field923.method779(-89, (long) arg0);
        if (var2 == null) {
            return class17.method93(arg0, 101).field2628;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field2461.length; var4++) {
            if (var2.field2461[var4] == -1) {
                var3++;
            }
        }
        if (!arg1) {
            method1252(-121, -56, 77);
        }
        return var3 + (class17.method93(arg0, 75).field2628 - var2.field2461.length);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)Z")
    public final boolean method1256(int arg0, byte arg1) {
        if (arg1 >= -10) {
            field3107 = null;
        }
        field3098++;
        return (this.field3096 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(I)I")
    public final int method1257(int arg0) {
        field3104++;
        int var2 = 8 / ((arg0 - 20) / 43);
        return class114.method802(this.field3096, (byte) 85);
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
    public static void method1258(byte arg0) {
        field3110 = null;
        field3099 = null;
        field3107 = null;
        if (arg0 == -5) {
            field3100 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(II)V")
    public class192(int arg0, int arg1) {
        this.field3096 = arg0;
        this.field3102 = arg1;
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)Z")
    public final boolean method1259(int arg0) {
        if (arg0 == -475686027) {
            field3108++;
            return (this.field3096 >> 30 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(B)Z")
    public final boolean method1260(byte arg0) {
        if (arg0 <= 74) {
            method1258((byte) -106);
        }
        field3103++;
        return (this.field3096 & 0x4FC364) >> 22 != 0;
    }

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)Z")
    public final boolean method1261(int arg0) {
        int var2 = 51 / ((arg0 - 46) / 46);
        field3106++;
        return (this.field3096 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "(I)Z")
    public final boolean method1262(int arg0) {
        field3101++;
        if (arg0 != 4278) {
            this.method1254((byte) 71);
        }
        return (this.field3096 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "(I)Z")
    public final boolean method1263(int arg0) {
        if (arg0 != -475686027) {
            this.method1257(-119);
        }
        field3097++;
        return (this.field3096 >> 21 & 0x1) != 0;
    }
}
