import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class161 {

    @OriginalMember(owner = "client!om", name = "a", descriptor = "Ljf;")
    public static class227 field2496 = new class227(16);

    @OriginalMember(owner = "client!om", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2498 = "flash2:";

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field2499 = -1;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1108(int arg0) {
        field2497++;
        class280.field4318.method1298((byte) 110);
        if (arg0 != 0) {
            field2498 = (String) null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V", line = 18)
    public static final void method1109(boolean arg0) {
        class230.field3713.method2068((byte) 107);
        field2500++;
        int var1 = class230.field3713.method2072(8, false);
        if (var1 < class155.field2439) {
            for (int var2 = var1; var2 < class155.field2439; var2++) {
                class101.field1572[class4.field54++] = class144.field2286[var2];
            }
        }
        if (class155.field2439 < var1) {
            throw new RuntimeException("gnpov1");
        } else if (arg0) {
            class155.field2439 = 0;
            for (int var3 = 0; var3 < var1; var3++) {
                int var4 = class144.field2286[var3];
                class80 var5 = class208.field3313[var4];
                int var6 = class230.field3713.method2072(1, false);
                if (var6 == 0) {
                    class144.field2286[class155.field2439++] = var4;
                    var5.field527 = class343.field5341;
                } else {
                    int var7 = class230.field3713.method2072(2, !arg0);
                    if (var7 == 0) {
                        class144.field2286[class155.field2439++] = var4;
                        var5.field527 = class343.field5341;
                        class105.field1619[class142.field2248++] = var4;
                    } else if (var7 == 1) {
                        class144.field2286[class155.field2439++] = var4;
                        var5.field527 = class343.field5341;
                        int var12 = class230.field3713.method2072(3, false);
                        var5.method276((byte) -83, var12, 1);
                        int var13 = class230.field3713.method2072(1, false);
                        if (var13 == 1) {
                            class105.field1619[class142.field2248++] = var4;
                        }
                    } else if (var7 == 2) {
                        class144.field2286[class155.field2439++] = var4;
                        var5.field527 = class343.field5341;
                        if (class230.field3713.method2072(1, false) == 1) {
                            int var9 = class230.field3713.method2072(3, false);
                            var5.method276((byte) -75, var9, 2);
                            int var10 = class230.field3713.method2072(3, !arg0);
                            var5.method276((byte) -75, var10, 2);
                        } else {
                            int var8 = class230.field3713.method2072(3, false);
                            var5.method276((byte) -73, var8, 0);
                        }
                        int var11 = class230.field3713.method2072(1, !arg0);
                        if (var11 == 1) {
                            class105.field1619[class142.field2248++] = var4;
                        }
                    } else if (var7 == 3) {
                        class101.field1572[class4.field54++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V", line = 145)
    public static void method1110(int arg0) {
        if (arg0 == 0) {
            field2496 = null;
            field2498 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "()V", line = 167)
    public static final void method1111() {
        GL var0 = class333.field5160;
        var0.glDisableClientState(32886);
        class333.method2308(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class333.method2290();
        for (int var1 = 0; var1 < class126.field1962[0].length; var1++) {
            class217 var2 = class126.field1962[0][var1];
            if (var2.field3416 >= 0 && class64.method459(class12.field126.method472(false, var2.field3416), false)) {
                var0.glColor4fv(class54.method361(-115, var2.field3415), 0);
                float var3 = 201.5F - (var2.field3428 ? 1.0F : 0.5F);
                var2.method1452(class90.field1375, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class333.method2309();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class333.method2301();
    }
}
