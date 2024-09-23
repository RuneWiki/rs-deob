import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rc")
public class VarpType {

    @OriginalMember(owner = "rc", name = "a", descriptor = "Z")
    private boolean field1188 = false;

    @OriginalMember(owner = "rc", name = "i", descriptor = "Z")
    public boolean field1196 = false;

    @OriginalMember(owner = "rc", name = "j", descriptor = "Z")
    public boolean field1197 = true;

    @OriginalMember(owner = "rc", name = "l", descriptor = "Z")
    public boolean field1199 = false;

    @OriginalMember(owner = "rc", name = "o", descriptor = "Z")
    public boolean field1202 = false;

    @OriginalMember(owner = "rc", name = "p", descriptor = "I")
    public int field1203 = -1;

    @OriginalMember(owner = "rc", name = "b", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "rc", name = "d", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "rc", name = "g", descriptor = "I")
    public int field1194;

    @OriginalMember(owner = "rc", name = "h", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "rc", name = "k", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "rc", name = "m", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "rc", name = "n", descriptor = "I")
    public int field1201;

    @OriginalMember(owner = "rc", name = "f", descriptor = "Ljava/lang/String;")
    public String field1193;

    @OriginalMember(owner = "rc", name = "e", descriptor = "[I")
    public static int[] field1192;

    @OriginalMember(owner = "rc", name = "c", descriptor = "[Lrc;")
    public static VarpType[] field1190;

    @OriginalMember(owner = "rc", name = "a", descriptor = "(ZLxb;)V")
    public static void method389(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method299("varp.dat", null), (byte) -93);
        field1191 = 0;
        field1189 = var2.method231();
        if (arg0) {
            return;
        }
        if (field1190 == null) {
            field1190 = new VarpType[field1189];
        }
        if (field1192 == null) {
            field1192 = new int[field1189];
        }
        for (int var3 = 0; var3 < field1189; var3++) {
            if (field1190[var3] == null) {
                field1190[var3] = new VarpType();
            }
            field1190[var3].method390(var3, var2, -45931);
        }
        if (var2.field712.length != var2.field713) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(ILlb;I)V")
    public void method390(int arg0, Packet arg1, int arg2) {
        if (arg2 != -45931) {
            this.field1188 = !this.field1188;
        }
        while (true) {
            int var4 = arg1.method229();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1194 = arg1.method229();
            } else if (var4 == 2) {
                this.field1195 = arg1.method229();
            } else if (var4 == 3) {
                this.field1196 = true;
                field1192[field1191++] = arg0;
            } else if (var4 == 4) {
                this.field1197 = false;
            } else if (var4 == 5) {
                this.field1198 = arg1.method231();
            } else if (var4 == 6) {
                this.field1199 = true;
            } else if (var4 == 7) {
                this.field1200 = arg1.method234();
            } else if (var4 == 8) {
                this.field1201 = 1;
                this.field1202 = true;
            } else if (var4 == 10) {
                this.field1193 = arg1.method236();
            } else if (var4 == 11) {
                this.field1202 = true;
            } else if (var4 == 12) {
                this.field1203 = arg1.method234();
            } else if (var4 == 13) {
                this.field1201 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
