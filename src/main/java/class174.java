import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class174 extends class194 {

    @OriginalMember(owner = "client!bc", name = "E", descriptor = "[Lli;")
    public class288[] field3140 = new class288[5];

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
    public int field3150 = 0;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "[I")
    public int[] field3155 = new int[5];

    @OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
    public int field3146;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
    public int field3139;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public int field3143;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "[Z")
    public static boolean[] field3126 = new boolean[5];

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "Ltk;")
    public static class51 field3129 = new class51();

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "Lhh;")
    public static class117 field3154 = new class117(0, -1);

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "[[I")
    public static int[][] field3156 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "Lqk;")
    public static class207 field3158 = class24.method212(255, "null");

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "[I")
    public static int[] field3157 = new int[256];

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    public int field3133;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "I")
    public int field3137;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public int field3138;

    @OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "Ldl;")
    public class122 field3135;

    @OriginalMember(owner = "client!bc", name = "F", descriptor = "Llb;")
    public class129 field3141;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "Lbc;")
    public class174 field3131;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "Lcc;")
    public class209 field3136;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "Lo;")
    public class246 field3152;

    @OriginalMember(owner = "client!bc", name = "G", descriptor = "Lbe;")
    public class28 field3142;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "Loa;")
    public class98 field3145;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "Z")
    public boolean field3134;

    @OriginalMember(owner = "client!bc", name = "I", descriptor = "Z")
    public boolean field3144;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "Z")
    public boolean field3153;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Ln;")
    public static final class16 method1248(int arg0, int arg1) {
        field3124++;
        class16 var2 = (class16) class69.field1225.method758(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class144.field2489.method705(arg0, arg1, -1);
        class16 var4 = new class16();
        if (var3 != null) {
            var4.method100(62, new class149(var3));
        }
        class69.field1225.method759((long) arg1, 2, var4);
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZJ)V")
    public static final void method1249(boolean arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0) {
                method1250(74, 26, (class99) null, -35);
            }
        } catch (InterruptedException var3) {
        }
        field3149++;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(III)V")
    public class174(int arg0, int arg1, int arg2) {
        this.field3146 = arg1;
        this.field3139 = this.field3132 = arg0;
        this.field3143 = arg2;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILpk;I)[Luh;")
    public static final class100[] method1250(int arg0, int arg1, class99 arg2, int arg3) {
        field3125++;
        if (arg3 != -18546) {
            field3158 = null;
        }
        return class78.method594(arg0, arg2, 108, arg1) ? class169.method1213(arg3 ^ 0xFFFFB056) : null;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)Z")
    public static final boolean method1251(int arg0, int arg1) {
        field3151++;
        if (arg0 < 0) {
            return false;
        }
        if (arg1 != 17412) {
            method1252(111, (String) null);
        }
        int var2 = class82.field1494[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1002;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1252(int arg0, String arg1) {
        System.out.println("Error: " + class120.method854((byte) 127, "%0a", "\n", arg1));
        field3127++;
        if (arg0 <= 59) {
            method1253((byte) 115);
        }
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)V")
    public static void method1253(byte arg0) {
        field3157 = null;
        field3156 = null;
        int var1 = 11 / ((30 - arg0) / 51);
        field3129 = null;
        field3158 = null;
        field3126 = null;
        field3154 = null;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)V")
    public static final void method1254(byte arg0) {
        field3130++;
        if (arg0 >= 32) {
            class69.field1236.method1382(31346);
            class194.field3415.method1382(31346);
            class250.field4522.method1382(31346);
        }
    }
}
