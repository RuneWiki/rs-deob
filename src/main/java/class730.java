import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class730 {

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Ljr;")
    private class112 field9877 = new class112(64);

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "Ljr;")
    public class112 field9882 = new class112(2);

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "Lin;")
    private class91 field9880;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Lin;")
    public class91 field9872;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "Lmu;")
    public static class303 field9875 = new class303(0, -1);

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "Luh;")
    public static class168 field9879 = new class168();

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field9870;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field9871;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field9873;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field9874;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field9876;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field9878;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field9881;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public final void method4034(int arg0) {
        class112 var2 = this.field9877;
        synchronized (this.field9877) {
            this.field9877.method996(-76);
        }
        field9870++;
        class112 var3 = this.field9882;
        synchronized (this.field9882) {
            this.field9882.method996(-110);
        }
        if (arg0 != 1) {
            method4037(null, -124, null);
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public static void method4035(int arg0) {
        field9875 = null;
        if (arg0 == -21165) {
            field9879 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)V")
    public final void method4036(int arg0, int arg1) {
        field9881++;
        class112 var3 = this.field9877;
        synchronized (this.field9877) {
            this.field9877.method987(2, arg0);
        }
        class112 var4 = this.field9882;
        synchronized (this.field9882) {
            if (arg1 != 8) {
                this.field9872 = null;
            }
            this.field9882.method987(arg1 - 6, arg0);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/io/File;ILjava/lang/String;)V")
    public static final void method4037(File arg0, int arg1, String arg2) {
        field9873++;
        class197.field2895.put(arg2, arg0);
        if (arg1 != 64) {
            field9875 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)Lsda;")
    public final class260 method4038(byte arg0, int arg1) {
        field9874++;
        class112 var3 = this.field9877;
        class260 var4;
        synchronized (this.field9877) {
            var4 = (class260) this.field9877.method992((long) arg1, arg0 ^ 0xFFFFFFE2);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != -104) {
            this.field9882 = null;
        }
        class91 var5 = this.field9880;
        byte[] var6;
        synchronized (this.field9880) {
            var6 = this.field9880.method863(-1860, 33, arg1);
        }
        class260 var7 = new class260();
        var7.field3726 = this;
        if (var6 != null) {
            var7.method1752(new class215(var6), false);
        }
        class112 var8 = this.field9877;
        synchronized (this.field9877) {
            this.field9877.method991(var7, (long) arg1, (byte) -116);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V")
    public static final void method4039(int arg0, int arg1) {
        field9878++;
        for (class362 var2 = class69.field1281.method1469(arg0 ^ arg0); var2 != null; var2 = class69.field1281.method1467(0)) {
            if ((var2.field5204 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method2314((byte) 119);
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIII)V")
    public static final void method4040(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9871++;
        int var5 = class327.field4548;
        if (arg3 != 8) {
            method4035(-59);
        }
        int var6 = class675.field9197;
        if (class241.field3529) {
            var5 += class146.method1163((byte) -126);
            var6 += class313.method2035(false);
        }
        if (class282.field3944 == 1) {
            class496 var7 = class527.field7300[class362.field5205 / 100];
            var7.method2925(var5 - 8, var6 + -8);
            class546.method3152(-5590, var5 - 8, (var5 - -var7.method1618()) + -8, var6 - 8, var7.method1614() + -8 + var6);
        }
        if (class282.field3944 == 2) {
            class496 var8 = class527.field7300[class362.field5205 / 100 + 4];
            var8.method2925(var5 - 8, var6 + -8);
            class546.method3152(-5590, var5 - 8, var8.method1618() + var5 + -8, var6 - 8, var8.method1614() + -8 + var6);
        }
        class591.method3372((byte) 80);
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
    public final void method4041(int arg0) {
        field9876++;
        class112 var2 = this.field9877;
        synchronized (this.field9877) {
            this.field9877.method999(0);
        }
        class112 var3 = this.field9882;
        synchronized (this.field9882) {
            this.field9882.method999(0);
            if (arg0 != -8) {
                field9875 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lsj;ILin;Lin;)V")
    public class730(class460 arg0, int arg1, class91 arg2, class91 arg3) {
        this.field9880 = arg2;
        this.field9872 = arg3;
        this.field9880.method860(0, 33);
    }
}
