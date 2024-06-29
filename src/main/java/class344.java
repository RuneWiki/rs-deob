import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class344 {

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "Lge;")
    private class511 field5068 = new class511(64);

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public int field5073 = 0;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Lci;")
    private class320 field5071;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public int field5065;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field5072;

    static {
        new class44("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        new class44("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZIFFF)F", line = 7)
    public static final float method2176(boolean arg0, int arg1, float arg2, float arg3, float arg4) {
        field5067++;
        if (!arg0) {
            field5072 = 51;
        }
        float[] var5 = class525.field7668[arg1];
        return var5[2] * arg2 + var5[0] * arg3 + var5[1] * arg4;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILeu;)I", line = 27)
    public static final int method2177(int arg0, class341 arg1) {
        field5066++;
        String var2 = class136.method991(116, arg1);
        int[] var3 = null;
        if (class303.method1937(arg0 - 2, arg1.field5039)) {
            var3 = class58.field1052.method1646(arg0 + 21706, (int) arg1.field5037).field1799;
        } else if (arg1.field5035 != -1) {
            var3 = class58.field1052.method1646(21708, arg1.field5035).field1799;
        } else if (class15.method85(arg1.field5039, arg0 ^ 0xFFFFFFEE)) {
            class193 var4 = (class193) class390.field5539.method2284(true, (long) ((int) arg1.field5037));
            if (var4 != null) {
                class279 var5 = var4.field2805;
                class311 var6 = var5.field4157;
                if (var6.field4631 != null) {
                    var6 = var6.method1972(class84.field1335, (byte) 107);
                }
                if (var6 != null) {
                    var3 = var6.field4582;
                }
            }
        } else if (class116.method833(arg1.field5039, (byte) 92)) {
            Object var7 = null;
            class261 var8;
            if (arg1.field5039 == 1007) {
                var8 = class277.field4139.method569((byte) 64, (int) arg1.field5037);
            } else {
                var8 = class277.field4139.method569((byte) 47, (int) (arg1.field5037 >>> 32 & 0x7FFFFFFFL));
            }
            if (var8.field3926 != null) {
                var8 = var8.method1679(class84.field1335, 1349439392);
            }
            if (var8 != null) {
                var3 = var8.field3891;
            }
        }
        if (var3 != null) {
            var2 = var2 + class176.method1233(83, var3);
        }
        int var9 = class425.field6028.method877(class7.field40, (byte) -87, var2);
        if (arg0 != 2) {
            field5072 = -32;
        }
        if (arg1.field5042) {
            var9 += class375.field5393.method378() + 4;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 100)
    public final void method2178(int arg0) {
        if (arg0 != 1) {
            this.method2178(92);
        }
        field5063++;
        class511 var2 = this.field5068;
        synchronized (this.field5068) {
            this.field5068.method2980(-182819096);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Lwi;", line = 113)
    public final class332 method2179(int arg0, int arg1) {
        field5062++;
        class511 var3 = this.field5068;
        class332 var4;
        synchronized (this.field5068) {
            var4 = (class332) this.field5068.method2982(arg1 - 6912, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class320 var5 = this.field5071;
        byte[] var6;
        synchronized (this.field5071) {
            var6 = this.field5071.method2037(arg0, (byte) 72, 4);
        }
        class332 var7 = new class332();
        var7.field4920 = this;
        var7.field4904 = arg0;
        if (var6 != null) {
            var7.method2108(new class519(var6), arg1 ^ 0xFFFFE4FF);
        }
        var7.method2103((byte) -65);
        class511 var8 = this.field5068;
        synchronized (this.field5068) {
            this.field5068.method2981(var7, 117, (long) arg0);
        }
        if (arg1 != 6912) {
            this.field5068 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBI)Z", line = 149)
    public static final boolean method2180(int arg0, byte arg1, int arg2) {
        field5064++;
        return arg1 >= -125 ? true : class227.method1523(16, arg2, arg0) & class332.method2100(arg2, (byte) -50, arg0);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)V", line = 160)
    public final void method2181(int arg0, int arg1) {
        field5069++;
        class511 var3 = this.field5068;
        synchronized (this.field5068) {
            this.field5068.method2989(false, arg1);
            if (arg0 > -86) {
                this.field5073 = 3;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V", line = 183)
    public final void method2182(int arg0) {
        if (arg0 != 0) {
            field5072 = -95;
        }
        field5070++;
        class511 var2 = this.field5068;
        synchronized (this.field5068) {
            this.field5068.method2990((byte) -86);
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lsn;ILci;)V", line = 202)
    public class344(class453 arg0, int arg1, class320 arg2) {
        this.field5071 = arg2;
        this.field5065 = this.field5071.method2030(-10914, 4);
    }
}
