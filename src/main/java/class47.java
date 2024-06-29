import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RLLHHJLC")
public class class47 {

    @OriginalMember(owner = "client!RLLHHJLC", name = "i", descriptor = "Z")
    public boolean field1246 = false;

    @OriginalMember(owner = "client!RLLHHJLC", name = "j", descriptor = "I")
    public int field1247 = -1;

    @OriginalMember(owner = "client!RLLHHJLC", name = "l", descriptor = "Z")
    public boolean field1249 = true;

    @OriginalMember(owner = "client!RLLHHJLC", name = "a", descriptor = "I")
    private static int field1238 = 536;

    @OriginalMember(owner = "client!RLLHHJLC", name = "b", descriptor = "I")
    private static int field1239 = 3;

    @OriginalMember(owner = "client!RLLHHJLC", name = "c", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!RLLHHJLC", name = "f", descriptor = "I")
    public int field1243;

    @OriginalMember(owner = "client!RLLHHJLC", name = "g", descriptor = "I")
    public int field1244;

    @OriginalMember(owner = "client!RLLHHJLC", name = "h", descriptor = "I")
    public int field1245;

    @OriginalMember(owner = "client!RLLHHJLC", name = "k", descriptor = "I")
    public int field1248;

    @OriginalMember(owner = "client!RLLHHJLC", name = "e", descriptor = "Ljava/lang/String;")
    public String field1242;

    @OriginalMember(owner = "client!RLLHHJLC", name = "d", descriptor = "[LRLLHHJLC;")
    public static class47[] field1241;

    @OriginalMember(owner = "client!RLLHHJLC", name = "a", descriptor = "(ILUUIGNTAD;)V")
    public static void method430(int arg0, class59 arg1) {
        class10 var2 = new class10(arg1.method545("varbit.dat", null), field1238);
        field1240 = var2.method196();
        if (field1241 == null) {
            field1241 = new class47[field1240];
        }
        for (int var3 = 0; var3 < field1240; var3++) {
            if (field1241[var3] == null) {
                field1241[var3] = new class47();
            }
            field1241[var3].method431(var2, 527, var3);
            if (field1241[var3].field1246) {
                class5.field28[field1241[var3].field1243].field40 = true;
            }
        }
        if (field1239 != arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var2.field645.length != var2.field646) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!RLLHHJLC", name = "a", descriptor = "(LCMGGUSPR;II)V")
    public void method431(class10 arg0, int arg1, int arg2) {
        if (arg1 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg0.method194();
            if (var5 == 0) {
                return;
            }
            if (var5 == 1) {
                this.field1243 = arg0.method196();
                this.field1244 = arg0.method194();
                this.field1245 = arg0.method194();
            } else if (var5 == 10) {
                this.field1242 = arg0.method201();
            } else if (var5 == 2) {
                this.field1246 = true;
            } else if (var5 == 3) {
                this.field1247 = arg0.method199();
            } else if (var5 == 4) {
                this.field1248 = arg0.method199();
            } else if (var5 == 5) {
                this.field1249 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var5);
            }
        }
    }
}
