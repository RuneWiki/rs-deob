import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class98 extends class60 {

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public int field1713;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public int field1710;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "Lub;")
    public static class227 field1711 = class257.method1749("blinken1:", 17263);

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "Lrb;")
    public static class254 field1712 = new class254(64);

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public static int field1716 = 0;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1718 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "Lnd;")
    public static class202 field1714;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "[[[I")
    public static int[][][] field1717;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(BLn;)V")
    public static final void method603(byte arg0, class138 arg1) {
        class152.field2639 = class181.method1157(class177.field2973, arg1, -3169);
        field1708++;
        class133.field2316 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            int var4 = class118.field2156[var2 + 1] >> 16 & 0xFF;
            float var5 = (float) (class118.field2156[var2] >> 16 & 0xFF);
            float var6 = ((float) var4 - var5) / 64.0F;
            float var7 = (float) (class118.field2156[var2] >> 8 & 0xFF);
            int var8 = (class118.field2156[var2 + 1] & 0xFF00) >> 8;
            float var9 = (float) (class118.field2156[var2] & 0xFF);
            int var10 = class118.field2156[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var9) / 64.0F;
            float var12 = ((float) var8 - var7) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class133.field2316[var2 * 64 + var13] = class246.method1640((int) var9, class246.method1640((int) var5 << 16, (int) var7 << 8));
                var9 += var11;
                var7 += var12;
                var5 += var6;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class133.field2316[var3] = class118.field2156[3];
        }
        if (arg0 <= 47) {
            method605(true);
        }
        class204.field3476 = new int[32768];
        class226.field3899 = new int[32768];
        class25.method124((class209) null, -1);
        class142.field2448 = new int[32768];
        class256.field4489 = new int[32768];
        class251.field4346 = new class163(128, 254);
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)Z")
    public static final boolean method604(byte arg0) {
        field1709++;
        if (arg0 < 89) {
            return true;
        }
        try {
            return class236.method1573(-84);
        } catch (IOException var4) {
            class168.method1038(-54);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class134.field2318 + "," + class112.field2081 + "," + class245.field4275 + " - " + class179.field3073 + "," + (class216.field3639.field78[0] + class192.field3267) + "," + (class216.field3639.field49[0] + class78.field1367) + " - ";
            for (int var3 = 0; class179.field3073 > var3 && var3 < 50; var3++) {
                var2 = var2 + class32.field512.field3901[var3] + ",";
            }
            class149.method949(var2, var5, -103);
            class188.method1202(true);
            return true;
        }
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(Z)V")
    public static void method605(boolean arg0) {
        field1718 = null;
        field1714 = null;
        if (!arg0) {
            field1711 = null;
            field1717 = null;
            field1712 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)Lac;")
    public static final class133 method606(int arg0, int arg1, int arg2) {
        class108 var3 = class261.field4539[arg0][arg1][arg2];
        return var3 == null || var3.field2039 == null ? null : var3.field2039;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(II)V")
    public class98(int arg0, int arg1) {
        this.field1713 = arg1;
        this.field1710 = arg0;
    }
}
