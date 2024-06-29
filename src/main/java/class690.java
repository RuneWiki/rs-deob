import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class690 {

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Lea;")
    public static class547 field9668 = new class547(115, 8);

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field9669 = 0;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "B")
    public byte field9661;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public int field9662;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field9664;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field9665;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field9670;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Ljava/lang/String;")
    public String field9658;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Ljava/lang/String;")
    public String field9660;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "Ljava/lang/String;")
    public String field9666;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Ljava/lang/String;")
    public String field9667;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field9663;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static final void method3897(int arg0) {
        class122.field1606 = 0;
        class65.field716 = arg0;
        field9664++;
        for (int var1 = 0; var1 < class676.field9447; var1++) {
            int var2 = class56.field573 * var1;
            for (int var3 = 0; var3 < class56.field573; var3++) {
                int var4 = var2 + var3;
                class624.field8731[var4].method3450(class377.field5235 * var3, class759.field10586 * var1, class377.field5235, class759.field10586, 0, 0, true, true);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static final void method3898(int arg0) {
        class235.method1414(-5788);
        field9665++;
        class431.field6077 = null;
        class167.field2097 = 0;
        class488.field6682 = 0;
        class422.field5904 = null;
        class569.field8012.field8520 = 0;
        class327.field4373 = null;
        class681.field9489 = null;
        class182.field2225 = 0;
        class205.method1139((byte) -38);
        class148.method913(0);
        if (arg0 > -94) {
            field9670 = -63;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class361.field4793[var1] = null;
        }
        class653.field9086 = null;
        for (int var2 = 0; var2 < class12.field79; var2++) {
            class215 var4 = class746.field10359[var2].field9890;
            if (var4 != null) {
                var4.field809 = -1;
            }
        }
        class214.method1193((byte) -61);
        class39.field404 = -1;
        class520.field6999 = -1;
        class8.field57 = 1;
        class237.method1429(10, false);
        for (int var3 = 0; var3 < 100; var3++) {
            class24.field186[var3] = true;
        }
        class751.method4183(-2);
        class271.field3586 = null;
        class162.field2035 = 0L;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lbi;I)V")
    public static final void method3899(class481 arg0, int arg1) {
        for (int var2 = 0; var2 < class729.field10172; var2++) {
            int var3 = class488.field6689[var2];
            class83 var4 = class361.field4793[var3];
            int var5 = arg0.method3428((byte) 35);
            if ((var5 & 0x20) != 0) {
                var5 += arg0.method3428((byte) 36) << 8;
            }
            if ((var5 & 0x800) != 0) {
                var5 += arg0.method3428((byte) 95) << 16;
            }
            class244.method1463(var4, var5, arg0, (byte) 82, var3);
        }
        if (arg1 != 8429) {
            method3899(null, 30);
        }
        field9659++;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
    public static void method3900(int arg0) {
        field9663 = null;
        if (arg0 <= -96) {
            field9668 = null;
        }
    }
}
