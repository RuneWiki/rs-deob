import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class166 {

    @OriginalMember(owner = "client!kaa", name = "f", descriptor = "Luf;")
    private class380 field2377 = new class380(64);

    @OriginalMember(owner = "client!kaa", name = "k", descriptor = "Luf;")
    public class380 field2382 = new class380(64);

    @OriginalMember(owner = "client!kaa", name = "i", descriptor = "Lga;")
    public class332 field2380;

    @OriginalMember(owner = "client!kaa", name = "e", descriptor = "Lga;")
    private class332 field2376;

    @OriginalMember(owner = "client!kaa", name = "l", descriptor = "Lsj;")
    public static class666 field2383 = new class666();

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!kaa", name = "d", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!kaa", name = "g", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!kaa", name = "h", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!kaa", name = "j", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!kaa", name = "m", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZ)V")
    public static final void method1012(int arg0, boolean arg1) {
        field2372++;
        if (arg0 != 34) {
            field2383 = null;
        }
        class480.method2761(arg1, class164.field2349, (byte) -92, class399.field5301, class60.field750);
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IB)Lnca;")
    public final class55 method1013(int arg0, byte arg1) {
        field2378++;
        class380 var3 = this.field2377;
        class55 var4;
        synchronized (this.field2377) {
            var4 = (class55) this.field2377.method2176(-128, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class332 var5 = this.field2376;
        byte[] var6;
        synchronized (this.field2376) {
            var6 = this.field2376.method1938(arg0, 34, -17);
        }
        class55 var7 = new class55();
        var7.field714 = this;
        if (var6 != null) {
            var7.method327(new class157(var6), false);
        }
        class380 var8 = this.field2377;
        synchronized (this.field2377) {
            this.field2377.method2174(var7, (long) arg0, (byte) 39);
        }
        return arg1 <= 104 ? null : var7;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)V")
    public final void method1014(int arg0) {
        field2379++;
        class380 var2 = this.field2377;
        synchronized (this.field2377) {
            this.field2377.method2168((byte) -116);
        }
        if (arg0 != 64) {
            method1017((byte) -52);
        }
        class380 var3 = this.field2382;
        synchronized (this.field2382) {
            this.field2382.method2168((byte) -127);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(BII)V")
    public final void method1015(byte arg0, int arg1, int arg2) {
        this.field2377 = new class380(arg1);
        field2374++;
        this.field2382 = new class380(arg2);
        if (arg0 != -72) {
            field2383 = null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)V")
    public final void method1016(int arg0) {
        class380 var2 = this.field2377;
        synchronized (this.field2377) {
            this.field2377.method2172(-15112);
        }
        field2375++;
        if (arg0 != 34) {
            this.field2382 = null;
        }
        class380 var3 = this.field2382;
        synchronized (this.field2382) {
            this.field2382.method2172(-15112);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)V")
    public static final void method1017(byte arg0) {
        if (arg0 >= -9) {
            method1018(117);
        }
        class16.field217.method301((byte) 118);
        field2381++;
        class574.field7844 = 1;
        class285.field3762 = null;
    }

    @OriginalMember(owner = "client!kaa", name = "c", descriptor = "(I)V")
    public static void method1018(int arg0) {
        if (arg0 < 81) {
            field2383 = null;
        }
        field2383 = null;
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(II)V")
    public final void method1019(int arg0, int arg1) {
        field2373++;
        int var3 = 82 % ((40 - arg0) / 57);
        class380 var4 = this.field2377;
        synchronized (this.field2377) {
            this.field2377.method2179(false, arg1);
        }
        class380 var5 = this.field2382;
        synchronized (this.field2382) {
            this.field2382.method2179(false, arg1);
        }
    }

    @OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/io/File;ZI)[B")
    public static final byte[] method1020(File arg0, boolean arg1, int arg2) {
        field2384++;
        try {
            byte[] var3 = new byte[arg2];
            if (arg1) {
                method1018(-49);
            }
            class387.method2219(arg2, arg0, true, var3);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lnq;ILga;Lga;)V")
    public class166(class650 arg0, int arg1, class332 arg2, class332 arg3) {
        this.field2380 = arg3;
        this.field2376 = arg2;
        this.field2376.method1939(0, 34);
    }
}
