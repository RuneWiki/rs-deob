import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class214 {

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field2806 = 0;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Z")
    public static boolean field2807 = false;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field2808 = 0;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
    public static final void method1264(int arg0, int arg1, int arg2) {
        field2809++;
        int var3 = 86 / ((arg2 - 38) / 56);
        class346 var4 = class299.method1976(0, 17, arg1);
        var4.method2209(255);
        var4.field4926 = arg0;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Luq;[Ltj;)V")
    public static final void method1265(class318 arg0, class687[] arg1) {
        if (class518.field7229) {
            int var2 = arg0.method626(arg1, (byte) -80);
            class441.field6132.method1532(var2, arg1);
        }
        if (class433.field6043 == class371.field5240) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class395) {
                var5 = ((class395) arg0).field5680;
                var6 = ((class395) arg0).field5673;
            } else {
                var5 = arg0.field4410 >> class371.field5241;
                var6 = arg0.field4418 >> class371.field5241;
            }
            class441.field6132.method1501(class550.field7649[0].method2172(arg0.field4410, -1, arg0.field4418), class391.method2456(var5, var6), class494.method2990(var5, var6), class200.method1213(var5, var6));
        }
        class3 var7 = arg0.method660(class441.field6132, -1);
        if (var7 == null) {
            return;
        }
        if (arg0.field4421) {
            class574[] var8 = var7.field18;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class574 var10 = var8[var9];
                if (var10.field7910) {
                    class483.method2944(var10.field7914 + var10.field7913, var10.field7914 + var10.field7912, var10.field7911 - var10.field7914, var10.field7909 - var10.field7914, -1);
                }
            }
        }
        if (var7.field22) {
            var7.field21 = arg0;
            if (class520.field7248) {
                class397 var11 = class269.field3931;
                synchronized (class269.field3931) {
                    class269.field3931.method2474(true, var7);
                    return;
                }
            }
            class269.field3931.method2474(true, var7);
            return;
        }
        class300.method1978(0, var7);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Luu;III)Lvo;")
    public static final class133 method1266(class237 arg0, int arg1, int arg2, int arg3) {
        field2805++;
        byte[] var4 = arg0.method1572(arg2, arg3, arg1);
        return var4 == null ? null : new class133(var4);
    }
}
