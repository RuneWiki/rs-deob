import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class58 {

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    private int field1066 = 0;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    private int field1076 = -1;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Ldd;")
    private class132 field1070 = new class132();

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "Z")
    public boolean field1077 = false;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    private int field1064;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "[[[I")
    private int[][][] field1073;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    private int field1061;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "[Lu;")
    private class118[] field1068;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "[I")
    public static int[] field1063 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "Lqk;")
    public static class207 field1062 = class24.method212(255, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lqk;")
    public static class207 field1065 = class24.method212(255, "http:)4)4");

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Lqk;")
    public static class207 field1074 = class24.method212(255, "Hidden)2");

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "Lpk;")
    public static class99 field1069;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
    public final void method426(byte arg0) {
        field1067++;
        for (int var2 = 0; var2 < this.field1064; var2++) {
            this.field1073[var2][0] = null;
            this.field1073[var2][1] = null;
            this.field1073[var2][2] = null;
            this.field1073[var2] = null;
        }
        this.field1068 = null;
        if (arg0 < 16) {
            field1069 = null;
        }
        this.field1073 = null;
        this.field1070.method924(-30865);
        this.field1070 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)[[I")
    public final int[][] method427(int arg0, int arg1) {
        field1071++;
        if (arg1 != 239) {
            return null;
        } else if (this.field1064 == this.field1061) {
            this.field1077 = this.field1068[arg0] == null;
            this.field1068[arg0] = class10.field138;
            return this.field1073[arg0];
        } else if (this.field1064 == 1) {
            this.field1077 = this.field1076 != arg0;
            this.field1076 = arg0;
            return this.field1073[0];
        } else {
            class118 var3 = this.field1068[arg0];
            if (var3 == null) {
                this.field1077 = true;
                if (this.field1066 >= this.field1064) {
                    class118 var4 = (class118) this.field1070.method930(128);
                    var3 = new class118(arg0, var4.field2054);
                    this.field1068[var4.field2053] = null;
                    var4.method1346((byte) -16);
                } else {
                    var3 = new class118(arg0, this.field1066);
                    this.field1066++;
                }
                this.field1068[arg0] = var3;
            } else {
                this.field1077 = false;
            }
            this.field1070.method932(var3, true);
            return this.field1073[var3.field2054];
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static void method428(byte arg0) {
        field1065 = null;
        field1074 = null;
        field1069 = null;
        field1062 = null;
        field1063 = null;
        int var1 = 80 / ((1 - arg0) / 55);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method429(int arg0) {
        field1075++;
        if (this.field1064 != this.field1061) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1064; var2++) {
            this.field1068[var2] = class10.field138;
        }
        int var3 = 14 % ((38 - arg0) / 40);
        return this.field1073;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IB)V")
    public static final void method430(int arg0, byte arg1) {
        if (arg1 != -10) {
            method428((byte) 78);
        }
        class48.field950 = -1;
        field1072++;
        class48.field950 = -1;
        class39.field786 = arg0;
        class288.method1965(1);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(III)V")
    public class58(int arg0, int arg1, int arg2) {
        this.field1064 = arg0;
        this.field1073 = new int[this.field1064][3][arg2];
        this.field1061 = arg1;
        this.field1068 = new class118[this.field1061];
    }
}
