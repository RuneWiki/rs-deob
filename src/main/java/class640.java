import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class640 {

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "J")
    public long field9286;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "Ljj;")
    private class66 field9284;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "Z")
    public static boolean field9283 = false;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "Ljc;")
    public static class584 field9282 = null;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "Z")
    public static boolean field9285 = false;

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "Lbv;")
    public static class567 field9287 = new class567("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "Lbv;")
    public static class567 field9290 = new class567("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field9281;

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
    public static int field9288;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
    public static int field9289;

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "I")
    public static int field9291;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V", line = 3)
    public static void method3690(int arg0) {
        field9287 = null;
        field9282 = null;
        if (arg0 != -18619) {
            field9290 = null;
        }
        field9290 = null;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILjava/lang/String;)J", line = 29)
    public static final long method3691(int arg0, String arg1) {
        field9281++;
        long var2 = 0L;
        if (arg0 != -10880) {
            method3693(null, 118, null);
        }
        int var4 = arg1.length();
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

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V", line = 82)
    public static final void method3692(byte arg0) {
        if (arg0 > -103) {
            method3691(-24, null);
        }
        if (class381.field5612 > 0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class555.field7859.length; var2++) {
                if (class555.field7859[var2].startsWith("--> ")) {
                    var1++;
                    if (class381.field5612 == var1) {
                        class57.field822 = class555.field7859[var2].substring(4);
                        break;
                    }
                }
            }
        } else {
            class57.field822 = "";
        }
        field9289++;
    }

    @OriginalMember(owner = "client!vv", name = "finalize", descriptor = "()V", line = 114)
    protected final void finalize() throws Throwable {
        field9288++;
        this.field9284.method527(209171688, this.field9286);
        super.finalize();
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lod;I[[B)V", line = 124)
    public static final void method3693(class568 arg0, int arg1, byte[][] arg2) {
        field9291++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg0.field882; var4++) {
            class547.method3064((byte) -113);
            for (int var6 = 0; var6 < (class146.field2247 >> 3); var6++) {
                for (int var7 = 0; var7 < class66.field990 >> 3; var7++) {
                    int var8 = class82.field1462[var4][var6][var7];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg0.field870 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = (var8 & 0xFFD2C2) >> 14;
                            int var12 = (var8 & 0x3FF8) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class43.field584.length; var14++) {
                                if (class43.field584[var14] == var13 && arg2[var14] != null) {
                                    class268 var15 = new class268(arg2[var14]);
                                    arg0.method503(var9, (byte) -5, var6 * 8, var10, var7 * 8, var12, var15, class268.field3916, var4, var11);
                                    arg0.method3229(var6 * 8, var9, var11, var4, var15, var3[0] == -1 ? var3 : null, class159.field2378, var12, var10, (byte) -120, var7 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class580.field8259 = class316.field4615.method1318(var3[3], class92.field1638, (byte) -17, var3[2], var3[1], var3[0]);
            class399.field5941 = var3[4];
        }
        int var5 = 61 % ((-arg1 - 12) / 33);
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(Ljj;J[Lud;)V", line = 204)
    public class640(class66 arg0, long arg1, class119[] arg2) {
        this.field9286 = arg1;
        this.field9284 = arg0;
    }
}
