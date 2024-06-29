import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class511 {

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "Ljava/lang/String;")
    public String field7188;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "Ljava/lang/String;")
    public String field7189;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "Ljava/lang/String;")
    public String field7191;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field7190 = -1;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "[I")
    public static int[] field7192 = new int[2];

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field7193 = 0;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field7187;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I[B)Lmp;", line = 4)
    public static final class706 method2927(int arg0, byte[] arg1) {
        int var2 = 38 % ((5 - arg0) / 35);
        field7187++;
        class706 var3 = new class706();
        class695 var4 = new class695(arg1);
        var4.field9761 = var4.field9796.length - 2;
        int var5 = var4.method3847((byte) 118);
        int var6 = var4.field9796.length - var5 - 2 - 12;
        var4.field9761 = var6;
        int var7 = var4.method3880(8);
        var3.field9926 = var4.method3847((byte) 118);
        var3.field9929 = var4.method3847((byte) 118);
        var3.field9925 = var4.method3847((byte) 118);
        var3.field9927 = var4.method3847((byte) 118);
        int var8 = var4.method3826(false);
        if (var8 > 0) {
            var3.field9933 = new class213[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = var4.method3847((byte) 118);
                class213 var11 = new class213(class2.method9(var10, -62));
                var3.field9933[var9] = var11;
                while (var10-- > 0) {
                    int var12 = var4.method3880(8);
                    int var13 = var4.method3880(8);
                    var11.method1403((byte) -18, new class111(var13), (long) var12);
                }
            }
        }
        var4.field9761 = 0;
        var3.field9934 = var4.method3877(true);
        var3.field9924 = new int[var7];
        var3.field9928 = new int[var7];
        var3.field9932 = new String[var7];
        int var14 = 0;
        while (var6 > var4.field9761) {
            int var15 = var4.method3847((byte) 118);
            if (var15 == 3) {
                var3.field9932[var14] = var4.method3836(false).intern();
            } else if (var15 >= 100 || var15 == 21 || var15 == 38 || var15 == 39) {
                var3.field9924[var14] = var4.method3826(false);
            } else {
                var3.field9924[var14] = var4.method3880(8);
            }
            var3.field9928[var14++] = var15;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 91)
    public static void method2928(int arg0) {
        if (arg0 != 3) {
            field7193 = 112;
        }
        field7192 = null;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 104)
    public class511(String arg0, String arg1, String arg2) {
        this.field7188 = arg2;
        this.field7189 = arg0;
        this.field7191 = arg1;
    }
}
