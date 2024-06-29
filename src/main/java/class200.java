import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class200 {

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public int field3008;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public int field3001;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public int field3003;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public int field3004;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field3007 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBI)V")
    public static final void method1335(int arg0, byte arg1, int arg2) {
        class105 var3 = class9.method72(5, -1, arg0);
        if (arg1 >= -106) {
            method1335(-75, (byte) -36, -94);
        }
        field3006++;
        var3.method763(false);
        var3.field1553 = arg2;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class200() {
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public static final void method1336(boolean arg0) {
        if (!arg0) {
            return;
        }
        for (int var1 = 0; var1 < class207.field3093; var1++) {
            int var2 = class285.field4379[var1];
            class87 var3 = class243.field3762[var2];
            if (var3 != null) {
                class183.method1201(var3.field1323.field2813, var3, false);
            }
        }
        field3005++;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lgb;)V")
    public class200(class200 arg0) {
        this.field3008 = arg0.field3008;
        this.field3001 = arg0.field3001;
        this.field3003 = arg0.field3003;
        this.field3004 = arg0.field3004;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1337(int arg0, byte[] arg1) {
        field3002++;
        class54 var2 = new class54(arg1);
        if (arg0 != -1) {
            method1337(-77, (byte[]) null);
        }
        int var3 = var2.method407(255);
        int var4 = var2.method420((byte) -87);
        if (var4 < 0 || !(class22.field366 == 0 || var4 <= class22.field366)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method410(-251030480, var5, var4, 0);
            return var5;
        } else {
            int var6 = var2.method420((byte) -99);
            if (var6 < 0 || !(class22.field366 == 0 || var6 <= class22.field366)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class74.method589(var7, var6, arg1, var4, 9);
            } else {
                class73.field1191.method774(var2, 0, var7);
            }
            return var7;
        }
    }
}
