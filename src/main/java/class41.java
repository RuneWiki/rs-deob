import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NJBQYBAL")
public class class41 {

    @OriginalMember(owner = "NJBQYBAL", name = "a", descriptor = "Z")
    private boolean field1139 = true;

    @OriginalMember(owner = "NJBQYBAL", name = "i", descriptor = "Z")
    public boolean field1147 = false;

    @OriginalMember(owner = "NJBQYBAL", name = "j", descriptor = "Z")
    public boolean field1148 = true;

    @OriginalMember(owner = "NJBQYBAL", name = "l", descriptor = "Z")
    public boolean field1150 = false;

    @OriginalMember(owner = "NJBQYBAL", name = "o", descriptor = "Z")
    public boolean field1153 = false;

    @OriginalMember(owner = "NJBQYBAL", name = "p", descriptor = "I")
    public int field1154 = -1;

    @OriginalMember(owner = "NJBQYBAL", name = "b", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "NJBQYBAL", name = "d", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "NJBQYBAL", name = "g", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "NJBQYBAL", name = "h", descriptor = "I")
    public int field1146;

    @OriginalMember(owner = "NJBQYBAL", name = "k", descriptor = "I")
    public int field1149;

    @OriginalMember(owner = "NJBQYBAL", name = "m", descriptor = "I")
    public int field1151;

    @OriginalMember(owner = "NJBQYBAL", name = "n", descriptor = "I")
    public int field1152;

    @OriginalMember(owner = "NJBQYBAL", name = "f", descriptor = "Ljava/lang/String;")
    public String field1144;

    @OriginalMember(owner = "NJBQYBAL", name = "e", descriptor = "[I")
    public static int[] field1143;

    @OriginalMember(owner = "NJBQYBAL", name = "c", descriptor = "[LNJBQYBAL;")
    public static class41[] field1141;

    @OriginalMember(owner = "NJBQYBAL", name = "a", descriptor = "(ILCVNWKEAW;)V")
    public static void method412(int arg0, class7 arg1) {
        class62 var2 = new class62(-417, arg1.method180("varp.dat", null));
        if (arg0 != 0) {
            return;
        }
        field1142 = 0;
        field1140 = var2.method523();
        if (field1141 == null) {
            field1141 = new class41[field1140];
        }
        if (field1143 == null) {
            field1143 = new int[field1140];
        }
        for (int var3 = 0; var3 < field1140; var3++) {
            if (field1141[var3] == null) {
                field1141[var3] = new class41();
            }
            field1141[var3].method413(var3, var2, (byte) -14);
        }
        if (var2.field1578.length != var2.field1579) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "NJBQYBAL", name = "a", descriptor = "(ILXOUQUKZW;B)V")
    public void method413(int arg0, class62 arg1, byte arg2) {
        if (arg2 != -14) {
            this.field1139 = !this.field1139;
        }
        while (true) {
            int var4 = arg1.method521();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1145 = arg1.method521();
            } else if (var4 == 2) {
                this.field1146 = arg1.method521();
            } else if (var4 == 3) {
                this.field1147 = true;
                field1143[field1142++] = arg0;
            } else if (var4 == 4) {
                this.field1148 = false;
            } else if (var4 == 5) {
                this.field1149 = arg1.method523();
            } else if (var4 == 6) {
                this.field1150 = true;
            } else if (var4 == 7) {
                this.field1151 = arg1.method526();
            } else if (var4 == 8) {
                this.field1152 = 1;
                this.field1153 = true;
            } else if (var4 == 10) {
                this.field1144 = arg1.method528();
            } else if (var4 == 11) {
                this.field1153 = true;
            } else if (var4 == 12) {
                this.field1154 = arg1.method526();
            } else if (var4 == 13) {
                this.field1152 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
