import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class422 extends class271 {

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    private int field6223;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "Lrl;")
    private class487 field6229;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    private int field6226;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    private int field6228;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    private int field6231;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    private int field6225;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    private int field6230;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    public static int field6233 = 0;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "Lwt;")
    public static class194 field6224 = new class194("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "Lgh;")
    private class368 field6227;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "Ljava/lang/String;")
    public static String field6234;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;)J", line = 4)
    public static final long method2505(int arg0, String arg1) {
        field6232++;
        long var2 = 0L;
        int var4 = arg1.length();
        if (arg0 != 65) {
            return -116L;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 + 1 - 65);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 - 96);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
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

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V", line = 48)
    public static void method2506(int arg0) {
        field6234 = null;
        field6224 = null;
        int var1 = 45 % ((13 - arg0) / 35);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)Lgh;", line = 64)
    public final class368 method1586(int arg0) {
        field6222++;
        if (arg0 != 1) {
            field6234 = null;
        }
        if (this.field6227 == null) {
            class59 var2 = this.field6229.field1695;
            class360.field5339[3] = this.field6223;
            class360.field5339[4] = this.field6228;
            class360.field5339[2] = this.field6231;
            class360.field5339[1] = this.field6226;
            class360.field5339[5] = this.field6225;
            class360.field5339[0] = this.field6230;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method428(arg0 - 14472, class360.field5339[var5])) {
                    return null;
                }
                class118 var7 = var2.method432(class360.field5339[var5], true);
                int var8 = var7.field1524 ? 64 : 128;
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var7.field1537 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class84.field1151[var6] = var2.method429(class360.field5339[var6], var4, false, 1.0F, -2472, var4);
            }
            this.field6227 = new class368(this.field6229, 6407, var4, var3, class84.field1151);
        }
        return this.field6227;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lrl;IIIIII)V", line = 129)
    public class422(class487 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6223 = arg4;
        this.field6229 = arg0;
        this.field6226 = arg2;
        this.field6228 = arg5;
        this.field6231 = arg3;
        this.field6225 = arg6;
        this.field6230 = arg1;
    }
}
