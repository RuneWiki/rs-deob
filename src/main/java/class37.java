import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class37 {

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Ldf;")
    public static class51 field569 = class46.method233("details", 100);

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Ldf;")
    public static class51 field565 = class46.method233("Spielwelt erstellt)3", 100);

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field572 = -1;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field573 = 0;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Ldf;")
    public static class51 field566 = class46.method233("mem=", 100);

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "[I")
    public static int[] field567 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "Ldf;")
    public static class51 field575 = class46.method233("hint_headicons", 100);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field564 = -1;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Lje;")
    public static class173 field571;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "[I")
    public static int[] field570;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "[[[Lqg;")
    public static class97[][][] field574;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(III)Lva;")
    public static final class33 method186(int arg0, int arg1, int arg2) {
        class97 var3 = class27.field395[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1620; var4++) {
            class33 var5 = var3.field1632[var4];
            if ((var5.field477 >> 29 & 0x3L) == 2L && var5.field492 == arg1 && var5.field491 == arg2) {
                class55.method356(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public static void method187(byte arg0) {
        field565 = null;
        field571 = null;
        field575 = null;
        field574 = null;
        field569 = null;
        field570 = null;
        if (arg0 < 41) {
            method187((byte) 54);
        }
        field567 = null;
        field566 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public static final void method188(int arg0) {
        field568++;
        if (!class34.method170(100) && class257.field4496 != class245.field4253) {
            class92.method699(class257.field4496, class44.field706.field4343[0], class44.field706.field4336[0], class147.field2470, false, class70.field1129, false);
            return;
        }
        if (class257.field4496 != class207.field3457) {
            class207.field3457 = class257.field4496;
            class134.method979(class257.field4496, (byte) 127);
            class75.method534((byte) -89);
        }
        if (arg0 < 124) {
            method187((byte) -21);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
    public static final void method189(int arg0, int arg1) {
        field577++;
        if (arg1 == 1792) {
            class136 var2 = (class136) class7.field77.method1453((long) arg0, 1);
            if (var2 != null) {
                var2.method764((byte) -35);
            }
        }
    }
}
