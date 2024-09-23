import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("rc")
public class VarpType {

    @OriginalMember(owner = "rc", name = "a", descriptor = "I")
    private int field1196 = -550;

    @OriginalMember(owner = "rc", name = "k", descriptor = "Z")
    public boolean field1206 = false;

    @OriginalMember(owner = "rc", name = "l", descriptor = "Z")
    public boolean field1207 = true;

    @OriginalMember(owner = "rc", name = "n", descriptor = "Z")
    public boolean field1209 = false;

    @OriginalMember(owner = "rc", name = "q", descriptor = "Z")
    public boolean field1212 = false;

    @OriginalMember(owner = "rc", name = "r", descriptor = "I")
    public int field1213 = -1;

    @OriginalMember(owner = "rc", name = "b", descriptor = "Z")
    private static boolean field1197 = true;

    @OriginalMember(owner = "rc", name = "c", descriptor = "I")
    private static int field1198 = 810;

    @OriginalMember(owner = "rc", name = "d", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "rc", name = "f", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "rc", name = "i", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "rc", name = "j", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "rc", name = "m", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "rc", name = "o", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "rc", name = "p", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "rc", name = "h", descriptor = "Ljava/lang/String;")
    public String field1203;

    @OriginalMember(owner = "rc", name = "g", descriptor = "[I")
    public static int[] field1202;

    @OriginalMember(owner = "rc", name = "e", descriptor = "[Lrc;")
    public static VarpType[] field1200;

    @OriginalMember(owner = "rc", name = "a", descriptor = "(ZLxb;)V")
    public static void method385(boolean arg0, Jagfile arg1) {
        if (!arg0) {
            field1197 = !field1197;
        }
        Packet var2 = new Packet(arg1.method297("varp.dat", null), 15787);
        field1201 = 0;
        field1199 = var2.method229();
        if (field1200 == null) {
            field1200 = new VarpType[field1199];
        }
        if (field1202 == null) {
            field1202 = new int[field1199];
        }
        for (int var3 = 0; var3 < field1199; var3++) {
            if (field1200[var3] == null) {
                field1200[var3] = new VarpType();
            }
            field1200[var3].method386(field1198, var3, var2);
        }
        if (var2.field709.length != var2.field710) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "rc", name = "a", descriptor = "(IILlb;)V")
    public void method386(int arg0, int arg1, Packet arg2) {
        if (arg0 <= 0) {
            this.field1196 = 68;
        }
        while (true) {
            int var4 = arg2.method227();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1204 = arg2.method227();
            } else if (var4 == 2) {
                this.field1205 = arg2.method227();
            } else if (var4 == 3) {
                this.field1206 = true;
                field1202[field1201++] = arg1;
            } else if (var4 == 4) {
                this.field1207 = false;
            } else if (var4 == 5) {
                this.field1208 = arg2.method229();
            } else if (var4 == 6) {
                this.field1209 = true;
            } else if (var4 == 7) {
                this.field1210 = arg2.method232();
            } else if (var4 == 8) {
                this.field1211 = 1;
                this.field1212 = true;
            } else if (var4 == 10) {
                this.field1203 = arg2.method234();
            } else if (var4 == 11) {
                this.field1212 = true;
            } else if (var4 == 12) {
                this.field1213 = arg2.method232();
            } else if (var4 == 13) {
                this.field1211 = 2;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
