import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class59 extends RuntimeException {

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field944;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "Ljava/lang/String;")
    public String field945;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field939 = 0;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field941 = 500;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(JI)V")
    public static final void method485(long arg0, int arg1) {
        field938++;
        if (arg0 == 0L || arg1 != 1) {
            return;
        }
        for (int var3 = 0; var3 < class40.field677; var3++) {
            if (class78.field1189[var3] == arg0) {
                class40.field677--;
                for (int var4 = var3; var4 < class40.field677; var4++) {
                    class78.field1189[var4] = class78.field1189[var4 + 1];
                    class226.field3627[var4] = class226.field3627[var4 + 1];
                    class214.field3275[var4] = class214.field3275[var4 + 1];
                }
                class178.field2737 = class216.field3305;
                class106.field1658++;
                class240.field3826.method1762(76, true);
                class240.field3826.method313(arg1 ^ 0xFFFFE4C9, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BD)V")
    public static final void method486(byte arg0, double arg1) {
        if (class172.field2609 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class40.field675[var3] = var4 > 255 ? 255 : var4;
            }
            class172.field2609 = arg1;
        }
        field942++;
        if (arg0 < 66) {
            field941 = -13;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)Z")
    public static final boolean method487(int arg0, int arg1) {
        field940++;
        if (class161.field2415 == arg0) {
            return false;
        }
        class203.field3133 = new int[4][13][13];
        class184.field2909 = new int[104][104];
        for (int var2 = arg1; var2 < 4; var2++) {
            class80.field1236[var2] = new class89(104, 104);
        }
        class161.field2415 = arg0;
        class141.field2108 = new byte[4][104][104];
        class110.field1695 = new class2[4][104][104];
        client.field2390 = new byte[4][104][104];
        return true;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class59(Throwable arg0, String arg1) {
        this.field944 = arg0;
        this.field945 = arg1;
    }
}
