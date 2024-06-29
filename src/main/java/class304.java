import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class304 {

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Z")
    public boolean field4920 = true;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public int field4912;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public int field4921;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public int field4922;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public int field4915;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public int field4918;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public int field4913;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Lie;")
    public static class2 field4923 = new class2();

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field4926 = 0;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field4924 = 50;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Lna;")
    public static class21 field4927;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Z")
    public static final boolean method2067(int arg0) {
        field4919++;
        class240 var1 = class34.field431;
        synchronized (class34.field431) {
            if (class86.field1365 == class254.field3835) {
                return false;
            } else if (arg0 == -1456) {
                class292.field4642 = class293.field4656[class254.field3835];
                class77.field1219 = class77.field1222[class254.field3835];
                class254.field3835 = class254.field3835 + 1 & 0x7F;
                return true;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZI)I")
    public static final int method2068(int arg0, boolean arg1, int arg2) {
        field4916++;
        if (!arg1) {
            method2070(true);
        }
        int var3 = arg0 >> 31 & arg2 - 1;
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ldk;[I[I[II)V")
    public static final void method2069(class207 arg0, int[] arg1, int[] arg2, int[] arg3, int arg4) {
        if (arg4 != -19443) {
            field4924 = 61;
        }
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg3[var5];
            int var9 = 0;
            while (var7 != 0 && arg0.field3678.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field3678[var9] = null;
                    } else {
                        class76 var10 = class232.method1609((byte) -32, var6);
                        int var11 = var10.field1202;
                        class152 var12 = arg0.field3678[var9];
                        if (var12 != null) {
                            if (var12.field2404 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field3678[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field2401 = 0;
                                    var12.field2403 = 0;
                                    var12.field2406 = var8;
                                    var12.field2405 = 0;
                                    var12.field2400 = 1;
                                    class32.method208(arg0.field3660, 0, true, class213.field3139 == arg0, arg0.field3753, var10);
                                } else if (var11 == 2) {
                                    var12.field2405 = 0;
                                }
                            } else if (var10.field1214 >= class232.method1609((byte) -32, var12.field2404).field1214) {
                                var12 = arg0.field3678[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class152 var13 = arg0.field3678[var9] = new class152();
                            var13.field2401 = 0;
                            var13.field2400 = 1;
                            var13.field2403 = 0;
                            var13.field2406 = var8;
                            var13.field2405 = 0;
                            var13.field2404 = var6;
                            class32.method208(arg0.field3660, 0, true, class213.field3139 == arg0, arg0.field3753, var10);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field4914++;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class304(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4912 = arg2;
        this.field4921 = arg3;
        this.field4920 = arg6;
        this.field4922 = arg4;
        this.field4915 = arg0;
        this.field4918 = arg5;
        this.field4913 = arg1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
    public static void method2070(boolean arg0) {
        field4927 = null;
        if (!arg0) {
            method2070(false);
        }
        field4923 = null;
    }
}
