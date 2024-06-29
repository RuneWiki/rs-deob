import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class48 {

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "Lo;")
    private class15 field743 = new class15();

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "Laf;")
    private class181 field756 = new class181();

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    private int field752;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    private int field755;

    @OriginalMember(owner = "client!fg", name = "n", descriptor = "Lsi;")
    private class237 field753;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "[Lce;")
    public static class126[] field744 = new class126[100];

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Lce;")
    private static class126 field740 = class206.method1445(-7923, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "Lce;")
    public static class126 field747 = field740;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "[[[B")
    public static byte[][][] field748;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([Ljava/lang/Object;I[I)V", line = 6)
    public static final void method297(Object[] arg0, int arg1, int[] arg2) {
        field741++;
        class176.method1277(arg2.length - 1, -26519, arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "()V", line = 24)
    public static final void method298() {
        GL var0 = class56.field848;
        var0.glDisableClientState(32886);
        class56.method384(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class56.method356();
        for (int var1 = 0; var1 < class319.field5461[0].length; var1++) {
            class201 var2 = class319.field5461[0][var1];
            if (var2.field3424 >= 0 && class236.field3987.method598(true, var2.field3424) == 4) {
                var0.glColor4fv(class112.method739(-120, var2.field3447), 0);
                float var3 = 201.5F - (var2.field3430 ? 1.0F : 0.5F);
                var2.method1418(class297.field4940, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class56.method368();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class56.method360();
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)V", line = 59)
    public static final void method299(byte arg0, int arg1) {
        field757++;
        class81.field1309.method1175(true, arg1);
        class160.field2889.method1175(true, arg1);
        if (arg0 != 78) {
            field747 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V", line = 74)
    public static final void method300(byte arg0) {
        if (arg0 != 5) {
            return;
        }
        field751++;
        int var1 = class227.field3834.method1241(8, 107);
        if (var1 < class239.field4036) {
            for (int var2 = var1; var2 < class239.field4036; var2++) {
                class286.field4740[class134.field2326++] = class166.field2958[var2];
            }
        }
        if (class239.field4036 < var1) {
            throw new RuntimeException("gppov1");
        }
        class239.field4036 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class166.field2958[var3];
            class301 var5 = class85.field1352[var4];
            int var6 = class227.field3834.method1241(1, -117);
            if (var6 == 0) {
                class166.field2958[class239.field4036++] = var4;
                var5.field2447 = class249.field4174;
            } else {
                int var7 = class227.field3834.method1241(2, -113);
                if (var7 == 0) {
                    class166.field2958[class239.field4036++] = var4;
                    var5.field2447 = class249.field4174;
                    class139.field2526[class206.field3528++] = var4;
                } else if (var7 == 1) {
                    class166.field2958[class239.field4036++] = var4;
                    var5.field2447 = class249.field4174;
                    int var11 = class227.field3834.method1241(3, 32);
                    var5.method1006(false, var11, 2);
                    int var12 = class227.field3834.method1241(1, -117);
                    if (var12 == 1) {
                        class139.field2526[class206.field3528++] = var4;
                    }
                } else if (var7 == 2) {
                    class166.field2958[class239.field4036++] = var4;
                    var5.field2447 = class249.field4174;
                    int var8 = class227.field3834.method1241(3, arg0 ^ 0xFFFFFF83);
                    var5.method1006(true, var8, arg0 - 3);
                    int var9 = class227.field3834.method1241(3, 83);
                    var5.method1006(true, var9, 2);
                    int var10 = class227.field3834.method1241(1, 0);
                    if (var10 == 1) {
                        class139.field2526[class206.field3528++] = var4;
                    }
                } else if (var7 == 3) {
                    class286.field4740[class134.field2326++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)I", line = 193)
    public static final int method301(int arg0, int arg1) {
        if (arg0 != 8) {
            field740 = (class126) null;
        }
        field742++;
        return arg1 == 16711935 ? -1 : class127.method885(arg1, true);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 208)
    public static void method302(int arg0) {
        field744 = null;
        field740 = null;
        field748 = (byte[][][]) null;
        field747 = null;
        if (arg0 != -32020) {
            field740 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(JI)Lo;", line = 224)
    public final class15 method303(long arg0, int arg1) {
        field746++;
        class15 var4 = (class15) this.field753.method1631(false, arg0);
        if (var4 != null) {
            this.field756.method1295(-128, var4);
        }
        if (arg1 != 0) {
            method304();
        }
        return var4;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "()V", line = 247)
    public static final void method304() {
        if (class293.field4860 != null) {
            for (int var0 = 0; var0 < class293.field4860.length; var0++) {
                for (int var1 = 0; var1 < class197.field3377; var1++) {
                    for (int var2 = 0; var2 < class65.field1094; var2++) {
                        class293.field4860[var0][var1][var2] = null;
                    }
                }
            }
        }
        class319.field5461 = (class201[][]) null;
        if (class307.field5211 != null) {
            for (int var3 = 0; var3 < class307.field5211.length; var3++) {
                for (int var4 = 0; var4 < class197.field3377; var4++) {
                    for (int var5 = 0; var5 < class65.field1094; var5++) {
                        class307.field5211[var3][var4][var5] = null;
                    }
                }
            }
        }
        class25.field359 = (class201[][]) null;
        class50.field764 = 0;
        if (class39.field623 != null) {
            for (int var6 = 0; var6 < class50.field764; var6++) {
                class39.field623[var6] = null;
            }
        }
        if (class217.field3653 != null) {
            for (int var7 = 0; var7 < class305.field5121; var7++) {
                class217.field3653[var7] = null;
            }
            class305.field5121 = 0;
        }
        if (class139.field2520 != null) {
            for (int var8 = 0; var8 < class139.field2520.length; var8++) {
                class139.field2520[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)Lei;", line = 352)
    public final class68 method305(int arg0) {
        if (arg0 == 1) {
            field750++;
            return this.field753.method1630((byte) 56);
        } else {
            return (class68) null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)Lei;", line = 364)
    public final class68 method306(int arg0) {
        int var2 = 28 / ((arg0 + 23) / 48);
        field749++;
        return this.field753.method1632(-103);
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V", line = 376)
    public final void method307(int arg0) {
        field754++;
        this.field756.method1301(-128);
        this.field753.method1629(arg0);
        this.field743 = new class15();
        this.field752 = this.field755;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lo;JB)V", line = 391)
    public final void method308(class15 arg0, long arg1, byte arg2) {
        if (arg2 < 102) {
            field744 = (class126[]) null;
        }
        field745++;
        if (this.field752 == 0) {
            class15 var5 = this.field756.method1296((byte) -114);
            var5.method499((byte) 64);
            var5.method85(87);
            if (this.field743 == var5) {
                class15 var6 = this.field756.method1296((byte) -94);
                var6.method499((byte) 64);
                var6.method85(89);
            }
        } else {
            this.field752--;
        }
        this.field753.method1636(11311, arg0, arg1);
        this.field756.method1295(30, arg0);
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(I)V", line = 434)
    public class48(int arg0) {
        this.field752 = arg0;
        this.field755 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field753 = new class237(var2);
    }
}
