import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class180 extends class81 {

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "J")
    public long field3166;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "Lpj;")
    public static class237 field3160 = class33.method353("Sprites geladen)3", 67);

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "Lpj;")
    public static class237 field3161 = class33.method353("::serverjs5drop", 76);

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
    public static int field3167 = -1;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "[Z")
    public static boolean[] field3163 = new boolean[200];

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "Lak;")
    public static class135 field3165 = new class135(4);

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "[Lpj;")
    public static class237[] field3168 = new class237[500];

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIII)V")
    public static final void method1238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class199.method1361(arg0, arg1 + arg5, class62.field1241[arg3], arg1 - arg5, 103);
        field3162++;
        int var6 = arg2;
        int var7 = 0;
        int var8 = arg5 * arg5;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = var9 << 2;
        int var13 = var8 << 2;
        int var14 = (var7 + 1) * var12;
        int var15 = ((var7 << 1) + 3) * var10;
        int var16 = ((arg2 << 1) - 3) * var11;
        int var17 = (arg2 - 1) * var13;
        int var18 = arg2 << 1;
        int var19 = (1 - var18) * var8 + var10;
        int var20 = var9 - ((var18 - 1) * var11);
        if (arg4 != 24810) {
            method1240(-126);
        }
        while (var6 > 0) {
            if (var19 < 0) {
                while (var19 < 0) {
                    var7++;
                    var19 += var15;
                    var20 += var14;
                    var15 += var12;
                    var14 += var12;
                }
            }
            var6--;
            int var21 = arg3 - var6;
            int var22 = arg3 + var6;
            if (var20 < 0) {
                var20 += var14;
                var7++;
                var14 += var12;
                var19 += var15;
                var15 += var12;
            }
            var20 += -var16;
            int var23 = arg1 + var7;
            var16 -= var13;
            var19 += -var17;
            int var24 = arg1 - var7;
            var17 -= var13;
            class199.method1361(arg0, var23, class62.field1241[var21], var24, 66);
            class199.method1361(arg0, var23, class62.field1241[var22], var24, 111);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILfa;)V")
    public static final void method1239(int arg0, class239 arg1) {
        field3164++;
        class36.field794 = class249.method1703(class62.field1250, 0, arg1, (byte) 28);
        class264.field4515 = new class154[class36.field794.length];
        class152.field2696 = new class154[class36.field794.length];
        class221.field3805 = new class154[class36.field794.length];
        for (int var2 = 0; var2 < class36.field794.length; var2++) {
            class36.field794[var2].method1058();
            class264.field4515[var2] = class36.field794[var2].method1061();
            class36.field794[var2].method1058();
            class152.field2696[var2] = class36.field794[var2].method1061();
            class36.field794[var2].method1058();
            class221.field3805[var2] = class36.field794[var2].method1061();
            class36.field794[var2].method1058();
        }
        class106.field1867 = class76.method591(0, 0, class196.field3409, arg1);
        class112.field1967 = class23.method215(0, arg1, class82.field1544, (byte) 107);
        class213.field3642 = class23.method215(0, arg1, class31.field613, (byte) 107);
        class241.field4236 = class23.method215(0, arg1, class24.field432, (byte) 107);
        class46.field986 = class23.method215(0, arg1, class124.field2183, (byte) 107);
        class164.field2925 = class254.method1720(0, 104, class31.field614, arg1);
        class222.field3815 = class254.method1720(0, arg0 + 45, class21.field397, arg1);
        class24.field430 = class87.method665(class39.field894, arg1, arg0, false);
        class240.field4221 = class254.method1720(0, 46, class14.field237, arg1);
        class10.field193 = class254.method1720(0, -60, class125.field2193, arg1);
        class35.field754 = class8.method96(class242.field4253, arg1, 0, -80);
        class85.field1581 = class8.method96(class151.field2682, arg1, 0, -43);
        class96.field1708.method1335(class85.field1581, (int[]) null);
        class227.field3884.method1335(class85.field1581, (int[]) null);
        class80.field1507.method1335(class85.field1581, (int[]) null);
        class225 var3 = class123.method882(arg1, 98, 0, class28.field573);
        var3.method1499();
        class23.field417 = var3;
        class225[] var4 = class76.method591(0, 0, class83.field1554, arg1);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1499();
        }
        class61.field1219 = var4;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 41.0D) - 20;
        for (int var10 = 0; var10 < class106.field1867.length; var10++) {
            class106.field1867[var10].method1505(var6 + var9, var8 + var9, var7 + var9);
        }
        class36.field794[0].method1060(var6 + var9, var8 + var9, var7 + var9);
        class50.field1073 = class106.field1867;
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)V")
    public static void method1240(int arg0) {
        field3165 = null;
        field3163 = null;
        field3160 = null;
        field3161 = null;
        int var1 = 32 % ((73 - arg0) / 48);
        field3168 = null;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class180() {
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(J)V")
    public class180(long arg0) {
        this.field3166 = arg0;
    }
}
