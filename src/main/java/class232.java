import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class232 extends class425 {

    @OriginalMember(owner = "client!an", name = "v", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field3429;

    @OriginalMember(owner = "client!an", name = "q", descriptor = "Ljf;")
    public static class28 field3424 = class535.method3144(false);

    @OriginalMember(owner = "client!an", name = "w", descriptor = "Z")
    public static boolean field3430 = true;

    @OriginalMember(owner = "client!an", name = "u", descriptor = "[F")
    public static float[] field3428 = new float[4];

    @OriginalMember(owner = "client!an", name = "r", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!an", name = "x", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!an", name = "s", descriptor = "[I")
    public static int[] field3426;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IZ[Lwca;IBI)V")
    public static final void method1512(int arg0, boolean arg1, class311[] arg2, int arg3, byte arg4, int arg5) {
        field3425++;
        if (arg4 != 72) {
            method1512(-92, true, null, -81, (byte) 120, -63);
        }
        for (int var6 = 0; var6 < arg2.length; var6++) {
            class311 var7 = arg2[var6];
            if (var7 != null && var7.field4551 == arg5) {
                class16.method76(-1117, var7, arg1, arg3, arg0);
                class157.method908(arg0, arg3, (byte) 94, var7);
                if ((var7.field4606 - var7.field4543) < var7.field4672) {
                    var7.field4672 = var7.field4606 - var7.field4543;
                }
                if ((var7.field4581 - var7.field4620) < var7.field4668) {
                    var7.field4668 = var7.field4581 - var7.field4620;
                }
                if (var7.field4672 < 0) {
                    var7.field4672 = 0;
                }
                if (var7.field4668 < 0) {
                    var7.field4668 = 0;
                }
                if (var7.field4655 == 0) {
                    class613.method3570(-26662, var7, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(I)V")
    public static void method1513(int arg0) {
        field3428 = null;
        field3426 = null;
        field3424 = null;
        if (arg0 >= -64) {
            field3428 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V")
    public static final void method1514(boolean arg0) {
        field3431++;
        class240.field3505.method2525(2);
        class42.field504 = null;
        class110.field1406 = 1;
        if (arg0) {
            method1514(true);
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)V")
    public final void method1515(byte arg0) {
        field3427++;
        if (arg0 == -99) {
            this.field3429.method3322();
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(I)V")
    public class232(int arg0) {
        this.field3429 = new NativeHeap(arg0);
    }
}
