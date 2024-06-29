import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aka")
public class class85 extends RuntimeException {

    @OriginalMember(owner = "client!aka", name = "c", descriptor = "Ljava/lang/String;")
    public String field1187;

    @OriginalMember(owner = "client!aka", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1190;

    @OriginalMember(owner = "client!aka", name = "b", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1186 = new CRC32();

    @OriginalMember(owner = "client!aka", name = "e", descriptor = "[I")
    public static int[] field1189 = new int[8];

    @OriginalMember(owner = "client!aka", name = "h", descriptor = "I")
    public static int field1192 = 1406;

    @OriginalMember(owner = "client!aka", name = "g", descriptor = "[I")
    public static int[] field1191 = new int[4096];

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!aka", name = "d", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(CI)Z", line = 4)
    public static final boolean method701(char arg0, int arg1) {
        field1185++;
        if (arg1 != 7546) {
            field1189 = null;
        }
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            return true;
        }
        if (arg0 != '\u0000') {
            char[] var2 = class714.field9988;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(I)V", line = 44)
    public static void method702(int arg0) {
        int var1 = -25 % ((-arg0 - 17) / 55);
        field1186 = null;
        field1191 = null;
        field1189 = null;
    }

    @OriginalMember(owner = "client!aka", name = "a", descriptor = "(B)V", line = 61)
    public static final void method703(byte arg0) {
        if (arg0 > -89) {
            field1189 = null;
        }
        field1188++;
        for (int var1 = 0; var1 < class688.field9678; var1++) {
            int var2 = class382.field5588[var1];
            class174 var3 = (class174) class234.field3169.method3953((long) var2, 14);
            if (var3 != null) {
                class192 var4 = var3.field2336;
                class574.method3208(var4.field2577.field2960, -57, var4);
            }
        }
    }

    @OriginalMember(owner = "client!aka", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 98)
    public class85(Throwable arg0, String arg1) {
        this.field1187 = arg1;
        this.field1190 = arg0;
    }
}
