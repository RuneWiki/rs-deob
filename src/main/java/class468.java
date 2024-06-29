import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class468 {

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "J")
    private long field6821;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    private int field6808;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Lri;")
    public static class342 field6809 = new class342();

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "Z")
    public static volatile boolean field6816 = true;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field6818 = 0;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "[I")
    public static int[] field6817 = new int[2];

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field6811;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "I")
    public static int field6812;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "I")
    public static int field6813;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field6814;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)I", line = 3)
    private final int method2860(int arg0, int arg1) {
        field6811++;
        if (arg1 != -16394) {
            method2861(null, null, 43);
        }
        return (int) (this.field6821 >> class531.field7640 * arg0) & 0xF;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;I)V", line = 14)
    public static final void method2861(File arg0, String arg1, int arg2) {
        class602.field8515.put(arg1, arg0);
        if (arg2 != -11195) {
            method2865((byte) 70, null, null);
        }
        field6813++;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V", line = 31)
    public static void method2862(byte arg0) {
        field6809 = null;
        if (arg0 != 35) {
            field6816 = true;
        }
        field6817 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)Lpd;", line = 42)
    public final class531 method2863(byte arg0, int arg1) {
        if (arg0 > -115) {
            method2861(null, null, -81);
        }
        field6810++;
        return class531.method3142(this.method2860(arg1, -16394), -109);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)I", line = 53)
    public final int method2864(int arg0) {
        if (arg0 <= 31) {
            method2865((byte) -127, null, null);
        }
        field6820++;
        return this.field6808;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLla;Lha;)V", line = 64)
    public static final void method2865(byte arg0, class422 arg1, class544 arg2) {
        field6819++;
        class726[] var3 = class726.method4006(arg1, class141.field2214, 0);
        class70.field1088 = new class34[var3.length];
        int var4 = 0;
        if (arg0 != 46) {
            field6817 = null;
        }
        while (var3.length > var4) {
            class70.field1088[var4] = arg2.method310(var3[var4], true);
            var4++;
        }
        class726[] var5 = class726.method4006(arg1, class688.field9781, 0);
        class460.field6671 = new class34[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class460.field6671[var6] = arg2.method310(var5[var6], true);
        }
        class726[] var7 = class726.method4006(arg1, class562.field7962, 0);
        class140.field2197 = new class34[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class140.field2197[var8] = arg2.method310(var7[var8], true);
        }
        class726[] var9 = class726.method4006(arg1, class378.field5679, 0);
        class567.field8049 = new class34[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class567.field8049[var10] = arg2.method310(var9[var10], true);
        }
        class726[] var11 = class726.method4006(arg1, class544.field7768, 0);
        class577.field8171 = new class34[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class577.field8171[var12] = arg2.method310(var11[var12], true);
        }
        class726[] var13 = class726.method4006(arg1, class685.field9685, 0);
        class466.field6800 = new class34[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class466.field6800[var14] = arg2.method310(var13[var14], true);
        }
        class726[] var15 = class726.method4006(arg1, class14.field152, 0);
        class611.field8619 = new class34[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class611.field8619[var16] = arg2.method310(var15[var16], true);
        }
        class726[] var17 = class726.method4006(arg1, class37.field367, 0);
        class580.field8208 = new class34[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class580.field8208[var18] = arg2.method310(var17[var18], true);
        }
        class726[] var19 = class726.method4006(arg1, class617.field8702, 0);
        class683.field9660 = new class34[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class683.field9660[var20] = arg2.method310(var19[var20], true);
        }
        class726[] var21 = class726.method4006(arg1, class369.field5618, 0);
        class3.field16 = new class34[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class3.field16[var22] = arg2.method310(var21[var22], true);
        }
        class726[] var23 = class726.method4006(arg1, class701.field9909, 0);
        class182.field3076 = new class34[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class182.field3076[var24] = arg2.method310(var23[var24], true);
        }
        class726[] var25 = class726.method4006(arg1, class631.field8866, 0);
        class438.field6393 = new class34[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class438.field6393[var26] = arg2.method310(var25[var26], true);
        }
        class548.field7818 = arg2.method310(class726.method4002(arg1, class551.field7858, 0), true);
        class193.field3341 = arg2.method310(class726.method4002(arg1, class451.field6565, 0), true);
        class726[] var27 = class726.method4006(arg1, class325.field4805, 0);
        class315.field4732 = new class34[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class315.field4732[var28] = arg2.method310(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lpd;B)V", line = 196)
    private final void method2866(class531 arg0, byte arg1) {
        field6815++;
        if (arg1 >= -43) {
            method2865((byte) -18, null, null);
        }
        this.field6821 |= (arg0.field7627 << class531.field7640 * this.field6808++);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)I", line = 207)
    public static final int method2867(int arg0) {
        int var1 = -4 % ((12 - arg0) / 42);
        field6812++;
        return class643.method3632((byte) -120, false);
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(BI)I", line = 217)
    public static final int method2868(byte arg0, int arg1) {
        field6814++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg1 == 6410 || arg1 == 34847) {
            return 6410;
        } else {
            if (arg0 != -2) {
                method2867(87);
            }
            if (arg1 != 6402) {
                throw new IllegalArgumentException("");
            }
            return 6402;
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lpd;)V", line = 270)
    public class468(class531 arg0) {
        this.field6821 = arg0.field7627;
        this.field6808 = 1;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "([Lpd;)V", line = 278)
    public class468(class531[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method2866(arg0[var2], (byte) -60);
        }
    }
}
