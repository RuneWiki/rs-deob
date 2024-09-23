import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rc")
public class VarpType {

    @OriginalMember(owner = "rc", name = "j", descriptor = "Z")
    public boolean field1199 = false;

    @OriginalMember(owner = "rc", name = "k", descriptor = "Z")
    public boolean field1200 = true;

    @OriginalMember(owner = "rc", name = "m", descriptor = "Z")
    public boolean field1202 = false;

    @OriginalMember(owner = "rc", name = "p", descriptor = "Z")
    public boolean field1205 = false;

    @OriginalMember(owner = "rc", name = "q", descriptor = "I")
    public int field1206 = -1;

    @OriginalMember(owner = "rc", name = "b", descriptor = "B")
    private static byte field1191;

    @OriginalMember(owner = "rc", name = "c", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "rc", name = "e", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "rc", name = "h", descriptor = "I")
    public int field1197;

    @OriginalMember(owner = "rc", name = "i", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "rc", name = "l", descriptor = "I")
    public int field1201;

    @OriginalMember(owner = "rc", name = "n", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "rc", name = "o", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "rc", name = "g", descriptor = "Ljava/lang/String;")
    public String field1196;

    @OriginalMember(owner = "rc", name = "a", descriptor = "Z")
    private static boolean field1190;

    @OriginalMember(owner = "rc", name = "f", descriptor = "[I")
    public static int[] field1195;

    @OriginalMember(owner = "rc", name = "d", descriptor = "[Lrc;")
    public static VarpType[] field1193;

    @OriginalMember(owner = "rc", name = "a", descriptor = "(Lxb;I)V")
    public static void method389(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(arg0.method299("varp.dat", null), field1190);
        field1194 = 0;
        field1192 = var2.method231();
        if (field1193 == null) {
            field1193 = new VarpType[field1192];
        }
        if (field1195 == null) {
            field1195 = new int[field1192];
        }
        for (int var3 = 0; var3 < field1192; var3++) {
            if (field1193[var3] == null) {
                field1193[var3] = new VarpType();
            }
            field1193[var3].method390(var3, field1191, var2);
        }
        if (arg1 < 5 || arg1 > 5) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var2.field711.length != var2.field712) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(IBLlb;)V")
    public void method390(int arg0, byte arg1, Packet arg2) {
        if (arg1 == 0) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        while (true) {
            int var6 = arg2.method229();
            if (var6 == 0) {
                return;
            }
            if (var6 == 1) {
                this.field1197 = arg2.method229();
            } else if (var6 == 2) {
                this.field1198 = arg2.method229();
            } else if (var6 == 3) {
                this.field1199 = true;
                field1195[field1194++] = arg0;
            } else if (var6 == 4) {
                this.field1200 = false;
            } else if (var6 == 5) {
                this.field1201 = arg2.method231();
            } else if (var6 == 6) {
                this.field1202 = true;
            } else if (var6 == 7) {
                this.field1203 = arg2.method234();
            } else if (var6 == 8) {
                this.field1204 = 1;
                this.field1205 = true;
            } else if (var6 == 10) {
                this.field1196 = arg2.method236();
            } else if (var6 == 11) {
                this.field1205 = true;
            } else if (var6 == 12) {
                this.field1206 = arg2.method234();
            } else if (var6 == 13) {
                this.field1204 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var6);
            }
        }
    }
}
