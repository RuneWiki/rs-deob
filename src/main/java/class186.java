import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class186 {

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public int field3661;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public int field3663;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public int field3656;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public int field3659;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3662 = 2;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Ltd;")
    public static class176 field3655 = new class176(100);

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Z")
    public static boolean field3665 = false;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "[Lnb;")
    public static class120[] field3658;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)V")
    public static final void method1191(int arg0, int arg1, int arg2) {
        if (arg2 != 13865) {
            field3655 = null;
        }
        class32 var3 = class96.method607((byte) -23, arg1);
        field3657++;
        int var4 = var3.field592;
        int var5 = var3.field587;
        int var6 = var3.field586;
        int var7 = class175.field3483[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class30.field569[var4] = class33.method189(class7.method38(var8, arg0 << var5), class7.method38(class30.field569[var4], ~var8));
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBII)Z")
    public static final boolean method1192(int arg0, byte arg1, int arg2, int arg3) {
        field3664++;
        int var4 = arg2 >> 14 & 0x7FFF;
        if (arg1 < 62) {
            method1194(6);
        }
        int var5 = class137.field2842.method1125(class93.field1839, arg0, arg3, arg2);
        if (var5 == -1) {
            return false;
        }
        int var6 = var5 & 0x1F;
        int var7 = var5 >> 6 & 0x3;
        if (var6 == 10 || var6 == 11 || var6 == 22) {
            class23 var8 = class92.method592(var4, (byte) 58);
            int var9;
            int var10;
            if (var7 == 0 || var7 == 2) {
                var9 = var8.field424;
                var10 = var8.field423;
            } else {
                var9 = var8.field423;
                var10 = var8.field424;
            }
            int var11 = var8.field404;
            if (var7 != 0) {
                var11 = (var11 >> 4 - var7) + (var11 << var7 & 0xF);
            }
            class104.method642(var9, -101, class67.field1348.field2335[0], arg3, arg0, var11, class67.field1348.field2357[0], 0, true, 2, 0, var10);
        } else {
            class104.method642(0, -101, class67.field1348.field2335[0], arg3, arg0, 0, class67.field1348.field2357[0], var7, true, 2, var6 + 1, 0);
        }
        class52.field1050 = class41.field814;
        class99.field1901 = class187.field3673;
        class13.field201 = 0;
        class148.field3024 = 2;
        return true;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public static void method1193(byte arg0) {
        field3658 = null;
        field3655 = null;
        int var1 = -114 % ((arg0 - 70) / 33);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static final void method1194(int arg0) {
        if (arg0 > -108) {
            return;
        }
        field3660++;
        int var1 = class125.field2474;
        int var2 = class103.field1963;
        int var3 = class30.field574;
        int var4 = class158.field3200;
        int var5 = 6116423;
        class168.method1046(var2, var1, var4, var3, var5);
        class168.method1046(var2 + 1, var1 + 1, var4 - 2, 16, 0);
        class168.method1041(var2 + 1, var1 - -18, var4 - 2, var3 + -19, 0);
        class118.field2294.method954(class171.field3418, var2 + 3, var1 + 14, var5, -1);
        int var6 = class105.field1998;
        int var7 = class185.field3654;
        for (int var8 = 0; var8 < class41.field799; var8++) {
            int var9 = 16777215;
            int var10 = (class41.field799 - var8 - 1) * 15 + var1 + 31;
            if (var2 < var7 && var2 + var4 > var7 && var6 > var10 - 13 && var6 < var10 + 3) {
                var9 = 16776960;
            }
            class118.field2294.method954(class170.method1080(-1, var8), var2 + 3, var10, var9, 0);
        }
        class114.method704(class30.field574, class103.field1963, class125.field2474, class158.field3200, 0);
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class186() {
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lue;)V")
    public class186(class186 arg0) {
        this.field3661 = arg0.field3661;
        this.field3663 = arg0.field3663;
        this.field3656 = arg0.field3656;
        this.field3659 = arg0.field3659;
    }
}
