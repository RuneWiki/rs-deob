import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rc")
public class VarpType {

    @OriginalMember(owner = "rc", name = "a", descriptor = "Z")
    private boolean field1190 = true;

    @OriginalMember(owner = "rc", name = "i", descriptor = "Z")
    public boolean field1198 = false;

    @OriginalMember(owner = "rc", name = "j", descriptor = "Z")
    public boolean field1199 = true;

    @OriginalMember(owner = "rc", name = "l", descriptor = "Z")
    public boolean field1201 = false;

    @OriginalMember(owner = "rc", name = "o", descriptor = "Z")
    public boolean field1204 = false;

    @OriginalMember(owner = "rc", name = "p", descriptor = "I")
    public int field1205 = -1;

    @OriginalMember(owner = "rc", name = "b", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "rc", name = "d", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "rc", name = "g", descriptor = "I")
    public int field1196;

    @OriginalMember(owner = "rc", name = "h", descriptor = "I")
    public int field1197;

    @OriginalMember(owner = "rc", name = "k", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "rc", name = "m", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "rc", name = "n", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "rc", name = "f", descriptor = "Ljava/lang/String;")
    public String field1195;

    @OriginalMember(owner = "rc", name = "e", descriptor = "[I")
    public static int[] field1194;

    @OriginalMember(owner = "rc", name = "c", descriptor = "[Lrc;")
    public static VarpType[] field1192;

    @OriginalMember(owner = "rc", name = "a", descriptor = "(Lxb;Z)V")
    public static void method389(Jagfile arg0, boolean arg1) {
        Packet var2 = new Packet(-49365, arg0.method299("varp.dat", null));
        if (arg1) {
            return;
        }
        field1193 = 0;
        field1191 = var2.method231();
        if (field1192 == null) {
            field1192 = new VarpType[field1191];
        }
        if (field1194 == null) {
            field1194 = new int[field1191];
        }
        for (int var3 = 0; var3 < field1191; var3++) {
            if (field1192[var3] == null) {
                field1192[var3] = new VarpType();
            }
            field1192[var3].method390(true, var2, var3);
        }
        if (var2.field721.length != var2.field722) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(ZLlb;I)V")
    public void method390(boolean arg0, Packet arg1, int arg2) {
        if (!arg0) {
            this.field1190 = !this.field1190;
        }
        while (true) {
            int var4 = arg1.method229();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1196 = arg1.method229();
            } else if (var4 == 2) {
                this.field1197 = arg1.method229();
            } else if (var4 == 3) {
                this.field1198 = true;
                field1194[field1193++] = arg2;
            } else if (var4 == 4) {
                this.field1199 = false;
            } else if (var4 == 5) {
                this.field1200 = arg1.method231();
            } else if (var4 == 6) {
                this.field1201 = true;
            } else if (var4 == 7) {
                this.field1202 = arg1.method234();
            } else if (var4 == 8) {
                this.field1203 = 1;
                this.field1204 = true;
            } else if (var4 == 10) {
                this.field1195 = arg1.method236();
            } else if (var4 == 11) {
                this.field1204 = true;
            } else if (var4 == 12) {
                this.field1205 = arg1.method234();
            } else if (var4 == 13) {
                this.field1203 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
