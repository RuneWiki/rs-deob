import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class364 {

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "Lqi;")
    private class406 field5212 = new class406(256);

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "Lqi;")
    private class406 field5214 = new class406(256);

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "Loi;")
    private class53 field5203;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "Loi;")
    private class53 field5205;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field5209 = 0;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "Lkn;")
    public static class530 field5201 = new class530("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field5213;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I[II)Lcj;")
    public final class499 method2147(int arg0, int[] arg1, int arg2) {
        field5206++;
        if (arg2 == ~this.field5205.method434(26154)) {
            return this.method2149(0, arg1, (byte) -17, arg0);
        } else if (this.field5205.method435(arg0, 0) == 1) {
            return this.method2149(arg0, arg1, (byte) 117, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(III[I)Lcj;")
    private final class499 method2148(int arg0, int arg1, int arg2, int[] arg3) {
        field5211++;
        int var5 = (arg0 >>> 12 | (arg0 & 0xFFF) << 4) ^ arg2;
        int var6 = var5 | arg0 << 16;
        int var7 = -115 % ((arg1 + 23) / 45);
        long var8 = (long) var6 ^ 0x100000000L;
        class499 var10 = (class499) this.field5214.method2405(var8, -78);
        if (var10 != null) {
            return var10;
        } else if (arg3 == null || arg3[0] > 0) {
            class42 var11 = (class42) this.field5212.method2405(var8, -95);
            if (var11 == null) {
                var11 = class42.method246(this.field5203, arg0, arg2);
                if (var11 == null) {
                    return null;
                }
                this.field5212.method2413(var8, var11, -1);
            }
            class499 var12 = var11.method242(arg3);
            if (var12 == null) {
                return null;
            } else {
                var11.method2891(7);
                this.field5214.method2413(var8, var12, -1);
                return var12;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I[IBI)Lcj;")
    private final class499 method2149(int arg0, int[] arg1, byte arg2, int arg3) {
        field5207++;
        int var5 = arg3 ^ (arg0 >>> 12 | arg0 & 0xFFF << 4);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class499 var9 = (class499) this.field5214.method2405(var7, -84);
        int var10 = 67 % ((47 - arg2) / 60);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class148 var11 = class148.method924(this.field5205, arg0, arg3);
            if (var11 == null) {
                return null;
            }
            class499 var12 = var11.method926();
            this.field5214.method2413(var7, var12, -1);
            if (arg1 != null) {
                arg1[0] -= var12.field7062.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V")
    public static void method2150(boolean arg0) {
        if (!arg0) {
            method2152(-102, (byte) 115);
        }
        field5201 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B[S)[S")
    public static final short[] method2151(byte arg0, short[] arg1) {
        field5202++;
        if (arg1 == null) {
            return null;
        } else if (arg0 == -21) {
            short[] var2 = new short[arg1.length];
            class182.method1141(arg1, 0, var2, 0, arg1.length);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)V")
    public static final void method2152(int arg0, byte arg1) {
        field5213++;
        int var2 = -15 % ((arg1 + 11) / 54);
        class45 var3 = class354.method2094(arg0, (byte) -113, 11);
        var3.method261(4);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "([[[Lrb;B)V")
    public static final void method2153(class239[][][] arg0, byte arg1) {
        field5210++;
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class239[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class239 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field3493 instanceof class21) {
                            ((class21) var6.field3493).method115(16372);
                        }
                        if (var6.field3474 instanceof class21) {
                            ((class21) var6.field3474).method115(16372);
                        }
                        if (var6.field3471 instanceof class21) {
                            ((class21) var6.field3471).method115(16372);
                        }
                        if (var6.field3487 instanceof class21) {
                            ((class21) var6.field3487).method115(16372);
                        }
                        if (var6.field3473 instanceof class21) {
                            ((class21) var6.field3473).method115(16372);
                        }
                        for (class134 var7 = var6.field3482; var7 != null; var7 = var7.field1755) {
                            class144 var8 = var7.field1761;
                            if (var8 instanceof class21) {
                                ((class21) var8).method115(16372);
                            }
                        }
                    }
                }
            }
        }
        if (arg1 > -40) {
            method2152(-106, (byte) 2);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILtj;ZILtj;BZ)I")
    public static final int method2154(int arg0, class135 arg1, boolean arg2, int arg3, class135 arg4, byte arg5, boolean arg6) {
        field5208++;
        int var7 = class520.method3076(arg6, arg1, -5472, arg3, arg4);
        if (var7 != 0) {
            return arg6 ? -var7 : var7;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var8 = class520.method3076(arg2, arg1, -5472, arg0, arg4);
            if (arg5 != 67) {
                method2153(null, (byte) 18);
            }
            return arg2 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "([IZI)Lcj;")
    public final class499 method2155(int[] arg0, boolean arg1, int arg2) {
        field5204++;
        if (!arg1) {
            method2152(-40, (byte) 44);
        }
        if (this.field5203.method434(26154) == 1) {
            return this.method2148(0, 89, arg2, arg0);
        } else if (this.field5203.method435(arg2, 0) == 1) {
            return this.method2148(arg2, -122, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Loi;Loi;)V")
    public class364(class53 arg0, class53 arg1) {
        this.field5203 = arg1;
        this.field5205 = arg0;
    }
}
