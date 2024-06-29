import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public abstract class class130 {

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "[Li;")
    public static class88[] field2438 = new class88[8];

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "[B")
    public static byte[] field2433;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "Ltb;")
    public static class209 field2443;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public int field2434;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public int field2435;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public int field2436;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public int field2439;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public int field2440;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "Lbj;")
    public static class22 field2442;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "[Lrc;")
    public static class188[] field2430;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
    public abstract void method878(int arg0, int arg1);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(III)V")
    public abstract void method879(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)Lli;")
    public static final class129 method880(int arg0, int arg1) {
        field2437++;
        class129 var2 = (class129) class210.field3991.method666((long) arg0, arg1 ^ arg1);
        if (var2 != null) {
            return var2;
        }
        class129 var3 = class46.method309(class148.field2780, arg0, class142.field2626, false, (byte) -122);
        if (var3 != null) {
            class210.field3991.method664((long) arg0, var3, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLi;)V")
    public static final void method881(byte arg0, class88 arg1) {
        field2432++;
        class244 var2 = class33.method207((byte) 55, arg1);
        if (var2 == null) {
            return;
        }
        int var3 = -32 % ((-arg0 - 7) / 53);
        class34.field594 = class44.field760 + class119.field2183 - var2.field4487;
        class189.field3661 = var2.field4485 - class16.field239;
        int var4 = class34.field594 - (int) ((double) class90.field1707.field3424 / class59.field1110);
        int var5 = class189.field3661 - (int) ((double) class90.field1707.field3382 / class59.field1110);
        int var6 = class189.field3661 + (int) ((double) class90.field1707.field3382 / class59.field1110);
        if (var5 < 0) {
            class189.field3661 = (int) ((double) class90.field1707.field3382 / class59.field1110);
        }
        int var7 = (int) ((double) class90.field1707.field3424 / class59.field1110) + class34.field594;
        if (var6 > class109.field1990) {
            class189.field3661 = class109.field1990 - (int) ((double) class90.field1707.field3382 / class59.field1110);
        }
        if (var4 < 0) {
            class34.field594 = (int) ((double) class90.field1707.field3424 / class59.field1110);
        }
        if (var7 > class44.field760) {
            class34.field594 = class44.field760 - (int) ((double) class90.field1707.field3424 / class59.field1110);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method882(int arg0) {
        field2438 = null;
        field2442 = null;
        field2433 = null;
        if (arg0 != -14445) {
            field2443 = null;
        }
        field2443 = null;
        field2430 = null;
    }

    static {
        int var0 = 0;
        field2433 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2433[var0++] = (byte) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F)));
            }
        }
        field2443 = new class209();
        field2444 = 1;
    }
}
