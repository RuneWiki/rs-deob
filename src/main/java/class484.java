import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class484 {

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field7102 = -1;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field7101;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)V")
    public static final void method2974(int arg0, int arg1) {
        field7101++;
        class2.field16 = -1;
        if (arg0 <= -91) {
            class528.field7705 = arg1;
            class55.field717 = -1;
            class555.method3320(-7733);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I[B)V")
    public static final void method2975(int arg0, byte[] arg1) {
        field7100++;
        class6 var2 = new class6(arg1);
        while (true) {
            while (true) {
                int var3 = var2.method70(-9059);
                if (var3 == 0) {
                    if (arg0 > -31) {
                        method2975(-58, null);
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    int[] var4 = class647.field9080 = new int[6];
                    var4[0] = var2.method67(12021);
                    var4[1] = var2.method67(12021);
                    var4[2] = var2.method67(12021);
                    var4[3] = var2.method67(12021);
                    var4[4] = var2.method67(12021);
                    var4[5] = var2.method67(12021);
                } else if (var3 == 4) {
                    int var5 = var2.method70(-9059);
                    class524.field7647 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        class524.field7647[var6] = var2.method67(12021);
                        if (class524.field7647[var6] == 65535) {
                            class524.field7647[var6] = -1;
                        }
                    }
                } else if (var3 == 5) {
                    int var7 = var2.method70(-9059);
                    class361.field5716 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        class361.field5716[var8] = var2.method67(12021);
                        if (class361.field5716[var8] == 65535) {
                            class361.field5716[var8] = -1;
                        }
                    }
                }
            }
        }
    }
}
