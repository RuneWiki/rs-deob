import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class434 extends class98 {

    @OriginalMember(owner = "client!cm", name = "Q", descriptor = "I")
    private int field6240 = 4096;

    @OriginalMember(owner = "client!cm", name = "P", descriptor = "Liq;")
    public static class362 field6239 = new class362("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!cm", name = "R", descriptor = "I")
    public static int field6241 = -1;

    @OriginalMember(owner = "client!cm", name = "S", descriptor = "Z")
    public static boolean field6242 = false;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(II)Lwp;", line = 3)
    public static final class97 method2721(int arg0, int arg1) {
        if (arg1 != 4096) {
            field6242 = false;
        }
        ++field6235;
        class237 var2 = class88.field1060;
        class97 var3;
        synchronized (class88.field1060) {
            var3 = (class97) class88.field1060.method1625((long) arg0, 0);
        }
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class8.field123.method2431((byte) 106, class249.method1695(arg0, (byte) 15), class306.method2016(arg0, (byte) -68));
            class97 var5 = new class97();
            var5.field1159 = arg0;
            if (var4 != null) {
                var5.method532(1066, new class236(var4));
            }
            class237 var6 = class88.field1060;
            synchronized (class88.field1060) {
                class88.field1060.method1622((byte) 13, var5, (long) arg0);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "()V", line = 32)
    public class434() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)V", line = 38)
    public static void method2722(int arg0) {
        field6239 = null;
        if (arg0 != -17732) {
            field6242 = true;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)[I", line = 51)
    public final int[] method83(int arg0, int arg1) {
        ++field6238;
        if (arg0 != 0) {
            this.field6240 = 103;
        }
        int[] var3 = super.field1177.method820(arg1, true);
        if (super.field1177.field1610) {
            int[] var4 = this.method539(0, (byte) -74, arg1 + -1 & class225.field3153);
            int[] var5 = this.method539(0, (byte) -122, arg1);
            int[] var6 = this.method539(0, (byte) -106, arg1 - -1 & class225.field3153);
            for (int var7 = 0; ~class268.field3811 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field6240;
                int var9 = (var5[class210.field2995 & var7 + 1] + -var5[var7 + -1 & class210.field2995]) * this.field6240;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + 4096 - -var13) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "(B)V", line = 104)
    public static final void method2723(byte arg0) {
        if (arg0 >= -102) {
            field6241 = -4;
        }
        class135.field1670.method1618(0);
        ++field6237;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILdg;I)V", line = 118)
    public final void method81(int arg0, class236 arg1, int arg2) {
        ++field6236;
        if (arg2 != 0) {
            method2722(110);
        }
        if (~arg0 == -1) {
            this.field6240 = arg1.method1617((byte) 48);
        }
    }
}
