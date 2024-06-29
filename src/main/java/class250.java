import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class250 extends class97 {

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "Ljava/lang/String;")
    public String field3748;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field3746 = new String[100];

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "J")
    public static long field3749 = -1L;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V")
    public static void method1522(byte arg0) {
        field3746 = null;
        if (arg0 <= 116) {
            field3749 = -100L;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILiq;ZII)V")
    public static final void method1523(int arg0, int arg1, class134 arg2, boolean arg3, int arg4, int arg5) {
        class303.field4585 = arg3;
        class314.field4765 = arg5;
        class360.field5320 = 1;
        class162.field2247 = arg2;
        class135.field1794 = 10000;
        class36.field437 = arg1;
        field3747++;
        class463.field6832 = arg0;
        if (arg4 != 179) {
            field3749 = -126L;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIBI)I")
    public static final int method1524(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 > -92) {
            field3749 = -70L;
        }
        if (arg0 > 243) {
            arg3 >>= 0x4;
        } else if (arg0 > 217) {
            arg3 >>= 0x3;
        } else if (arg0 > 192) {
            arg3 >>= 0x2;
        } else if (arg0 > 179) {
            arg3 >>= 0x1;
        }
        field3751++;
        return (arg3 >> 5 << 7) + ((arg1 >> 2 & 0x3F) << 10) + (arg0 >> 1);
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
    public class250() {
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lef;Z)V")
    public static final void method1525(class385 arg0, boolean arg1) {
        field3750++;
        int var2 = arg0.method2372(true);
        class168.field2409 = new class19[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class168.field2409[var3] = new class19();
            class168.field2409[var3].field255 = arg0.method2372(true);
            class168.field2409[var3].field256 = arg0.method2330(-109);
        }
        class301.field4546 = arg0.method2372(true);
        class219.field3340 = arg0.method2372(true);
        class51.field658 = arg0.method2372(true);
        class299.field4519 = new class432[class219.field3340 + 1 - class301.field4546];
        int var4 = 0;
        if (arg1) {
            field3749 = -68L;
        }
        while (class51.field658 > var4) {
            int var5 = arg0.method2372(true);
            class432 var6 = class299.field4519[var5] = new class432();
            var6.field5119 = arg0.method2343(255);
            var6.field5117 = arg0.method2354(255);
            var6.field6335 = var5 + class301.field4546;
            var6.field6337 = arg0.method2330(-114);
            var6.field6333 = arg0.method2330(-113);
            var4++;
        }
        class228.field3477 = arg0.method2354(255);
        class414.field6155 = true;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BII)V")
    public static final void method1526(byte arg0, int arg1, int arg2) {
        field3752++;
        if (class345.method2100(-1, arg2)) {
            class180.method1094(class130.field1650[arg2], (byte) 1, arg1);
            if (arg0 != -63) {
                method1523(84, 92, (class134) null, false, 34, 32);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class250(String arg0, int arg1) {
        this.field3748 = arg0;
    }
}
