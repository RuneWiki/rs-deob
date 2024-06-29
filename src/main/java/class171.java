import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public abstract class class171 {

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "[F")
    public float[] field2319 = new float[5000];

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public int field2318 = 0;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "[B")
    public byte[] field2323 = new byte[5000];

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public int field2324 = 0;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "[Ljava/lang/Object;")
    public Object[] field2326 = new Object[5000];

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
    public volatile int field2322 = 0;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    public volatile int field2325 = 0;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "Z")
    public static boolean field2317 = false;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIII)V", line = 26)
    public static final void method1089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2321++;
        int var6 = arg5 - arg2;
        int var7 = arg4 - arg0;
        if (var6 == 0) {
            if (var7 != 0) {
                class128.method794(arg4, arg0, arg1, 126, arg2);
            }
        } else if (var7 == 0) {
            class500.method3010(-128, arg2, arg5, arg0, arg1);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg0 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (class130.field1712 > arg5) {
                var10 = (class130.field1712 * var8 >> 12) + var9;
                var11 = class130.field1712;
            } else if (arg5 <= class401.field5755) {
                var10 = arg4;
                var11 = arg5;
            } else {
                var10 = (class401.field5755 * var8 >> 12) + var9;
                var11 = class401.field5755;
            }
            int var12;
            int var13;
            if (arg2 < class130.field1712) {
                var12 = class130.field1712;
                var13 = var9 + (class130.field1712 * var8 >> 12);
            } else if (class401.field5755 < arg2) {
                var12 = class401.field5755;
                var13 = (class401.field5755 * var8 >> 12) + var9;
            } else {
                var13 = arg0;
                var12 = arg2;
            }
            if (var13 < class483.field7334) {
                var13 = class483.field7334;
                var12 = (class483.field7334 - var9 << 12) / var8;
            } else if (class202.field3021 < var13) {
                var12 = (class202.field3021 - var9 << 12) / var8;
                var13 = class202.field3021;
            }
            if (var10 < class483.field7334) {
                var11 = (class483.field7334 - var9 << 12) / var8;
                var10 = class483.field7334;
            } else if (class202.field3021 < var10) {
                var11 = (class202.field3021 - var9 << 12) / var8;
                var10 = class202.field3021;
            }
            if (arg3 != 5000) {
                method1089(30, 46, -48, -25, -60, -87);
            }
            class314.method1940(var12, arg1, var11, (byte) 114, var13, var10);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V", line = 129)
    public static final void method1090(int arg0) {
        if (class94.field1170 != null) {
            class94.field1170.method1650(arg0 ^ 0xFFFFCA72);
        }
        if (arg0 != -13787) {
            method1089(-89, -30, -117, -108, -12, 99);
        }
        field2320++;
        if (class178.field2704 != null) {
            class178.field2704.method1650(arg0 ^ 0xFFFFCA5C);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(FIIZLsa;)V")
    public abstract void method938(float arg0, int arg1, int arg2, boolean arg3, class543 arg4);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BLsk;)V")
    public abstract void method942(byte arg0, class415 arg1);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
    public abstract void method936(byte arg0);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IZ)V")
    public abstract void method937(int arg0, boolean arg1);

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(BLsk;)V")
    public abstract void method941(byte arg0, class415 arg1);

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V")
    public abstract void method935(int arg0);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V")
    public abstract void method943(int arg0, int arg1);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lsk;B)V")
    public abstract void method940(class415 arg0, byte arg1);
}
