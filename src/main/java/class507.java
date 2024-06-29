import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class507 {

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Lhga;")
    public static class158 field7396 = new class158(101, 2);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public int field7395;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public int field7398;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    public int field7399;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 6)
    public static final void method3079(int arg0) {
        if (arg0 != 2) {
            method3080(102);
        }
        if (class627.field8857.method294()) {
            class627.field8857.method304(class271.field4377);
            class92.method884((byte) 117);
            class627.field8857.method297(class271.field4377);
            class627.field8857.method298(class271.field4377);
        } else {
            class265.method1878(class497.field7259, -14473);
        }
        field7394++;
        class211.method1601(-20030);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 30)
    public static void method3080(int arg0) {
        field7396 = null;
        if (arg0 != 101) {
            method3079(72);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lie;BI)V", line = 40)
    private final void method3081(class6 arg0, byte arg1, int arg2) {
        field7392++;
        if (arg2 == 1) {
            this.field7398 = arg0.method67(arg1 ^ 0x2EDC);
            this.field7395 = arg0.method70(-9059);
            this.field7399 = arg0.method70(arg1 - 9100);
        }
        if (arg1 != 41) {
            this.field7399 = 3;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILie;)V", line = 62)
    public final void method3082(int arg0, class6 arg1) {
        field7400++;
        while (true) {
            int var3 = arg1.method70(-9059);
            if (var3 == 0) {
                if (arg0 == -14281) {
                    return;
                } else {
                    this.method3082(44, null);
                    return;
                }
            }
            this.method3081(arg1, (byte) 41, var3);
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Lba;", line = 87)
    public static final class354 method3083(int arg0) {
        if (arg0 < 44) {
            field7396 = null;
        }
        field7393++;
        return class378.field5872;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 101)
    public static final int method3084(String arg0, byte arg1) {
        field7397++;
        if (!class542.field7901.field7655) {
            return -1;
        } else if (class191.field3162.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class618.method3587(arg1 ^ 0xFFFFFFB5, arg0);
            if (var2 == null) {
                return -1;
            }
            String var3 = class498.field7312 + var2;
            if (!class672.field9475.method951(var3, "", 109)) {
                return -1;
            } else if (!class672.field9475.method947((byte) -82, var3)) {
                return class672.field9475.method935(var3, arg1 ^ 0x60);
            } else if (arg1 == -75) {
                byte[] var4 = class672.field9475.method923(var3, -25124, "");
                Object var5 = null;
                File var6;
                try {
                    var6 = class317.method2164(var2, arg1 - 25344);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class22.method363(var6, 110);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class542.field7901.method3167(true, var4, var6);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class361.method2411(var6, -29093, arg0);
                return 100;
            } else {
                return -37;
            }
        }
    }
}
