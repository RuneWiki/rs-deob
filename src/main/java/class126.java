import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class126 {

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "Z")
    public boolean field1421;

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1422 = null;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "Lsb;")
    public static class305 field1423 = new class305(14, -1);

    @OriginalMember(owner = "client!dw", name = "i", descriptor = "Lsb;")
    public static class305 field1429 = new class305(62, 8);

    @OriginalMember(owner = "client!dw", name = "k", descriptor = "Lsb;")
    public static class305 field1431 = new class305(3, 7);

    @OriginalMember(owner = "client!dw", name = "f", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!dw", name = "e", descriptor = "Lsu;")
    public class155 field1425;

    @OriginalMember(owner = "client!dw", name = "j", descriptor = "Lsu;")
    public class155 field1430;

    @OriginalMember(owner = "client!dw", name = "d", descriptor = "Z")
    public boolean field1424;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIZZZ)V", line = 3)
    public static final void method718(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (arg4) {
            field1431 = null;
        }
        if (arg3 > arg1) {
            int var7 = (arg1 + arg3) / 2;
            int var8 = arg1;
            class130 var9 = class114.field1202[var7];
            class114.field1202[var7] = class114.field1202[arg3];
            class114.field1202[arg3] = var9;
            for (int var10 = arg1; var10 < arg3; var10++) {
                if (class364.method2126(arg5, arg6, class114.field1202[var10], var9, -17260, arg0, arg2) <= 0) {
                    class130 var11 = class114.field1202[var10];
                    class114.field1202[var10] = class114.field1202[var8];
                    class114.field1202[var8++] = var11;
                }
            }
            class114.field1202[arg3] = class114.field1202[var8];
            class114.field1202[var8] = var9;
            method718(arg0, arg1, arg2, var8 - 1, arg4, arg5, arg6);
            method718(arg0, var8 + 1, arg2, arg3, false, arg5, arg6);
        }
        field1426++;
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)V", line = 52)
    public final void method719(byte arg0) {
        field1428++;
        if (this.field1425 != null) {
            this.field1425.method74((byte) 102);
        }
        this.field1424 = false;
        if (arg0 > -84) {
            this.method721((byte) 36);
        }
    }

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "(B)V", line = 67)
    public static void method720(byte arg0) {
        field1423 = null;
        field1422 = null;
        field1431 = null;
        field1429 = null;
        if (arg0 > -120) {
            field1422 = null;
        }
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "(B)Z", line = 97)
    public final boolean method721(byte arg0) {
        field1427++;
        if (arg0 != -45) {
            this.method721((byte) -42);
        }
        return this.field1424 && !this.field1421;
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Z)V", line = 111)
    public class126(boolean arg0) {
        this.field1421 = arg0;
    }
}
