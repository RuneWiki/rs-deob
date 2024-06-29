import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class740 {

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "Ljda;")
    private class239 field10211 = new class239(64);

    @OriginalMember(owner = "client!ega", name = "g", descriptor = "Laj;")
    private class333 field10217;

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
    public static int field10212;

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "I")
    public static int field10213;

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
    public static int field10214;

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "I")
    public static int field10215;

    @OriginalMember(owner = "client!ega", name = "f", descriptor = "I")
    public static int field10216;

    @OriginalMember(owner = "client!ega", name = "h", descriptor = "I")
    public static int field10218;

    @OriginalMember(owner = "client!ega", name = "i", descriptor = "I")
    public static int field10219;

    @OriginalMember(owner = "client!ega", name = "j", descriptor = "I")
    public static int field10220;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IBI)I")
    public static final int method4095(int arg0, byte arg1, int arg2) {
        if (arg1 >= -127) {
            return 85;
        }
        field10213++;
        byte var3;
        if (arg2 > 20000) {
            class117.method960(-18861);
            var3 = 4;
        } else if (arg2 > 10000) {
            var3 = 3;
            class57.method409(0);
        } else if (arg2 > 5000) {
            var3 = 2;
            class310.method1948(1);
        } else {
            class261.method1727(true, (byte) -120);
            var3 = 1;
        }
        if (class712.field9959.field1270.method4293(113) != arg0) {
            class712.field9959.method735(arg0, class712.field9959.field1299, 98);
            class793.method4365((byte) -41, false, arg0);
        }
        class617.method3389(false);
        return var3;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IB)Lnca;")
    public final class785 method4096(int arg0, byte arg1) {
        field10212++;
        class239 var3 = this.field10211;
        class785 var4;
        synchronized (this.field10211) {
            if (arg1 != -59) {
                field10216 = 80;
            }
            var4 = (class785) this.field10211.method1541(-10, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class333 var5 = this.field10217;
        byte[] var6;
        synchronized (this.field10217) {
            var6 = this.field10217.method2095(arg0, 31, arg1 ^ 0xFFFFFFC4);
        }
        class785 var7 = new class785();
        if (var6 != null) {
            var7.method4342(new class376(var6), -1);
        }
        class239 var8 = this.field10211;
        synchronized (this.field10211) {
            this.field10211.method1544(true, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "()V")
    public static final void method4097() {
        class258.method1713(1, class315.field4541);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(II)Lrda;")
    public static final class692 method4098(int arg0, int arg1) {
        field10220++;
        if (arg0 > -103) {
            return null;
        }
        class692[] var2 = class504.method2927(false);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class692 var4 = var2[var3];
            if (var4.field9712 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(IZ)V")
    public final void method4099(int arg0, boolean arg1) {
        class239 var3 = this.field10211;
        synchronized (this.field10211) {
            this.field10211.method1546(arg0, (byte) -8);
        }
        if (arg1) {
            field10218++;
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
    public final void method4100(int arg0) {
        field10215++;
        class239 var2 = this.field10211;
        synchronized (this.field10211) {
            this.field10211.method1555((byte) -3);
        }
        if (arg0 != 29083) {
            this.method4099(-124, false);
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Z)V")
    public final void method4101(boolean arg0) {
        field10219++;
        class239 var2 = this.field10211;
        synchronized (this.field10211) {
            if (!arg0) {
                method4097();
            }
            this.field10211.method1552(-125);
        }
    }

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Lgia;ILaj;)V")
    public class740(class285 arg0, int arg1, class333 arg2) {
        this.field10217 = arg2;
        this.field10217.method2090(31, false);
    }
}
