import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class83 {

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Lcg;")
    public static class10 field1219;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "F")
    public static float field1218;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIBIIZ)Z")
    public static final boolean method585(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, boolean arg8) {
        field1215++;
        int var9 = class358.field5565.field894[0];
        int var10 = class358.field5565.field899[0];
        if (var9 < 0 || class135.field1839 <= var9 || var10 < 0 || var10 >= class197.field3038) {
            return false;
        } else if (arg0 < 0 || class135.field1839 <= arg0 || arg3 < 0 || arg3 >= class197.field3038) {
            return false;
        } else if (arg5 == -82) {
            int var11 = class161.method982(arg4, class5.field59, arg0, arg7, arg6, var10, class155.field2060, class358.field5565.method415(-4), arg8, var9, arg2, class352.field5488[class358.field5565.field6419], arg3, arg5 - 34, arg1);
            if (var11 < 1) {
                return false;
            }
            class454.field7026 = class155.field2060[var11 - 1];
            class535.field7842 = class5.field59[var11 - 1];
            class253.field4100 = false;
            class304.method2051((byte) 108);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method586(int arg0) {
        if (arg0 != 0) {
            field1219 = null;
        }
        field1219 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III[B)Ljava/lang/String;")
    public static final String method587(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg0 != -177589178) {
            field1218 = 0.9190967F;
        }
        field1216++;
        char[] var4 = new char[arg2];
        int var5 = 0;
        int var6 = arg1 + arg2;
        for (int var7 = arg1; var7 < var6; var7++) {
            int var8 = arg3[var7] & 0xFF;
            if (var8 >= 128) {
                if (var8 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
                }
                if (var8 < 224) {
                    if ((var7 + 1) >= var6) {
                        throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                    }
                    var7++;
                    int var9 = arg3[var7] & 0xFF;
                    if (var9 < 128 || var9 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var4[var5++] = (char) class410.method2621(class272.method1842(-129, var9), class272.method1842(var8, -193) << 6);
                } else if (var8 < 240) {
                    if ((var7 + 2) >= var6) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    var7++;
                    int var10 = arg3[var7] & 0xFF;
                    if (var10 >= 128 && var10 <= 191) {
                        var7++;
                        int var11 = arg3[var7] & 0xFF;
                        if (var11 >= 128 && var11 <= 191) {
                            var4[var5++] = (char) class410.method2621(class410.method2621(class272.method1842(var10, -129) << 6, class272.method1842(var8 << 12, -921600)), class272.method1842(var11, -129));
                            continue;
                        }
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                } else if (var8 < 244) {
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                } else {
                    throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
                }
            } else {
                var4[var5++] = (char) var8;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)I")
    public static final int method588(int arg0, boolean arg1) {
        if (arg1) {
            field1217++;
            return arg0 & 0xFF;
        } else {
            return 118;
        }
    }

    static {
        new class213("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field1219 = new class10(13, 0, 1, 0);
    }
}
