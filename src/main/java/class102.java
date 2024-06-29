import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public abstract class class102 {

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "Luv;")
    public static class3 field1344 = new class3(75, -1);

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)V")
    public static void method563(boolean arg0) {
        field1344 = null;
        if (arg0) {
            method563(false);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method564(String arg0, int arg1) {
        if (arg1 != -1) {
            method564(null, 119);
        }
        field1345++;
        if (class279.field3639 == 3) {
            return -1;
        } else if (class496.field6915.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class70.method400(arg0, 31273);
            if (var2 == null) {
                return -1;
            }
            String var3 = class191.field2473 + var2;
            if (!class68.field897.method2073((byte) 116, var3, "")) {
                return -1;
            } else if (class68.field897.method2072(var3, false)) {
                byte[] var4 = class68.field897.method2045("", (byte) -22, var3);
                File var5 = class77.field1048.method1741(var2, 121);
                if (var4 == null || var5 == null) {
                    return -1;
                }
                boolean var6 = true;
                byte[] var7 = class22.method126(var5, true);
                if (var7 != null && var4.length == var7.length) {
                    for (int var8 = 0; var8 < var7.length; var8++) {
                        if (var4[var8] != var7[var8]) {
                            var6 = false;
                            break;
                        }
                    }
                } else {
                    var6 = false;
                }
                try {
                    if (!var6) {
                        class77.field1048.method1733(var5, var4, (byte) -100);
                    }
                } catch (Throwable var9) {
                    return -1;
                }
                class485.method2739(arg0, var5, 60);
                return 100;
            } else {
                return class68.field897.method2044(var3, true);
            }
        }
    }
}
