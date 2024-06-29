import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class151 {

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "Z")
    public static boolean field2086 = false;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field2085 = 0;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static final void method1063(int arg0) {
        field2087++;
        class440.method2498(65280);
        if (arg0 != -9732) {
            field2085 = 7;
        }
        class676.field9448 = false;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B[[[Lds;)V")
    public static final void method1064(byte arg0, class14[][][] arg1) {
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class14[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class14 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field279 instanceof class457) {
                            ((class457) var6.field279).method746((byte) 113);
                        }
                        if (var6.field277 instanceof class457) {
                            ((class457) var6.field277).method746((byte) 106);
                        }
                        if (var6.field290 instanceof class457) {
                            ((class457) var6.field290).method746((byte) 93);
                        }
                        if (var6.field278 instanceof class457) {
                            ((class457) var6.field278).method746((byte) 119);
                        }
                        if (var6.field283 instanceof class457) {
                            ((class457) var6.field283).method746((byte) 108);
                        }
                        for (class621 var7 = var6.field289; var7 != null; var7 = var7.field8560) {
                            class556 var8 = var7.field8559;
                            if (var8 instanceof class457) {
                                ((class457) var8).method746((byte) 87);
                            }
                        }
                    }
                }
            }
        }
        field2083++;
        if (arg0 < 6) {
            field2086 = true;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)V")
    public static final void method1065(int arg0, int arg1, int arg2) {
        class695.field9673 = arg1;
        field2082++;
        class640.field8891 = arg2;
        if (arg0 != 1384336513) {
            return;
        }
        if (class259.field3281 == 0) {
            class300.field3937 = class207.field2746 * 2 + class695.field9673;
            class631.field8709 = class178.field2492 * 2 + class640.field8891;
        } else if (class259.field3281 == 1) {
            class405.field5126 = class640.field8891 / class543.field7592 + class208.field2762 + 2;
            class15.field303 = class695.field9673 / class409.field5194 + class463.field6226 + 2;
            class300.field3937 = class409.field5194 * class15.field303;
            class631.field8709 = class543.field7592 * class405.field5126;
            class207.field2746 = class300.field3937 - class695.field9673 >> 1;
            class178.field2492 = class631.field8709 - class640.field8891 >> 1;
        } else if (class259.field3281 == 2) {
            class300.field3937 = class695.field9673;
            class631.field8709 = class640.field8891;
            return;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BII)Z")
    public static final boolean method1066(byte arg0, int arg1, int arg2) {
        if (arg0 > -97) {
            return false;
        } else {
            field2088++;
            return class184.method1245(arg1, 0, arg2) & class560.method3240(arg2, arg1, 75);
        }
    }

    @OriginalMember(owner = "client!mg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2081++;
        throw new IllegalStateException();
    }
}
