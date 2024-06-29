import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class386 {

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "[Lri;")
    public static class98[] field5316 = new class98[4];

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lne;I)V")
    public static final void method2373(class76 arg0, int arg1) {
        class359.field4957 = 3;
        field5317++;
        class75.method580(true, arg1 ^ 0x1);
        class336.field4540 = 127;
        class404.field5593 = true;
        class341.field4607 = true;
        class215.field3009 = true;
        class228.field3188 = 2;
        class107.field1521 = true;
        class316.field4264 = 1;
        class361.field4985 = 0;
        class119.field1814 = true;
        class152.field2192 = true;
        class230.field3237 = true;
        class258.field3585 = arg1;
        class98.field1360 = 0;
        class353.field4745 = 0;
        class441.field6201 = true;
        class160.field2272 = true;
        class1.field2 = 255;
        class231.field3253 = 127;
        class428.field5958 = true;
        if (class409.field5703 < 96) {
            class432.method2668(70, 0);
        } else {
            class432.method2668(arg1 + 32, 2);
        }
        class236.field3363 = class54.field686 == 1 ? 2 : 4;
        class229.field3214 = false;
        class211.field2956 = 2;
        class344.field4647 = 2;
        class294.field3962 = 0;
        class415.field5752 = false;
        class319.field4357 = true;
        class30.field416 = false;
        class50.field638 = 0;
        class314.field4262 = true;
        class331 var2 = null;
        try {
            class285 var3 = arg0.method599(-41);
            while (var3.field3875 == 0) {
                class328.method1999(0, 1L);
            }
            if (var3.field3875 == 1) {
                var2 = (class331) var3.field3871;
                byte[] var4 = new byte[(int) var2.method2004(93)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method2006(var4, (byte) -68, var5, var4.length - var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class169.method1205((byte) -63, new class366(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2009(-106);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(B)V")
    public static void method2374(byte arg0) {
        field5316 = null;
        if (arg0 != 100) {
            field5316 = null;
        }
    }
}
