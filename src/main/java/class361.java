import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class361 {

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "[I")
    public static int[] field5201 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public int field5199;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public int field5205;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public int field5206;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 4)
    public static void method2346(byte arg0) {
        int var1 = 31 % ((arg0 - 14) / 60);
        field5201 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 18)
    public static final void method2347(int arg0) {
        field5204++;
        class425.field6069.method98(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILlf;)V", line = 33)
    public static final void method2348(int arg0, class130 arg1) {
        for (int var2 = 0; var2 < class173.field2450; var2++) {
            int var3 = arg1.method854(3944);
            int var4 = arg1.method798(false);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class440.field6295[var3] != null) {
                class440.field6295[var3].field2392 = var4;
            }
        }
        if (arg0 >= -34) {
            field5201 = null;
        }
        field5197++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIII)V", line = 64)
    public static final void method2349(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class426.field6084 == 1) {
            class3.field50[class222.field3178 / 100].method1772(class209.field2989 - 8, class64.field886 - 8);
        }
        field5200++;
        if (class426.field6084 == 2) {
            class3.field50[(class222.field3178 / 100) + 4].method1772(class209.field2989 - 8, class64.field886 + -8);
        }
        class282.method1931(true);
        if (arg4 != 10519) {
            field5201 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BIIIII)Z", line = 86)
    public static final boolean method2350(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5203++;
        if (arg0 != 24) {
            method2348(44, (class130) null);
        }
        for (int var6 = arg1; var6 <= arg5; var6++) {
            for (int var7 = arg3; var7 <= arg4; var7++) {
                if (class377.field5364[var6][var7] == arg2 && class425.field6079[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Llf;B)V", line = 121)
    public final void method2351(class130 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method837(true);
            if (var3 == 0) {
                field5202++;
                int var4 = 112 / ((arg1 - 35) / 60);
                return;
            }
            this.method2352(0, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILlf;)V", line = 142)
    private final void method2352(int arg0, int arg1, class130 arg2) {
        if (arg1 == 1) {
            this.field5206 = arg2.method798(false);
            this.field5199 = arg2.method837(true);
            this.field5205 = arg2.method837(true);
        }
        if (arg0 != 0) {
            method2346((byte) 35);
        }
        field5198++;
    }
}
