import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class699 extends class617 {

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "[I")
    public int[] field9887;

    @OriginalMember(owner = "client!nca", name = "l", descriptor = "[I")
    public int[] field9889;

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "I")
    public static int field9886 = 0;

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "I")
    public static int field9882;

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "I")
    public static int field9883;

    @OriginalMember(owner = "client!nca", name = "g", descriptor = "I")
    public static int field9884;

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "I")
    public static int field9888;

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "Z")
    public static boolean field9885;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V", line = 4)
    public static final void method3896(int arg0, Throwable arg1, String arg2) {
        field9882++;
        try {
            if (arg0 >= 67) {
                String var3 = "";
                if (arg1 != null) {
                    var3 = class51.method577(arg1, 103);
                }
                if (arg2 != null) {
                    if (arg1 != null) {
                        var3 = var3 + " | ";
                    }
                    var3 = var3 + arg2;
                }
                class390.method2401((byte) -58, var3);
                String var4 = class564.method3222("%3a", ":", var3, 0);
                String var5 = class564.method3222("%40", "@", var4, 0);
                String var6 = class564.method3222("%26", "&", var5, 0);
                String var7 = class564.method3222("%23", "#", var6, 0);
                if (class608.field8561 != null) {
                    class494 var8 = class271.field4077.method18(-77, new URL(class608.field8561.getCodeBase(), "clienterror.ws?c=" + class612.field8577 + "&u=" + class9.field93 + "&v1=" + class4.field28 + "&v2=" + class4.field35 + "&e=" + var7));
                    while (var8.field7024 == 0) {
                        class561.method3202(1L, (byte) -21);
                    }
                    if (var8.field7024 == 1) {
                        DataInputStream var9 = (DataInputStream) var8.field7019;
                        var9.read();
                        var9.close();
                    }
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)V", line = 60)
    public static final void method3897(byte arg0) {
        class485.field6902.method2285((byte) -87);
        field9888++;
        int var1 = 60 % ((23 - arg0) / 36);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZLpu;Lr;)V", line = 71)
    public static final void method3898(boolean arg0, class522 arg1, class166 arg2) {
        field9884++;
        class113[] var3 = class113.method884(arg1, class366.field5235, 0);
        class571.field8048 = new class702[var3.length];
        for (int var4 = 0; var4 < var3.length; var4++) {
            class571.field8048[var4] = arg2.method138(var3[var4], true);
        }
        class113[] var5 = class113.method884(arg1, class125.field1872, 0);
        class586.field8207 = new class702[var5.length];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class586.field8207[var6] = arg2.method138(var5[var6], true);
        }
        class113[] var7 = class113.method884(arg1, class356.field5113, 0);
        class305.field4534 = new class702[var7.length];
        for (int var8 = 0; var8 < var7.length; var8++) {
            class305.field4534[var8] = arg2.method138(var7[var8], true);
        }
        class113[] var9 = class113.method884(arg1, class705.field9920, 0);
        class272.field4093 = new class702[var9.length];
        for (int var10 = 0; var10 < var9.length; var10++) {
            class272.field4093[var10] = arg2.method138(var9[var10], true);
        }
        class113[] var11 = class113.method884(arg1, class665.field9389, 0);
        class420.field6107 = new class702[var11.length];
        for (int var12 = 0; var12 < var11.length; var12++) {
            class420.field6107[var12] = arg2.method138(var11[var12], true);
        }
        class113[] var13 = class113.method884(arg1, class577.field8132, 0);
        class498.field7055 = new class702[var13.length];
        for (int var14 = 0; var14 < var13.length; var14++) {
            class498.field7055[var14] = arg2.method138(var13[var14], true);
        }
        class113[] var15 = class113.method884(arg1, class313.field4632, 0);
        class274.field4182 = new class702[var15.length];
        for (int var16 = 0; var16 < var15.length; var16++) {
            class274.field4182[var16] = arg2.method138(var15[var16], true);
        }
        class113[] var17 = class113.method884(arg1, class583.field8195, 0);
        class83.field1371 = new class702[var17.length];
        for (int var18 = 0; var18 < var17.length; var18++) {
            class83.field1371[var18] = arg2.method138(var17[var18], true);
        }
        class113[] var19 = class113.method884(arg1, class104.field1621, 0);
        class580.field8176 = new class702[var19.length];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class580.field8176[var20] = arg2.method138(var19[var20], true);
        }
        class113[] var21 = class113.method884(arg1, class455.field6533, 0);
        class124.field1863 = new class702[var21.length];
        for (int var22 = 0; var22 < var21.length; var22++) {
            class124.field1863[var22] = arg2.method138(var21[var22], true);
        }
        class113[] var23 = class113.method884(arg1, class228.field3304, 0);
        class515.field7284 = new class702[var23.length];
        for (int var24 = 0; var24 < var23.length; var24++) {
            class515.field7284[var24] = arg2.method138(var23[var24], true);
        }
        class113[] var25 = class113.method884(arg1, class688.field9690, 0);
        class258.field3939 = new class702[var25.length];
        for (int var26 = 0; var26 < var25.length; var26++) {
            class258.field3939[var26] = arg2.method138(var25[var26], true);
        }
        class135.field1981 = arg2.method138(class113.method875(arg1, class639.field9018, 0), true);
        class143.field2110 = arg2.method138(class113.method875(arg1, class46.field722, 0), arg0);
        class113[] var27 = class113.method884(arg1, class232.field3614, 0);
        class626.field8768 = new class702[var27.length];
        for (int var28 = 0; var28 < var27.length; var28++) {
            class626.field8768[var28] = arg2.method138(var27[var28], true);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIIIII)V", line = 202)
    public static final void method3899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9883++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg3 * arg3;
        if (arg4 > -73) {
            method3897((byte) 32);
        }
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        class58.method623(arg0, arg2 + arg3, 23309, class651.field9125[arg1], arg2 - arg3);
        int var20 = (arg5 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var6++;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var17 += var16;
                var19 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var20;
            var7--;
            var20 -= var15;
            var18 -= var15;
            int var21 = arg1 - var7;
            int var22 = arg1 + var7;
            int var23 = arg2 + var6;
            int var24 = arg2 - var6;
            class58.method623(arg0, var23, 23309, class651.field9125[var21], var24);
            class58.method623(arg0, var23, 23309, class651.field9125[var22], var24);
        }
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(II[I[I)V", line = 285)
    public class699(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field9887 = arg2;
        this.field9889 = arg3;
    }
}
