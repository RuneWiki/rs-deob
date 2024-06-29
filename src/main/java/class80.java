import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class80 extends class135 {

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "Ljava/lang/String;")
    public static String field1147 = "flash3:";

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "I")
    public static int field1151 = 0;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "Lic;")
    public static class141 field1158 = new class141();

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "[I")
    public static int[] field1160 = new int[] { 0, -1, 10, 10, 0, 2, 28, 0, 0, 0, 0, 0, 0, 0, -2, 0, -2, 0, 3, 0, 12, 0, 0, 0, -2, 0, 0, 10, 3, 7, 5, 0, 0, 6, 0, 8, 2, -1, 0, 3, 10, -1, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 7, 5, 0, 0, 14, 0, 9, 0, 4, 5, 0, 0, 2, 0, -1, 0, 0, 0, 4, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 6, 8, 0, 0, 0, -2, 0, 0, 0, 15, 14, 0, 15, 0, 12, 0, 3, 0, 0, 0, -1, 6, 0, -1, -2, 0, 0, 5, 0, 0, 0, 2, -1, 1, 0, 8, 0, 12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, -2, 0, -2, 0, 5, -1, 0, 8, 0, 0, 0, -2, 6, 0, 0, -1, 0, 0, 0, 9, 0, 0, 0, -2, 2, 0, 8, 0, 8, -2, 3, 0, 0, 0, 0, 8, 20, 0, 6, 0, 8, -1, 0, 2, 0, 0, 0, 0, 0, 0, 12, 6, 1, 0, 5, 0, 0, 5, 0, 0, 0, 0, 0, 0, 7, 3, 0, 0, 0, 6, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, -2, 0, 0, -1, 0, 6, 0, 0, 0, -2, 4, 2, 0, 0, 0, 0, -1, 0, 2, 0, -1, 0, 0, -1, 0, 0, 0, 0, -2, 0, 0, 0, 3, 0, -1 };

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "[Z")
    public static boolean[] field1162 = new boolean[100];

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "I")
    public static int field1166 = 0;

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "Z")
    public static boolean field1167 = true;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "Ljava/lang/String;")
    public String field1153;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "[C")
    public char[] field1144;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "[C")
    public char[] field1154;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "[I")
    public int[] field1152;

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "[I")
    public int[] field1165;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "[Lgk;")
    public static class157[] field1164;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "[Z")
    public static boolean[] field1148;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "[[[I")
    public static int[][][] field1149;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
    public final void method552(int arg0) {
        if (this.field1165 != null) {
            for (int var2 = 0; var2 < this.field1165.length; var2++) {
                this.field1165[var2] = class120.method787(this.field1165[var2], 32768);
            }
        }
        if (this.field1152 != null) {
            for (int var3 = 0; var3 < this.field1152.length; var3++) {
                this.field1152[var3] = class120.method787(this.field1152[var3], 32768);
            }
        }
        field1155++;
        int var4 = -1 % ((arg0 - 20) / 51);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZLlj;)V")
    private final void method553(int arg0, boolean arg1, class25 arg2) {
        field1143++;
        if (!arg1) {
            return;
        }
        if (arg0 == 1) {
            this.field1153 = arg2.method189(!arg1);
        } else if (arg0 == 2) {
            int var7 = arg2.method201(255);
            this.field1152 = new int[var7];
            this.field1144 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1152[var8] = arg2.method190(-3);
                byte var9 = arg2.method188(36);
                this.field1144[var8] = var9 == 0 ? 0 : class272.method1835(var9, (byte) -124);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method201(255);
            this.field1165 = new int[var4];
            this.field1154 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1165[var5] = arg2.method190(-3);
                byte var6 = arg2.method188(-110);
                this.field1154[var5] = var6 == 0 ? 0 : class272.method1835(var6, (byte) -105);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IC)I")
    public final int method554(int arg0, char arg1) {
        field1163++;
        if (this.field1165 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg0 != 31701) {
            field1151 = -46;
        }
        while (this.field1165.length > var3) {
            if (this.field1154[var3] == arg1) {
                return this.field1165[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ldl;B)V")
    public static final void method555(class123 arg0, byte arg1) {
        field1146++;
        int var2 = -86 % ((-arg1 - 30) / 47);
        class124.field1855 = arg0;
        class209.field3261 = class124.field1855.method820(16, 112);
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V")
    public static final void method556(byte arg0) {
        field1145++;
        if (arg0 > -100) {
            field1151 = -72;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class84.method582(class90.field1382, -1, var3, var1, true, var2)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/util/Random;Z)I")
    public static final int method557(int arg0, Random arg1, boolean arg2) {
        field1156++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class254.method1715(27849, arg0)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            if (!arg2) {
                field1167 = false;
            }
            return class97.method647(var4, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(CI)I")
    public final int method558(char arg0, int arg1) {
        field1159++;
        if (this.field1152 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg1 >= -103) {
            this.method554(-83, ' ');
        }
        while (this.field1152.length > var3) {
            if (this.field1144[var3] == arg0) {
                return this.field1152[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILlj;)V")
    public final void method559(int arg0, class25 arg1) {
        field1150++;
        if (arg0 != -1) {
            return;
        }
        while (true) {
            int var3 = arg1.method201(255);
            if (var3 == 0) {
                return;
            }
            this.method553(var3, true, arg1);
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)V")
    public static void method560(byte arg0) {
        field1162 = null;
        field1149 = null;
        field1147 = null;
        field1148 = null;
        int var1 = 28 / ((arg0 + 4) / 36);
        field1164 = null;
        field1158 = null;
        field1160 = null;
    }
}
