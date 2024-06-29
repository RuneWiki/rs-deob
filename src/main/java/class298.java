import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class298 extends class284 {

    @OriginalMember(owner = "client!rp", name = "F", descriptor = "B")
    public byte field4248;

    @OriginalMember(owner = "client!rp", name = "D", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!rp", name = "H", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!rp", name = "I", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!rp", name = "J", descriptor = "I")
    public int field4252;

    @OriginalMember(owner = "client!rp", name = "K", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!rp", name = "L", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!rp", name = "G", descriptor = "Lcu;")
    public class145 field4249;

    @OriginalMember(owner = "client!rp", name = "E", descriptor = "Liv;")
    public static class64 field4247;

    @OriginalMember(owner = "client!rp", name = "g", descriptor = "(I)V")
    public static void method1886(int arg0) {
        if (arg0 != -28692) {
            field4251 = -61;
        }
        field4247 = null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)[B")
    public final byte[] method1445(byte arg0) {
        ++field4246;
        if (arg0 < 73) {
            this.method1445((byte) -6);
        }
        if (!super.field4053 && ~this.field4249.field2289 <= ~(this.field4249.field2270.length - this.field4248)) {
            return this.field4249.field2270;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)I")
    public final int method1451(int arg0) {
        ++field4253;
        if (this.field4249 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                method1886(-50);
            }
            return this.field4249.field2289 * 100 / (this.field4249.field2270.length - this.field4248);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BZ)Z")
    public static final boolean method1887(byte arg0, boolean arg1) {
        ++field4250;
        boolean var2 = class4.field109.method264();
        if (arg0 <= 120) {
            field4247 = null;
        }
        if (arg1 != var2) {
            if (!arg1) {
                class4.field109.method303();
            } else if (!class4.field109.method286()) {
                arg1 = false;
            }
            if (arg1 != var2) {
                class443.field6623.field623 = arg1;
                class443.field6623.method2844(class368.field5553, 25133);
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;ZII)I")
    public static final int method1888(String arg0, boolean arg1, int arg2, int arg3) {
        ++field4254;
        if (arg2 >= 2 && arg2 <= 36) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg0.length();
            if (arg3 != 100) {
                method1888((String) null, true, 68, 95);
            }
            for (int var8 = 0; var7 > var8; ++var8) {
                char var9 = arg0.charAt(var8);
                if (~var8 == -1) {
                    if (~var9 == -46) {
                        var4 = true;
                        continue;
                    }
                    if (~var9 == -44 && arg1) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && ~var9 >= -58) {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && ~var9 >= -91) {
                    var11 = var9 - '7';
                } else {
                    if (var9 < 'a' || ~var9 < -123) {
                        throw new NumberFormatException();
                    }
                    var11 = var9 - 'W';
                }
                if (arg2 <= var11) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg2 * var6 - -var11;
                if (var10 / arg2 != var6) {
                    throw new NumberFormatException();
                }
                var6 = var10;
                var5 = true;
            }
            if (!var5) {
                throw new NumberFormatException();
            } else {
                return var6;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }
}
