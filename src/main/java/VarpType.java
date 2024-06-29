import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class VarpType {

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "Z")
    public boolean field1196 = false;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Z")
    public boolean field1197 = true;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Z")
    public boolean field1199 = false;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Z")
    public boolean field1201 = false;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Z")
    public boolean field1202 = false;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public int field1194;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public int field1195;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public int field1198;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public int field1200;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "Ljava/lang/String;")
    public String field1193;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "[I")
    public static int[] field1192;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "[Lrc;")
    public static VarpType[] field1190;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lyb;I)V")
    public static void method391(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(45427, arg0.method309("varp.dat", null));
        field1191 = 0;
        field1189 = var2.method241();
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
            field1190[var3].method392(var2, var3, 312);
        }
        int var4 = 83 / arg1;
        if (var2.field735.length != var2.field736) {
            System.out.println("varptype load mismatch");
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lmb;II)V")
    public void method392(Packet arg0, int arg1, int arg2) {
        int var4 = 17 / arg2;
        while (true) {
            int var5 = arg0.method239();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1194 = arg0.method239();
            } else if (var5 == 2) {
                this.field1195 = arg0.method239();
            } else if (var5 == 3) {
                this.field1196 = true;
                field1192[field1191++] = arg1;
            } else if (var5 == 4) {
                this.field1197 = false;
            } else if (var5 == 5) {
                this.field1198 = arg0.method241();
            } else if (var5 == 6) {
                this.field1199 = true;
            } else if (var5 == 7) {
                this.field1200 = arg0.method244();
            } else if (var5 == 8) {
                this.field1201 = true;
                this.field1202 = true;
            } else if (var5 == 10) {
                this.field1193 = arg0.method246();
            } else if (var5 == 11) {
                this.field1202 = true;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
