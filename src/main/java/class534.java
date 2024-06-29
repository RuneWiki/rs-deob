import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class534 {

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "Lmga;")
    private class666 field7087 = new class666(64);

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Lbi;")
    private class449 field7088;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Ldb;")
    public static class298 field7089 = new class298(82, 3);

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Lcu;")
    public static class206 field7091 = new class206(47, 7);

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field7086;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)Lrk;", line = 11)
    public final class30 method2969(int arg0, int arg1) {
        field7086++;
        class666 var3 = this.field7087;
        class30 var4;
        synchronized (this.field7087) {
            var4 = (class30) this.field7087.method3750((long) arg1, false);
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field7088;
        byte[] var6;
        synchronized (this.field7088) {
            var6 = this.field7088.method2537(false, arg0, arg1);
        }
        class30 var7 = new class30();
        if (var6 != null) {
            var7.method251(0, new class335(var6));
        }
        class666 var8 = this.field7087;
        synchronized (this.field7087) {
            this.field7087.method3745(arg0 - 4, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V", line = 40)
    public static void method2970(boolean arg0) {
        if (arg0) {
            field7089 = null;
        }
        field7089 = null;
        field7091 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([IILhfa;[I[I)V", line = 53)
    public static final void method2971(int[] arg0, int arg1, class287 arg2, int[] arg3, int[] arg4) {
        field7090++;
        for (int var5 = arg1; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg4[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && arg2.field5605.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field5605[var9] = null;
                    } else {
                        class616 var10 = class636.field8570.method231(var6, -11764);
                        int var11 = var10.field8162;
                        class307 var12 = arg2.field5605[var9];
                        if (var12 != null) {
                            if (var12.field4235 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field5605[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4236 = 0;
                                    var12.field4233 = 0;
                                    var12.field4234 = 1;
                                    var12.field4231 = 0;
                                    var12.field4232 = var8;
                                    class373.method2199(arg2.field8609, arg2.field8620, (byte) 123, arg2.field8612, 0, var10, false);
                                } else if (var11 == 2) {
                                    var12.field4231 = 0;
                                }
                            } else if (var10.field8155 >= class636.field8570.method231(var12.field4235, -11764).field8155) {
                                var12 = arg2.field5605[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class307 var13 = arg2.field5605[var9] = new class307();
                            var13.field4235 = var6;
                            var13.field4232 = var8;
                            var13.field4234 = 1;
                            var13.field4231 = 0;
                            var13.field4233 = 0;
                            var13.field4236 = 0;
                            class373.method2199(arg2.field8609, arg2.field8620, (byte) 121, arg2.field8612, 0, var10, false);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lpca;ILbi;)V", line = 153)
    public class534(class671 arg0, int arg1, class449 arg2) {
        this.field7088 = arg2;
        this.field7088.method2527(0, 5);
    }
}
