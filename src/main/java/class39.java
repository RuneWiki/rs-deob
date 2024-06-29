import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class39 extends class470 implements class531 {

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Loa;")
    private class692 field435;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Lya;")
    private class51 field433;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "[Lnda;")
    public class555[] field436;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[Loia;")
    public class88[] field434;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()[Loia;")
    public final class88[] method186() {
        return this.field434;
    }

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method187(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ldfa;Lim;II)V")
    public final void method188(class165 arg0, class569 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field435.method3900().method3507(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class692.field9758[5] = 0;
            this.field435.method3900().method3507(this, arg0, class692.field9758, arg2, arg3);
            arg1.field8083 = class692.field9758[0];
            arg1.field8085 = class692.field9758[1];
            arg1.field8081 = class692.field9758[2];
            arg1.field8086 = class692.field9758[3];
            arg1.field8084 = class692.field9758[4];
            arg1.field8082 = class692.field9758[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
    public final void method189() {
        if (this.field435.field9762 > 1) {
            synchronized (this) {
                while (super.field6708) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field6708 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method190();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILdfa;ZII)Z")
    public final boolean method191(int arg0, int arg1, class165 arg2, boolean arg3, int arg4, int arg5) {
        return this.field435.method3900().method3510(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method83(boolean arg0);

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method192(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method193();

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class182 method194(class182 arg0);

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method195(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method196(int arg0);

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method197();

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method198(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V")
    public final void method199() {
        if (this.field435.field9762 > 1) {
            synchronized (this) {
                super.field6708 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()Z")
    public final boolean method200() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILdfa;)V")
    private final void method201(int[] arg0, class165 arg1) {
        this.field435.method3900().method3523(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method202();

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method203();

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method204(int arg0);

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method205(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method206(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method231(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method207(int arg0);

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method208();

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method209(int arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ldfa;IZ)V")
    public final void method210(class165 arg0, int arg1, boolean arg2) {
        this.method215(((class276) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method211(int arg0);

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()[Lnda;")
    public final class555[] method212() {
        return this.field436;
    }

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method213();

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method214(int arg0);

    @OriginalMember(owner = "client!i", name = "J", descriptor = "(JIZ)V")
    private final native void method215(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class684.method3871(this, true);
        }
    }

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method216(class39 arg0, class39 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method217();

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method218();

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method219(int arg0, int arg1, class278 arg2, class278 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ldfa;)V")
    public final void method220(class165 arg0) {
        this.method201(class692.field9753, arg0);
        int var2 = 0;
        if (this.field436 != null) {
            for (int var3 = 0; var3 < this.field436.length; ++var3) {
                class555 var4 = this.field436[var3];
                var4.field7952 = class692.field9753[var2++];
                var4.field7946 = class692.field9753[var2++];
                var4.field7942 = class692.field9753[var2++];
                var4.field7958 = class692.field9753[var2++];
                var4.field7956 = class692.field9753[var2++];
                var4.field7961 = class692.field9753[var2++];
                var4.field7948 = class692.field9753[var2++];
                var4.field7947 = class692.field9753[var2++];
                var4.field7949 = class692.field9753[var2++];
            }
        }
        if (this.field434 != null) {
            for (int var5 = 0; var5 < this.field434.length; ++var5) {
                class88 var6 = this.field434[var5];
                class88 var7 = var6;
                if (var6.field922 != null) {
                    var7 = var6.field922;
                }
                if (var6.field920 != null) {
                    var6.field920.method1028(arg0);
                } else {
                    var6.field920 = arg0.method1024();
                }
                var7.field919 = class692.field9753[var2++];
                var7.field928 = class692.field9753[var2++];
                var7.field923 = class692.field9753[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method221();

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method222();

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()V")
    public final void method223() {
    }

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method224(class692 arg0, class51 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method225();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V")
    public final void method226(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILdfa;ZI)Z")
    public final boolean method227(int arg0, int arg1, class165 arg2, boolean arg3, int arg4) {
        return this.field435.method3900().method3520(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ldfa;Lim;I)V")
    public final void method228(class165 arg0, class569 arg1, int arg2) {
        if (arg1 == null) {
            this.field435.method3900().method3509(this, arg0, (int[]) null, arg2);
        } else {
            class692.field9758[5] = 0;
            this.field435.method3900().method3509(this, arg0, class692.field9758, arg2);
            arg1.field8083 = class692.field9758[0];
            arg1.field8085 = class692.field9758[1];
            arg1.field8081 = class692.field9758[2];
            arg1.field8086 = class692.field9758[3];
            arg1.field8084 = class692.field9758[4];
            arg1.field8082 = class692.field9758[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method229(class692 arg0);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V")
    public final void method230(class470 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field435.method3900().method3525(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method231(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method232(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method233();

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method234();

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Luk;IIII)V")
    public class39(class692 arg0, class51 arg1, class260 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field435 = arg0;
        this.field433 = arg1;
        this.field436 = arg2.field3172;
        this.field434 = arg2.field3174;
        int var8 = arg2.field3172 == null ? 0 : arg2.field3172.length;
        int var9 = arg2.field3174 == null ? 0 : arg2.field3174.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field436[var12].field7940;
            var11[var10++] = this.field436[var12].field7941;
            var11[var10++] = this.field436[var12].field7950;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field434[var13].field927;
        }
        int var14 = arg2.field3208 == null ? 0 : arg2.field3208.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class714 var20 = arg2.field3208[var17];
            class128 var21 = class741.method4128(false, var20.field10043);
            var15[var16++] = var20.field10046;
            var15[var16++] = var21.field1337;
            var15[var16++] = var21.field1344;
            var15[var16++] = var21.field1345;
            var15[var16++] = var21.field1348;
            var15[var16++] = var21.field1346;
            var15[var16++] = var21.field1336 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class714 var19 = arg2.field3208[var18];
            var15[var16++] = var19.field10039;
        }
        this.method224(this.field435, this.field433, arg2.field3198, arg2.field3204, arg2.field3226, arg2.field3192, arg2.field3210, arg2.field3173, arg2.field3211, arg2.field3220, arg2.field3189, arg2.field3179, arg2.field3197, arg2.field3217, arg2.field3213, arg2.field3199, arg2.field3184, arg2.field3190, arg2.field3203, arg2.field3186, arg2.field3209, arg2.field3191, arg2.field3171, arg2.field3218, arg2.field3176, arg2.field3183, arg2.field3188, arg2.field3212, arg2.field3196, arg2.field3227, arg2.field3214, arg2.field3202, arg2.field3177, arg2.field3223, arg2.field3195, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method235();

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V")
    public class39(class692 arg0) {
        this.field435 = arg0;
        this.field433 = null;
        this.method229(arg0);
    }

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method236(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;")
    public final class470 method237(byte arg0, int arg1, boolean arg2) {
        return this.field435.method3900().method3496(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method238();
}
