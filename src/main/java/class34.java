import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MUUMFTDK")
public class class34 {

    @OriginalMember(owner = "client!MUUMFTDK", name = "i", descriptor = "Z")
    public boolean field1096 = false;

    @OriginalMember(owner = "client!MUUMFTDK", name = "j", descriptor = "Z")
    public boolean field1097 = true;

    @OriginalMember(owner = "client!MUUMFTDK", name = "l", descriptor = "Z")
    public boolean field1099 = false;

    @OriginalMember(owner = "client!MUUMFTDK", name = "o", descriptor = "Z")
    public boolean field1102 = false;

    @OriginalMember(owner = "client!MUUMFTDK", name = "p", descriptor = "I")
    public int field1103 = -1;

    @OriginalMember(owner = "client!MUUMFTDK", name = "q", descriptor = "Z")
    public boolean field1104 = true;

    @OriginalMember(owner = "client!MUUMFTDK", name = "b", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!MUUMFTDK", name = "d", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!MUUMFTDK", name = "g", descriptor = "I")
    public int field1094;

    @OriginalMember(owner = "client!MUUMFTDK", name = "h", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!MUUMFTDK", name = "k", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!MUUMFTDK", name = "m", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!MUUMFTDK", name = "n", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "client!MUUMFTDK", name = "f", descriptor = "Ljava/lang/String;")
    public String field1093;

    @OriginalMember(owner = "client!MUUMFTDK", name = "a", descriptor = "Z")
    private static boolean field1088;

    @OriginalMember(owner = "client!MUUMFTDK", name = "e", descriptor = "[I")
    public static int[] field1092;

    @OriginalMember(owner = "client!MUUMFTDK", name = "c", descriptor = "[LMUUMFTDK;")
    public static class34[] field1090;

    @OriginalMember(owner = "client!MUUMFTDK", name = "a", descriptor = "(BLSXKKBWPU;)V")
    public static void method338(byte arg0, class50 arg1) {
        class53 var2 = new class53(arg1.method442("varp.dat", null), -631);
        field1091 = 0;
        field1089 = var2.method470();
        if (field1090 == null) {
            field1090 = new class34[field1089];
        }
        if (field1092 == null) {
            field1092 = new int[field1089];
        }
        for (int var3 = 0; var3 < field1089; var3++) {
            if (field1090[var3] == null) {
                field1090[var3] = new class34();
            }
            field1090[var3].method339(var3, 0, var2);
        }
        if (arg0 != -109) {
            field1088 = !field1088;
        }
        if (var2.field1456.length != var2.field1457) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!MUUMFTDK", name = "a", descriptor = "(IILTQYMAXSO;)V")
    public void method339(int arg0, int arg1, class53 arg2) {
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg2.method468();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1094 = arg2.method468();
            } else if (var5 == 2) {
                this.field1095 = arg2.method468();
            } else if (var5 == 3) {
                this.field1096 = true;
                field1092[field1091++] = arg0;
            } else if (var5 == 4) {
                this.field1097 = false;
            } else if (var5 == 5) {
                this.field1098 = arg2.method470();
            } else if (var5 == 6) {
                this.field1099 = true;
            } else if (var5 == 7) {
                this.field1100 = arg2.method473();
            } else if (var5 == 8) {
                this.field1101 = 1;
                this.field1102 = true;
            } else if (var5 == 10) {
                this.field1093 = arg2.method475();
            } else if (var5 == 11) {
                this.field1102 = true;
            } else if (var5 == 12) {
                this.field1103 = arg2.method473();
            } else if (var5 == 13) {
                this.field1101 = 2;
                this.field1102 = true;
            } else if (var5 == 14) {
                this.field1104 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
