import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class285 extends class172 {

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public int field4417 = -1;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    public int field4431 = 0;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "Z")
    public static boolean field4421 = false;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "F")
    public static float field4428;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public int field4416;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public int field4420;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
    public int field4422;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public int field4423;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public int field4424;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public int field4425;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    public int field4429;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    public int field4430;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    public int field4433;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V", line = 7)
    public static final void method2067(int arg0) {
        field4426++;
        if (!class240.field3737 || class140.field2333) {
            return;
        }
        class329[][][] var1 = class170.field2689;
        if (arg0 > -67) {
            method2067(-77);
        }
        for (int var2 = 0; var2 < var1.length; var2++) {
            class329[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class329 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field5062 != null && var6.field5062.field714 instanceof class56) {
                            class56 var7 = (class56) var6.field5062.field714;
                            if ((Long.MIN_VALUE & var6.field5062.field701) == 0L) {
                                var7.method544(false, true, true, true, false, true, true);
                            } else {
                                var7.method544(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field5065 != null) {
                            if (var6.field5065.field4319 instanceof class56) {
                                class56 var8 = (class56) var6.field5065.field4319;
                                if ((Long.MIN_VALUE & var6.field5065.field4325) == 0L) {
                                    var8.method544(false, true, true, true, false, true, true);
                                } else {
                                    var8.method544(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field5065.field4317 instanceof class56) {
                                class56 var9 = (class56) var6.field5065.field4317;
                                if ((Long.MIN_VALUE & var6.field5065.field4325) == 0L) {
                                    var9.method544(false, true, true, true, false, true, true);
                                } else {
                                    var9.method544(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field5064 != null) {
                            if (var6.field5064.field3121 instanceof class56) {
                                class56 var10 = (class56) var6.field5064.field3121;
                                if ((Long.MIN_VALUE & var6.field5064.field3111) == 0L) {
                                    var10.method544(false, true, true, true, false, true, true);
                                } else {
                                    var10.method544(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field5064.field3116 instanceof class56) {
                                class56 var11 = (class56) var6.field5064.field3116;
                                if ((var6.field5064.field3111 & Long.MIN_VALUE) == 0L) {
                                    var11.method544(false, true, true, true, false, true, true);
                                } else {
                                    var11.method544(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field5063; var12++) {
                            if (var6.field5070[var12].field4605 instanceof class56) {
                                class56 var13 = (class56) var6.field5070[var12].field4605;
                                if ((Long.MIN_VALUE & var6.field5070[var12].field4611) == 0L) {
                                    var13.method544(false, true, true, true, false, true, true);
                                } else {
                                    var13.method544(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class140.field2333 = true;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lwd;I)V", line = 156)
    public static final void method2068(class166 arg0, int arg1) {
        if (arg1 != -1) {
            field4428 = -0.6456612F;
        }
        field4419++;
        class61.field941 = arg0;
    }
}
