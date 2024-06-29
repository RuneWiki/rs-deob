import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class437 extends class535 {

    @OriginalMember(owner = "client!cu", name = "C", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!cu", name = "E", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!cu", name = "F", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!cu", name = "G", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!cu", name = "H", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(IIIIIF)V")
    public class437(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIII)V")
    public final void method93(int arg0, int arg1, int arg2, int arg3) {
        super.field7919 = arg1;
        ++field6429;
        super.field7912 = arg2;
        if (arg0 == -1) {
            super.field7928 = arg3;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IF)V")
    public final void method94(int arg0, float arg1) {
        super.field7927 = arg1;
        if (arg0 <= -8) {
            ++field6431;
        }
    }

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "(I)V")
    public static final void method2680(int arg0) {
        ++field6430;
        if (class578.field8523 < 1024.0F) {
            class578.field8523 = 1024.0F;
        }
        if (class578.field8523 > 3072.0F) {
            class578.field8523 = 3072.0F;
        }
        while (class591.field8752 >= 16384.0F) {
            class591.field8752 -= 16384.0F;
        }
        while (class591.field8752 < 0.0F) {
            class591.field8752 += 16384.0F;
        }
        int var1 = class541.field8103 >> 7;
        if (arg0 != 19950) {
            field6433 = -52;
        }
        int var2 = class300.field4403 >> 7;
        int var3 = class226.method1477(class355.field5157, true, class541.field8103, class300.field4403);
        int var4 = 0;
        if (~var1 < -4 && var2 > 3 && class35.field399 - 4 > var1 && var2 < class382.field5586 + -4) {
            for (int var5 = var1 + -4; var1 + 4 >= var5; ++var5) {
                for (int var6 = var2 + -4; var2 + 4 >= var6; ++var6) {
                    int var7 = class355.field5157;
                    if (var7 < 3 && class300.method1855(var5, var6, 22753)) {
                        ++var7;
                    }
                    int var8 = 0;
                    if (class288.field4249.field9136 != null && class288.field4249.field9136[var7] != null) {
                        var8 = (class288.field4249.field9136[var7][var5][var6] & 255) * 8;
                    }
                    int var9 = var3 - -var8 - class235.field3455[var7].method1319(var5, var6);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = (var4 >> 0) * 1536;
        if (~var10 < -786433) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (~var10 >= ~class261.field3844) {
            if (~var10 > ~class261.field3844) {
                class261.field3844 += (-class261.field3844 + var10) / 80;
                return;
            }
        } else {
            class261.field3844 += (var10 - class261.field3844) / 24;
        }
    }
}
