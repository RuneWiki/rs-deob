import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class291 {

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "Lnb;")
    private class344 field4259;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Lsp;")
    private class435 field4258;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Lbl;")
    private class57 field4252;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Lvq;")
    public static class24 field4261;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Lat;")
    private class256 field4254;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "[Les;")
    private class301[] field4253;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILcq;ZLcq;I)Les;")
    private final class301 method1944(int arg0, class70 arg1, boolean arg2, class70 arg3, int arg4) {
        field4262++;
        if (this.field4254 == null) {
            throw new RuntimeException();
        }
        if (arg0 < 16) {
            this.field4253 = null;
        }
        this.field4254.field3762 = arg4 * 8 + 5;
        if (this.field4254.field3764.length <= this.field4254.field3762) {
            throw new RuntimeException();
        } else if (this.field4253[arg4] == null) {
            int var6 = this.field4254.method1746(20972);
            int var7 = this.field4254.method1746(20972);
            class301 var8 = new class301(arg4, arg1, arg3, this.field4258, this.field4259, var6, var7, arg2);
            this.field4253[arg4] = var8;
            return var8;
        } else {
            return this.field4253[arg4];
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1945(int arg0) {
        if (arg0 != 8) {
            method1945(23);
        }
        field4261 = null;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public final void method1946(int arg0) {
        field4255++;
        if (this.field4253 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4253.length; var2++) {
            if (this.field4253[var2] != null) {
                this.field4253[var2].method1996((byte) 32);
            }
        }
        for (int var3 = 0; var3 < this.field4253.length; var3++) {
            if (this.field4253[var3] != null) {
                this.field4253[var3].method2005((byte) -112);
            }
        }
        if (arg0 != -16210) {
            this.field4259 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLcq;ILcq;)Les;")
    public final class301 method1947(byte arg0, class70 arg1, int arg2, class70 arg3) {
        int var5 = -83 / ((9 - arg0) / 61);
        field4260++;
        return this.method1944(61, arg1, true, arg3, arg2);
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)Z")
    public final boolean method1948(int arg0) {
        if (arg0 >= -86) {
            return true;
        }
        field4256++;
        if (this.field4254 != null) {
            return true;
        }
        if (this.field4252 == null) {
            if (this.field4258.method2671(28522)) {
                return false;
            }
            this.field4252 = this.field4258.method2681(255, 255, 0, true, (byte) 0);
        }
        if (this.field4252.field5650) {
            return false;
        } else {
            this.field4254 = new class256(this.field4252.method430((byte) 54));
            this.field4253 = new class301[(this.field4254.field3764.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([I[I[ILwe;I)V")
    public static final void method1949(int[] arg0, int[] arg1, int[] arg2, class26 arg3, int arg4) {
        field4257++;
        if (arg4 >= -94) {
            return;
        }
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg1[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg3.field758.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field758[var9] = null;
                    } else {
                        class196 var10 = class83.method556(var6, 81);
                        int var11 = var10.field2769;
                        class69 var12 = arg3.field758[var9];
                        if (var12 != null) {
                            if (var12.field908 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field758[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field913 = 0;
                                    var12.field911 = 0;
                                    var12.field909 = var8;
                                    var12.field910 = 1;
                                    var12.field906 = 0;
                                    class446.method2739(var10, false, arg3.field4960, 0, -49, arg3.field4954, arg3.field4951);
                                } else if (var11 == 2) {
                                    var12.field906 = 0;
                                }
                            } else if (var10.field2775 >= class83.method556(var12.field908, 113).field2775) {
                                var12 = arg3.field758[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class69 var13 = arg3.field758[var9] = new class69();
                            var13.field913 = 0;
                            var13.field910 = 1;
                            var13.field908 = var6;
                            var13.field909 = var8;
                            var13.field911 = 0;
                            var13.field906 = 0;
                            class446.method2739(var10, false, arg3.field4960, 0, -49, arg3.field4954, arg3.field4951);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lsp;Lnb;)V")
    public class291(class435 arg0, class344 arg1) {
        this.field4259 = arg1;
        this.field4258 = arg0;
        if (!this.field4258.method2671(28522)) {
            this.field4252 = this.field4258.method2681(255, 255, 0, true, (byte) 0);
        }
    }

    static {
        new class409("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
        field4261 = new class24(8, 2);
    }
}
