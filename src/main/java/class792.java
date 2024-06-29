import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class792 implements class730 {

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "Lrp;")
    private class680 field10850;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public int field10861;

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "I")
    public int field10853;

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "[I")
    public int[] field10852;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "Ltia;")
    private class17 field10860;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "[F")
    public float[] field10859;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public static int field10857 = 13156520;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "Lin;")
    public static class380 field10849 = new class380(52, 10);

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "F")
    public static float field10862;

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "I")
    public static int field10851;

    @OriginalMember(owner = "client!gq", name = "f", descriptor = "I")
    public static int field10854;

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "I")
    public static int field10855;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "I")
    public static int field10856;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "J")
    public static long field10858;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "[Lth;")
    public static class131[] field10863;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZB)V")
    public static final void method4326(boolean arg0, byte arg1) {
        field10855++;
        if (class57.field883.length() == 0) {
            return;
        }
        class30.method251(false, "--> " + class57.field883);
        if (arg1 == -69) {
            class467.method2730(false, arg0, class57.field883, 10);
            class184.field2797 = 0;
            class467.field6372 = 0;
            class57.field883 = "";
        }
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(IIIIIIZZ)V")
    public final void method2161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field10856++;
        class201.method1415(arg6 ? this.field10852 : null, arg7 ? this.field10850.field9648 : null, arg1, arg3, arg2, arg5, this.field10850.field9606.field6278, arg4, 0, this.field10853, arg7 ? this.field10859 : null, arg0, this.field10850.field9606.field6283);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Z)V")
    public static void method4327(boolean arg0) {
        if (!arg0) {
            field10849 = null;
            field10863 = null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZILgga;Ljava/lang/String;)Ldl;")
    public static final class78 method4328(boolean arg0, int arg1, class513 arg2, String arg3) {
        field10851++;
        int var4 = arg2.method3016(arg1 + 21464, arg3);
        if (var4 == -1) {
            return new class78(0);
        } else if (arg1 == -21337) {
            int[] var5 = arg2.method3012(-71, var4);
            class78 var6 = new class78(var5.length);
            int var7 = 0;
            int var8 = 0;
            while (true) {
                while (var6.field1170 > var7) {
                    class431 var9 = new class431(arg2.method3019(var4, var5[var8++], 102));
                    int var10 = var9.method2526(17);
                    int var11 = var9.method2565((byte) -116);
                    int var12 = var9.method2557(14929);
                    if (!arg0 && var12 == 1) {
                        var6.field1170--;
                    } else {
                        var6.field1167[var7] = var10;
                        var6.field1168[var7] = var11;
                        var7++;
                    }
                }
                return var6;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIIIZZ)V")
    public final void method2163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field10854++;
        class201.method1415(arg6 ? this.field10850.field9606.field6283 : null, arg7 ? this.field10859 : null, arg1, arg3, arg2, arg5, this.field10853, arg4, 0, this.field10850.field9606.field6278, arg7 ? this.field10850.field9648 : null, arg0, this.field10852);
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lrp;Lmq;Ltia;)V")
    public class792(class680 arg0, class85 arg1, class17 arg2) {
        this.field10850 = arg0;
        if (arg1 instanceof class485) {
            class485 var4 = (class485) arg1;
            this.field10861 = var4.field10;
            this.field10853 = var4.field32;
            this.field10852 = var4.field6691;
        } else if ((arg1 instanceof class35)) {
            class35 var5 = (class35) arg1;
            this.field10861 = var5.field10;
            this.field10852 = var5.field426;
            this.field10853 = var5.field32;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field10860 = arg2;
            if (this.field10860.field186 != this.field10853 || this.field10860.field184 != this.field10861) {
                throw new RuntimeException();
            }
            this.field10859 = this.field10860.field181;
        }
    }
}
