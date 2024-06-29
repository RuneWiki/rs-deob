import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class155 implements Runnable {

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "[Lkl;")
    public volatile class55[] field2016 = new class55[2];

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Z")
    public volatile boolean field2022 = false;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Z")
    public volatile boolean field2020 = false;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Z")
    public static boolean field2015 = false;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Ldq;")
    public class500 field2019;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBZI)I")
    public static final int method1001(int arg0, byte arg1, boolean arg2, int arg3) {
        field2017++;
        class94 var4 = class402.method2483(arg2, (byte) -107, arg3);
        if (var4 == null) {
            return -1;
        } else {
            if (arg1 != 56) {
                method1001(-45, (byte) -65, false, -96);
            }
            return arg0 >= 0 && arg0 < var4.field1373.length ? var4.field1373[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIB)V")
    public static final void method1002(int arg0, int arg1, byte arg2) {
        field2021++;
        class177 var3 = class344.method2229(12, arg1, (byte) 113);
        if (arg2 > 73) {
            var3.method1191(-38);
            var3.field2372 = arg0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "run", descriptor = "()V")
    public final void run() {
        field2018++;
        this.field2020 = true;
        try {
            while (!this.field2022) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class55 var2 = this.field2016[var1];
                    if (var2 != null) {
                        var2.method407((byte) -116);
                    }
                }
                class388.method2433(10L, -110);
                class4.method11(null, -100, this.field2019);
            }
        } catch (Exception var9) {
            class395.method2457(null, var9, 1);
        } finally {
            Object var6 = null;
            this.field2020 = false;
        }
    }
}
