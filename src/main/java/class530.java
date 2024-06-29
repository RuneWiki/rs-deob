import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class530 {

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "Z")
    public boolean field7862;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "Ljava/util/Random;")
    public static Random field7864 = new Random();

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "[J")
    public static long[] field7867 = new long[32];

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field7863;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field7865;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public static int field7868;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "Ltq;")
    public class90 field7869;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "Ltq;")
    public class90 field7871;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "Z")
    public boolean field7866;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
    public static final void method3125(byte arg0) {
        field7863++;
        class87.field1103 = null;
        class30.field272 = false;
        if (arg0 != 28) {
            field7867 = null;
        }
        class539.method3164(arg0 ^ 0xFFFFFF94);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)Z")
    public final boolean method3126(int arg0) {
        if (arg0 == 0) {
            field7870++;
            return this.field7866 && !this.field7862;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)V")
    public final void method3127(byte arg0) {
        field7865++;
        if (arg0 <= -16) {
            if (this.field7869 != null) {
                this.field7869.method409(false);
            }
            this.field7866 = false;
        }
    }

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "(B)V")
    public static void method3128(byte arg0) {
        field7864 = null;
        field7867 = null;
        if (arg0 != 79) {
            field7864 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZZIIIII)V")
    public static final void method3129(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7868++;
        if (arg6 < arg5) {
            int var7 = (arg5 + arg6) / 2;
            int var8 = arg6;
            class418 var9 = class626.field9173[var7];
            class626.field9173[var7] = class626.field9173[arg5];
            class626.field9173[arg5] = var9;
            for (int var10 = arg6; var10 < arg5; var10++) {
                if (class202.method1307(arg1, arg0, arg2, var9, (byte) 125, class626.field9173[var10], arg3) <= 0) {
                    class418 var11 = class626.field9173[var10];
                    class626.field9173[var10] = class626.field9173[var8];
                    class626.field9173[var8++] = var11;
                }
            }
            class626.field9173[arg5] = class626.field9173[var8];
            class626.field9173[var8] = var9;
            method3129(arg0, arg1, arg2, arg3, 32, var8 - 1, arg6);
            method3129(arg0, arg1, arg2, arg3, 32, arg5, var8 + 1);
        }
        if (arg4 != 32) {
            method3128((byte) 76);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lqa;)V")
    public static final void method3130(class167 arg0) {
        for (int var1 = class386.field5658; var1 < class487.field7383; var1++) {
            for (int var2 = 0; var2 < class331.field4909; var2++) {
                for (int var3 = 0; var3 < class366.field5271; var3++) {
                    class415 var4 = class526.field7777[var1][var2][var3];
                    if (var4 != null) {
                        class578 var5 = var4.field5987;
                        class578 var6 = var4.field5978;
                        if (var5 != null && var5.method167(true)) {
                            class274.method1730(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method167(true)) {
                                class274.method1730(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method160(0, arg0, -4, 0, false, var5, 0);
                                var6.method165((byte) -33);
                            }
                            var5.method165((byte) -33);
                        }
                        for (class639 var7 = var4.field5981; var7 != null; var7 = var7.field9291) {
                            class237 var9 = var7.field9288;
                            if (var9 != null && var9.method167(true)) {
                                class274.method1730(arg0, var9, var1, var2, var3, var9.field3459 + 1 - var9.field3469, var9.field3462 - var9.field3472 + 1);
                                var9.method165((byte) -33);
                            }
                        }
                        class33 var8 = var4.field5976;
                        if (var8 != null && var8.method167(true)) {
                            class119.method729(arg0, var8, var1, var2, var3);
                            var8.method165((byte) -33);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(Z)V")
    public class530(boolean arg0) {
        this.field7862 = arg0;
    }
}
