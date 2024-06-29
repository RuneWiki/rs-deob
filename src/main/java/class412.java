import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public abstract class class412 {

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "Lcq;")
    public static class72 field5670 = new class72("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "Lwo;")
    public static class285 field5672;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "[I")
    public static int[] field5671;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "[Lc;")
    public static class436[] field5673;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
    public static void method2550(byte arg0) {
        field5670 = null;
        if (arg0 <= 61) {
            method2550((byte) 54);
        }
        field5672 = null;
        field5671 = null;
        field5673 = null;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I[B)V")
    public abstract void method500(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method2551(String arg0, byte arg1) {
        if (arg1 > -94) {
            method2551((String) null, (byte) -77);
        }
        field5669++;
        long var2 = 0L;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)[B")
    public abstract byte[] method499(byte arg0);
}
