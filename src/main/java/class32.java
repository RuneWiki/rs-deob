import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LZWYDZNA")
public class class32 {

    @OriginalMember(owner = "LZWYDZNA", name = "b", descriptor = "I")
    private int field1063 = 368;

    @OriginalMember(owner = "LZWYDZNA", name = "j", descriptor = "Z")
    public boolean field1071 = false;

    @OriginalMember(owner = "LZWYDZNA", name = "k", descriptor = "Z")
    public boolean field1072 = true;

    @OriginalMember(owner = "LZWYDZNA", name = "m", descriptor = "Z")
    public boolean field1074 = false;

    @OriginalMember(owner = "LZWYDZNA", name = "p", descriptor = "Z")
    public boolean field1077 = false;

    @OriginalMember(owner = "LZWYDZNA", name = "q", descriptor = "I")
    public int field1078 = -1;

    @OriginalMember(owner = "LZWYDZNA", name = "r", descriptor = "Z")
    public boolean field1079 = true;

    @OriginalMember(owner = "LZWYDZNA", name = "a", descriptor = "Z")
    private static boolean field1062 = true;

    @OriginalMember(owner = "LZWYDZNA", name = "c", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "LZWYDZNA", name = "e", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "LZWYDZNA", name = "h", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "LZWYDZNA", name = "i", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "LZWYDZNA", name = "l", descriptor = "I")
    public int field1073;

    @OriginalMember(owner = "LZWYDZNA", name = "n", descriptor = "I")
    public int field1075;

    @OriginalMember(owner = "LZWYDZNA", name = "o", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "LZWYDZNA", name = "g", descriptor = "Ljava/lang/String;")
    public String field1068;

    @OriginalMember(owner = "LZWYDZNA", name = "f", descriptor = "[I")
    public static int[] field1067;

    @OriginalMember(owner = "LZWYDZNA", name = "d", descriptor = "[LLZWYDZNA;")
    public static class32[] field1065;

    @OriginalMember(owner = "LZWYDZNA", name = "a", descriptor = "(ILINOFEYKQ;)V")
    public static void method334(int arg0, class21 arg1) {
        class35 var2 = new class35((byte) -103, arg1.method277("varp.dat", null));
        field1066 = 0;
        field1064 = var2.method351();
        if (field1065 == null) {
            field1065 = new class32[field1064];
        }
        if (field1067 == null) {
            field1067 = new int[field1064];
        }
        for (int var3 = 0; var3 < field1064; var3++) {
            if (field1065[var3] == null) {
                field1065[var3] = new class32();
            }
            field1065[var3].method335(0, var2, var3);
        }
        while (arg0 >= 0) {
            field1062 = !field1062;
        }
        if (var2.field1106.length != var2.field1107) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "LZWYDZNA", name = "a", descriptor = "(ILNHEPCMLW;I)V")
    public void method335(int arg0, class35 arg1, int arg2) {
        if (arg0 != 0) {
            this.field1063 = 140;
        }
        while (true) {
            int var4 = arg1.method349();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1069 = arg1.method349();
            } else if (var4 == 2) {
                this.field1070 = arg1.method349();
            } else if (var4 == 3) {
                this.field1071 = true;
                field1067[field1066++] = arg2;
            } else if (var4 == 4) {
                this.field1072 = false;
            } else if (var4 == 5) {
                this.field1073 = arg1.method351();
            } else if (var4 == 6) {
                this.field1074 = true;
            } else if (var4 == 7) {
                this.field1075 = arg1.method354();
            } else if (var4 == 8) {
                this.field1076 = 1;
                this.field1077 = true;
            } else if (var4 == 10) {
                this.field1068 = arg1.method356();
            } else if (var4 == 11) {
                this.field1077 = true;
            } else if (var4 == 12) {
                this.field1078 = arg1.method354();
            } else if (var4 == 13) {
                this.field1076 = 2;
                this.field1077 = true;
            } else if (var4 == 14) {
                this.field1079 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
