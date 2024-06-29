import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public abstract class class241 {

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public int field3517;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public int field3518;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "Z")
    public static boolean field3511 = false;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "Lch;")
    public static class151 field3513 = new class151("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "Z")
    public static boolean field3520 = false;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "[I")
    public static int[] field3521;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 12)
    public static final void method1674(int arg0) {
        if (arg0 != -22) {
            return;
        }
        field3515++;
        class402.field5519 = null;
        class325.field4525 = null;
        class243.field3529 = null;
        class76.field1131 = null;
        class382.field5243 = null;
        class372.field5119 = null;
        client.field875 = null;
        class55.field814 = null;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)I", line = 30)
    public static final int method1675(int arg0, int arg1) {
        field3514++;
        if (arg0 < 119) {
            return 53;
        }
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xF9) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)Z", line = 85)
    public static final boolean method1676(byte arg0) {
        if (arg0 < 73) {
            method1676((byte) 16);
        }
        field3510++;
        try {
            return class206.method1411(-116);
        } catch (IOException var4) {
            class480.method2836(-5517);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class34.field373 == null ? -1 : class34.field373.method854(20500)) + "," + (class368.field5073 == null ? -1 : class368.field5073.method854(20500)) + "," + (class490.field6916 == null ? -1 : class490.field6916.method854(20500)) + " - " + class126.field1718 + "," + (class279.field4012 + class262.field3781.field5811[0]) + "," + (class189.field2810 + class262.field3781.field5807[0]) + " - ";
            for (int var3 = 0; class126.field1718 > var3 && var3 < 50; var3++) {
                var2 = var2 + class46.field710.field2262[var3] + ",";
            }
            class83.method704((byte) 120, var5, var2);
            class370.method2263(3);
            return true;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIZZ)V", line = 116)
    public static final void method1677(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        field3519++;
        class22.field251 = 0L;
        int var5 = class448.method2708(0);
        if (arg0 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (!arg4) {
            method1676((byte) 49);
        }
        if (!class374.field5152.method340()) {
            arg3 = true;
        }
        class297.method1927(arg2, arg1, var5, -118, arg3, arg0);
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(II)V", line = 143)
    public static final void method1678(int arg0, int arg1) {
        field3512++;
        if (arg0 > -76) {
            field3520 = true;
        }
        class334 var2 = class352.method2172(arg1, 6, 16711935);
        var2.method2099(true);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V", line = 158)
    public static void method1679(byte arg0) {
        field3521 = null;
        field3513 = null;
        if (arg0 < 112) {
            field3516 = 21;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(II)V", line = 183)
    public class241(int arg0, int arg1) {
        this.field3517 = arg1;
        this.field3518 = arg0;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method578(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
    public abstract void method588(int arg0, int arg1);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILdh;)Ldh;")
    public abstract class183 method586(int arg0, int arg1, class183 arg2);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(II)I")
    public abstract int method590(int arg0, int arg1);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ldh;IIIIZ)Z")
    public abstract boolean method583(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lnq;[I)V")
    public abstract void method577(class104 arg0, int[] arg1);

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Ldh;IIIIZ)V")
    public abstract void method582(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V")
    public abstract void method576(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method587(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method579(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(Ldh;IIIIZ)V")
    public abstract void method589(class183 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "()V")
    public abstract void method580();

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(II)I")
    public abstract int method591(int arg0, int arg1);
}
