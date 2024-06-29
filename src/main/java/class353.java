import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class353 extends OutputStream {

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Llo;")
    public static class306 field5504 = new class306("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Lnk;")
    public static class326 field5505 = new class326(5, -1);

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field5506 = 0;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 3)
    public static final String method2263(long arg0, int arg1) {
        field5501++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % (long) arg1) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class265.field4448[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!gb", name = "write", descriptor = "(I)V", line = 52)
    public final void write(int arg0) throws IOException {
        field5502++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 60)
    public static void method2264(int arg0) {
        field5504 = null;
        field5505 = null;
        if (arg0 != -30264) {
            field5506 = 94;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IC)Z", line = 75)
    public static final boolean method2265(int arg0, char arg1) {
        field5500++;
        if (arg0 != 57) {
            field5505 = null;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIIBI)V", line = 91)
    public static final void method2266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field5503++;
        if (arg9 < 128 || arg7 < 128 || arg9 > (class217.field3775 * 128 - 256) || arg7 > (class277.field4548 * 128 - 256)) {
            class244.field4188[0] = class244.field4188[1] = -1;
            return;
        }
        int var10 = class81.method592(arg9, arg7, 9251, arg2) - arg1;
        class71.field1242.method1237(arg0, 0, 0);
        class305.field4873.method911(class71.field1242);
        class305.field4873.method819(arg9, var10, arg7, class244.field4188);
        class71.field1242.method1237(-arg0, 0, 0);
        if (arg8 != 126) {
            field5505 = null;
        }
        class305.field4873.method911(class71.field1242);
    }
}
