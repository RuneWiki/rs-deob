import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class75 {

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "[I")
    private int[] field1415;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "Lcd;")
    public static class64 field1412 = class44.method335((byte) 71, "gr-Un:");

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lcd;")
    public static class64 field1416 = class44.method335((byte) 71, ")4");

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Lcd;")
    public static class64 field1417 = class44.method335((byte) 71, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field1420 = 0;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Lcd;")
    public static class64 field1418 = class44.method335((byte) 71, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "F")
    public static float field1414;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "Lka;")
    public static class179 field1419;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "[Lnm;")
    public static class176[] field1413;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)I", line = 16)
    public final int method599(int arg0, int arg1) {
        if (arg0 != 1) {
            method601((byte) 61);
        }
        field1421++;
        int var3 = (this.field1415.length >> 1) - 1;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field1415[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1415[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)I", line = 53)
    public static final int method600(int arg0) {
        field1422++;
        int var1 = -60 % ((12 - arg0) / 36);
        return class276.field4753 == 0 ? 0 : class62.field1210[class276.field4753].method554();
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 71)
    public static void method601(byte arg0) {
        field1418 = null;
        field1419 = null;
        field1417 = null;
        field1416 = null;
        field1412 = null;
        if (arg0 >= 32) {
            field1413 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "([I)V", line = 94)
    public class75(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field1415 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1415[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1415[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field1415[var5 + var5] = arg0[var4];
            this.field1415[var5 + var5 + 1] = var4++;
        }
    }
}
