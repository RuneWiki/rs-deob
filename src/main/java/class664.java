import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class664 {

    @OriginalMember(owner = "client!ut", name = "k", descriptor = "Lab;")
    private class623 field9097 = new class623();

    @OriginalMember(owner = "client!ut", name = "o", descriptor = "Lbj;")
    private class430 field9101 = new class430();

    @OriginalMember(owner = "client!ut", name = "l", descriptor = "I")
    private int field9098;

    @OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
    private int field9100;

    @OriginalMember(owner = "client!ut", name = "m", descriptor = "Lsga;")
    private class583 field9099;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "[B")
    public static byte[] field9089 = new byte[2048];

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
    public static int field9090;

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
    public static int field9091;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "I")
    public static int field9092;

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "I")
    public static int field9094;

    @OriginalMember(owner = "client!ut", name = "i", descriptor = "I")
    public static int field9095;

    @OriginalMember(owner = "client!ut", name = "j", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "Lda;")
    public static class423 field9088;

    @OriginalMember(owner = "client!ut", name = "g", descriptor = "[J")
    public static long[] field9093;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)V", line = 14)
    public final void method3593(boolean arg0) {
        field9092++;
        this.field9101.method2563(arg0);
        this.field9099.method3251(arg0);
        this.field9097 = new class623();
        this.field9098 = this.field9100;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V", line = 30)
    public static void method3594(int arg0) {
        if (arg0 != 2) {
            method3598((byte) -104, -75);
        }
        field9088 = null;
        field9089 = null;
        field9093 = null;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZJ)V", line = 42)
    public final void method3595(boolean arg0, long arg1) {
        field9096++;
        class623 var4 = (class623) this.field9099.method3248(arg1, 0);
        if (!arg0) {
            field9088 = null;
        }
        if (var4 != null) {
            var4.method3426((byte) -82);
            var4.method3409(-114);
            this.field9098++;
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)I", line = 63)
    public static final int method3596(int arg0) {
        field9090++;
        if (class367.field5194 == 0) {
            class539.field7569.method3071(new class109("jaclib"), (byte) -108);
            if (class539.field7569.method3072(0).method648((byte) -102) != 100) {
                return 1;
            }
            if (!((class109) class539.field7569.method3072(0)).method747((byte) 15)) {
                class612.field8463.method2048(false);
            }
            class367.field5194 = 1;
        }
        if (class367.field5194 == 1) {
            class621.field8692 = class539.method3067((byte) 120);
            class539.field7567.method3071(new class515(class395.field5502), (byte) 80);
            class539.field7570.method3071(new class109("jaggl"), (byte) 54);
            class539.field7571.method3071(new class109("jagdx"), (byte) 110);
            class539.field7572.method3071(new class109("jagmisc"), (byte) 113);
            class539.field7573.method3071(new class109("sw3d"), (byte) -69);
            class539.field7574.method3071(new class109("hw3d"), (byte) -70);
            class539.field7575.method3071(new class109("jagtheora"), (byte) -116);
            class539.field7576.method3071(new class515(class447.field6293), (byte) -127);
            class539.field7577.method3071(new class515(class224.field2954), (byte) 121);
            class539.field7578.method3071(new class515(class565.field7911), (byte) -83);
            class539.field7579.method3071(new class515(class274.field3470), (byte) -71);
            class539.field7580.method3071(new class515(class37.field544), (byte) -65);
            class539.field7581.method3071(new class515(class687.field9729), (byte) -79);
            class539.field7582.method3071(new class515(class438.field6162), (byte) 64);
            class539.field7583.method3071(new class515(class530.field7471), (byte) 104);
            class539.field7584.method3071(new class515(class394.field5493), (byte) 72);
            class539.field7585.method3071(new class515(class102.field1255), (byte) 119);
            class539.field7586.method3071(new class515(class494.field6985), (byte) 96);
            class539.field7587.method3071(new class515(class505.field7136), (byte) 111);
            class539.field7588.method3071(new class515(class322.field4109), (byte) 89);
            class539.field7589.method3071(new class515(class603.field8364), (byte) 124);
            class539.field7590.method3071(new class95(class548.field7731, "huffman"), (byte) 98);
            class539.field7591.method3071(new class515(class570.field7946), (byte) 117);
            class539.field7592.method3071(new class515(class27.field446), (byte) -72);
            class539.field7593.method3071(new class515(class378.field5293), (byte) 69);
            class539.field7594.method3071(new class591(class250.field3180, "details"), (byte) 78);
            for (int var1 = 0; var1 < class621.field8692.length; var1++) {
                if (class621.field8692[var1].method3072(0) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class539[] var3 = class621.field8692;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class539 var5 = var3[var4];
                int var6 = var5.method3069((byte) 117);
                int var7 = var5.method3072(0).method648((byte) -124);
                var2 += var6 * var7 / 100;
            }
            class367.field5194 = 2;
            class142.field1687 = var2;
        }
        if (class621.field8692 == null) {
            return 100;
        }
        int var8 = 29 % ((-arg0 - 34) / 44);
        int var9 = 0;
        int var10 = 0;
        boolean var11 = true;
        class539[] var12 = class621.field8692;
        for (int var13 = 0; var13 < var12.length; var13++) {
            class539 var17 = var12[var13];
            int var18 = var17.method3069((byte) 117);
            int var19 = var17.method3072(0).method648((byte) -123);
            var9 += var18;
            var10 += var18 * var19 / 100;
            if (var19 < 100) {
                var11 = false;
            }
        }
        if (var11) {
            if (!((class109) class539.field7572.method3072(0)).method747((byte) 9)) {
                class612.field8463.method2054(-22991);
            }
            if (!((class109) class539.field7575.method3072(0)).method747((byte) 84)) {
                class485.field6885 = class612.field8463.method2049(2);
            }
            class621.field8692 = null;
        }
        int var14 = var10 - class142.field1687;
        int var15 = var9 - class142.field1687;
        int var16 = var15 > 0 ? var14 * 100 / var15 : 100;
        if (!var11 && var16 > 99) {
            var16 = 99;
        }
        return var16;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(JI)Lab;", line = 213)
    public final class623 method3597(long arg0, int arg1) {
        field9091++;
        class623 var4 = (class623) this.field9099.method3248(arg0, 0);
        if (arg1 != 2087) {
            this.method3595(false, 50L);
        }
        if (var4 != null) {
            this.field9101.method2564(var4, (byte) -123);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)V", line = 237)
    public static final void method3598(byte arg0, int arg1) {
        field9095++;
        class548 var2 = class696.method3872(arg1, 9, -1633381944);
        var2.method3127((byte) 122);
        if (arg0 != 104) {
            method3596(77);
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lab;IJ)V", line = 264)
    public final void method3599(class623 arg0, int arg1, long arg2) {
        if (arg1 != 100) {
            return;
        }
        field9094++;
        if (this.field9098 == 0) {
            class623 var5 = this.field9101.method2566(0);
            var5.method3426((byte) -13);
            var5.method3409(arg1 - 36);
            if (this.field9097 == var5) {
                class623 var6 = this.field9101.method2566(0);
                var6.method3426((byte) -75);
                var6.method3409(-123);
            }
        } else {
            this.field9098--;
        }
        this.field9099.method3249(arg2, arg0, (byte) -115);
        this.field9101.method2564(arg0, (byte) -123);
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(I)V", line = 304)
    public class664(int arg0) {
        this.field9098 = arg0;
        this.field9100 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field9099 = new class583(var2);
    }
}
