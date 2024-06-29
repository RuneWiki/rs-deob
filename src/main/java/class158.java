import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class class158 extends class213 {

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "I")
    public static int field2253 = -1;

    @OriginalMember(owner = "client!uj", name = "F", descriptor = "[J")
    public static long[] field2251 = new long[200];

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "Z")
    public static boolean field2257 = false;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public int field2244;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
    public int field2246;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
    public int field2248;

    @OriginalMember(owner = "client!uj", name = "D", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!uj", name = "E", descriptor = "I")
    public int field2250;

    @OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
    public int field2252;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
    public int field2255;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)V", line = 6)
    public static void method1214(int arg0) {
        field2251 = null;
        if (arg0 != 16) {
            method1214(52);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBIII)V", line = 32)
    public final void method1215(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field2244 << 3;
        field2249++;
        int var7 = (arg3 << 4) + (var6 & 0xF);
        int var8 = this.field2255 << 3;
        int var9 = (arg0 << 4) + (var8 & 0xF);
        if (arg1 != -99) {
            this.field2244 = -99;
        }
        this.method79(var6, var8, var7, var9, arg2, arg4);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZIIII)V", line = 66)
    public static final void method1216(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2256++;
        boolean var5 = false;
        class159.field2264 = 0L;
        if (arg1 >= -59) {
            method1214(-101);
        }
        int var6 = class33.method213(18);
        if (var6 > 0 == arg2 <= 0) {
            var5 = true;
        }
        if (arg2 == 3 || var6 == 3) {
            arg0 = true;
        }
        if (class69.field882.startsWith("mac") && arg2 > 0) {
            arg0 = true;
        }
        if (arg0 && arg2 > 0) {
            var5 = true;
        }
        class145.method1132((byte) 49, arg3, var6, arg0, arg4, arg2, var5);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
    public abstract void method86(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V")
    public abstract void method85(int arg0, int arg1);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIII)V")
    public abstract void method70(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(IIIIII)V")
    public abstract void method79(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)V")
    public abstract void method84(int arg0, int arg1);

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(II)V")
    public abstract void method87(int arg0, int arg1);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)V")
    public abstract void method68(int arg0, int arg1, int arg2);
}
