import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class129 {

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!pm", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1708++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
    public static final void method803(boolean arg0) {
        field1707++;
        class52.field628.method2499(0);
        for (class548 var1 = (class548) class272.field4014.method2496((byte) -103); var1 != null; var1 = (class548) class272.field4014.method2494(84)) {
            if (var1.field8163 < 1000) {
                var1.method2997(1);
                class52.field628.method2492(var1, (byte) 121);
            }
        }
        if (!arg0) {
            return;
        }
        class52.field628.method2487((byte) 114, class272.field4014);
        if (class487.field7385 <= 1) {
            class281.field4172 = null;
        } else if (class154.field1979 && class542.field8105.method1259(true, 81) && class487.field7385 > 2) {
            class281.field4172 = (class548) class272.field4014.field6029.field7466.field7466;
        } else {
            class281.field4172 = (class548) class272.field4014.field6029.field7466;
        }
        int var2 = -1;
        class497 var3 = (class497) class281.field4170.method2496((byte) 7);
        if (var3 != null) {
            var2 = var3.method32((byte) 98);
        }
        if (!class139.field1826) {
            if (var2 == 0 && (class579.field8532 == 1 && class487.field7385 > 2 || class325.method2038(2))) {
                var2 = 2;
            }
            if (var2 == 2 && class487.field7385 > 0 && var3 != null) {
                if (class106.field1333 == null && class89.field1140 == 0) {
                    class318.method1998(var3.method31(20), var3.method34(-3797), 16);
                } else {
                    class580.field8539 = 2;
                }
            }
            if (var2 == 0 && class487.field7385 > 0) {
                class323.method2018(124);
            }
            if (class106.field1333 == null && class89.field1140 == 0) {
                class468.field6924 = null;
                class580.field8539 = 0;
                return;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class350.field5071.method635(-192);
            int var5 = class350.field5071.method633((byte) 29);
            if (class290.field4257 - 10 > var4 || class290.field4257 + class452.field6607 + 10 < var4 || var5 < (class218.field3232 - 10) || var5 > (class218.field3232 + class475.field7252 + 10)) {
                class502.method3015(false);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class290.field4257;
        int var7 = class218.field3232;
        int var8 = class452.field6607;
        int var9 = var3.method34(-3797);
        int var10 = var3.method31(52);
        int var11 = -1;
        for (int var12 = 0; var12 < class487.field7385; var12++) {
            if (class455.field6636) {
                int var17 = (class487.field7385 - var12 - 1) * 16 + (var7 + 33);
                if (var6 < var9 && var6 + var8 > var9 && var10 > (var17 - 13) && var10 < var17 + 4) {
                    var11 = var12;
                }
            } else {
                int var16 = (class487.field7385 - (var12 + 1)) * 16 + (var7 + 31);
                if (var6 < var9 && var9 < (var6 + var8) && var10 > (var16 - 13) && var16 + 3 > var10) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class186 var14 = new class186(class272.field4014);
            for (class548 var15 = (class548) var14.method1222((byte) -89); var15 != null; var15 = (class548) var14.method1224(16711680)) {
                if (var11 == var13) {
                    class34.method168(var9, var15, (byte) -125, var10);
                }
                var13++;
            }
        }
        class502.method3015(false);
    }
}
