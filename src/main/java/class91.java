import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class91 {

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Lmga;")
    private class666 field1379 = new class666(256);

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Lbi;")
    private class449 field1380;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field1382 = new Hashtable();

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "[I")
    public static int[] field1385;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "[I")
    public static int[] field1386;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V")
    public final void method721(boolean arg0, int arg1) {
        class666 var3 = this.field1379;
        synchronized (this.field1379) {
            this.field1379.method3740((byte) 60, arg1);
            if (arg0) {
                method724((byte) -100);
            }
        }
        field1384++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)Lwba;")
    public final class46 method722(int arg0, int arg1) {
        field1381++;
        class666 var3 = this.field1379;
        class46 var4;
        synchronized (this.field1379) {
            var4 = (class46) this.field1379.method3750((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field1380;
        byte[] var6;
        synchronized (this.field1380) {
            var6 = this.field1380.method2537(false, arg1, arg0);
        }
        class46 var7 = new class46();
        if (var6 != null) {
            var7.method317(new class335(var6), 68);
        }
        class666 var8 = this.field1379;
        synchronized (this.field1379) {
            this.field1379.method3745(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public final void method723(int arg0) {
        class666 var2 = this.field1379;
        synchronized (this.field1379) {
            this.field1379.method3748(6);
        }
        field1383++;
        if (arg0 < 29) {
            this.method722(10, -117);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static void method724(byte arg0) {
        if (arg0 != 16) {
            field1382 = null;
        }
        field1382 = null;
        field1385 = null;
        field1386 = null;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
    public final void method725(int arg0) {
        class666 var2 = this.field1379;
        synchronized (this.field1379) {
            this.field1379.method3739(0);
        }
        int var3 = 50 / ((16 - arg0) / 61);
        field1378++;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lpca;ILbi;)V")
    public class91(class671 arg0, int arg1, class449 arg2) {
        this.field1380 = arg2;
        this.field1380.method2527(0, 26);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
    public static final void method726(byte arg0) {
        field1377++;
        if (class218.field3098 == null) {
            class608 var1 = new class608();
            byte[] var2 = var1.method3338(16, 128, 16384, 128);
            class218.field3098 = class230.method1443(var2, (byte) -106, false);
        }
        if (class586.field7774 == null) {
            class168 var3 = new class168();
            byte[] var4 = var3.method1147(128, 128, -26694, 16);
            class586.field7774 = class230.method1443(var4, (byte) -106, false);
        }
        if (arg0 >= -107) {
            method724((byte) 87);
        }
    }
}
