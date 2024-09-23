import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JMEOMLFD")
public class class27 {

    @OriginalMember(owner = "JMEOMLFD", name = "h", descriptor = "Z")
    public boolean field1022 = false;

    @OriginalMember(owner = "JMEOMLFD", name = "i", descriptor = "Z")
    public boolean field1023 = true;

    @OriginalMember(owner = "JMEOMLFD", name = "k", descriptor = "Z")
    public boolean field1025 = false;

    @OriginalMember(owner = "JMEOMLFD", name = "n", descriptor = "Z")
    public boolean field1028 = false;

    @OriginalMember(owner = "JMEOMLFD", name = "o", descriptor = "I")
    public int field1029 = -1;

    @OriginalMember(owner = "JMEOMLFD", name = "a", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "JMEOMLFD", name = "c", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "JMEOMLFD", name = "f", descriptor = "I")
    public int field1020;

    @OriginalMember(owner = "JMEOMLFD", name = "g", descriptor = "I")
    public int field1021;

    @OriginalMember(owner = "JMEOMLFD", name = "j", descriptor = "I")
    public int field1024;

    @OriginalMember(owner = "JMEOMLFD", name = "l", descriptor = "I")
    public int field1026;

    @OriginalMember(owner = "JMEOMLFD", name = "m", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "JMEOMLFD", name = "e", descriptor = "Ljava/lang/String;")
    public String field1019;

    @OriginalMember(owner = "JMEOMLFD", name = "d", descriptor = "[I")
    public static int[] field1018;

    @OriginalMember(owner = "JMEOMLFD", name = "b", descriptor = "[LJMEOMLFD;")
    public static class27[] field1016;

    @OriginalMember(owner = "JMEOMLFD", name = "a", descriptor = "(LMNPBQFWE;B)V")
    public static void method353(class37 arg0, byte arg1) {
        if (arg1 != 0) {
            return;
        }
        class3 var2 = new class3(false, arg0.method429("varp.dat", null));
        field1017 = 0;
        field1015 = var2.method17();
        if (field1016 == null) {
            field1016 = new class27[field1015];
        }
        if (field1018 == null) {
            field1018 = new int[field1015];
        }
        for (int var3 = 0; var3 < field1015; var3++) {
            if (field1016[var3] == null) {
                field1016[var3] = new class27();
            }
            field1016[var3].method354(var2, 0, var3);
        }
        if (var2.field19.length != var2.field20) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "JMEOMLFD", name = "a", descriptor = "(LBJPWOXRJ;II)V")
    public void method354(class3 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg0.method15();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1020 = arg0.method15();
            } else if (var5 == 2) {
                this.field1021 = arg0.method15();
            } else if (var5 == 3) {
                this.field1022 = true;
                field1018[field1017++] = arg2;
            } else if (var5 == 4) {
                this.field1023 = false;
            } else if (var5 == 5) {
                this.field1024 = arg0.method17();
            } else if (var5 == 6) {
                this.field1025 = true;
            } else if (var5 == 7) {
                this.field1026 = arg0.method20();
            } else if (var5 == 8) {
                this.field1027 = 1;
                this.field1028 = true;
            } else if (var5 == 10) {
                this.field1019 = arg0.method22();
            } else if (var5 == 11) {
                this.field1028 = true;
            } else if (var5 == 12) {
                this.field1029 = arg0.method20();
            } else if (var5 == 13) {
                this.field1027 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
