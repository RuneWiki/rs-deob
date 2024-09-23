import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rc")
public class VarpType {

    @OriginalMember(owner = "rc", name = "h", descriptor = "Z")
    public boolean field1201 = false;

    @OriginalMember(owner = "rc", name = "i", descriptor = "Z")
    public boolean field1202 = true;

    @OriginalMember(owner = "rc", name = "k", descriptor = "Z")
    public boolean field1204 = false;

    @OriginalMember(owner = "rc", name = "n", descriptor = "Z")
    public boolean field1207 = false;

    @OriginalMember(owner = "rc", name = "o", descriptor = "I")
    public int field1208 = -1;

    @OriginalMember(owner = "rc", name = "a", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "rc", name = "c", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "rc", name = "f", descriptor = "I")
    public int field1199;

    @OriginalMember(owner = "rc", name = "g", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "rc", name = "j", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "rc", name = "l", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "rc", name = "m", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "rc", name = "e", descriptor = "Ljava/lang/String;")
    public String field1198;

    @OriginalMember(owner = "rc", name = "d", descriptor = "[I")
    public static int[] field1197;

    @OriginalMember(owner = "rc", name = "b", descriptor = "[Lrc;")
    public static VarpType[] field1195;

    @OriginalMember(owner = "rc", name = "a", descriptor = "(ILxb;)V")
    public static void method389(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method299("varp.dat", null), -26728);
        field1196 = 0;
        if (arg0 != 0) {
            return;
        }
        field1194 = var2.method231();
        if (field1195 == null) {
            field1195 = new VarpType[field1194];
        }
        if (field1197 == null) {
            field1197 = new int[field1194];
        }
        for (int var3 = 0; var3 < field1194; var3++) {
            if (field1195[var3] == null) {
                field1195[var3] = new VarpType();
            }
            field1195[var3].method390(var3, 39196, var2);
        }
        if (var2.field716.length != var2.field717) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(IILlb;)V")
    public void method390(int arg0, int arg1, Packet arg2) {
        if (arg1 != 39196) {
            return;
        }
        while (true) {
            int var4 = arg2.method229();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1199 = arg2.method229();
            } else if (var4 == 2) {
                this.field1200 = arg2.method229();
            } else if (var4 == 3) {
                this.field1201 = true;
                field1197[field1196++] = arg0;
            } else if (var4 == 4) {
                this.field1202 = false;
            } else if (var4 == 5) {
                this.field1203 = arg2.method231();
            } else if (var4 == 6) {
                this.field1204 = true;
            } else if (var4 == 7) {
                this.field1205 = arg2.method234();
            } else if (var4 == 8) {
                this.field1206 = 1;
                this.field1207 = true;
            } else if (var4 == 10) {
                this.field1198 = arg2.method236();
            } else if (var4 == 11) {
                this.field1207 = true;
            } else if (var4 == 12) {
                this.field1208 = arg2.method234();
            } else if (var4 == 13) {
                this.field1206 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
