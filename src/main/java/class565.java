import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class565 {

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "J")
    public static long field8368 = -1L;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field8366;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "I")
    public static int field8369;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "[S")
    public static short[] field8367;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V", line = 4)
    public static void method3386(boolean arg0) {
        if (!arg0) {
            field8367 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)[B", line = 16)
    public static final synchronized byte[] method3387(int arg0, int arg1) {
        field8366++;
        if (arg0 < 91) {
            field8368 = 88L;
        }
        if (arg1 == 100 && class333.field4604 > 0) {
            byte[] var2 = class357.field4863[--class333.field4604];
            class357.field4863[class333.field4604] = null;
            return var2;
        } else if (arg1 == 5000 && class529.field7896 > 0) {
            byte[] var3 = class380.field5241[--class529.field7896];
            class380.field5241[class529.field7896] = null;
            return var3;
        } else if (arg1 == 30000 && class245.field3531 > 0) {
            byte[] var4 = class576.field8487[--class245.field3531];
            class576.field8487[class245.field3531] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lica;B)I", line = 54)
    public static final int method3388(class571 arg0, byte arg1) {
        field8370++;
        class87 var2 = arg0.field8405;
        if (arg1 != -114) {
            method3386(false);
        }
        if (var2.field1314 != null) {
            var2 = var2.method655((byte) 108, class556.field8280);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field1271;
        class226 var4 = arg0.method947(false);
        if (arg0.field1921) {
            var3 = var2.field1272;
        } else if (arg0.field1898 == var4.field3265 || arg0.field1898 == var4.field3282 || arg0.field1898 == var4.field3262 || arg0.field1898 == var4.field3309) {
            var3 = var2.field1277;
        } else if (arg0.field1898 == var4.field3293 || arg0.field1898 == var4.field3273 || arg0.field1898 == var4.field3292 || arg0.field1898 == var4.field3271) {
            var3 = var2.field1307;
        }
        return var3;
    }
}
