import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class755 extends class224 {

    @OriginalMember(owner = "client!eca", name = "B", descriptor = "I")
    private int field10510;

    @OriginalMember(owner = "client!eca", name = "D", descriptor = "Ldm;")
    public static class50 field10512 = null;

    @OriginalMember(owner = "client!eca", name = "G", descriptor = "Ldm;")
    public static class50 field10515 = null;

    @OriginalMember(owner = "client!eca", name = "x", descriptor = "I")
    public static int field10506;

    @OriginalMember(owner = "client!eca", name = "y", descriptor = "I")
    public static int field10507;

    @OriginalMember(owner = "client!eca", name = "z", descriptor = "I")
    public static int field10508;

    @OriginalMember(owner = "client!eca", name = "A", descriptor = "I")
    public static int field10509;

    @OriginalMember(owner = "client!eca", name = "E", descriptor = "I")
    public static int field10513;

    @OriginalMember(owner = "client!eca", name = "C", descriptor = "[Lnf;")
    public class574[] field10511;

    @OriginalMember(owner = "client!eca", name = "F", descriptor = "[[B")
    private byte[][] field10514;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)Z", line = 6)
    public final boolean method4190(byte arg0) {
        field10507++;
        if (this.field10511 != null) {
            return true;
        }
        if (this.field10514 == null) {
            class209 var2 = class407.field5678;
            synchronized (class407.field5678) {
                if (!class407.field5678.method1458((byte) -90, this.field10510)) {
                    return false;
                }
                int[] var4 = class407.field5678.method1479(this.field10510, -89);
                this.field10514 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field10514[var5] = class407.field5678.method1453(var4[var5], -118, this.field10510);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field10514.length; var7++) {
            byte[] var8 = this.field10514[var7];
            class35 var9 = new class35(var8);
            var9.field469 = 1;
            int var10 = var9.method253(-13900);
            class209 var11 = class361.field5061;
            synchronized (class361.field5061) {
                var6 &= class361.field5061.method1472(-25711, var10);
            }
        }
        if (!var6) {
            return false;
        }
        class220 var12 = new class220();
        class209 var13 = class407.field5678;
        int[] var16;
        synchronized (class407.field5678) {
            int var14 = class407.field5678.method1477(0, this.field10510);
            this.field10511 = new class574[var14];
            int var15 = -116 % ((arg0 - 55) / 40);
            var16 = class407.field5678.method1479(this.field10510, -116);
        }
        for (int var17 = 0; var17 < var16.length; var17++) {
            byte[] var18 = this.field10514[var17];
            class35 var19 = new class35(var18);
            var19.field469 = 1;
            int var20 = var19.method253(-13900);
            class520 var21 = null;
            for (class520 var22 = (class520) var12.method1522(true); var22 != null; var22 = (class520) var12.method1527((byte) 98)) {
                if (var22.field7375 == var20) {
                    var21 = var22;
                    break;
                }
            }
            if (var21 == null) {
                class209 var23 = class361.field5061;
                synchronized (class361.field5061) {
                    var21 = new class520(var20, class361.field5061.method1478((byte) -72, var20));
                }
                var12.method1526(var21, -91);
            }
            this.field10511[var16[var17]] = new class574(var18, var21);
        }
        this.field10514 = null;
        return true;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 115)
    public static final int method4191(String arg0, int arg1) {
        field10506++;
        if (!class318.field4511.field5141) {
            return -1;
        } else if (class13.field158.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class515.method3072(arg0, -122);
            if (var2 == null) {
                return -1;
            }
            if (arg1 != 0) {
                field10515 = null;
            }
            String var3 = class373.field5234 + var2;
            if (!class35.field510.method1451(var3, "", -40)) {
                return -1;
            } else if (class35.field510.method1470(var3, -7490)) {
                byte[] var4 = class35.field510.method1475("", (byte) 116, var3);
                Object var5 = null;
                File var6;
                try {
                    var6 = class553.method3242((byte) 102, var2);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class190.method1334(false, var6);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class318.field4511.method2281(var4, 78, var6);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class379.method2376(13358, arg0, var6);
                return 100;
            } else {
                return class35.field510.method1460(var3, (byte) 124);
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)Z", line = 208)
    public final boolean method4192(int arg0, int arg1) {
        if (arg0 == 100) {
            field10513++;
            return this.field10511[arg1].field8145;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "(B)V", line = 220)
    public static void method4193(byte arg0) {
        if (arg0 != -11) {
            field10515 = null;
        }
        field10512 = null;
        field10515 = null;
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(I)V", line = 238)
    public class755(int arg0) {
        this.field10510 = arg0;
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(II)Z", line = 246)
    public final boolean method4194(int arg0, int arg1) {
        field10509++;
        if (arg0 != 8243) {
            this.field10510 = 16;
        }
        return this.field10511[arg1].field8136;
    }

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "(II)Z", line = 260)
    public final boolean method4195(int arg0, int arg1) {
        if (arg0 != -27751) {
            field10515 = null;
        }
        field10508++;
        return this.field10511[arg1].field8142;
    }
}
