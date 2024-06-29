import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class263 extends class29 {

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    public int field4176 = 0;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    public static int field4172 = 0;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "Z")
    public static boolean field4174 = false;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V", line = 4)
    public static final void method1875(int arg0) {
        field4169++;
        if (class154.field2355 != null) {
            class154.field2355.method664(-1058);
        }
        if (class296.field4640 != null) {
            class296.field4640.method664(-1058);
        }
        class333.method2298(22050, (byte) 109, 2, class56.field739);
        class154.field2355 = class183.method1262(22050, class338.field5247, 13554, 0, class264.field4183);
        class154.field2355.method659(class160.field2506, (byte) 36);
        class296.field4640 = class183.method1262(2048, class338.field5247, 13554, 1, class264.field4183);
        if (arg0 != -9252) {
            field4174 = true;
        }
        class296.field4640.method659(class107.field1622, (byte) 125);
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V", line = 26)
    public static final void method1876(int arg0) {
        class188.field3056.method1205(-24516);
        field4170++;
        class37.field497 = 1;
        class64.field853 = null;
        if (arg0 == -8482) {
            ;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)[F", line = 43)
    public static final float[] method1877(boolean arg0, int arg1) {
        field4168++;
        float var2 = class109.method747() + class109.method757();
        int var3 = class109.method756();
        if (!arg0) {
            method1877(true, -1);
        }
        float var4 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        float var5 = 0.58823526F;
        class136.field2057[3] = 1.0F;
        class136.field2057[0] = var5 * (float) (class200.method1465(arg1, 16743353) >> 16) / 255.0F * var4 * var2;
        float var6 = (float) ((var3 & 0xFF7D) >> 8) / 255.0F;
        float var7 = (float) (var3 & 0xFF) / 255.0F;
        class136.field2057[1] = (float) class200.method1465(255, arg1 >> 8) / 255.0F * var6 * var5 * var2;
        class136.field2057[2] = var5 * (float) class200.method1465(arg1, 255) / 255.0F * var7 * var2;
        return class136.field2057;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lkb;Lkb;B)V", line = 72)
    public static final void method1878(class39 arg0, class39 arg1, byte arg2) {
        field4175++;
        class99.field1516 = class234.method1679(arg0, 0, class100.field1522, (byte) 60, arg1);
        if (class186.field2991) {
            class250.field3984 = class36.method230(0, arg1, -99, class100.field1522, arg0);
        } else {
            class250.field3984 = (class104) class99.field1516;
        }
        if (arg2 < -122) {
            class295.field4628 = class234.method1679(arg0, 0, class86.field1307, (byte) 83, arg1);
            class55.field732 = class234.method1679(arg0, 0, class330.field5136, (byte) 82, arg1);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILim;)V", line = 91)
    public final void method1879(int arg0, class192 arg1) {
        field4173++;
        while (true) {
            int var3 = arg1.method1399(-1172389784);
            if (var3 == 0) {
                if (arg0 != 861954000) {
                    method1878((class39) null, (class39) null, (byte) -53);
                }
                return;
            }
            this.method1880(arg1, var3, -3);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lim;II)V", line = 133)
    private final void method1880(class192 arg0, int arg1, int arg2) {
        field4167++;
        if (~arg1 == arg2) {
            this.field4176 = arg0.method1396(arg2 - 85);
        }
    }
}
