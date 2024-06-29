import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class140 {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lqm;")
    public static class222 field2474;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Ldd;")
    public static class238 field2479;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "Loi;")
    public static class306 field2476;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "[[S")
    public static short[][] field2480;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lmc;ZI)V", line = 9)
    public static final void method994(class172 arg0, boolean arg1, int arg2) {
        field2477++;
        if (arg2 != -24721) {
            method997((class55) null, 91);
        }
        int var3 = arg0.field2967;
        int var4 = (int) arg0.field417;
        arg0.method232(128);
        if (arg1) {
            class134.method953(2, var3);
        }
        class69.method567(var3, 1760088368);
        class60 var5 = class125.method907(var4, arg2 + 24626);
        if (var5 != null) {
            class190.method1342(var5, arg2 ^ 0xFFFF9F6F);
        }
        int var6 = class220.field3736;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class3.method15(true, class289.field4934[var7])) {
                class269.method1889(true, var7);
            }
        }
        if (class220.field3736 == 1) {
            class101.field1828 = false;
            class168.method1192((byte) -112, class244.field4247, class190.field3262, class313.field5300, class253.field4415);
        } else {
            class168.method1192((byte) -112, class244.field4247, class190.field3262, class313.field5300, class253.field4415);
            int var8 = class75.field1419.method1276(class28.field452);
            for (int var9 = 0; var9 < class220.field3736; var9++) {
                int var10 = class75.field1419.method1276(class253.method1809(false, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class313.field5300 = var8 + 8;
            class253.field4415 = class220.field3736 * 15 + 22;
        }
        if (class83.field1524 != -1) {
            class151.method1098(false, 1, class83.field1524);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 81)
    public static void method995(byte arg0) {
        field2476 = null;
        field2480 = (short[][]) null;
        if (arg0 >= 65) {
            field2474 = null;
            field2479 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V", line = 96)
    public static final void method996(boolean arg0, int arg1) {
        field2475++;
        if (!arg0) {
            method995((byte) -82);
        }
        class141.field2487.method1197((byte) 103, arg1);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lfb;I)V", line = 113)
    public static final void method997(class55 arg0, int arg1) {
        field2478++;
        if (arg1 > -28) {
            field2480 = (short[][]) ((short[][]) null);
        }
        long var2 = 0L;
        if (arg0.field930 == 0) {
            var2 = class313.method2167(arg0.field925, arg0.field929, arg0.field921);
        }
        int var4 = -1;
        int var5 = 0;
        if (arg0.field930 == 1) {
            var2 = class145.method1035(arg0.field925, arg0.field929, arg0.field921);
        }
        int var6 = 0;
        if (arg0.field930 == 2) {
            var2 = class141.method1000(arg0.field925, arg0.field929, arg0.field921);
        }
        if (arg0.field930 == 3) {
            var2 = class244.method1775(arg0.field925, arg0.field929, arg0.field921);
        }
        if (var2 != 0L) {
            var5 = ((int) var2 & 0x7F572) >> 14;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var6 = (int) var2 >> 20 & 0x3;
        }
        arg0.field917 = var6;
        arg0.field914 = var4;
        arg0.field918 = var5;
    }
}
