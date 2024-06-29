import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class476 {

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "Lfc;")
    private class262 field6588 = new class262(64);

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "Lni;")
    private class522 field6574;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field6573 = new String[8];

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "[F")
    public static float[] field6575 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public static int field6576 = -1;

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "[F")
    public static float[] field6585 = new float[4];

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "Lni;")
    public static class522 field6580;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qq", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field6589;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qq", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field6590;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
    public final void method2672(int arg0) {
        class262 var2 = this.field6588;
        synchronized (this.field6588) {
            if (arg0 != 1) {
                field6575 = null;
            }
            this.field6588.method1563(85);
        }
        field6587++;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)V")
    public static final void method2673(int arg0, byte arg1) {
        class497.field6761.method1569((byte) 62, arg0);
        field6578++;
        int var2 = -75 / ((50 - arg1) / 63);
        class385.field5412.method1569((byte) 62, arg0);
        class144.field1866.method1569((byte) 62, arg0);
        class460.field6371.method1569((byte) 62, arg0);
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
    public static void method2674(byte arg0) {
        field6573 = null;
        field6580 = null;
        field6585 = null;
        field6575 = null;
        if (arg0 <= 36) {
            method2673(-41, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)Lww;")
    public final class732 method2675(int arg0, int arg1) {
        field6583++;
        class262 var3 = this.field6588;
        class732 var4;
        synchronized (this.field6588) {
            var4 = (class732) this.field6588.method1571(-126, (long) arg1);
        }
        if (arg0 != -37) {
            method2676(false, 104);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field6574;
        byte[] var6;
        synchronized (this.field6574) {
            var6 = this.field6574.method2885(arg1, 31, false);
        }
        class732 var7 = new class732();
        if (var6 != null) {
            var7.method4100((byte) 126, new class611(var6));
        }
        class262 var8 = this.field6588;
        synchronized (this.field6588) {
            this.field6588.method1574((long) arg1, var7, (byte) -80);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ZI)V")
    public static final void method2676(boolean arg0, int arg1) {
        if (arg0) {
            if (class116.field1543 != -1) {
                class166.method974(false, class116.field1543);
            }
            for (class526 var2 = (class526) class520.field6994.method2560(94); var2 != null; var2 = (class526) class520.field6994.method2557(-1)) {
                if (!var2.method314((byte) 78)) {
                    var2 = (class526) class520.field6994.method2560(121);
                    if (var2 == null) {
                        break;
                    }
                }
                class303.method1815(16398, false, var2, true);
            }
            class116.field1543 = -1;
            class520.field6994 = new class459(8);
            class430.method2456(118);
            class116.field1543 = class697.field9808;
            class574.method3221(arg1 + 83, false);
            class340.method2004(2);
            class498.method2786(class116.field1543);
        }
        field6577++;
        class463.field6399 = "";
        class551.field7807 = "";
        class24.field181 = false;
        class594.method3289(-96);
        class553.field7817 = -1;
        class61.method466(class410.field5779, true);
        class653.field9086 = new class83();
        class653.field9086.field2170 = class272.field3589 * 512 / 2;
        class653.field9086.field898[arg1] = class272.field3589 / 2;
        class653.field9086.field2165 = class3.field26 * 512 / 2;
        class653.field9086.field899[0] = class3.field26 / 2;
        class684.field9518 = 0;
        class294.field3956 = 0;
        if (class8.field57 == 2) {
            class684.field9518 = class422.field5907 << 9;
            class294.field3956 = class328.field4443 << 9;
        } else {
            class196.method1087(0);
        }
        class723.method4058((byte) 121);
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)I")
    public static final int method2677(int arg0) {
        field6581++;
        int var1 = 0;
        Field[] var2 = (field6589 == null ? (field6589 = method2681("kda")) : field6589).getDeclaredFields();
        Field[] var3 = var2;
        for (int var4 = 0; var4 < var3.length; var4++) {
            Field var5 = var3[var4];
            if ((field6590 == null ? (field6590 = method2681("eea")) : field6590).isAssignableFrom(var5.getType())) {
                var1++;
            }
        }
        if (arg0 <= 85) {
            method2680(true);
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)V")
    public final void method2678(boolean arg0) {
        class262 var2 = this.field6588;
        synchronized (this.field6588) {
            this.field6588.method1575((byte) 63);
        }
        if (!arg0) {
            field6580 = null;
        }
        field6582++;
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)V")
    public final void method2679(int arg0, int arg1) {
        class262 var3 = this.field6588;
        synchronized (this.field6588) {
            this.field6588.method1569((byte) 62, arg1);
        }
        if (arg0 > 110) {
            field6586++;
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(Z)V")
    public static final void method2680(boolean arg0) {
        field6579++;
        if (!arg0) {
            return;
        }
        for (class189 var1 = (class189) class56.field574.method724(32); var1 != null; var1 = (class189) class56.field574.method723(109)) {
            class108.method734(var1, false, 15697);
        }
        for (class189 var2 = (class189) class103.field1381.method724(32); var2 != null; var2 = (class189) class103.field1381.method723(93)) {
            class108.method734(var2, true, 15697);
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lrga;ILni;)V")
    public class476(class242 arg0, int arg1, class522 arg2) {
        this.field6574 = arg2;
        this.field6574.method2901(0, 31);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2681(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
