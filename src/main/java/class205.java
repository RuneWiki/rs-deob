import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class205 {

    @OriginalMember(owner = "client!da", name = "l", descriptor = "B")
    private byte field3242;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public int field3233;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public int field3238;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public int field3243;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public int field3231;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public int field3232;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "[I")
    public static int[] field3237 = new int[256];

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field3239 = 0;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "[Llf;")
    public static class260[] field3245 = new class260[8];

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "Lth;")
    public static class57 field3244;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "[Lml;")
    public static class17[] field3240;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILth;)I", line = 14)
    public static final int method1564(int arg0, class57 arg1) {
        field3241++;
        int var2 = arg0;
        if (arg1.method452(class156.field2473, (byte) 54)) {
            var2 = arg0 + 1;
        }
        if (arg1.method452(class116.field1941, (byte) 61)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 35)
    public static void method1565(int arg0) {
        field3244 = null;
        field3245 = null;
        field3240 = null;
        if (arg0 < 29) {
            field3237 = (int[]) null;
        }
        field3237 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)[Lml;", line = 57)
    public static final class17[] method1566(byte arg0) {
        field3247++;
        class17[] var1 = new class17[class301.field4845];
        for (int var2 = 0; var2 < class301.field4845; var2++) {
            byte[] var3 = class163.field2578[var2];
            int var4 = class322.field5132[var2] * class221.field3595[var2];
            if (class159.field2540[var2]) {
                int[] var7 = new int[var4];
                byte[] var8 = class86.field1462[var2];
                for (int var9 = 0; var9 < var4; var9++) {
                    var7[var9] = class75.method624(class121.field2026[class343.method2418(255, var3[var9])], class343.method2418(var8[var9], 255) << 24);
                }
                if (class42.field607) {
                    var1[var2] = new class256(class164.field2595, class318.field5070, class189.field3035[var2], class19.field211[var2], class221.field3595[var2], class322.field5132[var2], var7);
                } else {
                    var1[var2] = new class120(class164.field2595, class318.field5070, class189.field3035[var2], class19.field211[var2], class221.field3595[var2], class322.field5132[var2], var7);
                }
            } else {
                int[] var5 = new int[var4];
                for (int var6 = 0; var6 < var4; var6++) {
                    var5[var6] = class121.field2026[class343.method2418(255, var3[var6])];
                }
                if (class42.field607) {
                    var1[var2] = new class58(class164.field2595, class318.field5070, class189.field3035[var2], class19.field211[var2], class221.field3595[var2], class322.field5132[var2], var5);
                } else {
                    var1[var2] = new class351(class164.field2595, class318.field5070, class189.field3035[var2], class19.field211[var2], class221.field3595[var2], class322.field5132[var2], var5);
                }
            }
        }
        if (arg0 > -127) {
            return (class17[]) null;
        } else {
            class211.method1592((byte) 41);
            return var1;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)I", line = 128)
    public final int method1567(boolean arg0) {
        field3246++;
        if (arg0) {
            method1565(-78);
        }
        return this.field3242 & 0x7;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V", line = 140)
    public class205() {
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lqm;)V", line = 142)
    public class205(class227 arg0) {
        this.field3242 = arg0.method1733(0);
        this.field3233 = arg0.method1765(true);
        this.field3238 = arg0.method1715((byte) 82);
        this.field3243 = arg0.method1715((byte) -123);
        this.field3231 = arg0.method1715((byte) 34);
        this.field3232 = arg0.method1715((byte) -98);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lwf;B)V", line = 157)
    public static final void method1568(class250 arg0, byte arg1) {
        if (arg1 <= 114) {
            field3239 = 79;
        }
        field3234++;
        if (class152.field2415 == arg0.field4203) {
            class270.field4498[arg0.field4165] = true;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)I", line = 172)
    public final int method1569(int arg0) {
        field3235++;
        if (arg0 == 1) {
            return (this.field3242 & 0x8) == 8 ? 1 : 0;
        } else {
            return -91;
        }
    }
}
