import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class355 {

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Lru;")
    private class177 field5513 = new class177(256);

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Lru;")
    private class177 field5515 = new class177(256);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "Lmn;")
    private class162 field5506;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lmn;")
    private class162 field5507;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field5514;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V")
    public static final void method2340(boolean arg0) {
        class453.field7022.method407(128);
        field5509++;
        class73.field1106 = null;
        class174.field2565 = 1;
        if (!arg0) {
            method2340(false);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II[I)Llf;")
    public final class391 method2341(int arg0, int arg1, int[] arg2) {
        field5514++;
        if (this.field5507.method1023(127) == 1) {
            return this.method2345(0, false, arg2, arg0);
        } else if (this.field5507.method1008(arg0, (byte) -21) == 1) {
            return this.method2345(arg0, false, arg2, 0);
        } else {
            if (arg1 != 0) {
                this.method2345(-54, false, null, -50);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLpb;Ljava/awt/Frame;)V")
    public static final void method2342(byte arg0, class2 arg1, Frame arg2) {
        field5508++;
        while (true) {
            class495 var3 = arg1.method13(arg2, 28877);
            while (var3.field7458 == 0) {
                class208.method1464((byte) -127, 10L);
            }
            if (var3.field7458 == 1) {
                arg2.setVisible(false);
                arg2.dispose();
                if (arg0 < 113) {
                    method2342((byte) 100, null, null);
                    return;
                }
                return;
            }
            class208.method1464((byte) -72, 100L);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[III)Llf;")
    private final class391 method2343(int arg0, int[] arg1, int arg2, int arg3) {
        field5512++;
        int var5 = (arg2 >>> 12 | arg2 & 0xFFF << 4) ^ arg0;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        if (arg3 >= -98) {
            return null;
        }
        class391 var9 = (class391) this.field5515.method1122((byte) 59, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class40 var10 = (class40) this.field5513.method1122((byte) 59, var7);
            if (var10 == null) {
                var10 = class40.method235(this.field5506, arg2, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field5513.method1127(var10, (byte) 120, var7);
            }
            class391 var11 = var10.method234(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method3149(101);
                this.field5515.method1127(var11, (byte) 77, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([III)Llf;")
    public final class391 method2344(int[] arg0, int arg1, int arg2) {
        field5510++;
        if (this.field5506.method1023(126) == 1) {
            return this.method2343(arg1, arg0, 0, -114);
        } else if (this.field5506.method1008(arg1, (byte) -21) == 1) {
            return this.method2343(0, arg0, arg1, -126);
        } else {
            if (arg2 >= -34) {
                this.field5507 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IZ[II)Llf;")
    private final class391 method2345(int arg0, boolean arg1, int[] arg2, int arg3) {
        field5511++;
        int var5 = (arg0 >>> 12 | (arg0 & 0x70000FFF) << 4) ^ arg3;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class391 var9 = (class391) this.field5515.method1122((byte) 59, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class230 var10 = class230.method1647(this.field5507, arg0, arg3);
            if (arg1) {
                return null;
            } else if (var10 == null) {
                return null;
            } else {
                class391 var11 = var10.method1646();
                this.field5515.method1127(var11, (byte) 116, var7);
                if (arg2 != null) {
                    arg2[0] -= var11.field5941.length;
                }
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lmn;Lmn;)V")
    public class355(class162 arg0, class162 arg1) {
        this.field5506 = arg1;
        this.field5507 = arg0;
    }
}
