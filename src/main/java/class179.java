import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class179 {

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public int field3223 = 0;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field3226 = 0;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Lpk;")
    public static class99 field3222;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Lpk;")
    public static class99 field3224;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lpk;")
    public static class99 field3225;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
    public static final void method1276(int arg0) {
        field3219++;
        class189.field3334.method1390((byte) 115);
        if (arg0 == -1601881921) {
            class133.field2315.method1390((byte) 117);
            class165.field2917.method1390((byte) 126);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lv;II)V")
    private final void method1277(class149 arg0, int arg1, int arg2) {
        if (arg1 == 5) {
            this.field3223 = arg0.method1050(1272006568);
        }
        if (arg2 != 20788) {
            method1276(95);
        }
        field3221++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I")
    public static final int method1278(int arg0, int arg1, int arg2) {
        field3217++;
        int var3 = arg1 >> 31 & arg0 - 1;
        if (arg2 != 0) {
            field3224 = null;
        }
        return ((arg1 >>> 31) + arg1) % arg0 + var3;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILv;)V")
    public final void method1279(int arg0, class149 arg1) {
        field3218++;
        if (arg0 != -1323) {
            method1280(false);
        }
        while (true) {
            int var3 = arg1.method1045((byte) -74);
            if (var3 == 0) {
                return;
            }
            this.method1277(arg1, var3, arg0 + 22111);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
    public static void method1280(boolean arg0) {
        field3222 = null;
        field3224 = null;
        field3225 = null;
        if (arg0) {
            field3224 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLv;)V")
    public static final void method1281(byte arg0, class149 arg1) {
        field3220++;
        int var2 = arg1.method1067(-32768);
        class21.field344 = new class110[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class21.field344[var3] = new class110();
            class21.field344[var3].field1928 = arg1.method1067(-32768);
            class21.field344[var3].field1923 = arg1.method1081(41);
        }
        class268.field4749 = arg1.method1067(arg0 - 32675);
        class234.field4318 = arg1.method1067(arg0 - 32675);
        class220.field4008 = arg1.method1067(-32768);
        class113.field1965 = new class260[class234.field4318 + 1 - class268.field4749];
        if (arg0 != -93) {
            method1278(23, -111, -105);
        }
        for (int var4 = 0; var4 < class220.field4008; var4++) {
            int var5 = arg1.method1067(arg0 - 32675);
            class260 var6 = class113.field1965[var5] = new class260();
            var6.field4940 = arg1.method1045((byte) 95);
            var6.field4936 = arg1.method1076(arg0 ^ 0xFFFF00A3);
            var6.field4631 = class268.field4749 + var5;
            var6.field4637 = arg1.method1081(arg0 - 29);
            var6.field4639 = arg1.method1081(86);
        }
        class156.field2748 = arg1.method1076(65280);
        class1.field15 = true;
    }
}
