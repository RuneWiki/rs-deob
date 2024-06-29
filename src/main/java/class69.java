import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class69 extends class285 {

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "Lve;")
    private static class255 field1027 = class87.method607(99, " has logged in)3");

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "Lve;")
    public static class255 field1035 = field1027;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    public static int field1031 = 0;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "Lmd;")
    public static class240 field1033;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "Lve;")
    public class255 field1032;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "Lpe;")
    public static class93 field1036;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "[I")
    public int[] field1025;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "[I")
    public int[] field1026;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "[I")
    public int[] field1034;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "[I")
    public int[] field1039;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLpb;)V", line = 13)
    public final void method416(byte arg0, class70 arg1) {
        field1038++;
        if (arg0 != -118) {
            return;
        }
        while (true) {
            int var3 = arg1.method481(arg0 ^ 0xFFFFFF8A);
            if (var3 == 0) {
                return;
            }
            this.method418(arg1, var3, (byte) 34);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)I", line = 43)
    public final int method417(byte arg0, int arg1) {
        field1029++;
        if (this.field1026 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field1026.length; var3++) {
            if (this.field1025[var3] == arg1) {
                return this.field1026[var3];
            }
        }
        int var4 = -6 / ((-arg0 - 4) / 51);
        return -1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lpb;IB)V", line = 74)
    private final void method418(class70 arg0, int arg1, byte arg2) {
        field1040++;
        if (arg2 != 34) {
            this.method417((byte) 116, 12);
        }
        if (arg1 == 1) {
            this.field1032 = arg0.method479(arg2 - 35);
        } else if (arg1 == 2) {
            int var4 = arg0.method481(arg2 - 34);
            this.field1025 = new int[var4];
            this.field1026 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1026[var5] = arg0.method423(class127.method943(arg2, 221));
                int var6 = arg0.method481(arg2 ^ 0x22);
                if (var6 == 0) {
                    this.field1025[var5] = -1;
                } else {
                    this.field1025[var5] = var6;
                }
            }
        } else if (arg1 == 3) {
            int var7 = arg0.method481(0);
            this.field1034 = new int[var7];
            this.field1039 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1034[var8] = arg0.method423(255);
                int var9 = arg0.method481(0);
                if (var9 == 0) {
                    this.field1039[var8] = -1;
                } else {
                    this.field1039[var8] = var9;
                }
            }
        } else if (arg1 == 4) {
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V", line = 148)
    public final void method419(int arg0) {
        if (arg0 != 15282) {
            this.field1039 = (int[]) null;
        }
        field1030++;
        if (this.field1034 != null) {
            for (int var2 = 0; var2 < this.field1034.length; var2++) {
                this.field1034[var2] = class264.method1836(this.field1034[var2], 32768);
            }
        }
        if (this.field1026 != null) {
            for (int var3 = 0; var3 < this.field1026.length; var3++) {
                this.field1026[var3] = class264.method1836(this.field1026[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V", line = 186)
    public static void method420(int arg0) {
        field1027 = null;
        field1033 = null;
        field1035 = null;
        if (arg0 >= -31) {
            method420(59);
        }
        field1036 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I", line = 199)
    public final int method421(int arg0, int arg1) {
        field1028++;
        if (this.field1034 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field1034.length; var3++) {
            if (this.field1039[var3] == arg1) {
                return this.field1034[var3];
            }
        }
        if (arg0 != 16028) {
            this.method416((byte) 107, (class70) null);
        }
        return -1;
    }
}
