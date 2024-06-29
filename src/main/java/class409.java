import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class409 {

    @OriginalMember(owner = "client!go", name = "o", descriptor = "I")
    public int field5606 = -1;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "Lfr;")
    public static class260 field5603;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "[I")
    public static int[] field5604;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "[Lnt;")
    public static class134[] field5608;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public int field5592;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public int field5593;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public int field5595;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public int field5597;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public int field5598;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    public int field5599;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public int field5602;

    @OriginalMember(owner = "client!go", name = "r", descriptor = "I")
    public int field5609;

    @OriginalMember(owner = "client!go", name = "t", descriptor = "I")
    public int field5611;

    @OriginalMember(owner = "client!go", name = "u", descriptor = "I")
    public int field5612;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "Lr;")
    public static class110 field5607;

    @OriginalMember(owner = "client!go", name = "s", descriptor = "[Ljd;")
    public static class139[] field5610;

    static {
        new class206("clan_chat", "clanchat", "conversation_clan", "clan_chat");
        field5600 = 0;
        field5603 = new class260();
        field5604 = new int[5];
        field5608 = new class134[14];
        field5605 = 0;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V", line = 18)
    public static void method2457(int arg0) {
        field5603 = null;
        field5604 = null;
        field5607 = null;
        field5608 = null;
        if (arg0 != 0) {
            method2458((byte) -98, 17);
        }
        field5610 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)[B", line = 34)
    public static final byte[] method2458(byte arg0, int arg1) {
        field5594++;
        class411 var2 = (class411) class233.field3090.method2635((long) arg1, (byte) -89);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class257.method1447(20094, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class411(var3);
            class233.field3090.method2638((byte) 125, var2, (long) arg1);
        }
        if (arg0 >= -79) {
            method2458((byte) -63, -107);
        }
        return var2.field5630;
    }
}
