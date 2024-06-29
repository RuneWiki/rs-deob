import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!NPQMEWIH")
public class class39 {

    @OriginalMember(owner = "client!NPQMEWIH", name = "g", descriptor = "Z")
    public boolean field1237 = false;

    @OriginalMember(owner = "client!NPQMEWIH", name = "h", descriptor = "I")
    public int field1238 = -1;

    @OriginalMember(owner = "client!NPQMEWIH", name = "j", descriptor = "Z")
    public boolean field1240 = true;

    @OriginalMember(owner = "client!NPQMEWIH", name = "a", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!NPQMEWIH", name = "d", descriptor = "I")
    public int field1234;

    @OriginalMember(owner = "client!NPQMEWIH", name = "e", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!NPQMEWIH", name = "f", descriptor = "I")
    public int field1236;

    @OriginalMember(owner = "client!NPQMEWIH", name = "i", descriptor = "I")
    public int field1239;

    @OriginalMember(owner = "client!NPQMEWIH", name = "c", descriptor = "Ljava/lang/String;")
    public String field1233;

    @OriginalMember(owner = "client!NPQMEWIH", name = "b", descriptor = "[LNPQMEWIH;")
    public static class39[] field1232;

    @OriginalMember(owner = "client!NPQMEWIH", name = "a", descriptor = "(LNXFIIFAD;I)V")
    public static void method425(class41 arg0, int arg1) {
        class37 var2 = new class37(arg0.method431("varbit.dat", null), -670);
        if (arg1 != 24570) {
            return;
        }
        field1231 = var2.method388();
        if (field1232 == null) {
            field1232 = new class39[field1231];
        }
        for (int var3 = 0; var3 < field1231; var3++) {
            if (field1232[var3] == null) {
                field1232[var3] = new class39();
            }
            field1232[var3].method426(var2, false, var3);
            if (field1232[var3].field1237) {
                class22.field808[field1232[var3].field1234].field820 = true;
            }
        }
        if (var2.field1211.length != var2.field1212) {
            System.out.println("varbit load mismatch");
        }
    }

    @OriginalMember(owner = "client!NPQMEWIH", name = "a", descriptor = "(LMNKDCXXG;ZI)V")
    public void method426(class37 arg0, boolean arg1, int arg2) {
        if (arg1) {
            return;
        }
        while (true) {
            int var4 = arg0.method386();
            if (var4 == 0) {
                return;
            }
            if (var4 == 1) {
                this.field1234 = arg0.method388();
                this.field1235 = arg0.method386();
                this.field1236 = arg0.method386();
            } else if (var4 == 10) {
                this.field1233 = arg0.method393();
            } else if (var4 == 2) {
                this.field1237 = true;
            } else if (var4 == 3) {
                this.field1238 = arg0.method391();
            } else if (var4 == 4) {
                this.field1239 = arg0.method391();
            } else if (var4 == 5) {
                this.field1240 = false;
            } else {
                System.out.println("Error unrecognised config code: " + var4);
            }
        }
    }
}
